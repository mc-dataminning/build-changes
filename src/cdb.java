import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntAVLTreeSet;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntCollection;
import it.unimi.dsi.fastutil.ints.IntIterator;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntListIterator;
import java.util.BitSet;
import java.util.List;
import javax.annotation.Nullable;

public class cdb {
   private static final int b = 0;
   public final Int2IntMap a = new Int2IntOpenHashMap();

   public void a(ckj $$0) {
      if (!$$0.j() && !$$0.E() && !$$0.A()) {
         this.b($$0);
      }
   }

   public void b(ckj $$0) {
      this.a($$0, 64);
   }

   public void a(ckj $$0, int $$1) {
      if (!$$0.b()) {
         int $$2 = c($$0);
         int $$3 = Math.min($$1, $$0.L());
         this.b($$2, $$3);
      }
   }

   public static int c(ckj $$0) {
      return jy.i.a($$0.d());
   }

   boolean b(int $$0) {
      return this.a.get($$0) > 0;
   }

   int a(int $$0, int $$1) {
      int $$2 = this.a.get($$0);
      if ($$2 >= $$1) {
         this.a.put($$0, $$2 - $$1);
         return $$0;
      } else {
         return 0;
      }
   }

   void b(int $$0, int $$1) {
      this.a.put($$0, this.a.get($$0) + $$1);
   }

   public boolean a(cnn<?> $$0, @Nullable IntList $$1) {
      return this.a($$0, $$1, 1);
   }

   public boolean a(cnn<?> $$0, @Nullable IntList $$1, int $$2) {
      return new cdb.a($$0).a($$2, $$1);
   }

   public int a(cno<?> $$0, @Nullable IntList $$1) {
      return this.a($$0, Integer.MAX_VALUE, $$1);
   }

   public int a(cno<?> $$0, int $$1, @Nullable IntList $$2) {
      return new cdb.a($$0.b()).b($$1, $$2);
   }

   public static ckj a(int $$0) {
      return $$0 == 0 ? ckj.b : new ckj(cke.b($$0));
   }

   public void a() {
      this.a.clear();
   }

   class a {
      private final cnn<?> b;
      private final List<cnk> c = Lists.newArrayList();
      private final int d;
      private final int[] e;
      private final int f;
      private final BitSet g;
      private final IntList h = new IntArrayList();

      public a(cnn<?> $$0) {
         this.b = $$0;
         this.c.addAll($$0.a());
         this.c.removeIf(cnk::c);
         this.d = this.c.size();
         this.e = this.a();
         this.f = this.e.length;
         this.g = new BitSet(this.d + this.f + this.d + this.d * this.f);

         for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
            IntList $$2 = this.c.get($$1).b();

            for (int $$3 = 0; $$3 < this.f; $$3++) {
               if ($$2.contains(this.e[$$3])) {
                  this.g.set(this.d(true, $$3, $$1));
               }
            }
         }
      }

      public boolean a(int $$0, @Nullable IntList $$1) {
         if ($$0 <= 0) {
            return true;
         } else {
            int $$2;
            for ($$2 = 0; this.a($$0); $$2++) {
               cdb.this.a(this.e[this.h.getInt(0)], $$0);
               int $$3 = this.h.size() - 1;
               this.c(this.h.getInt($$3));

               for (int $$4 = 0; $$4 < $$3; $$4++) {
                  this.c(($$4 & 1) == 0, this.h.get($$4), this.h.get($$4 + 1));
               }

               this.h.clear();
               this.g.clear(0, this.d + this.f);
            }

            boolean $$5 = $$2 == this.d;
            boolean $$6 = $$5 && $$1 != null;
            if ($$6) {
               $$1.clear();
            }

            this.g.clear(0, this.d + this.f + this.d);
            int $$7 = 0;

            for (cnk $$9 : this.b.a()) {
               if ($$6 && $$9.c()) {
                  $$1.add(0);
               } else {
                  for (int $$10 = 0; $$10 < this.f; $$10++) {
                     if (this.b(false, $$7, $$10)) {
                        this.c(true, $$10, $$7);
                        cdb.this.b(this.e[$$10], $$0);
                        if ($$6) {
                           $$1.add(this.e[$$10]);
                        }
                     }
                  }

                  $$7++;
               }
            }

            return $$5;
         }
      }

      private int[] a() {
         IntCollection $$0 = new IntAVLTreeSet();

         for (cnk $$1 : this.c) {
            $$0.addAll($$1.b());
         }

         IntIterator $$2 = $$0.iterator();

         while ($$2.hasNext()) {
            if (!cdb.this.b($$2.nextInt())) {
               $$2.remove();
            }
         }

         return $$0.toIntArray();
      }

      private boolean a(int $$0) {
         int $$1 = this.f;

         for (int $$2 = 0; $$2 < $$1; $$2++) {
            if (cdb.this.a.get(this.e[$$2]) >= $$0) {
               this.a(false, $$2);

               while (!this.h.isEmpty()) {
                  int $$3 = this.h.size();
                  boolean $$4 = ($$3 & 1) == 1;
                  int $$5 = this.h.getInt($$3 - 1);
                  if (!$$4 && !this.b($$5)) {
                     break;
                  }

                  int $$6 = $$4 ? this.d : $$1;
                  int $$7 = 0;

                  while (true) {
                     if ($$7 < $$6) {
                        if (this.b($$4, $$7) || !this.a($$4, $$5, $$7) || !this.b($$4, $$5, $$7)) {
                           $$7++;
                           continue;
                        }

                        this.a($$4, $$7);
                     }

                     $$7 = this.h.size();
                     if ($$7 == $$3) {
                        this.h.removeInt($$7 - 1);
                     }
                     break;
                  }
               }

               if (!this.h.isEmpty()) {
                  return true;
               }
            }
         }

         return false;
      }

      private boolean b(int $$0) {
         return this.g.get(this.d($$0));
      }

      private void c(int $$0) {
         this.g.set(this.d($$0));
      }

      private int d(int $$0) {
         return this.d + this.f + $$0;
      }

      private boolean a(boolean $$0, int $$1, int $$2) {
         return this.g.get(this.d($$0, $$1, $$2));
      }

      private boolean b(boolean $$0, int $$1, int $$2) {
         return $$0 != this.g.get(1 + this.d($$0, $$1, $$2));
      }

      private void c(boolean $$0, int $$1, int $$2) {
         this.g.flip(1 + this.d($$0, $$1, $$2));
      }

      private int d(boolean $$0, int $$1, int $$2) {
         int $$3 = $$0 ? $$1 * this.d + $$2 : $$2 * this.d + $$1;
         return this.d + this.f + this.d + 2 * $$3;
      }

      private void a(boolean $$0, int $$1) {
         this.g.set(this.c($$0, $$1));
         this.h.add($$1);
      }

      private boolean b(boolean $$0, int $$1) {
         return this.g.get(this.c($$0, $$1));
      }

      private int c(boolean $$0, int $$1) {
         return ($$0 ? 0 : this.d) + $$1;
      }

      public int b(int $$0, @Nullable IntList $$1) {
         int $$2 = 0;
         int $$3 = Math.min($$0, this.b()) + 1;

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

      private int b() {
         int $$0 = Integer.MAX_VALUE;

         for (cnk $$1 : this.c) {
            int $$2 = 0;
            IntListIterator var5 = $$1.b().iterator();

            while (var5.hasNext()) {
               int $$3 = (Integer)var5.next();
               $$2 = Math.max($$2, cdb.this.a.get($$3));
            }

            if ($$0 > 0) {
               $$0 = Math.min($$0, $$2);
            }
         }

         return $$0;
      }
   }
}
