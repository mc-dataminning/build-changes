import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class doa extends diz {
   public static final MapCodec<doa> a = b(doa::new);
   public static final dxv<jn> b = dnl.aF;
   public static final dxp c = dxo.B;
   public static final dxp d = dxo.s;
   public static final fbv e = djn.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final fbv f = djn.a(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final fbv g = fbs.a(e, f);
   public static final fbv h = djn.a(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final fbv i = fbs.a(g, h);
   public static final fbv j = fbs.a(
      djn.a(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0), djn.a(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0), djn.a(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0), g
   );
   public static final fbv k = fbs.a(
      djn.a(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333), djn.a(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667), djn.a(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0), g
   );
   public static final fbv l = fbs.a(
      djn.a(10.666667, 10.0, 0.0, 15.0, 14.0, 16.0), djn.a(6.333333, 12.0, 0.0, 10.666667, 16.0, 16.0), djn.a(2.0, 14.0, 0.0, 6.333333, 18.0, 16.0), g
   );
   public static final fbv m = fbs.a(
      djn.a(0.0, 10.0, 10.666667, 16.0, 14.0, 15.0), djn.a(0.0, 12.0, 6.333333, 16.0, 16.0, 10.666667), djn.a(0.0, 14.0, 2.0, 16.0, 18.0, 6.333333), g
   );
   private static final int n = 2;

   @Override
   public MapCodec<doa> a() {
      return a;
   }

   protected doa(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jn.c).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected fbv d_(dwy $$0) {
      return g;
   }

   @Override
   protected boolean g_(dwy $$0) {
      return true;
   }

   @Override
   public dwy a(dah $$0) {
      dgj $$1 = $$0.q();
      cwq $$2 = $$0.n();
      coy $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.C && $$3 != null && $$3.gG()) {
         cyz $$5 = $$2.a(kv.Y, cyz.a);
         if ($$5.a("Book")) {
            $$4 = true;
         }
      }

      return this.m().b(b, $$0.g().g()).b(d, Boolean.valueOf($$4));
   }

   @Override
   protected fbv b(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return i;
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      switch ((jn)$$0.c(b)) {
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
   protected dwy a(dwy $$0, dqf $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dwy a(dwy $$0, dom $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dua a(ji $$0, dwy $$1) {
      return new dvf($$0, $$1);
   }

   public static boolean a(@Nullable bvi $$0, dgj $$1, ji $$2, dwy $$3, cwq $$4) {
      if (!$$3.c(d)) {
         if (!$$1.C) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable bvi $$0, dgj $$1, ji $$2, dwy $$3, cwq $$4) {
      if ($$1.c_($$2) instanceof dvf $$6) {
         $$6.b($$4.b(1, $$0));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, awa.cz, awb.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable bum $$0, dgj $$1, ji $$2, dwy $$3, boolean $$4) {
      dwy $$5 = $$3.b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(ebu.c, $$2, ebu.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(dgj $$0, ji $$1, dwy $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(dgj $$0, ji $$1, dwy $$2, boolean $$3) {
      $$0.a($$1, $$2.b(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(dgj $$0, ji $$1, dwy $$2) {
      eui $$3 = eue.a($$0, $$2.c(b).g(), jn.b);
      $$0.a($$1.e(), $$2.b(), $$3);
   }

   @Override
   protected void a(dwy $$0, ard $$1, ji $$2, azh $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, dwy $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
         if ($$0.c(c)) {
            b($$1, $$2, $$0);
         }
      }
   }

   private void e(dwy $$0, dgj $$1, ji $$2) {
      if ($$1.c_($$2) instanceof dvf $$4) {
         jn $$5 = $$0.c(b);
         cwq $$6 = $$4.b().v();
         float $$7 = 0.25F * (float)$$5.j();
         float $$8 = 0.25F * (float)$$5.l();
         cld $$9 = new cld($$1, (double)$$2.u() + 0.5 + (double)$$7, (double)($$2.v() + 1), (double)$$2.w() + 0.5 + (double)$$8, $$6);
         $$9.s();
         $$1.b($$9);
         $$4.a();
      }
   }

   @Override
   protected boolean f_(dwy $$0) {
      return true;
   }

   @Override
   protected int a(dwy $$0, dfo $$1, ji $$2, jn $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(dwy $$0, dfo $$1, ji $$2, jn $$3) {
      return $$3 == jn.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   protected boolean c_(dwy $$0) {
      return true;
   }

   @Override
   protected int a(dwy $$0, dgj $$1, ji $$2) {
      if ($$0.c(d)) {
         dua $$3 = $$1.c_($$2);
         if ($$3 instanceof dvf) {
            return ((dvf)$$3).j();
         }
      }

      return 0;
   }

   @Override
   protected bsl a(cwq $$0, dwy $$1, dgj $$2, ji $$3, coy $$4, bsk $$5, fax $$6) {
      if ($$1.c(d)) {
         return bsl.f;
      } else if ($$0.a(awy.aY)) {
         return (bsl)(a($$4, $$2, $$3, $$1, $$0) ? bsl.a : bsl.e);
      } else {
         return (bsl)($$0.f() && $$5 == bsk.a ? bsl.e : bsl.f);
      }
   }

   @Override
   protected bsl a(dwy $$0, dgj $$1, ji $$2, coy $$3, fax $$4) {
      if ($$0.c(d)) {
         if (!$$1.C) {
            this.a($$1, $$2, $$3);
         }

         return bsl.a;
      } else {
         return bsl.c;
      }
   }

   @Nullable
   @Override
   protected bsn b(dwy $$0, dgj $$1, ji $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(dgj $$0, ji $$1, coy $$2) {
      dua $$3 = $$0.c_($$1);
      if ($$3 instanceof dvf) {
         $$2.a((dvf)$$3);
         $$2.a(awk.au);
      }
   }

   @Override
   protected boolean a(dwy $$0, etp $$1) {
      return false;
   }
}
