public class cvq extends cwo {
   public static final dga a = dfz.u;
   public static final dga b = dfz.w;
   public static final dga c = dfz.q;
   protected static final eig d = csv.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final eig e = csv.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
   protected static final eig f = csv.a(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
   protected static final eig g = csv.a(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
   protected static final eig h = csv.a(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
   protected static final eig i = csv.a(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
   protected static final eig j = csv.a(0.0, 5.0, 6.0, 16.0, 24.0, 10.0);
   protected static final eig k = csv.a(6.0, 5.0, 0.0, 10.0, 24.0, 16.0);
   protected static final eig l = eid.a(csv.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), csv.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0));
   protected static final eig m = eid.a(csv.a(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), csv.a(7.0, 5.0, 14.0, 9.0, 16.0, 16.0));
   protected static final eig n = eid.a(csv.a(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), csv.a(14.0, 2.0, 7.0, 16.0, 13.0, 9.0));
   protected static final eig D = eid.a(csv.a(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), csv.a(7.0, 2.0, 14.0, 9.0, 13.0, 16.0));
   private final dgw E;

   public cvq(dfi.d $$0, dgw $$1) {
      super($$0.a($$1.d()));
      this.E = $$1;
      this.k(this.C.b().a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      if ($$0.c(c)) {
         return $$0.c(aC).o() == ha.a.a ? g : f;
      } else {
         return $$0.c(aC).o() == ha.a.a ? e : d;
      }
   }

   @Override
   public dfj a(dfj $$0, ha $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      ha.a $$6 = $$1.o();
      if ($$0.c(aC).h().o() != $$6) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$7 = this.h($$2) || this.h($$3.a_($$4.a($$1.g())));
         return $$0.a(c, Boolean.valueOf($$7));
      }
   }

   @Override
   public eig b_(dfj $$0, cpb $$1, gw $$2) {
      if ($$0.c(a)) {
         return eid.a();
      } else {
         return $$0.c(aC).o() == ha.a.c ? j : k;
      }
   }

   @Override
   public eig c(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      if ($$0.c(a)) {
         return eid.a();
      } else {
         return $$0.c(aC).o() == ha.a.c ? h : i;
      }
   }

   @Override
   public eig f(dfj $$0, cpb $$1, gw $$2) {
      if ($$0.c(c)) {
         return $$0.c(aC).o() == ha.a.a ? D : n;
      } else {
         return $$0.c(aC).o() == ha.a.a ? m : l;
      }
   }

   @Override
   public boolean a(dfj $$0, cpb $$1, gw $$2, ebc $$3) {
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
   public dfj a(cln $$0) {
      cpv $$1 = $$0.q();
      gw $$2 = $$0.a();
      boolean $$3 = $$1.B($$2);
      ha $$4 = $$0.g();
      ha.a $$5 = $$4.o();
      boolean $$6 = $$5 == ha.a.c && (this.h($$1.a_($$2.g())) || this.h($$1.a_($$2.h())))
         || $$5 == ha.a.a && (this.h($$1.a_($$2.e())) || this.h($$1.a_($$2.f())));
      return this.n().a(aC, $$4).a(a, Boolean.valueOf($$3)).a(b, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$6));
   }

   private boolean h(dfj $$0) {
      return $$0.a(aps.L);
   }

   @Override
   public bgy a(dfj $$0, cpv $$1, gw $$2, cbu $$3, bgx $$4, ehj $$5) {
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
      $$1.a($$3, $$2, $$7 ? this.E.g() : this.E.f(), ape.e, 1.0F, $$1.D_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$7 ? djt.h : djt.d, $$2);
      return bgy.a($$1.B);
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, csv $$3, gw $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.B($$2);
         if ($$0.c(b) != $$6) {
            $$1.a($$2, $$0.a(b, Boolean.valueOf($$6)).a(a, Boolean.valueOf($$6)), 2);
            if ($$0.c(a) != $$6) {
               $$1.a(null, $$2, $$6 ? this.E.g() : this.E.f(), ape.e, 1.0F, $$1.D_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? djt.h : djt.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(aC, a, b, c);
   }

   public static boolean a(dfj $$0, ha $$1) {
      return $$0.c(aC).o() == $$1.h().o();
   }
}
