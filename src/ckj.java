import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ckj extends cmc {
   private static final String b = "Items";
   public static final int a = 64;
   private static final int c = 4;
   private static final int d = aty.f(0.4F, 0.4F, 1.0F);

   public ckj(cmc.a $$0) {
      super($$0);
   }

   public static float d(cmh $$0) {
      return (float)o($$0) / 64.0F;
   }

   @Override
   public boolean a(cmh $$0, cjf $$1, chs $$2, cer $$3) {
      if ($$2 != chs.b) {
         return false;
      } else {
         cmh $$4 = $$1.g();
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
   public boolean a(cmh $$0, cmh $$1, cjf $$2, chs $$3, cer $$4, bmn $$5) {
      if ($$3 == chs.b && $$2.b($$4)) {
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
   public bjm<cmh> a(csy $$0, cer $$1, bjk $$2) {
      cmh $$3 = $$1.b($$2);
      if (a($$3, $$1)) {
         this.c($$1);
         $$1.b(arm.c.b(this));
         return bjm.a($$3, $$0.y_());
      } else {
         return bjm.d($$3);
      }
   }

   @Override
   public boolean e(cmh $$0) {
      return o($$0) > 0;
   }

   @Override
   public int f(cmh $$0) {
      return Math.min(1 + 12 * o($$0) / 64, 13);
   }

   @Override
   public int g(cmh $$0) {
      return d;
   }

   private static int b(cmh $$0, cmh $$1) {
      if (!$$1.b() && $$1.d().ap_()) {
         sj $$2 = $$0.w();
         if (!$$2.e("Items")) {
            $$2.a("Items", new sp());
         }

         int $$3 = o($$0);
         int $$4 = k($$1);
         int $$5 = Math.min($$1.L(), (64 - $$3) / $$4);
         if ($$5 == 0) {
            return 0;
         } else {
            sp $$6 = $$2.c("Items", 10);
            Optional<sj> $$7 = a($$1, $$6);
            if ($$7.isPresent()) {
               sj $$8 = $$7.get();
               cmh $$9 = cmh.a($$8);
               $$9.g($$5);
               $$9.b($$8);
               $$6.remove($$8);
               $$6.c(0, $$8);
            } else {
               cmh $$10 = $$1.c($$5);
               sj $$11 = new sj();
               $$10.b($$11);
               $$6.c(0, $$11);
            }

            return $$5;
         }
      } else {
         return 0;
      }
   }

   private static Optional<sj> a(cmh $$0, sp $$1) {
      return $$0.a(cmk.qR)
         ? Optional.empty()
         : $$1.stream().filter(sj.class::isInstance).map(sj.class::cast).filter($$1x -> cmh.c(cmh.a($$1x), $$0)).findFirst();
   }

   private static int k(cmh $$0) {
      if ($$0.a(cmk.qR)) {
         return 4 + o($$0);
      } else {
         if (($$0.a(cmk.wp) || $$0.a(cmk.wo)) && $$0.u()) {
            sj $$1 = cka.a($$0);
            if ($$1 != null && !$$1.c("Bees", 10).isEmpty()) {
               return 64;
            }
         }

         return 64 / $$0.g();
      }
   }

   private static int o(cmh $$0) {
      return q($$0).mapToInt($$0x -> k($$0x) * $$0x.L()).sum();
   }

   private static Optional<cmh> p(cmh $$0) {
      sj $$1 = $$0.w();
      if (!$$1.e("Items")) {
         return Optional.empty();
      } else {
         sp $$2 = $$1.c("Items", 10);
         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            int $$3 = 0;
            sj $$4 = $$2.a(0);
            cmh $$5 = cmh.a($$4);
            $$2.c(0);
            if ($$2.isEmpty()) {
               $$0.c("Items");
            }

            return Optional.of($$5);
         }
      }
   }

   private static boolean a(cmh $$0, cer $$1) {
      sj $$2 = $$0.w();
      if (!$$2.e("Items")) {
         return false;
      } else {
         if ($$1 instanceof amq) {
            sp $$3 = $$2.c("Items", 10);

            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               sj $$5 = $$3.a($$4);
               cmh $$6 = cmh.a($$5);
               $$1.a($$6, true);
            }
         }

         $$0.c("Items");
         return true;
      }
   }

   private static Stream<cmh> q(cmh $$0) {
      sj $$1 = $$0.v();
      if ($$1 == null) {
         return Stream.empty();
      } else {
         sp $$2 = $$1.c("Items", 10);
         return $$2.stream().map(sj.class::cast).map(cmh::a);
      }
   }

   @Override
   public Optional<cjn> h(cmh $$0) {
      io<cmh> $$1 = io.a();
      q($$0).forEach($$1::add);
      return Optional.of(new cjm($$1, o($$0)));
   }

   @Override
   public void a(cmh $$0, csy $$1, List<vb> $$2, cny $$3) {
      $$2.add(vb.a("item.minecraft.bundle.fullness", o($$0), 64).a(n.h));
   }

   @Override
   public void a(cbe $$0) {
      cmj.a($$0, q($$0.q()));
   }

   private void a(blf $$0) {
      $$0.a(arc.cS, 0.8F, 0.8F + $$0.dM().F_().i() * 0.4F);
   }

   private void b(blf $$0) {
      $$0.a(arc.cR, 0.8F, 0.8F + $$0.dM().F_().i() * 0.4F);
   }

   private void c(blf $$0) {
      $$0.a(arc.cQ, 0.8F, 0.8F + $$0.dM().F_().i() * 0.4F);
   }
}
