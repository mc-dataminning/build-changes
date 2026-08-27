import javax.annotation.Nullable;

public class cuo extends csm {
   public static final dfu a = cwf.aC;
   public static final dfr b = dfq.u;
   public static final dfy<dfv> c = dfq.be;
   public static final dfr d = dfq.w;
   public static final dfy<dfw> e = dfq.ae;
   protected static final float f = 3.0F;
   protected static final ehx g = csm.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final ehx h = csm.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final ehx i = csm.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ehx j = csm.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   private final dfp k;

   protected cuo(dez.d $$0, dfp $$1) {
      super($$0.a($$1.d()));
      this.k = $$1;
      this.k(this.C.b().a(a, ha.c).a(b, Boolean.valueOf(false)).a(c, dfv.a).a(d, Boolean.valueOf(false)).a(e, dfw.b));
   }

   public dfp a() {
      return this.k;
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      ha $$4 = $$0.c(a);
      boolean $$5 = !$$0.c(b);
      boolean $$6 = $$0.c(c) == dfv.b;
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
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      dfw $$6 = $$0.c(e);
      if ($$1.o() != ha.a.b || $$6 == dfw.b != ($$1 == ha.b)) {
         return $$6 == dfw.b && $$1 == ha.a && !$$0.a($$3, $$4) ? csn.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$2.a(this) && $$2.c(e) != $$6 ? $$0.a(a, $$2.c(a)).a(b, $$2.c(b)).a(c, $$2.c(c)).a(d, $$2.c(d)) : csn.a.n();
      }
   }

   @Override
   public void a(cpm $$0, gu $$1, dfa $$2, cbn $$3) {
      if (!$$0.B && $$3.f()) {
         cuq.b($$0, $$1, $$2, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dfa $$0, cos $$1, gu $$2, eat $$3) {
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
   public dfa a(clg $$0) {
      gu $$1 = $$0.a();
      cpm $$2 = $$0.q();
      if ($$1.v() < $$2.aj() - 1 && $$2.a_($$1.c()).a($$0)) {
         boolean $$3 = $$2.B($$1) || $$2.B($$1.c());
         return this.n().a(a, $$0.g()).a(c, this.b($$0)).a(d, Boolean.valueOf($$3)).a(b, Boolean.valueOf($$3)).a(e, dfw.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(cpm $$0, gu $$1, dfa $$2, biy $$3, ciy $$4) {
      $$0.a($$1.c(), $$2.a(e, dfw.a), 3);
   }

   private dfv b(clg $$0) {
      cos $$1 = $$0.q();
      gu $$2 = $$0.a();
      ha $$3 = $$0.g();
      gu $$4 = $$2.c();
      ha $$5 = $$3.i();
      gu $$6 = $$2.a($$5);
      dfa $$7 = $$1.a_($$6);
      gu $$8 = $$4.a($$5);
      dfa $$9 = $$1.a_($$8);
      ha $$10 = $$3.h();
      gu $$11 = $$2.a($$10);
      dfa $$12 = $$1.a_($$11);
      gu $$13 = $$4.a($$10);
      dfa $$14 = $$1.a_($$13);
      int $$15 = ($$7.r($$1, $$6) ? -1 : 0) + ($$9.r($$1, $$8) ? -1 : 0) + ($$12.r($$1, $$11) ? 1 : 0) + ($$14.r($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.a(this) && $$7.c(e) == dfw.b;
      boolean $$17 = $$12.a(this) && $$12.c(e) == dfw.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            ehe $$20 = $$0.l();
            double $$21 = $$20.c - (double)$$2.u();
            double $$22 = $$20.e - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? dfv.a : dfv.b;
         } else {
            return dfv.a;
         }
      } else {
         return dfv.b;
      }
   }

   @Override
   public bgq a(dfa $$0, cpm $$1, gu $$2, cbn $$3, bgp $$4, eha $$5) {
      if (!this.k.c()) {
         return bgq.d;
      } else {
         $$0 = $$0.a(b);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(b));
         $$1.a($$3, this.h($$0) ? djk.h : djk.d, $$2);
         return bgq.a($$1.B);
      }
   }

   public boolean h(dfa $$0) {
      return $$0.c(b);
   }

   public void a(@Nullable bii $$0, cpm $$1, dfa $$2, gu $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(b) != $$4) {
         $$1.a($$3, $$2.a(b, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? djk.h : djk.d, $$3);
      }
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, csm $$3, gu $$4, boolean $$5) {
      boolean $$6 = $$1.B($$2) || $$1.B($$2.a($$0.c(e) == dfw.b ? ha.b : ha.a));
      if (!this.n().a($$3) && $$6 != $$0.c(d)) {
         if ($$6 != $$0.c(b)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? djk.h : djk.d, $$2);
         }

         $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)).a(b, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   public boolean a(dfa $$0, cpp $$1, gu $$2) {
      gu $$3 = $$2.d();
      dfa $$4 = $$1.a_($$3);
      return $$0.c(e) == dfw.b ? $$4.d($$1, $$3, ha.b) : $$4.a(this);
   }

   private void a(@Nullable bii $$0, cpm $$1, gu $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.k.f() : this.k.e(), aox.e, 1.0F, $$1.y_().i() * 0.1F + 0.9F);
   }

   @Override
   public dfa a(dfa $$0, cyy $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfa a(dfa $$0, cxh $$1) {
      return $$1 == cxh.a ? $$0 : $$0.a($$1.a($$0.c(a))).a(c);
   }

   @Override
   public long a(dfa $$0, gu $$1) {
      return arp.b($$1.u(), $$1.c($$0.c(e) == dfw.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(e, a, b, c, d);
   }

   public static boolean a(cpm $$0, gu $$1) {
      return n($$0.a_($$1));
   }

   public static boolean n(dfa $$0) {
      if ($$0.b() instanceof cuo $$1 && $$1.a().c()) {
         return true;
      }

      return false;
   }
}
