import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.mutable.MutableBoolean;

public interface blt<S> {
   boolean a(blp<S> var1, blr var2, bll var3);

   static <S> blt<S> a(blk<?> $$0) {
      return new blt.d<>($$0);
   }

   static <S, T> blt<S> a(blk<T> $$0, T $$1) {
      return new blt.b<>($$0, $$1);
   }

   @SafeVarargs
   static <S> blt<S> a(blt<S>... $$0) {
      return new blt.e<>(List.of($$0));
   }

   @SafeVarargs
   static <S> blt<S> b(blt<S>... $$0) {
      return new blt.a<>(List.of($$0));
   }

   static <S> blt<S> a(blt<S> $$0) {
      return new blt.c<>($$0);
   }

   static <S> blt<S> a() {
      return new blt<S>() {
         @Override
         public boolean a(blp<S> $$0, blr $$1, bll $$2) {
            $$2.cut();
            return true;
         }

         @Override
         public String toString() {
            return "↑";
         }
      };
   }

   static <S> blt<S> b() {
      return new blt<S>() {
         @Override
         public boolean a(blp<S> $$0, blr $$1, bll $$2) {
            return true;
         }

         @Override
         public String toString() {
            return "ε";
         }
      };
   }

   public static record a<S>(List<blt<S>> a) implements blt<S> {
      @Override
      public boolean a(blp<S> $$0, blr $$1, bll $$2) {
         MutableBoolean $$3 = new MutableBoolean();
         bll $$4 = $$3::setTrue;
         int $$5 = $$0.c();

         for (blt<S> $$6 : this.a) {
            if ($$3.isTrue()) {
               break;
            }

            blr $$7 = new blr();
            if ($$6.a($$0, $$7, $$4)) {
               $$1.a($$7);
               return true;
            }

            $$0.a($$5);
         }

         return false;
      }

      public List<blt<S>> c() {
         return this.a;
      }
   }

   public static record b<S, T>(blk<T> a, T b) implements blt<S> {
      @Override
      public boolean a(blp<S> $$0, blr $$1, bll $$2) {
         $$1.a(this.a, this.b);
         return true;
      }

      public blk<T> c() {
         return this.a;
      }

      public T d() {
         return this.b;
      }
   }

   public static record c<S>(blt<S> a) implements blt<S> {
      @Override
      public boolean a(blp<S> $$0, blr $$1, bll $$2) {
         int $$3 = $$0.c();
         if (!this.a.a($$0, $$1, $$2)) {
            $$0.a($$3);
         }

         return true;
      }

      public blt<S> c() {
         return this.a;
      }
   }

   public static record d<S, T>(blk<T> a) implements blt<S> {
      @Override
      public boolean a(blp<S> $$0, blr $$1, bll $$2) {
         Optional<T> $$3 = $$0.b(this.a);
         if ($$3.isEmpty()) {
            return false;
         } else {
            $$1.a(this.a, $$3.get());
            return true;
         }
      }

      public blk<T> c() {
         return this.a;
      }
   }

   public static record e<S>(List<blt<S>> a) implements blt<S> {
      @Override
      public boolean a(blp<S> $$0, blr $$1, bll $$2) {
         int $$3 = $$0.c();

         for (blt<S> $$4 : this.a) {
            if (!$$4.a($$0, $$1, $$2)) {
               $$0.a($$3);
               return false;
            }
         }

         return true;
      }

      public List<blt<S>> c() {
         return this.a;
      }
   }
}
