import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import javax.annotation.Nullable;

public class dbp {
   public static final dbp.e[] a = new dbp.e[]{dbp.e.a, dbp.e.b, dbp.e.c};
   private final dbp.b b;

   public dbp(dbo $$0) {
      this(new dbp.a($$0));
   }

   public dbp(dbp.b $$0) {
      this.b = $$0;
   }

   public boolean a(djg $$0, csu $$1, hx $$2, ic $$3) {
      return ic.a().anyMatch($$4 -> this.a($$0, $$1, $$2, $$3, $$4, this.b::a).isPresent());
   }

   public Optional<dbp.c> a(djg $$0, ctp $$1, hx $$2, auu $$3) {
      return ic.a($$3)
         .stream()
         .filter($$1x -> this.b.b($$0, $$1x))
         .map($$4 -> this.a($$0, $$1, $$2, $$4, $$3, false))
         .filter(Optional::isPresent)
         .findFirst()
         .orElse(Optional.empty());
   }

   public long a(djg $$0, ctp $$1, hx $$2, boolean $$3) {
      return ic.a().filter($$1x -> this.b.b($$0, $$1x)).map($$4 -> this.a($$0, $$1, $$2, $$4, $$3)).reduce(0L, Long::sum);
   }

   public Optional<dbp.c> a(djg $$0, ctp $$1, hx $$2, ic $$3, auu $$4, boolean $$5) {
      return ic.a($$4).stream().map($$5x -> this.a($$0, $$1, $$2, $$3, $$5x, $$5)).filter(Optional::isPresent).findFirst().orElse(Optional.empty());
   }

   private long a(djg $$0, ctp $$1, hx $$2, ic $$3, boolean $$4) {
      return ic.a().map($$5 -> this.a($$0, $$1, $$2, $$3, $$5, $$4)).filter(Optional::isPresent).count();
   }

   @VisibleForTesting
   public Optional<dbp.c> a(djg $$0, ctp $$1, hx $$2, ic $$3, ic $$4, boolean $$5) {
      return this.a($$0, $$1, $$2, $$3, $$4, this.b::a).flatMap($$2x -> this.a($$1, $$2x, $$5));
   }

   public Optional<dbp.c> a(djg $$0, csu $$1, hx $$2, ic $$3, ic $$4, dbp.d $$5) {
      if ($$4.o() == $$3.o()) {
         return Optional.empty();
      } else if (this.b.a($$0) || this.b.a($$0, $$3) && !this.b.a($$0, $$4)) {
         for (dbp.e $$6 : this.b.a()) {
            dbp.c $$7 = $$6.a($$2, $$4, $$3);
            if ($$5.test($$1, $$2, $$7)) {
               return Optional.of($$7);
            }
         }

         return Optional.empty();
      } else {
         return Optional.empty();
      }
   }

   public Optional<dbp.c> a(ctp $$0, dbp.c $$1, boolean $$2) {
      djg $$3 = $$0.a_($$1.a());
      return this.b.a($$0, $$1, $$3, $$2) ? Optional.of($$1) : Optional.empty();
   }

   public static class a implements dbp.b {
      protected dbo a;

      public a(dbo $$0) {
         this.a = $$0;
      }

      @Nullable
      @Override
      public djg a(djg $$0, csu $$1, hx $$2, ic $$3) {
         return this.a.c($$0, $$1, $$2, $$3);
      }

      protected boolean a(csu $$0, hx $$1, hx $$2, ic $$3, djg $$4) {
         return $$4.i() || $$4.a(this.a) || $$4.a(cwr.G) && $$4.u().b();
      }

      @Override
      public boolean a(csu $$0, hx $$1, dbp.c $$2) {
         djg $$3 = $$0.a_($$2.a());
         return this.a($$0, $$1, $$2.a(), $$2.b(), $$3) && this.a.a($$0, $$3, $$2.a(), $$2.b());
      }
   }

   public interface b {
      @Nullable
      djg a(djg var1, csu var2, hx var3, ic var4);

      boolean a(csu var1, hx var2, dbp.c var3);

      default dbp.e[] a() {
         return dbp.a;
      }

      default boolean a(djg $$0, ic $$1) {
         return dbo.a($$0, $$1);
      }

      default boolean a(djg $$0) {
         return false;
      }

      default boolean b(djg $$0, ic $$1) {
         return this.a($$0) || this.a($$0, $$1);
      }

      default boolean a(ctp $$0, dbp.c $$1, djg $$2, boolean $$3) {
         djg $$4 = this.a($$2, $$0, $$1.a(), $$1.b());
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
      boolean test(csu var1, hx var2, dbp.c var3);
   }

   public static enum e {
      a {
         @Override
         public dbp.c a(hx $$0, ic $$1, ic $$2) {
            return new dbp.c($$0, $$1);
         }
      },
      b {
         @Override
         public dbp.c a(hx $$0, ic $$1, ic $$2) {
            return new dbp.c($$0.a($$1), $$2);
         }
      },
      c {
         @Override
         public dbp.c a(hx $$0, ic $$1, ic $$2) {
            return new dbp.c($$0.a($$1).a($$2), $$1.g());
         }
      };

      public abstract dbp.c a(hx var1, ic var2, ic var3);
   }
}
