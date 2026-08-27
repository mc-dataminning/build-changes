import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import javax.annotation.Nullable;

public class dfc {
   public static final dfc.e[] a = new dfc.e[]{dfc.e.a, dfc.e.b, dfc.e.c};
   private final dfc.b b;

   public dfc(dfb $$0) {
      this(new dfc.a($$0));
   }

   public dfc(dfc.b $$0) {
      this.b = $$0;
   }

   public boolean a(dnb $$0, cwh $$1, ib $$2, ih $$3) {
      return ih.a().anyMatch($$4 -> this.a($$0, $$1, $$2, $$3, $$4, this.b::a).isPresent());
   }

   public Optional<dfc.c> a(dnb $$0, cxc $$1, ib $$2, axd $$3) {
      return ih.a($$3)
         .stream()
         .filter($$1x -> this.b.b($$0, $$1x))
         .map($$4 -> this.a($$0, $$1, $$2, $$4, $$3, false))
         .filter(Optional::isPresent)
         .findFirst()
         .orElse(Optional.empty());
   }

   public long a(dnb $$0, cxc $$1, ib $$2, boolean $$3) {
      return ih.a().filter($$1x -> this.b.b($$0, $$1x)).map($$4 -> this.a($$0, $$1, $$2, $$4, $$3)).reduce(0L, Long::sum);
   }

   public Optional<dfc.c> a(dnb $$0, cxc $$1, ib $$2, ih $$3, axd $$4, boolean $$5) {
      return ih.a($$4).stream().map($$5x -> this.a($$0, $$1, $$2, $$3, $$5x, $$5)).filter(Optional::isPresent).findFirst().orElse(Optional.empty());
   }

   private long a(dnb $$0, cxc $$1, ib $$2, ih $$3, boolean $$4) {
      return ih.a().map($$5 -> this.a($$0, $$1, $$2, $$3, $$5, $$4)).filter(Optional::isPresent).count();
   }

   @VisibleForTesting
   public Optional<dfc.c> a(dnb $$0, cxc $$1, ib $$2, ih $$3, ih $$4, boolean $$5) {
      return this.a($$0, $$1, $$2, $$3, $$4, this.b::a).flatMap($$2x -> this.a($$1, $$2x, $$5));
   }

   public Optional<dfc.c> a(dnb $$0, cwh $$1, ib $$2, ih $$3, ih $$4, dfc.d $$5) {
      if ($$4.o() == $$3.o()) {
         return Optional.empty();
      } else if (this.b.a($$0) || this.b.a($$0, $$3) && !this.b.a($$0, $$4)) {
         for (dfc.e $$6 : this.b.a()) {
            dfc.c $$7 = $$6.a($$2, $$4, $$3);
            if ($$5.test($$1, $$2, $$7)) {
               return Optional.of($$7);
            }
         }

         return Optional.empty();
      } else {
         return Optional.empty();
      }
   }

   public Optional<dfc.c> a(cxc $$0, dfc.c $$1, boolean $$2) {
      dnb $$3 = $$0.a_($$1.a());
      return this.b.a($$0, $$1, $$3, $$2) ? Optional.of($$1) : Optional.empty();
   }

   public static class a implements dfc.b {
      protected dfb a;

      public a(dfb $$0) {
         this.a = $$0;
      }

      @Nullable
      @Override
      public dnb a(dnb $$0, cwh $$1, ib $$2, ih $$3) {
         return this.a.c($$0, $$1, $$2, $$3);
      }

      protected boolean a(cwh $$0, ib $$1, ib $$2, ih $$3, dnb $$4) {
         return $$4.i() || $$4.a(this.a) || $$4.a(dae.G) && $$4.u().b();
      }

      @Override
      public boolean a(cwh $$0, ib $$1, dfc.c $$2) {
         dnb $$3 = $$0.a_($$2.a());
         return this.a($$0, $$1, $$2.a(), $$2.b(), $$3) && this.a.a($$0, $$3, $$2.a(), $$2.b());
      }
   }

   public interface b {
      @Nullable
      dnb a(dnb var1, cwh var2, ib var3, ih var4);

      boolean a(cwh var1, ib var2, dfc.c var3);

      default dfc.e[] a() {
         return dfc.a;
      }

      default boolean a(dnb $$0, ih $$1) {
         return dfb.a($$0, $$1);
      }

      default boolean a(dnb $$0) {
         return false;
      }

      default boolean b(dnb $$0, ih $$1) {
         return this.a($$0) || this.a($$0, $$1);
      }

      default boolean a(cxc $$0, dfc.c $$1, dnb $$2, boolean $$3) {
         dnb $$4 = this.a($$2, $$0, $$1.a(), $$1.b());
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
      boolean test(cwh var1, ib var2, dfc.c var3);
   }

   public static enum e {
      a {
         @Override
         public dfc.c a(ib $$0, ih $$1, ih $$2) {
            return new dfc.c($$0, $$1);
         }
      },
      b {
         @Override
         public dfc.c a(ib $$0, ih $$1, ih $$2) {
            return new dfc.c($$0.a($$1), $$2);
         }
      },
      c {
         @Override
         public dfc.c a(ib $$0, ih $$1, ih $$2) {
            return new dfc.c($$0.a($$1).a($$2), $$1.g());
         }
      };

      public abstract dfc.c a(ib var1, ih var2, ih var3);
   }
}
