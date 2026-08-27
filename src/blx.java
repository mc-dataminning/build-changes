import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.mutable.MutableBoolean;

public interface blx<S> {
   boolean a(blt<S> var1, blv var2, blp var3);

   static <S> blx<S> a(blo<?> $$0) {
      return new blx.d<>($$0);
   }

   static <S, T> blx<S> a(blo<T> $$0, T $$1) {
      return new blx.b<>($$0, $$1);
   }

   @SafeVarargs
   static <S> blx<S> a(blx<S>... $$0) {
      return new blx.e<>(List.of($$0));
   }

   @SafeVarargs
   static <S> blx<S> b(blx<S>... $$0) {
      return new blx.a<>(List.of($$0));
   }

   static <S> blx<S> a(blx<S> $$0) {
      return new blx.c<>($$0);
   }

   static <S> blx<S> a() {
      return new blx<S>() {
         @Override
         public boolean a(blt<S> $$0, blv $$1, blp $$2) {
            $$2.cut();
            return true;
         }

         @Override
         public String toString() {
            return "↑";
         }
      };
   }

   static <S> blx<S> b() {
      return new blx<S>() {
         @Override
         public boolean a(blt<S> $$0, blv $$1, blp $$2) {
            return true;
         }

         @Override
         public String toString() {
            return "ε";
         }
      };
   }

   public static record a<S>(List<blx<S>> a) implements blx<S> {
      @Override
      public boolean a(blt<S> $$0, blv $$1, blp $$2) {
         MutableBoolean $$3 = new MutableBoolean();
         blp $$4 = $$3::setTrue;
         int $$5 = $$0.c();

         for (blx<S> $$6 : this.a) {
            if ($$3.isTrue()) {
               break;
            }

            blv $$7 = new blv();
            if ($$6.a($$0, $$7, $$4)) {
               $$1.a($$7);
               return true;
            }

            $$0.a($$5);
         }

         return false;
      }

      public List<blx<S>> c() {
         return this.a;
      }
   }

   public static record b<S, T>(blo<T> a, T b) implements blx<S> {
      @Override
      public boolean a(blt<S> $$0, blv $$1, blp $$2) {
         $$1.a(this.a, this.b);
         return true;
      }

      public blo<T> c() {
         return this.a;
      }

      public T d() {
         return this.b;
      }
   }

   public static record c<S>(blx<S> a) implements blx<S> {
      @Override
      public boolean a(blt<S> $$0, blv $$1, blp $$2) {
         int $$3 = $$0.c();
         if (!this.a.a($$0, $$1, $$2)) {
            $$0.a($$3);
         }

         return true;
      }

      public blx<S> c() {
         return this.a;
      }
   }

   public static record d<S, T>(blo<T> a) implements blx<S> {
      @Override
      public boolean a(blt<S> $$0, blv $$1, blp $$2) {
         Optional<T> $$3 = $$0.b(this.a);
         if ($$3.isEmpty()) {
            return false;
         } else {
            $$1.a(this.a, $$3.get());
            return true;
         }
      }

      public blo<T> c() {
         return this.a;
      }
   }

   public static record e<S>(List<blx<S>> a) implements blx<S> {
      @Override
      public boolean a(blt<S> $$0, blv $$1, blp $$2) {
         int $$3 = $$0.c();

         for (blx<S> $$4 : this.a) {
            if (!$$4.a($$0, $$1, $$2)) {
               $$0.a($$3);
               return false;
            }
         }

         return true;
      }

      public List<blx<S>> c() {
         return this.a;
      }
   }
}
