import javax.annotation.Nullable;

public class cwe extends crz {
   public static final dfu a = dfq.Q;
   public static final dfr b = dfq.f;
   private static final ehx c = csm.a(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final ehx d = csm.a(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final ehx e = ehu.a(d, c);
   private static final ehx f = ehu.a(e, ddj.c, ehi.e);
   private static final ehx g = ehu.a(f, csm.a(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final ehx h = ehu.a(f, csm.a(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final ehx i = ehu.a(f, csm.a(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final ehx j = ehu.a(f, csm.a(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final ehx k = ehu.a(f, csm.a(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final ehx l = ddj.c;
   private static final ehx m = ehu.a(ddj.c, csm.a(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final ehx n = ehu.a(ddj.c, csm.a(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final ehx D = ehu.a(ddj.c, csm.a(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final ehx E = ehu.a(ddj.c, csm.a(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   public cwe(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, ha.a).a(b, Boolean.valueOf(true)));
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      switch ((ha)$$0.c(a)) {
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
   public ehx a(dfa $$0, cos $$1, gu $$2) {
      switch ((ha)$$0.c(a)) {
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
            return ddj.c;
      }
   }

   @Override
   public dfa a(clg $$0) {
      ha $$1 = $$0.k().g();
      return this.n().a(a, $$1.o() == ha.a.b ? ha.a : $$1).a(b, Boolean.valueOf(true));
   }

   @Override
   public dcm a(gu $$0, dfa $$1) {
      return new ddk($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcm> dcn<T> a(cpm $$0, dfa $$1, dco<T> $$2) {
      return $$0.B ? null : a($$2, dco.r, ddk::a);
   }

   @Override
   public void a(cpm $$0, gu $$1, dfa $$2, biy $$3, ciy $$4) {
      if ($$4.A()) {
         dcm $$5 = $$0.c_($$1);
         if ($$5 instanceof ddk) {
            ((ddk)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void b(dfa $$0, cpm $$1, gu $$2, dfa $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0, 2);
      }
   }

   @Override
   public bgq a(dfa $$0, cpm $$1, gu $$2, cbn $$3, bgp $$4, eha $$5) {
      if ($$1.B) {
         return bgq.a;
      } else {
         dcm $$6 = $$1.c_($$2);
         if ($$6 instanceof ddk) {
            $$3.a((ddk)$$6);
            $$3.a(apg.ad);
         }

         return bgq.b;
      }
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, csm $$3, gu $$4, boolean $$5) {
      this.a($$1, $$2, $$0, 4);
   }

   private void a(cpm $$0, gu $$1, dfa $$2, int $$3) {
      boolean $$4 = !$$0.B($$1);
      if ($$4 != $$2.c(b)) {
         $$0.a($$1, $$2.a(b, Boolean.valueOf($$4)), $$3);
      }
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, dfa $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dcm $$5 = $$1.c_($$2);
         if ($$5 instanceof ddk) {
            bgm.a($$1, $$2, (ddk)$$5);
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public cyr b_(dfa $$0) {
      return cyr.c;
   }

   @Override
   public boolean d_(dfa $$0) {
      return true;
   }

   @Override
   public int a(dfa $$0, cpm $$1, gu $$2) {
      return cee.a($$1.c_($$2));
   }

   @Override
   public dfa a(dfa $$0, cyy $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfa a(dfa $$0, cxh $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(a, b);
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, bii $$3) {
      dcm $$4 = $$1.c_($$2);
      if ($$4 instanceof ddk) {
         ddk.a($$1, $$2, $$0, $$3, (ddk)$$4);
      }
   }

   @Override
   public boolean a(dfa $$0, cos $$1, gu $$2, eat $$3) {
      return false;
   }
}
