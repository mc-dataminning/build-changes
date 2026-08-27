import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Stream;

public enum dqh implements ayx {
   a("inactive", 0, dqh.b.a, -1.0, false),
   b("waiting_for_players", 4, dqh.b.b, 200.0, true),
   c("active", 8, dqh.b.c, 1000.0, true),
   d("waiting_for_reward_ejection", 8, dqh.b.b, -1.0, false),
   e("ejecting_reward", 8, dqh.b.b, -1.0, false),
   f("cooldown", 0, dqh.b.d, -1.0, false);

   private static final float g = 40.0F;
   private static final int h = ayd.d(30.0F);
   private final String i;
   private final int j;
   private final double k;
   private final dqh.b l;
   private final boolean m;

   private dqh(String $$0, int $$1, dqh.b $$2, double $$3, boolean $$4) {
      this.i = $$0;
      this.j = $$1;
      this.l = $$2;
      this.k = $$3;
      this.m = $$4;
   }

   dqh a(io $$0, dqe $$1, aqm $$2) {
      dqg $$3 = $$1.f();
      dqf $$4 = $$1.b();

      return switch (this) {
         case a -> $$3.a($$1, $$2, b) == null ? this : b;
         case b -> {
            if (!$$3.a($$1, $$2.z)) {
               yield a;
            } else {
               $$3.a($$2, $$0, $$1);
               yield $$3.c.isEmpty() ? this : c;
            }
         }
         case c -> {
            if (!$$3.a($$1, $$2.z)) {
               yield a;
            } else {
               int $$5 = $$3.a($$0);
               $$3.a($$2, $$0, $$1);
               if ($$1.e()) {
                  this.a($$2, $$0, $$1);
               }

               if ($$3.a($$4, $$5)) {
                  if ($$3.b()) {
                     $$3.e = $$2.Y() + (long)$$1.g();
                     $$3.g = 0;
                     $$3.f = 0L;
                     yield d;
                  }
               } else if ($$3.a($$2, $$4, $$5)) {
                  $$1.c($$2, $$0).ifPresent($$4x -> {
                     $$3.d.add($$4x);
                     $$3.g++;
                     $$3.f = $$2.Y() + (long)$$4.g();
                     $$4.h().b($$2.E_()).ifPresent($$2xx -> {
                        $$3.h = Optional.of((dbo)$$2xx.b());
                        $$1.j();
                     });
                  });
               }

               yield this;
            }
         }
         case d -> {
            if ($$3.a($$2, 40.0F, $$1.g())) {
               $$2.a(null, $$0, avh.mk, avi.e);
               yield e;
            } else {
               yield this;
            }
         }
         case e -> {
            if (!$$3.b($$2, (float)h, $$1.g())) {
               yield this;
            } else if ($$3.c.isEmpty()) {
               $$2.a(null, $$0, avh.ml, avi.e);
               $$3.i = Optional.empty();
               yield f;
            } else {
               if ($$3.i.isEmpty()) {
                  $$3.i = $$4.i().a($$2.E_());
               }

               $$3.i.ifPresent($$3x -> $$1.a($$2, $$0, $$3x));
               $$3.c.remove($$3.c.iterator().next());
               yield this;
            }
         }
         case f -> {
            $$3.a($$2, $$0, $$1);
            if (!$$3.c.isEmpty()) {
               $$3.g = 0;
               $$3.f = 0L;
               yield c;
            } else if ($$3.a($$2)) {
               $$3.e = 0L;
               $$1.b($$2, $$0);
               yield b;
            } else {
               yield this;
            }
         }
      };
   }

   private void a(aqm $$0, io $$1, dqe $$2) {
      dqg $$3 = $$2.f();
      dqf $$4 = $$2.b();
      cto $$5 = $$3.a($$0, $$4, $$1).a($$0.z).orElse(cto.i);
      if (!$$5.e()) {
         if (this.a($$0, $$3)) {
            a($$0, $$1, $$2, $$3).ifPresent($$4x -> {
               bsv $$5x = bsv.a($$0, $$5);
               $$5x.e($$4x);
               $$0.b($$5x);
               float $$6 = ($$0.E_().i() - $$0.E_().i()) * 0.2F + 1.0F;
               $$0.a(null, io.a($$4x), avh.mf, avi.e, 1.0F, $$6);
               $$3.e = $$0.Y() + $$2.d().a();
            });
         }
      }
   }

   private static Optional<euk> a(aqm $$0, io $$1, dqe $$2, dqg $$3) {
      List<clw> $$4 = $$3.c
         .stream()
         .map($$0::b)
         .filter(Objects::nonNull)
         .filter($$2x -> !$$2x.f() && !$$2x.N_() && $$2x.bD() && $$2x.f($$1.b()) <= (double)ayd.h($$2.h()))
         .toList();
      if ($$4.isEmpty()) {
         return Optional.empty();
      } else {
         bru $$5 = a($$4, $$3.d, $$2, $$1, $$0);
         return a($$5, $$0);
      }
   }

   private static Optional<euk> a(bru $$0, aqm $$1) {
      euk $$2 = $$0.dn();
      euk $$3 = $$2.a(it.b, (double)($$0.dk() + 2.0F + (float)$$1.z.a(4))).a(it.c.a.a($$1.z), (double)$$1.z.a(5));
      eug $$4 = $$1.a(new dag($$2, $$3, dag.a.c, dag.b.a, eup.a()));
      euk $$5 = $$4.a().b().a(it.a, 1.0);
      io $$6 = io.a($$5);
      return !$$1.a_($$6).k($$1, $$6).c() ? Optional.empty() : Optional.of($$5);
   }

   private static bru a(List<clw> $$0, Set<UUID> $$1, dqe $$2, io $$3, aqm $$4) {
      Stream<bru> $$5 = $$1.stream().map($$4::a).filter(Objects::nonNull).filter($$2x -> $$2x.bD() && $$2x.f($$3.b()) <= (double)ayd.h($$2.h()));
      List<bru> $$6 = Stream.concat($$0.stream(), $$5).toList();
      return ac.a($$6, $$4.z);
   }

   private boolean a(aqm $$0, dqg $$1) {
      return $$0.Y() >= $$1.e;
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

   public void a(dax $$0, io $$1, boolean $$2) {
      this.l.emit($$0, $$0.E_(), $$1, $$2);
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
      dqh.b a = ($$0, $$1, $$2, $$3) -> {
      };
      dqh.b b = ($$0, $$1, $$2, $$3) -> {
         if ($$1.a(2) == 0) {
            euk $$4 = $$2.b().a($$1, 0.9F);
            a($$3 ? ky.L : ky.aJ, $$4, $$0);
         }
      };
      dqh.b c = ($$0, $$1, $$2, $$3) -> {
         euk $$4 = $$2.b().a($$1, 1.0F);
         a(ky.ae, $$4, $$0);
         a($$3 ? ky.L : ky.F, $$4, $$0);
      };
      dqh.b d = ($$0, $$1, $$2, $$3) -> {
         euk $$4 = $$2.b().a($$1, 0.9F);
         if ($$1.a(3) == 0) {
            a(ky.ae, $$4, $$0);
         }

         if ($$0.Y() % 20L == 0L) {
            euk $$5 = $$2.b().b(0.0, 0.5, 0.0);
            int $$6 = $$0.E_().a(4) + 20;

            for (int $$7 = 0; $$7 < $$6; $$7++) {
               a(ky.ae, $$5, $$0);
            }
         }
      };

      private static void a(lb $$0, euk $$1, dax $$2) {
         $$2.a($$0, $$1.a(), $$1.b(), $$1.c(), 0.0, 0.0, 0.0);
      }

      void emit(dax var1, ayk var2, io var3, boolean var4);
   }

   static class c {
      private static final double a = -1.0;
      private static final double b = 200.0;
      private static final double c = 1000.0;

      private c() {
      }
   }
}
