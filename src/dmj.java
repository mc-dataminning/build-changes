import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmj extends djl {
   public static final MapCodec<dmj> a = b(dmj::new);
   public static final dxv b = dxm.aT;
   protected static final fbt c = djl.a(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
   public static final int d = 7;

   @Override
   public MapCodec<dmj> a() {
      return a;
   }

   protected dmj(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      if ($$4 == jn.b && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dww $$0, dgk $$1, ji $$2) {
      dww $$3 = $$1.a_($$2.d());
      return !$$3.e() || $$3.b() instanceof dml || $$3.b() instanceof dwo;
   }

   @Override
   public dww a(daf $$0) {
      return !this.m().a((dgk)$$0.q(), $$0.a()) ? djn.j.m() : super.a($$0);
   }

   @Override
   protected boolean g_(dww $$0) {
      return true;
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return c;
   }

   @Override
   protected void a(dww $$0, ard $$1, ji $$2, azh $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dww $$0, ard $$1, ji $$2, azh $$3) {
      int $$4 = $$0.c(b);
      if (!a((dgk)$$1, $$2) && !$$1.r($$2.d())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.b(b, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((dfm)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.b(b, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(dgh $$0, dww $$1, ji $$2, buk $$3, float $$4) {
      if ($$0 instanceof ard $$5
         && $$0.A.i() < $$4 - 0.5F
         && $$3 instanceof bvg
         && ($$3 instanceof cow || $$5.O().b(dgd.c))
         && $$3.dq() * $$3.dq() * $$3.dr() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable buk $$0, dww $$1, dgh $$2, ji $$3) {
      dww $$4 = a($$1, djn.j.m(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(ebs.c, $$3, ebs.a.a($$0, $$4));
   }

   private static boolean a(dfm $$0, ji $$1) {
      return $$0.a_($$1.d()).a(awp.cA);
   }

   private static boolean a(dgk $$0, ji $$1) {
      for (ji $$2 : ji.c($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(awv.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dww $$0, etn $$1) {
      return false;
   }
}
