import javax.annotation.Nullable;

public class cwn extends csi {
   public static final dgd a = dfz.Q;
   public static final dga b = dfz.f;
   private static final eig c = csv.a(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final eig d = csv.a(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final eig e = eid.a(d, c);
   private static final eig f = eid.a(e, dds.c, ehr.e);
   private static final eig g = eid.a(f, csv.a(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final eig h = eid.a(f, csv.a(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final eig i = eid.a(f, csv.a(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final eig j = eid.a(f, csv.a(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final eig k = eid.a(f, csv.a(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final eig l = dds.c;
   private static final eig m = eid.a(dds.c, csv.a(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final eig n = eid.a(dds.c, csv.a(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final eig D = eid.a(dds.c, csv.a(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final eig E = eid.a(dds.c, csv.a(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   public cwn(dfi.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hc.a).a(b, Boolean.valueOf(true)));
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
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
   public eig a(dfj $$0, cpb $$1, gw $$2) {
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
            return dds.c;
      }
   }

   @Override
   public dfj a(cln $$0) {
      hc $$1 = $$0.k().g();
      return this.n().a(a, $$1.o() == hc.a.b ? hc.a : $$1).a(b, Boolean.valueOf(true));
   }

   @Override
   public dcv a(gw $$0, dfj $$1) {
      return new ddt($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcv> dcw<T> a(cpv $$0, dfj $$1, dcx<T> $$2) {
      return $$0.B ? null : a($$2, dcx.r, ddt::a);
   }

   @Override
   public void a(cpv $$0, gw $$1, dfj $$2, bjg $$3, cjf $$4) {
      if ($$4.A()) {
         dcv $$5 = $$0.c_($$1);
         if ($$5 instanceof ddt) {
            ((ddt)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void b(dfj $$0, cpv $$1, gw $$2, dfj $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   public bgy a(dfj $$0, cpv $$1, gw $$2, cbu $$3, bgx $$4, ehj $$5) {
      if ($$1.B) {
         return bgy.a;
      } else {
         dcv $$6 = $$1.c_($$2);
         if ($$6 instanceof ddt) {
            $$3.a((ddt)$$6);
            $$3.a(apo.ad);
         }

         return bgy.b;
      }
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, csv $$3, gw $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(cpv $$0, gw $$1, dfj $$2) {
      boolean $$3 = !$$0.B($$1);
      if ($$3 != $$2.c(b)) {
         $$0.a($$1, $$2.a(b, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, dfj $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dcv $$5 = $$1.c_($$2);
         if ($$5 instanceof ddt) {
            bgu.a($$1, $$2, (ddt)$$5);
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public cza b_(dfj $$0) {
      return cza.c;
   }

   @Override
   public boolean d_(dfj $$0) {
      return true;
   }

   @Override
   public int a(dfj $$0, cpv $$1, gw $$2) {
      return cel.a($$1.c_($$2));
   }

   @Override
   public dfj a(dfj $$0, czh $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfj a(dfj $$0, cxq $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(a, b);
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, biq $$3) {
      dcv $$4 = $$1.c_($$2);
      if ($$4 instanceof ddt) {
         ddt.a($$1, $$2, $$0, $$3, (ddt)$$4);
      }
   }

   @Override
   public boolean a(dfj $$0, cpb $$1, gw $$2, ebc $$3) {
      return false;
   }
}
