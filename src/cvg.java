public class cvg extends cwe {
   public static final dfq a = dfp.u;
   public static final dfq b = dfp.w;
   public static final dfq c = dfp.q;
   protected static final ehw d = csl.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final ehw e = csl.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
   protected static final ehw f = csl.a(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
   protected static final ehw g = csl.a(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
   protected static final ehw h = csl.a(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
   protected static final ehw i = csl.a(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
   protected static final ehw j = csl.a(0.0, 5.0, 6.0, 16.0, 24.0, 10.0);
   protected static final ehw k = csl.a(6.0, 5.0, 0.0, 10.0, 24.0, 16.0);
   protected static final ehw l = eht.a(csl.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), csl.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0));
   protected static final ehw m = eht.a(csl.a(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), csl.a(7.0, 5.0, 14.0, 9.0, 16.0, 16.0));
   protected static final ehw n = eht.a(csl.a(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), csl.a(14.0, 2.0, 7.0, 16.0, 13.0, 9.0));
   protected static final ehw D = eht.a(csl.a(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), csl.a(7.0, 2.0, 14.0, 9.0, 13.0, 16.0));
   private final dgm E;

   public cvg(dey.d $$0, dgm $$1) {
      super($$0.a($$1.d()));
      this.E = $$1;
      this.k(this.C.b().a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      if ($$0.c(c)) {
         return $$0.c(aC).o() == ha.a.a ? g : f;
      } else {
         return $$0.c(aC).o() == ha.a.a ? e : d;
      }
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      ha.a $$6 = $$1.o();
      if ($$0.c(aC).h().o() != $$6) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$7 = this.h($$2) || this.h($$3.a_($$4.a($$1.g())));
         return $$0.a(c, Boolean.valueOf($$7));
      }
   }

   @Override
   public ehw b_(dez $$0, cor $$1, gu $$2) {
      if ($$0.c(a)) {
         return eht.a();
      } else {
         return $$0.c(aC).o() == ha.a.c ? j : k;
      }
   }

   @Override
   public ehw c(dez $$0, cor $$1, gu $$2, ehi $$3) {
      if ($$0.c(a)) {
         return eht.a();
      } else {
         return $$0.c(aC).o() == ha.a.c ? h : i;
      }
   }

   @Override
   public ehw f(dez $$0, cor $$1, gu $$2) {
      if ($$0.c(c)) {
         return $$0.c(aC).o() == ha.a.a ? D : n;
      } else {
         return $$0.c(aC).o() == ha.a.a ? m : l;
      }
   }

   @Override
   public boolean a(dez $$0, cor $$1, gu $$2, eas $$3) {
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
   public dez a(clf $$0) {
      cpl $$1 = $$0.q();
      gu $$2 = $$0.a();
      boolean $$3 = $$1.B($$2);
      ha $$4 = $$0.g();
      ha.a $$5 = $$4.o();
      boolean $$6 = $$5 == ha.a.c && (this.h($$1.a_($$2.g())) || this.h($$1.a_($$2.h())))
         || $$5 == ha.a.a && (this.h($$1.a_($$2.e())) || this.h($$1.a_($$2.f())));
      return this.n().a(aC, $$4).a(a, Boolean.valueOf($$3)).a(b, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$6));
   }

   private boolean h(dez $$0) {
      return $$0.a(apl.L);
   }

   @Override
   public bgq a(dez $$0, cpl $$1, gu $$2, cbm $$3, bgp $$4, egz $$5) {
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
      $$1.a($$3, $$7 ? djj.h : djj.d, $$2);
      return bgq.a($$1.B);
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, csl $$3, gu $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.B($$2);
         if ($$0.c(b) != $$6) {
            $$1.a($$2, $$0.a(b, Boolean.valueOf($$6)).a(a, Boolean.valueOf($$6)), 2);
            if ($$0.c(a) != $$6) {
               $$1.a(null, $$2, $$6 ? this.E.g() : this.E.f(), aox.e, 1.0F, $$1.y_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? djj.h : djj.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(aC, a, b, c);
   }

   public static boolean a(dez $$0, ha $$1) {
      return $$0.c(aC).o() == $$1.h().o();
   }
}
