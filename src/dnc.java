import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnc extends dke {
   public static final MapCodec<dnc> a = b(dnc::new);
   public static final dym b = dyd.aR;
   protected static final fcm c = dke.a(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
   public static final int d = 7;

   @Override
   public MapCodec<dnc> a() {
      return a;
   }

   protected dnc(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      if ($$4 == jm.b && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxn $$0, dhd $$1, jh $$2) {
      dxn $$3 = $$1.a_($$2.d());
      return !$$3.e() || $$3.b() instanceof dne || $$3.b() instanceof dxf;
   }

   @Override
   public dxn a(dbb $$0) {
      return !this.m().a((dhd)$$0.q(), $$0.a()) ? dkg.j.m() : super.a($$0);
   }

   @Override
   protected boolean g_(dxn $$0) {
      return true;
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return c;
   }

   @Override
   protected void a(dxn $$0, ash $$1, jh $$2, bam $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dxn $$0, ash $$1, jh $$2, bam $$3) {
      int $$4 = $$0.c(b);
      if (!a((dhd)$$1, $$2) && !$$1.r($$2.d())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.b(b, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((dgf)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.b(b, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(dha $$0, dxn $$1, jh $$2, bvf $$3, float $$4) {
      if ($$0 instanceof ash $$5
         && $$0.A.i() < $$4 - 0.5F
         && $$3 instanceof bwb
         && ($$3 instanceof cps || $$5.N().b(dgw.c))
         && $$3.dq() * $$3.dq() * $$3.dr() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable bvf $$0, dxn $$1, dha $$2, jh $$3) {
      dxn $$4 = a($$1, dkg.j.m(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(ecj.c, $$3, ecj.a.a($$0, $$4));
   }

   private static boolean a(dgf $$0, jh $$1) {
      return $$0.a_($$1.d()).a(axu.cA);
   }

   private static boolean a(dhd $$0, jh $$1) {
      for (jh $$2 : jh.c($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(aya.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dxn $$0, eue $$1) {
      return false;
   }
}
