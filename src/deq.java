import com.mojang.datafixers.util.Pair;
import javax.annotation.Nullable;

public class deq extends ddu {
   public deq(ddr $$0) {
      super($$0);
   }

   @Nullable
   private static Pair<czn, czn> c(dds $$0) {
      if ($$0.e() != 2) {
         return null;
      } else {
         czn $$1 = null;

         for (int $$2 = 0; $$2 < $$0.a(); $$2++) {
            czn $$3 = $$0.a($$2);
            if (!$$3.f()) {
               if ($$1 != null) {
                  return a($$1, $$3) ? Pair.of($$1, $$3) : null;
               }

               $$1 = $$3;
            }
         }

         return null;
      }
   }

   private static boolean a(czn $$0, czn $$1) {
      return $$1.a($$0.h()) && $$0.M() == 1 && $$1.M() == 1 && $$0.c(kk.d) && $$1.c(kk.d) && $$0.c(kk.e) && $$1.c(kk.e);
   }

   public boolean a(dds $$0, djm $$1) {
      return c($$0) != null;
   }

   public czn a(dds $$0, jh.a $$1) {
      Pair<czn, czn> $$2 = c($$0);
      if ($$2 == null) {
         return czn.k;
      } else {
         czn $$3 = (czn)$$2.getFirst();
         czn $$4 = (czn)$$2.getSecond();
         int $$5 = Math.max($$3.p(), $$4.p());
         int $$6 = $$3.p() - $$3.o();
         int $$7 = $$4.p() - $$4.o();
         int $$8 = $$6 + $$7 + $$5 * 5 / 100;
         czn $$9 = new czn($$3.h());
         $$9.b(kk.d, $$5);
         $$9.b(Math.max($$5 - $$8, 0));
         dgg $$10 = dgc.b($$3);
         dgg $$11 = dgc.b($$4);
         dgc.a($$9, $$3x -> $$1.e(mh.aR).c().filter($$0xx -> $$0xx.a(axe.o)).forEach($$3xx -> {
               int $$4x = Math.max($$10.a($$3xx), $$11.a($$3xx));
               if ($$4x > 0) {
                  $$3x.b($$3xx, $$4x);
               }
            }));
         return $$9;
      }
   }

   @Override
   public deo<deq> a() {
      return deo.n;
   }
}
