import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class eab extends eaw<ecu> {
   private static final ImmutableList<dex> a = ImmutableList.of(dez.H, dez.F, dez.kJ, dez.dW, dez.fn, dez.fo, dez.fp, dez.fq, dez.cv, dez.ct);
   private static final int b = 5;
   private static final int c = 50;
   private static final int d = 8;
   private static final int an = 15;

   public eab(Codec<ecu> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eay<ecu> $$0) {
      int $$1 = $$0.c().f();
      iz $$2 = $$0.e();
      dcr $$3 = $$0.b();
      azf $$4 = $$0.d();
      ecu $$5 = $$0.f();
      if (!a($$3, $$1, $$2.j())) {
         return false;
      } else {
         int $$6 = $$5.b().a($$4);
         boolean $$7 = $$4.i() < 0.9F;
         int $$8 = Math.min($$6, $$7 ? 5 : 8);
         int $$9 = $$7 ? 50 : 15;
         boolean $$10 = false;

         for (iz $$11 : iz.a($$4, $$9, $$2.u() - $$8, $$2.v(), $$2.w() - $$8, $$2.u() + $$8, $$2.v(), $$2.w() + $$8)) {
            int $$12 = $$6 - $$11.k($$2);
            if ($$12 >= 0) {
               $$10 |= this.a($$3, $$1, $$11, $$12, $$5.a().a($$4));
            }
         }

         return $$10;
      }
   }

   private boolean a(dbx $$0, int $$1, iz $$2, int $$3, int $$4) {
      boolean $$5 = false;

      for (iz $$6 : iz.b($$2.u() - $$4, $$2.v(), $$2.w() - $$4, $$2.u() + $$4, $$2.v(), $$2.w() + $$4)) {
         int $$7 = $$6.k($$2);
         iz $$8 = a($$0, $$1, $$6) ? a($$0, $$1, $$6.j(), $$7) : a($$0, $$6.j(), $$7);
         if ($$8 != null) {
            int $$9 = $$3 - $$7 / 2;

            for (iz.a $$10 = $$8.j(); $$9 >= 0; $$9--) {
               if (a($$0, $$1, (iz)$$10)) {
                  this.a($$0, $$10, dez.dY.o());
                  $$10.c(je.b);
                  $$5 = true;
               } else {
                  if (!$$0.a_($$10).a(dez.dY)) {
                     break;
                  }

                  $$10.c(je.b);
               }
            }
         }
      }

      return $$5;
   }

   @Nullable
   private static iz a(dbx $$0, int $$1, iz.a $$2, int $$3) {
      while ($$2.v() > $$0.I_() + 1 && $$3 > 0) {
         $$3--;
         if (a($$0, $$1, $$2)) {
            return $$2;
         }

         $$2.c(je.a);
      }

      return null;
   }

   private static boolean a(dbx $$0, int $$1, iz.a $$2) {
      if (!a($$0, $$1, (iz)$$2)) {
         return false;
      } else {
         dsa $$3 = $$0.a_($$2.c(je.a));
         $$2.c(je.b);
         return !$$3.i() && !a.contains($$3.b());
      }
   }

   @Nullable
   private static iz a(dbx $$0, iz.a $$1, int $$2) {
      while ($$1.v() < $$0.am() && $$2 > 0) {
         $$2--;
         dsa $$3 = $$0.a_($$1);
         if (a.contains($$3.b())) {
            return null;
         }

         if ($$3.i()) {
            return $$1;
         }

         $$1.c(je.b);
      }

      return null;
   }

   private static boolean a(dbx $$0, int $$1, iz $$2) {
      dsa $$3 = $$0.a_($$2);
      return $$3.i() || $$3.a(dez.H) && $$2.v() <= $$1;
   }
}
