import javax.annotation.Nullable;

public class cuz extends csx {
   public static final dgf a = cwq.aC;
   public static final dgc b = dgb.u;
   public static final dgj<dgg> c = dgb.be;
   public static final dgc d = dgb.w;
   public static final dgj<dgh> e = dgb.ae;
   protected static final float f = 3.0F;
   protected static final eii g = csx.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final eii h = csx.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final eii i = csx.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eii j = csx.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   private final dga k;

   protected cuz(dfk.d $$0, dga $$1) {
      super($$0.a($$1.d()));
      this.k = $$1;
      this.k(this.C.b().a(a, hc.c).a(b, Boolean.valueOf(false)).a(c, dgg.a).a(d, Boolean.valueOf(false)).a(e, dgh.b));
   }

   public dga a() {
      return this.k;
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      hc $$4 = $$0.c(a);
      boolean $$5 = !$$0.c(b);
      boolean $$6 = $$0.c(c) == dgg.b;
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
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      dgh $$6 = $$0.c(e);
      if ($$1.o() != hc.a.b || $$6 == dgh.b != ($$1 == hc.b)) {
         return $$6 == dgh.b && $$1 == hc.a && !$$0.a($$3, $$4) ? csy.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$2.a(this) && $$2.c(e) != $$6 ? $$0.a(a, $$2.c(a)).a(b, $$2.c(b)).a(c, $$2.c(c)).a(d, $$2.c(d)) : csy.a.n();
      }
   }

   @Override
   public void a(cpx $$0, gw $$1, dfl $$2, cbw $$3) {
      if (!$$0.B && $$3.f()) {
         cvb.b($$0, $$1, $$2, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dfl $$0, cpd $$1, gw $$2, ebe $$3) {
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
   public dfl a(clp $$0) {
      gw $$1 = $$0.a();
      cpx $$2 = $$0.q();
      if ($$1.v() < $$2.aj() - 1 && $$2.a_($$1.c()).a($$0)) {
         boolean $$3 = $$2.B($$1) || $$2.B($$1.c());
         return this.n().a(a, $$0.g()).a(c, this.b($$0)).a(d, Boolean.valueOf($$3)).a(b, Boolean.valueOf($$3)).a(e, dgh.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(cpx $$0, gw $$1, dfl $$2, bji $$3, cjh $$4) {
      $$0.a($$1.c(), $$2.a(e, dgh.a), 3);
   }

   private dgg b(clp $$0) {
      cpd $$1 = $$0.q();
      gw $$2 = $$0.a();
      hc $$3 = $$0.g();
      gw $$4 = $$2.c();
      hc $$5 = $$3.i();
      gw $$6 = $$2.a($$5);
      dfl $$7 = $$1.a_($$6);
      gw $$8 = $$4.a($$5);
      dfl $$9 = $$1.a_($$8);
      hc $$10 = $$3.h();
      gw $$11 = $$2.a($$10);
      dfl $$12 = $$1.a_($$11);
      gw $$13 = $$4.a($$10);
      dfl $$14 = $$1.a_($$13);
      int $$15 = ($$7.r($$1, $$6) ? -1 : 0) + ($$9.r($$1, $$8) ? -1 : 0) + ($$12.r($$1, $$11) ? 1 : 0) + ($$14.r($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.a(this) && $$7.c(e) == dgh.b;
      boolean $$17 = $$12.a(this) && $$12.c(e) == dgh.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            ehp $$20 = $$0.l();
            double $$21 = $$20.c - (double)$$2.u();
            double $$22 = $$20.e - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? dgg.a : dgg.b;
         } else {
            return dgg.a;
         }
      } else {
         return dgg.b;
      }
   }

   @Override
   public bha a(dfl $$0, cpx $$1, gw $$2, cbw $$3, bgz $$4, ehl $$5) {
      if (!this.k.c()) {
         return bha.d;
      } else {
         $$0 = $$0.a(b);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(b));
         $$1.a($$3, this.h($$0) ? djv.h : djv.d, $$2);
         return bha.a($$1.B);
      }
   }

   public boolean h(dfl $$0) {
      return $$0.c(b);
   }

   public void a(@Nullable bis $$0, cpx $$1, dfl $$2, gw $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(b) != $$4) {
         $$1.a($$3, $$2.a(b, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? djv.h : djv.d, $$3);
      }
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, csx $$3, gw $$4, boolean $$5) {
      boolean $$6 = $$1.B($$2) || $$1.B($$2.a($$0.c(e) == dgh.b ? hc.b : hc.a));
      if (!this.n().a($$3) && $$6 != $$0.c(d)) {
         if ($$6 != $$0.c(b)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? djv.h : djv.d, $$2);
         }

         $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)).a(b, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   public boolean a(dfl $$0, cqa $$1, gw $$2) {
      gw $$3 = $$2.d();
      dfl $$4 = $$1.a_($$3);
      return $$0.c(e) == dgh.b ? $$4.d($$1, $$3, hc.b) : $$4.a(this);
   }

   private void a(@Nullable bis $$0, cpx $$1, gw $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.k.f() : this.k.e(), apg.e, 1.0F, $$1.D_().i() * 0.1F + 0.9F);
   }

   @Override
   public dfl a(dfl $$0, czj $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfl a(dfl $$0, cxs $$1) {
      return $$1 == cxs.a ? $$0 : $$0.a($$1.a($$0.c(a))).a(c);
   }

   @Override
   public long a(dfl $$0, gw $$1) {
      return ary.b($$1.u(), $$1.c($$0.c(e) == dgh.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(e, a, b, c, d);
   }

   public static boolean a(cpx $$0, gw $$1) {
      return n($$0.a_($$1));
   }

   public static boolean n(dfl $$0) {
      if ($$0.b() instanceof cuz $$1 && $$1.a().c()) {
         return true;
      }

      return false;
   }
}
