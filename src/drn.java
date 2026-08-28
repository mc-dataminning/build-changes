import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import javax.annotation.Nullable;

public class drn {
   public static final drn.e[] a = new drn.e[]{drn.e.a, drn.e.b, drn.e.c};
   private final drn.b b;

   public drn(drl $$0) {
      this(new drn.a($$0));
   }

   public drn(drn.b $$0) {
      this.b = $$0;
   }

   public boolean a(eah $$0, dig $$1, iu $$2, ja $$3) {
      return ja.a().anyMatch($$4 -> this.a($$0, $$1, $$2, $$3, $$4, this.b::a).isPresent());
   }

   public Optional<drn.c> a(eah $$0, djb $$1, iu $$2, azv $$3) {
      return ja.a($$3)
         .stream()
         .filter($$1x -> this.b.b($$0, $$1x))
         .map($$4 -> this.a($$0, $$1, $$2, $$4, $$3, false))
         .filter(Optional::isPresent)
         .findFirst()
         .orElse(Optional.empty());
   }

   public long a(eah $$0, djb $$1, iu $$2, boolean $$3) {
      return ja.a().filter($$1x -> this.b.b($$0, $$1x)).map($$4 -> this.a($$0, $$1, $$2, $$4, $$3)).reduce(0L, Long::sum);
   }

   public Optional<drn.c> a(eah $$0, djb $$1, iu $$2, ja $$3, azv $$4, boolean $$5) {
      return ja.a($$4).stream().map($$5x -> this.a($$0, $$1, $$2, $$3, $$5x, $$5)).filter(Optional::isPresent).findFirst().orElse(Optional.empty());
   }

   private long a(eah $$0, djb $$1, iu $$2, ja $$3, boolean $$4) {
      return ja.a().map($$5 -> this.a($$0, $$1, $$2, $$3, $$5, $$4)).filter(Optional::isPresent).count();
   }

   @VisibleForTesting
   public Optional<drn.c> a(eah $$0, djb $$1, iu $$2, ja $$3, ja $$4, boolean $$5) {
      return this.a($$0, $$1, $$2, $$3, $$4, this.b::a).flatMap($$2x -> this.a($$1, $$2x, $$5));
   }

   public Optional<drn.c> a(eah $$0, dig $$1, iu $$2, ja $$3, ja $$4, drn.d $$5) {
      if ($$4.o() == $$3.o()) {
         return Optional.empty();
      } else if (this.b.a($$0) || this.b.a($$0, $$3) && !this.b.a($$0, $$4)) {
         for (drn.e $$6 : this.b.a()) {
            drn.c $$7 = $$6.a($$2, $$4, $$3);
            if ($$5.test($$1, $$2, $$7)) {
               return Optional.of($$7);
            }
         }

         return Optional.empty();
      } else {
         return Optional.empty();
      }
   }

   public Optional<drn.c> a(djb $$0, drn.c $$1, boolean $$2) {
      eah $$3 = $$0.a_($$1.a());
      return this.b.a($$0, $$1, $$3, $$2) ? Optional.of($$1) : Optional.empty();
   }

   public static class a implements drn.b {
      protected drl a;

      public a(drl $$0) {
         this.a = $$0;
      }

      @Nullable
      @Override
      public eah a(eah $$0, dig $$1, iu $$2, ja $$3) {
         return this.a.c($$0, $$1, $$2, $$3);
      }

      protected boolean a(dig $$0, iu $$1, iu $$2, ja $$3, eah $$4) {
         return $$4.l() || $$4.a(this.a) || $$4.a(dmh.J) && $$4.y().b();
      }

      @Override
      public boolean a(dig $$0, iu $$1, drn.c $$2) {
         eah $$3 = $$0.a_($$2.a());
         return this.a($$0, $$1, $$2.a(), $$2.b(), $$3) && this.a.a($$0, $$3, $$2.a(), $$2.b());
      }
   }

   public interface b {
      @Nullable
      eah a(eah var1, dig var2, iu var3, ja var4);

      boolean a(dig var1, iu var2, drn.c var3);

      default drn.e[] a() {
         return drn.a;
      }

      default boolean a(eah $$0, ja $$1) {
         return drl.a($$0, $$1);
      }

      default boolean a(eah $$0) {
         return false;
      }

      default boolean b(eah $$0, ja $$1) {
         return this.a($$0) || this.a($$0, $$1);
      }

      default boolean a(djb $$0, drn.c $$1, eah $$2, boolean $$3) {
         eah $$4 = this.a($$2, $$0, $$1.a(), $$1.b());
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

   public static record c(iu a, ja b) {
   }

   @FunctionalInterface
   public interface d {
      boolean test(dig var1, iu var2, drn.c var3);
   }

   public static enum e {
      a {
         @Override
         public drn.c a(iu $$0, ja $$1, ja $$2) {
            return new drn.c($$0, $$1);
         }
      },
      b {
         @Override
         public drn.c a(iu $$0, ja $$1, ja $$2) {
            return new drn.c($$0.a($$1), $$2);
         }
      },
      c {
         @Override
         public drn.c a(iu $$0, ja $$1, ja $$2) {
            return new drn.c($$0.a($$1).a($$2), $$1.g());
         }
      };

      public abstract drn.c a(iu var1, ja var2, ja var3);
   }
}
