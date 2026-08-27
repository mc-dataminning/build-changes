import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bvi extends bsg<cjg> {
   private static final int c = 80;
   private long d;
   private long e;
   private int f;
   private Optional<ib> g = Optional.empty();

   public bvi() {
      super(ImmutableMap.of(bzr.n, bzs.b, bzr.m, bzs.b));
   }

   protected boolean a(aps $$0, cjg $$1) {
      if ($$1.ah % 10 == 0 && (this.e == 0L || this.e + 160L <= (long)$$1.ah)) {
         if ($$1.y().a_(crm.rx) <= 0) {
            return false;
         } else {
            this.g = this.b($$0, $$1);
            return this.g.isPresent();
         }
      } else {
         return false;
      }
   }

   protected boolean a(aps $$0, cjg $$1, long $$2) {
      return this.f < 80 && this.g.isPresent();
   }

   private Optional<ib> b(aps $$0, cjg $$1) {
      ib.a $$2 = new ib.a();
      Optional<ib> $$3 = Optional.empty();
      int $$4 = 0;

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               $$2.a($$1.dm(), $$5, $$6, $$7);
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

   private boolean a(ib $$0, aps $$1) {
      doz $$2 = $$1.a_($$0);
      dby $$3 = $$2.b();
      return $$3 instanceof ddt && !((ddt)$$3).h($$2);
   }

   protected void b(aps $$0, cjg $$1, long $$2) {
      this.a($$1);
      $$1.a(bqc.a, new crj(crm.rx));
      this.d = $$2;
      this.f = 0;
   }

   private void a(cjg $$0) {
      this.g.ifPresent($$1 -> {
         bsj $$2 = new bsj($$1);
         $$0.dP().a(bzr.n, $$2);
         $$0.dP().a(bzr.m, new bzu($$2, 0.5F, 1));
      });
   }

   protected void c(aps $$0, cjg $$1, long $$2) {
      $$1.a(bqc.a, crj.i);
      this.e = (long)$$1.ah;
   }

   protected void d(aps $$0, cjg $$1, long $$2) {
      ib $$3 = this.g.get();
      if ($$2 >= this.d && $$3.a($$1.dk(), 1.0)) {
         crj $$4 = crj.i;
         boj $$5 = $$1.y();
         int $$6 = $$5.b();

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            crj $$8 = $$5.a($$7);
            if ($$8.a(crm.rx)) {
               $$4 = $$8;
               break;
            }
         }

         if (!$$4.d() && cpj.a($$4, $$0, $$3)) {
            $$0.c(1505, $$3, 15);
            this.g = this.b($$0, $$1);
            this.a($$1);
            this.d = $$2 + 40L;
         }

         this.f++;
      }
   }
}
