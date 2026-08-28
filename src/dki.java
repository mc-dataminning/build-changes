import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import javax.annotation.Nullable;

public class dki {
   public static final dki.e[] a = new dki.e[]{dki.e.a, dki.e.b, dki.e.c};
   private final dki.b b;

   public dki(dkh $$0) {
      this(new dki.a($$0));
   }

   public dki(dki.b $$0) {
      this.b = $$0;
   }

   public boolean a(dsk $$0, dbl $$1, ja $$2, jf $$3) {
      return jf.a().anyMatch($$4 -> this.a($$0, $$1, $$2, $$3, $$4, this.b::a).isPresent());
   }

   public Optional<dki.c> a(dsk $$0, dcg $$1, ja $$2, ayo $$3) {
      return jf.a($$3)
         .stream()
         .filter($$1x -> this.b.b($$0, $$1x))
         .map($$4 -> this.a($$0, $$1, $$2, $$4, $$3, false))
         .filter(Optional::isPresent)
         .findFirst()
         .orElse(Optional.empty());
   }

   public long a(dsk $$0, dcg $$1, ja $$2, boolean $$3) {
      return jf.a().filter($$1x -> this.b.b($$0, $$1x)).map($$4 -> this.a($$0, $$1, $$2, $$4, $$3)).reduce(0L, Long::sum);
   }

   public Optional<dki.c> a(dsk $$0, dcg $$1, ja $$2, jf $$3, ayo $$4, boolean $$5) {
      return jf.a($$4).stream().map($$5x -> this.a($$0, $$1, $$2, $$3, $$5x, $$5)).filter(Optional::isPresent).findFirst().orElse(Optional.empty());
   }

   private long a(dsk $$0, dcg $$1, ja $$2, jf $$3, boolean $$4) {
      return jf.a().map($$5 -> this.a($$0, $$1, $$2, $$3, $$5, $$4)).filter(Optional::isPresent).count();
   }

   @VisibleForTesting
   public Optional<dki.c> a(dsk $$0, dcg $$1, ja $$2, jf $$3, jf $$4, boolean $$5) {
      return this.a($$0, $$1, $$2, $$3, $$4, this.b::a).flatMap($$2x -> this.a($$1, $$2x, $$5));
   }

   public Optional<dki.c> a(dsk $$0, dbl $$1, ja $$2, jf $$3, jf $$4, dki.d $$5) {
      if ($$4.o() == $$3.o()) {
         return Optional.empty();
      } else if (this.b.a($$0) || this.b.a($$0, $$3) && !this.b.a($$0, $$4)) {
         for (dki.e $$6 : this.b.a()) {
            dki.c $$7 = $$6.a($$2, $$4, $$3);
            if ($$5.test($$1, $$2, $$7)) {
               return Optional.of($$7);
            }
         }

         return Optional.empty();
      } else {
         return Optional.empty();
      }
   }

   public Optional<dki.c> a(dcg $$0, dki.c $$1, boolean $$2) {
      dsk $$3 = $$0.a_($$1.a());
      return this.b.a($$0, $$1, $$3, $$2) ? Optional.of($$1) : Optional.empty();
   }

   public static class a implements dki.b {
      protected dkh a;

      public a(dkh $$0) {
         this.a = $$0;
      }

      @Nullable
      @Override
      public dsk a(dsk $$0, dbl $$1, ja $$2, jf $$3) {
         return this.a.c($$0, $$1, $$2, $$3);
      }

      protected boolean a(dbl $$0, ja $$1, ja $$2, jf $$3, dsk $$4) {
         return $$4.i() || $$4.a(this.a) || $$4.a(dfj.G) && $$4.u().b();
      }

      @Override
      public boolean a(dbl $$0, ja $$1, dki.c $$2) {
         dsk $$3 = $$0.a_($$2.a());
         return this.a($$0, $$1, $$2.a(), $$2.b(), $$3) && this.a.a($$0, $$3, $$2.a(), $$2.b());
      }
   }

   public interface b {
      @Nullable
      dsk a(dsk var1, dbl var2, ja var3, jf var4);

      boolean a(dbl var1, ja var2, dki.c var3);

      default dki.e[] a() {
         return dki.a;
      }

      default boolean a(dsk $$0, jf $$1) {
         return dkh.a($$0, $$1);
      }

      default boolean a(dsk $$0) {
         return false;
      }

      default boolean b(dsk $$0, jf $$1) {
         return this.a($$0) || this.a($$0, $$1);
      }

      default boolean a(dcg $$0, dki.c $$1, dsk $$2, boolean $$3) {
         dsk $$4 = this.a($$2, $$0, $$1.a(), $$1.b());
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

   public static record c(ja a, jf b) {
   }

   @FunctionalInterface
   public interface d {
      boolean test(dbl var1, ja var2, dki.c var3);
   }

   public static enum e {
      a {
         @Override
         public dki.c a(ja $$0, jf $$1, jf $$2) {
            return new dki.c($$0, $$1);
         }
      },
      b {
         @Override
         public dki.c a(ja $$0, jf $$1, jf $$2) {
            return new dki.c($$0.a($$1), $$2);
         }
      },
      c {
         @Override
         public dki.c a(ja $$0, jf $$1, jf $$2) {
            return new dki.c($$0.a($$1).a($$2), $$1.g());
         }
      };

      public abstract dki.c a(ja var1, jf var2, jf var3);
   }
}
