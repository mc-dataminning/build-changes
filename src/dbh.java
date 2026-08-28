import com.mojang.datafixers.util.Pair;
import javax.annotation.Nullable;

public class dbh extends dar {
   public dbh(dao $$0) {
      super($$0);
   }

   @Nullable
   private Pair<cwm, cwm> a(dap $$0) {
      cwm $$1 = null;
      cwm $$2 = null;

      for (int $$3 = 0; $$3 < $$0.a(); $$3++) {
         cwm $$4 = $$0.a($$3);
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

   private static boolean a(cwm $$0, cwm $$1) {
      return $$1.a($$0.h()) && $$0.L() == 1 && $$1.L() == 1 && $$0.b(ku.d) && $$1.b(ku.d) && $$0.b(ku.e) && $$1.b(ku.e);
   }

   public boolean a(dap $$0, dfm $$1) {
      return this.a($$0) != null;
   }

   public cwm a(dap $$0, js.a $$1) {
      Pair<cwm, cwm> $$2 = this.a($$0);
      if ($$2 == null) {
         return cwm.k;
      } else {
         cwm $$3 = (cwm)$$2.getFirst();
         cwm $$4 = (cwm)$$2.getSecond();
         int $$5 = Math.max($$3.p(), $$4.p());
         int $$6 = $$3.p() - $$3.o();
         int $$7 = $$4.p() - $$4.o();
         int $$8 = $$6 + $$7 + $$5 * 5 / 100;
         cwm $$9 = new cwm($$3.h());
         $$9.b(ku.d, $$5);
         $$9.b(Math.max($$5 - $$8, 0));
         dcj $$10 = dcf.b($$3);
         dcj $$11 = dcf.b($$4);
         dcf.a($$9, $$3x -> $$1.d(ma.aM).c().filter($$0xx -> $$0xx.a(axf.o)).forEach($$3xx -> {
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
   public dbf<?> ap_() {
      return dbf.n;
   }
}
