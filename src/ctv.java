import javax.annotation.Nullable;

public class ctv extends cpa {
   public static final dcv a = ctg.aC;
   public static final dcs b = dcr.w;
   public static final dcs c = dcr.o;
   public static final efb d = cpn.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final efb e = cpn.a(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final efb f = eey.a(d, e);
   public static final efb g = cpn.a(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final efb h = eey.a(f, g);
   public static final efb i = eey.a(
      cpn.a(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0), cpn.a(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0), cpn.a(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0), f
   );
   public static final efb j = eey.a(
      cpn.a(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333), cpn.a(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667), cpn.a(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0), f
   );
   public static final efb k = eey.a(
      cpn.a(10.666667, 10.0, 0.0, 15.0, 14.0, 16.0), cpn.a(6.333333, 12.0, 0.0, 10.666667, 16.0, 16.0), cpn.a(2.0, 14.0, 0.0, 6.333333, 18.0, 16.0), f
   );
   public static final efb l = eey.a(
      cpn.a(0.0, 10.0, 10.666667, 16.0, 14.0, 15.0), cpn.a(0.0, 12.0, 6.333333, 16.0, 16.0, 10.666667), cpn.a(0.0, 14.0, 2.0, 16.0, 18.0, 6.333333), f
   );
   private static final int m = 2;

   protected ctv(dca.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, ha.c).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   public cvs b_(dcb $$0) {
      return cvs.c;
   }

   @Override
   public efb f(dcb $$0, cls $$1, gu $$2) {
      return f;
   }

   @Override
   public boolean g_(dcb $$0) {
      return true;
   }

   @Override
   public dcb a(cih $$0) {
      cmm $$1 = $$0.q();
      cfz $$2 = $$0.n();
      byo $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.B && $$3 != null && $$3.gk()) {
         qr $$5 = cds.a($$2);
         if ($$5 != null && $$5.e("Book")) {
            $$4 = true;
         }
      }

      return this.n().a(a, $$0.g().g()).a(c, Boolean.valueOf($$4));
   }

   @Override
   public efb c(dcb $$0, cls $$1, gu $$2, een $$3) {
      return h;
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      switch ((ha)$$0.c(a)) {
         case c:
            return j;
         case d:
            return l;
         case f:
            return k;
         case e:
            return i;
         default:
            return f;
      }
   }

   @Override
   public dcb a(dcb $$0, cvz $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dcb a(dcb $$0, cui $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(a, b, c);
   }

   @Override
   public czn a(gu $$0, dcb $$1) {
      return new dao($$0, $$1);
   }

   public static boolean a(@Nullable bfj $$0, cmm $$1, gu $$2, dcb $$3, cfz $$4) {
      if (!$$3.c(c)) {
         if (!$$1.B) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable bfj $$0, cmm $$1, gu $$2, dcb $$3, cfz $$4) {
      if ($$1.c_($$2) instanceof dao $$6) {
         $$6.a($$4.a(1));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, amh.cf, ami.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable bfj $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
      dcb $$5 = $$3.a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(dgl.c, $$2, dgl.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(cmm $$0, gu $$1, dcb $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(cmm $$0, gu $$1, dcb $$2, boolean $$3) {
      $$0.a($$1, $$2.a(b, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(cmm $$0, gu $$1, dcb $$2) {
      $$0.a($$1.d(), $$2.b());
   }

   @Override
   public void a(dcb $$0, aif $$1, gu $$2, apf $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(c)) {
            this.d($$0, $$1, $$2);
         }

         if ($$0.c(b)) {
            $$1.a($$2.d(), this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   private void d(dcb $$0, cmm $$1, gu $$2) {
      if ($$1.c_($$2) instanceof dao $$4) {
         ha $$5 = $$0.c(a);
         cfz $$6 = $$4.c().p();
         float $$7 = 0.25F * (float)$$5.j();
         float $$8 = 0.25F * (float)$$5.l();
         bvh $$9 = new bvh($$1, (double)$$2.u() + 0.5 + (double)$$7, (double)($$2.v() + 1), (double)$$2.w() + 0.5 + (double)$$8, $$6);
         $$9.o();
         $$1.b($$9);
         $$4.a();
      }
   }

   @Override
   public boolean f_(dcb $$0) {
      return true;
   }

   @Override
   public int a(dcb $$0, cls $$1, gu $$2, ha $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   public int b(dcb $$0, cls $$1, gu $$2, ha $$3) {
      return $$3 == ha.b && $$0.c(b) ? 15 : 0;
   }

   @Override
   public boolean d_(dcb $$0) {
      return true;
   }

   @Override
   public int a(dcb $$0, cmm $$1, gu $$2) {
      if ($$0.c(c)) {
         czn $$3 = $$1.c_($$2);
         if ($$3 instanceof dao) {
            return ((dao)$$3).i();
         }
      }

      return 0;
   }

   @Override
   public bdx a(dcb $$0, cmm $$1, gu $$2, byo $$3, bdw $$4, eee $$5) {
      if ($$0.c(c)) {
         if (!$$1.B) {
            this.a($$1, $$2, $$3);
         }

         return bdx.a($$1.B);
      } else {
         cfz $$6 = $$3.b($$4);
         return !$$6.b() && !$$6.a(ane.au) ? bdx.b : bdx.d;
      }
   }

   @Nullable
   @Override
   public bea b(dcb $$0, cmm $$1, gu $$2) {
      return !$$0.c(c) ? null : super.b($$0, $$1, $$2);
   }

   private void a(cmm $$0, gu $$1, byo $$2) {
      czn $$3 = $$0.c_($$1);
      if ($$3 instanceof dao) {
         $$2.a((dao)$$3);
         $$2.a(amr.au);
      }
   }

   @Override
   public boolean a(dcb $$0, cls $$1, gu $$2, dxu $$3) {
      return false;
   }
}
