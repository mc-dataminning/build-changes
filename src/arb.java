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

public abstract class arb {
   static final Logger a = LogUtils.getLogger();
   static final int b = aqr.a(arc.d);
   private static final int c = 4;
   final Long2ObjectMap<ObjectSet<arn>> d = new Long2ObjectOpenHashMap();
   final Long2ObjectOpenHashMap<bab<arr<?>>> e = new Long2ObjectOpenHashMap();
   private final arb.a f = new arb.a();
   private final arb.b g = new arb.b(8);
   private final art h = new art();
   private final arb.c i = new arb.c(32);
   final Set<aqq> j = new ReferenceOpenHashSet();
   final arq k;
   final LongSet l = new LongOpenHashSet();
   final Executor m;
   private long n;
   private int o = 10;

   protected arb(Executor $$0, Executor $$1) {
      bqt<Runnable> $$2 = bqt.a("player ticket throttler", $$1);
      this.k = new arq($$2, $$0, 4);
      this.m = $$1;
   }

   protected void a() {
      this.n++;
      ObjectIterator<Entry<bab<arr<?>>>> $$0 = this.e.long2ObjectEntrySet().fastIterator();

      while ($$0.hasNext()) {
         Entry<bab<arr<?>>> $$1 = (Entry<bab<arr<?>>>)$$0.next();
         Iterator<arr<?>> $$2 = ((bab)$$1.getValue()).iterator();
         boolean $$3 = false;

         while ($$2.hasNext()) {
            arr<?> $$4 = $$2.next();
            if ($$4.b(this.n)) {
               $$2.remove();
               $$3 = true;
               this.h.b($$1.getLongKey(), $$4);
            }
         }

         if ($$3) {
            this.f.b($$1.getLongKey(), a((bab<arr<?>>)$$1.getValue()), false);
         }

         if (((bab)$$1.getValue()).isEmpty()) {
            $$0.remove();
         }
      }
   }

   private static int a(bab<arr<?>> $$0) {
      return !$$0.isEmpty() ? $$0.b().b() : aqr.b + 1;
   }

   protected abstract boolean a(long var1);

   @Nullable
   protected abstract aqq b(long var1);

   @Nullable
   protected abstract aqq a(long var1, int var3, @Nullable aqq var4, int var5);

   public boolean a(aqs $$0) {
      this.g.a();
      this.h.b();
      this.i.a();
      int $$1 = Integer.MAX_VALUE - this.f.a(Integer.MAX_VALUE);
      boolean $$2 = $$1 != 0;
      if ($$2) {
      }

      if (!this.j.isEmpty()) {
         for (aqq $$3 : this.j) {
            $$3.a($$0);
         }

         for (aqq $$4 : this.j) {
            $$4.a($$0, this.m);
         }

         this.j.clear();
         return true;
      } else {
         if (!this.l.isEmpty()) {
            LongIterator $$5 = this.l.iterator();

            while ($$5.hasNext()) {
               long $$6 = $$5.nextLong();
               if (this.g($$6).stream().anyMatch($$0x -> $$0x.a() == ars.c)) {
                  aqq $$7 = $$0.a($$6);
                  if ($$7 == null) {
                     throw new IllegalStateException();
                  }

                  CompletableFuture<aqt<dxj>> $$8 = $$7.b();
                  $$8.thenAccept($$1x -> this.m.execute(() -> this.k.a($$6, () -> {
                        }, false)));
               }
            }

            this.l.clear();
         }

         return $$2;
      }
   }

   void a(long $$0, arr<?> $$1) {
      bab<arr<?>> $$2 = this.g($$0);
      int $$3 = a($$2);
      arr<?> $$4 = $$2.a($$1);
      $$4.a(this.n);
      if ($$1.b() < $$3) {
         this.f.b($$0, $$1.b(), true);
      }
   }

   void b(long $$0, arr<?> $$1) {
      bab<arr<?>> $$2 = this.g($$0);
      if ($$2.remove($$1)) {
      }

      if ($$2.isEmpty()) {
         this.e.remove($$0);
      }

      this.f.b($$0, a($$2), false);
   }

   public <T> void a(ars<T> $$0, deb $$1, int $$2, T $$3) {
      this.a($$1.a(), new arr<>($$0, $$2, $$3));
   }

   public <T> void b(ars<T> $$0, deb $$1, int $$2, T $$3) {
      arr<T> $$4 = new arr<>($$0, $$2, $$3);
      this.b($$1.a(), $$4);
   }

   public <T> void c(ars<T> $$0, deb $$1, int $$2, T $$3) {
      arr<T> $$4 = new arr<>($$0, aqr.a(arc.b) - $$2, $$3);
      long $$5 = $$1.a();
      this.a($$5, $$4);
      this.h.a($$5, $$4);
   }

   public <T> void d(ars<T> $$0, deb $$1, int $$2, T $$3) {
      arr<T> $$4 = new arr<>($$0, aqr.a(arc.b) - $$2, $$3);
      long $$5 = $$1.a();
      this.b($$5, $$4);
      this.h.b($$5, $$4);
   }

   private bab<arr<?>> g(long $$0) {
      return (bab<arr<?>>)this.e.computeIfAbsent($$0, $$0x -> bab.a(4));
   }

   protected void a(deb $$0, boolean $$1) {
      arr<deb> $$2 = new arr<>(ars.d, aqs.c, $$0);
      long $$3 = $$0.a();
      if ($$1) {
         this.a($$3, $$2);
         this.h.a($$3, $$2);
      } else {
         this.b($$3, $$2);
         this.h.b($$3, $$2);
      }
   }

   public void a(ki $$0, arn $$1) {
      deb $$2 = $$0.r();
      long $$3 = $$2.a();
      ((ObjectSet)this.d.computeIfAbsent($$3, $$0x -> new ObjectOpenHashSet())).add($$1);
      this.g.b($$3, 0, true);
      this.i.b($$3, 0, true);
      this.h.a(ars.c, $$2, this.i(), $$2);
   }

   public void b(ki $$0, arn $$1) {
      deb $$2 = $$0.r();
      long $$3 = $$2.a();
      ObjectSet<arn> $$4 = (ObjectSet<arn>)this.d.get($$3);
      $$4.remove($$1);
      if ($$4.isEmpty()) {
         this.d.remove($$3);
         this.g.b($$3, Integer.MAX_VALUE, false);
         this.i.b($$3, Integer.MAX_VALUE, false);
         this.h.b(ars.c, $$2, this.i(), $$2);
      }
   }

   private int i() {
      return Math.max(0, aqr.a(arc.d) - this.o);
   }

   public boolean c(long $$0) {
      return aqr.d(this.h.c($$0));
   }

   public boolean d(long $$0) {
      return aqr.e(this.h.c($$0));
   }

   protected String e(long $$0) {
      bab<arr<?>> $$1 = (bab<arr<?>>)this.e.get($$0);
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
            Entry<bab<arr<?>>> $$2 = (Entry<bab<arr<?>>>)var3.next();
            deb $$3 = new deb($$2.getLongKey());

            for (arr<?> $$4 : (bab)$$2.getValue()) {
               $$1.write(($$3.e + "\t" + $$3.f + "\t" + $$4.a() + "\t" + $$4.b() + "\t\n").getBytes(StandardCharsets.UTF_8));
            }
         }
      } catch (IOException var10) {
         a.error("Failed to dump tickets to {}", $$0, var10);
      }
   }

   @VisibleForTesting
   art e() {
      return this.h;
   }

   public LongSet f() {
      return this.h.a();
   }

   public void g() {
      ImmutableSet<ars<?>> $$0 = ImmutableSet.of(ars.g, ars.f);
      ObjectIterator<Entry<bab<arr<?>>>> $$1 = this.e.long2ObjectEntrySet().fastIterator();

      while ($$1.hasNext()) {
         Entry<bab<arr<?>>> $$2 = (Entry<bab<arr<?>>>)$$1.next();
         Iterator<arr<?>> $$3 = ((bab)$$2.getValue()).iterator();
         boolean $$4 = false;

         while ($$3.hasNext()) {
            arr<?> $$5 = $$3.next();
            if (!$$0.contains($$5.a())) {
               $$3.remove();
               $$4 = true;
               this.h.b($$2.getLongKey(), $$5);
            }
         }

         if ($$4) {
            this.f.b($$2.getLongKey(), a((bab<arr<?>>)$$2.getValue()), false);
         }

         if (((bab)$$2.getValue()).isEmpty()) {
            $$1.remove();
         }
      }
   }

   public boolean h() {
      return !this.e.isEmpty();
   }

   class a extends aqw {
      private static final int b = aqr.b + 1;

      public a() {
         super(b + 1, 16, 256);
      }

      @Override
      protected int b(long $$0) {
         bab<arr<?>> $$1 = (bab<arr<?>>)arb.this.e.get($$0);
         if ($$1 == null) {
            return Integer.MAX_VALUE;
         } else {
            return $$1.isEmpty() ? Integer.MAX_VALUE : $$1.b().b();
         }
      }

      @Override
      protected int c(long $$0) {
         if (!arb.this.a($$0)) {
            aqq $$1 = arb.this.b($$0);
            if ($$1 != null) {
               return $$1.i();
            }
         }

         return b;
      }

      @Override
      protected void a(long $$0, int $$1) {
         aqq $$2 = arb.this.b($$0);
         int $$3 = $$2 == null ? b : $$2.i();
         if ($$3 != $$1) {
            $$2 = arb.this.a($$0, $$1, $$2, $$3);
            if ($$2 != null) {
               arb.this.j.add($$2);
            }
         }
      }

      public int a(int $$0) {
         return this.b($$0);
      }
   }

   class b extends aqw {
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
         ObjectSet<arn> $$1 = (ObjectSet<arn>)arb.this.d.get($$0);
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
               deb $$3 = new deb($$2.getLongKey());
               String $$4 = Byte.toString($$2.getByteValue());
               $$1.write(($$3.e + "\t" + $$3.f + "\t" + $$4 + "\n").getBytes(StandardCharsets.UTF_8));
            }
         } catch (IOException var9) {
            arb.a.error("Failed to dump chunks to {}", $$0, var9);
         }
      }
   }

   class c extends arb.b {
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
            arr<?> $$4 = new arr<>(ars.c, arb.b, new deb($$0));
            if ($$3) {
               arb.this.k.a(() -> arb.this.m.execute(() -> {
                     if (this.c(this.c($$0))) {
                        arb.this.a($$0, $$4);
                        arb.this.l.add($$0);
                     } else {
                        arb.this.k.a($$0, () -> {
                        }, false);
                     }
                  }), $$0, () -> $$1);
            } else {
               arb.this.k.a($$0, () -> arb.this.m.execute(() -> arb.this.b($$0, $$4)), true);
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
                  arb.this.k.onLevelChange(new deb($$1), () -> this.h.get($$1), $$3, $$1x -> {
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
