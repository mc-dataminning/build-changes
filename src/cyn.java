import com.mojang.datafixers.util.Pair;
import javax.annotation.Nullable;

public class cyn extends cxy {
   public cyn(cxv $$0) {
      super($$0);
   }

   @Nullable
   private Pair<cua, cua> a(cxw $$0) {
      cua $$1 = null;
      cua $$2 = null;

      for (int $$3 = 0; $$3 < $$0.a(); $$3++) {
         cua $$4 = $$0.a($$3);
         if (!$$4.e()) {
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

   private static boolean a(cua $$0, cua $$1) {
      return $$1.a($$0.g()) && $$0.H() == 1 && $$1.H() == 1 && $$0.b(kn.d) && $$1.b(kn.d) && $$0.b(kn.e) && $$1.b(kn.e);
   }

   public boolean a(cxw $$0, dcd $$1) {
      return this.a($$0) != null;
   }

   public cua a(cxw $$0, jl.a $$1) {
      Pair<cua, cua> $$2 = this.a($$0);
      if ($$2 == null) {
         return cua.l;
      } else {
         cua $$3 = (cua)$$2.getFirst();
         cua $$4 = (cua)$$2.getSecond();
         int $$5 = Math.max($$3.o(), $$4.o());
         int $$6 = $$3.o() - $$3.n();
         int $$7 = $$4.o() - $$4.n();
         int $$8 = $$6 + $$7 + $$5 * 5 / 100;
         cua $$9 = new cua($$3.g());
         $$9.b(kn.d, Integer.valueOf($$5));
         $$9.b(Math.max($$5 - $$8, 0));
         czp $$10 = czl.b($$3);
         czp $$11 = czl.b($$4);
         czl.a($$9, $$3x -> $$1.b(lr.aK).b().filter($$0xx -> $$0xx.a(avx.o)).forEach($$3xx -> {
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
   public cyl<?> ap_() {
      return cyl.o;
   }
}
