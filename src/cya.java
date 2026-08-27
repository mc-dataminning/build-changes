import com.mojang.datafixers.util.Pair;
import javax.annotation.Nullable;

public class cya extends cxm {
   public cya(cxk $$0) {
      super($$0);
   }

   @Nullable
   private Pair<cto, cto> a(cpj $$0) {
      cto $$1 = null;
      cto $$2 = null;

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         cto $$4 = $$0.a($$3);
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

   private static boolean a(cto $$0, cto $$1) {
      return $$1.a($$0.g()) && $$0.I() == 1 && $$1.I() == 1 && $$0.b(kb.c) && $$1.b(kb.c) && $$0.b(kb.d) && $$1.b(kb.d);
   }

   public boolean a(cpj $$0, dax $$1) {
      return this.a($$0) != null;
   }

   public cto a(cpj $$0, iz.a $$1) {
      Pair<cto, cto> $$2 = this.a($$0);
      if ($$2 == null) {
         return cto.i;
      } else {
         cto $$3 = (cto)$$2.getFirst();
         cto $$4 = (cto)$$2.getSecond();
         int $$5 = Math.max($$3.o(), $$4.o());
         int $$6 = $$3.o() - $$3.n();
         int $$7 = $$4.o() - $$4.n();
         int $$8 = $$6 + $$7 + $$5 * 5 / 100;
         cto $$9 = new cto($$3.g());
         $$9.b(kb.c, Integer.valueOf($$5));
         $$9.b(Math.max($$5 - $$8, 0));
         cze $$10 = cza.b($$3);
         cze $$11 = cza.b($$4);
         cza.a($$9, $$3x -> $$1.b(lf.u).b().map(ix::a).filter(cyz::b).forEach($$3xx -> {
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
   public cxy<?> ao_() {
      return cxy.o;
   }
}
