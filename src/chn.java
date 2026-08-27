import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class chn extends cjg {
   private static final String b = "Items";
   public static final int a = 64;
   private static final int c = 4;
   private static final int d = asb.f(0.4F, 0.4F, 1.0F);

   public chn(cjg.a $$0) {
      super($$0);
   }

   public static float d(cjl $$0) {
      return (float)o($$0) / 64.0F;
   }

   @Override
   public boolean a(cjl $$0, cgj $$1, cez $$2, cca $$3) {
      if ($$2 != cez.b) {
         return false;
      } else {
         cjl $$4 = $$1.e();
         if ($$4.b()) {
            this.a($$3);
            p($$0).ifPresent($$2x -> b($$0, $$1.f($$2x)));
         } else if ($$4.d().al_()) {
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
   public boolean a(cjl $$0, cjl $$1, cgj $$2, cez $$3, cca $$4, bke $$5) {
      if ($$3 == cez.b && $$2.b($$4)) {
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
   public bhf<cjl> a(cqb $$0, cca $$1, bhd $$2) {
      cjl $$3 = $$1.b($$2);
      if (a($$3, $$1)) {
         this.c($$1);
         $$1.b(apq.c.b(this));
         return bhf.a($$3, $$0.w_());
      } else {
         return bhf.d($$3);
      }
   }

   @Override
   public boolean e(cjl $$0) {
      return o($$0) > 0;
   }

   @Override
   public int f(cjl $$0) {
      return Math.min(1 + 12 * o($$0) / 64, 13);
   }

   @Override
   public int g(cjl $$0) {
      return d;
   }

   private static int b(cjl $$0, cjl $$1) {
      if (!$$1.b() && $$1.d().al_()) {
         qw $$2 = $$0.w();
         if (!$$2.e("Items")) {
            $$2.a("Items", new rc());
         }

         int $$3 = o($$0);
         int $$4 = k($$1);
         int $$5 = Math.min($$1.L(), (64 - $$3) / $$4);
         if ($$5 == 0) {
            return 0;
         } else {
            rc $$6 = $$2.c("Items", 10);
            Optional<qw> $$7 = a($$1, $$6);
            if ($$7.isPresent()) {
               qw $$8 = $$7.get();
               cjl $$9 = cjl.a($$8);
               $$9.g($$5);
               $$9.b($$8);
               $$6.remove($$8);
               $$6.c(0, $$8);
            } else {
               cjl $$10 = $$1.c($$5);
               qw $$11 = new qw();
               $$10.b($$11);
               $$6.c(0, $$11);
            }

            return $$5;
         }
      } else {
         return 0;
      }
   }

   private static Optional<qw> a(cjl $$0, rc $$1) {
      return $$0.a(cjo.qg)
         ? Optional.empty()
         : $$1.stream().filter(qw.class::isInstance).map(qw.class::cast).filter($$1x -> cjl.c(cjl.a($$1x), $$0)).findFirst();
   }

   private static int k(cjl $$0) {
      if ($$0.a(cjo.qg)) {
         return 4 + o($$0);
      } else {
         if (($$0.a(cjo.vC) || $$0.a(cjo.vB)) && $$0.u()) {
            qw $$1 = che.a($$0);
            if ($$1 != null && !$$1.c("Bees", 10).isEmpty()) {
               return 64;
            }
         }

         return 64 / $$0.g();
      }
   }

   private static int o(cjl $$0) {
      return q($$0).mapToInt($$0x -> k($$0x) * $$0x.L()).sum();
   }

   private static Optional<cjl> p(cjl $$0) {
      qw $$1 = $$0.w();
      if (!$$1.e("Items")) {
         return Optional.empty();
      } else {
         rc $$2 = $$1.c("Items", 10);
         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            int $$3 = 0;
            qw $$4 = $$2.a(0);
            cjl $$5 = cjl.a($$4);
            $$2.c(0);
            if ($$2.isEmpty()) {
               $$0.c("Items");
            }

            return Optional.of($$5);
         }
      }
   }

   private static boolean a(cjl $$0, cca $$1) {
      qw $$2 = $$0.w();
      if (!$$2.e("Items")) {
         return false;
      } else {
         if ($$1 instanceof aku) {
            rc $$3 = $$2.c("Items", 10);

            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               qw $$5 = $$3.a($$4);
               cjl $$6 = cjl.a($$5);
               $$1.a($$6, true);
            }
         }

         $$0.c("Items");
         return true;
      }
   }

   private static Stream<cjl> q(cjl $$0) {
      qw $$1 = $$0.v();
      if ($$1 == null) {
         return Stream.empty();
      } else {
         rc $$2 = $$1.c("Items", 10);
         return $$2.stream().map(qw.class::cast).map(cjl::a);
      }
   }

   @Override
   public Optional<cgr> h(cjl $$0) {
      hn<cjl> $$1 = hn.a();
      q($$0).forEach($$1::add);
      return Optional.of(new cgq($$1, o($$0)));
   }

   @Override
   public void a(cjl $$0, cqb $$1, List<tl> $$2, clc $$3) {
      $$2.add(tl.a("item.minecraft.bundle.fullness", o($$0), 64).a(n.h));
   }

   @Override
   public void a(byt $$0) {
      cjn.a($$0, q($$0.q()));
   }

   private void a(biw $$0) {
      $$0.a(apg.cJ, 0.8F, 0.8F + $$0.dL().D_().i() * 0.4F);
   }

   private void b(biw $$0) {
      $$0.a(apg.cI, 0.8F, 0.8F + $$0.dL().D_().i() * 0.4F);
   }

   private void c(biw $$0) {
      $$0.a(apg.cH, 0.8F, 0.8F + $$0.dL().D_().i() * 0.4F);
   }
}
