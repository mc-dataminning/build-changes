import com.mojang.datafixers.util.Either;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public interface but {
   String b_ = "leash";
   double r_ = 10.0;
   double s_ = 6.0;

   @Nullable
   but.a Y_();

   void a(@Nullable but.a var1);

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
      this.a(new but.a($$0));
      a((btz)this, false, false);
   }

   @Nullable
   default but.a c(uj $$0) {
      if ($$0.b("leash", 10)) {
         return new but.a(Either.left($$0.p("leash").a("UUID")));
      } else {
         if ($$0.b("leash", 11)) {
            Either<UUID, jg> $$1 = uy.a($$0, "leash").<Either<UUID, jg>>map(Either::right).orElse(null);
            if ($$1 != null) {
               return new but.a($$1);
            }
         }

         return null;
      }
   }

   default void a(uj $$0, @Nullable but.a $$1) {
      if ($$1 != null) {
         Either<UUID, jg> $$2 = $$1.b;
         if ($$1.a instanceof ckk $$3) {
            $$2 = Either.right($$3.q());
         } else if ($$1.a != null) {
            $$2 = Either.left($$1.a.cH());
         }

         if ($$2 != null) {
            $$0.a("leash", (vg)$$2.map($$0x -> {
               uj $$1x = new uj();
               $$1x.a("UUID", $$0x);
               return $$1x;
            }, uy::a));
         }
      }
   }

   private static <E extends btz & but> void a(E $$0, but.a $$1) {
      if ($$1.b != null && $$0.dX() instanceof arm $$2) {
         Optional<UUID> $$3 = $$1.b.left();
         Optional<jg> $$4 = $$1.b.right();
         if ($$3.isPresent()) {
            btz $$5 = $$2.a($$3.get());
            if ($$5 != null) {
               a($$0, $$5, true);
               return;
            }
         } else if ($$4.isPresent()) {
            a($$0, ckk.b($$2, $$4.get()), true);
            return;
         }

         if ($$0.ag > 100) {
            $$0.a((deu)cwb.uM);
            $$0.a(null);
         }
      }
   }

   default void a(boolean $$0, boolean $$1) {
      a((btz)this, $$0, $$1);
   }

   private static <E extends btz & but> void a(E $$0, boolean $$1, boolean $$2) {
      but.a $$3 = $$0.Y_();
      if ($$3 != null && $$3.a != null) {
         $$0.a(null);
         if (!$$0.dX().C && $$2) {
            $$0.a((deu)cwb.uM);
         }

         if ($$1 && $$0.dX() instanceof arm $$4) {
            $$4.l().b($$0, new afk($$0, null));
         }
      }
   }

   static <E extends btz & but> void b_(E $$0) {
      but.a $$1 = $$0.Y_();
      if ($$1 != null && $$1.b != null) {
         a($$0, $$1);
      }

      if ($$1 != null && $$1.a != null) {
         if (!$$0.bM() || !$$1.a.bM()) {
            a($$0, true, $$0.dX().ac().b(der.i));
         }

         btz $$2 = $$0.C();
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

   default boolean a(btz $$0, float $$1) {
      return true;
   }

   default void B() {
      this.a(true, true);
   }

   default void b(btz $$0) {
   }

   default void b(btz $$0, float $$1) {
      a((btz)this, $$0, $$1);
   }

   private static <E extends btz & but> void a(E $$0, btz $$1, float $$2) {
      double $$3 = ($$1.dC() - $$0.dC()) / (double)$$2;
      double $$4 = ($$1.dE() - $$0.dE()) / (double)$$2;
      double $$5 = ($$1.dI() - $$0.dI()) / (double)$$2;
      $$0.h($$0.dA().b(Math.copySign($$3 * $$3 * 0.4, $$3), Math.copySign($$4 * $$4 * 0.4, $$4), Math.copySign($$5 * $$5 * 0.4, $$5)));
   }

   default void b(btz $$0, boolean $$1) {
      a((btz)this, $$0, $$1);
   }

   private static <E extends btz & but> void a(E $$0, btz $$1, boolean $$2) {
      but.a $$3 = $$0.Y_();
      if ($$3 == null) {
         $$3 = new but.a($$1);
         $$0.a($$3);
      } else {
         $$3.a($$1);
      }

      if ($$2 && $$0.dX() instanceof arm $$4) {
         $$4.l().b($$0, new afk($$0, $$1));
      }

      if ($$0.ca()) {
         $$0.af();
      }
   }

   @Nullable
   default btz C() {
      return c((btz)this);
   }

   @Nullable
   private static <E extends btz & but> btz c(E $$0) {
      but.a $$1 = $$0.Y_();
      if ($$1 == null) {
         return null;
      } else {
         if ($$1.c != 0 && $$0.dX().C) {
            btz var3 = $$0.dX().a($$1.c);
            if (var3 instanceof btz) {
               $$1.a(var3);
            }
         }

         return $$1.a;
      }
   }

   public static final class a {
      int c;
      @Nullable
      public btz a;
      @Nullable
      public Either<UUID, jg> b;

      a(Either<UUID, jg> $$0) {
         this.b = $$0;
      }

      a(btz $$0) {
         this.a = $$0;
      }

      a(int $$0) {
         this.c = $$0;
      }

      public void a(btz $$0) {
         this.a = $$0;
         this.b = null;
         this.c = 0;
      }
   }
}
