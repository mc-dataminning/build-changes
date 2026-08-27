import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class cnb extends cou {
   private static final String b = "Items";
   public static final int a = 64;
   private static final int c = 4;
   private static final int d = awh.f(0.4F, 0.4F, 1.0F);

   public cnb(cou.a $$0) {
      super($$0);
   }

   public static float d(coz $$0) {
      return (float)o($$0) / 64.0F;
   }

   @Override
   public boolean a(coz $$0, clw $$1, ckj $$2, chh $$3) {
      if ($$2 != ckj.b) {
         return false;
      } else {
         coz $$4 = $$1.g();
         if ($$4.b()) {
            this.a($$3);
            p($$0).ifPresent($$2x -> b($$0, $$1.d($$2x)));
         } else if ($$4.d().ar_()) {
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
   public boolean a(coz $$0, coz $$1, clw $$2, ckj $$3, chh $$4, box $$5) {
      if ($$3 == ckj.b && $$2.b($$4)) {
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
   public blv<coz> a(cvn $$0, chh $$1, blt $$2) {
      coz $$3 = $$1.b($$2);
      if (a($$3, $$1)) {
         this.c($$1);
         $$1.b(atu.c.b(this));
         return blv.a($$3, $$0.y_());
      } else {
         return blv.d($$3);
      }
   }

   @Override
   public boolean e(coz $$0) {
      return o($$0) > 0;
   }

   @Override
   public int f(coz $$0) {
      return Math.min(1 + 12 * o($$0) / 64, 13);
   }

   @Override
   public int g(coz $$0) {
      return d;
   }

   private static int b(coz $$0, coz $$1) {
      if (!$$1.b() && $$1.d().ar_()) {
         sw $$2 = $$0.x();
         if (!$$2.e("Items")) {
            $$2.a("Items", new tc());
         }

         int $$3 = o($$0);
         int $$4 = k($$1);
         int $$5 = Math.min($$1.M(), (64 - $$3) / $$4);
         if ($$5 == 0) {
            return 0;
         } else {
            tc $$6 = $$2.c("Items", 10);
            Optional<sw> $$7 = a($$1, $$6);
            if ($$7.isPresent()) {
               sw $$8 = $$7.get();
               coz $$9 = coz.a($$8);
               $$9.g($$5);
               $$9.b($$8);
               $$6.remove($$8);
               $$6.c(0, $$8);
            } else {
               coz $$10 = $$1.c($$5);
               sw $$11 = new sw();
               $$10.b($$11);
               $$6.c(0, $$11);
            }

            return $$5;
         }
      } else {
         return 0;
      }
   }

   private static Optional<sw> a(coz $$0, tc $$1) {
      return $$0.a(cpc.qT)
         ? Optional.empty()
         : $$1.stream().filter(sw.class::isInstance).map(sw.class::cast).filter($$1x -> coz.c(coz.a($$1x), $$0)).findFirst();
   }

   private static int k(coz $$0) {
      if ($$0.a(cpc.qT)) {
         return 4 + o($$0);
      } else {
         if (($$0.a(cpc.ws) || $$0.a(cpc.wr)) && $$0.v()) {
            sw $$1 = cms.a($$0);
            if ($$1 != null && !$$1.c("Bees", 10).isEmpty()) {
               return 64;
            }
         }

         return 64 / $$0.g();
      }
   }

   private static int o(coz $$0) {
      return q($$0).mapToInt($$0x -> k($$0x) * $$0x.M()).sum();
   }

   private static Optional<coz> p(coz $$0) {
      sw $$1 = $$0.x();
      if (!$$1.e("Items")) {
         return Optional.empty();
      } else {
         tc $$2 = $$1.c("Items", 10);
         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            int $$3 = 0;
            sw $$4 = $$2.a(0);
            coz $$5 = coz.a($$4);
            $$2.c(0);
            if ($$2.isEmpty()) {
               $$0.c("Items");
            }

            return Optional.of($$5);
         }
      }
   }

   private static boolean a(coz $$0, chh $$1) {
      sw $$2 = $$0.x();
      if (!$$2.e("Items")) {
         return false;
      } else {
         if ($$1 instanceof aow) {
            tc $$3 = $$2.c("Items", 10);

            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               sw $$5 = $$3.a($$4);
               coz $$6 = coz.a($$5);
               $$1.a($$6, true);
            }
         }

         $$0.c("Items");
         return true;
      }
   }

   private static Stream<coz> q(coz $$0) {
      sw $$1 = $$0.w();
      if ($$1 == null) {
         return Stream.empty();
      } else {
         tc $$2 = $$1.c("Items", 10);
         return $$2.stream().map(sw.class::cast).map(coz::a);
      }
   }

   @Override
   public Optional<cme> h(coz $$0) {
      is<coz> $$1 = is.a();
      q($$0).forEach($$1::add);
      return Optional.of(new cmd($$1, o($$0)));
   }

   @Override
   public void a(coz $$0, cvn $$1, List<vq> $$2, cqq $$3) {
      $$2.add(vq.a("item.minecraft.bundle.fullness", o($$0), 64).a(n.h));
   }

   @Override
   public void a(cds $$0) {
      cpb.a($$0, q($$0.q()));
   }

   private void a(bno $$0) {
      $$0.a(atk.dh, 0.8F, 0.8F + $$0.dM().F_().i() * 0.4F);
   }

   private void b(bno $$0) {
      $$0.a(atk.dg, 0.8F, 0.8F + $$0.dM().F_().i() * 0.4F);
   }

   private void c(bno $$0) {
      $$0.a(atk.df, 0.8F, 0.8F + $$0.dM().F_().i() * 0.4F);
   }
}
