import java.util.ArrayList;
import java.util.List;

public interface bqd<S> {
   boolean a(bpz<S> var1, bqb var2, bpt var3);

   static <S, T> bqd<S> a(bpr<T> $$0, T $$1) {
      return new bqd.c<>($$0, $$1);
   }

   @SafeVarargs
   static <S> bqd<S> a(bqd<S>... $$0) {
      return new bqd.g<>($$0);
   }

   @SafeVarargs
   static <S> bqd<S> b(bqd<S>... $$0) {
      return new bqd.a<>($$0);
   }

   static <S> bqd<S> a(bqd<S> $$0) {
      return new bqd.d<>($$0);
   }

   static <S, T> bqd<S> a(bpy<S, T> $$0, bpr<List<T>> $$1) {
      return a($$0, $$1, 0);
   }

   static <S, T> bqd<S> a(bpy<S, T> $$0, bpr<List<T>> $$1, int $$2) {
      return new bqd.e<>($$0, $$1, $$2);
   }

   static <S, T> bqd<S> a(bpy<S, T> $$0, bpr<List<T>> $$1, bqd<S> $$2) {
      return a($$0, $$1, $$2, 0);
   }

   static <S, T> bqd<S> a(bpy<S, T> $$0, bpr<List<T>> $$1, bqd<S> $$2, int $$3) {
      return new bqd.f<>($$0, $$1, $$2, $$3, true);
   }

   static <S, T> bqd<S> b(bpy<S, T> $$0, bpr<List<T>> $$1, bqd<S> $$2) {
      return b($$0, $$1, $$2, 0);
   }

   static <S, T> bqd<S> b(bpy<S, T> $$0, bpr<List<T>> $$1, bqd<S> $$2, int $$3) {
      return new bqd.f<>($$0, $$1, $$2, $$3, false);
   }

   static <S> bqd<S> b(bqd<S> $$0) {
      return new bqd.b<>($$0, true);
   }

   static <S> bqd<S> c(bqd<S> $$0) {
      return new bqd.b<>($$0, false);
   }

   static <S> bqd<S> c() {
      return new bqd<S>() {
         @Override
         public boolean a(bpz<S> $$0, bqb $$1, bpt $$2) {
            $$2.a();
            return true;
         }

         @Override
         public String toString() {
            return "↑";
         }
      };
   }

   static <S> bqd<S> d() {
      return new bqd<S>() {
         @Override
         public boolean a(bpz<S> $$0, bqb $$1, bpt $$2) {
            return true;
         }

         @Override
         public String toString() {
            return "ε";
         }
      };
   }

   static <S> bqd<S> a(final Object $$0) {
      return new bqd<S>() {
         @Override
         public boolean a(bpz<S> $$0x, bqb $$1, bpt $$2) {
            $$0.b().a($$0.g(), $$0);
            return false;
         }

         @Override
         public String toString() {
            return "fail";
         }
      };
   }

   public static record a<S>(bqd<S>[] a) implements bqd<S> {
      @Override
      public boolean a(bpz<S> $$0, bqb $$1, bpt $$2) {
         bpt $$3 = $$0.c();

         try {
            int $$4 = $$0.g();
            $$1.c();

            for (bqd<S> $$5 : this.a) {
               if ($$5.a($$0, $$1, $$3)) {
                  $$1.e();
                  return true;
               }

               $$1.d();
               $$0.a($$4);
               if ($$3.b()) {
                  break;
               }
            }

            $$1.b();
            return false;
         } finally {
            $$0.d();
         }
      }
   }

   public static record b<S>(bqd<S> a, boolean b) implements bqd<S> {
      @Override
      public boolean a(bpz<S> $$0, bqb $$1, bpt $$2) {
         int $$3 = $$0.g();
         boolean $$4 = this.a.a($$0.e(), $$1, $$2);
         $$0.a($$3);
         return this.b == $$4;
      }
   }

   public static record c<S, T>(bpr<T> a, T b) implements bqd<S> {
      @Override
      public boolean a(bpz<S> $$0, bqb $$1, bpt $$2) {
         $$1.a(this.a, this.b);
         return true;
      }
   }

   public static record d<S>(bqd<S> a) implements bqd<S> {
      @Override
      public boolean a(bpz<S> $$0, bqb $$1, bpt $$2) {
         int $$3 = $$0.g();
         if (!this.a.a($$0, $$1, $$2)) {
            $$0.a($$3);
         }

         return true;
      }
   }

   public static record e<S, T>(bpy<S, T> a, bpr<List<T>> b, int c) implements bqd<S> {
      @Override
      public boolean a(bpz<S> $$0, bqb $$1, bpt $$2) {
         int $$3 = $$0.g();
         List<T> $$4 = new ArrayList<>(this.c);

         while (true) {
            int $$5 = $$0.g();
            T $$6 = $$0.a(this.a);
            if ($$6 == null) {
               $$0.a($$5);
               if ($$4.size() < this.c) {
                  $$0.a($$3);
                  return false;
               } else {
                  $$1.a(this.b, $$4);
                  return true;
               }
            }

            $$4.add($$6);
         }
      }

      public int e() {
         return this.c;
      }
   }

   public static record f<S, T>(bpy<S, T> a, bpr<List<T>> b, bqd<S> c, int d, boolean e) implements bqd<S> {
      @Override
      public boolean a(bpz<S> $$0, bqb $$1, bpt $$2) {
         int $$3 = $$0.g();
         List<T> $$4 = new ArrayList<>(this.d);
         boolean $$5 = true;

         while (true) {
            int $$6 = $$0.g();
            if (!$$5 && !this.c.a($$0, $$1, $$2)) {
               $$0.a($$6);
               break;
            }

            int $$7 = $$0.g();
            T $$8 = $$0.a(this.a);
            if ($$8 == null) {
               if ($$5) {
                  $$0.a($$7);
               } else {
                  if (!this.e) {
                     $$0.a($$3);
                     return false;
                  }

                  $$0.a($$7);
               }
               break;
            }

            $$4.add($$8);
            $$5 = false;
         }

         if ($$4.size() < this.d) {
            $$0.a($$3);
            return false;
         } else {
            $$1.a(this.b, $$4);
            return true;
         }
      }

      public bqd<S> e() {
         return this.c;
      }

      public int f() {
         return this.d;
      }

      public boolean g() {
         return this.e;
      }
   }

   public static record g<S>(bqd<S>[] a) implements bqd<S> {
      @Override
      public boolean a(bpz<S> $$0, bqb $$1, bpt $$2) {
         int $$3 = $$0.g();

         for (bqd<S> $$4 : this.a) {
            if (!$$4.a($$0, $$1, $$2)) {
               $$0.a($$3);
               return false;
            }
         }

         return true;
      }
   }
}
