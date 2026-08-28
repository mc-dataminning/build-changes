import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cze extends cyo {
   private static final int c = 5;
   private static final float d = -3.4F;
   public static final float a = 1.5F;
   private static final float o = 5.0F;
   public static final float b = 3.5F;
   private static final float p = 0.7F;

   public cze(cyo.a $$0) {
      super($$0);
   }

   public static dbj a() {
      return dbj.a().a(byf.c, new byd(h, 5.0, byd.a.a), bwl.b).a(byf.e, new byd(i, -3.4F, byd.a.a), bwl.b).a();
   }

   public static dbv b() {
      return new dbv(List.of(), 1.0F, 2, false);
   }

   @Override
   public void a(cys $$0, bwz $$1, bwz $$2) {
      if (b($$2)) {
         aro $$3 = (aro)$$2.dV();
         $$2.i($$2.dy().a(ja.a.b, 0.01F));
         if ($$2 instanceof arp $$4) {
            $$4.cl = this.a($$4);
            $$4.w(true);
            $$4.f.b(new afd($$4));
         }

         if ($$1.aJ()) {
            if ($$2 instanceof arp $$5) {
               $$5.b(true);
            }

            awk $$6 = $$2.Z > 5.0 ? awl.oY : awl.oX;
            $$3.a(null, $$2.dA(), $$2.dC(), $$2.dG(), $$6, $$2.dm(), 1.0F, 1.0F);
         } else {
            $$3.a(null, $$2.dA(), $$2.dC(), $$2.dG(), awl.oW, $$2.dm(), 1.0F, 1.0F);
         }

         a($$3, $$2, $$1);
      }
   }

   private fdw a(arp $$0) {
      return $$0.gM() && $$0.cl != null && $$0.cl.e <= $$0.dt().e ? $$0.cl : $$0.dt();
   }

   @Override
   public void b(cys $$0, bwz $$1, bwz $$2) {
      if (b($$2)) {
         $$2.k();
      }
   }

   @Override
   public float a(bwa $$0, float $$1, bup $$2) {
      if ($$2.c() instanceof bwz $$3) {
         if (!b($$3)) {
            return 0.0F;
         } else {
            double $$5 = 3.0;
            double $$6 = 8.0;
            double $$7 = $$3.Z;
            double $$8;
            if ($$7 <= 3.0) {
               $$8 = 4.0 * $$7;
            } else if ($$7 <= 8.0) {
               $$8 = 12.0 + 2.0 * ($$7 - 3.0);
            } else {
               $$8 = 22.0 + $$7 - 8.0;
            }

            return $$3.dV() instanceof aro $$11 ? (float)($$8 + (double)dfh.b($$11, $$3.dZ(), $$0, $$2, 0.0F) * $$7) : (float)$$8;
         }
      } else {
         return 0.0F;
      }
   }

   private static void a(dip $$0, bwa $$1, bwa $$2) {
      $$0.c(2013, $$2.aR(), 750);
      $$0.a(bwz.class, $$2.cR().g(3.5), a($$1, $$2)).forEach($$2x -> {
         fdw $$3 = $$2x.dt().d($$2.dt());
         double $$4 = a($$1, $$2x, $$3);
         fdw $$5 = $$3.d().c($$4);
         if ($$4 > 0.0) {
            $$2x.j($$5.d, 0.7F, $$5.f);
            if ($$2x instanceof arp $$6) {
               $$6.f.b(new afd($$6));
            }
         }
      });
   }

   private static Predicate<bwz> a(bwa $$0, bwa $$1) {
      return $$2 -> {
         boolean $$3;
         boolean $$4;
         boolean $$5;
         boolean var10000;
         label64: {
            $$3 = !$$2.U_();
            $$4 = $$2 != $$0 && $$2 != $$1;
            $$5 = !$$0.s($$2);
            if ($$2 instanceof bxv $$6 && $$1 instanceof bwz $$7 && $$6.q() && $$6.j($$7)) {
               var10000 = true;
               break label64;
            }

            var10000 = false;
         }

         boolean $$8;
         label56: {
            $$8 = !var10000;
            if ($$2 instanceof cmm $$9 && $$9.t()) {
               var10000 = false;
               break label56;
            }

            var10000 = true;
         }

         boolean $$11 = var10000;
         boolean $$12 = $$1.g($$2) <= Math.pow(3.5, 2.0);
         return $$3 && $$4 && $$5 && $$8 && $$11 && $$12;
      };
   }

   private static double a(bwa $$0, bwz $$1, fdw $$2) {
      return (3.5 - $$2.g()) * 0.7F * (double)($$0.Z > 5.0 ? 2 : 1) * (1.0 - $$1.h(byf.p));
   }

   public static boolean b(bwz $$0) {
      return $$0.Z > 1.5 && !$$0.fI();
   }

   @Nullable
   @Override
   public bup a(bwz $$0) {
      return b($$0) ? $$0.dW().f($$0) : super.a($$0);
   }
}
