import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class ckl extends cko implements cku {
   private final float a;
   private final Multimap<bkc, bkf> b;

   public ckl(ckn $$0, int $$1, float $$2, civ.a $$3) {
      super($$0, $$3);
      this.a = (float)$$1 + $$0.c();
      Builder<bkc, bkf> $$4 = ImmutableMultimap.builder();
      $$4.put(bkh.f, new bkf(m, "Weapon modifier", (double)this.a, bkf.a.a));
      $$4.put(bkh.h, new bkf(n, "Weapon modifier", (double)$$2, bkf.a.a));
      this.b = $$4.build();
   }

   public float h() {
      return this.a;
   }

   @Override
   public boolean a(dfe $$0, cpq $$1, gw $$2, cbp $$3) {
      return !$$3.f();
   }

   @Override
   public float a(cja $$0, dfe $$1) {
      if ($$1.a(csr.bs)) {
         return 15.0F;
      } else {
         return $$1.a(apo.bD) ? 1.5F : 1.0F;
      }
   }

   @Override
   public boolean a(cja $$0, bjb $$1, bjb $$2) {
      $$0.a(1, $$2, $$0x -> $$0x.d(biq.a));
      return true;
   }

   @Override
   public boolean a(cja $$0, cpq $$1, dfe $$2, gw $$3, bjb $$4) {
      if ($$2.h($$1, $$3) != 0.0F) {
         $$0.a(2, $$4, $$0x -> $$0x.d(biq.a));
      }

      return true;
   }

   @Override
   public boolean a_(dfe $$0) {
      return $$0.a(csr.bs);
   }

   @Override
   public Multimap<bkc, bkf> a(biq $$0) {
      return $$0 == biq.a ? this.b : super.a($$0);
   }
}
