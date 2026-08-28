import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public interface bxs {
   String o_ = "leash";
   double h = 10.0;
   double i = 6.0;

   @Nullable
   bxs.a Y_();

   void a(@Nullable bxs.a var1);

   default boolean S_() {
      return this.Y_() != null && this.Y_().b != null;
   }

   default boolean Q_() {
      return this.Y_() != null;
   }

   default boolean p() {
      return this.w() && !this.S_();
   }

   default boolean w() {
      return true;
   }

   default void e_(int $$0) {
      this.a(new bxs.a($$0));
      a((bwt)this, false, false);
   }

   default void c(tz $$0) {
      bxs.a $$1 = $$0.<bxs.a>a("leash", bxs.a.a).orElse(null);
      if (this.Y_() != null && $$1 == null) {
         this.z();
      }

      this.a($$1);
   }

   default void a(tz $$0, @Nullable bxs.a $$1) {
      $$0.b("leash", bxs.a.a, $$1);
   }

   private static <E extends bwt & bxs> void a(E $$0, bxs.a $$1) {
      if ($$1.c != null && $$0.dV() instanceof ars $$2) {
         Optional<UUID> $$3 = $$1.c.left();
         Optional<iv> $$4 = $$1.c.right();
         if ($$3.isPresent()) {
            bwt $$5 = $$2.b($$3.get());
            if ($$5 != null) {
               a($$0, $$5, true);
               return;
            }
         } else if ($$4.isPresent()) {
            a($$0, cnw.b($$2, $$4.get()), true);
            return;
         }

         if ($$0.af > 100) {
            $$0.a($$2, dac.vV);
            $$0.a(null);
         }
      }
   }

   default void y() {
      a((bwt)this, true, true);
   }

   default void z() {
      a((bwt)this, true, false);
   }

   default void A() {
   }

   private static <E extends bwt & bxs> void a(E $$0, boolean $$1, boolean $$2) {
      bxs.a $$3 = $$0.Y_();
      if ($$3 != null && $$3.b != null) {
         $$0.a(null);
         $$0.A();
         if ($$0.dV() instanceof ars $$4) {
            if ($$2) {
               $$0.a($$4, dac.vV);
            }

            if ($$1) {
               $$4.m().b($$0, new afg($$0, null));
            }
         }
      }
   }

   static <E extends bwt & bxs> void a_(ars $$0, E $$1) {
      bxs.a $$2 = $$1.Y_();
      if ($$2 != null && $$2.c != null) {
         a($$1, $$2);
      }

      if ($$2 != null && $$2.b != null) {
         if (!$$1.bJ() || !$$2.b.bJ()) {
            if ($$0.O().c(djt.j)) {
               $$1.y();
            } else {
               $$1.z();
            }
         }

         bwt $$3 = $$1.C();
         if ($$3 != null && $$3.dV() == $$1.dV()) {
            float $$4 = $$1.f($$3);
            if (!$$1.a($$3, $$4)) {
               return;
            }

            if ((double)$$4 > 10.0) {
               $$1.B();
            } else if ((double)$$4 > 6.0) {
               $$1.b($$3, $$4);
               $$1.cy();
            } else {
               $$1.a($$3);
            }
         }
      }
   }

   default boolean a(bwt $$0, float $$1) {
      return true;
   }

   default void B() {
      this.y();
   }

   default void a(bwt $$0) {
   }

   default void b(bwt $$0, float $$1) {
      a((bwt)this, $$0, $$1);
   }

   private static <E extends bwt & bxs> void a(E $$0, bwt $$1, float $$2) {
      double $$3 = ($$1.dA() - $$0.dA()) / (double)$$2;
      double $$4 = ($$1.dC() - $$0.dC()) / (double)$$2;
      double $$5 = ($$1.dG() - $$0.dG()) / (double)$$2;
      $$0.i($$0.dy().b(Math.copySign($$3 * $$3 * 0.4, $$3), Math.copySign($$4 * $$4 * 0.4, $$4), Math.copySign($$5 * $$5 * 0.4, $$5)));
   }

   default void a_(bwt $$0, boolean $$1) {
      a((bwt)this, $$0, $$1);
   }

   private static <E extends bwt & bxs> void a(E $$0, bwt $$1, boolean $$2) {
      bxs.a $$3 = $$0.Y_();
      if ($$3 == null) {
         $$3 = new bxs.a($$1);
         $$0.a($$3);
      } else {
         $$3.a($$1);
      }

      if ($$2 && $$0.dV() instanceof ars $$4) {
         $$4.m().b($$0, new afg($$0, $$1));
      }

      if ($$0.bY()) {
         $$0.bO();
      }
   }

   @Nullable
   default bwt C() {
      return b((bwt)this);
   }

   @Nullable
   private static <E extends bwt & bxs> bwt b(E $$0) {
      bxs.a $$1 = $$0.Y_();
      if ($$1 == null) {
         return null;
      } else {
         if ($$1.d != 0 && $$0.dV().C) {
            bwt var3 = $$0.dV().a($$1.d);
            if (var3 instanceof bwt) {
               $$1.a(var3);
            }
         }

         return $$1.b;
      }
   }

   public static final class a {
      public static final Codec<bxs.a> a = Codec.xor(jz.a.fieldOf("UUID").codec(), iv.a).xmap(bxs.a::new, $$0 -> {
         if ($$0.b instanceof cnw $$2) {
            return Either.right($$2.j());
         } else {
            return $$0.b != null ? Either.left($$0.b.cG()) : Objects.requireNonNull($$0.c, "Invalid LeashData had no attachment");
         }
      });
      int d;
      @Nullable
      public bwt b;
      @Nullable
      public Either<UUID, iv> c;

      private a(Either<UUID, iv> $$0) {
         this.c = $$0;
      }

      a(bwt $$0) {
         this.b = $$0;
      }

      a(int $$0) {
         this.d = $$0;
      }

      public void a(bwt $$0) {
         this.b = $$0;
         this.c = null;
         this.d = 0;
      }
   }
}
