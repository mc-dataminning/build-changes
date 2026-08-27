import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import javax.annotation.Nullable;

public class dgy {
   public static final dgy.e[] a = new dgy.e[]{dgy.e.a, dgy.e.b, dgy.e.c};
   private final dgy.b b;

   public dgy(dgx $$0) {
      this(new dgy.a($$0));
   }

   public dgy(dgy.b $$0) {
      this.b = $$0;
   }

   public boolean a(doz $$0, cyd $$1, ib $$2, ih $$3) {
      return ih.a().anyMatch($$4 -> this.a($$0, $$1, $$2, $$3, $$4, this.b::a).isPresent());
   }

   public Optional<dgy.c> a(doz $$0, cyy $$1, ib $$2, axr $$3) {
      return ih.a($$3)
         .stream()
         .filter($$1x -> this.b.b($$0, $$1x))
         .map($$4 -> this.a($$0, $$1, $$2, $$4, $$3, false))
         .filter(Optional::isPresent)
         .findFirst()
         .orElse(Optional.empty());
   }

   public long a(doz $$0, cyy $$1, ib $$2, boolean $$3) {
      return ih.a().filter($$1x -> this.b.b($$0, $$1x)).map($$4 -> this.a($$0, $$1, $$2, $$4, $$3)).reduce(0L, Long::sum);
   }

   public Optional<dgy.c> a(doz $$0, cyy $$1, ib $$2, ih $$3, axr $$4, boolean $$5) {
      return ih.a($$4).stream().map($$5x -> this.a($$0, $$1, $$2, $$3, $$5x, $$5)).filter(Optional::isPresent).findFirst().orElse(Optional.empty());
   }

   private long a(doz $$0, cyy $$1, ib $$2, ih $$3, boolean $$4) {
      return ih.a().map($$5 -> this.a($$0, $$1, $$2, $$3, $$5, $$4)).filter(Optional::isPresent).count();
   }

   @VisibleForTesting
   public Optional<dgy.c> a(doz $$0, cyy $$1, ib $$2, ih $$3, ih $$4, boolean $$5) {
      return this.a($$0, $$1, $$2, $$3, $$4, this.b::a).flatMap($$2x -> this.a($$1, $$2x, $$5));
   }

   public Optional<dgy.c> a(doz $$0, cyd $$1, ib $$2, ih $$3, ih $$4, dgy.d $$5) {
      if ($$4.o() == $$3.o()) {
         return Optional.empty();
      } else if (this.b.a($$0) || this.b.a($$0, $$3) && !this.b.a($$0, $$4)) {
         for (dgy.e $$6 : this.b.a()) {
            dgy.c $$7 = $$6.a($$2, $$4, $$3);
            if ($$5.test($$1, $$2, $$7)) {
               return Optional.of($$7);
            }
         }

         return Optional.empty();
      } else {
         return Optional.empty();
      }
   }

   public Optional<dgy.c> a(cyy $$0, dgy.c $$1, boolean $$2) {
      doz $$3 = $$0.a_($$1.a());
      return this.b.a($$0, $$1, $$3, $$2) ? Optional.of($$1) : Optional.empty();
   }

   public static class a implements dgy.b {
      protected dgx a;

      public a(dgx $$0) {
         this.a = $$0;
      }

      @Nullable
      @Override
      public doz a(doz $$0, cyd $$1, ib $$2, ih $$3) {
         return this.a.c($$0, $$1, $$2, $$3);
      }

      protected boolean a(cyd $$0, ib $$1, ib $$2, ih $$3, doz $$4) {
         return $$4.i() || $$4.a(this.a) || $$4.a(dca.G) && $$4.u().b();
      }

      @Override
      public boolean a(cyd $$0, ib $$1, dgy.c $$2) {
         doz $$3 = $$0.a_($$2.a());
         return this.a($$0, $$1, $$2.a(), $$2.b(), $$3) && this.a.a($$0, $$3, $$2.a(), $$2.b());
      }
   }

   public interface b {
      @Nullable
      doz a(doz var1, cyd var2, ib var3, ih var4);

      boolean a(cyd var1, ib var2, dgy.c var3);

      default dgy.e[] a() {
         return dgy.a;
      }

      default boolean a(doz $$0, ih $$1) {
         return dgx.a($$0, $$1);
      }

      default boolean a(doz $$0) {
         return false;
      }

      default boolean b(doz $$0, ih $$1) {
         return this.a($$0) || this.a($$0, $$1);
      }

      default boolean a(cyy $$0, dgy.c $$1, doz $$2, boolean $$3) {
         doz $$4 = this.a($$2, $$0, $$1.a(), $$1.b());
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

   public static record c(ib a, ih b) {
   }

   @FunctionalInterface
   public interface d {
      boolean test(cyd var1, ib var2, dgy.c var3);
   }

   public static enum e {
      a {
         @Override
         public dgy.c a(ib $$0, ih $$1, ih $$2) {
            return new dgy.c($$0, $$1);
         }
      },
      b {
         @Override
         public dgy.c a(ib $$0, ih $$1, ih $$2) {
            return new dgy.c($$0.a($$1), $$2);
         }
      },
      c {
         @Override
         public dgy.c a(ib $$0, ih $$1, ih $$2) {
            return new dgy.c($$0.a($$1).a($$2), $$1.g());
         }
      };

      public abstract dgy.c a(ib var1, ih var2, ih var3);
   }
}
