import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.mutable.MutableBoolean;

public interface bor<S> {
   boolean a(bon<S> var1, bop var2, boj var3);

   static <S> bor<S> a(boi<?> $$0) {
      return new bor.d<>($$0);
   }

   static <S, T> bor<S> a(boi<T> $$0, T $$1) {
      return new bor.b<>($$0, $$1);
   }

   @SafeVarargs
   static <S> bor<S> a(bor<S>... $$0) {
      return new bor.e<>(List.of($$0));
   }

   @SafeVarargs
   static <S> bor<S> b(bor<S>... $$0) {
      return new bor.a<>(List.of($$0));
   }

   static <S> bor<S> a(bor<S> $$0) {
      return new bor.c<>($$0);
   }

   static <S> bor<S> a() {
      return new bor<S>() {
         @Override
         public boolean a(bon<S> $$0, bop $$1, boj $$2) {
            $$2.cut();
            return true;
         }

         @Override
         public String toString() {
            return "↑";
         }
      };
   }

   static <S> bor<S> b() {
      return new bor<S>() {
         @Override
         public boolean a(bon<S> $$0, bop $$1, boj $$2) {
            return true;
         }

         @Override
         public String toString() {
            return "ε";
         }
      };
   }

   public static record a<S>(List<bor<S>> a) implements bor<S> {
      @Override
      public boolean a(bon<S> $$0, bop $$1, boj $$2) {
         MutableBoolean $$3 = new MutableBoolean();
         boj $$4 = $$3::setTrue;
         int $$5 = $$0.c();

         for (bor<S> $$6 : this.a) {
            if ($$3.isTrue()) {
               break;
            }

            bop $$7 = new bop();
            if ($$6.a($$0, $$7, $$4)) {
               $$1.a($$7);
               return true;
            }

            $$0.a($$5);
         }

         return false;
      }

      public List<bor<S>> c() {
         return this.a;
      }
   }

   public static record b<S, T>(boi<T> a, T b) implements bor<S> {
      @Override
      public boolean a(bon<S> $$0, bop $$1, boj $$2) {
         $$1.a(this.a, this.b);
         return true;
      }

      public boi<T> c() {
         return this.a;
      }

      public T d() {
         return this.b;
      }
   }

   public static record c<S>(bor<S> a) implements bor<S> {
      @Override
      public boolean a(bon<S> $$0, bop $$1, boj $$2) {
         int $$3 = $$0.c();
         if (!this.a.a($$0, $$1, $$2)) {
            $$0.a($$3);
         }

         return true;
      }

      public bor<S> c() {
         return this.a;
      }
   }

   public static record d<S, T>(boi<T> a) implements bor<S> {
      @Override
      public boolean a(bon<S> $$0, bop $$1, boj $$2) {
         Optional<T> $$3 = $$0.b(this.a);
         if ($$3.isEmpty()) {
            return false;
         } else {
            $$1.a(this.a, $$3.get());
            return true;
         }
      }

      public boi<T> c() {
         return this.a;
      }
   }

   public static record e<S>(List<bor<S>> a) implements bor<S> {
      @Override
      public boolean a(bon<S> $$0, bop $$1, boj $$2) {
         int $$3 = $$0.c();

         for (bor<S> $$4 : this.a) {
            if (!$$4.a($$0, $$1, $$2)) {
               $$0.a($$3);
               return false;
            }
         }

         return true;
      }

      public List<bor<S>> c() {
         return this.a;
      }
   }
}
