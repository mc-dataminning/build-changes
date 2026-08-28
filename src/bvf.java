import com.mojang.datafixers.util.Either;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public interface bvf {
   String o_ = "leash";
   double p_ = 10.0;
   double q_ = 6.0;

   @Nullable
   bvf.a R_();

   void a(@Nullable bvf.a var1);

   default boolean N_() {
      return this.R_() != null && this.R_().a != null;
   }

   default boolean O_() {
      return this.R_() != null;
   }

   default boolean x() {
      return this.y() && !this.N_();
   }

   default boolean y() {
      return true;
   }

   default void e_(int $$0) {
      this.a(new bvf.a($$0));
      a((bul)this, false, false);
   }

   @Nullable
   default bvf.a c(ul $$0) {
      if ($$0.b("leash", 10)) {
         return new bvf.a(Either.left($$0.p("leash").a("UUID")));
      } else {
         if ($$0.b("leash", 11)) {
            Either<UUID, jh> $$1 = va.a($$0, "leash").<Either<UUID, jh>>map(Either::right).orElse(null);
            if ($$1 != null) {
               return new bvf.a($$1);
            }
         }

         return null;
      }
   }

   default void a(ul $$0, @Nullable bvf.a $$1) {
      if ($$1 != null) {
         Either<UUID, jh> $$2 = $$1.b;
         if ($$1.a instanceof ckw $$3) {
            $$2 = Either.right($$3.n());
         } else if ($$1.a != null) {
            $$2 = Either.left($$1.a.cG());
         }

         if ($$2 != null) {
            $$0.a("leash", (vi)$$2.map($$0x -> {
               ul $$1x = new ul();
               $$1x.a("UUID", $$0x);
               return $$1x;
            }, va::a));
         }
      }
   }

   private static <E extends bul & bvf> void a(E $$0, bvf.a $$1) {
      if ($$1.b != null && $$0.dV() instanceof arp $$2) {
         Optional<UUID> $$3 = $$1.b.left();
         Optional<jh> $$4 = $$1.b.right();
         if ($$3.isPresent()) {
            bul $$5 = $$2.a($$3.get());
            if ($$5 != null) {
               a($$0, $$5, true);
               return;
            }
         } else if ($$4.isPresent()) {
            a($$0, ckw.a($$2, $$4.get()), true);
            return;
         }

         if ($$0.af > 100) {
            $$0.a($$2, cwq.vc);
            $$0.a(null);
         }
      }
   }

   default void a(boolean $$0, boolean $$1) {
      a((bul)this, $$0, $$1);
   }

   private static <E extends bul & bvf> void a(E $$0, boolean $$1, boolean $$2) {
      bvf.a $$3 = $$0.R_();
      if ($$3 != null && $$3.a != null) {
         $$0.a(null);
         if ($$0.dV() instanceof arp $$4) {
            if ($$2) {
               $$0.a($$4, cwq.vc);
            }

            if ($$1) {
               $$4.m().b($$0, new afm($$0, null));
            }
         }
      }
   }

   static <E extends bul & bvf> void a_(arp $$0, E $$1) {
      bvf.a $$2 = $$1.R_();
      if ($$2 != null && $$2.b != null) {
         a($$1, $$2);
      }

      if ($$2 != null && $$2.a != null) {
         if (!$$1.bL() || !$$2.a.bL()) {
            a($$1, true, $$0.N().b(dfi.i));
         }

         bul $$3 = $$1.A();
         if ($$3 != null && $$3.dV() == $$1.dV()) {
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

   default boolean a(bul $$0, float $$1) {
      return true;
   }

   default void z() {
      this.a(true, true);
   }

   default void a(bul $$0) {
   }

   default void b(bul $$0, float $$1) {
      a((bul)this, $$0, $$1);
   }

   private static <E extends bul & bvf> void a(E $$0, bul $$1, float $$2) {
      double $$3 = ($$1.dA() - $$0.dA()) / (double)$$2;
      double $$4 = ($$1.dC() - $$0.dC()) / (double)$$2;
      double $$5 = ($$1.dG() - $$0.dG()) / (double)$$2;
      $$0.h($$0.dy().b(Math.copySign($$3 * $$3 * 0.4, $$3), Math.copySign($$4 * $$4 * 0.4, $$4), Math.copySign($$5 * $$5 * 0.4, $$5)));
   }

   default void b(bul $$0, boolean $$1) {
      a((bul)this, $$0, $$1);
   }

   private static <E extends bul & bvf> void a(E $$0, bul $$1, boolean $$2) {
      bvf.a $$3 = $$0.R_();
      if ($$3 == null) {
         $$3 = new bvf.a($$1);
         $$0.a($$3);
      } else {
         $$3.a($$1);
      }

      if ($$2 && $$0.dV() instanceof arp $$4) {
         $$4.m().b($$0, new afm($$0, $$1));
      }

      if ($$0.bZ()) {
         $$0.ae();
      }
   }

   @Nullable
   default bul A() {
      return b((bul)this);
   }

   @Nullable
   private static <E extends bul & bvf> bul b(E $$0) {
      bvf.a $$1 = $$0.R_();
      if ($$1 == null) {
         return null;
      } else {
         if ($$1.c != 0 && $$0.dV().C) {
            bul var3 = $$0.dV().a($$1.c);
            if (var3 instanceof bul) {
               $$1.a(var3);
            }
         }

         return $$1.a;
      }
   }

   public static final class a {
      int c;
      @Nullable
      public bul a;
      @Nullable
      public Either<UUID, jh> b;

      a(Either<UUID, jh> $$0) {
         this.b = $$0;
      }

      a(bul $$0) {
         this.a = $$0;
      }

      a(int $$0) {
         this.c = $$0;
      }

      public void a(bul $$0) {
         this.a = $$0;
         this.b = null;
         this.c = 0;
      }
   }
}
