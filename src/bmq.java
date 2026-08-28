import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.mutable.MutableBoolean;

public interface bmq<S> {
   boolean a(bmm<S> var1, bmo var2, bmi var3);

   static <S> bmq<S> a(bmh<?> $$0) {
      return new bmq.d<>($$0);
   }

   static <S, T> bmq<S> a(bmh<T> $$0, T $$1) {
      return new bmq.b<>($$0, $$1);
   }

   @SafeVarargs
   static <S> bmq<S> a(bmq<S>... $$0) {
      return new bmq.e<>(List.of($$0));
   }

   @SafeVarargs
   static <S> bmq<S> b(bmq<S>... $$0) {
      return new bmq.a<>(List.of($$0));
   }

   static <S> bmq<S> a(bmq<S> $$0) {
      return new bmq.c<>($$0);
   }

   static <S> bmq<S> a() {
      return new bmq<S>() {
         @Override
         public boolean a(bmm<S> $$0, bmo $$1, bmi $$2) {
            $$2.cut();
            return true;
         }

         @Override
         public String toString() {
            return "↑";
         }
      };
   }

   static <S> bmq<S> b() {
      return new bmq<S>() {
         @Override
         public boolean a(bmm<S> $$0, bmo $$1, bmi $$2) {
            return true;
         }

         @Override
         public String toString() {
            return "ε";
         }
      };
   }

   public static record a<S>(List<bmq<S>> a) implements bmq<S> {
      @Override
      public boolean a(bmm<S> $$0, bmo $$1, bmi $$2) {
         MutableBoolean $$3 = new MutableBoolean();
         bmi $$4 = $$3::setTrue;
         int $$5 = $$0.c();

         for (bmq<S> $$6 : this.a) {
            if ($$3.isTrue()) {
               break;
            }

            bmo $$7 = new bmo();
            if ($$6.a($$0, $$7, $$4)) {
               $$1.a($$7);
               return true;
            }

            $$0.a($$5);
         }

         return false;
      }

      public List<bmq<S>> c() {
         return this.a;
      }
   }

   public static record b<S, T>(bmh<T> a, T b) implements bmq<S> {
      @Override
      public boolean a(bmm<S> $$0, bmo $$1, bmi $$2) {
         $$1.a(this.a, this.b);
         return true;
      }

      public bmh<T> c() {
         return this.a;
      }

      public T d() {
         return this.b;
      }
   }

   public static record c<S>(bmq<S> a) implements bmq<S> {
      @Override
      public boolean a(bmm<S> $$0, bmo $$1, bmi $$2) {
         int $$3 = $$0.c();
         if (!this.a.a($$0, $$1, $$2)) {
            $$0.a($$3);
         }

         return true;
      }

      public bmq<S> c() {
         return this.a;
      }
   }

   public static record d<S, T>(bmh<T> a) implements bmq<S> {
      @Override
      public boolean a(bmm<S> $$0, bmo $$1, bmi $$2) {
         Optional<T> $$3 = $$0.b(this.a);
         if ($$3.isEmpty()) {
            return false;
         } else {
            $$1.a(this.a, $$3.get());
            return true;
         }
      }

      public bmh<T> c() {
         return this.a;
      }
   }

   public static record e<S>(List<bmq<S>> a) implements bmq<S> {
      @Override
      public boolean a(bmm<S> $$0, bmo $$1, bmi $$2) {
         int $$3 = $$0.c();

         for (bmq<S> $$4 : this.a) {
            if (!$$4.a($$0, $$1, $$2)) {
               $$0.a($$3);
               return false;
            }
         }

         return true;
      }

      public List<bmq<S>> c() {
         return this.a;
      }
   }
}
