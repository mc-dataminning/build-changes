import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import javax.annotation.Nullable;

public class cxj {
   public static final cxj.e[] a = new cxj.e[]{cxj.e.a, cxj.e.b, cxj.e.c};
   private final cxj.b b;

   public cxj(cxi $$0) {
      this(new cxj.a($$0));
   }

   public cxj(cxj.b $$0) {
      this.b = $$0;
   }

   public boolean a(dey $$0, coq $$1, gv $$2, hb $$3) {
      return hb.a().anyMatch($$4 -> this.a($$0, $$1, $$2, $$3, $$4, this.b::a).isPresent());
   }

   public Optional<cxj.c> a(dey $$0, cpl $$1, gv $$2, art $$3) {
      return hb.a($$3)
         .stream()
         .filter($$1x -> this.b.b($$0, $$1x))
         .map($$4 -> this.a($$0, $$1, $$2, $$4, $$3, false))
         .filter(Optional::isPresent)
         .findFirst()
         .orElse(Optional.empty());
   }

   public long a(dey $$0, cpl $$1, gv $$2, boolean $$3) {
      return hb.a().filter($$1x -> this.b.b($$0, $$1x)).map($$4 -> this.a($$0, $$1, $$2, $$4, $$3)).reduce(0L, Long::sum);
   }

   public Optional<cxj.c> a(dey $$0, cpl $$1, gv $$2, hb $$3, art $$4, boolean $$5) {
      return hb.a($$4).stream().map($$5x -> this.a($$0, $$1, $$2, $$3, $$5x, $$5)).filter(Optional::isPresent).findFirst().orElse(Optional.empty());
   }

   private long a(dey $$0, cpl $$1, gv $$2, hb $$3, boolean $$4) {
      return hb.a().map($$5 -> this.a($$0, $$1, $$2, $$3, $$5, $$4)).filter(Optional::isPresent).count();
   }

   @VisibleForTesting
   public Optional<cxj.c> a(dey $$0, cpl $$1, gv $$2, hb $$3, hb $$4, boolean $$5) {
      return this.a($$0, $$1, $$2, $$3, $$4, this.b::a).flatMap($$2x -> this.a($$1, $$2x, $$5));
   }

   public Optional<cxj.c> a(dey $$0, coq $$1, gv $$2, hb $$3, hb $$4, cxj.d $$5) {
      if ($$4.o() == $$3.o()) {
         return Optional.empty();
      } else if (this.b.a($$0) || this.b.a($$0, $$3) && !this.b.a($$0, $$4)) {
         for (cxj.e $$6 : this.b.a()) {
            cxj.c $$7 = $$6.a($$2, $$4, $$3);
            if ($$5.test($$1, $$2, $$7)) {
               return Optional.of($$7);
            }
         }

         return Optional.empty();
      } else {
         return Optional.empty();
      }
   }

   public Optional<cxj.c> a(cpl $$0, cxj.c $$1, boolean $$2) {
      dey $$3 = $$0.a_($$1.a());
      return this.b.a($$0, $$1, $$3, $$2) ? Optional.of($$1) : Optional.empty();
   }

   public static class a implements cxj.b {
      protected cxi a;

      public a(cxi $$0) {
         this.a = $$0;
      }

      @Nullable
      @Override
      public dey a(dey $$0, coq $$1, gv $$2, hb $$3) {
         return this.a.c($$0, $$1, $$2, $$3);
      }

      protected boolean a(coq $$0, gv $$1, gv $$2, hb $$3, dey $$4) {
         return $$4.i() || $$4.a(this.a) || $$4.a(csl.G) && $$4.u().b();
      }

      @Override
      public boolean a(coq $$0, gv $$1, cxj.c $$2) {
         dey $$3 = $$0.a_($$2.a());
         return this.a($$0, $$1, $$2.a(), $$2.b(), $$3) && this.a.a($$0, $$3, $$2.a(), $$2.b());
      }
   }

   public interface b {
      @Nullable
      dey a(dey var1, coq var2, gv var3, hb var4);

      boolean a(coq var1, gv var2, cxj.c var3);

      default cxj.e[] a() {
         return cxj.a;
      }

      default boolean a(dey $$0, hb $$1) {
         return cxi.a($$0, $$1);
      }

      default boolean a(dey $$0) {
         return false;
      }

      default boolean b(dey $$0, hb $$1) {
         return this.a($$0) || this.a($$0, $$1);
      }

      default boolean a(cpl $$0, cxj.c $$1, dey $$2, boolean $$3) {
         dey $$4 = this.a($$2, $$0, $$1.a(), $$1.b());
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

   public static record c(gv a, hb b) {
   }

   @FunctionalInterface
   public interface d {
      boolean test(coq var1, gv var2, cxj.c var3);
   }

   public static enum e {
      a {
         @Override
         public cxj.c a(gv $$0, hb $$1, hb $$2) {
            return new cxj.c($$0, $$1);
         }
      },
      b {
         @Override
         public cxj.c a(gv $$0, hb $$1, hb $$2) {
            return new cxj.c($$0.a($$1), $$2);
         }
      },
      c {
         @Override
         public cxj.c a(gv $$0, hb $$1, hb $$2) {
            return new cxj.c($$0.a($$1).a($$2), $$1.g());
         }
      };

      public abstract cxj.c a(gv var1, hb var2, hb var3);
   }
}
