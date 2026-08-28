import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.mutable.MutableBoolean;

public interface bma<S> {
   boolean a(blw<S> var1, bly var2, bls var3);

   static <S> bma<S> a(blr<?> $$0) {
      return new bma.d<>($$0);
   }

   static <S, T> bma<S> a(blr<T> $$0, T $$1) {
      return new bma.b<>($$0, $$1);
   }

   @SafeVarargs
   static <S> bma<S> a(bma<S>... $$0) {
      return new bma.e<>(List.of($$0));
   }

   @SafeVarargs
   static <S> bma<S> b(bma<S>... $$0) {
      return new bma.a<>(List.of($$0));
   }

   static <S> bma<S> a(bma<S> $$0) {
      return new bma.c<>($$0);
   }

   static <S> bma<S> a() {
      return new bma<S>() {
         @Override
         public boolean a(blw<S> $$0, bly $$1, bls $$2) {
            $$2.cut();
            return true;
         }

         @Override
         public String toString() {
            return "↑";
         }
      };
   }

   static <S> bma<S> b() {
      return new bma<S>() {
         @Override
         public boolean a(blw<S> $$0, bly $$1, bls $$2) {
            return true;
         }

         @Override
         public String toString() {
            return "ε";
         }
      };
   }

   public static record a<S>(List<bma<S>> a) implements bma<S> {
      @Override
      public boolean a(blw<S> $$0, bly $$1, bls $$2) {
         MutableBoolean $$3 = new MutableBoolean();
         bls $$4 = $$3::setTrue;
         int $$5 = $$0.c();

         for (bma<S> $$6 : this.a) {
            if ($$3.isTrue()) {
               break;
            }

            bly $$7 = new bly();
            if ($$6.a($$0, $$7, $$4)) {
               $$1.a($$7);
               return true;
            }

            $$0.a($$5);
         }

         return false;
      }

      public List<bma<S>> c() {
         return this.a;
      }
   }

   public static record b<S, T>(blr<T> a, T b) implements bma<S> {
      @Override
      public boolean a(blw<S> $$0, bly $$1, bls $$2) {
         $$1.a(this.a, this.b);
         return true;
      }

      public blr<T> c() {
         return this.a;
      }

      public T d() {
         return this.b;
      }
   }

   public static record c<S>(bma<S> a) implements bma<S> {
      @Override
      public boolean a(blw<S> $$0, bly $$1, bls $$2) {
         int $$3 = $$0.c();
         if (!this.a.a($$0, $$1, $$2)) {
            $$0.a($$3);
         }

         return true;
      }

      public bma<S> c() {
         return this.a;
      }
   }

   public static record d<S, T>(blr<T> a) implements bma<S> {
      @Override
      public boolean a(blw<S> $$0, bly $$1, bls $$2) {
         Optional<T> $$3 = $$0.b(this.a);
         if ($$3.isEmpty()) {
            return false;
         } else {
            $$1.a(this.a, $$3.get());
            return true;
         }
      }

      public blr<T> c() {
         return this.a;
      }
   }

   public static record e<S>(List<bma<S>> a) implements bma<S> {
      @Override
      public boolean a(blw<S> $$0, bly $$1, bls $$2) {
         int $$3 = $$0.c();

         for (bma<S> $$4 : this.a) {
            if (!$$4.a($$0, $$1, $$2)) {
               $$0.a($$3);
               return false;
            }
         }

         return true;
      }

      public List<bma<S>> c() {
         return this.a;
      }
   }
}
