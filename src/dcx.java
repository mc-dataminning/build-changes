import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcx extends daa {
   public static final MapCodec<dcx> a = b(dcx::new);
   public static final dnz b = dnp.aQ;
   protected static final eqk c = daa.a(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
   public static final int d = 7;

   @Override
   public MapCodec<dcx> a() {
      return a;
   }

   protected dcx(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      if ($$1 == ih.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dmz $$0, cxc $$1, ib $$2) {
      dmz $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof dcz || $$3.b() instanceof dmr;
   }

   @Override
   public dmz a(css $$0) {
      return !this.o().a((cxc)$$0.q(), $$0.a()) ? dac.j.o() : super.a($$0);
   }

   @Override
   protected boolean g_(dmz $$0) {
      return true;
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return c;
   }

   @Override
   protected void a(dmz $$0, apf $$1, ib $$2, axd $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dmz $$0, apf $$1, ib $$2, axd $$3) {
      int $$4 = $$0.c(b);
      if (!a((cxc)$$1, $$2) && !$$1.r($$2.c())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.a(b, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((cwf)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(cwz $$0, dmz $$1, ib $$2, bow $$3, float $$4) {
      if (!$$0.B && $$0.z.i() < $$4 - 0.5F && $$3 instanceof bpo && ($$3 instanceof cis || $$0.Z().b(cwv.c)) && $$3.dg() * $$3.dg() * $$3.dh() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable bow $$0, dmz $$1, cwz $$2, ib $$3) {
      dmz $$4 = a($$1, dac.j.o(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(drn.c, $$3, drn.a.a($$0, $$4));
   }

   private static boolean a(cwf $$0, ib $$1) {
      return $$0.a_($$1.c()).a(aun.cr);
   }

   private static boolean a(cxc $$0, ib $$1) {
      for (ib $$2 : ib.a($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(aus.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dmz $$0, cwf $$1, ib $$2, ejd $$3) {
      return false;
   }
}
