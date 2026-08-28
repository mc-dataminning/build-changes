import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnb extends dkd {
   public static final MapCodec<dnb> a = b(dnb::new);
   public static final dyn b = dye.aT;
   protected static final fcl c = dkd.a(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
   public static final int d = 7;

   @Override
   public MapCodec<dnb> a() {
      return a;
   }

   protected dnb(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      if ($$4 == jm.b && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxo $$0, dhc $$1, jh $$2) {
      dxo $$3 = $$1.a_($$2.d());
      return !$$3.e() || $$3.b() instanceof dnd || $$3.b() instanceof dxg;
   }

   @Override
   public dxo a(dax $$0) {
      return !this.m().a((dhc)$$0.q(), $$0.a()) ? dkf.j.m() : super.a($$0);
   }

   @Override
   protected boolean g_(dxo $$0) {
      return true;
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return c;
   }

   @Override
   protected void a(dxo $$0, arx $$1, jh $$2, bac $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dxo $$0, arx $$1, jh $$2, bac $$3) {
      int $$4 = $$0.c(b);
      if (!a((dhc)$$1, $$2) && !$$1.r($$2.d())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.b(b, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((dge)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.b(b, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(dgz $$0, dxo $$1, jh $$2, bvb $$3, float $$4) {
      if ($$0 instanceof arx $$5
         && $$0.A.i() < $$4 - 0.5F
         && $$3 instanceof bvx
         && ($$3 instanceof cpo || $$5.O().b(dgv.c))
         && $$3.dr() * $$3.dr() * $$3.ds() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable bvb $$0, dxo $$1, dgz $$2, jh $$3) {
      dxo $$4 = a($$1, dkf.j.m(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(eck.c, $$3, eck.a.a($$0, $$4));
   }

   private static boolean a(dge $$0, jh $$1) {
      return $$0.a_($$1.d()).a(axk.cA);
   }

   private static boolean a(dhc $$0, jh $$1) {
      for (jh $$2 : jh.c($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(axq.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dxo $$0, euf $$1) {
      return false;
   }
}
