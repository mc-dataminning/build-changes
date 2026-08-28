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

public class aqt extends dyp implements aqr.b, are {
   private static final aqu<List<dxf>> f = aqu.a("Unloaded chunks found in range");
   private static final CompletableFuture<aqu<List<dxf>>> g = CompletableFuture.completedFuture(f);
   private static final byte h = -1;
   private static final byte i = 0;
   private static final byte j = 1;
   private static final Logger k = LogUtils.getLogger();
   private static final int l = 200;
   private static final int m = 20;
   private static final int n = 10000;
   public static final int a = 2;
   public static final int b = 32;
   public static final int c = aqs.a(ard.d);
   private final Long2ObjectLinkedOpenHashMap<aqr> o = new Long2ObjectLinkedOpenHashMap();
   private volatile Long2ObjectLinkedOpenHashMap<aqr> p = this.o.clone();
   private final Long2ObjectLinkedOpenHashMap<aqr> q = new Long2ObjectLinkedOpenHashMap();
   private final List<aqq> r = new ArrayList<>();
   final arn s;
   private final arq t;
   private final bqs<Runnable> u;
   private final ebt v;
   private final dxh w;
   private final Supplier<etk> x;
   private final cge y;
   final LongSet z = new LongOpenHashSet();
   private boolean A;
   private final aqv B;
   private final aqv C;
   private final arx D;
   private final dzm E;
   private final aqt.a F;
   private final AtomicInteger G = new AtomicInteger();
   private final String H;
   private final arh I = new arh();
   private final Int2ObjectMap<aqt.b> J = new Int2ObjectOpenHashMap();
   private final Long2ByteMap K = new Long2ByteOpenHashMap();
   private final Long2LongMap L = new Long2LongOpenHashMap();
   private final Queue<Runnable> M = Queues.newConcurrentLinkedQueue();
   private int N;
   private final dyl O;

   public aqt(
      arn $$0,
      etq.c $$1,
      DataFixer $$2,
      eqa $$3,
      Executor $$4,
      bqs<Runnable> $$5,
      dxs $$6,
      dxg $$7,
      arx $$8,
      dzm $$9,
      Supplier<etk> $$10,
      int $$11,
      boolean $$12
   ) {
      super(new dyy($$1.f(), $$0.ag(), "chunk"), $$1.a($$0.ag()).resolve("region"), $$2, $$12);
      Path $$13 = $$1.a($$0.ag());
      this.H = $$13.getFileName().toString();
      this.s = $$0;
      ke $$14 = $$0.H_();
      long $$15 = $$0.C();
      if ($$7 instanceof ebi $$16) {
         this.v = ebt.a($$16.h().a(), $$14.e(lz.aQ), $$15);
      } else {
         this.v = ebt.a(ebk.e(), $$14.e(lz.aQ), $$15);
      }

      this.w = $$7.a($$14.e(lz.aU), this.v, $$15);
      this.u = $$5;
      bqt $$17 = new bqt($$4, "worldgen");
      this.D = $$8;
      this.E = $$9;
      bqt $$18 = new bqt($$4, "light");
      this.B = new aqv($$17, $$4);
      this.C = new aqv($$18, $$4);
      this.t = new arq($$6, this, this.s.D_().g(), $$18, this.C);
      this.F = new aqt.a($$4, $$5);
      this.x = $$10;
      this.y = new cge(new dyy($$1.f(), $$0.ag(), "poi"), $$13.resolve("poi"), $$2, $$12, $$14, $$0.o(), $$0);
      this.a($$11);
      this.O = new dyl($$0, $$7, $$3, this.t, $$5);
   }

   protected dxg a() {
      return this.O.b();
   }

   protected dxh b() {
      return this.w;
   }

   protected ebt c() {
      return this.v;
   }

   private static double a(deh $$0, bue $$1) {
      double $$2 = (double)kj.a($$0.g, 8);
      double $$3 = (double)kj.a($$0.h, 8);
      double $$4 = $$2 - $$1.dC();
      double $$5 = $$3 - $$1.dI();
      return $$4 * $$4 + $$5 * $$5;
   }

   boolean a(aro $$0, int $$1, int $$2) {
      return $$0.Z().a($$1, $$2) && !$$0.g.g.a(deh.c($$1, $$2));
   }

   private boolean b(aro $$0, int $$1, int $$2) {
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

   protected arq d() {
      return this.t;
   }

   @Nullable
   protected aqr a(long $$0) {
      return (aqr)this.o.get($$0);
   }

   @Nullable
   protected aqr b(long $$0) {
      return (aqr)this.p.get($$0);
   }

   protected IntSupplier c(long $$0) {
      return () -> {
         aqr $$1 = this.b($$0);
         return $$1 == null ? aqw.a - 1 : Math.min($$1.j(), aqw.a - 1);
      };
   }

   public String a(deh $$0) {
      aqr $$1 = this.b($$0.a());
      if ($$1 == null) {
         return "null";
      } else {
         String $$2 = $$1.i() + "\n";
         dyg $$3 = $$1.t();
         dxf $$4 = $$1.o();
         if ($$3 != null) {
            $$2 = $$2 + "St: §" + $$3.b() + $$3 + "§r\n";
         }

         if ($$4 != null) {
            $$2 = $$2 + "Ch: §" + $$4.j().b() + $$4.j() + "§r\n";
         }

         ard $$5 = $$1.r();
         $$2 = $$2 + '§' + $$5.ordinal() + $$5;
         return $$2 + "§r";
      }
   }

   private CompletableFuture<aqu<List<dxf>>> a(aqr $$0, int $$1, IntFunction<dyg> $$2) {
      if ($$1 == 0) {
         dyg $$3 = $$2.apply(0);
         return $$0.a($$3, this).thenApply($$0x -> $$0x.a(List::of));
      } else {
         int $$4 = azk.h($$1 * 2 + 1);
         List<CompletableFuture<aqu<dxf>>> $$5 = new ArrayList<>($$4);
         deh $$6 = $$0.q();

         for (int $$7 = -$$1; $$7 <= $$1; $$7++) {
            for (int $$8 = -$$1; $$8 <= $$1; $$8++) {
               int $$9 = Math.max(Math.abs($$8), Math.abs($$7));
               long $$10 = deh.c($$6.g + $$8, $$6.h + $$7);
               aqr $$11 = this.a($$10);
               if ($$11 == null) {
                  return g;
               }

               dyg $$12 = $$2.apply($$9);
               $$5.add($$11.a($$12, this));
            }
         }

         return ae.d($$5).thenApply($$0x -> {
            List<dxf> $$1x = new ArrayList<>($$0x.size());

            for (aqu<dxf> $$2x : $$0x) {
               if ($$2x == null) {
                  throw this.a(new IllegalStateException("At least one of the chunk futures were null"), "n/a");
               }

               dxf $$3 = $$2x.b(null);
               if ($$3 == null) {
                  return f;
               }

               $$1x.add($$3);
            }

            return aqu.a($$1x);
         });
      }
   }

   public z a(IllegalStateException $$0, String $$1) {
      StringBuilder $$2 = new StringBuilder();
      Consumer<aqr> $$3 = $$1x -> $$1x.s().forEach($$2x -> {
            dyg $$3x = (dyg)$$2x.getFirst();
            CompletableFuture<aqu<dxf>> $$4x = (CompletableFuture<aqu<dxf>>)$$2x.getSecond();
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

   public CompletableFuture<aqu<dxp>> a(aqr $$0) {
      return this.a($$0, 2, $$0x -> dyg.n).thenApply($$0x -> $$0x.a($$0xx -> (dxp)$$0xx.get($$0xx.size() / 2)));
   }

   @Nullable
   aqr a(long $$0, int $$1, @Nullable aqr $$2, int $$3) {
      if (!aqs.f($$3) && !aqs.f($$1)) {
         return $$2;
      } else {
         if ($$2 != null) {
            $$2.a($$1);
         }

         if ($$2 != null) {
            if (!aqs.f($$1)) {
               this.z.add($$0);
            } else {
               this.z.remove($$0);
            }
         }

         if (aqs.f($$1) && $$2 == null) {
            $$2 = (aqr)this.q.remove($$0);
            if ($$2 != null) {
               $$2.a($$1);
            } else {
               $$2 = new aqr(new deh($$0), $$1, this.s, this.t, this::a, this);
            }

            this.o.put($$0, $$2);
            this.A = true;
         }

         return $$2;
      }
   }

   private void a(deh $$0, IntSupplier $$1, int $$2, IntConsumer $$3) {
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
         List<aqr> $$1 = this.p.values().stream().filter(aqr::k).peek(aqr::l).toList();
         MutableBoolean $$2 = new MutableBoolean();

         do {
            $$2.setFalse();
            $$1.stream().map($$0x -> {
               this.u.b($$0x::h);
               return $$0x.o();
            }).filter($$0x -> $$0x instanceof dxo || $$0x instanceof dxp).filter(this::a).forEach($$1x -> $$2.setTrue());
         } while ($$2.isTrue());

         this.y.a();
         this.b(() -> true);
         this.o();
      } else {
         long $$3 = ae.c();
         ObjectIterator var4 = this.p.values().iterator();

         while (var4.hasNext()) {
            aqr $$4 = (aqr)var4.next();
            this.a($$4, $$3);
         }
      }
   }

   protected void a(BooleanSupplier $$0) {
      bon $$1 = bom.a();
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
         aqr $$3 = (aqr)this.o.get($$2);
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
         aqr $$10 = (aqr)this.p.get($$9);
         if ($$10 != null && this.a($$10, $$6)) {
            $$7++;
         }
      }
   }

   private void a(long $$0, aqr $$1) {
      CompletableFuture<?> $$2 = $$1.g();
      $$2.thenRunAsync(() -> {
         CompletableFuture<?> $$3 = $$1.g();
         if ($$3 != $$2) {
            this.a($$0, $$1);
         } else {
            dxf $$4 = $$1.o();
            if (this.q.remove($$0, $$1) && $$4 != null) {
               if ($$4 instanceof dxp $$5) {
                  $$5.c(false);
               }

               this.a($$4);
               if ($$4 instanceof dxp $$6) {
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

   private CompletableFuture<dxf> f(deh $$0) {
      CompletableFuture<Optional<dza>> $$1 = this.j($$0).thenApplyAsync($$1x -> $$1x.map($$1xx -> {
            dza $$2x = dza.a(this.s, this.s.H_(), $$1xx);
            if ($$2x == null) {
               k.error("Chunk file at {} is missing level data, skipping", $$0);
            }

            return $$2x;
         }), ae.g().a("parseChunk"));
      CompletableFuture<?> $$2 = this.y.a($$0);
      return $$1.<Object, Optional>thenCombine((CompletionStage<? extends Object>)$$2, ($$0x, $$1x) -> $$0x).thenApplyAsync($$1x -> {
         bom.a().f("chunkLoad");
         if ($$1x.isPresent()) {
            dxf $$2x = ((dza)$$1x.get()).a(this.s, this.y, this.q(), $$0);
            this.a($$0, $$2x.j().d());
            return $$2x;
         } else {
            return this.g($$0);
         }
      }, this.u).exceptionallyAsync($$1x -> this.a($$1x, $$0), this.u);
   }

   private dxf a(Throwable $$0, deh $$1) {
      Throwable $$3 = $$0 instanceof CompletionException $$2 ? $$2.getCause() : $$0;
      Throwable $$5 = $$3 instanceof z $$4 ? $$4.getCause() : $$3;
      boolean $$6 = $$5 instanceof Error;
      boolean $$7 = $$5 instanceof IOException || $$5 instanceof uv;
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

   private dxf g(deh $$0) {
      this.h($$0);
      return new dxz($$0, dyc.a, this.s, this.s.H_().e(lz.aG), null);
   }

   private void h(deh $$0) {
      this.K.put($$0.a(), (byte)-1);
   }

   private byte a(deh $$0, dyk $$1) {
      return this.K.put($$0.a(), (byte)($$1 == dyk.a ? -1 : 1));
   }

   @Override
   public arf d(long $$0) {
      aqr $$1 = (aqr)this.o.get($$0);
      $$1.m();
      return $$1;
   }

   @Override
   public void a(arf $$0) {
      $$0.n();
   }

   @Override
   public CompletableFuture<dxf> a(arf $$0, dyj $$1, bae<arf> $$2) {
      deh $$3 = $$0.q();
      if ($$1.a() == dyg.c) {
         return this.f($$3);
      } else {
         try {
            arf $$4 = $$2.a($$3.g, $$3.h);
            dxf $$5 = $$4.a($$1.a().c());
            if ($$5 == null) {
               throw new IllegalStateException("Parent chunk missing");
            } else {
               CompletableFuture<dxf> $$6 = $$1.a(this.O, $$2, $$5);
               this.D.a($$3, $$1.a());
               return $$6;
            }
         } catch (Exception var8) {
            var8.getStackTrace();
            o $$8 = o.a(var8, "Exception generating new chunk");
            p $$9 = $$8.a("Chunk to be generated");
            $$9.a("Status being generated", () -> $$1.a().f());
            $$9.a("Location", String.format(Locale.ROOT, "%d,%d", $$3.g, $$3.h));
            $$9.a("Position hash", deh.c($$3.g, $$3.h));
            $$9.a("Generator", this.a());
            this.u.execute(() -> {
               throw new z($$8);
            });
            throw new z($$8);
         }
      }
   }

   @Override
   public aqq a(dyg $$0, deh $$1) {
      aqq $$2 = aqq.a(this, $$0, $$1);
      this.r.add($$2);
      return $$2;
   }

   private void a(aqq $$0) {
      arf $$1 = $$0.c();
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

   public CompletableFuture<aqu<dxp>> b(aqr $$0) {
      CompletableFuture<aqu<List<dxf>>> $$1 = this.a($$0, 1, $$0x -> dyg.n);
      CompletableFuture<aqu<dxp>> $$2 = $$1.thenApplyAsync($$1x -> $$1x.a($$1xx -> {
            dxp $$2x = (dxp)$$1xx.get($$1xx.size() / 2);
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

   private void a(dxp $$0) {
      deh $$1 = $$0.f();

      for (aro $$2 : this.I.a()) {
         if ($$2.Z().a($$1)) {
            a($$2, $$0);
         }
      }
   }

   public CompletableFuture<aqu<dxp>> c(aqr $$0) {
      return this.a($$0, 1, aqs::b).thenApply($$0x -> $$0x.a($$0xx -> (dxp)$$0xx.get($$0xx.size() / 2)));
   }

   public int h() {
      return this.G.get();
   }

   private boolean a(aqr $$0, long $$1) {
      if ($$0.k() && $$0.h()) {
         dxf $$2 = $$0.o();
         if (!($$2 instanceof dxo) && !($$2 instanceof dxp)) {
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

   private boolean a(dxf $$0) {
      this.y.b($$0.f());
      if (!$$0.i()) {
         return false;
      } else {
         $$0.a(false);
         deh $$1 = $$0.f();

         try {
            dyg $$2 = $$0.j();
            if ($$2.d() != dyk.b) {
               if (this.i($$1)) {
                  return false;
               }

               if ($$2 == dyg.c && $$0.g().values().stream().noneMatch(emf::b)) {
                  return false;
               }
            }

            bom.a().f("chunkSave");
            dza $$3 = dza.a(this.s, $$0);
            CompletableFuture<uk> $$4 = CompletableFuture.supplyAsync($$3::a, ae.g());
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

   private boolean i(deh $$0) {
      byte $$1 = this.K.get($$0.a());
      if ($$1 != 0) {
         return $$1 == 1;
      } else {
         uk $$2;
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

         dyk $$5 = dza.a($$2);
         return this.a($$0, $$5) == 1;
      }
   }

   protected void a(int $$0) {
      int $$1 = azk.a($$0, 2, 32);
      if ($$1 != this.N) {
         this.N = $$1;
         this.F.a(this.N);

         for (aro $$2 : this.I.a()) {
            this.e($$2);
         }
      }
   }

   int b(aro $$0) {
      return azk.a($$0.G(), 2, this.N);
   }

   private void a(aro $$0, deh $$1) {
      dxp $$2 = this.e($$1.a());
      if ($$2 != null) {
         a($$0, $$2);
      }
   }

   private static void a(aro $$0, dxp $$1) {
      $$0.g.g.a($$1);
   }

   private static void b(aro $$0, deh $$1) {
      $$0.g.g.a($$0, $$1);
   }

   @Nullable
   public dxp e(long $$0) {
      aqr $$1 = this.b($$0);
      return $$1 == null ? null : $$1.e();
   }

   public int i() {
      return this.p.size();
   }

   public arc j() {
      return this.F;
   }

   protected Iterable<aqr> k() {
      return Iterables.unmodifiableIterable(this.p.values());
   }

   void a(Writer $$0) throws IOException {
      ayk $$1 = ayk.a()
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
      aru $$2 = this.F.e();
      ObjectBidirectionalIterator var4 = this.p.long2ObjectEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<aqr> $$3 = (Entry<aqr>)var4.next();
         long $$4 = $$3.getLongKey();
         deh $$5 = new deh($$4);
         aqr $$6 = (aqr)$$3.getValue();
         Optional<dxf> $$7 = Optional.ofNullable($$6.o());
         Optional<dxp> $$8 = $$7.flatMap($$0x -> $$0x instanceof dxp ? Optional.of((dxp)$$0x) : Optional.empty());
         $$1.a(
            $$5.g,
            $$5.h,
            $$6.i(),
            $$7.isPresent(),
            $$7.map(dxf::j).orElse(null),
            $$8.map(dxp::C).orElse(null),
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

   private static String a(CompletableFuture<aqu<dxp>> $$0) {
      try {
         aqu<dxp> $$1 = $$0.getNow(null);
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

   private CompletableFuture<Optional<uk>> j(deh $$0) {
      return this.d($$0).thenApplyAsync($$0x -> $$0x.map(this::b), ae.g().a("upgradeChunk"));
   }

   private uk b(uk $$0) {
      return this.a(this.s.ag(), this.x, $$0, this.a().c());
   }

   void a(Consumer<aqr> $$0) {
      LongIterator $$1 = this.F.c();

      while ($$1.hasNext()) {
         long $$2 = $$1.nextLong();
         aqr $$3 = (aqr)this.p.get($$2);
         if ($$3 != null && this.k($$3.q())) {
            $$0.accept($$3);
         }
      }
   }

   boolean b(deh $$0) {
      return !this.F.f($$0.a()) ? false : this.k($$0);
   }

   private boolean k(deh $$0) {
      for (aro $$1 : this.I.a()) {
         if (this.c($$1, $$0)) {
            return true;
         }
      }

      return false;
   }

   public List<aro> c(deh $$0) {
      long $$1 = $$0.a();
      if (!this.F.f($$1)) {
         return List.of();
      } else {
         Builder<aro> $$2 = ImmutableList.builder();

         for (aro $$3 : this.I.a()) {
            if (this.c($$3, $$0)) {
               $$2.add($$3);
            }
         }

         return $$2.build();
      }
   }

   private boolean c(aro $$0, deh $$1) {
      if ($$0.R_()) {
         return false;
      } else {
         double $$2 = a($$1, $$0);
         return $$2 < 16384.0;
      }
   }

   private boolean c(aro $$0) {
      return $$0.R_() && !this.s.ac().b(dex.r);
   }

   void a(aro $$0, boolean $$1) {
      boolean $$2 = this.c($$0);
      boolean $$3 = this.I.d($$0);
      if ($$1) {
         this.I.a($$0, $$2);
         this.d($$0);
         if (!$$2) {
            this.F.a(kj.a($$0), $$0);
         }

         $$0.a(aqy.a);
         this.e($$0);
      } else {
         kj $$4 = $$0.Y();
         this.I.a($$0);
         if (!$$3) {
            this.F.b($$4, $$0);
         }

         this.a($$0, aqy.a);
      }
   }

   private void d(aro $$0) {
      kj $$1 = kj.a($$0);
      $$0.a($$1);
   }

   public void a(aro $$0) {
      ObjectIterator $$2 = this.J.values().iterator();

      while ($$2.hasNext()) {
         aqt.b $$1 = (aqt.b)$$2.next();
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

   private void e(aro $$0) {
      deh $$1 = $$0.dz();
      int $$2 = this.b($$0);
      if ($$0.Z() instanceof aqy.a $$3 && $$3.a().equals($$1) && $$3.b() == $$2) {
         return;
      }

      this.a($$0, aqy.a($$1, $$2));
   }

   private void a(aro $$0, aqy $$1) {
      if ($$0.dX() == this.s) {
         aqy $$2 = $$0.Z();
         if ($$1 instanceof aqy.a $$3 && (!($$2 instanceof aqy.a $$4) || !$$4.a().equals($$3.a()))) {
            $$0.g.b(new aff($$3.a().g, $$3.a().h));
         }

         aqy.a($$2, $$1, $$1x -> this.a($$0, $$1x), $$1x -> b($$0, $$1x));
         $$0.a($$1);
      }
   }

   @Override
   public List<aro> a(deh $$0, boolean $$1) {
      Set<aro> $$2 = this.I.a();
      Builder<aro> $$3 = ImmutableList.builder();

      for (aro $$4 : $$2) {
         if ($$1 && this.b($$4, $$0.g, $$0.h) || !$$1 && this.a($$4, $$0.g, $$0.h)) {
            $$3.add($$4);
         }
      }

      return $$3.build();
   }

   protected void a(bue $$0) {
      if (!($$0 instanceof cjl)) {
         bul<?> $$1 = $$0.ar();
         int $$2 = $$1.o() * 16;
         if ($$2 != 0) {
            int $$3 = $$1.p();
            if (this.J.containsKey($$0.as())) {
               throw (IllegalStateException)ae.b(new IllegalStateException("Entity is already tracked!"));
            } else {
               aqt.b $$4 = new aqt.b($$0, $$2, $$3, $$1.q());
               this.J.put($$0.as(), $$4);
               $$4.a(this.s.x());
               if ($$0 instanceof aro $$5) {
                  this.a($$5, true);
                  ObjectIterator var7 = this.J.values().iterator();

                  while (var7.hasNext()) {
                     aqt.b $$6 = (aqt.b)var7.next();
                     if ($$6.c != $$5) {
                        $$6.b($$5);
                     }
                  }
               }
            }
         }
      }
   }

   protected void b(bue $$0) {
      if ($$0 instanceof aro $$1) {
         this.a($$1, false);
         ObjectIterator var3 = this.J.values().iterator();

         while (var3.hasNext()) {
            aqt.b $$2 = (aqt.b)var3.next();
            $$2.a($$1);
         }
      }

      aqt.b $$3 = (aqt.b)this.J.remove($$0.as());
      if ($$3 != null) {
         $$3.a();
      }
   }

   protected void l() {
      for (aro $$0 : this.I.a()) {
         this.e($$0);
      }

      List<aro> $$1 = Lists.newArrayList();
      List<aro> $$2 = this.s.x();
      ObjectIterator var3 = this.J.values().iterator();

      while (var3.hasNext()) {
         aqt.b $$3 = (aqt.b)var3.next();
         kj $$4 = $$3.e;
         kj $$5 = kj.a($$3.c);
         boolean $$6 = !Objects.equals($$4, $$5);
         if ($$6) {
            $$3.a($$2);
            bue $$7 = $$3.c;
            if ($$7 instanceof aro) {
               $$1.add((aro)$$7);
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
            aqt.b $$8 = (aqt.b)var3.next();
            $$8.a($$1);
         }
      }
   }

   public void a(bue $$0, zp<?> $$1) {
      aqt.b $$2 = (aqt.b)this.J.get($$0.as());
      if ($$2 != null) {
         $$2.a($$1);
      }
   }

   protected void b(bue $$0, zp<?> $$1) {
      aqt.b $$2 = (aqt.b)this.J.get($$0.as());
      if ($$2 != null) {
         $$2.b($$1);
      }
   }

   public void a(List<dxf> $$0) {
      Map<aro, List<dxp>> $$1 = new HashMap<>();

      for (dxf $$2 : $$0) {
         deh $$3 = $$2.f();
         dxp $$5;
         if ($$2 instanceof dxp $$4) {
            $$5 = $$4;
         } else {
            $$5 = this.s.d($$3.g, $$3.h);
         }

         for (aro $$7 : this.a($$3, false)) {
            $$1.computeIfAbsent($$7, $$0x -> new ArrayList<>()).add($$5);
         }
      }

      $$1.forEach(($$0x, $$1x) -> $$0x.g.b(acu.a($$1x)));
   }

   protected cge m() {
      return this.y;
   }

   public String n() {
      return this.H;
   }

   void a(deh $$0, ard $$1) {
      this.E.onChunkStatusChange($$0, $$1);
   }

   public void a(deh $$0, int $$1) {
      int $$2 = $$1 + 1;
      deh.a($$0, $$2).forEach($$0x -> {
         aqr $$1x = this.b($$0x.a());
         if ($$1x != null) {
            $$1x.a(this.t.a($$0x.g, $$0x.h));
         }
      });
   }

   class a extends arc {
      protected a(final Executor $$0, final Executor $$1) {
         super($$0, $$1);
      }

      @Override
      protected boolean a(long $$0) {
         return aqt.this.z.contains($$0);
      }

      @Nullable
      @Override
      protected aqr b(long $$0) {
         return aqt.this.a($$0);
      }

      @Nullable
      @Override
      protected aqr a(long $$0, int $$1, @Nullable aqr $$2, int $$3) {
         return aqt.this.a($$0, $$1, $$2, $$3);
      }
   }

   class b {
      final arm b;
      final bue c;
      private final int d;
      kj e;
      private final Set<ast> f = Sets.newIdentityHashSet();

      public b(final bue $$0, final int $$1, final int $$2, final boolean $$3) {
         this.b = new arm(aqt.this.s, $$0, $$2, $$3, this::a);
         this.c = $$0;
         this.d = $$1;
         this.e = kj.a($$0);
      }

      @Override
      public boolean equals(Object $$0) {
         return $$0 instanceof aqt.b ? ((aqt.b)$$0).c.as() == this.c.as() : false;
      }

      @Override
      public int hashCode() {
         return this.c.as();
      }

      public void a(zp<?> $$0) {
         for (ast $$1 : this.f) {
            $$1.b($$0);
         }
      }

      public void b(zp<?> $$0) {
         this.a($$0);
         if (this.c instanceof aro) {
            ((aro)this.c).g.b($$0);
         }
      }

      public void a() {
         for (ast $$0 : this.f) {
            this.b.a($$0.o());
         }
      }

      public void a(aro $$0) {
         if (this.f.remove($$0.g)) {
            this.b.a($$0);
         }
      }

      public void b(aro $$0) {
         if ($$0 != this.c) {
            ezn $$1 = $$0.dv().d(this.c.dv());
            int $$2 = aqt.this.b($$0);
            double $$3 = (double)Math.min(this.b(), $$2 * 16);
            double $$4 = $$1.d * $$1.d + $$1.f * $$1.f;
            double $$5 = $$3 * $$3;
            boolean $$6 = $$4 <= $$5 && this.c.a($$0) && aqt.this.a($$0, this.c.dz().g, this.c.dz().h);
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
         return aqt.this.s.o().b($$0);
      }

      private int b() {
         int $$0 = this.d;

         for (bue $$1 : this.c.de()) {
            int $$2 = $$1.ar().o() * 16;
            if ($$2 > $$0) {
               $$0 = $$2;
            }
         }

         return this.a($$0);
      }

      public void a(List<aro> $$0) {
         for (aro $$1 : $$0) {
            this.b($$1);
         }
      }
   }
}
