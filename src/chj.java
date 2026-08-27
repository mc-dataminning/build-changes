import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class chj extends cjc {
   private static final String b = "Items";
   public static final int a = 64;
   private static final int c = 4;
   private static final int d = ary.f(0.4F, 0.4F, 1.0F);

   public chj(cjc.a $$0) {
      super($$0);
   }

   public static float d(cjh $$0) {
      return (float)o($$0) / 64.0F;
   }

   @Override
   public boolean a(cjh $$0, cgf $$1, cev $$2, cbw $$3) {
      if ($$2 != cev.b) {
         return false;
      } else {
         cjh $$4 = $$1.e();
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
   public boolean a(cjh $$0, cjh $$1, cgf $$2, cev $$3, cbw $$4, bka $$5) {
      if ($$3 == cev.b && $$2.b($$4)) {
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
   public bhb<cjh> a(cpx $$0, cbw $$1, bgz $$2) {
      cjh $$3 = $$1.b($$2);
      if (a($$3, $$1)) {
         this.c($$1);
         $$1.b(app.c.b(this));
         return bhb.a($$3, $$0.w_());
      } else {
         return bhb.d($$3);
      }
   }

   @Override
   public boolean e(cjh $$0) {
      return o($$0) > 0;
   }

   @Override
   public int f(cjh $$0) {
      return Math.min(1 + 12 * o($$0) / 64, 13);
   }

   @Override
   public int g(cjh $$0) {
      return d;
   }

   private static int b(cjh $$0, cjh $$1) {
      if (!$$1.b() && $$1.d().al_()) {
         qy $$2 = $$0.w();
         if (!$$2.e("Items")) {
            $$2.a("Items", new re());
         }

         int $$3 = o($$0);
         int $$4 = k($$1);
         int $$5 = Math.min($$1.L(), (64 - $$3) / $$4);
         if ($$5 == 0) {
            return 0;
         } else {
            re $$6 = $$2.c("Items", 10);
            Optional<qy> $$7 = a($$1, $$6);
            if ($$7.isPresent()) {
               qy $$8 = $$7.get();
               cjh $$9 = cjh.a($$8);
               $$9.g($$5);
               $$9.b($$8);
               $$6.remove($$8);
               $$6.c(0, $$8);
            } else {
               cjh $$10 = $$1.c($$5);
               qy $$11 = new qy();
               $$10.b($$11);
               $$6.c(0, $$11);
            }

            return $$5;
         }
      } else {
         return 0;
      }
   }

   private static Optional<qy> a(cjh $$0, re $$1) {
      return $$0.a(cjk.qg)
         ? Optional.empty()
         : $$1.stream().filter(qy.class::isInstance).map(qy.class::cast).filter($$1x -> cjh.c(cjh.a($$1x), $$0)).findFirst();
   }

   private static int k(cjh $$0) {
      if ($$0.a(cjk.qg)) {
         return 4 + o($$0);
      } else {
         if (($$0.a(cjk.vC) || $$0.a(cjk.vB)) && $$0.u()) {
            qy $$1 = cha.a($$0);
            if ($$1 != null && !$$1.c("Bees", 10).isEmpty()) {
               return 64;
            }
         }

         return 64 / $$0.g();
      }
   }

   private static int o(cjh $$0) {
      return q($$0).mapToInt($$0x -> k($$0x) * $$0x.L()).sum();
   }

   private static Optional<cjh> p(cjh $$0) {
      qy $$1 = $$0.w();
      if (!$$1.e("Items")) {
         return Optional.empty();
      } else {
         re $$2 = $$1.c("Items", 10);
         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            int $$3 = 0;
            qy $$4 = $$2.a(0);
            cjh $$5 = cjh.a($$4);
            $$2.c(0);
            if ($$2.isEmpty()) {
               $$0.c("Items");
            }

            return Optional.of($$5);
         }
      }
   }

   private static boolean a(cjh $$0, cbw $$1) {
      qy $$2 = $$0.w();
      if (!$$2.e("Items")) {
         return false;
      } else {
         if ($$1 instanceof akt) {
            re $$3 = $$2.c("Items", 10);

            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               qy $$5 = $$3.a($$4);
               cjh $$6 = cjh.a($$5);
               $$1.a($$6, true);
            }
         }

         $$0.c("Items");
         return true;
      }
   }

   private static Stream<cjh> q(cjh $$0) {
      qy $$1 = $$0.v();
      if ($$1 == null) {
         return Stream.empty();
      } else {
         re $$2 = $$1.c("Items", 10);
         return $$2.stream().map(qy.class::cast).map(cjh::a);
      }
   }

   @Override
   public Optional<cgn> h(cjh $$0) {
      hp<cjh> $$1 = hp.a();
      q($$0).forEach($$1::add);
      return Optional.of(new cgm($$1, o($$0)));
   }

   @Override
   public void a(cjh $$0, cpx $$1, List<tn> $$2, cky $$3) {
      $$2.add(tn.a("item.minecraft.bundle.fullness", o($$0), 64).a(n.h));
   }

   @Override
   public void a(byp $$0) {
      cjj.a($$0, q($$0.q()));
   }

   private void a(bis $$0) {
      $$0.a(apf.cJ, 0.8F, 0.8F + $$0.dL().D_().i() * 0.4F);
   }

   private void b(bis $$0) {
      $$0.a(apf.cI, 0.8F, 0.8F + $$0.dL().D_().i() * 0.4F);
   }

   private void c(bis $$0) {
      $$0.a(apf.cH, 0.8F, 0.8F + $$0.dL().D_().i() * 0.4F);
   }
}
