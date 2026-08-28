import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public enum eal implements bao {
   a("inactive", 0, eal.b.a, -1.0, false),
   b("waiting_for_players", 4, eal.b.b, 200.0, true),
   c("active", 8, eal.b.c, 1000.0, true),
   d("waiting_for_reward_ejection", 8, eal.b.b, -1.0, false),
   e("ejecting_reward", 8, eal.b.b, -1.0, false),
   f("cooldown", 0, eal.b.d, -1.0, false);

   private static final float g = 40.0F;
   private static final int h = azq.d(30.0F);
   private final String i;
   private final int j;
   private final double k;
   private final eal.b l;
   private final boolean m;

   private eal(final String $$0, final int $$1, final eal.b $$2, final double $$3, final boolean $$4) {
      this.i = $$0;
      this.j = $$1;
      this.l = $$2;
      this.k = $$3;
      this.m = $$4;
   }

   eal a(iw $$0, eah $$1, aru $$2) {
      eak $$3 = $$1.f();
      eai $$4 = $$1.b();

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
                     $$4.i().a($$2.G_()).ifPresent($$2xx -> {
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
               $$2.a(null, $$0, awr.mM, aws.e);
               yield e;
            } else {
               yield this;
            }
         }
         case e -> {
            if (!$$3.b($$2, (float)h, $$1.g())) {
               yield this;
            } else if ($$3.c.isEmpty()) {
               $$2.a(null, $$0, awr.mN, aws.e);
               $$3.i = Optional.empty();
               yield f;
            } else {
               if ($$3.i.isEmpty()) {
                  $$3.i = $$4.j().a($$2.G_());
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

   private void a(aru $$0, iw $$1, eah $$2) {
      eak $$3 = $$2.f();
      eai $$4 = $$2.b();
      daa $$5 = $$3.a($$0, $$4, $$1).a($$0.A).orElse(daa.k);
      if (!$$5.f()) {
         if (this.a($$0, $$3)) {
            a($$0, $$1, $$2, $$3).ifPresent($$4x -> {
               byc $$5x = byc.a($$0, $$5);
               $$5x.f($$4x);
               $$0.b($$5x);
               float $$6 = ($$0.G_().i() - $$0.G_().i()) * 0.2F + 1.0F;
               $$0.a(null, iw.a((jq)$$4x), awr.mH, aws.e, 1.0F, $$6);
               $$3.e = $$0.ae() + $$2.d().a();
            });
         }
      }
   }

   private static Optional<ffs> a(aru $$0, iw $$1, eah $$2, eak $$3) {
      List<crz> $$4 = $$3.c
         .stream()
         .map($$0::a)
         .filter(Objects::nonNull)
         .filter($$2x -> !$$2x.b() && !$$2x.Z_() && $$2x.bJ() && $$2x.g($$1.b()) <= (double)azq.h($$2.h()))
         .toList();
      if ($$4.isEmpty()) {
         return Optional.empty();
      } else {
         bwv $$5 = a($$4, $$3.d, $$2, $$1, $$0);
         return $$5 == null ? Optional.empty() : a($$5, $$0);
      }
   }

   private static Optional<ffs> a(bwv $$0, aru $$1) {
      ffs $$2 = $$0.dt();
      ffs $$3 = $$2.a(jc.b, (double)($$0.dr() + 2.0F + (float)$$1.A.a(4)));
      ffo $$4 = $$1.a(new djg($$2, $$3, djg.a.c, djg.b.a, ffx.a()));
      ffs $$5 = $$4.b().b().a(jc.a, 1.0);
      iw $$6 = iw.a((jq)$$5);
      return !$$1.a_($$6).g($$1, $$6).c() ? Optional.empty() : Optional.of($$5);
   }

   @Nullable
   private static bwv a(List<crz> $$0, Set<UUID> $$1, eah $$2, iw $$3, aru $$4) {
      Stream<bwv> $$5 = $$1.stream().map($$4::b).filter(Objects::nonNull).filter($$2x -> $$2x.bJ() && $$2x.g($$3.b()) <= (double)azq.h($$2.h()));
      List<? extends bwv> $$6 = $$4.A.h() ? $$5.toList() : $$0;
      if ($$6.isEmpty()) {
         return null;
      } else {
         return $$6.size() == 1 ? $$6.getFirst() : ag.a($$6, $$4.A);
      }
   }

   private boolean a(aru $$0, eak $$1) {
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

   public void a(djz $$0, iw $$1, boolean $$2) {
      this.l.emit($$0, $$0.G_(), $$1, $$2);
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
      eal.b a = ($$0, $$1, $$2, $$3) -> {
      };
      eal.b b = ($$0, $$1, $$2, $$3) -> {
         if ($$1.a(2) == 0) {
            ffs $$4 = $$2.b().a($$1, 0.9F);
            a($$3 ? lz.N : lz.aM, $$4, $$0);
         }
      };
      eal.b c = ($$0, $$1, $$2, $$3) -> {
         ffs $$4 = $$2.b().a($$1, 1.0F);
         a(lz.ah, $$4, $$0);
         a($$3 ? lz.N : lz.F, $$4, $$0);
      };
      eal.b d = ($$0, $$1, $$2, $$3) -> {
         ffs $$4 = $$2.b().a($$1, 0.9F);
         if ($$1.a(3) == 0) {
            a(lz.ah, $$4, $$0);
         }

         if ($$0.ae() % 20L == 0L) {
            ffs $$5 = $$2.b().b(0.0, 0.5, 0.0);
            int $$6 = $$0.G_().a(4) + 20;

            for (int $$7 = 0; $$7 < $$6; $$7++) {
               a(lz.ah, $$5, $$0);
            }
         }
      };

      private static void a(md $$0, ffs $$1, djz $$2) {
         $$2.a($$0, $$1.a(), $$1.b(), $$1.c(), 0.0, 0.0, 0.0);
      }

      void emit(djz var1, azz var2, iw var3, boolean var4);
   }

   static class c {
      private static final double a = -1.0;
      private static final double b = 200.0;
      private static final double c = 1000.0;

      private c() {
      }
   }
}
