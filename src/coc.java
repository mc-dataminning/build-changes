import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class coc extends cre {
   private final aut<czf> a;
   protected final float b;
   private final float c;
   private final Multimap<il<bpz>, bqc> d;

   protected coc(float $$0, float $$1, crd $$2, aut<czf> $$3, cpl.a $$4) {
      super($$2, $$4);
      this.a = $$3;
      this.b = $$2.b();
      this.c = $$0 + $$2.c();
      Builder<il<bpz>, bqc> $$5 = ImmutableMultimap.builder();
      $$5.put(bqe.c, new bqc(m, "Tool modifier", (double)this.c, bqc.a.a));
      $$5.put(bqe.e, new bqc(n, "Tool modifier", (double)$$1, bqc.a.a));
      this.d = $$5.build();
   }

   @Override
   public float a(cpq $$0, dme $$1) {
      return $$1.a(this.a) ? this.b : 1.0F;
   }

   @Override
   public boolean a(cpq $$0, box $$1, box $$2) {
      $$0.a(2, $$2, bom.a);
      return true;
   }

   @Override
   public boolean a(cpq $$0, cwe $$1, dme $$2, ib $$3, box $$4) {
      if (!$$1.B && $$2.h($$1, $$3) != 0.0F) {
         $$0.a(1, $$4, bom.a);
      }

      return true;
   }

   @Override
   public Multimap<il<bpz>, bqc> a(bom $$0) {
      return $$0 == bom.a ? this.d : super.a($$0);
   }

   public float c() {
      return this.c;
   }

   @Override
   public boolean a_(dme $$0) {
      int $$1 = this.i().d();
      if ($$1 < 3 && $$0.a(aue.bE)) {
         return false;
      } else if ($$1 < 2 && $$0.a(aue.bF)) {
         return false;
      } else {
         return $$1 < 1 && $$0.a(aue.bG) ? false : $$0.a(this.a);
      }
   }
}
