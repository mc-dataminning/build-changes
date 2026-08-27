import javax.annotation.Nullable;

public class cup extends cst {
   public static final dfx<dfv> a = dfp.ae;

   public cup(dey.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, dfv.b));
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      dfv $$6 = $$0.c(a);
      if ($$1.o() != ha.a.b || $$6 == dfv.b != ($$1 == ha.b) || $$2.a(this) && $$2.c(a) != $$6) {
         return $$6 == dfv.b && $$1 == ha.a && !$$0.a($$3, $$4) ? csm.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return csm.a.n();
      }
   }

   @Nullable
   @Override
   public dez a(clf $$0) {
      gu $$1 = $$0.a();
      cpl $$2 = $$0.q();
      return $$1.v() < $$2.aj() - 1 && $$2.a_($$1.c()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(cpl $$0, gu $$1, dez $$2, biy $$3, cix $$4) {
      gu $$5 = $$1.c();
      $$0.a($$5, b($$0, $$5, this.n().a(a, dfv.a)), 3);
   }

   @Override
   public boolean a(dez $$0, cpo $$1, gu $$2) {
      if ($$0.c(a) != dfv.a) {
         return super.a($$0, $$1, $$2);
      } else {
         dez $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(a) == dfv.b;
      }
   }

   public static void a(cpm $$0, dez $$1, gu $$2, int $$3) {
      gu $$4 = $$2.c();
      $$0.a($$2, b($$0, $$2, $$1.a(a, dfv.b)), $$3);
      $$0.a($$4, b($$0, $$4, $$1.a(a, dfv.a)), $$3);
   }

   public static dez b(cpo $$0, gu $$1, dez $$2) {
      return $$2.b(dfp.C) ? $$2.a(dfp.C, Boolean.valueOf($$0.y($$1))) : $$2;
   }

   @Override
   public void a(cpl $$0, gu $$1, dez $$2, cbm $$3) {
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
   public void a(cpl $$0, cbm $$1, gu $$2, dez $$3, @Nullable dcl $$4, cix $$5) {
      super.a($$0, $$1, $$2, csm.a.n(), $$4, $$5);
   }

   protected static void b(cpl $$0, gu $$1, dez $$2, cbm $$3) {
      dfv $$4 = $$2.c(a);
      if ($$4 == dfv.a) {
         gu $$5 = $$1.d();
         dez $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(a) == dfv.b) {
            dez $$7 = $$6.u().b(ead.c) ? csm.G.n() : csm.a.n();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, csl.i($$6));
         }
      }
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(a);
   }

   @Override
   public long a(dez $$0, gu $$1) {
      return arp.b($$1.u(), $$1.c($$0.c(a) == dfv.b ? 0 : 1).v(), $$1.w());
   }
}
