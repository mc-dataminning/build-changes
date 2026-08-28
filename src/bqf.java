import java.util.ArrayList;
import java.util.List;

public interface bqf<S> {
   boolean a(bqb<S> var1, bqd var2, bpv var3);

   static <S, T> bqf<S> a(bpt<T> $$0, T $$1) {
      return new bqf.c<>($$0, $$1);
   }

   @SafeVarargs
   static <S> bqf<S> a(bqf<S>... $$0) {
      return new bqf.g<>($$0);
   }

   @SafeVarargs
   static <S> bqf<S> b(bqf<S>... $$0) {
      return new bqf.a<>($$0);
   }

   static <S> bqf<S> a(bqf<S> $$0) {
      return new bqf.d<>($$0);
   }

   static <S, T> bqf<S> a(bqa<S, T> $$0, bpt<List<T>> $$1) {
      return a($$0, $$1, 0);
   }

   static <S, T> bqf<S> a(bqa<S, T> $$0, bpt<List<T>> $$1, int $$2) {
      return new bqf.e<>($$0, $$1, $$2);
   }

   static <S, T> bqf<S> a(bqa<S, T> $$0, bpt<List<T>> $$1, bqf<S> $$2) {
      return a($$0, $$1, $$2, 0);
   }

   static <S, T> bqf<S> a(bqa<S, T> $$0, bpt<List<T>> $$1, bqf<S> $$2, int $$3) {
      return new bqf.f<>($$0, $$1, $$2, $$3, true);
   }

   static <S, T> bqf<S> b(bqa<S, T> $$0, bpt<List<T>> $$1, bqf<S> $$2) {
      return b($$0, $$1, $$2, 0);
   }

   static <S, T> bqf<S> b(bqa<S, T> $$0, bpt<List<T>> $$1, bqf<S> $$2, int $$3) {
      return new bqf.f<>($$0, $$1, $$2, $$3, false);
   }

   static <S> bqf<S> b(bqf<S> $$0) {
      return new bqf.b<>($$0, true);
   }

   static <S> bqf<S> c(bqf<S> $$0) {
      return new bqf.b<>($$0, false);
   }

   static <S> bqf<S> c() {
      return new bqf<S>() {
         @Override
         public boolean a(bqb<S> $$0, bqd $$1, bpv $$2) {
            $$2.a();
            return true;
         }

         @Override
         public String toString() {
            return "↑";
         }
      };
   }

   static <S> bqf<S> d() {
      return new bqf<S>() {
         @Override
         public boolean a(bqb<S> $$0, bqd $$1, bpv $$2) {
            return true;
         }

         @Override
         public String toString() {
            return "ε";
         }
      };
   }

   static <S> bqf<S> a(final Object $$0) {
      return new bqf<S>() {
         @Override
         public boolean a(bqb<S> $$0x, bqd $$1, bpv $$2) {
            $$0.b().a($$0.g(), $$0);
            return false;
         }

         @Override
         public String toString() {
            return "fail";
         }
      };
   }

   public static record a<S>(bqf<S>[] a) implements bqf<S> {
      @Override
      public boolean a(bqb<S> $$0, bqd $$1, bpv $$2) {
         bpv $$3 = $$0.c();

         try {
            int $$4 = $$0.g();
            $$1.c();

            for (bqf<S> $$5 : this.a) {
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

   public static record b<S>(bqf<S> a, boolean b) implements bqf<S> {
      @Override
      public boolean a(bqb<S> $$0, bqd $$1, bpv $$2) {
         int $$3 = $$0.g();
         boolean $$4 = this.a.a($$0.e(), $$1, $$2);
         $$0.a($$3);
         return this.b == $$4;
      }
   }

   public static record c<S, T>(bpt<T> a, T b) implements bqf<S> {
      @Override
      public boolean a(bqb<S> $$0, bqd $$1, bpv $$2) {
         $$1.a(this.a, this.b);
         return true;
      }
   }

   public static record d<S>(bqf<S> a) implements bqf<S> {
      @Override
      public boolean a(bqb<S> $$0, bqd $$1, bpv $$2) {
         int $$3 = $$0.g();
         if (!this.a.a($$0, $$1, $$2)) {
            $$0.a($$3);
         }

         return true;
      }
   }

   public static record e<S, T>(bqa<S, T> a, bpt<List<T>> b, int c) implements bqf<S> {
      @Override
      public boolean a(bqb<S> $$0, bqd $$1, bpv $$2) {
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

   public static record f<S, T>(bqa<S, T> a, bpt<List<T>> b, bqf<S> c, int d, boolean e) implements bqf<S> {
      @Override
      public boolean a(bqb<S> $$0, bqd $$1, bpv $$2) {
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

      public bqf<S> e() {
         return this.c;
      }

      public int f() {
         return this.d;
      }

      public boolean g() {
         return this.e;
      }
   }

   public static record g<S>(bqf<S>[] a) implements bqf<S> {
      @Override
      public boolean a(bqb<S> $$0, bqd $$1, bpv $$2) {
         int $$3 = $$0.g();

         for (bqf<S> $$4 : this.a) {
            if (!$$4.a($$0, $$1, $$2)) {
               $$0.a($$3);
               return false;
            }
         }

         return true;
      }
   }
}
