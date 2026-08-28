import com.mojang.datafixers.util.Pair;
import javax.annotation.Nullable;

public class cyw extends cyi {
   public cyw(cyg $$0) {
      super($$0);
   }

   @Nullable
   private Pair<cuk, cuk> a(cqf $$0) {
      cuk $$1 = null;
      cuk $$2 = null;

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         cuk $$4 = $$0.a($$3);
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

   private static boolean a(cuk $$0, cuk $$1) {
      return $$1.a($$0.g()) && $$0.I() == 1 && $$1.I() == 1 && $$0.b(km.c) && $$1.b(km.c) && $$0.b(km.d) && $$1.b(km.d);
   }

   public boolean a(cqf $$0, dbt $$1) {
      return this.a($$0) != null;
   }

   public cuk a(cqf $$0, jk.a $$1) {
      Pair<cuk, cuk> $$2 = this.a($$0);
      if ($$2 == null) {
         return cuk.l;
      } else {
         cuk $$3 = (cuk)$$2.getFirst();
         cuk $$4 = (cuk)$$2.getSecond();
         int $$5 = Math.max($$3.o(), $$4.o());
         int $$6 = $$3.o() - $$3.n();
         int $$7 = $$4.o() - $$4.n();
         int $$8 = $$6 + $$7 + $$5 * 5 / 100;
         cuk $$9 = new cuk($$3.g());
         $$9.b(km.c, Integer.valueOf($$5));
         $$9.b(Math.max($$5 - $$8, 0));
         daa $$10 = czw.b($$3);
         daa $$11 = czw.b($$4);
         czw.a($$9, $$3x -> $$1.b(lq.u).b().map(ji::a).filter(czv::b).forEach($$3xx -> {
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
   public cyu<?> ap_() {
      return cyu.o;
   }
}
