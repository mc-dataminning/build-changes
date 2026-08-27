import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class cil extends cke {
   private static final String b = "Items";
   public static final int a = 64;
   private static final int c = 4;
   private static final int d = asy.f(0.4F, 0.4F, 1.0F);

   public cil(cke.a $$0) {
      super($$0);
   }

   public static float d(ckj $$0) {
      return (float)o($$0) / 64.0F;
   }

   @Override
   public boolean a(ckj $$0, chh $$1, cfx $$2, ccx $$3) {
      if ($$2 != cfx.b) {
         return false;
      } else {
         ckj $$4 = $$1.e();
         if ($$4.b()) {
            this.a($$3);
            p($$0).ifPresent($$2x -> b($$0, $$1.f($$2x)));
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
   public boolean a(ckj $$0, ckj $$1, chh $$2, cfx $$3, ccx $$4, blb $$5) {
      if ($$3 == cfx.b && $$2.b($$4)) {
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
   public bic<ckj> a(cqz $$0, ccx $$1, bia $$2) {
      ckj $$3 = $$1.b($$2);
      if (a($$3, $$1)) {
         this.c($$1);
         $$1.b(aqn.c.b(this));
         return bic.a($$3, $$0.x_());
      } else {
         return bic.d($$3);
      }
   }

   @Override
   public boolean e(ckj $$0) {
      return o($$0) > 0;
   }

   @Override
   public int f(ckj $$0) {
      return Math.min(1 + 12 * o($$0) / 64, 13);
   }

   @Override
   public int g(ckj $$0) {
      return d;
   }

   private static int b(ckj $$0, ckj $$1) {
      if (!$$1.b() && $$1.d().ao_()) {
         rt $$2 = $$0.w();
         if (!$$2.e("Items")) {
            $$2.a("Items", new rz());
         }

         int $$3 = o($$0);
         int $$4 = k($$1);
         int $$5 = Math.min($$1.L(), (64 - $$3) / $$4);
         if ($$5 == 0) {
            return 0;
         } else {
            rz $$6 = $$2.c("Items", 10);
            Optional<rt> $$7 = a($$1, $$6);
            if ($$7.isPresent()) {
               rt $$8 = $$7.get();
               ckj $$9 = ckj.a($$8);
               $$9.g($$5);
               $$9.b($$8);
               $$6.remove($$8);
               $$6.c(0, $$8);
            } else {
               ckj $$10 = $$1.c($$5);
               rt $$11 = new rt();
               $$10.b($$11);
               $$6.c(0, $$11);
            }

            return $$5;
         }
      } else {
         return 0;
      }
   }

   private static Optional<rt> a(ckj $$0, rz $$1) {
      return $$0.a(ckm.qg)
         ? Optional.empty()
         : $$1.stream().filter(rt.class::isInstance).map(rt.class::cast).filter($$1x -> ckj.c(ckj.a($$1x), $$0)).findFirst();
   }

   private static int k(ckj $$0) {
      if ($$0.a(ckm.qg)) {
         return 4 + o($$0);
      } else {
         if (($$0.a(ckm.vC) || $$0.a(ckm.vB)) && $$0.u()) {
            rt $$1 = cic.a($$0);
            if ($$1 != null && !$$1.c("Bees", 10).isEmpty()) {
               return 64;
            }
         }

         return 64 / $$0.g();
      }
   }

   private static int o(ckj $$0) {
      return q($$0).mapToInt($$0x -> k($$0x) * $$0x.L()).sum();
   }

   private static Optional<ckj> p(ckj $$0) {
      rt $$1 = $$0.w();
      if (!$$1.e("Items")) {
         return Optional.empty();
      } else {
         rz $$2 = $$1.c("Items", 10);
         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            int $$3 = 0;
            rt $$4 = $$2.a(0);
            ckj $$5 = ckj.a($$4);
            $$2.c(0);
            if ($$2.isEmpty()) {
               $$0.c("Items");
            }

            return Optional.of($$5);
         }
      }
   }

   private static boolean a(ckj $$0, ccx $$1) {
      rt $$2 = $$0.w();
      if (!$$2.e("Items")) {
         return false;
      } else {
         if ($$1 instanceof alr) {
            rz $$3 = $$2.c("Items", 10);

            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               rt $$5 = $$3.a($$4);
               ckj $$6 = ckj.a($$5);
               $$1.a($$6, true);
            }
         }

         $$0.c("Items");
         return true;
      }
   }

   private static Stream<ckj> q(ckj $$0) {
      rt $$1 = $$0.v();
      if ($$1 == null) {
         return Stream.empty();
      } else {
         rz $$2 = $$1.c("Items", 10);
         return $$2.stream().map(rt.class::cast).map(ckj::a);
      }
   }

   @Override
   public Optional<chp> h(ckj $$0) {
      il<ckj> $$1 = il.a();
      q($$0).forEach($$1::add);
      return Optional.of(new cho($$1, o($$0)));
   }

   @Override
   public void a(ckj $$0, cqz $$1, List<ui> $$2, cma $$3) {
      $$2.add(ui.a("item.minecraft.bundle.fullness", o($$0), 64).a(n.h));
   }

   @Override
   public void a(bzq $$0) {
      ckl.a($$0, q($$0.q()));
   }

   private void a(bjt $$0) {
      $$0.a(aqd.cJ, 0.8F, 0.8F + $$0.dL().E_().i() * 0.4F);
   }

   private void b(bjt $$0) {
      $$0.a(aqd.cI, 0.8F, 0.8F + $$0.dL().E_().i() * 0.4F);
   }

   private void c(bjt $$0) {
      $$0.a(aqd.cH, 0.8F, 0.8F + $$0.dL().E_().i() * 0.4F);
   }
}
