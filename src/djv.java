import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import javax.annotation.Nullable;

public class djv {
   public static final djv.e[] a = new djv.e[]{djv.e.a, djv.e.b, djv.e.c};
   private final djv.b b;

   public djv(dju $$0) {
      this(new djv.a($$0));
   }

   public djv(djv.b $$0) {
      this.b = $$0;
   }

   public boolean a(drx $$0, daz $$1, iz $$2, je $$3) {
      return je.a().anyMatch($$4 -> this.a($$0, $$1, $$2, $$3, $$4, this.b::a).isPresent());
   }

   public Optional<djv.c> a(drx $$0, dbu $$1, iz $$2, azc $$3) {
      return je.a($$3)
         .stream()
         .filter($$1x -> this.b.b($$0, $$1x))
         .map($$4 -> this.a($$0, $$1, $$2, $$4, $$3, false))
         .filter(Optional::isPresent)
         .findFirst()
         .orElse(Optional.empty());
   }

   public long a(drx $$0, dbu $$1, iz $$2, boolean $$3) {
      return je.a().filter($$1x -> this.b.b($$0, $$1x)).map($$4 -> this.a($$0, $$1, $$2, $$4, $$3)).reduce(0L, Long::sum);
   }

   public Optional<djv.c> a(drx $$0, dbu $$1, iz $$2, je $$3, azc $$4, boolean $$5) {
      return je.a($$4).stream().map($$5x -> this.a($$0, $$1, $$2, $$3, $$5x, $$5)).filter(Optional::isPresent).findFirst().orElse(Optional.empty());
   }

   private long a(drx $$0, dbu $$1, iz $$2, je $$3, boolean $$4) {
      return je.a().map($$5 -> this.a($$0, $$1, $$2, $$3, $$5, $$4)).filter(Optional::isPresent).count();
   }

   @VisibleForTesting
   public Optional<djv.c> a(drx $$0, dbu $$1, iz $$2, je $$3, je $$4, boolean $$5) {
      return this.a($$0, $$1, $$2, $$3, $$4, this.b::a).flatMap($$2x -> this.a($$1, $$2x, $$5));
   }

   public Optional<djv.c> a(drx $$0, daz $$1, iz $$2, je $$3, je $$4, djv.d $$5) {
      if ($$4.o() == $$3.o()) {
         return Optional.empty();
      } else if (this.b.a($$0) || this.b.a($$0, $$3) && !this.b.a($$0, $$4)) {
         for (djv.e $$6 : this.b.a()) {
            djv.c $$7 = $$6.a($$2, $$4, $$3);
            if ($$5.test($$1, $$2, $$7)) {
               return Optional.of($$7);
            }
         }

         return Optional.empty();
      } else {
         return Optional.empty();
      }
   }

   public Optional<djv.c> a(dbu $$0, djv.c $$1, boolean $$2) {
      drx $$3 = $$0.a_($$1.a());
      return this.b.a($$0, $$1, $$3, $$2) ? Optional.of($$1) : Optional.empty();
   }

   public static class a implements djv.b {
      protected dju a;

      public a(dju $$0) {
         this.a = $$0;
      }

      @Nullable
      @Override
      public drx a(drx $$0, daz $$1, iz $$2, je $$3) {
         return this.a.c($$0, $$1, $$2, $$3);
      }

      protected boolean a(daz $$0, iz $$1, iz $$2, je $$3, drx $$4) {
         return $$4.i() || $$4.a(this.a) || $$4.a(dew.G) && $$4.u().b();
      }

      @Override
      public boolean a(daz $$0, iz $$1, djv.c $$2) {
         drx $$3 = $$0.a_($$2.a());
         return this.a($$0, $$1, $$2.a(), $$2.b(), $$3) && this.a.a($$0, $$3, $$2.a(), $$2.b());
      }
   }

   public interface b {
      @Nullable
      drx a(drx var1, daz var2, iz var3, je var4);

      boolean a(daz var1, iz var2, djv.c var3);

      default djv.e[] a() {
         return djv.a;
      }

      default boolean a(drx $$0, je $$1) {
         return dju.a($$0, $$1);
      }

      default boolean a(drx $$0) {
         return false;
      }

      default boolean b(drx $$0, je $$1) {
         return this.a($$0) || this.a($$0, $$1);
      }

      default boolean a(dbu $$0, djv.c $$1, drx $$2, boolean $$3) {
         drx $$4 = this.a($$2, $$0, $$1.a(), $$1.b());
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
      boolean test(daz var1, iz var2, djv.c var3);
   }

   public static enum e {
      a {
         @Override
         public djv.c a(iz $$0, je $$1, je $$2) {
            return new djv.c($$0, $$1);
         }
      },
      b {
         @Override
         public djv.c a(iz $$0, je $$1, je $$2) {
            return new djv.c($$0.a($$1), $$2);
         }
      },
      c {
         @Override
         public djv.c a(iz $$0, je $$1, je $$2) {
            return new djv.c($$0.a($$1).a($$2), $$1.g());
         }
      };

      public abstract djv.c a(iz var1, je var2, je var3);
   }
}
