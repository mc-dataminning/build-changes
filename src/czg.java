import com.mojang.datafixers.util.Pair;
import javax.annotation.Nullable;

public class czg extends cyq {
   public czg(cyo $$0) {
      super($$0);
   }

   @Nullable
   private Pair<cuh, cuh> a(cpw $$0) {
      cuh $$1 = null;
      cuh $$2 = null;

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         cuh $$4 = $$0.a($$3);
         if (!$$4.d()) {
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

   private static boolean a(cuh $$0, cuh $$1) {
      return $$1.a($$0.f()) && $$0.G() == 1 && $$1.G() == 1 && $$0.b(ke.c) && $$1.b(ke.c) && $$0.b(ke.d) && $$1.b(ke.d);
   }

   public boolean a(cpw $$0, dca $$1) {
      return this.a($$0) != null;
   }

   public cuh a(cpw $$0, jc.a $$1) {
      Pair<cuh, cuh> $$2 = this.a($$0);
      if ($$2 == null) {
         return cuh.i;
      } else {
         cuh $$3 = (cuh)$$2.getFirst();
         cuh $$4 = (cuh)$$2.getSecond();
         int $$5 = Math.max($$3.n(), $$4.n());
         int $$6 = $$3.n() - $$3.m();
         int $$7 = $$4.n() - $$4.m();
         int $$8 = $$6 + $$7 + $$5 * 5 / 100;
         cuh $$9 = new cuh($$3.f());
         $$9.b(ke.c, Integer.valueOf($$5));
         $$9.b(Math.max($$5 - $$8, 0));
         dai $$10 = dae.b($$3);
         dai $$11 = dae.b($$4);
         dae.a($$9, $$3x -> $$1.b(li.u).b().map(ja::a).filter(dad::b).forEach($$3xx -> {
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
   public cze<?> ao_() {
      return cze.p;
   }
}
