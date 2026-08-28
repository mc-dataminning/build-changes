import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public enum duj implements baf {
   a("inactive", 0, duj.b.a, -1.0, false),
   b("waiting_for_players", 4, duj.b.b, 200.0, true),
   c("active", 8, duj.b.c, 1000.0, true),
   d("waiting_for_reward_ejection", 8, duj.b.b, -1.0, false),
   e("ejecting_reward", 8, duj.b.b, -1.0, false),
   f("cooldown", 0, duj.b.d, -1.0, false);

   private static final float g = 40.0F;
   private static final int h = azj.d(30.0F);
   private final String i;
   private final int j;
   private final double k;
   private final duj.b l;
   private final boolean m;

   private duj(final String $$0, final int $$1, final duj.b $$2, final double $$3, final boolean $$4) {
      this.i = $$0;
      this.j = $$1;
      this.l = $$2;
      this.k = $$3;
      this.m = $$4;
   }

   duj a(jg $$0, duf $$1, arm $$2) {
      dui $$3 = $$1.f();
      dug $$4 = $$1.b();

      return switch (this) {
         case a -> $$3.a($$1, $$2, b) == null ? this : b;
         case b -> {
            if (!$$1.a($$2)) {
               $$3.b();
               yield this;
            } else if (!$$3.a($$1, $$2.A)) {
               yield a;
            } else {
               $$3.a($$2, $$0, $$1);
               yield $$3.c.isEmpty() ? this : c;
            }
         }
         case c -> {
            if (!$$1.a($$2)) {
               $$3.b();
               yield b;
            } else if (!$$3.a($$1, $$2.A)) {
               yield a;
            } else {
               int $$5 = $$3.a($$0);
               $$3.a($$2, $$0, $$1);
               if ($$1.e()) {
                  this.a($$2, $$0, $$1);
               }

               if ($$3.a($$4, $$5)) {
                  if ($$3.c()) {
                     $$3.e = $$2.aa() + (long)$$1.g();
                     $$3.g = 0;
                     $$3.f = 0L;
                     yield d;
                  }
               } else if ($$3.a($$2, $$4, $$5)) {
                  $$1.c($$2, $$0).ifPresent($$4x -> {
                     $$3.d.add($$4x);
                     $$3.g++;
                     $$3.f = $$2.aa() + (long)$$4.h();
                     $$4.i().b($$2.E_()).ifPresent($$2xx -> {
                        $$3.h = Optional.of((dfo)$$2xx.b());
                        $$1.j();
                     });
                  });
               }

               yield this;
            }
         }
         case d -> {
            if ($$3.a($$2, 40.0F, $$1.g())) {
               $$2.a(null, $$0, awk.mj, awl.e);
               yield e;
            } else {
               yield this;
            }
         }
         case e -> {
            if (!$$3.b($$2, (float)h, $$1.g())) {
               yield this;
            } else if ($$3.c.isEmpty()) {
               $$2.a(null, $$0, awk.mk, awl.e);
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
            $$3.a($$2, $$0, $$1);
            if (!$$3.c.isEmpty()) {
               $$3.g = 0;
               $$3.f = 0L;
               yield c;
            } else if ($$3.a($$2)) {
               $$1.b($$2, $$0);
               $$3.a();
               yield b;
            } else {
               yield this;
            }
         }
      };
   }

   private void a(arm $$0, jg $$1, duf $$2) {
      dui $$3 = $$2.f();
      dug $$4 = $$2.b();
      cvx $$5 = $$3.a($$0, $$4, $$1).a($$0.A).orElse(cvx.k);
      if (!$$5.f()) {
         if (this.a($$0, $$3)) {
            a($$0, $$1, $$2, $$3).ifPresent($$4x -> {
               bvb $$5x = bvb.a($$0, $$5);
               $$5x.e($$4x);
               $$0.b($$5x);
               float $$6 = ($$0.E_().i() - $$0.E_().i()) * 0.2F + 1.0F;
               $$0.a(null, jg.a((jz)$$4x), awk.me, awl.e, 1.0F, $$6);
               $$3.e = $$0.aa() + $$2.d().a();
            });
         }
      }
   }

   private static Optional<ezh> a(arm $$0, jg $$1, duf $$2, dui $$3) {
      List<coh> $$4 = $$3.c
         .stream()
         .map($$0::b)
         .filter(Objects::nonNull)
         .filter($$2x -> !$$2x.f() && !$$2x.R_() && $$2x.bM() && $$2x.f($$1.b()) <= (double)azj.h($$2.h()))
         .toList();
      if ($$4.isEmpty()) {
         return Optional.empty();
      } else {
         btz $$5 = a($$4, $$3.d, $$2, $$1, $$0);
         return $$5 == null ? Optional.empty() : a($$5, $$0);
      }
   }

   private static Optional<ezh> a(btz $$0, arm $$1) {
      ezh $$2 = $$0.dv();
      ezh $$3 = $$2.a(jl.b, (double)($$0.dt() + 2.0F + (float)$$1.A.a(4)));
      ezd $$4 = $$1.a(new ded($$2, $$3, ded.a.c, ded.b.a, ezm.a()));
      ezh $$5 = $$4.b().b().a(jl.a, 1.0);
      jg $$6 = jg.a((jz)$$5);
      return !$$1.a_($$6).g($$1, $$6).c() ? Optional.empty() : Optional.of($$5);
   }

   @Nullable
   private static btz a(List<coh> $$0, Set<UUID> $$1, duf $$2, jg $$3, arm $$4) {
      Stream<btz> $$5 = $$1.stream().map($$4::a).filter(Objects::nonNull).filter($$2x -> $$2x.bM() && $$2x.f($$3.b()) <= (double)azj.h($$2.h()));
      List<? extends btz> $$6 = $$4.A.h() ? $$5.toList() : $$0;
      if ($$6.isEmpty()) {
         return null;
      } else {
         return $$6.size() == 1 ? $$6.getFirst() : ad.a($$6, $$4.A);
      }
   }

   private boolean a(arm $$0, dui $$1) {
      return $$0.aa() >= $$1.e;
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

   public void a(dev $$0, jg $$1, boolean $$2) {
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
      duj.b a = ($$0, $$1, $$2, $$3) -> {
      };
      duj.b b = ($$0, $$1, $$2, $$3) -> {
         if ($$1.a(2) == 0) {
            ezh $$4 = $$2.b().a($$1, 0.9F);
            a($$3 ? lq.L : lq.aJ, $$4, $$0);
         }
      };
      duj.b c = ($$0, $$1, $$2, $$3) -> {
         ezh $$4 = $$2.b().a($$1, 1.0F);
         a(lq.ae, $$4, $$0);
         a($$3 ? lq.L : lq.F, $$4, $$0);
      };
      duj.b d = ($$0, $$1, $$2, $$3) -> {
         ezh $$4 = $$2.b().a($$1, 0.9F);
         if ($$1.a(3) == 0) {
            a(lq.ae, $$4, $$0);
         }

         if ($$0.aa() % 20L == 0L) {
            ezh $$5 = $$2.b().b(0.0, 0.5, 0.0);
            int $$6 = $$0.E_().a(4) + 20;

            for (int $$7 = 0; $$7 < $$6; $$7++) {
               a(lq.ae, $$5, $$0);
            }
         }
      };

      private static void a(lu $$0, ezh $$1, dev $$2) {
         $$2.a($$0, $$1.a(), $$1.b(), $$1.c(), 0.0, 0.0, 0.0);
      }

      void emit(dev var1, azr var2, jg var3, boolean var4);
   }

   static class c {
      private static final double a = -1.0;
      private static final double b = 200.0;
      private static final double c = 1000.0;

      private c() {
      }
   }
}
