import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import javax.annotation.Nullable;

public class cxu {
   public static final cxu.e[] a = new cxu.e[]{cxu.e.a, cxu.e.b, cxu.e.c};
   private final cxu.b b;

   public cxu(cxt $$0) {
      this(new cxu.a($$0));
   }

   public cxu(cxu.b $$0) {
      this.b = $$0;
   }

   public boolean a(dfj $$0, cpb $$1, gw $$2, ha $$3) {
      return ha.a().anyMatch($$4 -> this.a($$0, $$1, $$2, $$3, $$4, this.b::a).isPresent());
   }

   public Optional<cxu.c> a(dfj $$0, cpw $$1, gw $$2, asc $$3) {
      return ha.a($$3)
         .stream()
         .filter($$1x -> this.b.b($$0, $$1x))
         .map($$4 -> this.a($$0, $$1, $$2, $$4, $$3, false))
         .filter(Optional::isPresent)
         .findFirst()
         .orElse(Optional.empty());
   }

   public long a(dfj $$0, cpw $$1, gw $$2, boolean $$3) {
      return ha.a().filter($$1x -> this.b.b($$0, $$1x)).map($$4 -> this.a($$0, $$1, $$2, $$4, $$3)).reduce(0L, Long::sum);
   }

   public Optional<cxu.c> a(dfj $$0, cpw $$1, gw $$2, ha $$3, asc $$4, boolean $$5) {
      return ha.a($$4).stream().map($$5x -> this.a($$0, $$1, $$2, $$3, $$5x, $$5)).filter(Optional::isPresent).findFirst().orElse(Optional.empty());
   }

   private long a(dfj $$0, cpw $$1, gw $$2, ha $$3, boolean $$4) {
      return ha.a().map($$5 -> this.a($$0, $$1, $$2, $$3, $$5, $$4)).filter(Optional::isPresent).count();
   }

   @VisibleForTesting
   public Optional<cxu.c> a(dfj $$0, cpw $$1, gw $$2, ha $$3, ha $$4, boolean $$5) {
      return this.a($$0, $$1, $$2, $$3, $$4, this.b::a).flatMap($$2x -> this.a($$1, $$2x, $$5));
   }

   public Optional<cxu.c> a(dfj $$0, cpb $$1, gw $$2, ha $$3, ha $$4, cxu.d $$5) {
      if ($$4.o() == $$3.o()) {
         return Optional.empty();
      } else if (this.b.a($$0) || this.b.a($$0, $$3) && !this.b.a($$0, $$4)) {
         for (cxu.e $$6 : this.b.a()) {
            cxu.c $$7 = $$6.a($$2, $$4, $$3);
            if ($$5.test($$1, $$2, $$7)) {
               return Optional.of($$7);
            }
         }

         return Optional.empty();
      } else {
         return Optional.empty();
      }
   }

   public Optional<cxu.c> a(cpw $$0, cxu.c $$1, boolean $$2) {
      dfj $$3 = $$0.a_($$1.a());
      return this.b.a($$0, $$1, $$3, $$2) ? Optional.of($$1) : Optional.empty();
   }

   public static class a implements cxu.b {
      protected cxt a;

      public a(cxt $$0) {
         this.a = $$0;
      }

      @Nullable
      @Override
      public dfj a(dfj $$0, cpb $$1, gw $$2, ha $$3) {
         return this.a.c($$0, $$1, $$2, $$3);
      }

      protected boolean a(cpb $$0, gw $$1, gw $$2, ha $$3, dfj $$4) {
         return $$4.i() || $$4.a(this.a) || $$4.a(csw.G) && $$4.u().b();
      }

      @Override
      public boolean a(cpb $$0, gw $$1, cxu.c $$2) {
         dfj $$3 = $$0.a_($$2.a());
         return this.a($$0, $$1, $$2.a(), $$2.b(), $$3) && this.a.a($$0, $$3, $$2.a(), $$2.b());
      }
   }

   public interface b {
      @Nullable
      dfj a(dfj var1, cpb var2, gw var3, ha var4);

      boolean a(cpb var1, gw var2, cxu.c var3);

      default cxu.e[] a() {
         return cxu.a;
      }

      default boolean a(dfj $$0, ha $$1) {
         return cxt.a($$0, $$1);
      }

      default boolean a(dfj $$0) {
         return false;
      }

      default boolean b(dfj $$0, ha $$1) {
         return this.a($$0) || this.a($$0, $$1);
      }

      default boolean a(cpw $$0, cxu.c $$1, dfj $$2, boolean $$3) {
         dfj $$4 = this.a($$2, $$0, $$1.a(), $$1.b());
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
      boolean test(cpb var1, gw var2, cxu.c var3);
   }

   public static enum e {
      a {
         @Override
         public cxu.c a(gw $$0, ha $$1, ha $$2) {
            return new cxu.c($$0, $$1);
         }
      },
      b {
         @Override
         public cxu.c a(gw $$0, ha $$1, ha $$2) {
            return new cxu.c($$0.a($$1), $$2);
         }
      },
      c {
         @Override
         public cxu.c a(gw $$0, ha $$1, ha $$2) {
            return new cxu.c($$0.a($$1).a($$2), $$1.g());
         }
      };

      public abstract cxu.c a(gw var1, ha var2, ha var3);
   }
}
