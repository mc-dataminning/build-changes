import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class doy extends dma {
   public static final MapCodec<doy> a = b(doy::new);
   public static final eaz b = eap.aT;
   private static final ffc d = dma.b(16.0, 0.0, 15.0);
   public static final int c = 7;

   @Override
   public MapCodec<doy> a() {
      return a;
   }

   protected doy(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      if ($$4 == ja.b && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dzz $$0, diy $$1, iu $$2) {
      dzz $$3 = $$1.a_($$2.d());
      return !$$3.e() || $$3.b() instanceof dpa || $$3.b() instanceof dzq;
   }

   @Override
   public dzz a(dcr $$0) {
      return !this.m().a((diy)$$0.q(), $$0.a()) ? dmc.j.m() : super.a($$0);
   }

   @Override
   protected boolean g_(dzz $$0) {
      return true;
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return d;
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, azv $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dzz $$0, arq $$1, iu $$2, azv $$3) {
      int $$4 = $$0.c(b);
      if (!a((diy)$$1, $$2) && !$$1.r($$2.d())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.b(b, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((dib)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.b(b, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(div $$0, dzz $$1, iu $$2, bwd $$3, double $$4) {
      if ($$0 instanceof arq $$5
         && (double)$$0.A.i() < $$4 - 0.5
         && $$3 instanceof bxc
         && ($$3 instanceof cqy || $$5.O().c(dir.c))
         && $$3.dq() * $$3.dq() * $$3.dr() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable bwd $$0, dzz $$1, div $$2, iu $$3) {
      dzz $$4 = a($$1, dmc.j.m(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(eez.c, $$3, eez.a.a($$0, $$4));
   }

   private static boolean a(dib $$0, iu $$1) {
      return $$0.a_($$1.d()).a(axc.cC);
   }

   private static boolean a(diy $$0, iu $$1) {
      for (iu $$2 : iu.c($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(axh.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dzz $$0, ewv $$1) {
      return false;
   }
}
