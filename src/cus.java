import javax.annotation.Nullable;

public class cus extends csq {
   public static final dfy a = cwj.aC;
   public static final dfv b = dfu.u;
   public static final dgc<dfz> c = dfu.be;
   public static final dfv d = dfu.w;
   public static final dgc<dga> e = dfu.ae;
   protected static final float f = 3.0F;
   protected static final eib g = csq.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final eib h = csq.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final eib i = csq.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eib j = csq.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   private final dft k;

   protected cus(dfd.d $$0, dft $$1) {
      super($$0.a($$1.d()));
      this.k = $$1;
      this.k(this.C.b().a(a, hc.c).a(b, Boolean.valueOf(false)).a(c, dfz.a).a(d, Boolean.valueOf(false)).a(e, dga.b));
   }

   public dft a() {
      return this.k;
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      hc $$4 = $$0.c(a);
      boolean $$5 = !$$0.c(b);
      boolean $$6 = $$0.c(c) == dfz.b;
      switch ($$4) {
         case f:
         default:
            return $$5 ? j : ($$6 ? h : g);
         case d:
            return $$5 ? g : ($$6 ? j : i);
         case e:
            return $$5 ? i : ($$6 ? g : h);
         case c:
            return $$5 ? h : ($$6 ? i : j);
      }
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      dga $$6 = $$0.c(e);
      if ($$1.o() != hc.a.b || $$6 == dga.b != ($$1 == hc.b)) {
         return $$6 == dga.b && $$1 == hc.a && !$$0.a($$3, $$4) ? csr.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$2.a(this) && $$2.c(e) != $$6 ? $$0.a(a, $$2.c(a)).a(b, $$2.c(b)).a(c, $$2.c(c)).a(d, $$2.c(d)) : csr.a.n();
      }
   }

   @Override
   public void a(cpq $$0, gw $$1, dfe $$2, cbp $$3) {
      if (!$$0.B && $$3.f()) {
         cuu.b($$0, $$1, $$2, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dfe $$0, cow $$1, gw $$2, eax $$3) {
      switch ($$3) {
         case a:
            return $$0.c(b);
         case b:
            return false;
         case c:
            return $$0.c(b);
         default:
            return false;
      }
   }

   @Nullable
   @Override
   public dfe a(cli $$0) {
      gw $$1 = $$0.a();
      cpq $$2 = $$0.q();
      if ($$1.v() < $$2.aj() - 1 && $$2.a_($$1.c()).a($$0)) {
         boolean $$3 = $$2.B($$1) || $$2.B($$1.c());
         return this.n().a(a, $$0.g()).a(c, this.b($$0)).a(d, Boolean.valueOf($$3)).a(b, Boolean.valueOf($$3)).a(e, dga.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(cpq $$0, gw $$1, dfe $$2, bjb $$3, cja $$4) {
      $$0.a($$1.c(), $$2.a(e, dga.a), 3);
   }

   private dfz b(cli $$0) {
      cow $$1 = $$0.q();
      gw $$2 = $$0.a();
      hc $$3 = $$0.g();
      gw $$4 = $$2.c();
      hc $$5 = $$3.i();
      gw $$6 = $$2.a($$5);
      dfe $$7 = $$1.a_($$6);
      gw $$8 = $$4.a($$5);
      dfe $$9 = $$1.a_($$8);
      hc $$10 = $$3.h();
      gw $$11 = $$2.a($$10);
      dfe $$12 = $$1.a_($$11);
      gw $$13 = $$4.a($$10);
      dfe $$14 = $$1.a_($$13);
      int $$15 = ($$7.r($$1, $$6) ? -1 : 0) + ($$9.r($$1, $$8) ? -1 : 0) + ($$12.r($$1, $$11) ? 1 : 0) + ($$14.r($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.a(this) && $$7.c(e) == dga.b;
      boolean $$17 = $$12.a(this) && $$12.c(e) == dga.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            ehi $$20 = $$0.l();
            double $$21 = $$20.c - (double)$$2.u();
            double $$22 = $$20.e - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? dfz.a : dfz.b;
         } else {
            return dfz.a;
         }
      } else {
         return dfz.b;
      }
   }

   @Override
   public bgt a(dfe $$0, cpq $$1, gw $$2, cbp $$3, bgs $$4, ehe $$5) {
      if (!this.k.c()) {
         return bgt.d;
      } else {
         $$0 = $$0.a(b);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(b));
         $$1.a($$3, this.h($$0) ? djo.h : djo.d, $$2);
         return bgt.a($$1.B);
      }
   }

   public boolean h(dfe $$0) {
      return $$0.c(b);
   }

   public void a(@Nullable bil $$0, cpq $$1, dfe $$2, gw $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(b) != $$4) {
         $$1.a($$3, $$2.a(b, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? djo.h : djo.d, $$3);
      }
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, csq $$3, gw $$4, boolean $$5) {
      boolean $$6 = $$1.B($$2) || $$1.B($$2.a($$0.c(e) == dga.b ? hc.b : hc.a));
      if (!this.n().a($$3) && $$6 != $$0.c(d)) {
         if ($$6 != $$0.c(b)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? djo.h : djo.d, $$2);
         }

         $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)).a(b, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   public boolean a(dfe $$0, cpt $$1, gw $$2) {
      gw $$3 = $$2.d();
      dfe $$4 = $$1.a_($$3);
      return $$0.c(e) == dga.b ? $$4.d($$1, $$3, hc.b) : $$4.a(this);
   }

   private void a(@Nullable bil $$0, cpq $$1, gw $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.k.f() : this.k.e(), apa.e, 1.0F, $$1.y_().i() * 0.1F + 0.9F);
   }

   @Override
   public dfe a(dfe $$0, czc $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfe a(dfe $$0, cxl $$1) {
      return $$1 == cxl.a ? $$0 : $$0.a($$1.a($$0.c(a))).a(c);
   }

   @Override
   public long a(dfe $$0, gw $$1) {
      return ars.b($$1.u(), $$1.c($$0.c(e) == dga.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(e, a, b, c, d);
   }

   public static boolean a(cpq $$0, gw $$1) {
      return n($$0.a_($$1));
   }

   public static boolean n(dfe $$0) {
      if ($$0.b() instanceof cus $$1 && $$1.a().c()) {
         return true;
      }

      return false;
   }
}
