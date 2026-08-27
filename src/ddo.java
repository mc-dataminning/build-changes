import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import javax.annotation.Nullable;

public class ddo {
   public static final ddo.e[] a = new ddo.e[]{ddo.e.a, ddo.e.b, ddo.e.c};
   private final ddo.b b;

   public ddo(ddn $$0) {
      this(new ddo.a($$0));
   }

   public ddo(ddo.b $$0) {
      this.b = $$0;
   }

   public boolean a(dlf $$0, cut $$1, hz $$2, ie $$3) {
      return ie.a().anyMatch($$4 -> this.a($$0, $$1, $$2, $$3, $$4, this.b::a).isPresent());
   }

   public Optional<ddo.c> a(dlf $$0, cvo $$1, hz $$2, awo $$3) {
      return ie.a($$3)
         .stream()
         .filter($$1x -> this.b.b($$0, $$1x))
         .map($$4 -> this.a($$0, $$1, $$2, $$4, $$3, false))
         .filter(Optional::isPresent)
         .findFirst()
         .orElse(Optional.empty());
   }

   public long a(dlf $$0, cvo $$1, hz $$2, boolean $$3) {
      return ie.a().filter($$1x -> this.b.b($$0, $$1x)).map($$4 -> this.a($$0, $$1, $$2, $$4, $$3)).reduce(0L, Long::sum);
   }

   public Optional<ddo.c> a(dlf $$0, cvo $$1, hz $$2, ie $$3, awo $$4, boolean $$5) {
      return ie.a($$4).stream().map($$5x -> this.a($$0, $$1, $$2, $$3, $$5x, $$5)).filter(Optional::isPresent).findFirst().orElse(Optional.empty());
   }

   private long a(dlf $$0, cvo $$1, hz $$2, ie $$3, boolean $$4) {
      return ie.a().map($$5 -> this.a($$0, $$1, $$2, $$3, $$5, $$4)).filter(Optional::isPresent).count();
   }

   @VisibleForTesting
   public Optional<ddo.c> a(dlf $$0, cvo $$1, hz $$2, ie $$3, ie $$4, boolean $$5) {
      return this.a($$0, $$1, $$2, $$3, $$4, this.b::a).flatMap($$2x -> this.a($$1, $$2x, $$5));
   }

   public Optional<ddo.c> a(dlf $$0, cut $$1, hz $$2, ie $$3, ie $$4, ddo.d $$5) {
      if ($$4.o() == $$3.o()) {
         return Optional.empty();
      } else if (this.b.a($$0) || this.b.a($$0, $$3) && !this.b.a($$0, $$4)) {
         for (ddo.e $$6 : this.b.a()) {
            ddo.c $$7 = $$6.a($$2, $$4, $$3);
            if ($$5.test($$1, $$2, $$7)) {
               return Optional.of($$7);
            }
         }

         return Optional.empty();
      } else {
         return Optional.empty();
      }
   }

   public Optional<ddo.c> a(cvo $$0, ddo.c $$1, boolean $$2) {
      dlf $$3 = $$0.a_($$1.a());
      return this.b.a($$0, $$1, $$3, $$2) ? Optional.of($$1) : Optional.empty();
   }

   public static class a implements ddo.b {
      protected ddn a;

      public a(ddn $$0) {
         this.a = $$0;
      }

      @Nullable
      @Override
      public dlf a(dlf $$0, cut $$1, hz $$2, ie $$3) {
         return this.a.c($$0, $$1, $$2, $$3);
      }

      protected boolean a(cut $$0, hz $$1, hz $$2, ie $$3, dlf $$4) {
         return $$4.i() || $$4.a(this.a) || $$4.a(cyq.G) && $$4.u().b();
      }

      @Override
      public boolean a(cut $$0, hz $$1, ddo.c $$2) {
         dlf $$3 = $$0.a_($$2.a());
         return this.a($$0, $$1, $$2.a(), $$2.b(), $$3) && this.a.a($$0, $$3, $$2.a(), $$2.b());
      }
   }

   public interface b {
      @Nullable
      dlf a(dlf var1, cut var2, hz var3, ie var4);

      boolean a(cut var1, hz var2, ddo.c var3);

      default ddo.e[] a() {
         return ddo.a;
      }

      default boolean a(dlf $$0, ie $$1) {
         return ddn.a($$0, $$1);
      }

      default boolean a(dlf $$0) {
         return false;
      }

      default boolean b(dlf $$0, ie $$1) {
         return this.a($$0) || this.a($$0, $$1);
      }

      default boolean a(cvo $$0, ddo.c $$1, dlf $$2, boolean $$3) {
         dlf $$4 = this.a($$2, $$0, $$1.a(), $$1.b());
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

   public static record c(hz a, ie b) {
   }

   @FunctionalInterface
   public interface d {
      boolean test(cut var1, hz var2, ddo.c var3);
   }

   public static enum e {
      a {
         @Override
         public ddo.c a(hz $$0, ie $$1, ie $$2) {
            return new ddo.c($$0, $$1);
         }
      },
      b {
         @Override
         public ddo.c a(hz $$0, ie $$1, ie $$2) {
            return new ddo.c($$0.a($$1), $$2);
         }
      },
      c {
         @Override
         public ddo.c a(hz $$0, ie $$1, ie $$2) {
            return new ddo.c($$0.a($$1).a($$2), $$1.g());
         }
      };

      public abstract ddo.c a(hz var1, ie var2, ie var3);
   }
}
