import com.mojang.datafixers.util.Either;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public interface bxc {
   String o_ = "leash";
   double p_ = 10.0;
   double q_ = 6.0;

   @Nullable
   bxc.a U_();

   void a(@Nullable bxc.a var1);

   default boolean O_() {
      return this.U_() != null && this.U_().a != null;
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
      this.a(new bxc.a($$0));
      a((bwf)this, false, false);
   }

   default void c(tz $$0) {
      bxc.a $$1 = a($$0);
      if (this.U_() != null && $$1 == null) {
         this.z();
      }

      this.a($$1);
   }

   @Nullable
   private static bxc.a a(tz $$0) {
      if ($$0.b("leash", 10)) {
         return new bxc.a(Either.left($$0.p("leash").a("UUID")));
      } else {
         if ($$0.b("leash", 11)) {
            Either<UUID, iu> $$1 = uo.a($$0, "leash").<Either<UUID, iu>>map(Either::right).orElse(null);
            if ($$1 != null) {
               return new bxc.a($$1);
            }
         }

         return null;
      }
   }

   default void a(tz $$0, @Nullable bxc.a $$1) {
      if ($$1 != null) {
         Either<UUID, iu> $$2 = $$1.b;
         if ($$1.a instanceof cnb $$3) {
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

   private static <E extends bwf & bxc> void a(E $$0, bxc.a $$1) {
      if ($$1.b != null && $$0.dV() instanceof arq $$2) {
         Optional<UUID> $$3 = $$1.b.left();
         Optional<iu> $$4 = $$1.b.right();
         if ($$3.isPresent()) {
            bwf $$5 = $$2.b($$3.get());
            if ($$5 != null) {
               a($$0, $$5, true);
               return;
            }
         } else if ($$4.isPresent()) {
            a($$0, cnb.b($$2, $$4.get()), true);
            return;
         }

         if ($$0.af > 100) {
            $$0.a($$2, czh.vV);
            $$0.a(null);
         }
      }
   }

   default void y() {
      a((bwf)this, true, true);
   }

   default void z() {
      a((bwf)this, true, false);
   }

   default void A() {
   }

   private static <E extends bwf & bxc> void a(E $$0, boolean $$1, boolean $$2) {
      bxc.a $$3 = $$0.U_();
      if ($$3 != null && $$3.a != null) {
         $$0.a(null);
         $$0.A();
         if ($$0.dV() instanceof arq $$4) {
            if ($$2) {
               $$0.a($$4, czh.vV);
            }

            if ($$1) {
               $$4.m().b($$0, new afe($$0, null));
            }
         }
      }
   }

   static <E extends bwf & bxc> void a_(arq $$0, E $$1) {
      bxc.a $$2 = $$1.U_();
      if ($$2 != null && $$2.b != null) {
         a($$1, $$2);
      }

      if ($$2 != null && $$2.a != null) {
         if (!$$1.bK() || !$$2.a.bK()) {
            if ($$0.O().c(diw.j)) {
               $$1.y();
            } else {
               $$1.z();
            }
         }

         bwf $$3 = $$1.C();
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

   default boolean a(bwf $$0, float $$1) {
      return true;
   }

   default void B() {
      this.y();
   }

   default void a(bwf $$0) {
   }

   default void b(bwf $$0, float $$1) {
      a((bwf)this, $$0, $$1);
   }

   private static <E extends bwf & bxc> void a(E $$0, bwf $$1, float $$2) {
      double $$3 = ($$1.dA() - $$0.dA()) / (double)$$2;
      double $$4 = ($$1.dC() - $$0.dC()) / (double)$$2;
      double $$5 = ($$1.dG() - $$0.dG()) / (double)$$2;
      $$0.i($$0.dy().b(Math.copySign($$3 * $$3 * 0.4, $$3), Math.copySign($$4 * $$4 * 0.4, $$4), Math.copySign($$5 * $$5 * 0.4, $$5)));
   }

   default void a_(bwf $$0, boolean $$1) {
      a((bwf)this, $$0, $$1);
   }

   private static <E extends bwf & bxc> void a(E $$0, bwf $$1, boolean $$2) {
      bxc.a $$3 = $$0.U_();
      if ($$3 == null) {
         $$3 = new bxc.a($$1);
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
   default bwf C() {
      return b((bwf)this);
   }

   @Nullable
   private static <E extends bwf & bxc> bwf b(E $$0) {
      bxc.a $$1 = $$0.U_();
      if ($$1 == null) {
         return null;
      } else {
         if ($$1.c != 0 && $$0.dV().C) {
            bwf var3 = $$0.dV().a($$1.c);
            if (var3 instanceof bwf) {
               $$1.a(var3);
            }
         }

         return $$1.a;
      }
   }

   public static final class a {
      int c;
      @Nullable
      public bwf a;
      @Nullable
      public Either<UUID, iu> b;

      a(Either<UUID, iu> $$0) {
         this.b = $$0;
      }

      a(bwf $$0) {
         this.a = $$0;
      }

      a(int $$0) {
         this.c = $$0;
      }

      public void a(bwf $$0) {
         this.a = $$0;
         this.b = null;
         this.c = 0;
      }
   }
}
