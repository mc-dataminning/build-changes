import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import javax.annotation.Nullable;

public class doo {
   public static final doo.e[] a = new doo.e[]{doo.e.a, doo.e.b, doo.e.c};
   private final doo.b b;

   public doo(dom $$0) {
      this(new doo.a($$0));
   }

   public doo(doo.b $$0) {
      this.b = $$0;
   }

   public boolean a(dwv $$0, dfl $$1, ji $$2, jn $$3) {
      return jn.a().anyMatch($$4 -> this.a($$0, $$1, $$2, $$3, $$4, this.b::a).isPresent());
   }

   public Optional<doo.c> a(dwv $$0, dgh $$1, ji $$2, azg $$3) {
      return jn.a($$3)
         .stream()
         .filter($$1x -> this.b.b($$0, $$1x))
         .map($$4 -> this.a($$0, $$1, $$2, $$4, $$3, false))
         .filter(Optional::isPresent)
         .findFirst()
         .orElse(Optional.empty());
   }

   public long a(dwv $$0, dgh $$1, ji $$2, boolean $$3) {
      return jn.a().filter($$1x -> this.b.b($$0, $$1x)).map($$4 -> this.a($$0, $$1, $$2, $$4, $$3)).reduce(0L, Long::sum);
   }

   public Optional<doo.c> a(dwv $$0, dgh $$1, ji $$2, jn $$3, azg $$4, boolean $$5) {
      return jn.a($$4).stream().map($$5x -> this.a($$0, $$1, $$2, $$3, $$5x, $$5)).filter(Optional::isPresent).findFirst().orElse(Optional.empty());
   }

   private long a(dwv $$0, dgh $$1, ji $$2, jn $$3, boolean $$4) {
      return jn.a().map($$5 -> this.a($$0, $$1, $$2, $$3, $$5, $$4)).filter(Optional::isPresent).count();
   }

   @VisibleForTesting
   public Optional<doo.c> a(dwv $$0, dgh $$1, ji $$2, jn $$3, jn $$4, boolean $$5) {
      return this.a($$0, $$1, $$2, $$3, $$4, this.b::a).flatMap($$2x -> this.a($$1, $$2x, $$5));
   }

   public Optional<doo.c> a(dwv $$0, dfl $$1, ji $$2, jn $$3, jn $$4, doo.d $$5) {
      if ($$4.o() == $$3.o()) {
         return Optional.empty();
      } else if (this.b.a($$0) || this.b.a($$0, $$3) && !this.b.a($$0, $$4)) {
         for (doo.e $$6 : this.b.a()) {
            doo.c $$7 = $$6.a($$2, $$4, $$3);
            if ($$5.test($$1, $$2, $$7)) {
               return Optional.of($$7);
            }
         }

         return Optional.empty();
      } else {
         return Optional.empty();
      }
   }

   public Optional<doo.c> a(dgh $$0, doo.c $$1, boolean $$2) {
      dwv $$3 = $$0.a_($$1.a());
      return this.b.a($$0, $$1, $$3, $$2) ? Optional.of($$1) : Optional.empty();
   }

   public static class a implements doo.b {
      protected dom a;

      public a(dom $$0) {
         this.a = $$0;
      }

      @Nullable
      @Override
      public dwv a(dwv $$0, dfl $$1, ji $$2, jn $$3) {
         return this.a.c($$0, $$1, $$2, $$3);
      }

      protected boolean a(dfl $$0, ji $$1, ji $$2, jn $$3, dwv $$4) {
         return $$4.l() || $$4.a(this.a) || $$4.a(djm.J) && $$4.y().b();
      }

      @Override
      public boolean a(dfl $$0, ji $$1, doo.c $$2) {
         dwv $$3 = $$0.a_($$2.a());
         return this.a($$0, $$1, $$2.a(), $$2.b(), $$3) && this.a.a($$0, $$3, $$2.a(), $$2.b());
      }
   }

   public interface b {
      @Nullable
      dwv a(dwv var1, dfl var2, ji var3, jn var4);

      boolean a(dfl var1, ji var2, doo.c var3);

      default doo.e[] a() {
         return doo.a;
      }

      default boolean a(dwv $$0, jn $$1) {
         return dom.a($$0, $$1);
      }

      default boolean a(dwv $$0) {
         return false;
      }

      default boolean b(dwv $$0, jn $$1) {
         return this.a($$0) || this.a($$0, $$1);
      }

      default boolean a(dgh $$0, doo.c $$1, dwv $$2, boolean $$3) {
         dwv $$4 = this.a($$2, $$0, $$1.a(), $$1.b());
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

   public static record c(ji a, jn b) {
   }

   @FunctionalInterface
   public interface d {
      boolean test(dfl var1, ji var2, doo.c var3);
   }

   public static enum e {
      a {
         @Override
         public doo.c a(ji $$0, jn $$1, jn $$2) {
            return new doo.c($$0, $$1);
         }
      },
      b {
         @Override
         public doo.c a(ji $$0, jn $$1, jn $$2) {
            return new doo.c($$0.a($$1), $$2);
         }
      },
      c {
         @Override
         public doo.c a(ji $$0, jn $$1, jn $$2) {
            return new doo.c($$0.a($$1).a($$2), $$1.g());
         }
      };

      public abstract doo.c a(ji var1, jn var2, jn var3);
   }
}
