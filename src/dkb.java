import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import javax.annotation.Nullable;

public class dkb {
   public static final dkb.e[] a = new dkb.e[]{dkb.e.a, dkb.e.b, dkb.e.c};
   private final dkb.b b;

   public dkb(dka $$0) {
      this(new dkb.a($$0));
   }

   public dkb(dkb.b $$0) {
      this.b = $$0;
   }

   public boolean a(dsd $$0, dbf $$1, iz $$2, je $$3) {
      return je.a().anyMatch($$4 -> this.a($$0, $$1, $$2, $$3, $$4, this.b::a).isPresent());
   }

   public Optional<dkb.c> a(dsd $$0, dca $$1, iz $$2, azh $$3) {
      return je.a($$3)
         .stream()
         .filter($$1x -> this.b.b($$0, $$1x))
         .map($$4 -> this.a($$0, $$1, $$2, $$4, $$3, false))
         .filter(Optional::isPresent)
         .findFirst()
         .orElse(Optional.empty());
   }

   public long a(dsd $$0, dca $$1, iz $$2, boolean $$3) {
      return je.a().filter($$1x -> this.b.b($$0, $$1x)).map($$4 -> this.a($$0, $$1, $$2, $$4, $$3)).reduce(0L, Long::sum);
   }

   public Optional<dkb.c> a(dsd $$0, dca $$1, iz $$2, je $$3, azh $$4, boolean $$5) {
      return je.a($$4).stream().map($$5x -> this.a($$0, $$1, $$2, $$3, $$5x, $$5)).filter(Optional::isPresent).findFirst().orElse(Optional.empty());
   }

   private long a(dsd $$0, dca $$1, iz $$2, je $$3, boolean $$4) {
      return je.a().map($$5 -> this.a($$0, $$1, $$2, $$3, $$5, $$4)).filter(Optional::isPresent).count();
   }

   @VisibleForTesting
   public Optional<dkb.c> a(dsd $$0, dca $$1, iz $$2, je $$3, je $$4, boolean $$5) {
      return this.a($$0, $$1, $$2, $$3, $$4, this.b::a).flatMap($$2x -> this.a($$1, $$2x, $$5));
   }

   public Optional<dkb.c> a(dsd $$0, dbf $$1, iz $$2, je $$3, je $$4, dkb.d $$5) {
      if ($$4.o() == $$3.o()) {
         return Optional.empty();
      } else if (this.b.a($$0) || this.b.a($$0, $$3) && !this.b.a($$0, $$4)) {
         for (dkb.e $$6 : this.b.a()) {
            dkb.c $$7 = $$6.a($$2, $$4, $$3);
            if ($$5.test($$1, $$2, $$7)) {
               return Optional.of($$7);
            }
         }

         return Optional.empty();
      } else {
         return Optional.empty();
      }
   }

   public Optional<dkb.c> a(dca $$0, dkb.c $$1, boolean $$2) {
      dsd $$3 = $$0.a_($$1.a());
      return this.b.a($$0, $$1, $$3, $$2) ? Optional.of($$1) : Optional.empty();
   }

   public static class a implements dkb.b {
      protected dka a;

      public a(dka $$0) {
         this.a = $$0;
      }

      @Nullable
      @Override
      public dsd a(dsd $$0, dbf $$1, iz $$2, je $$3) {
         return this.a.c($$0, $$1, $$2, $$3);
      }

      protected boolean a(dbf $$0, iz $$1, iz $$2, je $$3, dsd $$4) {
         return $$4.i() || $$4.a(this.a) || $$4.a(dfc.G) && $$4.u().b();
      }

      @Override
      public boolean a(dbf $$0, iz $$1, dkb.c $$2) {
         dsd $$3 = $$0.a_($$2.a());
         return this.a($$0, $$1, $$2.a(), $$2.b(), $$3) && this.a.a($$0, $$3, $$2.a(), $$2.b());
      }
   }

   public interface b {
      @Nullable
      dsd a(dsd var1, dbf var2, iz var3, je var4);

      boolean a(dbf var1, iz var2, dkb.c var3);

      default dkb.e[] a() {
         return dkb.a;
      }

      default boolean a(dsd $$0, je $$1) {
         return dka.a($$0, $$1);
      }

      default boolean a(dsd $$0) {
         return false;
      }

      default boolean b(dsd $$0, je $$1) {
         return this.a($$0) || this.a($$0, $$1);
      }

      default boolean a(dca $$0, dkb.c $$1, dsd $$2, boolean $$3) {
         dsd $$4 = this.a($$2, $$0, $$1.a(), $$1.b());
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
      boolean test(dbf var1, iz var2, dkb.c var3);
   }

   public static enum e {
      a {
         @Override
         public dkb.c a(iz $$0, je $$1, je $$2) {
            return new dkb.c($$0, $$1);
         }
      },
      b {
         @Override
         public dkb.c a(iz $$0, je $$1, je $$2) {
            return new dkb.c($$0.a($$1), $$2);
         }
      },
      c {
         @Override
         public dkb.c a(iz $$0, je $$1, je $$2) {
            return new dkb.c($$0.a($$1).a($$2), $$1.g());
         }
      };

      public abstract dkb.c a(iz var1, je var2, je var3);
   }
}
