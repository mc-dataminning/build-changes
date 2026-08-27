import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ckt extends cmm {
   private static final String b = "Items";
   public static final int a = 64;
   private static final int c = 4;
   private static final int d = aui.f(0.4F, 0.4F, 1.0F);

   public ckt(cmm.a $$0) {
      super($$0);
   }

   public static float d(cmr $$0) {
      return (float)o($$0) / 64.0F;
   }

   @Override
   public boolean a(cmr $$0, cjp $$1, cic $$2, cfb $$3) {
      if ($$2 != cic.b) {
         return false;
      } else {
         cmr $$4 = $$1.g();
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
   public boolean a(cmr $$0, cmr $$1, cjp $$2, cic $$3, cfb $$4, bmx $$5) {
      if ($$3 == cic.b && $$2.b($$4)) {
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
   public bjw<cmr> a(cti $$0, cfb $$1, bju $$2) {
      cmr $$3 = $$1.b($$2);
      if (a($$3, $$1)) {
         this.c($$1);
         $$1.b(arw.c.b(this));
         return bjw.a($$3, $$0.y_());
      } else {
         return bjw.d($$3);
      }
   }

   @Override
   public boolean e(cmr $$0) {
      return o($$0) > 0;
   }

   @Override
   public int f(cmr $$0) {
      return Math.min(1 + 12 * o($$0) / 64, 13);
   }

   @Override
   public int g(cmr $$0) {
      return d;
   }

   private static int b(cmr $$0, cmr $$1) {
      if (!$$1.b() && $$1.d().ap_()) {
         sl $$2 = $$0.w();
         if (!$$2.e("Items")) {
            $$2.a("Items", new sr());
         }

         int $$3 = o($$0);
         int $$4 = k($$1);
         int $$5 = Math.min($$1.L(), (64 - $$3) / $$4);
         if ($$5 == 0) {
            return 0;
         } else {
            sr $$6 = $$2.c("Items", 10);
            Optional<sl> $$7 = a($$1, $$6);
            if ($$7.isPresent()) {
               sl $$8 = $$7.get();
               cmr $$9 = cmr.a($$8);
               $$9.g($$5);
               $$9.b($$8);
               $$6.remove($$8);
               $$6.c(0, $$8);
            } else {
               cmr $$10 = $$1.c($$5);
               sl $$11 = new sl();
               $$10.b($$11);
               $$6.c(0, $$11);
            }

            return $$5;
         }
      } else {
         return 0;
      }
   }

   private static Optional<sl> a(cmr $$0, sr $$1) {
      return $$0.a(cmu.qR)
         ? Optional.empty()
         : $$1.stream().filter(sl.class::isInstance).map(sl.class::cast).filter($$1x -> cmr.c(cmr.a($$1x), $$0)).findFirst();
   }

   private static int k(cmr $$0) {
      if ($$0.a(cmu.qR)) {
         return 4 + o($$0);
      } else {
         if (($$0.a(cmu.wp) || $$0.a(cmu.wo)) && $$0.u()) {
            sl $$1 = ckk.a($$0);
            if ($$1 != null && !$$1.c("Bees", 10).isEmpty()) {
               return 64;
            }
         }

         return 64 / $$0.g();
      }
   }

   private static int o(cmr $$0) {
      return q($$0).mapToInt($$0x -> k($$0x) * $$0x.L()).sum();
   }

   private static Optional<cmr> p(cmr $$0) {
      sl $$1 = $$0.w();
      if (!$$1.e("Items")) {
         return Optional.empty();
      } else {
         sr $$2 = $$1.c("Items", 10);
         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            int $$3 = 0;
            sl $$4 = $$2.a(0);
            cmr $$5 = cmr.a($$4);
            $$2.c(0);
            if ($$2.isEmpty()) {
               $$0.c("Items");
            }

            return Optional.of($$5);
         }
      }
   }

   private static boolean a(cmr $$0, cfb $$1) {
      sl $$2 = $$0.w();
      if (!$$2.e("Items")) {
         return false;
      } else {
         if ($$1 instanceof ana) {
            sr $$3 = $$2.c("Items", 10);

            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               sl $$5 = $$3.a($$4);
               cmr $$6 = cmr.a($$5);
               $$1.a($$6, true);
            }
         }

         $$0.c("Items");
         return true;
      }
   }

   private static Stream<cmr> q(cmr $$0) {
      sl $$1 = $$0.v();
      if ($$1 == null) {
         return Stream.empty();
      } else {
         sr $$2 = $$1.c("Items", 10);
         return $$2.stream().map(sl.class::cast).map(cmr::a);
      }
   }

   @Override
   public Optional<cjx> h(cmr $$0) {
      iq<cmr> $$1 = iq.a();
      q($$0).forEach($$1::add);
      return Optional.of(new cjw($$1, o($$0)));
   }

   @Override
   public void a(cmr $$0, cti $$1, List<vd> $$2, coi $$3) {
      $$2.add(vd.a("item.minecraft.bundle.fullness", o($$0), 64).a(n.h));
   }

   @Override
   public void a(cbo $$0) {
      cmt.a($$0, q($$0.q()));
   }

   private void a(blp $$0) {
      $$0.a(arm.cS, 0.8F, 0.8F + $$0.dM().F_().i() * 0.4F);
   }

   private void b(blp $$0) {
      $$0.a(arm.cR, 0.8F, 0.8F + $$0.dM().F_().i() * 0.4F);
   }

   private void c(blp $$0) {
      $$0.a(arm.cQ, 0.8F, 0.8F + $$0.dM().F_().i() * 0.4F);
   }
}
