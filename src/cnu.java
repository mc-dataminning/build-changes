import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class cnu extends cpl {
   private static final String b = "Items";
   public static final int a = 64;
   private static final int c = 4;
   private static final int d = awm.f(0.4F, 0.4F, 1.0F);

   public cnu(cpl.a $$0) {
      super($$0);
   }

   public static float d(cpq $$0) {
      return (float)o($$0) / 64.0F;
   }

   @Override
   public boolean a(cpq $$0, cmp $$1, clc $$2, cia $$3) {
      if ($$2 != clc.b) {
         return false;
      } else {
         cpq $$4 = $$1.g();
         if ($$4.b()) {
            this.a($$3);
            p($$0).ifPresent($$2x -> b($$0, $$1.d($$2x)));
         } else if ($$4.d().aq_()) {
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
   public boolean a(cpq $$0, cpq $$1, cmp $$2, clc $$3, cia $$4, bpo $$5) {
      if ($$3 == clc.b && $$2.b($$4)) {
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
   public bmm<cpq> a(cwe $$0, cia $$1, bmk $$2) {
      cpq $$3 = $$1.b($$2);
      if (a($$3, $$1)) {
         this.c($$1);
         $$1.b(atz.c.b(this));
         return bmm.a($$3, $$0.y_());
      } else {
         return bmm.d($$3);
      }
   }

   @Override
   public boolean e(cpq $$0) {
      return o($$0) > 0;
   }

   @Override
   public int f(cpq $$0) {
      return Math.min(1 + 12 * o($$0) / 64, 13);
   }

   @Override
   public int g(cpq $$0) {
      return d;
   }

   private static int b(cpq $$0, cpq $$1) {
      if (!$$1.b() && $$1.d().aq_()) {
         sy $$2 = $$0.x();
         if (!$$2.e("Items")) {
            $$2.a("Items", new te());
         }

         int $$3 = o($$0);
         int $$4 = k($$1);
         int $$5 = Math.min($$1.M(), (64 - $$3) / $$4);
         if ($$5 == 0) {
            return 0;
         } else {
            te $$6 = $$2.c("Items", 10);
            Optional<sy> $$7 = a($$1, $$6);
            if ($$7.isPresent()) {
               sy $$8 = $$7.get();
               cpq $$9 = cpq.a($$8);
               $$9.g($$5);
               $$9.b($$8);
               $$6.remove($$8);
               $$6.c(0, $$8);
            } else {
               cpq $$10 = $$1.c($$5);
               sy $$11 = new sy();
               $$10.b($$11);
               $$6.c(0, $$11);
            }

            return $$5;
         }
      } else {
         return 0;
      }
   }

   private static Optional<sy> a(cpq $$0, te $$1) {
      return $$0.a(cpt.qT)
         ? Optional.empty()
         : $$1.stream().filter(sy.class::isInstance).map(sy.class::cast).filter($$1x -> cpq.c(cpq.a($$1x), $$0)).findFirst();
   }

   private static int k(cpq $$0) {
      if ($$0.a(cpt.qT)) {
         return 4 + o($$0);
      } else {
         if (($$0.a(cpt.ws) || $$0.a(cpt.wr)) && $$0.v()) {
            sy $$1 = cnl.a($$0);
            if ($$1 != null && !$$1.c("Bees", 10).isEmpty()) {
               return 64;
            }
         }

         return 64 / $$0.g();
      }
   }

   private static int o(cpq $$0) {
      return q($$0).mapToInt($$0x -> k($$0x) * $$0x.M()).sum();
   }

   private static Optional<cpq> p(cpq $$0) {
      sy $$1 = $$0.x();
      if (!$$1.e("Items")) {
         return Optional.empty();
      } else {
         te $$2 = $$1.c("Items", 10);
         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            int $$3 = 0;
            sy $$4 = $$2.a(0);
            cpq $$5 = cpq.a($$4);
            $$2.c(0);
            if ($$2.isEmpty()) {
               $$0.d("Items");
            }

            return Optional.of($$5);
         }
      }
   }

   private static boolean a(cpq $$0, cia $$1) {
      sy $$2 = $$0.x();
      if (!$$2.e("Items")) {
         return false;
      } else {
         if ($$1 instanceof apb) {
            te $$3 = $$2.c("Items", 10);

            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               sy $$5 = $$3.a($$4);
               cpq $$6 = cpq.a($$5);
               $$1.a($$6, true);
            }
         }

         $$0.d("Items");
         return true;
      }
   }

   private static Stream<cpq> q(cpq $$0) {
      sy $$1 = $$0.w();
      if ($$1 == null) {
         return Stream.empty();
      } else {
         te $$2 = $$1.c("Items", 10);
         return $$2.stream().map(sy.class::cast).map(cpq::a);
      }
   }

   @Override
   public Optional<cmx> h(cpq $$0) {
      iu<cpq> $$1 = iu.a();
      q($$0).forEach($$1::add);
      return Optional.of(new cmw($$1, o($$0)));
   }

   @Override
   public void a(cpq $$0, cwe $$1, List<vs> $$2, crh $$3) {
      $$2.add(vs.a("item.minecraft.bundle.fullness", o($$0), 64).a(n.h));
   }

   @Override
   public void a(cel $$0) {
      cps.a($$0, q($$0.q()));
   }

   private void a(bof $$0) {
      $$0.a(atp.di, 0.8F, 0.8F + $$0.dJ().F_().i() * 0.4F);
   }

   private void b(bof $$0) {
      $$0.a(atp.dh, 0.8F, 0.8F + $$0.dJ().F_().i() * 0.4F);
   }

   private void c(bof $$0) {
      $$0.a(atp.dg, 0.8F, 0.8F + $$0.dJ().F_().i() * 0.4F);
   }
}
