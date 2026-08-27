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

public class amo extends dmn implements amm.d {
   private static final byte f = -1;
   private static final byte g = 0;
   private static final byte h = 1;
   private static final Logger i = LogUtils.getLogger();
   private static final int j = 200;
   private static final int k = 20;
   private static final int l = 10000;
   public static final int a = 2;
   public static final int b = 32;
   public static final int c = amn.a(amx.d);
   private final Long2ObjectLinkedOpenHashMap<amm> m = new Long2ObjectLinkedOpenHashMap();
   private volatile Long2ObjectLinkedOpenHashMap<amm> n = this.m.clone();
   private final Long2ObjectLinkedOpenHashMap<amm> o = new Long2ObjectLinkedOpenHashMap();
   private final LongSet p = new LongOpenHashSet();
   final ane q;
   private final anh r;
   private final bis<Runnable> s;
   private dlm t;
   private final dpm u;
   private final dln v;
   private final Supplier<egp> w;
   private final bxq x;
   final LongSet y = new LongOpenHashSet();
   private boolean z;
   private final amq A;
   private final biu<amq.a<Runnable>> B;
   private final biu<amq.a<Runnable>> C;
   private final ann D;
   private final dnf E;
   private final amo.a F;
   private final AtomicInteger G = new AtomicInteger();
   private final edp H;
   private final String I;
   private final amy J = new amy();
   private final Int2ObjectMap<amo.b> K = new Int2ObjectOpenHashMap();
   private final Long2ByteMap L = new Long2ByteOpenHashMap();
   private final Long2LongMap M = new Long2LongOpenHashMap();
   private final Queue<Runnable> N = Queues.newConcurrentLinkedQueue();
   private int O;

   public amo(
      ane $$0,
      egv.c $$1,
      DataFixer $$2,
      edp $$3,
      Executor $$4,
      bis<Runnable> $$5,
      dlz $$6,
      dlm $$7,
      ann $$8,
      dnf $$9,
      Supplier<egp> $$10,
      int $$11,
      boolean $$12
   ) {
      super($$1.a($$0.ae()).resolve("region"), $$2, $$12);
      this.H = $$3;
      Path $$13 = $$1.a($$0.ae());
      this.I = $$13.getFileName().toString();
      this.q = $$0;
      this.t = $$7;
      iu $$14 = $$0.I_();
      long $$15 = $$0.C();
      if ($$7 instanceof dpb $$16) {
         this.u = dpm.a($$16.g().a(), $$14.b(ke.aB), $$15);
      } else {
         this.u = dpm.a(dpd.e(), $$14.b(ke.aB), $$15);
      }

      this.v = $$7.a($$14.b(ke.aF), this.u, $$15);
      this.s = $$5;
      biv<Runnable> $$17 = biv.a($$4, "worldgen");
      biu<Runnable> $$18 = biu.a("main", $$5::i);
      this.D = $$8;
      this.E = $$9;
      biv<Runnable> $$19 = biv.a($$4, "light");
      this.A = new amq(ImmutableList.of($$17, $$18, $$19), $$4, Integer.MAX_VALUE);
      this.B = this.A.a($$17, false);
      this.C = this.A.a($$18, false);
      this.r = new anh($$6, this, this.q.E_().g(), $$19, this.A.a($$19, false));
      this.F = new amo.a($$4, $$5);
      this.w = $$10;
      this.x = new bxq($$13.resolve("poi"), $$2, $$12, $$14, $$0);
      this.a($$11);
   }

   protected dlm a() {
      return this.t;
   }

   protected dln b() {
      return this.v;
   }

   protected dpm c() {
      return this.u;
   }

   public void d() {
      DataResult<JsonElement> $$0 = dlm.a.encodeStart(JsonOps.INSTANCE, this.t);
      DataResult<dlm> $$1 = $$0.flatMap($$0x -> dlm.a.parse(JsonOps.INSTANCE, $$0x));
      $$1.result().ifPresent($$0x -> this.t = $$0x);
   }

   private static double a(cte $$0, blw $$1) {
      double $$2 = (double)iz.a($$0.e, 8);
      double $$3 = (double)iz.a($$0.f, 8);
      double $$4 = $$2 - $$1.dq();
      double $$5 = $$3 - $$1.dw();
      return $$4 * $$4 + $$5 * $$5;
   }

   boolean a(anf $$0, int $$1, int $$2) {
      return $$0.W().a($$1, $$2) && !$$0.c.e.a(cte.c($$1, $$2));
   }

   private boolean b(anf $$0, int $$1, int $$2) {
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

   protected anh e() {
      return this.r;
   }

   @Nullable
   protected amm a(long $$0) {
      return (amm)this.m.get($$0);
   }

   @Nullable
   protected amm b(long $$0) {
      return (amm)this.n.get($$0);
   }

   protected IntSupplier c(long $$0) {
      return () -> {
         amm $$1 = this.b($$0);
         return $$1 == null ? amp.a - 1 : Math.min($$1.n(), amp.a - 1);
      };
   }

   public String a(cte $$0) {
      amm $$1 = this.b($$0.a());
      if ($$1 == null) {
         return "null";
      } else {
         String $$2 = $$1.m() + "\n";
         dlq $$3 = $$1.h();
         dll $$4 = $$1.i();
         if ($$3 != null) {
            $$2 = $$2 + "St: §" + $$3.c() + $$3 + "§r\n";
         }

         if ($$4 != null) {
            $$2 = $$2 + "Ch: §" + $$4.j().c() + $$4.j() + "§r\n";
         }

         amx $$5 = $$1.k();
         $$2 = $$2 + '§' + $$5.ordinal() + $$5;
         return $$2 + "§r";
      }
   }

   private CompletableFuture<Either<List<dll>, amm.a>> a(amm $$0, int $$1, IntFunction<dlq> $$2) {
      if ($$1 == 0) {
         dlq $$3 = $$2.apply(0);
         return $$0.a($$3, this).thenApply($$0x -> $$0x.mapLeft(List::of));
      } else {
         List<CompletableFuture<Either<dll, amm.a>>> $$4 = new ArrayList<>();
         List<amm> $$5 = new ArrayList<>();
         cte $$6 = $$0.l();
         int $$7 = $$6.e;
         int $$8 = $$6.f;

         for (int $$9 = -$$1; $$9 <= $$1; $$9++) {
            for (int $$10 = -$$1; $$10 <= $$1; $$10++) {
               int $$11 = Math.max(Math.abs($$10), Math.abs($$9));
               final cte $$12 = new cte($$7 + $$10, $$8 + $$9);
               long $$13 = $$12.a();
               amm $$14 = this.a($$13);
               if ($$14 == null) {
                  return CompletableFuture.completedFuture(Either.right(new amm.a() {
                     @Override
                     public String toString() {
                        return "Unloaded " + $$12;
                     }
                  }));
               }

               dlq $$15 = $$2.apply($$11);
               CompletableFuture<Either<dll, amm.a>> $$16 = $$14.a($$15, this);
               $$5.add($$14);
               $$4.add($$16);
            }
         }

         CompletableFuture<List<Either<dll, amm.a>>> $$17 = ac.b($$4);
         CompletableFuture<Either<List<dll>, amm.a>> $$18 = $$17.thenApply($$3 -> {
            List<dll> $$4x = Lists.newArrayList();
            int $$5x = 0;

            for (final Either<dll, amm.a> $$6x : $$3) {
               if ($$6x == null) {
                  throw this.a(new IllegalStateException("At least one of the chunk futures were null"), "n/a");
               }

               Optional<dll> $$7x = $$6x.left();
               if ($$7x.isEmpty()) {
                  final int $$8x = $$5x;
                  return Either.right(new amm.a() {
                     @Override
                     public String toString() {
                        return "Unloaded " + new cte($$7 + $$8x % ($$1 * 2 + 1), $$8 + $$8x / ($$1 * 2 + 1)) + " " + $$6x.right().get();
                     }
                  });
               }

               $$4x.add($$7x.get());
               $$5x++;
            }

            return Either.left($$4x);
         });

         for (amm $$19 : $$5) {
            $$19.a("getChunkRangeFuture " + $$6 + " " + $$1, $$18);
         }

         return $$18;
      }
   }

   public y a(IllegalStateException $$0, String $$1) {
      StringBuilder $$2 = new StringBuilder();
      Consumer<amm> $$3 = $$1x -> $$1x.q().forEach($$2x -> {
            dlq $$3x = (dlq)$$2x.getFirst();
            CompletableFuture<Either<dll, amm.a>> $$4x = (CompletableFuture<Either<dll, amm.a>>)$$2x.getSecond();
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

   public CompletableFuture<Either<dlw, amm.a>> a(amm $$0) {
      return this.a($$0, 2, $$0x -> dlq.n).thenApplyAsync($$0x -> $$0x.mapLeft($$0xx -> (dlw)$$0xx.get($$0xx.size() / 2)), this.s);
   }

   @Nullable
   amm a(long $$0, int $$1, @Nullable amm $$2, int $$3) {
      if (!amn.e($$3) && !amn.e($$1)) {
         return $$2;
      } else {
         if ($$2 != null) {
            $$2.a($$1);
         }

         if ($$2 != null) {
            if (!amn.e($$1)) {
               this.y.add($$0);
            } else {
               this.y.remove($$0);
            }
         }

         if (amn.e($$1) && $$2 == null) {
            $$2 = (amm)this.o.remove($$0);
            if ($$2 != null) {
               $$2.a($$1);
            } else {
               $$2 = new amm(new cte($$0), $$1, this.q, this.r, this.A, this);
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
         List<amm> $$1 = this.n.values().stream().filter(amm::o).peek(amm::p).toList();
         MutableBoolean $$2 = new MutableBoolean();

         do {
            $$2.setFalse();
            $$1.stream().map($$0x -> {
               CompletableFuture<dll> $$1x;
               do {
                  $$1x = $$0x.j();
                  this.s.c($$1x::isDone);
               } while ($$1x != $$0x.j());

               return $$1x.join();
            }).filter($$0x -> $$0x instanceof dlv || $$0x instanceof dlw).filter(this::a).forEach($$1x -> $$2.setTrue());
         } while ($$2.isTrue());

         this.b((BooleanSupplier)(() -> true));
         this.o();
      } else {
         this.n.values().forEach(this::e);
      }
   }

   protected void a(BooleanSupplier $$0) {
      bgt $$1 = this.q.af();
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
         amm $$4 = (amm)this.m.remove($$3);
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
      ObjectIterator<amm> $$8 = this.n.values().iterator();

      while ($$7 < 20 && $$0.getAsBoolean() && $$8.hasNext()) {
         if (this.e((amm)$$8.next())) {
            $$7++;
         }
      }
   }

   private void a(long $$0, amm $$1) {
      CompletableFuture<dll> $$2 = $$1.j();
      $$2.thenAcceptAsync($$3 -> {
         CompletableFuture<dll> $$4 = $$1.j();
         if ($$4 != $$2) {
            this.a($$0, $$1);
         } else {
            if (this.o.remove($$0, $$1) && $$3 != null) {
               if ($$3 instanceof dlw) {
                  ((dlw)$$3).c(false);
               }

               this.a($$3);
               if (this.p.remove($$0) && $$3 instanceof dlw $$5) {
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

   public CompletableFuture<Either<dll, amm.a>> a(amm $$0, dlq $$1) {
      cte $$2 = $$0.l();
      if ($$1 == dlq.c) {
         return this.f($$2);
      } else {
         if ($$1 == dlq.l) {
            this.F.a(anj.e, $$2, amn.a(dlq.l), $$2);
         }

         if (!$$1.f()) {
            Optional<dll> $$3 = $$0.a($$1.d(), this).getNow(amm.a).left();
            if ($$3.isPresent() && $$3.get().j().b($$1)) {
               CompletableFuture<Either<dll, amm.a>> $$4 = $$1.a(this.q, this.H, this.r, $$1x -> this.d($$0), $$3.get());
               this.D.a($$2, $$1);
               return $$4;
            }
         }

         return this.b($$0, $$1);
      }
   }

   private CompletableFuture<Either<dll, amm.a>> f(cte $$0) {
      return this.j($$0).thenApply($$1 -> $$1.filter($$1x -> {
            boolean $$2 = b($$1x);
            if (!$$2) {
               i.error("Chunk file at {} is missing level data, skipping", $$0);
            }

            return $$2;
         })).thenApplyAsync($$1 -> {
         this.q.af().d("chunkLoad");
         if ($$1.isPresent()) {
            dll $$2 = dmm.a(this.q, this.x, $$0, $$1.get());
            this.a($$0, $$2.j().g());
            return Either.left($$2);
         } else {
            return Either.left(this.g($$0));
         }
      }, this.s).exceptionallyAsync($$1 -> this.a($$1, $$0), this.s);
   }

   private static boolean b(so $$0) {
      return $$0.b("Status", 8);
   }

   private Either<dll, amm.a> a(Throwable $$0, cte $$1) {
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

   private dll g(cte $$0) {
      this.h($$0);
      return new dmg($$0, dmj.a, this.q, this.q.I_().d(ke.at), null);
   }

   private void h(cte $$0) {
      this.L.put($$0.a(), (byte)-1);
   }

   private byte a(cte $$0, dlq.a $$1) {
      return this.L.put($$0.a(), (byte)($$1 == dlq.a.a ? -1 : 1));
   }

   private CompletableFuture<Either<dll, amm.a>> b(amm $$0, dlq $$1) {
      cte $$2 = $$0.l();
      CompletableFuture<Either<List<dll>, amm.a>> $$3 = this.a($$0, $$1.e(), $$1x -> this.a($$1, $$1x));
      this.q.af().c(() -> "chunkGenerate " + $$1);
      Executor $$4 = $$1x -> this.B.a(amq.a($$0, $$1x));
      return $$3.thenComposeAsync($$4x -> (CompletionStage<Either<dll, amm.a>>)$$4x.map($$4xx -> {
            try {
               dll $$5 = (dll)$$4xx.get($$4xx.size() / 2);
               CompletableFuture<Either<dll, amm.a>> $$6;
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
               $$10.a("Position hash", cte.c($$2.e, $$2.f));
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

   protected void b(cte $$0) {
      this.s.i(ac.a((Runnable)(() -> this.F.b(anj.e, $$0, amn.a(dlq.l), $$0)), (Supplier<String>)(() -> "release light ticket " + $$0)));
   }

   private dlq a(dlq $$0, int $$1) {
      dlq $$2;
      if ($$1 == 0) {
         $$2 = $$0.d();
      } else {
         $$2 = dlq.a(dlq.a($$0) + $$1);
      }

      return $$2;
   }

   private static void a(ane $$0, List<so> $$1) {
      if (!$$1.isEmpty()) {
         $$0.b(bmc.a($$1, $$0));
      }
   }

   private CompletableFuture<Either<dll, amm.a>> d(amm $$0) {
      CompletableFuture<Either<dll, amm.a>> $$1 = $$0.a(dlq.n.d());
      return $$1.thenApplyAsync($$1x -> {
         dlq $$2 = amn.a($$0.m());
         return !$$2.b(dlq.n) ? amm.a : $$1x.mapLeft($$1xx -> {
            cte $$2x = $$0.l();
            dmg $$3 = (dmg)$$1xx;
            dlw $$4;
            if ($$3 instanceof dlv) {
               $$4 = ((dlv)$$3).C();
            } else {
               $$4 = new dlw(this.q, $$3, $$1xxx -> a(this.q, $$3.E()));
               $$0.a(new dlv($$4, false));
            }

            $$4.b(() -> amn.b($$0.m()));
            $$4.E();
            if (this.p.add($$2x.a())) {
               $$4.c(true);
               $$4.J();
               $$4.a(this.q);
            }

            return $$4;
         });
      }, $$1x -> this.C.a(amq.a($$1x, $$0.l().a(), $$0::m)));
   }

   public CompletableFuture<Either<dlw, amm.a>> b(amm $$0) {
      CompletableFuture<Either<List<dll>, amm.a>> $$1 = this.a($$0, 1, $$0x -> dlq.n);
      CompletableFuture<Either<dlw, amm.a>> $$2 = $$1.<Either>thenApplyAsync(
            $$0x -> $$0x.mapLeft($$0xx -> (dlw)$$0xx.get($$0xx.size() / 2)), $$1x -> this.C.a(amq.a($$0, $$1x))
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

   private void a(dlw $$0) {
      cte $$1 = $$0.f();

      for (anf $$2 : this.J.a()) {
         if ($$2.W().a($$1)) {
            a($$2, $$0);
         }
      }
   }

   public CompletableFuture<Either<dlw, amm.a>> c(amm $$0) {
      return this.a($$0, 1, dlq::a).thenApplyAsync($$0x -> $$0x.mapLeft($$0xx -> (dlw)$$0xx.get($$0xx.size() / 2)), $$1 -> this.C.a(amq.a($$0, $$1)));
   }

   public int h() {
      return this.G.get();
   }

   private boolean e(amm $$0) {
      if (!$$0.o()) {
         return false;
      } else {
         dll $$1 = $$0.j().getNow(null);
         if (!($$1 instanceof dlv) && !($$1 instanceof dlw)) {
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

   private boolean a(dll $$0) {
      this.x.a($$0.f());
      if (!$$0.i()) {
         return false;
      } else {
         $$0.a(false);
         cte $$1 = $$0.f();

         try {
            dlq $$2 = $$0.j();
            if ($$2.g() != dlq.a.b) {
               if (this.i($$1)) {
                  return false;
               }

               if ($$2 == dlq.c && $$0.g().values().stream().noneMatch(dzw::b)) {
                  return false;
               }
            }

            this.q.af().d("chunkSave");
            so $$3 = dmm.a(this.q, $$0);
            this.a($$1, $$3);
            this.a($$1, $$2.g());
            return true;
         } catch (Exception var5) {
            i.error("Failed to save chunk {},{}", new Object[]{$$1.e, $$1.f, var5});
            return false;
         }
      }
   }

   private boolean i(cte $$0) {
      byte $$1 = this.L.get($$0.a());
      if ($$1 != 0) {
         return $$1 == 1;
      } else {
         so $$2;
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

         dlq.a $$5 = dmm.a($$2);
         return this.a($$0, $$5) == 1;
      }
   }

   protected void a(int $$0) {
      int $$1 = aup.a($$0, 2, 32);
      if ($$1 != this.O) {
         this.O = $$1;
         this.F.a(this.O);

         for (anf $$2 : this.J.a()) {
            this.e($$2);
         }
      }
   }

   int b(anf $$0) {
      return aup.a($$0.E(), 2, this.O);
   }

   private void a(anf $$0, cte $$1) {
      dlw $$2 = this.d($$1.a());
      if ($$2 != null) {
         a($$0, $$2);
      }
   }

   private static void a(anf $$0, dlw $$1) {
      $$0.c.e.a($$1);
   }

   private static void b(anf $$0, cte $$1) {
      $$0.c.e.a($$0, $$1);
   }

   @Nullable
   public dlw d(long $$0) {
      amm $$1 = this.b($$0);
      return $$1 == null ? null : $$1.f();
   }

   public int i() {
      return this.n.size();
   }

   public amw j() {
      return this.F;
   }

   protected Iterable<amm> k() {
      return Iterables.unmodifiableIterable(this.n.values());
   }

   void a(Writer $$0) throws IOException {
      atp $$1 = atp.a()
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
      ank $$2 = this.F.d();
      ObjectBidirectionalIterator var4 = this.n.long2ObjectEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<amm> $$3 = (Entry<amm>)var4.next();
         long $$4 = $$3.getLongKey();
         cte $$5 = new cte($$4);
         amm $$6 = (amm)$$3.getValue();
         Optional<dll> $$7 = Optional.ofNullable($$6.i());
         Optional<dlw> $$8 = $$7.flatMap($$0x -> $$0x instanceof dlw ? Optional.of((dlw)$$0x) : Optional.empty());
         $$1.a(
            $$5.e,
            $$5.f,
            $$6.m(),
            $$7.isPresent(),
            $$7.map(dll::j).orElse(null),
            $$8.map(dlw::D).orElse(null),
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

   private static String a(CompletableFuture<Either<dlw, amm.a>> $$0) {
      try {
         Either<dlw, amm.a> $$1 = $$0.getNow(null);
         return $$1 != null ? (String)$$1.map($$0x -> "done", $$0x -> "unloaded") : "not completed";
      } catch (CompletionException var2) {
         return "failed " + var2.getCause().getMessage();
      } catch (CancellationException var3) {
         return "cancelled";
      }
   }

   private CompletableFuture<Optional<so>> j(cte $$0) {
      return this.e($$0).thenApplyAsync($$0x -> $$0x.map(this::c), ac.f());
   }

   private so c(so $$0) {
      return this.a(this.q.ae(), this.w, $$0, this.t.b());
   }

   boolean c(cte $$0) {
      if (!this.F.f($$0.a())) {
         return false;
      } else {
         for (anf $$1 : this.J.a()) {
            if (this.c($$1, $$0)) {
               return true;
            }
         }

         return false;
      }
   }

   public List<anf> d(cte $$0) {
      long $$1 = $$0.a();
      if (!this.F.f($$1)) {
         return List.of();
      } else {
         Builder<anf> $$2 = ImmutableList.builder();

         for (anf $$3 : this.J.a()) {
            if (this.c($$3, $$0)) {
               $$2.add($$3);
            }
         }

         return $$2.build();
      }
   }

   private boolean c(anf $$0, cte $$1) {
      if ($$0.P_()) {
         return false;
      } else {
         double $$2 = a($$1, $$0);
         return $$2 < 16384.0;
      }
   }

   private boolean c(anf $$0) {
      return $$0.P_() && !this.q.Z().b(ctt.r);
   }

   void a(anf $$0, boolean $$1) {
      boolean $$2 = this.c($$0);
      boolean $$3 = this.J.d($$0);
      if ($$1) {
         this.J.a($$0, $$2);
         this.d($$0);
         if (!$$2) {
            this.F.a(iz.a($$0), $$0);
         }

         $$0.a(ams.a);
         this.e($$0);
      } else {
         iz $$4 = $$0.V();
         this.J.a($$0);
         if (!$$3) {
            this.F.b($$4, $$0);
         }

         this.a($$0, ams.a);
      }
   }

   private void d(anf $$0) {
      iz $$1 = iz.a($$0);
      $$0.a($$1);
   }

   public void a(anf $$0) {
      ObjectIterator $$2 = this.K.values().iterator();

      while ($$2.hasNext()) {
         amo.b $$1 = (amo.b)$$2.next();
         if ($$1.c == $$0) {
            $$1.a(this.q.x());
         } else {
            $$1.b($$0);
         }
      }

      iz $$2x = $$0.V();
      iz $$3 = iz.a($$0);
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

   private void e(anf $$0) {
      cte $$1 = $$0.dn();
      int $$2 = this.b($$0);
      if ($$0.W() instanceof ams.a $$3 && $$3.a().equals($$1) && $$3.b() == $$2) {
         return;
      }

      this.a($$0, ams.a($$1, $$2));
   }

   private void a(anf $$0, ams $$1) {
      if ($$0.dL() == this.q) {
         ams $$2 = $$0.W();
         if ($$1 instanceof ams.a $$3 && (!($$2 instanceof ams.a $$4) || !$$4.a().equals($$3.a()))) {
            $$0.c.b(new abz($$3.a().e, $$3.a().f));
         }

         ams.a($$2, $$1, $$1x -> this.a($$0, $$1x), $$1x -> b($$0, $$1x));
         $$0.a($$1);
      }
   }

   @Override
   public List<anf> a(cte $$0, boolean $$1) {
      Set<anf> $$2 = this.J.a();
      Builder<anf> $$3 = ImmutableList.builder();

      for (anf $$4 : $$2) {
         if ($$1 && this.b($$4, $$0.e, $$0.f) || !$$1 && this.a($$4, $$0.e, $$0.f)) {
            $$3.add($$4);
         }
      }

      return $$3.build();
   }

   protected void a(blw $$0) {
      if (!($$0 instanceof cat)) {
         bmc<?> $$1 = $$0.ai();
         int $$2 = $$1.o() * 16;
         if ($$2 != 0) {
            int $$3 = $$1.p();
            if (this.K.containsKey($$0.aj())) {
               throw (IllegalStateException)ac.b(new IllegalStateException("Entity is already tracked!"));
            } else {
               amo.b $$4 = new amo.b($$0, $$2, $$3, $$1.q());
               this.K.put($$0.aj(), $$4);
               $$4.a(this.q.x());
               if ($$0 instanceof anf $$5) {
                  this.a($$5, true);
                  ObjectIterator var7 = this.K.values().iterator();

                  while (var7.hasNext()) {
                     amo.b $$6 = (amo.b)var7.next();
                     if ($$6.c != $$5) {
                        $$6.b($$5);
                     }
                  }
               }
            }
         }
      }
   }

   protected void b(blw $$0) {
      if ($$0 instanceof anf $$1) {
         this.a($$1, false);
         ObjectIterator var3 = this.K.values().iterator();

         while (var3.hasNext()) {
            amo.b $$2 = (amo.b)var3.next();
            $$2.a($$1);
         }
      }

      amo.b $$3 = (amo.b)this.K.remove($$0.aj());
      if ($$3 != null) {
         $$3.a();
      }
   }

   protected void l() {
      for (anf $$0 : this.J.a()) {
         this.e($$0);
      }

      List<anf> $$1 = Lists.newArrayList();
      List<anf> $$2 = this.q.x();
      ObjectIterator var3 = this.K.values().iterator();

      while (var3.hasNext()) {
         amo.b $$3 = (amo.b)var3.next();
         iz $$4 = $$3.e;
         iz $$5 = iz.a($$3.c);
         boolean $$6 = !Objects.equals($$4, $$5);
         if ($$6) {
            $$3.a($$2);
            blw $$7 = $$3.c;
            if ($$7 instanceof anf) {
               $$1.add((anf)$$7);
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
            amo.b $$8 = (amo.b)var3.next();
            $$8.a($$1);
         }
      }
   }

   public void a(blw $$0, xg<?> $$1) {
      amo.b $$2 = (amo.b)this.K.get($$0.aj());
      if ($$2 != null) {
         $$2.a($$1);
      }
   }

   protected void b(blw $$0, xg<?> $$1) {
      amo.b $$2 = (amo.b)this.K.get($$0.aj());
      if ($$2 != null) {
         $$2.b($$1);
      }
   }

   public void a(List<dll> $$0) {
      Map<anf, List<dlw>> $$1 = new HashMap<>();

      for (dll $$2 : $$0) {
         cte $$3 = $$2.f();
         dlw $$5;
         if ($$2 instanceof dlw $$4) {
            $$5 = $$4;
         } else {
            $$5 = this.q.d($$3.e, $$3.f);
         }

         for (anf $$7 : this.a($$3, false)) {
            $$1.computeIfAbsent($$7, $$0x -> new ArrayList<>()).add($$5);
         }
      }

      $$1.forEach(($$0x, $$1x) -> $$0x.c.b(zq.a($$1x)));
   }

   protected bxq m() {
      return this.x;
   }

   public String n() {
      return this.I;
   }

   void a(cte $$0, amx $$1) {
      this.E.onChunkStatusChange($$0, $$1);
   }

   public void a(cte $$0, int $$1) {
      int $$2 = $$1 + 1;
      cte.a($$0, $$2).forEach($$0x -> {
         amm $$1x = this.b($$0x.a());
         if ($$1x != null) {
            $$1x.a(this.r.a($$0x.e, $$0x.f));
         }
      });
   }

   class a extends amw {
      protected a(Executor $$0, Executor $$1) {
         super($$0, $$1);
      }

      @Override
      protected boolean a(long $$0) {
         return amo.this.y.contains($$0);
      }

      @Nullable
      @Override
      protected amm b(long $$0) {
         return amo.this.a($$0);
      }

      @Nullable
      @Override
      protected amm a(long $$0, int $$1, @Nullable amm $$2, int $$3) {
         return amo.this.a($$0, $$1, $$2, $$3);
      }
   }

   class b {
      final and b;
      final blw c;
      private final int d;
      iz e;
      private final Set<aog> f = Sets.newIdentityHashSet();

      public b(blw $$0, int $$1, int $$2, boolean $$3) {
         this.b = new and(amo.this.q, $$0, $$2, $$3, this::a);
         this.c = $$0;
         this.d = $$1;
         this.e = iz.a($$0);
      }

      @Override
      public boolean equals(Object $$0) {
         return $$0 instanceof amo.b ? ((amo.b)$$0).c.aj() == this.c.aj() : false;
      }

      @Override
      public int hashCode() {
         return this.c.aj();
      }

      public void a(xg<?> $$0) {
         for (aog $$1 : this.f) {
            $$1.b($$0);
         }
      }

      public void b(xg<?> $$0) {
         this.a($$0);
         if (this.c instanceof anf) {
            ((anf)this.c).c.b($$0);
         }
      }

      public void a() {
         for (aog $$0 : this.f) {
            this.b.a($$0.p());
         }
      }

      public void a(anf $$0) {
         if (this.f.remove($$0.c)) {
            this.b.a($$0);
         }
      }

      public void b(anf $$0) {
         if ($$0 != this.c) {
            emc $$1 = $$0.dj().d(this.c.dj());
            int $$2 = amo.this.b($$0);
            double $$3 = (double)Math.min(this.b(), $$2 * 16);
            double $$4 = $$1.c * $$1.c + $$1.e * $$1.e;
            double $$5 = $$3 * $$3;
            boolean $$6 = $$4 <= $$5 && this.c.a($$0) && amo.this.a($$0, this.c.dn().e, this.c.dn().f);
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
         return amo.this.q.o().b($$0);
      }

      private int b() {
         int $$0 = this.d;

         for (blw $$1 : this.c.cT()) {
            int $$2 = $$1.ai().o() * 16;
            if ($$2 > $$0) {
               $$0 = $$2;
            }
         }

         return this.a($$0);
      }

      public void a(List<anf> $$0) {
         for (anf $$1 : $$0) {
            this.b($$1);
         }
      }
   }
}
