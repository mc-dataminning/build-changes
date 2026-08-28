import com.mojang.datafixers.util.Either;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public interface bud {
   String b_ = "leash";
   double r_ = 10.0;
   double s_ = 6.0;

   @Nullable
   bud.a W_();

   void a(@Nullable bud.a var1);

   default boolean K_() {
      return this.W_() != null && this.W_().a != null;
   }

   default boolean L_() {
      return this.W_() != null;
   }

   default boolean M_() {
      return this.A() && !this.K_();
   }

   default boolean A() {
      return true;
   }

   default void h_(int $$0) {
      this.a(new bud.a($$0));
      a((btj)this, false, false);
   }

   @Nullable
   default bud.a c(uf $$0) {
      if ($$0.b("leash", 10)) {
         return new bud.a(Either.left($$0.p("leash").a("UUID")));
      } else {
         if ($$0.b("leash", 11)) {
            Either<UUID, je> $$1 = uu.a($$0, "leash").<Either<UUID, je>>map(Either::right).orElse(null);
            if ($$1 != null) {
               return new bud.a($$1);
            }
         }

         return null;
      }
   }

   default void a(uf $$0, @Nullable bud.a $$1) {
      if ($$1 != null) {
         Either<UUID, je> $$2 = $$1.b;
         if ($$1.a instanceof cjt $$3) {
            $$2 = Either.right($$3.q());
         } else if ($$1.a != null) {
            $$2 = Either.left($$1.a.cD());
         }

         if ($$2 != null) {
            $$0.a("leash", (vc)$$2.map($$0x -> {
               uf $$1x = new uf();
               $$1x.a("UUID", $$0x);
               return $$1x;
            }, uu::a));
         }
      }
   }

   private static <E extends btj & bud> void a(E $$0, bud.a $$1) {
      if ($$1.b != null && $$0.dS() instanceof arg $$2) {
         Optional<UUID> $$3 = $$1.b.left();
         Optional<je> $$4 = $$1.b.right();
         if ($$3.isPresent()) {
            btj $$5 = $$2.a($$3.get());
            if ($$5 != null) {
               a($$0, $$5, true);
               return;
            }
         } else if ($$4.isPresent()) {
            a($$0, cjt.b($$2, $$4.get()), true);
            return;
         }

         if ($$0.ag > 100) {
            $$0.a((ddr)cvo.uM);
            $$0.a(null);
         }
      }
   }

   default void a(boolean $$0, boolean $$1) {
      a((btj)this, $$0, $$1);
   }

   private static <E extends btj & bud> void a(E $$0, boolean $$1, boolean $$2) {
      bud.a $$3 = $$0.W_();
      if ($$3 != null && $$3.a != null) {
         $$0.a(null);
         if (!$$0.dS().B && $$2) {
            $$0.a((ddr)cvo.uM);
         }

         if ($$1 && $$0.dS() instanceof arg $$4) {
            $$4.l().b($$0, new afg($$0, null));
         }
      }
   }

   static <E extends btj & bud> void b_(E $$0) {
      bud.a $$1 = $$0.W_();
      if ($$1 != null && $$1.b != null) {
         a($$0, $$1);
      }

      if ($$1 != null && $$1.a != null) {
         if (!$$0.bI() || !$$1.a.bI()) {
            a($$0, true, $$0.dS().ac().b(ddo.i));
         }

         btj $$2 = $$0.C();
         if ($$2 != null && $$2.dS() == $$0.dS()) {
            float $$3 = $$0.f($$2);
            if (!$$0.a($$2, $$3)) {
               return;
            }

            if ((double)$$3 > 10.0) {
               $$0.B();
            } else if ((double)$$3 > 6.0) {
               $$0.b($$2, $$3);
               $$0.cv();
            } else {
               $$0.b($$2);
            }
         }
      }
   }

   default boolean a(btj $$0, float $$1) {
      return true;
   }

   default void B() {
      this.a(true, true);
   }

   default void b(btj $$0) {
   }

   default void b(btj $$0, float $$1) {
      a((btj)this, $$0, $$1);
   }

   private static <E extends btj & bud> void a(E $$0, btj $$1, float $$2) {
      double $$3 = ($$1.dx() - $$0.dx()) / (double)$$2;
      double $$4 = ($$1.dz() - $$0.dz()) / (double)$$2;
      double $$5 = ($$1.dD() - $$0.dD()) / (double)$$2;
      $$0.h($$0.dv().b(Math.copySign($$3 * $$3 * 0.4, $$3), Math.copySign($$4 * $$4 * 0.4, $$4), Math.copySign($$5 * $$5 * 0.4, $$5)));
   }

   default void b(btj $$0, boolean $$1) {
      a((btj)this, $$0, $$1);
   }

   private static <E extends btj & bud> void a(E $$0, btj $$1, boolean $$2) {
      bud.a $$3 = $$0.W_();
      if ($$3 == null) {
         $$3 = new bud.a($$1);
         $$0.a($$3);
      } else {
         $$3.a($$1);
      }

      if ($$2 && $$0.dS() instanceof arg $$4) {
         $$4.l().b($$0, new afg($$0, $$1));
      }

      if ($$0.bW()) {
         $$0.af();
      }
   }

   @Nullable
   default btj C() {
      return c((btj)this);
   }

   @Nullable
   private static <E extends btj & bud> btj c(E $$0) {
      bud.a $$1 = $$0.W_();
      if ($$1 == null) {
         return null;
      } else {
         if ($$1.c != 0 && $$0.dS().B) {
            btj var3 = $$0.dS().a($$1.c);
            if (var3 instanceof btj) {
               $$1.a(var3);
            }
         }

         return $$1.a;
      }
   }

   public static final class a {
      int c;
      @Nullable
      public btj a;
      @Nullable
      public Either<UUID, je> b;

      a(Either<UUID, je> $$0) {
         this.b = $$0;
      }

      a(btj $$0) {
         this.a = $$0;
      }

      a(int $$0) {
         this.c = $$0;
      }

      public void a(btj $$0) {
         this.a = $$0;
         this.b = null;
         this.c = 0;
      }
   }
}
