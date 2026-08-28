import com.google.common.collect.ImmutableMap;

public class bxz<E extends bwa & cmf, T extends bvy> extends bxr<E> {
   private static final int c = 1200;
   private int d;
   private bxz.a e = bxz.a.a;

   public bxz() {
      super(ImmutableMap.of(cfc.n, cfd.c, cfc.o, cfd.a), 1200);
   }

   protected boolean a(ard $$0, E $$1) {
      bvy $$2 = b($$1);
      return $$1.b(cxl.wX) && bxt.b($$1, $$2) && bxt.a($$1, $$2, 0);
   }

   protected boolean a(ard $$0, E $$1, long $$2) {
      return $$1.ea().a(cfc.o) && this.a($$0, $$1);
   }

   protected void b(ard $$0, E $$1, long $$2) {
      bvy $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(ard $$0, E $$1, long $$2) {
      if ($$1.fB()) {
         $$1.fH();
      }

      if ($$1.b(cxl.wX)) {
         $$1.b(false);
         $$1.fD().b(kv.P, czk.a);
      }
   }

   private void a(E $$0, bvy $$1) {
      if (this.e == bxz.a.a) {
         $$0.c(cqm.a($$0, cxl.wX));
         this.e = bxz.a.b;
         $$0.b(true);
      } else if (this.e == bxz.a.b) {
         if (!$$0.fB()) {
            this.e = bxz.a.a;
         }

         int $$2 = $$0.fF();
         cxh $$3 = $$0.fD();
         if ($$2 >= cvz.b($$3, $$0)) {
            $$0.fG();
            this.e = bxz.a.c;
            this.d = 20 + $$0.dX().a(20);
            $$0.b(false);
         }
      } else if (this.e == bxz.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = bxz.a.d;
         }
      } else if (this.e == bxz.a.d) {
         $$0.a($$1, 1.0F);
         this.e = bxz.a.a;
      }
   }

   private void b(bwa $$0, bvy $$1) {
      $$0.ea().a(cfc.n, new byc($$1, true));
   }

   private static bvy b(bvy $$0) {
      return $$0.ea().c(cfc.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
