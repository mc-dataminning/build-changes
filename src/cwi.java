import javax.annotation.Nullable;

public class cwi extends csd {
   public static final dfy a = dfu.Q;
   public static final dfv b = dfu.f;
   private static final eib c = csq.a(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final eib d = csq.a(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final eib e = ehy.a(d, c);
   private static final eib f = ehy.a(e, ddn.c, ehm.e);
   private static final eib g = ehy.a(f, csq.a(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final eib h = ehy.a(f, csq.a(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final eib i = ehy.a(f, csq.a(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final eib j = ehy.a(f, csq.a(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final eib k = ehy.a(f, csq.a(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final eib l = ddn.c;
   private static final eib m = ehy.a(ddn.c, csq.a(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final eib n = ehy.a(ddn.c, csq.a(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final eib D = ehy.a(ddn.c, csq.a(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final eib E = ehy.a(ddn.c, csq.a(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   public cwi(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hc.a).a(b, Boolean.valueOf(true)));
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
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
   public eib a(dfe $$0, cow $$1, gw $$2) {
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
            return ddn.c;
      }
   }

   @Override
   public dfe a(cli $$0) {
      hc $$1 = $$0.k().g();
      return this.n().a(a, $$1.o() == hc.a.b ? hc.a : $$1).a(b, Boolean.valueOf(true));
   }

   @Override
   public dcq a(gw $$0, dfe $$1) {
      return new ddo($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcq> dcr<T> a(cpq $$0, dfe $$1, dcs<T> $$2) {
      return $$0.B ? null : a($$2, dcs.r, ddo::a);
   }

   @Override
   public void a(cpq $$0, gw $$1, dfe $$2, bjb $$3, cja $$4) {
      if ($$4.A()) {
         dcq $$5 = $$0.c_($$1);
         if ($$5 instanceof ddo) {
            ((ddo)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void b(dfe $$0, cpq $$1, gw $$2, dfe $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0, 2);
      }
   }

   @Override
   public bgt a(dfe $$0, cpq $$1, gw $$2, cbp $$3, bgs $$4, ehe $$5) {
      if ($$1.B) {
         return bgt.a;
      } else {
         dcq $$6 = $$1.c_($$2);
         if ($$6 instanceof ddo) {
            $$3.a((ddo)$$6);
            $$3.a(apj.ad);
         }

         return bgt.b;
      }
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, csq $$3, gw $$4, boolean $$5) {
      this.a($$1, $$2, $$0, 4);
   }

   private void a(cpq $$0, gw $$1, dfe $$2, int $$3) {
      boolean $$4 = !$$0.B($$1);
      if ($$4 != $$2.c(b)) {
         $$0.a($$1, $$2.a(b, Boolean.valueOf($$4)), $$3);
      }
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, dfe $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dcq $$5 = $$1.c_($$2);
         if ($$5 instanceof ddo) {
            bgp.a($$1, $$2, (ddo)$$5);
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public cyv b_(dfe $$0) {
      return cyv.c;
   }

   @Override
   public boolean d_(dfe $$0) {
      return true;
   }

   @Override
   public int a(dfe $$0, cpq $$1, gw $$2) {
      return ceg.a($$1.c_($$2));
   }

   @Override
   public dfe a(dfe $$0, czc $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfe a(dfe $$0, cxl $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(a, b);
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, bil $$3) {
      dcq $$4 = $$1.c_($$2);
      if ($$4 instanceof ddo) {
         ddo.a($$1, $$2, $$0, $$3, (ddo)$$4);
      }
   }

   @Override
   public boolean a(dfe $$0, cow $$1, gw $$2, eax $$3) {
      return false;
   }
}
