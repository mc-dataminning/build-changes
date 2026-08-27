import javax.annotation.Nullable;

public class cvb extends ctf {
   public static final dgj<dgh> a = dgb.ae;

   public cvb(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, dgh.b));
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      dgh $$6 = $$0.c(a);
      if ($$1.o() != hc.a.b || $$6 == dgh.b != ($$1 == hc.b) || $$2.a(this) && $$2.c(a) != $$6) {
         return $$6 == dgh.b && $$1 == hc.a && !$$0.a($$3, $$4) ? csy.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return csy.a.n();
      }
   }

   @Nullable
   @Override
   public dfl a(clp $$0) {
      gw $$1 = $$0.a();
      cpx $$2 = $$0.q();
      return $$1.v() < $$2.aj() - 1 && $$2.a_($$1.c()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(cpx $$0, gw $$1, dfl $$2, bji $$3, cjh $$4) {
      gw $$5 = $$1.c();
      $$0.a($$5, b($$0, $$5, this.n().a(a, dgh.a)), 3);
   }

   @Override
   public boolean a(dfl $$0, cqa $$1, gw $$2) {
      if ($$0.c(a) != dgh.a) {
         return super.a($$0, $$1, $$2);
      } else {
         dfl $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(a) == dgh.b;
      }
   }

   public static void a(cpy $$0, dfl $$1, gw $$2, int $$3) {
      gw $$4 = $$2.c();
      $$0.a($$2, b($$0, $$2, $$1.a(a, dgh.b)), $$3);
      $$0.a($$4, b($$0, $$4, $$1.a(a, dgh.a)), $$3);
   }

   public static dfl b(cqa $$0, gw $$1, dfl $$2) {
      return $$2.b(dgb.C) ? $$2.a(dgb.C, Boolean.valueOf($$0.y($$1))) : $$2;
   }

   @Override
   public void a(cpx $$0, gw $$1, dfl $$2, cbw $$3) {
      if (!$$0.B) {
         if ($$3.f()) {
            b($$0, $$1, $$2, $$3);
         } else {
            a($$2, $$0, $$1, null, $$3, $$3.eS());
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cpx $$0, cbw $$1, gw $$2, dfl $$3, @Nullable dcx $$4, cjh $$5) {
      super.a($$0, $$1, $$2, csy.a.n(), $$4, $$5);
   }

   protected static void b(cpx $$0, gw $$1, dfl $$2, cbw $$3) {
      dgh $$4 = $$2.c(a);
      if ($$4 == dgh.a) {
         gw $$5 = $$1.d();
         dfl $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(a) == dgh.b) {
            dfl $$7 = $$6.u().b(eap.c) ? csy.G.n() : csy.a.n();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, csx.i($$6));
         }
      }
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(a);
   }

   @Override
   public long a(dfl $$0, gw $$1) {
      return ary.b($$1.u(), $$1.c($$0.c(a) == dgh.b ? 0 : 1).v(), $$1.w());
   }
}
