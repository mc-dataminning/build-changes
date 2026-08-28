import com.mojang.datafixers.util.Either;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public interface buy {
   String b_ = "leash";
   double r_ = 10.0;
   double s_ = 6.0;

   @Nullable
   buy.a Y_();

   void a(@Nullable buy.a var1);

   default boolean M_() {
      return this.Y_() != null && this.Y_().a != null;
   }

   default boolean N_() {
      return this.Y_() != null;
   }

   default boolean O_() {
      return this.A() && !this.M_();
   }

   default boolean A() {
      return true;
   }

   default void h_(int $$0) {
      this.a(new buy.a($$0));
      a((bue)this, false, false);
   }

   @Nullable
   default buy.a c(uk $$0) {
      if ($$0.b("leash", 10)) {
         return new buy.a(Either.left($$0.p("leash").a("UUID")));
      } else {
         if ($$0.b("leash", 11)) {
            Either<UUID, jh> $$1 = uz.a($$0, "leash").<Either<UUID, jh>>map(Either::right).orElse(null);
            if ($$1 != null) {
               return new buy.a($$1);
            }
         }

         return null;
      }
   }

   default void a(uk $$0, @Nullable buy.a $$1) {
      if ($$1 != null) {
         Either<UUID, jh> $$2 = $$1.b;
         if ($$1.a instanceof ckp $$3) {
            $$2 = Either.right($$3.q());
         } else if ($$1.a != null) {
            $$2 = Either.left($$1.a.cH());
         }

         if ($$2 != null) {
            $$0.a("leash", (vh)$$2.map($$0x -> {
               uk $$1x = new uk();
               $$1x.a("UUID", $$0x);
               return $$1x;
            }, uz::a));
         }
      }
   }

   private static <E extends bue & buy> void a(E $$0, buy.a $$1) {
      if ($$1.b != null && $$0.dX() instanceof arn $$2) {
         Optional<UUID> $$3 = $$1.b.left();
         Optional<jh> $$4 = $$1.b.right();
         if ($$3.isPresent()) {
            bue $$5 = $$2.a($$3.get());
            if ($$5 != null) {
               a($$0, $$5, true);
               return;
            }
         } else if ($$4.isPresent()) {
            a($$0, ckp.b($$2, $$4.get()), true);
            return;
         }

         if ($$0.ag > 100) {
            $$0.a((dfa)cwf.uM);
            $$0.a(null);
         }
      }
   }

   default void a(boolean $$0, boolean $$1) {
      a((bue)this, $$0, $$1);
   }

   private static <E extends bue & buy> void a(E $$0, boolean $$1, boolean $$2) {
      buy.a $$3 = $$0.Y_();
      if ($$3 != null && $$3.a != null) {
         $$0.a(null);
         if (!$$0.dX().C && $$2) {
            $$0.a((dfa)cwf.uM);
         }

         if ($$1 && $$0.dX() instanceof arn $$4) {
            $$4.l().b($$0, new afl($$0, null));
         }
      }
   }

   static <E extends bue & buy> void b_(E $$0) {
      buy.a $$1 = $$0.Y_();
      if ($$1 != null && $$1.b != null) {
         a($$0, $$1);
      }

      if ($$1 != null && $$1.a != null) {
         if (!$$0.bM() || !$$1.a.bM()) {
            a($$0, true, $$0.dX().ac().b(dex.i));
         }

         bue $$2 = $$0.C();
         if ($$2 != null && $$2.dX() == $$0.dX()) {
            float $$3 = $$0.f($$2);
            if (!$$0.a($$2, $$3)) {
               return;
            }

            if ((double)$$3 > 10.0) {
               $$0.B();
            } else if ((double)$$3 > 6.0) {
               $$0.b($$2, $$3);
               $$0.cz();
            } else {
               $$0.b($$2);
            }
         }
      }
   }

   default boolean a(bue $$0, float $$1) {
      return true;
   }

   default void B() {
      this.a(true, true);
   }

   default void b(bue $$0) {
   }

   default void b(bue $$0, float $$1) {
      a((bue)this, $$0, $$1);
   }

   private static <E extends bue & buy> void a(E $$0, bue $$1, float $$2) {
      double $$3 = ($$1.dC() - $$0.dC()) / (double)$$2;
      double $$4 = ($$1.dE() - $$0.dE()) / (double)$$2;
      double $$5 = ($$1.dI() - $$0.dI()) / (double)$$2;
      $$0.h($$0.dA().b(Math.copySign($$3 * $$3 * 0.4, $$3), Math.copySign($$4 * $$4 * 0.4, $$4), Math.copySign($$5 * $$5 * 0.4, $$5)));
   }

   default void b(bue $$0, boolean $$1) {
      a((bue)this, $$0, $$1);
   }

   private static <E extends bue & buy> void a(E $$0, bue $$1, boolean $$2) {
      buy.a $$3 = $$0.Y_();
      if ($$3 == null) {
         $$3 = new buy.a($$1);
         $$0.a($$3);
      } else {
         $$3.a($$1);
      }

      if ($$2 && $$0.dX() instanceof arn $$4) {
         $$4.l().b($$0, new afl($$0, $$1));
      }

      if ($$0.ca()) {
         $$0.af();
      }
   }

   @Nullable
   default bue C() {
      return c((bue)this);
   }

   @Nullable
   private static <E extends bue & buy> bue c(E $$0) {
      buy.a $$1 = $$0.Y_();
      if ($$1 == null) {
         return null;
      } else {
         if ($$1.c != 0 && $$0.dX().C) {
            bue var3 = $$0.dX().a($$1.c);
            if (var3 instanceof bue) {
               $$1.a(var3);
            }
         }

         return $$1.a;
      }
   }

   public static final class a {
      int c;
      @Nullable
      public bue a;
      @Nullable
      public Either<UUID, jh> b;

      a(Either<UUID, jh> $$0) {
         this.b = $$0;
      }

      a(bue $$0) {
         this.a = $$0;
      }

      a(int $$0) {
         this.c = $$0;
      }

      public void a(bue $$0) {
         this.a = $$0;
         this.b = null;
         this.c = 0;
      }
   }
}
