import com.mojang.datafixers.util.Either;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public interface bvz {
   String o_ = "leash";
   double p_ = 10.0;
   double q_ = 6.0;

   @Nullable
   bvz.a T_();

   void a(@Nullable bvz.a var1);

   default boolean P_() {
      return this.T_() != null && this.T_().a != null;
   }

   default boolean q() {
      return this.T_() != null;
   }

   default boolean Q_() {
      return this.y() && !this.P_();
   }

   default boolean y() {
      return true;
   }

   default void e_(int $$0) {
      this.a(new bvz.a($$0));
      a((bvf)this, false, false);
   }

   @Nullable
   default bvz.a c(ux $$0) {
      if ($$0.b("leash", 10)) {
         return new bvz.a(Either.left($$0.p("leash").a("UUID")));
      } else {
         if ($$0.b("leash", 11)) {
            Either<UUID, jh> $$1 = vm.a($$0, "leash").<Either<UUID, jh>>map(Either::right).orElse(null);
            if ($$1 != null) {
               return new bvz.a($$1);
            }
         }

         return null;
      }
   }

   default void a(ux $$0, @Nullable bvz.a $$1) {
      if ($$1 != null) {
         Either<UUID, jh> $$2 = $$1.b;
         if ($$1.a instanceof clq $$3) {
            $$2 = Either.right($$3.p());
         } else if ($$1.a != null) {
            $$2 = Either.left($$1.a.cG());
         }

         if ($$2 != null) {
            $$0.a("leash", (vu)$$2.map($$0x -> {
               ux $$1x = new ux();
               $$1x.a("UUID", $$0x);
               return $$1x;
            }, vm::a));
         }
      }
   }

   private static <E extends bvf & bvz> void a(E $$0, bvz.a $$1) {
      if ($$1.b != null && $$0.dV() instanceof ash $$2) {
         Optional<UUID> $$3 = $$1.b.left();
         Optional<jh> $$4 = $$1.b.right();
         if ($$3.isPresent()) {
            bvf $$5 = $$2.a($$3.get());
            if ($$5 != null) {
               a($$0, $$5, true);
               return;
            }
         } else if ($$4.isPresent()) {
            a($$0, clq.a($$2, $$4.get()), true);
            return;
         }

         if ($$0.af > 100) {
            $$0.a($$2, cxo.vA);
            $$0.a(null);
         }
      }
   }

   default void a(boolean $$0, boolean $$1) {
      a((bvf)this, $$0, $$1);
   }

   private static <E extends bvf & bvz> void a(E $$0, boolean $$1, boolean $$2) {
      bvz.a $$3 = $$0.T_();
      if ($$3 != null && $$3.a != null) {
         $$0.a(null);
         if ($$0.dV() instanceof ash $$4) {
            if ($$2) {
               $$0.a($$4, cxo.vA);
            }

            if ($$1) {
               $$4.m().b($$0, new agc($$0, null));
            }
         }
      }
   }

   static <E extends bvf & bvz> void a_(ash $$0, E $$1) {
      bvz.a $$2 = $$1.T_();
      if ($$2 != null && $$2.b != null) {
         a($$1, $$2);
      }

      if ($$2 != null && $$2.a != null) {
         if (!$$1.bL() || !$$2.a.bL()) {
            a($$1, true, $$0.N().b(dgw.i));
         }

         bvf $$3 = $$1.A();
         if ($$3 != null && $$3.dV() == $$1.dV()) {
            float $$4 = $$1.f($$3);
            if (!$$1.a($$3, $$4)) {
               return;
            }

            if ((double)$$4 > 10.0) {
               $$1.z();
            } else if ((double)$$4 > 6.0) {
               $$1.b($$3, $$4);
               $$1.cy();
            } else {
               $$1.a($$3);
            }
         }
      }
   }

   default boolean a(bvf $$0, float $$1) {
      return true;
   }

   default void z() {
      this.a(true, true);
   }

   default void a(bvf $$0) {
   }

   default void b(bvf $$0, float $$1) {
      a((bvf)this, $$0, $$1);
   }

   private static <E extends bvf & bvz> void a(E $$0, bvf $$1, float $$2) {
      double $$3 = ($$1.dA() - $$0.dA()) / (double)$$2;
      double $$4 = ($$1.dC() - $$0.dC()) / (double)$$2;
      double $$5 = ($$1.dG() - $$0.dG()) / (double)$$2;
      $$0.h($$0.dy().b(Math.copySign($$3 * $$3 * 0.4, $$3), Math.copySign($$4 * $$4 * 0.4, $$4), Math.copySign($$5 * $$5 * 0.4, $$5)));
   }

   default void b(bvf $$0, boolean $$1) {
      a((bvf)this, $$0, $$1);
   }

   private static <E extends bvf & bvz> void a(E $$0, bvf $$1, boolean $$2) {
      bvz.a $$3 = $$0.T_();
      if ($$3 == null) {
         $$3 = new bvz.a($$1);
         $$0.a($$3);
      } else {
         $$3.a($$1);
      }

      if ($$2 && $$0.dV() instanceof ash $$4) {
         $$4.m().b($$0, new agc($$0, $$1));
      }

      if ($$0.bZ()) {
         $$0.ae();
      }
   }

   @Nullable
   default bvf A() {
      return b((bvf)this);
   }

   @Nullable
   private static <E extends bvf & bvz> bvf b(E $$0) {
      bvz.a $$1 = $$0.T_();
      if ($$1 == null) {
         return null;
      } else {
         if ($$1.c != 0 && $$0.dV().C) {
            bvf var3 = $$0.dV().a($$1.c);
            if (var3 instanceof bvf) {
               $$1.a(var3);
            }
         }

         return $$1.a;
      }
   }

   public static final class a {
      int c;
      @Nullable
      public bvf a;
      @Nullable
      public Either<UUID, jh> b;

      a(Either<UUID, jh> $$0) {
         this.b = $$0;
      }

      a(bvf $$0) {
         this.a = $$0;
      }

      a(int $$0) {
         this.c = $$0;
      }

      public void a(bvf $$0) {
         this.a = $$0;
         this.b = null;
         this.c = 0;
      }
   }
}
