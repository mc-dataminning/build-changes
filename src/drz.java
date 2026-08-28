import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import javax.annotation.Nullable;

public class drz {
   public static final drz.e[] a = new drz.e[]{drz.e.a, drz.e.b, drz.e.c};
   private final drz.b b;

   public drz(drx $$0) {
      this(new drz.a($$0));
   }

   public drz(drz.b $$0) {
      this.b = $$0;
   }

   public boolean a(eat $$0, diq $$1, iv $$2, jb $$3) {
      return jb.a().anyMatch($$4 -> this.a($$0, $$1, $$2, $$3, $$4, this.b::a).isPresent());
   }

   public Optional<drz.c> a(eat $$0, djn $$1, iv $$2, azv $$3) {
      return jb.a($$3)
         .stream()
         .filter($$1x -> this.b.b($$0, $$1x))
         .map($$4 -> this.a($$0, $$1, $$2, $$4, $$3, false))
         .filter(Optional::isPresent)
         .findFirst()
         .orElse(Optional.empty());
   }

   public long a(eat $$0, djn $$1, iv $$2, boolean $$3) {
      return jb.a().filter($$1x -> this.b.b($$0, $$1x)).map($$4 -> this.a($$0, $$1, $$2, $$4, $$3)).reduce(0L, Long::sum);
   }

   public Optional<drz.c> a(eat $$0, djn $$1, iv $$2, jb $$3, azv $$4, boolean $$5) {
      return jb.a($$4).stream().map($$5x -> this.a($$0, $$1, $$2, $$3, $$5x, $$5)).filter(Optional::isPresent).findFirst().orElse(Optional.empty());
   }

   private long a(eat $$0, djn $$1, iv $$2, jb $$3, boolean $$4) {
      return jb.a().map($$5 -> this.a($$0, $$1, $$2, $$3, $$5, $$4)).filter(Optional::isPresent).count();
   }

   @VisibleForTesting
   public Optional<drz.c> a(eat $$0, djn $$1, iv $$2, jb $$3, jb $$4, boolean $$5) {
      return this.a($$0, $$1, $$2, $$3, $$4, this.b::a).flatMap($$2x -> this.a($$1, $$2x, $$5));
   }

   public Optional<drz.c> a(eat $$0, diq $$1, iv $$2, jb $$3, jb $$4, drz.d $$5) {
      if ($$4.o() == $$3.o()) {
         return Optional.empty();
      } else if (this.b.a($$0) || this.b.a($$0, $$3) && !this.b.a($$0, $$4)) {
         for (drz.e $$6 : this.b.a()) {
            drz.c $$7 = $$6.a($$2, $$4, $$3);
            if ($$5.test($$1, $$2, $$7)) {
               return Optional.of($$7);
            }
         }

         return Optional.empty();
      } else {
         return Optional.empty();
      }
   }

   public Optional<drz.c> a(djn $$0, drz.c $$1, boolean $$2) {
      eat $$3 = $$0.a_($$1.a());
      return this.b.a($$0, $$1, $$3, $$2) ? Optional.of($$1) : Optional.empty();
   }

   public static class a implements drz.b {
      protected drx a;

      public a(drx $$0) {
         this.a = $$0;
      }

      @Nullable
      @Override
      public eat a(eat $$0, diq $$1, iv $$2, jb $$3) {
         return this.a.c($$0, $$1, $$2, $$3);
      }

      protected boolean a(diq $$0, iv $$1, iv $$2, jb $$3, eat $$4) {
         return $$4.l() || $$4.a(this.a) || $$4.a(dmt.J) && $$4.y().b();
      }

      @Override
      public boolean a(diq $$0, iv $$1, drz.c $$2) {
         eat $$3 = $$0.a_($$2.a());
         return this.a($$0, $$1, $$2.a(), $$2.b(), $$3) && this.a.a($$0, $$3, $$2.a(), $$2.b());
      }
   }

   public interface b {
      @Nullable
      eat a(eat var1, diq var2, iv var3, jb var4);

      boolean a(diq var1, iv var2, drz.c var3);

      default drz.e[] a() {
         return drz.a;
      }

      default boolean a(eat $$0, jb $$1) {
         return drx.a($$0, $$1);
      }

      default boolean a(eat $$0) {
         return false;
      }

      default boolean b(eat $$0, jb $$1) {
         return this.a($$0) || this.a($$0, $$1);
      }

      default boolean a(djn $$0, drz.c $$1, eat $$2, boolean $$3) {
         eat $$4 = this.a($$2, $$0, $$1.a(), $$1.b());
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
      boolean test(diq var1, iv var2, drz.c var3);
   }

   public static enum e {
      a {
         @Override
         public drz.c a(iv $$0, jb $$1, jb $$2) {
            return new drz.c($$0, $$1);
         }
      },
      b {
         @Override
         public drz.c a(iv $$0, jb $$1, jb $$2) {
            return new drz.c($$0.a($$1), $$2);
         }
      },
      c {
         @Override
         public drz.c a(iv $$0, jb $$1, jb $$2) {
            return new drz.c($$0.a($$1).a($$2), $$1.g());
         }
      };

      public abstract drz.c a(iv var1, jb var2, jb var3);
   }
}
