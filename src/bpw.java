import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.mutable.MutableBoolean;

public interface bpw<S> {
   boolean a(bps<S> var1, bpu var2, bpo var3);

   static <S> bpw<S> a(bpn<?> $$0) {
      return new bpw.d<>($$0);
   }

   static <S, T> bpw<S> a(bpn<T> $$0, T $$1) {
      return new bpw.b<>($$0, $$1);
   }

   @SafeVarargs
   static <S> bpw<S> a(bpw<S>... $$0) {
      return new bpw.e<>(List.of($$0));
   }

   @SafeVarargs
   static <S> bpw<S> b(bpw<S>... $$0) {
      return new bpw.a<>(List.of($$0));
   }

   static <S> bpw<S> a(bpw<S> $$0) {
      return new bpw.c<>($$0);
   }

   static <S> bpw<S> a() {
      return new bpw<S>() {
         @Override
         public boolean a(bps<S> $$0, bpu $$1, bpo $$2) {
            $$2.cut();
            return true;
         }

         @Override
         public String toString() {
            return "↑";
         }
      };
   }

   static <S> bpw<S> b() {
      return new bpw<S>() {
         @Override
         public boolean a(bps<S> $$0, bpu $$1, bpo $$2) {
            return true;
         }

         @Override
         public String toString() {
            return "ε";
         }
      };
   }

   public static record a<S>(List<bpw<S>> a) implements bpw<S> {
      @Override
      public boolean a(bps<S> $$0, bpu $$1, bpo $$2) {
         MutableBoolean $$3 = new MutableBoolean();
         bpo $$4 = $$3::setTrue;
         int $$5 = $$0.c();

         for (bpw<S> $$6 : this.a) {
            if ($$3.isTrue()) {
               break;
            }

            bpu $$7 = new bpu();
            if ($$6.a($$0, $$7, $$4)) {
               $$1.a($$7);
               return true;
            }

            $$0.a($$5);
         }

         return false;
      }

      public List<bpw<S>> c() {
         return this.a;
      }
   }

   public static record b<S, T>(bpn<T> a, T b) implements bpw<S> {
      @Override
      public boolean a(bps<S> $$0, bpu $$1, bpo $$2) {
         $$1.a(this.a, this.b);
         return true;
      }

      public bpn<T> c() {
         return this.a;
      }

      public T d() {
         return this.b;
      }
   }

   public static record c<S>(bpw<S> a) implements bpw<S> {
      @Override
      public boolean a(bps<S> $$0, bpu $$1, bpo $$2) {
         int $$3 = $$0.c();
         if (!this.a.a($$0, $$1, $$2)) {
            $$0.a($$3);
         }

         return true;
      }

      public bpw<S> c() {
         return this.a;
      }
   }

   public static record d<S, T>(bpn<T> a) implements bpw<S> {
      @Override
      public boolean a(bps<S> $$0, bpu $$1, bpo $$2) {
         Optional<T> $$3 = $$0.b(this.a);
         if ($$3.isEmpty()) {
            return false;
         } else {
            $$1.a(this.a, $$3.get());
            return true;
         }
      }

      public bpn<T> c() {
         return this.a;
      }
   }

   public static record e<S>(List<bpw<S>> a) implements bpw<S> {
      @Override
      public boolean a(bps<S> $$0, bpu $$1, bpo $$2) {
         int $$3 = $$0.c();

         for (bpw<S> $$4 : this.a) {
            if (!$$4.a($$0, $$1, $$2)) {
               $$0.a($$3);
               return false;
            }
         }

         return true;
      }

      public List<bpw<S>> c() {
         return this.a;
      }
   }
}
