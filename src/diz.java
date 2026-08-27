import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import javax.annotation.Nullable;

public class diz {
   public static final diz.e[] a = new diz.e[]{diz.e.a, diz.e.b, diz.e.c};
   private final diz.b b;

   public diz(diy $$0) {
      this(new diz.a($$0));
   }

   public diz(diz.b $$0) {
      this.b = $$0;
   }

   public boolean a(drb $$0, dad $$1, io $$2, it $$3) {
      return it.a().anyMatch($$4 -> this.a($$0, $$1, $$2, $$3, $$4, this.b::a).isPresent());
   }

   public Optional<diz.c> a(drb $$0, day $$1, io $$2, ayk $$3) {
      return it.a($$3)
         .stream()
         .filter($$1x -> this.b.b($$0, $$1x))
         .map($$4 -> this.a($$0, $$1, $$2, $$4, $$3, false))
         .filter(Optional::isPresent)
         .findFirst()
         .orElse(Optional.empty());
   }

   public long a(drb $$0, day $$1, io $$2, boolean $$3) {
      return it.a().filter($$1x -> this.b.b($$0, $$1x)).map($$4 -> this.a($$0, $$1, $$2, $$4, $$3)).reduce(0L, Long::sum);
   }

   public Optional<diz.c> a(drb $$0, day $$1, io $$2, it $$3, ayk $$4, boolean $$5) {
      return it.a($$4).stream().map($$5x -> this.a($$0, $$1, $$2, $$3, $$5x, $$5)).filter(Optional::isPresent).findFirst().orElse(Optional.empty());
   }

   private long a(drb $$0, day $$1, io $$2, it $$3, boolean $$4) {
      return it.a().map($$5 -> this.a($$0, $$1, $$2, $$3, $$5, $$4)).filter(Optional::isPresent).count();
   }

   @VisibleForTesting
   public Optional<diz.c> a(drb $$0, day $$1, io $$2, it $$3, it $$4, boolean $$5) {
      return this.a($$0, $$1, $$2, $$3, $$4, this.b::a).flatMap($$2x -> this.a($$1, $$2x, $$5));
   }

   public Optional<diz.c> a(drb $$0, dad $$1, io $$2, it $$3, it $$4, diz.d $$5) {
      if ($$4.o() == $$3.o()) {
         return Optional.empty();
      } else if (this.b.a($$0) || this.b.a($$0, $$3) && !this.b.a($$0, $$4)) {
         for (diz.e $$6 : this.b.a()) {
            diz.c $$7 = $$6.a($$2, $$4, $$3);
            if ($$5.test($$1, $$2, $$7)) {
               return Optional.of($$7);
            }
         }

         return Optional.empty();
      } else {
         return Optional.empty();
      }
   }

   public Optional<diz.c> a(day $$0, diz.c $$1, boolean $$2) {
      drb $$3 = $$0.a_($$1.a());
      return this.b.a($$0, $$1, $$3, $$2) ? Optional.of($$1) : Optional.empty();
   }

   public static class a implements diz.b {
      protected diy a;

      public a(diy $$0) {
         this.a = $$0;
      }

      @Nullable
      @Override
      public drb a(drb $$0, dad $$1, io $$2, it $$3) {
         return this.a.c($$0, $$1, $$2, $$3);
      }

      protected boolean a(dad $$0, io $$1, io $$2, it $$3, drb $$4) {
         return $$4.i() || $$4.a(this.a) || $$4.a(dea.G) && $$4.u().b();
      }

      @Override
      public boolean a(dad $$0, io $$1, diz.c $$2) {
         drb $$3 = $$0.a_($$2.a());
         return this.a($$0, $$1, $$2.a(), $$2.b(), $$3) && this.a.a($$0, $$3, $$2.a(), $$2.b());
      }
   }

   public interface b {
      @Nullable
      drb a(drb var1, dad var2, io var3, it var4);

      boolean a(dad var1, io var2, diz.c var3);

      default diz.e[] a() {
         return diz.a;
      }

      default boolean a(drb $$0, it $$1) {
         return diy.a($$0, $$1);
      }

      default boolean a(drb $$0) {
         return false;
      }

      default boolean b(drb $$0, it $$1) {
         return this.a($$0) || this.a($$0, $$1);
      }

      default boolean a(day $$0, diz.c $$1, drb $$2, boolean $$3) {
         drb $$4 = this.a($$2, $$0, $$1.a(), $$1.b());
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

   public static record c(io a, it b) {
   }

   @FunctionalInterface
   public interface d {
      boolean test(dad var1, io var2, diz.c var3);
   }

   public static enum e {
      a {
         @Override
         public diz.c a(io $$0, it $$1, it $$2) {
            return new diz.c($$0, $$1);
         }
      },
      b {
         @Override
         public diz.c a(io $$0, it $$1, it $$2) {
            return new diz.c($$0.a($$1), $$2);
         }
      },
      c {
         @Override
         public diz.c a(io $$0, it $$1, it $$2) {
            return new diz.c($$0.a($$1).a($$2), $$1.g());
         }
      };

      public abstract diz.c a(io var1, it var2, it var3);
   }
}
