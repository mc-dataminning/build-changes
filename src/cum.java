import javax.annotation.Nullable;

public class cum extends csk {
   public static final dfs a = cwd.aC;
   public static final dfp b = dfo.u;
   public static final dfw<dft> c = dfo.be;
   public static final dfp d = dfo.w;
   public static final dfw<dfu> e = dfo.ae;
   protected static final float f = 3.0F;
   protected static final ehy g = csk.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final ehy h = csk.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final ehy i = csk.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ehy j = csk.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   private final dfn k;

   protected cum(dex.d $$0, dfn $$1) {
      super($$0.a($$1.d()));
      this.k = $$1;
      this.k(this.C.b().a(a, hb.c).a(b, Boolean.valueOf(false)).a(c, dft.a).a(d, Boolean.valueOf(false)).a(e, dfu.b));
   }

   public dfn a() {
      return this.k;
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      hb $$4 = $$0.c(a);
      boolean $$5 = !$$0.c(b);
      boolean $$6 = $$0.c(c) == dft.b;
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
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      dfu $$6 = $$0.c(e);
      if ($$1.o() != hb.a.b || $$6 == dfu.b != ($$1 == hb.b)) {
         return $$6 == dfu.b && $$1 == hb.a && !$$0.a($$3, $$4) ? csl.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$2.a(this) && $$2.c(e) != $$6 ? $$0.a(a, $$2.c(a)).a(b, $$2.c(b)).a(c, $$2.c(c)).a(d, $$2.c(d)) : csl.a.n();
      }
   }

   @Override
   public void a(cpk $$0, gv $$1, dey $$2, cbl $$3) {
      if (!$$0.B && $$3.f()) {
         cuo.b($$0, $$1, $$2, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dey $$0, coq $$1, gv $$2, ear $$3) {
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
   public dey a(cle $$0) {
      gv $$1 = $$0.a();
      cpk $$2 = $$0.q();
      if ($$1.v() < $$2.aj() - 1 && $$2.a_($$1.c()).a($$0)) {
         boolean $$3 = $$2.B($$1) || $$2.B($$1.c());
         return this.n().a(a, $$0.g()).a(c, this.b($$0)).a(d, Boolean.valueOf($$3)).a(b, Boolean.valueOf($$3)).a(e, dfu.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(cpk $$0, gv $$1, dey $$2, biw $$3, ciw $$4) {
      $$0.a($$1.c(), $$2.a(e, dfu.a), 3);
   }

   private dft b(cle $$0) {
      coq $$1 = $$0.q();
      gv $$2 = $$0.a();
      hb $$3 = $$0.g();
      gv $$4 = $$2.c();
      hb $$5 = $$3.i();
      gv $$6 = $$2.a($$5);
      dey $$7 = $$1.a_($$6);
      gv $$8 = $$4.a($$5);
      dey $$9 = $$1.a_($$8);
      hb $$10 = $$3.h();
      gv $$11 = $$2.a($$10);
      dey $$12 = $$1.a_($$11);
      gv $$13 = $$4.a($$10);
      dey $$14 = $$1.a_($$13);
      int $$15 = ($$7.r($$1, $$6) ? -1 : 0) + ($$9.r($$1, $$8) ? -1 : 0) + ($$12.r($$1, $$11) ? 1 : 0) + ($$14.r($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.a(this) && $$7.c(e) == dfu.b;
      boolean $$17 = $$12.a(this) && $$12.c(e) == dfu.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            ehf $$20 = $$0.l();
            double $$21 = $$20.c - (double)$$2.u();
            double $$22 = $$20.e - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? dft.a : dft.b;
         } else {
            return dft.a;
         }
      } else {
         return dft.b;
      }
   }

   @Override
   public bgo a(dey $$0, cpk $$1, gv $$2, cbl $$3, bgn $$4, ehb $$5) {
      if (!this.k.c()) {
         return bgo.d;
      } else {
         $$0 = $$0.a(b);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(b));
         $$1.a($$3, this.h($$0) ? dji.h : dji.d, $$2);
         return bgo.a($$1.B);
      }
   }

   public boolean h(dey $$0) {
      return $$0.c(b);
   }

   public void a(@Nullable big $$0, cpk $$1, dey $$2, gv $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(b) != $$4) {
         $$1.a($$3, $$2.a(b, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? dji.h : dji.d, $$3);
      }
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, csk $$3, gv $$4, boolean $$5) {
      boolean $$6 = $$1.B($$2) || $$1.B($$2.a($$0.c(e) == dfu.b ? hb.b : hb.a));
      if (!this.n().a($$3) && $$6 != $$0.c(d)) {
         if ($$6 != $$0.c(b)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? dji.h : dji.d, $$2);
         }

         $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)).a(b, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   public boolean a(dey $$0, cpn $$1, gv $$2) {
      gv $$3 = $$2.d();
      dey $$4 = $$1.a_($$3);
      return $$0.c(e) == dfu.b ? $$4.d($$1, $$3, hb.b) : $$4.a(this);
   }

   private void a(@Nullable big $$0, cpk $$1, gv $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.k.f() : this.k.e(), aov.e, 1.0F, $$1.y_().i() * 0.1F + 0.9F);
   }

   @Override
   public dey a(dey $$0, cyw $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dey a(dey $$0, cxf $$1) {
      return $$1 == cxf.a ? $$0 : $$0.a($$1.a($$0.c(a))).a(c);
   }

   @Override
   public long a(dey $$0, gv $$1) {
      return aro.b($$1.u(), $$1.c($$0.c(e) == dfu.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(e, a, b, c, d);
   }

   public static boolean a(cpk $$0, gv $$1) {
      return n($$0.a_($$1));
   }

   public static boolean n(dey $$0) {
      if ($$0.b() instanceof cum $$1 && $$1.a().c()) {
         return true;
      }

      return false;
   }
}
