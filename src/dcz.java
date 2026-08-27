import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcz extends dac {
   public static final MapCodec<dcz> a = b(dcz::new);
   public static final dob b = dnr.aQ;
   protected static final eqm c = dac.a(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
   public static final int d = 7;

   @Override
   public MapCodec<dcz> a() {
      return a;
   }

   protected dcz(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if ($$1 == ih.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dnb $$0, cxe $$1, ib $$2) {
      dnb $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof ddb || $$3.b() instanceof dmt;
   }

   @Override
   public dnb a(csu $$0) {
      return !this.o().a((cxe)$$0.q(), $$0.a()) ? dae.j.o() : super.a($$0);
   }

   @Override
   protected boolean g_(dnb $$0) {
      return true;
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return c;
   }

   @Override
   protected void a(dnb $$0, apf $$1, ib $$2, axd $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dnb $$0, apf $$1, ib $$2, axd $$3) {
      int $$4 = $$0.c(b);
      if (!a((cxe)$$1, $$2) && !$$1.r($$2.c())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.a(b, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((cwh)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(cxb $$0, dnb $$1, ib $$2, box $$3, float $$4) {
      if (!$$0.B && $$0.z.i() < $$4 - 0.5F && $$3 instanceof bpp && ($$3 instanceof ciu || $$0.Z().b(cwx.c)) && $$3.dg() * $$3.dg() * $$3.dh() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable box $$0, dnb $$1, cxb $$2, ib $$3) {
      dnb $$4 = a($$1, dae.j.o(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(drp.c, $$3, drp.a.a($$0, $$4));
   }

   private static boolean a(cwh $$0, ib $$1) {
      return $$0.a_($$1.c()).a(aun.cr);
   }

   private static boolean a(cxe $$0, ib $$1) {
      for (ib $$2 : ib.a($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(aus.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dnb $$0, cwh $$1, ib $$2, eje $$3) {
      return false;
   }
}
