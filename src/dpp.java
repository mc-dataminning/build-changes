import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import javax.annotation.Nullable;

public class dpp {
   public static final dpp.e[] a = new dpp.e[]{dpp.e.a, dpp.e.b, dpp.e.c};
   private final dpp.b b;

   public dpp(dpo $$0) {
      this(new dpp.a($$0));
   }

   public dpp(dpp.b $$0) {
      this.b = $$0;
   }

   public boolean a(dxv $$0, dgn $$1, jh $$2, jm $$3) {
      return jm.a().anyMatch($$4 -> this.a($$0, $$1, $$2, $$3, $$4, this.b::a).isPresent());
   }

   public Optional<dpp.c> a(dxv $$0, dhj $$1, jh $$2, bam $$3) {
      return jm.a($$3)
         .stream()
         .filter($$1x -> this.b.b($$0, $$1x))
         .map($$4 -> this.a($$0, $$1, $$2, $$4, $$3, false))
         .filter(Optional::isPresent)
         .findFirst()
         .orElse(Optional.empty());
   }

   public long a(dxv $$0, dhj $$1, jh $$2, boolean $$3) {
      return jm.a().filter($$1x -> this.b.b($$0, $$1x)).map($$4 -> this.a($$0, $$1, $$2, $$4, $$3)).reduce(0L, Long::sum);
   }

   public Optional<dpp.c> a(dxv $$0, dhj $$1, jh $$2, jm $$3, bam $$4, boolean $$5) {
      return jm.a($$4).stream().map($$5x -> this.a($$0, $$1, $$2, $$3, $$5x, $$5)).filter(Optional::isPresent).findFirst().orElse(Optional.empty());
   }

   private long a(dxv $$0, dhj $$1, jh $$2, jm $$3, boolean $$4) {
      return jm.a().map($$5 -> this.a($$0, $$1, $$2, $$3, $$5, $$4)).filter(Optional::isPresent).count();
   }

   @VisibleForTesting
   public Optional<dpp.c> a(dxv $$0, dhj $$1, jh $$2, jm $$3, jm $$4, boolean $$5) {
      return this.a($$0, $$1, $$2, $$3, $$4, this.b::a).flatMap($$2x -> this.a($$1, $$2x, $$5));
   }

   public Optional<dpp.c> a(dxv $$0, dgn $$1, jh $$2, jm $$3, jm $$4, dpp.d $$5) {
      if ($$4.o() == $$3.o()) {
         return Optional.empty();
      } else if (this.b.a($$0) || this.b.a($$0, $$3) && !this.b.a($$0, $$4)) {
         for (dpp.e $$6 : this.b.a()) {
            dpp.c $$7 = $$6.a($$2, $$4, $$3);
            if ($$5.test($$1, $$2, $$7)) {
               return Optional.of($$7);
            }
         }

         return Optional.empty();
      } else {
         return Optional.empty();
      }
   }

   public Optional<dpp.c> a(dhj $$0, dpp.c $$1, boolean $$2) {
      dxv $$3 = $$0.a_($$1.a());
      return this.b.a($$0, $$1, $$3, $$2) ? Optional.of($$1) : Optional.empty();
   }

   public static class a implements dpp.b {
      protected dpo a;

      public a(dpo $$0) {
         this.a = $$0;
      }

      @Nullable
      @Override
      public dxv a(dxv $$0, dgn $$1, jh $$2, jm $$3) {
         return this.a.c($$0, $$1, $$2, $$3);
      }

      protected boolean a(dgn $$0, jh $$1, jh $$2, jm $$3, dxv $$4) {
         return $$4.l() || $$4.a(this.a) || $$4.a(dko.J) && $$4.y().b();
      }

      @Override
      public boolean a(dgn $$0, jh $$1, dpp.c $$2) {
         dxv $$3 = $$0.a_($$2.a());
         return this.a($$0, $$1, $$2.a(), $$2.b(), $$3) && this.a.a($$0, $$3, $$2.a(), $$2.b());
      }
   }

   public interface b {
      @Nullable
      dxv a(dxv var1, dgn var2, jh var3, jm var4);

      boolean a(dgn var1, jh var2, dpp.c var3);

      default dpp.e[] a() {
         return dpp.a;
      }

      default boolean a(dxv $$0, jm $$1) {
         return dpo.a($$0, $$1);
      }

      default boolean a(dxv $$0) {
         return false;
      }

      default boolean b(dxv $$0, jm $$1) {
         return this.a($$0) || this.a($$0, $$1);
      }

      default boolean a(dhj $$0, dpp.c $$1, dxv $$2, boolean $$3) {
         dxv $$4 = this.a($$2, $$0, $$1.a(), $$1.b());
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

   public static record c(jh a, jm b) {
   }

   @FunctionalInterface
   public interface d {
      boolean test(dgn var1, jh var2, dpp.c var3);
   }

   public static enum e {
      a {
         @Override
         public dpp.c a(jh $$0, jm $$1, jm $$2) {
            return new dpp.c($$0, $$1);
         }
      },
      b {
         @Override
         public dpp.c a(jh $$0, jm $$1, jm $$2) {
            return new dpp.c($$0.a($$1), $$2);
         }
      },
      c {
         @Override
         public dpp.c a(jh $$0, jm $$1, jm $$2) {
            return new dpp.c($$0.a($$1).a($$2), $$1.g());
         }
      };

      public abstract dpp.c a(jh var1, jm var2, jm var3);
   }
}
