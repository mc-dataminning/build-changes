import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class cgy extends cir {
   private static final String b = "Items";
   public static final int a = 64;
   private static final int c = 4;
   private static final int d = aro.f(0.4F, 0.4F, 1.0F);

   public cgy(cir.a $$0) {
      super($$0);
   }

   public static float d(ciw $$0) {
      return (float)o($$0) / 64.0F;
   }

   @Override
   public boolean a(ciw $$0, cfu $$1, cek $$2, cbl $$3) {
      if ($$2 != cek.b) {
         return false;
      } else {
         ciw $$4 = $$1.e();
         if ($$4.b()) {
            this.a($$3);
            p($$0).ifPresent($$2x -> b($$0, $$1.f($$2x)));
         } else if ($$4.d().ah_()) {
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
   public boolean a(ciw $$0, ciw $$1, cfu $$2, cek $$3, cbl $$4, bjp $$5) {
      if ($$3 == cek.b && $$2.b($$4)) {
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
   public bgp<ciw> a(cpk $$0, cbl $$1, bgn $$2) {
      ciw $$3 = $$1.b($$2);
      if (a($$3, $$1)) {
         this.c($$1);
         $$1.b(ape.c.b(this));
         return bgp.a($$3, $$0.r_());
      } else {
         return bgp.d($$3);
      }
   }

   @Override
   public boolean e(ciw $$0) {
      return o($$0) > 0;
   }

   @Override
   public int f(ciw $$0) {
      return Math.min(1 + 12 * o($$0) / 64, 13);
   }

   @Override
   public int g(ciw $$0) {
      return d;
   }

   private static int b(ciw $$0, ciw $$1) {
      if (!$$1.b() && $$1.d().ah_()) {
         qs $$2 = $$0.w();
         if (!$$2.e("Items")) {
            $$2.a("Items", new qy());
         }

         int $$3 = o($$0);
         int $$4 = k($$1);
         int $$5 = Math.min($$1.L(), (64 - $$3) / $$4);
         if ($$5 == 0) {
            return 0;
         } else {
            qy $$6 = $$2.c("Items", 10);
            Optional<qs> $$7 = a($$1, $$6);
            if ($$7.isPresent()) {
               qs $$8 = $$7.get();
               ciw $$9 = ciw.a($$8);
               $$9.g($$5);
               $$9.b($$8);
               $$6.remove($$8);
               $$6.c(0, $$8);
            } else {
               ciw $$10 = $$1.c($$5);
               qs $$11 = new qs();
               $$10.b($$11);
               $$6.c(0, $$11);
            }

            return $$5;
         }
      } else {
         return 0;
      }
   }

   private static Optional<qs> a(ciw $$0, qy $$1) {
      return $$0.a(ciz.qg)
         ? Optional.empty()
         : $$1.stream().filter(qs.class::isInstance).map(qs.class::cast).filter($$1x -> ciw.c(ciw.a($$1x), $$0)).findFirst();
   }

   private static int k(ciw $$0) {
      if ($$0.a(ciz.qg)) {
         return 4 + o($$0);
      } else {
         if (($$0.a(ciz.vC) || $$0.a(ciz.vB)) && $$0.u()) {
            qs $$1 = cgp.a($$0);
            if ($$1 != null && !$$1.c("Bees", 10).isEmpty()) {
               return 64;
            }
         }

         return 64 / $$0.g();
      }
   }

   private static int o(ciw $$0) {
      return q($$0).mapToInt($$0x -> k($$0x) * $$0x.L()).sum();
   }

   private static Optional<ciw> p(ciw $$0) {
      qs $$1 = $$0.w();
      if (!$$1.e("Items")) {
         return Optional.empty();
      } else {
         qy $$2 = $$1.c("Items", 10);
         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            int $$3 = 0;
            qs $$4 = $$2.a(0);
            ciw $$5 = ciw.a($$4);
            $$2.c(0);
            if ($$2.isEmpty()) {
               $$0.c("Items");
            }

            return Optional.of($$5);
         }
      }
   }

   private static boolean a(ciw $$0, cbl $$1) {
      qs $$2 = $$0.w();
      if (!$$2.e("Items")) {
         return false;
      } else {
         if ($$1 instanceof akj) {
            qy $$3 = $$2.c("Items", 10);

            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               qs $$5 = $$3.a($$4);
               ciw $$6 = ciw.a($$5);
               $$1.a($$6, true);
            }
         }

         $$0.c("Items");
         return true;
      }
   }

   private static Stream<ciw> q(ciw $$0) {
      qs $$1 = $$0.v();
      if ($$1 == null) {
         return Stream.empty();
      } else {
         qy $$2 = $$1.c("Items", 10);
         return $$2.stream().map(qs.class::cast).map(ciw::a);
      }
   }

   @Override
   public Optional<cgc> h(ciw $$0) {
      ho<ciw> $$1 = ho.a();
      q($$0).forEach($$1::add);
      return Optional.of(new cgb($$1, o($$0)));
   }

   @Override
   public void a(ciw $$0, cpk $$1, List<te> $$2, ckn $$3) {
      $$2.add(te.a("item.minecraft.bundle.fullness", o($$0), 64).a(n.h));
   }

   @Override
   public void a(bye $$0) {
      ciy.a($$0, q($$0.j()));
   }

   private void a(big $$0) {
      $$0.a(aou.cJ, 0.8F, 0.8F + $$0.dK().y_().i() * 0.4F);
   }

   private void b(big $$0) {
      $$0.a(aou.cI, 0.8F, 0.8F + $$0.dK().y_().i() * 0.4F);
   }

   private void c(big $$0) {
      $$0.a(aou.cH, 0.8F, 0.8F + $$0.dK().y_().i() * 0.4F);
   }
}
