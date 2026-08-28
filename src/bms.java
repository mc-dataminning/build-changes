import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.mutable.MutableBoolean;

public interface bms<S> {
   boolean a(bmo<S> var1, bmq var2, bmk var3);

   static <S> bms<S> a(bmj<?> $$0) {
      return new bms.d<>($$0);
   }

   static <S, T> bms<S> a(bmj<T> $$0, T $$1) {
      return new bms.b<>($$0, $$1);
   }

   @SafeVarargs
   static <S> bms<S> a(bms<S>... $$0) {
      return new bms.e<>(List.of($$0));
   }

   @SafeVarargs
   static <S> bms<S> b(bms<S>... $$0) {
      return new bms.a<>(List.of($$0));
   }

   static <S> bms<S> a(bms<S> $$0) {
      return new bms.c<>($$0);
   }

   static <S> bms<S> a() {
      return new bms<S>() {
         @Override
         public boolean a(bmo<S> $$0, bmq $$1, bmk $$2) {
            $$2.cut();
            return true;
         }

         @Override
         public String toString() {
            return "↑";
         }
      };
   }

   static <S> bms<S> b() {
      return new bms<S>() {
         @Override
         public boolean a(bmo<S> $$0, bmq $$1, bmk $$2) {
            return true;
         }

         @Override
         public String toString() {
            return "ε";
         }
      };
   }

   public static record a<S>(List<bms<S>> a) implements bms<S> {
      @Override
      public boolean a(bmo<S> $$0, bmq $$1, bmk $$2) {
         MutableBoolean $$3 = new MutableBoolean();
         bmk $$4 = $$3::setTrue;
         int $$5 = $$0.c();

         for (bms<S> $$6 : this.a) {
            if ($$3.isTrue()) {
               break;
            }

            bmq $$7 = new bmq();
            if ($$6.a($$0, $$7, $$4)) {
               $$1.a($$7);
               return true;
            }

            $$0.a($$5);
         }

         return false;
      }

      public List<bms<S>> c() {
         return this.a;
      }
   }

   public static record b<S, T>(bmj<T> a, T b) implements bms<S> {
      @Override
      public boolean a(bmo<S> $$0, bmq $$1, bmk $$2) {
         $$1.a(this.a, this.b);
         return true;
      }

      public bmj<T> c() {
         return this.a;
      }

      public T d() {
         return this.b;
      }
   }

   public static record c<S>(bms<S> a) implements bms<S> {
      @Override
      public boolean a(bmo<S> $$0, bmq $$1, bmk $$2) {
         int $$3 = $$0.c();
         if (!this.a.a($$0, $$1, $$2)) {
            $$0.a($$3);
         }

         return true;
      }

      public bms<S> c() {
         return this.a;
      }
   }

   public static record d<S, T>(bmj<T> a) implements bms<S> {
      @Override
      public boolean a(bmo<S> $$0, bmq $$1, bmk $$2) {
         Optional<T> $$3 = $$0.b(this.a);
         if ($$3.isEmpty()) {
            return false;
         } else {
            $$1.a(this.a, $$3.get());
            return true;
         }
      }

      public bmj<T> c() {
         return this.a;
      }
   }

   public static record e<S>(List<bms<S>> a) implements bms<S> {
      @Override
      public boolean a(bmo<S> $$0, bmq $$1, bmk $$2) {
         int $$3 = $$0.c();

         for (bms<S> $$4 : this.a) {
            if (!$$4.a($$0, $$1, $$2)) {
               $$0.a($$3);
               return false;
            }
         }

         return true;
      }

      public List<bms<S>> c() {
         return this.a;
      }
   }
}
