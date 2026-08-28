import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public enum dzt implements bak {
   a("inactive", 0, dzt.b.a, -1.0, false),
   b("waiting_for_players", 4, dzt.b.b, 200.0, true),
   c("active", 8, dzt.b.c, 1000.0, true),
   d("waiting_for_reward_ejection", 8, dzt.b.b, -1.0, false),
   e("ejecting_reward", 8, dzt.b.b, -1.0, false),
   f("cooldown", 0, dzt.b.d, -1.0, false);

   private static final float g = 40.0F;
   private static final int h = azm.d(30.0F);
   private final String i;
   private final int j;
   private final double k;
   private final dzt.b l;
   private final boolean m;

   private dzt(final String $$0, final int $$1, final dzt.b $$2, final double $$3, final boolean $$4) {
      this.i = $$0;
      this.j = $$1;
      this.l = $$2;
      this.k = $$3;
      this.m = $$4;
   }

   dzt a(iv $$0, dzp $$1, arq $$2) {
      dzs $$3 = $$1.f();
      dzq $$4 = $$1.b();

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
                     $$3.e = $$2.ae() + (long)$$1.g();
                     $$3.g = 0;
                     $$3.f = 0L;
                     yield d;
                  }
               } else if ($$3.a($$2, $$4, $$5)) {
                  $$1.c($$2, $$0).ifPresent($$4x -> {
                     $$3.d.add($$4x);
                     $$3.g++;
                     $$3.f = $$2.ae() + (long)$$4.h();
                     $$4.i().a($$2.C_()).ifPresent($$2xx -> {
                        $$3.h = Optional.of($$2xx);
                        $$1.j();
                     });
                  });
               }

               yield this;
            }
         }
         case d -> {
            if ($$3.a($$2, 40.0F, $$1.g())) {
               $$2.a(null, $$0, awn.mM, awo.e);
               yield e;
            } else {
               yield this;
            }
         }
         case e -> {
            if (!$$3.b($$2, (float)h, $$1.g())) {
               yield this;
            } else if ($$3.c.isEmpty()) {
               $$2.a(null, $$0, awn.mN, awo.e);
               $$3.i = Optional.empty();
               yield f;
            } else {
               if ($$3.i.isEmpty()) {
                  $$3.i = $$4.j().a($$2.C_());
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

   private void a(arq $$0, iv $$1, dzp $$2) {
      dzs $$3 = $$2.f();
      dzq $$4 = $$2.b();
      czk $$5 = $$3.a($$0, $$4, $$1).a($$0.A).orElse(czk.k);
      if (!$$5.f()) {
         if (this.a($$0, $$3)) {
            a($$0, $$1, $$2, $$3).ifPresent($$4x -> {
               bxp $$5x = bxp.a($$0, $$5);
               $$5x.f($$4x);
               $$0.b($$5x);
               float $$6 = ($$0.C_().i() - $$0.C_().i()) * 0.2F + 1.0F;
               $$0.a(null, iv.a((jp)$$4x), awn.mH, awo.e, 1.0F, $$6);
               $$3.e = $$0.ae() + $$2.d().a();
            });
         }
      }
   }

   private static Optional<fex> a(arq $$0, iv $$1, dzp $$2, dzs $$3) {
      List<crj> $$4 = $$3.c
         .stream()
         .map($$0::a)
         .filter(Objects::nonNull)
         .filter($$2x -> !$$2x.b() && !$$2x.V_() && $$2x.bI() && $$2x.g($$1.b()) <= (double)azm.h($$2.h()))
         .toList();
      if ($$4.isEmpty()) {
         return Optional.empty();
      } else {
         bwi $$5 = a($$4, $$3.d, $$2, $$1, $$0);
         return $$5 == null ? Optional.empty() : a($$5, $$0);
      }
   }

   private static Optional<fex> a(bwi $$0, arq $$1) {
      fex $$2 = $$0.ds();
      fex $$3 = $$2.a(jb.b, (double)($$0.dq() + 2.0F + (float)$$1.A.a(4)));
      fet $$4 = $$1.a(new diq($$2, $$3, diq.a.c, diq.b.a, ffc.a()));
      fex $$5 = $$4.b().b().a(jb.a, 1.0);
      iv $$6 = iv.a((jp)$$5);
      return !$$1.a_($$6).g($$1, $$6).c() ? Optional.empty() : Optional.of($$5);
   }

   @Nullable
   private static bwi a(List<crj> $$0, Set<UUID> $$1, dzp $$2, iv $$3, arq $$4) {
      Stream<bwi> $$5 = $$1.stream().map($$4::b).filter(Objects::nonNull).filter($$2x -> $$2x.bI() && $$2x.g($$3.b()) <= (double)azm.h($$2.h()));
      List<? extends bwi> $$6 = $$4.A.h() ? $$5.toList() : $$0;
      if ($$6.isEmpty()) {
         return null;
      } else {
         return $$6.size() == 1 ? $$6.getFirst() : ag.a($$6, $$4.A);
      }
   }

   private boolean a(arq $$0, dzs $$1) {
      return $$0.ae() >= $$1.e;
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

   public void a(djh $$0, iv $$1, boolean $$2) {
      this.l.emit($$0, $$0.C_(), $$1, $$2);
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
      dzt.b a = ($$0, $$1, $$2, $$3) -> {
      };
      dzt.b b = ($$0, $$1, $$2, $$3) -> {
         if ($$1.a(2) == 0) {
            fex $$4 = $$2.b().a($$1, 0.9F);
            a($$3 ? ly.N : ly.aM, $$4, $$0);
         }
      };
      dzt.b c = ($$0, $$1, $$2, $$3) -> {
         fex $$4 = $$2.b().a($$1, 1.0F);
         a(ly.ah, $$4, $$0);
         a($$3 ? ly.N : ly.F, $$4, $$0);
      };
      dzt.b d = ($$0, $$1, $$2, $$3) -> {
         fex $$4 = $$2.b().a($$1, 0.9F);
         if ($$1.a(3) == 0) {
            a(ly.ah, $$4, $$0);
         }

         if ($$0.ae() % 20L == 0L) {
            fex $$5 = $$2.b().b(0.0, 0.5, 0.0);
            int $$6 = $$0.C_().a(4) + 20;

            for (int $$7 = 0; $$7 < $$6; $$7++) {
               a(ly.ah, $$5, $$0);
            }
         }
      };

      private static void a(mc $$0, fex $$1, djh $$2) {
         $$2.a($$0, $$1.a(), $$1.b(), $$1.c(), 0.0, 0.0, 0.0);
      }

      void emit(djh var1, azv var2, iv var3, boolean var4);
   }

   static class c {
      private static final double a = -1.0;
      private static final double b = 200.0;
      private static final double c = 1000.0;

      private c() {
      }
   }
}
