import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class cmu extends cmx implements cnd {
   private final float a;
   private final Multimap<bmh, bmk> b;

   public cmu(cmw $$0, int $$1, float $$2, cle.a $$3) {
      super($$0, $$3);
      this.a = (float)$$1 + $$0.c();
      Builder<bmh, bmk> $$4 = ImmutableMultimap.builder();
      $$4.put(bmm.c, new bmk(m, "Weapon modifier", (double)this.a, bmk.a.a));
      $$4.put(bmm.e, new bmk(n, "Weapon modifier", (double)$$2, bmk.a.a));
      this.b = $$4.build();
   }

   public float h() {
      return this.a;
   }

   @Override
   public boolean a(dhi $$0, csa $$1, ht $$2, cdu $$3) {
      return !$$3.f();
   }

   @Override
   public float a(clj $$0, dhi $$1) {
      if ($$1.a(cvc.bs)) {
         return 15.0F;
      } else {
         return $$1.a(arg.bD) ? 1.5F : 1.0F;
      }
   }

   @Override
   public boolean a(clj $$0, blg $$1, blg $$2) {
      $$0.a(1, $$2, $$0x -> $$0x.d(bkv.a));
      return true;
   }

   @Override
   public boolean a(clj $$0, csa $$1, dhi $$2, ht $$3, blg $$4) {
      if ($$2.h($$1, $$3) != 0.0F) {
         $$0.a(2, $$4, $$0x -> $$0x.d(bkv.a));
      }

      return true;
   }

   @Override
   public boolean a_(dhi $$0) {
      return $$0.a(cvc.bs);
   }

   @Override
   public Multimap<bmh, bmk> a(bkv $$0) {
      return $$0 == bkv.a ? this.b : super.a($$0);
   }
}
