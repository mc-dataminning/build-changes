import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.mutable.MutableBoolean;

public interface boc<S> {
   boolean a(bny<S> var1, boa var2, bnu var3);

   static <S> boc<S> a(bnt<?> $$0) {
      return new boc.d<>($$0);
   }

   static <S, T> boc<S> a(bnt<T> $$0, T $$1) {
      return new boc.b<>($$0, $$1);
   }

   @SafeVarargs
   static <S> boc<S> a(boc<S>... $$0) {
      return new boc.e<>(List.of($$0));
   }

   @SafeVarargs
   static <S> boc<S> b(boc<S>... $$0) {
      return new boc.a<>(List.of($$0));
   }

   static <S> boc<S> a(boc<S> $$0) {
      return new boc.c<>($$0);
   }

   static <S> boc<S> a() {
      return new boc<S>() {
         @Override
         public boolean a(bny<S> $$0, boa $$1, bnu $$2) {
            $$2.cut();
            return true;
         }

         @Override
         public String toString() {
            return "↑";
         }
      };
   }

   static <S> boc<S> b() {
      return new boc<S>() {
         @Override
         public boolean a(bny<S> $$0, boa $$1, bnu $$2) {
            return true;
         }

         @Override
         public String toString() {
            return "ε";
         }
      };
   }

   public static record a<S>(List<boc<S>> a) implements boc<S> {
      @Override
      public boolean a(bny<S> $$0, boa $$1, bnu $$2) {
         MutableBoolean $$3 = new MutableBoolean();
         bnu $$4 = $$3::setTrue;
         int $$5 = $$0.c();

         for (boc<S> $$6 : this.a) {
            if ($$3.isTrue()) {
               break;
            }

            boa $$7 = new boa();
            if ($$6.a($$0, $$7, $$4)) {
               $$1.a($$7);
               return true;
            }

            $$0.a($$5);
         }

         return false;
      }

      public List<boc<S>> c() {
         return this.a;
      }
   }

   public static record b<S, T>(bnt<T> a, T b) implements boc<S> {
      @Override
      public boolean a(bny<S> $$0, boa $$1, bnu $$2) {
         $$1.a(this.a, this.b);
         return true;
      }

      public bnt<T> c() {
         return this.a;
      }

      public T d() {
         return this.b;
      }
   }

   public static record c<S>(boc<S> a) implements boc<S> {
      @Override
      public boolean a(bny<S> $$0, boa $$1, bnu $$2) {
         int $$3 = $$0.c();
         if (!this.a.a($$0, $$1, $$2)) {
            $$0.a($$3);
         }

         return true;
      }

      public boc<S> c() {
         return this.a;
      }
   }

   public static record d<S, T>(bnt<T> a) implements boc<S> {
      @Override
      public boolean a(bny<S> $$0, boa $$1, bnu $$2) {
         Optional<T> $$3 = $$0.b(this.a);
         if ($$3.isEmpty()) {
            return false;
         } else {
            $$1.a(this.a, $$3.get());
            return true;
         }
      }

      public bnt<T> c() {
         return this.a;
      }
   }

   public static record e<S>(List<boc<S>> a) implements boc<S> {
      @Override
      public boolean a(bny<S> $$0, boa $$1, bnu $$2) {
         int $$3 = $$0.c();

         for (boc<S> $$4 : this.a) {
            if (!$$4.a($$0, $$1, $$2)) {
               $$0.a($$3);
               return false;
            }
         }

         return true;
      }

      public List<boc<S>> c() {
         return this.a;
      }
   }
}
