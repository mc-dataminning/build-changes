import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class cjd extends ckw {
   private static final String b = "Items";
   public static final int a = 64;
   private static final int c = 4;
   private static final int d = ati.f(0.4F, 0.4F, 1.0F);

   public cjd(ckw.a $$0) {
      super($$0);
   }

   public static float d(clb $$0) {
      return (float)o($$0) / 64.0F;
   }

   @Override
   public boolean a(clb $$0, chz $$1, cgm $$2, cdm $$3) {
      if ($$2 != cgm.b) {
         return false;
      } else {
         clb $$4 = $$1.f();
         if ($$4.b()) {
            this.a($$3);
            p($$0).ifPresent($$2x -> b($$0, $$1.d($$2x)));
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
   public boolean a(clb $$0, clb $$1, chz $$2, cgm $$3, cdm $$4, blq $$5) {
      if ($$3 == cgm.b && $$2.b($$4)) {
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
   public bir<clb> a(crs $$0, cdm $$1, bip $$2) {
      clb $$3 = $$1.b($$2);
      if (a($$3, $$1)) {
         this.c($$1);
         $$1.b(aqx.c.b(this));
         return bir.a($$3, $$0.x_());
      } else {
         return bir.d($$3);
      }
   }

   @Override
   public boolean e(clb $$0) {
      return o($$0) > 0;
   }

   @Override
   public int f(clb $$0) {
      return Math.min(1 + 12 * o($$0) / 64, 13);
   }

   @Override
   public int g(clb $$0) {
      return d;
   }

   private static int b(clb $$0, clb $$1) {
      if (!$$1.b() && $$1.d().ao_()) {
         rz $$2 = $$0.w();
         if (!$$2.e("Items")) {
            $$2.a("Items", new sf());
         }

         int $$3 = o($$0);
         int $$4 = k($$1);
         int $$5 = Math.min($$1.L(), (64 - $$3) / $$4);
         if ($$5 == 0) {
            return 0;
         } else {
            sf $$6 = $$2.c("Items", 10);
            Optional<rz> $$7 = a($$1, $$6);
            if ($$7.isPresent()) {
               rz $$8 = $$7.get();
               clb $$9 = clb.a($$8);
               $$9.g($$5);
               $$9.b($$8);
               $$6.remove($$8);
               $$6.c(0, $$8);
            } else {
               clb $$10 = $$1.c($$5);
               rz $$11 = new rz();
               $$10.b($$11);
               $$6.c(0, $$11);
            }

            return $$5;
         }
      } else {
         return 0;
      }
   }

   private static Optional<rz> a(clb $$0, sf $$1) {
      return $$0.a(cle.qg)
         ? Optional.empty()
         : $$1.stream().filter(rz.class::isInstance).map(rz.class::cast).filter($$1x -> clb.c(clb.a($$1x), $$0)).findFirst();
   }

   private static int k(clb $$0) {
      if ($$0.a(cle.qg)) {
         return 4 + o($$0);
      } else {
         if (($$0.a(cle.vD) || $$0.a(cle.vC)) && $$0.u()) {
            rz $$1 = ciu.a($$0);
            if ($$1 != null && !$$1.c("Bees", 10).isEmpty()) {
               return 64;
            }
         }

         return 64 / $$0.g();
      }
   }

   private static int o(clb $$0) {
      return q($$0).mapToInt($$0x -> k($$0x) * $$0x.L()).sum();
   }

   private static Optional<clb> p(clb $$0) {
      rz $$1 = $$0.w();
      if (!$$1.e("Items")) {
         return Optional.empty();
      } else {
         sf $$2 = $$1.c("Items", 10);
         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            int $$3 = 0;
            rz $$4 = $$2.a(0);
            clb $$5 = clb.a($$4);
            $$2.c(0);
            if ($$2.isEmpty()) {
               $$0.c("Items");
            }

            return Optional.of($$5);
         }
      }
   }

   private static boolean a(clb $$0, cdm $$1) {
      rz $$2 = $$0.w();
      if (!$$2.e("Items")) {
         return false;
      } else {
         if ($$1 instanceof amb) {
            sf $$3 = $$2.c("Items", 10);

            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               rz $$5 = $$3.a($$4);
               clb $$6 = clb.a($$5);
               $$1.a($$6, true);
            }
         }

         $$0.c("Items");
         return true;
      }
   }

   private static Stream<clb> q(clb $$0) {
      rz $$1 = $$0.v();
      if ($$1 == null) {
         return Stream.empty();
      } else {
         sf $$2 = $$1.c("Items", 10);
         return $$2.stream().map(rz.class::cast).map(clb::a);
      }
   }

   @Override
   public Optional<cih> h(clb $$0) {
      il<clb> $$1 = il.a();
      q($$0).forEach($$1::add);
      return Optional.of(new cig($$1, o($$0)));
   }

   @Override
   public void a(clb $$0, crs $$1, List<ur> $$2, cms $$3) {
      $$2.add(ur.a("item.minecraft.bundle.fullness", o($$0), 64).a(n.h));
   }

   @Override
   public void a(caf $$0) {
      cld.a($$0, q($$0.q()));
   }

   private void a(bki $$0) {
      $$0.a(aqn.cJ, 0.8F, 0.8F + $$0.dL().E_().i() * 0.4F);
   }

   private void b(bki $$0) {
      $$0.a(aqn.cI, 0.8F, 0.8F + $$0.dL().E_().i() * 0.4F);
   }

   private void c(bki $$0) {
      $$0.a(aqn.cH, 0.8F, 0.8F + $$0.dL().E_().i() * 0.4F);
   }
}
