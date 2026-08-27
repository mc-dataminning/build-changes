import java.util.Optional;

public enum dsi implements azg {
   a("inactive", 0, dsi.b.a, -1.0, false),
   b("waiting_for_players", 4, dsi.b.b, 200.0, true),
   c("active", 8, dsi.b.c, 1000.0, true),
   d("waiting_for_reward_ejection", 8, dsi.b.b, -1.0, false),
   e("ejecting_reward", 8, dsi.b.b, -1.0, false),
   f("cooldown", 0, dsi.b.d, -1.0, false);

   private static final float g = 40.0F;
   private static final int h = aym.d(30.0F);
   private final String i;
   private final int j;
   private final double k;
   private final dsi.b l;
   private final boolean m;

   private dsi(String $$0, int $$1, dsi.b $$2, double $$3, boolean $$4) {
      this.i = $$0;
      this.j = $$1;
      this.l = $$2;
      this.k = $$3;
      this.m = $$4;
   }

   dsi a(ir $$0, dsf $$1, aqt $$2) {
      dsh $$3 = $$1.c();
      dsg $$4 = $$1.b();
      dse $$5 = $$1.f();
      dse.a $$6 = $$1.g();

      return switch (this) {
         case a -> $$3.a($$1, $$2, b) == null ? this : b;
         case b -> {
            if (!$$3.a($$1, $$2.A)) {
               yield a;
            } else {
               $$3.a($$2, $$0, $$5, $$6, $$4.a());
               yield $$3.c.isEmpty() ? this : c;
            }
         }
         case c -> {
            if (!$$3.a($$1, $$2.A)) {
               yield a;
            } else {
               int $$7 = $$3.a($$0);
               $$3.a($$2, $$0, $$5, $$6, $$4.a());
               if ($$3.a($$4, $$7)) {
                  if ($$3.b()) {
                     $$3.e = $$2.Z() + (long)$$4.h();
                     $$3.g = 0;
                     $$3.f = 0L;
                     yield d;
                  }
               } else if ($$3.a($$2, $$4, $$7)) {
                  $$1.a($$2, $$0).ifPresent($$4x -> {
                     $$3.d.add($$4x);
                     $$3.g++;
                     $$3.f = $$2.Z() + (long)$$4.g();
                     $$3.j.b($$2.F_()).ifPresent($$2xx -> {
                        $$3.h = Optional.of((dcr)$$2xx.b());
                        $$1.e();
                     });
                  });
               }

               yield this;
            }
         }
         case d -> {
            if ($$3.a($$2, $$4, 40.0F)) {
               $$2.a(null, $$0, avo.mA, avq.e);
               yield e;
            } else {
               yield this;
            }
         }
         case e -> {
            if (!$$3.b($$2, $$4, (float)h)) {
               yield this;
            } else if ($$3.c.isEmpty()) {
               $$2.a(null, $$0, avo.mB, avq.e);
               $$3.i = Optional.empty();
               yield f;
            } else {
               if ($$3.i.isEmpty()) {
                  $$3.i = $$4.j().a($$2.F_());
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

   public void a(dca $$0, ir $$1) {
      this.l.emit($$0, $$0.F_(), $$1);
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
      dsi.b a = ($$0, $$1, $$2) -> {
      };
      dsi.b b = ($$0, $$1, $$2) -> {
         if ($$1.a(2) == 0) {
            ewu $$3 = $$2.b().a($$1, 0.9F);
            a(lb.aK, $$3, $$0);
         }
      };
      dsi.b c = ($$0, $$1, $$2) -> {
         ewu $$3 = $$2.b().a($$1, 1.0F);
         a(lb.ac, $$3, $$0);
         a(lb.E, $$3, $$0);
      };
      dsi.b d = ($$0, $$1, $$2) -> {
         ewu $$3 = $$2.b().a($$1, 0.9F);
         if ($$1.a(3) == 0) {
            a(lb.ac, $$3, $$0);
         }

         if ($$0.Z() % 20L == 0L) {
            ewu $$4 = $$2.b().b(0.0, 0.5, 0.0);
            int $$5 = $$0.F_().a(4) + 20;

            for (int $$6 = 0; $$6 < $$5; $$6++) {
               a(lb.ac, $$4, $$0);
            }
         }
      };

      private static void a(le $$0, ewu $$1, dca $$2) {
         $$2.a($$0, $$1.a(), $$1.b(), $$1.c(), 0.0, 0.0, 0.0);
      }

      void emit(dca var1, ayt var2, ir var3);
   }

   static class c {
      private static final double a = -1.0;
      private static final double b = 200.0;
      private static final double c = 1000.0;

      private c() {
      }
   }
}
