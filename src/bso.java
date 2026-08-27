import com.google.common.collect.ImmutableMap;

public class bso<E extends bqq & cgm, T extends bqo> extends bsg<E> {
   private static final int c = 1200;
   private int d;
   private bso.a e = bso.a.a;

   public bso() {
      super(ImmutableMap.of(bzr.n, bzs.c, bzr.o, bzs.a), 1200);
   }

   protected boolean a(aps $$0, E $$1) {
      bqo $$2 = b($$1);
      return $$1.b(crm.vR) && bsi.b($$1, $$2) && bsi.a($$1, $$2, 0);
   }

   protected boolean a(aps $$0, E $$1, long $$2) {
      return $$1.dP().a(bzr.o) && this.a($$0, $$1);
   }

   protected void b(aps $$0, E $$1, long $$2) {
      bqo $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(aps $$0, E $$1, long $$2) {
      if ($$1.fs()) {
         $$1.fy();
      }

      if ($$1.b(crm.vR)) {
         $$1.b(false);
         $$1.fu().b(jp.v, cts.a);
      }
   }

   private void a(E $$0, bqo $$1) {
      if (this.e == bso.a.a) {
         $$0.c(ckn.a($$0, crm.vR));
         this.e = bso.a.b;
         $$0.b(true);
      } else if (this.e == bso.a.b) {
         if (!$$0.fs()) {
            this.e = bso.a.a;
         }

         int $$2 = $$0.fw();
         crj $$3 = $$0.fu();
         if ($$2 >= cpw.l($$3)) {
            $$0.fx();
            this.e = bso.a.c;
            this.d = 20 + $$0.ei().a(20);
            $$0.b(false);
         }
      } else if (this.e == bso.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = bso.a.d;
         }
      } else if (this.e == bso.a.d) {
         $$0.a($$1, 1.0F);
         this.e = bso.a.a;
      }
   }

   private void b(bqq $$0, bqo $$1) {
      $$0.dP().a(bzr.n, new bsr($$1, true));
   }

   private static bqo b(bqo $$0) {
      return $$0.dP().c(bzr.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
