import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmi extends djk {
   public static final MapCodec<dmi> a = b(dmi::new);
   public static final dxu b = dxl.aT;
   protected static final fbs c = djk.a(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
   public static final int d = 7;

   @Override
   public MapCodec<dmi> a() {
      return a;
   }

   protected dmi(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      if ($$4 == jn.b && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dwv $$0, dgj $$1, ji $$2) {
      dwv $$3 = $$1.a_($$2.d());
      return !$$3.e() || $$3.b() instanceof dmk || $$3.b() instanceof dwn;
   }

   @Override
   public dwv a(dae $$0) {
      return !this.m().a((dgj)$$0.q(), $$0.a()) ? djm.j.m() : super.a($$0);
   }

   @Override
   protected boolean g_(dwv $$0) {
      return true;
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return c;
   }

   @Override
   protected void a(dwv $$0, arc $$1, ji $$2, azg $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dwv $$0, arc $$1, ji $$2, azg $$3) {
      int $$4 = $$0.c(b);
      if (!a((dgj)$$1, $$2) && !$$1.r($$2.d())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.b(b, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((dfl)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.b(b, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(dgg $$0, dwv $$1, ji $$2, buj $$3, float $$4) {
      if ($$0 instanceof arc $$5
         && $$0.A.i() < $$4 - 0.5F
         && $$3 instanceof bvf
         && ($$3 instanceof cov || $$5.O().b(dgc.c))
         && $$3.dr() * $$3.dr() * $$3.ds() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable buj $$0, dwv $$1, dgg $$2, ji $$3) {
      dwv $$4 = a($$1, djm.j.m(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(ebr.c, $$3, ebr.a.a($$0, $$4));
   }

   private static boolean a(dfl $$0, ji $$1) {
      return $$0.a_($$1.d()).a(awo.cA);
   }

   private static boolean a(dgj $$0, ji $$1) {
      for (ji $$2 : ji.c($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(awu.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dwv $$0, etm $$1) {
      return false;
   }
}
