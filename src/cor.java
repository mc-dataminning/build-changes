import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class cor extends cqh {
   private static final String b = "Items";
   public static final int a = 64;
   private static final int c = 4;
   private static final int d = aww.f(0.4F, 0.4F, 1.0F);

   public cor(cqh.a $$0) {
      super($$0);
   }

   public static float d(cqm $$0) {
      return (float)o($$0) / 64.0F;
   }

   @Override
   public boolean a(cqm $$0, cnl $$1, cly $$2, ciu $$3) {
      if ($$2 != cly.b) {
         return false;
      } else {
         cqm $$4 = $$1.g();
         if ($$4.b()) {
            this.a($$3);
            p($$0).ifPresent($$2x -> b($$0, $$1.d($$2x)));
         } else if ($$4.d().ap_()) {
            int $$5 = (64 - o($$0)) / k($$4);
            int $$6 = b($$0, $$1.b($$4.M(), $$5, $$3));
            if ($$6 > 0) {
               this.b($$3);
            }
         }

         return true;
      }
   }

   @Override
   public boolean a(cqm $$0, cqm $$1, cnl $$2, cly $$3, ciu $$4, bqg $$5) {
      if ($$3 == cly.b && $$2.b($$4)) {
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
   public bne<cqm> a(cxb $$0, ciu $$1, bnc $$2) {
      cqm $$3 = $$1.b($$2);
      if (a($$3, $$1)) {
         this.c($$1);
         $$1.b(aui.c.b(this));
         return bne.a($$3, $$0.x_());
      } else {
         return bne.d($$3);
      }
   }

   @Override
   public boolean e(cqm $$0) {
      return o($$0) > 0;
   }

   @Override
   public int f(cqm $$0) {
      return Math.min(1 + 12 * o($$0) / 64, 13);
   }

   @Override
   public int g(cqm $$0) {
      return d;
   }

   private static int b(cqm $$0, cqm $$1) {
      if (!$$1.b() && $$1.d().ap_()) {
         ta $$2 = $$0.x();
         if (!$$2.e("Items")) {
            $$2.a("Items", new tg());
         }

         int $$3 = o($$0);
         int $$4 = k($$1);
         int $$5 = Math.min($$1.M(), (64 - $$3) / $$4);
         if ($$5 == 0) {
            return 0;
         } else {
            tg $$6 = $$2.c("Items", 10);
            Optional<ta> $$7 = a($$1, $$6);
            if ($$7.isPresent()) {
               ta $$8 = $$7.get();
               cqm $$9 = cqm.a($$8);
               $$9.g($$5);
               $$9.b($$8);
               $$6.remove($$8);
               $$6.c(0, $$8);
            } else {
               cqm $$10 = $$1.c($$5);
               ta $$11 = new ta();
               $$10.b($$11);
               $$6.c(0, $$11);
            }

            return $$5;
         }
      } else {
         return 0;
      }
   }

   private static Optional<ta> a(cqm $$0, tg $$1) {
      return $$0.a(cqp.qT)
         ? Optional.empty()
         : $$1.stream().filter(ta.class::isInstance).map(ta.class::cast).filter($$1x -> cqm.c(cqm.a($$1x), $$0)).findFirst();
   }

   private static int k(cqm $$0) {
      if ($$0.a(cqp.qT)) {
         return 4 + o($$0);
      } else {
         if (($$0.a(cqp.wu) || $$0.a(cqp.wt)) && $$0.v()) {
            ta $$1 = coh.a($$0);
            if ($$1 != null && !$$1.c("Bees", 10).isEmpty()) {
               return 64;
            }
         }

         return 64 / $$0.g();
      }
   }

   private static int o(cqm $$0) {
      return q($$0).mapToInt($$0x -> k($$0x) * $$0x.M()).sum();
   }

   private static Optional<cqm> p(cqm $$0) {
      ta $$1 = $$0.x();
      if (!$$1.e("Items")) {
         return Optional.empty();
      } else {
         tg $$2 = $$1.c("Items", 10);
         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            int $$3 = 0;
            ta $$4 = $$2.a(0);
            cqm $$5 = cqm.a($$4);
            $$2.c(0);
            if ($$2.isEmpty()) {
               $$0.d("Items");
            }

            return Optional.of($$5);
         }
      }
   }

   private static boolean a(cqm $$0, ciu $$1) {
      ta $$2 = $$0.x();
      if (!$$2.e("Items")) {
         return false;
      } else {
         if ($$1 instanceof apg) {
            tg $$3 = $$2.c("Items", 10);

            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               ta $$5 = $$3.a($$4);
               cqm $$6 = cqm.a($$5);
               $$1.a($$6, true);
            }
         }

         $$0.d("Items");
         return true;
      }
   }

   private static Stream<cqm> q(cqm $$0) {
      ta $$1 = $$0.w();
      if ($$1 == null) {
         return Stream.empty();
      } else {
         tg $$2 = $$1.c("Items", 10);
         return $$2.stream().map(ta.class::cast).map(cqm::a);
      }
   }

   @Override
   public Optional<cnt> h(cqm $$0) {
      iu<cqm> $$1 = iu.a();
      q($$0).forEach($$1::add);
      return Optional.of(new cns($$1, o($$0)));
   }

   @Override
   public void a(cqm $$0, cxb $$1, List<vu> $$2, csd $$3) {
      $$2.add(vu.a("item.minecraft.bundle.fullness", o($$0), 64).a(n.h));
   }

   @Override
   public void a(cfe $$0) {
      cqo.a($$0, q($$0.p()));
   }

   private void a(box $$0) {
      $$0.a(aty.dp, 0.8F, 0.8F + $$0.dM().E_().i() * 0.4F);
   }

   private void b(box $$0) {
      $$0.a(aty.do, 0.8F, 0.8F + $$0.dM().E_().i() * 0.4F);
   }

   private void c(box $$0) {
      $$0.a(aty.dn, 0.8F, 0.8F + $$0.dM().E_().i() * 0.4F);
   }
}
