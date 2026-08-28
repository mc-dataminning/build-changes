import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.mutable.MutableBoolean;

public interface bmp<S> {
   boolean a(bml<S> var1, bmn var2, bmh var3);

   static <S> bmp<S> a(bmg<?> $$0) {
      return new bmp.d<>($$0);
   }

   static <S, T> bmp<S> a(bmg<T> $$0, T $$1) {
      return new bmp.b<>($$0, $$1);
   }

   @SafeVarargs
   static <S> bmp<S> a(bmp<S>... $$0) {
      return new bmp.e<>(List.of($$0));
   }

   @SafeVarargs
   static <S> bmp<S> b(bmp<S>... $$0) {
      return new bmp.a<>(List.of($$0));
   }

   static <S> bmp<S> a(bmp<S> $$0) {
      return new bmp.c<>($$0);
   }

   static <S> bmp<S> a() {
      return new bmp<S>() {
         @Override
         public boolean a(bml<S> $$0, bmn $$1, bmh $$2) {
            $$2.cut();
            return true;
         }

         @Override
         public String toString() {
            return "↑";
         }
      };
   }

   static <S> bmp<S> b() {
      return new bmp<S>() {
         @Override
         public boolean a(bml<S> $$0, bmn $$1, bmh $$2) {
            return true;
         }

         @Override
         public String toString() {
            return "ε";
         }
      };
   }

   public static record a<S>(List<bmp<S>> a) implements bmp<S> {
      @Override
      public boolean a(bml<S> $$0, bmn $$1, bmh $$2) {
         MutableBoolean $$3 = new MutableBoolean();
         bmh $$4 = $$3::setTrue;
         int $$5 = $$0.c();

         for (bmp<S> $$6 : this.a) {
            if ($$3.isTrue()) {
               break;
            }

            bmn $$7 = new bmn();
            if ($$6.a($$0, $$7, $$4)) {
               $$1.a($$7);
               return true;
            }

            $$0.a($$5);
         }

         return false;
      }

      public List<bmp<S>> c() {
         return this.a;
      }
   }

   public static record b<S, T>(bmg<T> a, T b) implements bmp<S> {
      @Override
      public boolean a(bml<S> $$0, bmn $$1, bmh $$2) {
         $$1.a(this.a, this.b);
         return true;
      }

      public bmg<T> c() {
         return this.a;
      }

      public T d() {
         return this.b;
      }
   }

   public static record c<S>(bmp<S> a) implements bmp<S> {
      @Override
      public boolean a(bml<S> $$0, bmn $$1, bmh $$2) {
         int $$3 = $$0.c();
         if (!this.a.a($$0, $$1, $$2)) {
            $$0.a($$3);
         }

         return true;
      }

      public bmp<S> c() {
         return this.a;
      }
   }

   public static record d<S, T>(bmg<T> a) implements bmp<S> {
      @Override
      public boolean a(bml<S> $$0, bmn $$1, bmh $$2) {
         Optional<T> $$3 = $$0.b(this.a);
         if ($$3.isEmpty()) {
            return false;
         } else {
            $$1.a(this.a, $$3.get());
            return true;
         }
      }

      public bmg<T> c() {
         return this.a;
      }
   }

   public static record e<S>(List<bmp<S>> a) implements bmp<S> {
      @Override
      public boolean a(bml<S> $$0, bmn $$1, bmh $$2) {
         int $$3 = $$0.c();

         for (bmp<S> $$4 : this.a) {
            if (!$$4.a($$0, $$1, $$2)) {
               $$0.a($$3);
               return false;
            }
         }

         return true;
      }

      public List<bmp<S>> c() {
         return this.a;
      }
   }
}
