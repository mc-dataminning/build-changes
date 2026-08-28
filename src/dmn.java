import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import javax.annotation.Nullable;

public class dmn {
   public static final dmn.e[] a = new dmn.e[]{dmn.e.a, dmn.e.b, dmn.e.c};
   private final dmn.b b;

   public dmn(dmm $$0) {
      this(new dmn.a($$0));
   }

   public dmn(dmn.b $$0) {
      this.b = $$0;
   }

   public boolean a(dus $$0, ddo $$1, jf $$2, jk $$3) {
      return jk.a().anyMatch($$4 -> this.a($$0, $$1, $$2, $$3, $$4, this.b::a).isPresent());
   }

   public Optional<dmn.c> a(dus $$0, dek $$1, jf $$2, azn $$3) {
      return jk.a($$3)
         .stream()
         .filter($$1x -> this.b.b($$0, $$1x))
         .map($$4 -> this.a($$0, $$1, $$2, $$4, $$3, false))
         .filter(Optional::isPresent)
         .findFirst()
         .orElse(Optional.empty());
   }

   public long a(dus $$0, dek $$1, jf $$2, boolean $$3) {
      return jk.a().filter($$1x -> this.b.b($$0, $$1x)).map($$4 -> this.a($$0, $$1, $$2, $$4, $$3)).reduce(0L, Long::sum);
   }

   public Optional<dmn.c> a(dus $$0, dek $$1, jf $$2, jk $$3, azn $$4, boolean $$5) {
      return jk.a($$4).stream().map($$5x -> this.a($$0, $$1, $$2, $$3, $$5x, $$5)).filter(Optional::isPresent).findFirst().orElse(Optional.empty());
   }

   private long a(dus $$0, dek $$1, jf $$2, jk $$3, boolean $$4) {
      return jk.a().map($$5 -> this.a($$0, $$1, $$2, $$3, $$5, $$4)).filter(Optional::isPresent).count();
   }

   @VisibleForTesting
   public Optional<dmn.c> a(dus $$0, dek $$1, jf $$2, jk $$3, jk $$4, boolean $$5) {
      return this.a($$0, $$1, $$2, $$3, $$4, this.b::a).flatMap($$2x -> this.a($$1, $$2x, $$5));
   }

   public Optional<dmn.c> a(dus $$0, ddo $$1, jf $$2, jk $$3, jk $$4, dmn.d $$5) {
      if ($$4.o() == $$3.o()) {
         return Optional.empty();
      } else if (this.b.a($$0) || this.b.a($$0, $$3) && !this.b.a($$0, $$4)) {
         for (dmn.e $$6 : this.b.a()) {
            dmn.c $$7 = $$6.a($$2, $$4, $$3);
            if ($$5.test($$1, $$2, $$7)) {
               return Optional.of($$7);
            }
         }

         return Optional.empty();
      } else {
         return Optional.empty();
      }
   }

   public Optional<dmn.c> a(dek $$0, dmn.c $$1, boolean $$2) {
      dus $$3 = $$0.a_($$1.a());
      return this.b.a($$0, $$1, $$3, $$2) ? Optional.of($$1) : Optional.empty();
   }

   public static class a implements dmn.b {
      protected dmm a;

      public a(dmm $$0) {
         this.a = $$0;
      }

      @Nullable
      @Override
      public dus a(dus $$0, ddo $$1, jf $$2, jk $$3) {
         return this.a.c($$0, $$1, $$2, $$3);
      }

      protected boolean a(ddo $$0, jf $$1, jf $$2, jk $$3, dus $$4) {
         return $$4.l() || $$4.a(this.a) || $$4.a(dho.G) && $$4.y().b();
      }

      @Override
      public boolean a(ddo $$0, jf $$1, dmn.c $$2) {
         dus $$3 = $$0.a_($$2.a());
         return this.a($$0, $$1, $$2.a(), $$2.b(), $$3) && this.a.a($$0, $$3, $$2.a(), $$2.b());
      }
   }

   public interface b {
      @Nullable
      dus a(dus var1, ddo var2, jf var3, jk var4);

      boolean a(ddo var1, jf var2, dmn.c var3);

      default dmn.e[] a() {
         return dmn.a;
      }

      default boolean a(dus $$0, jk $$1) {
         return dmm.a($$0, $$1);
      }

      default boolean a(dus $$0) {
         return false;
      }

      default boolean b(dus $$0, jk $$1) {
         return this.a($$0) || this.a($$0, $$1);
      }

      default boolean a(dek $$0, dmn.c $$1, dus $$2, boolean $$3) {
         dus $$4 = this.a($$2, $$0, $$1.a(), $$1.b());
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

   public static record c(jf a, jk b) {
   }

   @FunctionalInterface
   public interface d {
      boolean test(ddo var1, jf var2, dmn.c var3);
   }

   public static enum e {
      a {
         @Override
         public dmn.c a(jf $$0, jk $$1, jk $$2) {
            return new dmn.c($$0, $$1);
         }
      },
      b {
         @Override
         public dmn.c a(jf $$0, jk $$1, jk $$2) {
            return new dmn.c($$0.a($$1), $$2);
         }
      },
      c {
         @Override
         public dmn.c a(jf $$0, jk $$1, jk $$2) {
            return new dmn.c($$0.a($$1).a($$2), $$1.g());
         }
      };

      public abstract dmn.c a(jf var1, jk var2, jk var3);
   }
}
