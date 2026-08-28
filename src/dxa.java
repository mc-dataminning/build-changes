import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public enum dxa implements bba {
   a("inactive", 0, dxa.b.a, -1.0, false),
   b("waiting_for_players", 4, dxa.b.b, 200.0, true),
   c("active", 8, dxa.b.c, 1000.0, true),
   d("waiting_for_reward_ejection", 8, dxa.b.b, -1.0, false),
   e("ejecting_reward", 8, dxa.b.b, -1.0, false),
   f("cooldown", 0, dxa.b.d, -1.0, false);

   private static final float g = 40.0F;
   private static final int h = bae.d(30.0F);
   private final String i;
   private final int j;
   private final double k;
   private final dxa.b l;
   private final boolean m;

   private dxa(final String $$0, final int $$1, final dxa.b $$2, final double $$3, final boolean $$4) {
      this.i = $$0;
      this.j = $$1;
      this.l = $$2;
      this.k = $$3;
      this.m = $$4;
   }

   dxa a(jh $$0, dww $$1, ash $$2) {
      dwz $$3 = $$1.f();
      dwx $$4 = $$1.b();

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
                     $$3.e = $$2.ac() + (long)$$1.g();
                     $$3.g = 0;
                     $$3.f = 0L;
                     yield d;
                  }
               } else if ($$3.a($$2, $$4, $$5)) {
                  $$1.c($$2, $$0).ifPresent($$4x -> {
                     $$3.d.add($$4x);
                     $$3.g++;
                     $$3.f = $$2.ac() + (long)$$4.h();
                     $$4.i().b($$2.H_()).ifPresent($$2xx -> {
                        $$3.h = Optional.of((dib)$$2xx.b());
                        $$1.j();
                     });
                  });
               }

               yield this;
            }
         }
         case d -> {
            if ($$3.a($$2, 40.0F, $$1.g())) {
               $$2.a(null, $$0, axf.mC, axg.e);
               yield e;
            } else {
               yield this;
            }
         }
         case e -> {
            if (!$$3.b($$2, (float)h, $$1.g())) {
               yield this;
            } else if ($$3.c.isEmpty()) {
               $$2.a(null, $$0, axf.mD, axg.e);
               $$3.i = Optional.empty();
               yield f;
            } else {
               if ($$3.i.isEmpty()) {
                  $$3.i = $$4.j().a($$2.H_());
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

   private void a(ash $$0, jh $$1, dww $$2) {
      dwz $$3 = $$2.f();
      dwx $$4 = $$2.b();
      cxo $$5 = $$3.a($$0, $$4, $$1).a($$0.A).orElse(cxo.k);
      if (!$$5.f()) {
         if (this.a($$0, $$3)) {
            a($$0, $$1, $$2, $$3).ifPresent($$4x -> {
               bwl $$5x = bwl.a($$0, $$5);
               $$5x.e($$4x);
               $$0.b($$5x);
               float $$6 = ($$0.H_().i() - $$0.H_().i()) * 0.2F + 1.0F;
               $$0.a(null, jh.a((ka)$$4x), axf.mx, axg.e, 1.0F, $$6);
               $$3.e = $$0.ac() + $$2.d().a();
            });
         }
      }
   }

   private static Optional<fbx> a(ash $$0, jh $$1, dww $$2, dwz $$3) {
      List<cpw> $$4 = $$3.c
         .stream()
         .map($$0::b)
         .filter(Objects::nonNull)
         .filter($$2x -> !$$2x.b() && !$$2x.aa_() && $$2x.bL() && $$2x.f($$1.b()) <= (double)bae.h($$2.h()))
         .toList();
      if ($$4.isEmpty()) {
         return Optional.empty();
      } else {
         bvj $$5 = a($$4, $$3.d, $$2, $$1, $$0);
         return $$5 == null ? Optional.empty() : a($$5, $$0);
      }
   }

   private static Optional<fbx> a(bvj $$0, ash $$1) {
      fbx $$2 = $$0.dt();
      fbx $$3 = $$2.a(jm.b, (double)($$0.dr() + 2.0F + (float)$$1.A.a(4)));
      fbt $$4 = $$1.a(new dgp($$2, $$3, dgp.a.c, dgp.b.a, fcc.a()));
      fbx $$5 = $$4.b().b().a(jm.a, 1.0);
      jh $$6 = jh.a((ka)$$5);
      return !$$1.a_($$6).g($$1, $$6).c() ? Optional.empty() : Optional.of($$5);
   }

   @Nullable
   private static bvj a(List<cpw> $$0, Set<UUID> $$1, dww $$2, jh $$3, ash $$4) {
      Stream<bvj> $$5 = $$1.stream().map($$4::a).filter(Objects::nonNull).filter($$2x -> $$2x.bL() && $$2x.f($$3.b()) <= (double)bae.h($$2.h()));
      List<? extends bvj> $$6 = $$4.A.h() ? $$5.toList() : $$0;
      if ($$6.isEmpty()) {
         return null;
      } else {
         return $$6.size() == 1 ? $$6.getFirst() : ae.a($$6, $$4.A);
      }
   }

   private boolean a(ash $$0, dwz $$1) {
      return $$0.ac() >= $$1.e;
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

   public void a(dhh $$0, jh $$1, boolean $$2) {
      this.l.emit($$0, $$0.H_(), $$1, $$2);
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
      dxa.b a = ($$0, $$1, $$2, $$3) -> {
      };
      dxa.b b = ($$0, $$1, $$2, $$3) -> {
         if ($$1.a(2) == 0) {
            fbx $$4 = $$2.b().a($$1, 0.9F);
            a($$3 ? ls.L : ls.aK, $$4, $$0);
         }
      };
      dxa.b c = ($$0, $$1, $$2, $$3) -> {
         fbx $$4 = $$2.b().a($$1, 1.0F);
         a(ls.af, $$4, $$0);
         a($$3 ? ls.L : ls.F, $$4, $$0);
      };
      dxa.b d = ($$0, $$1, $$2, $$3) -> {
         fbx $$4 = $$2.b().a($$1, 0.9F);
         if ($$1.a(3) == 0) {
            a(ls.af, $$4, $$0);
         }

         if ($$0.ac() % 20L == 0L) {
            fbx $$5 = $$2.b().b(0.0, 0.5, 0.0);
            int $$6 = $$0.H_().a(4) + 20;

            for (int $$7 = 0; $$7 < $$6; $$7++) {
               a(ls.af, $$5, $$0);
            }
         }
      };

      private static void a(lw $$0, fbx $$1, dhh $$2) {
         $$2.a($$0, $$1.a(), $$1.b(), $$1.c(), 0.0, 0.0, 0.0);
      }

      void emit(dhh var1, bam var2, jh var3, boolean var4);
   }

   static class c {
      private static final double a = -1.0;
      private static final double b = 200.0;
      private static final double c = 1000.0;

      private c() {
      }
   }
}
