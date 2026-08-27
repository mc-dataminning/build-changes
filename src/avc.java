import java.util.Optional;

public class avc {
   public static <T extends bmh> Optional<T> a(blt<T> $$0, bmj $$1, amz $$2, hx $$3, int $$4, int $$5, int $$6, avc.a $$7) {
      hx.a $$8 = $$3.j();

      for (int $$9 = 0; $$9 < $$4; $$9++) {
         int $$10 = aui.b($$2.z, -$$5, $$5);
         int $$11 = aui.b($$2.z, -$$5, $$5);
         $$8.a($$3, $$10, $$6, $$11);
         if ($$2.D_().a($$8) && a($$2, $$6, $$8, $$7)) {
            T $$12 = (T)$$0.b($$2, null, null, $$8, $$1, false, false);
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

   private static boolean a(amz $$0, int $$1, hx.a $$2, avc.a $$3) {
      hx.a $$4 = new hx.a().g($$2);
      dja $$5 = $$0.a_($$4);

      for (int $$6 = $$1; $$6 >= -$$1; $$6--) {
         $$2.c(ic.a);
         $$4.a($$2, ic.b);
         dja $$7 = $$0.a_($$2);
         if ($$3.canSpawnOn($$0, $$2, $$7, $$4, $$5)) {
            $$2.c(ic.b);
            return true;
         }

         $$5 = $$7;
      }

      return false;
   }

   public interface a {
      @Deprecated
      avc.a a = ($$0, $$1, $$2, $$3, $$4) -> !$$2.a(cwl.bs)
               && !$$2.a(cwl.dQ)
               && !$$2.a(cwl.eY)
               && !($$2.b() instanceof deb)
               && !($$2.b() instanceof dea)
               && !($$2.b() instanceof das)
               && !$$2.a(cwl.mX)
               && !$$2.a(cwl.dO)
               && !$$2.a(cwl.ck)
               && !$$2.a(cwl.ec)
               && !$$2.a(cwl.fO)
               && !$$2.a(cwl.ii)
               && !$$2.a(cwl.kI)
               && !$$2.a(cwl.qO)
               && !$$2.a(cwl.aQ)
            ? ($$4.i() || $$4.k()) && ($$2.e() || $$2.a(cwl.qP))
            : false;
      avc.a b = ($$0, $$1, $$2, $$3, $$4) -> $$4.k($$0, $$3).c() && cwj.a($$2.k($$0, $$1), ic.b);

      boolean canSpawnOn(amz var1, hx var2, dja var3, hx var4, dja var5);
   }
}
