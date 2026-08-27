import com.mojang.serialization.Codec;
import java.util.function.Predicate;

public class duu extends dts<dwm> {
   public duu(Codec<dwm> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dtu<dwm> $$0) {
      cwi $$1 = $$0.b();
      hz $$2 = $$0.e();
      if (!$$1.a_($$2).i()) {
         return false;
      } else {
         awo $$3 = $$0.d();
         hz $$4 = $$0.e();
         dwm $$5 = $$0.f();
         hz.a $$6 = $$4.j();
         if (a($$1, $$0.c(), $$5, $$3, $$6, $$4)) {
            a($$1, $$5, $$3, $$4, $$6);
         }

         return true;
      }
   }

   private static boolean a(cwi $$0, dwm $$1, hz $$2) {
      hz.a $$3 = $$2.j();

      for (int $$4 = 1; $$4 <= $$1.c; $$4++) {
         $$3.c(ie.b);
         dlf $$5 = $$0.a_($$3);
         if (!a($$5, $$4, $$1.n)) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(dlf $$0, int $$1, int $$2) {
      if ($$0.i()) {
         return true;
      } else {
         int $$3 = $$1 + 1;
         return $$3 <= $$2 && $$0.u().a(aue.a);
      }
   }

   private static boolean a(cwi $$0, dnc $$1, dwm $$2, awo $$3, hz.a $$4, hz $$5) {
      for (int $$6 = 0; $$6 < $$2.h; $$6++) {
         $$4.c(ie.b);
         if ($$2.o.test($$0, $$4) && a($$0, $$2, $$4)) {
            hz $$7 = $$4.d();
            if ($$0.b_($$7).a(aue.b) || !$$0.a_($$7).e()) {
               return false;
            }

            if ($$2.b.a().a($$0, $$1, $$3, $$4)) {
               a($$5, $$5.v() + $$6, $$0, $$2, $$3);
               return true;
            }
         }
      }

      return false;
   }

   private static void a(hz $$0, int $$1, cwi $$2, dwm $$3, awo $$4) {
      int $$5 = $$0.u();
      int $$6 = $$0.w();
      hz.a $$7 = $$0.j();

      for (int $$8 = $$0.v(); $$8 < $$1; $$8++) {
         a($$2, $$3, $$4, $$5, $$6, $$7.d($$5, $$8, $$6));
      }
   }

   private static void a(cwi $$0, dwm $$1, awo $$2, int $$3, int $$4, hz.a $$5) {
      int $$6 = $$1.d;
      Predicate<dlf> $$7 = $$1x -> $$1x.a($$1.e);

      for (int $$8 = 0; $$8 < $$1.g; $$8++) {
         $$5.a($$5, $$2.a($$6) - $$2.a($$6), 0, $$2.a($$6) - $$2.a($$6));
         if ($$7.test($$0.a_($$5))) {
            $$0.a($$5, $$1.f.a($$2, $$5), 2);
         }

         $$5.p($$3);
         $$5.r($$4);
      }
   }

   private static void a(cwi $$0, dwm $$1, awo $$2, hz $$3, hz.a $$4) {
      int $$5 = $$1.i;
      int $$6 = $$1.j;

      for (int $$7 = 0; $$7 < $$1.l; $$7++) {
         $$4.a($$3, $$2.a($$5) - $$2.a($$5), $$2.a($$6) - $$2.a($$6), $$2.a($$5) - $$2.a($$5));
         if ($$0.u($$4)) {
            dlf $$8 = $$1.k.a($$2, $$4);
            if ($$8.a($$0, $$4) && $$0.a_($$4.c()).d($$0, $$4, ie.a)) {
               $$0.a($$4, $$8, 2);
            }
         }
      }
   }
}
