import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class chc extends civ {
   private static final String b = "Items";
   public static final int a = 64;
   private static final int c = 4;
   private static final int d = ars.f(0.4F, 0.4F, 1.0F);

   public chc(civ.a $$0) {
      super($$0);
   }

   public static float d(cja $$0) {
      return (float)o($$0) / 64.0F;
   }

   @Override
   public boolean a(cja $$0, cfy $$1, ceo $$2, cbp $$3) {
      if ($$2 != ceo.b) {
         return false;
      } else {
         cja $$4 = $$1.e();
         if ($$4.b()) {
            this.a($$3);
            p($$0).ifPresent($$2x -> b($$0, $$1.f($$2x)));
         } else if ($$4.d().ag_()) {
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
   public boolean a(cja $$0, cja $$1, cfy $$2, ceo $$3, cbp $$4, bjt $$5) {
      if ($$3 == ceo.b && $$2.b($$4)) {
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
   public bgu<cja> a(cpq $$0, cbp $$1, bgs $$2) {
      cja $$3 = $$1.b($$2);
      if (a($$3, $$1)) {
         this.c($$1);
         $$1.b(apj.c.b(this));
         return bgu.a($$3, $$0.r_());
      } else {
         return bgu.d($$3);
      }
   }

   @Override
   public boolean e(cja $$0) {
      return o($$0) > 0;
   }

   @Override
   public int f(cja $$0) {
      return Math.min(1 + 12 * o($$0) / 64, 13);
   }

   @Override
   public int g(cja $$0) {
      return d;
   }

   private static int b(cja $$0, cja $$1) {
      if (!$$1.b() && $$1.d().ag_()) {
         qu $$2 = $$0.w();
         if (!$$2.e("Items")) {
            $$2.a("Items", new ra());
         }

         int $$3 = o($$0);
         int $$4 = k($$1);
         int $$5 = Math.min($$1.L(), (64 - $$3) / $$4);
         if ($$5 == 0) {
            return 0;
         } else {
            ra $$6 = $$2.c("Items", 10);
            Optional<qu> $$7 = a($$1, $$6);
            if ($$7.isPresent()) {
               qu $$8 = $$7.get();
               cja $$9 = cja.a($$8);
               $$9.g($$5);
               $$9.b($$8);
               $$6.remove($$8);
               $$6.c(0, $$8);
            } else {
               cja $$10 = $$1.c($$5);
               qu $$11 = new qu();
               $$10.b($$11);
               $$6.c(0, $$11);
            }

            return $$5;
         }
      } else {
         return 0;
      }
   }

   private static Optional<qu> a(cja $$0, ra $$1) {
      return $$0.a(cjd.qg)
         ? Optional.empty()
         : $$1.stream().filter(qu.class::isInstance).map(qu.class::cast).filter($$1x -> cja.c(cja.a($$1x), $$0)).findFirst();
   }

   private static int k(cja $$0) {
      if ($$0.a(cjd.qg)) {
         return 4 + o($$0);
      } else {
         if (($$0.a(cjd.vC) || $$0.a(cjd.vB)) && $$0.u()) {
            qu $$1 = cgt.a($$0);
            if ($$1 != null && !$$1.c("Bees", 10).isEmpty()) {
               return 64;
            }
         }

         return 64 / $$0.g();
      }
   }

   private static int o(cja $$0) {
      return q($$0).mapToInt($$0x -> k($$0x) * $$0x.L()).sum();
   }

   private static Optional<cja> p(cja $$0) {
      qu $$1 = $$0.w();
      if (!$$1.e("Items")) {
         return Optional.empty();
      } else {
         ra $$2 = $$1.c("Items", 10);
         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            int $$3 = 0;
            qu $$4 = $$2.a(0);
            cja $$5 = cja.a($$4);
            $$2.c(0);
            if ($$2.isEmpty()) {
               $$0.c("Items");
            }

            return Optional.of($$5);
         }
      }
   }

   private static boolean a(cja $$0, cbp $$1) {
      qu $$2 = $$0.w();
      if (!$$2.e("Items")) {
         return false;
      } else {
         if ($$1 instanceof ako) {
            ra $$3 = $$2.c("Items", 10);

            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               qu $$5 = $$3.a($$4);
               cja $$6 = cja.a($$5);
               $$1.a($$6, true);
            }
         }

         $$0.c("Items");
         return true;
      }
   }

   private static Stream<cja> q(cja $$0) {
      qu $$1 = $$0.v();
      if ($$1 == null) {
         return Stream.empty();
      } else {
         ra $$2 = $$1.c("Items", 10);
         return $$2.stream().map(qu.class::cast).map(cja::a);
      }
   }

   @Override
   public Optional<cgg> h(cja $$0) {
      hp<cja> $$1 = hp.a();
      q($$0).forEach($$1::add);
      return Optional.of(new cgf($$1, o($$0)));
   }

   @Override
   public void a(cja $$0, cpq $$1, List<ti> $$2, ckr $$3) {
      $$2.add(ti.a("item.minecraft.bundle.fullness", o($$0), 64).a(n.h));
   }

   @Override
   public void a(byi $$0) {
      cjc.a($$0, q($$0.j()));
   }

   private void a(bil $$0) {
      $$0.a(aoz.cJ, 0.8F, 0.8F + $$0.dK().y_().i() * 0.4F);
   }

   private void b(bil $$0) {
      $$0.a(aoz.cI, 0.8F, 0.8F + $$0.dK().y_().i() * 0.4F);
   }

   private void c(bil $$0) {
      $$0.a(aoz.cH, 0.8F, 0.8F + $$0.dK().y_().i() * 0.4F);
   }
}
