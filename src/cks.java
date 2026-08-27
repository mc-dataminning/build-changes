import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class cks extends ckv implements clb {
   private final float a;
   private final Multimap<bkj, bkm> b;

   public cks(cku $$0, int $$1, float $$2, cjc.a $$3) {
      super($$0, $$3);
      this.a = (float)$$1 + $$0.c();
      Builder<bkj, bkm> $$4 = ImmutableMultimap.builder();
      $$4.put(bko.f, new bkm(m, "Weapon modifier", (double)this.a, bkm.a.a));
      $$4.put(bko.h, new bkm(n, "Weapon modifier", (double)$$2, bkm.a.a));
      this.b = $$4.build();
   }

   public float h() {
      return this.a;
   }

   @Override
   public boolean a(dfl $$0, cpx $$1, gw $$2, cbw $$3) {
      return !$$3.f();
   }

   @Override
   public float a(cjh $$0, dfl $$1) {
      if ($$1.a(csy.bs)) {
         return 15.0F;
      } else {
         return $$1.a(apu.bD) ? 1.5F : 1.0F;
      }
   }

   @Override
   public boolean a(cjh $$0, bji $$1, bji $$2) {
      $$0.a(1, $$2, $$0x -> $$0x.d(bix.a));
      return true;
   }

   @Override
   public boolean a(cjh $$0, cpx $$1, dfl $$2, gw $$3, bji $$4) {
      if ($$2.h($$1, $$3) != 0.0F) {
         $$0.a(2, $$4, $$0x -> $$0x.d(bix.a));
      }

      return true;
   }

   @Override
   public boolean a_(dfl $$0) {
      return $$0.a(csy.bs);
   }

   @Override
   public Multimap<bkj, bkm> a(bix $$0) {
      return $$0 == bix.a ? this.b : super.a($$0);
   }
}
