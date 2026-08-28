import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnj extends dkl {
   public static final MapCodec<dnj> a = b(dnj::new);
   public static final dyt b = dyk.aR;
   protected static final fcr c = dkl.a(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
   public static final int d = 7;

   @Override
   public MapCodec<dnj> a() {
      return a;
   }

   protected dnj(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      if ($$4 == jm.b && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxu $$0, dhk $$1, jh $$2) {
      dxu $$3 = $$1.a_($$2.d());
      return !$$3.e() || $$3.b() instanceof dnl || $$3.b() instanceof dxm;
   }

   @Override
   public dxu a(dbf $$0) {
      return !this.m().a((dhk)$$0.q(), $$0.a()) ? dkn.j.m() : super.a($$0);
   }

   @Override
   protected boolean g_(dxu $$0) {
      return true;
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return c;
   }

   @Override
   protected void a(dxu $$0, ash $$1, jh $$2, bam $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dxu $$0, ash $$1, jh $$2, bam $$3) {
      int $$4 = $$0.c(b);
      if (!a((dhk)$$1, $$2) && !$$1.r($$2.d())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.b(b, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((dgm)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.b(b, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(dhh $$0, dxu $$1, jh $$2, bvj $$3, float $$4) {
      if ($$0 instanceof ash $$5
         && $$0.A.i() < $$4 - 0.5F
         && $$3 instanceof bwf
         && ($$3 instanceof cpw || $$5.N().b(dhd.c))
         && $$3.dq() * $$3.dq() * $$3.dr() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable bvj $$0, dxu $$1, dhh $$2, jh $$3) {
      dxu $$4 = a($$1, dkn.j.m(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(ecq.c, $$3, ecq.a.a($$0, $$4));
   }

   private static boolean a(dgm $$0, jh $$1) {
      return $$0.a_($$1.d()).a(axu.cA);
   }

   private static boolean a(dhk $$0, jh $$1) {
      for (jh $$2 : jh.c($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(aya.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dxu $$0, eul $$1) {
      return false;
   }
}
