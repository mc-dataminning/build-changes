public class cvs extends cwq {
   public static final dgc a = dgb.u;
   public static final dgc b = dgb.w;
   public static final dgc c = dgb.q;
   protected static final eii d = csx.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final eii e = csx.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
   protected static final eii f = csx.a(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
   protected static final eii g = csx.a(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
   protected static final eii h = csx.a(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
   protected static final eii i = csx.a(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
   protected static final eii j = csx.a(0.0, 5.0, 6.0, 16.0, 24.0, 10.0);
   protected static final eii k = csx.a(6.0, 5.0, 0.0, 10.0, 24.0, 16.0);
   protected static final eii l = eif.a(csx.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), csx.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0));
   protected static final eii m = eif.a(csx.a(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), csx.a(7.0, 5.0, 14.0, 9.0, 16.0, 16.0));
   protected static final eii n = eif.a(csx.a(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), csx.a(14.0, 2.0, 7.0, 16.0, 13.0, 9.0));
   protected static final eii D = eif.a(csx.a(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), csx.a(7.0, 2.0, 14.0, 9.0, 13.0, 16.0));
   private final dgy E;

   public cvs(dfk.d $$0, dgy $$1) {
      super($$0.a($$1.d()));
      this.E = $$1;
      this.k(this.C.b().a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      if ($$0.c(c)) {
         return $$0.c(aC).o() == hc.a.a ? g : f;
      } else {
         return $$0.c(aC).o() == hc.a.a ? e : d;
      }
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      hc.a $$6 = $$1.o();
      if ($$0.c(aC).h().o() != $$6) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$7 = this.h($$2) || this.h($$3.a_($$4.a($$1.g())));
         return $$0.a(c, Boolean.valueOf($$7));
      }
   }

   @Override
   public eii b_(dfl $$0, cpd $$1, gw $$2) {
      if ($$0.c(a)) {
         return eif.a();
      } else {
         return $$0.c(aC).o() == hc.a.c ? j : k;
      }
   }

   @Override
   public eii c(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      if ($$0.c(a)) {
         return eif.a();
      } else {
         return $$0.c(aC).o() == hc.a.c ? h : i;
      }
   }

   @Override
   public eii f(dfl $$0, cpd $$1, gw $$2) {
      if ($$0.c(c)) {
         return $$0.c(aC).o() == hc.a.a ? D : n;
      } else {
         return $$0.c(aC).o() == hc.a.a ? m : l;
      }
   }

   @Override
   public boolean a(dfl $$0, cpd $$1, gw $$2, ebe $$3) {
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
   public dfl a(clp $$0) {
      cpx $$1 = $$0.q();
      gw $$2 = $$0.a();
      boolean $$3 = $$1.B($$2);
      hc $$4 = $$0.g();
      hc.a $$5 = $$4.o();
      boolean $$6 = $$5 == hc.a.c && (this.h($$1.a_($$2.g())) || this.h($$1.a_($$2.h())))
         || $$5 == hc.a.a && (this.h($$1.a_($$2.e())) || this.h($$1.a_($$2.f())));
      return this.n().a(aC, $$4).a(a, Boolean.valueOf($$3)).a(b, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$6));
   }

   private boolean h(dfl $$0) {
      return $$0.a(apu.L);
   }

   @Override
   public bha a(dfl $$0, cpx $$1, gw $$2, cbw $$3, bgz $$4, ehl $$5) {
      if ($$0.c(a)) {
         $$0 = $$0.a(a, Boolean.valueOf(false));
         $$1.a($$2, $$0, 10);
      } else {
         hc $$6 = $$3.cD();
         if ($$0.c(aC) == $$6.g()) {
            $$0 = $$0.a(aC, $$6);
         }

         $$0 = $$0.a(a, Boolean.valueOf(true));
         $$1.a($$2, $$0, 10);
      }

      boolean $$7 = $$0.c(a);
      $$1.a($$3, $$2, $$7 ? this.E.g() : this.E.f(), apg.e, 1.0F, $$1.D_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$7 ? djv.h : djv.d, $$2);
      return bha.a($$1.B);
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, csx $$3, gw $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.B($$2);
         if ($$0.c(b) != $$6) {
            $$1.a($$2, $$0.a(b, Boolean.valueOf($$6)).a(a, Boolean.valueOf($$6)), 2);
            if ($$0.c(a) != $$6) {
               $$1.a(null, $$2, $$6 ? this.E.g() : this.E.f(), apg.e, 1.0F, $$1.D_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? djv.h : djv.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(aC, a, b, c);
   }

   public static boolean a(dfl $$0, hc $$1) {
      return $$0.c(aC).o() == $$1.h().o();
   }
}
