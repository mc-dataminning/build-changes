import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.mutable.MutableBoolean;

public interface bow<S> {
   boolean a(bos<S> var1, bou var2, boo var3);

   static <S> bow<S> a(bon<?> $$0) {
      return new bow.d<>($$0);
   }

   static <S, T> bow<S> a(bon<T> $$0, T $$1) {
      return new bow.b<>($$0, $$1);
   }

   @SafeVarargs
   static <S> bow<S> a(bow<S>... $$0) {
      return new bow.e<>(List.of($$0));
   }

   @SafeVarargs
   static <S> bow<S> b(bow<S>... $$0) {
      return new bow.a<>(List.of($$0));
   }

   static <S> bow<S> a(bow<S> $$0) {
      return new bow.c<>($$0);
   }

   static <S> bow<S> a() {
      return new bow<S>() {
         @Override
         public boolean a(bos<S> $$0, bou $$1, boo $$2) {
            $$2.cut();
            return true;
         }

         @Override
         public String toString() {
            return "↑";
         }
      };
   }

   static <S> bow<S> b() {
      return new bow<S>() {
         @Override
         public boolean a(bos<S> $$0, bou $$1, boo $$2) {
            return true;
         }

         @Override
         public String toString() {
            return "ε";
         }
      };
   }

   public static record a<S>(List<bow<S>> a) implements bow<S> {
      @Override
      public boolean a(bos<S> $$0, bou $$1, boo $$2) {
         MutableBoolean $$3 = new MutableBoolean();
         boo $$4 = $$3::setTrue;
         int $$5 = $$0.c();

         for (bow<S> $$6 : this.a) {
            if ($$3.isTrue()) {
               break;
            }

            bou $$7 = new bou();
            if ($$6.a($$0, $$7, $$4)) {
               $$1.a($$7);
               return true;
            }

            $$0.a($$5);
         }

         return false;
      }

      public List<bow<S>> c() {
         return this.a;
      }
   }

   public static record b<S, T>(bon<T> a, T b) implements bow<S> {
      @Override
      public boolean a(bos<S> $$0, bou $$1, boo $$2) {
         $$1.a(this.a, this.b);
         return true;
      }

      public bon<T> c() {
         return this.a;
      }

      public T d() {
         return this.b;
      }
   }

   public static record c<S>(bow<S> a) implements bow<S> {
      @Override
      public boolean a(bos<S> $$0, bou $$1, boo $$2) {
         int $$3 = $$0.c();
         if (!this.a.a($$0, $$1, $$2)) {
            $$0.a($$3);
         }

         return true;
      }

      public bow<S> c() {
         return this.a;
      }
   }

   public static record d<S, T>(bon<T> a) implements bow<S> {
      @Override
      public boolean a(bos<S> $$0, bou $$1, boo $$2) {
         Optional<T> $$3 = $$0.b(this.a);
         if ($$3.isEmpty()) {
            return false;
         } else {
            $$1.a(this.a, $$3.get());
            return true;
         }
      }

      public bon<T> c() {
         return this.a;
      }
   }

   public static record e<S>(List<bow<S>> a) implements bow<S> {
      @Override
      public boolean a(bos<S> $$0, bou $$1, boo $$2) {
         int $$3 = $$0.c();

         for (bow<S> $$4 : this.a) {
            if (!$$4.a($$0, $$1, $$2)) {
               $$0.a($$3);
               return false;
            }
         }

         return true;
      }

      public List<bow<S>> c() {
         return this.a;
      }
   }
}
