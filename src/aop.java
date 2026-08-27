import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.google.common.collect.Sets;
import com.google.common.collect.ImmutableList.Builder;
import com.google.gson.JsonElement;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.util.Either;
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
import java.util.concurrent.CompletionStage;
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

public class aop extends dpz implements aon.d {
   private static final byte f = -1;
   private static final byte g = 0;
   private static final byte h = 1;
   private static final Logger i = LogUtils.getLogger();
   private static final int j = 200;
   private static final int k = 20;
   private static final int l = 10000;
   public static final int a = 2;
   public static final int b = 32;
   public static final int c = aoo.a(aoy.d);
   private final Long2ObjectLinkedOpenHashMap<aon> m = new Long2ObjectLinkedOpenHashMap();
   private volatile Long2ObjectLinkedOpenHashMap<aon> n = this.m.clone();
   private final Long2ObjectLinkedOpenHashMap<aon> o = new Long2ObjectLinkedOpenHashMap();
   private final LongSet p = new LongOpenHashSet();
   final apf q;
   private final api r;
   private final blt<Runnable> s;
   private doy t;
   private final dtc u;
   private final doz v;
   private final Supplier<ekg> w;
   private final cas x;
   final LongSet y = new LongOpenHashSet();
   private boolean z;
   private final aor A;
   private final blv<aor.a<Runnable>> B;
   private final blv<aor.a<Runnable>> C;
   private final apo D;
   private final dqv E;
   private final aop.a F;
   private final AtomicInteger G = new AtomicInteger();
   private final ehf H;
   private final String I;
   private final aoz J = new aoz();
   private final Int2ObjectMap<aop.b> K = new Int2ObjectOpenHashMap();
   private final Long2ByteMap L = new Long2ByteOpenHashMap();
   private final Long2LongMap M = new Long2LongOpenHashMap();
   private final Queue<Runnable> N = Queues.newConcurrentLinkedQueue();
   private int O;

   public aop(
      apf $$0,
      ekm.c $$1,
      DataFixer $$2,
      ehf $$3,
      Executor $$4,
      blt<Runnable> $$5,
      dpl $$6,
      doy $$7,
      apo $$8,
      dqv $$9,
      Supplier<ekg> $$10,
      int $$11,
      boolean $$12
   ) {
      super(new dqi($$1.d(), $$0.ad(), "chunk"), $$1.a($$0.ad()).resolve("region"), $$2, $$12);
      this.H = $$3;
      Path $$13 = $$1.a($$0.ad());
      this.I = $$13.getFileName().toString();
      this.q = $$0;
      this.t = $$7;
      iz $$14 = $$0.H_();
      long $$15 = $$0.C();
      if ($$7 instanceof dsr $$16) {
         this.u = dtc.a($$16.g().a(), $$14.b(kj.aC), $$15);
      } else {
         this.u = dtc.a(dst.e(), $$14.b(kj.aC), $$15);
      }

      this.v = $$7.a($$14.b(kj.aG), this.u, $$15);
      this.s = $$5;
      blw<Runnable> $$17 = blw.a($$4, "worldgen");
      blv<Runnable> $$18 = blv.a("main", $$5::i);
      this.D = $$8;
      this.E = $$9;
      blw<Runnable> $$19 = blw.a($$4, "light");
      this.A = new aor(ImmutableList.of($$17, $$18, $$19), $$4, Integer.MAX_VALUE);
      this.B = this.A.a($$17, false);
      this.C = this.A.a($$18, false);
      this.r = new api($$6, this, this.q.D_().g(), $$19, this.A.a($$19, false));
      this.F = new aop.a($$4, $$5);
      this.w = $$10;
      this.x = new cas(new dqi($$1.d(), $$0.ad(), "poi"), $$13.resolve("poi"), $$2, $$12, $$14, $$0);
      this.a($$11);
   }

   protected doy a() {
      return this.t;
   }

   protected doz b() {
      return this.v;
   }

   protected dtc c() {
      return this.u;
   }

   public void d() {
      DataResult<JsonElement> $$0 = doy.a.encodeStart(JsonOps.INSTANCE, this.t);
      DataResult<doy> $$1 = $$0.flatMap($$0x -> doy.a.parse(JsonOps.INSTANCE, $$0x));
      $$1.result().ifPresent($$0x -> this.t = $$0x);
   }

   private static double a(cwi $$0, box $$1) {
      double $$2 = (double)je.a($$0.e, 8);
      double $$3 = (double)je.a($$0.f, 8);
      double $$4 = $$2 - $$1.dr();
      double $$5 = $$3 - $$1.dx();
      return $$4 * $$4 + $$5 * $$5;
   }

   boolean a(apg $$0, int $$1, int $$2) {
      return $$0.W().a($$1, $$2) && !$$0.d.f.a(cwi.c($$1, $$2));
   }

   private boolean b(apg $$0, int $$1, int $$2) {
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

   protected api e() {
      return this.r;
   }

   @Nullable
   protected aon a(long $$0) {
      return (aon)this.m.get($$0);
   }

   @Nullable
   protected aon b(long $$0) {
      return (aon)this.n.get($$0);
   }

   protected IntSupplier c(long $$0) {
      return () -> {
         aon $$1 = this.b($$0);
         return $$1 == null ? aoq.a - 1 : Math.min($$1.n(), aoq.a - 1);
      };
   }

   public String a(cwi $$0) {
      aon $$1 = this.b($$0.a());
      if ($$1 == null) {
         return "null";
      } else {
         String $$2 = $$1.m() + "\n";
         dpc $$3 = $$1.h();
         dox $$4 = $$1.i();
         if ($$3 != null) {
            $$2 = $$2 + "St: §" + $$3.c() + $$3 + "§r\n";
         }

         if ($$4 != null) {
            $$2 = $$2 + "Ch: §" + $$4.j().c() + $$4.j() + "§r\n";
         }

         aoy $$5 = $$1.k();
         $$2 = $$2 + '§' + $$5.ordinal() + $$5;
         return $$2 + "§r";
      }
   }

   private CompletableFuture<Either<List<dox>, aon.a>> a(aon $$0, int $$1, IntFunction<dpc> $$2) {
      if ($$1 == 0) {
         dpc $$3 = $$2.apply(0);
         return $$0.a($$3, this).thenApply($$0x -> $$0x.mapLeft(List::of));
      } else {
         List<CompletableFuture<Either<dox, aon.a>>> $$4 = new ArrayList<>();
         List<aon> $$5 = new ArrayList<>();
         cwi $$6 = $$0.l();
         int $$7 = $$6.e;
         int $$8 = $$6.f;

         for (int $$9 = -$$1; $$9 <= $$1; $$9++) {
            for (int $$10 = -$$1; $$10 <= $$1; $$10++) {
               int $$11 = Math.max(Math.abs($$10), Math.abs($$9));
               final cwi $$12 = new cwi($$7 + $$10, $$8 + $$9);
               long $$13 = $$12.a();
               aon $$14 = this.a($$13);
               if ($$14 == null) {
                  return CompletableFuture.completedFuture(Either.right(new aon.a() {
                     @Override
                     public String toString() {
                        return "Unloaded " + $$12;
                     }
                  }));
               }

               dpc $$15 = $$2.apply($$11);
               CompletableFuture<Either<dox, aon.a>> $$16 = $$14.a($$15, this);
               $$5.add($$14);
               $$4.add($$16);
            }
         }

         CompletableFuture<List<Either<dox, aon.a>>> $$17 = ac.d($$4);
         CompletableFuture<Either<List<dox>, aon.a>> $$18 = $$17.thenApply($$3 -> {
            List<dox> $$4x = Lists.newArrayList();
            int $$5x = 0;

            for (final Either<dox, aon.a> $$6x : $$3) {
               if ($$6x == null) {
                  throw this.a(new IllegalStateException("At least one of the chunk futures were null"), "n/a");
               }

               Optional<dox> $$7x = $$6x.left();
               if ($$7x.isEmpty()) {
                  final int $$8x = $$5x;
                  return Either.right(new aon.a() {
                     @Override
                     public String toString() {
                        return "Unloaded " + new cwi($$7 + $$8x % ($$1 * 2 + 1), $$8 + $$8x / ($$1 * 2 + 1)) + " " + $$6x.right().get();
                     }
                  });
               }

               $$4x.add($$7x.get());
               $$5x++;
            }

            return Either.left($$4x);
         });

         for (aon $$19 : $$5) {
            $$19.a("getChunkRangeFuture " + $$6 + " " + $$1, $$18);
         }

         return $$18;
      }
   }

   public y a(IllegalStateException $$0, String $$1) {
      StringBuilder $$2 = new StringBuilder();
      Consumer<aon> $$3 = $$1x -> $$1x.q().forEach($$2x -> {
            dpc $$3x = (dpc)$$2x.getFirst();
            CompletableFuture<Either<dox, aon.a>> $$4x = (CompletableFuture<Either<dox, aon.a>>)$$2x.getSecond();
            if ($$4x != null && $$4x.isDone() && $$4x.join() == null) {
               $$2.append($$1x.l()).append(" - status: ").append($$3x).append(" future: ").append($$4x).append(System.lineSeparator());
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

   public CompletableFuture<Either<dpi, aon.a>> a(aon $$0) {
      return this.a($$0, 2, $$0x -> dpc.n).thenApplyAsync($$0x -> $$0x.mapLeft($$0xx -> (dpi)$$0xx.get($$0xx.size() / 2)), this.s);
   }

   @Nullable
   aon a(long $$0, int $$1, @Nullable aon $$2, int $$3) {
      if (!aoo.e($$3) && !aoo.e($$1)) {
         return $$2;
      } else {
         if ($$2 != null) {
            $$2.a($$1);
         }

         if ($$2 != null) {
            if (!aoo.e($$1)) {
               this.y.add($$0);
            } else {
               this.y.remove($$0);
            }
         }

         if (aoo.e($$1) && $$2 == null) {
            $$2 = (aon)this.o.remove($$0);
            if ($$2 != null) {
               $$2.a($$1);
            } else {
               $$2 = new aon(new cwi($$0), $$1, this.q, this.r, this.A, this);
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
         List<aon> $$1 = this.n.values().stream().filter(aon::o).peek(aon::p).toList();
         MutableBoolean $$2 = new MutableBoolean();

         do {
            $$2.setFalse();
            $$1.stream().map($$0x -> {
               CompletableFuture<dox> $$1x;
               do {
                  $$1x = $$0x.j();
                  this.s.c($$1x::isDone);
               } while ($$1x != $$0x.j());

               return $$1x.join();
            }).filter($$0x -> $$0x instanceof dph || $$0x instanceof dpi).filter(this::a).forEach($$1x -> $$2.setTrue());
         } while ($$2.isTrue());

         this.b((BooleanSupplier)(() -> true));
         this.o();
      } else {
         this.n.values().forEach(this::e);
      }
   }

   protected void a(BooleanSupplier $$0) {
      bjr $$1 = this.q.ae();
      $$1.a("poi");
      this.x.a($$0);
      $$1.b("chunk_unload");
      if (!this.q.t()) {
         this.b($$0);
      }

      $$1.c();
   }

   public boolean f() {
      return this.r.K_() || !this.o.isEmpty() || !this.m.isEmpty() || this.x.a() || !this.y.isEmpty() || !this.N.isEmpty() || this.A.a() || this.F.f();
   }

   private void b(BooleanSupplier $$0) {
      LongIterator $$1 = this.y.iterator();

      for (int $$2 = 0; $$1.hasNext() && ($$0.getAsBoolean() || $$2 < 200 || this.y.size() > 2000); $$1.remove()) {
         long $$3 = $$1.nextLong();
         aon $$4 = (aon)this.m.remove($$3);
         if ($$4 != null) {
            this.o.put($$3, $$4);
            this.z = true;
            $$2++;
            this.a($$3, $$4);
         }
      }

      int $$5 = Math.max(0, this.N.size() - 2000);

      Runnable $$6;
      while (($$0.getAsBoolean() || $$5 > 0) && ($$6 = this.N.poll()) != null) {
         $$5--;
         $$6.run();
      }

      int $$7 = 0;
      ObjectIterator<aon> $$8 = this.n.values().iterator();

      while ($$7 < 20 && $$0.getAsBoolean() && $$8.hasNext()) {
         if (this.e((aon)$$8.next())) {
            $$7++;
         }
      }
   }

   private void a(long $$0, aon $$1) {
      CompletableFuture<dox> $$2 = $$1.j();
      $$2.thenAcceptAsync($$3 -> {
         CompletableFuture<dox> $$4 = $$1.j();
         if ($$4 != $$2) {
            this.a($$0, $$1);
         } else {
            if (this.o.remove($$0, $$1) && $$3 != null) {
               if ($$3 instanceof dpi) {
                  ((dpi)$$3).c(false);
               }

               this.a($$3);
               if (this.p.remove($$0) && $$3 instanceof dpi $$5) {
                  this.q.a($$5);
               }

               this.r.a($$3.f());
               this.r.b();
               this.D.a($$3.f(), null);
               this.M.remove($$3.f().a());
            }
         }
      }, this.N::add).whenComplete(($$1x, $$2x) -> {
         if ($$2x != null) {
            i.error("Failed to save chunk {}", $$1.l(), $$2x);
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

   public CompletableFuture<Either<dox, aon.a>> a(aon $$0, dpc $$1) {
      cwi $$2 = $$0.l();
      if ($$1 == dpc.c) {
         return this.g($$2);
      } else {
         if ($$1 == dpc.l) {
            this.F.a(apk.e, $$2, aoo.a(dpc.l), $$2);
         }

         if (!$$1.f()) {
            Optional<dox> $$3 = $$0.a($$1.d(), this).getNow(aon.a).left();
            if ($$3.isPresent() && $$3.get().j().b($$1)) {
               CompletableFuture<Either<dox, aon.a>> $$4 = $$1.a(this.q, this.H, this.r, $$1x -> this.d($$0), $$3.get());
               this.D.a($$2, $$1);
               return $$4;
            }
         }

         return this.b($$0, $$1);
      }
   }

   private CompletableFuture<Either<dox, aon.a>> g(cwi $$0) {
      return this.k($$0).thenApply($$1 -> $$1.filter($$1x -> {
            boolean $$2 = b($$1x);
            if (!$$2) {
               i.error("Chunk file at {} is missing level data, skipping", $$0);
            }

            return $$2;
         })).thenApplyAsync($$1 -> {
         this.q.ae().d("chunkLoad");
         if ($$1.isPresent()) {
            dox $$2 = dpy.a(this.q, this.x, $$0, $$1.get());
            this.a($$0, $$2.j().g());
            return Either.left($$2);
         } else {
            return Either.left(this.h($$0));
         }
      }, this.s).exceptionallyAsync($$1 -> this.a($$1, $$0), this.s);
   }

   private static boolean b(ta $$0) {
      return $$0.b("Status", 8);
   }

   private Either<dox, aon.a> a(Throwable $$0, cwi $$1) {
      Throwable $$3 = $$0 instanceof y $$2 ? $$2.getCause() : $$0;
      if ($$3 instanceof IOException) {
         i.error("Couldn't load chunk {}", $$1, $$3);
         return Either.left(this.h($$1));
      } else {
         o $$4 = o.a($$0, "Exception loading chunk");
         p $$5 = $$4.a("Chunk being loaded");
         $$5.a("pos", $$1);
         this.i($$1);
         throw new y($$4);
      }
   }

   private dox h(cwi $$0) {
      this.i($$0);
      return new dps($$0, dpv.a, this.q, this.q.H_().d(kj.au), null);
   }

   private void i(cwi $$0) {
      this.L.put($$0.a(), (byte)-1);
   }

   private byte a(cwi $$0, dpc.a $$1) {
      return this.L.put($$0.a(), (byte)($$1 == dpc.a.a ? -1 : 1));
   }

   private CompletableFuture<Either<dox, aon.a>> b(aon $$0, dpc $$1) {
      cwi $$2 = $$0.l();
      CompletableFuture<Either<List<dox>, aon.a>> $$3 = this.a($$0, $$1.e(), $$1x -> this.a($$1, $$1x));
      this.q.ae().c(() -> "chunkGenerate " + $$1);
      Executor $$4 = $$1x -> this.B.a(aor.a($$0, $$1x));
      return $$3.thenComposeAsync($$4x -> (CompletionStage<Either<dox, aon.a>>)$$4x.map($$4xx -> {
            try {
               dox $$5 = (dox)$$4xx.get($$4xx.size() / 2);
               CompletableFuture<Either<dox, aon.a>> $$6;
               if ($$5.j().b($$1)) {
                  $$6 = $$1.a(this.q, this.H, this.r, $$1xxx -> this.d($$0), $$5);
               } else {
                  $$6 = $$1.a($$4, this.q, this.t, this.H, this.r, $$1xxx -> this.d($$0), $$4xx);
               }

               this.D.a($$2, $$1);
               return $$6;
            } catch (Exception var9) {
               var9.getStackTrace();
               o $$9 = o.a(var9, "Exception generating new chunk");
               p $$10 = $$9.a("Chunk to be generated");
               $$10.a("Status being generated", () -> ki.n.b($$1).toString());
               $$10.a("Location", String.format(Locale.ROOT, "%d,%d", $$2.e, $$2.f));
               $$10.a("Position hash", cwi.c($$2.e, $$2.f));
               $$10.a("Generator", this.t);
               this.s.execute(() -> {
                  throw new y($$9);
               });
               throw new y($$9);
            }
         }, $$1xx -> {
            this.b($$2);
            return CompletableFuture.completedFuture(Either.right($$1xx));
         }), $$4);
   }

   protected void b(cwi $$0) {
      this.s.i(ac.a((Runnable)(() -> this.F.b(apk.e, $$0, aoo.a(dpc.l), $$0)), (Supplier<String>)(() -> "release light ticket " + $$0)));
   }

   private dpc a(dpc $$0, int $$1) {
      dpc $$2;
      if ($$1 == 0) {
         $$2 = $$0.d();
      } else {
         $$2 = dpc.a(dpc.a($$0) + $$1);
      }

      return $$2;
   }

   private static void a(apf $$0, List<ta> $$1) {
      if (!$$1.isEmpty()) {
         $$0.b(bpd.a($$1, $$0));
      }
   }

   private CompletableFuture<Either<dox, aon.a>> d(aon $$0) {
      CompletableFuture<Either<dox, aon.a>> $$1 = $$0.a(dpc.n.d());
      return $$1.thenApplyAsync($$1x -> {
         dpc $$2 = aoo.a($$0.m());
         return !$$2.b(dpc.n) ? aon.a : $$1x.mapLeft($$1xx -> {
            cwi $$2x = $$0.l();
            dps $$3 = (dps)$$1xx;
            dpi $$4;
            if ($$3 instanceof dph) {
               $$4 = ((dph)$$3).C();
            } else {
               $$4 = new dpi(this.q, $$3, $$1xxx -> a(this.q, $$3.E()));
               $$0.a(new dph($$4, false));
            }

            $$4.b(() -> aoo.b($$0.m()));
            $$4.E();
            if (this.p.add($$2x.a())) {
               $$4.c(true);
               $$4.J();
               $$4.a(this.q);
            }

            return $$4;
         });
      }, $$1x -> this.C.a(aor.a($$1x, $$0.l().a(), $$0::m)));
   }

   public CompletableFuture<Either<dpi, aon.a>> b(aon $$0) {
      CompletableFuture<Either<List<dox>, aon.a>> $$1 = this.a($$0, 1, $$0x -> dpc.n);
      CompletableFuture<Either<dpi, aon.a>> $$2 = $$1.<Either>thenApplyAsync(
            $$0x -> $$0x.mapLeft($$0xx -> (dpi)$$0xx.get($$0xx.size() / 2)), $$1x -> this.C.a(aor.a($$0, $$1x))
         )
         .thenApplyAsync($$1x -> $$1x.ifLeft($$1xx -> {
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

   private void a(dpi $$0) {
      cwi $$1 = $$0.f();

      for (apg $$2 : this.J.a()) {
         if ($$2.W().a($$1)) {
            a($$2, $$0);
         }
      }
   }

   public CompletableFuture<Either<dpi, aon.a>> c(aon $$0) {
      return this.a($$0, 1, dpc::a).thenApplyAsync($$0x -> $$0x.mapLeft($$0xx -> (dpi)$$0xx.get($$0xx.size() / 2)), $$1 -> this.C.a(aor.a($$0, $$1)));
   }

   public int h() {
      return this.G.get();
   }

   private boolean e(aon $$0) {
      if (!$$0.o()) {
         return false;
      } else {
         dox $$1 = $$0.j().getNow(null);
         if (!($$1 instanceof dph) && !($$1 instanceof dpi)) {
            return false;
         } else {
            long $$2 = $$1.f().a();
            long $$3 = this.M.getOrDefault($$2, -1L);
            long $$4 = System.currentTimeMillis();
            if ($$4 < $$3) {
               return false;
            } else {
               boolean $$5 = this.a($$1);
               $$0.p();
               if ($$5) {
                  this.M.put($$2, $$4 + 10000L);
               }

               return $$5;
            }
         }
      }
   }

   private boolean a(dox $$0) {
      this.x.a($$0.f());
      if (!$$0.i()) {
         return false;
      } else {
         $$0.a(false);
         cwi $$1 = $$0.f();

         try {
            dpc $$2 = $$0.j();
            if ($$2.g() != dpc.a.b) {
               if (this.j($$1)) {
                  return false;
               }

               if ($$2 == dpc.c && $$0.g().values().stream().noneMatch(edm::b)) {
                  return false;
               }
            }

            this.q.ae().d("chunkSave");
            ta $$3 = dpy.a(this.q, $$0);
            this.a($$1, $$3);
            this.a($$1, $$2.g());
            return true;
         } catch (Exception var5) {
            i.error("Failed to save chunk {},{}", new Object[]{$$1.e, $$1.f, var5});
            return false;
         }
      }
   }

   private boolean j(cwi $$0) {
      byte $$1 = this.L.get($$0.a());
      if ($$1 != 0) {
         return $$1 == 1;
      } else {
         ta $$2;
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

         dpc.a $$5 = dpy.a($$2);
         return this.a($$0, $$5) == 1;
      }
   }

   protected void a(int $$0) {
      int $$1 = aww.a($$0, 2, 32);
      if ($$1 != this.O) {
         this.O = $$1;
         this.F.a(this.O);

         for (apg $$2 : this.J.a()) {
            this.e($$2);
         }
      }
   }

   int b(apg $$0) {
      return aww.a($$0.E(), 2, this.O);
   }

   private void a(apg $$0, cwi $$1) {
      dpi $$2 = this.d($$1.a());
      if ($$2 != null) {
         a($$0, $$2);
      }
   }

   private static void a(apg $$0, dpi $$1) {
      $$0.d.f.a($$1);
   }

   private static void b(apg $$0, cwi $$1) {
      $$0.d.f.a($$0, $$1);
   }

   @Nullable
   public dpi d(long $$0) {
      aon $$1 = this.b($$0);
      return $$1 == null ? null : $$1.f();
   }

   public int i() {
      return this.n.size();
   }

   public aox j() {
      return this.F;
   }

   protected Iterable<aon> k() {
      return Iterables.unmodifiableIterable(this.n.values());
   }

   void a(Writer $$0) throws IOException {
      avw $$1 = avw.a()
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
      apl $$2 = this.F.d();
      ObjectBidirectionalIterator var4 = this.n.long2ObjectEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<aon> $$3 = (Entry<aon>)var4.next();
         long $$4 = $$3.getLongKey();
         cwi $$5 = new cwi($$4);
         aon $$6 = (aon)$$3.getValue();
         Optional<dox> $$7 = Optional.ofNullable($$6.i());
         Optional<dpi> $$8 = $$7.flatMap($$0x -> $$0x instanceof dpi ? Optional.of((dpi)$$0x) : Optional.empty());
         $$1.a(
            $$5.e,
            $$5.f,
            $$6.m(),
            $$7.isPresent(),
            $$7.map(dox::j).orElse(null),
            $$8.map(dpi::D).orElse(null),
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

   private static String a(CompletableFuture<Either<dpi, aon.a>> $$0) {
      try {
         Either<dpi, aon.a> $$1 = $$0.getNow(null);
         return $$1 != null ? (String)$$1.map($$0x -> "done", $$0x -> "unloaded") : "not completed";
      } catch (CompletionException var2) {
         return "failed " + var2.getCause().getMessage();
      } catch (CancellationException var3) {
         return "cancelled";
      }
   }

   private CompletableFuture<Optional<ta>> k(cwi $$0) {
      return this.e($$0).thenApplyAsync($$0x -> $$0x.map(this::c), ac.f());
   }

   private ta c(ta $$0) {
      return this.a(this.q.ad(), this.w, $$0, this.t.b());
   }

   boolean c(cwi $$0) {
      if (!this.F.f($$0.a())) {
         return false;
      } else {
         for (apg $$1 : this.J.a()) {
            if (this.c($$1, $$0)) {
               return true;
            }
         }

         return false;
      }
   }

   public List<apg> d(cwi $$0) {
      long $$1 = $$0.a();
      if (!this.F.f($$1)) {
         return List.of();
      } else {
         Builder<apg> $$2 = ImmutableList.builder();

         for (apg $$3 : this.J.a()) {
            if (this.c($$3, $$0)) {
               $$2.add($$3);
            }
         }

         return $$2.build();
      }
   }

   private boolean c(apg $$0, cwi $$1) {
      if ($$0.N_()) {
         return false;
      } else {
         double $$2 = a($$1, $$0);
         return $$2 < 16384.0;
      }
   }

   private boolean c(apg $$0) {
      return $$0.N_() && !this.q.Z().b(cwx.r);
   }

   void a(apg $$0, boolean $$1) {
      boolean $$2 = this.c($$0);
      boolean $$3 = this.J.d($$0);
      if ($$1) {
         this.J.a($$0, $$2);
         this.d($$0);
         if (!$$2) {
            this.F.a(je.a($$0), $$0);
         }

         $$0.a(aot.a);
         this.e($$0);
      } else {
         je $$4 = $$0.V();
         this.J.a($$0);
         if (!$$3) {
            this.F.b($$4, $$0);
         }

         this.a($$0, aot.a);
      }
   }

   private void d(apg $$0) {
      je $$1 = je.a($$0);
      $$0.a($$1);
   }

   public void a(apg $$0) {
      ObjectIterator $$2 = this.K.values().iterator();

      while ($$2.hasNext()) {
         aop.b $$1 = (aop.b)$$2.next();
         if ($$1.c == $$0) {
            $$1.a(this.q.x());
         } else {
            $$1.b($$0);
         }
      }

      je $$2x = $$0.V();
      je $$3 = je.a($$0);
      boolean $$4 = this.J.e($$0);
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
            this.J.b($$0);
         }

         if ($$4 && !$$5) {
            this.J.c($$0);
         }

         this.e($$0);
      }
   }

   private void e(apg $$0) {
      cwi $$1 = $$0.do();
      int $$2 = this.b($$0);
      if ($$0.W() instanceof aot.a $$3 && $$3.a().equals($$1) && $$3.b() == $$2) {
         return;
      }

      this.a($$0, aot.a($$1, $$2));
   }

   private void a(apg $$0, aot $$1) {
      if ($$0.dM() == this.q) {
         aot $$2 = $$0.W();
         if ($$1 instanceof aot.a $$3 && (!($$2 instanceof aot.a $$4) || !$$4.a().equals($$3.a()))) {
            $$0.d.b(new adm($$3.a().e, $$3.a().f));
         }

         aot.a($$2, $$1, $$1x -> this.a($$0, $$1x), $$1x -> b($$0, $$1x));
         $$0.a($$1);
      }
   }

   @Override
   public List<apg> a(cwi $$0, boolean $$1) {
      Set<apg> $$2 = this.J.a();
      Builder<apg> $$3 = ImmutableList.builder();

      for (apg $$4 : $$2) {
         if ($$1 && this.b($$4, $$0.e, $$0.f) || !$$1 && this.a($$4, $$0.e, $$0.f)) {
            $$3.add($$4);
         }
      }

      return $$3.build();
   }

   protected void a(box $$0) {
      if (!($$0 instanceof cdw)) {
         bpd<?> $$1 = $$0.ai();
         int $$2 = $$1.o() * 16;
         if ($$2 != 0) {
            int $$3 = $$1.p();
            if (this.K.containsKey($$0.aj())) {
               throw (IllegalStateException)ac.b(new IllegalStateException("Entity is already tracked!"));
            } else {
               aop.b $$4 = new aop.b($$0, $$2, $$3, $$1.q());
               this.K.put($$0.aj(), $$4);
               $$4.a(this.q.x());
               if ($$0 instanceof apg $$5) {
                  this.a($$5, true);
                  ObjectIterator var7 = this.K.values().iterator();

                  while (var7.hasNext()) {
                     aop.b $$6 = (aop.b)var7.next();
                     if ($$6.c != $$5) {
                        $$6.b($$5);
                     }
                  }
               }
            }
         }
      }
   }

   protected void b(box $$0) {
      if ($$0 instanceof apg $$1) {
         this.a($$1, false);
         ObjectIterator var3 = this.K.values().iterator();

         while (var3.hasNext()) {
            aop.b $$2 = (aop.b)var3.next();
            $$2.a($$1);
         }
      }

      aop.b $$3 = (aop.b)this.K.remove($$0.aj());
      if ($$3 != null) {
         $$3.a();
      }
   }

   protected void l() {
      for (apg $$0 : this.J.a()) {
         this.e($$0);
      }

      List<apg> $$1 = Lists.newArrayList();
      List<apg> $$2 = this.q.x();
      ObjectIterator var3 = this.K.values().iterator();

      while (var3.hasNext()) {
         aop.b $$3 = (aop.b)var3.next();
         je $$4 = $$3.e;
         je $$5 = je.a($$3.c);
         boolean $$6 = !Objects.equals($$4, $$5);
         if ($$6) {
            $$3.a($$2);
            box $$7 = $$3.c;
            if ($$7 instanceof apg) {
               $$1.add((apg)$$7);
            }

            $$3.e = $$5;
         }

         if ($$6 || this.F.c($$5.r().a())) {
            $$3.b.a();
         }
      }

      if (!$$1.isEmpty()) {
         var3 = this.K.values().iterator();

         while (var3.hasNext()) {
            aop.b $$8 = (aop.b)var3.next();
            $$8.a($$1);
         }
      }
   }

   public void a(box $$0, yb<?> $$1) {
      aop.b $$2 = (aop.b)this.K.get($$0.aj());
      if ($$2 != null) {
         $$2.a($$1);
      }
   }

   protected void b(box $$0, yb<?> $$1) {
      aop.b $$2 = (aop.b)this.K.get($$0.aj());
      if ($$2 != null) {
         $$2.b($$1);
      }
   }

   public void a(List<dox> $$0) {
      Map<apg, List<dpi>> $$1 = new HashMap<>();

      for (dox $$2 : $$0) {
         cwi $$3 = $$2.f();
         dpi $$5;
         if ($$2 instanceof dpi $$4) {
            $$5 = $$4;
         } else {
            $$5 = this.q.d($$3.e, $$3.f);
         }

         for (apg $$7 : this.a($$3, false)) {
            $$1.computeIfAbsent($$7, $$0x -> new ArrayList<>()).add($$5);
         }
      }

      $$1.forEach(($$0x, $$1x) -> $$0x.d.b(abc.a($$1x)));
   }

   protected cas m() {
      return this.x;
   }

   public String n() {
      return this.I;
   }

   void a(cwi $$0, aoy $$1) {
      this.E.onChunkStatusChange($$0, $$1);
   }

   public void a(cwi $$0, int $$1) {
      int $$2 = $$1 + 1;
      cwi.a($$0, $$2).forEach($$0x -> {
         aon $$1x = this.b($$0x.a());
         if ($$1x != null) {
            $$1x.a(this.r.a($$0x.e, $$0x.f));
         }
      });
   }

   class a extends aox {
      protected a(Executor $$0, Executor $$1) {
         super($$0, $$1);
      }

      @Override
      protected boolean a(long $$0) {
         return aop.this.y.contains($$0);
      }

      @Nullable
      @Override
      protected aon b(long $$0) {
         return aop.this.a($$0);
      }

      @Nullable
      @Override
      protected aon a(long $$0, int $$1, @Nullable aon $$2, int $$3) {
         return aop.this.a($$0, $$1, $$2, $$3);
      }
   }

   class b {
      final ape b;
      final box c;
      private final int d;
      je e;
      private final Set<aqh> f = Sets.newIdentityHashSet();

      public b(box $$0, int $$1, int $$2, boolean $$3) {
         this.b = new ape(aop.this.q, $$0, $$2, $$3, this::a);
         this.c = $$0;
         this.d = $$1;
         this.e = je.a($$0);
      }

      @Override
      public boolean equals(Object $$0) {
         return $$0 instanceof aop.b ? ((aop.b)$$0).c.aj() == this.c.aj() : false;
      }

      @Override
      public int hashCode() {
         return this.c.aj();
      }

      public void a(yb<?> $$0) {
         for (aqh $$1 : this.f) {
            $$1.b($$0);
         }
      }

      public void b(yb<?> $$0) {
         this.a($$0);
         if (this.c instanceof apg) {
            ((apg)this.c).d.b($$0);
         }
      }

      public void a() {
         for (aqh $$0 : this.f) {
            this.b.a($$0.p());
         }
      }

      public void a(apg $$0) {
         if (this.f.remove($$0.d)) {
            this.b.a($$0);
         }
      }

      public void b(apg $$0) {
         if ($$0 != this.c) {
            ept $$1 = $$0.dk().d(this.c.dk());
            int $$2 = aop.this.b($$0);
            double $$3 = (double)Math.min(this.b(), $$2 * 16);
            double $$4 = $$1.c * $$1.c + $$1.e * $$1.e;
            double $$5 = $$3 * $$3;
            boolean $$6 = $$4 <= $$5 && this.c.a($$0) && aop.this.a($$0, this.c.do().e, this.c.do().f);
            if ($$6) {
               if (this.f.add($$0.d)) {
                  this.b.b($$0);
               }
            } else if (this.f.remove($$0.d)) {
               this.b.a($$0);
            }
         }
      }

      private int a(int $$0) {
         return aop.this.q.o().b($$0);
      }

      private int b() {
         int $$0 = this.d;

         for (box $$1 : this.c.cT()) {
            int $$2 = $$1.ai().o() * 16;
            if ($$2 > $$0) {
               $$0 = $$2;
            }
         }

         return this.a($$0);
      }

      public void a(List<apg> $$0) {
         for (apg $$1 : $$0) {
            this.b($$1);
         }
      }
   }
}
