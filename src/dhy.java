import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhy extends dfb {
   public static final MapCodec<dhy> a = b(dhy::new);
   public static final dte b = dsu.aQ;
   protected static final ewm c = dfb.a(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
   public static final int d = 7;

   @Override
   public MapCodec<dhy> a() {
      return a;
   }

   protected dhy(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      if ($$1 == je.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dse $$0, dcd $$1, iz $$2) {
      dse $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof dia || $$3.b() instanceof drw;
   }

   @Override
   public dse a(cyc $$0) {
      return !this.o().a((dcd)$$0.q(), $$0.a()) ? dfd.j.o() : super.a($$0);
   }

   @Override
   protected boolean f_(dse $$0) {
      return true;
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return c;
   }

   @Override
   protected void a(dse $$0, arf $$1, iz $$2, azh $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dse $$0, arf $$1, iz $$2, azh $$3) {
      int $$4 = $$0.c(b);
      if (!a((dcd)$$1, $$2) && !$$1.r($$2.c())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.a(b, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((dbg)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(dca $$0, dse $$1, iz $$2, bsw $$3, float $$4) {
      if (!$$0.B && $$0.z.i() < $$4 - 0.5F && $$3 instanceof btr && ($$3 instanceof cmz || $$0.ab().b(dbw.c)) && $$3.dj() * $$3.dj() * $$3.dk() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable bsw $$0, dse $$1, dca $$2, iz $$3) {
      dse $$4 = a($$1, dfd.j.o(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(dwx.c, $$3, dwx.a.a($$0, $$4));
   }

   private static boolean a(dbg $$0, iz $$1) {
      return $$0.a_($$1.c()).a(awp.cx);
   }

   private static boolean a(dcd $$0, iz $$1) {
      for (iz $$2 : iz.c($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(awv.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dse $$0, eom $$1) {
      return false;
   }
}
