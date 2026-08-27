import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class chh extends cja {
   private static final String b = "Items";
   public static final int a = 64;
   private static final int c = 4;
   private static final int d = arx.f(0.4F, 0.4F, 1.0F);

   public chh(cja.a $$0) {
      super($$0);
   }

   public static float d(cjf $$0) {
      return (float)o($$0) / 64.0F;
   }

   @Override
   public boolean a(cjf $$0, cgd $$1, cet $$2, cbu $$3) {
      if ($$2 != cet.b) {
         return false;
      } else {
         cjf $$4 = $$1.e();
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
   public boolean a(cjf $$0, cjf $$1, cgd $$2, cet $$3, cbu $$4, bjy $$5) {
      if ($$3 == cet.b && $$2.b($$4)) {
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
   public bgz<cjf> a(cpv $$0, cbu $$1, bgx $$2) {
      cjf $$3 = $$1.b($$2);
      if (a($$3, $$1)) {
         this.c($$1);
         $$1.b(apo.c.b(this));
         return bgz.a($$3, $$0.w_());
      } else {
         return bgz.d($$3);
      }
   }

   @Override
   public boolean e(cjf $$0) {
      return o($$0) > 0;
   }

   @Override
   public int f(cjf $$0) {
      return Math.min(1 + 12 * o($$0) / 64, 13);
   }

   @Override
   public int g(cjf $$0) {
      return d;
   }

   private static int b(cjf $$0, cjf $$1) {
      if (!$$1.b() && $$1.d().al_()) {
         qx $$2 = $$0.w();
         if (!$$2.e("Items")) {
            $$2.a("Items", new rd());
         }

         int $$3 = o($$0);
         int $$4 = k($$1);
         int $$5 = Math.min($$1.L(), (64 - $$3) / $$4);
         if ($$5 == 0) {
            return 0;
         } else {
            rd $$6 = $$2.c("Items", 10);
            Optional<qx> $$7 = a($$1, $$6);
            if ($$7.isPresent()) {
               qx $$8 = $$7.get();
               cjf $$9 = cjf.a($$8);
               $$9.g($$5);
               $$9.b($$8);
               $$6.remove($$8);
               $$6.c(0, $$8);
            } else {
               cjf $$10 = $$1.c($$5);
               qx $$11 = new qx();
               $$10.b($$11);
               $$6.c(0, $$11);
            }

            return $$5;
         }
      } else {
         return 0;
      }
   }

   private static Optional<qx> a(cjf $$0, rd $$1) {
      return $$0.a(cji.qg)
         ? Optional.empty()
         : $$1.stream().filter(qx.class::isInstance).map(qx.class::cast).filter($$1x -> cjf.c(cjf.a($$1x), $$0)).findFirst();
   }

   private static int k(cjf $$0) {
      if ($$0.a(cji.qg)) {
         return 4 + o($$0);
      } else {
         if (($$0.a(cji.vC) || $$0.a(cji.vB)) && $$0.u()) {
            qx $$1 = cgy.a($$0);
            if ($$1 != null && !$$1.c("Bees", 10).isEmpty()) {
               return 64;
            }
         }

         return 64 / $$0.g();
      }
   }

   private static int o(cjf $$0) {
      return q($$0).mapToInt($$0x -> k($$0x) * $$0x.L()).sum();
   }

   private static Optional<cjf> p(cjf $$0) {
      qx $$1 = $$0.w();
      if (!$$1.e("Items")) {
         return Optional.empty();
      } else {
         rd $$2 = $$1.c("Items", 10);
         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            int $$3 = 0;
            qx $$4 = $$2.a(0);
            cjf $$5 = cjf.a($$4);
            $$2.c(0);
            if ($$2.isEmpty()) {
               $$0.c("Items");
            }

            return Optional.of($$5);
         }
      }
   }

   private static boolean a(cjf $$0, cbu $$1) {
      qx $$2 = $$0.w();
      if (!$$2.e("Items")) {
         return false;
      } else {
         if ($$1 instanceof aks) {
            rd $$3 = $$2.c("Items", 10);

            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               qx $$5 = $$3.a($$4);
               cjf $$6 = cjf.a($$5);
               $$1.a($$6, true);
            }
         }

         $$0.c("Items");
         return true;
      }
   }

   private static Stream<cjf> q(cjf $$0) {
      qx $$1 = $$0.v();
      if ($$1 == null) {
         return Stream.empty();
      } else {
         rd $$2 = $$1.c("Items", 10);
         return $$2.stream().map(qx.class::cast).map(cjf::a);
      }
   }

   @Override
   public Optional<cgl> h(cjf $$0) {
      hp<cjf> $$1 = hp.a();
      q($$0).forEach($$1::add);
      return Optional.of(new cgk($$1, o($$0)));
   }

   @Override
   public void a(cjf $$0, cpv $$1, List<tl> $$2, ckw $$3) {
      $$2.add(tl.a("item.minecraft.bundle.fullness", o($$0), 64).a(n.h));
   }

   @Override
   public void a(byn $$0) {
      cjh.a($$0, q($$0.q()));
   }

   private void a(biq $$0) {
      $$0.a(ape.cJ, 0.8F, 0.8F + $$0.dL().D_().i() * 0.4F);
   }

   private void b(biq $$0) {
      $$0.a(ape.cI, 0.8F, 0.8F + $$0.dL().D_().i() * 0.4F);
   }

   private void c(biq $$0) {
      $$0.a(ape.cH, 0.8F, 0.8F + $$0.dL().D_().i() * 0.4F);
   }
}
