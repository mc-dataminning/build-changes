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

public abstract class aoo {
   static final Logger a = LogUtils.getLogger();
   static final int b = aof.a(aop.d);
   private static final int c = 4;
   final Long2ObjectMap<ObjectSet<aox>> d = new Long2ObjectOpenHashMap();
   final Long2ObjectOpenHashMap<awz<apa<?>>> e = new Long2ObjectOpenHashMap();
   private final aoo.a f = new aoo.a();
   private final aoo.b g = new aoo.b(8);
   private final apc h = new apc();
   private final aoo.c i = new aoo.c(32);
   final Set<aoe> j = Sets.newHashSet();
   final aoi k;
   final bko<aoi.a<Runnable>> l;
   final bko<aoi.b> m;
   final LongSet n = new LongOpenHashSet();
   final Executor o;
   private long p;
   private int q = 10;

   protected aoo(Executor $$0, Executor $$1) {
      bko<Runnable> $$2 = bko.a("player ticket throttler", $$1::execute);
      aoi $$3 = new aoi(ImmutableList.of($$2), $$0, 4);
      this.k = $$3;
      this.l = $$3.a($$2, true);
      this.m = $$3.a($$2);
      this.o = $$1;
   }

   protected void a() {
      this.p++;
      ObjectIterator<Entry<awz<apa<?>>>> $$0 = this.e.long2ObjectEntrySet().fastIterator();

      while ($$0.hasNext()) {
         Entry<awz<apa<?>>> $$1 = (Entry<awz<apa<?>>>)$$0.next();
         Iterator<apa<?>> $$2 = ((awz)$$1.getValue()).iterator();
         boolean $$3 = false;

         while ($$2.hasNext()) {
            apa<?> $$4 = $$2.next();
            if ($$4.b(this.p)) {
               $$2.remove();
               $$3 = true;
               this.h.b($$1.getLongKey(), $$4);
            }
         }

         if ($$3) {
            this.f.b($$1.getLongKey(), a((awz<apa<?>>)$$1.getValue()), false);
         }

         if (((awz)$$1.getValue()).isEmpty()) {
            $$0.remove();
         }
      }
   }

   private static int a(awz<apa<?>> $$0) {
      return !$$0.isEmpty() ? $$0.b().b() : aof.a + 1;
   }

   protected abstract boolean a(long var1);

   @Nullable
   protected abstract aoe b(long var1);

   @Nullable
   protected abstract aoe a(long var1, int var3, @Nullable aoe var4, int var5);

   public boolean a(aog $$0) {
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
               if (this.g($$4).stream().anyMatch($$0x -> $$0x.a() == apb.c)) {
                  aoe $$5 = $$0.a($$4);
                  if ($$5 == null) {
                     throw new IllegalStateException();
                  }

                  CompletableFuture<Either<dnq, aoe.a>> $$6 = $$5.b();
                  $$6.thenAccept($$1x -> this.o.execute(() -> this.m.a(aoi.a(() -> {
                        }, $$4, false))));
               }
            }

            this.n.clear();
         }

         return $$2;
      }
   }

   void a(long $$0, apa<?> $$1) {
      awz<apa<?>> $$2 = this.g($$0);
      int $$3 = a($$2);
      apa<?> $$4 = $$2.a($$1);
      $$4.a(this.p);
      if ($$1.b() < $$3) {
         this.f.b($$0, $$1.b(), true);
      }
   }

   void b(long $$0, apa<?> $$1) {
      awz<apa<?>> $$2 = this.g($$0);
      if ($$2.remove($$1)) {
      }

      if ($$2.isEmpty()) {
         this.e.remove($$0);
      }

      this.f.b($$0, a($$2), false);
   }

   public <T> void a(apb<T> $$0, cuy $$1, int $$2, T $$3) {
      this.a($$1.a(), new apa<>($$0, $$2, $$3));
   }

   public <T> void b(apb<T> $$0, cuy $$1, int $$2, T $$3) {
      apa<T> $$4 = new apa<>($$0, $$2, $$3);
      this.b($$1.a(), $$4);
   }

   public <T> void c(apb<T> $$0, cuy $$1, int $$2, T $$3) {
      apa<T> $$4 = new apa<>($$0, aof.a(aop.b) - $$2, $$3);
      long $$5 = $$1.a();
      this.a($$5, $$4);
      this.h.a($$5, $$4);
   }

   public <T> void d(apb<T> $$0, cuy $$1, int $$2, T $$3) {
      apa<T> $$4 = new apa<>($$0, aof.a(aop.b) - $$2, $$3);
      long $$5 = $$1.a();
      this.b($$5, $$4);
      this.h.b($$5, $$4);
   }

   private awz<apa<?>> g(long $$0) {
      return (awz<apa<?>>)this.e.computeIfAbsent($$0, $$0x -> awz.a(4));
   }

   protected void a(cuy $$0, boolean $$1) {
      apa<cuy> $$2 = new apa<>(apb.d, aog.c, $$0);
      long $$3 = $$0.a();
      if ($$1) {
         this.a($$3, $$2);
         this.h.a($$3, $$2);
      } else {
         this.b($$3, $$2);
         this.h.b($$3, $$2);
      }
   }

   public void a(jb $$0, aox $$1) {
      cuy $$2 = $$0.r();
      long $$3 = $$2.a();
      ((ObjectSet)this.d.computeIfAbsent($$3, $$0x -> new ObjectOpenHashSet())).add($$1);
      this.g.b($$3, 0, true);
      this.i.b($$3, 0, true);
      this.h.a(apb.c, $$2, this.g(), $$2);
   }

   public void b(jb $$0, aox $$1) {
      cuy $$2 = $$0.r();
      long $$3 = $$2.a();
      ObjectSet<aox> $$4 = (ObjectSet<aox>)this.d.get($$3);
      $$4.remove($$1);
      if ($$4.isEmpty()) {
         this.d.remove($$3);
         this.g.b($$3, Integer.MAX_VALUE, false);
         this.i.b($$3, Integer.MAX_VALUE, false);
         this.h.b(apb.c, $$2, this.g(), $$2);
      }
   }

   private int g() {
      return Math.max(0, aof.a(aop.d) - this.q);
   }

   public boolean c(long $$0) {
      return aof.c(this.h.c($$0));
   }

   public boolean d(long $$0) {
      return aof.d(this.h.c($$0));
   }

   protected String e(long $$0) {
      awz<apa<?>> $$1 = (awz<apa<?>>)this.e.get($$0);
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
            Entry<awz<apa<?>>> $$2 = (Entry<awz<apa<?>>>)var3.next();
            cuy $$3 = new cuy($$2.getLongKey());

            for (apa<?> $$4 : (awz)$$2.getValue()) {
               $$1.write(($$3.e + "\t" + $$3.f + "\t" + $$4.a() + "\t" + $$4.b() + "\t\n").getBytes(StandardCharsets.UTF_8));
            }
         }
      } catch (IOException var10) {
         a.error("Failed to dump tickets to {}", $$0, var10);
      }
   }

   @VisibleForTesting
   apc d() {
      return this.h;
   }

   public void e() {
      ImmutableSet<apb<?>> $$0 = ImmutableSet.of(apb.h, apb.g, apb.e);
      ObjectIterator<Entry<awz<apa<?>>>> $$1 = this.e.long2ObjectEntrySet().fastIterator();

      while ($$1.hasNext()) {
         Entry<awz<apa<?>>> $$2 = (Entry<awz<apa<?>>>)$$1.next();
         Iterator<apa<?>> $$3 = ((awz)$$2.getValue()).iterator();
         boolean $$4 = false;

         while ($$3.hasNext()) {
            apa<?> $$5 = $$3.next();
            if (!$$0.contains($$5.a())) {
               $$3.remove();
               $$4 = true;
               this.h.b($$2.getLongKey(), $$5);
            }
         }

         if ($$4) {
            this.f.b($$2.getLongKey(), a((awz<apa<?>>)$$2.getValue()), false);
         }

         if (((awz)$$2.getValue()).isEmpty()) {
            $$1.remove();
         }
      }
   }

   public boolean f() {
      return !this.e.isEmpty();
   }

   class a extends aoj {
      private static final int b = aof.a + 1;

      public a() {
         super(b + 1, 16, 256);
      }

      @Override
      protected int b(long $$0) {
         awz<apa<?>> $$1 = (awz<apa<?>>)aoo.this.e.get($$0);
         if ($$1 == null) {
            return Integer.MAX_VALUE;
         } else {
            return $$1.isEmpty() ? Integer.MAX_VALUE : $$1.b().b();
         }
      }

      @Override
      protected int c(long $$0) {
         if (!aoo.this.a($$0)) {
            aoe $$1 = aoo.this.b($$0);
            if ($$1 != null) {
               return $$1.m();
            }
         }

         return b;
      }

      @Override
      protected void a(long $$0, int $$1) {
         aoe $$2 = aoo.this.b($$0);
         int $$3 = $$2 == null ? b : $$2.m();
         if ($$3 != $$1) {
            $$2 = aoo.this.a($$0, $$1, $$2, $$3);
            if ($$2 != null) {
               aoo.this.j.add($$2);
            }
         }
      }

      public int a(int $$0) {
         return this.b($$0);
      }
   }

   class b extends aoj {
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
         ObjectSet<aox> $$1 = (ObjectSet<aox>)aoo.this.d.get($$0);
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
               cuy $$3 = new cuy($$2.getLongKey());
               String $$4 = Byte.toString($$2.getByteValue());
               $$1.write(($$3.e + "\t" + $$3.f + "\t" + $$4 + "\n").getBytes(StandardCharsets.UTF_8));
            }
         } catch (IOException var9) {
            aoo.a.error("Failed to dump chunks to {}", $$0, var9);
         }
      }
   }

   class c extends aoo.b {
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
            apa<?> $$4 = new apa<>(apb.c, aoo.b, new cuy($$0));
            if ($$3) {
               aoo.this.l.a(aoi.a(() -> aoo.this.o.execute(() -> {
                     if (this.c(this.c($$0))) {
                        aoo.this.a($$0, $$4);
                        aoo.this.n.add($$0);
                     } else {
                        aoo.this.m.a(aoi.a(() -> {
                        }, $$0, false));
                     }
                  }), $$0, () -> $$1));
            } else {
               aoo.this.m.a(aoi.a(() -> aoo.this.o.execute(() -> aoo.this.b($$0, $$4)), $$0, true));
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
                  aoo.this.k.onLevelChange(new cuy($$1), () -> this.h.get($$1), $$3, $$1x -> {
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
