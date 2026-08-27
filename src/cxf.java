import javax.annotation.Nullable;

public class cxf extends csk {
   public static final dgf a = cwq.aC;
   public static final dgc b = dgb.w;
   public static final dgc c = dgb.o;
   public static final eii d = csx.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final eii e = csx.a(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final eii f = eif.a(d, e);
   public static final eii g = csx.a(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final eii h = eif.a(f, g);
   public static final eii i = eif.a(
      csx.a(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0), csx.a(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0), csx.a(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0), f
   );
   public static final eii j = eif.a(
      csx.a(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333), csx.a(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667), csx.a(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0), f
   );
   public static final eii k = eif.a(
      csx.a(10.666667, 10.0, 0.0, 15.0, 14.0, 16.0), csx.a(6.333333, 12.0, 0.0, 10.666667, 16.0, 16.0), csx.a(2.0, 14.0, 0.0, 6.333333, 18.0, 16.0), f
   );
   public static final eii l = eif.a(
      csx.a(0.0, 10.0, 10.666667, 16.0, 14.0, 15.0), csx.a(0.0, 12.0, 6.333333, 16.0, 16.0, 10.666667), csx.a(0.0, 14.0, 2.0, 16.0, 18.0, 6.333333), f
   );
   private static final int m = 2;

   protected cxf(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hc.c).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   public czc b_(dfl $$0) {
      return czc.c;
   }

   @Override
   public eii f(dfl $$0, cpd $$1, gw $$2) {
      return f;
   }

   @Override
   public boolean g_(dfl $$0) {
      return true;
   }

   @Override
   public dfl a(clp $$0) {
      cpx $$1 = $$0.q();
      cjh $$2 = $$0.n();
      cbw $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.B && $$3 != null && $$3.go()) {
         qy $$5 = cha.a($$2);
         if ($$5 != null && $$5.e("Book")) {
            $$4 = true;
         }
      }

      return this.n().a(a, $$0.g().g()).a(c, Boolean.valueOf($$4));
   }

   @Override
   public eii c(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return h;
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      switch ((hc)$$0.c(a)) {
         case c:
            return j;
         case d:
            return l;
         case f:
            return k;
         case e:
            return i;
         default:
            return f;
      }
   }

   @Override
   public dfl a(dfl $$0, czj $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfl a(dfl $$0, cxs $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(a, b, c);
   }

   @Override
   public dcx a(gw $$0, dfl $$1) {
      return new ddy($$0, $$1);
   }

   public static boolean a(@Nullable bis $$0, cpx $$1, gw $$2, dfl $$3, cjh $$4) {
      if (!$$3.c(c)) {
         if (!$$1.B) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable bis $$0, cpx $$1, gw $$2, dfl $$3, cjh $$4) {
      if ($$1.c_($$2) instanceof ddy $$6) {
         $$6.a($$4.a(1));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, apf.cf, apg.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable bis $$0, cpx $$1, gw $$2, dfl $$3, boolean $$4) {
      dfl $$5 = $$3.a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(djv.c, $$2, djv.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(cpx $$0, gw $$1, dfl $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(cpx $$0, gw $$1, dfl $$2, boolean $$3) {
      $$0.a($$1, $$2.a(b, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(cpx $$0, gw $$1, dfl $$2) {
      $$0.a($$1.d(), $$2.b());
   }

   @Override
   public void a(dfl $$0, aks $$1, gw $$2, ase $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, dfl $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(c)) {
            this.d($$0, $$1, $$2);
         }

         if ($$0.c(b)) {
            $$1.a($$2.d(), this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   private void d(dfl $$0, cpx $$1, gw $$2) {
      if ($$1.c_($$2) instanceof ddy $$4) {
         hc $$5 = $$0.c(a);
         cjh $$6 = $$4.c().p();
         float $$7 = 0.25F * (float)$$5.j();
         float $$8 = 0.25F * (float)$$5.l();
         byp $$9 = new byp($$1, (double)$$2.u() + 0.5 + (double)$$7, (double)($$2.v() + 1), (double)$$2.w() + 0.5 + (double)$$8, $$6);
         $$9.t();
         $$1.b($$9);
         $$4.a();
      }
   }

   @Override
   public boolean f_(dfl $$0) {
      return true;
   }

   @Override
   public int a(dfl $$0, cpd $$1, gw $$2, hc $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   public int b(dfl $$0, cpd $$1, gw $$2, hc $$3) {
      return $$3 == hc.b && $$0.c(b) ? 15 : 0;
   }

   @Override
   public boolean d_(dfl $$0) {
      return true;
   }

   @Override
   public int a(dfl $$0, cpx $$1, gw $$2) {
      if ($$0.c(c)) {
         dcx $$3 = $$1.c_($$2);
         if ($$3 instanceof ddy) {
            return ((ddy)$$3).i();
         }
      }

      return 0;
   }

   @Override
   public bha a(dfl $$0, cpx $$1, gw $$2, cbw $$3, bgz $$4, ehl $$5) {
      if ($$0.c(c)) {
         if (!$$1.B) {
            this.a($$1, $$2, $$3);
         }

         return bha.a($$1.B);
      } else {
         cjh $$6 = $$3.b($$4);
         return !$$6.b() && !$$6.a(aqc.au) ? bha.b : bha.d;
      }
   }

   @Nullable
   @Override
   public bhd b(dfl $$0, cpx $$1, gw $$2) {
      return !$$0.c(c) ? null : super.b($$0, $$1, $$2);
   }

   private void a(cpx $$0, gw $$1, cbw $$2) {
      dcx $$3 = $$0.c_($$1);
      if ($$3 instanceof ddy) {
         $$2.a((ddy)$$3);
         $$2.a(app.au);
      }
   }

   @Override
   public boolean a(dfl $$0, cpd $$1, gw $$2, ebe $$3) {
      return false;
   }
}
