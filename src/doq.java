import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import javax.annotation.Nullable;

public class doq {
   public static final doq.e[] a = new doq.e[]{doq.e.a, doq.e.b, doq.e.c};
   private final doq.b b;

   public doq(doo $$0) {
      this(new doq.a($$0));
   }

   public doq(doq.b $$0) {
      this.b = $$0;
   }

   public boolean a(dwx $$0, dfn $$1, ji $$2, jn $$3) {
      return jn.a().anyMatch($$4 -> this.a($$0, $$1, $$2, $$3, $$4, this.b::a).isPresent());
   }

   public Optional<doq.c> a(dwx $$0, dgj $$1, ji $$2, azh $$3) {
      return jn.a($$3)
         .stream()
         .filter($$1x -> this.b.b($$0, $$1x))
         .map($$4 -> this.a($$0, $$1, $$2, $$4, $$3, false))
         .filter(Optional::isPresent)
         .findFirst()
         .orElse(Optional.empty());
   }

   public long a(dwx $$0, dgj $$1, ji $$2, boolean $$3) {
      return jn.a().filter($$1x -> this.b.b($$0, $$1x)).map($$4 -> this.a($$0, $$1, $$2, $$4, $$3)).reduce(0L, Long::sum);
   }

   public Optional<doq.c> a(dwx $$0, dgj $$1, ji $$2, jn $$3, azh $$4, boolean $$5) {
      return jn.a($$4).stream().map($$5x -> this.a($$0, $$1, $$2, $$3, $$5x, $$5)).filter(Optional::isPresent).findFirst().orElse(Optional.empty());
   }

   private long a(dwx $$0, dgj $$1, ji $$2, jn $$3, boolean $$4) {
      return jn.a().map($$5 -> this.a($$0, $$1, $$2, $$3, $$5, $$4)).filter(Optional::isPresent).count();
   }

   @VisibleForTesting
   public Optional<doq.c> a(dwx $$0, dgj $$1, ji $$2, jn $$3, jn $$4, boolean $$5) {
      return this.a($$0, $$1, $$2, $$3, $$4, this.b::a).flatMap($$2x -> this.a($$1, $$2x, $$5));
   }

   public Optional<doq.c> a(dwx $$0, dfn $$1, ji $$2, jn $$3, jn $$4, doq.d $$5) {
      if ($$4.o() == $$3.o()) {
         return Optional.empty();
      } else if (this.b.a($$0) || this.b.a($$0, $$3) && !this.b.a($$0, $$4)) {
         for (doq.e $$6 : this.b.a()) {
            doq.c $$7 = $$6.a($$2, $$4, $$3);
            if ($$5.test($$1, $$2, $$7)) {
               return Optional.of($$7);
            }
         }

         return Optional.empty();
      } else {
         return Optional.empty();
      }
   }

   public Optional<doq.c> a(dgj $$0, doq.c $$1, boolean $$2) {
      dwx $$3 = $$0.a_($$1.a());
      return this.b.a($$0, $$1, $$3, $$2) ? Optional.of($$1) : Optional.empty();
   }

   public static class a implements doq.b {
      protected doo a;

      public a(doo $$0) {
         this.a = $$0;
      }

      @Nullable
      @Override
      public dwx a(dwx $$0, dfn $$1, ji $$2, jn $$3) {
         return this.a.c($$0, $$1, $$2, $$3);
      }

      protected boolean a(dfn $$0, ji $$1, ji $$2, jn $$3, dwx $$4) {
         return $$4.l() || $$4.a(this.a) || $$4.a(djo.J) && $$4.y().b();
      }

      @Override
      public boolean a(dfn $$0, ji $$1, doq.c $$2) {
         dwx $$3 = $$0.a_($$2.a());
         return this.a($$0, $$1, $$2.a(), $$2.b(), $$3) && this.a.a($$0, $$3, $$2.a(), $$2.b());
      }
   }

   public interface b {
      @Nullable
      dwx a(dwx var1, dfn var2, ji var3, jn var4);

      boolean a(dfn var1, ji var2, doq.c var3);

      default doq.e[] a() {
         return doq.a;
      }

      default boolean a(dwx $$0, jn $$1) {
         return doo.a($$0, $$1);
      }

      default boolean a(dwx $$0) {
         return false;
      }

      default boolean b(dwx $$0, jn $$1) {
         return this.a($$0) || this.a($$0, $$1);
      }

      default boolean a(dgj $$0, doq.c $$1, dwx $$2, boolean $$3) {
         dwx $$4 = this.a($$2, $$0, $$1.a(), $$1.b());
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

   public static record c(ji a, jn b) {
   }

   @FunctionalInterface
   public interface d {
      boolean test(dfn var1, ji var2, doq.c var3);
   }

   public static enum e {
      a {
         @Override
         public doq.c a(ji $$0, jn $$1, jn $$2) {
            return new doq.c($$0, $$1);
         }
      },
      b {
         @Override
         public doq.c a(ji $$0, jn $$1, jn $$2) {
            return new doq.c($$0.a($$1), $$2);
         }
      },
      c {
         @Override
         public doq.c a(ji $$0, jn $$1, jn $$2) {
            return new doq.c($$0.a($$1).a($$2), $$1.g());
         }
      };

      public abstract doq.c a(ji var1, jn var2, jn var3);
   }
}
