import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import javax.annotation.Nullable;

public class djz {
   public static final djz.e[] a = new djz.e[]{djz.e.a, djz.e.b, djz.e.c};
   private final djz.b b;

   public djz(djy $$0) {
      this(new djz.a($$0));
   }

   public djz(djz.b $$0) {
      this.b = $$0;
   }

   public boolean a(dsb $$0, dbd $$1, iz $$2, je $$3) {
      return je.a().anyMatch($$4 -> this.a($$0, $$1, $$2, $$3, $$4, this.b::a).isPresent());
   }

   public Optional<djz.c> a(dsb $$0, dby $$1, iz $$2, azg $$3) {
      return je.a($$3)
         .stream()
         .filter($$1x -> this.b.b($$0, $$1x))
         .map($$4 -> this.a($$0, $$1, $$2, $$4, $$3, false))
         .filter(Optional::isPresent)
         .findFirst()
         .orElse(Optional.empty());
   }

   public long a(dsb $$0, dby $$1, iz $$2, boolean $$3) {
      return je.a().filter($$1x -> this.b.b($$0, $$1x)).map($$4 -> this.a($$0, $$1, $$2, $$4, $$3)).reduce(0L, Long::sum);
   }

   public Optional<djz.c> a(dsb $$0, dby $$1, iz $$2, je $$3, azg $$4, boolean $$5) {
      return je.a($$4).stream().map($$5x -> this.a($$0, $$1, $$2, $$3, $$5x, $$5)).filter(Optional::isPresent).findFirst().orElse(Optional.empty());
   }

   private long a(dsb $$0, dby $$1, iz $$2, je $$3, boolean $$4) {
      return je.a().map($$5 -> this.a($$0, $$1, $$2, $$3, $$5, $$4)).filter(Optional::isPresent).count();
   }

   @VisibleForTesting
   public Optional<djz.c> a(dsb $$0, dby $$1, iz $$2, je $$3, je $$4, boolean $$5) {
      return this.a($$0, $$1, $$2, $$3, $$4, this.b::a).flatMap($$2x -> this.a($$1, $$2x, $$5));
   }

   public Optional<djz.c> a(dsb $$0, dbd $$1, iz $$2, je $$3, je $$4, djz.d $$5) {
      if ($$4.o() == $$3.o()) {
         return Optional.empty();
      } else if (this.b.a($$0) || this.b.a($$0, $$3) && !this.b.a($$0, $$4)) {
         for (djz.e $$6 : this.b.a()) {
            djz.c $$7 = $$6.a($$2, $$4, $$3);
            if ($$5.test($$1, $$2, $$7)) {
               return Optional.of($$7);
            }
         }

         return Optional.empty();
      } else {
         return Optional.empty();
      }
   }

   public Optional<djz.c> a(dby $$0, djz.c $$1, boolean $$2) {
      dsb $$3 = $$0.a_($$1.a());
      return this.b.a($$0, $$1, $$3, $$2) ? Optional.of($$1) : Optional.empty();
   }

   public static class a implements djz.b {
      protected djy a;

      public a(djy $$0) {
         this.a = $$0;
      }

      @Nullable
      @Override
      public dsb a(dsb $$0, dbd $$1, iz $$2, je $$3) {
         return this.a.c($$0, $$1, $$2, $$3);
      }

      protected boolean a(dbd $$0, iz $$1, iz $$2, je $$3, dsb $$4) {
         return $$4.i() || $$4.a(this.a) || $$4.a(dfa.G) && $$4.u().b();
      }

      @Override
      public boolean a(dbd $$0, iz $$1, djz.c $$2) {
         dsb $$3 = $$0.a_($$2.a());
         return this.a($$0, $$1, $$2.a(), $$2.b(), $$3) && this.a.a($$0, $$3, $$2.a(), $$2.b());
      }
   }

   public interface b {
      @Nullable
      dsb a(dsb var1, dbd var2, iz var3, je var4);

      boolean a(dbd var1, iz var2, djz.c var3);

      default djz.e[] a() {
         return djz.a;
      }

      default boolean a(dsb $$0, je $$1) {
         return djy.a($$0, $$1);
      }

      default boolean a(dsb $$0) {
         return false;
      }

      default boolean b(dsb $$0, je $$1) {
         return this.a($$0) || this.a($$0, $$1);
      }

      default boolean a(dby $$0, djz.c $$1, dsb $$2, boolean $$3) {
         dsb $$4 = this.a($$2, $$0, $$1.a(), $$1.b());
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

   public static record c(iz a, je b) {
   }

   @FunctionalInterface
   public interface d {
      boolean test(dbd var1, iz var2, djz.c var3);
   }

   public static enum e {
      a {
         @Override
         public djz.c a(iz $$0, je $$1, je $$2) {
            return new djz.c($$0, $$1);
         }
      },
      b {
         @Override
         public djz.c a(iz $$0, je $$1, je $$2) {
            return new djz.c($$0.a($$1), $$2);
         }
      },
      c {
         @Override
         public djz.c a(iz $$0, je $$1, je $$2) {
            return new djz.c($$0.a($$1).a($$2), $$1.g());
         }
      };

      public abstract djz.c a(iz var1, je var2, je var3);
   }
}
