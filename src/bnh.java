import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.mutable.MutableBoolean;

public interface bnh<S> {
   boolean a(bnd<S> var1, bnf var2, bmz var3);

   static <S> bnh<S> a(bmy<?> $$0) {
      return new bnh.d<>($$0);
   }

   static <S, T> bnh<S> a(bmy<T> $$0, T $$1) {
      return new bnh.b<>($$0, $$1);
   }

   @SafeVarargs
   static <S> bnh<S> a(bnh<S>... $$0) {
      return new bnh.e<>(List.of($$0));
   }

   @SafeVarargs
   static <S> bnh<S> b(bnh<S>... $$0) {
      return new bnh.a<>(List.of($$0));
   }

   static <S> bnh<S> a(bnh<S> $$0) {
      return new bnh.c<>($$0);
   }

   static <S> bnh<S> a() {
      return new bnh<S>() {
         @Override
         public boolean a(bnd<S> $$0, bnf $$1, bmz $$2) {
            $$2.cut();
            return true;
         }

         @Override
         public String toString() {
            return "↑";
         }
      };
   }

   static <S> bnh<S> b() {
      return new bnh<S>() {
         @Override
         public boolean a(bnd<S> $$0, bnf $$1, bmz $$2) {
            return true;
         }

         @Override
         public String toString() {
            return "ε";
         }
      };
   }

   public static record a<S>(List<bnh<S>> a) implements bnh<S> {
      @Override
      public boolean a(bnd<S> $$0, bnf $$1, bmz $$2) {
         MutableBoolean $$3 = new MutableBoolean();
         bmz $$4 = $$3::setTrue;
         int $$5 = $$0.c();

         for (bnh<S> $$6 : this.a) {
            if ($$3.isTrue()) {
               break;
            }

            bnf $$7 = new bnf();
            if ($$6.a($$0, $$7, $$4)) {
               $$1.a($$7);
               return true;
            }

            $$0.a($$5);
         }

         return false;
      }

      public List<bnh<S>> c() {
         return this.a;
      }
   }

   public static record b<S, T>(bmy<T> a, T b) implements bnh<S> {
      @Override
      public boolean a(bnd<S> $$0, bnf $$1, bmz $$2) {
         $$1.a(this.a, this.b);
         return true;
      }

      public bmy<T> c() {
         return this.a;
      }

      public T d() {
         return this.b;
      }
   }

   public static record c<S>(bnh<S> a) implements bnh<S> {
      @Override
      public boolean a(bnd<S> $$0, bnf $$1, bmz $$2) {
         int $$3 = $$0.c();
         if (!this.a.a($$0, $$1, $$2)) {
            $$0.a($$3);
         }

         return true;
      }

      public bnh<S> c() {
         return this.a;
      }
   }

   public static record d<S, T>(bmy<T> a) implements bnh<S> {
      @Override
      public boolean a(bnd<S> $$0, bnf $$1, bmz $$2) {
         Optional<T> $$3 = $$0.b(this.a);
         if ($$3.isEmpty()) {
            return false;
         } else {
            $$1.a(this.a, $$3.get());
            return true;
         }
      }

      public bmy<T> c() {
         return this.a;
      }
   }

   public static record e<S>(List<bnh<S>> a) implements bnh<S> {
      @Override
      public boolean a(bnd<S> $$0, bnf $$1, bmz $$2) {
         int $$3 = $$0.c();

         for (bnh<S> $$4 : this.a) {
            if (!$$4.a($$0, $$1, $$2)) {
               $$0.a($$3);
               return false;
            }
         }

         return true;
      }

      public List<bnh<S>> c() {
         return this.a;
      }
   }
}
