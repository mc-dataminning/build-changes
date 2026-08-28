import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnw extends den {
   public static final MapCodec<dnw> a = b(dnw::new);
   public static final dth<drr> b = dsu.bz;
   public static final dsy c = dix.aE;
   public static final dsv d = dsu.bA;

   @Override
   public MapCodec<dnw> a() {
      return a;
   }

   public dnw(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, je.c).a(b, drr.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   public bqy a(cur $$0, dse $$1, dca $$2, iz $$3, cmz $$4, bqv $$5, evp $$6) {
      if ($$0.e() || $$1.c(b) != drr.b) {
         return bqy.d;
      } else if ($$2 instanceof arf $$7) {
         if ($$7.c_($$3) instanceof drm $$9) {
            drm.b.a($$7, $$3, $$1, $$9.f(), $$9.b(), $$9.c(), $$4, $$0);
            return bqy.a;
         } else {
            return bqy.d;
         }
      } else {
         return bqy.b;
      }
   }

   @Nullable
   @Override
   public dpj a(iz $$0, dse $$1) {
      return new drm($$0, $$1);
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(c, b, d);
   }

   @Nullable
   @Override
   public <T extends dpj> dpk<T> a(dca $$0, dse $$1, dpl<T> $$2) {
      return $$0 instanceof arf $$3
         ? a($$2, dpl.R, ($$1x, $$2x, $$3x, $$4) -> drm.b.a($$3, $$2x, $$3x, $$4.f(), $$4.b(), $$4.c()))
         : a($$2, dpl.R, ($$0x, $$1x, $$2x, $$3x) -> drm.a.a($$0x, $$1x, $$2x, $$3x.d(), $$3x.c()));
   }

   @Override
   public dse a(cyc $$0) {
      return this.o().a(c, $$0.g().g());
   }

   @Override
   public dse a(dse $$0, dlo $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   public dse a(dse $$0, djy $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   public dlh a_(dse $$0) {
      return dlh.c;
   }
}
