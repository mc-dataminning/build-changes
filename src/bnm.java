import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.mutable.MutableBoolean;

public interface bnm<S> {
   boolean a(bni<S> var1, bnk var2, bne var3);

   static <S> bnm<S> a(bnd<?> $$0) {
      return new bnm.d<>($$0);
   }

   static <S, T> bnm<S> a(bnd<T> $$0, T $$1) {
      return new bnm.b<>($$0, $$1);
   }

   @SafeVarargs
   static <S> bnm<S> a(bnm<S>... $$0) {
      return new bnm.e<>(List.of($$0));
   }

   @SafeVarargs
   static <S> bnm<S> b(bnm<S>... $$0) {
      return new bnm.a<>(List.of($$0));
   }

   static <S> bnm<S> a(bnm<S> $$0) {
      return new bnm.c<>($$0);
   }

   static <S> bnm<S> a() {
      return new bnm<S>() {
         @Override
         public boolean a(bni<S> $$0, bnk $$1, bne $$2) {
            $$2.cut();
            return true;
         }

         @Override
         public String toString() {
            return "↑";
         }
      };
   }

   static <S> bnm<S> b() {
      return new bnm<S>() {
         @Override
         public boolean a(bni<S> $$0, bnk $$1, bne $$2) {
            return true;
         }

         @Override
         public String toString() {
            return "ε";
         }
      };
   }

   public static record a<S>(List<bnm<S>> a) implements bnm<S> {
      @Override
      public boolean a(bni<S> $$0, bnk $$1, bne $$2) {
         MutableBoolean $$3 = new MutableBoolean();
         bne $$4 = $$3::setTrue;
         int $$5 = $$0.c();

         for (bnm<S> $$6 : this.a) {
            if ($$3.isTrue()) {
               break;
            }

            bnk $$7 = new bnk();
            if ($$6.a($$0, $$7, $$4)) {
               $$1.a($$7);
               return true;
            }

            $$0.a($$5);
         }

         return false;
      }

      public List<bnm<S>> c() {
         return this.a;
      }
   }

   public static record b<S, T>(bnd<T> a, T b) implements bnm<S> {
      @Override
      public boolean a(bni<S> $$0, bnk $$1, bne $$2) {
         $$1.a(this.a, this.b);
         return true;
      }

      public bnd<T> c() {
         return this.a;
      }

      public T d() {
         return this.b;
      }
   }

   public static record c<S>(bnm<S> a) implements bnm<S> {
      @Override
      public boolean a(bni<S> $$0, bnk $$1, bne $$2) {
         int $$3 = $$0.c();
         if (!this.a.a($$0, $$1, $$2)) {
            $$0.a($$3);
         }

         return true;
      }

      public bnm<S> c() {
         return this.a;
      }
   }

   public static record d<S, T>(bnd<T> a) implements bnm<S> {
      @Override
      public boolean a(bni<S> $$0, bnk $$1, bne $$2) {
         Optional<T> $$3 = $$0.b(this.a);
         if ($$3.isEmpty()) {
            return false;
         } else {
            $$1.a(this.a, $$3.get());
            return true;
         }
      }

      public bnd<T> c() {
         return this.a;
      }
   }

   public static record e<S>(List<bnm<S>> a) implements bnm<S> {
      @Override
      public boolean a(bni<S> $$0, bnk $$1, bne $$2) {
         int $$3 = $$0.c();

         for (bnm<S> $$4 : this.a) {
            if (!$$4.a($$0, $$1, $$2)) {
               $$0.a($$3);
               return false;
            }
         }

         return true;
      }

      public List<bnm<S>> c() {
         return this.a;
      }
   }
}
