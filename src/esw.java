import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class esw extends ete {
   public static final int a = 0;
   public static final MapCodec<esw> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  dac.c.fieldOf("enchantment").forGetter($$0x -> $$0x.c),
                  evz.a.fieldOf("count").forGetter($$0x -> $$0x.d),
                  Codec.INT.optionalFieldOf("limit", 0).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, esw::new)
   );
   private final jm<dac> c;
   private final evy d;
   private final int e;

   esw(List<evc> $$0, jm<dac> $$1, evy $$2, int $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public etg<esw> b() {
      return eth.m;
   }

   @Override
   public Set<euk<?>> a() {
      return Sets.union(ImmutableSet.of(eun.d), this.d.a());
   }

   private boolean c() {
      return this.e > 0;
   }

   @Override
   public cuq a(cuq $$0, err $$1) {
      bsr $$2 = $$1.c(eun.d);
      if ($$2 instanceof btn $$3) {
         int $$4 = dae.a(this.c, $$3);
         if ($$4 == 0) {
            return $$0;
         }

         float $$5 = (float)$$4 * this.d.b($$1);
         $$0.g(Math.round($$5));
         if (this.c()) {
            $$0.f(this.e);
         }
      }

      return $$0;
   }

   public static esw.a a(jo.a $$0, evy $$1) {
      jo.b<dac> $$2 = $$0.b(lu.aL);
      return new esw.a($$2.b(dah.s), $$1);
   }

   public static class a extends ete.a<esw.a> {
      private final jm<dac> a;
      private final evy b;
      private int c = 0;

      public a(jm<dac> $$0, evy $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      protected esw.a a() {
         return this;
      }

      public esw.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      @Override
      public etf b() {
         return new esw(this.g(), this.a, this.b, this.c);
      }
   }
}
