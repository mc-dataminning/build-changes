import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.mutable.MutableBoolean;

public interface bpr<S> {
   boolean a(bpn<S> var1, bpp var2, bpj var3);

   static <S> bpr<S> a(bpi<?> $$0) {
      return new bpr.d<>($$0);
   }

   static <S, T> bpr<S> a(bpi<T> $$0, T $$1) {
      return new bpr.b<>($$0, $$1);
   }

   @SafeVarargs
   static <S> bpr<S> a(bpr<S>... $$0) {
      return new bpr.e<>(List.of($$0));
   }

   @SafeVarargs
   static <S> bpr<S> b(bpr<S>... $$0) {
      return new bpr.a<>(List.of($$0));
   }

   static <S> bpr<S> a(bpr<S> $$0) {
      return new bpr.c<>($$0);
   }

   static <S> bpr<S> a() {
      return new bpr<S>() {
         @Override
         public boolean a(bpn<S> $$0, bpp $$1, bpj $$2) {
            $$2.cut();
            return true;
         }

         @Override
         public String toString() {
            return "↑";
         }
      };
   }

   static <S> bpr<S> b() {
      return new bpr<S>() {
         @Override
         public boolean a(bpn<S> $$0, bpp $$1, bpj $$2) {
            return true;
         }

         @Override
         public String toString() {
            return "ε";
         }
      };
   }

   public static record a<S>(List<bpr<S>> a) implements bpr<S> {
      @Override
      public boolean a(bpn<S> $$0, bpp $$1, bpj $$2) {
         MutableBoolean $$3 = new MutableBoolean();
         bpj $$4 = $$3::setTrue;
         int $$5 = $$0.c();

         for (bpr<S> $$6 : this.a) {
            if ($$3.isTrue()) {
               break;
            }

            bpp $$7 = new bpp();
            if ($$6.a($$0, $$7, $$4)) {
               $$1.a($$7);
               return true;
            }

            $$0.a($$5);
         }

         return false;
      }

      public List<bpr<S>> c() {
         return this.a;
      }
   }

   public static record b<S, T>(bpi<T> a, T b) implements bpr<S> {
      @Override
      public boolean a(bpn<S> $$0, bpp $$1, bpj $$2) {
         $$1.a(this.a, this.b);
         return true;
      }

      public bpi<T> c() {
         return this.a;
      }

      public T d() {
         return this.b;
      }
   }

   public static record c<S>(bpr<S> a) implements bpr<S> {
      @Override
      public boolean a(bpn<S> $$0, bpp $$1, bpj $$2) {
         int $$3 = $$0.c();
         if (!this.a.a($$0, $$1, $$2)) {
            $$0.a($$3);
         }

         return true;
      }

      public bpr<S> c() {
         return this.a;
      }
   }

   public static record d<S, T>(bpi<T> a) implements bpr<S> {
      @Override
      public boolean a(bpn<S> $$0, bpp $$1, bpj $$2) {
         Optional<T> $$3 = $$0.b(this.a);
         if ($$3.isEmpty()) {
            return false;
         } else {
            $$1.a(this.a, $$3.get());
            return true;
         }
      }

      public bpi<T> c() {
         return this.a;
      }
   }

   public static record e<S>(List<bpr<S>> a) implements bpr<S> {
      @Override
      public boolean a(bpn<S> $$0, bpp $$1, bpj $$2) {
         int $$3 = $$0.c();

         for (bpr<S> $$4 : this.a) {
            if (!$$4.a($$0, $$1, $$2)) {
               $$0.a($$3);
               return false;
            }
         }

         return true;
      }

      public List<bpr<S>> c() {
         return this.a;
      }
   }
}
