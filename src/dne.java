import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import javax.annotation.Nullable;

public class dne {
   public static final dne.e[] a = new dne.e[]{dne.e.a, dne.e.b, dne.e.c};
   private final dne.b b;

   public dne(dnd $$0) {
      this(new dne.a($$0));
   }

   public dne(dne.b $$0) {
      this.b = $$0;
   }

   public boolean a(dvj $$0, deg $$1, jh $$2, jm $$3) {
      return jm.a().anyMatch($$4 -> this.a($$0, $$1, $$2, $$3, $$4, this.b::a).isPresent());
   }

   public Optional<dne.c> a(dvj $$0, dfc $$1, jh $$2, azs $$3) {
      return jm.a($$3)
         .stream()
         .filter($$1x -> this.b.b($$0, $$1x))
         .map($$4 -> this.a($$0, $$1, $$2, $$4, $$3, false))
         .filter(Optional::isPresent)
         .findFirst()
         .orElse(Optional.empty());
   }

   public long a(dvj $$0, dfc $$1, jh $$2, boolean $$3) {
      return jm.a().filter($$1x -> this.b.b($$0, $$1x)).map($$4 -> this.a($$0, $$1, $$2, $$4, $$3)).reduce(0L, Long::sum);
   }

   public Optional<dne.c> a(dvj $$0, dfc $$1, jh $$2, jm $$3, azs $$4, boolean $$5) {
      return jm.a($$4).stream().map($$5x -> this.a($$0, $$1, $$2, $$3, $$5x, $$5)).filter(Optional::isPresent).findFirst().orElse(Optional.empty());
   }

   private long a(dvj $$0, dfc $$1, jh $$2, jm $$3, boolean $$4) {
      return jm.a().map($$5 -> this.a($$0, $$1, $$2, $$3, $$5, $$4)).filter(Optional::isPresent).count();
   }

   @VisibleForTesting
   public Optional<dne.c> a(dvj $$0, dfc $$1, jh $$2, jm $$3, jm $$4, boolean $$5) {
      return this.a($$0, $$1, $$2, $$3, $$4, this.b::a).flatMap($$2x -> this.a($$1, $$2x, $$5));
   }

   public Optional<dne.c> a(dvj $$0, deg $$1, jh $$2, jm $$3, jm $$4, dne.d $$5) {
      if ($$4.o() == $$3.o()) {
         return Optional.empty();
      } else if (this.b.a($$0) || this.b.a($$0, $$3) && !this.b.a($$0, $$4)) {
         for (dne.e $$6 : this.b.a()) {
            dne.c $$7 = $$6.a($$2, $$4, $$3);
            if ($$5.test($$1, $$2, $$7)) {
               return Optional.of($$7);
            }
         }

         return Optional.empty();
      } else {
         return Optional.empty();
      }
   }

   public Optional<dne.c> a(dfc $$0, dne.c $$1, boolean $$2) {
      dvj $$3 = $$0.a_($$1.a());
      return this.b.a($$0, $$1, $$3, $$2) ? Optional.of($$1) : Optional.empty();
   }

   public static class a implements dne.b {
      protected dnd a;

      public a(dnd $$0) {
         this.a = $$0;
      }

      @Nullable
      @Override
      public dvj a(dvj $$0, deg $$1, jh $$2, jm $$3) {
         return this.a.c($$0, $$1, $$2, $$3);
      }

      protected boolean a(deg $$0, jh $$1, jh $$2, jm $$3, dvj $$4) {
         return $$4.l() || $$4.a(this.a) || $$4.a(dig.G) && $$4.y().b();
      }

      @Override
      public boolean a(deg $$0, jh $$1, dne.c $$2) {
         dvj $$3 = $$0.a_($$2.a());
         return this.a($$0, $$1, $$2.a(), $$2.b(), $$3) && this.a.a($$0, $$3, $$2.a(), $$2.b());
      }
   }

   public interface b {
      @Nullable
      dvj a(dvj var1, deg var2, jh var3, jm var4);

      boolean a(deg var1, jh var2, dne.c var3);

      default dne.e[] a() {
         return dne.a;
      }

      default boolean a(dvj $$0, jm $$1) {
         return dnd.a($$0, $$1);
      }

      default boolean a(dvj $$0) {
         return false;
      }

      default boolean b(dvj $$0, jm $$1) {
         return this.a($$0) || this.a($$0, $$1);
      }

      default boolean a(dfc $$0, dne.c $$1, dvj $$2, boolean $$3) {
         dvj $$4 = this.a($$2, $$0, $$1.a(), $$1.b());
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

   public static record c(jh a, jm b) {
   }

   @FunctionalInterface
   public interface d {
      boolean test(deg var1, jh var2, dne.c var3);
   }

   public static enum e {
      a {
         @Override
         public dne.c a(jh $$0, jm $$1, jm $$2) {
            return new dne.c($$0, $$1);
         }
      },
      b {
         @Override
         public dne.c a(jh $$0, jm $$1, jm $$2) {
            return new dne.c($$0.a($$1), $$2);
         }
      },
      c {
         @Override
         public dne.c a(jh $$0, jm $$1, jm $$2) {
            return new dne.c($$0.a($$1).a($$2), $$1.g());
         }
      };

      public abstract dne.c a(jh var1, jm var2, jm var3);
   }
}
