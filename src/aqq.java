import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntMaps;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.Long2ByteMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class aqq {
   private static final Logger a = LogUtils.getLogger();
   static final int c = aqg.a(aqr.d);
   final Long2ObjectMap<ObjectSet<are>> d = new Long2ObjectOpenHashMap();
   private final aqu e;
   private final arg f;
   final dhw g;
   private final aqq.a h = new aqq.a(8);
   private final aqq.b i = new aqq.b(32);
   protected final Set<aqf> b = new ReferenceOpenHashSet();
   final ari j;
   final LongSet k = new LongOpenHashSet();
   final Executor l;
   private int m = 10;

   protected aqq(dhw $$0, Executor $$1, Executor $$2) {
      this.g = $$0;
      this.e = new aqu(this, $$0);
      this.f = new arg($$0);
      brt<Runnable> $$3 = brt.a("player ticket throttler", $$2);
      this.j = new ari($$3, $$1, 4);
      this.l = $$2;
   }

   protected abstract boolean a(long var1);

   @Nullable
   protected abstract aqf b(long var1);

   @Nullable
   protected abstract aqf a(long var1, int var3, @Nullable aqf var4, int var5);

   public boolean a(aqh $$0) {
      this.h.a();
      this.f.a();
      this.i.a();
      int $$1 = Integer.MAX_VALUE - this.e.a(Integer.MAX_VALUE);
      boolean $$2 = $$1 != 0;
      if ($$2) {
      }

      if (!this.b.isEmpty()) {
         for (aqf $$3 : this.b) {
            $$3.a($$0);
         }

         for (aqf $$4 : this.b) {
            $$4.a($$0, this.l);
         }

         this.b.clear();
         return true;
      } else {
         if (!this.k.isEmpty()) {
            LongIterator $$5 = this.k.iterator();

            while ($$5.hasNext()) {
               long $$6 = $$5.nextLong();
               if (this.g.a($$6).stream().anyMatch($$0x -> $$0x.a() == ark.d)) {
                  aqf $$7 = $$0.a($$6);
                  if ($$7 == null) {
                     throw new IllegalStateException();
                  }

                  CompletableFuture<aqi<dzw>> $$8 = $$7.b();
                  $$8.thenAccept($$1x -> this.l.execute(() -> this.j.a($$6, () -> {
                        }, false)));
               }
            }

            this.k.clear();
         }

         return $$2;
      }
   }

   public void a(kk $$0, are $$1) {
      dgg $$2 = $$0.r();
      long $$3 = $$2.a();
      ((ObjectSet)this.d.computeIfAbsent($$3, $$0x -> new ObjectOpenHashSet())).add($$1);
      this.h.b($$3, 0, true);
      this.i.b($$3, 0, true);
      this.g.a(new arj(ark.e, this.e()), $$2);
   }

   public void b(kk $$0, are $$1) {
      dgg $$2 = $$0.r();
      long $$3 = $$2.a();
      ObjectSet<are> $$4 = (ObjectSet<are>)this.d.get($$3);
      $$4.remove($$1);
      if ($$4.isEmpty()) {
         this.d.remove($$3);
         this.h.b($$3, Integer.MAX_VALUE, false);
         this.i.b($$3, Integer.MAX_VALUE, false);
         this.g.b(new arj(ark.e, this.e()), $$2);
      }
   }

   private int e() {
      return Math.max(0, aqg.a(aqr.d) - this.m);
   }

   public boolean c(long $$0) {
      return aqg.d(this.f.c($$0));
   }

   public boolean d(long $$0) {
      return aqg.e(this.f.c($$0));
   }

   public int a(long $$0, boolean $$1) {
      return $$1 ? this.f.c($$0) : this.e.c($$0);
   }

   protected void a(int $$0) {
      this.i.a($$0);
   }

   public void b(int $$0) {
      if ($$0 != this.m) {
         this.m = $$0;
         this.g.a(this.e(), ark.e);
      }
   }

   public int a() {
      this.h.a();
      return this.h.a.size();
   }

   public boolean e(long $$0) {
      this.h.a();
      return this.h.a.containsKey($$0);
   }

   public LongIterator b() {
      this.h.a();
      return this.h.a.keySet().iterator();
   }

   public String c() {
      return this.j.d();
   }

   public boolean d() {
      return this.g.c();
   }

   class a extends aql {
      protected final Long2ByteMap a = new Long2ByteOpenHashMap();
      protected final int b;

      protected a(final int $$0) {
         super($$0 + 2, 16, 256);
         this.b = $$0;
         this.a.defaultReturnValue((byte)($$0 + 2));
      }

      @Override
      protected int c(long $$0) {
         return this.a.get($$0);
      }

      @Override
      protected void a(long $$0, int $$1) {
         byte $$2;
         if ($$1 > this.b) {
            $$2 = this.a.remove($$0);
         } else {
            $$2 = this.a.put($$0, (byte)$$1);
         }

         this.a($$0, $$2, $$1);
      }

      protected void a(long $$0, int $$1, int $$2) {
      }

      @Override
      protected int b(long $$0) {
         return this.f($$0) ? 0 : Integer.MAX_VALUE;
      }

      private boolean f(long $$0) {
         ObjectSet<are> $$1 = (ObjectSet<are>)aqq.this.d.get($$0);
         return $$1 != null && !$$1.isEmpty();
      }

      public void a() {
         this.b(Integer.MAX_VALUE);
      }
   }

   class b extends aqq.a {
      private int g;
      private final Long2IntMap h = Long2IntMaps.synchronize(new Long2IntOpenHashMap());
      private final LongSet i = new LongOpenHashSet();

      protected b(final int $$0) {
         super($$0);
         this.g = 0;
         this.h.defaultReturnValue($$0 + 2);
      }

      @Override
      protected void a(long $$0, int $$1, int $$2) {
         this.i.add($$0);
      }

      public void a(int $$0) {
         ObjectIterator var2 = this.a.long2ByteEntrySet().iterator();

         while (var2.hasNext()) {
            Entry $$1 = (Entry)var2.next();
            byte $$2 = $$1.getByteValue();
            long $$3 = $$1.getLongKey();
            this.a($$3, $$2, this.c($$2), $$2 <= $$0);
         }

         this.g = $$0;
      }

      private void a(long $$0, int $$1, boolean $$2, boolean $$3) {
         if ($$2 != $$3) {
            arj $$4 = new arj(ark.d, aqq.c);
            if ($$3) {
               aqq.this.j.a(() -> aqq.this.l.execute(() -> {
                     if (this.c(this.c($$0))) {
                        aqq.this.g.a($$0, $$4);
                        aqq.this.k.add($$0);
                     } else {
                        aqq.this.j.a($$0, () -> {
                        }, false);
                     }
                  }), $$0, () -> $$1);
            } else {
               aqq.this.j.a($$0, () -> aqq.this.l.execute(() -> aqq.this.g.b($$0, $$4)), true);
            }
         }
      }

      @Override
      public void a() {
         super.a();
         if (!this.i.isEmpty()) {
            LongIterator $$0 = this.i.iterator();

            while ($$0.hasNext()) {
               long $$1 = $$0.nextLong();
               int $$2 = this.h.get($$1);
               int $$3 = this.c($$1);
               if ($$2 != $$3) {
                  aqq.this.j.onLevelChange(new dgg($$1), () -> this.h.get($$1), $$3, $$1x -> {
                     if ($$1x >= this.h.defaultReturnValue()) {
                        this.h.remove($$1);
                     } else {
                        this.h.put($$1, $$1x);
                     }
                  });
                  this.a($$1, $$3, this.c($$2), this.c($$3));
               }
            }

            this.i.clear();
         }
      }

      private boolean c(int $$0) {
         return $$0 <= this.g;
      }
   }
}
