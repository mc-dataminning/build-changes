import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.mutable.MutableBoolean;

public interface bpb<S> {
   boolean a(box<S> var1, boz var2, bot var3);

   static <S> bpb<S> a(bos<?> $$0) {
      return new bpb.d<>($$0);
   }

   static <S, T> bpb<S> a(bos<T> $$0, T $$1) {
      return new bpb.b<>($$0, $$1);
   }

   @SafeVarargs
   static <S> bpb<S> a(bpb<S>... $$0) {
      return new bpb.e<>(List.of($$0));
   }

   @SafeVarargs
   static <S> bpb<S> b(bpb<S>... $$0) {
      return new bpb.a<>(List.of($$0));
   }

   static <S> bpb<S> a(bpb<S> $$0) {
      return new bpb.c<>($$0);
   }

   static <S> bpb<S> a() {
      return new bpb<S>() {
         @Override
         public boolean a(box<S> $$0, boz $$1, bot $$2) {
            $$2.cut();
            return true;
         }

         @Override
         public String toString() {
            return "↑";
         }
      };
   }

   static <S> bpb<S> b() {
      return new bpb<S>() {
         @Override
         public boolean a(box<S> $$0, boz $$1, bot $$2) {
            return true;
         }

         @Override
         public String toString() {
            return "ε";
         }
      };
   }

   public static record a<S>(List<bpb<S>> a) implements bpb<S> {
      @Override
      public boolean a(box<S> $$0, boz $$1, bot $$2) {
         MutableBoolean $$3 = new MutableBoolean();
         bot $$4 = $$3::setTrue;
         int $$5 = $$0.c();

         for (bpb<S> $$6 : this.a) {
            if ($$3.isTrue()) {
               break;
            }

            boz $$7 = new boz();
            if ($$6.a($$0, $$7, $$4)) {
               $$1.a($$7);
               return true;
            }

            $$0.a($$5);
         }

         return false;
      }

      public List<bpb<S>> c() {
         return this.a;
      }
   }

   public static record b<S, T>(bos<T> a, T b) implements bpb<S> {
      @Override
      public boolean a(box<S> $$0, boz $$1, bot $$2) {
         $$1.a(this.a, this.b);
         return true;
      }

      public bos<T> c() {
         return this.a;
      }

      public T d() {
         return this.b;
      }
   }

   public static record c<S>(bpb<S> a) implements bpb<S> {
      @Override
      public boolean a(box<S> $$0, boz $$1, bot $$2) {
         int $$3 = $$0.c();
         if (!this.a.a($$0, $$1, $$2)) {
            $$0.a($$3);
         }

         return true;
      }

      public bpb<S> c() {
         return this.a;
      }
   }

   public static record d<S, T>(bos<T> a) implements bpb<S> {
      @Override
      public boolean a(box<S> $$0, boz $$1, bot $$2) {
         Optional<T> $$3 = $$0.b(this.a);
         if ($$3.isEmpty()) {
            return false;
         } else {
            $$1.a(this.a, $$3.get());
            return true;
         }
      }

      public bos<T> c() {
         return this.a;
      }
   }

   public static record e<S>(List<bpb<S>> a) implements bpb<S> {
      @Override
      public boolean a(box<S> $$0, boz $$1, bot $$2) {
         int $$3 = $$0.c();

         for (bpb<S> $$4 : this.a) {
            if (!$$4.a($$0, $$1, $$2)) {
               $$0.a($$3);
               return false;
            }
         }

         return true;
      }

      public List<bpb<S>> c() {
         return this.a;
      }
   }
}
