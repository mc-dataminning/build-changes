import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import javax.annotation.Nullable;

public class cxw {
   public static final cxw.e[] a = new cxw.e[]{cxw.e.a, cxw.e.b, cxw.e.c};
   private final cxw.b b;

   public cxw(cxv $$0) {
      this(new cxw.a($$0));
   }

   public cxw(cxw.b $$0) {
      this.b = $$0;
   }

   public boolean a(dfl $$0, cpd $$1, gw $$2, hc $$3) {
      return hc.a().anyMatch($$4 -> this.a($$0, $$1, $$2, $$3, $$4, this.b::a).isPresent());
   }

   public Optional<cxw.c> a(dfl $$0, cpy $$1, gw $$2, ase $$3) {
      return hc.a($$3)
         .stream()
         .filter($$1x -> this.b.b($$0, $$1x))
         .map($$4 -> this.a($$0, $$1, $$2, $$4, $$3, false))
         .filter(Optional::isPresent)
         .findFirst()
         .orElse(Optional.empty());
   }

   public long a(dfl $$0, cpy $$1, gw $$2, boolean $$3) {
      return hc.a().filter($$1x -> this.b.b($$0, $$1x)).map($$4 -> this.a($$0, $$1, $$2, $$4, $$3)).reduce(0L, Long::sum);
   }

   public Optional<cxw.c> a(dfl $$0, cpy $$1, gw $$2, hc $$3, ase $$4, boolean $$5) {
      return hc.a($$4).stream().map($$5x -> this.a($$0, $$1, $$2, $$3, $$5x, $$5)).filter(Optional::isPresent).findFirst().orElse(Optional.empty());
   }

   private long a(dfl $$0, cpy $$1, gw $$2, hc $$3, boolean $$4) {
      return hc.a().map($$5 -> this.a($$0, $$1, $$2, $$3, $$5, $$4)).filter(Optional::isPresent).count();
   }

   @VisibleForTesting
   public Optional<cxw.c> a(dfl $$0, cpy $$1, gw $$2, hc $$3, hc $$4, boolean $$5) {
      return this.a($$0, $$1, $$2, $$3, $$4, this.b::a).flatMap($$2x -> this.a($$1, $$2x, $$5));
   }

   public Optional<cxw.c> a(dfl $$0, cpd $$1, gw $$2, hc $$3, hc $$4, cxw.d $$5) {
      if ($$4.o() == $$3.o()) {
         return Optional.empty();
      } else if (this.b.a($$0) || this.b.a($$0, $$3) && !this.b.a($$0, $$4)) {
         for (cxw.e $$6 : this.b.a()) {
            cxw.c $$7 = $$6.a($$2, $$4, $$3);
            if ($$5.test($$1, $$2, $$7)) {
               return Optional.of($$7);
            }
         }

         return Optional.empty();
      } else {
         return Optional.empty();
      }
   }

   public Optional<cxw.c> a(cpy $$0, cxw.c $$1, boolean $$2) {
      dfl $$3 = $$0.a_($$1.a());
      return this.b.a($$0, $$1, $$3, $$2) ? Optional.of($$1) : Optional.empty();
   }

   public static class a implements cxw.b {
      protected cxv a;

      public a(cxv $$0) {
         this.a = $$0;
      }

      @Nullable
      @Override
      public dfl a(dfl $$0, cpd $$1, gw $$2, hc $$3) {
         return this.a.c($$0, $$1, $$2, $$3);
      }

      protected boolean a(cpd $$0, gw $$1, gw $$2, hc $$3, dfl $$4) {
         return $$4.i() || $$4.a(this.a) || $$4.a(csy.G) && $$4.u().b();
      }

      @Override
      public boolean a(cpd $$0, gw $$1, cxw.c $$2) {
         dfl $$3 = $$0.a_($$2.a());
         return this.a($$0, $$1, $$2.a(), $$2.b(), $$3) && this.a.a($$0, $$3, $$2.a(), $$2.b());
      }
   }

   public interface b {
      @Nullable
      dfl a(dfl var1, cpd var2, gw var3, hc var4);

      boolean a(cpd var1, gw var2, cxw.c var3);

      default cxw.e[] a() {
         return cxw.a;
      }

      default boolean a(dfl $$0, hc $$1) {
         return cxv.a($$0, $$1);
      }

      default boolean a(dfl $$0) {
         return false;
      }

      default boolean b(dfl $$0, hc $$1) {
         return this.a($$0) || this.a($$0, $$1);
      }

      default boolean a(cpy $$0, cxw.c $$1, dfl $$2, boolean $$3) {
         dfl $$4 = this.a($$2, $$0, $$1.a(), $$1.b());
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
      boolean test(cpd var1, gw var2, cxw.c var3);
   }

   public static enum e {
      a {
         @Override
         public cxw.c a(gw $$0, hc $$1, hc $$2) {
            return new cxw.c($$0, $$1);
         }
      },
      b {
         @Override
         public cxw.c a(gw $$0, hc $$1, hc $$2) {
            return new cxw.c($$0.a($$1), $$2);
         }
      },
      c {
         @Override
         public cxw.c a(gw $$0, hc $$1, hc $$2) {
            return new cxw.c($$0.a($$1).a($$2), $$1.g());
         }
      };

      public abstract cxw.c a(gw var1, hc var2, hc var3);
   }
}
