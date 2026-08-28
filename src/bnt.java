import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.mutable.MutableBoolean;

public interface bnt<S> {
   boolean a(bnp<S> var1, bnr var2, bnl var3);

   static <S> bnt<S> a(bnk<?> $$0) {
      return new bnt.d<>($$0);
   }

   static <S, T> bnt<S> a(bnk<T> $$0, T $$1) {
      return new bnt.b<>($$0, $$1);
   }

   @SafeVarargs
   static <S> bnt<S> a(bnt<S>... $$0) {
      return new bnt.e<>(List.of($$0));
   }

   @SafeVarargs
   static <S> bnt<S> b(bnt<S>... $$0) {
      return new bnt.a<>(List.of($$0));
   }

   static <S> bnt<S> a(bnt<S> $$0) {
      return new bnt.c<>($$0);
   }

   static <S> bnt<S> a() {
      return new bnt<S>() {
         @Override
         public boolean a(bnp<S> $$0, bnr $$1, bnl $$2) {
            $$2.cut();
            return true;
         }

         @Override
         public String toString() {
            return "↑";
         }
      };
   }

   static <S> bnt<S> b() {
      return new bnt<S>() {
         @Override
         public boolean a(bnp<S> $$0, bnr $$1, bnl $$2) {
            return true;
         }

         @Override
         public String toString() {
            return "ε";
         }
      };
   }

   public static record a<S>(List<bnt<S>> a) implements bnt<S> {
      @Override
      public boolean a(bnp<S> $$0, bnr $$1, bnl $$2) {
         MutableBoolean $$3 = new MutableBoolean();
         bnl $$4 = $$3::setTrue;
         int $$5 = $$0.c();

         for (bnt<S> $$6 : this.a) {
            if ($$3.isTrue()) {
               break;
            }

            bnr $$7 = new bnr();
            if ($$6.a($$0, $$7, $$4)) {
               $$1.a($$7);
               return true;
            }

            $$0.a($$5);
         }

         return false;
      }

      public List<bnt<S>> c() {
         return this.a;
      }
   }

   public static record b<S, T>(bnk<T> a, T b) implements bnt<S> {
      @Override
      public boolean a(bnp<S> $$0, bnr $$1, bnl $$2) {
         $$1.a(this.a, this.b);
         return true;
      }

      public bnk<T> c() {
         return this.a;
      }

      public T d() {
         return this.b;
      }
   }

   public static record c<S>(bnt<S> a) implements bnt<S> {
      @Override
      public boolean a(bnp<S> $$0, bnr $$1, bnl $$2) {
         int $$3 = $$0.c();
         if (!this.a.a($$0, $$1, $$2)) {
            $$0.a($$3);
         }

         return true;
      }

      public bnt<S> c() {
         return this.a;
      }
   }

   public static record d<S, T>(bnk<T> a) implements bnt<S> {
      @Override
      public boolean a(bnp<S> $$0, bnr $$1, bnl $$2) {
         Optional<T> $$3 = $$0.b(this.a);
         if ($$3.isEmpty()) {
            return false;
         } else {
            $$1.a(this.a, $$3.get());
            return true;
         }
      }

      public bnk<T> c() {
         return this.a;
      }
   }

   public static record e<S>(List<bnt<S>> a) implements bnt<S> {
      @Override
      public boolean a(bnp<S> $$0, bnr $$1, bnl $$2) {
         int $$3 = $$0.c();

         for (bnt<S> $$4 : this.a) {
            if (!$$4.a($$0, $$1, $$2)) {
               $$0.a($$3);
               return false;
            }
         }

         return true;
      }

      public List<bnt<S>> c() {
         return this.a;
      }
   }
}
