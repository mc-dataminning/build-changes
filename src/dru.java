import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import javax.annotation.Nullable;

public class dru {
   public static final dru.e[] a = new dru.e[]{dru.e.a, dru.e.b, dru.e.c};
   private final dru.b b;

   public dru(drs $$0) {
      this(new dru.a($$0));
   }

   public dru(dru.b $$0) {
      this.b = $$0;
   }

   public boolean a(eao $$0, din $$1, iv $$2, jb $$3) {
      return jb.a().anyMatch($$4 -> this.a($$0, $$1, $$2, $$3, $$4, this.b::a).isPresent());
   }

   public Optional<dru.c> a(eao $$0, dji $$1, iv $$2, azv $$3) {
      return jb.a($$3)
         .stream()
         .filter($$1x -> this.b.b($$0, $$1x))
         .map($$4 -> this.a($$0, $$1, $$2, $$4, $$3, false))
         .filter(Optional::isPresent)
         .findFirst()
         .orElse(Optional.empty());
   }

   public long a(eao $$0, dji $$1, iv $$2, boolean $$3) {
      return jb.a().filter($$1x -> this.b.b($$0, $$1x)).map($$4 -> this.a($$0, $$1, $$2, $$4, $$3)).reduce(0L, Long::sum);
   }

   public Optional<dru.c> a(eao $$0, dji $$1, iv $$2, jb $$3, azv $$4, boolean $$5) {
      return jb.a($$4).stream().map($$5x -> this.a($$0, $$1, $$2, $$3, $$5x, $$5)).filter(Optional::isPresent).findFirst().orElse(Optional.empty());
   }

   private long a(eao $$0, dji $$1, iv $$2, jb $$3, boolean $$4) {
      return jb.a().map($$5 -> this.a($$0, $$1, $$2, $$3, $$5, $$4)).filter(Optional::isPresent).count();
   }

   @VisibleForTesting
   public Optional<dru.c> a(eao $$0, dji $$1, iv $$2, jb $$3, jb $$4, boolean $$5) {
      return this.a($$0, $$1, $$2, $$3, $$4, this.b::a).flatMap($$2x -> this.a($$1, $$2x, $$5));
   }

   public Optional<dru.c> a(eao $$0, din $$1, iv $$2, jb $$3, jb $$4, dru.d $$5) {
      if ($$4.o() == $$3.o()) {
         return Optional.empty();
      } else if (this.b.a($$0) || this.b.a($$0, $$3) && !this.b.a($$0, $$4)) {
         for (dru.e $$6 : this.b.a()) {
            dru.c $$7 = $$6.a($$2, $$4, $$3);
            if ($$5.test($$1, $$2, $$7)) {
               return Optional.of($$7);
            }
         }

         return Optional.empty();
      } else {
         return Optional.empty();
      }
   }

   public Optional<dru.c> a(dji $$0, dru.c $$1, boolean $$2) {
      eao $$3 = $$0.a_($$1.a());
      return this.b.a($$0, $$1, $$3, $$2) ? Optional.of($$1) : Optional.empty();
   }

   public static class a implements dru.b {
      protected drs a;

      public a(drs $$0) {
         this.a = $$0;
      }

      @Nullable
      @Override
      public eao a(eao $$0, din $$1, iv $$2, jb $$3) {
         return this.a.c($$0, $$1, $$2, $$3);
      }

      protected boolean a(din $$0, iv $$1, iv $$2, jb $$3, eao $$4) {
         return $$4.l() || $$4.a(this.a) || $$4.a(dmo.J) && $$4.y().b();
      }

      @Override
      public boolean a(din $$0, iv $$1, dru.c $$2) {
         eao $$3 = $$0.a_($$2.a());
         return this.a($$0, $$1, $$2.a(), $$2.b(), $$3) && this.a.a($$0, $$3, $$2.a(), $$2.b());
      }
   }

   public interface b {
      @Nullable
      eao a(eao var1, din var2, iv var3, jb var4);

      boolean a(din var1, iv var2, dru.c var3);

      default dru.e[] a() {
         return dru.a;
      }

      default boolean a(eao $$0, jb $$1) {
         return drs.a($$0, $$1);
      }

      default boolean a(eao $$0) {
         return false;
      }

      default boolean b(eao $$0, jb $$1) {
         return this.a($$0) || this.a($$0, $$1);
      }

      default boolean a(dji $$0, dru.c $$1, eao $$2, boolean $$3) {
         eao $$4 = this.a($$2, $$0, $$1.a(), $$1.b());
         if ($$4 != null) {
            if ($$3) {
               $$0.z($$1.a()).e($$1.a());
            }

            return $$0.a($$1.a(), $$4, 2);
         } else {
            return false;
         }
      }
   }

   public static record c(iv a, jb b) {
   }

   @FunctionalInterface
   public interface d {
      boolean test(din var1, iv var2, dru.c var3);
   }

   public static enum e {
      a {
         @Override
         public dru.c a(iv $$0, jb $$1, jb $$2) {
            return new dru.c($$0, $$1);
         }
      },
      b {
         @Override
         public dru.c a(iv $$0, jb $$1, jb $$2) {
            return new dru.c($$0.a($$1), $$2);
         }
      },
      c {
         @Override
         public dru.c a(iv $$0, jb $$1, jb $$2) {
            return new dru.c($$0.a($$1).a($$2), $$1.g());
         }
      };

      public abstract dru.c a(iv var1, jb var2, jb var3);
   }
}
