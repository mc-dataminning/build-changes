import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.mutable.MutableBoolean;

public interface boa<S> {
   boolean a(bnw<S> var1, bny var2, bns var3);

   static <S> boa<S> a(bnr<?> $$0) {
      return new boa.d<>($$0);
   }

   static <S, T> boa<S> a(bnr<T> $$0, T $$1) {
      return new boa.b<>($$0, $$1);
   }

   @SafeVarargs
   static <S> boa<S> a(boa<S>... $$0) {
      return new boa.e<>(List.of($$0));
   }

   @SafeVarargs
   static <S> boa<S> b(boa<S>... $$0) {
      return new boa.a<>(List.of($$0));
   }

   static <S> boa<S> a(boa<S> $$0) {
      return new boa.c<>($$0);
   }

   static <S> boa<S> a() {
      return new boa<S>() {
         @Override
         public boolean a(bnw<S> $$0, bny $$1, bns $$2) {
            $$2.cut();
            return true;
         }

         @Override
         public String toString() {
            return "↑";
         }
      };
   }

   static <S> boa<S> b() {
      return new boa<S>() {
         @Override
         public boolean a(bnw<S> $$0, bny $$1, bns $$2) {
            return true;
         }

         @Override
         public String toString() {
            return "ε";
         }
      };
   }

   public static record a<S>(List<boa<S>> a) implements boa<S> {
      @Override
      public boolean a(bnw<S> $$0, bny $$1, bns $$2) {
         MutableBoolean $$3 = new MutableBoolean();
         bns $$4 = $$3::setTrue;
         int $$5 = $$0.c();

         for (boa<S> $$6 : this.a) {
            if ($$3.isTrue()) {
               break;
            }

            bny $$7 = new bny();
            if ($$6.a($$0, $$7, $$4)) {
               $$1.a($$7);
               return true;
            }

            $$0.a($$5);
         }

         return false;
      }

      public List<boa<S>> c() {
         return this.a;
      }
   }

   public static record b<S, T>(bnr<T> a, T b) implements boa<S> {
      @Override
      public boolean a(bnw<S> $$0, bny $$1, bns $$2) {
         $$1.a(this.a, this.b);
         return true;
      }

      public bnr<T> c() {
         return this.a;
      }

      public T d() {
         return this.b;
      }
   }

   public static record c<S>(boa<S> a) implements boa<S> {
      @Override
      public boolean a(bnw<S> $$0, bny $$1, bns $$2) {
         int $$3 = $$0.c();
         if (!this.a.a($$0, $$1, $$2)) {
            $$0.a($$3);
         }

         return true;
      }

      public boa<S> c() {
         return this.a;
      }
   }

   public static record d<S, T>(bnr<T> a) implements boa<S> {
      @Override
      public boolean a(bnw<S> $$0, bny $$1, bns $$2) {
         Optional<T> $$3 = $$0.b(this.a);
         if ($$3.isEmpty()) {
            return false;
         } else {
            $$1.a(this.a, $$3.get());
            return true;
         }
      }

      public bnr<T> c() {
         return this.a;
      }
   }

   public static record e<S>(List<boa<S>> a) implements boa<S> {
      @Override
      public boolean a(bnw<S> $$0, bny $$1, bns $$2) {
         int $$3 = $$0.c();

         for (boa<S> $$4 : this.a) {
            if (!$$4.a($$0, $$1, $$2)) {
               $$0.a($$3);
               return false;
            }
         }

         return true;
      }

      public List<boa<S>> c() {
         return this.a;
      }
   }
}
