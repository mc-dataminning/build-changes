import java.util.Optional;

public class ayo {
   public static <T extends brg> Optional<T> a(bqr<T> $$0, bri $$1, aqe $$2, im $$3, int $$4, int $$5, int $$6, ayo.a $$7) {
      im.a $$8 = $$3.j();

      for (int $$9 = 0; $$9 < $$4; $$9++) {
         int $$10 = axw.b($$2.z, -$$5, $$5);
         int $$11 = axw.b($$2.z, -$$5, $$5);
         $$8.a($$3, $$10, $$6, $$11);
         if ($$2.C_().a($$8) && a($$2, $$6, $$8, $$7)) {
            T $$12 = (T)$$0.b($$2, null, $$8, $$1, false, false);
            if ($$12 != null) {
               if ($$12.a($$2, $$1) && $$12.a($$2)) {
                  $$2.a_($$12);
                  return Optional.of($$12);
               }

               $$12.am();
            }
         }
      }

      return Optional.empty();
   }

   private static boolean a(aqe $$0, int $$1, im.a $$2, ayo.a $$3) {
      im.a $$4 = new im.a().g($$2);
      dpy $$5 = $$0.a_($$4);

      for (int $$6 = $$1; $$6 >= -$$1; $$6--) {
         $$2.c(ir.a);
         $$4.a($$2, ir.b);
         dpy $$7 = $$0.a_($$2);
         if ($$3.canSpawnOn($$0, $$2, $$7, $$4, $$5)) {
            $$2.c(ir.b);
            return true;
         }

         $$5 = $$7;
      }

      return false;
   }

   public interface a {
      @Deprecated
      ayo.a a = ($$0, $$1, $$2, $$3, $$4) -> !$$2.a(dcx.bs)
               && !$$2.a(dcx.dQ)
               && !$$2.a(dcx.eY)
               && !($$2.b() instanceof dko)
               && !($$2.b() instanceof dkn)
               && !($$2.b() instanceof dhf)
               && !$$2.a(dcx.mX)
               && !$$2.a(dcx.dO)
               && !$$2.a(dcx.ck)
               && !$$2.a(dcx.ec)
               && !$$2.a(dcx.fO)
               && !$$2.a(dcx.ii)
               && !$$2.a(dcx.kI)
               && !$$2.a(dcx.qO)
               && !$$2.a(dcx.aQ)
            ? ($$4.i() || $$4.k()) && ($$2.e() || $$2.a(dcx.qP))
            : false;
      ayo.a b = ($$0, $$1, $$2, $$3, $$4) -> $$4.k($$0, $$3).c() && dcv.a($$2.k($$0, $$1), ir.b);

      boolean canSpawnOn(aqe var1, im var2, dpy var3, im var4, dpy var5);
   }
}
