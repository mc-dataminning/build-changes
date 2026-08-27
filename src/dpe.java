import java.util.Optional;

public enum dpe implements ayq {
   a("inactive", 0, dpe.b.a, -1.0, false),
   b("waiting_for_players", 4, dpe.b.b, 200.0, true),
   c("active", 8, dpe.b.c, 1000.0, true),
   d("waiting_for_reward_ejection", 8, dpe.b.b, -1.0, false),
   e("ejecting_reward", 8, dpe.b.b, -1.0, false),
   f("cooldown", 0, dpe.b.d, -1.0, false);

   private static final float g = 40.0F;
   private static final int h = axw.d(30.0F);
   private final String i;
   private final int j;
   private final double k;
   private final dpe.b l;
   private final boolean m;

   private dpe(String $$0, int $$1, dpe.b $$2, double $$3, boolean $$4) {
      this.i = $$0;
      this.j = $$1;
      this.l = $$2;
      this.k = $$3;
      this.m = $$4;
   }

   dpe a(im $$0, dpb $$1, aqe $$2) {
      dpd $$3 = $$1.c();
      dpc $$4 = $$1.b();
      dpa $$5 = $$1.f();
      dpa.a $$6 = $$1.g();

      return switch (this) {
         case a -> $$3.a($$1, $$2, b) == null ? this : b;
         case b -> {
            if (!$$3.a($$1, $$2.z)) {
               yield a;
            } else {
               $$3.a($$2, $$0, $$5, $$6, $$4.a());
               yield $$3.c.isEmpty() ? this : c;
            }
         }
         case c -> {
            if (!$$3.a($$1, $$2.z)) {
               yield a;
            } else {
               int $$7 = $$3.a($$0);
               $$3.a($$2, $$0, $$5, $$6, $$4.a());
               if ($$3.a($$4, $$7)) {
                  if ($$3.b()) {
                     $$3.e = $$2.Y() + (long)$$4.h();
                     $$3.g = 0;
                     $$3.f = 0L;
                     yield d;
                  }
               } else if ($$3.a($$2, $$4, $$7)) {
                  $$1.a($$2, $$0).ifPresent($$4x -> {
                     $$3.d.add($$4x);
                     $$3.g++;
                     $$3.f = $$2.Y() + (long)$$4.g();
                     $$3.j.b($$2.E_()).ifPresent($$2xx -> {
                        $$3.h = Optional.of((dal)$$2xx.b());
                        $$1.e();
                     });
                  });
               }

               yield this;
            }
         }
         case d -> {
            if ($$3.a($$2, $$4, 40.0F)) {
               $$2.a(null, $$0, auz.ma, ava.e);
               yield e;
            } else {
               yield this;
            }
         }
         case e -> {
            if (!$$3.b($$2, $$4, (float)h)) {
               yield this;
            } else if ($$3.c.isEmpty()) {
               $$2.a(null, $$0, auz.mb, ava.e);
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

   public void a(czu $$0, im $$1) {
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
      dpe.b a = ($$0, $$1, $$2) -> {
      };
      dpe.b b = ($$0, $$1, $$2) -> {
         if ($$1.a(2) == 0) {
            etf $$3 = $$2.b().a($$1, 0.9F);
            a(kw.aG, $$3, $$0);
         }
      };
      dpe.b c = ($$0, $$1, $$2) -> {
         etf $$3 = $$2.b().a($$1, 1.0F);
         a(kw.ab, $$3, $$0);
         a(kw.E, $$3, $$0);
      };
      dpe.b d = ($$0, $$1, $$2) -> {
         etf $$3 = $$2.b().a($$1, 0.9F);
         if ($$1.a(3) == 0) {
            a(kw.ab, $$3, $$0);
         }

         if ($$0.Y() % 20L == 0L) {
            etf $$4 = $$2.b().b(0.0, 0.5, 0.0);
            int $$5 = $$0.E_().a(4) + 20;

            for (int $$6 = 0; $$6 < $$5; $$6++) {
               a(kw.ab, $$4, $$0);
            }
         }
      };

      private static void a(kz $$0, etf $$1, czu $$2) {
         $$2.a($$0, $$1.a(), $$1.b(), $$1.c(), 0.0, 0.0, 0.0);
      }

      void emit(czu var1, ayd var2, im var3);
   }

   static class c {
      private static final double a = -1.0;
      private static final double b = 200.0;
      private static final double c = 1000.0;

      private c() {
      }
   }
}
