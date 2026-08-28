import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import javax.annotation.Nullable;

public class dsk {
   public static final dsk.e[] a = new dsk.e[]{dsk.e.a, dsk.e.b, dsk.e.c};
   private final dsk.b b;

   public dsk(dsi $$0) {
      this(new dsk.a($$0));
   }

   public dsk(dsk.b $$0) {
      this.b = $$0;
   }

   public boolean a(ebe $$0, djb $$1, iv $$2, jb $$3) {
      return jb.a().anyMatch($$4 -> this.a($$0, $$1, $$2, $$3, $$4, this.b::a).isPresent());
   }

   public Optional<dsk.c> a(ebe $$0, djy $$1, iv $$2, azx $$3) {
      return jb.a($$3)
         .stream()
         .filter($$1x -> this.b.b($$0, $$1x))
         .map($$4 -> this.a($$0, $$1, $$2, $$4, $$3, false))
         .filter(Optional::isPresent)
         .findFirst()
         .orElse(Optional.empty());
   }

   public long a(ebe $$0, djy $$1, iv $$2, boolean $$3) {
      return jb.a().filter($$1x -> this.b.b($$0, $$1x)).map($$4 -> this.a($$0, $$1, $$2, $$4, $$3)).reduce(0L, Long::sum);
   }

   public Optional<dsk.c> a(ebe $$0, djy $$1, iv $$2, jb $$3, azx $$4, boolean $$5) {
      return jb.a($$4).stream().map($$5x -> this.a($$0, $$1, $$2, $$3, $$5x, $$5)).filter(Optional::isPresent).findFirst().orElse(Optional.empty());
   }

   private long a(ebe $$0, djy $$1, iv $$2, jb $$3, boolean $$4) {
      return jb.a().map($$5 -> this.a($$0, $$1, $$2, $$3, $$5, $$4)).filter(Optional::isPresent).count();
   }

   @VisibleForTesting
   public Optional<dsk.c> a(ebe $$0, djy $$1, iv $$2, jb $$3, jb $$4, boolean $$5) {
      return this.a($$0, $$1, $$2, $$3, $$4, this.b::a).flatMap($$2x -> this.a($$1, $$2x, $$5));
   }

   public Optional<dsk.c> a(ebe $$0, djb $$1, iv $$2, jb $$3, jb $$4, dsk.d $$5) {
      if ($$4.o() == $$3.o()) {
         return Optional.empty();
      } else if (this.b.a($$0) || this.b.a($$0, $$3) && !this.b.a($$0, $$4)) {
         for (dsk.e $$6 : this.b.a()) {
            dsk.c $$7 = $$6.a($$2, $$4, $$3);
            if ($$5.test($$1, $$2, $$7)) {
               return Optional.of($$7);
            }
         }

         return Optional.empty();
      } else {
         return Optional.empty();
      }
   }

   public Optional<dsk.c> a(djy $$0, dsk.c $$1, boolean $$2) {
      ebe $$3 = $$0.a_($$1.a());
      return this.b.a($$0, $$1, $$3, $$2) ? Optional.of($$1) : Optional.empty();
   }

   public static class a implements dsk.b {
      protected dsi a;

      public a(dsi $$0) {
         this.a = $$0;
      }

      @Nullable
      @Override
      public ebe a(ebe $$0, djb $$1, iv $$2, jb $$3) {
         return this.a.c($$0, $$1, $$2, $$3);
      }

      protected boolean a(djb $$0, iv $$1, iv $$2, jb $$3, ebe $$4) {
         return $$4.l() || $$4.a(this.a) || $$4.a(dne.J) && $$4.y().b();
      }

      @Override
      public boolean a(djb $$0, iv $$1, dsk.c $$2) {
         ebe $$3 = $$0.a_($$2.a());
         return this.a($$0, $$1, $$2.a(), $$2.b(), $$3) && this.a.a($$0, $$3, $$2.a(), $$2.b());
      }
   }

   public interface b {
      @Nullable
      ebe a(ebe var1, djb var2, iv var3, jb var4);

      boolean a(djb var1, iv var2, dsk.c var3);

      default dsk.e[] a() {
         return dsk.a;
      }

      default boolean a(ebe $$0, jb $$1) {
         return dsi.a($$0, $$1);
      }

      default boolean a(ebe $$0) {
         return false;
      }

      default boolean b(ebe $$0, jb $$1) {
         return this.a($$0) || this.a($$0, $$1);
      }

      default boolean a(djy $$0, dsk.c $$1, ebe $$2, boolean $$3) {
         ebe $$4 = this.a($$2, $$0, $$1.a(), $$1.b());
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

   public static record c(iv a, jb b) {
   }

   @FunctionalInterface
   public interface d {
      boolean test(djb var1, iv var2, dsk.c var3);
   }

   public static enum e {
      a {
         @Override
         public dsk.c a(iv $$0, jb $$1, jb $$2) {
            return new dsk.c($$0, $$1);
         }
      },
      b {
         @Override
         public dsk.c a(iv $$0, jb $$1, jb $$2) {
            return new dsk.c($$0.a($$1), $$2);
         }
      },
      c {
         @Override
         public dsk.c a(iv $$0, jb $$1, jb $$2) {
            return new dsk.c($$0.a($$1).a($$2), $$1.g());
         }
      };

      public abstract dsk.c a(iv var1, jb var2, jb var3);
   }
}
