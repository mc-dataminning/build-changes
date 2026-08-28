import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnk extends dkm {
   public static final MapCodec<dnk> a = b(dnk::new);
   public static final dyu b = dyl.aR;
   protected static final fcs c = dkm.a(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
   public static final int d = 7;

   @Override
   public MapCodec<dnk> a() {
      return a;
   }

   protected dnk(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      if ($$4 == jm.b && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxv $$0, dhl $$1, jh $$2) {
      dxv $$3 = $$1.a_($$2.d());
      return !$$3.e() || $$3.b() instanceof dnm || $$3.b() instanceof dxn;
   }

   @Override
   public dxv a(dbg $$0) {
      return !this.m().a((dhl)$$0.q(), $$0.a()) ? dko.j.m() : super.a($$0);
   }

   @Override
   protected boolean g_(dxv $$0) {
      return true;
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return c;
   }

   @Override
   protected void a(dxv $$0, ash $$1, jh $$2, bam $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dxv $$0, ash $$1, jh $$2, bam $$3) {
      int $$4 = $$0.c(b);
      if (!a((dhl)$$1, $$2) && !$$1.r($$2.d())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.b(b, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((dgn)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.b(b, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(dhi $$0, dxv $$1, jh $$2, bvk $$3, float $$4) {
      if ($$0 instanceof ash $$5
         && $$0.A.i() < $$4 - 0.5F
         && $$3 instanceof bwg
         && ($$3 instanceof cpx || $$5.N().b(dhe.c))
         && $$3.dr() * $$3.dr() * $$3.ds() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable bvk $$0, dxv $$1, dhi $$2, jh $$3) {
      dxv $$4 = a($$1, dko.j.m(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(ecr.c, $$3, ecr.a.a($$0, $$4));
   }

   private static boolean a(dgn $$0, jh $$1) {
      return $$0.a_($$1.d()).a(axu.cA);
   }

   private static boolean a(dhl $$0, jh $$1) {
      for (jh $$2 : jh.c($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(aya.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dxv $$0, eum $$1) {
      return false;
   }
}
