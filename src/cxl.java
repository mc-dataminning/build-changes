import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cxl extends cso {
   public static final MapCodec<cxl> a = b(cxl::new);
   public static final dfx b = cww.aE;
   public static final dfu c = dft.w;
   public static final dfu d = dft.o;
   public static final eia e = ctc.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final eia f = ctc.a(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final eia g = ehx.a(e, f);
   public static final eia h = ctc.a(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final eia i = ehx.a(g, h);
   public static final eia j = ehx.a(
      ctc.a(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0), ctc.a(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0), ctc.a(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0), g
   );
   public static final eia k = ehx.a(
      ctc.a(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333), ctc.a(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667), ctc.a(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0), g
   );
   public static final eia l = ehx.a(
      ctc.a(10.666667, 10.0, 0.0, 15.0, 14.0, 16.0), ctc.a(6.333333, 12.0, 0.0, 10.666667, 16.0, 16.0), ctc.a(2.0, 14.0, 0.0, 6.333333, 18.0, 16.0), g
   );
   public static final eia m = ehx.a(
      ctc.a(0.0, 10.0, 10.666667, 16.0, 14.0, 15.0), ctc.a(0.0, 12.0, 6.333333, 16.0, 16.0, 10.666667), ctc.a(0.0, 14.0, 2.0, 16.0, 18.0, 6.333333), g
   );
   private static final int n = 2;

   @Override
   public MapCodec<cxl> a() {
      return a;
   }

   protected cxl(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ha.c).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public czg b_(dfd $$0) {
      return czg.c;
   }

   @Override
   public eia f(dfd $$0, cph $$1, gw $$2) {
      return g;
   }

   @Override
   public boolean g_(dfd $$0) {
      return true;
   }

   @Override
   public dfd a(clt $$0) {
      cqb $$1 = $$0.q();
      cjl $$2 = $$0.n();
      cca $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.B && $$3 != null && $$3.gp()) {
         qw $$5 = che.a($$2);
         if ($$5 != null && $$5.e("Book")) {
            $$4 = true;
         }
      }

      return this.o().a(b, $$0.g().g()).a(d, Boolean.valueOf($$4));
   }

   @Override
   public eia c(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return i;
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      switch ((ha)$$0.c(b)) {
         case c:
            return k;
         case d:
            return m;
         case f:
            return l;
         case e:
            return j;
         default:
            return g;
      }
   }

   @Override
   public dfd a(dfd $$0, czn $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dfd a(dfd $$0, cxx $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dcz a(gw $$0, dfd $$1) {
      return new dea($$0, $$1);
   }

   public static boolean a(@Nullable biw $$0, cqb $$1, gw $$2, dfd $$3, cjl $$4) {
      if (!$$3.c(d)) {
         if (!$$1.B) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable biw $$0, cqb $$1, gw $$2, dfd $$3, cjl $$4) {
      if ($$1.c_($$2) instanceof dea $$6) {
         $$6.a($$4.a(1));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, apg.cf, aph.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable biw $$0, cqb $$1, gw $$2, dfd $$3, boolean $$4) {
      dfd $$5 = $$3.a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(djn.c, $$2, djn.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(cqb $$0, gw $$1, dfd $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(cqb $$0, gw $$1, dfd $$2, boolean $$3) {
      $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(cqb $$0, gw $$1, dfd $$2) {
      $$0.a($$1.d(), $$2.b());
   }

   @Override
   public void a(dfd $$0, akt $$1, gw $$2, ash $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, dfd $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.d($$0, $$1, $$2);
         }

         if ($$0.c(c)) {
            $$1.a($$2.d(), this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   private void d(dfd $$0, cqb $$1, gw $$2) {
      if ($$1.c_($$2) instanceof dea $$4) {
         ha $$5 = $$0.c(b);
         cjl $$6 = $$4.c().p();
         float $$7 = 0.25F * (float)$$5.j();
         float $$8 = 0.25F * (float)$$5.l();
         byt $$9 = new byt($$1, (double)$$2.u() + 0.5 + (double)$$7, (double)($$2.v() + 1), (double)$$2.w() + 0.5 + (double)$$8, $$6);
         $$9.t();
         $$1.b($$9);
         $$4.a();
      }
   }

   @Override
   public boolean f_(dfd $$0) {
      return true;
   }

   @Override
   public int a(dfd $$0, cph $$1, gw $$2, ha $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   public int b(dfd $$0, cph $$1, gw $$2, ha $$3) {
      return $$3 == ha.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   public boolean d_(dfd $$0) {
      return true;
   }

   @Override
   public int a(dfd $$0, cqb $$1, gw $$2) {
      if ($$0.c(d)) {
         dcz $$3 = $$1.c_($$2);
         if ($$3 instanceof dea) {
            return ((dea)$$3).i();
         }
      }

      return 0;
   }

   @Override
   public bhe a(dfd $$0, cqb $$1, gw $$2, cca $$3, bhd $$4, ehd $$5) {
      if ($$0.c(d)) {
         if (!$$1.B) {
            this.a($$1, $$2, $$3);
         }

         return bhe.a($$1.B);
      } else {
         cjl $$6 = $$3.b($$4);
         return !$$6.b() && !$$6.a(aqd.au) ? bhe.b : bhe.d;
      }
   }

   @Nullable
   @Override
   public bhh b(dfd $$0, cqb $$1, gw $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(cqb $$0, gw $$1, cca $$2) {
      dcz $$3 = $$0.c_($$1);
      if ($$3 instanceof dea) {
         $$2.a((dea)$$3);
         $$2.a(apq.au);
      }
   }

   @Override
   public boolean a(dfd $$0, cph $$1, gw $$2, eaw $$3) {
      return false;
   }
}
