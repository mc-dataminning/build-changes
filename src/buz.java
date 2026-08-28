import com.google.common.collect.ImmutableMap;

public class buz<E extends bta & cja, T extends bsy> extends bur<E> {
   private static final int c = 1200;
   private int d;
   private buz.a e = buz.a.a;

   public buz() {
      super(ImmutableMap.of(ccc.n, ccd.c, ccc.o, ccd.a), 1200);
   }

   protected boolean a(aqk $$0, E $$1) {
      bsy $$2 = b($$1);
      return $$1.b(cud.vW) && but.b($$1, $$2) && but.a($$1, $$2, 0);
   }

   protected boolean a(aqk $$0, E $$1, long $$2) {
      return $$1.dT().a(ccc.o) && this.a($$0, $$1);
   }

   protected void b(aqk $$0, E $$1, long $$2) {
      bsy $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(aqk $$0, E $$1, long $$2) {
      if ($$1.fr()) {
         $$1.fx();
      }

      if ($$1.b(cud.vW)) {
         $$1.b(false);
         $$1.ft().b(kn.E, cwn.a);
      }
   }

   private void a(E $$0, bsy $$1) {
      if (this.e == buz.a.a) {
         $$0.c(cnb.a($$0, cud.vW));
         this.e = buz.a.b;
         $$0.b(true);
      } else if (this.e == buz.a.b) {
         if (!$$0.fr()) {
            this.e = buz.a.a;
         }

         int $$2 = $$0.fv();
         cua $$3 = $$0.ft();
         if ($$2 >= csn.b($$3, $$0)) {
            $$0.fw();
            this.e = buz.a.c;
            this.d = 20 + $$0.dS().a(20);
            $$0.b(false);
         }
      } else if (this.e == buz.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = buz.a.d;
         }
      } else if (this.e == buz.a.d) {
         $$0.a($$1, 1.0F);
         this.e = buz.a.a;
      }
   }

   private void b(bta $$0, bsy $$1) {
      $$0.dT().a(ccc.n, new bvc($$1, true));
   }

   private static bsy b(bsy $$0) {
      return $$0.dT().c(ccc.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
