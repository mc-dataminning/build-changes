import com.mojang.datafixers.util.Either;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public interface btk {
   String b_ = "leash";

   @Nullable
   btk.a X_();

   void a(@Nullable btk.a var1);

   default boolean N_() {
      return this.X_() != null && this.X_().a != null;
   }

   default boolean O_() {
      return this.X_() != null;
   }

   default boolean q() {
      return this.y() && !this.N_();
   }

   default boolean y() {
      return true;
   }

   default void h_(int $$0) {
      this.a(new btk.a($$0));
      a((bsr)this, false, false);
   }

   @Nullable
   default btk.a c(ub $$0) {
      if ($$0.b("leash", 10)) {
         return new btk.a(Either.left($$0.p("leash").a("UUID")));
      } else {
         if ($$0.b("leash", 11)) {
            Either<UUID, jd> $$1 = uq.a($$0, "leash").<Either<UUID, jd>>map(Either::right).orElse(null);
            if ($$1 != null) {
               return new btk.a($$1);
            }
         }

         return null;
      }
   }

   default void a(ub $$0, @Nullable btk.a $$1) {
      if ($$1 != null) {
         Either<UUID, jd> $$2 = $$1.b;
         if ($$1.a instanceof btn) {
            $$2 = Either.left($$1.a.cz());
         } else if ($$1.a instanceof cjb $$3) {
            $$2 = Either.right($$3.t());
         }

         $$0.a("leash", (uy)$$2.map($$0x -> {
            ub $$1x = new ub();
            $$1x.a("UUID", $$0x);
            return $$1x;
         }, uq::a));
      }
   }

   private static <E extends bsr & btk> void a(E $$0, btk.a $$1) {
      if ($$1.b != null && $$0.dO() instanceof aqu $$2) {
         Optional<UUID> $$3 = $$1.b.left();
         Optional<jd> $$4 = $$1.b.right();
         if ($$3.isPresent()) {
            bsr $$5 = $$2.a($$3.get());
            if ($$5 != null) {
               a($$0, $$5, true);
               return;
            }
         } else if ($$4.isPresent()) {
            a($$0, cjb.b($$2, $$4.get()), true);
            return;
         }

         if ($$0.ai > 100) {
            $$0.a((dcv)cut.uK);
            $$0.a(null);
         }
      }
   }

   default void a(boolean $$0, boolean $$1) {
      a((bsr)this, $$0, $$1);
   }

   private static <E extends bsr & btk> void a(E $$0, boolean $$1, boolean $$2) {
      btk.a $$3 = $$0.X_();
      if ($$3 != null && $$3.a != null) {
         $$0.a(null);
         if (!$$0.dO().B && $$2) {
            $$0.a((dcv)cut.uK);
         }

         if ($$1 && $$0.dO() instanceof aqu $$4) {
            $$4.l().b($$0, new afa($$0, null));
         }
      }
   }

   static <E extends bsr & btk> void b_(E $$0) {
      btk.a $$1 = $$0.X_();
      if ($$1 != null && $$1.b != null) {
         a($$0, $$1);
      }

      if ($$1 != null && $$1.a != null) {
         if (!$$0.bE() || !$$1.a.bE()) {
            a($$0, true, true);
         }

         bsr $$2 = $$0.A();
         if ($$2 != null && $$2.dO() == $$0.dO()) {
            float $$3 = $$0.f($$2);
            if (!$$0.a($$2, $$3)) {
               return;
            }

            if ($$3 > 10.0F) {
               $$0.z();
            } else if ($$3 > 6.0F) {
               double $$4 = ($$2.dt() - $$0.dt()) / (double)$$3;
               double $$5 = ($$2.dv() - $$0.dv()) / (double)$$3;
               double $$6 = ($$2.dz() - $$0.dz()) / (double)$$3;
               $$0.i($$0.dr().b(Math.copySign($$4 * $$4 * 0.4, $$4), Math.copySign($$5 * $$5 * 0.4, $$5), Math.copySign($$6 * $$6 * 0.4, $$6)));
               $$0.cr();
            } else {
               $$0.b($$2);
            }
         }
      }
   }

   default boolean a(bsr $$0, float $$1) {
      return true;
   }

   default void z() {
      this.a(true, true);
   }

   default void b(bsr $$0) {
   }

   default void b(bsr $$0, boolean $$1) {
      a((bsr)this, $$0, $$1);
   }

   private static <E extends bsr & btk> void a(E $$0, bsr $$1, boolean $$2) {
      btk.a $$3 = $$0.X_();
      if ($$3 == null) {
         $$3 = new btk.a($$1);
         $$0.a($$3);
      } else {
         $$3.a($$1);
      }

      if ($$2 && $$0.dO() instanceof aqu $$4) {
         $$4.l().b($$0, new afa($$0, $$1));
      }

      if ($$0.bS()) {
         $$0.ad();
      }
   }

   @Nullable
   default bsr A() {
      return c((bsr)this);
   }

   @Nullable
   private static <E extends bsr & btk> bsr c(E $$0) {
      btk.a $$1 = $$0.X_();
      if ($$1 == null) {
         return null;
      } else {
         if ($$1.c != 0 && $$0.dO().B) {
            bsr var3 = $$0.dO().a($$1.c);
            if (var3 instanceof bsr) {
               $$1.a(var3);
            }
         }

         return $$1.a;
      }
   }

   public static final class a {
      int c;
      @Nullable
      public bsr a;
      @Nullable
      public Either<UUID, jd> b;

      a(Either<UUID, jd> $$0) {
         this.b = $$0;
      }

      a(bsr $$0) {
         this.a = $$0;
      }

      a(int $$0) {
         this.c = $$0;
      }

      public void a(bsr $$0) {
         this.a = $$0;
         this.b = null;
         this.c = 0;
      }
   }
}
