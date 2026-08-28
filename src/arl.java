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

public abstract class arl {
   static final Logger a = LogUtils.getLogger();
   static final int b = arb.a(arm.d);
   private static final int c = 4;
   final Long2ObjectMap<ObjectSet<ary>> d = new Long2ObjectOpenHashMap();
   final Long2ObjectOpenHashMap<bam<asc<?>>> e = new Long2ObjectOpenHashMap();
   private final arl.a f = new arl.a();
   private final arl.b g = new arl.b(8);
   private final ase h = new ase();
   private final arl.c i = new arl.c(32);
   final Set<ara> j = new ReferenceOpenHashSet();
   final asb k;
   final LongSet l = new LongOpenHashSet();
   final Executor m;
   private long n;
   private int o = 10;

   protected arl(Executor $$0, Executor $$1) {
      brv<Runnable> $$2 = brv.a("player ticket throttler", $$1);
      this.k = new asb($$2, $$0, 4);
      this.m = $$1;
   }

   protected void a() {
      this.n++;
      ObjectIterator<Entry<bam<asc<?>>>> $$0 = this.e.long2ObjectEntrySet().fastIterator();

      while ($$0.hasNext()) {
         Entry<bam<asc<?>>> $$1 = (Entry<bam<asc<?>>>)$$0.next();
         Iterator<asc<?>> $$2 = ((bam)$$1.getValue()).iterator();
         boolean $$3 = false;

         while ($$2.hasNext()) {
            asc<?> $$4 = $$2.next();
            if ($$4.b(this.n)) {
               $$2.remove();
               $$3 = true;
               this.h.b($$1.getLongKey(), $$4);
            }
         }

         if ($$3) {
            this.f.b($$1.getLongKey(), a((bam<asc<?>>)$$1.getValue()), false);
         }

         if (((bam)$$1.getValue()).isEmpty()) {
            $$0.remove();
         }
      }
   }

   private static int a(bam<asc<?>> $$0) {
      return !$$0.isEmpty() ? $$0.b().b() : arb.b + 1;
   }

   protected abstract boolean a(long var1);

   @Nullable
   protected abstract ara b(long var1);

   @Nullable
   protected abstract ara a(long var1, int var3, @Nullable ara var4, int var5);

   public boolean a(arc $$0) {
      this.g.a();
      this.h.b();
      this.i.a();
      int $$1 = Integer.MAX_VALUE - this.f.a(Integer.MAX_VALUE);
      boolean $$2 = $$1 != 0;
      if ($$2) {
      }

      if (!this.j.isEmpty()) {
         for (ara $$3 : this.j) {
            $$3.a($$0);
         }

         for (ara $$4 : this.j) {
            $$4.a($$0, this.m);
         }

         this.j.clear();
         return true;
      } else {
         if (!this.l.isEmpty()) {
            LongIterator $$5 = this.l.iterator();

            while ($$5.hasNext()) {
               long $$6 = $$5.nextLong();
               if (this.g($$6).stream().anyMatch($$0x -> $$0x.a() == asd.c)) {
                  ara $$7 = $$0.a($$6);
                  if ($$7 == null) {
                     throw new IllegalStateException();
                  }

                  CompletableFuture<ard<dzt>> $$8 = $$7.b();
                  $$8.thenAccept($$1x -> this.m.execute(() -> this.k.a($$6, () -> {
                        }, false)));
               }
            }

            this.l.clear();
         }

         return $$2;
      }
   }

   void a(long $$0, asc<?> $$1) {
      bam<asc<?>> $$2 = this.g($$0);
      int $$3 = a($$2);
      asc<?> $$4 = $$2.a($$1);
      $$4.a(this.n);
      if ($$1.b() < $$3) {
         this.f.b($$0, $$1.b(), true);
      }
   }

   void b(long $$0, asc<?> $$1) {
      bam<asc<?>> $$2 = this.g($$0);
      if ($$2.remove($$1)) {
      }

      if ($$2.isEmpty()) {
         this.e.remove($$0);
      }

      this.f.b($$0, a($$2), false);
   }

   public <T> void a(asd<T> $$0, dgf $$1, int $$2, T $$3) {
      this.a($$1.a(), new asc<>($$0, $$2, $$3));
   }

   public <T> void b(asd<T> $$0, dgf $$1, int $$2, T $$3) {
      asc<T> $$4 = new asc<>($$0, $$2, $$3);
      this.b($$1.a(), $$4);
   }

   public <T> void c(asd<T> $$0, dgf $$1, int $$2, T $$3) {
      asc<T> $$4 = new asc<>($$0, arb.a(arm.b) - $$2, $$3);
      long $$5 = $$1.a();
      this.a($$5, $$4);
      this.h.a($$5, $$4);
   }

   public <T> void d(asd<T> $$0, dgf $$1, int $$2, T $$3) {
      asc<T> $$4 = new asc<>($$0, arb.a(arm.b) - $$2, $$3);
      long $$5 = $$1.a();
      this.b($$5, $$4);
      this.h.b($$5, $$4);
   }

   private bam<asc<?>> g(long $$0) {
      return (bam<asc<?>>)this.e.computeIfAbsent($$0, $$0x -> bam.a(4));
   }

   protected void a(dgf $$0, boolean $$1) {
      asc<dgf> $$2 = new asc<>(asd.d, arc.c, $$0);
      long $$3 = $$0.a();
      if ($$1) {
         this.a($$3, $$2);
         this.h.a($$3, $$2);
      } else {
         this.b($$3, $$2);
         this.h.b($$3, $$2);
      }
   }

   public void a(kj $$0, ary $$1) {
      dgf $$2 = $$0.r();
      long $$3 = $$2.a();
      ((ObjectSet)this.d.computeIfAbsent($$3, $$0x -> new ObjectOpenHashSet())).add($$1);
      this.g.b($$3, 0, true);
      this.i.b($$3, 0, true);
      this.h.a(asd.c, $$2, this.i(), $$2);
   }

   public void b(kj $$0, ary $$1) {
      dgf $$2 = $$0.r();
      long $$3 = $$2.a();
      ObjectSet<ary> $$4 = (ObjectSet<ary>)this.d.get($$3);
      $$4.remove($$1);
      if ($$4.isEmpty()) {
         this.d.remove($$3);
         this.g.b($$3, Integer.MAX_VALUE, false);
         this.i.b($$3, Integer.MAX_VALUE, false);
         this.h.b(asd.c, $$2, this.i(), $$2);
      }
   }

   private int i() {
      return Math.max(0, arb.a(arm.d) - this.o);
   }

   public boolean c(long $$0) {
      return arb.d(this.h.c($$0));
   }

   public boolean d(long $$0) {
      return arb.e(this.h.c($$0));
   }

   protected String e(long $$0) {
      bam<asc<?>> $$1 = (bam<asc<?>>)this.e.get($$0);
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
            Entry<bam<asc<?>>> $$2 = (Entry<bam<asc<?>>>)var3.next();
            dgf $$3 = new dgf($$2.getLongKey());

            for (asc<?> $$4 : (bam)$$2.getValue()) {
               $$1.write(($$3.h + "\t" + $$3.i + "\t" + $$4.a() + "\t" + $$4.b() + "\t\n").getBytes(StandardCharsets.UTF_8));
            }
         }
      } catch (IOException var10) {
         a.error("Failed to dump tickets to {}", $$0, var10);
      }
   }

   @VisibleForTesting
   ase e() {
      return this.h;
   }

   public LongSet f() {
      return this.h.a();
   }

   public void g() {
      ImmutableSet<asd<?>> $$0 = ImmutableSet.of(asd.g);
      ObjectIterator<Entry<bam<asc<?>>>> $$1 = this.e.long2ObjectEntrySet().fastIterator();

      while ($$1.hasNext()) {
         Entry<bam<asc<?>>> $$2 = (Entry<bam<asc<?>>>)$$1.next();
         Iterator<asc<?>> $$3 = ((bam)$$2.getValue()).iterator();
         boolean $$4 = false;

         while ($$3.hasNext()) {
            asc<?> $$5 = $$3.next();
            if (!$$0.contains($$5.a())) {
               $$3.remove();
               $$4 = true;
               this.h.b($$2.getLongKey(), $$5);
            }
         }

         if ($$4) {
            this.f.b($$2.getLongKey(), a((bam<asc<?>>)$$2.getValue()), false);
         }

         if (((bam)$$2.getValue()).isEmpty()) {
            $$1.remove();
         }
      }
   }

   public boolean h() {
      return !this.e.isEmpty();
   }

   class a extends arg {
      private static final int b = arb.b + 1;

      public a() {
         super(b + 1, 16, 256);
      }

      @Override
      protected int b(long $$0) {
         bam<asc<?>> $$1 = (bam<asc<?>>)arl.this.e.get($$0);
         if ($$1 == null) {
            return Integer.MAX_VALUE;
         } else {
            return $$1.isEmpty() ? Integer.MAX_VALUE : $$1.b().b();
         }
      }

      @Override
      protected int c(long $$0) {
         if (!arl.this.a($$0)) {
            ara $$1 = arl.this.b($$0);
            if ($$1 != null) {
               return $$1.j();
            }
         }

         return b;
      }

      @Override
      protected void a(long $$0, int $$1) {
         ara $$2 = arl.this.b($$0);
         int $$3 = $$2 == null ? b : $$2.j();
         if ($$3 != $$1) {
            $$2 = arl.this.a($$0, $$1, $$2, $$3);
            if ($$2 != null) {
               arl.this.j.add($$2);
            }
         }
      }

      public int a(int $$0) {
         return this.b($$0);
      }
   }

   class b extends arg {
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
         ObjectSet<ary> $$1 = (ObjectSet<ary>)arl.this.d.get($$0);
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
               dgf $$3 = new dgf($$2.getLongKey());
               String $$4 = Byte.toString($$2.getByteValue());
               $$1.write(($$3.h + "\t" + $$3.i + "\t" + $$4 + "\n").getBytes(StandardCharsets.UTF_8));
            }
         } catch (IOException var9) {
            arl.a.error("Failed to dump chunks to {}", $$0, var9);
         }
      }
   }

   class c extends arl.b {
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
            asc<?> $$4 = new asc<>(asd.c, arl.b, new dgf($$0));
            if ($$3) {
               arl.this.k.a(() -> arl.this.m.execute(() -> {
                     if (this.c(this.c($$0))) {
                        arl.this.a($$0, $$4);
                        arl.this.l.add($$0);
                     } else {
                        arl.this.k.a($$0, () -> {
                        }, false);
                     }
                  }), $$0, () -> $$1);
            } else {
               arl.this.k.a($$0, () -> arl.this.m.execute(() -> arl.this.b($$0, $$4)), true);
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
                  arl.this.k.onLevelChange(new dgf($$1), () -> this.h.get($$1), $$3, $$1x -> {
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
