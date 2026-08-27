import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class cop extends cqf {
   private static final String b = "Items";
   public static final int a = 64;
   private static final int c = 4;
   private static final int d = aww.f(0.4F, 0.4F, 1.0F);

   public cop(cqf.a $$0) {
      super($$0);
   }

   public static float d(cqk $$0) {
      return (float)o($$0) / 64.0F;
   }

   @Override
   public boolean a(cqk $$0, cnj $$1, clw $$2, cis $$3) {
      if ($$2 != clw.b) {
         return false;
      } else {
         cqk $$4 = $$1.g();
         if ($$4.b()) {
            this.a($$3);
            p($$0).ifPresent($$2x -> b($$0, $$1.d($$2x)));
         } else if ($$4.d().ap_()) {
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
   public boolean a(cqk $$0, cqk $$1, cnj $$2, clw $$3, cis $$4, bqf $$5) {
      if ($$3 == clw.b && $$2.b($$4)) {
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
   public bnd<cqk> a(cwz $$0, cis $$1, bnb $$2) {
      cqk $$3 = $$1.b($$2);
      if (a($$3, $$1)) {
         this.c($$1);
         $$1.b(aui.c.b(this));
         return bnd.a($$3, $$0.x_());
      } else {
         return bnd.d($$3);
      }
   }

   @Override
   public boolean e(cqk $$0) {
      return o($$0) > 0;
   }

   @Override
   public int f(cqk $$0) {
      return Math.min(1 + 12 * o($$0) / 64, 13);
   }

   @Override
   public int g(cqk $$0) {
      return d;
   }

   private static int b(cqk $$0, cqk $$1) {
      if (!$$1.b() && $$1.d().ap_()) {
         ta $$2 = $$0.x();
         if (!$$2.e("Items")) {
            $$2.a("Items", new tg());
         }

         int $$3 = o($$0);
         int $$4 = k($$1);
         int $$5 = Math.min($$1.M(), (64 - $$3) / $$4);
         if ($$5 == 0) {
            return 0;
         } else {
            tg $$6 = $$2.c("Items", 10);
            Optional<ta> $$7 = a($$1, $$6);
            if ($$7.isPresent()) {
               ta $$8 = $$7.get();
               cqk $$9 = cqk.a($$8);
               $$9.g($$5);
               $$9.b($$8);
               $$6.remove($$8);
               $$6.c(0, $$8);
            } else {
               cqk $$10 = $$1.c($$5);
               ta $$11 = new ta();
               $$10.b($$11);
               $$6.c(0, $$11);
            }

            return $$5;
         }
      } else {
         return 0;
      }
   }

   private static Optional<ta> a(cqk $$0, tg $$1) {
      return $$0.a(cqn.qT)
         ? Optional.empty()
         : $$1.stream().filter(ta.class::isInstance).map(ta.class::cast).filter($$1x -> cqk.c(cqk.a($$1x), $$0)).findFirst();
   }

   private static int k(cqk $$0) {
      if ($$0.a(cqn.qT)) {
         return 4 + o($$0);
      } else {
         if (($$0.a(cqn.wt) || $$0.a(cqn.ws)) && $$0.v()) {
            ta $$1 = cof.a($$0);
            if ($$1 != null && !$$1.c("Bees", 10).isEmpty()) {
               return 64;
            }
         }

         return 64 / $$0.g();
      }
   }

   private static int o(cqk $$0) {
      return q($$0).mapToInt($$0x -> k($$0x) * $$0x.M()).sum();
   }

   private static Optional<cqk> p(cqk $$0) {
      ta $$1 = $$0.x();
      if (!$$1.e("Items")) {
         return Optional.empty();
      } else {
         tg $$2 = $$1.c("Items", 10);
         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            int $$3 = 0;
            ta $$4 = $$2.a(0);
            cqk $$5 = cqk.a($$4);
            $$2.c(0);
            if ($$2.isEmpty()) {
               $$0.d("Items");
            }

            return Optional.of($$5);
         }
      }
   }

   private static boolean a(cqk $$0, cis $$1) {
      ta $$2 = $$0.x();
      if (!$$2.e("Items")) {
         return false;
      } else {
         if ($$1 instanceof apg) {
            tg $$3 = $$2.c("Items", 10);

            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               ta $$5 = $$3.a($$4);
               cqk $$6 = cqk.a($$5);
               $$1.a($$6, true);
            }
         }

         $$0.d("Items");
         return true;
      }
   }

   private static Stream<cqk> q(cqk $$0) {
      ta $$1 = $$0.w();
      if ($$1 == null) {
         return Stream.empty();
      } else {
         tg $$2 = $$1.c("Items", 10);
         return $$2.stream().map(ta.class::cast).map(cqk::a);
      }
   }

   @Override
   public Optional<cnr> h(cqk $$0) {
      iu<cqk> $$1 = iu.a();
      q($$0).forEach($$1::add);
      return Optional.of(new cnq($$1, o($$0)));
   }

   @Override
   public void a(cqk $$0, cwz $$1, List<vu> $$2, csb $$3) {
      $$2.add(vu.a("item.minecraft.bundle.fullness", o($$0), 64).a(n.h));
   }

   @Override
   public void a(cfd $$0) {
      cqm.a($$0, q($$0.p()));
   }

   private void a(bow $$0) {
      $$0.a(aty.dl, 0.8F, 0.8F + $$0.dM().E_().i() * 0.4F);
   }

   private void b(bow $$0) {
      $$0.a(aty.dk, 0.8F, 0.8F + $$0.dM().E_().i() * 0.4F);
   }

   private void c(bow $$0) {
      $$0.a(aty.dj, 0.8F, 0.8F + $$0.dM().E_().i() * 0.4F);
   }
}
