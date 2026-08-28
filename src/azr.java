import java.util.Optional;

public class azr {
   public static <T extends bvh> Optional<T> a(buq<T> $$0, bup $$1, arc $$2, ji $$3, int $$4, int $$5, int $$6, azr.a $$7, boolean $$8) {
      ji.a $$9 = $$3.k();

      for (int $$10 = 0; $$10 < $$4; $$10++) {
         int $$11 = ayy.b($$2.A, -$$5, $$5);
         int $$12 = ayy.b($$2.A, -$$5, $$5);
         $$9.a($$3, $$11, $$6, $$12);
         if ($$2.F_().a($$9) && a($$2, $$6, $$9, $$7) && (!$$8 || $$2.b($$0.a((double)$$9.u() + 0.5, (double)$$9.v(), (double)$$9.w() + 0.5)))) {
            T $$13 = (T)$$0.b($$2, null, $$9, $$1, false, false);
            if ($$13 != null) {
               if ($$13.a($$2, $$1) && $$13.a((dgj)$$2)) {
                  $$2.a_($$13);
                  $$13.R();
                  return Optional.of($$13);
               }

               $$13.at();
            }
         }
      }

      return Optional.empty();
   }

   private static boolean a(arc $$0, int $$1, ji.a $$2, azr.a $$3) {
      ji.a $$4 = new ji.a().g($$2);
      dwv $$5 = $$0.a_($$4);

      for (int $$6 = $$1; $$6 >= -$$1; $$6--) {
         $$2.c(jn.a);
         $$4.a($$2, jn.b);
         dwv $$7 = $$0.a_($$2);
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
      azr.a a = ($$0, $$1, $$2, $$3, $$4) -> !$$2.a(djm.bz)
               && !$$2.a(djm.ed)
               && !$$2.a(djm.fm)
               && !($$2.b() instanceof dri)
               && !($$2.b() instanceof drh)
               && !($$2.b() instanceof dnw)
               && !$$2.a(djm.nz)
               && !$$2.a(djm.eb)
               && !$$2.a(djm.cr)
               && !$$2.a(djm.ep)
               && !$$2.a(djm.gj)
               && !$$2.a(djm.iG)
               && !$$2.a(djm.lk)
               && !$$2.a(djm.rq)
               && !$$2.a(djm.aX)
            ? ($$4.l() || $$4.n()) && ($$2.e() || $$2.a(djm.rr))
            : false;
      azr.a b = ($$0, $$1, $$2, $$3, $$4) -> $$4.g($$0, $$3).c() && djk.a($$2.g($$0, $$1), jn.b);
      azr.a c = ($$0, $$1, $$2, $$3, $$4) -> $$4.g($$0, $$3).c() && !$$2.a(awo.Q) && djk.a($$2.g($$0, $$1), jn.b);

      boolean canSpawnOn(arc var1, ji var2, dwv var3, ji var4, dwv var5);
   }
}
