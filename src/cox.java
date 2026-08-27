import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class cox extends cry {
   private final avd<daa> a;
   protected final float b;
   private final float c;
   private final Multimap<il<bqq>, bqt> d;

   protected cox(float $$0, float $$1, crx $$2, avd<daa> $$3, cqf.a $$4) {
      super($$2, $$4);
      this.a = $$3;
      this.b = $$2.b();
      this.c = $$0 + $$2.c();
      Builder<il<bqq>, bqt> $$5 = ImmutableMultimap.builder();
      $$5.put(bqv.c, new bqt(m, "Tool modifier", (double)this.c, bqt.a.a));
      $$5.put(bqv.e, new bqt(n, "Tool modifier", (double)$$1, bqt.a.a));
      this.d = $$5.build();
   }

   @Override
   public float a(cqk $$0, dmz $$1) {
      return $$1.a(this.a) ? this.b : 1.0F;
   }

   @Override
   public boolean a(cqk $$0, bpo $$1, bpo $$2) {
      $$0.a(2, $$2, bpd.a);
      return true;
   }

   @Override
   public boolean a(cqk $$0, cwz $$1, dmz $$2, ib $$3, bpo $$4) {
      if (!$$1.B && $$2.h($$1, $$3) != 0.0F) {
         $$0.a(1, $$4, bpd.a);
      }

      return true;
   }

   @Override
   public Multimap<il<bqq>, bqt> a(bpd $$0) {
      return $$0 == bpd.a ? this.d : super.a($$0);
   }

   public float c() {
      return this.c;
   }

   @Override
   public boolean a_(dmz $$0) {
      int $$1 = this.i().d();
      if ($$1 < 3 && $$0.a(aun.bF)) {
         return false;
      } else if ($$1 < 2 && $$0.a(aun.bG)) {
         return false;
      } else {
         return $$1 < 1 && $$0.a(aun.bH) ? false : $$0.a(this.a);
      }
   }
}
