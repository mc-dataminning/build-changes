import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.mutable.MutableBoolean;

public interface bmo<S> {
   boolean a(bmk<S> var1, bmm var2, bmg var3);

   static <S> bmo<S> a(bmf<?> $$0) {
      return new bmo.d<>($$0);
   }

   static <S, T> bmo<S> a(bmf<T> $$0, T $$1) {
      return new bmo.b<>($$0, $$1);
   }

   @SafeVarargs
   static <S> bmo<S> a(bmo<S>... $$0) {
      return new bmo.e<>(List.of($$0));
   }

   @SafeVarargs
   static <S> bmo<S> b(bmo<S>... $$0) {
      return new bmo.a<>(List.of($$0));
   }

   static <S> bmo<S> a(bmo<S> $$0) {
      return new bmo.c<>($$0);
   }

   static <S> bmo<S> a() {
      return new bmo<S>() {
         @Override
         public boolean a(bmk<S> $$0, bmm $$1, bmg $$2) {
            $$2.cut();
            return true;
         }

         @Override
         public String toString() {
            return "↑";
         }
      };
   }

   static <S> bmo<S> b() {
      return new bmo<S>() {
         @Override
         public boolean a(bmk<S> $$0, bmm $$1, bmg $$2) {
            return true;
         }

         @Override
         public String toString() {
            return "ε";
         }
      };
   }

   public static record a<S>(List<bmo<S>> a) implements bmo<S> {
      @Override
      public boolean a(bmk<S> $$0, bmm $$1, bmg $$2) {
         MutableBoolean $$3 = new MutableBoolean();
         bmg $$4 = $$3::setTrue;
         int $$5 = $$0.c();

         for (bmo<S> $$6 : this.a) {
            if ($$3.isTrue()) {
               break;
            }

            bmm $$7 = new bmm();
            if ($$6.a($$0, $$7, $$4)) {
               $$1.a($$7);
               return true;
            }

            $$0.a($$5);
         }

         return false;
      }

      public List<bmo<S>> c() {
         return this.a;
      }
   }

   public static record b<S, T>(bmf<T> a, T b) implements bmo<S> {
      @Override
      public boolean a(bmk<S> $$0, bmm $$1, bmg $$2) {
         $$1.a(this.a, this.b);
         return true;
      }

      public bmf<T> c() {
         return this.a;
      }

      public T d() {
         return this.b;
      }
   }

   public static record c<S>(bmo<S> a) implements bmo<S> {
      @Override
      public boolean a(bmk<S> $$0, bmm $$1, bmg $$2) {
         int $$3 = $$0.c();
         if (!this.a.a($$0, $$1, $$2)) {
            $$0.a($$3);
         }

         return true;
      }

      public bmo<S> c() {
         return this.a;
      }
   }

   public static record d<S, T>(bmf<T> a) implements bmo<S> {
      @Override
      public boolean a(bmk<S> $$0, bmm $$1, bmg $$2) {
         Optional<T> $$3 = $$0.b(this.a);
         if ($$3.isEmpty()) {
            return false;
         } else {
            $$1.a(this.a, $$3.get());
            return true;
         }
      }

      public bmf<T> c() {
         return this.a;
      }
   }

   public static record e<S>(List<bmo<S>> a) implements bmo<S> {
      @Override
      public boolean a(bmk<S> $$0, bmm $$1, bmg $$2) {
         int $$3 = $$0.c();

         for (bmo<S> $$4 : this.a) {
            if (!$$4.a($$0, $$1, $$2)) {
               $$0.a($$3);
               return false;
            }
         }

         return true;
      }

      public List<bmo<S>> c() {
         return this.a;
      }
   }
}
