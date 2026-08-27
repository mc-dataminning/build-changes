import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcc extends czf {
   public static final MapCodec<dcc> a = b(dcc::new);
   public static final dne b = dmu.aQ;
   protected static final epo c = czf.a(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
   public static final int d = 7;

   @Override
   public MapCodec<dcc> a() {
      return a;
   }

   protected dcc(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      if ($$1 == ih.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dme $$0, cwh $$1, ib $$2) {
      dme $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof dce || $$3.b() instanceof dlw;
   }

   @Override
   public dme a(crx $$0) {
      return !this.o().a((cwh)$$0.q(), $$0.a()) ? czh.j.o() : super.a($$0);
   }

   @Override
   protected boolean g_(dme $$0) {
      return true;
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return c;
   }

   @Override
   protected void a(dme $$0, apa $$1, ib $$2, awt $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dme $$0, apa $$1, ib $$2, awt $$3) {
      int $$4 = $$0.c(b);
      if (!a((cwh)$$1, $$2) && !$$1.r($$2.c())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.a(b, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((cvk)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(cwe $$0, dme $$1, ib $$2, bof $$3, float $$4) {
      if (!$$0.B && $$0.z.i() < $$4 - 0.5F && $$3 instanceof box && ($$3 instanceof cia || $$0.Z().b(cwa.c)) && $$3.dd() * $$3.dd() * $$3.de() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable bof $$0, dme $$1, cwe $$2, ib $$3) {
      dme $$4 = a($$1, czh.j.o(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(dqr.c, $$3, dqr.a.a($$0, $$4));
   }

   private static boolean a(cvk $$0, ib $$1) {
      return $$0.a_($$1.c()).a(aue.cq);
   }

   private static boolean a(cwh $$0, ib $$1) {
      for (ib $$2 : ib.a($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(auj.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dme $$0, cvk $$1, ib $$2, eih $$3) {
      return false;
   }
}
