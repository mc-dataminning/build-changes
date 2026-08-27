import javax.annotation.Nullable;

public class csh extends cry {
   public static final dft a = cwe.aC;
   public static final dfx<dfn> b = dfp.V;
   public static final dfq c = dfp.w;
   private static final ehw e = csl.a(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
   private static final ehw f = csl.a(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   private static final ehw g = csl.a(5.0, 6.0, 5.0, 11.0, 13.0, 11.0);
   private static final ehw h = csl.a(4.0, 4.0, 4.0, 12.0, 6.0, 12.0);
   private static final ehw i = eht.a(h, g);
   private static final ehw j = eht.a(i, csl.a(7.0, 13.0, 0.0, 9.0, 15.0, 16.0));
   private static final ehw k = eht.a(i, csl.a(0.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final ehw l = eht.a(i, csl.a(0.0, 13.0, 7.0, 13.0, 15.0, 9.0));
   private static final ehw m = eht.a(i, csl.a(3.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final ehw n = eht.a(i, csl.a(7.0, 13.0, 0.0, 9.0, 15.0, 13.0));
   private static final ehw D = eht.a(i, csl.a(7.0, 13.0, 3.0, 9.0, 15.0, 16.0));
   private static final ehw E = eht.a(i, csl.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0));
   public static final int d = 1;

   public csh(dey.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, ha.c).a(b, dfn.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, csl $$3, gu $$4, boolean $$5) {
      boolean $$6 = $$1.B($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   public void a(cpl $$0, dez $$1, egz $$2, cce $$3) {
      bii $$4 = $$3.v();
      cbm $$5 = $$4 instanceof cbm ? (cbm)$$4 : null;
      this.a($$0, $$1, $$2, $$5, true);
   }

   @Override
   public bgq a(dez $$0, cpl $$1, gu $$2, cbm $$3, bgp $$4, egz $$5) {
      return this.a($$1, $$0, $$5, $$3, true) ? bgq.a($$1.B) : bgq.d;
   }

   public boolean a(cpl $$0, dez $$1, egz $$2, @Nullable cbm $$3, boolean $$4) {
      ha $$5 = $$2.b();
      gu $$6 = $$2.a();
      boolean $$7 = !$$4 || this.a($$1, $$5, $$2.e().d - (double)$$6.v());
      if ($$7) {
         boolean $$8 = this.a($$3, $$0, $$6, $$5);
         if ($$8 && $$3 != null) {
            $$3.a(apg.az);
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dez $$0, ha $$1, double $$2) {
      if ($$1.o() != ha.a.b && !($$2 > 0.8124F)) {
         ha $$3 = $$0.c(a);
         dfn $$4 = $$0.c(b);
         switch ($$4) {
            case a:
               return $$3.o() == $$1.o();
            case c:
            case d:
               return $$3.o() != $$1.o();
            case b:
               return true;
            default:
               return false;
         }
      } else {
         return false;
      }
   }

   public boolean a(cpl $$0, gu $$1, @Nullable ha $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable bii $$0, cpl $$1, gu $$2, @Nullable ha $$3) {
      dcl $$4 = $$1.c_($$2);
      if (!$$1.B && $$4 instanceof dcj) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(a);
         }

         ((dcj)$$4).a($$3);
         $$1.a(null, $$2, aow.bK, aox.e, 2.0F, 1.0F);
         $$1.a($$0, djj.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private ehw h(dez $$0) {
      ha $$1 = $$0.c(a);
      dfn $$2 = $$0.c(b);
      if ($$2 == dfn.a) {
         return $$1 != ha.c && $$1 != ha.d ? f : e;
      } else if ($$2 == dfn.b) {
         return E;
      } else if ($$2 == dfn.d) {
         return $$1 != ha.c && $$1 != ha.d ? k : j;
      } else if ($$1 == ha.c) {
         return n;
      } else if ($$1 == ha.d) {
         return D;
      } else {
         return $$1 == ha.f ? m : l;
      }
   }

   @Override
   public ehw c(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return this.h($$0);
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return this.h($$0);
   }

   @Override
   public cyq b_(dez $$0) {
      return cyq.c;
   }

   @Nullable
   @Override
   public dez a(clf $$0) {
      ha $$1 = $$0.k();
      gu $$2 = $$0.a();
      cpl $$3 = $$0.q();
      ha.a $$4 = $$1.o();
      if ($$4 == ha.a.b) {
         dez $$5 = this.n().a(b, $$1 == ha.a ? dfn.b : dfn.a).a(a, $$0.g());
         if ($$5.a((cpo)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == ha.a.a && $$3.a_($$2.g()).d($$3, $$2.g(), ha.f) && $$3.a_($$2.h()).d($$3, $$2.h(), ha.e)
            || $$4 == ha.a.c && $$3.a_($$2.e()).d($$3, $$2.e(), ha.d) && $$3.a_($$2.f()).d($$3, $$2.f(), ha.c);
         dez $$7 = this.n().a(a, $$1.g()).a(b, $$6 ? dfn.d : dfn.c);
         if ($$7.a((cpo)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.d()).d($$3, $$2.d(), ha.b);
         $$7 = $$7.a(b, $$8 ? dfn.a : dfn.b);
         if ($$7.a((cpo)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      dfn $$6 = $$0.c(b);
      ha $$7 = n($$0).g();
      if ($$7 == $$1 && !$$0.a($$3, $$4) && $$6 != dfn.d) {
         return csm.a.n();
      } else {
         if ($$1.o() == $$0.c(a).o()) {
            if ($$6 == dfn.d && !$$2.d($$3, $$5, $$1)) {
               return $$0.a(b, dfn.c).a(a, $$1.g());
            }

            if ($$6 == dfn.c && $$7.g() == $$1 && $$2.d($$3, $$5, $$0.c(a))) {
               return $$0.a(b, dfn.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean a(dez $$0, cpo $$1, gu $$2) {
      ha $$3 = n($$0).g();
      return $$3 == ha.b ? csl.a($$1, $$2.c(), ha.a) : cvb.b($$1, $$2, $$3);
   }

   private static ha n(dez $$0) {
      switch ((dfn)$$0.c(b)) {
         case a:
            return ha.b;
         case b:
            return ha.a;
         default:
            return $$0.c(a).g();
      }
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(a, b, c);
   }

   @Nullable
   @Override
   public dcl a(gu $$0, dez $$1) {
      return new dcj($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcl> dcm<T> a(cpl $$0, dez $$1, dcn<T> $$2) {
      return a($$2, dcn.E, $$0.B ? dcj::a : dcj::b);
   }

   @Override
   public boolean a(dez $$0, cor $$1, gu $$2, eas $$3) {
      return false;
   }
}
