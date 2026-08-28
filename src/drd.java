import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class drd extends dly {
   public static final MapCodec<drd> a = b(drd::new);
   public static final ebm<jb> b = dqn.e;
   public static final ebf c = ebe.A;
   public static final ebf d = ebe.r;
   private static final ffr e = ffo.a(dmm.b(16.0, 0.0, 2.0), dmm.b(8.0, 2.0, 14.0));
   private static final Map<jb, ffr> f = ffo.c(
      ffo.a(dmm.a(16.0, 10.0, 14.0, 1.0, 5.333333), dmm.a(16.0, 12.0, 16.0, 5.333333, 9.666667), dmm.a(16.0, 14.0, 18.0, 9.666667, 14.0), e)
   );
   private static final int g = 2;

   @Override
   public MapCodec<drd> a() {
      return a;
   }

   protected drd(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jb.c).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected ffr d_(eao $$0) {
      return e;
   }

   @Override
   protected boolean g_(eao $$0) {
      return true;
   }

   @Override
   public eao a(ddd $$0) {
      djh $$1 = $$0.q();
      czk $$2 = $$0.n();
      crj $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.C && $$3 != null && $$3.gF()) {
         dbs $$5 = $$2.a(kk.aa, dbs.a);
         if ($$5.a("Book")) {
            $$4 = true;
         }
      }

      return this.m().b(b, $$0.g().g()).b(d, Boolean.valueOf($$4));
   }

   @Override
   protected ffr b(eao $$0, din $$1, iv $$2, ffc $$3) {
      return e;
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return f.get($$0.c(b));
   }

   @Override
   protected eao a(eao $$0, dtg $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected eao a(eao $$0, drp $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dxm a(iv $$0, eao $$1) {
      return new dys($$0, $$1);
   }

   public static boolean a(@Nullable bxj $$0, djh $$1, iv $$2, eao $$3, czk $$4) {
      if (!$$3.c(d)) {
         if (!$$1.C) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable bxj $$0, djh $$1, iv $$2, eao $$3, czk $$4) {
      if ($$1.c_($$2) instanceof dys $$6) {
         $$6.b($$4.b(1, $$0));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, awn.cz, awo.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable bwi $$0, djh $$1, iv $$2, eao $$3, boolean $$4) {
      eao $$5 = $$3.b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(efo.c, $$2, efo.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(djh $$0, iv $$1, eao $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(djh $$0, iv $$1, eao $$2, boolean $$3) {
      $$0.a($$1, $$2.b(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(djh $$0, iv $$1, eao $$2) {
      eyd $$3 = exz.a($$0, $$2.c(b).g(), jb.b);
      $$0.a($$1.e(), $$2.b(), $$3);
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, azv $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, boolean $$3) {
      if ($$0.c(c)) {
         b($$1, $$2, $$0);
      }
   }

   @Override
   protected boolean f_(eao $$0) {
      return true;
   }

   @Override
   protected int a(eao $$0, din $$1, iv $$2, jb $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(eao $$0, din $$1, iv $$2, jb $$3) {
      return $$3 == jb.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   protected boolean c_(eao $$0) {
      return true;
   }

   @Override
   protected int a(eao $$0, djh $$1, iv $$2) {
      if ($$0.c(d)) {
         dxm $$3 = $$1.c_($$2);
         if ($$3 instanceof dys) {
            return ((dys)$$3).k();
         }
      }

      return 0;
   }

   @Override
   protected bug a(czk $$0, eao $$1, djh $$2, iv $$3, crj $$4, buf $$5, fet $$6) {
      if ($$1.c(d)) {
         return bug.f;
      } else if ($$0.a(axk.aZ)) {
         return (bug)(a($$4, $$2, $$3, $$1, $$0) ? bug.a : bug.e);
      } else {
         return (bug)($$0.f() && $$5 == buf.a ? bug.e : bug.f);
      }
   }

   @Override
   protected bug a(eao $$0, djh $$1, iv $$2, crj $$3, fet $$4) {
      if ($$0.c(d)) {
         if (!$$1.C) {
            this.a($$1, $$2, $$3);
         }

         return bug.a;
      } else {
         return bug.c;
      }
   }

   @Nullable
   @Override
   protected bui b(eao $$0, djh $$1, iv $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(djh $$0, iv $$1, crj $$2) {
      dxm $$3 = $$0.c_($$1);
      if ($$3 instanceof dys) {
         $$2.a((dys)$$3);
         $$2.a(awx.au);
      }
   }

   @Override
   protected boolean a(eao $$0, exk $$1) {
      return false;
   }
}
