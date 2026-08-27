import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class cmm extends cmp implements cmv {
   private final float a;
   private final Multimap<blz, bmc> b;

   public cmm(cmo $$0, int $$1, float $$2, ckw.a $$3) {
      super($$0, $$3);
      this.a = (float)$$1 + $$0.c();
      Builder<blz, bmc> $$4 = ImmutableMultimap.builder();
      $$4.put(bme.c, new bmc(m, "Weapon modifier", (double)this.a, bmc.a.a));
      $$4.put(bme.e, new bmc(n, "Weapon modifier", (double)$$2, bmc.a.a));
      this.b = $$4.build();
   }

   public float h() {
      return this.a;
   }

   @Override
   public boolean a(dgw $$0, crs $$1, ht $$2, cdm $$3) {
      return !$$3.f();
   }

   @Override
   public float a(clb $$0, dgw $$1) {
      if ($$1.a(cuv.bs)) {
         return 15.0F;
      } else {
         return $$1.a(arc.bD) ? 1.5F : 1.0F;
      }
   }

   @Override
   public boolean a(clb $$0, bky $$1, bky $$2) {
      $$0.a(1, $$2, $$0x -> $$0x.d(bkn.a));
      return true;
   }

   @Override
   public boolean a(clb $$0, crs $$1, dgw $$2, ht $$3, bky $$4) {
      if ($$2.h($$1, $$3) != 0.0F) {
         $$0.a(2, $$4, $$0x -> $$0x.d(bkn.a));
      }

      return true;
   }

   @Override
   public boolean a_(dgw $$0) {
      return $$0.a(cuv.bs);
   }

   @Override
   public Multimap<blz, bmc> a(bkn $$0) {
      return $$0 == bkn.a ? this.b : super.a($$0);
   }
}
