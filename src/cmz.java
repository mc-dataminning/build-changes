import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class cmz extends cnc implements cni {
   private final float a;
   private final Multimap<bmm, bmp> b;

   public cmz(cnb $$0, int $$1, float $$2, clj.a $$3) {
      super($$0, $$3);
      this.a = (float)$$1 + $$0.c();
      Builder<bmm, bmp> $$4 = ImmutableMultimap.builder();
      $$4.put(bmr.c, new bmp(m, "Weapon modifier", (double)this.a, bmp.a.a));
      $$4.put(bmr.e, new bmp(n, "Weapon modifier", (double)$$2, bmp.a.a));
      this.b = $$4.build();
   }

   public float h() {
      return this.a;
   }

   @Override
   public boolean a(dhn $$0, csf $$1, hx $$2, cdz $$3) {
      return !$$3.f();
   }

   @Override
   public float a(clo $$0, dhn $$1) {
      if ($$1.a(cvh.bs)) {
         return 15.0F;
      } else {
         return $$1.a(ark.bD) ? 1.5F : 1.0F;
      }
   }

   @Override
   public boolean a(clo $$0, bll $$1, bll $$2) {
      $$0.a(1, $$2, $$0x -> $$0x.d(bla.a));
      return true;
   }

   @Override
   public boolean a(clo $$0, csf $$1, dhn $$2, hx $$3, bll $$4) {
      if ($$2.h($$1, $$3) != 0.0F) {
         $$0.a(2, $$4, $$0x -> $$0x.d(bla.a));
      }

      return true;
   }

   @Override
   public boolean a_(dhn $$0) {
      return $$0.a(cvh.bs);
   }

   @Override
   public Multimap<bmm, bmp> a(bla $$0) {
      return $$0 == bla.a ? this.b : super.a($$0);
   }
}
