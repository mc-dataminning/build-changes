import java.util.Optional;

public enum dmf implements axq {
   a("inactive", 0, dmf.b.a, -1.0, false),
   b("waiting_for_players", 4, dmf.b.b, 200.0, true),
   c("active", 8, dmf.b.c, 1000.0, true),
   d("waiting_for_reward_ejection", 8, dmf.b.b, -1.0, false),
   e("ejecting_reward", 8, dmf.b.b, -1.0, false),
   f("cooldown", 0, dmf.b.d, -1.0, false);

   private static final float g = 40.0F;
   private static final int h = aww.d(30.0F);
   private final String i;
   private final int j;
   private final double k;
   private final dmf.b l;
   private final boolean m;

   private dmf(String $$0, int $$1, dmf.b $$2, double $$3, boolean $$4) {
      this.i = $$0;
      this.j = $$1;
      this.l = $$2;
      this.k = $$3;
      this.m = $$4;
   }

   dmf a(ib $$0, dmc $$1, apf $$2) {
      dme $$3 = $$1.c();
      dmd $$4 = $$1.b();
      dmb $$5 = $$1.f();
      dmb.a $$6 = $$1.g();

      return switch (this) {
         case a -> $$3.a($$1, $$2, b) == null ? this : b;
         case b -> {
            if (!$$3.b()) {
               yield a;
            } else {
               $$3.a($$2, $$0, $$5, $$6, $$4.a());
               yield $$3.c.isEmpty() ? this : c;
            }
         }
         case c -> {
            if (!$$3.b()) {
               yield a;
            } else {
               int $$7 = $$3.a($$0);
               $$3.a($$2, $$0, $$5, $$6, $$4.a());
               if ($$3.a($$4, $$7)) {
                  if ($$3.c()) {
                     $$3.e = $$2.X() + (long)$$4.h();
                     $$3.g = 0;
                     $$3.f = 0L;
                     yield d;
                  }
               } else if ($$3.a($$2, $$4, $$7)) {
                  $$1.a($$2, $$0).ifPresent($$4x -> {
                     $$3.d.add($$4x);
                     $$3.g++;
                     $$3.f = $$2.X() + (long)$$4.g();
                     $$3.j.b($$2.E_()).ifPresent($$2xx -> {
                        $$3.h = Optional.of((cxq)$$2xx.b());
                        $$1.e();
                     });
                  });
               }

               yield this;
            }
         }
         case d -> {
            if ($$3.a($$2, $$4, 40.0F)) {
               $$2.a(null, $$0, aty.lP, atz.e);
               yield e;
            } else {
               yield this;
            }
         }
         case e -> {
            if (!$$3.b($$2, $$4, (float)h)) {
               yield this;
            } else if ($$3.c.isEmpty()) {
               $$2.a(null, $$0, aty.lQ, atz.e);
               $$3.i = Optional.empty();
               yield f;
            } else {
               if ($$3.i.isEmpty()) {
                  $$3.i = $$4.j().a($$2.E_());
               }

               $$3.i.ifPresent($$3x -> $$1.a($$2, $$0, $$3x));
               $$3.c.remove($$3.c.iterator().next());
               yield this;
            }
         }
         case f -> {
            if ($$3.a($$2)) {
               $$3.e = 0L;
               yield b;
            } else {
               yield this;
            }
         }
      };
   }

   public int a() {
      return this.j;
   }

   public double b() {
      return this.k;
   }

   public boolean d() {
      return this.k >= 0.0;
   }

   public boolean e() {
      return this.m;
   }

   public void a(cwz $$0, ib $$1) {
      this.l.emit($$0, $$0.E_(), $$1);
   }

   @Override
   public String c() {
      return this.i;
   }

   static class a {
      private static final int a = 0;
      private static final int b = 4;
      private static final int c = 8;

      private a() {
      }
   }

   interface b {
      dmf.b a = ($$0, $$1, $$2) -> {
      };
      dmf.b b = ($$0, $$1, $$2) -> {
         if ($$1.a(2) == 0) {
            epr $$3 = $$2.b().a($$1, 0.9F);
            a(kc.aH, $$3, $$0);
         }
      };
      dmf.b c = ($$0, $$1, $$2) -> {
         epr $$3 = $$2.b().a($$1, 1.0F);
         a(kc.ac, $$3, $$0);
         a(kc.F, $$3, $$0);
      };
      dmf.b d = ($$0, $$1, $$2) -> {
         epr $$3 = $$2.b().a($$1, 0.9F);
         if ($$1.a(3) == 0) {
            a(kc.ac, $$3, $$0);
         }

         if ($$0.X() % 20L == 0L) {
            epr $$4 = $$2.b().b(0.0, 0.5, 0.0);
            int $$5 = $$0.E_().a(4) + 20;

            for (int $$6 = 0; $$6 < $$5; $$6++) {
               a(kc.ac, $$4, $$0);
            }
         }
      };

      private static void a(kf $$0, epr $$1, cwz $$2) {
         $$2.a($$0, $$1.a(), $$1.b(), $$1.c(), 0.0, 0.0, 0.0);
      }

      void emit(cwz var1, axd var2, ib var3);
   }

   static class c {
      private static final double a = -1.0;
      private static final double b = 200.0;
      private static final double c = 1000.0;

      private c() {
      }
   }
}
