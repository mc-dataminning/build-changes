import javax.annotation.Nullable;

public class crp extends cpn {
   public static final dcv a = ctg.aC;
   public static final dcs b = dcr.u;
   public static final dcz<dcw> c = dcr.be;
   public static final dcs d = dcr.w;
   public static final dcz<dcx> e = dcr.ae;
   protected static final float f = 3.0F;
   protected static final efb g = cpn.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final efb h = cpn.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final efb i = cpn.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final efb j = cpn.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   private final dcq k;

   protected crp(dca.d $$0, dcq $$1) {
      super($$0.a($$1.d()));
      this.k = $$1;
      this.k(this.C.b().a(a, ha.c).a(b, Boolean.valueOf(false)).a(c, dcw.a).a(d, Boolean.valueOf(false)).a(e, dcx.b));
   }

   public dcq a() {
      return this.k;
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      ha $$4 = $$0.c(a);
      boolean $$5 = !$$0.c(b);
      boolean $$6 = $$0.c(c) == dcw.b;
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
   public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
      dcx $$6 = $$0.c(e);
      if ($$1.o() != ha.a.b || $$6 == dcx.b != ($$1 == ha.b)) {
         return $$6 == dcx.b && $$1 == ha.a && !$$0.a($$3, $$4) ? cpo.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$2.a(this) && $$2.c(e) != $$6 ? $$0.a(a, $$2.c(a)).a(b, $$2.c(b)).a(c, $$2.c(c)).a(d, $$2.c(d)) : cpo.a.n();
      }
   }

   @Override
   public void a(cmm $$0, gu $$1, dcb $$2, byo $$3) {
      if (!$$0.B && $$3.f()) {
         crr.b($$0, $$1, $$2, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dcb $$0, cls $$1, gu $$2, dxu $$3) {
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
   public dcb a(cih $$0) {
      gu $$1 = $$0.a();
      cmm $$2 = $$0.q();
      if ($$1.v() < $$2.aj() - 1 && $$2.a_($$1.c()).a($$0)) {
         boolean $$3 = $$2.B($$1) || $$2.B($$1.c());
         return this.n().a(a, $$0.g()).a(c, this.b($$0)).a(d, Boolean.valueOf($$3)).a(b, Boolean.valueOf($$3)).a(e, dcx.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(cmm $$0, gu $$1, dcb $$2, bfz $$3, cfz $$4) {
      $$0.a($$1.c(), $$2.a(e, dcx.a), 3);
   }

   private dcw b(cih $$0) {
      cls $$1 = $$0.q();
      gu $$2 = $$0.a();
      ha $$3 = $$0.g();
      gu $$4 = $$2.c();
      ha $$5 = $$3.i();
      gu $$6 = $$2.a($$5);
      dcb $$7 = $$1.a_($$6);
      gu $$8 = $$4.a($$5);
      dcb $$9 = $$1.a_($$8);
      ha $$10 = $$3.h();
      gu $$11 = $$2.a($$10);
      dcb $$12 = $$1.a_($$11);
      gu $$13 = $$4.a($$10);
      dcb $$14 = $$1.a_($$13);
      int $$15 = ($$7.r($$1, $$6) ? -1 : 0) + ($$9.r($$1, $$8) ? -1 : 0) + ($$12.r($$1, $$11) ? 1 : 0) + ($$14.r($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.a(this) && $$7.c(e) == dcx.b;
      boolean $$17 = $$12.a(this) && $$12.c(e) == dcx.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            eei $$20 = $$0.l();
            double $$21 = $$20.c - (double)$$2.u();
            double $$22 = $$20.e - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? dcw.a : dcw.b;
         } else {
            return dcw.a;
         }
      } else {
         return dcw.b;
      }
   }

   @Override
   public bdx a(dcb $$0, cmm $$1, gu $$2, byo $$3, bdw $$4, eee $$5) {
      if (!this.k.c()) {
         return bdx.d;
      } else {
         $$0 = $$0.a(b);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(b));
         $$1.a($$3, this.h($$0) ? dgl.h : dgl.d, $$2);
         return bdx.a($$1.B);
      }
   }

   public boolean h(dcb $$0) {
      return $$0.c(b);
   }

   public void a(@Nullable bfj $$0, cmm $$1, dcb $$2, gu $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(b) != $$4) {
         $$1.a($$3, $$2.a(b, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? dgl.h : dgl.d, $$3);
      }
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, cpn $$3, gu $$4, boolean $$5) {
      boolean $$6 = $$1.B($$2) || $$1.B($$2.a($$0.c(e) == dcx.b ? ha.b : ha.a));
      if (!this.n().a($$3) && $$6 != $$0.c(d)) {
         if ($$6 != $$0.c(b)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? dgl.h : dgl.d, $$2);
         }

         $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)).a(b, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   public boolean a(dcb $$0, cmp $$1, gu $$2) {
      gu $$3 = $$2.d();
      dcb $$4 = $$1.a_($$3);
      return $$0.c(e) == dcx.b ? $$4.d($$1, $$3, ha.b) : $$4.a(this);
   }

   private void a(@Nullable bfj $$0, cmm $$1, gu $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.k.f() : this.k.e(), ami.e, 1.0F, $$1.y_().i() * 0.1F + 0.9F);
   }

   @Override
   public dcb a(dcb $$0, cvz $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dcb a(dcb $$0, cui $$1) {
      return $$1 == cui.a ? $$0 : $$0.a($$1.a($$0.c(a))).a(c);
   }

   @Override
   public long a(dcb $$0, gu $$1) {
      return apa.b($$1.u(), $$1.c($$0.c(e) == dcx.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(e, a, b, c, d);
   }

   public static boolean a(cmm $$0, gu $$1) {
      return n($$0.a_($$1));
   }

   public static boolean n(dcb $$0) {
      if ($$0.b() instanceof crp $$1 && $$1.a().c()) {
         return true;
      }

      return false;
   }
}
