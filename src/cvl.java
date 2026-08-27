public class cvl extends cwj {
   public static final dfv a = dfu.u;
   public static final dfv b = dfu.w;
   public static final dfv c = dfu.q;
   protected static final eib d = csq.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final eib e = csq.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
   protected static final eib f = csq.a(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
   protected static final eib g = csq.a(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
   protected static final eib h = csq.a(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
   protected static final eib i = csq.a(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
   protected static final eib j = csq.a(0.0, 5.0, 6.0, 16.0, 24.0, 10.0);
   protected static final eib k = csq.a(6.0, 5.0, 0.0, 10.0, 24.0, 16.0);
   protected static final eib l = ehy.a(csq.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), csq.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0));
   protected static final eib m = ehy.a(csq.a(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), csq.a(7.0, 5.0, 14.0, 9.0, 16.0, 16.0));
   protected static final eib n = ehy.a(csq.a(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), csq.a(14.0, 2.0, 7.0, 16.0, 13.0, 9.0));
   protected static final eib D = ehy.a(csq.a(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), csq.a(7.0, 2.0, 14.0, 9.0, 13.0, 16.0));
   private final dgr E;

   public cvl(dfd.d $$0, dgr $$1) {
      super($$0.a($$1.d()));
      this.E = $$1;
      this.k(this.C.b().a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      if ($$0.c(c)) {
         return $$0.c(aC).o() == hc.a.a ? g : f;
      } else {
         return $$0.c(aC).o() == hc.a.a ? e : d;
      }
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      hc.a $$6 = $$1.o();
      if ($$0.c(aC).h().o() != $$6) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$7 = this.h($$2) || this.h($$3.a_($$4.a($$1.g())));
         return $$0.a(c, Boolean.valueOf($$7));
      }
   }

   @Override
   public eib b_(dfe $$0, cow $$1, gw $$2) {
      if ($$0.c(a)) {
         return ehy.a();
      } else {
         return $$0.c(aC).o() == hc.a.c ? j : k;
      }
   }

   @Override
   public eib c(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      if ($$0.c(a)) {
         return ehy.a();
      } else {
         return $$0.c(aC).o() == hc.a.c ? h : i;
      }
   }

   @Override
   public eib f(dfe $$0, cow $$1, gw $$2) {
      if ($$0.c(c)) {
         return $$0.c(aC).o() == hc.a.a ? D : n;
      } else {
         return $$0.c(aC).o() == hc.a.a ? m : l;
      }
   }

   @Override
   public boolean a(dfe $$0, cow $$1, gw $$2, eax $$3) {
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
   public dfe a(cli $$0) {
      cpq $$1 = $$0.q();
      gw $$2 = $$0.a();
      boolean $$3 = $$1.B($$2);
      hc $$4 = $$0.g();
      hc.a $$5 = $$4.o();
      boolean $$6 = $$5 == hc.a.c && (this.h($$1.a_($$2.g())) || this.h($$1.a_($$2.h())))
         || $$5 == hc.a.a && (this.h($$1.a_($$2.e())) || this.h($$1.a_($$2.f())));
      return this.n().a(aC, $$4).a(a, Boolean.valueOf($$3)).a(b, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$6));
   }

   private boolean h(dfe $$0) {
      return $$0.a(apo.L);
   }

   @Override
   public bgt a(dfe $$0, cpq $$1, gw $$2, cbp $$3, bgs $$4, ehe $$5) {
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
      $$1.a($$3, $$2, $$7 ? this.E.g() : this.E.f(), apa.e, 1.0F, $$1.y_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$7 ? djo.h : djo.d, $$2);
      return bgt.a($$1.B);
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, csq $$3, gw $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.B($$2);
         if ($$0.c(b) != $$6) {
            $$1.a($$2, $$0.a(b, Boolean.valueOf($$6)).a(a, Boolean.valueOf($$6)), 2);
            if ($$0.c(a) != $$6) {
               $$1.a(null, $$2, $$6 ? this.E.g() : this.E.f(), apa.e, 1.0F, $$1.y_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? djo.h : djo.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(aC, a, b, c);
   }

   public static boolean a(dfe $$0, hc $$1) {
      return $$0.c(aC).o() == $$1.h().o();
   }
}
