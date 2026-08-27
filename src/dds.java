import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import javax.annotation.Nullable;

public class dds {
   public static final dds.e[] a = new dds.e[]{dds.e.a, dds.e.b, dds.e.c};
   private final dds.b b;

   public dds(ddr $$0) {
      this(new dds.a($$0));
   }

   public dds(dds.b $$0) {
      this.b = $$0;
   }

   public boolean a(dlj $$0, cux $$1, hz $$2, ie $$3) {
      return ie.a().anyMatch($$4 -> this.a($$0, $$1, $$2, $$3, $$4, this.b::a).isPresent());
   }

   public Optional<dds.c> a(dlj $$0, cvs $$1, hz $$2, awp $$3) {
      return ie.a($$3)
         .stream()
         .filter($$1x -> this.b.b($$0, $$1x))
         .map($$4 -> this.a($$0, $$1, $$2, $$4, $$3, false))
         .filter(Optional::isPresent)
         .findFirst()
         .orElse(Optional.empty());
   }

   public long a(dlj $$0, cvs $$1, hz $$2, boolean $$3) {
      return ie.a().filter($$1x -> this.b.b($$0, $$1x)).map($$4 -> this.a($$0, $$1, $$2, $$4, $$3)).reduce(0L, Long::sum);
   }

   public Optional<dds.c> a(dlj $$0, cvs $$1, hz $$2, ie $$3, awp $$4, boolean $$5) {
      return ie.a($$4).stream().map($$5x -> this.a($$0, $$1, $$2, $$3, $$5x, $$5)).filter(Optional::isPresent).findFirst().orElse(Optional.empty());
   }

   private long a(dlj $$0, cvs $$1, hz $$2, ie $$3, boolean $$4) {
      return ie.a().map($$5 -> this.a($$0, $$1, $$2, $$3, $$5, $$4)).filter(Optional::isPresent).count();
   }

   @VisibleForTesting
   public Optional<dds.c> a(dlj $$0, cvs $$1, hz $$2, ie $$3, ie $$4, boolean $$5) {
      return this.a($$0, $$1, $$2, $$3, $$4, this.b::a).flatMap($$2x -> this.a($$1, $$2x, $$5));
   }

   public Optional<dds.c> a(dlj $$0, cux $$1, hz $$2, ie $$3, ie $$4, dds.d $$5) {
      if ($$4.o() == $$3.o()) {
         return Optional.empty();
      } else if (this.b.a($$0) || this.b.a($$0, $$3) && !this.b.a($$0, $$4)) {
         for (dds.e $$6 : this.b.a()) {
            dds.c $$7 = $$6.a($$2, $$4, $$3);
            if ($$5.test($$1, $$2, $$7)) {
               return Optional.of($$7);
            }
         }

         return Optional.empty();
      } else {
         return Optional.empty();
      }
   }

   public Optional<dds.c> a(cvs $$0, dds.c $$1, boolean $$2) {
      dlj $$3 = $$0.a_($$1.a());
      return this.b.a($$0, $$1, $$3, $$2) ? Optional.of($$1) : Optional.empty();
   }

   public static class a implements dds.b {
      protected ddr a;

      public a(ddr $$0) {
         this.a = $$0;
      }

      @Nullable
      @Override
      public dlj a(dlj $$0, cux $$1, hz $$2, ie $$3) {
         return this.a.c($$0, $$1, $$2, $$3);
      }

      protected boolean a(cux $$0, hz $$1, hz $$2, ie $$3, dlj $$4) {
         return $$4.i() || $$4.a(this.a) || $$4.a(cyu.G) && $$4.u().b();
      }

      @Override
      public boolean a(cux $$0, hz $$1, dds.c $$2) {
         dlj $$3 = $$0.a_($$2.a());
         return this.a($$0, $$1, $$2.a(), $$2.b(), $$3) && this.a.a($$0, $$3, $$2.a(), $$2.b());
      }
   }

   public interface b {
      @Nullable
      dlj a(dlj var1, cux var2, hz var3, ie var4);

      boolean a(cux var1, hz var2, dds.c var3);

      default dds.e[] a() {
         return dds.a;
      }

      default boolean a(dlj $$0, ie $$1) {
         return ddr.a($$0, $$1);
      }

      default boolean a(dlj $$0) {
         return false;
      }

      default boolean b(dlj $$0, ie $$1) {
         return this.a($$0) || this.a($$0, $$1);
      }

      default boolean a(cvs $$0, dds.c $$1, dlj $$2, boolean $$3) {
         dlj $$4 = this.a($$2, $$0, $$1.a(), $$1.b());
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

   public static record c(hz a, ie b) {
   }

   @FunctionalInterface
   public interface d {
      boolean test(cux var1, hz var2, dds.c var3);
   }

   public static enum e {
      a {
         @Override
         public dds.c a(hz $$0, ie $$1, ie $$2) {
            return new dds.c($$0, $$1);
         }
      },
      b {
         @Override
         public dds.c a(hz $$0, ie $$1, ie $$2) {
            return new dds.c($$0.a($$1), $$2);
         }
      },
      c {
         @Override
         public dds.c a(hz $$0, ie $$1, ie $$2) {
            return new dds.c($$0.a($$1).a($$2), $$1.g());
         }
      };

      public abstract dds.c a(hz var1, ie var2, ie var3);
   }
}
