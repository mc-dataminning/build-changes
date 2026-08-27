import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class cla extends cmt {
   private static final String b = "Items";
   public static final int a = 64;
   private static final int c = 4;
   private static final int d = auo.f(0.4F, 0.4F, 1.0F);

   public cla(cmt.a $$0) {
      super($$0);
   }

   public static float d(cmy $$0) {
      return (float)o($$0) / 64.0F;
   }

   @Override
   public boolean a(cmy $$0, cjw $$1, cij $$2, cfi $$3) {
      if ($$2 != cij.b) {
         return false;
      } else {
         cmy $$4 = $$1.g();
         if ($$4.b()) {
            this.a($$3);
            p($$0).ifPresent($$2x -> b($$0, $$1.d($$2x)));
         } else if ($$4.d().ap_()) {
            int $$5 = (64 - o($$0)) / k($$4);
            int $$6 = b($$0, $$1.b($$4.L(), $$5, $$3));
            if ($$6 > 0) {
               this.b($$3);
            }
         }

         return true;
      }
   }

   @Override
   public boolean a(cmy $$0, cmy $$1, cjw $$2, cij $$3, cfi $$4, bnd $$5) {
      if ($$3 == cij.b && $$2.b($$4)) {
         if ($$1.b()) {
            p($$0).ifPresent($$2x -> {
               this.a($$4);
               $$5.a($$2x);
            });
         } else {
            int $$6 = b($$0, $$1);
            if ($$6 > 0) {
               this.b($$4);
               $$1.h($$6);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public bkc<cmy> a(ctp $$0, cfi $$1, bka $$2) {
      cmy $$3 = $$1.b($$2);
      if (a($$3, $$1)) {
         this.c($$1);
         $$1.b(asc.c.b(this));
         return bkc.a($$3, $$0.y_());
      } else {
         return bkc.d($$3);
      }
   }

   @Override
   public boolean e(cmy $$0) {
      return o($$0) > 0;
   }

   @Override
   public int f(cmy $$0) {
      return Math.min(1 + 12 * o($$0) / 64, 13);
   }

   @Override
   public int g(cmy $$0) {
      return d;
   }

   private static int b(cmy $$0, cmy $$1) {
      if (!$$1.b() && $$1.d().ap_()) {
         sn $$2 = $$0.w();
         if (!$$2.e("Items")) {
            $$2.a("Items", new st());
         }

         int $$3 = o($$0);
         int $$4 = k($$1);
         int $$5 = Math.min($$1.L(), (64 - $$3) / $$4);
         if ($$5 == 0) {
            return 0;
         } else {
            st $$6 = $$2.c("Items", 10);
            Optional<sn> $$7 = a($$1, $$6);
            if ($$7.isPresent()) {
               sn $$8 = $$7.get();
               cmy $$9 = cmy.a($$8);
               $$9.g($$5);
               $$9.b($$8);
               $$6.remove($$8);
               $$6.c(0, $$8);
            } else {
               cmy $$10 = $$1.c($$5);
               sn $$11 = new sn();
               $$10.b($$11);
               $$6.c(0, $$11);
            }

            return $$5;
         }
      } else {
         return 0;
      }
   }

   private static Optional<sn> a(cmy $$0, st $$1) {
      return $$0.a(cnb.qR)
         ? Optional.empty()
         : $$1.stream().filter(sn.class::isInstance).map(sn.class::cast).filter($$1x -> cmy.c(cmy.a($$1x), $$0)).findFirst();
   }

   private static int k(cmy $$0) {
      if ($$0.a(cnb.qR)) {
         return 4 + o($$0);
      } else {
         if (($$0.a(cnb.wp) || $$0.a(cnb.wo)) && $$0.u()) {
            sn $$1 = ckr.a($$0);
            if ($$1 != null && !$$1.c("Bees", 10).isEmpty()) {
               return 64;
            }
         }

         return 64 / $$0.g();
      }
   }

   private static int o(cmy $$0) {
      return q($$0).mapToInt($$0x -> k($$0x) * $$0x.L()).sum();
   }

   private static Optional<cmy> p(cmy $$0) {
      sn $$1 = $$0.w();
      if (!$$1.e("Items")) {
         return Optional.empty();
      } else {
         st $$2 = $$1.c("Items", 10);
         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            int $$3 = 0;
            sn $$4 = $$2.a(0);
            cmy $$5 = cmy.a($$4);
            $$2.c(0);
            if ($$2.isEmpty()) {
               $$0.c("Items");
            }

            return Optional.of($$5);
         }
      }
   }

   private static boolean a(cmy $$0, cfi $$1) {
      sn $$2 = $$0.w();
      if (!$$2.e("Items")) {
         return false;
      } else {
         if ($$1 instanceof ane) {
            st $$3 = $$2.c("Items", 10);

            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               sn $$5 = $$3.a($$4);
               cmy $$6 = cmy.a($$5);
               $$1.a($$6, true);
            }
         }

         $$0.c("Items");
         return true;
      }
   }

   private static Stream<cmy> q(cmy $$0) {
      sn $$1 = $$0.v();
      if ($$1 == null) {
         return Stream.empty();
      } else {
         st $$2 = $$1.c("Items", 10);
         return $$2.stream().map(sn.class::cast).map(cmy::a);
      }
   }

   @Override
   public Optional<cke> h(cmy $$0) {
      iq<cmy> $$1 = iq.a();
      q($$0).forEach($$1::add);
      return Optional.of(new ckd($$1, o($$0)));
   }

   @Override
   public void a(cmy $$0, ctp $$1, List<vf> $$2, coq $$3) {
      $$2.add(vf.a("item.minecraft.bundle.fullness", o($$0), 64).a(n.h));
   }

   @Override
   public void a(cbu $$0) {
      cna.a($$0, q($$0.q()));
   }

   private void a(blv $$0) {
      $$0.a(ars.cS, 0.8F, 0.8F + $$0.dM().F_().i() * 0.4F);
   }

   private void b(blv $$0) {
      $$0.a(ars.cR, 0.8F, 0.8F + $$0.dM().F_().i() * 0.4F);
   }

   private void c(blv $$0) {
      $$0.a(ars.cQ, 0.8F, 0.8F + $$0.dM().F_().i() * 0.4F);
   }
}
