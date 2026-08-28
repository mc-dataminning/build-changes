import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.mutable.MutableBoolean;

public interface bmr<S> {
   boolean a(bmn<S> var1, bmp var2, bmj var3);

   static <S> bmr<S> a(bmi<?> $$0) {
      return new bmr.d<>($$0);
   }

   static <S, T> bmr<S> a(bmi<T> $$0, T $$1) {
      return new bmr.b<>($$0, $$1);
   }

   @SafeVarargs
   static <S> bmr<S> a(bmr<S>... $$0) {
      return new bmr.e<>(List.of($$0));
   }

   @SafeVarargs
   static <S> bmr<S> b(bmr<S>... $$0) {
      return new bmr.a<>(List.of($$0));
   }

   static <S> bmr<S> a(bmr<S> $$0) {
      return new bmr.c<>($$0);
   }

   static <S> bmr<S> a() {
      return new bmr<S>() {
         @Override
         public boolean a(bmn<S> $$0, bmp $$1, bmj $$2) {
            $$2.cut();
            return true;
         }

         @Override
         public String toString() {
            return "↑";
         }
      };
   }

   static <S> bmr<S> b() {
      return new bmr<S>() {
         @Override
         public boolean a(bmn<S> $$0, bmp $$1, bmj $$2) {
            return true;
         }

         @Override
         public String toString() {
            return "ε";
         }
      };
   }

   public static record a<S>(List<bmr<S>> a) implements bmr<S> {
      @Override
      public boolean a(bmn<S> $$0, bmp $$1, bmj $$2) {
         MutableBoolean $$3 = new MutableBoolean();
         bmj $$4 = $$3::setTrue;
         int $$5 = $$0.c();

         for (bmr<S> $$6 : this.a) {
            if ($$3.isTrue()) {
               break;
            }

            bmp $$7 = new bmp();
            if ($$6.a($$0, $$7, $$4)) {
               $$1.a($$7);
               return true;
            }

            $$0.a($$5);
         }

         return false;
      }

      public List<bmr<S>> c() {
         return this.a;
      }
   }

   public static record b<S, T>(bmi<T> a, T b) implements bmr<S> {
      @Override
      public boolean a(bmn<S> $$0, bmp $$1, bmj $$2) {
         $$1.a(this.a, this.b);
         return true;
      }

      public bmi<T> c() {
         return this.a;
      }

      public T d() {
         return this.b;
      }
   }

   public static record c<S>(bmr<S> a) implements bmr<S> {
      @Override
      public boolean a(bmn<S> $$0, bmp $$1, bmj $$2) {
         int $$3 = $$0.c();
         if (!this.a.a($$0, $$1, $$2)) {
            $$0.a($$3);
         }

         return true;
      }

      public bmr<S> c() {
         return this.a;
      }
   }

   public static record d<S, T>(bmi<T> a) implements bmr<S> {
      @Override
      public boolean a(bmn<S> $$0, bmp $$1, bmj $$2) {
         Optional<T> $$3 = $$0.b(this.a);
         if ($$3.isEmpty()) {
            return false;
         } else {
            $$1.a(this.a, $$3.get());
            return true;
         }
      }

      public bmi<T> c() {
         return this.a;
      }
   }

   public static record e<S>(List<bmr<S>> a) implements bmr<S> {
      @Override
      public boolean a(bmn<S> $$0, bmp $$1, bmj $$2) {
         int $$3 = $$0.c();

         for (bmr<S> $$4 : this.a) {
            if (!$$4.a($$0, $$1, $$2)) {
               $$0.a($$3);
               return false;
            }
         }

         return true;
      }

      public List<bmr<S>> c() {
         return this.a;
      }
   }
}
