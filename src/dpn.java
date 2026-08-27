import java.util.Optional;

public enum dpn implements ayt {
   a("inactive", 0, dpn.b.a, -1.0, false),
   b("waiting_for_players", 4, dpn.b.b, 200.0, true),
   c("active", 8, dpn.b.c, 1000.0, true),
   d("waiting_for_reward_ejection", 8, dpn.b.b, -1.0, false),
   e("ejecting_reward", 8, dpn.b.b, -1.0, false),
   f("cooldown", 0, dpn.b.d, -1.0, false);

   private static final float g = 40.0F;
   private static final int h = axz.d(30.0F);
   private final String i;
   private final int j;
   private final double k;
   private final dpn.b l;
   private final boolean m;

   private dpn(String $$0, int $$1, dpn.b $$2, double $$3, boolean $$4) {
      this.i = $$0;
      this.j = $$1;
      this.l = $$2;
      this.k = $$3;
      this.m = $$4;
   }

   dpn a(in $$0, dpk $$1, aqh $$2) {
      dpm $$3 = $$1.c();
      dpl $$4 = $$1.b();
      dpj $$5 = $$1.f();
      dpj.a $$6 = $$1.g();

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
                        $$3.h = Optional.of((dau)$$2xx.b());
                        $$1.e();
                     });
                  });
               }

               yield this;
            }
         }
         case d -> {
            if ($$3.a($$2, $$4, 40.0F)) {
               $$2.a(null, $$0, avc.ma, avd.e);
               yield e;
            } else {
               yield this;
            }
         }
         case e -> {
            if (!$$3.b($$2, $$4, (float)h)) {
               yield this;
            } else if ($$3.c.isEmpty()) {
               $$2.a(null, $$0, avc.mb, avd.e);
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

   public void a(dad $$0, in $$1) {
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
      dpn.b a = ($$0, $$1, $$2) -> {
      };
      dpn.b b = ($$0, $$1, $$2) -> {
         if ($$1.a(2) == 0) {
            etp $$3 = $$2.b().a($$1, 0.9F);
            a(kx.aG, $$3, $$0);
         }
      };
      dpn.b c = ($$0, $$1, $$2) -> {
         etp $$3 = $$2.b().a($$1, 1.0F);
         a(kx.ab, $$3, $$0);
         a(kx.E, $$3, $$0);
      };
      dpn.b d = ($$0, $$1, $$2) -> {
         etp $$3 = $$2.b().a($$1, 0.9F);
         if ($$1.a(3) == 0) {
            a(kx.ab, $$3, $$0);
         }

         if ($$0.Y() % 20L == 0L) {
            etp $$4 = $$2.b().b(0.0, 0.5, 0.0);
            int $$5 = $$0.E_().a(4) + 20;

            for (int $$6 = 0; $$6 < $$5; $$6++) {
               a(kx.ab, $$4, $$0);
            }
         }
      };

      private static void a(la $$0, etp $$1, dad $$2) {
         $$2.a($$0, $$1.a(), $$1.b(), $$1.c(), 0.0, 0.0, 0.0);
      }

      void emit(dad var1, ayg var2, in var3);
   }

   static class c {
      private static final double a = -1.0;
      private static final double b = 200.0;
      private static final double c = 1000.0;

      private c() {
      }
   }
}
