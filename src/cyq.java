import com.mojang.datafixers.util.Pair;
import javax.annotation.Nullable;

public class cyq extends cyb {
   public cyq(cxy $$0) {
      super($$0);
   }

   @Nullable
   private Pair<cud, cud> a(cxz $$0) {
      cud $$1 = null;
      cud $$2 = null;

      for (int $$3 = 0; $$3 < $$0.a(); $$3++) {
         cud $$4 = $$0.a($$3);
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

   private static boolean a(cud $$0, cud $$1) {
      return $$1.a($$0.g()) && $$0.H() == 1 && $$1.H() == 1 && $$0.b(kn.d) && $$1.b(kn.d) && $$0.b(kn.e) && $$1.b(kn.e);
   }

   public boolean a(cxz $$0, dcg $$1) {
      return this.a($$0) != null;
   }

   public cud a(cxz $$0, jl.a $$1) {
      Pair<cud, cud> $$2 = this.a($$0);
      if ($$2 == null) {
         return cud.l;
      } else {
         cud $$3 = (cud)$$2.getFirst();
         cud $$4 = (cud)$$2.getSecond();
         int $$5 = Math.max($$3.o(), $$4.o());
         int $$6 = $$3.o() - $$3.n();
         int $$7 = $$4.o() - $$4.n();
         int $$8 = $$6 + $$7 + $$5 * 5 / 100;
         cud $$9 = new cud($$3.g());
         $$9.b(kn.d, Integer.valueOf($$5));
         $$9.b(Math.max($$5 - $$8, 0));
         czs $$10 = czo.b($$3);
         czs $$11 = czo.b($$4);
         czo.a($$9, $$3x -> $$1.b(lr.aK).b().filter($$0xx -> $$0xx.a(avz.o)).forEach($$3xx -> {
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
   public cyo<?> ap_() {
      return cyo.o;
   }
}
