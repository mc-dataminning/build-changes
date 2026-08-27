import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class cqo extends cqr {
   private final float a;
   private final Multimap<ij<bpk>, bpn> b;

   public cqo(cqq $$0, int $$1, float $$2, coy.a $$3) {
      super($$0, $$3);
      this.a = (float)$$1 + $$0.c();
      Builder<ij<bpk>, bpn> $$4 = ImmutableMultimap.builder();
      $$4.put(bpp.c, new bpn(m, "Weapon modifier", (double)this.a, bpn.a.a));
      $$4.put(bpp.e, new bpn(n, "Weapon modifier", (double)$$2, bpn.a.a));
      this.b = $$4.build();
   }

   public float h() {
      return this.a;
   }

   @Override
   public boolean a(dlj $$0, cvr $$1, hz $$2, chl $$3) {
      return !$$3.f();
   }

   @Override
   public float a(cpd $$0, dlj $$1) {
      if ($$1.a(cyu.bs)) {
         return 15.0F;
      } else {
         return $$1.a(aua.bD) ? 1.5F : 1.0F;
      }
   }

   @Override
   public boolean a(cpd $$0, boi $$1, boi $$2) {
      $$0.a(1, $$2, bnx.a);
      return true;
   }

   @Override
   public boolean a(cpd $$0, cvr $$1, dlj $$2, hz $$3, boi $$4) {
      if ($$2.h($$1, $$3) != 0.0F) {
         $$0.a(2, $$4, bnx.a);
      }

      return true;
   }

   @Override
   public boolean a_(dlj $$0) {
      return $$0.a(cyu.bs);
   }

   @Override
   public Multimap<ij<bpk>, bpn> a(bnx $$0) {
      return $$0 == bnx.a ? this.b : super.a($$0);
   }
}
