import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ceb extends cfu {
   private static final String b = "Items";
   public static final int a = 64;
   private static final int c = 4;
   private static final int d = apa.f(0.4F, 0.4F, 1.0F);

   public ceb(cfu.a $$0) {
      super($$0);
   }

   public static float d(cfz $$0) {
      return (float)o($$0) / 64.0F;
   }

   @Override
   public boolean a(cfz $$0, ccx $$1, cbn $$2, byo $$3) {
      if ($$2 != cbn.b) {
         return false;
      } else {
         cfz $$4 = $$1.e();
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
   public boolean a(cfz $$0, cfz $$1, ccx $$2, cbn $$3, byo $$4, bgs $$5) {
      if ($$3 == cbn.b && $$2.b($$4)) {
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
   public bdy<cfz> a(cmm $$0, byo $$1, bdw $$2) {
      cfz $$3 = $$1.b($$2);
      if (a($$3, $$1)) {
         this.c($$1);
         $$1.b(amr.c.b(this));
         return bdy.a($$3, $$0.r_());
      } else {
         return bdy.d($$3);
      }
   }

   @Override
   public boolean e(cfz $$0) {
      return o($$0) > 0;
   }

   @Override
   public int f(cfz $$0) {
      return Math.min(1 + 12 * o($$0) / 64, 13);
   }

   @Override
   public int g(cfz $$0) {
      return d;
   }

   private static int b(cfz $$0, cfz $$1) {
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
               cfz $$9 = cfz.a($$8);
               $$9.g($$5);
               $$9.b($$8);
               $$6.remove($$8);
               $$6.c(0, $$8);
            } else {
               cfz $$10 = $$1.c($$5);
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

   private static Optional<qr> a(cfz $$0, qx $$1) {
      return $$0.a(cgc.qg)
         ? Optional.empty()
         : $$1.stream().filter(qr.class::isInstance).map(qr.class::cast).filter($$1x -> cfz.c(cfz.a($$1x), $$0)).findFirst();
   }

   private static int k(cfz $$0) {
      if ($$0.a(cgc.qg)) {
         return 4 + o($$0);
      } else {
         if (($$0.a(cgc.vC) || $$0.a(cgc.vB)) && $$0.u()) {
            qr $$1 = cds.a($$0);
            if ($$1 != null && !$$1.c("Bees", 10).isEmpty()) {
               return 64;
            }
         }

         return 64 / $$0.g();
      }
   }

   private static int o(cfz $$0) {
      return q($$0).mapToInt($$0x -> k($$0x) * $$0x.L()).sum();
   }

   private static Optional<cfz> p(cfz $$0) {
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
            cfz $$5 = cfz.a($$4);
            $$2.c(0);
            if ($$2.isEmpty()) {
               $$0.c("Items");
            }

            return Optional.of($$5);
         }
      }
   }

   private static boolean a(cfz $$0, byo $$1) {
      qr $$2 = $$0.w();
      if (!$$2.e("Items")) {
         return false;
      } else {
         if ($$1 instanceof aig) {
            qx $$3 = $$2.c("Items", 10);

            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               qr $$5 = $$3.a($$4);
               cfz $$6 = cfz.a($$5);
               $$1.a($$6, true);
            }
         }

         $$0.c("Items");
         return true;
      }
   }

   private static Stream<cfz> q(cfz $$0) {
      qr $$1 = $$0.v();
      if ($$1 == null) {
         return Stream.empty();
      } else {
         qx $$2 = $$1.c("Items", 10);
         return $$2.stream().map(qr.class::cast).map(cfz::a);
      }
   }

   @Override
   public Optional<cdf> h(cfz $$0) {
      hn<cfz> $$1 = hn.a();
      q($$0).forEach($$1::add);
      return Optional.of(new cde($$1, o($$0)));
   }

   @Override
   public void a(cfz $$0, cmm $$1, List<sw> $$2, chq $$3) {
      $$2.add(sw.a("item.minecraft.bundle.fullness", o($$0), 64).a(n.h));
   }

   @Override
   public void a(bvh $$0) {
      cgb.a($$0, q($$0.j()));
   }

   private void a(bfj $$0) {
      $$0.a(amh.cJ, 0.8F, 0.8F + $$0.dI().y_().i() * 0.4F);
   }

   private void b(bfj $$0) {
      $$0.a(amh.cI, 0.8F, 0.8F + $$0.dI().y_().i() * 0.4F);
   }

   private void c(bfj $$0) {
      $$0.a(amh.cH, 0.8F, 0.8F + $$0.dI().y_().i() * 0.4F);
   }
}
