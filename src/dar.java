import com.mojang.datafixers.util.Pair;
import javax.annotation.Nullable;

public class dar extends dab {
   public dar(czy $$0) {
      super($$0);
   }

   @Nullable
   private Pair<cvs, cvs> a(czz $$0) {
      cvs $$1 = null;
      cvs $$2 = null;

      for (int $$3 = 0; $$3 < $$0.a(); $$3++) {
         cvs $$4 = $$0.a($$3);
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

   private static boolean a(cvs $$0, cvs $$1) {
      return $$1.a($$0.h()) && $$0.K() == 1 && $$1.K() == 1 && $$0.b(ks.d) && $$1.b(ks.d) && $$0.b(ks.e) && $$1.b(ks.e);
   }

   public boolean a(czz $$0, dej $$1) {
      return this.a($$0) != null;
   }

   public cvs a(czz $$0, jq.a $$1) {
      Pair<cvs, cvs> $$2 = this.a($$0);
      if ($$2 == null) {
         return cvs.k;
      } else {
         cvs $$3 = (cvs)$$2.getFirst();
         cvs $$4 = (cvs)$$2.getSecond();
         int $$5 = Math.max($$3.p(), $$4.p());
         int $$6 = $$3.p() - $$3.o();
         int $$7 = $$4.p() - $$4.o();
         int $$8 = $$6 + $$7 + $$5 * 5 / 100;
         cvs $$9 = new cvs($$3.h());
         $$9.b(ks.d, $$5);
         $$9.b(Math.max($$5 - $$8, 0));
         dbt $$10 = dbp.b($$3);
         dbt $$11 = dbp.b($$4);
         dbp.a($$9, $$3x -> $$1.d(lw.aN).c().filter($$0xx -> $$0xx.a(awy.o)).forEach($$3xx -> {
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
   public dap<?> ar_() {
      return dap.n;
   }
}
