import javax.annotation.Nullable;

public class cwc extends crx {
   public static final dfs a = dfo.Q;
   public static final dfp b = dfo.f;
   private static final ehy c = csk.a(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final ehy d = csk.a(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final ehy e = ehv.a(d, c);
   private static final ehy f = ehv.a(e, ddh.c, ehj.e);
   private static final ehy g = ehv.a(f, csk.a(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final ehy h = ehv.a(f, csk.a(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final ehy i = ehv.a(f, csk.a(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final ehy j = ehv.a(f, csk.a(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final ehy k = ehv.a(f, csk.a(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final ehy l = ddh.c;
   private static final ehy m = ehv.a(ddh.c, csk.a(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final ehy n = ehv.a(ddh.c, csk.a(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final ehy D = ehv.a(ddh.c, csk.a(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final ehy E = ehv.a(ddh.c, csk.a(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   public cwc(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hb.a).a(b, Boolean.valueOf(true)));
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      switch ((hb)$$0.c(a)) {
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
   public ehy a(dey $$0, coq $$1, gv $$2) {
      switch ((hb)$$0.c(a)) {
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
            return ddh.c;
      }
   }

   @Override
   public dey a(cle $$0) {
      hb $$1 = $$0.k().g();
      return this.n().a(a, $$1.o() == hb.a.b ? hb.a : $$1).a(b, Boolean.valueOf(true));
   }

   @Override
   public dck a(gv $$0, dey $$1) {
      return new ddi($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dck> dcl<T> a(cpk $$0, dey $$1, dcm<T> $$2) {
      return $$0.B ? null : a($$2, dcm.r, ddi::a);
   }

   @Override
   public void a(cpk $$0, gv $$1, dey $$2, biw $$3, ciw $$4) {
      if ($$4.A()) {
         dck $$5 = $$0.c_($$1);
         if ($$5 instanceof ddi) {
            ((ddi)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void b(dey $$0, cpk $$1, gv $$2, dey $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0, 2);
      }
   }

   @Override
   public bgo a(dey $$0, cpk $$1, gv $$2, cbl $$3, bgn $$4, ehb $$5) {
      if ($$1.B) {
         return bgo.a;
      } else {
         dck $$6 = $$1.c_($$2);
         if ($$6 instanceof ddi) {
            $$3.a((ddi)$$6);
            $$3.a(ape.ad);
         }

         return bgo.b;
      }
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, csk $$3, gv $$4, boolean $$5) {
      this.a($$1, $$2, $$0, 4);
   }

   private void a(cpk $$0, gv $$1, dey $$2, int $$3) {
      boolean $$4 = !$$0.B($$1);
      if ($$4 != $$2.c(b)) {
         $$0.a($$1, $$2.a(b, Boolean.valueOf($$4)), $$3);
      }
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, dey $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dck $$5 = $$1.c_($$2);
         if ($$5 instanceof ddi) {
            bgk.a($$1, $$2, (ddi)$$5);
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public cyp b_(dey $$0) {
      return cyp.c;
   }

   @Override
   public boolean d_(dey $$0) {
      return true;
   }

   @Override
   public int a(dey $$0, cpk $$1, gv $$2) {
      return cec.a($$1.c_($$2));
   }

   @Override
   public dey a(dey $$0, cyw $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dey a(dey $$0, cxf $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(a, b);
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, big $$3) {
      dck $$4 = $$1.c_($$2);
      if ($$4 instanceof ddi) {
         ddi.a($$1, $$2, $$0, $$3, (ddi)$$4);
      }
   }

   @Override
   public boolean a(dey $$0, coq $$1, gv $$2, ear $$3) {
      return false;
   }
}
