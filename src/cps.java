import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import java.util.BitSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class cps<T> {
   public final Reference2IntOpenHashMap<T> a = new Reference2IntOpenHashMap();

   boolean a(T $$0) {
      return this.a.getInt($$0) > 0;
   }

   boolean b(T $$0, int $$1) {
      return this.a.getInt($$0) >= $$1;
   }

   void c(T $$0, int $$1) {
      int $$2 = this.a.addTo($$0, -$$1);
      if ($$2 < $$1) {
         throw new IllegalStateException("Took " + $$1 + " items, but only had " + $$2);
      }
   }

   void d(T $$0, int $$1) {
      this.a.addTo($$0, $$1);
   }

   public boolean a(List<cps.a<T>> $$0, int $$1, @Nullable cps.b<T> $$2) {
      return new cps.c($$0).a($$1, $$2);
   }

   public int b(List<cps.a<T>> $$0, int $$1, @Nullable cps.b<T> $$2) {
      return new cps.c($$0).b($$1, $$2);
   }

   public void a() {
      this.a.clear();
   }

   public void a(T $$0, int $$1) {
      this.d($$0, $$1);
   }

   public static record a<T>(List<T> a) {
      public a(List<T> a) {
         if (a.isEmpty()) {
            throw new IllegalArgumentException("Ingredients can't be empty");
         } else {
            this.a = a;
         }
      }
   }

   @FunctionalInterface
   public interface b<T> {
      void accept(T var1);
   }

   class c {
      private final List<cps.a<T>> c;
      private final int d;
      private final List<T> e;
      private final int f;
      private final BitSet g;
      private final IntList h = new IntArrayList();

      public c(final List<cps.a<T>> $$0) {
         this.c = $$0;
         this.d = this.c.size();
         this.e = this.b();
         this.f = this.e.size();
         this.g = new BitSet(this.d() + this.f() + this.h() + this.j() + this.l());
         this.a();
      }

      private void a() {
         for (int $$0 = 0; $$0 < this.d; $$0++) {
            List<T> $$1 = this.c.get($$0).a();

            for (int $$2 = 0; $$2 < this.f; $$2++) {
               if ($$1.contains(this.e.get($$2))) {
                  this.a($$2, $$0);
               }
            }
         }
      }

      public boolean a(int $$0, @Nullable cps.b<T> $$1) {
         if ($$0 <= 0) {
            return true;
         } else {
            int $$2 = 0;

            while (true) {
               IntList $$3 = this.b($$0);
               if ($$3 == null) {
                  boolean $$11 = $$2 == this.d;
                  boolean $$12 = $$11 && $$1 != null;
                  this.n();
                  this.m();

                  for (int $$13 = 0; $$13 < this.d; $$13++) {
                     for (int $$14 = 0; $$14 < this.f; $$14++) {
                        if (this.d($$14, $$13)) {
                           this.f($$14, $$13);
                           cps.this.d(this.e.get($$14), $$0);
                           if ($$12) {
                              $$1.accept(this.e.get($$14));
                           }
                           break;
                        }
                     }
                  }

                  assert this.g.get(this.k(), this.k() + this.l()).isEmpty();

                  return $$11;
               }

               int $$4 = $$3.getInt(0);
               cps.this.c(this.e.get($$4), $$0);
               int $$5 = $$3.size() - 1;
               this.e($$3.getInt($$5));
               $$2++;

               for (int $$6 = 0; $$6 < $$3.size() - 1; $$6++) {
                  if (a($$6)) {
                     int $$7 = $$3.getInt($$6);
                     int $$8 = $$3.getInt($$6 + 1);
                     this.e($$7, $$8);
                  } else {
                     int $$9 = $$3.getInt($$6 + 1);
                     int $$10 = $$3.getInt($$6);
                     this.f($$9, $$10);
                  }
               }
            }
         }
      }

      private static boolean a(int $$0) {
         return ($$0 & 1) == 0;
      }

      private List<T> b() {
         Set<T> $$0 = new ReferenceOpenHashSet();

         for (cps.a<T> $$1 : this.c) {
            $$0.addAll($$1.a());
         }

         $$0.removeIf($$0x -> !cps.this.a((T)$$0x));
         return List.copyOf($$0);
      }

      @Nullable
      private IntList b(int $$0) {
         this.n();

         for (int $$1 = 0; $$1 < this.f; $$1++) {
            if (cps.this.b(this.e.get($$1), $$0)) {
               IntList $$2 = this.c($$1);
               if ($$2 != null) {
                  return $$2;
               }
            }
         }

         return null;
      }

      @Nullable
      private IntList c(int $$0) {
         this.h.clear();
         this.j($$0);
         this.h.add($$0);

         while (!this.h.isEmpty()) {
            int $$1 = this.h.size();
            if (a($$1 - 1)) {
               int $$2 = this.h.getInt($$1 - 1);

               for (int $$3 = 0; $$3 < this.d; $$3++) {
                  if (!this.h($$3) && this.b($$2, $$3) && !this.d($$2, $$3)) {
                     this.g($$3);
                     this.h.add($$3);
                     break;
                  }
               }
            } else {
               int $$4 = this.h.getInt($$1 - 1);
               if (!this.d($$4)) {
                  return this.h;
               }

               for (int $$5 = 0; $$5 < this.f; $$5++) {
                  if (!this.k($$5) && this.d($$5, $$4)) {
                     assert this.b($$5, $$4);

                     this.j($$5);
                     this.h.add($$5);
                     break;
                  }
               }
            }

            int $$6 = this.h.size();
            if ($$6 == $$1) {
               this.h.removeInt($$6 - 1);
            }
         }

         return null;
      }

      private int c() {
         return 0;
      }

      private int d() {
         return this.d;
      }

      private int e() {
         return this.c() + this.d();
      }

      private int f() {
         return this.f;
      }

      private int g() {
         return this.e() + this.f();
      }

      private int h() {
         return this.d;
      }

      private int i() {
         return this.g() + this.h();
      }

      private int j() {
         return this.d * this.f;
      }

      private int k() {
         return this.i() + this.j();
      }

      private int l() {
         return this.d * this.f;
      }

      private boolean d(int $$0) {
         return this.g.get(this.f($$0));
      }

      private void e(int $$0) {
         this.g.set(this.f($$0));
      }

      private int f(int $$0) {
         assert $$0 >= 0 && $$0 < this.d;

         return this.g() + $$0;
      }

      private void m() {
         this.h(this.g(), this.h());
      }

      private void a(int $$0, int $$1) {
         this.g.set(this.c($$0, $$1));
      }

      private boolean b(int $$0, int $$1) {
         return this.g.get(this.c($$0, $$1));
      }

      private int c(int $$0, int $$1) {
         assert $$0 >= 0 && $$0 < this.f;

         assert $$1 >= 0 && $$1 < this.d;

         return this.i() + $$0 * this.d + $$1;
      }

      private boolean d(int $$0, int $$1) {
         return this.g.get(this.g($$0, $$1));
      }

      private void e(int $$0, int $$1) {
         int $$2 = this.g($$0, $$1);

         assert !this.g.get($$2);

         this.g.set($$2);
      }

      private void f(int $$0, int $$1) {
         int $$2 = this.g($$0, $$1);

         assert this.g.get($$2);

         this.g.clear($$2);
      }

      private int g(int $$0, int $$1) {
         assert $$0 >= 0 && $$0 < this.f;

         assert $$1 >= 0 && $$1 < this.d;

         return this.k() + $$0 * this.d + $$1;
      }

      private void g(int $$0) {
         this.g.set(this.i($$0));
      }

      private boolean h(int $$0) {
         return this.g.get(this.i($$0));
      }

      private int i(int $$0) {
         assert $$0 >= 0 && $$0 < this.d;

         return this.c() + $$0;
      }

      private void j(int $$0) {
         this.g.set(this.l($$0));
      }

      private boolean k(int $$0) {
         return this.g.get(this.l($$0));
      }

      private int l(int $$0) {
         assert $$0 >= 0 && $$0 < this.f;

         return this.e() + $$0;
      }

      private void n() {
         this.h(this.c(), this.d());
         this.h(this.e(), this.f());
      }

      private void h(int $$0, int $$1) {
         this.g.clear($$0, $$0 + $$1);
      }

      public int b(int $$0, @Nullable cps.b<T> $$1) {
         int $$2 = 0;
         int $$3 = Math.min($$0, this.o()) + 1;

         while (true) {
            int $$4 = ($$2 + $$3) / 2;
            if (this.a($$4, null)) {
               if ($$3 - $$2 <= 1) {
                  if ($$4 > 0) {
                     this.a($$4, $$1);
                  }

                  return $$4;
               }

               $$2 = $$4;
            } else {
               $$3 = $$4;
            }
         }
      }

      private int o() {
         int $$0 = Integer.MAX_VALUE;

         for (cps.a<T> $$1 : this.c) {
            int $$2 = 0;

            for (T $$3 : $$1.a()) {
               $$2 = Math.max($$2, cps.this.a.getInt($$3));
            }

            if ($$0 > 0) {
               $$0 = Math.min($$0, $$2);
            }
         }

         return $$0;
      }
   }
}
