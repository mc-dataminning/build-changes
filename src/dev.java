import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dev extends dby {
   public static final MapCodec<dev> a = b(dev::new);
   public static final dpz b = dpp.aQ;
   protected static final est c = dby.a(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
   public static final int d = 7;

   @Override
   public MapCodec<dev> a() {
      return a;
   }

   protected dev(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      if ($$1 == ih.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(doz $$0, cza $$1, ib $$2) {
      doz $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof dex || $$3.b() instanceof dor;
   }

   @Override
   public doz a(cuo $$0) {
      return !this.n().a((cza)$$0.q(), $$0.a()) ? dca.j.n() : super.a($$0);
   }

   @Override
   protected boolean g_(doz $$0) {
      return true;
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return c;
   }

   @Override
   protected void a(doz $$0, aps $$1, ib $$2, axr $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   protected void b(doz $$0, aps $$1, ib $$2, axr $$3) {
      int $$4 = $$0.c(b);
      if (!a((cza)$$1, $$2) && !$$1.r($$2.c())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.a(b, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((cyd)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(cyx $$0, doz $$1, ib $$2, bpv $$3, float $$4) {
      if (!$$0.B && $$0.z.i() < $$4 - 0.5F && $$3 instanceof bqo && ($$3 instanceof cjt || $$0.aa().b(cyt.c)) && $$3.dg() * $$3.dg() * $$3.dh() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable bpv $$0, doz $$1, cyx $$2, ib $$3) {
      doz $$4 = a($$1, dca.j.n(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(dts.c, $$3, dts.a.a($$0, $$4));
   }

   private static boolean a(cyd $$0, ib $$1) {
      return $$0.a_($$1.c()).a(avc.cr);
   }

   private static boolean a(cza $$0, ib $$1) {
      for (ib $$2 : ib.a($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(avh.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(doz $$0, elh $$1) {
      return false;
   }
}
