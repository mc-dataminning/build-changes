import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.mutable.MutableBoolean;

public interface bpy<S> {
   boolean a(bpu<S> var1, bpw var2, bpq var3);

   static <S> bpy<S> a(bpp<?> $$0) {
      return new bpy.d<>($$0);
   }

   static <S, T> bpy<S> a(bpp<T> $$0, T $$1) {
      return new bpy.b<>($$0, $$1);
   }

   @SafeVarargs
   static <S> bpy<S> a(bpy<S>... $$0) {
      return new bpy.e<>(List.of($$0));
   }

   @SafeVarargs
   static <S> bpy<S> b(bpy<S>... $$0) {
      return new bpy.a<>(List.of($$0));
   }

   static <S> bpy<S> a(bpy<S> $$0) {
      return new bpy.c<>($$0);
   }

   static <S> bpy<S> a() {
      return new bpy<S>() {
         @Override
         public boolean a(bpu<S> $$0, bpw $$1, bpq $$2) {
            $$2.cut();
            return true;
         }

         @Override
         public String toString() {
            return "↑";
         }
      };
   }

   static <S> bpy<S> b() {
      return new bpy<S>() {
         @Override
         public boolean a(bpu<S> $$0, bpw $$1, bpq $$2) {
            return true;
         }

         @Override
         public String toString() {
            return "ε";
         }
      };
   }

   public static record a<S>(List<bpy<S>> a) implements bpy<S> {
      @Override
      public boolean a(bpu<S> $$0, bpw $$1, bpq $$2) {
         MutableBoolean $$3 = new MutableBoolean();
         bpq $$4 = $$3::setTrue;
         int $$5 = $$0.c();

         for (bpy<S> $$6 : this.a) {
            if ($$3.isTrue()) {
               break;
            }

            bpw $$7 = new bpw();
            if ($$6.a($$0, $$7, $$4)) {
               $$1.a($$7);
               return true;
            }

            $$0.a($$5);
         }

         return false;
      }

      public List<bpy<S>> c() {
         return this.a;
      }
   }

   public static record b<S, T>(bpp<T> a, T b) implements bpy<S> {
      @Override
      public boolean a(bpu<S> $$0, bpw $$1, bpq $$2) {
         $$1.a(this.a, this.b);
         return true;
      }

      public bpp<T> c() {
         return this.a;
      }

      public T d() {
         return this.b;
      }
   }

   public static record c<S>(bpy<S> a) implements bpy<S> {
      @Override
      public boolean a(bpu<S> $$0, bpw $$1, bpq $$2) {
         int $$3 = $$0.c();
         if (!this.a.a($$0, $$1, $$2)) {
            $$0.a($$3);
         }

         return true;
      }

      public bpy<S> c() {
         return this.a;
      }
   }

   public static record d<S, T>(bpp<T> a) implements bpy<S> {
      @Override
      public boolean a(bpu<S> $$0, bpw $$1, bpq $$2) {
         Optional<T> $$3 = $$0.b(this.a);
         if ($$3.isEmpty()) {
            return false;
         } else {
            $$1.a(this.a, $$3.get());
            return true;
         }
      }

      public bpp<T> c() {
         return this.a;
      }
   }

   public static record e<S>(List<bpy<S>> a) implements bpy<S> {
      @Override
      public boolean a(bpu<S> $$0, bpw $$1, bpq $$2) {
         int $$3 = $$0.c();

         for (bpy<S> $$4 : this.a) {
            if (!$$4.a($$0, $$1, $$2)) {
               $$0.a($$3);
               return false;
            }
         }

         return true;
      }

      public List<bpy<S>> c() {
         return this.a;
      }
   }
}
