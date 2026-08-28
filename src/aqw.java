import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.google.common.collect.Sets;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.slf4j.Logger;

public class aqw extends dyt implements aqu.b, arh {
   private static final aqx<List<dxj>> f = aqx.a("Unloaded chunks found in range");
   private static final CompletableFuture<aqx<List<dxj>>> g = CompletableFuture.completedFuture(f);
   private static final byte h = -1;
   private static final byte i = 0;
   private static final byte j = 1;
   private static final Logger k = LogUtils.getLogger();
   private static final int l = 200;
   private static final int m = 20;
   private static final int n = 10000;
   public static final int a = 2;
   public static final int b = 32;
   public static final int c = aqv.a(arg.d);
   private final Long2ObjectLinkedOpenHashMap<aqu> o = new Long2ObjectLinkedOpenHashMap();
   private volatile Long2ObjectLinkedOpenHashMap<aqu> p = this.o.clone();
   private final Long2ObjectLinkedOpenHashMap<aqu> q = new Long2ObjectLinkedOpenHashMap();
   private final List<aqt> r = new ArrayList<>();
   final arq s;
   private final art t;
   private final bqw<Runnable> u;
   private final ebx v;
   private final dxl w;
   private final Supplier<eto> x;
   private final cgi y;
   final LongSet z = new LongOpenHashSet();
   private boolean A;
   private final aqy B;
   private final aqy C;
   private final asa D;
   private final dzq E;
   private final aqw.a F;
   private final AtomicInteger G = new AtomicInteger();
   private final String H;
   private final ark I = new ark();
   private final Int2ObjectMap<aqw.b> J = new Int2ObjectOpenHashMap();
   private final Long2ByteMap K = new Long2ByteOpenHashMap();
   private final Long2LongMap L = new Long2LongOpenHashMap();
   private final Queue<Runnable> M = Queues.newConcurrentLinkedQueue();
   private int N;
   private final dyp O;

   public aqw(
      arq $$0,
      etu.c $$1,
      DataFixer $$2,
      eqe $$3,
      Executor $$4,
      bqw<Runnable> $$5,
      dxw $$6,
      dxk $$7,
      asa $$8,
      dzq $$9,
      Supplier<eto> $$10,
      int $$11,
      boolean $$12
   ) {
      super(new dzc($$1.f(), $$0.ag(), "chunk"), $$1.a($$0.ag()).resolve("region"), $$2, $$12);
      Path $$13 = $$1.a($$0.ag());
      this.H = $$13.getFileName().toString();
      this.s = $$0;
      ke $$14 = $$0.H_();
      long $$15 = $$0.C();
      if ($$7 instanceof ebm $$16) {
         this.v = ebx.a($$16.h().a(), $$14.e(ma.aQ), $$15);
      } else {
         this.v = ebx.a(ebo.e(), $$14.e(ma.aQ), $$15);
      }

      this.w = $$7.a($$14.e(ma.aU), this.v, $$15);
      this.u = $$5;
      bqx $$17 = new bqx($$4, "worldgen");
      this.D = $$8;
      this.E = $$9;
      bqx $$18 = new bqx($$4, "light");
      this.B = new aqy($$17, $$4);
      this.C = new aqy($$18, $$4);
      this.t = new art($$6, this, this.s.D_().g(), $$18, this.C);
      this.F = new aqw.a($$4, $$5);
      this.x = $$10;
      this.y = new cgi(new dzc($$1.f(), $$0.ag(), "poi"), $$13.resolve("poi"), $$2, $$12, $$14, $$0.o(), $$0);
      this.a($$11);
      this.O = new dyp($$0, $$7, $$3, this.t, $$5);
   }

   protected dxk a() {
      return this.O.b();
   }

   protected dxl b() {
      return this.w;
   }

   protected ebx c() {
      return this.v;
   }

   private static double a(del $$0, bui $$1) {
      double $$2 = (double)kj.a($$0.g, 8);
      double $$3 = (double)kj.a($$0.h, 8);
      double $$4 = $$2 - $$1.dD();
      double $$5 = $$3 - $$1.dJ();
      return $$4 * $$4 + $$5 * $$5;
   }

   boolean a(arr $$0, int $$1, int $$2) {
      return $$0.Z().a($$1, $$2) && !$$0.g.g.a(del.c($$1, $$2));
   }

   private boolean b(arr $$0, int $$1, int $$2) {
      if (!this.a($$0, $$1, $$2)) {
         return false;
      } else {
         for (int $$3 = -1; $$3 <= 1; $$3++) {
            for (int $$4 = -1; $$4 <= 1; $$4++) {
               if (($$3 != 0 || $$4 != 0) && !this.a($$0, $$1 + $$3, $$2 + $$4)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   protected art d() {
      return this.t;
   }

   @Nullable
   protected aqu a(long $$0) {
      return (aqu)this.o.get($$0);
   }

   @Nullable
   protected aqu b(long $$0) {
      return (aqu)this.p.get($$0);
   }

   protected IntSupplier c(long $$0) {
      return () -> {
         aqu $$1 = this.b($$0);
         return $$1 == null ? aqz.a - 1 : Math.min($$1.j(), aqz.a - 1);
      };
   }

   public String a(del $$0) {
      aqu $$1 = this.b($$0.a());
      if ($$1 == null) {
         return "null";
      } else {
         String $$2 = $$1.i() + "\n";
         dyk $$3 = $$1.t();
         dxj $$4 = $$1.o();
         if ($$3 != null) {
            $$2 = $$2 + "St: §" + $$3.b() + $$3 + "§r\n";
         }

         if ($$4 != null) {
            $$2 = $$2 + "Ch: §" + $$4.j().b() + $$4.j() + "§r\n";
         }

         arg $$5 = $$1.r();
         $$2 = $$2 + '§' + $$5.ordinal() + $$5;
         return $$2 + "§r";
      }
   }

   private CompletableFuture<aqx<List<dxj>>> a(aqu $$0, int $$1, IntFunction<dyk> $$2) {
      if ($$1 == 0) {
         dyk $$3 = $$2.apply(0);
         return $$0.a($$3, this).thenApply($$0x -> $$0x.a(List::of));
      } else {
         int $$4 = azn.h($$1 * 2 + 1);
         List<CompletableFuture<aqx<dxj>>> $$5 = new ArrayList<>($$4);
         del $$6 = $$0.q();

         for (int $$7 = -$$1; $$7 <= $$1; $$7++) {
            for (int $$8 = -$$1; $$8 <= $$1; $$8++) {
               int $$9 = Math.max(Math.abs($$8), Math.abs($$7));
               long $$10 = del.c($$6.g + $$8, $$6.h + $$7);
               aqu $$11 = this.a($$10);
               if ($$11 == null) {
                  return g;
               }

               dyk $$12 = $$2.apply($$9);
               $$5.add($$11.a($$12, this));
            }
         }

         return ae.d($$5).thenApply($$0x -> {
            List<dxj> $$1x = new ArrayList<>($$0x.size());

            for (aqx<dxj> $$2x : $$0x) {
               if ($$2x == null) {
                  throw this.a(new IllegalStateException("At least one of the chunk futures were null"), "n/a");
               }

               dxj $$3 = $$2x.b(null);
               if ($$3 == null) {
                  return f;
               }

               $$1x.add($$3);
            }

            return aqx.a($$1x);
         });
      }
   }

   public z a(IllegalStateException $$0, String $$1) {
      StringBuilder $$2 = new StringBuilder();
      Consumer<aqu> $$3 = $$1x -> $$1x.s().forEach($$2x -> {
            dyk $$3x = (dyk)$$2x.getFirst();
            CompletableFuture<aqx<dxj>> $$4x = (CompletableFuture<aqx<dxj>>)$$2x.getSecond();
            if ($$4x != null && $$4x.isDone() && $$4x.join() == null) {
               $$2.append($$1x.q()).append(" - status: ").append($$3x).append(" future: ").append($$4x).append(System.lineSeparator());
            }
         });
      $$2.append("Updating:").append(System.lineSeparator());
      this.o.values().forEach($$3);
      $$2.append("Visible:").append(System.lineSeparator());
      this.p.values().forEach($$3);
      o $$4 = o.a($$0, "Chunk loading");
      p $$5 = $$4.a("Chunk loading");
      $$5.a("Details", $$1);
      $$5.a("Futures", $$2);
      return new z($$4);
   }

   public CompletableFuture<aqx<dxt>> a(aqu $$0) {
      return this.a($$0, 2, $$0x -> dyk.n).thenApply($$0x -> $$0x.a($$0xx -> (dxt)$$0xx.get($$0xx.size() / 2)));
   }

   @Nullable
   aqu a(long $$0, int $$1, @Nullable aqu $$2, int $$3) {
      if (!aqv.f($$3) && !aqv.f($$1)) {
         return $$2;
      } else {
         if ($$2 != null) {
            $$2.a($$1);
         }

         if ($$2 != null) {
            if (!aqv.f($$1)) {
               this.z.add($$0);
            } else {
               this.z.remove($$0);
            }
         }

         if (aqv.f($$1) && $$2 == null) {
            $$2 = (aqu)this.q.remove($$0);
            if ($$2 != null) {
               $$2.a($$1);
            } else {
               $$2 = new aqu(new del($$0), $$1, this.s, this.t, this::a, this);
            }

            this.o.put($$0, $$2);
            this.A = true;
         }

         return $$2;
      }
   }

   private void a(del $$0, IntSupplier $$1, int $$2, IntConsumer $$3) {
      this.B.onLevelChange($$0, $$1, $$2, $$3);
      this.C.onLevelChange($$0, $$1, $$2, $$3);
   }

   @Override
   public void close() throws IOException {
      try {
         this.B.close();
         this.C.close();
         this.y.close();
      } finally {
         super.close();
      }
   }

   protected void a(boolean $$0) {
      if ($$0) {
         List<aqu> $$1 = this.p.values().stream().filter(aqu::k).peek(aqu::l).toList();
         MutableBoolean $$2 = new MutableBoolean();

         do {
            $$2.setFalse();
            $$1.stream().map($$0x -> {
               this.u.b($$0x::h);
               return $$0x.o();
            }).filter($$0x -> $$0x instanceof dxs || $$0x instanceof dxt).filter(this::a).forEach($$1x -> $$2.setTrue());
         } while ($$2.isTrue());

         this.y.a();
         this.b(() -> true);
         this.o();
      } else {
         long $$3 = ae.c();
         ObjectIterator var4 = this.p.values().iterator();

         while (var4.hasNext()) {
            aqu $$4 = (aqu)var4.next();
            this.a($$4, $$3);
         }
      }
   }

   protected void a(BooleanSupplier $$0) {
      bor $$1 = boq.a();
      $$1.a("poi");
      this.y.a($$0);
      $$1.b("chunk_unload");
      if (!this.s.t()) {
         this.b($$0);
      }

      $$1.c();
   }

   public boolean e() {
      return this.t.K_()
         || !this.q.isEmpty()
         || !this.o.isEmpty()
         || this.y.b()
         || !this.z.isEmpty()
         || !this.M.isEmpty()
         || this.B.a()
         || this.C.a()
         || this.F.h();
   }

   private void b(BooleanSupplier $$0) {
      for (LongIterator $$1 = this.z.iterator(); $$1.hasNext(); $$1.remove()) {
         long $$2 = $$1.nextLong();
         aqu $$3 = (aqu)this.o.get($$2);
         if ($$3 != null) {
            this.o.remove($$2);
            this.q.put($$2, $$3);
            this.A = true;
            this.a($$2, $$3);
         }
      }

      int $$4 = Math.max(0, this.M.size() - 2000);

      Runnable $$5;
      while (($$4 > 0 || $$0.getAsBoolean()) && ($$5 = this.M.poll()) != null) {
         $$4--;
         $$5.run();
      }

      long $$6 = ae.c();
      int $$7 = 0;
      LongIterator $$8 = this.F.f().iterator();

      while ($$7 < 20 && $$0.getAsBoolean() && $$8.hasNext()) {
         long $$9 = $$8.nextLong();
         aqu $$10 = (aqu)this.p.get($$9);
         if ($$10 != null && this.a($$10, $$6)) {
            $$7++;
         }
      }
   }

   private void a(long $$0, aqu $$1) {
      CompletableFuture<?> $$2 = $$1.g();
      $$2.thenRunAsync(() -> {
         CompletableFuture<?> $$3 = $$1.g();
         if ($$3 != $$2) {
            this.a($$0, $$1);
         } else {
            dxj $$4 = $$1.o();
            if (this.q.remove($$0, $$1) && $$4 != null) {
               if ($$4 instanceof dxt $$5) {
                  $$5.c(false);
               }

               this.a($$4);
               if ($$4 instanceof dxt $$6) {
                  this.s.a($$6);
               }

               this.t.a($$4.f());
               this.t.b();
               this.D.a($$4.f(), null);
               this.L.remove($$4.f().a());
            }
         }
      }, this.M::add).whenComplete(($$1x, $$2x) -> {
         if ($$2x != null) {
            k.error("Failed to save chunk {}", $$1.q(), $$2x);
         }
      });
   }

   protected boolean f() {
      if (!this.A) {
         return false;
      } else {
         this.p = this.o.clone();
         this.A = false;
         return true;
      }
   }

   private CompletableFuture<dxj> f(del $$0) {
      CompletableFuture<Optional<dze>> $$1 = this.j($$0).thenApplyAsync($$1x -> $$1x.map($$1xx -> {
            dze $$2x = dze.a(this.s, this.s.H_(), $$1xx);
            if ($$2x == null) {
               k.error("Chunk file at {} is missing level data, skipping", $$0);
            }

            return $$2x;
         }), ae.g().a("parseChunk"));
      CompletableFuture<?> $$2 = this.y.a($$0);
      return $$1.<Object, Optional>thenCombine((CompletionStage<? extends Object>)$$2, ($$0x, $$1x) -> $$0x).thenApplyAsync($$1x -> {
         boq.a().f("chunkLoad");
         if ($$1x.isPresent()) {
            dxj $$2x = ((dze)$$1x.get()).a(this.s, this.y, this.q(), $$0);
            this.a($$0, $$2x.j().d());
            return $$2x;
         } else {
            return this.g($$0);
         }
      }, this.u).exceptionallyAsync($$1x -> this.a($$1x, $$0), this.u);
   }

   private dxj a(Throwable $$0, del $$1) {
      Throwable $$3 = $$0 instanceof CompletionException $$2 ? $$2.getCause() : $$0;
      Throwable $$5 = $$3 instanceof z $$4 ? $$4.getCause() : $$3;
      boolean $$6 = $$5 instanceof Error;
      boolean $$7 = $$5 instanceof IOException || $$5 instanceof uy;
      if (!$$6 && $$7) {
         this.s.o().a($$5, this.q(), $$1);
         return this.g($$1);
      } else {
         o $$8 = o.a($$0, "Exception loading chunk");
         p $$9 = $$8.a("Chunk being loaded");
         $$9.a("pos", $$1);
         this.h($$1);
         throw new z($$8);
      }
   }

   private dxj g(del $$0) {
      this.h($$0);
      return new dyd($$0, dyg.a, this.s, this.s.H_().e(ma.aG), null);
   }

   private void h(del $$0) {
      this.K.put($$0.a(), (byte)-1);
   }

   private byte a(del $$0, dyo $$1) {
      return this.K.put($$0.a(), (byte)($$1 == dyo.a ? -1 : 1));
   }

   @Override
   public ari d(long $$0) {
      aqu $$1 = (aqu)this.o.get($$0);
      $$1.m();
      return $$1;
   }

   @Override
   public void a(ari $$0) {
      $$0.n();
   }

   @Override
   public CompletableFuture<dxj> a(ari $$0, dyn $$1, bah<ari> $$2) {
      del $$3 = $$0.q();
      if ($$1.a() == dyk.c) {
         return this.f($$3);
      } else {
         try {
            ari $$4 = $$2.a($$3.g, $$3.h);
            dxj $$5 = $$4.a($$1.a().c());
            if ($$5 == null) {
               throw new IllegalStateException("Parent chunk missing");
            } else {
               CompletableFuture<dxj> $$6 = $$1.a(this.O, $$2, $$5);
               this.D.a($$3, $$1.a());
               return $$6;
            }
         } catch (Exception var8) {
            var8.getStackTrace();
            o $$8 = o.a(var8, "Exception generating new chunk");
            p $$9 = $$8.a("Chunk to be generated");
            $$9.a("Status being generated", () -> $$1.a().f());
            $$9.a("Location", String.format(Locale.ROOT, "%d,%d", $$3.g, $$3.h));
            $$9.a("Position hash", del.c($$3.g, $$3.h));
            $$9.a("Generator", this.a());
            this.u.execute(() -> {
               throw new z($$8);
            });
            throw new z($$8);
         }
      }
   }

   @Override
   public aqt a(dyk $$0, del $$1) {
      aqt $$2 = aqt.a(this, $$0, $$1);
      this.r.add($$2);
      return $$2;
   }

   private void a(aqt $$0) {
      ari $$1 = $$0.c();
      this.B.a(() -> {
         CompletableFuture<?> $$1x = $$0.a();
         if ($$1x != null) {
            $$1x.thenRun(() -> this.a($$0));
         }
      }, $$1.q().a(), $$1::j);
   }

   @Override
   public void g() {
      this.r.forEach(this::a);
      this.r.clear();
   }

   public CompletableFuture<aqx<dxt>> b(aqu $$0) {
      CompletableFuture<aqx<List<dxj>>> $$1 = this.a($$0, 1, $$0x -> dyk.n);
      CompletableFuture<aqx<dxt>> $$2 = $$1.thenApplyAsync($$1x -> $$1x.a($$1xx -> {
            dxt $$2x = (dxt)$$1xx.get($$1xx.size() / 2);
            $$2x.G();
            this.s.b($$2x);
            CompletableFuture<?> $$3 = $$0.f();
            if ($$3.isDone()) {
               this.a($$2x);
            } else {
               $$3.thenAcceptAsync($$1xxx -> this.a($$2x), this.u);
            }

            return $$2x;
         }), this.u);
      $$2.handle(($$0x, $$1x) -> {
         this.G.getAndIncrement();
         return null;
      });
      return $$2;
   }

   private void a(dxt $$0) {
      del $$1 = $$0.f();

      for (arr $$2 : this.I.a()) {
         if ($$2.Z().a($$1)) {
            a($$2, $$0);
         }
      }
   }

   public CompletableFuture<aqx<dxt>> c(aqu $$0) {
      return this.a($$0, 1, aqv::b).thenApply($$0x -> $$0x.a($$0xx -> (dxt)$$0xx.get($$0xx.size() / 2)));
   }

   public int h() {
      return this.G.get();
   }

   private boolean a(aqu $$0, long $$1) {
      if ($$0.k() && $$0.h()) {
         dxj $$2 = $$0.o();
         if (!($$2 instanceof dxs) && !($$2 instanceof dxt)) {
            return false;
         } else if (!$$2.i()) {
            return false;
         } else {
            long $$3 = $$2.f().a();
            long $$4 = this.L.getOrDefault($$3, -1L);
            if ($$1 < $$4) {
               return false;
            } else {
               boolean $$5 = this.a($$2);
               $$0.l();
               if ($$5) {
                  this.L.put($$3, $$1 + 10000L);
               }

               return $$5;
            }
         }
      } else {
         return false;
      }
   }

   private boolean a(dxj $$0) {
      this.y.b($$0.f());
      if (!$$0.i()) {
         return false;
      } else {
         $$0.a(false);
         del $$1 = $$0.f();

         try {
            dyk $$2 = $$0.j();
            if ($$2.d() != dyo.b) {
               if (this.i($$1)) {
                  return false;
               }

               if ($$2 == dyk.c && $$0.g().values().stream().noneMatch(emj::b)) {
                  return false;
               }
            }

            boq.a().f("chunkSave");
            dze $$3 = dze.a(this.s, $$0);
            CompletableFuture<un> $$4 = CompletableFuture.supplyAsync($$3::a, ae.g());
            this.a($$1, $$4::join).exceptionally($$1x -> {
               this.s.o().b($$1x, this.q(), $$1);
               return null;
            });
            this.a($$1, $$2.d());
            return true;
         } catch (Exception var6) {
            this.s.o().b(var6, this.q(), $$1);
            return false;
         }
      }
   }

   private boolean i(del $$0) {
      byte $$1 = this.K.get($$0.a());
      if ($$1 != 0) {
         return $$1 == 1;
      } else {
         un $$2;
         try {
            $$2 = this.j($$0).join().orElse(null);
            if ($$2 == null) {
               this.h($$0);
               return false;
            }
         } catch (Exception var5) {
            k.error("Failed to read chunk {}", $$0, var5);
            this.h($$0);
            return false;
         }

         dyo $$5 = dze.a($$2);
         return this.a($$0, $$5) == 1;
      }
   }

   protected void a(int $$0) {
      int $$1 = azn.a($$0, 2, 32);
      if ($$1 != this.N) {
         this.N = $$1;
         this.F.a(this.N);

         for (arr $$2 : this.I.a()) {
            this.e($$2);
         }
      }
   }

   int b(arr $$0) {
      return azn.a($$0.G(), 2, this.N);
   }

   private void a(arr $$0, del $$1) {
      dxt $$2 = this.e($$1.a());
      if ($$2 != null) {
         a($$0, $$2);
      }
   }

   private static void a(arr $$0, dxt $$1) {
      $$0.g.g.a($$1);
   }

   private static void b(arr $$0, del $$1) {
      $$0.g.g.a($$0, $$1);
   }

   @Nullable
   public dxt e(long $$0) {
      aqu $$1 = this.b($$0);
      return $$1 == null ? null : $$1.e();
   }

   public int i() {
      return this.p.size();
   }

   public arf j() {
      return this.F;
   }

   protected Iterable<aqu> k() {
      return Iterables.unmodifiableIterable(this.p.values());
   }

   void a(Writer $$0) throws IOException {
      ayn $$1 = ayn.a()
         .a("x")
         .a("z")
         .a("level")
         .a("in_memory")
         .a("status")
         .a("full_status")
         .a("accessible_ready")
         .a("ticking_ready")
         .a("entity_ticking_ready")
         .a("ticket")
         .a("spawning")
         .a("block_entity_count")
         .a("ticking_ticket")
         .a("ticking_level")
         .a("block_ticks")
         .a("fluid_ticks")
         .a($$0);
      arx $$2 = this.F.e();
      ObjectBidirectionalIterator var4 = this.p.long2ObjectEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<aqu> $$3 = (Entry<aqu>)var4.next();
         long $$4 = $$3.getLongKey();
         del $$5 = new del($$4);
         aqu $$6 = (aqu)$$3.getValue();
         Optional<dxj> $$7 = Optional.ofNullable($$6.o());
         Optional<dxt> $$8 = $$7.flatMap($$0x -> $$0x instanceof dxt ? Optional.of((dxt)$$0x) : Optional.empty());
         $$1.a(
            $$5.g,
            $$5.h,
            $$6.i(),
            $$7.isPresent(),
            $$7.map(dxj::j).orElse(null),
            $$8.map(dxt::C).orElse(null),
            a($$6.c()),
            a($$6.a()),
            a($$6.b()),
            this.F.e($$4),
            this.b($$5),
            $$8.<Integer>map($$0x -> $$0x.F().size()).orElse(0),
            $$2.d($$4),
            $$2.c($$4),
            $$8.<Integer>map($$0x -> $$0x.o().a()).orElse(0),
            $$8.<Integer>map($$0x -> $$0x.p().a()).orElse(0)
         );
      }
   }

   private static String a(CompletableFuture<aqx<dxt>> $$0) {
      try {
         aqx<dxt> $$1 = $$0.getNow(null);
         if ($$1 != null) {
            return $$1.a() ? "done" : "unloaded";
         } else {
            return "not completed";
         }
      } catch (CompletionException var2) {
         return "failed " + var2.getCause().getMessage();
      } catch (CancellationException var3) {
         return "cancelled";
      }
   }

   private CompletableFuture<Optional<un>> j(del $$0) {
      return this.d($$0).thenApplyAsync($$0x -> $$0x.map(this::b), ae.g().a("upgradeChunk"));
   }

   private un b(un $$0) {
      return this.a(this.s.ag(), this.x, $$0, this.a().c());
   }

   void a(Consumer<aqu> $$0) {
      LongIterator $$1 = this.F.c();

      while ($$1.hasNext()) {
         long $$2 = $$1.nextLong();
         aqu $$3 = (aqu)this.p.get($$2);
         if ($$3 != null && this.k($$3.q())) {
            $$0.accept($$3);
         }
      }
   }

   boolean b(del $$0) {
      return !this.F.f($$0.a()) ? false : this.k($$0);
   }

   private boolean k(del $$0) {
      for (arr $$1 : this.I.a()) {
         if (this.c($$1, $$0)) {
            return true;
         }
      }

      return false;
   }

   public List<arr> c(del $$0) {
      long $$1 = $$0.a();
      if (!this.F.f($$1)) {
         return List.of();
      } else {
         Builder<arr> $$2 = ImmutableList.builder();

         for (arr $$3 : this.I.a()) {
            if (this.c($$3, $$0)) {
               $$2.add($$3);
            }
         }

         return $$2.build();
      }
   }

   private boolean c(arr $$0, del $$1) {
      if ($$0.R_()) {
         return false;
      } else {
         double $$2 = a($$1, $$0);
         return $$2 < 16384.0;
      }
   }

   private boolean c(arr $$0) {
      return $$0.R_() && !this.s.ac().b(dfb.r);
   }

   void a(arr $$0, boolean $$1) {
      boolean $$2 = this.c($$0);
      boolean $$3 = this.I.d($$0);
      if ($$1) {
         this.I.a($$0, $$2);
         this.d($$0);
         if (!$$2) {
            this.F.a(kj.a($$0), $$0);
         }

         $$0.a(arb.a);
         this.e($$0);
      } else {
         kj $$4 = $$0.Y();
         this.I.a($$0);
         if (!$$3) {
            this.F.b($$4, $$0);
         }

         this.a($$0, arb.a);
      }
   }

   private void d(arr $$0) {
      kj $$1 = kj.a($$0);
      $$0.a($$1);
   }

   public void a(arr $$0) {
      ObjectIterator $$2 = this.J.values().iterator();

      while ($$2.hasNext()) {
         aqw.b $$1 = (aqw.b)$$2.next();
         if ($$1.c == $$0) {
            $$1.a(this.s.x());
         } else {
            $$1.b($$0);
         }
      }

      kj $$2x = $$0.Y();
      kj $$3 = kj.a($$0);
      boolean $$4 = this.I.e($$0);
      boolean $$5 = this.c($$0);
      boolean $$6 = $$2x.s() != $$3.s();
      if ($$6 || $$4 != $$5) {
         this.d($$0);
         if (!$$4) {
            this.F.b($$2x, $$0);
         }

         if (!$$5) {
            this.F.a($$3, $$0);
         }

         if (!$$4 && $$5) {
            this.I.b($$0);
         }

         if ($$4 && !$$5) {
            this.I.c($$0);
         }

         this.e($$0);
      }
   }

   private void e(arr $$0) {
      del $$1 = $$0.dA();
      int $$2 = this.b($$0);
      if ($$0.Z() instanceof arb.a $$3 && $$3.a().equals($$1) && $$3.b() == $$2) {
         return;
      }

      this.a($$0, arb.a($$1, $$2));
   }

   private void a(arr $$0, arb $$1) {
      if ($$0.dY() == this.s) {
         arb $$2 = $$0.Z();
         if ($$1 instanceof arb.a $$3 && (!($$2 instanceof arb.a $$4) || !$$4.a().equals($$3.a()))) {
            $$0.g.b(new afi($$3.a().g, $$3.a().h));
         }

         arb.a($$2, $$1, $$1x -> this.a($$0, $$1x), $$1x -> b($$0, $$1x));
         $$0.a($$1);
      }
   }

   @Override
   public List<arr> a(del $$0, boolean $$1) {
      Set<arr> $$2 = this.I.a();
      Builder<arr> $$3 = ImmutableList.builder();

      for (arr $$4 : $$2) {
         if ($$1 && this.b($$4, $$0.g, $$0.h) || !$$1 && this.a($$4, $$0.g, $$0.h)) {
            $$3.add($$4);
         }
      }

      return $$3.build();
   }

   protected void a(bui $$0) {
      if (!($$0 instanceof cjp)) {
         bup<?> $$1 = $$0.ar();
         int $$2 = $$1.o() * 16;
         if ($$2 != 0) {
            int $$3 = $$1.p();
            if (this.J.containsKey($$0.as())) {
               throw (IllegalStateException)ae.b(new IllegalStateException("Entity is already tracked!"));
            } else {
               aqw.b $$4 = new aqw.b($$0, $$2, $$3, $$1.q());
               this.J.put($$0.as(), $$4);
               $$4.a(this.s.x());
               if ($$0 instanceof arr $$5) {
                  this.a($$5, true);
                  ObjectIterator var7 = this.J.values().iterator();

                  while (var7.hasNext()) {
                     aqw.b $$6 = (aqw.b)var7.next();
                     if ($$6.c != $$5) {
                        $$6.b($$5);
                     }
                  }
               }
            }
         }
      }
   }

   protected void b(bui $$0) {
      if ($$0 instanceof arr $$1) {
         this.a($$1, false);
         ObjectIterator var3 = this.J.values().iterator();

         while (var3.hasNext()) {
            aqw.b $$2 = (aqw.b)var3.next();
            $$2.a($$1);
         }
      }

      aqw.b $$3 = (aqw.b)this.J.remove($$0.as());
      if ($$3 != null) {
         $$3.a();
      }
   }

   protected void l() {
      for (arr $$0 : this.I.a()) {
         this.e($$0);
      }

      List<arr> $$1 = Lists.newArrayList();
      List<arr> $$2 = this.s.x();
      ObjectIterator var3 = this.J.values().iterator();

      while (var3.hasNext()) {
         aqw.b $$3 = (aqw.b)var3.next();
         kj $$4 = $$3.e;
         kj $$5 = kj.a($$3.c);
         boolean $$6 = !Objects.equals($$4, $$5);
         if ($$6) {
            $$3.a($$2);
            bui $$7 = $$3.c;
            if ($$7 instanceof arr) {
               $$1.add((arr)$$7);
            }

            $$3.e = $$5;
         }

         if ($$6 || this.F.c($$5.r().a())) {
            $$3.b.a();
         }
      }

      if (!$$1.isEmpty()) {
         var3 = this.J.values().iterator();

         while (var3.hasNext()) {
            aqw.b $$8 = (aqw.b)var3.next();
            $$8.a($$1);
         }
      }
   }

   public void a(bui $$0, zs<?> $$1) {
      aqw.b $$2 = (aqw.b)this.J.get($$0.as());
      if ($$2 != null) {
         $$2.a($$1);
      }
   }

   protected void b(bui $$0, zs<?> $$1) {
      aqw.b $$2 = (aqw.b)this.J.get($$0.as());
      if ($$2 != null) {
         $$2.b($$1);
      }
   }

   public void a(List<dxj> $$0) {
      Map<arr, List<dxt>> $$1 = new HashMap<>();

      for (dxj $$2 : $$0) {
         del $$3 = $$2.f();
         dxt $$5;
         if ($$2 instanceof dxt $$4) {
            $$5 = $$4;
         } else {
            $$5 = this.s.d($$3.g, $$3.h);
         }

         for (arr $$7 : this.a($$3, false)) {
            $$1.computeIfAbsent($$7, $$0x -> new ArrayList<>()).add($$5);
         }
      }

      $$1.forEach(($$0x, $$1x) -> $$0x.g.b(acx.a($$1x)));
   }

   protected cgi m() {
      return this.y;
   }

   public String n() {
      return this.H;
   }

   void a(del $$0, arg $$1) {
      this.E.onChunkStatusChange($$0, $$1);
   }

   public void a(del $$0, int $$1) {
      int $$2 = $$1 + 1;
      del.a($$0, $$2).forEach($$0x -> {
         aqu $$1x = this.b($$0x.a());
         if ($$1x != null) {
            $$1x.a(this.t.a($$0x.g, $$0x.h));
         }
      });
   }

   class a extends arf {
      protected a(final Executor $$0, final Executor $$1) {
         super($$0, $$1);
      }

      @Override
      protected boolean a(long $$0) {
         return aqw.this.z.contains($$0);
      }

      @Nullable
      @Override
      protected aqu b(long $$0) {
         return aqw.this.a($$0);
      }

      @Nullable
      @Override
      protected aqu a(long $$0, int $$1, @Nullable aqu $$2, int $$3) {
         return aqw.this.a($$0, $$1, $$2, $$3);
      }
   }

   class b {
      final arp b;
      final bui c;
      private final int d;
      kj e;
      private final Set<asw> f = Sets.newIdentityHashSet();

      public b(final bui $$0, final int $$1, final int $$2, final boolean $$3) {
         this.b = new arp(aqw.this.s, $$0, $$2, $$3, this::a);
         this.c = $$0;
         this.d = $$1;
         this.e = kj.a($$0);
      }

      @Override
      public boolean equals(Object $$0) {
         return $$0 instanceof aqw.b ? ((aqw.b)$$0).c.as() == this.c.as() : false;
      }

      @Override
      public int hashCode() {
         return this.c.as();
      }

      public void a(zs<?> $$0) {
         for (asw $$1 : this.f) {
            $$1.b($$0);
         }
      }

      public void b(zs<?> $$0) {
         this.a($$0);
         if (this.c instanceof arr) {
            ((arr)this.c).g.b($$0);
         }
      }

      public void a() {
         for (asw $$0 : this.f) {
            this.b.a($$0.o());
         }
      }

      public void a(arr $$0) {
         if (this.f.remove($$0.g)) {
            this.b.a($$0);
         }
      }

      public void b(arr $$0) {
         if ($$0 != this.c) {
            ezr $$1 = $$0.dw().d(this.c.dw());
            int $$2 = aqw.this.b($$0);
            double $$3 = (double)Math.min(this.b(), $$2 * 16);
            double $$4 = $$1.d * $$1.d + $$1.f * $$1.f;
            double $$5 = $$3 * $$3;
            boolean $$6 = $$4 <= $$5 && this.c.a($$0) && aqw.this.a($$0, this.c.dA().g, this.c.dA().h);
            if ($$6) {
               if (this.f.add($$0.g)) {
                  this.b.b($$0);
               }
            } else if (this.f.remove($$0.g)) {
               this.b.a($$0);
            }
         }
      }

      private int a(int $$0) {
         return aqw.this.s.o().b($$0);
      }

      private int b() {
         int $$0 = this.d;

         for (bui $$1 : this.c.df()) {
            int $$2 = $$1.ar().o() * 16;
            if ($$2 > $$0) {
               $$0 = $$2;
            }
         }

         return this.a($$0);
      }

      public void a(List<arr> $$0) {
         for (arr $$1 : $$0) {
            this.b($$1);
         }
      }
   }
}
