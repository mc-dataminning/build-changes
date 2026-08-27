import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class cjl extends cle {
   private static final String b = "Items";
   public static final int a = 64;
   private static final int c = 4;
   private static final int d = atm.f(0.4F, 0.4F, 1.0F);

   public cjl(cle.a $$0) {
      super($$0);
   }

   public static float d(clj $$0) {
      return (float)o($$0) / 64.0F;
   }

   @Override
   public boolean a(clj $$0, cih $$1, cgu $$2, cdu $$3) {
      if ($$2 != cgu.b) {
         return false;
      } else {
         clj $$4 = $$1.f();
         if ($$4.b()) {
            this.a($$3);
            p($$0).ifPresent($$2x -> b($$0, $$1.d($$2x)));
         } else if ($$4.d().ao_()) {
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
   public boolean a(clj $$0, clj $$1, cih $$2, cgu $$3, cdu $$4, bly $$5) {
      if ($$3 == cgu.b && $$2.b($$4)) {
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
   public biy<clj> a(csa $$0, cdu $$1, biw $$2) {
      clj $$3 = $$1.b($$2);
      if (a($$3, $$1)) {
         this.c($$1);
         $$1.b(arb.c.b(this));
         return biy.a($$3, $$0.x_());
      } else {
         return biy.d($$3);
      }
   }

   @Override
   public boolean e(clj $$0) {
      return o($$0) > 0;
   }

   @Override
   public int f(clj $$0) {
      return Math.min(1 + 12 * o($$0) / 64, 13);
   }

   @Override
   public int g(clj $$0) {
      return d;
   }

   private static int b(clj $$0, clj $$1) {
      if (!$$1.b() && $$1.d().ao_()) {
         rz $$2 = $$0.w();
         if (!$$2.e("Items")) {
            $$2.a("Items", new sf());
         }

         int $$3 = o($$0);
         int $$4 = k($$1);
         int $$5 = Math.min($$1.L(), (64 - $$3) / $$4);
         if ($$5 == 0) {
            return 0;
         } else {
            sf $$6 = $$2.c("Items", 10);
            Optional<rz> $$7 = a($$1, $$6);
            if ($$7.isPresent()) {
               rz $$8 = $$7.get();
               clj $$9 = clj.a($$8);
               $$9.g($$5);
               $$9.b($$8);
               $$6.remove($$8);
               $$6.c(0, $$8);
            } else {
               clj $$10 = $$1.c($$5);
               rz $$11 = new rz();
               $$10.b($$11);
               $$6.c(0, $$11);
            }

            return $$5;
         }
      } else {
         return 0;
      }
   }

   private static Optional<rz> a(clj $$0, sf $$1) {
      return $$0.a(clm.qR)
         ? Optional.empty()
         : $$1.stream().filter(rz.class::isInstance).map(rz.class::cast).filter($$1x -> clj.c(clj.a($$1x), $$0)).findFirst();
   }

   private static int k(clj $$0) {
      if ($$0.a(clm.qR)) {
         return 4 + o($$0);
      } else {
         if (($$0.a(clm.wo) || $$0.a(clm.wn)) && $$0.u()) {
            rz $$1 = cjc.a($$0);
            if ($$1 != null && !$$1.c("Bees", 10).isEmpty()) {
               return 64;
            }
         }

         return 64 / $$0.g();
      }
   }

   private static int o(clj $$0) {
      return q($$0).mapToInt($$0x -> k($$0x) * $$0x.L()).sum();
   }

   private static Optional<clj> p(clj $$0) {
      rz $$1 = $$0.w();
      if (!$$1.e("Items")) {
         return Optional.empty();
      } else {
         sf $$2 = $$1.c("Items", 10);
         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            int $$3 = 0;
            rz $$4 = $$2.a(0);
            clj $$5 = clj.a($$4);
            $$2.c(0);
            if ($$2.isEmpty()) {
               $$0.c("Items");
            }

            return Optional.of($$5);
         }
      }
   }

   private static boolean a(clj $$0, cdu $$1) {
      rz $$2 = $$0.w();
      if (!$$2.e("Items")) {
         return false;
      } else {
         if ($$1 instanceof amf) {
            sf $$3 = $$2.c("Items", 10);

            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               rz $$5 = $$3.a($$4);
               clj $$6 = clj.a($$5);
               $$1.a($$6, true);
            }
         }

         $$0.c("Items");
         return true;
      }
   }

   private static Stream<clj> q(clj $$0) {
      rz $$1 = $$0.v();
      if ($$1 == null) {
         return Stream.empty();
      } else {
         sf $$2 = $$1.c("Items", 10);
         return $$2.stream().map(rz.class::cast).map(clj::a);
      }
   }

   @Override
   public Optional<cip> h(clj $$0) {
      il<clj> $$1 = il.a();
      q($$0).forEach($$1::add);
      return Optional.of(new cio($$1, o($$0)));
   }

   @Override
   public void a(clj $$0, csa $$1, List<ur> $$2, cna $$3) {
      $$2.add(ur.a("item.minecraft.bundle.fullness", o($$0), 64).a(n.h));
   }

   @Override
   public void a(can $$0) {
      cll.a($$0, q($$0.q()));
   }

   private void a(bkq $$0) {
      $$0.a(aqr.cJ, 0.8F, 0.8F + $$0.dN().E_().i() * 0.4F);
   }

   private void b(bkq $$0) {
      $$0.a(aqr.cI, 0.8F, 0.8F + $$0.dN().E_().i() * 0.4F);
   }

   private void c(bkq $$0) {
      $$0.a(aqr.cH, 0.8F, 0.8F + $$0.dN().E_().i() * 0.4F);
   }
}
