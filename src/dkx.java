import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import javax.annotation.Nullable;

public class dkx {
   public static final dkx.e[] a = new dkx.e[]{dkx.e.a, dkx.e.b, dkx.e.c};
   private final dkx.b b;

   public dkx(dkw $$0) {
      this(new dkx.a($$0));
   }

   public dkx(dkx.b $$0) {
      this.b = $$0;
   }

   public boolean a(dta $$0, dca $$1, jd $$2, ji $$3) {
      return ji.a().anyMatch($$4 -> this.a($$0, $$1, $$2, $$3, $$4, this.b::a).isPresent());
   }

   public Optional<dkx.c> a(dta $$0, dcv $$1, jd $$2, ayv $$3) {
      return ji.a($$3)
         .stream()
         .filter($$1x -> this.b.b($$0, $$1x))
         .map($$4 -> this.a($$0, $$1, $$2, $$4, $$3, false))
         .filter(Optional::isPresent)
         .findFirst()
         .orElse(Optional.empty());
   }

   public long a(dta $$0, dcv $$1, jd $$2, boolean $$3) {
      return ji.a().filter($$1x -> this.b.b($$0, $$1x)).map($$4 -> this.a($$0, $$1, $$2, $$4, $$3)).reduce(0L, Long::sum);
   }

   public Optional<dkx.c> a(dta $$0, dcv $$1, jd $$2, ji $$3, ayv $$4, boolean $$5) {
      return ji.a($$4).stream().map($$5x -> this.a($$0, $$1, $$2, $$3, $$5x, $$5)).filter(Optional::isPresent).findFirst().orElse(Optional.empty());
   }

   private long a(dta $$0, dcv $$1, jd $$2, ji $$3, boolean $$4) {
      return ji.a().map($$5 -> this.a($$0, $$1, $$2, $$3, $$5, $$4)).filter(Optional::isPresent).count();
   }

   @VisibleForTesting
   public Optional<dkx.c> a(dta $$0, dcv $$1, jd $$2, ji $$3, ji $$4, boolean $$5) {
      return this.a($$0, $$1, $$2, $$3, $$4, this.b::a).flatMap($$2x -> this.a($$1, $$2x, $$5));
   }

   public Optional<dkx.c> a(dta $$0, dca $$1, jd $$2, ji $$3, ji $$4, dkx.d $$5) {
      if ($$4.o() == $$3.o()) {
         return Optional.empty();
      } else if (this.b.a($$0) || this.b.a($$0, $$3) && !this.b.a($$0, $$4)) {
         for (dkx.e $$6 : this.b.a()) {
            dkx.c $$7 = $$6.a($$2, $$4, $$3);
            if ($$5.test($$1, $$2, $$7)) {
               return Optional.of($$7);
            }
         }

         return Optional.empty();
      } else {
         return Optional.empty();
      }
   }

   public Optional<dkx.c> a(dcv $$0, dkx.c $$1, boolean $$2) {
      dta $$3 = $$0.a_($$1.a());
      return this.b.a($$0, $$1, $$3, $$2) ? Optional.of($$1) : Optional.empty();
   }

   public static class a implements dkx.b {
      protected dkw a;

      public a(dkw $$0) {
         this.a = $$0;
      }

      @Nullable
      @Override
      public dta a(dta $$0, dca $$1, jd $$2, ji $$3) {
         return this.a.c($$0, $$1, $$2, $$3);
      }

      protected boolean a(dca $$0, jd $$1, jd $$2, ji $$3, dta $$4) {
         return $$4.i() || $$4.a(this.a) || $$4.a(dfy.G) && $$4.u().b();
      }

      @Override
      public boolean a(dca $$0, jd $$1, dkx.c $$2) {
         dta $$3 = $$0.a_($$2.a());
         return this.a($$0, $$1, $$2.a(), $$2.b(), $$3) && this.a.a($$0, $$3, $$2.a(), $$2.b());
      }
   }

   public interface b {
      @Nullable
      dta a(dta var1, dca var2, jd var3, ji var4);

      boolean a(dca var1, jd var2, dkx.c var3);

      default dkx.e[] a() {
         return dkx.a;
      }

      default boolean a(dta $$0, ji $$1) {
         return dkw.a($$0, $$1);
      }

      default boolean a(dta $$0) {
         return false;
      }

      default boolean b(dta $$0, ji $$1) {
         return this.a($$0) || this.a($$0, $$1);
      }

      default boolean a(dcv $$0, dkx.c $$1, dta $$2, boolean $$3) {
         dta $$4 = this.a($$2, $$0, $$1.a(), $$1.b());
         if ($$4 != null) {
            if ($$3) {
               $$0.y($$1.a()).e($$1.a());
            }

            return $$0.a($$1.a(), $$4, 2);
         } else {
            return false;
         }
      }
   }

   public static record c(jd a, ji b) {
   }

   @FunctionalInterface
   public interface d {
      boolean test(dca var1, jd var2, dkx.c var3);
   }

   public static enum e {
      a {
         @Override
         public dkx.c a(jd $$0, ji $$1, ji $$2) {
            return new dkx.c($$0, $$1);
         }
      },
      b {
         @Override
         public dkx.c a(jd $$0, ji $$1, ji $$2) {
            return new dkx.c($$0.a($$1), $$2);
         }
      },
      c {
         @Override
         public dkx.c a(jd $$0, ji $$1, ji $$2) {
            return new dkx.c($$0.a($$1).a($$2), $$1.g());
         }
      };

      public abstract dkx.c a(jd var1, ji var2, ji var3);
   }
}
