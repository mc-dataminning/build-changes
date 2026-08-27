import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import javax.annotation.Nullable;

public class dby {
   public static final dby.e[] a = new dby.e[]{dby.e.a, dby.e.b, dby.e.c};
   private final dby.b b;

   public dby(dbx $$0) {
      this(new dby.a($$0));
   }

   public dby(dby.b $$0) {
      this.b = $$0;
   }

   public boolean a(djp $$0, ctd $$1, hx $$2, ic $$3) {
      return ic.a().anyMatch($$4 -> this.a($$0, $$1, $$2, $$3, $$4, this.b::a).isPresent());
   }

   public Optional<dby.c> a(djp $$0, cty $$1, hx $$2, auw $$3) {
      return ic.a($$3)
         .stream()
         .filter($$1x -> this.b.b($$0, $$1x))
         .map($$4 -> this.a($$0, $$1, $$2, $$4, $$3, false))
         .filter(Optional::isPresent)
         .findFirst()
         .orElse(Optional.empty());
   }

   public long a(djp $$0, cty $$1, hx $$2, boolean $$3) {
      return ic.a().filter($$1x -> this.b.b($$0, $$1x)).map($$4 -> this.a($$0, $$1, $$2, $$4, $$3)).reduce(0L, Long::sum);
   }

   public Optional<dby.c> a(djp $$0, cty $$1, hx $$2, ic $$3, auw $$4, boolean $$5) {
      return ic.a($$4).stream().map($$5x -> this.a($$0, $$1, $$2, $$3, $$5x, $$5)).filter(Optional::isPresent).findFirst().orElse(Optional.empty());
   }

   private long a(djp $$0, cty $$1, hx $$2, ic $$3, boolean $$4) {
      return ic.a().map($$5 -> this.a($$0, $$1, $$2, $$3, $$5, $$4)).filter(Optional::isPresent).count();
   }

   @VisibleForTesting
   public Optional<dby.c> a(djp $$0, cty $$1, hx $$2, ic $$3, ic $$4, boolean $$5) {
      return this.a($$0, $$1, $$2, $$3, $$4, this.b::a).flatMap($$2x -> this.a($$1, $$2x, $$5));
   }

   public Optional<dby.c> a(djp $$0, ctd $$1, hx $$2, ic $$3, ic $$4, dby.d $$5) {
      if ($$4.o() == $$3.o()) {
         return Optional.empty();
      } else if (this.b.a($$0) || this.b.a($$0, $$3) && !this.b.a($$0, $$4)) {
         for (dby.e $$6 : this.b.a()) {
            dby.c $$7 = $$6.a($$2, $$4, $$3);
            if ($$5.test($$1, $$2, $$7)) {
               return Optional.of($$7);
            }
         }

         return Optional.empty();
      } else {
         return Optional.empty();
      }
   }

   public Optional<dby.c> a(cty $$0, dby.c $$1, boolean $$2) {
      djp $$3 = $$0.a_($$1.a());
      return this.b.a($$0, $$1, $$3, $$2) ? Optional.of($$1) : Optional.empty();
   }

   public static class a implements dby.b {
      protected dbx a;

      public a(dbx $$0) {
         this.a = $$0;
      }

      @Nullable
      @Override
      public djp a(djp $$0, ctd $$1, hx $$2, ic $$3) {
         return this.a.c($$0, $$1, $$2, $$3);
      }

      protected boolean a(ctd $$0, hx $$1, hx $$2, ic $$3, djp $$4) {
         return $$4.i() || $$4.a(this.a) || $$4.a(cxa.G) && $$4.u().b();
      }

      @Override
      public boolean a(ctd $$0, hx $$1, dby.c $$2) {
         djp $$3 = $$0.a_($$2.a());
         return this.a($$0, $$1, $$2.a(), $$2.b(), $$3) && this.a.a($$0, $$3, $$2.a(), $$2.b());
      }
   }

   public interface b {
      @Nullable
      djp a(djp var1, ctd var2, hx var3, ic var4);

      boolean a(ctd var1, hx var2, dby.c var3);

      default dby.e[] a() {
         return dby.a;
      }

      default boolean a(djp $$0, ic $$1) {
         return dbx.a($$0, $$1);
      }

      default boolean a(djp $$0) {
         return false;
      }

      default boolean b(djp $$0, ic $$1) {
         return this.a($$0) || this.a($$0, $$1);
      }

      default boolean a(cty $$0, dby.c $$1, djp $$2, boolean $$3) {
         djp $$4 = this.a($$2, $$0, $$1.a(), $$1.b());
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

   public static record c(hx a, ic b) {
   }

   @FunctionalInterface
   public interface d {
      boolean test(ctd var1, hx var2, dby.c var3);
   }

   public static enum e {
      a {
         @Override
         public dby.c a(hx $$0, ic $$1, ic $$2) {
            return new dby.c($$0, $$1);
         }
      },
      b {
         @Override
         public dby.c a(hx $$0, ic $$1, ic $$2) {
            return new dby.c($$0.a($$1), $$2);
         }
      },
      c {
         @Override
         public dby.c a(hx $$0, ic $$1, ic $$2) {
            return new dby.c($$0.a($$1).a($$2), $$1.g());
         }
      };

      public abstract dby.c a(hx var1, ic var2, ic var3);
   }
}
