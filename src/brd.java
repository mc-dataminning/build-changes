import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class brd extends bob<ceu> {
   private static final int c = 80;
   private long d;
   private long e;
   private int f;
   private Optional<hx> g = Optional.empty();

   public brd() {
      super(ImmutableMap.of(bvm.n, bvn.b, bvm.m, bvn.b));
   }

   protected boolean a(and $$0, ceu $$1) {
      if ($$1.ah % 10 == 0 && (this.e == 0L || this.e + 160L <= (long)$$1.ah)) {
         if ($$1.A().a_(cna.rv) <= 0) {
            return false;
         } else {
            this.g = this.b($$0, $$1);
            return this.g.isPresent();
         }
      } else {
         return false;
      }
   }

   protected boolean a(and $$0, ceu $$1, long $$2) {
      return this.f < 80 && this.g.isPresent();
   }

   private Optional<hx> b(and $$0, ceu $$1) {
      hx.a $$2 = new hx.a();
      Optional<hx> $$3 = Optional.empty();
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

   private boolean a(hx $$0, and $$1) {
      djg $$2 = $$1.a_($$0);
      cwp $$3 = $$2.b();
      return $$3 instanceof cyk && !((cyk)$$3).h($$2);
   }

   protected void b(and $$0, ceu $$1, long $$2) {
      this.a($$1);
      $$1.a(blz.a, new cmx(cna.rv));
      this.d = $$2;
      this.f = 0;
   }

   private void a(ceu $$0) {
      this.g.ifPresent($$1 -> {
         boe $$2 = new boe($$1);
         $$0.dO().a(bvm.n, $$2);
         $$0.dO().a(bvm.m, new bvp($$2, 0.5F, 1));
      });
   }

   protected void c(and $$0, ceu $$1, long $$2) {
      $$1.a(blz.a, cmx.f);
      this.e = (long)$$1.ah;
   }

   protected void d(and $$0, ceu $$1, long $$2) {
      hx $$3 = this.g.get();
      if ($$2 >= this.d && $$3.a($$1.dk(), 1.0)) {
         cmx $$4 = cmx.f;
         bki $$5 = $$1.A();
         int $$6 = $$5.b();

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            cmx $$8 = $$5.a($$7);
            if ($$8.a(cna.rv)) {
               $$4 = $$8;
               break;
            }
         }

         if (!$$4.b() && cks.a($$4, $$0, $$3)) {
            $$0.c(1505, $$3, 0);
            this.g = this.b($$0, $$1);
            this.a($$1);
            this.d = $$2 + 40L;
         }

         this.f++;
      }
   }
}
