import javax.annotation.Nullable;

public class cux extends csv {
   public static final dgd a = cwo.aC;
   public static final dga b = dfz.u;
   public static final dgh<dge> c = dfz.be;
   public static final dga d = dfz.w;
   public static final dgh<dgf> e = dfz.ae;
   protected static final float f = 3.0F;
   protected static final eig g = csv.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final eig h = csv.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final eig i = csv.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eig j = csv.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   private final dfy k;

   protected cux(dfi.d $$0, dfy $$1) {
      super($$0.a($$1.d()));
      this.k = $$1;
      this.k(this.C.b().a(a, hc.c).a(b, Boolean.valueOf(false)).a(c, dge.a).a(d, Boolean.valueOf(false)).a(e, dgf.b));
   }

   public dfy a() {
      return this.k;
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      hc $$4 = $$0.c(a);
      boolean $$5 = !$$0.c(b);
      boolean $$6 = $$0.c(c) == dge.b;
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
   public dfj a(dfj $$0, hc $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      dgf $$6 = $$0.c(e);
      if ($$1.o() != hc.a.b || $$6 == dgf.b != ($$1 == hc.b)) {
         return $$6 == dgf.b && $$1 == hc.a && !$$0.a($$3, $$4) ? csw.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$2.a(this) && $$2.c(e) != $$6 ? $$0.a(a, $$2.c(a)).a(b, $$2.c(b)).a(c, $$2.c(c)).a(d, $$2.c(d)) : csw.a.n();
      }
   }

   @Override
   public void a(cpv $$0, gw $$1, dfj $$2, cbu $$3) {
      if (!$$0.B && $$3.f()) {
         cuz.b($$0, $$1, $$2, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dfj $$0, cpb $$1, gw $$2, ebc $$3) {
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
   public dfj a(cln $$0) {
      gw $$1 = $$0.a();
      cpv $$2 = $$0.q();
      if ($$1.v() < $$2.aj() - 1 && $$2.a_($$1.c()).a($$0)) {
         boolean $$3 = $$2.B($$1) || $$2.B($$1.c());
         return this.n().a(a, $$0.g()).a(c, this.b($$0)).a(d, Boolean.valueOf($$3)).a(b, Boolean.valueOf($$3)).a(e, dgf.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(cpv $$0, gw $$1, dfj $$2, bjg $$3, cjf $$4) {
      $$0.a($$1.c(), $$2.a(e, dgf.a), 3);
   }

   private dge b(cln $$0) {
      cpb $$1 = $$0.q();
      gw $$2 = $$0.a();
      hc $$3 = $$0.g();
      gw $$4 = $$2.c();
      hc $$5 = $$3.i();
      gw $$6 = $$2.a($$5);
      dfj $$7 = $$1.a_($$6);
      gw $$8 = $$4.a($$5);
      dfj $$9 = $$1.a_($$8);
      hc $$10 = $$3.h();
      gw $$11 = $$2.a($$10);
      dfj $$12 = $$1.a_($$11);
      gw $$13 = $$4.a($$10);
      dfj $$14 = $$1.a_($$13);
      int $$15 = ($$7.r($$1, $$6) ? -1 : 0) + ($$9.r($$1, $$8) ? -1 : 0) + ($$12.r($$1, $$11) ? 1 : 0) + ($$14.r($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.a(this) && $$7.c(e) == dgf.b;
      boolean $$17 = $$12.a(this) && $$12.c(e) == dgf.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            ehn $$20 = $$0.l();
            double $$21 = $$20.c - (double)$$2.u();
            double $$22 = $$20.e - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? dge.a : dge.b;
         } else {
            return dge.a;
         }
      } else {
         return dge.b;
      }
   }

   @Override
   public bgy a(dfj $$0, cpv $$1, gw $$2, cbu $$3, bgx $$4, ehj $$5) {
      if (!this.k.c()) {
         return bgy.d;
      } else {
         $$0 = $$0.a(b);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(b));
         $$1.a($$3, this.h($$0) ? djt.h : djt.d, $$2);
         return bgy.a($$1.B);
      }
   }

   public boolean h(dfj $$0) {
      return $$0.c(b);
   }

   public void a(@Nullable biq $$0, cpv $$1, dfj $$2, gw $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(b) != $$4) {
         $$1.a($$3, $$2.a(b, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? djt.h : djt.d, $$3);
      }
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, csv $$3, gw $$4, boolean $$5) {
      boolean $$6 = $$1.B($$2) || $$1.B($$2.a($$0.c(e) == dgf.b ? hc.b : hc.a));
      if (!this.n().a($$3) && $$6 != $$0.c(d)) {
         if ($$6 != $$0.c(b)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? djt.h : djt.d, $$2);
         }

         $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)).a(b, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   public boolean a(dfj $$0, cpy $$1, gw $$2) {
      gw $$3 = $$2.d();
      dfj $$4 = $$1.a_($$3);
      return $$0.c(e) == dgf.b ? $$4.d($$1, $$3, hc.b) : $$4.a(this);
   }

   private void a(@Nullable biq $$0, cpv $$1, gw $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.k.f() : this.k.e(), apf.e, 1.0F, $$1.D_().i() * 0.1F + 0.9F);
   }

   @Override
   public dfj a(dfj $$0, czh $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfj a(dfj $$0, cxq $$1) {
      return $$1 == cxq.a ? $$0 : $$0.a($$1.a($$0.c(a))).a(c);
   }

   @Override
   public long a(dfj $$0, gw $$1) {
      return arx.b($$1.u(), $$1.c($$0.c(e) == dgf.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(e, a, b, c, d);
   }

   public static boolean a(cpv $$0, gw $$1) {
      return n($$0.a_($$1));
   }

   public static boolean n(dfj $$0) {
      if ($$0.b() instanceof cux $$1 && $$1.a().c()) {
         return true;
      }

      return false;
   }
}
