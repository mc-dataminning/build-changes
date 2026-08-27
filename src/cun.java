import javax.annotation.Nullable;

public class cun extends csl {
   public static final dft a = cwe.aC;
   public static final dfq b = dfp.u;
   public static final dfx<dfu> c = dfp.be;
   public static final dfq d = dfp.w;
   public static final dfx<dfv> e = dfp.ae;
   protected static final float f = 3.0F;
   protected static final ehw g = csl.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final ehw h = csl.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final ehw i = csl.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ehw j = csl.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   private final dfo k;

   protected cun(dey.d $$0, dfo $$1) {
      super($$0.a($$1.d()));
      this.k = $$1;
      this.k(this.C.b().a(a, ha.c).a(b, Boolean.valueOf(false)).a(c, dfu.a).a(d, Boolean.valueOf(false)).a(e, dfv.b));
   }

   public dfo a() {
      return this.k;
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      ha $$4 = $$0.c(a);
      boolean $$5 = !$$0.c(b);
      boolean $$6 = $$0.c(c) == dfu.b;
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
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      dfv $$6 = $$0.c(e);
      if ($$1.o() != ha.a.b || $$6 == dfv.b != ($$1 == ha.b)) {
         return $$6 == dfv.b && $$1 == ha.a && !$$0.a($$3, $$4) ? csm.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$2.a(this) && $$2.c(e) != $$6 ? $$0.a(a, $$2.c(a)).a(b, $$2.c(b)).a(c, $$2.c(c)).a(d, $$2.c(d)) : csm.a.n();
      }
   }

   @Override
   public void a(cpl $$0, gu $$1, dez $$2, cbm $$3) {
      if (!$$0.B && $$3.f()) {
         cup.b($$0, $$1, $$2, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dez $$0, cor $$1, gu $$2, eas $$3) {
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
   public dez a(clf $$0) {
      gu $$1 = $$0.a();
      cpl $$2 = $$0.q();
      if ($$1.v() < $$2.aj() - 1 && $$2.a_($$1.c()).a($$0)) {
         boolean $$3 = $$2.B($$1) || $$2.B($$1.c());
         return this.n().a(a, $$0.g()).a(c, this.b($$0)).a(d, Boolean.valueOf($$3)).a(b, Boolean.valueOf($$3)).a(e, dfv.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(cpl $$0, gu $$1, dez $$2, biy $$3, cix $$4) {
      $$0.a($$1.c(), $$2.a(e, dfv.a), 3);
   }

   private dfu b(clf $$0) {
      cor $$1 = $$0.q();
      gu $$2 = $$0.a();
      ha $$3 = $$0.g();
      gu $$4 = $$2.c();
      ha $$5 = $$3.i();
      gu $$6 = $$2.a($$5);
      dez $$7 = $$1.a_($$6);
      gu $$8 = $$4.a($$5);
      dez $$9 = $$1.a_($$8);
      ha $$10 = $$3.h();
      gu $$11 = $$2.a($$10);
      dez $$12 = $$1.a_($$11);
      gu $$13 = $$4.a($$10);
      dez $$14 = $$1.a_($$13);
      int $$15 = ($$7.r($$1, $$6) ? -1 : 0) + ($$9.r($$1, $$8) ? -1 : 0) + ($$12.r($$1, $$11) ? 1 : 0) + ($$14.r($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.a(this) && $$7.c(e) == dfv.b;
      boolean $$17 = $$12.a(this) && $$12.c(e) == dfv.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            ehd $$20 = $$0.l();
            double $$21 = $$20.c - (double)$$2.u();
            double $$22 = $$20.e - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? dfu.a : dfu.b;
         } else {
            return dfu.a;
         }
      } else {
         return dfu.b;
      }
   }

   @Override
   public bgq a(dez $$0, cpl $$1, gu $$2, cbm $$3, bgp $$4, egz $$5) {
      if (!this.k.c()) {
         return bgq.d;
      } else {
         $$0 = $$0.a(b);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(b));
         $$1.a($$3, this.h($$0) ? djj.h : djj.d, $$2);
         return bgq.a($$1.B);
      }
   }

   public boolean h(dez $$0) {
      return $$0.c(b);
   }

   public void a(@Nullable bii $$0, cpl $$1, dez $$2, gu $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(b) != $$4) {
         $$1.a($$3, $$2.a(b, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? djj.h : djj.d, $$3);
      }
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, csl $$3, gu $$4, boolean $$5) {
      boolean $$6 = $$1.B($$2) || $$1.B($$2.a($$0.c(e) == dfv.b ? ha.b : ha.a));
      if (!this.n().a($$3) && $$6 != $$0.c(d)) {
         if ($$6 != $$0.c(b)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? djj.h : djj.d, $$2);
         }

         $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)).a(b, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   public boolean a(dez $$0, cpo $$1, gu $$2) {
      gu $$3 = $$2.d();
      dez $$4 = $$1.a_($$3);
      return $$0.c(e) == dfv.b ? $$4.d($$1, $$3, ha.b) : $$4.a(this);
   }

   private void a(@Nullable bii $$0, cpl $$1, gu $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.k.f() : this.k.e(), aox.e, 1.0F, $$1.y_().i() * 0.1F + 0.9F);
   }

   @Override
   public dez a(dez $$0, cyx $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dez a(dez $$0, cxg $$1) {
      return $$1 == cxg.a ? $$0 : $$0.a($$1.a($$0.c(a))).a(c);
   }

   @Override
   public long a(dez $$0, gu $$1) {
      return arp.b($$1.u(), $$1.c($$0.c(e) == dfv.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(e, a, b, c, d);
   }

   public static boolean a(cpl $$0, gu $$1) {
      return n($$0.a_($$1));
   }

   public static boolean n(dez $$0) {
      if ($$0.b() instanceof cun $$1 && $$1.a().c()) {
         return true;
      }

      return false;
   }
}
