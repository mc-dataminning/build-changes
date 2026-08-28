import com.google.common.collect.ImmutableMap;

public class byq<E extends bwt & cmw, T extends bwr> extends byi<E> {
   private static final int c = 1200;
   private int d;
   private byq.a e = byq.a.a;

   public byq() {
      super(ImmutableMap.of(cft.o, cfu.c, cft.p, cfu.a), 1200);
   }

   protected boolean a(arn $$0, E $$1) {
      bwr $$2 = b($$1);
      return $$1.b(cyc.wZ) && byk.b($$1, $$2) && byk.a($$1, $$2, 0);
   }

   protected boolean a(arn $$0, E $$1, long $$2) {
      return $$1.eb().a(cft.p) && this.a($$0, $$1);
   }

   protected void b(arn $$0, E $$1, long $$2) {
      bwr $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(arn $$0, E $$1, long $$2) {
      if ($$1.fy()) {
         $$1.fE();
      }

      if ($$1.b(cyc.wZ)) {
         $$1.b(false);
         $$1.fA().b(kx.P, daa.a);
      }
   }

   private void a(E $$0, bwr $$1) {
      if (this.e == byq.a.a) {
         $$0.c(crd.a($$0, cyc.wZ));
         this.e = byq.a.b;
         $$0.b(true);
      } else if (this.e == byq.a.b) {
         if (!$$0.fy()) {
            this.e = byq.a.a;
         }

         int $$2 = $$0.fC();
         cxy $$3 = $$0.fA();
         if ($$2 >= cwq.b($$3, $$0)) {
            $$0.fD();
            this.e = byq.a.c;
            this.d = 20 + $$0.dY().a(20);
            $$0.b(false);
         }
      } else if (this.e == byq.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = byq.a.d;
         }
      } else if (this.e == byq.a.d) {
         $$0.a($$1, 1.0F);
         this.e = byq.a.a;
      }
   }

   private void b(bwt $$0, bwr $$1) {
      $$0.eb().a(cft.o, new byt($$1, true));
   }

   private static bwr b(bwr $$0) {
      return $$0.eb().c(cft.p).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
