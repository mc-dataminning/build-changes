import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnc extends dke {
   public static final MapCodec<dnc> a = b(dnc::new);
   public static final dyq b = dyg.aT;
   private static final fcr d = dke.b(16.0, 0.0, 15.0);
   public static final int c = 7;

   @Override
   public MapCodec<dnc> a() {
      return a;
   }

   protected dnc(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      if ($$4 == jn.b && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      dxq $$3 = $$1.a_($$2.d());
      return !$$3.e() || $$3.b() instanceof dne || $$3.b() instanceof dxi;
   }

   @Override
   public dxq a(dax $$0) {
      return !this.m().a((dhc)$$0.q(), $$0.a()) ? dkg.j.m() : super.a($$0);
   }

   @Override
   protected boolean g_(dxq $$0) {
      return true;
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return d;
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, azh $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dxq $$0, ard $$1, ji $$2, azh $$3) {
      int $$4 = $$0.c(b);
      if (!a((dhc)$$1, $$2) && !$$1.r($$2.d())) {
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
   public void a(dgz $$0, dxq $$1, ji $$2, bva $$3, float $$4) {
      if ($$0 instanceof ard $$5
         && $$0.A.i() < $$4 - 0.5F
         && $$3 instanceof bvy
         && ($$3 instanceof cpr || $$5.O().b(dgv.c))
         && $$3.dp() * $$3.dp() * $$3.dq() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable bva $$0, dxq $$1, dgz $$2, ji $$3) {
      dxq $$4 = a($$1, dkg.j.m(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(ecp.c, $$3, ecp.a.a($$0, $$4));
   }

   private static boolean a(dgf $$0, ji $$1) {
      return $$0.a_($$1.d()).a(awp.cC);
   }

   private static boolean a(dhc $$0, ji $$1) {
      for (ji $$2 : ji.c($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(awv.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dxq $$0, eul $$1) {
      return false;
   }
}
