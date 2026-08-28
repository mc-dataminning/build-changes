import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class esu extends etc {
   public static final int a = 0;
   public static final MapCodec<esu> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  dac.c.fieldOf("enchantment").forGetter($$0x -> $$0x.c),
                  evx.a.fieldOf("count").forGetter($$0x -> $$0x.d),
                  Codec.INT.optionalFieldOf("limit", 0).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, esu::new)
   );
   private final jm<dac> c;
   private final evw d;
   private final int e;

   esu(List<eva> $$0, jm<dac> $$1, evw $$2, int $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public ete<esu> b() {
      return etf.m;
   }

   @Override
   public Set<eui<?>> a() {
      return Sets.union(ImmutableSet.of(eul.d), this.d.a());
   }

   private boolean c() {
      return this.e > 0;
   }

   @Override
   public cuq a(cuq $$0, erp $$1) {
      bsr $$2 = $$1.c(eul.d);
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

   public static esu.a a(jo.a $$0, evw $$1) {
      jo.b<dac> $$2 = $$0.b(lu.aL);
      return new esu.a($$2.b(dah.s), $$1);
   }

   public static class a extends etc.a<esu.a> {
      private final jm<dac> a;
      private final evw b;
      private int c = 0;

      public a(jm<dac> $$0, evw $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      protected esu.a a() {
         return this;
      }

      public esu.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      @Override
      public etd b() {
         return new esu(this.g(), this.a, this.b, this.c);
      }
   }
}
