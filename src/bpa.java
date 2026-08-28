import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.mutable.MutableBoolean;

public interface bpa<S> {
   boolean a(bow<S> var1, boy var2, bos var3);

   static <S> bpa<S> a(bor<?> $$0) {
      return new bpa.d<>($$0);
   }

   static <S, T> bpa<S> a(bor<T> $$0, T $$1) {
      return new bpa.b<>($$0, $$1);
   }

   @SafeVarargs
   static <S> bpa<S> a(bpa<S>... $$0) {
      return new bpa.e<>(List.of($$0));
   }

   @SafeVarargs
   static <S> bpa<S> b(bpa<S>... $$0) {
      return new bpa.a<>(List.of($$0));
   }

   static <S> bpa<S> a(bpa<S> $$0) {
      return new bpa.c<>($$0);
   }

   static <S> bpa<S> a() {
      return new bpa<S>() {
         @Override
         public boolean a(bow<S> $$0, boy $$1, bos $$2) {
            $$2.cut();
            return true;
         }

         @Override
         public String toString() {
            return "↑";
         }
      };
   }

   static <S> bpa<S> b() {
      return new bpa<S>() {
         @Override
         public boolean a(bow<S> $$0, boy $$1, bos $$2) {
            return true;
         }

         @Override
         public String toString() {
            return "ε";
         }
      };
   }

   public static record a<S>(List<bpa<S>> a) implements bpa<S> {
      @Override
      public boolean a(bow<S> $$0, boy $$1, bos $$2) {
         MutableBoolean $$3 = new MutableBoolean();
         bos $$4 = $$3::setTrue;
         int $$5 = $$0.c();

         for (bpa<S> $$6 : this.a) {
            if ($$3.isTrue()) {
               break;
            }

            boy $$7 = new boy();
            if ($$6.a($$0, $$7, $$4)) {
               $$1.a($$7);
               return true;
            }

            $$0.a($$5);
         }

         return false;
      }

      public List<bpa<S>> c() {
         return this.a;
      }
   }

   public static record b<S, T>(bor<T> a, T b) implements bpa<S> {
      @Override
      public boolean a(bow<S> $$0, boy $$1, bos $$2) {
         $$1.a(this.a, this.b);
         return true;
      }

      public bor<T> c() {
         return this.a;
      }

      public T d() {
         return this.b;
      }
   }

   public static record c<S>(bpa<S> a) implements bpa<S> {
      @Override
      public boolean a(bow<S> $$0, boy $$1, bos $$2) {
         int $$3 = $$0.c();
         if (!this.a.a($$0, $$1, $$2)) {
            $$0.a($$3);
         }

         return true;
      }

      public bpa<S> c() {
         return this.a;
      }
   }

   public static record d<S, T>(bor<T> a) implements bpa<S> {
      @Override
      public boolean a(bow<S> $$0, boy $$1, bos $$2) {
         Optional<T> $$3 = $$0.b(this.a);
         if ($$3.isEmpty()) {
            return false;
         } else {
            $$1.a(this.a, $$3.get());
            return true;
         }
      }

      public bor<T> c() {
         return this.a;
      }
   }

   public static record e<S>(List<bpa<S>> a) implements bpa<S> {
      @Override
      public boolean a(bow<S> $$0, boy $$1, bos $$2) {
         int $$3 = $$0.c();

         for (bpa<S> $$4 : this.a) {
            if (!$$4.a($$0, $$1, $$2)) {
               $$0.a($$3);
               return false;
            }
         }

         return true;
      }

      public List<bpa<S>> c() {
         return this.a;
      }
   }
}
