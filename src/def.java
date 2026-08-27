import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import javax.annotation.Nullable;

public class def {
   public static final def.e[] a = new def.e[]{def.e.a, def.e.b, def.e.c};
   private final def.b b;

   public def(dee $$0) {
      this(new def.a($$0));
   }

   public def(def.b $$0) {
      this.b = $$0;
   }

   public boolean a(dme $$0, cvk $$1, ib $$2, ih $$3) {
      return ih.a().anyMatch($$4 -> this.a($$0, $$1, $$2, $$3, $$4, this.b::a).isPresent());
   }

   public Optional<def.c> a(dme $$0, cwf $$1, ib $$2, awt $$3) {
      return ih.a($$3)
         .stream()
         .filter($$1x -> this.b.b($$0, $$1x))
         .map($$4 -> this.a($$0, $$1, $$2, $$4, $$3, false))
         .filter(Optional::isPresent)
         .findFirst()
         .orElse(Optional.empty());
   }

   public long a(dme $$0, cwf $$1, ib $$2, boolean $$3) {
      return ih.a().filter($$1x -> this.b.b($$0, $$1x)).map($$4 -> this.a($$0, $$1, $$2, $$4, $$3)).reduce(0L, Long::sum);
   }

   public Optional<def.c> a(dme $$0, cwf $$1, ib $$2, ih $$3, awt $$4, boolean $$5) {
      return ih.a($$4).stream().map($$5x -> this.a($$0, $$1, $$2, $$3, $$5x, $$5)).filter(Optional::isPresent).findFirst().orElse(Optional.empty());
   }

   private long a(dme $$0, cwf $$1, ib $$2, ih $$3, boolean $$4) {
      return ih.a().map($$5 -> this.a($$0, $$1, $$2, $$3, $$5, $$4)).filter(Optional::isPresent).count();
   }

   @VisibleForTesting
   public Optional<def.c> a(dme $$0, cwf $$1, ib $$2, ih $$3, ih $$4, boolean $$5) {
      return this.a($$0, $$1, $$2, $$3, $$4, this.b::a).flatMap($$2x -> this.a($$1, $$2x, $$5));
   }

   public Optional<def.c> a(dme $$0, cvk $$1, ib $$2, ih $$3, ih $$4, def.d $$5) {
      if ($$4.o() == $$3.o()) {
         return Optional.empty();
      } else if (this.b.a($$0) || this.b.a($$0, $$3) && !this.b.a($$0, $$4)) {
         for (def.e $$6 : this.b.a()) {
            def.c $$7 = $$6.a($$2, $$4, $$3);
            if ($$5.test($$1, $$2, $$7)) {
               return Optional.of($$7);
            }
         }

         return Optional.empty();
      } else {
         return Optional.empty();
      }
   }

   public Optional<def.c> a(cwf $$0, def.c $$1, boolean $$2) {
      dme $$3 = $$0.a_($$1.a());
      return this.b.a($$0, $$1, $$3, $$2) ? Optional.of($$1) : Optional.empty();
   }

   public static class a implements def.b {
      protected dee a;

      public a(dee $$0) {
         this.a = $$0;
      }

      @Nullable
      @Override
      public dme a(dme $$0, cvk $$1, ib $$2, ih $$3) {
         return this.a.c($$0, $$1, $$2, $$3);
      }

      protected boolean a(cvk $$0, ib $$1, ib $$2, ih $$3, dme $$4) {
         return $$4.i() || $$4.a(this.a) || $$4.a(czh.G) && $$4.u().b();
      }

      @Override
      public boolean a(cvk $$0, ib $$1, def.c $$2) {
         dme $$3 = $$0.a_($$2.a());
         return this.a($$0, $$1, $$2.a(), $$2.b(), $$3) && this.a.a($$0, $$3, $$2.a(), $$2.b());
      }
   }

   public interface b {
      @Nullable
      dme a(dme var1, cvk var2, ib var3, ih var4);

      boolean a(cvk var1, ib var2, def.c var3);

      default def.e[] a() {
         return def.a;
      }

      default boolean a(dme $$0, ih $$1) {
         return dee.a($$0, $$1);
      }

      default boolean a(dme $$0) {
         return false;
      }

      default boolean b(dme $$0, ih $$1) {
         return this.a($$0) || this.a($$0, $$1);
      }

      default boolean a(cwf $$0, def.c $$1, dme $$2, boolean $$3) {
         dme $$4 = this.a($$2, $$0, $$1.a(), $$1.b());
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
      boolean test(cvk var1, ib var2, def.c var3);
   }

   public static enum e {
      a {
         @Override
         public def.c a(ib $$0, ih $$1, ih $$2) {
            return new def.c($$0, $$1);
         }
      },
      b {
         @Override
         public def.c a(ib $$0, ih $$1, ih $$2) {
            return new def.c($$0.a($$1), $$2);
         }
      },
      c {
         @Override
         public def.c a(ib $$0, ih $$1, ih $$2) {
            return new def.c($$0.a($$1).a($$2), $$1.g());
         }
      };

      public abstract def.c a(ib var1, ih var2, ih var3);
   }
}
