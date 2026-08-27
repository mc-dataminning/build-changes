import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class crv extends cry {
   private final float a;
   private final Multimap<il<bqq>, bqt> b;

   public crv(crx $$0, int $$1, float $$2, cqf.a $$3) {
      super($$0, $$3);
      this.a = (float)$$1 + $$0.c();
      Builder<il<bqq>, bqt> $$4 = ImmutableMultimap.builder();
      $$4.put(bqv.c, new bqt(m, "Weapon modifier", (double)this.a, bqt.a.a));
      $$4.put(bqv.e, new bqt(n, "Weapon modifier", (double)$$2, bqt.a.a));
      this.b = $$4.build();
   }

   public float h() {
      return this.a;
   }

   @Override
   public boolean a(dmz $$0, cwz $$1, ib $$2, cis $$3) {
      return !$$3.f();
   }

   @Override
   public float a(cqk $$0, dmz $$1) {
      if ($$1.a(dac.bs)) {
         return 15.0F;
      } else {
         return $$1.a(aun.bE) ? 1.5F : 1.0F;
      }
   }

   @Override
   public boolean a(cqk $$0, bpo $$1, bpo $$2) {
      $$0.a(1, $$2, bpd.a);
      return true;
   }

   @Override
   public boolean a(cqk $$0, cwz $$1, dmz $$2, ib $$3, bpo $$4) {
      if ($$2.h($$1, $$3) != 0.0F) {
         $$0.a(2, $$4, bpd.a);
      }

      return true;
   }

   @Override
   public boolean a_(dmz $$0) {
      return $$0.a(dac.bs);
   }

   @Override
   public Multimap<il<bqq>, bqt> a(bpd $$0) {
      return $$0 == bpd.a ? this.b : super.a($$0);
   }
}
