import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import javax.annotation.Nullable;

public class dpk {
   public static final dpk.e[] a = new dpk.e[]{dpk.e.a, dpk.e.b, dpk.e.c};
   private final dpk.b b;

   public dpk(dpi $$0) {
      this(new dpk.a($$0));
   }

   public dpk(dpk.b $$0) {
      this.b = $$0;
   }

   public boolean a(dxq $$0, dgf $$1, ji $$2, jn $$3) {
      return jn.a().anyMatch($$4 -> this.a($$0, $$1, $$2, $$3, $$4, this.b::a).isPresent());
   }

   public Optional<dpk.c> a(dxq $$0, dha $$1, ji $$2, azh $$3) {
      return jn.a($$3)
         .stream()
         .filter($$1x -> this.b.b($$0, $$1x))
         .map($$4 -> this.a($$0, $$1, $$2, $$4, $$3, false))
         .filter(Optional::isPresent)
         .findFirst()
         .orElse(Optional.empty());
   }

   public long a(dxq $$0, dha $$1, ji $$2, boolean $$3) {
      return jn.a().filter($$1x -> this.b.b($$0, $$1x)).map($$4 -> this.a($$0, $$1, $$2, $$4, $$3)).reduce(0L, Long::sum);
   }

   public Optional<dpk.c> a(dxq $$0, dha $$1, ji $$2, jn $$3, azh $$4, boolean $$5) {
      return jn.a($$4).stream().map($$5x -> this.a($$0, $$1, $$2, $$3, $$5x, $$5)).filter(Optional::isPresent).findFirst().orElse(Optional.empty());
   }

   private long a(dxq $$0, dha $$1, ji $$2, jn $$3, boolean $$4) {
      return jn.a().map($$5 -> this.a($$0, $$1, $$2, $$3, $$5, $$4)).filter(Optional::isPresent).count();
   }

   @VisibleForTesting
   public Optional<dpk.c> a(dxq $$0, dha $$1, ji $$2, jn $$3, jn $$4, boolean $$5) {
      return this.a($$0, $$1, $$2, $$3, $$4, this.b::a).flatMap($$2x -> this.a($$1, $$2x, $$5));
   }

   public Optional<dpk.c> a(dxq $$0, dgf $$1, ji $$2, jn $$3, jn $$4, dpk.d $$5) {
      if ($$4.o() == $$3.o()) {
         return Optional.empty();
      } else if (this.b.a($$0) || this.b.a($$0, $$3) && !this.b.a($$0, $$4)) {
         for (dpk.e $$6 : this.b.a()) {
            dpk.c $$7 = $$6.a($$2, $$4, $$3);
            if ($$5.test($$1, $$2, $$7)) {
               return Optional.of($$7);
            }
         }

         return Optional.empty();
      } else {
         return Optional.empty();
      }
   }

   public Optional<dpk.c> a(dha $$0, dpk.c $$1, boolean $$2) {
      dxq $$3 = $$0.a_($$1.a());
      return this.b.a($$0, $$1, $$3, $$2) ? Optional.of($$1) : Optional.empty();
   }

   public static class a implements dpk.b {
      protected dpi a;

      public a(dpi $$0) {
         this.a = $$0;
      }

      @Nullable
      @Override
      public dxq a(dxq $$0, dgf $$1, ji $$2, jn $$3) {
         return this.a.c($$0, $$1, $$2, $$3);
      }

      protected boolean a(dgf $$0, ji $$1, ji $$2, jn $$3, dxq $$4) {
         return $$4.l() || $$4.a(this.a) || $$4.a(dkg.J) && $$4.y().b();
      }

      @Override
      public boolean a(dgf $$0, ji $$1, dpk.c $$2) {
         dxq $$3 = $$0.a_($$2.a());
         return this.a($$0, $$1, $$2.a(), $$2.b(), $$3) && this.a.a($$0, $$3, $$2.a(), $$2.b());
      }
   }

   public interface b {
      @Nullable
      dxq a(dxq var1, dgf var2, ji var3, jn var4);

      boolean a(dgf var1, ji var2, dpk.c var3);

      default dpk.e[] a() {
         return dpk.a;
      }

      default boolean a(dxq $$0, jn $$1) {
         return dpi.a($$0, $$1);
      }

      default boolean a(dxq $$0) {
         return false;
      }

      default boolean b(dxq $$0, jn $$1) {
         return this.a($$0) || this.a($$0, $$1);
      }

      default boolean a(dha $$0, dpk.c $$1, dxq $$2, boolean $$3) {
         dxq $$4 = this.a($$2, $$0, $$1.a(), $$1.b());
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
      boolean test(dgf var1, ji var2, dpk.c var3);
   }

   public static enum e {
      a {
         @Override
         public dpk.c a(ji $$0, jn $$1, jn $$2) {
            return new dpk.c($$0, $$1);
         }
      },
      b {
         @Override
         public dpk.c a(ji $$0, jn $$1, jn $$2) {
            return new dpk.c($$0.a($$1), $$2);
         }
      },
      c {
         @Override
         public dpk.c a(ji $$0, jn $$1, jn $$2) {
            return new dpk.c($$0.a($$1).a($$2), $$1.g());
         }
      };

      public abstract dpk.c a(ji var1, jn var2, jn var3);
   }
}
