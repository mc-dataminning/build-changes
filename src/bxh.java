import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public interface bxh {
   String o_ = "leash";
   double p_ = 10.0;
   double q_ = 6.0;

   @Nullable
   bxh.a U_();

   void a(@Nullable bxh.a var1);

   default boolean O_() {
      return this.U_() != null && this.U_().b != null;
   }

   default boolean M_() {
      return this.U_() != null;
   }

   default boolean p() {
      return this.w() && !this.O_();
   }

   default boolean w() {
      return true;
   }

   default void e_(int $$0) {
      this.a(new bxh.a($$0));
      a((bwi)this, false, false);
   }

   default void c(tz $$0) {
      bxh.a $$1 = $$0.<bxh.a>a("leash", bxh.a.a).orElse(null);
      if (this.U_() != null && $$1 == null) {
         this.z();
      }

      this.a($$1);
   }

   default void a(tz $$0, @Nullable bxh.a $$1) {
      $$0.b("leash", bxh.a.a, $$1);
   }

   private static <E extends bwi & bxh> void a(E $$0, bxh.a $$1) {
      if ($$1.c != null && $$0.dU() instanceof arq $$2) {
         Optional<UUID> $$3 = $$1.c.left();
         Optional<iv> $$4 = $$1.c.right();
         if ($$3.isPresent()) {
            bwi $$5 = $$2.b($$3.get());
            if ($$5 != null) {
               a($$0, $$5, true);
               return;
            }
         } else if ($$4.isPresent()) {
            a($$0, cni.b($$2, $$4.get()), true);
            return;
         }

         if ($$0.af > 100) {
            $$0.a($$2, czo.vV);
            $$0.a(null);
         }
      }
   }

   default void y() {
      a((bwi)this, true, true);
   }

   default void z() {
      a((bwi)this, true, false);
   }

   default void A() {
   }

   private static <E extends bwi & bxh> void a(E $$0, boolean $$1, boolean $$2) {
      bxh.a $$3 = $$0.U_();
      if ($$3 != null && $$3.b != null) {
         $$0.a(null);
         $$0.A();
         if ($$0.dU() instanceof arq $$4) {
            if ($$2) {
               $$0.a($$4, czo.vV);
            }

            if ($$1) {
               $$4.m().b($$0, new afe($$0, null));
            }
         }
      }
   }

   static <E extends bwi & bxh> void a_(arq $$0, E $$1) {
      bxh.a $$2 = $$1.U_();
      if ($$2 != null && $$2.c != null) {
         a($$1, $$2);
      }

      if ($$2 != null && $$2.b != null) {
         if (!$$1.bI() || !$$2.b.bI()) {
            if ($$0.O().c(djd.j)) {
               $$1.y();
            } else {
               $$1.z();
            }
         }

         bwi $$3 = $$1.C();
         if ($$3 != null && $$3.dU() == $$1.dU()) {
            float $$4 = $$1.f($$3);
            if (!$$1.a($$3, $$4)) {
               return;
            }

            if ((double)$$4 > 10.0) {
               $$1.B();
            } else if ((double)$$4 > 6.0) {
               $$1.b($$3, $$4);
               $$1.cx();
            } else {
               $$1.a($$3);
            }
         }
      }
   }

   default boolean a(bwi $$0, float $$1) {
      return true;
   }

   default void B() {
      this.y();
   }

   default void a(bwi $$0) {
   }

   default void b(bwi $$0, float $$1) {
      a((bwi)this, $$0, $$1);
   }

   private static <E extends bwi & bxh> void a(E $$0, bwi $$1, float $$2) {
      double $$3 = ($$1.dz() - $$0.dz()) / (double)$$2;
      double $$4 = ($$1.dB() - $$0.dB()) / (double)$$2;
      double $$5 = ($$1.dF() - $$0.dF()) / (double)$$2;
      $$0.i($$0.dx().b(Math.copySign($$3 * $$3 * 0.4, $$3), Math.copySign($$4 * $$4 * 0.4, $$4), Math.copySign($$5 * $$5 * 0.4, $$5)));
   }

   default void a_(bwi $$0, boolean $$1) {
      a((bwi)this, $$0, $$1);
   }

   private static <E extends bwi & bxh> void a(E $$0, bwi $$1, boolean $$2) {
      bxh.a $$3 = $$0.U_();
      if ($$3 == null) {
         $$3 = new bxh.a($$1);
         $$0.a($$3);
      } else {
         $$3.a($$1);
      }

      if ($$2 && $$0.dU() instanceof arq $$4) {
         $$4.m().b($$0, new afe($$0, $$1));
      }

      if ($$0.bX()) {
         $$0.bN();
      }
   }

   @Nullable
   default bwi C() {
      return b((bwi)this);
   }

   @Nullable
   private static <E extends bwi & bxh> bwi b(E $$0) {
      bxh.a $$1 = $$0.U_();
      if ($$1 == null) {
         return null;
      } else {
         if ($$1.d != 0 && $$0.dU().C) {
            bwi var3 = $$0.dU().a($$1.d);
            if (var3 instanceof bwi) {
               $$1.a(var3);
            }
         }

         return $$1.b;
      }
   }

   public static final class a {
      public static final Codec<bxh.a> a = Codec.xor(jz.a.fieldOf("UUID").codec(), iv.a).xmap(bxh.a::new, $$0 -> {
         if ($$0.b instanceof cni $$2) {
            return Either.right($$2.j());
         } else {
            return $$0.b != null ? Either.left($$0.b.cF()) : Objects.requireNonNull($$0.c, "Invalid LeashData had no attachment");
         }
      });
      int d;
      @Nullable
      public bwi b;
      @Nullable
      public Either<UUID, iv> c;

      private a(Either<UUID, iv> $$0) {
         this.c = $$0;
      }

      a(bwi $$0) {
         this.b = $$0;
      }

      a(int $$0) {
         this.d = $$0;
      }

      public void a(bwi $$0) {
         this.b = $$0;
         this.c = null;
         this.d = 0;
      }
   }
}
