import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class crb extends cre {
   private final float a;
   private final Multimap<il<bpz>, bqc> b;

   public crb(crd $$0, int $$1, float $$2, cpl.a $$3) {
      super($$0, $$3);
      this.a = (float)$$1 + $$0.c();
      Builder<il<bpz>, bqc> $$4 = ImmutableMultimap.builder();
      $$4.put(bqe.c, new bqc(m, "Weapon modifier", (double)this.a, bqc.a.a));
      $$4.put(bqe.e, new bqc(n, "Weapon modifier", (double)$$2, bqc.a.a));
      this.b = $$4.build();
   }

   public float h() {
      return this.a;
   }

   @Override
   public boolean a(dme $$0, cwe $$1, ib $$2, cia $$3) {
      return !$$3.f();
   }

   @Override
   public float a(cpq $$0, dme $$1) {
      if ($$1.a(czh.bs)) {
         return 15.0F;
      } else {
         return $$1.a(aue.bD) ? 1.5F : 1.0F;
      }
   }

   @Override
   public boolean a(cpq $$0, box $$1, box $$2) {
      $$0.a(1, $$2, bom.a);
      return true;
   }

   @Override
   public boolean a(cpq $$0, cwe $$1, dme $$2, ib $$3, box $$4) {
      if ($$2.h($$1, $$3) != 0.0F) {
         $$0.a(2, $$4, bom.a);
      }

      return true;
   }

   @Override
   public boolean a_(dme $$0) {
      return $$0.a(czh.bs);
   }

   @Override
   public Multimap<il<bpz>, bqc> a(bom $$0) {
      return $$0 == bom.a ? this.b : super.a($$0);
   }
}
