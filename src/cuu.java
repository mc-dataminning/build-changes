import javax.annotation.Nullable;

public class cuu extends csy {
   public static final dgc<dga> a = dfu.ae;

   public cuu(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, dga.b));
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      dga $$6 = $$0.c(a);
      if ($$1.o() != hc.a.b || $$6 == dga.b != ($$1 == hc.b) || $$2.a(this) && $$2.c(a) != $$6) {
         return $$6 == dga.b && $$1 == hc.a && !$$0.a($$3, $$4) ? csr.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return csr.a.n();
      }
   }

   @Nullable
   @Override
   public dfe a(cli $$0) {
      gw $$1 = $$0.a();
      cpq $$2 = $$0.q();
      return $$1.v() < $$2.aj() - 1 && $$2.a_($$1.c()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(cpq $$0, gw $$1, dfe $$2, bjb $$3, cja $$4) {
      gw $$5 = $$1.c();
      $$0.a($$5, b($$0, $$5, this.n().a(a, dga.a)), 3);
   }

   @Override
   public boolean a(dfe $$0, cpt $$1, gw $$2) {
      if ($$0.c(a) != dga.a) {
         return super.a($$0, $$1, $$2);
      } else {
         dfe $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(a) == dga.b;
      }
   }

   public static void a(cpr $$0, dfe $$1, gw $$2, int $$3) {
      gw $$4 = $$2.c();
      $$0.a($$2, b($$0, $$2, $$1.a(a, dga.b)), $$3);
      $$0.a($$4, b($$0, $$4, $$1.a(a, dga.a)), $$3);
   }

   public static dfe b(cpt $$0, gw $$1, dfe $$2) {
      return $$2.b(dfu.C) ? $$2.a(dfu.C, Boolean.valueOf($$0.y($$1))) : $$2;
   }

   @Override
   public void a(cpq $$0, gw $$1, dfe $$2, cbp $$3) {
      if (!$$0.B) {
         if ($$3.f()) {
            b($$0, $$1, $$2, $$3);
         } else {
            a($$2, $$0, $$1, null, $$3, $$3.eR());
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cpq $$0, cbp $$1, gw $$2, dfe $$3, @Nullable dcq $$4, cja $$5) {
      super.a($$0, $$1, $$2, csr.a.n(), $$4, $$5);
   }

   protected static void b(cpq $$0, gw $$1, dfe $$2, cbp $$3) {
      dga $$4 = $$2.c(a);
      if ($$4 == dga.a) {
         gw $$5 = $$1.d();
         dfe $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(a) == dga.b) {
            dfe $$7 = $$6.u().b(eai.c) ? csr.G.n() : csr.a.n();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, csq.i($$6));
         }
      }
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(a);
   }

   @Override
   public long a(dfe $$0, gw $$1) {
      return ars.b($$1.u(), $$1.c($$0.c(a) == dga.b ? 0 : 1).v(), $$1.w());
   }
}
