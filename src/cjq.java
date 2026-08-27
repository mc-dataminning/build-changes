import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class cjq extends clj {
   private static final String b = "Items";
   public static final int a = 64;
   private static final int c = 4;
   private static final int d = atq.f(0.4F, 0.4F, 1.0F);

   public cjq(clj.a $$0) {
      super($$0);
   }

   public static float d(clo $$0) {
      return (float)o($$0) / 64.0F;
   }

   @Override
   public boolean a(clo $$0, cim $$1, cgz $$2, cdz $$3) {
      if ($$2 != cgz.b) {
         return false;
      } else {
         clo $$4 = $$1.f();
         if ($$4.b()) {
            this.a($$3);
            p($$0).ifPresent($$2x -> b($$0, $$1.d($$2x)));
         } else if ($$4.d().aq_()) {
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
   public boolean a(clo $$0, clo $$1, cim $$2, cgz $$3, cdz $$4, bmd $$5) {
      if ($$3 == cgz.b && $$2.b($$4)) {
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
   public bjc<clo> a(csf $$0, cdz $$1, bja $$2) {
      clo $$3 = $$1.b($$2);
      if (a($$3, $$1)) {
         this.c($$1);
         $$1.b(arf.c.b(this));
         return bjc.a($$3, $$0.y_());
      } else {
         return bjc.d($$3);
      }
   }

   @Override
   public boolean e(clo $$0) {
      return o($$0) > 0;
   }

   @Override
   public int f(clo $$0) {
      return Math.min(1 + 12 * o($$0) / 64, 13);
   }

   @Override
   public int g(clo $$0) {
      return d;
   }

   private static int b(clo $$0, clo $$1) {
      if (!$$1.b() && $$1.d().aq_()) {
         sd $$2 = $$0.w();
         if (!$$2.e("Items")) {
            $$2.a("Items", new sj());
         }

         int $$3 = o($$0);
         int $$4 = k($$1);
         int $$5 = Math.min($$1.L(), (64 - $$3) / $$4);
         if ($$5 == 0) {
            return 0;
         } else {
            sj $$6 = $$2.c("Items", 10);
            Optional<sd> $$7 = a($$1, $$6);
            if ($$7.isPresent()) {
               sd $$8 = $$7.get();
               clo $$9 = clo.a($$8);
               $$9.g($$5);
               $$9.b($$8);
               $$6.remove($$8);
               $$6.c(0, $$8);
            } else {
               clo $$10 = $$1.c($$5);
               sd $$11 = new sd();
               $$10.b($$11);
               $$6.c(0, $$11);
            }

            return $$5;
         }
      } else {
         return 0;
      }
   }

   private static Optional<sd> a(clo $$0, sj $$1) {
      return $$0.a(clr.qR)
         ? Optional.empty()
         : $$1.stream().filter(sd.class::isInstance).map(sd.class::cast).filter($$1x -> clo.c(clo.a($$1x), $$0)).findFirst();
   }

   private static int k(clo $$0) {
      if ($$0.a(clr.qR)) {
         return 4 + o($$0);
      } else {
         if (($$0.a(clr.wo) || $$0.a(clr.wn)) && $$0.u()) {
            sd $$1 = cjh.a($$0);
            if ($$1 != null && !$$1.c("Bees", 10).isEmpty()) {
               return 64;
            }
         }

         return 64 / $$0.g();
      }
   }

   private static int o(clo $$0) {
      return q($$0).mapToInt($$0x -> k($$0x) * $$0x.L()).sum();
   }

   private static Optional<clo> p(clo $$0) {
      sd $$1 = $$0.w();
      if (!$$1.e("Items")) {
         return Optional.empty();
      } else {
         sj $$2 = $$1.c("Items", 10);
         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            int $$3 = 0;
            sd $$4 = $$2.a(0);
            clo $$5 = clo.a($$4);
            $$2.c(0);
            if ($$2.isEmpty()) {
               $$0.c("Items");
            }

            return Optional.of($$5);
         }
      }
   }

   private static boolean a(clo $$0, cdz $$1) {
      sd $$2 = $$0.w();
      if (!$$2.e("Items")) {
         return false;
      } else {
         if ($$1 instanceof amj) {
            sj $$3 = $$2.c("Items", 10);

            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               sd $$5 = $$3.a($$4);
               clo $$6 = clo.a($$5);
               $$1.a($$6, true);
            }
         }

         $$0.c("Items");
         return true;
      }
   }

   private static Stream<clo> q(clo $$0) {
      sd $$1 = $$0.v();
      if ($$1 == null) {
         return Stream.empty();
      } else {
         sj $$2 = $$1.c("Items", 10);
         return $$2.stream().map(sd.class::cast).map(clo::a);
      }
   }

   @Override
   public Optional<ciu> h(clo $$0) {
      ip<clo> $$1 = ip.a();
      q($$0).forEach($$1::add);
      return Optional.of(new cit($$1, o($$0)));
   }

   @Override
   public void a(clo $$0, csf $$1, List<uv> $$2, cnf $$3) {
      $$2.add(uv.a("item.minecraft.bundle.fullness", o($$0), 64).a(n.h));
   }

   @Override
   public void a(cas $$0) {
      clq.a($$0, q($$0.q()));
   }

   private void a(bkv $$0) {
      $$0.a(aqv.cJ, 0.8F, 0.8F + $$0.dN().F_().i() * 0.4F);
   }

   private void b(bkv $$0) {
      $$0.a(aqv.cI, 0.8F, 0.8F + $$0.dN().F_().i() * 0.4F);
   }

   private void c(bkv $$0) {
      $$0.a(aqv.cH, 0.8F, 0.8F + $$0.dN().F_().i() * 0.4F);
   }
}
