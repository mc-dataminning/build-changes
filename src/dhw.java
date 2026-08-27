import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import javax.annotation.Nullable;

public class dhw {
   public static final dhw.e[] a = new dhw.e[]{dhw.e.a, dhw.e.b, dhw.e.c};
   private final dhw.b b;

   public dhw(dhv $$0) {
      this(new dhw.a($$0));
   }

   public dhw(dhw.b $$0) {
      this.b = $$0;
   }

   public boolean a(dpy $$0, cza $$1, im $$2, ir $$3) {
      return ir.a().anyMatch($$4 -> this.a($$0, $$1, $$2, $$3, $$4, this.b::a).isPresent());
   }

   public Optional<dhw.c> a(dpy $$0, czv $$1, im $$2, ayd $$3) {
      return ir.a($$3)
         .stream()
         .filter($$1x -> this.b.b($$0, $$1x))
         .map($$4 -> this.a($$0, $$1, $$2, $$4, $$3, false))
         .filter(Optional::isPresent)
         .findFirst()
         .orElse(Optional.empty());
   }

   public long a(dpy $$0, czv $$1, im $$2, boolean $$3) {
      return ir.a().filter($$1x -> this.b.b($$0, $$1x)).map($$4 -> this.a($$0, $$1, $$2, $$4, $$3)).reduce(0L, Long::sum);
   }

   public Optional<dhw.c> a(dpy $$0, czv $$1, im $$2, ir $$3, ayd $$4, boolean $$5) {
      return ir.a($$4).stream().map($$5x -> this.a($$0, $$1, $$2, $$3, $$5x, $$5)).filter(Optional::isPresent).findFirst().orElse(Optional.empty());
   }

   private long a(dpy $$0, czv $$1, im $$2, ir $$3, boolean $$4) {
      return ir.a().map($$5 -> this.a($$0, $$1, $$2, $$3, $$5, $$4)).filter(Optional::isPresent).count();
   }

   @VisibleForTesting
   public Optional<dhw.c> a(dpy $$0, czv $$1, im $$2, ir $$3, ir $$4, boolean $$5) {
      return this.a($$0, $$1, $$2, $$3, $$4, this.b::a).flatMap($$2x -> this.a($$1, $$2x, $$5));
   }

   public Optional<dhw.c> a(dpy $$0, cza $$1, im $$2, ir $$3, ir $$4, dhw.d $$5) {
      if ($$4.o() == $$3.o()) {
         return Optional.empty();
      } else if (this.b.a($$0) || this.b.a($$0, $$3) && !this.b.a($$0, $$4)) {
         for (dhw.e $$6 : this.b.a()) {
            dhw.c $$7 = $$6.a($$2, $$4, $$3);
            if ($$5.test($$1, $$2, $$7)) {
               return Optional.of($$7);
            }
         }

         return Optional.empty();
      } else {
         return Optional.empty();
      }
   }

   public Optional<dhw.c> a(czv $$0, dhw.c $$1, boolean $$2) {
      dpy $$3 = $$0.a_($$1.a());
      return this.b.a($$0, $$1, $$3, $$2) ? Optional.of($$1) : Optional.empty();
   }

   public static class a implements dhw.b {
      protected dhv a;

      public a(dhv $$0) {
         this.a = $$0;
      }

      @Nullable
      @Override
      public dpy a(dpy $$0, cza $$1, im $$2, ir $$3) {
         return this.a.c($$0, $$1, $$2, $$3);
      }

      protected boolean a(cza $$0, im $$1, im $$2, ir $$3, dpy $$4) {
         return $$4.i() || $$4.a(this.a) || $$4.a(dcx.G) && $$4.u().b();
      }

      @Override
      public boolean a(cza $$0, im $$1, dhw.c $$2) {
         dpy $$3 = $$0.a_($$2.a());
         return this.a($$0, $$1, $$2.a(), $$2.b(), $$3) && this.a.a($$0, $$3, $$2.a(), $$2.b());
      }
   }

   public interface b {
      @Nullable
      dpy a(dpy var1, cza var2, im var3, ir var4);

      boolean a(cza var1, im var2, dhw.c var3);

      default dhw.e[] a() {
         return dhw.a;
      }

      default boolean a(dpy $$0, ir $$1) {
         return dhv.a($$0, $$1);
      }

      default boolean a(dpy $$0) {
         return false;
      }

      default boolean b(dpy $$0, ir $$1) {
         return this.a($$0) || this.a($$0, $$1);
      }

      default boolean a(czv $$0, dhw.c $$1, dpy $$2, boolean $$3) {
         dpy $$4 = this.a($$2, $$0, $$1.a(), $$1.b());
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

   public static record c(im a, ir b) {
   }

   @FunctionalInterface
   public interface d {
      boolean test(cza var1, im var2, dhw.c var3);
   }

   public static enum e {
      a {
         @Override
         public dhw.c a(im $$0, ir $$1, ir $$2) {
            return new dhw.c($$0, $$1);
         }
      },
      b {
         @Override
         public dhw.c a(im $$0, ir $$1, ir $$2) {
            return new dhw.c($$0.a($$1), $$2);
         }
      },
      c {
         @Override
         public dhw.c a(im $$0, ir $$1, ir $$2) {
            return new dhw.c($$0.a($$1).a($$2), $$1.g());
         }
      };

      public abstract dhw.c a(im var1, ir var2, ir var3);
   }
}
