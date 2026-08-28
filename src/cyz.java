import com.mojang.datafixers.util.Pair;
import javax.annotation.Nullable;

public class cyz extends cyl {
   public cyz(cyj $$0) {
      super($$0);
   }

   @Nullable
   private Pair<cun, cun> a(cqi $$0) {
      cun $$1 = null;
      cun $$2 = null;

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         cun $$4 = $$0.a($$3);
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

   private static boolean a(cun $$0, cun $$1) {
      return $$1.a($$0.g()) && $$0.I() == 1 && $$1.I() == 1 && $$0.b(km.c) && $$1.b(km.c) && $$0.b(km.d) && $$1.b(km.d);
   }

   public boolean a(cqi $$0, dbw $$1) {
      return this.a($$0) != null;
   }

   public cun a(cqi $$0, jk.a $$1) {
      Pair<cun, cun> $$2 = this.a($$0);
      if ($$2 == null) {
         return cun.l;
      } else {
         cun $$3 = (cun)$$2.getFirst();
         cun $$4 = (cun)$$2.getSecond();
         int $$5 = Math.max($$3.o(), $$4.o());
         int $$6 = $$3.o() - $$3.n();
         int $$7 = $$4.o() - $$4.n();
         int $$8 = $$6 + $$7 + $$5 * 5 / 100;
         cun $$9 = new cun($$3.g());
         $$9.b(km.c, Integer.valueOf($$5));
         $$9.b(Math.max($$5 - $$8, 0));
         dad $$10 = czz.b($$3);
         dad $$11 = czz.b($$4);
         czz.a($$9, $$3x -> $$1.b(lq.u).b().map(ji::a).filter(czy::b).forEach($$3xx -> {
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
   public cyx<?> ap_() {
      return cyx.o;
   }
}
