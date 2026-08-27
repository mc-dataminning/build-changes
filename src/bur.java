import com.google.common.collect.ImmutableMap;

public class bur<E extends bss & cir, T extends bsq> extends buj<E> {
   private static final int c = 1200;
   private int d;
   private bur.a e = bur.a.a;

   public bur() {
      super(ImmutableMap.of(cbu.n, cbv.c, cbu.o, cbv.a), 1200);
   }

   protected boolean a(aqn $$0, E $$1) {
      bsq $$2 = b($$1);
      return $$1.b(ctt.vT) && bul.b($$1, $$2) && bul.a($$1, $$2, 0);
   }

   protected boolean a(aqn $$0, E $$1, long $$2) {
      return $$1.dS().a(cbu.o) && this.a($$0, $$1);
   }

   protected void b(aqn $$0, E $$1, long $$2) {
      bsq $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(aqn $$0, E $$1, long $$2) {
      if ($$1.fv()) {
         $$1.fB();
      }

      if ($$1.b(ctt.vT)) {
         $$1.b(false);
         $$1.fx().b(kb.D, cwe.a);
      }
   }

   private void a(E $$0, bsq $$1) {
      if (this.e == bur.a.a) {
         $$0.c(cms.a($$0, ctt.vT));
         this.e = bur.a.b;
         $$0.b(true);
      } else if (this.e == bur.a.b) {
         if (!$$0.fv()) {
            this.e = bur.a.a;
         }

         int $$2 = $$0.fz();
         ctq $$3 = $$0.fx();
         if ($$2 >= csd.l($$3)) {
            $$0.fA();
            this.e = bur.a.c;
            this.d = 20 + $$0.el().a(20);
            $$0.b(false);
         }
      } else if (this.e == bur.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = bur.a.d;
         }
      } else if (this.e == bur.a.d) {
         $$0.a($$1, 1.0F);
         this.e = bur.a.a;
      }
   }

   private void b(bss $$0, bsq $$1) {
      $$0.dS().a(cbu.n, new buu($$1, true));
   }

   private static bsq b(bsq $$0) {
      return $$0.dS().c(cbu.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
