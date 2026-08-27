import javax.annotation.Nullable;

public class cwp extends csk {
   public static final dgf a = dgb.Q;
   public static final dgc b = dgb.f;
   private static final eii c = csx.a(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final eii d = csx.a(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final eii e = eif.a(d, c);
   private static final eii f = eif.a(e, ddu.c, eht.e);
   private static final eii g = eif.a(f, csx.a(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final eii h = eif.a(f, csx.a(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final eii i = eif.a(f, csx.a(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final eii j = eif.a(f, csx.a(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final eii k = eif.a(f, csx.a(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final eii l = ddu.c;
   private static final eii m = eif.a(ddu.c, csx.a(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final eii n = eif.a(ddu.c, csx.a(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final eii D = eif.a(ddu.c, csx.a(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final eii E = eif.a(ddu.c, csx.a(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   public cwp(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hc.a).a(b, Boolean.valueOf(true)));
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      switch ((hc)$$0.c(a)) {
         case a:
            return g;
         case c:
            return i;
         case d:
            return j;
         case e:
            return k;
         case f:
            return h;
         default:
            return f;
      }
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2) {
      switch ((hc)$$0.c(a)) {
         case a:
            return l;
         case c:
            return n;
         case d:
            return D;
         case e:
            return E;
         case f:
            return m;
         default:
            return ddu.c;
      }
   }

   @Override
   public dfl a(clp $$0) {
      hc $$1 = $$0.k().g();
      return this.n().a(a, $$1.o() == hc.a.b ? hc.a : $$1).a(b, Boolean.valueOf(true));
   }

   @Override
   public dcx a(gw $$0, dfl $$1) {
      return new ddv($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcx> dcy<T> a(cpx $$0, dfl $$1, dcz<T> $$2) {
      return $$0.B ? null : a($$2, dcz.r, ddv::a);
   }

   @Override
   public void a(cpx $$0, gw $$1, dfl $$2, bji $$3, cjh $$4) {
      if ($$4.A()) {
         dcx $$5 = $$0.c_($$1);
         if ($$5 instanceof ddv) {
            ((ddv)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void b(dfl $$0, cpx $$1, gw $$2, dfl $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   public bha a(dfl $$0, cpx $$1, gw $$2, cbw $$3, bgz $$4, ehl $$5) {
      if ($$1.B) {
         return bha.a;
      } else {
         dcx $$6 = $$1.c_($$2);
         if ($$6 instanceof ddv) {
            $$3.a((ddv)$$6);
            $$3.a(app.ad);
         }

         return bha.b;
      }
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, csx $$3, gw $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(cpx $$0, gw $$1, dfl $$2) {
      boolean $$3 = !$$0.B($$1);
      if ($$3 != $$2.c(b)) {
         $$0.a($$1, $$2.a(b, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, dfl $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dcx $$5 = $$1.c_($$2);
         if ($$5 instanceof ddv) {
            bgw.a($$1, $$2, (ddv)$$5);
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public czc b_(dfl $$0) {
      return czc.c;
   }

   @Override
   public boolean d_(dfl $$0) {
      return true;
   }

   @Override
   public int a(dfl $$0, cpx $$1, gw $$2) {
      return cen.a($$1.c_($$2));
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
      $$0.a(a, b);
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, bis $$3) {
      dcx $$4 = $$1.c_($$2);
      if ($$4 instanceof ddv) {
         ddv.a($$1, $$2, $$0, $$3, (ddv)$$4);
      }
   }

   @Override
   public boolean a(dfl $$0, cpd $$1, gw $$2, ebe $$3) {
      return false;
   }
}
