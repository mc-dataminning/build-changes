import com.mojang.datafixers.util.Either;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public interface bvg {
   String o_ = "leash";
   double p_ = 10.0;
   double q_ = 6.0;

   @Nullable
   bvg.a T_();

   void a(@Nullable bvg.a var1);

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
      this.a(new bvg.a($$0));
      a((bum)this, false, false);
   }

   default void c(tq $$0) {
      bvg.a $$1 = a($$0);
      if (this.T_() != null && $$1 == null) {
         this.A();
      }

      this.a($$1);
   }

   @Nullable
   private static bvg.a a(tq $$0) {
      if ($$0.b("leash", 10)) {
         return new bvg.a(Either.left($$0.p("leash").a("UUID")));
      } else {
         if ($$0.b("leash", 11)) {
            Either<UUID, ji> $$1 = uf.a($$0, "leash").<Either<UUID, ji>>map(Either::right).orElse(null);
            if ($$1 != null) {
               return new bvg.a($$1);
            }
         }

         return null;
      }
   }

   default void a(tq $$0, @Nullable bvg.a $$1) {
      if ($$1 != null) {
         Either<UUID, ji> $$2 = $$1.b;
         if ($$1.a instanceof ckx $$3) {
            $$2 = Either.right($$3.p());
         } else if ($$1.a != null) {
            $$2 = Either.left($$1.a.cG());
         }

         if ($$2 != null) {
            $$0.a("leash", (un)$$2.map($$0x -> {
               tq $$1x = new tq();
               $$1x.a("UUID", $$0x);
               return $$1x;
            }, uf::a));
         }
      }
   }

   private static <E extends bum & bvg> void a(E $$0, bvg.a $$1) {
      if ($$1.b != null && $$0.dV() instanceof ard $$2) {
         Optional<UUID> $$3 = $$1.b.left();
         Optional<ji> $$4 = $$1.b.right();
         if ($$3.isPresent()) {
            bum $$5 = $$2.a($$3.get());
            if ($$5 != null) {
               a($$0, $$5, true);
               return;
            }
         } else if ($$4.isPresent()) {
            a($$0, ckx.a($$2, $$4.get()), true);
            return;
         }

         if ($$0.af > 100) {
            $$0.a($$2, cwu.vK);
            $$0.a(null);
         }
      }
   }

   default void z() {
      a((bum)this, true, true);
   }

   default void A() {
      a((bum)this, true, false);
   }

   default void B() {
   }

   private static <E extends bum & bvg> void a(E $$0, boolean $$1, boolean $$2) {
      bvg.a $$3 = $$0.T_();
      if ($$3 != null && $$3.a != null) {
         $$0.a(null);
         $$0.B();
         if ($$0.dV() instanceof ard $$4) {
            if ($$2) {
               $$0.a($$4, cwu.vK);
            }

            if ($$1) {
               $$4.m().b($$0, new aew($$0, null));
            }
         }
      }
   }

   static <E extends bum & bvg> void a_(ard $$0, E $$1) {
      bvg.a $$2 = $$1.T_();
      if ($$2 != null && $$2.b != null) {
         a($$1, $$2);
      }

      if ($$2 != null && $$2.a != null) {
         if (!$$1.bL() || !$$2.a.bL()) {
            if ($$0.O().b(dgf.i)) {
               $$1.z();
            } else {
               $$1.A();
            }
         }

         bum $$3 = $$1.D();
         if ($$3 != null && $$3.dV() == $$1.dV()) {
            float $$4 = $$1.f($$3);
            if (!$$1.a($$3, $$4)) {
               return;
            }

            if ((double)$$4 > 10.0) {
               $$1.C();
            } else if ((double)$$4 > 6.0) {
               $$1.b($$3, $$4);
               $$1.cy();
            } else {
               $$1.a($$3);
            }
         }
      }
   }

   default boolean a(bum $$0, float $$1) {
      return true;
   }

   default void C() {
      this.z();
   }

   default void a(bum $$0) {
   }

   default void b(bum $$0, float $$1) {
      a((bum)this, $$0, $$1);
   }

   private static <E extends bum & bvg> void a(E $$0, bum $$1, float $$2) {
      double $$3 = ($$1.dA() - $$0.dA()) / (double)$$2;
      double $$4 = ($$1.dC() - $$0.dC()) / (double)$$2;
      double $$5 = ($$1.dG() - $$0.dG()) / (double)$$2;
      $$0.i($$0.dy().b(Math.copySign($$3 * $$3 * 0.4, $$3), Math.copySign($$4 * $$4 * 0.4, $$4), Math.copySign($$5 * $$5 * 0.4, $$5)));
   }

   default void b(bum $$0, boolean $$1) {
      a((bum)this, $$0, $$1);
   }

   private static <E extends bum & bvg> void a(E $$0, bum $$1, boolean $$2) {
      bvg.a $$3 = $$0.T_();
      if ($$3 == null) {
         $$3 = new bvg.a($$1);
         $$0.a($$3);
      } else {
         $$3.a($$1);
      }

      if ($$2 && $$0.dV() instanceof ard $$4) {
         $$4.m().b($$0, new aew($$0, $$1));
      }

      if ($$0.bZ()) {
         $$0.ae();
      }
   }

   @Nullable
   default bum D() {
      return b((bum)this);
   }

   @Nullable
   private static <E extends bum & bvg> bum b(E $$0) {
      bvg.a $$1 = $$0.T_();
      if ($$1 == null) {
         return null;
      } else {
         if ($$1.c != 0 && $$0.dV().C) {
            bum var3 = $$0.dV().a($$1.c);
            if (var3 instanceof bum) {
               $$1.a(var3);
            }
         }

         return $$1.a;
      }
   }

   public static final class a {
      int c;
      @Nullable
      public bum a;
      @Nullable
      public Either<UUID, ji> b;

      a(Either<UUID, ji> $$0) {
         this.b = $$0;
      }

      a(bum $$0) {
         this.a = $$0;
      }

      a(int $$0) {
         this.c = $$0;
      }

      public void a(bum $$0) {
         this.a = $$0;
         this.b = null;
         this.c = 0;
      }
   }
}
