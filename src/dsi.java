import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public enum dsi implements azk {
   a("inactive", 0, dsi.b.a, -1.0, false),
   b("waiting_for_players", 4, dsi.b.b, 200.0, true),
   c("active", 8, dsi.b.c, 1000.0, true),
   d("waiting_for_reward_ejection", 8, dsi.b.b, -1.0, false),
   e("ejecting_reward", 8, dsi.b.b, -1.0, false),
   f("cooldown", 0, dsi.b.d, -1.0, false);

   private static final float g = 40.0F;
   private static final int h = ayo.d(30.0F);
   private final String i;
   private final int j;
   private final double k;
   private final dsi.b l;
   private final boolean m;

   private dsi(final String $$0, final int $$1, final dsi.b $$2, final double $$3, final boolean $$4) {
      this.i = $$0;
      this.j = $$1;
      this.l = $$2;
      this.k = $$3;
      this.m = $$4;
   }

   dsi a(jd $$0, dsf $$1, aqu $$2) {
      dsh $$3 = $$1.f();
      dsg $$4 = $$1.b();

      return switch (this) {
         case a -> $$3.a($$1, $$2, b) == null ? this : b;
         case b -> {
            if (!$$1.a($$2)) {
               $$3.a();
               yield this;
            } else if (!$$3.a($$1, $$2.z)) {
               yield a;
            } else {
               $$3.a($$2, $$0, $$1);
               yield $$3.c.isEmpty() ? this : c;
            }
         }
         case c -> {
            if (!$$1.a($$2)) {
               $$3.a();
               yield b;
            } else if (!$$3.a($$1, $$2.z)) {
               yield a;
            } else {
               int $$5 = $$3.a($$0);
               $$3.a($$2, $$0, $$1);
               if ($$1.e()) {
                  this.a($$2, $$0, $$1);
               }

               if ($$3.a($$4, $$5)) {
                  if ($$3.b()) {
                     $$3.e = $$2.Z() + (long)$$1.g();
                     $$3.g = 0;
                     $$3.f = 0L;
                     yield d;
                  }
               } else if ($$3.a($$2, $$4, $$5)) {
                  $$1.c($$2, $$0).ifPresent($$4x -> {
                     $$3.d.add($$4x);
                     $$3.g++;
                     $$3.f = $$2.Z() + (long)$$4.g();
                     $$4.h().b($$2.E_()).ifPresent($$2xx -> {
                        $$3.h = Optional.of((ddo)$$2xx.b());
                        $$1.j();
                     });
                  });
               }

               yield this;
            }
         }
         case d -> {
            if ($$3.a($$2, 40.0F, $$1.g())) {
               $$2.a(null, $$0, avp.mk, avq.e);
               yield e;
            } else {
               yield this;
            }
         }
         case e -> {
            if (!$$3.b($$2, (float)h, $$1.g())) {
               yield this;
            } else if ($$3.c.isEmpty()) {
               $$2.a(null, $$0, avp.ml, avq.e);
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
               $$1.b($$2, $$0);
               $$3.a();
               yield b;
            } else {
               yield this;
            }
         }
      };
   }

   private void a(aqu $$0, jd $$1, dsf $$2) {
      dsh $$3 = $$2.f();
      dsg $$4 = $$2.b();
      cuq $$5 = $$3.a($$0, $$4, $$1).a($$0.z).orElse(cuq.l);
      if (!$$5.e()) {
         if (this.a($$0, $$3)) {
            a($$0, $$1, $$2, $$3).ifPresent($$4x -> {
               btu $$5x = btu.a($$0, $$5);
               $$5x.f($$4x);
               $$0.b($$5x);
               float $$6 = ($$0.E_().i() - $$0.E_().i()) * 0.2F + 1.0F;
               $$0.a(null, jd.a((jw)$$4x), avp.mf, avq.e, 1.0F, $$6);
               $$3.e = $$0.Z() + $$2.d().a();
            });
         }
      }
   }

   private static Optional<exa> a(aqu $$0, jd $$1, dsf $$2, dsh $$3) {
      List<cmx> $$4 = $$3.c
         .stream()
         .map($$0::b)
         .filter(Objects::nonNull)
         .filter($$2x -> !$$2x.f() && !$$2x.R_() && $$2x.bE() && $$2x.g($$1.b()) <= (double)ayo.h($$2.h()))
         .toList();
      if ($$4.isEmpty()) {
         return Optional.empty();
      } else {
         bsr $$5 = a($$4, $$3.d, $$2, $$1, $$0);
         return $$5 == null ? Optional.empty() : a($$5, $$0);
      }
   }

   private static Optional<exa> a(bsr $$0, aqu $$1) {
      exa $$2 = $$0.dn();
      exa $$3 = $$2.a(ji.b, (double)($$0.dl() + 2.0F + (float)$$1.z.a(4)));
      eww $$4 = $$1.a(new dcf($$2, $$3, dcf.a.c, dcf.b.a, exf.a()));
      exa $$5 = $$4.a().b().a(ji.a, 1.0);
      jd $$6 = jd.a((jw)$$5);
      return !$$1.a_($$6).k($$1, $$6).c() ? Optional.empty() : Optional.of($$5);
   }

   @Nullable
   private static bsr a(List<cmx> $$0, Set<UUID> $$1, dsf $$2, jd $$3, aqu $$4) {
      Stream<bsr> $$5 = $$1.stream().map($$4::a).filter(Objects::nonNull).filter($$2x -> $$2x.bE() && $$2x.g($$3.b()) <= (double)ayo.h($$2.h()));
      List<? extends bsr> $$6 = $$4.z.h() ? $$5.toList() : $$0;
      if ($$6.isEmpty()) {
         return null;
      } else {
         return $$6.size() == 1 ? $$6.getFirst() : ad.a($$6, $$4.z);
      }
   }

   private boolean a(aqu $$0, dsh $$1) {
      return $$0.Z() >= $$1.e;
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

   public void a(dcw $$0, jd $$1, boolean $$2) {
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
      dsi.b a = ($$0, $$1, $$2, $$3) -> {
      };
      dsi.b b = ($$0, $$1, $$2, $$3) -> {
         if ($$1.a(2) == 0) {
            exa $$4 = $$2.b().a($$1, 0.9F);
            a($$3 ? lm.L : lm.aJ, $$4, $$0);
         }
      };
      dsi.b c = ($$0, $$1, $$2, $$3) -> {
         exa $$4 = $$2.b().a($$1, 1.0F);
         a(lm.ae, $$4, $$0);
         a($$3 ? lm.L : lm.F, $$4, $$0);
      };
      dsi.b d = ($$0, $$1, $$2, $$3) -> {
         exa $$4 = $$2.b().a($$1, 0.9F);
         if ($$1.a(3) == 0) {
            a(lm.ae, $$4, $$0);
         }

         if ($$0.Z() % 20L == 0L) {
            exa $$5 = $$2.b().b(0.0, 0.5, 0.0);
            int $$6 = $$0.E_().a(4) + 20;

            for (int $$7 = 0; $$7 < $$6; $$7++) {
               a(lm.ae, $$5, $$0);
            }
         }
      };

      private static void a(lq $$0, exa $$1, dcw $$2) {
         $$2.a($$0, $$1.a(), $$1.b(), $$1.c(), 0.0, 0.0, 0.0);
      }

      void emit(dcw var1, ayw var2, jd var3, boolean var4);
   }

   static class c {
      private static final double a = -1.0;
      private static final double b = 200.0;
      private static final double c = 1000.0;

      private c() {
      }
   }
}
