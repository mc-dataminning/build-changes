import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import javax.annotation.Nullable;

public class daf {
   public static final daf.e[] a = new daf.e[]{daf.e.a, daf.e.b, daf.e.c};
   private final daf.b b;

   public daf(dae $$0) {
      this(new daf.a($$0));
   }

   public daf(daf.b $$0) {
      this.b = $$0;
   }

   public boolean a(dhn $$0, crl $$1, hx $$2, ib $$3) {
      return ib.a().anyMatch($$4 -> this.a($$0, $$1, $$2, $$3, $$4, this.b::a).isPresent());
   }

   public Optional<daf.c> a(dhn $$0, csg $$1, hx $$2, atw $$3) {
      return ib.a($$3)
         .stream()
         .filter($$1x -> this.b.b($$0, $$1x))
         .map($$4 -> this.a($$0, $$1, $$2, $$4, $$3, false))
         .filter(Optional::isPresent)
         .findFirst()
         .orElse(Optional.empty());
   }

   public long a(dhn $$0, csg $$1, hx $$2, boolean $$3) {
      return ib.a().filter($$1x -> this.b.b($$0, $$1x)).map($$4 -> this.a($$0, $$1, $$2, $$4, $$3)).reduce(0L, Long::sum);
   }

   public Optional<daf.c> a(dhn $$0, csg $$1, hx $$2, ib $$3, atw $$4, boolean $$5) {
      return ib.a($$4).stream().map($$5x -> this.a($$0, $$1, $$2, $$3, $$5x, $$5)).filter(Optional::isPresent).findFirst().orElse(Optional.empty());
   }

   private long a(dhn $$0, csg $$1, hx $$2, ib $$3, boolean $$4) {
      return ib.a().map($$5 -> this.a($$0, $$1, $$2, $$3, $$5, $$4)).filter(Optional::isPresent).count();
   }

   @VisibleForTesting
   public Optional<daf.c> a(dhn $$0, csg $$1, hx $$2, ib $$3, ib $$4, boolean $$5) {
      return this.a($$0, $$1, $$2, $$3, $$4, this.b::a).flatMap($$2x -> this.a($$1, $$2x, $$5));
   }

   public Optional<daf.c> a(dhn $$0, crl $$1, hx $$2, ib $$3, ib $$4, daf.d $$5) {
      if ($$4.o() == $$3.o()) {
         return Optional.empty();
      } else if (this.b.a($$0) || this.b.a($$0, $$3) && !this.b.a($$0, $$4)) {
         for (daf.e $$6 : this.b.a()) {
            daf.c $$7 = $$6.a($$2, $$4, $$3);
            if ($$5.test($$1, $$2, $$7)) {
               return Optional.of($$7);
            }
         }

         return Optional.empty();
      } else {
         return Optional.empty();
      }
   }

   public Optional<daf.c> a(csg $$0, daf.c $$1, boolean $$2) {
      dhn $$3 = $$0.a_($$1.a());
      return this.b.a($$0, $$1, $$3, $$2) ? Optional.of($$1) : Optional.empty();
   }

   public static class a implements daf.b {
      protected dae a;

      public a(dae $$0) {
         this.a = $$0;
      }

      @Nullable
      @Override
      public dhn a(dhn $$0, crl $$1, hx $$2, ib $$3) {
         return this.a.c($$0, $$1, $$2, $$3);
      }

      protected boolean a(crl $$0, hx $$1, hx $$2, ib $$3, dhn $$4) {
         return $$4.i() || $$4.a(this.a) || $$4.a(cvh.G) && $$4.u().b();
      }

      @Override
      public boolean a(crl $$0, hx $$1, daf.c $$2) {
         dhn $$3 = $$0.a_($$2.a());
         return this.a($$0, $$1, $$2.a(), $$2.b(), $$3) && this.a.a($$0, $$3, $$2.a(), $$2.b());
      }
   }

   public interface b {
      @Nullable
      dhn a(dhn var1, crl var2, hx var3, ib var4);

      boolean a(crl var1, hx var2, daf.c var3);

      default daf.e[] a() {
         return daf.a;
      }

      default boolean a(dhn $$0, ib $$1) {
         return dae.a($$0, $$1);
      }

      default boolean a(dhn $$0) {
         return false;
      }

      default boolean b(dhn $$0, ib $$1) {
         return this.a($$0) || this.a($$0, $$1);
      }

      default boolean a(csg $$0, daf.c $$1, dhn $$2, boolean $$3) {
         dhn $$4 = this.a($$2, $$0, $$1.a(), $$1.b());
         if ($$4 != null) {
            if ($$3) {
               $$0.x($$1.a()).e($$1.a());
            }

            return $$0.a($$1.a(), $$4, 2);
         } else {
            return false;
         }
      }
   }

   public static record c(hx a, ib b) {
   }

   @FunctionalInterface
   public interface d {
      boolean test(crl var1, hx var2, daf.c var3);
   }

   public static enum e {
      a {
         @Override
         public daf.c a(hx $$0, ib $$1, ib $$2) {
            return new daf.c($$0, $$1);
         }
      },
      b {
         @Override
         public daf.c a(hx $$0, ib $$1, ib $$2) {
            return new daf.c($$0.a($$1), $$2);
         }
      },
      c {
         @Override
         public daf.c a(hx $$0, ib $$1, ib $$2) {
            return new daf.c($$0.a($$1).a($$2), $$1.g());
         }
      };

      public abstract daf.c a(hx var1, ib var2, ib var3);
   }
}
