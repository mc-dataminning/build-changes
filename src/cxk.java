import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import javax.annotation.Nullable;

public class cxk {
   public static final cxk.e[] a = new cxk.e[]{cxk.e.a, cxk.e.b, cxk.e.c};
   private final cxk.b b;

   public cxk(cxj $$0) {
      this(new cxk.a($$0));
   }

   public cxk(cxk.b $$0) {
      this.b = $$0;
   }

   public boolean a(dez $$0, cor $$1, gu $$2, ha $$3) {
      return ha.a().anyMatch($$4 -> this.a($$0, $$1, $$2, $$3, $$4, this.b::a).isPresent());
   }

   public Optional<cxk.c> a(dez $$0, cpm $$1, gu $$2, aru $$3) {
      return ha.a($$3)
         .stream()
         .filter($$1x -> this.b.b($$0, $$1x))
         .map($$4 -> this.a($$0, $$1, $$2, $$4, $$3, false))
         .filter(Optional::isPresent)
         .findFirst()
         .orElse(Optional.empty());
   }

   public long a(dez $$0, cpm $$1, gu $$2, boolean $$3) {
      return ha.a().filter($$1x -> this.b.b($$0, $$1x)).map($$4 -> this.a($$0, $$1, $$2, $$4, $$3)).reduce(0L, Long::sum);
   }

   public Optional<cxk.c> a(dez $$0, cpm $$1, gu $$2, ha $$3, aru $$4, boolean $$5) {
      return ha.a($$4).stream().map($$5x -> this.a($$0, $$1, $$2, $$3, $$5x, $$5)).filter(Optional::isPresent).findFirst().orElse(Optional.empty());
   }

   private long a(dez $$0, cpm $$1, gu $$2, ha $$3, boolean $$4) {
      return ha.a().map($$5 -> this.a($$0, $$1, $$2, $$3, $$5, $$4)).filter(Optional::isPresent).count();
   }

   @VisibleForTesting
   public Optional<cxk.c> a(dez $$0, cpm $$1, gu $$2, ha $$3, ha $$4, boolean $$5) {
      return this.a($$0, $$1, $$2, $$3, $$4, this.b::a).flatMap($$2x -> this.a($$1, $$2x, $$5));
   }

   public Optional<cxk.c> a(dez $$0, cor $$1, gu $$2, ha $$3, ha $$4, cxk.d $$5) {
      if ($$4.o() == $$3.o()) {
         return Optional.empty();
      } else if (this.b.a($$0) || this.b.a($$0, $$3) && !this.b.a($$0, $$4)) {
         for (cxk.e $$6 : this.b.a()) {
            cxk.c $$7 = $$6.a($$2, $$4, $$3);
            if ($$5.test($$1, $$2, $$7)) {
               return Optional.of($$7);
            }
         }

         return Optional.empty();
      } else {
         return Optional.empty();
      }
   }

   public Optional<cxk.c> a(cpm $$0, cxk.c $$1, boolean $$2) {
      dez $$3 = $$0.a_($$1.a());
      return this.b.a($$0, $$1, $$3, $$2) ? Optional.of($$1) : Optional.empty();
   }

   public static class a implements cxk.b {
      protected cxj a;

      public a(cxj $$0) {
         this.a = $$0;
      }

      @Nullable
      @Override
      public dez a(dez $$0, cor $$1, gu $$2, ha $$3) {
         return this.a.c($$0, $$1, $$2, $$3);
      }

      protected boolean a(cor $$0, gu $$1, gu $$2, ha $$3, dez $$4) {
         return $$4.i() || $$4.a(this.a) || $$4.a(csm.G) && $$4.u().b();
      }

      @Override
      public boolean a(cor $$0, gu $$1, cxk.c $$2) {
         dez $$3 = $$0.a_($$2.a());
         return this.a($$0, $$1, $$2.a(), $$2.b(), $$3) && this.a.a($$0, $$3, $$2.a(), $$2.b());
      }
   }

   public interface b {
      @Nullable
      dez a(dez var1, cor var2, gu var3, ha var4);

      boolean a(cor var1, gu var2, cxk.c var3);

      default cxk.e[] a() {
         return cxk.a;
      }

      default boolean a(dez $$0, ha $$1) {
         return cxj.a($$0, $$1);
      }

      default boolean a(dez $$0) {
         return false;
      }

      default boolean b(dez $$0, ha $$1) {
         return this.a($$0) || this.a($$0, $$1);
      }

      default boolean a(cpm $$0, cxk.c $$1, dez $$2, boolean $$3) {
         dez $$4 = this.a($$2, $$0, $$1.a(), $$1.b());
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

   public static record c(gu a, ha b) {
   }

   @FunctionalInterface
   public interface d {
      boolean test(cor var1, gu var2, cxk.c var3);
   }

   public static enum e {
      a {
         @Override
         public cxk.c a(gu $$0, ha $$1, ha $$2) {
            return new cxk.c($$0, $$1);
         }
      },
      b {
         @Override
         public cxk.c a(gu $$0, ha $$1, ha $$2) {
            return new cxk.c($$0.a($$1), $$2);
         }
      },
      c {
         @Override
         public cxk.c a(gu $$0, ha $$1, ha $$2) {
            return new cxk.c($$0.a($$1).a($$2), $$1.g());
         }
      };

      public abstract cxk.c a(gu var1, ha var2, ha var3);
   }
}
