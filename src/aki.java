import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Either;
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

public abstract class aki {
   static final Logger a = LogUtils.getLogger();
   static final int b = ajz.a(akj.d);
   private static final int c = 4;
   final Long2ObjectMap<ObjectSet<akr>> d = new Long2ObjectOpenHashMap();
   final Long2ObjectOpenHashMap<asm<aku<?>>> e = new Long2ObjectOpenHashMap();
   private final aki.a f = new aki.a();
   private final aki.b g = new aki.b(8);
   private final akw h = new akw();
   private final aki.c i = new aki.c(32);
   final Set<ajy> j = Sets.newHashSet();
   final akc k;
   final bfq<akc.a<Runnable>> l;
   final bfq<akc.b> m;
   final LongSet n = new LongOpenHashSet();
   final Executor o;
   private long p;
   private int q = 10;

   protected aki(Executor $$0, Executor $$1) {
      bfq<Runnable> $$2 = bfq.a("player ticket throttler", $$1::execute);
      akc $$3 = new akc(ImmutableList.of($$2), $$0, 4);
      this.k = $$3;
      this.l = $$3.a($$2, true);
      this.m = $$3.a($$2);
      this.o = $$1;
   }

   protected void a() {
      this.p++;
      ObjectIterator<Entry<asm<aku<?>>>> $$0 = this.e.long2ObjectEntrySet().fastIterator();

      while ($$0.hasNext()) {
         Entry<asm<aku<?>>> $$1 = (Entry<asm<aku<?>>>)$$0.next();
         Iterator<aku<?>> $$2 = ((asm)$$1.getValue()).iterator();
         boolean $$3 = false;

         while ($$2.hasNext()) {
            aku<?> $$4 = $$2.next();
            if ($$4.b(this.p)) {
               $$2.remove();
               $$3 = true;
               this.h.b($$1.getLongKey(), $$4);
            }
         }

         if ($$3) {
            this.f.b($$1.getLongKey(), a((asm<aku<?>>)$$1.getValue()), false);
         }

         if (((asm)$$1.getValue()).isEmpty()) {
            $$0.remove();
         }
      }
   }

   private static int a(asm<aku<?>> $$0) {
      return !$$0.isEmpty() ? $$0.b().b() : ajz.a + 1;
   }

   protected abstract boolean a(long var1);

   @Nullable
   protected abstract ajy b(long var1);

   @Nullable
   protected abstract ajy a(long var1, int var3, @Nullable ajy var4, int var5);

   public boolean a(aka $$0) {
      this.g.a();
      this.h.a();
      this.i.a();
      int $$1 = Integer.MAX_VALUE - this.f.a(Integer.MAX_VALUE);
      boolean $$2 = $$1 != 0;
      if ($$2) {
      }

      if (!this.j.isEmpty()) {
         this.j.forEach($$1x -> $$1x.a($$0, this.o));
         this.j.clear();
         return true;
      } else {
         if (!this.n.isEmpty()) {
            LongIterator $$3 = this.n.iterator();

            while ($$3.hasNext()) {
               long $$4 = $$3.nextLong();
               if (this.g($$4).stream().anyMatch($$0x -> $$0x.a() == akv.c)) {
                  ajy $$5 = $$0.a($$4);
                  if ($$5 == null) {
                     throw new IllegalStateException();
                  }

                  CompletableFuture<Either<dhq, ajy.a>> $$6 = $$5.b();
                  $$6.thenAccept($$1x -> this.o.execute(() -> this.m.a(akc.a(() -> {
                        }, $$4, false))));
               }
            }

            this.n.clear();
         }

         return $$2;
      }
   }

   void a(long $$0, aku<?> $$1) {
      asm<aku<?>> $$2 = this.g($$0);
      int $$3 = a($$2);
      aku<?> $$4 = $$2.a($$1);
      $$4.a(this.p);
      if ($$1.b() < $$3) {
         this.f.b($$0, $$1.b(), true);
      }
   }

   void b(long $$0, aku<?> $$1) {
      asm<aku<?>> $$2 = this.g($$0);
      if ($$2.remove($$1)) {
      }

      if ($$2.isEmpty()) {
         this.e.remove($$0);
      }

      this.f.b($$0, a($$2), false);
   }

   public <T> void a(akv<T> $$0, cpc $$1, int $$2, T $$3) {
      this.a($$1.a(), new aku<>($$0, $$2, $$3));
   }

   public <T> void b(akv<T> $$0, cpc $$1, int $$2, T $$3) {
      aku<T> $$4 = new aku<>($$0, $$2, $$3);
      this.b($$1.a(), $$4);
   }

   public <T> void c(akv<T> $$0, cpc $$1, int $$2, T $$3) {
      aku<T> $$4 = new aku<>($$0, ajz.a(akj.b) - $$2, $$3);
      long $$5 = $$1.a();
      this.a($$5, $$4);
      this.h.a($$5, $$4);
   }

   public <T> void d(akv<T> $$0, cpc $$1, int $$2, T $$3) {
      aku<T> $$4 = new aku<>($$0, ajz.a(akj.b) - $$2, $$3);
      long $$5 = $$1.a();
      this.b($$5, $$4);
      this.h.b($$5, $$4);
   }

   private asm<aku<?>> g(long $$0) {
      return (asm<aku<?>>)this.e.computeIfAbsent($$0, $$0x -> asm.a(4));
   }

   protected void a(cpc $$0, boolean $$1) {
      aku<cpc> $$2 = new aku<>(akv.d, aka.c, $$0);
      long $$3 = $$0.a();
      if ($$1) {
         this.a($$3, $$2);
         this.h.a($$3, $$2);
      } else {
         this.b($$3, $$2);
         this.h.b($$3, $$2);
      }
   }

   public void a(hw $$0, akr $$1) {
      cpc $$2 = $$0.r();
      long $$3 = $$2.a();
      ((ObjectSet)this.d.computeIfAbsent($$3, $$0x -> new ObjectOpenHashSet())).add($$1);
      this.g.b($$3, 0, true);
      this.i.b($$3, 0, true);
      this.h.a(akv.c, $$2, this.g(), $$2);
   }

   public void b(hw $$0, akr $$1) {
      cpc $$2 = $$0.r();
      long $$3 = $$2.a();
      ObjectSet<akr> $$4 = (ObjectSet<akr>)this.d.get($$3);
      $$4.remove($$1);
      if ($$4.isEmpty()) {
         this.d.remove($$3);
         this.g.b($$3, Integer.MAX_VALUE, false);
         this.i.b($$3, Integer.MAX_VALUE, false);
         this.h.b(akv.c, $$2, this.g(), $$2);
      }
   }

   private int g() {
      return Math.max(0, ajz.a(akj.d) - this.q);
   }

   public boolean c(long $$0) {
      return ajz.c(this.h.c($$0));
   }

   public boolean d(long $$0) {
      return ajz.d(this.h.c($$0));
   }

   protected String e(long $$0) {
      asm<aku<?>> $$1 = (asm<aku<?>>)this.e.get($$0);
      return $$1 != null && !$$1.isEmpty() ? $$1.b().toString() : "no_ticket";
   }

   protected void a(int $$0) {
      this.i.a($$0);
   }

   public void b(int $$0) {
      if ($$0 != this.q) {
         this.q = $$0;
         this.h.a(this.g());
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

   public String c() {
      return this.k.b();
   }

   private void a(String $$0) {
      try (FileOutputStream $$1 = new FileOutputStream(new File($$0))) {
         ObjectIterator var3 = this.e.long2ObjectEntrySet().iterator();

         while (var3.hasNext()) {
            Entry<asm<aku<?>>> $$2 = (Entry<asm<aku<?>>>)var3.next();
            cpc $$3 = new cpc($$2.getLongKey());

            for (aku<?> $$4 : (asm)$$2.getValue()) {
               $$1.write(($$3.e + "\t" + $$3.f + "\t" + $$4.a() + "\t" + $$4.b() + "\t\n").getBytes(StandardCharsets.UTF_8));
            }
         }
      } catch (IOException var10) {
         a.error("Failed to dump tickets to {}", $$0, var10);
      }
   }

   @VisibleForTesting
   akw d() {
      return this.h;
   }

   public void e() {
      ImmutableSet<akv<?>> $$0 = ImmutableSet.of(akv.h, akv.g, akv.e);
      ObjectIterator<Entry<asm<aku<?>>>> $$1 = this.e.long2ObjectEntrySet().fastIterator();

      while ($$1.hasNext()) {
         Entry<asm<aku<?>>> $$2 = (Entry<asm<aku<?>>>)$$1.next();
         Iterator<aku<?>> $$3 = ((asm)$$2.getValue()).iterator();
         boolean $$4 = false;

         while ($$3.hasNext()) {
            aku<?> $$5 = $$3.next();
            if (!$$0.contains($$5.a())) {
               $$3.remove();
               $$4 = true;
               this.h.b($$2.getLongKey(), $$5);
            }
         }

         if ($$4) {
            this.f.b($$2.getLongKey(), a((asm<aku<?>>)$$2.getValue()), false);
         }

         if (((asm)$$2.getValue()).isEmpty()) {
            $$1.remove();
         }
      }
   }

   public boolean f() {
      return !this.e.isEmpty();
   }

   class a extends akd {
      private static final int b = ajz.a + 1;

      public a() {
         super(b + 1, 16, 256);
      }

      @Override
      protected int b(long $$0) {
         asm<aku<?>> $$1 = (asm<aku<?>>)aki.this.e.get($$0);
         if ($$1 == null) {
            return Integer.MAX_VALUE;
         } else {
            return $$1.isEmpty() ? Integer.MAX_VALUE : $$1.b().b();
         }
      }

      @Override
      protected int c(long $$0) {
         if (!aki.this.a($$0)) {
            ajy $$1 = aki.this.b($$0);
            if ($$1 != null) {
               return $$1.m();
            }
         }

         return b;
      }

      @Override
      protected void a(long $$0, int $$1) {
         ajy $$2 = aki.this.b($$0);
         int $$3 = $$2 == null ? b : $$2.m();
         if ($$3 != $$1) {
            $$2 = aki.this.a($$0, $$1, $$2, $$3);
            if ($$2 != null) {
               aki.this.j.add($$2);
            }
         }
      }

      public int a(int $$0) {
         return this.b($$0);
      }
   }

   class b extends akd {
      protected final Long2ByteMap a = new Long2ByteOpenHashMap();
      protected final int b;

      protected b(int $$0) {
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
         ObjectSet<akr> $$1 = (ObjectSet<akr>)aki.this.d.get($$0);
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
               cpc $$3 = new cpc($$2.getLongKey());
               String $$4 = Byte.toString($$2.getByteValue());
               $$1.write(($$3.e + "\t" + $$3.f + "\t" + $$4 + "\n").getBytes(StandardCharsets.UTF_8));
            }
         } catch (IOException var9) {
            aki.a.error("Failed to dump chunks to {}", $$0, var9);
         }
      }
   }

   class c extends aki.b {
      private int g;
      private final Long2IntMap h = Long2IntMaps.synchronize(new Long2IntOpenHashMap());
      private final LongSet i = new LongOpenHashSet();

      protected c(int $$0) {
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
            aku<?> $$4 = new aku<>(akv.c, aki.b, new cpc($$0));
            if ($$3) {
               aki.this.l.a(akc.a(() -> aki.this.o.execute(() -> {
                     if (this.c(this.c($$0))) {
                        aki.this.a($$0, $$4);
                        aki.this.n.add($$0);
                     } else {
                        aki.this.m.a(akc.a(() -> {
                        }, $$0, false));
                     }
                  }), $$0, () -> $$1));
            } else {
               aki.this.m.a(akc.a(() -> aki.this.o.execute(() -> aki.this.b($$0, $$4)), $$0, true));
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
                  aki.this.k.onLevelChange(new cpc($$1), () -> this.h.get($$1), $$3, $$1x -> {
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
