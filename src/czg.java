import com.mojang.datafixers.util.Pair;
import javax.annotation.Nullable;

public class czg extends cyr {
   public czg(cyo $$0) {
      super($$0);
   }

   @Nullable
   private Pair<cuq, cuq> a(cyp $$0) {
      cuq $$1 = null;
      cuq $$2 = null;

      for (int $$3 = 0; $$3 < $$0.a(); $$3++) {
         cuq $$4 = $$0.a($$3);
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

   private static boolean a(cuq $$0, cuq $$1) {
      return $$1.a($$0.g()) && $$0.H() == 1 && $$1.H() == 1 && $$0.b(kq.d) && $$1.b(kq.d) && $$0.b(kq.e) && $$1.b(kq.e);
   }

   public boolean a(cyp $$0, dcw $$1) {
      return this.a($$0) != null;
   }

   public cuq a(cyp $$0, jo.a $$1) {
      Pair<cuq, cuq> $$2 = this.a($$0);
      if ($$2 == null) {
         return cuq.l;
      } else {
         cuq $$3 = (cuq)$$2.getFirst();
         cuq $$4 = (cuq)$$2.getSecond();
         int $$5 = Math.max($$3.o(), $$4.o());
         int $$6 = $$3.o() - $$3.n();
         int $$7 = $$4.o() - $$4.n();
         int $$8 = $$6 + $$7 + $$5 * 5 / 100;
         cuq $$9 = new cuq($$3.g());
         $$9.b(kq.d, $$5);
         $$9.b(Math.max($$5 - $$8, 0));
         dai $$10 = dae.b($$3);
         dai $$11 = dae.b($$4);
         dae.a($$9, $$3x -> $$1.b(lu.aL).b().filter($$0xx -> $$0xx.a(awh.o)).forEach($$3xx -> {
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
   public cze<?> at_() {
      return cze.o;
   }
}
