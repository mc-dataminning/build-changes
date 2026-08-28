import com.mojang.datafixers.util.Pair;
import javax.annotation.Nullable;

public class daa extends czk {
   public daa(czh $$0) {
      super($$0);
   }

   @Nullable
   private Pair<cvl, cvl> a(czi $$0) {
      cvl $$1 = null;
      cvl $$2 = null;

      for (int $$3 = 0; $$3 < $$0.a(); $$3++) {
         cvl $$4 = $$0.a($$3);
         if (!$$4.f()) {
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

   private static boolean a(cvl $$0, cvl $$1) {
      return $$1.a($$0.h()) && $$0.J() == 1 && $$1.J() == 1 && $$0.b(kr.d) && $$1.b(kr.d) && $$0.b(kr.e) && $$1.b(kr.e);
   }

   public boolean a(czi $$0, dds $$1) {
      return this.a($$0) != null;
   }

   public cvl a(czi $$0, jp.a $$1) {
      Pair<cvl, cvl> $$2 = this.a($$0);
      if ($$2 == null) {
         return cvl.k;
      } else {
         cvl $$3 = (cvl)$$2.getFirst();
         cvl $$4 = (cvl)$$2.getSecond();
         int $$5 = Math.max($$3.p(), $$4.p());
         int $$6 = $$3.p() - $$3.o();
         int $$7 = $$4.p() - $$4.o();
         int $$8 = $$6 + $$7 + $$5 * 5 / 100;
         cvl $$9 = new cvl($$3.h());
         $$9.b(kr.d, $$5);
         $$9.b(Math.max($$5 - $$8, 0));
         dbc $$10 = day.b($$3);
         dbc $$11 = day.b($$4);
         day.a($$9, $$3x -> $$1.b(lv.aL).b().filter($$0xx -> $$0xx.a(awv.o)).forEach($$3xx -> {
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
   public czy<?> as_() {
      return czy.n;
   }
}
