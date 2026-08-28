import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.mutable.MutableBoolean;

public interface bme<S> {
   boolean a(bma<S> var1, bmc var2, blw var3);

   static <S> bme<S> a(blv<?> $$0) {
      return new bme.d<>($$0);
   }

   static <S, T> bme<S> a(blv<T> $$0, T $$1) {
      return new bme.b<>($$0, $$1);
   }

   @SafeVarargs
   static <S> bme<S> a(bme<S>... $$0) {
      return new bme.e<>(List.of($$0));
   }

   @SafeVarargs
   static <S> bme<S> b(bme<S>... $$0) {
      return new bme.a<>(List.of($$0));
   }

   static <S> bme<S> a(bme<S> $$0) {
      return new bme.c<>($$0);
   }

   static <S> bme<S> a() {
      return new bme<S>() {
         @Override
         public boolean a(bma<S> $$0, bmc $$1, blw $$2) {
            $$2.cut();
            return true;
         }

         @Override
         public String toString() {
            return "↑";
         }
      };
   }

   static <S> bme<S> b() {
      return new bme<S>() {
         @Override
         public boolean a(bma<S> $$0, bmc $$1, blw $$2) {
            return true;
         }

         @Override
         public String toString() {
            return "ε";
         }
      };
   }

   public static record a<S>(List<bme<S>> a) implements bme<S> {
      @Override
      public boolean a(bma<S> $$0, bmc $$1, blw $$2) {
         MutableBoolean $$3 = new MutableBoolean();
         blw $$4 = $$3::setTrue;
         int $$5 = $$0.c();

         for (bme<S> $$6 : this.a) {
            if ($$3.isTrue()) {
               break;
            }

            bmc $$7 = new bmc();
            if ($$6.a($$0, $$7, $$4)) {
               $$1.a($$7);
               return true;
            }

            $$0.a($$5);
         }

         return false;
      }

      public List<bme<S>> c() {
         return this.a;
      }
   }

   public static record b<S, T>(blv<T> a, T b) implements bme<S> {
      @Override
      public boolean a(bma<S> $$0, bmc $$1, blw $$2) {
         $$1.a(this.a, this.b);
         return true;
      }

      public blv<T> c() {
         return this.a;
      }

      public T d() {
         return this.b;
      }
   }

   public static record c<S>(bme<S> a) implements bme<S> {
      @Override
      public boolean a(bma<S> $$0, bmc $$1, blw $$2) {
         int $$3 = $$0.c();
         if (!this.a.a($$0, $$1, $$2)) {
            $$0.a($$3);
         }

         return true;
      }

      public bme<S> c() {
         return this.a;
      }
   }

   public static record d<S, T>(blv<T> a) implements bme<S> {
      @Override
      public boolean a(bma<S> $$0, bmc $$1, blw $$2) {
         Optional<T> $$3 = $$0.b(this.a);
         if ($$3.isEmpty()) {
            return false;
         } else {
            $$1.a(this.a, $$3.get());
            return true;
         }
      }

      public blv<T> c() {
         return this.a;
      }
   }

   public static record e<S>(List<bme<S>> a) implements bme<S> {
      @Override
      public boolean a(bma<S> $$0, bmc $$1, blw $$2) {
         int $$3 = $$0.c();

         for (bme<S> $$4 : this.a) {
            if (!$$4.a($$0, $$1, $$2)) {
               $$0.a($$3);
               return false;
            }
         }

         return true;
      }

      public List<bme<S>> c() {
         return this.a;
      }
   }
}
