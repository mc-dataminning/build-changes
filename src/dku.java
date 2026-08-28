import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dku extends dhy {
   public static final MapCodec<dku> a = b(dku::new);
   public static final dwd b = dvt.aQ;
   protected static final fab c = dhy.a(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
   public static final int d = 7;

   @Override
   public MapCodec<dku> a() {
      return a;
   }

   protected dku(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if ($$1 == jl.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dvd $$0, dey $$1, jg $$2) {
      dvd $$3 = $$1.a_($$2.d());
      return !$$3.e() || $$3.b() instanceof dkw || $$3.b() instanceof duv;
   }

   @Override
   public dvd a(czm $$0) {
      return !this.m().a((dey)$$0.q(), $$0.a()) ? dia.j.m() : super.a($$0);
   }

   @Override
   protected boolean g_(dvd $$0) {
      return true;
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return c;
   }

   @Override
   protected void a(dvd $$0, arm $$1, jg $$2, azr $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dvd $$0, arm $$1, jg $$2, azr $$3) {
      int $$4 = $$0.c(b);
      if (!a((dey)$$1, $$2) && !$$1.r($$2.d())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.b(b, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((dea)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.b(b, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(dev $$0, dvd $$1, jg $$2, btz $$3, float $$4) {
      if (!$$0.C && $$0.A.i() < $$4 - 0.5F && $$3 instanceof buv && ($$3 instanceof coh || $$0.ac().b(der.c)) && $$3.ds() * $$3.ds() * $$3.dt() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable btz $$0, dvd $$1, dev $$2, jg $$3) {
      dvd $$4 = a($$1, dia.j.m(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(eaa.c, $$3, eaa.a.a($$0, $$4));
   }

   private static boolean a(dea $$0, jg $$1) {
      return $$0.a_($$1.d()).a(awz.cz);
   }

   private static boolean a(dey $$0, jg $$1) {
      for (jg $$2 : jg.c($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(axf.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dvd $$0, ert $$1) {
      return false;
   }
}
