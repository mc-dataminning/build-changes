import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import javax.annotation.Nullable;

public class dhh {
   public static final dhh.e[] a = new dhh.e[]{dhh.e.a, dhh.e.b, dhh.e.c};
   private final dhh.b b;

   public dhh(dhg $$0) {
      this(new dhh.a($$0));
   }

   public dhh(dhh.b $$0) {
      this.b = $$0;
   }

   public boolean a(dpi $$0, cym $$1, id $$2, ij $$3) {
      return ij.a().anyMatch($$4 -> this.a($$0, $$1, $$2, $$3, $$4, this.b::a).isPresent());
   }

   public Optional<dhh.c> a(dpi $$0, czh $$1, id $$2, axt $$3) {
      return ij.a($$3)
         .stream()
         .filter($$1x -> this.b.b($$0, $$1x))
         .map($$4 -> this.a($$0, $$1, $$2, $$4, $$3, false))
         .filter(Optional::isPresent)
         .findFirst()
         .orElse(Optional.empty());
   }

   public long a(dpi $$0, czh $$1, id $$2, boolean $$3) {
      return ij.a().filter($$1x -> this.b.b($$0, $$1x)).map($$4 -> this.a($$0, $$1, $$2, $$4, $$3)).reduce(0L, Long::sum);
   }

   public Optional<dhh.c> a(dpi $$0, czh $$1, id $$2, ij $$3, axt $$4, boolean $$5) {
      return ij.a($$4).stream().map($$5x -> this.a($$0, $$1, $$2, $$3, $$5x, $$5)).filter(Optional::isPresent).findFirst().orElse(Optional.empty());
   }

   private long a(dpi $$0, czh $$1, id $$2, ij $$3, boolean $$4) {
      return ij.a().map($$5 -> this.a($$0, $$1, $$2, $$3, $$5, $$4)).filter(Optional::isPresent).count();
   }

   @VisibleForTesting
   public Optional<dhh.c> a(dpi $$0, czh $$1, id $$2, ij $$3, ij $$4, boolean $$5) {
      return this.a($$0, $$1, $$2, $$3, $$4, this.b::a).flatMap($$2x -> this.a($$1, $$2x, $$5));
   }

   public Optional<dhh.c> a(dpi $$0, cym $$1, id $$2, ij $$3, ij $$4, dhh.d $$5) {
      if ($$4.o() == $$3.o()) {
         return Optional.empty();
      } else if (this.b.a($$0) || this.b.a($$0, $$3) && !this.b.a($$0, $$4)) {
         for (dhh.e $$6 : this.b.a()) {
            dhh.c $$7 = $$6.a($$2, $$4, $$3);
            if ($$5.test($$1, $$2, $$7)) {
               return Optional.of($$7);
            }
         }

         return Optional.empty();
      } else {
         return Optional.empty();
      }
   }

   public Optional<dhh.c> a(czh $$0, dhh.c $$1, boolean $$2) {
      dpi $$3 = $$0.a_($$1.a());
      return this.b.a($$0, $$1, $$3, $$2) ? Optional.of($$1) : Optional.empty();
   }

   public static class a implements dhh.b {
      protected dhg a;

      public a(dhg $$0) {
         this.a = $$0;
      }

      @Nullable
      @Override
      public dpi a(dpi $$0, cym $$1, id $$2, ij $$3) {
         return this.a.c($$0, $$1, $$2, $$3);
      }

      protected boolean a(cym $$0, id $$1, id $$2, ij $$3, dpi $$4) {
         return $$4.i() || $$4.a(this.a) || $$4.a(dcj.G) && $$4.u().b();
      }

      @Override
      public boolean a(cym $$0, id $$1, dhh.c $$2) {
         dpi $$3 = $$0.a_($$2.a());
         return this.a($$0, $$1, $$2.a(), $$2.b(), $$3) && this.a.a($$0, $$3, $$2.a(), $$2.b());
      }
   }

   public interface b {
      @Nullable
      dpi a(dpi var1, cym var2, id var3, ij var4);

      boolean a(cym var1, id var2, dhh.c var3);

      default dhh.e[] a() {
         return dhh.a;
      }

      default boolean a(dpi $$0, ij $$1) {
         return dhg.a($$0, $$1);
      }

      default boolean a(dpi $$0) {
         return false;
      }

      default boolean b(dpi $$0, ij $$1) {
         return this.a($$0) || this.a($$0, $$1);
      }

      default boolean a(czh $$0, dhh.c $$1, dpi $$2, boolean $$3) {
         dpi $$4 = this.a($$2, $$0, $$1.a(), $$1.b());
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

   public static record c(id a, ij b) {
   }

   @FunctionalInterface
   public interface d {
      boolean test(cym var1, id var2, dhh.c var3);
   }

   public static enum e {
      a {
         @Override
         public dhh.c a(id $$0, ij $$1, ij $$2) {
            return new dhh.c($$0, $$1);
         }
      },
      b {
         @Override
         public dhh.c a(id $$0, ij $$1, ij $$2) {
            return new dhh.c($$0.a($$1), $$2);
         }
      },
      c {
         @Override
         public dhh.c a(id $$0, ij $$1, ij $$2) {
            return new dhh.c($$0.a($$1).a($$2), $$1.g());
         }
      };

      public abstract dhh.c a(id var1, ij var2, ij var3);
   }
}
