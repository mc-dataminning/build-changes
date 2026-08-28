import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlf extends dij {
   public static final MapCodec<dlf> a = b(dlf::new);
   public static final dwn b = dwe.aQ;
   protected static final fal c = dij.a(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
   public static final int d = 7;

   @Override
   public MapCodec<dlf> a() {
      return a;
   }

   protected dlf(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      if ($$4 == jm.b && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dvo $$0, dfi $$1, jh $$2) {
      dvo $$3 = $$1.a_($$2.d());
      return !$$3.e() || $$3.b() instanceof dlh || $$3.b() instanceof dvg;
   }

   @Override
   public dvo a(czw $$0) {
      return !this.m().a((dfi)$$0.q(), $$0.a()) ? dil.j.m() : super.a($$0);
   }

   @Override
   protected boolean g_(dvo $$0) {
      return true;
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return c;
   }

   @Override
   protected void a(dvo $$0, arq $$1, jh $$2, azv $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dvo $$0, arq $$1, jh $$2, azv $$3) {
      int $$4 = $$0.c(b);
      if (!a((dfi)$$1, $$2) && !$$1.r($$2.d())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.b(b, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((dek)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.b(b, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(dff $$0, dvo $$1, jh $$2, bui $$3, float $$4) {
      if (!$$0.C && $$0.A.i() < $$4 - 0.5F && $$3 instanceof bve && ($$3 instanceof cor || $$0.ac().b(dfb.c)) && $$3.dt() * $$3.dt() * $$3.du() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable bui $$0, dvo $$1, dff $$2, jh $$3) {
      dvo $$4 = a($$1, dil.j.m(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(eak.c, $$3, eak.a.a($$0, $$4));
   }

   private static boolean a(dek $$0, jh $$1) {
      return $$0.a_($$1.d()).a(axd.cz);
   }

   private static boolean a(dfi $$0, jh $$1) {
      for (jh $$2 : jh.c($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(axj.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dvo $$0, esd $$1) {
      return false;
   }
}
