import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.mutable.MutableBoolean;

public interface bmm<S> {
   boolean a(bmi<S> var1, bmk var2, bme var3);

   static <S> bmm<S> a(bmd<?> $$0) {
      return new bmm.d<>($$0);
   }

   static <S, T> bmm<S> a(bmd<T> $$0, T $$1) {
      return new bmm.b<>($$0, $$1);
   }

   @SafeVarargs
   static <S> bmm<S> a(bmm<S>... $$0) {
      return new bmm.e<>(List.of($$0));
   }

   @SafeVarargs
   static <S> bmm<S> b(bmm<S>... $$0) {
      return new bmm.a<>(List.of($$0));
   }

   static <S> bmm<S> a(bmm<S> $$0) {
      return new bmm.c<>($$0);
   }

   static <S> bmm<S> a() {
      return new bmm<S>() {
         @Override
         public boolean a(bmi<S> $$0, bmk $$1, bme $$2) {
            $$2.cut();
            return true;
         }

         @Override
         public String toString() {
            return "↑";
         }
      };
   }

   static <S> bmm<S> b() {
      return new bmm<S>() {
         @Override
         public boolean a(bmi<S> $$0, bmk $$1, bme $$2) {
            return true;
         }

         @Override
         public String toString() {
            return "ε";
         }
      };
   }

   public static record a<S>(List<bmm<S>> a) implements bmm<S> {
      @Override
      public boolean a(bmi<S> $$0, bmk $$1, bme $$2) {
         MutableBoolean $$3 = new MutableBoolean();
         bme $$4 = $$3::setTrue;
         int $$5 = $$0.c();

         for (bmm<S> $$6 : this.a) {
            if ($$3.isTrue()) {
               break;
            }

            bmk $$7 = new bmk();
            if ($$6.a($$0, $$7, $$4)) {
               $$1.a($$7);
               return true;
            }

            $$0.a($$5);
         }

         return false;
      }

      public List<bmm<S>> c() {
         return this.a;
      }
   }

   public static record b<S, T>(bmd<T> a, T b) implements bmm<S> {
      @Override
      public boolean a(bmi<S> $$0, bmk $$1, bme $$2) {
         $$1.a(this.a, this.b);
         return true;
      }

      public bmd<T> c() {
         return this.a;
      }

      public T d() {
         return this.b;
      }
   }

   public static record c<S>(bmm<S> a) implements bmm<S> {
      @Override
      public boolean a(bmi<S> $$0, bmk $$1, bme $$2) {
         int $$3 = $$0.c();
         if (!this.a.a($$0, $$1, $$2)) {
            $$0.a($$3);
         }

         return true;
      }

      public bmm<S> c() {
         return this.a;
      }
   }

   public static record d<S, T>(bmd<T> a) implements bmm<S> {
      @Override
      public boolean a(bmi<S> $$0, bmk $$1, bme $$2) {
         Optional<T> $$3 = $$0.b(this.a);
         if ($$3.isEmpty()) {
            return false;
         } else {
            $$1.a(this.a, $$3.get());
            return true;
         }
      }

      public bmd<T> c() {
         return this.a;
      }
   }

   public static record e<S>(List<bmm<S>> a) implements bmm<S> {
      @Override
      public boolean a(bmi<S> $$0, bmk $$1, bme $$2) {
         int $$3 = $$0.c();

         for (bmm<S> $$4 : this.a) {
            if (!$$4.a($$0, $$1, $$2)) {
               $$0.a($$3);
               return false;
            }
         }

         return true;
      }

      public List<bmm<S>> c() {
         return this.a;
      }
   }
}
