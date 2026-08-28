import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import javax.annotation.Nullable;

public class dkz {
   public static final dkz.e[] a = new dkz.e[]{dkz.e.a, dkz.e.b, dkz.e.c};
   private final dkz.b b;

   public dkz(dky $$0) {
      this(new dkz.a($$0));
   }

   public dkz(dkz.b $$0) {
      this.b = $$0;
   }

   public boolean a(dtc $$0, dcc $$1, jd $$2, ji $$3) {
      return ji.a().anyMatch($$4 -> this.a($$0, $$1, $$2, $$3, $$4, this.b::a).isPresent());
   }

   public Optional<dkz.c> a(dtc $$0, dcx $$1, jd $$2, ayw $$3) {
      return ji.a($$3)
         .stream()
         .filter($$1x -> this.b.b($$0, $$1x))
         .map($$4 -> this.a($$0, $$1, $$2, $$4, $$3, false))
         .filter(Optional::isPresent)
         .findFirst()
         .orElse(Optional.empty());
   }

   public long a(dtc $$0, dcx $$1, jd $$2, boolean $$3) {
      return ji.a().filter($$1x -> this.b.b($$0, $$1x)).map($$4 -> this.a($$0, $$1, $$2, $$4, $$3)).reduce(0L, Long::sum);
   }

   public Optional<dkz.c> a(dtc $$0, dcx $$1, jd $$2, ji $$3, ayw $$4, boolean $$5) {
      return ji.a($$4).stream().map($$5x -> this.a($$0, $$1, $$2, $$3, $$5x, $$5)).filter(Optional::isPresent).findFirst().orElse(Optional.empty());
   }

   private long a(dtc $$0, dcx $$1, jd $$2, ji $$3, boolean $$4) {
      return ji.a().map($$5 -> this.a($$0, $$1, $$2, $$3, $$5, $$4)).filter(Optional::isPresent).count();
   }

   @VisibleForTesting
   public Optional<dkz.c> a(dtc $$0, dcx $$1, jd $$2, ji $$3, ji $$4, boolean $$5) {
      return this.a($$0, $$1, $$2, $$3, $$4, this.b::a).flatMap($$2x -> this.a($$1, $$2x, $$5));
   }

   public Optional<dkz.c> a(dtc $$0, dcc $$1, jd $$2, ji $$3, ji $$4, dkz.d $$5) {
      if ($$4.o() == $$3.o()) {
         return Optional.empty();
      } else if (this.b.a($$0) || this.b.a($$0, $$3) && !this.b.a($$0, $$4)) {
         for (dkz.e $$6 : this.b.a()) {
            dkz.c $$7 = $$6.a($$2, $$4, $$3);
            if ($$5.test($$1, $$2, $$7)) {
               return Optional.of($$7);
            }
         }

         return Optional.empty();
      } else {
         return Optional.empty();
      }
   }

   public Optional<dkz.c> a(dcx $$0, dkz.c $$1, boolean $$2) {
      dtc $$3 = $$0.a_($$1.a());
      return this.b.a($$0, $$1, $$3, $$2) ? Optional.of($$1) : Optional.empty();
   }

   public static class a implements dkz.b {
      protected dky a;

      public a(dky $$0) {
         this.a = $$0;
      }

      @Nullable
      @Override
      public dtc a(dtc $$0, dcc $$1, jd $$2, ji $$3) {
         return this.a.c($$0, $$1, $$2, $$3);
      }

      protected boolean a(dcc $$0, jd $$1, jd $$2, ji $$3, dtc $$4) {
         return $$4.i() || $$4.a(this.a) || $$4.a(dga.G) && $$4.u().b();
      }

      @Override
      public boolean a(dcc $$0, jd $$1, dkz.c $$2) {
         dtc $$3 = $$0.a_($$2.a());
         return this.a($$0, $$1, $$2.a(), $$2.b(), $$3) && this.a.a($$0, $$3, $$2.a(), $$2.b());
      }
   }

   public interface b {
      @Nullable
      dtc a(dtc var1, dcc var2, jd var3, ji var4);

      boolean a(dcc var1, jd var2, dkz.c var3);

      default dkz.e[] a() {
         return dkz.a;
      }

      default boolean a(dtc $$0, ji $$1) {
         return dky.a($$0, $$1);
      }

      default boolean a(dtc $$0) {
         return false;
      }

      default boolean b(dtc $$0, ji $$1) {
         return this.a($$0) || this.a($$0, $$1);
      }

      default boolean a(dcx $$0, dkz.c $$1, dtc $$2, boolean $$3) {
         dtc $$4 = this.a($$2, $$0, $$1.a(), $$1.b());
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

   public static record c(jd a, ji b) {
   }

   @FunctionalInterface
   public interface d {
      boolean test(dcc var1, jd var2, dkz.c var3);
   }

   public static enum e {
      a {
         @Override
         public dkz.c a(jd $$0, ji $$1, ji $$2) {
            return new dkz.c($$0, $$1);
         }
      },
      b {
         @Override
         public dkz.c a(jd $$0, ji $$1, ji $$2) {
            return new dkz.c($$0.a($$1), $$2);
         }
      },
      c {
         @Override
         public dkz.c a(jd $$0, ji $$1, ji $$2) {
            return new dkz.c($$0.a($$1).a($$2), $$1.g());
         }
      };

      public abstract dkz.c a(jd var1, ji var2, ji var3);
   }
}
