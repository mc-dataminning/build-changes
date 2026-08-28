import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import javax.annotation.Nullable;

public class djy {
   public static final djy.e[] a = new djy.e[]{djy.e.a, djy.e.b, djy.e.c};
   private final djy.b b;

   public djy(djx $$0) {
      this(new djy.a($$0));
   }

   public djy(djy.b $$0) {
      this.b = $$0;
   }

   public boolean a(dsa $$0, dbc $$1, iz $$2, je $$3) {
      return je.a().anyMatch($$4 -> this.a($$0, $$1, $$2, $$3, $$4, this.b::a).isPresent());
   }

   public Optional<djy.c> a(dsa $$0, dbx $$1, iz $$2, azf $$3) {
      return je.a($$3)
         .stream()
         .filter($$1x -> this.b.b($$0, $$1x))
         .map($$4 -> this.a($$0, $$1, $$2, $$4, $$3, false))
         .filter(Optional::isPresent)
         .findFirst()
         .orElse(Optional.empty());
   }

   public long a(dsa $$0, dbx $$1, iz $$2, boolean $$3) {
      return je.a().filter($$1x -> this.b.b($$0, $$1x)).map($$4 -> this.a($$0, $$1, $$2, $$4, $$3)).reduce(0L, Long::sum);
   }

   public Optional<djy.c> a(dsa $$0, dbx $$1, iz $$2, je $$3, azf $$4, boolean $$5) {
      return je.a($$4).stream().map($$5x -> this.a($$0, $$1, $$2, $$3, $$5x, $$5)).filter(Optional::isPresent).findFirst().orElse(Optional.empty());
   }

   private long a(dsa $$0, dbx $$1, iz $$2, je $$3, boolean $$4) {
      return je.a().map($$5 -> this.a($$0, $$1, $$2, $$3, $$5, $$4)).filter(Optional::isPresent).count();
   }

   @VisibleForTesting
   public Optional<djy.c> a(dsa $$0, dbx $$1, iz $$2, je $$3, je $$4, boolean $$5) {
      return this.a($$0, $$1, $$2, $$3, $$4, this.b::a).flatMap($$2x -> this.a($$1, $$2x, $$5));
   }

   public Optional<djy.c> a(dsa $$0, dbc $$1, iz $$2, je $$3, je $$4, djy.d $$5) {
      if ($$4.o() == $$3.o()) {
         return Optional.empty();
      } else if (this.b.a($$0) || this.b.a($$0, $$3) && !this.b.a($$0, $$4)) {
         for (djy.e $$6 : this.b.a()) {
            djy.c $$7 = $$6.a($$2, $$4, $$3);
            if ($$5.test($$1, $$2, $$7)) {
               return Optional.of($$7);
            }
         }

         return Optional.empty();
      } else {
         return Optional.empty();
      }
   }

   public Optional<djy.c> a(dbx $$0, djy.c $$1, boolean $$2) {
      dsa $$3 = $$0.a_($$1.a());
      return this.b.a($$0, $$1, $$3, $$2) ? Optional.of($$1) : Optional.empty();
   }

   public static class a implements djy.b {
      protected djx a;

      public a(djx $$0) {
         this.a = $$0;
      }

      @Nullable
      @Override
      public dsa a(dsa $$0, dbc $$1, iz $$2, je $$3) {
         return this.a.c($$0, $$1, $$2, $$3);
      }

      protected boolean a(dbc $$0, iz $$1, iz $$2, je $$3, dsa $$4) {
         return $$4.i() || $$4.a(this.a) || $$4.a(dez.G) && $$4.u().b();
      }

      @Override
      public boolean a(dbc $$0, iz $$1, djy.c $$2) {
         dsa $$3 = $$0.a_($$2.a());
         return this.a($$0, $$1, $$2.a(), $$2.b(), $$3) && this.a.a($$0, $$3, $$2.a(), $$2.b());
      }
   }

   public interface b {
      @Nullable
      dsa a(dsa var1, dbc var2, iz var3, je var4);

      boolean a(dbc var1, iz var2, djy.c var3);

      default djy.e[] a() {
         return djy.a;
      }

      default boolean a(dsa $$0, je $$1) {
         return djx.a($$0, $$1);
      }

      default boolean a(dsa $$0) {
         return false;
      }

      default boolean b(dsa $$0, je $$1) {
         return this.a($$0) || this.a($$0, $$1);
      }

      default boolean a(dbx $$0, djy.c $$1, dsa $$2, boolean $$3) {
         dsa $$4 = this.a($$2, $$0, $$1.a(), $$1.b());
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
      boolean test(dbc var1, iz var2, djy.c var3);
   }

   public static enum e {
      a {
         @Override
         public djy.c a(iz $$0, je $$1, je $$2) {
            return new djy.c($$0, $$1);
         }
      },
      b {
         @Override
         public djy.c a(iz $$0, je $$1, je $$2) {
            return new djy.c($$0.a($$1), $$2);
         }
      },
      c {
         @Override
         public djy.c a(iz $$0, je $$1, je $$2) {
            return new djy.c($$0.a($$1).a($$2), $$1.g());
         }
      };

      public abstract djy.c a(iz var1, je var2, je var3);
   }
}
