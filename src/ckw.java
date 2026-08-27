import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class ckw extends ckz implements clf {
   private final float a;
   private final Multimap<bkn, bkq> b;

   public ckw(cky $$0, int $$1, float $$2, cjg.a $$3) {
      super($$0, $$3);
      this.a = (float)$$1 + $$0.c();
      Builder<bkn, bkq> $$4 = ImmutableMultimap.builder();
      $$4.put(bks.c, new bkq(m, "Weapon modifier", (double)this.a, bkq.a.a));
      $$4.put(bks.e, new bkq(n, "Weapon modifier", (double)$$2, bkq.a.a));
      this.b = $$4.build();
   }

   public float h() {
      return this.a;
   }

   @Override
   public boolean a(dfd $$0, cqb $$1, gw $$2, cca $$3) {
      return !$$3.f();
   }

   @Override
   public float a(cjl $$0, dfd $$1) {
      if ($$1.a(cte.bs)) {
         return 15.0F;
      } else {
         return $$1.a(apv.bD) ? 1.5F : 1.0F;
      }
   }

   @Override
   public boolean a(cjl $$0, bjm $$1, bjm $$2) {
      $$0.a(1, $$2, $$0x -> $$0x.d(bjb.a));
      return true;
   }

   @Override
   public boolean a(cjl $$0, cqb $$1, dfd $$2, gw $$3, bjm $$4) {
      if ($$2.h($$1, $$3) != 0.0F) {
         $$0.a(2, $$4, $$0x -> $$0x.d(bjb.a));
      }

      return true;
   }

   @Override
   public boolean a_(dfd $$0) {
      return $$0.a(cte.bs);
   }

   @Override
   public Multimap<bkn, bkq> a(bjb $$0) {
      return $$0 == bjb.a ? this.b : super.a($$0);
   }
}
