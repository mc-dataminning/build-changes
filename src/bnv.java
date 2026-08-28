import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.mutable.MutableBoolean;

public interface bnv<S> {
   boolean a(bnr<S> var1, bnt var2, bnn var3);

   static <S> bnv<S> a(bnm<?> $$0) {
      return new bnv.d<>($$0);
   }

   static <S, T> bnv<S> a(bnm<T> $$0, T $$1) {
      return new bnv.b<>($$0, $$1);
   }

   @SafeVarargs
   static <S> bnv<S> a(bnv<S>... $$0) {
      return new bnv.e<>(List.of($$0));
   }

   @SafeVarargs
   static <S> bnv<S> b(bnv<S>... $$0) {
      return new bnv.a<>(List.of($$0));
   }

   static <S> bnv<S> a(bnv<S> $$0) {
      return new bnv.c<>($$0);
   }

   static <S> bnv<S> a() {
      return new bnv<S>() {
         @Override
         public boolean a(bnr<S> $$0, bnt $$1, bnn $$2) {
            $$2.cut();
            return true;
         }

         @Override
         public String toString() {
            return "↑";
         }
      };
   }

   static <S> bnv<S> b() {
      return new bnv<S>() {
         @Override
         public boolean a(bnr<S> $$0, bnt $$1, bnn $$2) {
            return true;
         }

         @Override
         public String toString() {
            return "ε";
         }
      };
   }

   public static record a<S>(List<bnv<S>> a) implements bnv<S> {
      @Override
      public boolean a(bnr<S> $$0, bnt $$1, bnn $$2) {
         MutableBoolean $$3 = new MutableBoolean();
         bnn $$4 = $$3::setTrue;
         int $$5 = $$0.c();

         for (bnv<S> $$6 : this.a) {
            if ($$3.isTrue()) {
               break;
            }

            bnt $$7 = new bnt();
            if ($$6.a($$0, $$7, $$4)) {
               $$1.a($$7);
               return true;
            }

            $$0.a($$5);
         }

         return false;
      }

      public List<bnv<S>> c() {
         return this.a;
      }
   }

   public static record b<S, T>(bnm<T> a, T b) implements bnv<S> {
      @Override
      public boolean a(bnr<S> $$0, bnt $$1, bnn $$2) {
         $$1.a(this.a, this.b);
         return true;
      }

      public bnm<T> c() {
         return this.a;
      }

      public T d() {
         return this.b;
      }
   }

   public static record c<S>(bnv<S> a) implements bnv<S> {
      @Override
      public boolean a(bnr<S> $$0, bnt $$1, bnn $$2) {
         int $$3 = $$0.c();
         if (!this.a.a($$0, $$1, $$2)) {
            $$0.a($$3);
         }

         return true;
      }

      public bnv<S> c() {
         return this.a;
      }
   }

   public static record d<S, T>(bnm<T> a) implements bnv<S> {
      @Override
      public boolean a(bnr<S> $$0, bnt $$1, bnn $$2) {
         Optional<T> $$3 = $$0.b(this.a);
         if ($$3.isEmpty()) {
            return false;
         } else {
            $$1.a(this.a, $$3.get());
            return true;
         }
      }

      public bnm<T> c() {
         return this.a;
      }
   }

   public static record e<S>(List<bnv<S>> a) implements bnv<S> {
      @Override
      public boolean a(bnr<S> $$0, bnt $$1, bnn $$2) {
         int $$3 = $$0.c();

         for (bnv<S> $$4 : this.a) {
            if (!$$4.a($$0, $$1, $$2)) {
               $$0.a($$3);
               return false;
            }
         }

         return true;
      }

      public List<bnv<S>> c() {
         return this.a;
      }
   }
}
