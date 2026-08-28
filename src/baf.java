import java.util.Optional;

public class baf {
   public static <T extends bxb> Optional<T> a(bwj<T> $$0, bwi $$1, aro $$2, iu $$3, int $$4, int $$5, int $$6, baf.a $$7, boolean $$8) {
      iu.a $$9 = $$3.k();

      for (int $$10 = 0; $$10 < $$4; $$10++) {
         int $$11 = azk.b($$2.A, -$$5, $$5);
         int $$12 = azk.b($$2.A, -$$5, $$5);
         $$9.a($$3, $$11, $$6, $$12);
         if ($$2.A_().a($$9) && a($$2, $$6, $$9, $$7) && (!$$8 || $$2.b($$0.a((double)$$9.u() + 0.5, (double)$$9.v(), (double)$$9.w() + 0.5)))) {
            T $$13 = (T)$$0.b($$2, null, $$9, $$1, false, false);
            if ($$13 != null) {
               if ($$13.a($$2, $$1) && $$13.a((dis)$$2)) {
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

   private static boolean a(aro $$0, int $$1, iu.a $$2, baf.a $$3) {
      iu.a $$4 = new iu.a().g($$2);
      dzo $$5 = $$0.a_($$4);

      for (int $$6 = $$1; $$6 >= -$$1; $$6--) {
         $$2.c(ja.a);
         $$4.a($$2, ja.b);
         dzo $$7 = $$0.a_($$2);
         if ($$3.canSpawnOn($$0, $$2, $$7, $$4, $$5)) {
            $$2.c(ja.b);
            return true;
         }

         $$5 = $$7;
      }

      return false;
   }

   public interface a {
      @Deprecated
      baf.a a = ($$0, $$1, $$2, $$3, $$4) -> !$$2.a(dlw.bz)
               && !$$2.a(dlw.ed)
               && !$$2.a(dlw.fm)
               && !($$2.b() instanceof dtt)
               && !($$2.b() instanceof dts)
               && !($$2.b() instanceof dqi)
               && !$$2.a(dlw.nz)
               && !$$2.a(dlw.eb)
               && !$$2.a(dlw.cr)
               && !$$2.a(dlw.ep)
               && !$$2.a(dlw.gj)
               && !$$2.a(dlw.iG)
               && !$$2.a(dlw.lk)
               && !$$2.a(dlw.rs)
               && !$$2.a(dlw.aX)
            ? ($$4.l() || $$4.n()) && ($$2.e() || $$2.a(dlw.rt))
            : false;
      baf.a b = ($$0, $$1, $$2, $$3, $$4) -> $$4.g($$0, $$3).c() && dlu.a($$2.g($$0, $$1), ja.b);
      baf.a c = ($$0, $$1, $$2, $$3, $$4) -> $$4.g($$0, $$3).c() && !$$2.a(axa.Q) && dlu.a($$2.g($$0, $$1), ja.b);

      boolean canSpawnOn(aro var1, iu var2, dzo var3, iu var4, dzo var5);
   }
}
