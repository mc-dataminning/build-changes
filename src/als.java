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

public class als extends dkl implements alq.d {
   private static final byte f = -1;
   private static final byte g = 0;
   private static final byte h = 1;
   private static final Logger i = LogUtils.getLogger();
   private static final int j = 200;
   private static final int k = 20;
   private static final int l = 10000;
   public static final int a = 2;
   public static final int b = 32;
   public static final int c = alr.a(amb.d);
   private final Long2ObjectLinkedOpenHashMap<alq> m = new Long2ObjectLinkedOpenHashMap();
   private volatile Long2ObjectLinkedOpenHashMap<alq> n = this.m.clone();
   private final Long2ObjectLinkedOpenHashMap<alq> o = new Long2ObjectLinkedOpenHashMap();
   private final LongSet p = new LongOpenHashSet();
   final ami q;
   private final aml r;
   private final bhr<Runnable> s;
   private djk t;
   private final dnk u;
   private final djl v;
   private final Supplier<een> w;
   private final bwk x;
   final LongSet y = new LongOpenHashSet();
   private boolean z;
   private final alu A;
   private final bht<alu.a<Runnable>> B;
   private final bht<alu.a<Runnable>> C;
   private final amr D;
   private final dld E;
   private final als.a F;
   private final AtomicInteger G = new AtomicInteger();
   private final ebn H;
   private final String I;
   private final amc J = new amc();
   private final Int2ObjectMap<als.b> K = new Int2ObjectOpenHashMap();
   private final Long2ByteMap L = new Long2ByteOpenHashMap();
   private final Long2LongMap M = new Long2LongOpenHashMap();
   private final Queue<Runnable> N = Queues.newConcurrentLinkedQueue();
   private int O;

   public als(
      ami $$0,
      ees.c $$1,
      DataFixer $$2,
      ebn $$3,
      Executor $$4,
      bhr<Runnable> $$5,
      djx $$6,
      djk $$7,
      amr $$8,
      dld $$9,
      Supplier<een> $$10,
      int $$11,
      boolean $$12
   ) {
      super($$1.a($$0.ad()).resolve("region"), $$2, $$12);
      this.H = $$3;
      Path $$13 = $$1.a($$0.ad());
      this.I = $$13.getFileName().toString();
      this.q = $$0;
      this.t = $$7;
      it $$14 = $$0.I_();
      long $$15 = $$0.B();
      if ($$7 instanceof dmz $$16) {
         this.u = dnk.a($$16.g().a(), $$14.b(kd.az), $$15);
      } else {
         this.u = dnk.a(dnb.e(), $$14.b(kd.az), $$15);
      }

      this.v = $$7.a($$14.b(kd.aD), this.u, $$15);
      this.s = $$5;
      bhu<Runnable> $$17 = bhu.a($$4, "worldgen");
      bht<Runnable> $$18 = bht.a("main", $$5::i);
      this.D = $$8;
      this.E = $$9;
      bhu<Runnable> $$19 = bhu.a($$4, "light");
      this.A = new alu(ImmutableList.of($$17, $$18, $$19), $$4, Integer.MAX_VALUE);
      this.B = this.A.a($$17, false);
      this.C = this.A.a($$18, false);
      this.r = new aml($$6, this, this.q.E_().g(), $$19, this.A.a($$19, false));
      this.F = new als.a($$4, $$5);
      this.w = $$10;
      this.x = new bwk($$13.resolve("poi"), $$2, $$12, $$14, $$0);
      this.a($$11);
   }

   protected djk a() {
      return this.t;
   }

   protected djl b() {
      return this.v;
   }

   protected dnk c() {
      return this.u;
   }

   public void d() {
      DataResult<JsonElement> $$0 = djk.a.encodeStart(JsonOps.INSTANCE, this.t);
      DataResult<djk> $$1 = $$0.flatMap($$0x -> djk.a.parse(JsonOps.INSTANCE, $$0x));
      $$1.result().ifPresent($$0x -> this.t = $$0x);
   }

   private static double a(crm $$0, bkv $$1) {
      double $$2 = (double)iy.a($$0.e, 8);
      double $$3 = (double)iy.a($$0.f, 8);
      double $$4 = $$2 - $$1.ds();
      double $$5 = $$3 - $$1.dy();
      return $$4 * $$4 + $$5 * $$5;
   }

   boolean a(amj $$0, int $$1, int $$2) {
      return $$0.W().a($$1, $$2) && !$$0.c.f.a(crm.c($$1, $$2));
   }

   private boolean b(amj $$0, int $$1, int $$2) {
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

   protected aml e() {
      return this.r;
   }

   @Nullable
   protected alq a(long $$0) {
      return (alq)this.m.get($$0);
   }

   @Nullable
   protected alq b(long $$0) {
      return (alq)this.n.get($$0);
   }

   protected IntSupplier c(long $$0) {
      return () -> {
         alq $$1 = this.b($$0);
         return $$1 == null ? alt.a - 1 : Math.min($$1.n(), alt.a - 1);
      };
   }

   public String a(crm $$0) {
      alq $$1 = this.b($$0.a());
      if ($$1 == null) {
         return "null";
      } else {
         String $$2 = $$1.m() + "\n";
         djo $$3 = $$1.h();
         djj $$4 = $$1.i();
         if ($$3 != null) {
            $$2 = $$2 + "St: §" + $$3.c() + $$3 + "§r\n";
         }

         if ($$4 != null) {
            $$2 = $$2 + "Ch: §" + $$4.j().c() + $$4.j() + "§r\n";
         }

         amb $$5 = $$1.k();
         $$2 = $$2 + '§' + $$5.ordinal() + $$5;
         return $$2 + "§r";
      }
   }

   private CompletableFuture<Either<List<djj>, alq.a>> a(alq $$0, int $$1, IntFunction<djo> $$2) {
      if ($$1 == 0) {
         djo $$3 = $$2.apply(0);
         return $$0.a($$3, this).thenApply($$0x -> $$0x.mapLeft(List::of));
      } else {
         List<CompletableFuture<Either<djj, alq.a>>> $$4 = new ArrayList<>();
         List<alq> $$5 = new ArrayList<>();
         crm $$6 = $$0.l();
         int $$7 = $$6.e;
         int $$8 = $$6.f;

         for (int $$9 = -$$1; $$9 <= $$1; $$9++) {
            for (int $$10 = -$$1; $$10 <= $$1; $$10++) {
               int $$11 = Math.max(Math.abs($$10), Math.abs($$9));
               final crm $$12 = new crm($$7 + $$10, $$8 + $$9);
               long $$13 = $$12.a();
               alq $$14 = this.a($$13);
               if ($$14 == null) {
                  return CompletableFuture.completedFuture(Either.right(new alq.a() {
                     @Override
                     public String toString() {
                        return "Unloaded " + $$12;
                     }
                  }));
               }

               djo $$15 = $$2.apply($$11);
               CompletableFuture<Either<djj, alq.a>> $$16 = $$14.a($$15, this);
               $$5.add($$14);
               $$4.add($$16);
            }
         }

         CompletableFuture<List<Either<djj, alq.a>>> $$17 = ac.b($$4);
         CompletableFuture<Either<List<djj>, alq.a>> $$18 = $$17.thenApply($$3 -> {
            List<djj> $$4x = Lists.newArrayList();
            int $$5x = 0;

            for (final Either<djj, alq.a> $$6x : $$3) {
               if ($$6x == null) {
                  throw this.a(new IllegalStateException("At least one of the chunk futures were null"), "n/a");
               }

               Optional<djj> $$7x = $$6x.left();
               if ($$7x.isEmpty()) {
                  final int $$8x = $$5x;
                  return Either.right(new alq.a() {
                     @Override
                     public String toString() {
                        return "Unloaded " + new crm($$7 + $$8x % ($$1 * 2 + 1), $$8 + $$8x / ($$1 * 2 + 1)) + " " + $$6x.right().get();
                     }
                  });
               }

               $$4x.add($$7x.get());
               $$5x++;
            }

            return Either.left($$4x);
         });

         for (alq $$19 : $$5) {
            $$19.a("getChunkRangeFuture " + $$6 + " " + $$1, $$18);
         }

         return $$18;
      }
   }

   public y a(IllegalStateException $$0, String $$1) {
      StringBuilder $$2 = new StringBuilder();
      Consumer<alq> $$3 = $$1x -> $$1x.q().forEach($$2x -> {
            djo $$3x = (djo)$$2x.getFirst();
            CompletableFuture<Either<djj, alq.a>> $$4x = (CompletableFuture<Either<djj, alq.a>>)$$2x.getSecond();
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

   public CompletableFuture<Either<dju, alq.a>> a(alq $$0) {
      return this.a($$0, 2, $$0x -> djo.n).thenApplyAsync($$0x -> $$0x.mapLeft($$0xx -> (dju)$$0xx.get($$0xx.size() / 2)), this.s);
   }

   @Nullable
   alq a(long $$0, int $$1, @Nullable alq $$2, int $$3) {
      if (!alr.e($$3) && !alr.e($$1)) {
         return $$2;
      } else {
         if ($$2 != null) {
            $$2.a($$1);
         }

         if ($$2 != null) {
            if (!alr.e($$1)) {
               this.y.add($$0);
            } else {
               this.y.remove($$0);
            }
         }

         if (alr.e($$1) && $$2 == null) {
            $$2 = (alq)this.o.remove($$0);
            if ($$2 != null) {
               $$2.a($$1);
            } else {
               $$2 = new alq(new crm($$0), $$1, this.q, this.r, this.A, this);
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
         List<alq> $$1 = this.n.values().stream().filter(alq::o).peek(alq::p).toList();
         MutableBoolean $$2 = new MutableBoolean();

         do {
            $$2.setFalse();
            $$1.stream().map($$0x -> {
               CompletableFuture<djj> $$1x;
               do {
                  $$1x = $$0x.j();
                  this.s.c($$1x::isDone);
               } while ($$1x != $$0x.j());

               return $$1x.join();
            }).filter($$0x -> $$0x instanceof djt || $$0x instanceof dju).filter(this::a).forEach($$1x -> $$2.setTrue());
         } while ($$2.isTrue());

         this.b((BooleanSupplier)(() -> true));
         this.o();
      } else {
         this.n.values().forEach(this::e);
      }
   }

   protected void a(BooleanSupplier $$0) {
      bfs $$1 = this.q.ae();
      $$1.a("poi");
      this.x.a($$0);
      $$1.b("chunk_unload");
      if (!this.q.s()) {
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
         alq $$4 = (alq)this.m.remove($$3);
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
      ObjectIterator<alq> $$8 = this.n.values().iterator();

      while ($$7 < 20 && $$0.getAsBoolean() && $$8.hasNext()) {
         if (this.e((alq)$$8.next())) {
            $$7++;
         }
      }
   }

   private void a(long $$0, alq $$1) {
      CompletableFuture<djj> $$2 = $$1.j();
      $$2.thenAcceptAsync($$3 -> {
         CompletableFuture<djj> $$4 = $$1.j();
         if ($$4 != $$2) {
            this.a($$0, $$1);
         } else {
            if (this.o.remove($$0, $$1) && $$3 != null) {
               if ($$3 instanceof dju) {
                  ((dju)$$3).c(false);
               }

               this.a($$3);
               if (this.p.remove($$0) && $$3 instanceof dju $$5) {
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

   public CompletableFuture<Either<djj, alq.a>> a(alq $$0, djo $$1) {
      crm $$2 = $$0.l();
      if ($$1 == djo.c) {
         return this.f($$2);
      } else {
         if ($$1 == djo.l) {
            this.F.a(amn.e, $$2, alr.a(djo.l), $$2);
         }

         if (!$$1.f()) {
            Optional<djj> $$3 = $$0.a($$1.d(), this).getNow(alq.a).left();
            if ($$3.isPresent() && $$3.get().j().b($$1)) {
               CompletableFuture<Either<djj, alq.a>> $$4 = $$1.a(this.q, this.H, this.r, $$1x -> this.d($$0), $$3.get());
               this.D.a($$2, $$1);
               return $$4;
            }
         }

         return this.b($$0, $$1);
      }
   }

   private CompletableFuture<Either<djj, alq.a>> f(crm $$0) {
      return this.j($$0).thenApply($$1 -> $$1.filter($$1x -> {
            boolean $$2 = b($$1x);
            if (!$$2) {
               i.error("Chunk file at {} is missing level data, skipping", $$0);
            }

            return $$2;
         })).thenApplyAsync($$1 -> {
         this.q.ae().d("chunkLoad");
         if ($$1.isPresent()) {
            djj $$2 = dkk.a(this.q, this.x, $$0, $$1.get());
            this.a($$0, $$2.j().g());
            return Either.left($$2);
         } else {
            return Either.left(this.g($$0));
         }
      }, this.s).exceptionallyAsync($$1 -> this.a($$1, $$0), this.s);
   }

   private static boolean b(sd $$0) {
      return $$0.b("Status", 8);
   }

   private Either<djj, alq.a> a(Throwable $$0, crm $$1) {
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

   private djj g(crm $$0) {
      this.h($$0);
      return new dke($$0, dkh.a, this.q, this.q.I_().d(kd.ar), null);
   }

   private void h(crm $$0) {
      this.L.put($$0.a(), (byte)-1);
   }

   private byte a(crm $$0, djo.a $$1) {
      return this.L.put($$0.a(), (byte)($$1 == djo.a.a ? -1 : 1));
   }

   private CompletableFuture<Either<djj, alq.a>> b(alq $$0, djo $$1) {
      crm $$2 = $$0.l();
      CompletableFuture<Either<List<djj>, alq.a>> $$3 = this.a($$0, $$1.e(), $$1x -> this.a($$1, $$1x));
      this.q.ae().c(() -> "chunkGenerate " + $$1);
      Executor $$4 = $$1x -> this.B.a(alu.a($$0, $$1x));
      return $$3.thenComposeAsync($$4x -> (CompletionStage<Either<djj, alq.a>>)$$4x.map($$4xx -> {
            try {
               djj $$5 = (djj)$$4xx.get($$4xx.size() / 2);
               CompletableFuture<Either<djj, alq.a>> $$6;
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
               $$10.a("Position hash", crm.c($$2.e, $$2.f));
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

   protected void b(crm $$0) {
      this.s.i(ac.a(() -> this.F.b(amn.e, $$0, alr.a(djo.l), $$0), () -> "release light ticket " + $$0));
   }

   private djo a(djo $$0, int $$1) {
      djo $$2;
      if ($$1 == 0) {
         $$2 = $$0.d();
      } else {
         $$2 = djo.a(djo.a($$0) + $$1);
      }

      return $$2;
   }

   private static void a(ami $$0, List<sd> $$1) {
      if (!$$1.isEmpty()) {
         $$0.b(bkz.a($$1, $$0));
      }
   }

   private CompletableFuture<Either<djj, alq.a>> d(alq $$0) {
      CompletableFuture<Either<djj, alq.a>> $$1 = $$0.a(djo.n.d());
      return $$1.thenApplyAsync($$1x -> {
         djo $$2 = alr.a($$0.m());
         return !$$2.b(djo.n) ? alq.a : $$1x.mapLeft($$1xx -> {
            crm $$2x = $$0.l();
            dke $$3 = (dke)$$1xx;
            dju $$4;
            if ($$3 instanceof djt) {
               $$4 = ((djt)$$3).C();
            } else {
               $$4 = new dju(this.q, $$3, $$1xxx -> a(this.q, $$3.E()));
               $$0.a(new djt($$4, false));
            }

            $$4.b(() -> alr.b($$0.m()));
            $$4.E();
            if (this.p.add($$2x.a())) {
               $$4.c(true);
               $$4.J();
               $$4.a(this.q);
            }

            return $$4;
         });
      }, $$1x -> this.C.a(alu.a($$1x, $$0.l().a(), $$0::m)));
   }

   public CompletableFuture<Either<dju, alq.a>> b(alq $$0) {
      CompletableFuture<Either<List<djj>, alq.a>> $$1 = this.a($$0, 1, $$0x -> djo.n);
      CompletableFuture<Either<dju, alq.a>> $$2 = $$1.<Either>thenApplyAsync(
            $$0x -> $$0x.mapLeft($$0xx -> (dju)$$0xx.get($$0xx.size() / 2)), $$1x -> this.C.a(alu.a($$0, $$1x))
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

   private void a(dju $$0) {
      crm $$1 = $$0.f();

      for (amj $$2 : this.J.a()) {
         if ($$2.W().a($$1)) {
            a($$2, $$0);
         }
      }
   }

   public CompletableFuture<Either<dju, alq.a>> c(alq $$0) {
      return this.a($$0, 1, djo::a).thenApplyAsync($$0x -> $$0x.mapLeft($$0xx -> (dju)$$0xx.get($$0xx.size() / 2)), $$1 -> this.C.a(alu.a($$0, $$1)));
   }

   public int h() {
      return this.G.get();
   }

   private boolean e(alq $$0) {
      if (!$$0.o()) {
         return false;
      } else {
         djj $$1 = $$0.j().getNow(null);
         if (!($$1 instanceof djt) && !($$1 instanceof dju)) {
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

   private boolean a(djj $$0) {
      this.x.a($$0.f());
      if (!$$0.i()) {
         return false;
      } else {
         $$0.a(false);
         crm $$1 = $$0.f();

         try {
            djo $$2 = $$0.j();
            if ($$2.g() != djo.a.b) {
               if (this.i($$1)) {
                  return false;
               }

               if ($$2 == djo.c && $$0.g().values().stream().noneMatch(dxu::b)) {
                  return false;
               }
            }

            this.q.ae().d("chunkSave");
            sd $$3 = dkk.a(this.q, $$0);
            this.a($$1, $$3);
            this.a($$1, $$2.g());
            return true;
         } catch (Exception var5) {
            i.error("Failed to save chunk {},{}", new Object[]{$$1.e, $$1.f, var5});
            return false;
         }
      }
   }

   private boolean i(crm $$0) {
      byte $$1 = this.L.get($$0.a());
      if ($$1 != 0) {
         return $$1 == 1;
      } else {
         sd $$2;
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

         djo.a $$5 = dkk.a($$2);
         return this.a($$0, $$5) == 1;
      }
   }

   protected void a(int $$0) {
      int $$1 = atq.a($$0, 2, 32);
      if ($$1 != this.O) {
         this.O = $$1;
         this.F.a(this.O);

         for (amj $$2 : this.J.a()) {
            this.e($$2);
         }
      }
   }

   int b(amj $$0) {
      return atq.a($$0.E(), 2, this.O);
   }

   private void a(amj $$0, crm $$1) {
      dju $$2 = this.d($$1.a());
      if ($$2 != null) {
         a($$0, $$2);
      }
   }

   private static void a(amj $$0, dju $$1) {
      $$0.c.f.a($$1);
   }

   private static void b(amj $$0, crm $$1) {
      $$0.c.f.a($$0, $$1);
   }

   @Nullable
   public dju d(long $$0) {
      alq $$1 = this.b($$0);
      return $$1 == null ? null : $$1.f();
   }

   public int i() {
      return this.n.size();
   }

   public ama j() {
      return this.F;
   }

   protected Iterable<alq> k() {
      return Iterables.unmodifiableIterable(this.n.values());
   }

   void a(Writer $$0) throws IOException {
      asr $$1 = asr.a()
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
      amo $$2 = this.F.d();
      ObjectBidirectionalIterator var4 = this.n.long2ObjectEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<alq> $$3 = (Entry<alq>)var4.next();
         long $$4 = $$3.getLongKey();
         crm $$5 = new crm($$4);
         alq $$6 = (alq)$$3.getValue();
         Optional<djj> $$7 = Optional.ofNullable($$6.i());
         Optional<dju> $$8 = $$7.flatMap($$0x -> $$0x instanceof dju ? Optional.of((dju)$$0x) : Optional.empty());
         $$1.a(
            $$5.e,
            $$5.f,
            $$6.m(),
            $$7.isPresent(),
            $$7.map(djj::j).orElse(null),
            $$8.map(dju::D).orElse(null),
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

   private static String a(CompletableFuture<Either<dju, alq.a>> $$0) {
      try {
         Either<dju, alq.a> $$1 = $$0.getNow(null);
         return $$1 != null ? (String)$$1.map($$0x -> "done", $$0x -> "unloaded") : "not completed";
      } catch (CompletionException var2) {
         return "failed " + var2.getCause().getMessage();
      } catch (CancellationException var3) {
         return "cancelled";
      }
   }

   private CompletableFuture<Optional<sd>> j(crm $$0) {
      return this.e($$0).thenApplyAsync($$0x -> $$0x.map(this::c), ac.f());
   }

   private sd c(sd $$0) {
      return this.a(this.q.ad(), this.w, $$0, this.t.b());
   }

   boolean c(crm $$0) {
      if (!this.F.f($$0.a())) {
         return false;
      } else {
         for (amj $$1 : this.J.a()) {
            if (this.c($$1, $$0)) {
               return true;
            }
         }

         return false;
      }
   }

   public List<amj> d(crm $$0) {
      long $$1 = $$0.a();
      if (!this.F.f($$1)) {
         return List.of();
      } else {
         Builder<amj> $$2 = ImmutableList.builder();

         for (amj $$3 : this.J.a()) {
            if (this.c($$3, $$0)) {
               $$2.add($$3);
            }
         }

         return $$2.build();
      }
   }

   private boolean c(amj $$0, crm $$1) {
      if ($$0.P_()) {
         return false;
      } else {
         double $$2 = a($$1, $$0);
         return $$2 < 16384.0;
      }
   }

   private boolean c(amj $$0) {
      return $$0.P_() && !this.q.Y().b(csb.r);
   }

   void a(amj $$0, boolean $$1) {
      boolean $$2 = this.c($$0);
      boolean $$3 = this.J.d($$0);
      if ($$1) {
         this.J.a($$0, $$2);
         this.d($$0);
         if (!$$2) {
            this.F.a(iy.a($$0), $$0);
         }

         $$0.a(alw.a);
         this.e($$0);
      } else {
         iy $$4 = $$0.V();
         this.J.a($$0);
         if (!$$3) {
            this.F.b($$4, $$0);
         }

         this.a($$0, alw.a);
      }
   }

   private void d(amj $$0) {
      iy $$1 = iy.a($$0);
      $$0.a($$1);
   }

   public void a(amj $$0) {
      ObjectIterator $$2 = this.K.values().iterator();

      while ($$2.hasNext()) {
         als.b $$1 = (als.b)$$2.next();
         if ($$1.c == $$0) {
            $$1.a(this.q.w());
         } else {
            $$1.b($$0);
         }
      }

      iy $$2x = $$0.V();
      iy $$3 = iy.a($$0);
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

   private void e(amj $$0) {
      crm $$1 = $$0.dp();
      int $$2 = this.b($$0);
      if ($$0.W() instanceof alw.a $$3 && $$3.a().equals($$1) && $$3.b() == $$2) {
         return;
      }

      this.a($$0, alw.a($$1, $$2));
   }

   private void a(amj $$0, alw $$1) {
      if ($$0.dN() == this.q) {
         alw $$2 = $$0.W();
         if ($$1 instanceof alw.a $$3 && (!($$2 instanceof alw.a $$4) || !$$4.a().equals($$3.a()))) {
            $$0.c.b(new abe($$3.a().e, $$3.a().f));
         }

         alw.a($$2, $$1, $$1x -> this.a($$0, $$1x), $$1x -> b($$0, $$1x));
         $$0.a($$1);
      }
   }

   @Override
   public List<amj> a(crm $$0, boolean $$1) {
      Set<amj> $$2 = this.J.a();
      Builder<amj> $$3 = ImmutableList.builder();

      for (amj $$4 : $$2) {
         if ($$1 && this.b($$4, $$0.e, $$0.f) || !$$1 && this.a($$4, $$0.e, $$0.f)) {
            $$3.add($$4);
         }
      }

      return $$3.build();
   }

   protected void a(bkv $$0) {
      if (!($$0 instanceof bzk)) {
         bkz<?> $$1 = $$0.ai();
         int $$2 = $$1.o() * 16;
         if ($$2 != 0) {
            int $$3 = $$1.p();
            if (this.K.containsKey($$0.aj())) {
               throw (IllegalStateException)ac.b(new IllegalStateException("Entity is already tracked!"));
            } else {
               als.b $$4 = new als.b($$0, $$2, $$3, $$1.q());
               this.K.put($$0.aj(), $$4);
               $$4.a(this.q.w());
               if ($$0 instanceof amj $$5) {
                  this.a($$5, true);
                  ObjectIterator var7 = this.K.values().iterator();

                  while (var7.hasNext()) {
                     als.b $$6 = (als.b)var7.next();
                     if ($$6.c != $$5) {
                        $$6.b($$5);
                     }
                  }
               }
            }
         }
      }
   }

   protected void b(bkv $$0) {
      if ($$0 instanceof amj $$1) {
         this.a($$1, false);
         ObjectIterator var3 = this.K.values().iterator();

         while (var3.hasNext()) {
            als.b $$2 = (als.b)var3.next();
            $$2.a($$1);
         }
      }

      als.b $$3 = (als.b)this.K.remove($$0.aj());
      if ($$3 != null) {
         $$3.a();
      }
   }

   protected void l() {
      for (amj $$0 : this.J.a()) {
         this.e($$0);
      }

      List<amj> $$1 = Lists.newArrayList();
      List<amj> $$2 = this.q.w();
      ObjectIterator var3 = this.K.values().iterator();

      while (var3.hasNext()) {
         als.b $$3 = (als.b)var3.next();
         iy $$4 = $$3.e;
         iy $$5 = iy.a($$3.c);
         boolean $$6 = !Objects.equals($$4, $$5);
         if ($$6) {
            $$3.a($$2);
            bkv $$7 = $$3.c;
            if ($$7 instanceof amj) {
               $$1.add((amj)$$7);
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
            als.b $$8 = (als.b)var3.next();
            $$8.a($$1);
         }
      }
   }

   public void a(bkv $$0, wo<?> $$1) {
      als.b $$2 = (als.b)this.K.get($$0.aj());
      if ($$2 != null) {
         $$2.a($$1);
      }
   }

   protected void b(bkv $$0, wo<?> $$1) {
      als.b $$2 = (als.b)this.K.get($$0.aj());
      if ($$2 != null) {
         $$2.b($$1);
      }
   }

   public void a(List<djj> $$0) {
      Map<amj, List<dju>> $$1 = new HashMap<>();

      for (djj $$2 : $$0) {
         crm $$3 = $$2.f();
         dju $$5;
         if ($$2 instanceof dju $$4) {
            $$5 = $$4;
         } else {
            $$5 = this.q.d($$3.e, $$3.f);
         }

         for (amj $$7 : this.a($$3, false)) {
            $$1.computeIfAbsent($$7, $$0x -> new ArrayList<>()).add($$5);
         }
      }

      $$1.forEach(($$0x, $$1x) -> $$0x.c.b(yw.a($$1x)));
   }

   protected bwk m() {
      return this.x;
   }

   public String n() {
      return this.I;
   }

   void a(crm $$0, amb $$1) {
      this.E.onChunkStatusChange($$0, $$1);
   }

   public void a(crm $$0, int $$1) {
      int $$2 = $$1 + 1;
      crm.a($$0, $$2).forEach($$0x -> {
         alq $$1x = this.b($$0x.a());
         if ($$1x != null) {
            $$1x.a(this.r.a($$0x.e, $$0x.f));
         }
      });
   }

   class a extends ama {
      protected a(Executor $$0, Executor $$1) {
         super($$0, $$1);
      }

      @Override
      protected boolean a(long $$0) {
         return als.this.y.contains($$0);
      }

      @Nullable
      @Override
      protected alq b(long $$0) {
         return als.this.a($$0);
      }

      @Nullable
      @Override
      protected alq a(long $$0, int $$1, @Nullable alq $$2, int $$3) {
         return als.this.a($$0, $$1, $$2, $$3);
      }
   }

   class b {
      final amh b;
      final bkv c;
      private final int d;
      iy e;
      private final Set<ank> f = Sets.newIdentityHashSet();

      public b(bkv $$0, int $$1, int $$2, boolean $$3) {
         this.b = new amh(als.this.q, $$0, $$2, $$3, this::a);
         this.c = $$0;
         this.d = $$1;
         this.e = iy.a($$0);
      }

      @Override
      public boolean equals(Object $$0) {
         return $$0 instanceof als.b ? ((als.b)$$0).c.aj() == this.c.aj() : false;
      }

      @Override
      public int hashCode() {
         return this.c.aj();
      }

      public void a(wo<?> $$0) {
         for (ank $$1 : this.f) {
            $$1.b($$0);
         }
      }

      public void b(wo<?> $$0) {
         this.a($$0);
         if (this.c instanceof amj) {
            ((amj)this.c).c.b($$0);
         }
      }

      public void a() {
         for (ank $$0 : this.f) {
            this.b.a($$0.p());
         }
      }

      public void a(amj $$0) {
         if (this.f.remove($$0.c)) {
            this.b.a($$0);
         }
      }

      public void b(amj $$0) {
         if ($$0 != this.c) {
            ejz $$1 = $$0.dl().d(this.c.dl());
            int $$2 = als.this.b($$0);
            double $$3 = (double)Math.min(this.b(), $$2 * 16);
            double $$4 = $$1.c * $$1.c + $$1.e * $$1.e;
            double $$5 = $$3 * $$3;
            boolean $$6 = $$4 <= $$5 && this.c.a($$0) && als.this.a($$0, this.c.dp().e, this.c.dp().f);
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
         return als.this.q.n().b($$0);
      }

      private int b() {
         int $$0 = this.d;

         for (bkv $$1 : this.c.cU()) {
            int $$2 = $$1.ai().o() * 16;
            if ($$2 > $$0) {
               $$0 = $$2;
            }
         }

         return this.a($$0);
      }

      public void a(List<amj> $$0) {
         for (amj $$1 : $$0) {
            this.b($$1);
         }
      }
   }
}
