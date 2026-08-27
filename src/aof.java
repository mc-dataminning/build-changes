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

public class aof extends dod implements aod.d {
   private static final byte f = -1;
   private static final byte g = 0;
   private static final byte h = 1;
   private static final Logger i = LogUtils.getLogger();
   private static final int j = 200;
   private static final int k = 20;
   private static final int l = 10000;
   public static final int a = 2;
   public static final int b = 32;
   public static final int c = aoe.a(aoo.d);
   private final Long2ObjectLinkedOpenHashMap<aod> m = new Long2ObjectLinkedOpenHashMap();
   private volatile Long2ObjectLinkedOpenHashMap<aod> n = this.m.clone();
   private final Long2ObjectLinkedOpenHashMap<aod> o = new Long2ObjectLinkedOpenHashMap();
   private final LongSet p = new LongOpenHashSet();
   final aov q;
   private final aoy r;
   private final bkk<Runnable> s;
   private dnc t;
   private final drc u;
   private final dnd v;
   private final Supplier<eif> w;
   private final bzh x;
   final LongSet y = new LongOpenHashSet();
   private boolean z;
   private final aoh A;
   private final bkm<aoh.a<Runnable>> B;
   private final bkm<aoh.a<Runnable>> C;
   private final ape D;
   private final dov E;
   private final aof.a F;
   private final AtomicInteger G = new AtomicInteger();
   private final eff H;
   private final String I;
   private final aop J = new aop();
   private final Int2ObjectMap<aof.b> K = new Int2ObjectOpenHashMap();
   private final Long2ByteMap L = new Long2ByteOpenHashMap();
   private final Long2LongMap M = new Long2LongOpenHashMap();
   private final Queue<Runnable> N = Queues.newConcurrentLinkedQueue();
   private int O;

   public aof(
      aov $$0,
      eil.c $$1,
      DataFixer $$2,
      eff $$3,
      Executor $$4,
      bkk<Runnable> $$5,
      dnp $$6,
      dnc $$7,
      ape $$8,
      dov $$9,
      Supplier<eif> $$10,
      int $$11,
      boolean $$12
   ) {
      super($$1.a($$0.ae()).resolve("region"), $$2, $$12);
      this.H = $$3;
      Path $$13 = $$1.a($$0.ae());
      this.I = $$13.getFileName().toString();
      this.q = $$0;
      this.t = $$7;
      iw $$14 = $$0.I_();
      long $$15 = $$0.C();
      if ($$7 instanceof dqr $$16) {
         this.u = drc.a($$16.g().a(), $$14.b(kg.aB), $$15);
      } else {
         this.u = drc.a(dqt.e(), $$14.b(kg.aB), $$15);
      }

      this.v = $$7.a($$14.b(kg.aF), this.u, $$15);
      this.s = $$5;
      bkn<Runnable> $$17 = bkn.a($$4, "worldgen");
      bkm<Runnable> $$18 = bkm.a("main", $$5::i);
      this.D = $$8;
      this.E = $$9;
      bkn<Runnable> $$19 = bkn.a($$4, "light");
      this.A = new aoh(ImmutableList.of($$17, $$18, $$19), $$4, Integer.MAX_VALUE);
      this.B = this.A.a($$17, false);
      this.C = this.A.a($$18, false);
      this.r = new aoy($$6, this, this.q.E_().g(), $$19, this.A.a($$19, false));
      this.F = new aof.a($$4, $$5);
      this.w = $$10;
      this.x = new bzh($$13.resolve("poi"), $$2, $$12, $$14, $$0);
      this.a($$11);
   }

   protected dnc a() {
      return this.t;
   }

   protected dnd b() {
      return this.v;
   }

   protected drc c() {
      return this.u;
   }

   public void d() {
      DataResult<JsonElement> $$0 = dnc.a.encodeStart(JsonOps.INSTANCE, this.t);
      DataResult<dnc> $$1 = $$0.flatMap($$0x -> dnc.a.parse(JsonOps.INSTANCE, $$0x));
      $$1.result().ifPresent($$0x -> this.t = $$0x);
   }

   private static double a(cuu $$0, bno $$1) {
      double $$2 = (double)jb.a($$0.e, 8);
      double $$3 = (double)jb.a($$0.f, 8);
      double $$4 = $$2 - $$1.dr();
      double $$5 = $$3 - $$1.dx();
      return $$4 * $$4 + $$5 * $$5;
   }

   boolean a(aow $$0, int $$1, int $$2) {
      return $$0.W().a($$1, $$2) && !$$0.d.f.a(cuu.c($$1, $$2));
   }

   private boolean b(aow $$0, int $$1, int $$2) {
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

   protected aoy e() {
      return this.r;
   }

   @Nullable
   protected aod a(long $$0) {
      return (aod)this.m.get($$0);
   }

   @Nullable
   protected aod b(long $$0) {
      return (aod)this.n.get($$0);
   }

   protected IntSupplier c(long $$0) {
      return () -> {
         aod $$1 = this.b($$0);
         return $$1 == null ? aog.a - 1 : Math.min($$1.n(), aog.a - 1);
      };
   }

   public String a(cuu $$0) {
      aod $$1 = this.b($$0.a());
      if ($$1 == null) {
         return "null";
      } else {
         String $$2 = $$1.m() + "\n";
         dng $$3 = $$1.h();
         dnb $$4 = $$1.i();
         if ($$3 != null) {
            $$2 = $$2 + "St: §" + $$3.c() + $$3 + "§r\n";
         }

         if ($$4 != null) {
            $$2 = $$2 + "Ch: §" + $$4.j().c() + $$4.j() + "§r\n";
         }

         aoo $$5 = $$1.k();
         $$2 = $$2 + '§' + $$5.ordinal() + $$5;
         return $$2 + "§r";
      }
   }

   private CompletableFuture<Either<List<dnb>, aod.a>> a(aod $$0, int $$1, IntFunction<dng> $$2) {
      if ($$1 == 0) {
         dng $$3 = $$2.apply(0);
         return $$0.a($$3, this).thenApply($$0x -> $$0x.mapLeft(List::of));
      } else {
         List<CompletableFuture<Either<dnb, aod.a>>> $$4 = new ArrayList<>();
         List<aod> $$5 = new ArrayList<>();
         cuu $$6 = $$0.l();
         int $$7 = $$6.e;
         int $$8 = $$6.f;

         for (int $$9 = -$$1; $$9 <= $$1; $$9++) {
            for (int $$10 = -$$1; $$10 <= $$1; $$10++) {
               int $$11 = Math.max(Math.abs($$10), Math.abs($$9));
               final cuu $$12 = new cuu($$7 + $$10, $$8 + $$9);
               long $$13 = $$12.a();
               aod $$14 = this.a($$13);
               if ($$14 == null) {
                  return CompletableFuture.completedFuture(Either.right(new aod.a() {
                     @Override
                     public String toString() {
                        return "Unloaded " + $$12;
                     }
                  }));
               }

               dng $$15 = $$2.apply($$11);
               CompletableFuture<Either<dnb, aod.a>> $$16 = $$14.a($$15, this);
               $$5.add($$14);
               $$4.add($$16);
            }
         }

         CompletableFuture<List<Either<dnb, aod.a>>> $$17 = ac.b($$4);
         CompletableFuture<Either<List<dnb>, aod.a>> $$18 = $$17.thenApply($$3 -> {
            List<dnb> $$4x = Lists.newArrayList();
            int $$5x = 0;

            for (final Either<dnb, aod.a> $$6x : $$3) {
               if ($$6x == null) {
                  throw this.a(new IllegalStateException("At least one of the chunk futures were null"), "n/a");
               }

               Optional<dnb> $$7x = $$6x.left();
               if ($$7x.isEmpty()) {
                  final int $$8x = $$5x;
                  return Either.right(new aod.a() {
                     @Override
                     public String toString() {
                        return "Unloaded " + new cuu($$7 + $$8x % ($$1 * 2 + 1), $$8 + $$8x / ($$1 * 2 + 1)) + " " + $$6x.right().get();
                     }
                  });
               }

               $$4x.add($$7x.get());
               $$5x++;
            }

            return Either.left($$4x);
         });

         for (aod $$19 : $$5) {
            $$19.a("getChunkRangeFuture " + $$6 + " " + $$1, $$18);
         }

         return $$18;
      }
   }

   public y a(IllegalStateException $$0, String $$1) {
      StringBuilder $$2 = new StringBuilder();
      Consumer<aod> $$3 = $$1x -> $$1x.q().forEach($$2x -> {
            dng $$3x = (dng)$$2x.getFirst();
            CompletableFuture<Either<dnb, aod.a>> $$4x = (CompletableFuture<Either<dnb, aod.a>>)$$2x.getSecond();
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

   public CompletableFuture<Either<dnm, aod.a>> a(aod $$0) {
      return this.a($$0, 2, $$0x -> dng.n).thenApplyAsync($$0x -> $$0x.mapLeft($$0xx -> (dnm)$$0xx.get($$0xx.size() / 2)), this.s);
   }

   @Nullable
   aod a(long $$0, int $$1, @Nullable aod $$2, int $$3) {
      if (!aoe.e($$3) && !aoe.e($$1)) {
         return $$2;
      } else {
         if ($$2 != null) {
            $$2.a($$1);
         }

         if ($$2 != null) {
            if (!aoe.e($$1)) {
               this.y.add($$0);
            } else {
               this.y.remove($$0);
            }
         }

         if (aoe.e($$1) && $$2 == null) {
            $$2 = (aod)this.o.remove($$0);
            if ($$2 != null) {
               $$2.a($$1);
            } else {
               $$2 = new aod(new cuu($$0), $$1, this.q, this.r, this.A, this);
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
         List<aod> $$1 = this.n.values().stream().filter(aod::o).peek(aod::p).toList();
         MutableBoolean $$2 = new MutableBoolean();

         do {
            $$2.setFalse();
            $$1.stream().map($$0x -> {
               CompletableFuture<dnb> $$1x;
               do {
                  $$1x = $$0x.j();
                  this.s.c($$1x::isDone);
               } while ($$1x != $$0x.j());

               return $$1x.join();
            }).filter($$0x -> $$0x instanceof dnl || $$0x instanceof dnm).filter(this::a).forEach($$1x -> $$2.setTrue());
         } while ($$2.isTrue());

         this.b((BooleanSupplier)(() -> true));
         this.o();
      } else {
         this.n.values().forEach(this::e);
      }
   }

   protected void a(BooleanSupplier $$0) {
      bil $$1 = this.q.af();
      $$1.a("poi");
      this.x.a($$0);
      $$1.b("chunk_unload");
      if (!this.q.t()) {
         this.b($$0);
      }

      $$1.c();
   }

   public boolean f() {
      return this.r.L_() || !this.o.isEmpty() || !this.m.isEmpty() || this.x.a() || !this.y.isEmpty() || !this.N.isEmpty() || this.A.a() || this.F.f();
   }

   private void b(BooleanSupplier $$0) {
      LongIterator $$1 = this.y.iterator();

      for (int $$2 = 0; $$1.hasNext() && ($$0.getAsBoolean() || $$2 < 200 || this.y.size() > 2000); $$1.remove()) {
         long $$3 = $$1.nextLong();
         aod $$4 = (aod)this.m.remove($$3);
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
      ObjectIterator<aod> $$8 = this.n.values().iterator();

      while ($$7 < 20 && $$0.getAsBoolean() && $$8.hasNext()) {
         if (this.e((aod)$$8.next())) {
            $$7++;
         }
      }
   }

   private void a(long $$0, aod $$1) {
      CompletableFuture<dnb> $$2 = $$1.j();
      $$2.thenAcceptAsync($$3 -> {
         CompletableFuture<dnb> $$4 = $$1.j();
         if ($$4 != $$2) {
            this.a($$0, $$1);
         } else {
            if (this.o.remove($$0, $$1) && $$3 != null) {
               if ($$3 instanceof dnm) {
                  ((dnm)$$3).c(false);
               }

               this.a($$3);
               if (this.p.remove($$0) && $$3 instanceof dnm $$5) {
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

   public CompletableFuture<Either<dnb, aod.a>> a(aod $$0, dng $$1) {
      cuu $$2 = $$0.l();
      if ($$1 == dng.c) {
         return this.f($$2);
      } else {
         if ($$1 == dng.l) {
            this.F.a(apa.e, $$2, aoe.a(dng.l), $$2);
         }

         if (!$$1.f()) {
            Optional<dnb> $$3 = $$0.a($$1.d(), this).getNow(aod.a).left();
            if ($$3.isPresent() && $$3.get().j().b($$1)) {
               CompletableFuture<Either<dnb, aod.a>> $$4 = $$1.a(this.q, this.H, this.r, $$1x -> this.d($$0), $$3.get());
               this.D.a($$2, $$1);
               return $$4;
            }
         }

         return this.b($$0, $$1);
      }
   }

   private CompletableFuture<Either<dnb, aod.a>> f(cuu $$0) {
      return this.j($$0).thenApply($$1 -> $$1.filter($$1x -> {
            boolean $$2 = b($$1x);
            if (!$$2) {
               i.error("Chunk file at {} is missing level data, skipping", $$0);
            }

            return $$2;
         })).thenApplyAsync($$1 -> {
         this.q.af().d("chunkLoad");
         if ($$1.isPresent()) {
            dnb $$2 = doc.a(this.q, this.x, $$0, $$1.get());
            this.a($$0, $$2.j().g());
            return Either.left($$2);
         } else {
            return Either.left(this.g($$0));
         }
      }, this.s).exceptionallyAsync($$1 -> this.a($$1, $$0), this.s);
   }

   private static boolean b(sw $$0) {
      return $$0.b("Status", 8);
   }

   private Either<dnb, aod.a> a(Throwable $$0, cuu $$1) {
      if ($$0 instanceof y $$2) {
         Throwable $$3 = $$2.getCause();
         if (!($$3 instanceof IOException)) {
            this.h($$1);
            throw $$2;
         }

         i.error("Couldn't load chunk {}", $$1, $$3);
      } else if ($$0 instanceof IOException) {
         i.error("Couldn't load chunk {}", $$1, $$0);
      }

      return Either.left(this.g($$1));
   }

   private dnb g(cuu $$0) {
      this.h($$0);
      return new dnw($$0, dnz.a, this.q, this.q.I_().d(kg.at), null);
   }

   private void h(cuu $$0) {
      this.L.put($$0.a(), (byte)-1);
   }

   private byte a(cuu $$0, dng.a $$1) {
      return this.L.put($$0.a(), (byte)($$1 == dng.a.a ? -1 : 1));
   }

   private CompletableFuture<Either<dnb, aod.a>> b(aod $$0, dng $$1) {
      cuu $$2 = $$0.l();
      CompletableFuture<Either<List<dnb>, aod.a>> $$3 = this.a($$0, $$1.e(), $$1x -> this.a($$1, $$1x));
      this.q.af().c(() -> "chunkGenerate " + $$1);
      Executor $$4 = $$1x -> this.B.a(aoh.a($$0, $$1x));
      return $$3.thenComposeAsync($$4x -> (CompletionStage<Either<dnb, aod.a>>)$$4x.map($$4xx -> {
            try {
               dnb $$5 = (dnb)$$4xx.get($$4xx.size() / 2);
               CompletableFuture<Either<dnb, aod.a>> $$6;
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
               $$10.a("Location", String.format(Locale.ROOT, "%d,%d", $$2.e, $$2.f));
               $$10.a("Position hash", cuu.c($$2.e, $$2.f));
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

   protected void b(cuu $$0) {
      this.s.i(ac.a((Runnable)(() -> this.F.b(apa.e, $$0, aoe.a(dng.l), $$0)), (Supplier<String>)(() -> "release light ticket " + $$0)));
   }

   private dng a(dng $$0, int $$1) {
      dng $$2;
      if ($$1 == 0) {
         $$2 = $$0.d();
      } else {
         $$2 = dng.a(dng.a($$0) + $$1);
      }

      return $$2;
   }

   private static void a(aov $$0, List<sw> $$1) {
      if (!$$1.isEmpty()) {
         $$0.b(bnu.a($$1, $$0));
      }
   }

   private CompletableFuture<Either<dnb, aod.a>> d(aod $$0) {
      CompletableFuture<Either<dnb, aod.a>> $$1 = $$0.a(dng.n.d());
      return $$1.thenApplyAsync($$1x -> {
         dng $$2 = aoe.a($$0.m());
         return !$$2.b(dng.n) ? aod.a : $$1x.mapLeft($$1xx -> {
            cuu $$2x = $$0.l();
            dnw $$3 = (dnw)$$1xx;
            dnm $$4;
            if ($$3 instanceof dnl) {
               $$4 = ((dnl)$$3).C();
            } else {
               $$4 = new dnm(this.q, $$3, $$1xxx -> a(this.q, $$3.E()));
               $$0.a(new dnl($$4, false));
            }

            $$4.b(() -> aoe.b($$0.m()));
            $$4.E();
            if (this.p.add($$2x.a())) {
               $$4.c(true);
               $$4.J();
               $$4.a(this.q);
            }

            return $$4;
         });
      }, $$1x -> this.C.a(aoh.a($$1x, $$0.l().a(), $$0::m)));
   }

   public CompletableFuture<Either<dnm, aod.a>> b(aod $$0) {
      CompletableFuture<Either<List<dnb>, aod.a>> $$1 = this.a($$0, 1, $$0x -> dng.n);
      CompletableFuture<Either<dnm, aod.a>> $$2 = $$1.<Either>thenApplyAsync(
            $$0x -> $$0x.mapLeft($$0xx -> (dnm)$$0xx.get($$0xx.size() / 2)), $$1x -> this.C.a(aoh.a($$0, $$1x))
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

   private void a(dnm $$0) {
      cuu $$1 = $$0.f();

      for (aow $$2 : this.J.a()) {
         if ($$2.W().a($$1)) {
            a($$2, $$0);
         }
      }
   }

   public CompletableFuture<Either<dnm, aod.a>> c(aod $$0) {
      return this.a($$0, 1, dng::a).thenApplyAsync($$0x -> $$0x.mapLeft($$0xx -> (dnm)$$0xx.get($$0xx.size() / 2)), $$1 -> this.C.a(aoh.a($$0, $$1)));
   }

   public int h() {
      return this.G.get();
   }

   private boolean e(aod $$0) {
      if (!$$0.o()) {
         return false;
      } else {
         dnb $$1 = $$0.j().getNow(null);
         if (!($$1 instanceof dnl) && !($$1 instanceof dnm)) {
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

   private boolean a(dnb $$0) {
      this.x.a($$0.f());
      if (!$$0.i()) {
         return false;
      } else {
         $$0.a(false);
         cuu $$1 = $$0.f();

         try {
            dng $$2 = $$0.j();
            if ($$2.g() != dng.a.b) {
               if (this.i($$1)) {
                  return false;
               }

               if ($$2 == dng.c && $$0.g().values().stream().noneMatch(ebm::b)) {
                  return false;
               }
            }

            this.q.af().d("chunkSave");
            sw $$3 = doc.a(this.q, $$0);
            this.a($$1, $$3);
            this.a($$1, $$2.g());
            return true;
         } catch (Exception var5) {
            i.error("Failed to save chunk {},{}", new Object[]{$$1.e, $$1.f, var5});
            return false;
         }
      }
   }

   private boolean i(cuu $$0) {
      byte $$1 = this.L.get($$0.a());
      if ($$1 != 0) {
         return $$1 == 1;
      } else {
         sw $$2;
         try {
            $$2 = this.j($$0).join().orElse(null);
            if ($$2 == null) {
               this.h($$0);
               return false;
            }
         } catch (Exception var5) {
            i.error("Failed to read chunk {}", $$0, var5);
            this.h($$0);
            return false;
         }

         dng.a $$5 = doc.a($$2);
         return this.a($$0, $$5) == 1;
      }
   }

   protected void a(int $$0) {
      int $$1 = awh.a($$0, 2, 32);
      if ($$1 != this.O) {
         this.O = $$1;
         this.F.a(this.O);

         for (aow $$2 : this.J.a()) {
            this.e($$2);
         }
      }
   }

   int b(aow $$0) {
      return awh.a($$0.E(), 2, this.O);
   }

   private void a(aow $$0, cuu $$1) {
      dnm $$2 = this.d($$1.a());
      if ($$2 != null) {
         a($$0, $$2);
      }
   }

   private static void a(aow $$0, dnm $$1) {
      $$0.d.f.a($$1);
   }

   private static void b(aow $$0, cuu $$1) {
      $$0.d.f.a($$0, $$1);
   }

   @Nullable
   public dnm d(long $$0) {
      aod $$1 = this.b($$0);
      return $$1 == null ? null : $$1.f();
   }

   public int i() {
      return this.n.size();
   }

   public aon j() {
      return this.F;
   }

   protected Iterable<aod> k() {
      return Iterables.unmodifiableIterable(this.n.values());
   }

   void a(Writer $$0) throws IOException {
      avh $$1 = avh.a()
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
      apb $$2 = this.F.d();
      ObjectBidirectionalIterator var4 = this.n.long2ObjectEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<aod> $$3 = (Entry<aod>)var4.next();
         long $$4 = $$3.getLongKey();
         cuu $$5 = new cuu($$4);
         aod $$6 = (aod)$$3.getValue();
         Optional<dnb> $$7 = Optional.ofNullable($$6.i());
         Optional<dnm> $$8 = $$7.flatMap($$0x -> $$0x instanceof dnm ? Optional.of((dnm)$$0x) : Optional.empty());
         $$1.a(
            $$5.e,
            $$5.f,
            $$6.m(),
            $$7.isPresent(),
            $$7.map(dnb::j).orElse(null),
            $$8.map(dnm::D).orElse(null),
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

   private static String a(CompletableFuture<Either<dnm, aod.a>> $$0) {
      try {
         Either<dnm, aod.a> $$1 = $$0.getNow(null);
         return $$1 != null ? (String)$$1.map($$0x -> "done", $$0x -> "unloaded") : "not completed";
      } catch (CompletionException var2) {
         return "failed " + var2.getCause().getMessage();
      } catch (CancellationException var3) {
         return "cancelled";
      }
   }

   private CompletableFuture<Optional<sw>> j(cuu $$0) {
      return this.e($$0).thenApplyAsync($$0x -> $$0x.map(this::c), ac.f());
   }

   private sw c(sw $$0) {
      return this.a(this.q.ae(), this.w, $$0, this.t.b());
   }

   boolean c(cuu $$0) {
      if (!this.F.f($$0.a())) {
         return false;
      } else {
         for (aow $$1 : this.J.a()) {
            if (this.c($$1, $$0)) {
               return true;
            }
         }

         return false;
      }
   }

   public List<aow> d(cuu $$0) {
      long $$1 = $$0.a();
      if (!this.F.f($$1)) {
         return List.of();
      } else {
         Builder<aow> $$2 = ImmutableList.builder();

         for (aow $$3 : this.J.a()) {
            if (this.c($$3, $$0)) {
               $$2.add($$3);
            }
         }

         return $$2.build();
      }
   }

   private boolean c(aow $$0, cuu $$1) {
      if ($$0.P_()) {
         return false;
      } else {
         double $$2 = a($$1, $$0);
         return $$2 < 16384.0;
      }
   }

   private boolean c(aow $$0) {
      return $$0.P_() && !this.q.Z().b(cvj.r);
   }

   void a(aow $$0, boolean $$1) {
      boolean $$2 = this.c($$0);
      boolean $$3 = this.J.d($$0);
      if ($$1) {
         this.J.a($$0, $$2);
         this.d($$0);
         if (!$$2) {
            this.F.a(jb.a($$0), $$0);
         }

         $$0.a(aoj.a);
         this.e($$0);
      } else {
         jb $$4 = $$0.V();
         this.J.a($$0);
         if (!$$3) {
            this.F.b($$4, $$0);
         }

         this.a($$0, aoj.a);
      }
   }

   private void d(aow $$0) {
      jb $$1 = jb.a($$0);
      $$0.a($$1);
   }

   public void a(aow $$0) {
      ObjectIterator $$2 = this.K.values().iterator();

      while ($$2.hasNext()) {
         aof.b $$1 = (aof.b)$$2.next();
         if ($$1.c == $$0) {
            $$1.a(this.q.x());
         } else {
            $$1.b($$0);
         }
      }

      jb $$2x = $$0.V();
      jb $$3 = jb.a($$0);
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

   private void e(aow $$0) {
      cuu $$1 = $$0.do();
      int $$2 = this.b($$0);
      if ($$0.W() instanceof aoj.a $$3 && $$3.a().equals($$1) && $$3.b() == $$2) {
         return;
      }

      this.a($$0, aoj.a($$1, $$2));
   }

   private void a(aow $$0, aoj $$1) {
      if ($$0.dM() == this.q) {
         aoj $$2 = $$0.W();
         if ($$1 instanceof aoj.a $$3 && (!($$2 instanceof aoj.a $$4) || !$$4.a().equals($$3.a()))) {
            $$0.d.b(new adf($$3.a().e, $$3.a().f));
         }

         aoj.a($$2, $$1, $$1x -> this.a($$0, $$1x), $$1x -> b($$0, $$1x));
         $$0.a($$1);
      }
   }

   @Override
   public List<aow> a(cuu $$0, boolean $$1) {
      Set<aow> $$2 = this.J.a();
      Builder<aow> $$3 = ImmutableList.builder();

      for (aow $$4 : $$2) {
         if ($$1 && this.b($$4, $$0.e, $$0.f) || !$$1 && this.a($$4, $$0.e, $$0.f)) {
            $$3.add($$4);
         }
      }

      return $$3.build();
   }

   protected void a(bno $$0) {
      if (!($$0 instanceof cck)) {
         bnu<?> $$1 = $$0.ai();
         int $$2 = $$1.o() * 16;
         if ($$2 != 0) {
            int $$3 = $$1.p();
            if (this.K.containsKey($$0.aj())) {
               throw (IllegalStateException)ac.b(new IllegalStateException("Entity is already tracked!"));
            } else {
               aof.b $$4 = new aof.b($$0, $$2, $$3, $$1.q());
               this.K.put($$0.aj(), $$4);
               $$4.a(this.q.x());
               if ($$0 instanceof aow $$5) {
                  this.a($$5, true);
                  ObjectIterator var7 = this.K.values().iterator();

                  while (var7.hasNext()) {
                     aof.b $$6 = (aof.b)var7.next();
                     if ($$6.c != $$5) {
                        $$6.b($$5);
                     }
                  }
               }
            }
         }
      }
   }

   protected void b(bno $$0) {
      if ($$0 instanceof aow $$1) {
         this.a($$1, false);
         ObjectIterator var3 = this.K.values().iterator();

         while (var3.hasNext()) {
            aof.b $$2 = (aof.b)var3.next();
            $$2.a($$1);
         }
      }

      aof.b $$3 = (aof.b)this.K.remove($$0.aj());
      if ($$3 != null) {
         $$3.a();
      }
   }

   protected void l() {
      for (aow $$0 : this.J.a()) {
         this.e($$0);
      }

      List<aow> $$1 = Lists.newArrayList();
      List<aow> $$2 = this.q.x();
      ObjectIterator var3 = this.K.values().iterator();

      while (var3.hasNext()) {
         aof.b $$3 = (aof.b)var3.next();
         jb $$4 = $$3.e;
         jb $$5 = jb.a($$3.c);
         boolean $$6 = !Objects.equals($$4, $$5);
         if ($$6) {
            $$3.a($$2);
            bno $$7 = $$3.c;
            if ($$7 instanceof aow) {
               $$1.add((aow)$$7);
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
            aof.b $$8 = (aof.b)var3.next();
            $$8.a($$1);
         }
      }
   }

   public void a(bno $$0, xx<?> $$1) {
      aof.b $$2 = (aof.b)this.K.get($$0.aj());
      if ($$2 != null) {
         $$2.a($$1);
      }
   }

   protected void b(bno $$0, xx<?> $$1) {
      aof.b $$2 = (aof.b)this.K.get($$0.aj());
      if ($$2 != null) {
         $$2.b($$1);
      }
   }

   public void a(List<dnb> $$0) {
      Map<aow, List<dnm>> $$1 = new HashMap<>();

      for (dnb $$2 : $$0) {
         cuu $$3 = $$2.f();
         dnm $$5;
         if ($$2 instanceof dnm $$4) {
            $$5 = $$4;
         } else {
            $$5 = this.q.d($$3.e, $$3.f);
         }

         for (aow $$7 : this.a($$3, false)) {
            $$1.computeIfAbsent($$7, $$0x -> new ArrayList<>()).add($$5);
         }
      }

      $$1.forEach(($$0x, $$1x) -> $$0x.d.b(aaw.a($$1x)));
   }

   protected bzh m() {
      return this.x;
   }

   public String n() {
      return this.I;
   }

   void a(cuu $$0, aoo $$1) {
      this.E.onChunkStatusChange($$0, $$1);
   }

   public void a(cuu $$0, int $$1) {
      int $$2 = $$1 + 1;
      cuu.a($$0, $$2).forEach($$0x -> {
         aod $$1x = this.b($$0x.a());
         if ($$1x != null) {
            $$1x.a(this.r.a($$0x.e, $$0x.f));
         }
      });
   }

   class a extends aon {
      protected a(Executor $$0, Executor $$1) {
         super($$0, $$1);
      }

      @Override
      protected boolean a(long $$0) {
         return aof.this.y.contains($$0);
      }

      @Nullable
      @Override
      protected aod b(long $$0) {
         return aof.this.a($$0);
      }

      @Nullable
      @Override
      protected aod a(long $$0, int $$1, @Nullable aod $$2, int $$3) {
         return aof.this.a($$0, $$1, $$2, $$3);
      }
   }

   class b {
      final aou b;
      final bno c;
      private final int d;
      jb e;
      private final Set<apx> f = Sets.newIdentityHashSet();

      public b(bno $$0, int $$1, int $$2, boolean $$3) {
         this.b = new aou(aof.this.q, $$0, $$2, $$3, this::a);
         this.c = $$0;
         this.d = $$1;
         this.e = jb.a($$0);
      }

      @Override
      public boolean equals(Object $$0) {
         return $$0 instanceof aof.b ? ((aof.b)$$0).c.aj() == this.c.aj() : false;
      }

      @Override
      public int hashCode() {
         return this.c.aj();
      }

      public void a(xx<?> $$0) {
         for (apx $$1 : this.f) {
            $$1.b($$0);
         }
      }

      public void b(xx<?> $$0) {
         this.a($$0);
         if (this.c instanceof aow) {
            ((aow)this.c).d.b($$0);
         }
      }

      public void a() {
         for (apx $$0 : this.f) {
            this.b.a($$0.p());
         }
      }

      public void a(aow $$0) {
         if (this.f.remove($$0.d)) {
            this.b.a($$0);
         }
      }

      public void b(aow $$0) {
         if ($$0 != this.c) {
            ens $$1 = $$0.dk().d(this.c.dk());
            int $$2 = aof.this.b($$0);
            double $$3 = (double)Math.min(this.b(), $$2 * 16);
            double $$4 = $$1.c * $$1.c + $$1.e * $$1.e;
            double $$5 = $$3 * $$3;
            boolean $$6 = $$4 <= $$5 && this.c.a($$0) && aof.this.a($$0, this.c.do().e, this.c.do().f);
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
         return aof.this.q.o().b($$0);
      }

      private int b() {
         int $$0 = this.d;

         for (bno $$1 : this.c.cT()) {
            int $$2 = $$1.ai().o() * 16;
            if ($$2 > $$0) {
               $$0 = $$2;
            }
         }

         return this.a($$0);
      }

      public void a(List<aow> $$0) {
         for (aow $$1 : $$0) {
            this.b($$1);
         }
      }
   }
}
