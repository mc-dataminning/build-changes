import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class clr extends cov implements cpb {
   private final asx<cwy> a;
   protected final float b;
   private final float c;
   private final Multimap<ih<bnp>, bns> d;

   protected clr(float $$0, float $$1, cou $$2, asx<cwy> $$3, cnb.a $$4) {
      super($$2, $$4);
      this.a = $$3;
      this.b = $$2.b();
      this.c = $$0 + $$2.c();
      Builder<ih<bnp>, bns> $$5 = ImmutableMultimap.builder();
      $$5.put(bnu.c, new bns(m, "Tool modifier", (double)this.c, bns.a.a));
      $$5.put(bnu.e, new bns(n, "Tool modifier", (double)$$1, bns.a.a));
      this.d = $$5.build();
   }

   @Override
   public float a(cng $$0, djp $$1) {
      return $$1.a(this.a) ? this.b : 1.0F;
   }

   @Override
   public boolean a(cng $$0, bmo $$1, bmo $$2) {
      $$0.a(2, $$2, $$0x -> $$0x.d(bmd.a));
      return true;
   }

   @Override
   public boolean a(cng $$0, ctx $$1, djp $$2, hx $$3, bmo $$4) {
      if (!$$1.B && $$2.h($$1, $$3) != 0.0F) {
         $$0.a(1, $$4, $$0x -> $$0x.d(bmd.a));
      }

      return true;
   }

   @Override
   public Multimap<ih<bnp>, bns> a(bmd $$0) {
      return $$0 == bmd.a ? this.d : super.a($$0);
   }

   public float d() {
      return this.c;
   }

   @Override
   public boolean a_(djp $$0) {
      int $$1 = this.w().d();
      if ($$1 < 3 && $$0.a(asi.bE)) {
         return false;
      } else if ($$1 < 2 && $$0.a(asi.bF)) {
         return false;
      } else {
         return $$1 < 1 && $$0.a(asi.bG) ? false : $$0.a(this.a);
      }
   }
}
