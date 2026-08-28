import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class fay extends fbg {
   public static final int a = 0;
   public static final MapCodec<fay> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  dga.c.fieldOf("enchantment").forGetter($$0x -> $$0x.c),
                  fdz.a.fieldOf("count").forGetter($$0x -> $$0x.d),
                  Codec.INT.optionalFieldOf("limit", 0).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, fay::new)
   );
   private final jf<dga> c;
   private final fdy d;
   private final int e;

   fay(List<fdc> $$0, jf<dga> $$1, fdy $$2, int $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public fbi<fay> b() {
      return fbj.m;
   }

   @Override
   public Set<bax<?>> a() {
      return Sets.union(ImmutableSet.of(fcn.d), this.d.a());
   }

   private boolean c() {
      return this.e > 0;
   }

   @Override
   public czn a(czn $$0, ezt $$1) {
      bwi $$2 = $$1.c(fcn.d);
      if ($$2 instanceof bxj $$3) {
         int $$4 = dgc.a(this.c, $$3);
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

   public static fay.a a(jh.a $$0, fdy $$1) {
      jh.b<dga> $$2 = $$0.e(mh.aR);
      return new fay.a($$2.b(dgf.s), $$1);
   }

   public static class a extends fbg.a<fay.a> {
      private final jf<dga> a;
      private final fdy b;
      private int c = 0;

      public a(jf<dga> $$0, fdy $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      protected fay.a a() {
         return this;
      }

      public fay.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      @Override
      public fbh b() {
         return new fay(this.g(), this.a, this.b, this.c);
      }
   }
}
