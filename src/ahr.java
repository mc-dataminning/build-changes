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
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class ahr extends dez implements ahp.d {
   private static final byte e = -1;
   private static final byte f = 0;
   private static final byte g = 1;
   private static final Logger h = LogUtils.getLogger();
   private static final int i = 200;
   private static final int j = 20;
   private static final int k = 10000;
   private static final int l = 2;
   public static final int a = 32;
   public static final int b = ahq.a(ahy.d);
   private final Long2ObjectLinkedOpenHashMap<ahp> m = new Long2ObjectLinkedOpenHashMap();
   private volatile Long2ObjectLinkedOpenHashMap<ahp> n = this.m.clone();
   private final Long2ObjectLinkedOpenHashMap<ahp> o = new Long2ObjectLinkedOpenHashMap();
   private final LongSet p = new LongOpenHashSet();
   final aif q;
   private final aii r;
   private final bcn<Runnable> s;
   private ddy t;
   private final dhy u;
   private final ddz v;
   private final Supplier<dyu> w;
   private final bqz x;
   final LongSet y = new LongOpenHashSet();
   private boolean z;
   private final aht A;
   private final bcp<aht.a<Runnable>> B;
   private final bcp<aht.a<Runnable>> C;
   private final aio D;
   private final dfr E;
   private final ahr.a F;
   private final AtomicInteger G = new AtomicInteger();
   private final dvu H;
   private final String I;
   private final ahz J = new ahz();
   private final Int2ObjectMap<ahr.b> K = new Int2ObjectOpenHashMap();
   private final Long2ByteMap L = new Long2ByteOpenHashMap();
   private final Long2LongMap M = new Long2LongOpenHashMap();
   private final Queue<Runnable> N = Queues.newConcurrentLinkedQueue();
   int O;

   public ahr(
      aif $$0,
      dyy.c $$1,
      DataFixer $$2,
      dvu $$3,
      Executor $$4,
      bcn<Runnable> $$5,
      del $$6,
      ddy $$7,
      aio $$8,
      dfr $$9,
      Supplier<dyu> $$10,
      int $$11,
      boolean $$12
   ) {
      super($$1.a($$0.ac()).resolve("region"), $$2, $$12);
      this.H = $$3;
      Path $$13 = $$1.a($$0.ac());
      this.I = $$13.getFileName().toString();
      this.q = $$0;
      this.t = $$7;
      hs $$14 = $$0.B_();
      long $$15 = $$0.A();
      if ($$7 instanceof dhn $$16) {
         this.u = dhy.a($$16.g().a(), $$14.b(jc.ax), $$15);
      } else {
         this.u = dhy.a(dhp.e(), $$14.b(jc.ax), $$15);
      }

      this.v = $$7.a($$14.b(jc.aB), this.u, $$15);
      this.s = $$5;
      bcq<Runnable> $$17 = bcq.a($$4, "worldgen");
      bcp<Runnable> $$18 = bcp.a("main", $$5::i);
      this.D = $$8;
      this.E = $$9;
      bcq<Runnable> $$19 = bcq.a($$4, "light");
      this.A = new aht(ImmutableList.of($$17, $$18, $$19), $$4, Integer.MAX_VALUE);
      this.B = this.A.a($$17, false);
      this.C = this.A.a($$18, false);
      this.r = new aii($$6, this, this.q.x_().g(), $$19, this.A.a($$19, false));
      this.F = new ahr.a($$4, $$5);
      this.w = $$10;
      this.x = new bqz($$13.resolve("poi"), $$2, $$12, $$14, $$0);
      this.a($$11);
   }

   protected ddy a() {
      return this.t;
   }

   protected ddz b() {
      return this.v;
   }

   protected dhy c() {
      return this.u;
   }

   public void d() {
      DataResult<JsonElement> $$0 = ddy.a.encodeStart(JsonOps.INSTANCE, this.t);
      DataResult<ddy> $$1 = $$0.flatMap($$0x -> ddy.a.parse(JsonOps.INSTANCE, $$0x));
      $$1.result().ifPresent($$0x -> this.t = $$0x);
   }

   private static double a(clt $$0, bfj $$1) {
      double $$2 = (double)hx.a($$0.e, 8);
      double $$3 = (double)hx.a($$0.f, 8);
      double $$4 = $$2 - $$1.dn();
      double $$5 = $$3 - $$1.dt();
      return $$4 * $$4 + $$5 * $$5;
   }

   public static boolean a(int $$0, int $$1, int $$2, int $$3, int $$4) {
      int $$5 = Math.max(0, Math.abs($$0 - $$2) - 1);
      int $$6 = Math.max(0, Math.abs($$1 - $$3) - 1);
      long $$7 = (long)Math.max(0, Math.max($$5, $$6) - 1);
      long $$8 = (long)Math.min($$5, $$6);
      long $$9 = $$8 * $$8 + $$7 * $$7;
      int $$10 = $$4 * $$4;
      return $$9 < (long)$$10;
   }

   private static boolean b(int $$0, int $$1, int $$2, int $$3, int $$4) {
      return !a($$0, $$1, $$2, $$3, $$4)
         ? false
         : !a($$0 + 1, $$1 + 1, $$2, $$3, $$4)
            || !a($$0 - 1, $$1 + 1, $$2, $$3, $$4)
            || !a($$0 + 1, $$1 - 1, $$2, $$3, $$4)
            || !a($$0 - 1, $$1 - 1, $$2, $$3, $$4);
   }

   protected aii e() {
      return this.r;
   }

   @Nullable
   protected ahp a(long $$0) {
      return (ahp)this.m.get($$0);
   }

   @Nullable
   protected ahp b(long $$0) {
      return (ahp)this.n.get($$0);
   }

   protected IntSupplier c(long $$0) {
      return () -> {
         ahp $$1 = this.b($$0);
         return $$1 == null ? ahs.a - 1 : Math.min($$1.l(), ahs.a - 1);
      };
   }

   public String a(clt $$0) {
      ahp $$1 = this.b($$0.a());
      if ($$1 == null) {
         return "null";
      } else {
         String $$2 = $$1.k() + "\n";
         dec $$3 = $$1.f();
         ddx $$4 = $$1.g();
         if ($$3 != null) {
            $$2 = $$2 + "St: §" + $$3.c() + $$3 + "§r\n";
         }

         if ($$4 != null) {
            $$2 = $$2 + "Ch: §" + $$4.j().c() + $$4.j() + "§r\n";
         }

         ahy $$5 = $$1.i();
         $$2 = $$2 + "§" + $$5.ordinal() + $$5;
         return $$2 + "§r";
      }
   }

   private CompletableFuture<Either<List<ddx>, ahp.a>> a(ahp $$0, int $$1, IntFunction<dec> $$2) {
      if ($$1 == 0) {
         dec $$3 = $$2.apply(0);
         return $$0.a($$3, this).thenApply($$0x -> $$0x.mapLeft(List::of));
      } else {
         List<CompletableFuture<Either<ddx, ahp.a>>> $$4 = new ArrayList<>();
         List<ahp> $$5 = new ArrayList<>();
         clt $$6 = $$0.j();
         int $$7 = $$6.e;
         int $$8 = $$6.f;

         for (int $$9 = -$$1; $$9 <= $$1; $$9++) {
            for (int $$10 = -$$1; $$10 <= $$1; $$10++) {
               int $$11 = Math.max(Math.abs($$10), Math.abs($$9));
               final clt $$12 = new clt($$7 + $$10, $$8 + $$9);
               long $$13 = $$12.a();
               ahp $$14 = this.a($$13);
               if ($$14 == null) {
                  return CompletableFuture.completedFuture(Either.right(new ahp.a() {
                     @Override
                     public String toString() {
                        return "Unloaded " + $$12;
                     }
                  }));
               }

               dec $$15 = $$2.apply($$11);
               CompletableFuture<Either<ddx, ahp.a>> $$16 = $$14.a($$15, this);
               $$5.add($$14);
               $$4.add($$16);
            }
         }

         CompletableFuture<List<Either<ddx, ahp.a>>> $$17 = ac.b($$4);
         CompletableFuture<Either<List<ddx>, ahp.a>> $$18 = $$17.thenApply($$3 -> {
            List<ddx> $$4x = Lists.newArrayList();
            int $$5x = 0;

            for (final Either<ddx, ahp.a> $$6x : $$3) {
               if ($$6x == null) {
                  throw this.a(new IllegalStateException("At least one of the chunk futures were null"), "n/a");
               }

               Optional<ddx> $$7x = $$6x.left();
               if (!$$7x.isPresent()) {
                  final int $$8x = $$5x;
                  return Either.right(new ahp.a() {
                     @Override
                     public String toString() {
                        return "Unloaded " + new clt($$7 + $$8x % ($$1 * 2 + 1), $$8 + $$8x / ($$1 * 2 + 1)) + " " + $$6x.right().get();
                     }
                  });
               }

               $$4x.add($$7x.get());
               $$5x++;
            }

            return Either.left($$4x);
         });

         for (ahp $$19 : $$5) {
            $$19.a("getChunkRangeFuture " + $$6 + " " + $$1, $$18);
         }

         return $$18;
      }
   }

   public y a(IllegalStateException $$0, String $$1) {
      StringBuilder $$2 = new StringBuilder();
      Consumer<ahp> $$3 = $$1x -> $$1x.o().forEach($$2x -> {
            dec $$3x = (dec)$$2x.getFirst();
            CompletableFuture<Either<ddx, ahp.a>> $$4x = (CompletableFuture<Either<ddx, ahp.a>>)$$2x.getSecond();
            if ($$4x != null && $$4x.isDone() && $$4x.join() == null) {
               $$2.append($$1x.j()).append(" - status: ").append($$3x).append(" future: ").append($$4x).append(System.lineSeparator());
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

   public CompletableFuture<Either<dei, ahp.a>> a(ahp $$0) {
      return this.a($$0, 2, $$0x -> dec.n).thenApplyAsync($$0x -> $$0x.mapLeft($$0xx -> (dei)$$0xx.get($$0xx.size() / 2)), this.s);
   }

   @Nullable
   ahp a(long $$0, int $$1, @Nullable ahp $$2, int $$3) {
      if (!ahq.e($$3) && !ahq.e($$1)) {
         return $$2;
      } else {
         if ($$2 != null) {
            $$2.a($$1);
         }

         if ($$2 != null) {
            if (!ahq.e($$1)) {
               this.y.add($$0);
            } else {
               this.y.remove($$0);
            }
         }

         if (ahq.e($$1) && $$2 == null) {
            $$2 = (ahp)this.o.remove($$0);
            if ($$2 != null) {
               $$2.a($$1);
            } else {
               $$2 = new ahp(new clt($$0), $$1, this.q, this.r, this.A, this);
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
         List<ahp> $$1 = this.n.values().stream().filter(ahp::m).peek(ahp::n).collect(Collectors.toList());
         MutableBoolean $$2 = new MutableBoolean();

         do {
            $$2.setFalse();
            $$1.stream().map($$0x -> {
               CompletableFuture<ddx> $$1x;
               do {
                  $$1x = $$0x.h();
                  this.s.c($$1x::isDone);
               } while ($$1x != $$0x.h());

               return $$1x.join();
            }).filter($$0x -> $$0x instanceof deh || $$0x instanceof dei).filter(this::a).forEach($$1x -> $$2.setTrue());
         } while ($$2.isTrue());

         this.b((BooleanSupplier)(() -> true));
         this.o();
      } else {
         this.n.values().forEach(this::e);
      }
   }

   protected void a(BooleanSupplier $$0) {
      ban $$1 = this.q.ad();
      $$1.a("poi");
      this.x.a($$0);
      $$1.b("chunk_unload");
      if (!this.q.r()) {
         this.b($$0);
      }

      $$1.c();
   }

   public boolean f() {
      return this.r.E_() || !this.o.isEmpty() || !this.m.isEmpty() || this.x.a() || !this.y.isEmpty() || !this.N.isEmpty() || this.A.a() || this.F.f();
   }

   private void b(BooleanSupplier $$0) {
      LongIterator $$1 = this.y.iterator();

      for (int $$2 = 0; $$1.hasNext() && ($$0.getAsBoolean() || $$2 < 200 || this.y.size() > 2000); $$1.remove()) {
         long $$3 = $$1.nextLong();
         ahp $$4 = (ahp)this.m.remove($$3);
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
      ObjectIterator<ahp> $$8 = this.n.values().iterator();

      while ($$7 < 20 && $$0.getAsBoolean() && $$8.hasNext()) {
         if (this.e((ahp)$$8.next())) {
            $$7++;
         }
      }
   }

   private void a(long $$0, ahp $$1) {
      CompletableFuture<ddx> $$2 = $$1.h();
      $$2.thenAcceptAsync($$3 -> {
         CompletableFuture<ddx> $$4 = $$1.h();
         if ($$4 != $$2) {
            this.a($$0, $$1);
         } else {
            if (this.o.remove($$0, $$1) && $$3 != null) {
               if ($$3 instanceof dei) {
                  ((dei)$$3).c(false);
               }

               this.a($$3);
               if (this.p.remove($$0) && $$3 instanceof dei $$5) {
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
            h.error("Failed to save chunk {}", $$1.j(), $$2x);
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

   public CompletableFuture<Either<ddx, ahp.a>> a(ahp $$0, dec $$1) {
      clt $$2 = $$0.j();
      if ($$1 == dec.c) {
         return this.f($$2);
      } else {
         if ($$1 == dec.l) {
            this.F.a(aik.e, $$2, ahq.a(dec.l), $$2);
         }

         if (!$$1.f()) {
            Optional<ddx> $$3 = $$0.a($$1.d(), this).getNow(ahp.a).left();
            if ($$3.isPresent() && $$3.get().j().b($$1)) {
               CompletableFuture<Either<ddx, ahp.a>> $$4 = $$1.a(this.q, this.H, this.r, $$1x -> this.d($$0), $$3.get());
               this.D.a($$2, $$1);
               return $$4;
            }
         }

         return this.b($$0, $$1);
      }
   }

   private CompletableFuture<Either<ddx, ahp.a>> f(clt $$0) {
      return this.j($$0).thenApply($$1 -> $$1.filter($$1x -> {
            boolean $$2 = b($$1x);
            if (!$$2) {
               h.error("Chunk file at {} is missing level data, skipping", $$0);
            }

            return $$2;
         })).thenApplyAsync($$1 -> {
         this.q.ad().d("chunkLoad");
         if ($$1.isPresent()) {
            ddx $$2 = dey.a(this.q, this.x, $$0, $$1.get());
            this.a($$0, $$2.j().g());
            return Either.left($$2);
         } else {
            return Either.left(this.g($$0));
         }
      }, this.s).exceptionallyAsync($$1 -> this.a($$1, $$0), this.s);
   }

   private static boolean b(qr $$0) {
      return $$0.b("Status", 8);
   }

   private Either<ddx, ahp.a> a(Throwable $$0, clt $$1) {
      if ($$0 instanceof y $$2) {
         Throwable $$3 = $$2.getCause();
         if (!($$3 instanceof IOException)) {
            this.h($$1);
            throw $$2;
         }

         h.error("Couldn't load chunk {}", $$1, $$3);
      } else if ($$0 instanceof IOException) {
         h.error("Couldn't load chunk {}", $$1, $$0);
      }

      return Either.left(this.g($$1));
   }

   private ddx g(clt $$0) {
      this.h($$0);
      return new des($$0, dev.a, this.q, this.q.B_().d(jc.ap), null);
   }

   private void h(clt $$0) {
      this.L.put($$0.a(), (byte)-1);
   }

   private byte a(clt $$0, dec.a $$1) {
      return this.L.put($$0.a(), (byte)($$1 == dec.a.a ? -1 : 1));
   }

   private CompletableFuture<Either<ddx, ahp.a>> b(ahp $$0, dec $$1) {
      clt $$2 = $$0.j();
      CompletableFuture<Either<List<ddx>, ahp.a>> $$3 = this.a($$0, $$1.e(), $$1x -> this.a($$1, $$1x));
      this.q.ad().c(() -> "chunkGenerate " + $$1);
      Executor $$4 = $$1x -> this.B.a(aht.a($$0, $$1x));
      return $$3.thenComposeAsync($$4x -> (CompletionStage<Either<ddx, ahp.a>>)$$4x.map($$4xx -> {
            try {
               ddx $$5 = (ddx)$$4xx.get($$4xx.size() / 2);
               CompletableFuture<Either<ddx, ahp.a>> $$6;
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
               $$10.a("Position hash", clt.c($$2.e, $$2.f));
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

   protected void b(clt $$0) {
      this.s.i(ac.a(() -> this.F.b(aik.e, $$0, ahq.a(dec.l), $$0), () -> "release light ticket " + $$0));
   }

   private dec a(dec $$0, int $$1) {
      dec $$2;
      if ($$1 == 0) {
         $$2 = $$0.d();
      } else {
         $$2 = dec.a(dec.a($$0) + $$1);
      }

      return $$2;
   }

   private static void a(aif $$0, List<qr> $$1) {
      if (!$$1.isEmpty()) {
         $$0.b(bfn.a($$1, $$0));
      }
   }

   private CompletableFuture<Either<ddx, ahp.a>> d(ahp $$0) {
      CompletableFuture<Either<ddx, ahp.a>> $$1 = $$0.a(dec.n.d());
      return $$1.thenApplyAsync($$1x -> {
         dec $$2 = ahq.a($$0.k());
         return !$$2.b(dec.n) ? ahp.a : $$1x.mapLeft($$1xx -> {
            clt $$2x = $$0.j();
            des $$3 = (des)$$1xx;
            dei $$4;
            if ($$3 instanceof deh) {
               $$4 = ((deh)$$3).C();
            } else {
               $$4 = new dei(this.q, $$3, $$1xxx -> a(this.q, $$3.E()));
               $$0.a(new deh($$4, false));
            }

            $$4.b(() -> ahq.b($$0.k()));
            $$4.E();
            if (this.p.add($$2x.a())) {
               $$4.c(true);
               $$4.J();
               $$4.a(this.q);
            }

            return $$4;
         });
      }, $$1x -> this.C.a(aht.a($$1x, $$0.j().a(), $$0::k)));
   }

   public CompletableFuture<Either<dei, ahp.a>> b(ahp $$0) {
      CompletableFuture<Either<List<ddx>, ahp.a>> $$1 = this.a($$0, 1, $$0x -> dec.n);
      CompletableFuture<Either<dei, ahp.a>> $$2 = $$1.<Either>thenApplyAsync(
            $$0x -> $$0x.mapLeft($$0xx -> (dei)$$0xx.get($$0xx.size() / 2)), $$1x -> this.C.a(aht.a($$0, $$1x))
         )
         .thenApplyAsync($$0x -> $$0x.ifLeft($$0xx -> {
               $$0xx.H();
               this.q.b($$0xx);
            }), this.s);
      $$2.handle(($$0x, $$1x) -> {
         this.G.getAndIncrement();
         return null;
      });
      $$2.thenAcceptAsync($$1x -> $$1x.ifLeft($$1xx -> {
            MutableObject<wd> $$2x = new MutableObject();
            this.a($$0.j(), false).forEach($$2xx -> this.a($$2xx, $$2x, $$1xx));
         }), $$1x -> this.C.a(aht.a($$0, $$1x)));
      return $$2;
   }

   public CompletableFuture<Either<dei, ahp.a>> c(ahp $$0) {
      return this.a($$0, 1, dec::a).thenApplyAsync($$0x -> $$0x.mapLeft($$0xx -> (dei)$$0xx.get($$0xx.size() / 2)), $$1 -> this.C.a(aht.a($$0, $$1)));
   }

   public int h() {
      return this.G.get();
   }

   private boolean e(ahp $$0) {
      if (!$$0.m()) {
         return false;
      } else {
         ddx $$1 = $$0.h().getNow(null);
         if (!($$1 instanceof deh) && !($$1 instanceof dei)) {
            return false;
         } else {
            long $$2 = $$1.f().a();
            long $$3 = this.M.getOrDefault($$2, -1L);
            long $$4 = System.currentTimeMillis();
            if ($$4 < $$3) {
               return false;
            } else {
               boolean $$5 = this.a($$1);
               $$0.n();
               if ($$5) {
                  this.M.put($$2, $$4 + 10000L);
               }

               return $$5;
            }
         }
      }
   }

   private boolean a(ddx $$0) {
      this.x.a($$0.f());
      if (!$$0.i()) {
         return false;
      } else {
         $$0.a(false);
         clt $$1 = $$0.f();

         try {
            dec $$2 = $$0.j();
            if ($$2.g() != dec.a.b) {
               if (this.i($$1)) {
                  return false;
               }

               if ($$2 == dec.c && $$0.g().values().stream().noneMatch(dsi::b)) {
                  return false;
               }
            }

            this.q.ad().d("chunkSave");
            qr $$3 = dey.a(this.q, $$0);
            this.a($$1, $$3);
            this.a($$1, $$2.g());
            return true;
         } catch (Exception var5) {
            h.error("Failed to save chunk {},{}", new Object[]{$$1.e, $$1.f, var5});
            return false;
         }
      }
   }

   private boolean i(clt $$0) {
      byte $$1 = this.L.get($$0.a());
      if ($$1 != 0) {
         return $$1 == 1;
      } else {
         qr $$2;
         try {
            $$2 = this.j($$0).join().orElse(null);
            if ($$2 == null) {
               this.h($$0);
               return false;
            }
         } catch (Exception var5) {
            h.error("Failed to read chunk {}", $$0, var5);
            this.h($$0);
            return false;
         }

         dec.a $$5 = dey.a($$2);
         return this.a($$0, $$5) == 1;
      }
   }

   protected void a(int $$0) {
      int $$1 = apa.a($$0, 2, 32);
      if ($$1 != this.O) {
         int $$2 = this.O;
         this.O = $$1;
         this.F.a(this.O);
         ObjectIterator var4 = this.m.values().iterator();

         while (var4.hasNext()) {
            ahp $$3 = (ahp)var4.next();
            clt $$4 = $$3.j();
            MutableObject<wd> $$5 = new MutableObject();
            this.a($$4, false).forEach($$3x -> {
               hx $$4x = $$3x.R();
               boolean $$5x = a($$4.e, $$4.f, $$4x.a(), $$4x.c(), $$2);
               boolean $$6 = a($$4.e, $$4.f, $$4x.a(), $$4x.c(), this.O);
               this.a($$3x, $$4, $$5, $$5x, $$6);
            });
         }
      }
   }

   protected void a(aig $$0, clt $$1, MutableObject<wd> $$2, boolean $$3, boolean $$4) {
      if ($$0.dI() == this.q) {
         if ($$4 && !$$3) {
            ahp $$5 = this.b($$1.a());
            if ($$5 != null) {
               dei $$6 = $$5.d();
               if ($$6 != null) {
                  this.a($$0, $$2, $$6);
               }

               za.a(this.q, $$1);
            }
         }

         if (!$$4 && $$3) {
            $$0.a($$1);
         }
      }
   }

   public int i() {
      return this.n.size();
   }

   public ahx j() {
      return this.F;
   }

   protected Iterable<ahp> k() {
      return Iterables.unmodifiableIterable(this.n.values());
   }

   void a(Writer $$0) throws IOException {
      aob $$1 = aob.a()
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
      ail $$2 = this.F.d();
      ObjectBidirectionalIterator var4 = this.n.long2ObjectEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<ahp> $$3 = (Entry<ahp>)var4.next();
         long $$4 = $$3.getLongKey();
         clt $$5 = new clt($$4);
         ahp $$6 = (ahp)$$3.getValue();
         Optional<ddx> $$7 = Optional.ofNullable($$6.g());
         Optional<dei> $$8 = $$7.flatMap($$0x -> $$0x instanceof dei ? Optional.of((dei)$$0x) : Optional.empty());
         $$1.a(
            $$5.e,
            $$5.f,
            $$6.k(),
            $$7.isPresent(),
            $$7.map(ddx::j).orElse(null),
            $$8.map(dei::D).orElse(null),
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

   private static String a(CompletableFuture<Either<dei, ahp.a>> $$0) {
      try {
         Either<dei, ahp.a> $$1 = $$0.getNow(null);
         return $$1 != null ? (String)$$1.map($$0x -> "done", $$0x -> "unloaded") : "not completed";
      } catch (CompletionException var2) {
         return "failed " + var2.getCause().getMessage();
      } catch (CancellationException var3) {
         return "cancelled";
      }
   }

   private CompletableFuture<Optional<qr>> j(clt $$0) {
      return this.e($$0).thenApplyAsync($$0x -> $$0x.map(this::c), ac.f());
   }

   private qr c(qr $$0) {
      return this.a(this.q.ac(), this.w, $$0, this.t.b());
   }

   boolean c(clt $$0) {
      long $$1 = $$0.a();
      if (!this.F.f($$1)) {
         return false;
      } else {
         for (aig $$2 : this.J.a($$1)) {
            if (this.a($$2, $$0)) {
               return true;
            }
         }

         return false;
      }
   }

   public List<aig> d(clt $$0) {
      long $$1 = $$0.a();
      if (!this.F.f($$1)) {
         return List.of();
      } else {
         Builder<aig> $$2 = ImmutableList.builder();

         for (aig $$3 : this.J.a($$1)) {
            if (this.a($$3, $$0)) {
               $$2.add($$3);
            }
         }

         return $$2.build();
      }
   }

   private boolean a(aig $$0, clt $$1) {
      if ($$0.G_()) {
         return false;
      } else {
         double $$2 = a($$1, $$0);
         return $$2 < 16384.0;
      }
   }

   private boolean b(aig $$0) {
      return $$0.G_() && !this.q.X().b(cmi.q);
   }

   void a(aig $$0, boolean $$1) {
      boolean $$2 = this.b($$0);
      boolean $$3 = this.J.c($$0);
      int $$4 = hx.a($$0.dm());
      int $$5 = hx.a($$0.ds());
      if ($$1) {
         this.J.a(clt.c($$4, $$5), $$0, $$2);
         this.c($$0);
         if (!$$2) {
            this.F.a(hx.a($$0), $$0);
         }
      } else {
         hx $$6 = $$0.R();
         this.J.a($$6.r().a(), $$0);
         if (!$$3) {
            this.F.b($$6, $$0);
         }
      }

      for (int $$7 = $$4 - this.O - 1; $$7 <= $$4 + this.O + 1; $$7++) {
         for (int $$8 = $$5 - this.O - 1; $$8 <= $$5 + this.O + 1; $$8++) {
            if (a($$7, $$8, $$4, $$5, this.O)) {
               clt $$9 = new clt($$7, $$8);
               this.a($$0, $$9, new MutableObject(), !$$1, $$1);
            }
         }
      }
   }

   private hx c(aig $$0) {
      hx $$1 = hx.a($$0);
      $$0.a($$1);
      $$0.c.a(new xs($$1.a(), $$1.c()));
      return $$1;
   }

   public void a(aig $$0) {
      ObjectIterator $$2 = this.K.values().iterator();

      while ($$2.hasNext()) {
         ahr.b $$1 = (ahr.b)$$2.next();
         if ($$1.c == $$0) {
            $$1.a(this.q.v());
         } else {
            $$1.b($$0);
         }
      }

      int $$2x = hx.a($$0.dm());
      int $$3 = hx.a($$0.ds());
      hx $$4 = $$0.R();
      hx $$5 = hx.a($$0);
      long $$6 = $$4.r().a();
      long $$7 = $$5.r().a();
      boolean $$8 = this.J.d($$0);
      boolean $$9 = this.b($$0);
      boolean $$10 = $$4.s() != $$5.s();
      if ($$10 || $$8 != $$9) {
         this.c($$0);
         if (!$$8) {
            this.F.b($$4, $$0);
         }

         if (!$$9) {
            this.F.a($$5, $$0);
         }

         if (!$$8 && $$9) {
            this.J.a($$0);
         }

         if ($$8 && !$$9) {
            this.J.b($$0);
         }

         if ($$6 != $$7) {
            this.J.a($$6, $$7, $$0);
         }
      }

      int $$11 = $$4.a();
      int $$12 = $$4.c();
      int $$13 = this.O + 1;
      if (Math.abs($$11 - $$2x) <= $$13 * 2 && Math.abs($$12 - $$3) <= $$13 * 2) {
         int $$14 = Math.min($$2x, $$11) - $$13;
         int $$15 = Math.min($$3, $$12) - $$13;
         int $$16 = Math.max($$2x, $$11) + $$13;
         int $$17 = Math.max($$3, $$12) + $$13;

         for (int $$18 = $$14; $$18 <= $$16; $$18++) {
            for (int $$19 = $$15; $$19 <= $$17; $$19++) {
               boolean $$20 = a($$18, $$19, $$11, $$12, this.O);
               boolean $$21 = a($$18, $$19, $$2x, $$3, this.O);
               this.a($$0, new clt($$18, $$19), new MutableObject(), $$20, $$21);
            }
         }
      } else {
         for (int $$22 = $$11 - $$13; $$22 <= $$11 + $$13; $$22++) {
            for (int $$23 = $$12 - $$13; $$23 <= $$12 + $$13; $$23++) {
               if (a($$22, $$23, $$11, $$12, this.O)) {
                  boolean $$24 = true;
                  boolean $$25 = false;
                  this.a($$0, new clt($$22, $$23), new MutableObject(), true, false);
               }
            }
         }

         for (int $$26 = $$2x - $$13; $$26 <= $$2x + $$13; $$26++) {
            for (int $$27 = $$3 - $$13; $$27 <= $$3 + $$13; $$27++) {
               if (a($$26, $$27, $$2x, $$3, this.O)) {
                  boolean $$28 = false;
                  boolean $$29 = true;
                  this.a($$0, new clt($$26, $$27), new MutableObject(), false, true);
               }
            }
         }
      }
   }

   @Override
   public List<aig> a(clt $$0, boolean $$1) {
      Set<aig> $$2 = this.J.a($$0.a());
      Builder<aig> $$3 = ImmutableList.builder();

      for (aig $$4 : $$2) {
         hx $$5 = $$4.R();
         if ($$1 && b($$0.e, $$0.f, $$5.a(), $$5.c(), this.O) || !$$1 && a($$0.e, $$0.f, $$5.a(), $$5.c(), this.O)) {
            $$3.add($$4);
         }
      }

      return $$3.build();
   }

   protected void a(bfj $$0) {
      if (!($$0 instanceof btz)) {
         bfn<?> $$1 = $$0.ae();
         int $$2 = $$1.o() * 16;
         if ($$2 != 0) {
            int $$3 = $$1.p();
            if (this.K.containsKey($$0.af())) {
               throw (IllegalStateException)ac.b(new IllegalStateException("Entity is already tracked!"));
            } else {
               ahr.b $$4 = new ahr.b($$0, $$2, $$3, $$1.q());
               this.K.put($$0.af(), $$4);
               $$4.a(this.q.v());
               if ($$0 instanceof aig $$5) {
                  this.a($$5, true);
                  ObjectIterator var7 = this.K.values().iterator();

                  while (var7.hasNext()) {
                     ahr.b $$6 = (ahr.b)var7.next();
                     if ($$6.c != $$5) {
                        $$6.b($$5);
                     }
                  }
               }
            }
         }
      }
   }

   protected void b(bfj $$0) {
      if ($$0 instanceof aig $$1) {
         this.a($$1, false);
         ObjectIterator var3 = this.K.values().iterator();

         while (var3.hasNext()) {
            ahr.b $$2 = (ahr.b)var3.next();
            $$2.a($$1);
         }
      }

      ahr.b $$3 = (ahr.b)this.K.remove($$0.af());
      if ($$3 != null) {
         $$3.a();
      }
   }

   protected void l() {
      List<aig> $$0 = Lists.newArrayList();
      List<aig> $$1 = this.q.v();
      ObjectIterator var3 = this.K.values().iterator();

      while (var3.hasNext()) {
         ahr.b $$2 = (ahr.b)var3.next();
         hx $$3 = $$2.e;
         hx $$4 = hx.a($$2.c);
         boolean $$5 = !Objects.equals($$3, $$4);
         if ($$5) {
            $$2.a($$1);
            bfj $$6 = $$2.c;
            if ($$6 instanceof aig) {
               $$0.add((aig)$$6);
            }

            $$2.e = $$4;
         }

         if ($$5 || this.F.c($$4.r().a())) {
            $$2.b.a();
         }
      }

      if (!$$0.isEmpty()) {
         var3 = this.K.values().iterator();

         while (var3.hasNext()) {
            ahr.b $$7 = (ahr.b)var3.next();
            $$7.a($$0);
         }
      }
   }

   public void a(bfj $$0, uo<?> $$1) {
      ahr.b $$2 = (ahr.b)this.K.get($$0.af());
      if ($$2 != null) {
         $$2.a($$1);
      }
   }

   protected void b(bfj $$0, uo<?> $$1) {
      ahr.b $$2 = (ahr.b)this.K.get($$0.af());
      if ($$2 != null) {
         $$2.b($$1);
      }
   }

   public void a(List<ddx> $$0) {
      Map<aig, List<dei>> $$1 = new HashMap<>();

      for (ddx $$2 : $$0) {
         clt $$3 = $$2.f();
         dei $$5;
         if ($$2 instanceof dei $$4) {
            $$5 = $$4;
         } else {
            $$5 = this.q.d($$3.e, $$3.f);
         }

         for (aig $$7 : this.a($$3, false)) {
            $$1.computeIfAbsent($$7, $$0x -> new ArrayList<>()).add($$5);
         }
      }

      $$1.forEach(($$0x, $$1x) -> $$0x.c.a(vf.a($$1x)));
   }

   private void a(aig $$0, MutableObject<wd> $$1, dei $$2) {
      if ($$1.getValue() == null) {
         $$1.setValue(new wd($$2, this.r, null, null));
      }

      $$0.a($$2.f(), (uo<?>)$$1.getValue());
      za.a(this.q, $$2.f());
      List<bfj> $$3 = Lists.newArrayList();
      List<bfj> $$4 = Lists.newArrayList();
      ObjectIterator var6 = this.K.values().iterator();

      while (var6.hasNext()) {
         ahr.b $$5 = (ahr.b)var6.next();
         bfj $$6 = $$5.c;
         if ($$6 != $$0 && $$6.dk().equals($$2.f())) {
            $$5.b($$0);
            if ($$6 instanceof bgb && ((bgb)$$6).fP() != null) {
               $$3.add($$6);
            }

            if (!$$6.cN().isEmpty()) {
               $$4.add($$6);
            }
         }
      }

      if (!$$3.isEmpty()) {
         for (bfj $$7 : $$3) {
            $$0.c.a(new xx($$7, ((bgb)$$7).fP()));
         }
      }

      if (!$$4.isEmpty()) {
         for (bfj $$8 : $$4) {
            $$0.c.a(new yd($$8));
         }
      }
   }

   protected bqz m() {
      return this.x;
   }

   public String n() {
      return this.I;
   }

   void a(clt $$0, ahy $$1) {
      this.E.onChunkStatusChange($$0, $$1);
   }

   class a extends ahx {
      protected a(Executor $$0, Executor $$1) {
         super($$0, $$1);
      }

      @Override
      protected boolean a(long $$0) {
         return ahr.this.y.contains($$0);
      }

      @Nullable
      @Override
      protected ahp b(long $$0) {
         return ahr.this.a($$0);
      }

      @Nullable
      @Override
      protected ahp a(long $$0, int $$1, @Nullable ahp $$2, int $$3) {
         return ahr.this.a($$0, $$1, $$2, $$3);
      }
   }

   class b {
      final aie b;
      final bfj c;
      private final int d;
      hx e;
      private final Set<ajb> f = Sets.newIdentityHashSet();

      public b(bfj $$0, int $$1, int $$2, boolean $$3) {
         this.b = new aie(ahr.this.q, $$0, $$2, $$3, this::a);
         this.c = $$0;
         this.d = $$1;
         this.e = hx.a($$0);
      }

      @Override
      public boolean equals(Object $$0) {
         return $$0 instanceof ahr.b ? ((ahr.b)$$0).c.af() == this.c.af() : false;
      }

      @Override
      public int hashCode() {
         return this.c.af();
      }

      public void a(uo<?> $$0) {
         for (ajb $$1 : this.f) {
            $$1.a($$0);
         }
      }

      public void b(uo<?> $$0) {
         this.a($$0);
         if (this.c instanceof aig) {
            ((aig)this.c).c.a($$0);
         }
      }

      public void a() {
         for (ajb $$0 : this.f) {
            this.b.a($$0.f());
         }
      }

      public void a(aig $$0) {
         if (this.f.remove($$0.c)) {
            this.b.a($$0);
         }
      }

      public void b(aig $$0) {
         if ($$0 != this.c) {
            eei $$1 = $$0.dg().d(this.c.dg());
            double $$2 = (double)Math.min(this.b(), ahr.this.O * 16);
            double $$3 = $$1.c * $$1.c + $$1.e * $$1.e;
            double $$4 = $$2 * $$2;
            boolean $$5 = $$3 <= $$4 && this.c.a($$0);
            if ($$5) {
               if (this.f.add($$0.c)) {
                  this.b.b($$0);
               }
            } else if (this.f.remove($$0.c)) {
               this.b.a($$0);
            }
         }
      }

      private int a(int $$0) {
         return ahr.this.q.n().b($$0);
      }

      private int b() {
         int $$0 = this.d;

         for (bfj $$1 : this.c.cR()) {
            int $$2 = $$1.ae().o() * 16;
            if ($$2 > $$0) {
               $$0 = $$2;
            }
         }

         return this.a($$0);
      }

      public void a(List<aig> $$0) {
         for (aig $$1 : $$0) {
            this.b($$1);
         }
      }
   }
}
