import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public enum dww implements azv {
   a("inactive", 0, dww.b.a, -1.0, false),
   b("waiting_for_players", 4, dww.b.b, 200.0, true),
   c("active", 8, dww.b.c, 1000.0, true),
   d("waiting_for_reward_ejection", 8, dww.b.b, -1.0, false),
   e("ejecting_reward", 8, dww.b.b, -1.0, false),
   f("cooldown", 0, dww.b.d, -1.0, false);

   private static final float g = 40.0F;
   private static final int h = ayz.d(30.0F);
   private final String i;
   private final int j;
   private final double k;
   private final dww.b l;
   private final boolean m;

   private dww(final String $$0, final int $$1, final dww.b $$2, final double $$3, final boolean $$4) {
      this.i = $$0;
      this.j = $$1;
      this.l = $$2;
      this.k = $$3;
      this.m = $$4;
   }

   dww a(ji $$0, dws $$1, ard $$2) {
      dwv $$3 = $$1.f();
      dwt $$4 = $$1.b();

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
               $$2.a(null, $$0, awa.mI, awb.e);
               yield e;
            } else {
               yield this;
            }
         }
         case e -> {
            if (!$$3.b($$2, (float)h, $$1.g())) {
               yield this;
            } else if ($$3.c.isEmpty()) {
               $$2.a(null, $$0, awa.mJ, awb.e);
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

   private void a(ard $$0, ji $$1, dws $$2) {
      dwv $$3 = $$2.f();
      dwt $$4 = $$2.b();
      cxh $$5 = $$3.a($$0, $$4, $$1).a($$0.A).orElse(cxh.k);
      if (!$$5.f()) {
         if (this.a($$0, $$3)) {
            a($$0, $$1, $$2, $$3).ifPresent($$4x -> {
               bwe $$5x = bwe.a($$0, $$5);
               $$5x.f($$4x);
               $$0.b($$5x);
               float $$6 = ($$0.C_().i() - $$0.C_().i()) * 0.2F + 1.0F;
               $$0.a(null, ji.a((kb)$$4x), awa.mD, awb.e, 1.0F, $$6);
               $$3.e = $$0.ae() + $$2.d().a();
            });
         }
      }
   }

   private static Optional<fbx> a(ard $$0, ji $$1, dws $$2, dwv $$3) {
      List<cpr> $$4 = $$3.c
         .stream()
         .map($$0::a)
         .filter(Objects::nonNull)
         .filter($$2x -> !$$2x.b() && !$$2x.U_() && $$2x.bJ() && $$2x.g($$1.b()) <= (double)ayz.h($$2.h()))
         .toList();
      if ($$4.isEmpty()) {
         return Optional.empty();
      } else {
         bva $$5 = a($$4, $$3.d, $$2, $$1, $$0);
         return $$5 == null ? Optional.empty() : a($$5, $$0);
      }
   }

   private static Optional<fbx> a(bva $$0, ard $$1) {
      fbx $$2 = $$0.ds();
      fbx $$3 = $$2.a(jn.b, (double)($$0.dq() + 2.0F + (float)$$1.A.a(4)));
      fbt $$4 = $$1.a(new dgi($$2, $$3, dgi.a.c, dgi.b.a, fcc.a()));
      fbx $$5 = $$4.b().b().a(jn.a, 1.0);
      ji $$6 = ji.a((kb)$$5);
      return !$$1.a_($$6).g($$1, $$6).c() ? Optional.empty() : Optional.of($$5);
   }

   @Nullable
   private static bva a(List<cpr> $$0, Set<UUID> $$1, dws $$2, ji $$3, ard $$4) {
      Stream<bva> $$5 = $$1.stream().map($$4::b).filter(Objects::nonNull).filter($$2x -> $$2x.bJ() && $$2x.g($$3.b()) <= (double)ayz.h($$2.h()));
      List<? extends bva> $$6 = $$4.A.h() ? $$5.toList() : $$0;
      if ($$6.isEmpty()) {
         return null;
      } else {
         return $$6.size() == 1 ? $$6.getFirst() : af.a($$6, $$4.A);
      }
   }

   private boolean a(ard $$0, dwv $$1) {
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

   public void a(dgz $$0, ji $$1, boolean $$2) {
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
      dww.b a = ($$0, $$1, $$2, $$3) -> {
      };
      dww.b b = ($$0, $$1, $$2, $$3) -> {
         if ($$1.a(2) == 0) {
            fbx $$4 = $$2.b().a($$1, 0.9F);
            a($$3 ? lt.N : lt.aM, $$4, $$0);
         }
      };
      dww.b c = ($$0, $$1, $$2, $$3) -> {
         fbx $$4 = $$2.b().a($$1, 1.0F);
         a(lt.ah, $$4, $$0);
         a($$3 ? lt.N : lt.F, $$4, $$0);
      };
      dww.b d = ($$0, $$1, $$2, $$3) -> {
         fbx $$4 = $$2.b().a($$1, 0.9F);
         if ($$1.a(3) == 0) {
            a(lt.ah, $$4, $$0);
         }

         if ($$0.ae() % 20L == 0L) {
            fbx $$5 = $$2.b().b(0.0, 0.5, 0.0);
            int $$6 = $$0.C_().a(4) + 20;

            for (int $$7 = 0; $$7 < $$6; $$7++) {
               a(lt.ah, $$5, $$0);
            }
         }
      };

      private static void a(lx $$0, fbx $$1, dgz $$2) {
         $$2.a($$0, $$1.a(), $$1.b(), $$1.c(), 0.0, 0.0, 0.0);
      }

      void emit(dgz var1, azh var2, ji var3, boolean var4);
   }

   static class c {
      private static final double a = -1.0;
      private static final double b = 200.0;
      private static final double c = 1000.0;

      private c() {
      }
   }
}
