import com.google.common.collect.ImmutableMap;

public class cae<E extends byh & cox, T extends byf> extends bzw<E> {
   private static final int c = 1200;
   private int d;
   private cae.a e = cae.a.a;

   public cae() {
      super(ImmutableMap.of(chh.o, chi.c, chh.p, chi.a), 1200);
   }

   protected boolean a(asb $$0, E $$1) {
      byf $$2 = b($$1);
      return $$1.b(dao.xg) && bzy.b($$1, $$2) && bzy.a($$1, $$2, 0);
   }

   protected boolean a(asb $$0, E $$1, long $$2) {
      return $$1.ec().a(chh.p) && this.a($$0, $$1);
   }

   protected void b(asb $$0, E $$1, long $$2) {
      byf $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(asb $$0, E $$1, long $$2) {
      if ($$1.fz()) {
         $$1.fF();
      }

      if ($$1.b(dao.xg)) {
         $$1.b(false);
         $$1.fB().b(kl.P, dco.a);
      }
   }

   private void a(E $$0, byf $$1) {
      if (this.e == cae.a.a) {
         $$0.c(ctf.a($$0, dao.xg));
         this.e = cae.a.b;
         $$0.b(true);
      } else if (this.e == cae.a.b) {
         if (!$$0.fz()) {
            this.e = cae.a.a;
         }

         int $$2 = $$0.fD();
         dak $$3 = $$0.fB();
         if ($$2 >= czd.b($$3, $$0)) {
            $$0.fE();
            this.e = cae.a.c;
            this.d = 20 + $$0.dY().a(20);
            $$0.b(false);
         }
      } else if (this.e == cae.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = cae.a.d;
         }
      } else if (this.e == cae.a.d) {
         $$0.a($$1, 1.0F);
         this.e = cae.a.a;
      }
   }

   private void b(byh $$0, byf $$1) {
      $$0.ec().a(chh.o, new cah($$1, true));
   }

   private static byf b(byf $$0) {
      return $$0.ec().c(chh.p).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
