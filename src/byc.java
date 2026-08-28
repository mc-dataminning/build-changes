import com.google.common.collect.ImmutableMap;

public class byc<E extends bwd & cmf, T extends bwb> extends bxu<E> {
   private static final int c = 1200;
   private int d;
   private byc.a e = byc.a.a;

   public byc() {
      super(ImmutableMap.of(cff.n, cfg.c, cff.o, cfg.a), 1200);
   }

   protected boolean a(ash $$0, E $$1) {
      bwb $$2 = b($$1);
      return $$1.b(cxo.wL) && bxw.b($$1, $$2) && bxw.a($$1, $$2, 0);
   }

   protected boolean a(ash $$0, E $$1, long $$2) {
      return $$1.eb().a(cff.o) && this.a($$0, $$1);
   }

   protected void b(ash $$0, E $$1, long $$2) {
      bwb $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(ash $$0, E $$1, long $$2) {
      if ($$1.fx()) {
         $$1.fD();
      }

      if ($$1.b(cxo.wL)) {
         $$1.b(false);
         $$1.fz().b(ku.O, czp.a);
      }
   }

   private void a(E $$0, bwb $$1) {
      if (this.e == byc.a.a) {
         $$0.c(cqn.a($$0, cxo.wL));
         this.e = byc.a.b;
         $$0.b(true);
      } else if (this.e == byc.a.b) {
         if (!$$0.fx()) {
            this.e = byc.a.a;
         }

         int $$2 = $$0.fB();
         cxk $$3 = $$0.fz();
         if ($$2 >= cwb.b($$3, $$0)) {
            $$0.fC();
            this.e = byc.a.c;
            this.d = 20 + $$0.dY().a(20);
            $$0.b(false);
         }
      } else if (this.e == byc.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = byc.a.d;
         }
      } else if (this.e == byc.a.d) {
         $$0.a($$1, 1.0F);
         this.e = byc.a.a;
      }
   }

   private void b(bwd $$0, bwb $$1) {
      $$0.eb().a(cff.n, new byf($$1, true));
   }

   private static bwb b(bwb $$0) {
      return $$0.eb().c(cff.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
