import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class cha extends cit {
   private static final String b = "Items";
   public static final int a = 64;
   private static final int c = 4;
   private static final int d = arp.f(0.4F, 0.4F, 1.0F);

   public cha(cit.a $$0) {
      super($$0);
   }

   public static float d(ciy $$0) {
      return (float)o($$0) / 64.0F;
   }

   @Override
   public boolean a(ciy $$0, cfw $$1, cem $$2, cbn $$3) {
      if ($$2 != cem.b) {
         return false;
      } else {
         ciy $$4 = $$1.e();
         if ($$4.b()) {
            this.a($$3);
            p($$0).ifPresent($$2x -> b($$0, $$1.f($$2x)));
         } else if ($$4.d().ah_()) {
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
   public boolean a(ciy $$0, ciy $$1, cfw $$2, cem $$3, cbn $$4, bjr $$5) {
      if ($$3 == cem.b && $$2.b($$4)) {
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
   public bgr<ciy> a(cpm $$0, cbn $$1, bgp $$2) {
      ciy $$3 = $$1.b($$2);
      if (a($$3, $$1)) {
         this.c($$1);
         $$1.b(apg.c.b(this));
         return bgr.a($$3, $$0.r_());
      } else {
         return bgr.d($$3);
      }
   }

   @Override
   public boolean e(ciy $$0) {
      return o($$0) > 0;
   }

   @Override
   public int f(ciy $$0) {
      return Math.min(1 + 12 * o($$0) / 64, 13);
   }

   @Override
   public int g(ciy $$0) {
      return d;
   }

   private static int b(ciy $$0, ciy $$1) {
      if (!$$1.b() && $$1.d().ah_()) {
         qr $$2 = $$0.w();
         if (!$$2.e("Items")) {
            $$2.a("Items", new qx());
         }

         int $$3 = o($$0);
         int $$4 = k($$1);
         int $$5 = Math.min($$1.L(), (64 - $$3) / $$4);
         if ($$5 == 0) {
            return 0;
         } else {
            qx $$6 = $$2.c("Items", 10);
            Optional<qr> $$7 = a($$1, $$6);
            if ($$7.isPresent()) {
               qr $$8 = $$7.get();
               ciy $$9 = ciy.a($$8);
               $$9.g($$5);
               $$9.b($$8);
               $$6.remove($$8);
               $$6.c(0, $$8);
            } else {
               ciy $$10 = $$1.c($$5);
               qr $$11 = new qr();
               $$10.b($$11);
               $$6.c(0, $$11);
            }

            return $$5;
         }
      } else {
         return 0;
      }
   }

   private static Optional<qr> a(ciy $$0, qx $$1) {
      return $$0.a(cjb.qg)
         ? Optional.empty()
         : $$1.stream().filter(qr.class::isInstance).map(qr.class::cast).filter($$1x -> ciy.c(ciy.a($$1x), $$0)).findFirst();
   }

   private static int k(ciy $$0) {
      if ($$0.a(cjb.qg)) {
         return 4 + o($$0);
      } else {
         if (($$0.a(cjb.vC) || $$0.a(cjb.vB)) && $$0.u()) {
            qr $$1 = cgr.a($$0);
            if ($$1 != null && !$$1.c("Bees", 10).isEmpty()) {
               return 64;
            }
         }

         return 64 / $$0.g();
      }
   }

   private static int o(ciy $$0) {
      return q($$0).mapToInt($$0x -> k($$0x) * $$0x.L()).sum();
   }

   private static Optional<ciy> p(ciy $$0) {
      qr $$1 = $$0.w();
      if (!$$1.e("Items")) {
         return Optional.empty();
      } else {
         qx $$2 = $$1.c("Items", 10);
         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            int $$3 = 0;
            qr $$4 = $$2.a(0);
            ciy $$5 = ciy.a($$4);
            $$2.c(0);
            if ($$2.isEmpty()) {
               $$0.c("Items");
            }

            return Optional.of($$5);
         }
      }
   }

   private static boolean a(ciy $$0, cbn $$1) {
      qr $$2 = $$0.w();
      if (!$$2.e("Items")) {
         return false;
      } else {
         if ($$1 instanceof akl) {
            qx $$3 = $$2.c("Items", 10);

            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               qr $$5 = $$3.a($$4);
               ciy $$6 = ciy.a($$5);
               $$1.a($$6, true);
            }
         }

         $$0.c("Items");
         return true;
      }
   }

   private static Stream<ciy> q(ciy $$0) {
      qr $$1 = $$0.v();
      if ($$1 == null) {
         return Stream.empty();
      } else {
         qx $$2 = $$1.c("Items", 10);
         return $$2.stream().map(qr.class::cast).map(ciy::a);
      }
   }

   @Override
   public Optional<cge> h(ciy $$0) {
      hn<ciy> $$1 = hn.a();
      q($$0).forEach($$1::add);
      return Optional.of(new cgd($$1, o($$0)));
   }

   @Override
   public void a(ciy $$0, cpm $$1, List<tf> $$2, ckp $$3) {
      $$2.add(tf.a("item.minecraft.bundle.fullness", o($$0), 64).a(n.h));
   }

   @Override
   public void a(byg $$0) {
      cja.a($$0, q($$0.j()));
   }

   private void a(bii $$0) {
      $$0.a(aow.cJ, 0.8F, 0.8F + $$0.dK().y_().i() * 0.4F);
   }

   private void b(bii $$0) {
      $$0.a(aow.cI, 0.8F, 0.8F + $$0.dK().y_().i() * 0.4F);
   }

   private void c(bii $$0) {
      $$0.a(aow.cH, 0.8F, 0.8F + $$0.dK().y_().i() * 0.4F);
   }
}
