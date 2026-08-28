import com.mojang.datafixers.util.Either;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public interface bvv {
   String o_ = "leash";
   double p_ = 10.0;
   double q_ = 6.0;

   @Nullable
   bvv.a T_();

   void a(@Nullable bvv.a var1);

   default boolean P_() {
      return this.T_() != null && this.T_().a != null;
   }

   default boolean q() {
      return this.T_() != null;
   }

   default boolean Q_() {
      return this.y() && !this.P_();
   }

   default boolean y() {
      return true;
   }

   default void e_(int $$0) {
      this.a(new bvv.a($$0));
      a((bvb)this, false, false);
   }

   @Nullable
   default bvv.a c(um $$0) {
      if ($$0.b("leash", 10)) {
         return new bvv.a(Either.left($$0.p("leash").a("UUID")));
      } else {
         if ($$0.b("leash", 11)) {
            Either<UUID, jh> $$1 = vb.a($$0, "leash").<Either<UUID, jh>>map(Either::right).orElse(null);
            if ($$1 != null) {
               return new bvv.a($$1);
            }
         }

         return null;
      }
   }

   default void a(um $$0, @Nullable bvv.a $$1) {
      if ($$1 != null) {
         Either<UUID, jh> $$2 = $$1.b;
         if ($$1.a instanceof clm $$3) {
            $$2 = Either.right($$3.p());
         } else if ($$1.a != null) {
            $$2 = Either.left($$1.a.cG());
         }

         if ($$2 != null) {
            $$0.a("leash", (vj)$$2.map($$0x -> {
               um $$1x = new um();
               $$1x.a("UUID", $$0x);
               return $$1x;
            }, vb::a));
         }
      }
   }

   private static <E extends bvb & bvv> void a(E $$0, bvv.a $$1) {
      if ($$1.b != null && $$0.dW() instanceof arx $$2) {
         Optional<UUID> $$3 = $$1.b.left();
         Optional<jh> $$4 = $$1.b.right();
         if ($$3.isPresent()) {
            bvb $$5 = $$2.a($$3.get());
            if ($$5 != null) {
               a($$0, $$5, true);
               return;
            }
         } else if ($$4.isPresent()) {
            a($$0, clm.a($$2, $$4.get()), true);
            return;
         }

         if ($$0.af > 100) {
            $$0.a($$2, cxk.vK);
            $$0.a(null);
         }
      }
   }

   default void a(boolean $$0, boolean $$1) {
      a((bvb)this, $$0, $$1);
   }

   private static <E extends bvb & bvv> void a(E $$0, boolean $$1, boolean $$2) {
      bvv.a $$3 = $$0.T_();
      if ($$3 != null && $$3.a != null) {
         $$0.a(null);
         if ($$0.dW() instanceof arx $$4) {
            if ($$2) {
               $$0.a($$4, cxk.vK);
            }

            if ($$1) {
               $$4.m().b($$0, new afr($$0, null));
            }
         }
      }
   }

   static <E extends bvb & bvv> void a_(arx $$0, E $$1) {
      bvv.a $$2 = $$1.T_();
      if ($$2 != null && $$2.b != null) {
         a($$1, $$2);
      }

      if ($$2 != null && $$2.a != null) {
         if (!$$1.bL() || !$$2.a.bL()) {
            a($$1, true, $$0.O().b(dgv.i));
         }

         bvb $$3 = $$1.A();
         if ($$3 != null && $$3.dW() == $$1.dW()) {
            float $$4 = $$1.f($$3);
            if (!$$1.a($$3, $$4)) {
               return;
            }

            if ((double)$$4 > 10.0) {
               $$1.z();
            } else if ((double)$$4 > 6.0) {
               $$1.b($$3, $$4);
               $$1.cy();
            } else {
               $$1.a($$3);
            }
         }
      }
   }

   default boolean a(bvb $$0, float $$1) {
      return true;
   }

   default void z() {
      this.a(true, true);
   }

   default void a(bvb $$0) {
   }

   default void b(bvb $$0, float $$1) {
      a((bvb)this, $$0, $$1);
   }

   private static <E extends bvb & bvv> void a(E $$0, bvb $$1, float $$2) {
      double $$3 = ($$1.dB() - $$0.dB()) / (double)$$2;
      double $$4 = ($$1.dD() - $$0.dD()) / (double)$$2;
      double $$5 = ($$1.dH() - $$0.dH()) / (double)$$2;
      $$0.h($$0.dz().b(Math.copySign($$3 * $$3 * 0.4, $$3), Math.copySign($$4 * $$4 * 0.4, $$4), Math.copySign($$5 * $$5 * 0.4, $$5)));
   }

   default void b(bvb $$0, boolean $$1) {
      a((bvb)this, $$0, $$1);
   }

   private static <E extends bvb & bvv> void a(E $$0, bvb $$1, boolean $$2) {
      bvv.a $$3 = $$0.T_();
      if ($$3 == null) {
         $$3 = new bvv.a($$1);
         $$0.a($$3);
      } else {
         $$3.a($$1);
      }

      if ($$2 && $$0.dW() instanceof arx $$4) {
         $$4.m().b($$0, new afr($$0, $$1));
      }

      if ($$0.bZ()) {
         $$0.ae();
      }
   }

   @Nullable
   default bvb A() {
      return b((bvb)this);
   }

   @Nullable
   private static <E extends bvb & bvv> bvb b(E $$0) {
      bvv.a $$1 = $$0.T_();
      if ($$1 == null) {
         return null;
      } else {
         if ($$1.c != 0 && $$0.dW().C) {
            bvb var3 = $$0.dW().a($$1.c);
            if (var3 instanceof bvb) {
               $$1.a(var3);
            }
         }

         return $$1.a;
      }
   }

   public static final class a {
      int c;
      @Nullable
      public bvb a;
      @Nullable
      public Either<UUID, jh> b;

      a(Either<UUID, jh> $$0) {
         this.b = $$0;
      }

      a(bvb $$0) {
         this.a = $$0;
      }

      a(int $$0) {
         this.c = $$0;
      }

      public void a(bvb $$0) {
         this.a = $$0;
         this.b = null;
         this.c = 0;
      }
   }
}
