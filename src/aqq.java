import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableSet;
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
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class aqq {
   static final Logger a = LogUtils.getLogger();
   static final int b = aqg.a(aqr.d);
   private static final int c = 4;
   final Long2ObjectMap<ObjectSet<ard>> d = new Long2ObjectOpenHashMap();
   final Long2ObjectOpenHashMap<azq<arh<?>>> e = new Long2ObjectOpenHashMap();
   private final aqq.a f = new aqq.a();
   private final aqq.b g = new aqq.b(8);
   private final arj h = new arj();
   private final aqq.c i = new aqq.c(32);
   final Set<aqf> j = new ReferenceOpenHashSet();
   final arg k;
   final LongSet l = new LongOpenHashSet();
   final Executor m;
   private long n;
   private int o = 10;

   protected aqq(Executor $$0, Executor $$1) {
      brd<Runnable> $$2 = brd.a("player ticket throttler", $$1);
      this.k = new arg($$2, $$0, 4);
      this.m = $$1;
   }

   protected void a() {
      this.n++;
      ObjectIterator<Entry<azq<arh<?>>>> $$0 = this.e.long2ObjectEntrySet().fastIterator();

      while ($$0.hasNext()) {
         Entry<azq<arh<?>>> $$1 = (Entry<azq<arh<?>>>)$$0.next();
         Iterator<arh<?>> $$2 = ((azq)$$1.getValue()).iterator();
         boolean $$3 = false;

         while ($$2.hasNext()) {
            arh<?> $$4 = $$2.next();
            if ($$4.b(this.n)) {
               $$2.remove();
               $$3 = true;
               this.h.b($$1.getLongKey(), $$4);
            }
         }

         if ($$3) {
            this.f.b($$1.getLongKey(), a((azq<arh<?>>)$$1.getValue()), false);
         }

         if (((azq)$$1.getValue()).isEmpty()) {
            $$0.remove();
         }
      }
   }

   private static int a(azq<arh<?>> $$0) {
      return !$$0.isEmpty() ? $$0.b().b() : aqg.b + 1;
   }

   protected abstract boolean a(long var1);

   @Nullable
   protected abstract aqf b(long var1);

   @Nullable
   protected abstract aqf a(long var1, int var3, @Nullable aqf var4, int var5);

   public boolean a(aqh $$0) {
      this.g.a();
      this.h.b();
      this.i.a();
      int $$1 = Integer.MAX_VALUE - this.f.a(Integer.MAX_VALUE);
      boolean $$2 = $$1 != 0;
      if ($$2) {
      }

      if (!this.j.isEmpty()) {
         for (aqf $$3 : this.j) {
            $$3.a($$0);
         }

         for (aqf $$4 : this.j) {
            $$4.a($$0, this.m);
         }

         this.j.clear();
         return true;
      } else {
         if (!this.l.isEmpty()) {
            LongIterator $$5 = this.l.iterator();

            while ($$5.hasNext()) {
               long $$6 = $$5.nextLong();
               if (this.g($$6).stream().anyMatch($$0x -> $$0x.a() == ari.c)) {
                  aqf $$7 = $$0.a($$6);
                  if ($$7 == null) {
                     throw new IllegalStateException();
                  }

                  CompletableFuture<aqi<dza>> $$8 = $$7.b();
                  $$8.thenAccept($$1x -> this.m.execute(() -> this.k.a($$6, () -> {
                        }, false)));
               }
            }

            this.l.clear();
         }

         return $$2;
      }
   }

   void a(long $$0, arh<?> $$1) {
      azq<arh<?>> $$2 = this.g($$0);
      int $$3 = a($$2);
      arh<?> $$4 = $$2.a($$1);
      $$4.a(this.n);
      if ($$1.b() < $$3) {
         this.f.b($$0, $$1.b(), true);
      }
   }

   void b(long $$0, arh<?> $$1) {
      azq<arh<?>> $$2 = this.g($$0);
      if ($$2.remove($$1)) {
      }

      if ($$2.isEmpty()) {
         this.e.remove($$0);
      }

      this.f.b($$0, a($$2), false);
   }

   public <T> void a(ari<T> $$0, dfm $$1, int $$2, T $$3) {
      this.a($$1.a(), new arh<>($$0, $$2, $$3));
   }

   public <T> void b(ari<T> $$0, dfm $$1, int $$2, T $$3) {
      arh<T> $$4 = new arh<>($$0, $$2, $$3);
      this.b($$1.a(), $$4);
   }

   public <T> void c(ari<T> $$0, dfm $$1, int $$2, T $$3) {
      arh<T> $$4 = new arh<>($$0, aqg.a(aqr.b) - $$2, $$3);
      long $$5 = $$1.a();
      this.a($$5, $$4);
      this.h.a($$5, $$4);
   }

   public <T> void d(ari<T> $$0, dfm $$1, int $$2, T $$3) {
      arh<T> $$4 = new arh<>($$0, aqg.a(aqr.b) - $$2, $$3);
      long $$5 = $$1.a();
      this.b($$5, $$4);
      this.h.b($$5, $$4);
   }

   private azq<arh<?>> g(long $$0) {
      return (azq<arh<?>>)this.e.computeIfAbsent($$0, $$0x -> azq.a(4));
   }

   protected void a(dfm $$0, boolean $$1) {
      arh<dfm> $$2 = new arh<>(ari.d, aqh.c, $$0);
      long $$3 = $$0.a();
      if ($$1) {
         this.a($$3, $$2);
         this.h.a($$3, $$2);
      } else {
         this.b($$3, $$2);
         this.h.b($$3, $$2);
      }
   }

   public void a(kk $$0, ard $$1) {
      dfm $$2 = $$0.r();
      long $$3 = $$2.a();
      ((ObjectSet)this.d.computeIfAbsent($$3, $$0x -> new ObjectOpenHashSet())).add($$1);
      this.g.b($$3, 0, true);
      this.i.b($$3, 0, true);
      this.h.a(ari.c, $$2, this.i(), $$2);
   }

   public void b(kk $$0, ard $$1) {
      dfm $$2 = $$0.r();
      long $$3 = $$2.a();
      ObjectSet<ard> $$4 = (ObjectSet<ard>)this.d.get($$3);
      $$4.remove($$1);
      if ($$4.isEmpty()) {
         this.d.remove($$3);
         this.g.b($$3, Integer.MAX_VALUE, false);
         this.i.b($$3, Integer.MAX_VALUE, false);
         this.h.b(ari.c, $$2, this.i(), $$2);
      }
   }

   private int i() {
      return Math.max(0, aqg.a(aqr.d) - this.o);
   }

   public boolean c(long $$0) {
      return aqg.d(this.h.c($$0));
   }

   public boolean d(long $$0) {
      return aqg.e(this.h.c($$0));
   }

   protected String e(long $$0) {
      azq<arh<?>> $$1 = (azq<arh<?>>)this.e.get($$0);
      return $$1 != null && !$$1.isEmpty() ? $$1.b().toString() : "no_ticket";
   }

   protected void a(int $$0) {
      this.i.a($$0);
   }

   public void b(int $$0) {
      if ($$0 != this.o) {
         this.o = $$0;
         this.h.a(this.i());
      }
   }

   public int b() {
      this.g.a();
      return this.g.a.size();
   }

   public boolean f(long $$0) {
      this.g.a();
      return this.g.a.containsKey($$0);
   }

   public LongIterator c() {
      this.g.a();
      return this.g.a.keySet().iterator();
   }

   public String d() {
      return this.k.d();
   }

   private void a(String $$0) {
      try (FileOutputStream $$1 = new FileOutputStream(new File($$0))) {
         ObjectIterator var3 = this.e.long2ObjectEntrySet().iterator();

         while (var3.hasNext()) {
            Entry<azq<arh<?>>> $$2 = (Entry<azq<arh<?>>>)var3.next();
            dfm $$3 = new dfm($$2.getLongKey());

            for (arh<?> $$4 : (azq)$$2.getValue()) {
               $$1.write(($$3.h + "\t" + $$3.i + "\t" + $$4.a() + "\t" + $$4.b() + "\t\n").getBytes(StandardCharsets.UTF_8));
            }
         }
      } catch (IOException var10) {
         a.error("Failed to dump tickets to {}", $$0, var10);
      }
   }

   @VisibleForTesting
   arj e() {
      return this.h;
   }

   public LongSet f() {
      return this.h.a();
   }

   public void g() {
      ImmutableSet<ari<?>> $$0 = ImmutableSet.of(ari.g);
      ObjectIterator<Entry<azq<arh<?>>>> $$1 = this.e.long2ObjectEntrySet().fastIterator();

      while ($$1.hasNext()) {
         Entry<azq<arh<?>>> $$2 = (Entry<azq<arh<?>>>)$$1.next();
         Iterator<arh<?>> $$3 = ((azq)$$2.getValue()).iterator();
         boolean $$4 = false;

         while ($$3.hasNext()) {
            arh<?> $$5 = $$3.next();
            if (!$$0.contains($$5.a())) {
               $$3.remove();
               $$4 = true;
               this.h.b($$2.getLongKey(), $$5);
            }
         }

         if ($$4) {
            this.f.b($$2.getLongKey(), a((azq<arh<?>>)$$2.getValue()), false);
         }

         if (((azq)$$2.getValue()).isEmpty()) {
            $$1.remove();
         }
      }
   }

   public boolean h() {
      return !this.e.isEmpty();
   }

   class a extends aql {
      private static final int b = aqg.b + 1;

      public a() {
         super(b + 1, 16, 256);
      }

      @Override
      protected int b(long $$0) {
         azq<arh<?>> $$1 = (azq<arh<?>>)aqq.this.e.get($$0);
         if ($$1 == null) {
            return Integer.MAX_VALUE;
         } else {
            return $$1.isEmpty() ? Integer.MAX_VALUE : $$1.b().b();
         }
      }

      @Override
      protected int c(long $$0) {
         if (!aqq.this.a($$0)) {
            aqf $$1 = aqq.this.b($$0);
            if ($$1 != null) {
               return $$1.j();
            }
         }

         return b;
      }

      @Override
      protected void a(long $$0, int $$1) {
         aqf $$2 = aqq.this.b($$0);
         int $$3 = $$2 == null ? b : $$2.j();
         if ($$3 != $$1) {
            $$2 = aqq.this.a($$0, $$1, $$2, $$3);
            if ($$2 != null) {
               aqq.this.j.add($$2);
            }
         }
      }

      public int a(int $$0) {
         return this.b($$0);
      }
   }

   class b extends aql {
      protected final Long2ByteMap a = new Long2ByteOpenHashMap();
      protected final int b;

      protected b(final int $$0) {
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
         return this.d($$0) ? 0 : Integer.MAX_VALUE;
      }

      private boolean d(long $$0) {
         ObjectSet<ard> $$1 = (ObjectSet<ard>)aqq.this.d.get($$0);
         return $$1 != null && !$$1.isEmpty();
      }

      public void a() {
         this.b(Integer.MAX_VALUE);
      }

      private void a(String $$0) {
         try (FileOutputStream $$1 = new FileOutputStream(new File($$0))) {
            ObjectIterator var3 = this.a.long2ByteEntrySet().iterator();

            while (var3.hasNext()) {
               it.unimi.dsi.fastutil.longs.Long2ByteMap.Entry $$2 = (it.unimi.dsi.fastutil.longs.Long2ByteMap.Entry)var3.next();
               dfm $$3 = new dfm($$2.getLongKey());
               String $$4 = Byte.toString($$2.getByteValue());
               $$1.write(($$3.h + "\t" + $$3.i + "\t" + $$4 + "\n").getBytes(StandardCharsets.UTF_8));
            }
         } catch (IOException var9) {
            aqq.a.error("Failed to dump chunks to {}", $$0, var9);
         }
      }
   }

   class c extends aqq.b {
      private int g;
      private final Long2IntMap h = Long2IntMaps.synchronize(new Long2IntOpenHashMap());
      private final LongSet i = new LongOpenHashSet();

      protected c(final int $$0) {
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
            it.unimi.dsi.fastutil.longs.Long2ByteMap.Entry $$1 = (it.unimi.dsi.fastutil.longs.Long2ByteMap.Entry)var2.next();
            byte $$2 = $$1.getByteValue();
            long $$3 = $$1.getLongKey();
            this.a($$3, $$2, this.c($$2), $$2 <= $$0);
         }

         this.g = $$0;
      }

      private void a(long $$0, int $$1, boolean $$2, boolean $$3) {
         if ($$2 != $$3) {
            arh<?> $$4 = new arh<>(ari.c, aqq.b, new dfm($$0));
            if ($$3) {
               aqq.this.k.a(() -> aqq.this.m.execute(() -> {
                     if (this.c(this.c($$0))) {
                        aqq.this.a($$0, $$4);
                        aqq.this.l.add($$0);
                     } else {
                        aqq.this.k.a($$0, () -> {
                        }, false);
                     }
                  }), $$0, () -> $$1);
            } else {
               aqq.this.k.a($$0, () -> aqq.this.m.execute(() -> aqq.this.b($$0, $$4)), true);
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
                  aqq.this.k.onLevelChange(new dfm($$1), () -> this.h.get($$1), $$3, $$1x -> {
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
