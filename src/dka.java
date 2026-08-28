import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import javax.annotation.Nullable;

public class dka {
   public static final dka.e[] a = new dka.e[]{dka.e.a, dka.e.b, dka.e.c};
   private final dka.b b;

   public dka(djz $$0) {
      this(new dka.a($$0));
   }

   public dka(dka.b $$0) {
      this.b = $$0;
   }

   public boolean a(dsc $$0, dbe $$1, iz $$2, je $$3) {
      return je.a().anyMatch($$4 -> this.a($$0, $$1, $$2, $$3, $$4, this.b::a).isPresent());
   }

   public Optional<dka.c> a(dsc $$0, dbz $$1, iz $$2, azh $$3) {
      return je.a($$3)
         .stream()
         .filter($$1x -> this.b.b($$0, $$1x))
         .map($$4 -> this.a($$0, $$1, $$2, $$4, $$3, false))
         .filter(Optional::isPresent)
         .findFirst()
         .orElse(Optional.empty());
   }

   public long a(dsc $$0, dbz $$1, iz $$2, boolean $$3) {
      return je.a().filter($$1x -> this.b.b($$0, $$1x)).map($$4 -> this.a($$0, $$1, $$2, $$4, $$3)).reduce(0L, Long::sum);
   }

   public Optional<dka.c> a(dsc $$0, dbz $$1, iz $$2, je $$3, azh $$4, boolean $$5) {
      return je.a($$4).stream().map($$5x -> this.a($$0, $$1, $$2, $$3, $$5x, $$5)).filter(Optional::isPresent).findFirst().orElse(Optional.empty());
   }

   private long a(dsc $$0, dbz $$1, iz $$2, je $$3, boolean $$4) {
      return je.a().map($$5 -> this.a($$0, $$1, $$2, $$3, $$5, $$4)).filter(Optional::isPresent).count();
   }

   @VisibleForTesting
   public Optional<dka.c> a(dsc $$0, dbz $$1, iz $$2, je $$3, je $$4, boolean $$5) {
      return this.a($$0, $$1, $$2, $$3, $$4, this.b::a).flatMap($$2x -> this.a($$1, $$2x, $$5));
   }

   public Optional<dka.c> a(dsc $$0, dbe $$1, iz $$2, je $$3, je $$4, dka.d $$5) {
      if ($$4.o() == $$3.o()) {
         return Optional.empty();
      } else if (this.b.a($$0) || this.b.a($$0, $$3) && !this.b.a($$0, $$4)) {
         for (dka.e $$6 : this.b.a()) {
            dka.c $$7 = $$6.a($$2, $$4, $$3);
            if ($$5.test($$1, $$2, $$7)) {
               return Optional.of($$7);
            }
         }

         return Optional.empty();
      } else {
         return Optional.empty();
      }
   }

   public Optional<dka.c> a(dbz $$0, dka.c $$1, boolean $$2) {
      dsc $$3 = $$0.a_($$1.a());
      return this.b.a($$0, $$1, $$3, $$2) ? Optional.of($$1) : Optional.empty();
   }

   public static class a implements dka.b {
      protected djz a;

      public a(djz $$0) {
         this.a = $$0;
      }

      @Nullable
      @Override
      public dsc a(dsc $$0, dbe $$1, iz $$2, je $$3) {
         return this.a.c($$0, $$1, $$2, $$3);
      }

      protected boolean a(dbe $$0, iz $$1, iz $$2, je $$3, dsc $$4) {
         return $$4.i() || $$4.a(this.a) || $$4.a(dfb.G) && $$4.u().b();
      }

      @Override
      public boolean a(dbe $$0, iz $$1, dka.c $$2) {
         dsc $$3 = $$0.a_($$2.a());
         return this.a($$0, $$1, $$2.a(), $$2.b(), $$3) && this.a.a($$0, $$3, $$2.a(), $$2.b());
      }
   }

   public interface b {
      @Nullable
      dsc a(dsc var1, dbe var2, iz var3, je var4);

      boolean a(dbe var1, iz var2, dka.c var3);

      default dka.e[] a() {
         return dka.a;
      }

      default boolean a(dsc $$0, je $$1) {
         return djz.a($$0, $$1);
      }

      default boolean a(dsc $$0) {
         return false;
      }

      default boolean b(dsc $$0, je $$1) {
         return this.a($$0) || this.a($$0, $$1);
      }

      default boolean a(dbz $$0, dka.c $$1, dsc $$2, boolean $$3) {
         dsc $$4 = this.a($$2, $$0, $$1.a(), $$1.b());
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
      boolean test(dbe var1, iz var2, dka.c var3);
   }

   public static enum e {
      a {
         @Override
         public dka.c a(iz $$0, je $$1, je $$2) {
            return new dka.c($$0, $$1);
         }
      },
      b {
         @Override
         public dka.c a(iz $$0, je $$1, je $$2) {
            return new dka.c($$0.a($$1), $$2);
         }
      },
      c {
         @Override
         public dka.c a(iz $$0, je $$1, je $$2) {
            return new dka.c($$0.a($$1).a($$2), $$1.g());
         }
      };

      public abstract dka.c a(iz var1, je var2, je var3);
   }
}
