import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpe extends dmf {
   public static final MapCodec<dpe> a = b(dpe::new);
   public static final ebh b = eax.aT;
   private static final ffk d = dmf.b(16.0, 0.0, 15.0);
   public static final int c = 7;

   @Override
   public MapCodec<dpe> a() {
      return a;
   }

   protected dpe(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      if ($$4 == ja.b && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(eah $$0, djd $$1, iu $$2) {
      eah $$3 = $$1.a_($$2.d());
      return !$$3.e() || $$3.b() instanceof dpg || $$3.b() instanceof dzy;
   }

   @Override
   public eah a(dcw $$0) {
      return !this.m().a((djd)$$0.q(), $$0.a()) ? dmh.j.m() : super.a($$0);
   }

   @Override
   protected boolean g_(eah $$0) {
      return true;
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return d;
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, azv $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   protected void b(eah $$0, arq $$1, iu $$2, azv $$3) {
      int $$4 = $$0.c(b);
      if (!a((djd)$$1, $$2) && !$$1.r($$2.d())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.b(b, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((dig)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.b(b, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(dja $$0, eah $$1, iu $$2, bwf $$3, double $$4) {
      if ($$0 instanceof arq $$5
         && (double)$$0.A.i() < $$4 - 0.5
         && $$3 instanceof bxe
         && ($$3 instanceof crc || $$5.O().c(diw.d))
         && $$3.dq() * $$3.dq() * $$3.dr() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable bwf $$0, eah $$1, dja $$2, iu $$3) {
      eah $$4 = a($$1, dmh.j.m(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(efh.c, $$3, efh.a.a($$0, $$4));
   }

   private static boolean a(dig $$0, iu $$1) {
      return $$0.a_($$1.d()).a(axc.cD);
   }

   private static boolean a(djd $$0, iu $$1) {
      for (iu $$2 : iu.c($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(axh.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(eah $$0, exd $$1) {
      return false;
   }
}
