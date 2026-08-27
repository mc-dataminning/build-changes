import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import javax.annotation.Nullable;

public class cum {
   public static final cum.e[] a = new cum.e[]{cum.e.a, cum.e.b, cum.e.c};
   private final cum.b b;

   public cum(cul $$0) {
      this(new cum.a($$0));
   }

   public cum(cum.b $$0) {
      this.b = $$0;
   }

   public boolean a(dcb $$0, cls $$1, gu $$2, ha $$3) {
      return ha.a().anyMatch($$4 -> this.a($$0, $$1, $$2, $$3, $$4, this.b::a).isPresent());
   }

   public Optional<cum.c> a(dcb $$0, cmn $$1, gu $$2, apf $$3) {
      return ha.a($$3)
         .stream()
         .filter($$1x -> this.b.b($$0, $$1x))
         .map($$4 -> this.a($$0, $$1, $$2, $$4, $$3, false))
         .filter(Optional::isPresent)
         .findFirst()
         .orElse(Optional.empty());
   }

   public long a(dcb $$0, cmn $$1, gu $$2, boolean $$3) {
      return ha.a().filter($$1x -> this.b.b($$0, $$1x)).map($$4 -> this.a($$0, $$1, $$2, $$4, $$3)).reduce(0L, Long::sum);
   }

   public Optional<cum.c> a(dcb $$0, cmn $$1, gu $$2, ha $$3, apf $$4, boolean $$5) {
      return ha.a($$4).stream().map($$5x -> this.a($$0, $$1, $$2, $$3, $$5x, $$5)).filter(Optional::isPresent).findFirst().orElse(Optional.empty());
   }

   private long a(dcb $$0, cmn $$1, gu $$2, ha $$3, boolean $$4) {
      return ha.a().map($$5 -> this.a($$0, $$1, $$2, $$3, $$5, $$4)).filter(Optional::isPresent).count();
   }

   @VisibleForTesting
   public Optional<cum.c> a(dcb $$0, cmn $$1, gu $$2, ha $$3, ha $$4, boolean $$5) {
      return this.a($$0, $$1, $$2, $$3, $$4, this.b::a).flatMap($$2x -> this.a($$1, $$2x, $$5));
   }

   public Optional<cum.c> a(dcb $$0, cls $$1, gu $$2, ha $$3, ha $$4, cum.d $$5) {
      if ($$4.o() == $$3.o()) {
         return Optional.empty();
      } else if (this.b.a($$0) || this.b.a($$0, $$3) && !this.b.a($$0, $$4)) {
         for (cum.e $$6 : this.b.a()) {
            cum.c $$7 = $$6.a($$2, $$4, $$3);
            if ($$5.test($$1, $$2, $$7)) {
               return Optional.of($$7);
            }
         }

         return Optional.empty();
      } else {
         return Optional.empty();
      }
   }

   public Optional<cum.c> a(cmn $$0, cum.c $$1, boolean $$2) {
      dcb $$3 = $$0.a_($$1.a());
      return this.b.a($$0, $$1, $$3, $$2) ? Optional.of($$1) : Optional.empty();
   }

   public static class a implements cum.b {
      protected cul a;

      public a(cul $$0) {
         this.a = $$0;
      }

      @Nullable
      @Override
      public dcb a(dcb $$0, cls $$1, gu $$2, ha $$3) {
         return this.a.c($$0, $$1, $$2, $$3);
      }

      protected boolean a(cls $$0, gu $$1, gu $$2, ha $$3, dcb $$4) {
         return $$4.i() || $$4.a(this.a) || $$4.a(cpo.G) && $$4.u().b();
      }

      @Override
      public boolean a(cls $$0, gu $$1, cum.c $$2) {
         dcb $$3 = $$0.a_($$2.a());
         return this.a($$0, $$1, $$2.a(), $$2.b(), $$3) && this.a.a($$0, $$3, $$2.a(), $$2.b());
      }
   }

   public interface b {
      @Nullable
      dcb a(dcb var1, cls var2, gu var3, ha var4);

      boolean a(cls var1, gu var2, cum.c var3);

      default cum.e[] a() {
         return cum.a;
      }

      default boolean a(dcb $$0, ha $$1) {
         return cul.a($$0, $$1);
      }

      default boolean a(dcb $$0) {
         return false;
      }

      default boolean b(dcb $$0, ha $$1) {
         return this.a($$0) || this.a($$0, $$1);
      }

      default boolean a(cmn $$0, cum.c $$1, dcb $$2, boolean $$3) {
         dcb $$4 = this.a($$2, $$0, $$1.a(), $$1.b());
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

   public static record c(gu a, ha b) {
   }

   @FunctionalInterface
   public interface d {
      boolean test(cls var1, gu var2, cum.c var3);
   }

   public static enum e {
      a {
         @Override
         public cum.c a(gu $$0, ha $$1, ha $$2) {
            return new cum.c($$0, $$1);
         }
      },
      b {
         @Override
         public cum.c a(gu $$0, ha $$1, ha $$2) {
            return new cum.c($$0.a($$1), $$2);
         }
      },
      c {
         @Override
         public cum.c a(gu $$0, ha $$1, ha $$2) {
            return new cum.c($$0.a($$1).a($$2), $$1.g());
         }
      };

      public abstract cum.c a(gu var1, ha var2, ha var3);
   }
}
