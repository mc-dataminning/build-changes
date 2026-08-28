import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;

public record dbp(List<dbp.b> e) {
   public static final dbp a = new dbp(List.of());
   public static final Codec<dbp> b = dbp.b.a.listOf().xmap(dbp::new, dbp::b);
   public static final yw<wj, dbp> c = yw.a(dbp.b.b.a(yu.a()), dbp::b, dbp::new);
   public static final DecimalFormat d = af.a(new DecimalFormat("#.##"), $$0 -> $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));

   public static dbp.a a() {
      return new dbp.a();
   }

   public dbp a(je<byd> $$0, byg $$1, bwo $$2) {
      Builder<dbp.b> $$3 = ImmutableList.builderWithExpectedSize(this.e.size() + 1);

      for (dbp.b $$4 : this.e) {
         if (!$$4.a($$0, $$1.a())) {
            $$3.add($$4);
         }
      }

      $$3.add(new dbp.b($$0, $$1, $$2));
      return new dbp($$3.build());
   }

   public void a(bwo $$0, BiConsumer<je<byd>, byg> $$1) {
      for (dbp.b $$2 : this.e) {
         if ($$2.e.equals($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public void a(bwn $$0, BiConsumer<je<byd>, byg> $$1) {
      for (dbp.b $$2 : this.e) {
         if ($$2.e.b($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public double a(double $$0, bwn $$1) {
      double $$2 = $$0;

      for (dbp.b $$3 : this.e) {
         if ($$3.e.b($$1)) {
            double $$4 = $$3.d.b();

            $$2 += switch ($$3.d.c()) {
               case a -> $$4;
               case b -> $$4 * $$0;
               case c -> $$4 * $$2;
            };
         }
      }

      return $$2;
   }

   public List<dbp.b> b() {
      return this.e;
   }

   public static class a {
      private final Builder<dbp.b> a = ImmutableList.builder();

      a() {
      }

      public dbp.a a(je<byd> $$0, byg $$1, bwo $$2) {
         this.a.add(new dbp.b($$0, $$1, $$2));
         return this;
      }

      public dbp a() {
         return new dbp(this.a.build());
      }
   }

   public static record b(je<byd> c, byg d, bwo e) {
      public static final Codec<dbp.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(byd.a.fieldOf("type").forGetter(dbp.b::a), byg.a.forGetter(dbp.b::b), bwo.m.optionalFieldOf("slot", bwo.a).forGetter(dbp.b::c))
               .apply($$0, dbp.b::new)
      );
      public static final yw<wj, dbp.b> b = yw.a(byd.b, dbp.b::a, byg.c, dbp.b::b, bwo.n, dbp.b::c, dbp.b::new);

      public boolean a(je<byd> $$0, alg $$1) {
         return $$0.equals(this.c) && this.d.a($$1);
      }

      public je<byd> a() {
         return this.c;
      }

      public byg b() {
         return this.d;
      }

      public bwo c() {
         return this.e;
      }
   }
}
