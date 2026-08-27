import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import javax.annotation.Nullable;

public class dbq {
   public static final dbq.e[] a = new dbq.e[]{dbq.e.a, dbq.e.b, dbq.e.c};
   private final dbq.b b;

   public dbq(dbp $$0) {
      this(new dbq.a($$0));
   }

   public dbq(dbq.b $$0) {
      this.b = $$0;
   }

   public boolean a(djh $$0, csv $$1, hx $$2, ic $$3) {
      return ic.a().anyMatch($$4 -> this.a($$0, $$1, $$2, $$3, $$4, this.b::a).isPresent());
   }

   public Optional<dbq.c> a(djh $$0, ctq $$1, hx $$2, auv $$3) {
      return ic.a($$3)
         .stream()
         .filter($$1x -> this.b.b($$0, $$1x))
         .map($$4 -> this.a($$0, $$1, $$2, $$4, $$3, false))
         .filter(Optional::isPresent)
         .findFirst()
         .orElse(Optional.empty());
   }

   public long a(djh $$0, ctq $$1, hx $$2, boolean $$3) {
      return ic.a().filter($$1x -> this.b.b($$0, $$1x)).map($$4 -> this.a($$0, $$1, $$2, $$4, $$3)).reduce(0L, Long::sum);
   }

   public Optional<dbq.c> a(djh $$0, ctq $$1, hx $$2, ic $$3, auv $$4, boolean $$5) {
      return ic.a($$4).stream().map($$5x -> this.a($$0, $$1, $$2, $$3, $$5x, $$5)).filter(Optional::isPresent).findFirst().orElse(Optional.empty());
   }

   private long a(djh $$0, ctq $$1, hx $$2, ic $$3, boolean $$4) {
      return ic.a().map($$5 -> this.a($$0, $$1, $$2, $$3, $$5, $$4)).filter(Optional::isPresent).count();
   }

   @VisibleForTesting
   public Optional<dbq.c> a(djh $$0, ctq $$1, hx $$2, ic $$3, ic $$4, boolean $$5) {
      return this.a($$0, $$1, $$2, $$3, $$4, this.b::a).flatMap($$2x -> this.a($$1, $$2x, $$5));
   }

   public Optional<dbq.c> a(djh $$0, csv $$1, hx $$2, ic $$3, ic $$4, dbq.d $$5) {
      if ($$4.o() == $$3.o()) {
         return Optional.empty();
      } else if (this.b.a($$0) || this.b.a($$0, $$3) && !this.b.a($$0, $$4)) {
         for (dbq.e $$6 : this.b.a()) {
            dbq.c $$7 = $$6.a($$2, $$4, $$3);
            if ($$5.test($$1, $$2, $$7)) {
               return Optional.of($$7);
            }
         }

         return Optional.empty();
      } else {
         return Optional.empty();
      }
   }

   public Optional<dbq.c> a(ctq $$0, dbq.c $$1, boolean $$2) {
      djh $$3 = $$0.a_($$1.a());
      return this.b.a($$0, $$1, $$3, $$2) ? Optional.of($$1) : Optional.empty();
   }

   public static class a implements dbq.b {
      protected dbp a;

      public a(dbp $$0) {
         this.a = $$0;
      }

      @Nullable
      @Override
      public djh a(djh $$0, csv $$1, hx $$2, ic $$3) {
         return this.a.c($$0, $$1, $$2, $$3);
      }

      protected boolean a(csv $$0, hx $$1, hx $$2, ic $$3, djh $$4) {
         return $$4.i() || $$4.a(this.a) || $$4.a(cws.G) && $$4.u().b();
      }

      @Override
      public boolean a(csv $$0, hx $$1, dbq.c $$2) {
         djh $$3 = $$0.a_($$2.a());
         return this.a($$0, $$1, $$2.a(), $$2.b(), $$3) && this.a.a($$0, $$3, $$2.a(), $$2.b());
      }
   }

   public interface b {
      @Nullable
      djh a(djh var1, csv var2, hx var3, ic var4);

      boolean a(csv var1, hx var2, dbq.c var3);

      default dbq.e[] a() {
         return dbq.a;
      }

      default boolean a(djh $$0, ic $$1) {
         return dbp.a($$0, $$1);
      }

      default boolean a(djh $$0) {
         return false;
      }

      default boolean b(djh $$0, ic $$1) {
         return this.a($$0) || this.a($$0, $$1);
      }

      default boolean a(ctq $$0, dbq.c $$1, djh $$2, boolean $$3) {
         djh $$4 = this.a($$2, $$0, $$1.a(), $$1.b());
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
      boolean test(csv var1, hx var2, dbq.c var3);
   }

   public static enum e {
      a {
         @Override
         public dbq.c a(hx $$0, ic $$1, ic $$2) {
            return new dbq.c($$0, $$1);
         }
      },
      b {
         @Override
         public dbq.c a(hx $$0, ic $$1, ic $$2) {
            return new dbq.c($$0.a($$1), $$2);
         }
      },
      c {
         @Override
         public dbq.c a(hx $$0, ic $$1, ic $$2) {
            return new dbq.c($$0.a($$1).a($$2), $$1.g());
         }
      };

      public abstract dbq.c a(hx var1, ic var2, ic var3);
   }
}
