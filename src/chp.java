import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class chp extends ckt implements ckz {
   private final aqi<csv> a;
   protected final float b;
   private final float c;
   private final Multimap<bkh, bkk> d;

   protected chp(float $$0, float $$1, cks $$2, aqi<csv> $$3, cja.a $$4) {
      super($$2, $$4);
      this.a = $$3;
      this.b = $$2.b();
      this.c = $$0 + $$2.c();
      Builder<bkh, bkk> $$5 = ImmutableMultimap.builder();
      $$5.put(bkm.f, new bkk(m, "Tool modifier", (double)this.c, bkk.a.a));
      $$5.put(bkm.h, new bkk(n, "Tool modifier", (double)$$1, bkk.a.a));
      this.d = $$5.build();
   }

   @Override
   public float a(cjf $$0, dfj $$1) {
      return $$1.a(this.a) ? this.b : 1.0F;
   }

   @Override
   public boolean a(cjf $$0, bjg $$1, bjg $$2) {
      $$0.a(2, $$2, $$0x -> $$0x.d(biv.a));
      return true;
   }

   @Override
   public boolean a(cjf $$0, cpv $$1, dfj $$2, gw $$3, bjg $$4) {
      if (!$$1.B && $$2.h($$1, $$3) != 0.0F) {
         $$0.a(1, $$4, $$0x -> $$0x.d(biv.a));
      }

      return true;
   }

   @Override
   public Multimap<bkh, bkk> a(biv $$0) {
      return $$0 == biv.a ? this.d : super.a($$0);
   }

   public float d() {
      return this.c;
   }

   @Override
   public boolean a_(dfj $$0) {
      int $$1 = this.i().d();
      if ($$1 < 3 && $$0.a(apt.bE)) {
         return false;
      } else if ($$1 < 2 && $$0.a(apt.bF)) {
         return false;
      } else {
         return $$1 < 1 && $$0.a(apt.bG) ? false : $$0.a(this.a);
      }
   }
}
