import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.mutable.MutableBoolean;

public interface bpj<S> {
   boolean a(bpf<S> var1, bph var2, bpb var3);

   static <S> bpj<S> a(bpa<?> $$0) {
      return new bpj.d<>($$0);
   }

   static <S, T> bpj<S> a(bpa<T> $$0, T $$1) {
      return new bpj.b<>($$0, $$1);
   }

   @SafeVarargs
   static <S> bpj<S> a(bpj<S>... $$0) {
      return new bpj.e<>(List.of($$0));
   }

   @SafeVarargs
   static <S> bpj<S> b(bpj<S>... $$0) {
      return new bpj.a<>(List.of($$0));
   }

   static <S> bpj<S> a(bpj<S> $$0) {
      return new bpj.c<>($$0);
   }

   static <S> bpj<S> a() {
      return new bpj<S>() {
         @Override
         public boolean a(bpf<S> $$0, bph $$1, bpb $$2) {
            $$2.cut();
            return true;
         }

         @Override
         public String toString() {
            return "↑";
         }
      };
   }

   static <S> bpj<S> b() {
      return new bpj<S>() {
         @Override
         public boolean a(bpf<S> $$0, bph $$1, bpb $$2) {
            return true;
         }

         @Override
         public String toString() {
            return "ε";
         }
      };
   }

   public static record a<S>(List<bpj<S>> a) implements bpj<S> {
      @Override
      public boolean a(bpf<S> $$0, bph $$1, bpb $$2) {
         MutableBoolean $$3 = new MutableBoolean();
         bpb $$4 = $$3::setTrue;
         int $$5 = $$0.c();

         for (bpj<S> $$6 : this.a) {
            if ($$3.isTrue()) {
               break;
            }

            bph $$7 = new bph();
            if ($$6.a($$0, $$7, $$4)) {
               $$1.a($$7);
               return true;
            }

            $$0.a($$5);
         }

         return false;
      }

      public List<bpj<S>> c() {
         return this.a;
      }
   }

   public static record b<S, T>(bpa<T> a, T b) implements bpj<S> {
      @Override
      public boolean a(bpf<S> $$0, bph $$1, bpb $$2) {
         $$1.a(this.a, this.b);
         return true;
      }

      public bpa<T> c() {
         return this.a;
      }

      public T d() {
         return this.b;
      }
   }

   public static record c<S>(bpj<S> a) implements bpj<S> {
      @Override
      public boolean a(bpf<S> $$0, bph $$1, bpb $$2) {
         int $$3 = $$0.c();
         if (!this.a.a($$0, $$1, $$2)) {
            $$0.a($$3);
         }

         return true;
      }

      public bpj<S> c() {
         return this.a;
      }
   }

   public static record d<S, T>(bpa<T> a) implements bpj<S> {
      @Override
      public boolean a(bpf<S> $$0, bph $$1, bpb $$2) {
         Optional<T> $$3 = $$0.b(this.a);
         if ($$3.isEmpty()) {
            return false;
         } else {
            $$1.a(this.a, $$3.get());
            return true;
         }
      }

      public bpa<T> c() {
         return this.a;
      }
   }

   public static record e<S>(List<bpj<S>> a) implements bpj<S> {
      @Override
      public boolean a(bpf<S> $$0, bph $$1, bpb $$2) {
         int $$3 = $$0.c();

         for (bpj<S> $$4 : this.a) {
            if (!$$4.a($$0, $$1, $$2)) {
               $$0.a($$3);
               return false;
            }
         }

         return true;
      }

      public List<bpj<S>> c() {
         return this.a;
      }
   }
}
