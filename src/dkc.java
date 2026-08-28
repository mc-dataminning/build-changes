import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import javax.annotation.Nullable;

public class dkc {
   public static final dkc.e[] a = new dkc.e[]{dkc.e.a, dkc.e.b, dkc.e.c};
   private final dkc.b b;

   public dkc(dkb $$0) {
      this(new dkc.a($$0));
   }

   public dkc(dkc.b $$0) {
      this.b = $$0;
   }

   public boolean a(dse $$0, dbg $$1, iz $$2, je $$3) {
      return je.a().anyMatch($$4 -> this.a($$0, $$1, $$2, $$3, $$4, this.b::a).isPresent());
   }

   public Optional<dkc.c> a(dse $$0, dcb $$1, iz $$2, azh $$3) {
      return je.a($$3)
         .stream()
         .filter($$1x -> this.b.b($$0, $$1x))
         .map($$4 -> this.a($$0, $$1, $$2, $$4, $$3, false))
         .filter(Optional::isPresent)
         .findFirst()
         .orElse(Optional.empty());
   }

   public long a(dse $$0, dcb $$1, iz $$2, boolean $$3) {
      return je.a().filter($$1x -> this.b.b($$0, $$1x)).map($$4 -> this.a($$0, $$1, $$2, $$4, $$3)).reduce(0L, Long::sum);
   }

   public Optional<dkc.c> a(dse $$0, dcb $$1, iz $$2, je $$3, azh $$4, boolean $$5) {
      return je.a($$4).stream().map($$5x -> this.a($$0, $$1, $$2, $$3, $$5x, $$5)).filter(Optional::isPresent).findFirst().orElse(Optional.empty());
   }

   private long a(dse $$0, dcb $$1, iz $$2, je $$3, boolean $$4) {
      return je.a().map($$5 -> this.a($$0, $$1, $$2, $$3, $$5, $$4)).filter(Optional::isPresent).count();
   }

   @VisibleForTesting
   public Optional<dkc.c> a(dse $$0, dcb $$1, iz $$2, je $$3, je $$4, boolean $$5) {
      return this.a($$0, $$1, $$2, $$3, $$4, this.b::a).flatMap($$2x -> this.a($$1, $$2x, $$5));
   }

   public Optional<dkc.c> a(dse $$0, dbg $$1, iz $$2, je $$3, je $$4, dkc.d $$5) {
      if ($$4.o() == $$3.o()) {
         return Optional.empty();
      } else if (this.b.a($$0) || this.b.a($$0, $$3) && !this.b.a($$0, $$4)) {
         for (dkc.e $$6 : this.b.a()) {
            dkc.c $$7 = $$6.a($$2, $$4, $$3);
            if ($$5.test($$1, $$2, $$7)) {
               return Optional.of($$7);
            }
         }

         return Optional.empty();
      } else {
         return Optional.empty();
      }
   }

   public Optional<dkc.c> a(dcb $$0, dkc.c $$1, boolean $$2) {
      dse $$3 = $$0.a_($$1.a());
      return this.b.a($$0, $$1, $$3, $$2) ? Optional.of($$1) : Optional.empty();
   }

   public static class a implements dkc.b {
      protected dkb a;

      public a(dkb $$0) {
         this.a = $$0;
      }

      @Nullable
      @Override
      public dse a(dse $$0, dbg $$1, iz $$2, je $$3) {
         return this.a.c($$0, $$1, $$2, $$3);
      }

      protected boolean a(dbg $$0, iz $$1, iz $$2, je $$3, dse $$4) {
         return $$4.i() || $$4.a(this.a) || $$4.a(dfd.G) && $$4.u().b();
      }

      @Override
      public boolean a(dbg $$0, iz $$1, dkc.c $$2) {
         dse $$3 = $$0.a_($$2.a());
         return this.a($$0, $$1, $$2.a(), $$2.b(), $$3) && this.a.a($$0, $$3, $$2.a(), $$2.b());
      }
   }

   public interface b {
      @Nullable
      dse a(dse var1, dbg var2, iz var3, je var4);

      boolean a(dbg var1, iz var2, dkc.c var3);

      default dkc.e[] a() {
         return dkc.a;
      }

      default boolean a(dse $$0, je $$1) {
         return dkb.a($$0, $$1);
      }

      default boolean a(dse $$0) {
         return false;
      }

      default boolean b(dse $$0, je $$1) {
         return this.a($$0) || this.a($$0, $$1);
      }

      default boolean a(dcb $$0, dkc.c $$1, dse $$2, boolean $$3) {
         dse $$4 = this.a($$2, $$0, $$1.a(), $$1.b());
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
      boolean test(dbg var1, iz var2, dkc.c var3);
   }

   public static enum e {
      a {
         @Override
         public dkc.c a(iz $$0, je $$1, je $$2) {
            return new dkc.c($$0, $$1);
         }
      },
      b {
         @Override
         public dkc.c a(iz $$0, je $$1, je $$2) {
            return new dkc.c($$0.a($$1), $$2);
         }
      },
      c {
         @Override
         public dkc.c a(iz $$0, je $$1, je $$2) {
            return new dkc.c($$0.a($$1).a($$2), $$1.g());
         }
      };

      public abstract dkc.c a(iz var1, je var2, je var3);
   }
}
