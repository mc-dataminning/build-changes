import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class cos extends cov implements cpb {
   private final float a;
   private final Multimap<ih<bnp>, bns> b;

   public cos(cou $$0, int $$1, float $$2, cnb.a $$3) {
      super($$0, $$3);
      this.a = (float)$$1 + $$0.c();
      Builder<ih<bnp>, bns> $$4 = ImmutableMultimap.builder();
      $$4.put(bnu.c, new bns(m, "Weapon modifier", (double)this.a, bns.a.a));
      $$4.put(bnu.e, new bns(n, "Weapon modifier", (double)$$2, bns.a.a));
      this.b = $$4.build();
   }

   public float h() {
      return this.a;
   }

   @Override
   public boolean a(djp $$0, ctx $$1, hx $$2, cfq $$3) {
      return !$$3.f();
   }

   @Override
   public float a(cng $$0, djp $$1) {
      if ($$1.a(cxa.bs)) {
         return 15.0F;
      } else {
         return $$1.a(asi.bD) ? 1.5F : 1.0F;
      }
   }

   @Override
   public boolean a(cng $$0, bmo $$1, bmo $$2) {
      $$0.a(1, $$2, $$0x -> $$0x.d(bmd.a));
      return true;
   }

   @Override
   public boolean a(cng $$0, ctx $$1, djp $$2, hx $$3, bmo $$4) {
      if ($$2.h($$1, $$3) != 0.0F) {
         $$0.a(2, $$4, $$0x -> $$0x.d(bmd.a));
      }

      return true;
   }

   @Override
   public boolean a_(djp $$0) {
      return $$0.a(cxa.bs);
   }

   @Override
   public Multimap<ih<bnp>, bns> a(bmd $$0) {
      return $$0 == bmd.a ? this.b : super.a($$0);
   }
}
