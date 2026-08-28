import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class exu extends eyc {
   public static final int a = 0;
   public static final MapCodec<exu> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ddz.c.fieldOf("enchantment").forGetter($$0x -> $$0x.c),
                  fav.a.fieldOf("count").forGetter($$0x -> $$0x.d),
                  Codec.INT.optionalFieldOf("limit", 0).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, exu::new)
   );
   private final jq<ddz> c;
   private final fau d;
   private final int e;

   exu(List<ezy> $$0, jq<ddz> $$1, fau $$2, int $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public eye<exu> b() {
      return eyf.m;
   }

   @Override
   public Set<bbn<?>> a() {
      return Sets.union(ImmutableSet.of(ezj.d), this.d.a());
   }

   private boolean c() {
      return this.e > 0;
   }

   @Override
   public cxp a(cxp $$0, ewp $$1) {
      bvk $$2 = $$1.c(ezj.d);
      if ($$2 instanceof bwg $$3) {
         int $$4 = deb.a(this.c, $$3);
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

   public static exu.a a(js.a $$0, fau $$1) {
      js.b<ddz> $$2 = $$0.d(mb.aO);
      return new exu.a($$2.b(dee.s), $$1);
   }

   public static class a extends eyc.a<exu.a> {
      private final jq<ddz> a;
      private final fau b;
      private int c = 0;

      public a(jq<ddz> $$0, fau $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      protected exu.a a() {
         return this;
      }

      public exu.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      @Override
      public eyd b() {
         return new exu(this.g(), this.a, this.b, this.c);
      }
   }
}
