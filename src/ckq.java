import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class ckq extends ckt implements ckz {
   private final float a;
   private final Multimap<bkh, bkk> b;

   public ckq(cks $$0, int $$1, float $$2, cja.a $$3) {
      super($$0, $$3);
      this.a = (float)$$1 + $$0.c();
      Builder<bkh, bkk> $$4 = ImmutableMultimap.builder();
      $$4.put(bkm.f, new bkk(m, "Weapon modifier", (double)this.a, bkk.a.a));
      $$4.put(bkm.h, new bkk(n, "Weapon modifier", (double)$$2, bkk.a.a));
      this.b = $$4.build();
   }

   public float h() {
      return this.a;
   }

   @Override
   public boolean a(dfj $$0, cpv $$1, gw $$2, cbu $$3) {
      return !$$3.f();
   }

   @Override
   public float a(cjf $$0, dfj $$1) {
      if ($$1.a(csw.bs)) {
         return 15.0F;
      } else {
         return $$1.a(apt.bD) ? 1.5F : 1.0F;
      }
   }

   @Override
   public boolean a(cjf $$0, bjg $$1, bjg $$2) {
      $$0.a(1, $$2, $$0x -> $$0x.d(biv.a));
      return true;
   }

   @Override
   public boolean a(cjf $$0, cpv $$1, dfj $$2, gw $$3, bjg $$4) {
      if ($$2.h($$1, $$3) != 0.0F) {
         $$0.a(2, $$4, $$0x -> $$0x.d(biv.a));
      }

      return true;
   }

   @Override
   public boolean a_(dfj $$0) {
      return $$0.a(csw.bs);
   }

   @Override
   public Multimap<bkh, bkk> a(biv $$0) {
      return $$0 == biv.a ? this.b : super.a($$0);
   }
}
