import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public enum dtu implements azz {
   a("inactive", 0, dtu.b.a, -1.0, false),
   b("waiting_for_players", 4, dtu.b.b, 200.0, true),
   c("active", 8, dtu.b.c, 1000.0, true),
   d("waiting_for_reward_ejection", 8, dtu.b.b, -1.0, false),
   e("ejecting_reward", 8, dtu.b.b, -1.0, false),
   f("cooldown", 0, dtu.b.d, -1.0, false);

   private static final float g = 40.0F;
   private static final int h = azd.d(30.0F);
   private final String i;
   private final int j;
   private final double k;
   private final dtu.b l;
   private final boolean m;

   private dtu(final String $$0, final int $$1, final dtu.b $$2, final double $$3, final boolean $$4) {
      this.i = $$0;
      this.j = $$1;
      this.l = $$2;
      this.k = $$3;
      this.m = $$4;
   }

   dtu a(je $$0, dtr $$1, arh $$2) {
      dtt $$3 = $$1.f();
      dts $$4 = $$1.b();

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
                     $$3.f = $$2.aa() + (long)$$4.g();
                     $$4.h().b($$2.C_()).ifPresent($$2xx -> {
                        $$3.h = Optional.of((dez)$$2xx.b());
                        $$1.j();
                     });
                  });
               }

               yield this;
            }
         }
         case d -> {
            if ($$3.a($$2, 40.0F, $$1.g())) {
               $$2.a(null, $$0, awe.ml, awf.e);
               yield e;
            } else {
               yield this;
            }
         }
         case e -> {
            if (!$$3.b($$2, (float)h, $$1.g())) {
               yield this;
            } else if ($$3.c.isEmpty()) {
               $$2.a(null, $$0, awe.mm, awf.e);
               $$3.i = Optional.empty();
               yield f;
            } else {
               if ($$3.i.isEmpty()) {
                  $$3.i = $$4.i().a($$2.C_());
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

   private void a(arh $$0, je $$1, dtr $$2) {
      dtt $$3 = $$2.f();
      dts $$4 = $$2.b();
      cvp $$5 = $$3.a($$0, $$4, $$1).a($$0.z).orElse(cvp.k);
      if (!$$5.f()) {
         if (this.a($$0, $$3)) {
            a($$0, $$1, $$2, $$3).ifPresent($$4x -> {
               buq $$5x = buq.a($$0, $$5);
               $$5x.e($$4x);
               $$0.b($$5x);
               float $$6 = ($$0.C_().i() - $$0.C_().i()) * 0.2F + 1.0F;
               $$0.a(null, je.a((jx)$$4x), awe.mg, awf.e, 1.0F, $$6);
               $$3.e = $$0.aa() + $$2.d().a();
            });
         }
      }
   }

   private static Optional<eys> a(arh $$0, je $$1, dtr $$2, dtt $$3) {
      List<cnu> $$4 = $$3.c
         .stream()
         .map($$0::b)
         .filter(Objects::nonNull)
         .filter($$2x -> !$$2x.f() && !$$2x.P_() && $$2x.bI() && $$2x.f($$1.b()) <= (double)azd.h($$2.h()))
         .toList();
      if ($$4.isEmpty()) {
         return Optional.empty();
      } else {
         bto $$5 = a($$4, $$3.d, $$2, $$1, $$0);
         return $$5 == null ? Optional.empty() : a($$5, $$0);
      }
   }

   private static Optional<eys> a(bto $$0, arh $$1) {
      eys $$2 = $$0.dq();
      eys $$3 = $$2.a(jj.b, (double)($$0.do() + 2.0F + (float)$$1.z.a(4)));
      eyo $$4 = $$1.a(new ddo($$2, $$3, ddo.a.c, ddo.b.a, eyx.a()));
      eys $$5 = $$4.b().b().a(jj.a, 1.0);
      je $$6 = je.a((jx)$$5);
      return !$$1.a_($$6).g($$1, $$6).c() ? Optional.empty() : Optional.of($$5);
   }

   @Nullable
   private static bto a(List<cnu> $$0, Set<UUID> $$1, dtr $$2, je $$3, arh $$4) {
      Stream<bto> $$5 = $$1.stream().map($$4::a).filter(Objects::nonNull).filter($$2x -> $$2x.bI() && $$2x.f($$3.b()) <= (double)azd.h($$2.h()));
      List<? extends bto> $$6 = $$4.z.h() ? $$5.toList() : $$0;
      if ($$6.isEmpty()) {
         return null;
      } else {
         return $$6.size() == 1 ? $$6.getFirst() : ad.a($$6, $$4.z);
      }
   }

   private boolean a(arh $$0, dtt $$1) {
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

   public void a(deg $$0, je $$1, boolean $$2) {
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
      dtu.b a = ($$0, $$1, $$2, $$3) -> {
      };
      dtu.b b = ($$0, $$1, $$2, $$3) -> {
         if ($$1.a(2) == 0) {
            eys $$4 = $$2.b().a($$1, 0.9F);
            a($$3 ? ln.L : ln.aJ, $$4, $$0);
         }
      };
      dtu.b c = ($$0, $$1, $$2, $$3) -> {
         eys $$4 = $$2.b().a($$1, 1.0F);
         a(ln.ae, $$4, $$0);
         a($$3 ? ln.L : ln.F, $$4, $$0);
      };
      dtu.b d = ($$0, $$1, $$2, $$3) -> {
         eys $$4 = $$2.b().a($$1, 0.9F);
         if ($$1.a(3) == 0) {
            a(ln.ae, $$4, $$0);
         }

         if ($$0.aa() % 20L == 0L) {
            eys $$5 = $$2.b().b(0.0, 0.5, 0.0);
            int $$6 = $$0.C_().a(4) + 20;

            for (int $$7 = 0; $$7 < $$6; $$7++) {
               a(ln.ae, $$5, $$0);
            }
         }
      };

      private static void a(lr $$0, eys $$1, deg $$2) {
         $$2.a($$0, $$1.a(), $$1.b(), $$1.c(), 0.0, 0.0, 0.0);
      }

      void emit(deg var1, azl var2, je var3, boolean var4);
   }

   static class c {
      private static final double a = -1.0;
      private static final double b = 200.0;
      private static final double c = 1000.0;

      private c() {
      }
   }
}
