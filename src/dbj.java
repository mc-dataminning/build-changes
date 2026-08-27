import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import javax.annotation.Nullable;

public class dbj {
   public static final dbj.e[] a = new dbj.e[]{dbj.e.a, dbj.e.b, dbj.e.c};
   private final dbj.b b;

   public dbj(dbi $$0) {
      this(new dbj.a($$0));
   }

   public dbj(dbj.b $$0) {
      this.b = $$0;
   }

   public boolean a(dja $$0, cso $$1, hx $$2, ic $$3) {
      return ic.a().anyMatch($$4 -> this.a($$0, $$1, $$2, $$3, $$4, this.b::a).isPresent());
   }

   public Optional<dbj.c> a(dja $$0, ctj $$1, hx $$2, aup $$3) {
      return ic.a($$3)
         .stream()
         .filter($$1x -> this.b.b($$0, $$1x))
         .map($$4 -> this.a($$0, $$1, $$2, $$4, $$3, false))
         .filter(Optional::isPresent)
         .findFirst()
         .orElse(Optional.empty());
   }

   public long a(dja $$0, ctj $$1, hx $$2, boolean $$3) {
      return ic.a().filter($$1x -> this.b.b($$0, $$1x)).map($$4 -> this.a($$0, $$1, $$2, $$4, $$3)).reduce(0L, Long::sum);
   }

   public Optional<dbj.c> a(dja $$0, ctj $$1, hx $$2, ic $$3, aup $$4, boolean $$5) {
      return ic.a($$4).stream().map($$5x -> this.a($$0, $$1, $$2, $$3, $$5x, $$5)).filter(Optional::isPresent).findFirst().orElse(Optional.empty());
   }

   private long a(dja $$0, ctj $$1, hx $$2, ic $$3, boolean $$4) {
      return ic.a().map($$5 -> this.a($$0, $$1, $$2, $$3, $$5, $$4)).filter(Optional::isPresent).count();
   }

   @VisibleForTesting
   public Optional<dbj.c> a(dja $$0, ctj $$1, hx $$2, ic $$3, ic $$4, boolean $$5) {
      return this.a($$0, $$1, $$2, $$3, $$4, this.b::a).flatMap($$2x -> this.a($$1, $$2x, $$5));
   }

   public Optional<dbj.c> a(dja $$0, cso $$1, hx $$2, ic $$3, ic $$4, dbj.d $$5) {
      if ($$4.o() == $$3.o()) {
         return Optional.empty();
      } else if (this.b.a($$0) || this.b.a($$0, $$3) && !this.b.a($$0, $$4)) {
         for (dbj.e $$6 : this.b.a()) {
            dbj.c $$7 = $$6.a($$2, $$4, $$3);
            if ($$5.test($$1, $$2, $$7)) {
               return Optional.of($$7);
            }
         }

         return Optional.empty();
      } else {
         return Optional.empty();
      }
   }

   public Optional<dbj.c> a(ctj $$0, dbj.c $$1, boolean $$2) {
      dja $$3 = $$0.a_($$1.a());
      return this.b.a($$0, $$1, $$3, $$2) ? Optional.of($$1) : Optional.empty();
   }

   public static class a implements dbj.b {
      protected dbi a;

      public a(dbi $$0) {
         this.a = $$0;
      }

      @Nullable
      @Override
      public dja a(dja $$0, cso $$1, hx $$2, ic $$3) {
         return this.a.c($$0, $$1, $$2, $$3);
      }

      protected boolean a(cso $$0, hx $$1, hx $$2, ic $$3, dja $$4) {
         return $$4.i() || $$4.a(this.a) || $$4.a(cwl.G) && $$4.u().b();
      }

      @Override
      public boolean a(cso $$0, hx $$1, dbj.c $$2) {
         dja $$3 = $$0.a_($$2.a());
         return this.a($$0, $$1, $$2.a(), $$2.b(), $$3) && this.a.a($$0, $$3, $$2.a(), $$2.b());
      }
   }

   public interface b {
      @Nullable
      dja a(dja var1, cso var2, hx var3, ic var4);

      boolean a(cso var1, hx var2, dbj.c var3);

      default dbj.e[] a() {
         return dbj.a;
      }

      default boolean a(dja $$0, ic $$1) {
         return dbi.a($$0, $$1);
      }

      default boolean a(dja $$0) {
         return false;
      }

      default boolean b(dja $$0, ic $$1) {
         return this.a($$0) || this.a($$0, $$1);
      }

      default boolean a(ctj $$0, dbj.c $$1, dja $$2, boolean $$3) {
         dja $$4 = this.a($$2, $$0, $$1.a(), $$1.b());
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

   public static record c(hx a, ic b) {
   }

   @FunctionalInterface
   public interface d {
      boolean test(cso var1, hx var2, dbj.c var3);
   }

   public static enum e {
      a {
         @Override
         public dbj.c a(hx $$0, ic $$1, ic $$2) {
            return new dbj.c($$0, $$1);
         }
      },
      b {
         @Override
         public dbj.c a(hx $$0, ic $$1, ic $$2) {
            return new dbj.c($$0.a($$1), $$2);
         }
      },
      c {
         @Override
         public dbj.c a(hx $$0, ic $$1, ic $$2) {
            return new dbj.c($$0.a($$1).a($$2), $$1.g());
         }
      };

      public abstract dbj.c a(hx var1, ic var2, ic var3);
   }
}
