import java.util.Optional;

public enum dic implements aut {
   a("inactive", 0, dic.b.a, -1.0, false),
   b("waiting_for_players", 4, dic.b.b, 200.0, true),
   c("active", 8, dic.b.c, 1000.0, true),
   d("waiting_for_reward_ejection", 8, dic.b.b, -1.0, false),
   e("ejecting_reward", 8, dic.b.b, -1.0, false),
   f("cooldown", 0, dic.b.d, -1.0, false);

   private static final float g = 40.0F;
   private static final int h = aty.d(30.0F);
   private final String i;
   private final int j;
   private final double k;
   private final dic.b l;
   private final boolean m;

   private dic(String $$0, int $$1, dic.b $$2, double $$3, boolean $$4) {
      this.i = $$0;
      this.j = $$1;
      this.l = $$2;
      this.k = $$3;
      this.m = $$4;
   }

   dic a(hv $$0, dhz $$1, amp $$2) {
      dib $$3 = $$1.c();
      dia $$4 = $$1.b();
      dhy $$5 = $$1.f();

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
                     $$3.e = $$2.W() + (long)$$4.h();
                     $$3.g = 0;
                     $$3.f = 0L;
                     yield d;
                  }
               } else if ($$3.a($$2, $$4, $$6)) {
                  $$1.a($$2, $$0).ifPresent($$4x -> {
                     $$3.d.add($$4x);
                     $$3.g++;
                     $$3.f = $$2.W() + (long)$$4.g();
                     $$3.j.b($$2.F_()).ifPresent($$2xx -> {
                        $$3.h = Optional.of((ctp)$$2xx.b());
                        $$1.e();
                     });
                  });
               }

               yield this;
            }
         }
         case d -> {
            if ($$3.a($$2, $$4, 40.0F)) {
               $$2.a(null, $$0, arc.lw, ard.e);
               yield e;
            } else {
               yield this;
            }
         }
         case e -> {
            if (!$$3.b($$2, $$4, (float)h)) {
               yield this;
            } else if ($$3.c.isEmpty()) {
               $$2.a(null, $$0, arc.lx, ard.e);
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

   public void a(csy $$0, hv $$1) {
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
      dic.b a = ($$0, $$1, $$2) -> {
      };
      dic.b b = ($$0, $$1, $$2) -> {
         if ($$1.a(2) == 0) {
            elb $$3 = $$2.b().a($$1, 0.9F);
            a(jv.aG, $$3, $$0);
         }
      };
      dic.b c = ($$0, $$1, $$2) -> {
         elb $$3 = $$2.b().a($$1, 1.0F);
         a(jv.ab, $$3, $$0);
         a(jv.E, $$3, $$0);
      };
      dic.b d = ($$0, $$1, $$2) -> {
         elb $$3 = $$2.b().a($$1, 0.9F);
         if ($$1.a(3) == 0) {
            a(jv.ab, $$3, $$0);
         }

         if ($$0.W() % 20L == 0L) {
            elb $$4 = $$2.b().b(0.0, 0.5, 0.0);
            int $$5 = $$0.F_().a(4) + 20;

            for (int $$6 = 0; $$6 < $$5; $$6++) {
               a(jv.ab, $$4, $$0);
            }
         }
      };

      private static void a(jy $$0, elb $$1, csy $$2) {
         $$2.a($$0, $$1.a(), $$1.b(), $$1.c(), 0.0, 0.0, 0.0);
      }

      void emit(csy var1, auf var2, hv var3);
   }

   static class c {
      private static final double a = -1.0;
      private static final double b = 200.0;
      private static final double c = 1000.0;

      private c() {
      }
   }
}
