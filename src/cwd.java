import javax.annotation.Nullable;

public class cwd extends cry {
   public static final dft a = dfp.Q;
   public static final dfq b = dfp.f;
   private static final ehw c = csl.a(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final ehw d = csl.a(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final ehw e = eht.a(d, c);
   private static final ehw f = eht.a(e, ddi.c, ehh.e);
   private static final ehw g = eht.a(f, csl.a(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final ehw h = eht.a(f, csl.a(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final ehw i = eht.a(f, csl.a(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final ehw j = eht.a(f, csl.a(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final ehw k = eht.a(f, csl.a(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final ehw l = ddi.c;
   private static final ehw m = eht.a(ddi.c, csl.a(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final ehw n = eht.a(ddi.c, csl.a(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final ehw D = eht.a(ddi.c, csl.a(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final ehw E = eht.a(ddi.c, csl.a(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   public cwd(dey.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, ha.a).a(b, Boolean.valueOf(true)));
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
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
   public ehw a(dez $$0, cor $$1, gu $$2) {
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
            return ddi.c;
      }
   }

   @Override
   public dez a(clf $$0) {
      ha $$1 = $$0.k().g();
      return this.n().a(a, $$1.o() == ha.a.b ? ha.a : $$1).a(b, Boolean.valueOf(true));
   }

   @Override
   public dcl a(gu $$0, dez $$1) {
      return new ddj($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcl> dcm<T> a(cpl $$0, dez $$1, dcn<T> $$2) {
      return $$0.B ? null : a($$2, dcn.r, ddj::a);
   }

   @Override
   public void a(cpl $$0, gu $$1, dez $$2, biy $$3, cix $$4) {
      if ($$4.A()) {
         dcl $$5 = $$0.c_($$1);
         if ($$5 instanceof ddj) {
            ((ddj)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void b(dez $$0, cpl $$1, gu $$2, dez $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0, 2);
      }
   }

   @Override
   public bgq a(dez $$0, cpl $$1, gu $$2, cbm $$3, bgp $$4, egz $$5) {
      if ($$1.B) {
         return bgq.a;
      } else {
         dcl $$6 = $$1.c_($$2);
         if ($$6 instanceof ddj) {
            $$3.a((ddj)$$6);
            $$3.a(apg.ad);
         }

         return bgq.b;
      }
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, csl $$3, gu $$4, boolean $$5) {
      this.a($$1, $$2, $$0, 4);
   }

   private void a(cpl $$0, gu $$1, dez $$2, int $$3) {
      boolean $$4 = !$$0.B($$1);
      if ($$4 != $$2.c(b)) {
         $$0.a($$1, $$2.a(b, Boolean.valueOf($$4)), $$3);
      }
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, dez $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dcl $$5 = $$1.c_($$2);
         if ($$5 instanceof ddj) {
            bgm.a($$1, $$2, (ddj)$$5);
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public cyq b_(dez $$0) {
      return cyq.c;
   }

   @Override
   public boolean d_(dez $$0) {
      return true;
   }

   @Override
   public int a(dez $$0, cpl $$1, gu $$2) {
      return ced.a($$1.c_($$2));
   }

   @Override
   public dez a(dez $$0, cyx $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dez a(dez $$0, cxg $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(a, b);
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, bii $$3) {
      dcl $$4 = $$1.c_($$2);
      if ($$4 instanceof ddj) {
         ddj.a($$1, $$2, $$0, $$3, (ddj)$$4);
      }
   }

   @Override
   public boolean a(dez $$0, cor $$1, gu $$2, eas $$3) {
      return false;
   }
}
