import com.google.common.collect.ImmutableMap;

public class brp<E extends bpr & cfn, T extends bpp> extends brh<E> {
   private static final int c = 1200;
   private int d;
   private brp.a e = brp.a.a;

   public brp() {
      super(ImmutableMap.of(bys.n, byt.c, bys.o, byt.a), 1200);
   }

   protected boolean a(apf $$0, E $$1) {
      bpp $$2 = b($$1);
      return $$1.b(cqp.vR) && brj.b($$1, $$2) && brj.a($$1, $$2, 0);
   }

   protected boolean a(apf $$0, E $$1, long $$2) {
      return $$1.dP().a(bys.o) && this.a($$0, $$1);
   }

   protected void b(apf $$0, E $$1, long $$2) {
      bpp $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(apf $$0, E $$1, long $$2) {
      if ($$1.fs()) {
         $$1.fy();
      }

      if ($$1.b(cqp.vR)) {
         $$1.b(false);
         cox.a($$1.fu(), false);
      }
   }

   private void a(E $$0, bpp $$1) {
      if (this.e == brp.a.a) {
         $$0.c(cjo.a($$0, cqp.vR));
         this.e = brp.a.b;
         $$0.b(true);
      } else if (this.e == brp.a.b) {
         if (!$$0.fs()) {
            this.e = brp.a.a;
         }

         int $$2 = $$0.fw();
         cqm $$3 = $$0.fu();
         if ($$2 >= cox.k($$3)) {
            $$0.fx();
            this.e = brp.a.c;
            this.d = 20 + $$0.ei().a(20);
            $$0.b(false);
         }
      } else if (this.e == brp.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = brp.a.d;
         }
      } else if (this.e == brp.a.d) {
         $$0.a($$1, 1.0F);
         cqm $$4 = $$0.b(cjo.a($$0, cqp.vR));
         cox.a($$4, false);
         this.e = brp.a.a;
      }
   }

   private void b(bpr $$0, bpp $$1) {
      $$0.dP().a(bys.n, new brs($$1, true));
   }

   private static bpp b(bpp $$0) {
      return $$0.dP().c(bys.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
