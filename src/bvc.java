import com.mojang.datafixers.util.Either;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public interface bvc {
   String b_ = "leash";
   double r_ = 10.0;
   double s_ = 6.0;

   @Nullable
   bvc.a Y_();

   void a(@Nullable bvc.a var1);

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
      this.a(new bvc.a($$0));
      a((bui)this, false, false);
   }

   @Nullable
   default bvc.a c(un $$0) {
      if ($$0.b("leash", 10)) {
         return new bvc.a(Either.left($$0.p("leash").a("UUID")));
      } else {
         if ($$0.b("leash", 11)) {
            Either<UUID, jh> $$1 = vc.a($$0, "leash").<Either<UUID, jh>>map(Either::right).orElse(null);
            if ($$1 != null) {
               return new bvc.a($$1);
            }
         }

         return null;
      }
   }

   default void a(un $$0, @Nullable bvc.a $$1) {
      if ($$1 != null) {
         Either<UUID, jh> $$2 = $$1.b;
         if ($$1.a instanceof ckt $$3) {
            $$2 = Either.right($$3.q());
         } else if ($$1.a != null) {
            $$2 = Either.left($$1.a.cI());
         }

         if ($$2 != null) {
            $$0.a("leash", (vk)$$2.map($$0x -> {
               un $$1x = new un();
               $$1x.a("UUID", $$0x);
               return $$1x;
            }, vc::a));
         }
      }
   }

   private static <E extends bui & bvc> void a(E $$0, bvc.a $$1) {
      if ($$1.b != null && $$0.dY() instanceof arq $$2) {
         Optional<UUID> $$3 = $$1.b.left();
         Optional<jh> $$4 = $$1.b.right();
         if ($$3.isPresent()) {
            bui $$5 = $$2.a($$3.get());
            if ($$5 != null) {
               a($$0, $$5, true);
               return;
            }
         } else if ($$4.isPresent()) {
            a($$0, ckt.b($$2, $$4.get()), true);
            return;
         }

         if ($$0.ag > 100) {
            $$0.a((dfe)cwj.vc);
            $$0.a(null);
         }
      }
   }

   default void a(boolean $$0, boolean $$1) {
      a((bui)this, $$0, $$1);
   }

   private static <E extends bui & bvc> void a(E $$0, boolean $$1, boolean $$2) {
      bvc.a $$3 = $$0.Y_();
      if ($$3 != null && $$3.a != null) {
         $$0.a(null);
         if (!$$0.dY().C && $$2) {
            $$0.a((dfe)cwj.vc);
         }

         if ($$1 && $$0.dY() instanceof arq $$4) {
            $$4.l().b($$0, new afo($$0, null));
         }
      }
   }

   static <E extends bui & bvc> void b_(E $$0) {
      bvc.a $$1 = $$0.Y_();
      if ($$1 != null && $$1.b != null) {
         a($$0, $$1);
      }

      if ($$1 != null && $$1.a != null) {
         if (!$$0.bN() || !$$1.a.bN()) {
            a($$0, true, $$0.dY().ac().b(dfb.i));
         }

         bui $$2 = $$0.C();
         if ($$2 != null && $$2.dY() == $$0.dY()) {
            float $$3 = $$0.f($$2);
            if (!$$0.a($$2, $$3)) {
               return;
            }

            if ((double)$$3 > 10.0) {
               $$0.B();
            } else if ((double)$$3 > 6.0) {
               $$0.b($$2, $$3);
               $$0.cA();
            } else {
               $$0.b($$2);
            }
         }
      }
   }

   default boolean a(bui $$0, float $$1) {
      return true;
   }

   default void B() {
      this.a(true, true);
   }

   default void b(bui $$0) {
   }

   default void b(bui $$0, float $$1) {
      a((bui)this, $$0, $$1);
   }

   private static <E extends bui & bvc> void a(E $$0, bui $$1, float $$2) {
      double $$3 = ($$1.dD() - $$0.dD()) / (double)$$2;
      double $$4 = ($$1.dF() - $$0.dF()) / (double)$$2;
      double $$5 = ($$1.dJ() - $$0.dJ()) / (double)$$2;
      $$0.h($$0.dB().b(Math.copySign($$3 * $$3 * 0.4, $$3), Math.copySign($$4 * $$4 * 0.4, $$4), Math.copySign($$5 * $$5 * 0.4, $$5)));
   }

   default void b(bui $$0, boolean $$1) {
      a((bui)this, $$0, $$1);
   }

   private static <E extends bui & bvc> void a(E $$0, bui $$1, boolean $$2) {
      bvc.a $$3 = $$0.Y_();
      if ($$3 == null) {
         $$3 = new bvc.a($$1);
         $$0.a($$3);
      } else {
         $$3.a($$1);
      }

      if ($$2 && $$0.dY() instanceof arq $$4) {
         $$4.l().b($$0, new afo($$0, $$1));
      }

      if ($$0.cb()) {
         $$0.af();
      }
   }

   @Nullable
   default bui C() {
      return c((bui)this);
   }

   @Nullable
   private static <E extends bui & bvc> bui c(E $$0) {
      bvc.a $$1 = $$0.Y_();
      if ($$1 == null) {
         return null;
      } else {
         if ($$1.c != 0 && $$0.dY().C) {
            bui var3 = $$0.dY().a($$1.c);
            if (var3 instanceof bui) {
               $$1.a(var3);
            }
         }

         return $$1.a;
      }
   }

   public static final class a {
      int c;
      @Nullable
      public bui a;
      @Nullable
      public Either<UUID, jh> b;

      a(Either<UUID, jh> $$0) {
         this.b = $$0;
      }

      a(bui $$0) {
         this.a = $$0;
      }

      a(int $$0) {
         this.c = $$0;
      }

      public void a(bui $$0) {
         this.a = $$0;
         this.b = null;
         this.c = 0;
      }
   }
}
