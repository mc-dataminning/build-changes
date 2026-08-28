import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.mutable.MutableBoolean;

public interface bob<S> {
   boolean a(bnx<S> var1, bnz var2, bnt var3);

   static <S> bob<S> a(bns<?> $$0) {
      return new bob.d<>($$0);
   }

   static <S, T> bob<S> a(bns<T> $$0, T $$1) {
      return new bob.b<>($$0, $$1);
   }

   @SafeVarargs
   static <S> bob<S> a(bob<S>... $$0) {
      return new bob.e<>(List.of($$0));
   }

   @SafeVarargs
   static <S> bob<S> b(bob<S>... $$0) {
      return new bob.a<>(List.of($$0));
   }

   static <S> bob<S> a(bob<S> $$0) {
      return new bob.c<>($$0);
   }

   static <S> bob<S> a() {
      return new bob<S>() {
         @Override
         public boolean a(bnx<S> $$0, bnz $$1, bnt $$2) {
            $$2.cut();
            return true;
         }

         @Override
         public String toString() {
            return "↑";
         }
      };
   }

   static <S> bob<S> b() {
      return new bob<S>() {
         @Override
         public boolean a(bnx<S> $$0, bnz $$1, bnt $$2) {
            return true;
         }

         @Override
         public String toString() {
            return "ε";
         }
      };
   }

   public static record a<S>(List<bob<S>> a) implements bob<S> {
      @Override
      public boolean a(bnx<S> $$0, bnz $$1, bnt $$2) {
         MutableBoolean $$3 = new MutableBoolean();
         bnt $$4 = $$3::setTrue;
         int $$5 = $$0.c();

         for (bob<S> $$6 : this.a) {
            if ($$3.isTrue()) {
               break;
            }

            bnz $$7 = new bnz();
            if ($$6.a($$0, $$7, $$4)) {
               $$1.a($$7);
               return true;
            }

            $$0.a($$5);
         }

         return false;
      }

      public List<bob<S>> c() {
         return this.a;
      }
   }

   public static record b<S, T>(bns<T> a, T b) implements bob<S> {
      @Override
      public boolean a(bnx<S> $$0, bnz $$1, bnt $$2) {
         $$1.a(this.a, this.b);
         return true;
      }

      public bns<T> c() {
         return this.a;
      }

      public T d() {
         return this.b;
      }
   }

   public static record c<S>(bob<S> a) implements bob<S> {
      @Override
      public boolean a(bnx<S> $$0, bnz $$1, bnt $$2) {
         int $$3 = $$0.c();
         if (!this.a.a($$0, $$1, $$2)) {
            $$0.a($$3);
         }

         return true;
      }

      public bob<S> c() {
         return this.a;
      }
   }

   public static record d<S, T>(bns<T> a) implements bob<S> {
      @Override
      public boolean a(bnx<S> $$0, bnz $$1, bnt $$2) {
         Optional<T> $$3 = $$0.b(this.a);
         if ($$3.isEmpty()) {
            return false;
         } else {
            $$1.a(this.a, $$3.get());
            return true;
         }
      }

      public bns<T> c() {
         return this.a;
      }
   }

   public static record e<S>(List<bob<S>> a) implements bob<S> {
      @Override
      public boolean a(bnx<S> $$0, bnz $$1, bnt $$2) {
         int $$3 = $$0.c();

         for (bob<S> $$4 : this.a) {
            if (!$$4.a($$0, $$1, $$2)) {
               $$0.a($$3);
               return false;
            }
         }

         return true;
      }

      public List<bob<S>> c() {
         return this.a;
      }
   }
}
