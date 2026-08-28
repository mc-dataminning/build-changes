import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import javax.annotation.Nullable;

public class dqa {
   public static final dqa.e[] a = new dqa.e[]{dqa.e.a, dqa.e.b, dqa.e.c};
   private final dqa.b b;

   public dqa(dpy $$0) {
      this(new dqa.a($$0));
   }

   public dqa(dqa.b $$0) {
      this.b = $$0;
   }

   public boolean a(dym $$0, dgv $$1, jj $$2, jo $$3) {
      return jo.a().anyMatch($$4 -> this.a($$0, $$1, $$2, $$3, $$4, this.b::a).isPresent());
   }

   public Optional<dqa.c> a(dym $$0, dhq $$1, jj $$2, azs $$3) {
      return jo.a($$3)
         .stream()
         .filter($$1x -> this.b.b($$0, $$1x))
         .map($$4 -> this.a($$0, $$1, $$2, $$4, $$3, false))
         .filter(Optional::isPresent)
         .findFirst()
         .orElse(Optional.empty());
   }

   public long a(dym $$0, dhq $$1, jj $$2, boolean $$3) {
      return jo.a().filter($$1x -> this.b.b($$0, $$1x)).map($$4 -> this.a($$0, $$1, $$2, $$4, $$3)).reduce(0L, Long::sum);
   }

   public Optional<dqa.c> a(dym $$0, dhq $$1, jj $$2, jo $$3, azs $$4, boolean $$5) {
      return jo.a($$4).stream().map($$5x -> this.a($$0, $$1, $$2, $$3, $$5x, $$5)).filter(Optional::isPresent).findFirst().orElse(Optional.empty());
   }

   private long a(dym $$0, dhq $$1, jj $$2, jo $$3, boolean $$4) {
      return jo.a().map($$5 -> this.a($$0, $$1, $$2, $$3, $$5, $$4)).filter(Optional::isPresent).count();
   }

   @VisibleForTesting
   public Optional<dqa.c> a(dym $$0, dhq $$1, jj $$2, jo $$3, jo $$4, boolean $$5) {
      return this.a($$0, $$1, $$2, $$3, $$4, this.b::a).flatMap($$2x -> this.a($$1, $$2x, $$5));
   }

   public Optional<dqa.c> a(dym $$0, dgv $$1, jj $$2, jo $$3, jo $$4, dqa.d $$5) {
      if ($$4.o() == $$3.o()) {
         return Optional.empty();
      } else if (this.b.a($$0) || this.b.a($$0, $$3) && !this.b.a($$0, $$4)) {
         for (dqa.e $$6 : this.b.a()) {
            dqa.c $$7 = $$6.a($$2, $$4, $$3);
            if ($$5.test($$1, $$2, $$7)) {
               return Optional.of($$7);
            }
         }

         return Optional.empty();
      } else {
         return Optional.empty();
      }
   }

   public Optional<dqa.c> a(dhq $$0, dqa.c $$1, boolean $$2) {
      dym $$3 = $$0.a_($$1.a());
      return this.b.a($$0, $$1, $$3, $$2) ? Optional.of($$1) : Optional.empty();
   }

   public static class a implements dqa.b {
      protected dpy a;

      public a(dpy $$0) {
         this.a = $$0;
      }

      @Nullable
      @Override
      public dym a(dym $$0, dgv $$1, jj $$2, jo $$3) {
         return this.a.c($$0, $$1, $$2, $$3);
      }

      protected boolean a(dgv $$0, jj $$1, jj $$2, jo $$3, dym $$4) {
         return $$4.l() || $$4.a(this.a) || $$4.a(dkw.J) && $$4.y().b();
      }

      @Override
      public boolean a(dgv $$0, jj $$1, dqa.c $$2) {
         dym $$3 = $$0.a_($$2.a());
         return this.a($$0, $$1, $$2.a(), $$2.b(), $$3) && this.a.a($$0, $$3, $$2.a(), $$2.b());
      }
   }

   public interface b {
      @Nullable
      dym a(dym var1, dgv var2, jj var3, jo var4);

      boolean a(dgv var1, jj var2, dqa.c var3);

      default dqa.e[] a() {
         return dqa.a;
      }

      default boolean a(dym $$0, jo $$1) {
         return dpy.a($$0, $$1);
      }

      default boolean a(dym $$0) {
         return false;
      }

      default boolean b(dym $$0, jo $$1) {
         return this.a($$0) || this.a($$0, $$1);
      }

      default boolean a(dhq $$0, dqa.c $$1, dym $$2, boolean $$3) {
         dym $$4 = this.a($$2, $$0, $$1.a(), $$1.b());
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

   public static record c(jj a, jo b) {
   }

   @FunctionalInterface
   public interface d {
      boolean test(dgv var1, jj var2, dqa.c var3);
   }

   public static enum e {
      a {
         @Override
         public dqa.c a(jj $$0, jo $$1, jo $$2) {
            return new dqa.c($$0, $$1);
         }
      },
      b {
         @Override
         public dqa.c a(jj $$0, jo $$1, jo $$2) {
            return new dqa.c($$0.a($$1), $$2);
         }
      },
      c {
         @Override
         public dqa.c a(jj $$0, jo $$1, jo $$2) {
            return new dqa.c($$0.a($$1).a($$2), $$1.g());
         }
      };

      public abstract dqa.c a(jj var1, jo var2, jo var3);
   }
}
