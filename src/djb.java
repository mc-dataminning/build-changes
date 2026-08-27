import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import javax.annotation.Nullable;

public class djb {
   public static final djb.e[] a = new djb.e[]{djb.e.a, djb.e.b, djb.e.c};
   private final djb.b b;

   public djb(dja $$0) {
      this(new djb.a($$0));
   }

   public djb(djb.b $$0) {
      this.b = $$0;
   }

   public boolean a(drd $$0, daf $$1, io $$2, it $$3) {
      return it.a().anyMatch($$4 -> this.a($$0, $$1, $$2, $$3, $$4, this.b::a).isPresent());
   }

   public Optional<djb.c> a(drd $$0, dba $$1, io $$2, aym $$3) {
      return it.a($$3)
         .stream()
         .filter($$1x -> this.b.b($$0, $$1x))
         .map($$4 -> this.a($$0, $$1, $$2, $$4, $$3, false))
         .filter(Optional::isPresent)
         .findFirst()
         .orElse(Optional.empty());
   }

   public long a(drd $$0, dba $$1, io $$2, boolean $$3) {
      return it.a().filter($$1x -> this.b.b($$0, $$1x)).map($$4 -> this.a($$0, $$1, $$2, $$4, $$3)).reduce(0L, Long::sum);
   }

   public Optional<djb.c> a(drd $$0, dba $$1, io $$2, it $$3, aym $$4, boolean $$5) {
      return it.a($$4).stream().map($$5x -> this.a($$0, $$1, $$2, $$3, $$5x, $$5)).filter(Optional::isPresent).findFirst().orElse(Optional.empty());
   }

   private long a(drd $$0, dba $$1, io $$2, it $$3, boolean $$4) {
      return it.a().map($$5 -> this.a($$0, $$1, $$2, $$3, $$5, $$4)).filter(Optional::isPresent).count();
   }

   @VisibleForTesting
   public Optional<djb.c> a(drd $$0, dba $$1, io $$2, it $$3, it $$4, boolean $$5) {
      return this.a($$0, $$1, $$2, $$3, $$4, this.b::a).flatMap($$2x -> this.a($$1, $$2x, $$5));
   }

   public Optional<djb.c> a(drd $$0, daf $$1, io $$2, it $$3, it $$4, djb.d $$5) {
      if ($$4.o() == $$3.o()) {
         return Optional.empty();
      } else if (this.b.a($$0) || this.b.a($$0, $$3) && !this.b.a($$0, $$4)) {
         for (djb.e $$6 : this.b.a()) {
            djb.c $$7 = $$6.a($$2, $$4, $$3);
            if ($$5.test($$1, $$2, $$7)) {
               return Optional.of($$7);
            }
         }

         return Optional.empty();
      } else {
         return Optional.empty();
      }
   }

   public Optional<djb.c> a(dba $$0, djb.c $$1, boolean $$2) {
      drd $$3 = $$0.a_($$1.a());
      return this.b.a($$0, $$1, $$3, $$2) ? Optional.of($$1) : Optional.empty();
   }

   public static class a implements djb.b {
      protected dja a;

      public a(dja $$0) {
         this.a = $$0;
      }

      @Nullable
      @Override
      public drd a(drd $$0, daf $$1, io $$2, it $$3) {
         return this.a.c($$0, $$1, $$2, $$3);
      }

      protected boolean a(daf $$0, io $$1, io $$2, it $$3, drd $$4) {
         return $$4.i() || $$4.a(this.a) || $$4.a(dec.G) && $$4.u().b();
      }

      @Override
      public boolean a(daf $$0, io $$1, djb.c $$2) {
         drd $$3 = $$0.a_($$2.a());
         return this.a($$0, $$1, $$2.a(), $$2.b(), $$3) && this.a.a($$0, $$3, $$2.a(), $$2.b());
      }
   }

   public interface b {
      @Nullable
      drd a(drd var1, daf var2, io var3, it var4);

      boolean a(daf var1, io var2, djb.c var3);

      default djb.e[] a() {
         return djb.a;
      }

      default boolean a(drd $$0, it $$1) {
         return dja.a($$0, $$1);
      }

      default boolean a(drd $$0) {
         return false;
      }

      default boolean b(drd $$0, it $$1) {
         return this.a($$0) || this.a($$0, $$1);
      }

      default boolean a(dba $$0, djb.c $$1, drd $$2, boolean $$3) {
         drd $$4 = this.a($$2, $$0, $$1.a(), $$1.b());
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
      boolean test(daf var1, io var2, djb.c var3);
   }

   public static enum e {
      a {
         @Override
         public djb.c a(io $$0, it $$1, it $$2) {
            return new djb.c($$0, $$1);
         }
      },
      b {
         @Override
         public djb.c a(io $$0, it $$1, it $$2) {
            return new djb.c($$0.a($$1), $$2);
         }
      },
      c {
         @Override
         public djb.c a(io $$0, it $$1, it $$2) {
            return new djb.c($$0.a($$1).a($$2), $$1.g());
         }
      };

      public abstract djb.c a(io var1, it var2, it var3);
   }
}
