import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import javax.annotation.Nullable;

public class dsw {
   public static final dsw.e[] a = new dsw.e[]{dsw.e.a, dsw.e.b, dsw.e.c};
   private final dsw.b b;

   public dsw(dsu $$0) {
      this(new dsw.a($$0));
   }

   public dsw(dsw.b $$0) {
      this.b = $$0;
   }

   public boolean a(ebq $$0, djn $$1, iw $$2, jc $$3) {
      return jc.a().anyMatch($$4 -> this.a($$0, $$1, $$2, $$3, $$4, this.b::a).isPresent());
   }

   public Optional<dsw.c> a(ebq $$0, dkk $$1, iw $$2, bai $$3) {
      return jc.a($$3)
         .stream()
         .filter($$1x -> this.b.b($$0, $$1x))
         .map($$4 -> this.a($$0, $$1, $$2, $$4, $$3, false))
         .filter(Optional::isPresent)
         .findFirst()
         .orElse(Optional.empty());
   }

   public long a(ebq $$0, dkk $$1, iw $$2, boolean $$3) {
      return jc.a().filter($$1x -> this.b.b($$0, $$1x)).map($$4 -> this.a($$0, $$1, $$2, $$4, $$3)).reduce(0L, Long::sum);
   }

   public Optional<dsw.c> a(ebq $$0, dkk $$1, iw $$2, jc $$3, bai $$4, boolean $$5) {
      return jc.a($$4).stream().map($$5x -> this.a($$0, $$1, $$2, $$3, $$5x, $$5)).filter(Optional::isPresent).findFirst().orElse(Optional.empty());
   }

   private long a(ebq $$0, dkk $$1, iw $$2, jc $$3, boolean $$4) {
      return jc.a().map($$5 -> this.a($$0, $$1, $$2, $$3, $$5, $$4)).filter(Optional::isPresent).count();
   }

   @VisibleForTesting
   public Optional<dsw.c> a(ebq $$0, dkk $$1, iw $$2, jc $$3, jc $$4, boolean $$5) {
      return this.a($$0, $$1, $$2, $$3, $$4, this.b::a).flatMap($$2x -> this.a($$1, $$2x, $$5));
   }

   public Optional<dsw.c> a(ebq $$0, djn $$1, iw $$2, jc $$3, jc $$4, dsw.d $$5) {
      if ($$4.o() == $$3.o()) {
         return Optional.empty();
      } else if (this.b.a($$0) || this.b.a($$0, $$3) && !this.b.a($$0, $$4)) {
         for (dsw.e $$6 : this.b.a()) {
            dsw.c $$7 = $$6.a($$2, $$4, $$3);
            if ($$5.test($$1, $$2, $$7)) {
               return Optional.of($$7);
            }
         }

         return Optional.empty();
      } else {
         return Optional.empty();
      }
   }

   public Optional<dsw.c> a(dkk $$0, dsw.c $$1, boolean $$2) {
      ebq $$3 = $$0.a_($$1.a());
      return this.b.a($$0, $$1, $$3, $$2) ? Optional.of($$1) : Optional.empty();
   }

   public static class a implements dsw.b {
      protected dsu a;

      public a(dsu $$0) {
         this.a = $$0;
      }

      @Nullable
      @Override
      public ebq a(ebq $$0, djn $$1, iw $$2, jc $$3) {
         return this.a.c($$0, $$1, $$2, $$3);
      }

      protected boolean a(djn $$0, iw $$1, iw $$2, jc $$3, ebq $$4) {
         return $$4.l() || $$4.a(this.a) || $$4.a(dnq.J) && $$4.y().b();
      }

      @Override
      public boolean a(djn $$0, iw $$1, dsw.c $$2) {
         ebq $$3 = $$0.a_($$2.a());
         return this.a($$0, $$1, $$2.a(), $$2.b(), $$3) && this.a.a($$0, $$3, $$2.a(), $$2.b());
      }
   }

   public interface b {
      @Nullable
      ebq a(ebq var1, djn var2, iw var3, jc var4);

      boolean a(djn var1, iw var2, dsw.c var3);

      default dsw.e[] a() {
         return dsw.a;
      }

      default boolean a(ebq $$0, jc $$1) {
         return dsu.a($$0, $$1);
      }

      default boolean a(ebq $$0) {
         return false;
      }

      default boolean b(ebq $$0, jc $$1) {
         return this.a($$0) || this.a($$0, $$1);
      }

      default boolean a(dkk $$0, dsw.c $$1, ebq $$2, boolean $$3) {
         ebq $$4 = this.a($$2, $$0, $$1.a(), $$1.b());
         if ($$4 != null) {
            if ($$3) {
               $$0.z($$1.a()).e($$1.a());
            }

            return $$0.a($$1.a(), $$4, 2);
         } else {
            return false;
         }
      }
   }

   public static record c(iw a, jc b) {
   }

   @FunctionalInterface
   public interface d {
      boolean test(djn var1, iw var2, dsw.c var3);
   }

   public static enum e {
      a {
         @Override
         public dsw.c a(iw $$0, jc $$1, jc $$2) {
            return new dsw.c($$0, $$1);
         }
      },
      b {
         @Override
         public dsw.c a(iw $$0, jc $$1, jc $$2) {
            return new dsw.c($$0.a($$1), $$2);
         }
      },
      c {
         @Override
         public dsw.c a(iw $$0, jc $$1, jc $$2) {
            return new dsw.c($$0.a($$1).a($$2), $$1.g());
         }
      };

      public abstract dsw.c a(iw var1, jc var2, jc var3);
   }
}
