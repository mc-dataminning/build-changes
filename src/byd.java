import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public interface byd {
   String o_ = "leash";
   double h = 10.0;
   double i = 6.0;

   @Nullable
   byd.a Z_();

   void a(@Nullable byd.a var1);

   default boolean T_() {
      return this.Z_() != null && this.Z_().b != null;
   }

   default boolean R_() {
      return this.Z_() != null;
   }

   default boolean p() {
      return this.w() && !this.T_();
   }

   default boolean w() {
      return true;
   }

   default void e_(int $$0) {
      this.a(new byd.a($$0));
      a((bxe)this, false, false);
   }

   default void c(ua $$0) {
      byd.a $$1 = $$0.<byd.a>a("leash", byd.a.a).orElse(null);
      if (this.Z_() != null && $$1 == null) {
         this.z();
      }

      this.a($$1);
   }

   default void a(ua $$0, @Nullable byd.a $$1) {
      $$0.b("leash", byd.a.a, $$1);
   }

   private static <E extends bxe & byd> void a(E $$0, byd.a $$1) {
      if ($$1.c != null && $$0.dV() instanceof asb $$2) {
         Optional<UUID> $$3 = $$1.c.left();
         Optional<iw> $$4 = $$1.c.right();
         if ($$3.isPresent()) {
            bxe $$5 = $$2.b($$3.get());
            if ($$5 != null) {
               a($$0, $$5, true);
               return;
            }
         } else if ($$4.isPresent()) {
            a($$0, coh.b($$2, $$4.get()), true);
            return;
         }

         if ($$0.af > 100) {
            $$0.a($$2, dao.vV);
            $$0.a(null);
         }
      }
   }

   default void y() {
      a((bxe)this, true, true);
   }

   default void z() {
      a((bxe)this, true, false);
   }

   default void A() {
   }

   private static <E extends bxe & byd> void a(E $$0, boolean $$1, boolean $$2) {
      byd.a $$3 = $$0.Z_();
      if ($$3 != null && $$3.b != null) {
         $$0.a(null);
         $$0.A();
         if ($$0.dV() instanceof asb $$4) {
            if ($$2) {
               $$0.a($$4, dao.vV);
            }

            if ($$1) {
               $$4.m().b($$0, new afp($$0, null));
            }
         }
      }
   }

   static <E extends bxe & byd> void a_(asb $$0, E $$1) {
      byd.a $$2 = $$1.Z_();
      if ($$2 != null && $$2.c != null) {
         a($$1, $$2);
      }

      if ($$2 != null && $$2.b != null) {
         if (!$$1.bJ() || !$$2.b.bJ()) {
            if ($$0.O().c(dkf.j)) {
               $$1.y();
            } else {
               $$1.z();
            }
         }

         bxe $$3 = $$1.C();
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

   default boolean a(bxe $$0, float $$1) {
      return true;
   }

   default void B() {
      this.y();
   }

   default void a(bxe $$0) {
   }

   default void b(bxe $$0, float $$1) {
      a((bxe)this, $$0, $$1);
   }

   private static <E extends bxe & byd> void a(E $$0, bxe $$1, float $$2) {
      double $$3 = ($$1.dA() - $$0.dA()) / (double)$$2;
      double $$4 = ($$1.dC() - $$0.dC()) / (double)$$2;
      double $$5 = ($$1.dG() - $$0.dG()) / (double)$$2;
      $$0.i($$0.dy().b(Math.copySign($$3 * $$3 * 0.4, $$3), Math.copySign($$4 * $$4 * 0.4, $$4), Math.copySign($$5 * $$5 * 0.4, $$5)));
   }

   default void a_(bxe $$0, boolean $$1) {
      a((bxe)this, $$0, $$1);
   }

   private static <E extends bxe & byd> void a(E $$0, bxe $$1, boolean $$2) {
      byd.a $$3 = $$0.Z_();
      if ($$3 == null) {
         $$3 = new byd.a($$1);
         $$0.a($$3);
      } else {
         $$3.a($$1);
      }

      if ($$2 && $$0.dV() instanceof asb $$4) {
         $$4.m().b($$0, new afp($$0, $$1));
      }

      if ($$0.bY()) {
         $$0.bO();
      }
   }

   @Nullable
   default bxe C() {
      return b((bxe)this);
   }

   @Nullable
   private static <E extends bxe & byd> bxe b(E $$0) {
      byd.a $$1 = $$0.Z_();
      if ($$1 == null) {
         return null;
      } else {
         if ($$1.d != 0 && $$0.dV().C) {
            bxe var3 = $$0.dV().a($$1.d);
            if (var3 instanceof bxe) {
               $$1.a(var3);
            }
         }

         return $$1.b;
      }
   }

   public static final class a {
      public static final Codec<byd.a> a = Codec.xor(ka.a.fieldOf("UUID").codec(), iw.a).xmap(byd.a::new, $$0 -> {
         if ($$0.b instanceof coh $$2) {
            return Either.right($$2.j());
         } else {
            return $$0.b != null ? Either.left($$0.b.cG()) : Objects.requireNonNull($$0.c, "Invalid LeashData had no attachment");
         }
      });
      int d;
      @Nullable
      public bxe b;
      @Nullable
      public Either<UUID, iw> c;

      private a(Either<UUID, iw> $$0) {
         this.c = $$0;
      }

      a(bxe $$0) {
         this.b = $$0;
      }

      a(int $$0) {
         this.d = $$0;
      }

      public void a(bxe $$0) {
         this.b = $$0;
         this.c = null;
         this.d = 0;
      }
   }
}
