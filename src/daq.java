import com.mojang.datafixers.util.Pair;
import javax.annotation.Nullable;

public class daq extends daa {
   public daq(czx $$0) {
      super($$0);
   }

   @Nullable
   private Pair<cvx, cvx> a(czy $$0) {
      cvx $$1 = null;
      cvx $$2 = null;

      for (int $$3 = 0; $$3 < $$0.a(); $$3++) {
         cvx $$4 = $$0.a($$3);
         if (!$$4.f()) {
            if ($$1 == null) {
               $$1 = $$4;
            } else {
               if ($$2 != null) {
                  return null;
               }

               $$2 = $$4;
            }
         }
      }

      return $$1 != null && $$2 != null && a($$1, $$2) ? Pair.of($$1, $$2) : null;
   }

   private static boolean a(cvx $$0, cvx $$1) {
      return $$1.a($$0.h()) && $$0.L() == 1 && $$1.L() == 1 && $$0.b(kt.d) && $$1.b(kt.d) && $$0.b(kt.e) && $$1.b(kt.e);
   }

   public boolean a(czy $$0, dev $$1) {
      return this.a($$0) != null;
   }

   public cvx a(czy $$0, jr.a $$1) {
      Pair<cvx, cvx> $$2 = this.a($$0);
      if ($$2 == null) {
         return cvx.k;
      } else {
         cvx $$3 = (cvx)$$2.getFirst();
         cvx $$4 = (cvx)$$2.getSecond();
         int $$5 = Math.max($$3.p(), $$4.p());
         int $$6 = $$3.p() - $$3.o();
         int $$7 = $$4.p() - $$4.o();
         int $$8 = $$6 + $$7 + $$5 * 5 / 100;
         cvx $$9 = new cvx($$3.h());
         $$9.b(kt.d, $$5);
         $$9.b(Math.max($$5 - $$8, 0));
         dbs $$10 = dbo.b($$3);
         dbs $$11 = dbo.b($$4);
         dbo.a($$9, $$3x -> $$1.d(ly.aM).c().filter($$0xx -> $$0xx.a(axc.o)).forEach($$3xx -> {
               int $$4x = Math.max($$10.a($$3xx), $$11.a($$3xx));
               if ($$4x > 0) {
                  $$3x.b($$3xx, $$4x);
               }
            }));
         return $$9;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public dao<?> ar_() {
      return dao.n;
   }
}
