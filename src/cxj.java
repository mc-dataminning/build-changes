import com.mojang.datafixers.util.Pair;
import javax.annotation.Nullable;

public class cxj extends cwv {
   public cxj(cwt $$0) {
      super($$0);
   }

   @Nullable
   private Pair<csz, csz> a(cou $$0) {
      csz $$1 = null;
      csz $$2 = null;

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         csz $$4 = $$0.a($$3);
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

   private static boolean a(csz $$0, csz $$1) {
      return $$1.a($$0.f()) && $$0.G() == 1 && $$1.G() == 1 && $$0.b(ka.c) && $$1.b(ka.c) && $$0.b(ka.d) && $$1.b(ka.d);
   }

   public boolean a(cou $$0, dad $$1) {
      return this.a($$0) != null;
   }

   public csz a(cou $$0, iy.a $$1) {
      Pair<csz, csz> $$2 = this.a($$0);
      if ($$2 == null) {
         return csz.i;
      } else {
         csz $$3 = (csz)$$2.getFirst();
         csz $$4 = (csz)$$2.getSecond();
         int $$5 = Math.max($$3.n(), $$4.n());
         int $$6 = $$3.n() - $$3.m();
         int $$7 = $$4.n() - $$4.m();
         int $$8 = $$6 + $$7 + $$5 * 5 / 100;
         csz $$9 = new csz($$3.f());
         $$9.b(ka.c, Integer.valueOf($$5));
         $$9.b(Math.max($$5 - $$8, 0));
         cyl $$10 = cyh.b($$3);
         cyl $$11 = cyh.b($$4);
         cyh.a($$9, $$3x -> $$1.b(le.u).b().map(iw::a).filter(cyg::b).forEach($$3xx -> {
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
   public cxh<?> ao_() {
      return cxh.o;
   }
}
