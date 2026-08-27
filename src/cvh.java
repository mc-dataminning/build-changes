public class cvh extends cwf {
   public static final dfr a = dfq.u;
   public static final dfr b = dfq.w;
   public static final dfr c = dfq.q;
   protected static final ehx d = csm.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final ehx e = csm.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
   protected static final ehx f = csm.a(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
   protected static final ehx g = csm.a(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
   protected static final ehx h = csm.a(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
   protected static final ehx i = csm.a(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
   protected static final ehx j = csm.a(0.0, 5.0, 6.0, 16.0, 24.0, 10.0);
   protected static final ehx k = csm.a(6.0, 5.0, 0.0, 10.0, 24.0, 16.0);
   protected static final ehx l = ehu.a(csm.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), csm.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0));
   protected static final ehx m = ehu.a(csm.a(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), csm.a(7.0, 5.0, 14.0, 9.0, 16.0, 16.0));
   protected static final ehx n = ehu.a(csm.a(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), csm.a(14.0, 2.0, 7.0, 16.0, 13.0, 9.0));
   protected static final ehx D = ehu.a(csm.a(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), csm.a(7.0, 2.0, 14.0, 9.0, 13.0, 16.0));
   private final dgn E;

   public cvh(dez.d $$0, dgn $$1) {
      super($$0.a($$1.d()));
      this.E = $$1;
      this.k(this.C.b().a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      if ($$0.c(c)) {
         return $$0.c(aC).o() == ha.a.a ? g : f;
      } else {
         return $$0.c(aC).o() == ha.a.a ? e : d;
      }
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      ha.a $$6 = $$1.o();
      if ($$0.c(aC).h().o() != $$6) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$7 = this.h($$2) || this.h($$3.a_($$4.a($$1.g())));
         return $$0.a(c, Boolean.valueOf($$7));
      }
   }

   @Override
   public ehx b_(dfa $$0, cos $$1, gu $$2) {
      if ($$0.c(a)) {
         return ehu.a();
      } else {
         return $$0.c(aC).o() == ha.a.c ? j : k;
      }
   }

   @Override
   public ehx c(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      if ($$0.c(a)) {
         return ehu.a();
      } else {
         return $$0.c(aC).o() == ha.a.c ? h : i;
      }
   }

   @Override
   public ehx f(dfa $$0, cos $$1, gu $$2) {
      if ($$0.c(c)) {
         return $$0.c(aC).o() == ha.a.a ? D : n;
      } else {
         return $$0.c(aC).o() == ha.a.a ? m : l;
      }
   }

   @Override
   public boolean a(dfa $$0, cos $$1, gu $$2, eat $$3) {
      switch ($$3) {
         case a:
            return $$0.c(a);
         case b:
            return false;
         case c:
            return $$0.c(a);
         default:
            return false;
      }
   }

   @Override
   public dfa a(clg $$0) {
      cpm $$1 = $$0.q();
      gu $$2 = $$0.a();
      boolean $$3 = $$1.B($$2);
      ha $$4 = $$0.g();
      ha.a $$5 = $$4.o();
      boolean $$6 = $$5 == ha.a.c && (this.h($$1.a_($$2.g())) || this.h($$1.a_($$2.h())))
         || $$5 == ha.a.a && (this.h($$1.a_($$2.e())) || this.h($$1.a_($$2.f())));
      return this.n().a(aC, $$4).a(a, Boolean.valueOf($$3)).a(b, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$6));
   }

   private boolean h(dfa $$0) {
      return $$0.a(apl.L);
   }

   @Override
   public bgq a(dfa $$0, cpm $$1, gu $$2, cbn $$3, bgp $$4, eha $$5) {
      if ($$0.c(a)) {
         $$0 = $$0.a(a, Boolean.valueOf(false));
         $$1.a($$2, $$0, 10);
      } else {
         ha $$6 = $$3.cD();
         if ($$0.c(aC) == $$6.g()) {
            $$0 = $$0.a(aC, $$6);
         }

         $$0 = $$0.a(a, Boolean.valueOf(true));
         $$1.a($$2, $$0, 10);
      }

      boolean $$7 = $$0.c(a);
      $$1.a($$3, $$2, $$7 ? this.E.g() : this.E.f(), aox.e, 1.0F, $$1.y_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$7 ? djk.h : djk.d, $$2);
      return bgq.a($$1.B);
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, csm $$3, gu $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.B($$2);
         if ($$0.c(b) != $$6) {
            $$1.a($$2, $$0.a(b, Boolean.valueOf($$6)).a(a, Boolean.valueOf($$6)), 2);
            if ($$0.c(a) != $$6) {
               $$1.a(null, $$2, $$6 ? this.E.g() : this.E.f(), aox.e, 1.0F, $$1.y_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? djk.h : djk.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(aC, a, b, c);
   }

   public static boolean a(dfa $$0, ha $$1) {
      return $$0.c(aC).o() == $$1.h().o();
   }
}
