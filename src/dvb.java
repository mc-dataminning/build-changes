import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public enum dvb implements bai {
   a("inactive", 0, dvb.b.a, -1.0, false),
   b("waiting_for_players", 4, dvb.b.b, 200.0, true),
   c("active", 8, dvb.b.c, 1000.0, true),
   d("waiting_for_reward_ejection", 8, dvb.b.b, -1.0, false),
   e("ejecting_reward", 8, dvb.b.b, -1.0, false),
   f("cooldown", 0, dvb.b.d, -1.0, false);

   private static final float g = 40.0F;
   private static final int h = azm.d(30.0F);
   private final String i;
   private final int j;
   private final double k;
   private final dvb.b l;
   private final boolean m;

   private dvb(final String $$0, final int $$1, final dvb.b $$2, final double $$3, final boolean $$4) {
      this.i = $$0;
      this.j = $$1;
      this.l = $$2;
      this.k = $$3;
      this.m = $$4;
   }

   dvb a(jh $$0, dux $$1, arp $$2) {
      dva $$3 = $$1.f();
      duy $$4 = $$1.b();

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
                     $$3.e = $$2.ab() + (long)$$1.g();
                     $$3.g = 0;
                     $$3.f = 0L;
                     yield d;
                  }
               } else if ($$3.a($$2, $$4, $$5)) {
                  $$1.c($$2, $$0).ifPresent($$4x -> {
                     $$3.d.add($$4x);
                     $$3.g++;
                     $$3.f = $$2.ab() + (long)$$4.h();
                     $$4.i().b($$2.G_()).ifPresent($$2xx -> {
                        $$3.h = Optional.of((dgg)$$2xx.b());
                        $$1.j();
                     });
                  });
               }

               yield this;
            }
         }
         case d -> {
            if ($$3.a($$2, 40.0F, $$1.g())) {
               $$2.a(null, $$0, awn.mj, awo.e);
               yield e;
            } else {
               yield this;
            }
         }
         case e -> {
            if (!$$3.b($$2, (float)h, $$1.g())) {
               yield this;
            } else if ($$3.c.isEmpty()) {
               $$2.a(null, $$0, awn.mk, awo.e);
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

   private void a(arp $$0, jh $$1, dux $$2) {
      dva $$3 = $$2.f();
      duy $$4 = $$2.b();
      cwm $$5 = $$3.a($$0, $$4, $$1).a($$0.A).orElse(cwm.k);
      if (!$$5.f()) {
         if (this.a($$0, $$3)) {
            a($$0, $$1, $$2, $$3).ifPresent($$4x -> {
               bvn $$5x = bvn.a($$0, $$5);
               $$5x.e($$4x);
               $$0.b($$5x);
               float $$6 = ($$0.G_().i() - $$0.G_().i()) * 0.2F + 1.0F;
               $$0.a(null, jh.a((ka)$$4x), awn.me, awo.e, 1.0F, $$6);
               $$3.e = $$0.ab() + $$2.d().a();
            });
         }
      }
   }

   private static Optional<ezy> a(arp $$0, jh $$1, dux $$2, dva $$3) {
      List<cou> $$4 = $$3.c
         .stream()
         .map($$0::b)
         .filter(Objects::nonNull)
         .filter($$2x -> !$$2x.b() && !$$2x.Y_() && $$2x.bL() && $$2x.f($$1.b()) <= (double)azm.h($$2.h()))
         .toList();
      if ($$4.isEmpty()) {
         return Optional.empty();
      } else {
         bul $$5 = a($$4, $$3.d, $$2, $$1, $$0);
         return $$5 == null ? Optional.empty() : a($$5, $$0);
      }
   }

   private static Optional<ezy> a(bul $$0, arp $$1) {
      ezy $$2 = $$0.dt();
      ezy $$3 = $$2.a(jm.b, (double)($$0.dr() + 2.0F + (float)$$1.A.a(4)));
      ezu $$4 = $$1.a(new deu($$2, $$3, deu.a.c, deu.b.a, fad.a()));
      ezy $$5 = $$4.b().b().a(jm.a, 1.0);
      jh $$6 = jh.a((ka)$$5);
      return !$$1.a_($$6).g($$1, $$6).c() ? Optional.empty() : Optional.of($$5);
   }

   @Nullable
   private static bul a(List<cou> $$0, Set<UUID> $$1, dux $$2, jh $$3, arp $$4) {
      Stream<bul> $$5 = $$1.stream().map($$4::a).filter(Objects::nonNull).filter($$2x -> $$2x.bL() && $$2x.f($$3.b()) <= (double)azm.h($$2.h()));
      List<? extends bul> $$6 = $$4.A.h() ? $$5.toList() : $$0;
      if ($$6.isEmpty()) {
         return null;
      } else {
         return $$6.size() == 1 ? $$6.getFirst() : ae.a($$6, $$4.A);
      }
   }

   private boolean a(arp $$0, dva $$1) {
      return $$0.ab() >= $$1.e;
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

   public void a(dfm $$0, jh $$1, boolean $$2) {
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
      dvb.b a = ($$0, $$1, $$2, $$3) -> {
      };
      dvb.b b = ($$0, $$1, $$2, $$3) -> {
         if ($$1.a(2) == 0) {
            ezy $$4 = $$2.b().a($$1, 0.9F);
            a($$3 ? ls.L : ls.aJ, $$4, $$0);
         }
      };
      dvb.b c = ($$0, $$1, $$2, $$3) -> {
         ezy $$4 = $$2.b().a($$1, 1.0F);
         a(ls.ae, $$4, $$0);
         a($$3 ? ls.L : ls.F, $$4, $$0);
      };
      dvb.b d = ($$0, $$1, $$2, $$3) -> {
         ezy $$4 = $$2.b().a($$1, 0.9F);
         if ($$1.a(3) == 0) {
            a(ls.ae, $$4, $$0);
         }

         if ($$0.ab() % 20L == 0L) {
            ezy $$5 = $$2.b().b(0.0, 0.5, 0.0);
            int $$6 = $$0.G_().a(4) + 20;

            for (int $$7 = 0; $$7 < $$6; $$7++) {
               a(ls.ae, $$5, $$0);
            }
         }
      };

      private static void a(lw $$0, ezy $$1, dfm $$2) {
         $$2.a($$0, $$1.a(), $$1.b(), $$1.c(), 0.0, 0.0, 0.0);
      }

      void emit(dfm var1, azu var2, jh var3, boolean var4);
   }

   static class c {
      private static final double a = -1.0;
      private static final double b = 200.0;
      private static final double c = 1000.0;

      private c() {
      }
   }
}
