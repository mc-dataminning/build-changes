import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import javax.annotation.Nullable;

public class cyb {
   public static final cyb.e[] a = new cyb.e[]{cyb.e.a, cyb.e.b, cyb.e.c};
   private final cyb.b b;

   public cyb(cya $$0) {
      this(new cyb.a($$0));
   }

   public cyb(cyb.b $$0) {
      this.b = $$0;
   }

   public boolean a(dfd $$0, cph $$1, gw $$2, ha $$3) {
      return ha.a().anyMatch($$4 -> this.a($$0, $$1, $$2, $$3, $$4, this.b::a).isPresent());
   }

   public Optional<cyb.c> a(dfd $$0, cqc $$1, gw $$2, ash $$3) {
      return ha.a($$3)
         .stream()
         .filter($$1x -> this.b.b($$0, $$1x))
         .map($$4 -> this.a($$0, $$1, $$2, $$4, $$3, false))
         .filter(Optional::isPresent)
         .findFirst()
         .orElse(Optional.empty());
   }

   public long a(dfd $$0, cqc $$1, gw $$2, boolean $$3) {
      return ha.a().filter($$1x -> this.b.b($$0, $$1x)).map($$4 -> this.a($$0, $$1, $$2, $$4, $$3)).reduce(0L, Long::sum);
   }

   public Optional<cyb.c> a(dfd $$0, cqc $$1, gw $$2, ha $$3, ash $$4, boolean $$5) {
      return ha.a($$4).stream().map($$5x -> this.a($$0, $$1, $$2, $$3, $$5x, $$5)).filter(Optional::isPresent).findFirst().orElse(Optional.empty());
   }

   private long a(dfd $$0, cqc $$1, gw $$2, ha $$3, boolean $$4) {
      return ha.a().map($$5 -> this.a($$0, $$1, $$2, $$3, $$5, $$4)).filter(Optional::isPresent).count();
   }

   @VisibleForTesting
   public Optional<cyb.c> a(dfd $$0, cqc $$1, gw $$2, ha $$3, ha $$4, boolean $$5) {
      return this.a($$0, $$1, $$2, $$3, $$4, this.b::a).flatMap($$2x -> this.a($$1, $$2x, $$5));
   }

   public Optional<cyb.c> a(dfd $$0, cph $$1, gw $$2, ha $$3, ha $$4, cyb.d $$5) {
      if ($$4.o() == $$3.o()) {
         return Optional.empty();
      } else if (this.b.a($$0) || this.b.a($$0, $$3) && !this.b.a($$0, $$4)) {
         for (cyb.e $$6 : this.b.a()) {
            cyb.c $$7 = $$6.a($$2, $$4, $$3);
            if ($$5.test($$1, $$2, $$7)) {
               return Optional.of($$7);
            }
         }

         return Optional.empty();
      } else {
         return Optional.empty();
      }
   }

   public Optional<cyb.c> a(cqc $$0, cyb.c $$1, boolean $$2) {
      dfd $$3 = $$0.a_($$1.a());
      return this.b.a($$0, $$1, $$3, $$2) ? Optional.of($$1) : Optional.empty();
   }

   public static class a implements cyb.b {
      protected cya a;

      public a(cya $$0) {
         this.a = $$0;
      }

      @Nullable
      @Override
      public dfd a(dfd $$0, cph $$1, gw $$2, ha $$3) {
         return this.a.c($$0, $$1, $$2, $$3);
      }

      protected boolean a(cph $$0, gw $$1, gw $$2, ha $$3, dfd $$4) {
         return $$4.i() || $$4.a(this.a) || $$4.a(cte.G) && $$4.u().b();
      }

      @Override
      public boolean a(cph $$0, gw $$1, cyb.c $$2) {
         dfd $$3 = $$0.a_($$2.a());
         return this.a($$0, $$1, $$2.a(), $$2.b(), $$3) && this.a.a($$0, $$3, $$2.a(), $$2.b());
      }
   }

   public interface b {
      @Nullable
      dfd a(dfd var1, cph var2, gw var3, ha var4);

      boolean a(cph var1, gw var2, cyb.c var3);

      default cyb.e[] a() {
         return cyb.a;
      }

      default boolean a(dfd $$0, ha $$1) {
         return cya.a($$0, $$1);
      }

      default boolean a(dfd $$0) {
         return false;
      }

      default boolean b(dfd $$0, ha $$1) {
         return this.a($$0) || this.a($$0, $$1);
      }

      default boolean a(cqc $$0, cyb.c $$1, dfd $$2, boolean $$3) {
         dfd $$4 = this.a($$2, $$0, $$1.a(), $$1.b());
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

   public static record c(gw a, ha b) {
   }

   @FunctionalInterface
   public interface d {
      boolean test(cph var1, gw var2, cyb.c var3);
   }

   public static enum e {
      a {
         @Override
         public cyb.c a(gw $$0, ha $$1, ha $$2) {
            return new cyb.c($$0, $$1);
         }
      },
      b {
         @Override
         public cyb.c a(gw $$0, ha $$1, ha $$2) {
            return new cyb.c($$0.a($$1), $$2);
         }
      },
      c {
         @Override
         public cyb.c a(gw $$0, ha $$1, ha $$2) {
            return new cyb.c($$0.a($$1).a($$2), $$1.g());
         }
      };

      public abstract cyb.c a(gw var1, ha var2, ha var3);
   }
}
