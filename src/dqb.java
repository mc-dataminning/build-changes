import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqb extends dnc {
   public static final MapCodec<dqb> a = b(dqb::new);
   public static final ece b = ebu.aT;
   private static final fgk d = dnc.b(16.0, 0.0, 15.0);
   public static final int c = 7;

   @Override
   public MapCodec<dqb> a() {
      return a;
   }

   protected dqb(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if ($$4 == jb.b && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(ebe $$0, dka $$1, iv $$2) {
      ebe $$3 = $$1.a_($$2.d());
      return !$$3.e() || $$3.b() instanceof dqd || $$3.b() instanceof eav;
   }

   @Override
   public ebe a(ddr $$0) {
      return !this.m().a((dka)$$0.q(), $$0.a()) ? dne.j.m() : super.a($$0);
   }

   @Override
   protected boolean g_(ebe $$0) {
      return true;
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return d;
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, azx $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   protected void b(ebe $$0, ars $$1, iv $$2, azx $$3) {
      int $$4 = $$0.c(b);
      if (!a((dka)$$1, $$2) && !$$1.r($$2.d())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.b(b, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((djb)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.b(b, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(djx $$0, ebe $$1, iv $$2, bwt $$3, double $$4) {
      if ($$0 instanceof ars $$5
         && (double)$$0.A.i() < $$4 - 0.5
         && $$3 instanceof bxu
         && ($$3 instanceof crx || $$5.O().c(djt.d))
         && $$3.dq() * $$3.dq() * $$3.dr() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable bwt $$0, ebe $$1, djx $$2, iv $$3) {
      ebe $$4 = a($$1, dne.j.m(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(ege.c, $$3, ege.a.a($$0, $$4));
   }

   private static boolean a(djb $$0, iv $$1) {
      return $$0.a_($$1.d()).a(axe.cE);
   }

   private static boolean a(dka $$0, iv $$1) {
      for (iv $$2 : iv.c($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(axj.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(ebe $$0, eyd $$1) {
      return false;
   }
}
