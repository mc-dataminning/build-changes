import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class byh extends bvf<cmi> {
   private static final int c = 80;
   private long d;
   private long e;
   private int f;
   private Optional<jd> g = Optional.empty();

   public byh() {
      super(ImmutableMap.of(ccq.n, ccr.b, ccq.m, ccr.b));
   }

   protected boolean a(aqt $$0, cmi $$1) {
      if ($$1.ai % 10 == 0 && (this.e == 0L || this.e + 160L <= (long)$$1.ai)) {
         if ($$1.x().a_(cur.ry) <= 0) {
            return false;
         } else {
            this.g = this.b($$0, $$1);
            return this.g.isPresent();
         }
      } else {
         return false;
      }
   }

   protected boolean a(aqt $$0, cmi $$1, long $$2) {
      return this.f < 80 && this.g.isPresent();
   }

   private Optional<jd> b(aqt $$0, cmi $$1) {
      jd.a $$2 = new jd.a();
      Optional<jd> $$3 = Optional.empty();
      int $$4 = 0;

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               $$2.a($$1.dq(), $$5, $$6, $$7);
               if (this.a($$2, $$0)) {
                  if ($$0.z.a(++$$4) == 0) {
                     $$3 = Optional.of($$2.i());
                  }
               }
            }
         }
      }

      return $$3;
   }

   private boolean a(jd $$0, aqt $$1) {
      dta $$2 = $$1.a_($$0);
      dfw $$3 = $$2.b();
      return $$3 instanceof dhr && !((dhr)$$3).h($$2);
   }

   protected void b(aqt $$0, cmi $$1, long $$2) {
      this.a($$1);
      $$1.a(bsx.a, new cuo(cur.ry));
      this.d = $$2;
      this.f = 0;
   }

   private void a(cmi $$0) {
      this.g.ifPresent($$1 -> {
         bvi $$2 = new bvi($$1);
         $$0.dU().a(ccq.n, $$2);
         $$0.dU().a(ccq.m, new cct($$2, 0.5F, 1));
      });
   }

   protected void c(aqt $$0, cmi $$1, long $$2) {
      $$1.a(bsx.a, cuo.l);
      this.e = (long)$$1.ai;
   }

   protected void d(aqt $$0, cmi $$1, long $$2) {
      jd $$3 = this.g.get();
      if ($$2 >= this.d && $$3.a($$1.do(), 1.0)) {
         cuo $$4 = cuo.l;
         bqz $$5 = $$1.x();
         int $$6 = $$5.b();

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            cuo $$8 = $$5.a($$7);
            if ($$8.a(cur.ry)) {
               $$4 = $$8;
               break;
            }
         }

         if (!$$4.e() && cso.a($$4, $$0, $$3)) {
            $$0.c(1505, $$3, 15);
            this.g = this.b($$0, $$1);
            this.a($$1);
            this.d = $$2 + 40L;
         }

         this.f++;
      }
   }
}
