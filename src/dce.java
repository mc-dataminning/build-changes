import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;

public record dce(List<dce.b> e) {
   public static final dce a = new dce(List.of());
   public static final Codec<dce> b = dce.b.a.listOf().xmap(dce::new, dce::b);
   public static final yw<wj, dce> c = yw.a(dce.b.b.a(yu.a()), dce::b, dce::new);
   public static final DecimalFormat d = ag.a(new DecimalFormat("#.##"), $$0 -> $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));

   public static dce.a a() {
      return new dce.a();
   }

   public dce a(jf<byk> $$0, byn $$1, bwt $$2) {
      Builder<dce.b> $$3 = ImmutableList.builderWithExpectedSize(this.e.size() + 1);

      for (dce.b $$4 : this.e) {
         if (!$$4.a($$0, $$1.a())) {
            $$3.add($$4);
         }
      }

      $$3.add(new dce.b($$0, $$1, $$2));
      return new dce($$3.build());
   }

   public void a(bwt $$0, BiConsumer<jf<byk>, byn> $$1) {
      for (dce.b $$2 : this.e) {
         if ($$2.e.equals($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public void a(bws $$0, BiConsumer<jf<byk>, byn> $$1) {
      for (dce.b $$2 : this.e) {
         if ($$2.e.b($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public double a(double $$0, bws $$1) {
      double $$2 = $$0;

      for (dce.b $$3 : this.e) {
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

   public List<dce.b> b() {
      return this.e;
   }

   public static class a {
      private final Builder<dce.b> a = ImmutableList.builder();

      a() {
      }

      public dce.a a(jf<byk> $$0, byn $$1, bwt $$2) {
         this.a.add(new dce.b($$0, $$1, $$2));
         return this;
      }

      public dce a() {
         return new dce(this.a.build());
      }
   }

   public static record b(jf<byk> c, byn d, bwt e) {
      public static final Codec<dce.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(byk.a.fieldOf("type").forGetter(dce.b::a), byn.a.forGetter(dce.b::b), bwt.m.optionalFieldOf("slot", bwt.a).forGetter(dce.b::c))
               .apply($$0, dce.b::new)
      );
      public static final yw<wj, dce.b> b = yw.a(byk.b, dce.b::a, byn.c, dce.b::b, bwt.n, dce.b::c, dce.b::new);

      public boolean a(jf<byk> $$0, alg $$1) {
         return $$0.equals(this.c) && this.d.a($$1);
      }

      public jf<byk> a() {
         return this.c;
      }

      public byn b() {
         return this.d;
      }

      public bwt c() {
         return this.e;
      }
   }
}
