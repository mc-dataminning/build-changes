import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import javax.annotation.Nullable;

public class dfa {
   public static final dfa.e[] a = new dfa.e[]{dfa.e.a, dfa.e.b, dfa.e.c};
   private final dfa.b b;

   public dfa(dez $$0) {
      this(new dfa.a($$0));
   }

   public dfa(dfa.b $$0) {
      this.b = $$0;
   }

   public boolean a(dmz $$0, cwf $$1, ib $$2, ih $$3) {
      return ih.a().anyMatch($$4 -> this.a($$0, $$1, $$2, $$3, $$4, this.b::a).isPresent());
   }

   public Optional<dfa.c> a(dmz $$0, cxa $$1, ib $$2, axd $$3) {
      return ih.a($$3)
         .stream()
         .filter($$1x -> this.b.b($$0, $$1x))
         .map($$4 -> this.a($$0, $$1, $$2, $$4, $$3, false))
         .filter(Optional::isPresent)
         .findFirst()
         .orElse(Optional.empty());
   }

   public long a(dmz $$0, cxa $$1, ib $$2, boolean $$3) {
      return ih.a().filter($$1x -> this.b.b($$0, $$1x)).map($$4 -> this.a($$0, $$1, $$2, $$4, $$3)).reduce(0L, Long::sum);
   }

   public Optional<dfa.c> a(dmz $$0, cxa $$1, ib $$2, ih $$3, axd $$4, boolean $$5) {
      return ih.a($$4).stream().map($$5x -> this.a($$0, $$1, $$2, $$3, $$5x, $$5)).filter(Optional::isPresent).findFirst().orElse(Optional.empty());
   }

   private long a(dmz $$0, cxa $$1, ib $$2, ih $$3, boolean $$4) {
      return ih.a().map($$5 -> this.a($$0, $$1, $$2, $$3, $$5, $$4)).filter(Optional::isPresent).count();
   }

   @VisibleForTesting
   public Optional<dfa.c> a(dmz $$0, cxa $$1, ib $$2, ih $$3, ih $$4, boolean $$5) {
      return this.a($$0, $$1, $$2, $$3, $$4, this.b::a).flatMap($$2x -> this.a($$1, $$2x, $$5));
   }

   public Optional<dfa.c> a(dmz $$0, cwf $$1, ib $$2, ih $$3, ih $$4, dfa.d $$5) {
      if ($$4.o() == $$3.o()) {
         return Optional.empty();
      } else if (this.b.a($$0) || this.b.a($$0, $$3) && !this.b.a($$0, $$4)) {
         for (dfa.e $$6 : this.b.a()) {
            dfa.c $$7 = $$6.a($$2, $$4, $$3);
            if ($$5.test($$1, $$2, $$7)) {
               return Optional.of($$7);
            }
         }

         return Optional.empty();
      } else {
         return Optional.empty();
      }
   }

   public Optional<dfa.c> a(cxa $$0, dfa.c $$1, boolean $$2) {
      dmz $$3 = $$0.a_($$1.a());
      return this.b.a($$0, $$1, $$3, $$2) ? Optional.of($$1) : Optional.empty();
   }

   public static class a implements dfa.b {
      protected dez a;

      public a(dez $$0) {
         this.a = $$0;
      }

      @Nullable
      @Override
      public dmz a(dmz $$0, cwf $$1, ib $$2, ih $$3) {
         return this.a.c($$0, $$1, $$2, $$3);
      }

      protected boolean a(cwf $$0, ib $$1, ib $$2, ih $$3, dmz $$4) {
         return $$4.i() || $$4.a(this.a) || $$4.a(dac.G) && $$4.u().b();
      }

      @Override
      public boolean a(cwf $$0, ib $$1, dfa.c $$2) {
         dmz $$3 = $$0.a_($$2.a());
         return this.a($$0, $$1, $$2.a(), $$2.b(), $$3) && this.a.a($$0, $$3, $$2.a(), $$2.b());
      }
   }

   public interface b {
      @Nullable
      dmz a(dmz var1, cwf var2, ib var3, ih var4);

      boolean a(cwf var1, ib var2, dfa.c var3);

      default dfa.e[] a() {
         return dfa.a;
      }

      default boolean a(dmz $$0, ih $$1) {
         return dez.a($$0, $$1);
      }

      default boolean a(dmz $$0) {
         return false;
      }

      default boolean b(dmz $$0, ih $$1) {
         return this.a($$0) || this.a($$0, $$1);
      }

      default boolean a(cxa $$0, dfa.c $$1, dmz $$2, boolean $$3) {
         dmz $$4 = this.a($$2, $$0, $$1.a(), $$1.b());
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

   public static record c(ib a, ih b) {
   }

   @FunctionalInterface
   public interface d {
      boolean test(cwf var1, ib var2, dfa.c var3);
   }

   public static enum e {
      a {
         @Override
         public dfa.c a(ib $$0, ih $$1, ih $$2) {
            return new dfa.c($$0, $$1);
         }
      },
      b {
         @Override
         public dfa.c a(ib $$0, ih $$1, ih $$2) {
            return new dfa.c($$0.a($$1), $$2);
         }
      },
      c {
         @Override
         public dfa.c a(ib $$0, ih $$1, ih $$2) {
            return new dfa.c($$0.a($$1).a($$2), $$1.g());
         }
      };

      public abstract dfa.c a(ib var1, ih var2, ih var3);
   }
}
