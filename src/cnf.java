import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class cnf extends coy {
   private static final String b = "Items";
   public static final int a = 64;
   private static final int c = 4;
   private static final int d = awi.f(0.4F, 0.4F, 1.0F);

   public cnf(coy.a $$0) {
      super($$0);
   }

   public static float d(cpd $$0) {
      return (float)o($$0) / 64.0F;
   }

   @Override
   public boolean a(cpd $$0, cma $$1, ckn $$2, chl $$3) {
      if ($$2 != ckn.b) {
         return false;
      } else {
         cpd $$4 = $$1.g();
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
   public boolean a(cpd $$0, cpd $$1, cma $$2, ckn $$3, chl $$4, boz $$5) {
      if ($$3 == ckn.b && $$2.b($$4)) {
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
   public blx<cpd> a(cvr $$0, chl $$1, blv $$2) {
      cpd $$3 = $$1.b($$2);
      if (a($$3, $$1)) {
         this.c($$1);
         $$1.b(atv.c.b(this));
         return blx.a($$3, $$0.y_());
      } else {
         return blx.d($$3);
      }
   }

   @Override
   public boolean e(cpd $$0) {
      return o($$0) > 0;
   }

   @Override
   public int f(cpd $$0) {
      return Math.min(1 + 12 * o($$0) / 64, 13);
   }

   @Override
   public int g(cpd $$0) {
      return d;
   }

   private static int b(cpd $$0, cpd $$1) {
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
               cpd $$9 = cpd.a($$8);
               $$9.g($$5);
               $$9.b($$8);
               $$6.remove($$8);
               $$6.c(0, $$8);
            } else {
               cpd $$10 = $$1.c($$5);
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

   private static Optional<sw> a(cpd $$0, tc $$1) {
      return $$0.a(cpg.qT)
         ? Optional.empty()
         : $$1.stream().filter(sw.class::isInstance).map(sw.class::cast).filter($$1x -> cpd.c(cpd.a($$1x), $$0)).findFirst();
   }

   private static int k(cpd $$0) {
      if ($$0.a(cpg.qT)) {
         return 4 + o($$0);
      } else {
         if (($$0.a(cpg.ws) || $$0.a(cpg.wr)) && $$0.v()) {
            sw $$1 = cmw.a($$0);
            if ($$1 != null && !$$1.c("Bees", 10).isEmpty()) {
               return 64;
            }
         }

         return 64 / $$0.g();
      }
   }

   private static int o(cpd $$0) {
      return q($$0).mapToInt($$0x -> k($$0x) * $$0x.M()).sum();
   }

   private static Optional<cpd> p(cpd $$0) {
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
            cpd $$5 = cpd.a($$4);
            $$2.c(0);
            if ($$2.isEmpty()) {
               $$0.c("Items");
            }

            return Optional.of($$5);
         }
      }
   }

   private static boolean a(cpd $$0, chl $$1) {
      sw $$2 = $$0.x();
      if (!$$2.e("Items")) {
         return false;
      } else {
         if ($$1 instanceof aox) {
            tc $$3 = $$2.c("Items", 10);

            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               sw $$5 = $$3.a($$4);
               cpd $$6 = cpd.a($$5);
               $$1.a($$6, true);
            }
         }

         $$0.c("Items");
         return true;
      }
   }

   private static Stream<cpd> q(cpd $$0) {
      sw $$1 = $$0.w();
      if ($$1 == null) {
         return Stream.empty();
      } else {
         tc $$2 = $$1.c("Items", 10);
         return $$2.stream().map(sw.class::cast).map(cpd::a);
      }
   }

   @Override
   public Optional<cmi> h(cpd $$0) {
      is<cpd> $$1 = is.a();
      q($$0).forEach($$1::add);
      return Optional.of(new cmh($$1, o($$0)));
   }

   @Override
   public void a(cpd $$0, cvr $$1, List<vq> $$2, cqu $$3) {
      $$2.add(vq.a("item.minecraft.bundle.fullness", o($$0), 64).a(n.h));
   }

   @Override
   public void a(cdw $$0) {
      cpf.a($$0, q($$0.q()));
   }

   private void a(bnq $$0) {
      $$0.a(atl.di, 0.8F, 0.8F + $$0.dM().F_().i() * 0.4F);
   }

   private void b(bnq $$0) {
      $$0.a(atl.dh, 0.8F, 0.8F + $$0.dM().F_().i() * 0.4F);
   }

   private void c(bnq $$0) {
      $$0.a(atl.dg, 0.8F, 0.8F + $$0.dM().F_().i() * 0.4F);
   }
}
