import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.mutable.MutableBoolean;

public interface blr<S> {
   boolean a(bln<S> var1, blp var2, blj var3);

   static <S> blr<S> a(bli<?> $$0) {
      return new blr.d<>($$0);
   }

   static <S, T> blr<S> a(bli<T> $$0, T $$1) {
      return new blr.b<>($$0, $$1);
   }

   @SafeVarargs
   static <S> blr<S> a(blr<S>... $$0) {
      return new blr.e<>(List.of($$0));
   }

   @SafeVarargs
   static <S> blr<S> b(blr<S>... $$0) {
      return new blr.a<>(List.of($$0));
   }

   static <S> blr<S> a(blr<S> $$0) {
      return new blr.c<>($$0);
   }

   static <S> blr<S> a() {
      return new blr<S>() {
         @Override
         public boolean a(bln<S> $$0, blp $$1, blj $$2) {
            $$2.cut();
            return true;
         }

         @Override
         public String toString() {
            return "↑";
         }
      };
   }

   static <S> blr<S> b() {
      return new blr<S>() {
         @Override
         public boolean a(bln<S> $$0, blp $$1, blj $$2) {
            return true;
         }

         @Override
         public String toString() {
            return "ε";
         }
      };
   }

   public static record a<S>(List<blr<S>> a) implements blr<S> {
      @Override
      public boolean a(bln<S> $$0, blp $$1, blj $$2) {
         MutableBoolean $$3 = new MutableBoolean();
         blj $$4 = $$3::setTrue;
         int $$5 = $$0.c();

         for (blr<S> $$6 : this.a) {
            if ($$3.isTrue()) {
               break;
            }

            blp $$7 = new blp();
            if ($$6.a($$0, $$7, $$4)) {
               $$1.a($$7);
               return true;
            }

            $$0.a($$5);
         }

         return false;
      }

      public List<blr<S>> c() {
         return this.a;
      }
   }

   public static record b<S, T>(bli<T> a, T b) implements blr<S> {
      @Override
      public boolean a(bln<S> $$0, blp $$1, blj $$2) {
         $$1.a(this.a, this.b);
         return true;
      }

      public bli<T> c() {
         return this.a;
      }

      public T d() {
         return this.b;
      }
   }

   public static record c<S>(blr<S> a) implements blr<S> {
      @Override
      public boolean a(bln<S> $$0, blp $$1, blj $$2) {
         int $$3 = $$0.c();
         if (!this.a.a($$0, $$1, $$2)) {
            $$0.a($$3);
         }

         return true;
      }

      public blr<S> c() {
         return this.a;
      }
   }

   public static record d<S, T>(bli<T> a) implements blr<S> {
      @Override
      public boolean a(bln<S> $$0, blp $$1, blj $$2) {
         Optional<T> $$3 = $$0.b(this.a);
         if ($$3.isEmpty()) {
            return false;
         } else {
            $$1.a(this.a, $$3.get());
            return true;
         }
      }

      public bli<T> c() {
         return this.a;
      }
   }

   public static record e<S>(List<blr<S>> a) implements blr<S> {
      @Override
      public boolean a(bln<S> $$0, blp $$1, blj $$2) {
         int $$3 = $$0.c();

         for (blr<S> $$4 : this.a) {
            if (!$$4.a($$0, $$1, $$2)) {
               $$0.a($$3);
               return false;
            }
         }

         return true;
      }

      public List<blr<S>> c() {
         return this.a;
      }
   }
}
