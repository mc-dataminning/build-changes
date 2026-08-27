import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class brh extends bof<cfd> {
   private static final int c = 80;
   private long d;
   private long e;
   private int f;
   private Optional<hx> g = Optional.empty();

   public brh() {
      super(ImmutableMap.of(bvq.n, bvr.b, bvq.m, bvr.b));
   }

   protected boolean a(ane $$0, cfd $$1) {
      if ($$1.ah % 10 == 0 && (this.e == 0L || this.e + 160L <= (long)$$1.ah)) {
         if ($$1.A().a_(cnj.rx) <= 0) {
            return false;
         } else {
            this.g = this.b($$0, $$1);
            return this.g.isPresent();
         }
      } else {
         return false;
      }
   }

   protected boolean a(ane $$0, cfd $$1, long $$2) {
      return this.f < 80 && this.g.isPresent();
   }

   private Optional<hx> b(ane $$0, cfd $$1) {
      hx.a $$2 = new hx.a();
      Optional<hx> $$3 = Optional.empty();
      int $$4 = 0;

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               $$2.a($$1.dl(), $$5, $$6, $$7);
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

   private boolean a(hx $$0, ane $$1) {
      djp $$2 = $$1.a_($$0);
      cwy $$3 = $$2.b();
      return $$3 instanceof cyt && !((cyt)$$3).h($$2);
   }

   protected void b(ane $$0, cfd $$1, long $$2) {
      this.a($$1);
      $$1.a(bmd.a, new cng(cnj.rx));
      this.d = $$2;
      this.f = 0;
   }

   private void a(cfd $$0) {
      this.g.ifPresent($$1 -> {
         boi $$2 = new boi($$1);
         $$0.dN().a(bvq.n, $$2);
         $$0.dN().a(bvq.m, new bvt($$2, 0.5F, 1));
      });
   }

   protected void c(ane $$0, cfd $$1, long $$2) {
      $$1.a(bmd.a, cng.f);
      this.e = (long)$$1.ah;
   }

   protected void d(ane $$0, cfd $$1, long $$2) {
      hx $$3 = this.g.get();
      if ($$2 >= this.d && $$3.a($$1.dj(), 1.0)) {
         cng $$4 = cng.f;
         bkl $$5 = $$1.A();
         int $$6 = $$5.b();

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            cng $$8 = $$5.a($$7);
            if ($$8.a(cnj.rx)) {
               $$4 = $$8;
               break;
            }
         }

         if (!$$4.b() && clc.a($$4, $$0, $$3)) {
            $$0.c(1505, $$3, 15);
            this.g = this.b($$0, $$1);
            this.a($$1);
            this.d = $$2 + 40L;
         }

         this.f++;
      }
   }
}
