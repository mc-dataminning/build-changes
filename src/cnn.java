import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class cnn extends cqr {
   private final aup<cys> a;
   protected final float b;
   private final float c;
   private final Multimap<ij<bpk>, bpn> d;

   protected cnn(float $$0, float $$1, cqq $$2, aup<cys> $$3, coy.a $$4) {
      super($$2, $$4);
      this.a = $$3;
      this.b = $$2.b();
      this.c = $$0 + $$2.c();
      Builder<ij<bpk>, bpn> $$5 = ImmutableMultimap.builder();
      $$5.put(bpp.c, new bpn(m, "Tool modifier", (double)this.c, bpn.a.a));
      $$5.put(bpp.e, new bpn(n, "Tool modifier", (double)$$1, bpn.a.a));
      this.d = $$5.build();
   }

   @Override
   public float a(cpd $$0, dlj $$1) {
      return $$1.a(this.a) ? this.b : 1.0F;
   }

   @Override
   public boolean a(cpd $$0, boi $$1, boi $$2) {
      $$0.a(2, $$2, bnx.a);
      return true;
   }

   @Override
   public boolean a(cpd $$0, cvr $$1, dlj $$2, hz $$3, boi $$4) {
      if (!$$1.B && $$2.h($$1, $$3) != 0.0F) {
         $$0.a(1, $$4, bnx.a);
      }

      return true;
   }

   @Override
   public Multimap<ij<bpk>, bpn> a(bnx $$0) {
      return $$0 == bnx.a ? this.d : super.a($$0);
   }

   public float d() {
      return this.c;
   }

   @Override
   public boolean a_(dlj $$0) {
      int $$1 = this.w().d();
      if ($$1 < 3 && $$0.a(aua.bE)) {
         return false;
      } else if ($$1 < 2 && $$0.a(aua.bF)) {
         return false;
      } else {
         return $$1 < 1 && $$0.a(aua.bG) ? false : $$0.a(this.a);
      }
   }
}
