import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dml extends djn {
   public static final MapCodec<dml> a = b(dml::new);
   public static final dxx b = dxo.aT;
   protected static final fbv c = djn.a(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
   public static final int d = 7;

   @Override
   public MapCodec<dml> a() {
      return a;
   }

   protected dml(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      if ($$4 == jn.b && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dwy $$0, dgm $$1, ji $$2) {
      dwy $$3 = $$1.a_($$2.d());
      return !$$3.e() || $$3.b() instanceof dmn || $$3.b() instanceof dwq;
   }

   @Override
   public dwy a(dah $$0) {
      return !this.m().a((dgm)$$0.q(), $$0.a()) ? djp.j.m() : super.a($$0);
   }

   @Override
   protected boolean g_(dwy $$0) {
      return true;
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return c;
   }

   @Override
   protected void a(dwy $$0, ard $$1, ji $$2, azh $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dwy $$0, ard $$1, ji $$2, azh $$3) {
      int $$4 = $$0.c(b);
      if (!a((dgm)$$1, $$2) && !$$1.r($$2.d())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.b(b, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((dfo)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.b(b, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(dgj $$0, dwy $$1, ji $$2, bum $$3, float $$4) {
      if ($$0 instanceof ard $$5
         && $$0.A.i() < $$4 - 0.5F
         && $$3 instanceof bvi
         && ($$3 instanceof coy || $$5.O().b(dgf.c))
         && $$3.dq() * $$3.dq() * $$3.dr() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable bum $$0, dwy $$1, dgj $$2, ji $$3) {
      dwy $$4 = a($$1, djp.j.m(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(ebu.c, $$3, ebu.a.a($$0, $$4));
   }

   private static boolean a(dfo $$0, ji $$1) {
      return $$0.a_($$1.d()).a(awp.cA);
   }

   private static boolean a(dgm $$0, ji $$1) {
      for (ji $$2 : ji.c($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(awv.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dwy $$0, etp $$1) {
      return false;
   }
}
