import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.mutable.MutableBoolean;

public interface blj<S> {
   boolean a(blf<S> var1, blh var2, blb var3);

   static <S> blj<S> a(bla<?> $$0) {
      return new blj.d<>($$0);
   }

   static <S, T> blj<S> a(bla<T> $$0, T $$1) {
      return new blj.b<>($$0, $$1);
   }

   @SafeVarargs
   static <S> blj<S> a(blj<S>... $$0) {
      return new blj.e<>(List.of($$0));
   }

   @SafeVarargs
   static <S> blj<S> b(blj<S>... $$0) {
      return new blj.a<>(List.of($$0));
   }

   static <S> blj<S> a(blj<S> $$0) {
      return new blj.c<>($$0);
   }

   static <S> blj<S> a() {
      return new blj<S>() {
         @Override
         public boolean a(blf<S> $$0, blh $$1, blb $$2) {
            $$2.cut();
            return true;
         }

         @Override
         public String toString() {
            return "↑";
         }
      };
   }

   static <S> blj<S> b() {
      return new blj<S>() {
         @Override
         public boolean a(blf<S> $$0, blh $$1, blb $$2) {
            return true;
         }

         @Override
         public String toString() {
            return "ε";
         }
      };
   }

   public static record a<S>(List<blj<S>> a) implements blj<S> {
      @Override
      public boolean a(blf<S> $$0, blh $$1, blb $$2) {
         MutableBoolean $$3 = new MutableBoolean();
         blb $$4 = $$3::setTrue;
         int $$5 = $$0.c();

         for (blj<S> $$6 : this.a) {
            if ($$3.isTrue()) {
               break;
            }

            blh $$7 = new blh();
            if ($$6.a($$0, $$7, $$4)) {
               $$1.a($$7);
               return true;
            }

            $$0.a($$5);
         }

         return false;
      }

      public List<blj<S>> c() {
         return this.a;
      }
   }

   public static record b<S, T>(bla<T> a, T b) implements blj<S> {
      @Override
      public boolean a(blf<S> $$0, blh $$1, blb $$2) {
         $$1.a(this.a, this.b);
         return true;
      }

      public bla<T> c() {
         return this.a;
      }

      public T d() {
         return this.b;
      }
   }

   public static record c<S>(blj<S> a) implements blj<S> {
      @Override
      public boolean a(blf<S> $$0, blh $$1, blb $$2) {
         int $$3 = $$0.c();
         if (!this.a.a($$0, $$1, $$2)) {
            $$0.a($$3);
         }

         return true;
      }

      public blj<S> c() {
         return this.a;
      }
   }

   public static record d<S, T>(bla<T> a) implements blj<S> {
      @Override
      public boolean a(blf<S> $$0, blh $$1, blb $$2) {
         Optional<T> $$3 = $$0.b(this.a);
         if ($$3.isEmpty()) {
            return false;
         } else {
            $$1.a(this.a, $$3.get());
            return true;
         }
      }

      public bla<T> c() {
         return this.a;
      }
   }

   public static record e<S>(List<blj<S>> a) implements blj<S> {
      @Override
      public boolean a(blf<S> $$0, blh $$1, blb $$2) {
         int $$3 = $$0.c();

         for (blj<S> $$4 : this.a) {
            if (!$$4.a($$0, $$1, $$2)) {
               $$0.a($$3);
               return false;
            }
         }

         return true;
      }

      public List<blj<S>> c() {
         return this.a;
      }
   }
}
