import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.google.common.collect.Sets;
import com.google.common.collect.ImmutableList.Builder;
import com.google.gson.JsonElement;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.JsonOps;
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
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.slf4j.Logger;

public class apw extends dug implements apu.c {
   private static final byte f = -1;
   private static final byte g = 0;
   private static final byte h = 1;
   private static final Logger i = LogUtils.getLogger();
   private static final int j = 200;
   private static final int k = 20;
   private static final int l = 10000;
   public static final int a = 2;
   public static final int b = 32;
   public static final int c = apv.a(aqg.d);
   private final Long2ObjectLinkedOpenHashMap<apu> m = new Long2ObjectLinkedOpenHashMap();
   private volatile Long2ObjectLinkedOpenHashMap<apu> n = this.m.clone();
   private final Long2ObjectLinkedOpenHashMap<apu> o = new Long2ObjectLinkedOpenHashMap();
   private final LongSet p = new LongOpenHashSet();
   final aqn q;
   private final aqq r;
   private final bom<Runnable> s;
   private dta t;
   private final dxj u;
   private final dtb v;
   private final Supplier<eor> w;
   private final cdu x;
   final LongSet y = new LongOpenHashSet();
   private boolean z;
   private final apz A;
   private final boo<apz.a<Runnable>> B;
   private final boo<apz.a<Runnable>> C;
   private final aqw D;
   private final dvc E;
   private final apw.a F;
   private final AtomicInteger G = new AtomicInteger();
   private final String H;
   private final aqh I = new aqh();
   private final Int2ObjectMap<apw.b> J = new Int2ObjectOpenHashMap();
   private final Long2ByteMap K = new Long2ByteOpenHashMap();
   private final Long2LongMap L = new Long2LongOpenHashMap();
   private final Queue<Runnable> M = Queues.newConcurrentLinkedQueue();
   private int N;
   private duc O;

   public apw(
      aqn $$0,
      eox.c $$1,
      DataFixer $$2,
      elm $$3,
      Executor $$4,
      bom<Runnable> $$5,
      dtm $$6,
      dta $$7,
      aqw $$8,
      dvc $$9,
      Supplier<eor> $$10,
      int $$11,
      boolean $$12
   ) {
      super(new dup($$1.f(), $$0.ae(), "chunk"), $$1.a($$0.ae()).resolve("region"), $$2, $$12);
      Path $$13 = $$1.a($$0.ae());
      this.H = $$13.getFileName().toString();
      this.q = $$0;
      this.t = $$7;
      jl $$14 = $$0.H_();
      long $$15 = $$0.C();
      if ($$7 instanceof dwy $$16) {
         this.u = dxj.a($$16.g().a(), $$14.b(lf.aH), $$15);
      } else {
         this.u = dxj.a(dxa.e(), $$14.b(lf.aH), $$15);
      }

      this.v = $$7.a($$14.b(lf.aL), this.u, $$15);
      this.s = $$5;
      bop<Runnable> $$17 = bop.a($$4, "worldgen");
      boo<Runnable> $$18 = boo.a("main", $$5::i);
      this.D = $$8;
      this.E = $$9;
      bop<Runnable> $$19 = bop.a($$4, "light");
      this.A = new apz(ImmutableList.of($$17, $$18, $$19), $$4, Integer.MAX_VALUE);
      this.B = this.A.a($$17, false);
      this.C = this.A.a($$18, false);
      this.r = new aqq($$6, this, this.q.D_().g(), $$19, this.A.a($$19, false));
      this.F = new apw.a($$4, $$5);
      this.w = $$10;
      this.x = new cdu(new dup($$1.f(), $$0.ae(), "poi"), $$13.resolve("poi"), $$2, $$12, $$14, $$0);
      this.a($$11);
      this.O = new duc($$0, $$7, $$3, this.r);
   }

   protected dta a() {
      return this.t;
   }

   protected dtb b() {
      return this.v;
   }

   protected dxj c() {
      return this.u;
   }

   public void d() {
      DataResult<JsonElement> $$0 = dta.a.encodeStart(JsonOps.INSTANCE, this.t);
      DataResult<dta> $$1 = $$0.flatMap($$0x -> dta.a.parse(JsonOps.INSTANCE, $$0x));
      $$1.ifSuccess($$0x -> {
         this.t = $$0x;
         this.O = new duc(this.O.a(), $$0x, this.O.c(), this.O.d());
      });
   }

   private static double a(dag $$0, brw $$1) {
      double $$2 = (double)jq.a($$0.e, 8);
      double $$3 = (double)jq.a($$0.f, 8);
      double $$4 = $$2 - $$1.du();
      double $$5 = $$3 - $$1.dA();
      return $$4 * $$4 + $$5 * $$5;
   }

   boolean a(aqo $$0, int $$1, int $$2) {
      return $$0.W().a($$1, $$2) && !$$0.c.f.a(dag.c($$1, $$2));
   }

   private boolean b(aqo $$0, int $$1, int $$2) {
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

   protected aqq e() {
      return this.r;
   }

   @Nullable
   protected apu a(long $$0) {
      return (apu)this.m.get($$0);
   }

   @Nullable
   protected apu b(long $$0) {
      return (apu)this.n.get($$0);
   }

   protected IntSupplier c(long $$0) {
      return () -> {
         apu $$1 = this.b($$0);
         return $$1 == null ? apy.a - 1 : Math.min($$1.m(), apy.a - 1);
      };
   }

   public String a(dag $$0) {
      apu $$1 = this.b($$0.a());
      if ($$1 == null) {
         return "null";
      } else {
         String $$2 = $$1.l() + "\n";
         dty $$3 = $$1.g();
         dsz $$4 = $$1.h();
         if ($$3 != null) {
            $$2 = $$2 + "St: §" + $$3.c() + $$3 + "§r\n";
         }

         if ($$4 != null) {
            $$2 = $$2 + "Ch: §" + $$4.j().c() + $$4.j() + "§r\n";
         }

         aqg $$5 = $$1.j();
         $$2 = $$2 + '§' + $$5.ordinal() + $$5;
         return $$2 + "§r";
      }
   }

   private CompletableFuture<apx<List<dsz>>> a(apu $$0, int $$1, IntFunction<dty> $$2) {
      if ($$1 == 0) {
         dty $$3 = $$2.apply(0);
         return $$0.a($$3, this).thenApply($$0x -> $$0x.a(List::of));
      } else {
         List<CompletableFuture<apx<dsz>>> $$4 = new ArrayList<>();
         List<apu> $$5 = new ArrayList<>();
         dag $$6 = $$0.k();
         int $$7 = $$6.e;
         int $$8 = $$6.f;

         for (int $$9 = -$$1; $$9 <= $$1; $$9++) {
            for (int $$10 = -$$1; $$10 <= $$1; $$10++) {
               int $$11 = Math.max(Math.abs($$10), Math.abs($$9));
               dag $$12 = new dag($$7 + $$10, $$8 + $$9);
               long $$13 = $$12.a();
               apu $$14 = this.a($$13);
               if ($$14 == null) {
                  return CompletableFuture.completedFuture(apx.a(() -> "Unloaded " + $$12));
               }

               dty $$15 = $$2.apply($$11);
               CompletableFuture<apx<dsz>> $$16 = $$14.a($$15, this);
               $$5.add($$14);
               $$4.add($$16);
            }
         }

         CompletableFuture<List<apx<dsz>>> $$17 = ac.d($$4);
         CompletableFuture<apx<List<dsz>>> $$18 = $$17.thenApply($$3 -> {
            List<dsz> $$4x = Lists.newArrayList();
            int $$5x = 0;

            for (apx<dsz> $$6x : $$3) {
               if ($$6x == null) {
                  throw this.a(new IllegalStateException("At least one of the chunk futures were null"), "n/a");
               }

               dsz $$7x = $$6x.b(null);
               if ($$7x == null) {
                  int $$8x = $$5x;
                  return apx.a(() -> "Unloaded " + new dag($$7 + $$8x % ($$1 * 2 + 1), $$8 + $$8x / ($$1 * 2 + 1)) + " " + $$6x.b());
               }

               $$4x.add($$7x);
               $$5x++;
            }

            return apx.a($$4x);
         });

         for (apu $$19 : $$5) {
            $$19.a("getChunkRangeFuture " + $$6 + " " + $$1, $$18);
         }

         return $$18;
      }
   }

   public y a(IllegalStateException $$0, String $$1) {
      StringBuilder $$2 = new StringBuilder();
      Consumer<apu> $$3 = $$1x -> $$1x.p().forEach($$2x -> {
            dty $$3x = (dty)$$2x.getFirst();
            CompletableFuture<apx<dsz>> $$4x = (CompletableFuture<apx<dsz>>)$$2x.getSecond();
            if ($$4x != null && $$4x.isDone() && $$4x.join() == null) {
               $$2.append($$1x.k()).append(" - status: ").append($$3x).append(" future: ").append($$4x).append(System.lineSeparator());
            }
         });
      $$2.append("Updating:").append(System.lineSeparator());
      this.m.values().forEach($$3);
      $$2.append("Visible:").append(System.lineSeparator());
      this.n.values().forEach($$3);
      o $$4 = o.a($$0, "Chunk loading");
      p $$5 = $$4.a("Chunk loading");
      $$5.a("Details", $$1);
      $$5.a("Futures", $$2);
      return new y($$4);
   }

   public CompletableFuture<apx<dtj>> a(apu $$0) {
      return this.a($$0, 2, $$0x -> dty.n).thenApplyAsync($$0x -> $$0x.a($$0xx -> (dtj)$$0xx.get($$0xx.size() / 2)), this.s);
   }

   @Nullable
   apu a(long $$0, int $$1, @Nullable apu $$2, int $$3) {
      if (!apv.e($$3) && !apv.e($$1)) {
         return $$2;
      } else {
         if ($$2 != null) {
            $$2.a($$1);
         }

         if ($$2 != null) {
            if (!apv.e($$1)) {
               this.y.add($$0);
            } else {
               this.y.remove($$0);
            }
         }

         if (apv.e($$1) && $$2 == null) {
            $$2 = (apu)this.o.remove($$0);
            if ($$2 != null) {
               $$2.a($$1);
            } else {
               $$2 = new apu(new dag($$0), $$1, this.q, this.r, this.A, this);
            }

            this.m.put($$0, $$2);
            this.z = true;
         }

         return $$2;
      }
   }

   @Override
   public void close() throws IOException {
      try {
         this.A.close();
         this.x.close();
      } finally {
         super.close();
      }
   }

   protected void a(boolean $$0) {
      if ($$0) {
         List<apu> $$1 = this.n.values().stream().filter(apu::n).peek(apu::o).toList();
         MutableBoolean $$2 = new MutableBoolean();

         do {
            $$2.setFalse();
            $$1.stream().map($$0x -> {
               CompletableFuture<dsz> $$1x;
               do {
                  $$1x = $$0x.i();
                  this.s.c($$1x::isDone);
               } while ($$1x != $$0x.i());

               return $$1x.join();
            }).filter($$0x -> $$0x instanceof dti || $$0x instanceof dtj).filter(this::a).forEach($$1x -> $$2.setTrue());
         } while ($$2.isTrue());

         this.b(() -> true);
         this.o();
      } else {
         this.n.values().forEach(this::d);
      }
   }

   protected void a(BooleanSupplier $$0) {
      bmk $$1 = this.q.af();
      $$1.a("poi");
      this.x.a($$0);
      $$1.b("chunk_unload");
      if (!this.q.t()) {
         this.b($$0);
      }

      $$1.c();
   }

   public boolean f() {
      return this.r.K_() || !this.o.isEmpty() || !this.m.isEmpty() || this.x.a() || !this.y.isEmpty() || !this.M.isEmpty() || this.A.a() || this.F.f();
   }

   private void b(BooleanSupplier $$0) {
      LongIterator $$1 = this.y.iterator();

      for (int $$2 = 0; $$1.hasNext() && ($$0.getAsBoolean() || $$2 < 200 || this.y.size() > 2000); $$1.remove()) {
         long $$3 = $$1.nextLong();
         apu $$4 = (apu)this.m.remove($$3);
         if ($$4 != null) {
            this.o.put($$3, $$4);
            this.z = true;
            $$2++;
            this.a($$3, $$4);
         }
      }

      int $$5 = Math.max(0, this.M.size() - 2000);

      Runnable $$6;
      while (($$0.getAsBoolean() || $$5 > 0) && ($$6 = this.M.poll()) != null) {
         $$5--;
         $$6.run();
      }

      int $$7 = 0;
      ObjectIterator<apu> $$8 = this.n.values().iterator();

      while ($$7 < 20 && $$0.getAsBoolean() && $$8.hasNext()) {
         if (this.d((apu)$$8.next())) {
            $$7++;
         }
      }
   }

   private void a(long $$0, apu $$1) {
      CompletableFuture<dsz> $$2 = $$1.i();
      $$2.thenAcceptAsync($$3 -> {
         CompletableFuture<dsz> $$4 = $$1.i();
         if ($$4 != $$2) {
            this.a($$0, $$1);
         } else {
            if (this.o.remove($$0, $$1) && $$3 != null) {
               if ($$3 instanceof dtj) {
                  ((dtj)$$3).c(false);
               }

               this.a($$3);
               if (this.p.remove($$0) && $$3 instanceof dtj $$5) {
                  this.q.a($$5);
               }

               this.r.a($$3.f());
               this.r.b();
               this.D.a($$3.f(), null);
               this.L.remove($$3.f().a());
            }
         }
      }, this.M::add).whenComplete(($$1x, $$2x) -> {
         if ($$2x != null) {
            i.error("Failed to save chunk {}", $$1.k(), $$2x);
         }
      });
   }

   protected boolean g() {
      if (!this.z) {
         return false;
      } else {
         this.n = this.m.clone();
         this.z = false;
         return true;
      }
   }

   public CompletableFuture<apx<dsz>> a(apu $$0, dty $$1) {
      dag $$2 = $$0.k();
      if ($$1 == dty.c) {
         return this.g($$2).thenApply(apx::a);
      } else {
         if ($$1 == dty.l) {
            this.F.a(aqs.e, $$2, apv.a(dty.l), $$2);
         }

         if (!$$1.f()) {
            dsz $$3 = $$0.a($$1.d(), this).getNow(apu.a).b(null);
            if ($$3 != null && $$3.j().b($$1)) {
               CompletableFuture<dsz> $$4 = $$1.a(this.O, $$1x -> this.a($$0, $$1x), $$3);
               this.D.a($$2, $$1);
               return $$4.thenApply(apx::a);
            }
         }

         return this.b($$0, $$1);
      }
   }

   private CompletableFuture<dsz> g(dag $$0) {
      return this.k($$0).thenApply($$1 -> $$1.filter($$1x -> {
            boolean $$2 = b($$1x);
            if (!$$2) {
               i.error("Chunk file at {} is missing level data, skipping", $$0);
            }

            return $$2;
         })).thenApplyAsync($$1 -> {
         this.q.af().d("chunkLoad");
         if ($$1.isPresent()) {
            dsz $$2 = duf.a(this.q, this.x, $$0, $$1.get());
            this.a($$0, $$2.j().g());
            return $$2;
         } else {
            return this.h($$0);
         }
      }, this.s).exceptionallyAsync($$1 -> this.a($$1, $$0), this.s);
   }

   private static boolean b(ud $$0) {
      return $$0.b("Status", 8);
   }

   private dsz a(Throwable $$0, dag $$1) {
      Throwable $$3 = $$0 instanceof CompletionException $$2 ? $$2.getCause() : $$0;
      Throwable $$5 = $$3 instanceof y $$4 ? $$4.getCause() : $$3;
      boolean $$6 = $$5 instanceof Error;
      boolean $$7 = $$5 instanceof IOException || $$5 instanceof duf.a;
      if (!$$6 && $$7) {
         i.error("Couldn't load chunk {}", $$1, $$5);
         this.q.o().a($$1);
         return this.h($$1);
      } else {
         o $$8 = o.a($$0, "Exception loading chunk");
         p $$9 = $$8.a("Chunk being loaded");
         $$9.a("pos", $$1);
         this.i($$1);
         throw new y($$8);
      }
   }

   private dsz h(dag $$0) {
      this.i($$0);
      return new dtt($$0, dtw.a, this.q, this.q.H_().d(lf.az), null);
   }

   private void i(dag $$0) {
      this.K.put($$0.a(), (byte)-1);
   }

   private byte a(dag $$0, dua $$1) {
      return this.K.put($$0.a(), (byte)($$1 == dua.a ? -1 : 1));
   }

   private CompletableFuture<apx<dsz>> b(apu $$0, dty $$1) {
      dag $$2 = $$0.k();
      CompletableFuture<apx<List<dsz>>> $$3 = this.a($$0, $$1.e(), $$1x -> this.a($$1, $$1x));
      this.q.af().c(() -> "chunkGenerate " + $$1);
      Executor $$4 = $$1x -> this.B.a(apz.a($$0, $$1x));
      return $$3.thenComposeAsync($$4x -> {
         List<dsz> $$5 = (List<dsz>)$$4x.b(null);
         if ($$5 == null) {
            this.b($$2);
            return CompletableFuture.completedFuture(apx.a($$4x::b));
         } else {
            try {
               dsz $$6 = $$5.get($$5.size() / 2);
               CompletableFuture<dsz> $$7;
               if ($$6.j().b($$1)) {
                  $$7 = $$1.a(this.O, $$1xx -> this.a($$0, $$1xx), $$6);
               } else {
                  $$7 = $$1.a(this.O, $$4, $$1xx -> this.a($$0, $$1xx), $$5);
               }

               this.D.a($$2, $$1);
               return $$7.thenApply(apx::a);
            } catch (Exception var10) {
               var10.getStackTrace();
               o $$10 = o.a(var10, "Exception generating new chunk");
               p $$11 = $$10.a("Chunk to be generated");
               $$11.a("Status being generated", () -> le.n.b($$1).toString());
               $$11.a("Location", String.format(Locale.ROOT, "%d,%d", $$2.e, $$2.f));
               $$11.a("Position hash", dag.c($$2.e, $$2.f));
               $$11.a("Generator", this.t);
               this.s.execute(() -> {
                  throw new y($$10);
               });
               throw new y($$10);
            }
         }
      }, $$4);
   }

   protected void b(dag $$0) {
      this.s.i(ac.a((Runnable)(() -> this.F.b(aqs.e, $$0, apv.a(dty.l), $$0)), (Supplier<String>)(() -> "release light ticket " + $$0)));
   }

   private dty a(dty $$0, int $$1) {
      dty $$2;
      if ($$1 == 0) {
         $$2 = $$0.d();
      } else {
         $$2 = dty.a(dty.a($$0) + $$1);
      }

      return $$2;
   }

   private static void a(aqn $$0, List<ud> $$1) {
      if (!$$1.isEmpty()) {
         $$0.b(bsc.a($$1, $$0));
      }
   }

   private CompletableFuture<dsz> a(apu $$0, dsz $$1) {
      return CompletableFuture.supplyAsync(() -> {
         dag $$2 = $$0.k();
         dtt $$3 = (dtt)$$1;
         dtj $$4;
         if ($$3 instanceof dti) {
            $$4 = ((dti)$$3).C();
         } else {
            $$4 = new dtj(this.q, $$3, $$1xx -> a(this.q, $$3.E()));
            $$0.a(new dti($$4, false));
         }

         $$4.b(() -> apv.b($$0.l()));
         $$4.E();
         if (this.p.add($$2.a())) {
            $$4.c(true);
            $$4.J();
            $$4.a(this.q);
         }

         return $$4;
      }, $$1x -> this.C.a(apz.a($$1x, $$0.k().a(), $$0::l)));
   }

   public CompletableFuture<apx<dtj>> b(apu $$0) {
      CompletableFuture<apx<List<dsz>>> $$1 = this.a($$0, 1, $$0x -> dty.n);
      CompletableFuture<apx<dtj>> $$2 = $$1.<apx<dtj>>thenApplyAsync(
            $$0x -> $$0x.a($$0xx -> (dtj)$$0xx.get($$0xx.size() / 2)), $$1x -> this.C.a(apz.a($$0, $$1x))
         )
         .thenApplyAsync($$1x -> $$1x.a($$1xx -> {
               $$1xx.H();
               this.q.b($$1xx);
               CompletableFuture<?> $$2x = $$0.e();
               if ($$2x.isDone()) {
                  this.a($$1xx);
               } else {
                  $$2x.thenAcceptAsync($$1xxx -> this.a($$1xx), this.s);
               }
            }), this.s);
      $$2.handle(($$0x, $$1x) -> {
         this.G.getAndIncrement();
         return null;
      });
      return $$2;
   }

   private void a(dtj $$0) {
      dag $$1 = $$0.f();

      for (aqo $$2 : this.I.a()) {
         if ($$2.W().a($$1)) {
            a($$2, $$0);
         }
      }
   }

   public CompletableFuture<apx<dtj>> c(apu $$0) {
      return this.a($$0, 1, dty::a).thenApplyAsync($$0x -> $$0x.a($$0xx -> (dtj)$$0xx.get($$0xx.size() / 2)), $$1 -> this.C.a(apz.a($$0, $$1)));
   }

   public int h() {
      return this.G.get();
   }

   private boolean d(apu $$0) {
      if (!$$0.n()) {
         return false;
      } else {
         dsz $$1 = $$0.i().getNow(null);
         if (!($$1 instanceof dti) && !($$1 instanceof dtj)) {
            return false;
         } else {
            long $$2 = $$1.f().a();
            long $$3 = this.L.getOrDefault($$2, -1L);
            long $$4 = System.currentTimeMillis();
            if ($$4 < $$3) {
               return false;
            } else {
               boolean $$5 = this.a($$1);
               $$0.o();
               if ($$5) {
                  this.L.put($$2, $$4 + 10000L);
               }

               return $$5;
            }
         }
      }
   }

   private boolean a(dsz $$0) {
      this.x.a($$0.f());
      if (!$$0.i()) {
         return false;
      } else {
         $$0.a(false);
         dag $$1 = $$0.f();

         try {
            dty $$2 = $$0.j();
            if ($$2.g() != dua.b) {
               if (this.j($$1)) {
                  return false;
               }

               if ($$2 == dty.c && $$0.g().values().stream().noneMatch(eht::b)) {
                  return false;
               }
            }

            this.q.af().d("chunkSave");
            ud $$3 = duf.a(this.q, $$0);
            this.a($$1, $$3).exceptionallyAsync($$1x -> {
               this.q.o().b($$1);
               return null;
            }, this.s);
            this.a($$1, $$2.g());
            return true;
         } catch (Exception var5) {
            i.error("Failed to save chunk {},{}", new Object[]{$$1.e, $$1.f, var5});
            this.q.o().b($$1);
            return false;
         }
      }
   }

   private boolean j(dag $$0) {
      byte $$1 = this.K.get($$0.a());
      if ($$1 != 0) {
         return $$1 == 1;
      } else {
         ud $$2;
         try {
            $$2 = this.k($$0).join().orElse(null);
            if ($$2 == null) {
               this.i($$0);
               return false;
            }
         } catch (Exception var5) {
            i.error("Failed to read chunk {}", $$0, var5);
            this.i($$0);
            return false;
         }

         dua $$5 = duf.a($$2);
         return this.a($$0, $$5) == 1;
      }
   }

   protected void a(int $$0) {
      int $$1 = ayf.a($$0, 2, 32);
      if ($$1 != this.N) {
         this.N = $$1;
         this.F.a(this.N);

         for (aqo $$2 : this.I.a()) {
            this.e($$2);
         }
      }
   }

   int b(aqo $$0) {
      return ayf.a($$0.E(), 2, this.N);
   }

   private void a(aqo $$0, dag $$1) {
      dtj $$2 = this.d($$1.a());
      if ($$2 != null) {
         a($$0, $$2);
      }
   }

   private static void a(aqo $$0, dtj $$1) {
      $$0.c.f.a($$1);
   }

   private static void b(aqo $$0, dag $$1) {
      $$0.c.f.a($$0, $$1);
   }

   @Nullable
   public dtj d(long $$0) {
      apu $$1 = this.b($$0);
      return $$1 == null ? null : $$1.f();
   }

   public int i() {
      return this.n.size();
   }

   public aqf j() {
      return this.F;
   }

   protected Iterable<apu> k() {
      return Iterables.unmodifiableIterable(this.n.values());
   }

   void a(Writer $$0) throws IOException {
      axf $$1 = axf.a()
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
      aqt $$2 = this.F.d();
      ObjectBidirectionalIterator var4 = this.n.long2ObjectEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<apu> $$3 = (Entry<apu>)var4.next();
         long $$4 = $$3.getLongKey();
         dag $$5 = new dag($$4);
         apu $$6 = (apu)$$3.getValue();
         Optional<dsz> $$7 = Optional.ofNullable($$6.h());
         Optional<dtj> $$8 = $$7.flatMap($$0x -> $$0x instanceof dtj ? Optional.of((dtj)$$0x) : Optional.empty());
         $$1.a(
            $$5.e,
            $$5.f,
            $$6.l(),
            $$7.isPresent(),
            $$7.map(dsz::j).orElse(null),
            $$8.map(dtj::D).orElse(null),
            a($$6.c()),
            a($$6.a()),
            a($$6.b()),
            this.F.e($$4),
            this.c($$5),
            $$8.<Integer>map($$0x -> $$0x.G().size()).orElse(0),
            $$2.d($$4),
            $$2.c($$4),
            $$8.<Integer>map($$0x -> $$0x.o().a()).orElse(0),
            $$8.<Integer>map($$0x -> $$0x.p().a()).orElse(0)
         );
      }
   }

   private static String a(CompletableFuture<apx<dtj>> $$0) {
      try {
         apx<dtj> $$1 = $$0.getNow(null);
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

   private CompletableFuture<Optional<ud>> k(dag $$0) {
      return this.e($$0).thenApplyAsync($$0x -> $$0x.map(this::c), ac.g());
   }

   private ud c(ud $$0) {
      return this.a(this.q.ae(), this.w, $$0, this.t.b());
   }

   boolean c(dag $$0) {
      if (!this.F.f($$0.a())) {
         return false;
      } else {
         for (aqo $$1 : this.I.a()) {
            if (this.c($$1, $$0)) {
               return true;
            }
         }

         return false;
      }
   }

   public List<aqo> d(dag $$0) {
      long $$1 = $$0.a();
      if (!this.F.f($$1)) {
         return List.of();
      } else {
         Builder<aqo> $$2 = ImmutableList.builder();

         for (aqo $$3 : this.I.a()) {
            if (this.c($$3, $$0)) {
               $$2.add($$3);
            }
         }

         return $$2.build();
      }
   }

   private boolean c(aqo $$0, dag $$1) {
      if ($$0.N_()) {
         return false;
      } else {
         double $$2 = a($$1, $$0);
         return $$2 < 16384.0;
      }
   }

   private boolean c(aqo $$0) {
      return $$0.N_() && !this.q.aa().b(dav.r);
   }

   void a(aqo $$0, boolean $$1) {
      boolean $$2 = this.c($$0);
      boolean $$3 = this.I.d($$0);
      if ($$1) {
         this.I.a($$0, $$2);
         this.d($$0);
         if (!$$2) {
            this.F.a(jq.a($$0), $$0);
         }

         $$0.a(aqb.a);
         this.e($$0);
      } else {
         jq $$4 = $$0.V();
         this.I.a($$0);
         if (!$$3) {
            this.F.b($$4, $$0);
         }

         this.a($$0, aqb.a);
      }
   }

   private void d(aqo $$0) {
      jq $$1 = jq.a($$0);
      $$0.a($$1);
   }

   public void a(aqo $$0) {
      ObjectIterator $$2 = this.J.values().iterator();

      while ($$2.hasNext()) {
         apw.b $$1 = (apw.b)$$2.next();
         if ($$1.c == $$0) {
            $$1.a(this.q.x());
         } else {
            $$1.b($$0);
         }
      }

      jq $$2x = $$0.V();
      jq $$3 = jq.a($$0);
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

   private void e(aqo $$0) {
      dag $$1 = $$0.dr();
      int $$2 = this.b($$0);
      if ($$0.W() instanceof aqb.a $$3 && $$3.a().equals($$1) && $$3.b() == $$2) {
         return;
      }

      this.a($$0, aqb.a($$1, $$2));
   }

   private void a(aqo $$0, aqb $$1) {
      if ($$0.dP() == this.q) {
         aqb $$2 = $$0.W();
         if ($$1 instanceof aqb.a $$3 && (!($$2 instanceof aqb.a $$4) || !$$4.a().equals($$3.a()))) {
            $$0.c.b(new aer($$3.a().e, $$3.a().f));
         }

         aqb.a($$2, $$1, $$1x -> this.a($$0, $$1x), $$1x -> b($$0, $$1x));
         $$0.a($$1);
      }
   }

   @Override
   public List<aqo> a(dag $$0, boolean $$1) {
      Set<aqo> $$2 = this.I.a();
      Builder<aqo> $$3 = ImmutableList.builder();

      for (aqo $$4 : $$2) {
         if ($$1 && this.b($$4, $$0.e, $$0.f) || !$$1 && this.a($$4, $$0.e, $$0.f)) {
            $$3.add($$4);
         }
      }

      return $$3.build();
   }

   protected void a(brw $$0) {
      if (!($$0 instanceof cha)) {
         bsc<?> $$1 = $$0.ak();
         int $$2 = $$1.o() * 16;
         if ($$2 != 0) {
            int $$3 = $$1.p();
            if (this.J.containsKey($$0.al())) {
               throw (IllegalStateException)ac.b(new IllegalStateException("Entity is already tracked!"));
            } else {
               apw.b $$4 = new apw.b($$0, $$2, $$3, $$1.q());
               this.J.put($$0.al(), $$4);
               $$4.a(this.q.x());
               if ($$0 instanceof aqo $$5) {
                  this.a($$5, true);
                  ObjectIterator var7 = this.J.values().iterator();

                  while (var7.hasNext()) {
                     apw.b $$6 = (apw.b)var7.next();
                     if ($$6.c != $$5) {
                        $$6.b($$5);
                     }
                  }
               }
            }
         }
      }
   }

   protected void b(brw $$0) {
      if ($$0 instanceof aqo $$1) {
         this.a($$1, false);
         ObjectIterator var3 = this.J.values().iterator();

         while (var3.hasNext()) {
            apw.b $$2 = (apw.b)var3.next();
            $$2.a($$1);
         }
      }

      apw.b $$3 = (apw.b)this.J.remove($$0.al());
      if ($$3 != null) {
         $$3.a();
      }
   }

   protected void l() {
      for (aqo $$0 : this.I.a()) {
         this.e($$0);
      }

      List<aqo> $$1 = Lists.newArrayList();
      List<aqo> $$2 = this.q.x();
      ObjectIterator var3 = this.J.values().iterator();

      while (var3.hasNext()) {
         apw.b $$3 = (apw.b)var3.next();
         jq $$4 = $$3.e;
         jq $$5 = jq.a($$3.c);
         boolean $$6 = !Objects.equals($$4, $$5);
         if ($$6) {
            $$3.a($$2);
            brw $$7 = $$3.c;
            if ($$7 instanceof aqo) {
               $$1.add((aqo)$$7);
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
            apw.b $$8 = (apw.b)var3.next();
            $$8.a($$1);
         }
      }
   }

   public void a(brw $$0, ze<?> $$1) {
      apw.b $$2 = (apw.b)this.J.get($$0.al());
      if ($$2 != null) {
         $$2.a($$1);
      }
   }

   protected void b(brw $$0, ze<?> $$1) {
      apw.b $$2 = (apw.b)this.J.get($$0.al());
      if ($$2 != null) {
         $$2.b($$1);
      }
   }

   public void a(List<dsz> $$0) {
      Map<aqo, List<dtj>> $$1 = new HashMap<>();

      for (dsz $$2 : $$0) {
         dag $$3 = $$2.f();
         dtj $$5;
         if ($$2 instanceof dtj $$4) {
            $$5 = $$4;
         } else {
            $$5 = this.q.d($$3.e, $$3.f);
         }

         for (aqo $$7 : this.a($$3, false)) {
            $$1.computeIfAbsent($$7, $$0x -> new ArrayList<>()).add($$5);
         }
      }

      $$1.forEach(($$0x, $$1x) -> $$0x.c.b(acg.a($$1x)));
   }

   protected cdu m() {
      return this.x;
   }

   public String n() {
      return this.H;
   }

   void a(dag $$0, aqg $$1) {
      this.E.onChunkStatusChange($$0, $$1);
   }

   public void a(dag $$0, int $$1) {
      int $$2 = $$1 + 1;
      dag.a($$0, $$2).forEach($$0x -> {
         apu $$1x = this.b($$0x.a());
         if ($$1x != null) {
            $$1x.a(this.r.a($$0x.e, $$0x.f));
         }
      });
   }

   class a extends aqf {
      protected a(Executor $$0, Executor $$1) {
         super($$0, $$1);
      }

      @Override
      protected boolean a(long $$0) {
         return apw.this.y.contains($$0);
      }

      @Nullable
      @Override
      protected apu b(long $$0) {
         return apw.this.a($$0);
      }

      @Nullable
      @Override
      protected apu a(long $$0, int $$1, @Nullable apu $$2, int $$3) {
         return apw.this.a($$0, $$1, $$2, $$3);
      }
   }

   class b {
      final aqm b;
      final brw c;
      private final int d;
      jq e;
      private final Set<arq> f = Sets.newIdentityHashSet();

      public b(brw $$0, int $$1, int $$2, boolean $$3) {
         this.b = new aqm(apw.this.q, $$0, $$2, $$3, this::a);
         this.c = $$0;
         this.d = $$1;
         this.e = jq.a($$0);
      }

      @Override
      public boolean equals(Object $$0) {
         return $$0 instanceof apw.b ? ((apw.b)$$0).c.al() == this.c.al() : false;
      }

      @Override
      public int hashCode() {
         return this.c.al();
      }

      public void a(ze<?> $$0) {
         for (arq $$1 : this.f) {
            $$1.b($$0);
         }
      }

      public void b(ze<?> $$0) {
         this.a($$0);
         if (this.c instanceof aqo) {
            ((aqo)this.c).c.b($$0);
         }
      }

      public void a() {
         for (arq $$0 : this.f) {
            this.b.a($$0.p());
         }
      }

      public void a(aqo $$0) {
         if (this.f.remove($$0.c)) {
            this.b.a($$0);
         }
      }

      public void b(aqo $$0) {
         if ($$0 != this.c) {
            eum $$1 = $$0.dn().d(this.c.dn());
            int $$2 = apw.this.b($$0);
            double $$3 = (double)Math.min(this.b(), $$2 * 16);
            double $$4 = $$1.c * $$1.c + $$1.e * $$1.e;
            double $$5 = $$3 * $$3;
            boolean $$6 = $$4 <= $$5 && this.c.a($$0) && apw.this.a($$0, this.c.dr().e, this.c.dr().f);
            if ($$6) {
               if (this.f.add($$0.c)) {
                  this.b.b($$0);
               }
            } else if (this.f.remove($$0.c)) {
               this.b.a($$0);
            }
         }
      }

      private int a(int $$0) {
         return apw.this.q.o().b($$0);
      }

      private int b() {
         int $$0 = this.d;

         for (brw $$1 : this.c.cW()) {
            int $$2 = $$1.ak().o() * 16;
            if ($$2 > $$0) {
               $$0 = $$2;
            }
         }

         return this.a($$0);
      }

      public void a(List<aqo> $$0) {
         for (aqo $$1 : $$0) {
            this.b($$1);
         }
      }
   }
}
