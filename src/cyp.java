import com.mojang.datafixers.util.Pair;
import javax.annotation.Nullable;

public class cyp extends cya {
   public cyp(cxx $$0) {
      super($$0);
   }

   @Nullable
   private Pair<cuc, cuc> a(cxy $$0) {
      cuc $$1 = null;
      cuc $$2 = null;

      for (int $$3 = 0; $$3 < $$0.a(); $$3++) {
         cuc $$4 = $$0.a($$3);
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

   private static boolean a(cuc $$0, cuc $$1) {
      return $$1.a($$0.g()) && $$0.H() == 1 && $$1.H() == 1 && $$0.b(kn.d) && $$1.b(kn.d) && $$0.b(kn.e) && $$1.b(kn.e);
   }

   public boolean a(cxy $$0, dcf $$1) {
      return this.a($$0) != null;
   }

   public cuc a(cxy $$0, jl.a $$1) {
      Pair<cuc, cuc> $$2 = this.a($$0);
      if ($$2 == null) {
         return cuc.l;
      } else {
         cuc $$3 = (cuc)$$2.getFirst();
         cuc $$4 = (cuc)$$2.getSecond();
         int $$5 = Math.max($$3.o(), $$4.o());
         int $$6 = $$3.o() - $$3.n();
         int $$7 = $$4.o() - $$4.n();
         int $$8 = $$6 + $$7 + $$5 * 5 / 100;
         cuc $$9 = new cuc($$3.g());
         $$9.b(kn.d, Integer.valueOf($$5));
         $$9.b(Math.max($$5 - $$8, 0));
         czr $$10 = czn.b($$3);
         czr $$11 = czn.b($$4);
         czn.a($$9, $$3x -> $$1.b(lr.aK).b().filter($$0xx -> $$0xx.a(avz.o)).forEach($$3xx -> {
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
   public cyn<?> ap_() {
      return cyn.o;
   }
}
