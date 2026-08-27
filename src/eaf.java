import com.mojang.serialization.Codec;
import java.util.function.Predicate;

public class eaf extends dzd<ebx> {
   public eaf(Codec<ebx> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dzf<ebx> $$0) {
      day $$1 = $$0.b();
      in $$2 = $$0.e();
      if (!$$1.a_($$2).i()) {
         return false;
      } else {
         ayg $$3 = $$0.d();
         in $$4 = $$0.e();
         ebx $$5 = $$0.f();
         in.a $$6 = $$4.j();
         if (a($$1, $$0.c(), $$5, $$3, $$6, $$4)) {
            a($$1, $$5, $$3, $$4, $$6);
         }

         return true;
      }
   }

   private static boolean a(day $$0, ebx $$1, in $$2) {
      in.a $$3 = $$2.j();

      for (int $$4 = 1; $$4 <= $$1.c; $$4++) {
         $$3.c(is.b);
         dqh $$5 = $$0.a_($$3);
         if (!a($$5, $$4, $$1.n)) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(dqh $$0, int $$1, int $$2) {
      if ($$0.i()) {
         return true;
      } else {
         int $$3 = $$1 + 1;
         return $$3 <= $$2 && $$0.u().a(avw.a);
      }
   }

   private static boolean a(day $$0, dse $$1, ebx $$2, ayg $$3, in.a $$4, in $$5) {
      for (int $$6 = 0; $$6 < $$2.h; $$6++) {
         $$4.c(is.b);
         if ($$2.o.test($$0, $$4) && a($$0, $$2, $$4)) {
            in $$7 = $$4.d();
            if ($$0.b_($$7).a(avw.b) || !$$0.a_($$7).e()) {
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

   private static void a(in $$0, int $$1, day $$2, ebx $$3, ayg $$4) {
      int $$5 = $$0.u();
      int $$6 = $$0.w();
      in.a $$7 = $$0.j();

      for (int $$8 = $$0.v(); $$8 < $$1; $$8++) {
         a($$2, $$3, $$4, $$5, $$6, $$7.d($$5, $$8, $$6));
      }
   }

   private static void a(day $$0, ebx $$1, ayg $$2, int $$3, int $$4, in.a $$5) {
      int $$6 = $$1.d;
      Predicate<dqh> $$7 = $$1x -> $$1x.a($$1.e);

      for (int $$8 = 0; $$8 < $$1.g; $$8++) {
         $$5.a($$5, $$2.a($$6) - $$2.a($$6), 0, $$2.a($$6) - $$2.a($$6));
         if ($$7.test($$0.a_($$5))) {
            $$0.a($$5, $$1.f.a($$2, $$5), 2);
         }

         $$5.p($$3);
         $$5.r($$4);
      }
   }

   private static void a(day $$0, ebx $$1, ayg $$2, in $$3, in.a $$4) {
      int $$5 = $$1.i;
      int $$6 = $$1.j;

      for (int $$7 = 0; $$7 < $$1.l; $$7++) {
         $$4.a($$3, $$2.a($$5) - $$2.a($$5), $$2.a($$6) - $$2.a($$6), $$2.a($$5) - $$2.a($$5));
         if ($$0.u($$4)) {
            dqh $$8 = $$1.k.a($$2, $$4);
            if ($$8.a($$0, $$4) && $$0.a_($$4.c()).d($$0, $$4, is.a)) {
               $$0.a($$4, $$8, 2);
            }
         }
      }
   }
}
