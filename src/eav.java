import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public enum eav implements bax {
   a("inactive", 0, eav.b.a, -1.0, false),
   b("waiting_for_players", 4, eav.b.b, 200.0, true),
   c("active", 8, eav.b.c, 1000.0, true),
   d("waiting_for_reward_ejection", 8, eav.b.b, -1.0, false),
   e("ejecting_reward", 8, eav.b.b, -1.0, false),
   f("cooldown", 0, eav.b.d, -1.0, false);

   private static final float g = 40.0F;
   private static final int h = azz.d(30.0F);
   private final String i;
   private final int j;
   private final double k;
   private final eav.b l;
   private final boolean m;

   private eav(final String $$0, final int $$1, final eav.b $$2, final double $$3, final boolean $$4) {
      this.i = $$0;
      this.j = $$1;
      this.l = $$2;
      this.k = $$3;
      this.m = $$4;
   }

   eav a(iw $$0, ear $$1, asb $$2) {
      eau $$3 = $$1.f();
      eas $$4 = $$1.b();

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
               $$2.a(null, $$0, awy.mM, awz.e);
               yield e;
            } else {
               yield this;
            }
         }
         case e -> {
            if (!$$3.b($$2, (float)h, $$1.g())) {
               yield this;
            } else if ($$3.c.isEmpty()) {
               $$2.a(null, $$0, awy.mN, awz.e);
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

   private void a(asb $$0, iw $$1, ear $$2) {
      eau $$3 = $$2.f();
      eas $$4 = $$2.b();
      dak $$5 = $$3.a($$0, $$4, $$1).a($$0.A).orElse(dak.l);
      if (!$$5.f()) {
         if (this.a($$0, $$3)) {
            a($$0, $$1, $$2, $$3).ifPresent($$4x -> {
               byl $$5x = byl.a($$0, $$5);
               $$5x.f($$4x);
               $$0.b($$5x);
               float $$6 = ($$0.G_().i() - $$0.G_().i()) * 0.2F + 1.0F;
               $$0.a(null, iw.a((jq)$$4x), awy.mH, awz.e, 1.0F, $$6);
               $$3.e = $$0.ae() + $$2.d().a();
            });
         }
      }
   }

   private static Optional<fgc> a(asb $$0, iw $$1, ear $$2, eau $$3) {
      List<csi> $$4 = $$3.c
         .stream()
         .map($$0::a)
         .filter(Objects::nonNull)
         .filter($$2x -> !$$2x.b() && !$$2x.aa_() && $$2x.bJ() && $$2x.g($$1.b()) <= (double)azz.h($$2.h()))
         .toList();
      if ($$4.isEmpty()) {
         return Optional.empty();
      } else {
         bxe $$5 = a($$4, $$3.d, $$2, $$1, $$0);
         return $$5 == null ? Optional.empty() : a($$5, $$0);
      }
   }

   private static Optional<fgc> a(bxe $$0, asb $$1) {
      fgc $$2 = $$0.dt();
      fgc $$3 = $$2.a(jc.b, (double)($$0.dr() + 2.0F + (float)$$1.A.a(4)));
      ffy $$4 = $$1.a(new djq($$2, $$3, djq.a.c, djq.b.a, fgh.a()));
      fgc $$5 = $$4.b().b().a(jc.a, 1.0);
      iw $$6 = iw.a((jq)$$5);
      return !$$1.a_($$6).g($$1, $$6).c() ? Optional.empty() : Optional.of($$5);
   }

   @Nullable
   private static bxe a(List<csi> $$0, Set<UUID> $$1, ear $$2, iw $$3, asb $$4) {
      Stream<bxe> $$5 = $$1.stream().map($$4::b).filter(Objects::nonNull).filter($$2x -> $$2x.bJ() && $$2x.g($$3.b()) <= (double)azz.h($$2.h()));
      List<? extends bxe> $$6 = $$4.A.h() ? $$5.toList() : $$0;
      if ($$6.isEmpty()) {
         return null;
      } else {
         return $$6.size() == 1 ? $$6.getFirst() : ag.a($$6, $$4.A);
      }
   }

   private boolean a(asb $$0, eau $$1) {
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

   public void a(dkj $$0, iw $$1, boolean $$2) {
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
      eav.b a = ($$0, $$1, $$2, $$3) -> {
      };
      eav.b b = ($$0, $$1, $$2, $$3) -> {
         if ($$1.a(2) == 0) {
            fgc $$4 = $$2.b().a($$1, 0.9F);
            a($$3 ? lz.N : lz.aM, $$4, $$0);
         }
      };
      eav.b c = ($$0, $$1, $$2, $$3) -> {
         fgc $$4 = $$2.b().a($$1, 1.0F);
         a(lz.ah, $$4, $$0);
         a($$3 ? lz.N : lz.F, $$4, $$0);
      };
      eav.b d = ($$0, $$1, $$2, $$3) -> {
         fgc $$4 = $$2.b().a($$1, 0.9F);
         if ($$1.a(3) == 0) {
            a(lz.ah, $$4, $$0);
         }

         if ($$0.ae() % 20L == 0L) {
            fgc $$5 = $$2.b().b(0.0, 0.5, 0.0);
            int $$6 = $$0.G_().a(4) + 20;

            for (int $$7 = 0; $$7 < $$6; $$7++) {
               a(lz.ah, $$5, $$0);
            }
         }
      };

      private static void a(md $$0, fgc $$1, dkj $$2) {
         $$2.a($$0, $$1.a(), $$1.b(), $$1.c(), 0.0, 0.0, 0.0);
      }

      void emit(dkj var1, bai var2, iw var3, boolean var4);
   }

   static class c {
      private static final double a = -1.0;
      private static final double b = 200.0;
      private static final double c = 1000.0;

      private c() {
      }
   }
}
