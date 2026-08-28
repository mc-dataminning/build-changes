import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.mutable.MutableBoolean;

public interface bmd<S> {
   boolean a(blz<S> var1, bmb var2, blv var3);

   static <S> bmd<S> a(blu<?> $$0) {
      return new bmd.d<>($$0);
   }

   static <S, T> bmd<S> a(blu<T> $$0, T $$1) {
      return new bmd.b<>($$0, $$1);
   }

   @SafeVarargs
   static <S> bmd<S> a(bmd<S>... $$0) {
      return new bmd.e<>(List.of($$0));
   }

   @SafeVarargs
   static <S> bmd<S> b(bmd<S>... $$0) {
      return new bmd.a<>(List.of($$0));
   }

   static <S> bmd<S> a(bmd<S> $$0) {
      return new bmd.c<>($$0);
   }

   static <S> bmd<S> a() {
      return new bmd<S>() {
         @Override
         public boolean a(blz<S> $$0, bmb $$1, blv $$2) {
            $$2.cut();
            return true;
         }

         @Override
         public String toString() {
            return "↑";
         }
      };
   }

   static <S> bmd<S> b() {
      return new bmd<S>() {
         @Override
         public boolean a(blz<S> $$0, bmb $$1, blv $$2) {
            return true;
         }

         @Override
         public String toString() {
            return "ε";
         }
      };
   }

   public static record a<S>(List<bmd<S>> a) implements bmd<S> {
      @Override
      public boolean a(blz<S> $$0, bmb $$1, blv $$2) {
         MutableBoolean $$3 = new MutableBoolean();
         blv $$4 = $$3::setTrue;
         int $$5 = $$0.c();

         for (bmd<S> $$6 : this.a) {
            if ($$3.isTrue()) {
               break;
            }

            bmb $$7 = new bmb();
            if ($$6.a($$0, $$7, $$4)) {
               $$1.a($$7);
               return true;
            }

            $$0.a($$5);
         }

         return false;
      }

      public List<bmd<S>> c() {
         return this.a;
      }
   }

   public static record b<S, T>(blu<T> a, T b) implements bmd<S> {
      @Override
      public boolean a(blz<S> $$0, bmb $$1, blv $$2) {
         $$1.a(this.a, this.b);
         return true;
      }

      public blu<T> c() {
         return this.a;
      }

      public T d() {
         return this.b;
      }
   }

   public static record c<S>(bmd<S> a) implements bmd<S> {
      @Override
      public boolean a(blz<S> $$0, bmb $$1, blv $$2) {
         int $$3 = $$0.c();
         if (!this.a.a($$0, $$1, $$2)) {
            $$0.a($$3);
         }

         return true;
      }

      public bmd<S> c() {
         return this.a;
      }
   }

   public static record d<S, T>(blu<T> a) implements bmd<S> {
      @Override
      public boolean a(blz<S> $$0, bmb $$1, blv $$2) {
         Optional<T> $$3 = $$0.b(this.a);
         if ($$3.isEmpty()) {
            return false;
         } else {
            $$1.a(this.a, $$3.get());
            return true;
         }
      }

      public blu<T> c() {
         return this.a;
      }
   }

   public static record e<S>(List<bmd<S>> a) implements bmd<S> {
      @Override
      public boolean a(blz<S> $$0, bmb $$1, blv $$2) {
         int $$3 = $$0.c();

         for (bmd<S> $$4 : this.a) {
            if (!$$4.a($$0, $$1, $$2)) {
               $$0.a($$3);
               return false;
            }
         }

         return true;
      }

      public List<bmd<S>> c() {
         return this.a;
      }
   }
}
