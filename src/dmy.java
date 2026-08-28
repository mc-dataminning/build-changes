import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import javax.annotation.Nullable;

public class dmy {
   public static final dmy.e[] a = new dmy.e[]{dmy.e.a, dmy.e.b, dmy.e.c};
   private final dmy.b b;

   public dmy(dmx $$0) {
      this(new dmy.a($$0));
   }

   public dmy(dmy.b $$0) {
      this.b = $$0;
   }

   public boolean a(dvd $$0, dea $$1, jg $$2, jl $$3) {
      return jl.a().anyMatch($$4 -> this.a($$0, $$1, $$2, $$3, $$4, this.b::a).isPresent());
   }

   public Optional<dmy.c> a(dvd $$0, dew $$1, jg $$2, azr $$3) {
      return jl.a($$3)
         .stream()
         .filter($$1x -> this.b.b($$0, $$1x))
         .map($$4 -> this.a($$0, $$1, $$2, $$4, $$3, false))
         .filter(Optional::isPresent)
         .findFirst()
         .orElse(Optional.empty());
   }

   public long a(dvd $$0, dew $$1, jg $$2, boolean $$3) {
      return jl.a().filter($$1x -> this.b.b($$0, $$1x)).map($$4 -> this.a($$0, $$1, $$2, $$4, $$3)).reduce(0L, Long::sum);
   }

   public Optional<dmy.c> a(dvd $$0, dew $$1, jg $$2, jl $$3, azr $$4, boolean $$5) {
      return jl.a($$4).stream().map($$5x -> this.a($$0, $$1, $$2, $$3, $$5x, $$5)).filter(Optional::isPresent).findFirst().orElse(Optional.empty());
   }

   private long a(dvd $$0, dew $$1, jg $$2, jl $$3, boolean $$4) {
      return jl.a().map($$5 -> this.a($$0, $$1, $$2, $$3, $$5, $$4)).filter(Optional::isPresent).count();
   }

   @VisibleForTesting
   public Optional<dmy.c> a(dvd $$0, dew $$1, jg $$2, jl $$3, jl $$4, boolean $$5) {
      return this.a($$0, $$1, $$2, $$3, $$4, this.b::a).flatMap($$2x -> this.a($$1, $$2x, $$5));
   }

   public Optional<dmy.c> a(dvd $$0, dea $$1, jg $$2, jl $$3, jl $$4, dmy.d $$5) {
      if ($$4.o() == $$3.o()) {
         return Optional.empty();
      } else if (this.b.a($$0) || this.b.a($$0, $$3) && !this.b.a($$0, $$4)) {
         for (dmy.e $$6 : this.b.a()) {
            dmy.c $$7 = $$6.a($$2, $$4, $$3);
            if ($$5.test($$1, $$2, $$7)) {
               return Optional.of($$7);
            }
         }

         return Optional.empty();
      } else {
         return Optional.empty();
      }
   }

   public Optional<dmy.c> a(dew $$0, dmy.c $$1, boolean $$2) {
      dvd $$3 = $$0.a_($$1.a());
      return this.b.a($$0, $$1, $$3, $$2) ? Optional.of($$1) : Optional.empty();
   }

   public static class a implements dmy.b {
      protected dmx a;

      public a(dmx $$0) {
         this.a = $$0;
      }

      @Nullable
      @Override
      public dvd a(dvd $$0, dea $$1, jg $$2, jl $$3) {
         return this.a.c($$0, $$1, $$2, $$3);
      }

      protected boolean a(dea $$0, jg $$1, jg $$2, jl $$3, dvd $$4) {
         return $$4.l() || $$4.a(this.a) || $$4.a(dia.G) && $$4.y().b();
      }

      @Override
      public boolean a(dea $$0, jg $$1, dmy.c $$2) {
         dvd $$3 = $$0.a_($$2.a());
         return this.a($$0, $$1, $$2.a(), $$2.b(), $$3) && this.a.a($$0, $$3, $$2.a(), $$2.b());
      }
   }

   public interface b {
      @Nullable
      dvd a(dvd var1, dea var2, jg var3, jl var4);

      boolean a(dea var1, jg var2, dmy.c var3);

      default dmy.e[] a() {
         return dmy.a;
      }

      default boolean a(dvd $$0, jl $$1) {
         return dmx.a($$0, $$1);
      }

      default boolean a(dvd $$0) {
         return false;
      }

      default boolean b(dvd $$0, jl $$1) {
         return this.a($$0) || this.a($$0, $$1);
      }

      default boolean a(dew $$0, dmy.c $$1, dvd $$2, boolean $$3) {
         dvd $$4 = this.a($$2, $$0, $$1.a(), $$1.b());
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

   public static record c(jg a, jl b) {
   }

   @FunctionalInterface
   public interface d {
      boolean test(dea var1, jg var2, dmy.c var3);
   }

   public static enum e {
      a {
         @Override
         public dmy.c a(jg $$0, jl $$1, jl $$2) {
            return new dmy.c($$0, $$1);
         }
      },
      b {
         @Override
         public dmy.c a(jg $$0, jl $$1, jl $$2) {
            return new dmy.c($$0.a($$1), $$2);
         }
      },
      c {
         @Override
         public dmy.c a(jg $$0, jl $$1, jl $$2) {
            return new dmy.c($$0.a($$1).a($$2), $$1.g());
         }
      };

      public abstract dmy.c a(jg var1, jl var2, jl var3);
   }
}
