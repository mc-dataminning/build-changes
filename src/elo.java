import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMaps;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import javax.annotation.Nullable;

public abstract class elo<M extends ell<M>> {
   private final dam i;
   protected final dsq a;
   protected final Long2ByteMap b = new Long2ByteOpenHashMap();
   private final LongSet j = new LongOpenHashSet();
   protected volatile M c;
   protected final M d;
   protected final LongSet e = new LongOpenHashSet();
   protected final LongSet f = new LongOpenHashSet();
   protected final Long2ObjectMap<dsi> g = Long2ObjectMaps.synchronize(new Long2ObjectOpenHashMap());
   private final LongSet k = new LongOpenHashSet();
   private final LongSet l = new LongOpenHashSet();
   protected volatile boolean h;

   protected elo(dam $$0, dsq $$1, M $$2) {
      this.i = $$0;
      this.a = $$1;
      this.d = $$2;
      this.c = $$2.b();
      this.c.d();
      this.b.defaultReturnValue((byte)0);
   }

   protected boolean b(long $$0) {
      return this.a($$0, true) != null;
   }

   @Nullable
   protected dsi a(long $$0, boolean $$1) {
      return this.a($$1 ? this.d : this.c, $$0);
   }

   @Nullable
   protected dsi a(M $$0, long $$1) {
      return $$0.c($$1);
   }

   @Nullable
   protected dsi c(long $$0) {
      dsi $$1 = this.d.c($$0);
      if ($$1 == null) {
         return null;
      } else {
         if (this.e.add($$0)) {
            $$1 = $$1.b();
            this.d.a($$0, $$1);
            this.d.c();
         }

         return $$1;
      }
   }

   @Nullable
   public dsi d(long $$0) {
      dsi $$1 = (dsi)this.g.get($$0);
      return $$1 != null ? $$1 : this.a($$0, false);
   }

   protected abstract int a(long var1);

   protected int e(long $$0) {
      long $$1 = jp.e($$0);
      dsi $$2 = this.a($$1, true);
      return $$2.a(jp.b(in.a($$0)), jp.b(in.b($$0)), jp.b(in.c($$0)));
   }

   protected void a(long $$0, int $$1) {
      long $$2 = jp.e($$0);
      dsi $$3;
      if (this.e.add($$2)) {
         $$3 = this.d.a($$2);
      } else {
         $$3 = this.a($$2, true);
      }

      $$3.a(jp.b(in.a($$0)), jp.b(in.b($$0)), jp.b(in.c($$0)), $$1);
      jp.a($$0, this.f::add);
   }

   protected void f(long $$0) {
      int $$1 = jp.b($$0);
      int $$2 = jp.c($$0);
      int $$3 = jp.d($$0);

      for (int $$4 = -1; $$4 <= 1; $$4++) {
         for (int $$5 = -1; $$5 <= 1; $$5++) {
            for (int $$6 = -1; $$6 <= 1; $$6++) {
               this.f.add(jp.b($$1 + $$5, $$2 + $$6, $$3 + $$4));
            }
         }
      }
   }

   protected dsi g(long $$0) {
      dsi $$1 = (dsi)this.g.get($$0);
      return $$1 != null ? $$1 : new dsi();
   }

   protected boolean a() {
      return this.h;
   }

   protected void a(elr<M, ?> $$0) {
      if (this.h) {
         this.h = false;
         LongIterator $$5 = this.l.iterator();

         while ($$5.hasNext()) {
            long $$1 = (Long)$$5.next();
            dsi $$2 = (dsi)this.g.remove($$1);
            dsi $$3 = this.d.d($$1);
            if (this.k.contains(jp.f($$1))) {
               if ($$2 != null) {
                  this.g.put($$1, $$2);
               } else if ($$3 != null) {
                  this.g.put($$1, $$3);
               }
            }
         }

         this.d.c();
         $$5 = this.l.iterator();

         while ($$5.hasNext()) {
            long $$4 = (Long)$$5.next();
            this.i($$4);
            this.e.add($$4);
         }

         this.l.clear();
         ObjectIterator<Entry<dsi>> $$5x = Long2ObjectMaps.fastIterator(this.g);

         while ($$5x.hasNext()) {
            Entry<dsi> $$6 = (Entry<dsi>)$$5x.next();
            long $$7 = $$6.getLongKey();
            if (this.b($$7)) {
               dsi $$8 = (dsi)$$6.getValue();
               if (this.d.c($$7) != $$8) {
                  this.d.a($$7, $$8);
                  this.e.add($$7);
               }

               $$5x.remove();
            }
         }

         this.d.c();
      }
   }

   protected void h(long $$0) {
   }

   protected void i(long $$0) {
   }

   protected void b(long $$0, boolean $$1) {
      if ($$1) {
         this.j.add($$0);
      } else {
         this.j.remove($$0);
      }
   }

   protected boolean j(long $$0) {
      long $$1 = jp.f($$0);
      return this.j.contains($$1);
   }

   public void c(long $$0, boolean $$1) {
      if ($$1) {
         this.k.add($$0);
      } else {
         this.k.remove($$0);
      }
   }

   protected void a(long $$0, @Nullable dsi $$1) {
      if ($$1 != null) {
         this.g.put($$0, $$1);
         this.h = true;
      } else {
         this.g.remove($$0);
      }
   }

   protected void d(long $$0, boolean $$1) {
      byte $$2 = this.b.get($$0);
      byte $$3 = elo.a.a($$2, !$$1);
      if ($$2 != $$3) {
         this.a($$0, $$3);
         int $$4 = $$1 ? -1 : 1;

         for (int $$5 = -1; $$5 <= 1; $$5++) {
            for (int $$6 = -1; $$6 <= 1; $$6++) {
               for (int $$7 = -1; $$7 <= 1; $$7++) {
                  if ($$5 != 0 || $$6 != 0 || $$7 != 0) {
                     long $$8 = jp.a($$0, $$5, $$6, $$7);
                     byte $$9 = this.b.get($$8);
                     this.a($$8, elo.a.a($$9, elo.a.b($$9) + $$4));
                  }
               }
            }
         }
      }
   }

   protected void a(long $$0, byte $$1) {
      if ($$1 != 0) {
         if (this.b.put($$0, $$1) == 0) {
            this.l($$0);
         }
      } else if (this.b.remove($$0) != 0) {
         this.m($$0);
      }
   }

   private void l(long $$0) {
      if (!this.l.remove($$0)) {
         this.d.a($$0, this.g($$0));
         this.e.add($$0);
         this.h($$0);
         this.f($$0);
         this.h = true;
      }
   }

   private void m(long $$0) {
      this.l.add($$0);
      this.h = true;
   }

   protected void b() {
      if (!this.e.isEmpty()) {
         M $$0 = this.d.b();
         $$0.d();
         this.c = $$0;
         this.e.clear();
      }

      if (!this.f.isEmpty()) {
         LongIterator $$1 = this.f.iterator();

         while ($$1.hasNext()) {
            long $$2 = $$1.nextLong();
            this.a.a(this.i, jp.a($$2));
         }

         this.f.clear();
      }
   }

   public elo.b k(long $$0) {
      return elo.a.c(this.b.get($$0));
   }

   protected static class a {
      public static final byte a = 0;
      private static final int b = 0;
      private static final int c = 26;
      private static final byte d = 32;
      private static final byte e = 31;

      public static byte a(byte $$0, boolean $$1) {
         return (byte)($$1 ? $$0 | 32 : $$0 & -33);
      }

      public static byte a(byte $$0, int $$1) {
         if ($$1 >= 0 && $$1 <= 26) {
            return (byte)($$0 & -32 | $$1 & 31);
         } else {
            throw new IllegalArgumentException("Neighbor count was not within range [0; 26]");
         }
      }

      public static boolean a(byte $$0) {
         return ($$0 & 32) != 0;
      }

      public static int b(byte $$0) {
         return $$0 & 31;
      }

      public static elo.b c(byte $$0) {
         if ($$0 == 0) {
            return elo.b.a;
         } else {
            return a($$0) ? elo.b.c : elo.b.b;
         }
      }
   }

   public static enum b {
      a("2"),
      b("1"),
      c("0");

      private final String d;

      private b(String $$0) {
         this.d = $$0;
      }

      public String a() {
         return this.d;
      }
   }
}
