import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpl extends dmm {
   public static final MapCodec<dpl> a = b(dpl::new);
   public static final ebo b = ebe.aT;
   private static final ffr d = dmm.b(16.0, 0.0, 15.0);
   public static final int c = 7;

   @Override
   public MapCodec<dpl> a() {
      return a;
   }

   protected dpl(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      if ($$4 == jb.b && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(eao $$0, djk $$1, iv $$2) {
      eao $$3 = $$1.a_($$2.d());
      return !$$3.e() || $$3.b() instanceof dpn || $$3.b() instanceof eaf;
   }

   @Override
   public eao a(ddd $$0) {
      return !this.m().a((djk)$$0.q(), $$0.a()) ? dmo.j.m() : super.a($$0);
   }

   @Override
   protected boolean g_(eao $$0) {
      return true;
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return d;
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, azv $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   protected void b(eao $$0, arq $$1, iv $$2, azv $$3) {
      int $$4 = $$0.c(b);
      if (!a((djk)$$1, $$2) && !$$1.r($$2.d())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.b(b, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((din)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.b(b, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(djh $$0, eao $$1, iv $$2, bwi $$3, double $$4) {
      if ($$0 instanceof arq $$5
         && (double)$$0.A.i() < $$4 - 0.5
         && $$3 instanceof bxj
         && ($$3 instanceof crj || $$5.O().c(djd.d))
         && $$3.dp() * $$3.dp() * $$3.dq() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable bwi $$0, eao $$1, djh $$2, iv $$3) {
      eao $$4 = a($$1, dmo.j.m(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(efo.c, $$3, efo.a.a($$0, $$4));
   }

   private static boolean a(din $$0, iv $$1) {
      return $$0.a_($$1.d()).a(axc.cE);
   }

   private static boolean a(djk $$0, iv $$1) {
      for (iv $$2 : iv.c($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(axh.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(eao $$0, exk $$1) {
      return false;
   }
}
