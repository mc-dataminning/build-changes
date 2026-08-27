import javax.annotation.Nullable;

public class csi extends crz {
   public static final dfu a = cwf.aC;
   public static final dfy<dfo> b = dfq.V;
   public static final dfr c = dfq.w;
   private static final ehx e = csm.a(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
   private static final ehx f = csm.a(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   private static final ehx g = csm.a(5.0, 6.0, 5.0, 11.0, 13.0, 11.0);
   private static final ehx h = csm.a(4.0, 4.0, 4.0, 12.0, 6.0, 12.0);
   private static final ehx i = ehu.a(h, g);
   private static final ehx j = ehu.a(i, csm.a(7.0, 13.0, 0.0, 9.0, 15.0, 16.0));
   private static final ehx k = ehu.a(i, csm.a(0.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final ehx l = ehu.a(i, csm.a(0.0, 13.0, 7.0, 13.0, 15.0, 9.0));
   private static final ehx m = ehu.a(i, csm.a(3.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final ehx n = ehu.a(i, csm.a(7.0, 13.0, 0.0, 9.0, 15.0, 13.0));
   private static final ehx D = ehu.a(i, csm.a(7.0, 13.0, 3.0, 9.0, 15.0, 16.0));
   private static final ehx E = ehu.a(i, csm.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0));
   public static final int d = 1;

   public csi(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, ha.c).a(b, dfo.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, csm $$3, gu $$4, boolean $$5) {
      boolean $$6 = $$1.B($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   public void a(cpm $$0, dfa $$1, eha $$2, ccf $$3) {
      bii $$4 = $$3.v();
      cbn $$5 = $$4 instanceof cbn ? (cbn)$$4 : null;
      this.a($$0, $$1, $$2, $$5, true);
   }

   @Override
   public bgq a(dfa $$0, cpm $$1, gu $$2, cbn $$3, bgp $$4, eha $$5) {
      return this.a($$1, $$0, $$5, $$3, true) ? bgq.a($$1.B) : bgq.d;
   }

   public boolean a(cpm $$0, dfa $$1, eha $$2, @Nullable cbn $$3, boolean $$4) {
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

   private boolean a(dfa $$0, ha $$1, double $$2) {
      if ($$1.o() != ha.a.b && !($$2 > 0.8124F)) {
         ha $$3 = $$0.c(a);
         dfo $$4 = $$0.c(b);
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

   public boolean a(cpm $$0, gu $$1, @Nullable ha $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable bii $$0, cpm $$1, gu $$2, @Nullable ha $$3) {
      dcm $$4 = $$1.c_($$2);
      if (!$$1.B && $$4 instanceof dck) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(a);
         }

         ((dck)$$4).a($$3);
         $$1.a(null, $$2, aow.bK, aox.e, 2.0F, 1.0F);
         $$1.a($$0, djk.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private ehx h(dfa $$0) {
      ha $$1 = $$0.c(a);
      dfo $$2 = $$0.c(b);
      if ($$2 == dfo.a) {
         return $$1 != ha.c && $$1 != ha.d ? f : e;
      } else if ($$2 == dfo.b) {
         return E;
      } else if ($$2 == dfo.d) {
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
   public ehx c(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return this.h($$0);
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return this.h($$0);
   }

   @Override
   public cyr b_(dfa $$0) {
      return cyr.c;
   }

   @Nullable
   @Override
   public dfa a(clg $$0) {
      ha $$1 = $$0.k();
      gu $$2 = $$0.a();
      cpm $$3 = $$0.q();
      ha.a $$4 = $$1.o();
      if ($$4 == ha.a.b) {
         dfa $$5 = this.n().a(b, $$1 == ha.a ? dfo.b : dfo.a).a(a, $$0.g());
         if ($$5.a((cpp)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == ha.a.a && $$3.a_($$2.g()).d($$3, $$2.g(), ha.f) && $$3.a_($$2.h()).d($$3, $$2.h(), ha.e)
            || $$4 == ha.a.c && $$3.a_($$2.e()).d($$3, $$2.e(), ha.d) && $$3.a_($$2.f()).d($$3, $$2.f(), ha.c);
         dfa $$7 = this.n().a(a, $$1.g()).a(b, $$6 ? dfo.d : dfo.c);
         if ($$7.a((cpp)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.d()).d($$3, $$2.d(), ha.b);
         $$7 = $$7.a(b, $$8 ? dfo.a : dfo.b);
         if ($$7.a((cpp)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      dfo $$6 = $$0.c(b);
      ha $$7 = n($$0).g();
      if ($$7 == $$1 && !$$0.a($$3, $$4) && $$6 != dfo.d) {
         return csn.a.n();
      } else {
         if ($$1.o() == $$0.c(a).o()) {
            if ($$6 == dfo.d && !$$2.d($$3, $$5, $$1)) {
               return $$0.a(b, dfo.c).a(a, $$1.g());
            }

            if ($$6 == dfo.c && $$7.g() == $$1 && $$2.d($$3, $$5, $$0.c(a))) {
               return $$0.a(b, dfo.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean a(dfa $$0, cpp $$1, gu $$2) {
      ha $$3 = n($$0).g();
      return $$3 == ha.b ? csm.a($$1, $$2.c(), ha.a) : cvc.b($$1, $$2, $$3);
   }

   private static ha n(dfa $$0) {
      switch ((dfo)$$0.c(b)) {
         case a:
            return ha.b;
         case b:
            return ha.a;
         default:
            return $$0.c(a).g();
      }
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(a, b, c);
   }

   @Nullable
   @Override
   public dcm a(gu $$0, dfa $$1) {
      return new dck($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcm> dcn<T> a(cpm $$0, dfa $$1, dco<T> $$2) {
      return a($$2, dco.E, $$0.B ? dck::a : dck::b);
   }

   @Override
   public boolean a(dfa $$0, cos $$1, gu $$2, eat $$3) {
      return false;
   }
}
