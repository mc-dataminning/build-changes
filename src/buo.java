import com.google.common.collect.ImmutableMap;

public class buo<E extends bsq & cip, T extends bso> extends bug<E> {
   private static final int c = 1200;
   private int d;
   private buo.a e = buo.a.a;

   public buo() {
      super(ImmutableMap.of(cbr.n, cbs.c, cbr.o, cbs.a), 1200);
   }

   protected boolean a(aqt $$0, E $$1) {
      bso $$2 = b($$1);
      return $$1.b(cuk.xE) && bui.b($$1, $$2) && bui.a($$1, $$2, 0);
   }

   protected boolean a(aqt $$0, E $$1, long $$2) {
      return $$1.dZ().a(cbr.o) && this.a($$0, $$1);
   }

   protected void b(aqt $$0, E $$1, long $$2) {
      bso $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(aqt $$0, E $$1, long $$2) {
      if ($$1.fE()) {
         $$1.fK();
      }

      if ($$1.b(cuk.xE)) {
         $$1.b(false);
         $$1.fG().b(ke.C, cxe.a);
      }
   }

   private void a(E $$0, bso $$1) {
      if (this.e == buo.a.a) {
         $$0.c(cmu.a($$0, cuk.xE));
         this.e = buo.a.b;
         $$0.b(true);
      } else if (this.e == buo.a.b) {
         if (!$$0.fE()) {
            this.e = buo.a.a;
         }

         int $$2 = $$0.fI();
         cuh $$3 = $$0.fG();
         if ($$2 >= css.l($$3)) {
            $$0.fJ();
            this.e = buo.a.c;
            this.d = 20 + $$0.et().a(20);
            $$0.b(false);
         }
      } else if (this.e == buo.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = buo.a.d;
         }
      } else if (this.e == buo.a.d) {
         $$0.a($$1, 1.0F);
         this.e = buo.a.a;
      }
   }

   private void b(bsq $$0, bso $$1) {
      $$0.dZ().a(cbr.n, new bur($$1, true));
   }

   private static bso b(bso $$0) {
      return $$0.dZ().c(cbr.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
