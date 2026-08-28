import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.mutable.MutableBoolean;

public interface bnz<S> {
   boolean a(bnv<S> var1, bnx var2, bnr var3);

   static <S> bnz<S> a(bnq<?> $$0) {
      return new bnz.d<>($$0);
   }

   static <S, T> bnz<S> a(bnq<T> $$0, T $$1) {
      return new bnz.b<>($$0, $$1);
   }

   @SafeVarargs
   static <S> bnz<S> a(bnz<S>... $$0) {
      return new bnz.e<>(List.of($$0));
   }

   @SafeVarargs
   static <S> bnz<S> b(bnz<S>... $$0) {
      return new bnz.a<>(List.of($$0));
   }

   static <S> bnz<S> a(bnz<S> $$0) {
      return new bnz.c<>($$0);
   }

   static <S> bnz<S> a() {
      return new bnz<S>() {
         @Override
         public boolean a(bnv<S> $$0, bnx $$1, bnr $$2) {
            $$2.cut();
            return true;
         }

         @Override
         public String toString() {
            return "↑";
         }
      };
   }

   static <S> bnz<S> b() {
      return new bnz<S>() {
         @Override
         public boolean a(bnv<S> $$0, bnx $$1, bnr $$2) {
            return true;
         }

         @Override
         public String toString() {
            return "ε";
         }
      };
   }

   public static record a<S>(List<bnz<S>> a) implements bnz<S> {
      @Override
      public boolean a(bnv<S> $$0, bnx $$1, bnr $$2) {
         MutableBoolean $$3 = new MutableBoolean();
         bnr $$4 = $$3::setTrue;
         int $$5 = $$0.c();

         for (bnz<S> $$6 : this.a) {
            if ($$3.isTrue()) {
               break;
            }

            bnx $$7 = new bnx();
            if ($$6.a($$0, $$7, $$4)) {
               $$1.a($$7);
               return true;
            }

            $$0.a($$5);
         }

         return false;
      }

      public List<bnz<S>> c() {
         return this.a;
      }
   }

   public static record b<S, T>(bnq<T> a, T b) implements bnz<S> {
      @Override
      public boolean a(bnv<S> $$0, bnx $$1, bnr $$2) {
         $$1.a(this.a, this.b);
         return true;
      }

      public bnq<T> c() {
         return this.a;
      }

      public T d() {
         return this.b;
      }
   }

   public static record c<S>(bnz<S> a) implements bnz<S> {
      @Override
      public boolean a(bnv<S> $$0, bnx $$1, bnr $$2) {
         int $$3 = $$0.c();
         if (!this.a.a($$0, $$1, $$2)) {
            $$0.a($$3);
         }

         return true;
      }

      public bnz<S> c() {
         return this.a;
      }
   }

   public static record d<S, T>(bnq<T> a) implements bnz<S> {
      @Override
      public boolean a(bnv<S> $$0, bnx $$1, bnr $$2) {
         Optional<T> $$3 = $$0.b(this.a);
         if ($$3.isEmpty()) {
            return false;
         } else {
            $$1.a(this.a, $$3.get());
            return true;
         }
      }

      public bnq<T> c() {
         return this.a;
      }
   }

   public static record e<S>(List<bnz<S>> a) implements bnz<S> {
      @Override
      public boolean a(bnv<S> $$0, bnx $$1, bnr $$2) {
         int $$3 = $$0.c();

         for (bnz<S> $$4 : this.a) {
            if (!$$4.a($$0, $$1, $$2)) {
               $$0.a($$3);
               return false;
            }
         }

         return true;
      }

      public List<bnz<S>> c() {
         return this.a;
      }
   }
}
