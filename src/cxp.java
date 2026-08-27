import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import javax.annotation.Nullable;

public class cxp {
   public static final cxp.e[] a = new cxp.e[]{cxp.e.a, cxp.e.b, cxp.e.c};
   private final cxp.b b;

   public cxp(cxo $$0) {
      this(new cxp.a($$0));
   }

   public cxp(cxp.b $$0) {
      this.b = $$0;
   }

   public boolean a(dfe $$0, cow $$1, gw $$2, hc $$3) {
      return hc.a().anyMatch($$4 -> this.a($$0, $$1, $$2, $$3, $$4, this.b::a).isPresent());
   }

   public Optional<cxp.c> a(dfe $$0, cpr $$1, gw $$2, arx $$3) {
      return hc.a($$3)
         .stream()
         .filter($$1x -> this.b.b($$0, $$1x))
         .map($$4 -> this.a($$0, $$1, $$2, $$4, $$3, false))
         .filter(Optional::isPresent)
         .findFirst()
         .orElse(Optional.empty());
   }

   public long a(dfe $$0, cpr $$1, gw $$2, boolean $$3) {
      return hc.a().filter($$1x -> this.b.b($$0, $$1x)).map($$4 -> this.a($$0, $$1, $$2, $$4, $$3)).reduce(0L, Long::sum);
   }

   public Optional<cxp.c> a(dfe $$0, cpr $$1, gw $$2, hc $$3, arx $$4, boolean $$5) {
      return hc.a($$4).stream().map($$5x -> this.a($$0, $$1, $$2, $$3, $$5x, $$5)).filter(Optional::isPresent).findFirst().orElse(Optional.empty());
   }

   private long a(dfe $$0, cpr $$1, gw $$2, hc $$3, boolean $$4) {
      return hc.a().map($$5 -> this.a($$0, $$1, $$2, $$3, $$5, $$4)).filter(Optional::isPresent).count();
   }

   @VisibleForTesting
   public Optional<cxp.c> a(dfe $$0, cpr $$1, gw $$2, hc $$3, hc $$4, boolean $$5) {
      return this.a($$0, $$1, $$2, $$3, $$4, this.b::a).flatMap($$2x -> this.a($$1, $$2x, $$5));
   }

   public Optional<cxp.c> a(dfe $$0, cow $$1, gw $$2, hc $$3, hc $$4, cxp.d $$5) {
      if ($$4.o() == $$3.o()) {
         return Optional.empty();
      } else if (this.b.a($$0) || this.b.a($$0, $$3) && !this.b.a($$0, $$4)) {
         for (cxp.e $$6 : this.b.a()) {
            cxp.c $$7 = $$6.a($$2, $$4, $$3);
            if ($$5.test($$1, $$2, $$7)) {
               return Optional.of($$7);
            }
         }

         return Optional.empty();
      } else {
         return Optional.empty();
      }
   }

   public Optional<cxp.c> a(cpr $$0, cxp.c $$1, boolean $$2) {
      dfe $$3 = $$0.a_($$1.a());
      return this.b.a($$0, $$1, $$3, $$2) ? Optional.of($$1) : Optional.empty();
   }

   public static class a implements cxp.b {
      protected cxo a;

      public a(cxo $$0) {
         this.a = $$0;
      }

      @Nullable
      @Override
      public dfe a(dfe $$0, cow $$1, gw $$2, hc $$3) {
         return this.a.c($$0, $$1, $$2, $$3);
      }

      protected boolean a(cow $$0, gw $$1, gw $$2, hc $$3, dfe $$4) {
         return $$4.i() || $$4.a(this.a) || $$4.a(csr.G) && $$4.u().b();
      }

      @Override
      public boolean a(cow $$0, gw $$1, cxp.c $$2) {
         dfe $$3 = $$0.a_($$2.a());
         return this.a($$0, $$1, $$2.a(), $$2.b(), $$3) && this.a.a($$0, $$3, $$2.a(), $$2.b());
      }
   }

   public interface b {
      @Nullable
      dfe a(dfe var1, cow var2, gw var3, hc var4);

      boolean a(cow var1, gw var2, cxp.c var3);

      default cxp.e[] a() {
         return cxp.a;
      }

      default boolean a(dfe $$0, hc $$1) {
         return cxo.a($$0, $$1);
      }

      default boolean a(dfe $$0) {
         return false;
      }

      default boolean b(dfe $$0, hc $$1) {
         return this.a($$0) || this.a($$0, $$1);
      }

      default boolean a(cpr $$0, cxp.c $$1, dfe $$2, boolean $$3) {
         dfe $$4 = this.a($$2, $$0, $$1.a(), $$1.b());
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

   public static record c(gw a, hc b) {
   }

   @FunctionalInterface
   public interface d {
      boolean test(cow var1, gw var2, cxp.c var3);
   }

   public static enum e {
      a {
         @Override
         public cxp.c a(gw $$0, hc $$1, hc $$2) {
            return new cxp.c($$0, $$1);
         }
      },
      b {
         @Override
         public cxp.c a(gw $$0, hc $$1, hc $$2) {
            return new cxp.c($$0.a($$1), $$2);
         }
      },
      c {
         @Override
         public cxp.c a(gw $$0, hc $$1, hc $$2) {
            return new cxp.c($$0.a($$1).a($$2), $$1.g());
         }
      };

      public abstract cxp.c a(gw var1, hc var2, hc var3);
   }
}
