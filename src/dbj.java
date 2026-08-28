import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;

public record dbj(List<dbj.b> e) {
   public static final dbj a = new dbj(List.of());
   public static final Codec<dbj> b = dbj.b.a.listOf().xmap(dbj::new, dbj::b);
   public static final yu<wh, dbj> c = yu.a(dbj.b.b.a(ys.a()), dbj::b, dbj::new);
   public static final DecimalFormat d = af.a(new DecimalFormat("#.##"), $$0 -> $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));

   public static dbj.a a() {
      return new dbj.a();
   }

   public dbj a(je<bya> $$0, byd $$1, bwl $$2) {
      Builder<dbj.b> $$3 = ImmutableList.builderWithExpectedSize(this.e.size() + 1);

      for (dbj.b $$4 : this.e) {
         if (!$$4.a($$0, $$1.b())) {
            $$3.add($$4);
         }
      }

      $$3.add(new dbj.b($$0, $$1, $$2));
      return new dbj($$3.build());
   }

   public void a(bwl $$0, BiConsumer<je<bya>, byd> $$1) {
      for (dbj.b $$2 : this.e) {
         if ($$2.e.equals($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public void a(bwk $$0, BiConsumer<je<bya>, byd> $$1) {
      for (dbj.b $$2 : this.e) {
         if ($$2.e.b($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public double a(double $$0, bwk $$1) {
      double $$2 = $$0;

      for (dbj.b $$3 : this.e) {
         if ($$3.e.b($$1)) {
            double $$4 = $$3.d.c();

            $$2 += switch ($$3.d.d()) {
               case a -> $$4;
               case b -> $$4 * $$0;
               case c -> $$4 * $$2;
            };
         }
      }

      return $$2;
   }

   public List<dbj.b> b() {
      return this.e;
   }

   public static class a {
      private final Builder<dbj.b> a = ImmutableList.builder();

      a() {
      }

      public dbj.a a(je<bya> $$0, byd $$1, bwl $$2) {
         this.a.add(new dbj.b($$0, $$1, $$2));
         return this;
      }

      public dbj a() {
         return new dbj(this.a.build());
      }
   }

   public static record b(je<bya> c, byd d, bwl e) {
      public static final Codec<dbj.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bya.a.fieldOf("type").forGetter(dbj.b::a), byd.a.forGetter(dbj.b::b), bwl.m.optionalFieldOf("slot", bwl.a).forGetter(dbj.b::c))
               .apply($$0, dbj.b::new)
      );
      public static final yu<wh, dbj.b> b = yu.a(bya.b, dbj.b::a, byd.c, dbj.b::b, bwl.n, dbj.b::c, dbj.b::new);

      public boolean a(je<bya> $$0, ale $$1) {
         return $$0.equals(this.c) && this.d.a($$1);
      }

      public je<bya> a() {
         return this.c;
      }

      public byd b() {
         return this.d;
      }

      public bwl c() {
         return this.e;
      }
   }
}
