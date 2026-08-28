import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.mutable.MutableBoolean;

public interface bnp<S> {
   boolean a(bnl<S> var1, bnn var2, bnh var3);

   static <S> bnp<S> a(bng<?> $$0) {
      return new bnp.d<>($$0);
   }

   static <S, T> bnp<S> a(bng<T> $$0, T $$1) {
      return new bnp.b<>($$0, $$1);
   }

   @SafeVarargs
   static <S> bnp<S> a(bnp<S>... $$0) {
      return new bnp.e<>(List.of($$0));
   }

   @SafeVarargs
   static <S> bnp<S> b(bnp<S>... $$0) {
      return new bnp.a<>(List.of($$0));
   }

   static <S> bnp<S> a(bnp<S> $$0) {
      return new bnp.c<>($$0);
   }

   static <S> bnp<S> a() {
      return new bnp<S>() {
         @Override
         public boolean a(bnl<S> $$0, bnn $$1, bnh $$2) {
            $$2.cut();
            return true;
         }

         @Override
         public String toString() {
            return "↑";
         }
      };
   }

   static <S> bnp<S> b() {
      return new bnp<S>() {
         @Override
         public boolean a(bnl<S> $$0, bnn $$1, bnh $$2) {
            return true;
         }

         @Override
         public String toString() {
            return "ε";
         }
      };
   }

   public static record a<S>(List<bnp<S>> a) implements bnp<S> {
      @Override
      public boolean a(bnl<S> $$0, bnn $$1, bnh $$2) {
         MutableBoolean $$3 = new MutableBoolean();
         bnh $$4 = $$3::setTrue;
         int $$5 = $$0.c();

         for (bnp<S> $$6 : this.a) {
            if ($$3.isTrue()) {
               break;
            }

            bnn $$7 = new bnn();
            if ($$6.a($$0, $$7, $$4)) {
               $$1.a($$7);
               return true;
            }

            $$0.a($$5);
         }

         return false;
      }

      public List<bnp<S>> c() {
         return this.a;
      }
   }

   public static record b<S, T>(bng<T> a, T b) implements bnp<S> {
      @Override
      public boolean a(bnl<S> $$0, bnn $$1, bnh $$2) {
         $$1.a(this.a, this.b);
         return true;
      }

      public bng<T> c() {
         return this.a;
      }

      public T d() {
         return this.b;
      }
   }

   public static record c<S>(bnp<S> a) implements bnp<S> {
      @Override
      public boolean a(bnl<S> $$0, bnn $$1, bnh $$2) {
         int $$3 = $$0.c();
         if (!this.a.a($$0, $$1, $$2)) {
            $$0.a($$3);
         }

         return true;
      }

      public bnp<S> c() {
         return this.a;
      }
   }

   public static record d<S, T>(bng<T> a) implements bnp<S> {
      @Override
      public boolean a(bnl<S> $$0, bnn $$1, bnh $$2) {
         Optional<T> $$3 = $$0.b(this.a);
         if ($$3.isEmpty()) {
            return false;
         } else {
            $$1.a(this.a, $$3.get());
            return true;
         }
      }

      public bng<T> c() {
         return this.a;
      }
   }

   public static record e<S>(List<bnp<S>> a) implements bnp<S> {
      @Override
      public boolean a(bnl<S> $$0, bnn $$1, bnh $$2) {
         int $$3 = $$0.c();

         for (bnp<S> $$4 : this.a) {
            if (!$$4.a($$0, $$1, $$2)) {
               $$0.a($$3);
               return false;
            }
         }

         return true;
      }

      public List<bnp<S>> c() {
         return this.a;
      }
   }
}
