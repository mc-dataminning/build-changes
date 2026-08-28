import java.util.Optional;

public class azs {
   public static <T extends bvi> Optional<T> a(bur<T> $$0, buq $$1, ard $$2, ji $$3, int $$4, int $$5, int $$6, azs.a $$7, boolean $$8) {
      ji.a $$9 = $$3.k();

      for (int $$10 = 0; $$10 < $$4; $$10++) {
         int $$11 = ayz.b($$2.A, -$$5, $$5);
         int $$12 = ayz.b($$2.A, -$$5, $$5);
         $$9.a($$3, $$11, $$6, $$12);
         if ($$2.F_().a($$9) && a($$2, $$6, $$9, $$7) && (!$$8 || $$2.b($$0.a((double)$$9.u() + 0.5, (double)$$9.v(), (double)$$9.w() + 0.5)))) {
            T $$13 = (T)$$0.b($$2, null, $$9, $$1, false, false);
            if ($$13 != null) {
               if ($$13.a($$2, $$1) && $$13.a((dgk)$$2)) {
                  $$2.a_($$13);
                  $$13.U();
                  return Optional.of($$13);
               }

               $$13.at();
            }
         }
      }

      return Optional.empty();
   }

   private static boolean a(ard $$0, int $$1, ji.a $$2, azs.a $$3) {
      ji.a $$4 = new ji.a().g($$2);
      dww $$5 = $$0.a_($$4);

      for (int $$6 = $$1; $$6 >= -$$1; $$6--) {
         $$2.c(jn.a);
         $$4.a($$2, jn.b);
         dww $$7 = $$0.a_($$2);
         if ($$3.canSpawnOn($$0, $$2, $$7, $$4, $$5)) {
            $$2.c(jn.b);
            return true;
         }

         $$5 = $$7;
      }

      return false;
   }

   public interface a {
      @Deprecated
      azs.a a = ($$0, $$1, $$2, $$3, $$4) -> !$$2.a(djn.bz)
               && !$$2.a(djn.ed)
               && !$$2.a(djn.fm)
               && !($$2.b() instanceof drj)
               && !($$2.b() instanceof dri)
               && !($$2.b() instanceof dnx)
               && !$$2.a(djn.nz)
               && !$$2.a(djn.eb)
               && !$$2.a(djn.cr)
               && !$$2.a(djn.ep)
               && !$$2.a(djn.gj)
               && !$$2.a(djn.iG)
               && !$$2.a(djn.lk)
               && !$$2.a(djn.rq)
               && !$$2.a(djn.aX)
            ? ($$4.l() || $$4.n()) && ($$2.e() || $$2.a(djn.rr))
            : false;
      azs.a b = ($$0, $$1, $$2, $$3, $$4) -> $$4.g($$0, $$3).c() && djl.a($$2.g($$0, $$1), jn.b);
      azs.a c = ($$0, $$1, $$2, $$3, $$4) -> $$4.g($$0, $$3).c() && !$$2.a(awp.Q) && djl.a($$2.g($$0, $$1), jn.b);

      boolean canSpawnOn(ard var1, ji var2, dww var3, ji var4, dww var5);
   }
}
