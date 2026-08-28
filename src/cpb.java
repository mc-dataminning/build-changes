import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.objects.ObjectIterable;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Reference2IntMaps;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2IntMap.Entry;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import javax.annotation.Nullable;

public class cpb<T> {
   public final Reference2IntOpenHashMap<T> a = new Reference2IntOpenHashMap();

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

   public boolean a(List<? extends cpb.a<T>> $$0, int $$1, @Nullable cpb.b<T> $$2) {
      return new cpb.c($$0).a($$1, $$2);
   }

   public int b(List<? extends cpb.a<T>> $$0, int $$1, @Nullable cpb.b<T> $$2) {
      return new cpb.c($$0).b($$1, $$2);
   }

   public void a() {
      this.a.clear();
   }

   public void a(T $$0, int $$1) {
      this.d($$0, $$1);
   }

   List<T> a(Iterable<? extends cpb.a<T>> $$0) {
      List<T> $$1 = new ArrayList<>();
      ObjectIterator var3 = Reference2IntMaps.fastIterable(this.a).iterator();

      while (var3.hasNext()) {
         Entry<T> $$2 = (Entry<T>)var3.next();
         if ($$2.getIntValue() > 0 && a($$0, (T)$$2.getKey())) {
            $$1.add((T)$$2.getKey());
         }
      }

      return $$1;
   }

   private static <T> boolean a(Iterable<? extends cpb.a<T>> $$0, T $$1) {
      for (cpb.a<T> $$2 : $$0) {
         if ($$2.acceptsItem($$1)) {
            return true;
         }
      }

      return false;
   }

   @VisibleForTesting
   public int a(List<? extends cpb.a<T>> $$0) {
      int $$1 = Integer.MAX_VALUE;
      ObjectIterable<Entry<T>> $$2 = Reference2IntMaps.fastIterable(this.a);

      label31:
      for (cpb.a<T> $$3 : $$0) {
         int $$4 = 0;
         ObjectIterator var7 = $$2.iterator();

         while (var7.hasNext()) {
            Entry<T> $$5 = (Entry<T>)var7.next();
            int $$6 = $$5.getIntValue();
            if ($$6 > $$4) {
               if ($$3.acceptsItem((T)$$5.getKey())) {
                  $$4 = $$6;
               }

               if ($$4 >= $$1) {
                  continue label31;
               }
            }
         }

         $$1 = $$4;
         if ($$4 == 0) {
            break;
         }
      }

      return $$1;
   }

   @FunctionalInterface
   public interface a<T> {
      boolean acceptsItem(T var1);
   }

   @FunctionalInterface
   public interface b<T> {
      void accept(T var1);
   }

   class c {
      private final List<? extends cpb.a<T>> c;
      private final int d;
      private final List<T> e;
      private final int f;
      private final BitSet g;
      private final IntList h = new IntArrayList();

      public c(final List<? extends cpb.a<T>> $$0) {
         this.c = $$0;
         this.d = $$0.size();
         this.e = cpb.this.a($$0);
         this.f = this.e.size();
         this.g = new BitSet(this.c() + this.e() + this.g() + this.i() + this.k());
         this.a();
      }

      private void a() {
         for (int $$0 = 0; $$0 < this.d; $$0++) {
            cpb.a<T> $$1 = (cpb.a<T>)this.c.get($$0);

            for (int $$2 = 0; $$2 < this.f; $$2++) {
               if ($$1.acceptsItem(this.e.get($$2))) {
                  this.a($$2, $$0);
               }
            }
         }
      }

      public boolean a(int $$0, @Nullable cpb.b<T> $$1) {
         if ($$0 <= 0) {
            return true;
         } else {
            int $$2 = 0;

            while (true) {
               IntList $$3 = this.b($$0);
               if ($$3 == null) {
                  boolean $$11 = $$2 == this.d;
                  boolean $$12 = $$11 && $$1 != null;
                  this.m();
                  this.l();

                  for (int $$13 = 0; $$13 < this.d; $$13++) {
                     for (int $$14 = 0; $$14 < this.f; $$14++) {
                        if (this.d($$14, $$13)) {
                           this.f($$14, $$13);
                           cpb.this.d(this.e.get($$14), $$0);
                           if ($$12) {
                              $$1.accept(this.e.get($$14));
                           }
                           break;
                        }
                     }
                  }

                  assert this.g.get(this.j(), this.j() + this.k()).isEmpty();

                  return $$11;
               }

               int $$4 = $$3.getInt(0);
               cpb.this.c(this.e.get($$4), $$0);
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

      @Nullable
      private IntList b(int $$0) {
         this.m();

         for (int $$1 = 0; $$1 < this.f; $$1++) {
            if (cpb.this.b(this.e.get($$1), $$0)) {
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

      private int b() {
         return 0;
      }

      private int c() {
         return this.d;
      }

      private int d() {
         return this.b() + this.c();
      }

      private int e() {
         return this.f;
      }

      private int f() {
         return this.d() + this.e();
      }

      private int g() {
         return this.d;
      }

      private int h() {
         return this.f() + this.g();
      }

      private int i() {
         return this.d * this.f;
      }

      private int j() {
         return this.h() + this.i();
      }

      private int k() {
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

         return this.f() + $$0;
      }

      private void l() {
         this.h(this.f(), this.g());
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

         return this.h() + $$0 * this.d + $$1;
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

         return this.j() + $$0 * this.d + $$1;
      }

      private void g(int $$0) {
         this.g.set(this.i($$0));
      }

      private boolean h(int $$0) {
         return this.g.get(this.i($$0));
      }

      private int i(int $$0) {
         assert $$0 >= 0 && $$0 < this.d;

         return this.b() + $$0;
      }

      private void j(int $$0) {
         this.g.set(this.l($$0));
      }

      private boolean k(int $$0) {
         return this.g.get(this.l($$0));
      }

      private int l(int $$0) {
         assert $$0 >= 0 && $$0 < this.f;

         return this.d() + $$0;
      }

      private void m() {
         this.h(this.b(), this.c());
         this.h(this.d(), this.e());
      }

      private void h(int $$0, int $$1) {
         this.g.clear($$0, $$0 + $$1);
      }

      public int b(int $$0, @Nullable cpb.b<T> $$1) {
         int $$2 = 0;
         int $$3 = Math.min($$0, cpb.this.a(this.c)) + 1;

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
   }
}
