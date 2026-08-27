import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import javax.annotation.Nullable;

public class dif {
   public static final dif.e[] a = new dif.e[]{dif.e.a, dif.e.b, dif.e.c};
   private final dif.b b;

   public dif(die $$0) {
      this(new dif.a($$0));
   }

   public dif(dif.b $$0) {
      this.b = $$0;
   }

   public boolean a(dqh $$0, czj $$1, in $$2, is $$3) {
      return is.a().anyMatch($$4 -> this.a($$0, $$1, $$2, $$3, $$4, this.b::a).isPresent());
   }

   public Optional<dif.c> a(dqh $$0, dae $$1, in $$2, ayg $$3) {
      return is.a($$3)
         .stream()
         .filter($$1x -> this.b.b($$0, $$1x))
         .map($$4 -> this.a($$0, $$1, $$2, $$4, $$3, false))
         .filter(Optional::isPresent)
         .findFirst()
         .orElse(Optional.empty());
   }

   public long a(dqh $$0, dae $$1, in $$2, boolean $$3) {
      return is.a().filter($$1x -> this.b.b($$0, $$1x)).map($$4 -> this.a($$0, $$1, $$2, $$4, $$3)).reduce(0L, Long::sum);
   }

   public Optional<dif.c> a(dqh $$0, dae $$1, in $$2, is $$3, ayg $$4, boolean $$5) {
      return is.a($$4).stream().map($$5x -> this.a($$0, $$1, $$2, $$3, $$5x, $$5)).filter(Optional::isPresent).findFirst().orElse(Optional.empty());
   }

   private long a(dqh $$0, dae $$1, in $$2, is $$3, boolean $$4) {
      return is.a().map($$5 -> this.a($$0, $$1, $$2, $$3, $$5, $$4)).filter(Optional::isPresent).count();
   }

   @VisibleForTesting
   public Optional<dif.c> a(dqh $$0, dae $$1, in $$2, is $$3, is $$4, boolean $$5) {
      return this.a($$0, $$1, $$2, $$3, $$4, this.b::a).flatMap($$2x -> this.a($$1, $$2x, $$5));
   }

   public Optional<dif.c> a(dqh $$0, czj $$1, in $$2, is $$3, is $$4, dif.d $$5) {
      if ($$4.o() == $$3.o()) {
         return Optional.empty();
      } else if (this.b.a($$0) || this.b.a($$0, $$3) && !this.b.a($$0, $$4)) {
         for (dif.e $$6 : this.b.a()) {
            dif.c $$7 = $$6.a($$2, $$4, $$3);
            if ($$5.test($$1, $$2, $$7)) {
               return Optional.of($$7);
            }
         }

         return Optional.empty();
      } else {
         return Optional.empty();
      }
   }

   public Optional<dif.c> a(dae $$0, dif.c $$1, boolean $$2) {
      dqh $$3 = $$0.a_($$1.a());
      return this.b.a($$0, $$1, $$3, $$2) ? Optional.of($$1) : Optional.empty();
   }

   public static class a implements dif.b {
      protected die a;

      public a(die $$0) {
         this.a = $$0;
      }

      @Nullable
      @Override
      public dqh a(dqh $$0, czj $$1, in $$2, is $$3) {
         return this.a.c($$0, $$1, $$2, $$3);
      }

      protected boolean a(czj $$0, in $$1, in $$2, is $$3, dqh $$4) {
         return $$4.i() || $$4.a(this.a) || $$4.a(ddg.G) && $$4.u().b();
      }

      @Override
      public boolean a(czj $$0, in $$1, dif.c $$2) {
         dqh $$3 = $$0.a_($$2.a());
         return this.a($$0, $$1, $$2.a(), $$2.b(), $$3) && this.a.a($$0, $$3, $$2.a(), $$2.b());
      }
   }

   public interface b {
      @Nullable
      dqh a(dqh var1, czj var2, in var3, is var4);

      boolean a(czj var1, in var2, dif.c var3);

      default dif.e[] a() {
         return dif.a;
      }

      default boolean a(dqh $$0, is $$1) {
         return die.a($$0, $$1);
      }

      default boolean a(dqh $$0) {
         return false;
      }

      default boolean b(dqh $$0, is $$1) {
         return this.a($$0) || this.a($$0, $$1);
      }

      default boolean a(dae $$0, dif.c $$1, dqh $$2, boolean $$3) {
         dqh $$4 = this.a($$2, $$0, $$1.a(), $$1.b());
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

   public static record c(in a, is b) {
   }

   @FunctionalInterface
   public interface d {
      boolean test(czj var1, in var2, dif.c var3);
   }

   public static enum e {
      a {
         @Override
         public dif.c a(in $$0, is $$1, is $$2) {
            return new dif.c($$0, $$1);
         }
      },
      b {
         @Override
         public dif.c a(in $$0, is $$1, is $$2) {
            return new dif.c($$0.a($$1), $$2);
         }
      },
      c {
         @Override
         public dif.c a(in $$0, is $$1, is $$2) {
            return new dif.c($$0.a($$1).a($$2), $$1.g());
         }
      };

      public abstract dif.c a(in var1, is var2, is var3);
   }
}
