import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import javax.annotation.Nullable;

public class dlw {
   public static final dlw.e[] a = new dlw.e[]{dlw.e.a, dlw.e.b, dlw.e.c};
   private final dlw.b b;

   public dlw(dlv $$0) {
      this(new dlw.a($$0));
   }

   public dlw(dlw.b $$0) {
      this.b = $$0;
   }

   public boolean a(dua $$0, dcx $$1, je $$2, jj $$3) {
      return jj.a().anyMatch($$4 -> this.a($$0, $$1, $$2, $$3, $$4, this.b::a).isPresent());
   }

   public Optional<dlw.c> a(dua $$0, ddt $$1, je $$2, azk $$3) {
      return jj.a($$3)
         .stream()
         .filter($$1x -> this.b.b($$0, $$1x))
         .map($$4 -> this.a($$0, $$1, $$2, $$4, $$3, false))
         .filter(Optional::isPresent)
         .findFirst()
         .orElse(Optional.empty());
   }

   public long a(dua $$0, ddt $$1, je $$2, boolean $$3) {
      return jj.a().filter($$1x -> this.b.b($$0, $$1x)).map($$4 -> this.a($$0, $$1, $$2, $$4, $$3)).reduce(0L, Long::sum);
   }

   public Optional<dlw.c> a(dua $$0, ddt $$1, je $$2, jj $$3, azk $$4, boolean $$5) {
      return jj.a($$4).stream().map($$5x -> this.a($$0, $$1, $$2, $$3, $$5x, $$5)).filter(Optional::isPresent).findFirst().orElse(Optional.empty());
   }

   private long a(dua $$0, ddt $$1, je $$2, jj $$3, boolean $$4) {
      return jj.a().map($$5 -> this.a($$0, $$1, $$2, $$3, $$5, $$4)).filter(Optional::isPresent).count();
   }

   @VisibleForTesting
   public Optional<dlw.c> a(dua $$0, ddt $$1, je $$2, jj $$3, jj $$4, boolean $$5) {
      return this.a($$0, $$1, $$2, $$3, $$4, this.b::a).flatMap($$2x -> this.a($$1, $$2x, $$5));
   }

   public Optional<dlw.c> a(dua $$0, dcx $$1, je $$2, jj $$3, jj $$4, dlw.d $$5) {
      if ($$4.o() == $$3.o()) {
         return Optional.empty();
      } else if (this.b.a($$0) || this.b.a($$0, $$3) && !this.b.a($$0, $$4)) {
         for (dlw.e $$6 : this.b.a()) {
            dlw.c $$7 = $$6.a($$2, $$4, $$3);
            if ($$5.test($$1, $$2, $$7)) {
               return Optional.of($$7);
            }
         }

         return Optional.empty();
      } else {
         return Optional.empty();
      }
   }

   public Optional<dlw.c> a(ddt $$0, dlw.c $$1, boolean $$2) {
      dua $$3 = $$0.a_($$1.a());
      return this.b.a($$0, $$1, $$3, $$2) ? Optional.of($$1) : Optional.empty();
   }

   public static class a implements dlw.b {
      protected dlv a;

      public a(dlv $$0) {
         this.a = $$0;
      }

      @Nullable
      @Override
      public dua a(dua $$0, dcx $$1, je $$2, jj $$3) {
         return this.a.c($$0, $$1, $$2, $$3);
      }

      protected boolean a(dcx $$0, je $$1, je $$2, jj $$3, dua $$4) {
         return $$4.l() || $$4.a(this.a) || $$4.a(dgx.G) && $$4.y().b();
      }

      @Override
      public boolean a(dcx $$0, je $$1, dlw.c $$2) {
         dua $$3 = $$0.a_($$2.a());
         return this.a($$0, $$1, $$2.a(), $$2.b(), $$3) && this.a.a($$0, $$3, $$2.a(), $$2.b());
      }
   }

   public interface b {
      @Nullable
      dua a(dua var1, dcx var2, je var3, jj var4);

      boolean a(dcx var1, je var2, dlw.c var3);

      default dlw.e[] a() {
         return dlw.a;
      }

      default boolean a(dua $$0, jj $$1) {
         return dlv.a($$0, $$1);
      }

      default boolean a(dua $$0) {
         return false;
      }

      default boolean b(dua $$0, jj $$1) {
         return this.a($$0) || this.a($$0, $$1);
      }

      default boolean a(ddt $$0, dlw.c $$1, dua $$2, boolean $$3) {
         dua $$4 = this.a($$2, $$0, $$1.a(), $$1.b());
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

   public static record c(je a, jj b) {
   }

   @FunctionalInterface
   public interface d {
      boolean test(dcx var1, je var2, dlw.c var3);
   }

   public static enum e {
      a {
         @Override
         public dlw.c a(je $$0, jj $$1, jj $$2) {
            return new dlw.c($$0, $$1);
         }
      },
      b {
         @Override
         public dlw.c a(je $$0, jj $$1, jj $$2) {
            return new dlw.c($$0.a($$1), $$2);
         }
      },
      c {
         @Override
         public dlw.c a(je $$0, jj $$1, jj $$2) {
            return new dlw.c($$0.a($$1).a($$2), $$1.g());
         }
      };

      public abstract dlw.c a(je var1, jj var2, jj var3);
   }
}
