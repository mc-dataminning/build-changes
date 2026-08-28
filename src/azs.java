import java.util.Optional;

public class azs {
   public static <T extends bwa> Optional<T> a(bvi<T> $$0, bvh $$1, ard $$2, ji $$3, int $$4, int $$5, int $$6, azs.a $$7, boolean $$8) {
      ji.a $$9 = $$3.k();

      for (int $$10 = 0; $$10 < $$4; $$10++) {
         int $$11 = ayz.b($$2.A, -$$5, $$5);
         int $$12 = ayz.b($$2.A, -$$5, $$5);
         $$9.a($$3, $$11, $$6, $$12);
         if ($$2.A_().a($$9) && a($$2, $$6, $$9, $$7) && (!$$8 || $$2.b($$0.a((double)$$9.u() + 0.5, (double)$$9.v(), (double)$$9.w() + 0.5)))) {
            T $$13 = (T)$$0.b($$2, null, $$9, $$1, false, false);
            if ($$13 != null) {
               if ($$13.a($$2, $$1) && $$13.a((dhc)$$2)) {
                  $$2.a_($$13);
                  $$13.T();
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
      dxq $$5 = $$0.a_($$4);

      for (int $$6 = $$1; $$6 >= -$$1; $$6--) {
         $$2.c(jn.a);
         $$4.a($$2, jn.b);
         dxq $$7 = $$0.a_($$2);
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
      azs.a a = ($$0, $$1, $$2, $$3, $$4) -> !$$2.a(dkg.bz)
               && !$$2.a(dkg.ed)
               && !$$2.a(dkg.fm)
               && !($$2.b() instanceof dsd)
               && !($$2.b() instanceof dsc)
               && !($$2.b() instanceof dos)
               && !$$2.a(dkg.nz)
               && !$$2.a(dkg.eb)
               && !$$2.a(dkg.cr)
               && !$$2.a(dkg.ep)
               && !$$2.a(dkg.gj)
               && !$$2.a(dkg.iG)
               && !$$2.a(dkg.lk)
               && !$$2.a(dkg.rq)
               && !$$2.a(dkg.aX)
            ? ($$4.l() || $$4.n()) && ($$2.e() || $$2.a(dkg.rr))
            : false;
      azs.a b = ($$0, $$1, $$2, $$3, $$4) -> $$4.g($$0, $$3).c() && dke.a($$2.g($$0, $$1), jn.b);
      azs.a c = ($$0, $$1, $$2, $$3, $$4) -> $$4.g($$0, $$3).c() && !$$2.a(awp.Q) && dke.a($$2.g($$0, $$1), jn.b);

      boolean canSpawnOn(ard var1, ji var2, dxq var3, ji var4, dxq var5);
   }
}
