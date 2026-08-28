import com.mojang.datafixers.util.Either;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public interface bvw {
   String o_ = "leash";
   double p_ = 10.0;
   double q_ = 6.0;

   @Nullable
   bvw.a T_();

   void a(@Nullable bvw.a var1);

   default boolean O_() {
      return this.T_() != null && this.T_().a != null;
   }

   default boolean M_() {
      return this.T_() != null;
   }

   default boolean p() {
      return this.w() && !this.O_();
   }

   default boolean w() {
      return true;
   }

   default void e_(int $$0) {
      this.a(new bvw.a($$0));
      a((bva)this, false, false);
   }

   default void c(tq $$0) {
      bvw.a $$1 = a($$0);
      if (this.T_() != null && $$1 == null) {
         this.z();
      }

      this.a($$1);
   }

   @Nullable
   private static bvw.a a(tq $$0) {
      if ($$0.b("leash", 10)) {
         return new bvw.a(Either.left($$0.p("leash").a("UUID")));
      } else {
         if ($$0.b("leash", 11)) {
            Either<UUID, ji> $$1 = uf.a($$0, "leash").<Either<UUID, ji>>map(Either::right).orElse(null);
            if ($$1 != null) {
               return new bvw.a($$1);
            }
         }

         return null;
      }
   }

   default void a(tq $$0, @Nullable bvw.a $$1) {
      if ($$1 != null) {
         Either<UUID, ji> $$2 = $$1.b;
         if ($$1.a instanceof clq $$3) {
            $$2 = Either.right($$3.j());
         } else if ($$1.a != null) {
            $$2 = Either.left($$1.a.cF());
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

   private static <E extends bva & bvw> void a(E $$0, bvw.a $$1) {
      if ($$1.b != null && $$0.dU() instanceof ard $$2) {
         Optional<UUID> $$3 = $$1.b.left();
         Optional<ji> $$4 = $$1.b.right();
         if ($$3.isPresent()) {
            bva $$5 = $$2.b($$3.get());
            if ($$5 != null) {
               a($$0, $$5, true);
               return;
            }
         } else if ($$4.isPresent()) {
            a($$0, clq.a($$2, $$4.get()), true);
            return;
         }

         if ($$0.af > 100) {
            $$0.a($$2, cxl.vM);
            $$0.a(null);
         }
      }
   }

   default void y() {
      a((bva)this, true, true);
   }

   default void z() {
      a((bva)this, true, false);
   }

   default void A() {
   }

   private static <E extends bva & bvw> void a(E $$0, boolean $$1, boolean $$2) {
      bvw.a $$3 = $$0.T_();
      if ($$3 != null && $$3.a != null) {
         $$0.a(null);
         $$0.A();
         if ($$0.dU() instanceof ard $$4) {
            if ($$2) {
               $$0.a($$4, cxl.vM);
            }

            if ($$1) {
               $$4.m().b($$0, new aev($$0, null));
            }
         }
      }
   }

   static <E extends bva & bvw> void a_(ard $$0, E $$1) {
      bvw.a $$2 = $$1.T_();
      if ($$2 != null && $$2.b != null) {
         a($$1, $$2);
      }

      if ($$2 != null && $$2.a != null) {
         if (!$$1.bJ() || !$$2.a.bJ()) {
            if ($$0.O().b(dgv.i)) {
               $$1.y();
            } else {
               $$1.z();
            }
         }

         bva $$3 = $$1.C();
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

   default boolean a(bva $$0, float $$1) {
      return true;
   }

   default void B() {
      this.y();
   }

   default void a(bva $$0) {
   }

   default void b(bva $$0, float $$1) {
      a((bva)this, $$0, $$1);
   }

   private static <E extends bva & bvw> void a(E $$0, bva $$1, float $$2) {
      double $$3 = ($$1.dz() - $$0.dz()) / (double)$$2;
      double $$4 = ($$1.dB() - $$0.dB()) / (double)$$2;
      double $$5 = ($$1.dF() - $$0.dF()) / (double)$$2;
      $$0.i($$0.dx().b(Math.copySign($$3 * $$3 * 0.4, $$3), Math.copySign($$4 * $$4 * 0.4, $$4), Math.copySign($$5 * $$5 * 0.4, $$5)));
   }

   default void b(bva $$0, boolean $$1) {
      a((bva)this, $$0, $$1);
   }

   private static <E extends bva & bvw> void a(E $$0, bva $$1, boolean $$2) {
      bvw.a $$3 = $$0.T_();
      if ($$3 == null) {
         $$3 = new bvw.a($$1);
         $$0.a($$3);
      } else {
         $$3.a($$1);
      }

      if ($$2 && $$0.dU() instanceof ard $$4) {
         $$4.m().b($$0, new aev($$0, $$1));
      }

      if ($$0.bY()) {
         $$0.bO();
      }
   }

   @Nullable
   default bva C() {
      return b((bva)this);
   }

   @Nullable
   private static <E extends bva & bvw> bva b(E $$0) {
      bvw.a $$1 = $$0.T_();
      if ($$1 == null) {
         return null;
      } else {
         if ($$1.c != 0 && $$0.dU().C) {
            bva var3 = $$0.dU().a($$1.c);
            if (var3 instanceof bva) {
               $$1.a(var3);
            }
         }

         return $$1.a;
      }
   }

   public static final class a {
      int c;
      @Nullable
      public bva a;
      @Nullable
      public Either<UUID, ji> b;

      a(Either<UUID, ji> $$0) {
         this.b = $$0;
      }

      a(bva $$0) {
         this.a = $$0;
      }

      a(int $$0) {
         this.c = $$0;
      }

      public void a(bva $$0) {
         this.a = $$0;
         this.b = null;
         this.c = 0;
      }
   }
}
