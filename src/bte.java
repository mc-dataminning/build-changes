import com.google.common.collect.ImmutableMap;

public class bte<E extends brg & che, T extends bre> extends bsw<E> {
   private static final int c = 1200;
   private int d;
   private bte.a e = bte.a.a;

   public bte() {
      super(ImmutableMap.of(cah.n, cai.c, cah.o, cai.a), 1200);
   }

   protected boolean a(aqe $$0, E $$1) {
      bre $$2 = b($$1);
      return $$1.b(csg.vT) && bsy.b($$1, $$2) && bsy.a($$1, $$2, 0);
   }

   protected boolean a(aqe $$0, E $$1, long $$2) {
      return $$1.dQ().a(cah.o) && this.a($$0, $$1);
   }

   protected void b(aqe $$0, E $$1, long $$2) {
      bre $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(aqe $$0, E $$1, long $$2) {
      if ($$1.ft()) {
         $$1.fz();
      }

      if ($$1.b(csg.vT)) {
         $$1.b(false);
         $$1.fv().b(jz.v, cup.a);
      }
   }

   private void a(E $$0, bre $$1) {
      if (this.e == bte.a.a) {
         $$0.c(clf.a($$0, csg.vT));
         this.e = bte.a.b;
         $$0.b(true);
      } else if (this.e == bte.a.b) {
         if (!$$0.ft()) {
            this.e = bte.a.a;
         }

         int $$2 = $$0.fx();
         csd $$3 = $$0.fv();
         if ($$2 >= cqq.l($$3)) {
            $$0.fy();
            this.e = bte.a.c;
            this.d = 20 + $$0.ej().a(20);
            $$0.b(false);
         }
      } else if (this.e == bte.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = bte.a.d;
         }
      } else if (this.e == bte.a.d) {
         $$0.a($$1, 1.0F);
         this.e = bte.a.a;
      }
   }

   private void b(brg $$0, bre $$1) {
      $$0.dQ().a(cah.n, new bth($$1, true));
   }

   private static bre b(bre $$0) {
      return $$0.dQ().c(cah.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
