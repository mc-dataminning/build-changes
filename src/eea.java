import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class eea extends eew<egu> {
   private static final ImmutableList<diq> a = ImmutableList.of(dis.H, dis.F, dis.kJ, dis.dW, dis.fn, dis.fo, dis.fp, dis.fq, dis.cv, dis.ct);
   private static final int b = 5;
   private static final int c = 50;
   private static final int d = 8;
   private static final int ao = 15;

   public eea(Codec<egu> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eey<egu> $$0) {
      int $$1 = $$0.c().f();
      jh $$2 = $$0.e();
      dgk $$3 = $$0.b();
      azu $$4 = $$0.d();
      egu $$5 = $$0.f();
      if (!a($$3, $$1, $$2.k())) {
         return false;
      } else {
         int $$6 = $$5.b().a($$4);
         boolean $$7 = $$4.i() < 0.9F;
         int $$8 = Math.min($$6, $$7 ? 5 : 8);
         int $$9 = $$7 ? 50 : 15;
         boolean $$10 = false;

         for (jh $$11 : jh.a($$4, $$9, $$2.u() - $$8, $$2.v(), $$2.w() - $$8, $$2.u() + $$8, $$2.v(), $$2.w() + $$8)) {
            int $$12 = $$6 - $$11.k($$2);
            if ($$12 >= 0) {
               $$10 |= this.a($$3, $$1, $$11, $$12, $$5.a().a($$4));
            }
         }

         return $$10;
      }
   }

   private boolean a(dfn $$0, int $$1, jh $$2, int $$3, int $$4) {
      boolean $$5 = false;

      for (jh $$6 : jh.b($$2.u() - $$4, $$2.v(), $$2.w() - $$4, $$2.u() + $$4, $$2.v(), $$2.w() + $$4)) {
         int $$7 = $$6.k($$2);
         jh $$8 = a($$0, $$1, $$6) ? a($$0, $$1, $$6.k(), $$7) : a($$0, $$6.k(), $$7);
         if ($$8 != null) {
            int $$9 = $$3 - $$7 / 2;

            for (jh.a $$10 = $$8.k(); $$9 >= 0; $$9--) {
               if (a($$0, $$1, (jh)$$10)) {
                  this.a($$0, $$10, dis.dY.m());
                  $$10.c(jm.b);
                  $$5 = true;
               } else {
                  if (!$$0.a_($$10).a(dis.dY)) {
                     break;
                  }

                  $$10.c(jm.b);
               }
            }
         }
      }

      return $$5;
   }

   @Nullable
   private static jh a(dfn $$0, int $$1, jh.a $$2, int $$3) {
      while ($$2.v() > $$0.K_() + 1 && $$3 > 0) {
         $$3--;
         if (a($$0, $$1, $$2)) {
            return $$2;
         }

         $$2.c(jm.a);
      }

      return null;
   }

   private static boolean a(dfn $$0, int $$1, jh.a $$2) {
      if (!a($$0, $$1, (jh)$$2)) {
         return false;
      } else {
         dvv $$3 = $$0.a_($$2.c(jm.a));
         $$2.c(jm.b);
         return !$$3.l() && !a.contains($$3.b());
      }
   }

   @Nullable
   private static jh a(dfn $$0, jh.a $$1, int $$2) {
      while ($$1.v() <= $$0.al() && $$2 > 0) {
         $$2--;
         dvv $$3 = $$0.a_($$1);
         if (a.contains($$3.b())) {
            return null;
         }

         if ($$3.l()) {
            return $$1;
         }

         $$1.c(jm.b);
      }

      return null;
   }

   private static boolean a(dfn $$0, int $$1, jh $$2) {
      dvv $$3 = $$0.a_($$2);
      return $$3.l() || $$3.a(dis.H) && $$2.v() <= $$1;
   }
}
