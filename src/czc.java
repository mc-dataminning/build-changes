import com.mojang.datafixers.util.Pair;
import javax.annotation.Nullable;

public class czc extends cyo {
   public czc(cym $$0) {
      super($$0);
   }

   @Nullable
   private Pair<cuq, cuq> a(cql $$0) {
      cuq $$1 = null;
      cuq $$2 = null;

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
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
      return $$1.a($$0.g()) && $$0.I() == 1 && $$1.I() == 1 && $$0.b(km.d) && $$1.b(km.d) && $$0.b(km.e) && $$1.b(km.e);
   }

   public boolean a(cql $$0, dbz $$1) {
      return this.a($$0) != null;
   }

   public cuq a(cql $$0, jk.a $$1) {
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
         $$9.b(km.d, Integer.valueOf($$5));
         $$9.b(Math.max($$5 - $$8, 0));
         dag $$10 = dac.b($$3);
         dag $$11 = dac.b($$4);
         dac.a($$9, $$3x -> $$1.b(lq.u).b().map(ji::a).filter(dab::b).forEach($$3xx -> {
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
   public cza<?> ao_() {
      return cza.o;
   }
}
