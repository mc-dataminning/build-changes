import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.mutable.MutableBoolean;

public interface bmt<S> {
   boolean a(bmp<S> var1, bmr var2, bml var3);

   static <S> bmt<S> a(bmk<?> $$0) {
      return new bmt.d<>($$0);
   }

   static <S, T> bmt<S> a(bmk<T> $$0, T $$1) {
      return new bmt.b<>($$0, $$1);
   }

   @SafeVarargs
   static <S> bmt<S> a(bmt<S>... $$0) {
      return new bmt.e<>(List.of($$0));
   }

   @SafeVarargs
   static <S> bmt<S> b(bmt<S>... $$0) {
      return new bmt.a<>(List.of($$0));
   }

   static <S> bmt<S> a(bmt<S> $$0) {
      return new bmt.c<>($$0);
   }

   static <S> bmt<S> a() {
      return new bmt<S>() {
         @Override
         public boolean a(bmp<S> $$0, bmr $$1, bml $$2) {
            $$2.cut();
            return true;
         }

         @Override
         public String toString() {
            return "↑";
         }
      };
   }

   static <S> bmt<S> b() {
      return new bmt<S>() {
         @Override
         public boolean a(bmp<S> $$0, bmr $$1, bml $$2) {
            return true;
         }

         @Override
         public String toString() {
            return "ε";
         }
      };
   }

   public static record a<S>(List<bmt<S>> a) implements bmt<S> {
      @Override
      public boolean a(bmp<S> $$0, bmr $$1, bml $$2) {
         MutableBoolean $$3 = new MutableBoolean();
         bml $$4 = $$3::setTrue;
         int $$5 = $$0.c();

         for (bmt<S> $$6 : this.a) {
            if ($$3.isTrue()) {
               break;
            }

            bmr $$7 = new bmr();
            if ($$6.a($$0, $$7, $$4)) {
               $$1.a($$7);
               return true;
            }

            $$0.a($$5);
         }

         return false;
      }

      public List<bmt<S>> c() {
         return this.a;
      }
   }

   public static record b<S, T>(bmk<T> a, T b) implements bmt<S> {
      @Override
      public boolean a(bmp<S> $$0, bmr $$1, bml $$2) {
         $$1.a(this.a, this.b);
         return true;
      }

      public bmk<T> c() {
         return this.a;
      }

      public T d() {
         return this.b;
      }
   }

   public static record c<S>(bmt<S> a) implements bmt<S> {
      @Override
      public boolean a(bmp<S> $$0, bmr $$1, bml $$2) {
         int $$3 = $$0.c();
         if (!this.a.a($$0, $$1, $$2)) {
            $$0.a($$3);
         }

         return true;
      }

      public bmt<S> c() {
         return this.a;
      }
   }

   public static record d<S, T>(bmk<T> a) implements bmt<S> {
      @Override
      public boolean a(bmp<S> $$0, bmr $$1, bml $$2) {
         Optional<T> $$3 = $$0.b(this.a);
         if ($$3.isEmpty()) {
            return false;
         } else {
            $$1.a(this.a, $$3.get());
            return true;
         }
      }

      public bmk<T> c() {
         return this.a;
      }
   }

   public static record e<S>(List<bmt<S>> a) implements bmt<S> {
      @Override
      public boolean a(bmp<S> $$0, bmr $$1, bml $$2) {
         int $$3 = $$0.c();

         for (bmt<S> $$4 : this.a) {
            if (!$$4.a($$0, $$1, $$2)) {
               $$0.a($$3);
               return false;
            }
         }

         return true;
      }

      public List<bmt<S>> c() {
         return this.a;
      }
   }
}
