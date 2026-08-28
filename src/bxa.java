import com.mojang.datafixers.util.Either;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public interface bxa {
   String o_ = "leash";
   double p_ = 10.0;
   double q_ = 6.0;

   @Nullable
   bxa.a T_();

   void a(@Nullable bxa.a var1);

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
      this.a(new bxa.a($$0));
      a((bwd)this, false, false);
   }

   default void c(tz $$0) {
      bxa.a $$1 = a($$0);
      if (this.T_() != null && $$1 == null) {
         this.z();
      }

      this.a($$1);
   }

   @Nullable
   private static bxa.a a(tz $$0) {
      if ($$0.b("leash", 10)) {
         return new bxa.a(Either.left($$0.p("leash").a("UUID")));
      } else {
         if ($$0.b("leash", 11)) {
            Either<UUID, iu> $$1 = uo.a($$0, "leash").<Either<UUID, iu>>map(Either::right).orElse(null);
            if ($$1 != null) {
               return new bxa.a($$1);
            }
         }

         return null;
      }
   }

   default void a(tz $$0, @Nullable bxa.a $$1) {
      if ($$1 != null) {
         Either<UUID, iu> $$2 = $$1.b;
         if ($$1.a instanceof cmx $$3) {
            $$2 = Either.right($$3.j());
         } else if ($$1.a != null) {
            $$2 = Either.left($$1.a.cG());
         }

         if ($$2 != null) {
            $$0.a("leash", (uw)$$2.map($$0x -> {
               tz $$1x = new tz();
               $$1x.a("UUID", $$0x);
               return $$1x;
            }, uo::a));
         }
      }
   }

   private static <E extends bwd & bxa> void a(E $$0, bxa.a $$1) {
      if ($$1.b != null && $$0.dV() instanceof arq $$2) {
         Optional<UUID> $$3 = $$1.b.left();
         Optional<iu> $$4 = $$1.b.right();
         if ($$3.isPresent()) {
            bwd $$5 = $$2.b($$3.get());
            if ($$5 != null) {
               a($$0, $$5, true);
               return;
            }
         } else if ($$4.isPresent()) {
            a($$0, cmx.b($$2, $$4.get()), true);
            return;
         }

         if ($$0.af > 100) {
            $$0.a($$2, czc.vQ);
            $$0.a(null);
         }
      }
   }

   default void y() {
      a((bwd)this, true, true);
   }

   default void z() {
      a((bwd)this, true, false);
   }

   default void A() {
   }

   private static <E extends bwd & bxa> void a(E $$0, boolean $$1, boolean $$2) {
      bxa.a $$3 = $$0.T_();
      if ($$3 != null && $$3.a != null) {
         $$0.a(null);
         $$0.A();
         if ($$0.dV() instanceof arq $$4) {
            if ($$2) {
               $$0.a($$4, czc.vQ);
            }

            if ($$1) {
               $$4.m().b($$0, new afe($$0, null));
            }
         }
      }
   }

   static <E extends bwd & bxa> void a_(arq $$0, E $$1) {
      bxa.a $$2 = $$1.T_();
      if ($$2 != null && $$2.b != null) {
         a($$1, $$2);
      }

      if ($$2 != null && $$2.a != null) {
         if (!$$1.bK() || !$$2.a.bK()) {
            if ($$0.O().c(dir.i)) {
               $$1.y();
            } else {
               $$1.z();
            }
         }

         bwd $$3 = $$1.C();
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

   default boolean a(bwd $$0, float $$1) {
      return true;
   }

   default void B() {
      this.y();
   }

   default void a(bwd $$0) {
   }

   default void b(bwd $$0, float $$1) {
      a((bwd)this, $$0, $$1);
   }

   private static <E extends bwd & bxa> void a(E $$0, bwd $$1, float $$2) {
      double $$3 = ($$1.dA() - $$0.dA()) / (double)$$2;
      double $$4 = ($$1.dC() - $$0.dC()) / (double)$$2;
      double $$5 = ($$1.dG() - $$0.dG()) / (double)$$2;
      $$0.i($$0.dy().b(Math.copySign($$3 * $$3 * 0.4, $$3), Math.copySign($$4 * $$4 * 0.4, $$4), Math.copySign($$5 * $$5 * 0.4, $$5)));
   }

   default void a_(bwd $$0, boolean $$1) {
      a((bwd)this, $$0, $$1);
   }

   private static <E extends bwd & bxa> void a(E $$0, bwd $$1, boolean $$2) {
      bxa.a $$3 = $$0.T_();
      if ($$3 == null) {
         $$3 = new bxa.a($$1);
         $$0.a($$3);
      } else {
         $$3.a($$1);
      }

      if ($$2 && $$0.dV() instanceof arq $$4) {
         $$4.m().b($$0, new afe($$0, $$1));
      }

      if ($$0.bZ()) {
         $$0.bP();
      }
   }

   @Nullable
   default bwd C() {
      return b((bwd)this);
   }

   @Nullable
   private static <E extends bwd & bxa> bwd b(E $$0) {
      bxa.a $$1 = $$0.T_();
      if ($$1 == null) {
         return null;
      } else {
         if ($$1.c != 0 && $$0.dV().C) {
            bwd var3 = $$0.dV().a($$1.c);
            if (var3 instanceof bwd) {
               $$1.a(var3);
            }
         }

         return $$1.a;
      }
   }

   public static final class a {
      int c;
      @Nullable
      public bwd a;
      @Nullable
      public Either<UUID, iu> b;

      a(Either<UUID, iu> $$0) {
         this.b = $$0;
      }

      a(bwd $$0) {
         this.a = $$0;
      }

      a(int $$0) {
         this.c = $$0;
      }

      public void a(bwd $$0) {
         this.a = $$0;
         this.b = null;
         this.c = 0;
      }
   }
}
