import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import javax.annotation.Nullable;

public class daz {
   public static final daz.e[] a = new daz.e[]{daz.e.a, daz.e.b, daz.e.c};
   private final daz.b b;

   public daz(day $$0) {
      this(new daz.a($$0));
   }

   public daz(daz.b $$0) {
      this.b = $$0;
   }

   public boolean a(dip $$0, cse $$1, hv $$2, ia $$3) {
      return ia.a().anyMatch($$4 -> this.a($$0, $$1, $$2, $$3, $$4, this.b::a).isPresent());
   }

   public Optional<daz.c> a(dip $$0, csz $$1, hv $$2, auf $$3) {
      return ia.a($$3)
         .stream()
         .filter($$1x -> this.b.b($$0, $$1x))
         .map($$4 -> this.a($$0, $$1, $$2, $$4, $$3, false))
         .filter(Optional::isPresent)
         .findFirst()
         .orElse(Optional.empty());
   }

   public long a(dip $$0, csz $$1, hv $$2, boolean $$3) {
      return ia.a().filter($$1x -> this.b.b($$0, $$1x)).map($$4 -> this.a($$0, $$1, $$2, $$4, $$3)).reduce(0L, Long::sum);
   }

   public Optional<daz.c> a(dip $$0, csz $$1, hv $$2, ia $$3, auf $$4, boolean $$5) {
      return ia.a($$4).stream().map($$5x -> this.a($$0, $$1, $$2, $$3, $$5x, $$5)).filter(Optional::isPresent).findFirst().orElse(Optional.empty());
   }

   private long a(dip $$0, csz $$1, hv $$2, ia $$3, boolean $$4) {
      return ia.a().map($$5 -> this.a($$0, $$1, $$2, $$3, $$5, $$4)).filter(Optional::isPresent).count();
   }

   @VisibleForTesting
   public Optional<daz.c> a(dip $$0, csz $$1, hv $$2, ia $$3, ia $$4, boolean $$5) {
      return this.a($$0, $$1, $$2, $$3, $$4, this.b::a).flatMap($$2x -> this.a($$1, $$2x, $$5));
   }

   public Optional<daz.c> a(dip $$0, cse $$1, hv $$2, ia $$3, ia $$4, daz.d $$5) {
      if ($$4.o() == $$3.o()) {
         return Optional.empty();
      } else if (this.b.a($$0) || this.b.a($$0, $$3) && !this.b.a($$0, $$4)) {
         for (daz.e $$6 : this.b.a()) {
            daz.c $$7 = $$6.a($$2, $$4, $$3);
            if ($$5.test($$1, $$2, $$7)) {
               return Optional.of($$7);
            }
         }

         return Optional.empty();
      } else {
         return Optional.empty();
      }
   }

   public Optional<daz.c> a(csz $$0, daz.c $$1, boolean $$2) {
      dip $$3 = $$0.a_($$1.a());
      return this.b.a($$0, $$1, $$3, $$2) ? Optional.of($$1) : Optional.empty();
   }

   public static class a implements daz.b {
      protected day a;

      public a(day $$0) {
         this.a = $$0;
      }

      @Nullable
      @Override
      public dip a(dip $$0, cse $$1, hv $$2, ia $$3) {
         return this.a.c($$0, $$1, $$2, $$3);
      }

      protected boolean a(cse $$0, hv $$1, hv $$2, ia $$3, dip $$4) {
         return $$4.i() || $$4.a(this.a) || $$4.a(cwb.G) && $$4.u().b();
      }

      @Override
      public boolean a(cse $$0, hv $$1, daz.c $$2) {
         dip $$3 = $$0.a_($$2.a());
         return this.a($$0, $$1, $$2.a(), $$2.b(), $$3) && this.a.a($$0, $$3, $$2.a(), $$2.b());
      }
   }

   public interface b {
      @Nullable
      dip a(dip var1, cse var2, hv var3, ia var4);

      boolean a(cse var1, hv var2, daz.c var3);

      default daz.e[] a() {
         return daz.a;
      }

      default boolean a(dip $$0, ia $$1) {
         return day.a($$0, $$1);
      }

      default boolean a(dip $$0) {
         return false;
      }

      default boolean b(dip $$0, ia $$1) {
         return this.a($$0) || this.a($$0, $$1);
      }

      default boolean a(csz $$0, daz.c $$1, dip $$2, boolean $$3) {
         dip $$4 = this.a($$2, $$0, $$1.a(), $$1.b());
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

   public static record c(hv a, ia b) {
   }

   @FunctionalInterface
   public interface d {
      boolean test(cse var1, hv var2, daz.c var3);
   }

   public static enum e {
      a {
         @Override
         public daz.c a(hv $$0, ia $$1, ia $$2) {
            return new daz.c($$0, $$1);
         }
      },
      b {
         @Override
         public daz.c a(hv $$0, ia $$1, ia $$2) {
            return new daz.c($$0.a($$1), $$2);
         }
      },
      c {
         @Override
         public daz.c a(hv $$0, ia $$1, ia $$2) {
            return new daz.c($$0.a($$1).a($$2), $$1.g());
         }
      };

      public abstract daz.c a(hv var1, ia var2, ia var3);
   }
}
