import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public enum dty implements bab {
   a("inactive", 0, dty.b.a, -1.0, false),
   b("waiting_for_players", 4, dty.b.b, 200.0, true),
   c("active", 8, dty.b.c, 1000.0, true),
   d("waiting_for_reward_ejection", 8, dty.b.b, -1.0, false),
   e("ejecting_reward", 8, dty.b.b, -1.0, false),
   f("cooldown", 0, dty.b.d, -1.0, false);

   private static final float g = 40.0F;
   private static final int h = azf.d(30.0F);
   private final String i;
   private final int j;
   private final double k;
   private final dty.b l;
   private final boolean m;

   private dty(final String $$0, final int $$1, final dty.b $$2, final double $$3, final boolean $$4) {
      this.i = $$0;
      this.j = $$1;
      this.l = $$2;
      this.k = $$3;
      this.m = $$4;
   }

   dty a(jf $$0, dtu $$1, arj $$2) {
      dtx $$3 = $$1.f();
      dtv $$4 = $$1.b();

      return switch (this) {
         case a -> $$3.a($$1, $$2, b) == null ? this : b;
         case b -> {
            if (!$$1.a($$2)) {
               $$3.b();
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
               $$3.b();
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
                     $$4.i().b($$2.D_()).ifPresent($$2xx -> {
                        $$3.h = Optional.of((dfc)$$2xx.b());
                        $$1.j();
                     });
                  });
               }

               yield this;
            }
         }
         case d -> {
            if ($$3.a($$2, 40.0F, $$1.g())) {
               $$2.a(null, $$0, awg.ml, awh.e);
               yield e;
            } else {
               yield this;
            }
         }
         case e -> {
            if (!$$3.b($$2, (float)h, $$1.g())) {
               yield this;
            } else if ($$3.c.isEmpty()) {
               $$2.a(null, $$0, awg.mm, awh.e);
               $$3.i = Optional.empty();
               yield f;
            } else {
               if ($$3.i.isEmpty()) {
                  $$3.i = $$4.j().a($$2.D_());
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

   private void a(arj $$0, jf $$1, dtu $$2) {
      dtx $$3 = $$2.f();
      dtv $$4 = $$2.b();
      cvs $$5 = $$3.a($$0, $$4, $$1).a($$0.z).orElse(cvs.k);
      if (!$$5.f()) {
         if (this.a($$0, $$3)) {
            a($$0, $$1, $$2, $$3).ifPresent($$4x -> {
               but $$5x = but.a($$0, $$5);
               $$5x.e($$4x);
               $$0.b($$5x);
               float $$6 = ($$0.D_().i() - $$0.D_().i()) * 0.2F + 1.0F;
               $$0.a(null, jf.a((jy)$$4x), awg.mg, awh.e, 1.0F, $$6);
               $$3.e = $$0.aa() + $$2.d().a();
            });
         }
      }
   }

   private static Optional<eyw> a(arj $$0, jf $$1, dtu $$2, dtx $$3) {
      List<cnx> $$4 = $$3.c
         .stream()
         .map($$0::b)
         .filter(Objects::nonNull)
         .filter($$2x -> !$$2x.f() && !$$2x.Q_() && $$2x.bI() && $$2x.f($$1.b()) <= (double)azf.h($$2.h()))
         .toList();
      if ($$4.isEmpty()) {
         return Optional.empty();
      } else {
         btr $$5 = a($$4, $$3.d, $$2, $$1, $$0);
         return $$5 == null ? Optional.empty() : a($$5, $$0);
      }
   }

   private static Optional<eyw> a(btr $$0, arj $$1) {
      eyw $$2 = $$0.dq();
      eyw $$3 = $$2.a(jk.b, (double)($$0.do() + 2.0F + (float)$$1.z.a(4)));
      eys $$4 = $$1.a(new ddr($$2, $$3, ddr.a.c, ddr.b.a, ezb.a()));
      eyw $$5 = $$4.b().b().a(jk.a, 1.0);
      jf $$6 = jf.a((jy)$$5);
      return !$$1.a_($$6).g($$1, $$6).c() ? Optional.empty() : Optional.of($$5);
   }

   @Nullable
   private static btr a(List<cnx> $$0, Set<UUID> $$1, dtu $$2, jf $$3, arj $$4) {
      Stream<btr> $$5 = $$1.stream().map($$4::a).filter(Objects::nonNull).filter($$2x -> $$2x.bI() && $$2x.f($$3.b()) <= (double)azf.h($$2.h()));
      List<? extends btr> $$6 = $$4.z.h() ? $$5.toList() : $$0;
      if ($$6.isEmpty()) {
         return null;
      } else {
         return $$6.size() == 1 ? $$6.getFirst() : ad.a($$6, $$4.z);
      }
   }

   private boolean a(arj $$0, dtx $$1) {
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

   public void a(dej $$0, jf $$1, boolean $$2) {
      this.l.emit($$0, $$0.D_(), $$1, $$2);
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
      dty.b a = ($$0, $$1, $$2, $$3) -> {
      };
      dty.b b = ($$0, $$1, $$2, $$3) -> {
         if ($$1.a(2) == 0) {
            eyw $$4 = $$2.b().a($$1, 0.9F);
            a($$3 ? lo.L : lo.aJ, $$4, $$0);
         }
      };
      dty.b c = ($$0, $$1, $$2, $$3) -> {
         eyw $$4 = $$2.b().a($$1, 1.0F);
         a(lo.ae, $$4, $$0);
         a($$3 ? lo.L : lo.F, $$4, $$0);
      };
      dty.b d = ($$0, $$1, $$2, $$3) -> {
         eyw $$4 = $$2.b().a($$1, 0.9F);
         if ($$1.a(3) == 0) {
            a(lo.ae, $$4, $$0);
         }

         if ($$0.aa() % 20L == 0L) {
            eyw $$5 = $$2.b().b(0.0, 0.5, 0.0);
            int $$6 = $$0.D_().a(4) + 20;

            for (int $$7 = 0; $$7 < $$6; $$7++) {
               a(lo.ae, $$5, $$0);
            }
         }
      };

      private static void a(ls $$0, eyw $$1, dej $$2) {
         $$2.a($$0, $$1.a(), $$1.b(), $$1.c(), 0.0, 0.0, 0.0);
      }

      void emit(dej var1, azn var2, jf var3, boolean var4);
   }

   static class c {
      private static final double a = -1.0;
      private static final double b = 200.0;
      private static final double c = 1000.0;

      private c() {
      }
   }
}
