import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import javax.annotation.Nullable;

public class dra {
   public static final dra.e[] a = new dra.e[]{dra.e.a, dra.e.b, dra.e.c};
   private final dra.b b;

   public dra(dqy $$0) {
      this(new dra.a($$0));
   }

   public dra(dra.b $$0) {
      this.b = $$0;
   }

   public boolean a(dzo $$0, dhv $$1, iu $$2, ja $$3) {
      return ja.a().anyMatch($$4 -> this.a($$0, $$1, $$2, $$3, $$4, this.b::a).isPresent());
   }

   public Optional<dra.c> a(dzo $$0, diq $$1, iu $$2, azt $$3) {
      return ja.a($$3)
         .stream()
         .filter($$1x -> this.b.b($$0, $$1x))
         .map($$4 -> this.a($$0, $$1, $$2, $$4, $$3, false))
         .filter(Optional::isPresent)
         .findFirst()
         .orElse(Optional.empty());
   }

   public long a(dzo $$0, diq $$1, iu $$2, boolean $$3) {
      return ja.a().filter($$1x -> this.b.b($$0, $$1x)).map($$4 -> this.a($$0, $$1, $$2, $$4, $$3)).reduce(0L, Long::sum);
   }

   public Optional<dra.c> a(dzo $$0, diq $$1, iu $$2, ja $$3, azt $$4, boolean $$5) {
      return ja.a($$4).stream().map($$5x -> this.a($$0, $$1, $$2, $$3, $$5x, $$5)).filter(Optional::isPresent).findFirst().orElse(Optional.empty());
   }

   private long a(dzo $$0, diq $$1, iu $$2, ja $$3, boolean $$4) {
      return ja.a().map($$5 -> this.a($$0, $$1, $$2, $$3, $$5, $$4)).filter(Optional::isPresent).count();
   }

   @VisibleForTesting
   public Optional<dra.c> a(dzo $$0, diq $$1, iu $$2, ja $$3, ja $$4, boolean $$5) {
      return this.a($$0, $$1, $$2, $$3, $$4, this.b::a).flatMap($$2x -> this.a($$1, $$2x, $$5));
   }

   public Optional<dra.c> a(dzo $$0, dhv $$1, iu $$2, ja $$3, ja $$4, dra.d $$5) {
      if ($$4.o() == $$3.o()) {
         return Optional.empty();
      } else if (this.b.a($$0) || this.b.a($$0, $$3) && !this.b.a($$0, $$4)) {
         for (dra.e $$6 : this.b.a()) {
            dra.c $$7 = $$6.a($$2, $$4, $$3);
            if ($$5.test($$1, $$2, $$7)) {
               return Optional.of($$7);
            }
         }

         return Optional.empty();
      } else {
         return Optional.empty();
      }
   }

   public Optional<dra.c> a(diq $$0, dra.c $$1, boolean $$2) {
      dzo $$3 = $$0.a_($$1.a());
      return this.b.a($$0, $$1, $$3, $$2) ? Optional.of($$1) : Optional.empty();
   }

   public static class a implements dra.b {
      protected dqy a;

      public a(dqy $$0) {
         this.a = $$0;
      }

      @Nullable
      @Override
      public dzo a(dzo $$0, dhv $$1, iu $$2, ja $$3) {
         return this.a.c($$0, $$1, $$2, $$3);
      }

      protected boolean a(dhv $$0, iu $$1, iu $$2, ja $$3, dzo $$4) {
         return $$4.l() || $$4.a(this.a) || $$4.a(dlw.J) && $$4.y().b();
      }

      @Override
      public boolean a(dhv $$0, iu $$1, dra.c $$2) {
         dzo $$3 = $$0.a_($$2.a());
         return this.a($$0, $$1, $$2.a(), $$2.b(), $$3) && this.a.a($$0, $$3, $$2.a(), $$2.b());
      }
   }

   public interface b {
      @Nullable
      dzo a(dzo var1, dhv var2, iu var3, ja var4);

      boolean a(dhv var1, iu var2, dra.c var3);

      default dra.e[] a() {
         return dra.a;
      }

      default boolean a(dzo $$0, ja $$1) {
         return dqy.a($$0, $$1);
      }

      default boolean a(dzo $$0) {
         return false;
      }

      default boolean b(dzo $$0, ja $$1) {
         return this.a($$0) || this.a($$0, $$1);
      }

      default boolean a(diq $$0, dra.c $$1, dzo $$2, boolean $$3) {
         dzo $$4 = this.a($$2, $$0, $$1.a(), $$1.b());
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
      boolean test(dhv var1, iu var2, dra.c var3);
   }

   public static enum e {
      a {
         @Override
         public dra.c a(iu $$0, ja $$1, ja $$2) {
            return new dra.c($$0, $$1);
         }
      },
      b {
         @Override
         public dra.c a(iu $$0, ja $$1, ja $$2) {
            return new dra.c($$0.a($$1), $$2);
         }
      },
      c {
         @Override
         public dra.c a(iu $$0, ja $$1, ja $$2) {
            return new dra.c($$0.a($$1).a($$2), $$1.g());
         }
      };

      public abstract dra.c a(iu var1, ja var2, ja var3);
   }
}
