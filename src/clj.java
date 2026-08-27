import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class clj extends cnb {
   private static final String b = "Items";
   public static final int a = 64;
   private static final int c = 4;
   private static final int d = aup.f(0.4F, 0.4F, 1.0F);

   public clj(cnb.a $$0) {
      super($$0);
   }

   public static float d(cng $$0) {
      return (float)o($$0) / 64.0F;
   }

   @Override
   public boolean a(cng $$0, cke $$1, cir $$2, cfq $$3) {
      if ($$2 != cir.b) {
         return false;
      } else {
         cng $$4 = $$1.g();
         if ($$4.b()) {
            this.a($$3);
            p($$0).ifPresent($$2x -> b($$0, $$1.d($$2x)));
         } else if ($$4.d().ar_()) {
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
   public boolean a(cng $$0, cng $$1, cke $$2, cir $$3, cfq $$4, bng $$5) {
      if ($$3 == cir.b && $$2.b($$4)) {
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
   public bkd<cng> a(ctx $$0, cfq $$1, bkb $$2) {
      cng $$3 = $$1.b($$2);
      if (a($$3, $$1)) {
         this.c($$1);
         $$1.b(asd.c.b(this));
         return bkd.a($$3, $$0.y_());
      } else {
         return bkd.d($$3);
      }
   }

   @Override
   public boolean e(cng $$0) {
      return o($$0) > 0;
   }

   @Override
   public int f(cng $$0) {
      return Math.min(1 + 12 * o($$0) / 64, 13);
   }

   @Override
   public int g(cng $$0) {
      return d;
   }

   private static int b(cng $$0, cng $$1) {
      if (!$$1.b() && $$1.d().ar_()) {
         so $$2 = $$0.w();
         if (!$$2.e("Items")) {
            $$2.a("Items", new su());
         }

         int $$3 = o($$0);
         int $$4 = k($$1);
         int $$5 = Math.min($$1.L(), (64 - $$3) / $$4);
         if ($$5 == 0) {
            return 0;
         } else {
            su $$6 = $$2.c("Items", 10);
            Optional<so> $$7 = a($$1, $$6);
            if ($$7.isPresent()) {
               so $$8 = $$7.get();
               cng $$9 = cng.a($$8);
               $$9.g($$5);
               $$9.b($$8);
               $$6.remove($$8);
               $$6.c(0, $$8);
            } else {
               cng $$10 = $$1.c($$5);
               so $$11 = new so();
               $$10.b($$11);
               $$6.c(0, $$11);
            }

            return $$5;
         }
      } else {
         return 0;
      }
   }

   private static Optional<so> a(cng $$0, su $$1) {
      return $$0.a(cnj.qT)
         ? Optional.empty()
         : $$1.stream().filter(so.class::isInstance).map(so.class::cast).filter($$1x -> cng.c(cng.a($$1x), $$0)).findFirst();
   }

   private static int k(cng $$0) {
      if ($$0.a(cnj.qT)) {
         return 4 + o($$0);
      } else {
         if (($$0.a(cnj.ws) || $$0.a(cnj.wr)) && $$0.u()) {
            so $$1 = cla.a($$0);
            if ($$1 != null && !$$1.c("Bees", 10).isEmpty()) {
               return 64;
            }
         }

         return 64 / $$0.g();
      }
   }

   private static int o(cng $$0) {
      return q($$0).mapToInt($$0x -> k($$0x) * $$0x.L()).sum();
   }

   private static Optional<cng> p(cng $$0) {
      so $$1 = $$0.w();
      if (!$$1.e("Items")) {
         return Optional.empty();
      } else {
         su $$2 = $$1.c("Items", 10);
         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            int $$3 = 0;
            so $$4 = $$2.a(0);
            cng $$5 = cng.a($$4);
            $$2.c(0);
            if ($$2.isEmpty()) {
               $$0.c("Items");
            }

            return Optional.of($$5);
         }
      }
   }

   private static boolean a(cng $$0, cfq $$1) {
      so $$2 = $$0.w();
      if (!$$2.e("Items")) {
         return false;
      } else {
         if ($$1 instanceof anf) {
            su $$3 = $$2.c("Items", 10);

            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               so $$5 = $$3.a($$4);
               cng $$6 = cng.a($$5);
               $$1.a($$6, true);
            }
         }

         $$0.c("Items");
         return true;
      }
   }

   private static Stream<cng> q(cng $$0) {
      so $$1 = $$0.v();
      if ($$1 == null) {
         return Stream.empty();
      } else {
         su $$2 = $$1.c("Items", 10);
         return $$2.stream().map(so.class::cast).map(cng::a);
      }
   }

   @Override
   public Optional<ckm> h(cng $$0) {
      iq<cng> $$1 = iq.a();
      q($$0).forEach($$1::add);
      return Optional.of(new ckl($$1, o($$0)));
   }

   @Override
   public void a(cng $$0, ctx $$1, List<vg> $$2, coy $$3) {
      $$2.add(vg.a("item.minecraft.bundle.fullness", o($$0), 64).a(n.h));
   }

   @Override
   public void a(ccb $$0) {
      cni.a($$0, q($$0.q()));
   }

   private void a(blw $$0) {
      $$0.a(art.dh, 0.8F, 0.8F + $$0.dL().F_().i() * 0.4F);
   }

   private void b(blw $$0) {
      $$0.a(art.dg, 0.8F, 0.8F + $$0.dL().F_().i() * 0.4F);
   }

   private void c(blw $$0) {
      $$0.a(art.df, 0.8F, 0.8F + $$0.dL().F_().i() * 0.4F);
   }
}
