import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import javax.annotation.Nullable;

public class cyz {
   public static final cyz.e[] a = new cyz.e[]{cyz.e.a, cyz.e.b, cyz.e.c};
   private final cyz.b b;

   public cyz(cyy $$0) {
      this(new cyz.a($$0));
   }

   public cyz(cyz.b $$0) {
      this.b = $$0;
   }

   public boolean a(dgb $$0, cqf $$1, ht $$2, hx $$3) {
      return hx.a().anyMatch($$4 -> this.a($$0, $$1, $$2, $$3, $$4, this.b::a).isPresent());
   }

   public Optional<cyz.c> a(dgb $$0, cra $$1, ht $$2, ate $$3) {
      return hx.a($$3)
         .stream()
         .filter($$1x -> this.b.b($$0, $$1x))
         .map($$4 -> this.a($$0, $$1, $$2, $$4, $$3, false))
         .filter(Optional::isPresent)
         .findFirst()
         .orElse(Optional.empty());
   }

   public long a(dgb $$0, cra $$1, ht $$2, boolean $$3) {
      return hx.a().filter($$1x -> this.b.b($$0, $$1x)).map($$4 -> this.a($$0, $$1, $$2, $$4, $$3)).reduce(0L, Long::sum);
   }

   public Optional<cyz.c> a(dgb $$0, cra $$1, ht $$2, hx $$3, ate $$4, boolean $$5) {
      return hx.a($$4).stream().map($$5x -> this.a($$0, $$1, $$2, $$3, $$5x, $$5)).filter(Optional::isPresent).findFirst().orElse(Optional.empty());
   }

   private long a(dgb $$0, cra $$1, ht $$2, hx $$3, boolean $$4) {
      return hx.a().map($$5 -> this.a($$0, $$1, $$2, $$3, $$5, $$4)).filter(Optional::isPresent).count();
   }

   @VisibleForTesting
   public Optional<cyz.c> a(dgb $$0, cra $$1, ht $$2, hx $$3, hx $$4, boolean $$5) {
      return this.a($$0, $$1, $$2, $$3, $$4, this.b::a).flatMap($$2x -> this.a($$1, $$2x, $$5));
   }

   public Optional<cyz.c> a(dgb $$0, cqf $$1, ht $$2, hx $$3, hx $$4, cyz.d $$5) {
      if ($$4.o() == $$3.o()) {
         return Optional.empty();
      } else if (this.b.a($$0) || this.b.a($$0, $$3) && !this.b.a($$0, $$4)) {
         for (cyz.e $$6 : this.b.a()) {
            cyz.c $$7 = $$6.a($$2, $$4, $$3);
            if ($$5.test($$1, $$2, $$7)) {
               return Optional.of($$7);
            }
         }

         return Optional.empty();
      } else {
         return Optional.empty();
      }
   }

   public Optional<cyz.c> a(cra $$0, cyz.c $$1, boolean $$2) {
      dgb $$3 = $$0.a_($$1.a());
      return this.b.a($$0, $$1, $$3, $$2) ? Optional.of($$1) : Optional.empty();
   }

   public static class a implements cyz.b {
      protected cyy a;

      public a(cyy $$0) {
         this.a = $$0;
      }

      @Nullable
      @Override
      public dgb a(dgb $$0, cqf $$1, ht $$2, hx $$3) {
         return this.a.c($$0, $$1, $$2, $$3);
      }

      protected boolean a(cqf $$0, ht $$1, ht $$2, hx $$3, dgb $$4) {
         return $$4.i() || $$4.a(this.a) || $$4.a(cuc.G) && $$4.u().b();
      }

      @Override
      public boolean a(cqf $$0, ht $$1, cyz.c $$2) {
         dgb $$3 = $$0.a_($$2.a());
         return this.a($$0, $$1, $$2.a(), $$2.b(), $$3) && this.a.a($$0, $$3, $$2.a(), $$2.b());
      }
   }

   public interface b {
      @Nullable
      dgb a(dgb var1, cqf var2, ht var3, hx var4);

      boolean a(cqf var1, ht var2, cyz.c var3);

      default cyz.e[] a() {
         return cyz.a;
      }

      default boolean a(dgb $$0, hx $$1) {
         return cyy.a($$0, $$1);
      }

      default boolean a(dgb $$0) {
         return false;
      }

      default boolean b(dgb $$0, hx $$1) {
         return this.a($$0) || this.a($$0, $$1);
      }

      default boolean a(cra $$0, cyz.c $$1, dgb $$2, boolean $$3) {
         dgb $$4 = this.a($$2, $$0, $$1.a(), $$1.b());
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

   public static record c(ht a, hx b) {
   }

   @FunctionalInterface
   public interface d {
      boolean test(cqf var1, ht var2, cyz.c var3);
   }

   public static enum e {
      a {
         @Override
         public cyz.c a(ht $$0, hx $$1, hx $$2) {
            return new cyz.c($$0, $$1);
         }
      },
      b {
         @Override
         public cyz.c a(ht $$0, hx $$1, hx $$2) {
            return new cyz.c($$0.a($$1), $$2);
         }
      },
      c {
         @Override
         public cyz.c a(ht $$0, hx $$1, hx $$2) {
            return new cyz.c($$0.a($$1).a($$2), $$1.g());
         }
      };

      public abstract cyz.c a(ht var1, hx var2, hx var3);
   }
}
