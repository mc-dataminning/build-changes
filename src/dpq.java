import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpq extends dmr {
   public static final MapCodec<dpq> a = b(dpq::new);
   public static final ebt b = ebj.aT;
   private static final ffw d = dmr.b(16.0, 0.0, 15.0);
   public static final int c = 7;

   @Override
   public MapCodec<dpq> a() {
      return a;
   }

   protected dpq(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      if ($$4 == jb.b && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(eat $$0, djp $$1, iv $$2) {
      eat $$3 = $$1.a_($$2.d());
      return !$$3.e() || $$3.b() instanceof dps || $$3.b() instanceof eak;
   }

   @Override
   public eat a(ddg $$0) {
      return !this.m().a((djp)$$0.q(), $$0.a()) ? dmt.j.m() : super.a($$0);
   }

   @Override
   protected boolean g_(eat $$0) {
      return true;
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return d;
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, azv $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   protected void b(eat $$0, arq $$1, iv $$2, azv $$3) {
      int $$4 = $$0.c(b);
      if (!a((djp)$$1, $$2) && !$$1.r($$2.d())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.b(b, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((diq)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.b(b, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(djm $$0, eat $$1, iv $$2, bwi $$3, double $$4) {
      if ($$0 instanceof arq $$5
         && (double)$$0.A.i() < $$4 - 0.5
         && $$3 instanceof bxj
         && ($$3 instanceof crm || $$5.O().c(dji.d))
         && $$3.dp() * $$3.dp() * $$3.dq() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable bwi $$0, eat $$1, djm $$2, iv $$3) {
      eat $$4 = a($$1, dmt.j.m(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(eft.c, $$3, eft.a.a($$0, $$4));
   }

   private static boolean a(diq $$0, iv $$1) {
      return $$0.a_($$1.d()).a(axc.cE);
   }

   private static boolean a(djp $$0, iv $$1) {
      for (iv $$2 : iv.c($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(axh.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(eat $$0, exp $$1) {
      return false;
   }
}
