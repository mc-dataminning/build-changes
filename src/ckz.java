import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ckz extends cms {
   private static final String b = "Items";
   public static final int a = 64;
   private static final int c = 4;
   private static final int d = aun.f(0.4F, 0.4F, 1.0F);

   public ckz(cms.a $$0) {
      super($$0);
   }

   public static float d(cmx $$0) {
      return (float)o($$0) / 64.0F;
   }

   @Override
   public boolean a(cmx $$0, cjv $$1, cii $$2, cfh $$3) {
      if ($$2 != cii.b) {
         return false;
      } else {
         cmx $$4 = $$1.g();
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
   public boolean a(cmx $$0, cmx $$1, cjv $$2, cii $$3, cfh $$4, bnc $$5) {
      if ($$3 == cii.b && $$2.b($$4)) {
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
   public bkb<cmx> a(cto $$0, cfh $$1, bjz $$2) {
      cmx $$3 = $$1.b($$2);
      if (a($$3, $$1)) {
         this.c($$1);
         $$1.b(asb.c.b(this));
         return bkb.a($$3, $$0.y_());
      } else {
         return bkb.d($$3);
      }
   }

   @Override
   public boolean e(cmx $$0) {
      return o($$0) > 0;
   }

   @Override
   public int f(cmx $$0) {
      return Math.min(1 + 12 * o($$0) / 64, 13);
   }

   @Override
   public int g(cmx $$0) {
      return d;
   }

   private static int b(cmx $$0, cmx $$1) {
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
               cmx $$9 = cmx.a($$8);
               $$9.g($$5);
               $$9.b($$8);
               $$6.remove($$8);
               $$6.c(0, $$8);
            } else {
               cmx $$10 = $$1.c($$5);
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

   private static Optional<sn> a(cmx $$0, st $$1) {
      return $$0.a(cna.qR)
         ? Optional.empty()
         : $$1.stream().filter(sn.class::isInstance).map(sn.class::cast).filter($$1x -> cmx.c(cmx.a($$1x), $$0)).findFirst();
   }

   private static int k(cmx $$0) {
      if ($$0.a(cna.qR)) {
         return 4 + o($$0);
      } else {
         if (($$0.a(cna.wp) || $$0.a(cna.wo)) && $$0.u()) {
            sn $$1 = ckq.a($$0);
            if ($$1 != null && !$$1.c("Bees", 10).isEmpty()) {
               return 64;
            }
         }

         return 64 / $$0.g();
      }
   }

   private static int o(cmx $$0) {
      return q($$0).mapToInt($$0x -> k($$0x) * $$0x.L()).sum();
   }

   private static Optional<cmx> p(cmx $$0) {
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
            cmx $$5 = cmx.a($$4);
            $$2.c(0);
            if ($$2.isEmpty()) {
               $$0.c("Items");
            }

            return Optional.of($$5);
         }
      }
   }

   private static boolean a(cmx $$0, cfh $$1) {
      sn $$2 = $$0.w();
      if (!$$2.e("Items")) {
         return false;
      } else {
         if ($$1 instanceof ane) {
            st $$3 = $$2.c("Items", 10);

            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               sn $$5 = $$3.a($$4);
               cmx $$6 = cmx.a($$5);
               $$1.a($$6, true);
            }
         }

         $$0.c("Items");
         return true;
      }
   }

   private static Stream<cmx> q(cmx $$0) {
      sn $$1 = $$0.v();
      if ($$1 == null) {
         return Stream.empty();
      } else {
         st $$2 = $$1.c("Items", 10);
         return $$2.stream().map(sn.class::cast).map(cmx::a);
      }
   }

   @Override
   public Optional<ckd> h(cmx $$0) {
      iq<cmx> $$1 = iq.a();
      q($$0).forEach($$1::add);
      return Optional.of(new ckc($$1, o($$0)));
   }

   @Override
   public void a(cmx $$0, cto $$1, List<vf> $$2, cop $$3) {
      $$2.add(vf.a("item.minecraft.bundle.fullness", o($$0), 64).a(n.h));
   }

   @Override
   public void a(cbt $$0) {
      cmz.a($$0, q($$0.q()));
   }

   private void a(blu $$0) {
      $$0.a(arr.cS, 0.8F, 0.8F + $$0.dM().F_().i() * 0.4F);
   }

   private void b(blu $$0) {
      $$0.a(arr.cR, 0.8F, 0.8F + $$0.dM().F_().i() * 0.4F);
   }

   private void c(blu $$0) {
      $$0.a(arr.cQ, 0.8F, 0.8F + $$0.dM().F_().i() * 0.4F);
   }
}
