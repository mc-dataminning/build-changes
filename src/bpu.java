import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.mutable.MutableBoolean;

public interface bpu<S> {
   boolean a(bpq<S> var1, bps var2, bpm var3);

   static <S> bpu<S> a(bpl<?> $$0) {
      return new bpu.d<>($$0);
   }

   static <S, T> bpu<S> a(bpl<T> $$0, T $$1) {
      return new bpu.b<>($$0, $$1);
   }

   @SafeVarargs
   static <S> bpu<S> a(bpu<S>... $$0) {
      return new bpu.e<>(List.of($$0));
   }

   @SafeVarargs
   static <S> bpu<S> b(bpu<S>... $$0) {
      return new bpu.a<>(List.of($$0));
   }

   static <S> bpu<S> a(bpu<S> $$0) {
      return new bpu.c<>($$0);
   }

   static <S> bpu<S> a() {
      return new bpu<S>() {
         @Override
         public boolean a(bpq<S> $$0, bps $$1, bpm $$2) {
            $$2.cut();
            return true;
         }

         @Override
         public String toString() {
            return "↑";
         }
      };
   }

   static <S> bpu<S> b() {
      return new bpu<S>() {
         @Override
         public boolean a(bpq<S> $$0, bps $$1, bpm $$2) {
            return true;
         }

         @Override
         public String toString() {
            return "ε";
         }
      };
   }

   public static record a<S>(List<bpu<S>> a) implements bpu<S> {
      @Override
      public boolean a(bpq<S> $$0, bps $$1, bpm $$2) {
         MutableBoolean $$3 = new MutableBoolean();
         bpm $$4 = $$3::setTrue;
         int $$5 = $$0.c();

         for (bpu<S> $$6 : this.a) {
            if ($$3.isTrue()) {
               break;
            }

            bps $$7 = new bps();
            if ($$6.a($$0, $$7, $$4)) {
               $$1.a($$7);
               return true;
            }

            $$0.a($$5);
         }

         return false;
      }

      public List<bpu<S>> c() {
         return this.a;
      }
   }

   public static record b<S, T>(bpl<T> a, T b) implements bpu<S> {
      @Override
      public boolean a(bpq<S> $$0, bps $$1, bpm $$2) {
         $$1.a(this.a, this.b);
         return true;
      }

      public bpl<T> c() {
         return this.a;
      }

      public T d() {
         return this.b;
      }
   }

   public static record c<S>(bpu<S> a) implements bpu<S> {
      @Override
      public boolean a(bpq<S> $$0, bps $$1, bpm $$2) {
         int $$3 = $$0.c();
         if (!this.a.a($$0, $$1, $$2)) {
            $$0.a($$3);
         }

         return true;
      }

      public bpu<S> c() {
         return this.a;
      }
   }

   public static record d<S, T>(bpl<T> a) implements bpu<S> {
      @Override
      public boolean a(bpq<S> $$0, bps $$1, bpm $$2) {
         Optional<T> $$3 = $$0.b(this.a);
         if ($$3.isEmpty()) {
            return false;
         } else {
            $$1.a(this.a, $$3.get());
            return true;
         }
      }

      public bpl<T> c() {
         return this.a;
      }
   }

   public static record e<S>(List<bpu<S>> a) implements bpu<S> {
      @Override
      public boolean a(bpq<S> $$0, bps $$1, bpm $$2) {
         int $$3 = $$0.c();

         for (bpu<S> $$4 : this.a) {
            if (!$$4.a($$0, $$1, $$2)) {
               $$0.a($$3);
               return false;
            }
         }

         return true;
      }

      public List<bpu<S>> c() {
         return this.a;
      }
   }
}
