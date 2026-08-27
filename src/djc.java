import java.util.Optional;

public enum djc implements avl {
   a("inactive", 0, djc.b.a, -1.0, false),
   b("waiting_for_players", 4, djc.b.b, 200.0, true),
   c("active", 8, djc.b.c, 1000.0, true),
   d("waiting_for_reward_ejection", 8, djc.b.b, -1.0, false),
   e("ejecting_reward", 8, djc.b.b, -1.0, false),
   f("cooldown", 0, djc.b.d, -1.0, false);

   private static final float g = 40.0F;
   private static final int h = aup.d(30.0F);
   private final String i;
   private final int j;
   private final double k;
   private final djc.b l;
   private final boolean m;

   private djc(String $$0, int $$1, djc.b $$2, double $$3, boolean $$4) {
      this.i = $$0;
      this.j = $$1;
      this.l = $$2;
      this.k = $$3;
      this.m = $$4;
   }

   djc a(hx $$0, diz $$1, ane $$2) {
      djb $$3 = $$1.c();
      dja $$4 = $$1.b();
      diy $$5 = $$1.f();

      return switch (this) {
         case a -> $$3.a($$1, $$2, b) == null ? this : b;
         case b -> {
            if (!$$3.b()) {
               yield a;
            } else {
               $$3.a($$2, $$0, $$5, $$4.a());
               yield $$3.c.isEmpty() ? this : c;
            }
         }
         case c -> {
            if (!$$3.b()) {
               yield a;
            } else {
               int $$6 = $$3.a($$0);
               $$3.a($$2, $$0, $$5, $$4.a());
               if ($$3.a($$4, $$6)) {
                  if ($$3.c()) {
                     $$3.e = $$2.X() + (long)$$4.h();
                     $$3.g = 0;
                     $$3.f = 0L;
                     yield d;
                  }
               } else if ($$3.a($$2, $$4, $$6)) {
                  $$1.a($$2, $$0).ifPresent($$4x -> {
                     $$3.d.add($$4x);
                     $$3.g++;
                     $$3.f = $$2.X() + (long)$$4.g();
                     $$3.j.b($$2.F_()).ifPresent($$2xx -> {
                        $$3.h = Optional.of((cuo)$$2xx.b());
                        $$1.e();
                     });
                  });
               }

               yield this;
            }
         }
         case d -> {
            if ($$3.a($$2, $$4, 40.0F)) {
               $$2.a(null, $$0, art.lL, aru.e);
               yield e;
            } else {
               yield this;
            }
         }
         case e -> {
            if (!$$3.b($$2, $$4, (float)h)) {
               yield this;
            } else if ($$3.c.isEmpty()) {
               $$2.a(null, $$0, art.lM, aru.e);
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

   public void a(ctx $$0, hx $$1) {
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
      djc.b a = ($$0, $$1, $$2) -> {
      };
      djc.b b = ($$0, $$1, $$2) -> {
         if ($$1.a(2) == 0) {
            emc $$3 = $$2.b().a($$1, 0.9F);
            a(jx.aG, $$3, $$0);
         }
      };
      djc.b c = ($$0, $$1, $$2) -> {
         emc $$3 = $$2.b().a($$1, 1.0F);
         a(jx.ab, $$3, $$0);
         a(jx.E, $$3, $$0);
      };
      djc.b d = ($$0, $$1, $$2) -> {
         emc $$3 = $$2.b().a($$1, 0.9F);
         if ($$1.a(3) == 0) {
            a(jx.ab, $$3, $$0);
         }

         if ($$0.X() % 20L == 0L) {
            emc $$4 = $$2.b().b(0.0, 0.5, 0.0);
            int $$5 = $$0.F_().a(4) + 20;

            for (int $$6 = 0; $$6 < $$5; $$6++) {
               a(jx.ab, $$4, $$0);
            }
         }
      };

      private static void a(ka $$0, emc $$1, ctx $$2) {
         $$2.a($$0, $$1.a(), $$1.b(), $$1.c(), 0.0, 0.0, 0.0);
      }

      void emit(ctx var1, auw var2, hx var3);
   }

   static class c {
      private static final double a = -1.0;
      private static final double b = 200.0;
      private static final double c = 1000.0;

      private c() {
      }
   }
}
