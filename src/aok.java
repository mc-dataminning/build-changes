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

public class aok extends dpc implements aoi.d {
   private static final byte f = -1;
   private static final byte g = 0;
   private static final byte h = 1;
   private static final Logger i = LogUtils.getLogger();
   private static final int j = 200;
   private static final int k = 20;
   private static final int l = 10000;
   public static final int a = 2;
   public static final int b = 32;
   public static final int c = aoj.a(aot.d);
   private final Long2ObjectLinkedOpenHashMap<aoi> m = new Long2ObjectLinkedOpenHashMap();
   private volatile Long2ObjectLinkedOpenHashMap<aoi> n = this.m.clone();
   private final Long2ObjectLinkedOpenHashMap<aoi> o = new Long2ObjectLinkedOpenHashMap();
   private final LongSet p = new LongOpenHashSet();
   final apa q;
   private final apd r;
   private final blb<Runnable> s;
   private dob t;
   private final dse u;
   private final doc v;
   private final Supplier<eji> w;
   private final caa x;
   final LongSet y = new LongOpenHashSet();
   private boolean z;
   private final aom A;
   private final bld<aom.a<Runnable>> B;
   private final bld<aom.a<Runnable>> C;
   private final apj D;
   private final dpx E;
   private final aok.a F;
   private final AtomicInteger G = new AtomicInteger();
   private final egh H;
   private final String I;
   private final aou J = new aou();
   private final Int2ObjectMap<aok.b> K = new Int2ObjectOpenHashMap();
   private final Long2ByteMap L = new Long2ByteOpenHashMap();
   private final Long2LongMap M = new Long2LongOpenHashMap();
   private final Queue<Runnable> N = Queues.newConcurrentLinkedQueue();
   private int O;

   public aok(
      apa $$0,
      ejo.c $$1,
      DataFixer $$2,
      egh $$3,
      Executor $$4,
      blb<Runnable> $$5,
      doo $$6,
      dob $$7,
      apj $$8,
      dpx $$9,
      Supplier<eji> $$10,
      int $$11,
      boolean $$12
   ) {
      super($$1.a($$0.ad()).resolve("region"), $$2, $$12);
      this.H = $$3;
      Path $$13 = $$1.a($$0.ad());
      this.I = $$13.getFileName().toString();
      this.q = $$0;
      this.t = $$7;
      iy $$14 = $$0.I_();
      long $$15 = $$0.C();
      if ($$7 instanceof drt $$16) {
         this.u = dse.a($$16.g().a(), $$14.b(ki.aC), $$15);
      } else {
         this.u = dse.a(drv.e(), $$14.b(ki.aC), $$15);
      }

      this.v = $$7.a($$14.b(ki.aG), this.u, $$15);
      this.s = $$5;
      ble<Runnable> $$17 = ble.a($$4, "worldgen");
      bld<Runnable> $$18 = bld.a("main", $$5::i);
      this.D = $$8;
      this.E = $$9;
      ble<Runnable> $$19 = ble.a($$4, "light");
      this.A = new aom(ImmutableList.of($$17, $$18, $$19), $$4, Integer.MAX_VALUE);
      this.B = this.A.a($$17, false);
      this.C = this.A.a($$18, false);
      this.r = new apd($$6, this, this.q.E_().g(), $$19, this.A.a($$19, false));
      this.F = new aok.a($$4, $$5);
      this.w = $$10;
      this.x = new caa($$13.resolve("poi"), $$2, $$12, $$14, $$0);
      this.a($$11);
   }

   protected dob a() {
      return this.t;
   }

   protected doc b() {
      return this.v;
   }

   protected dse c() {
      return this.u;
   }

   public void d() {
      DataResult<JsonElement> $$0 = dob.a.encodeStart(JsonOps.INSTANCE, this.t);
      DataResult<dob> $$1 = $$0.flatMap($$0x -> dob.a.parse(JsonOps.INSTANCE, $$0x));
      $$1.result().ifPresent($$0x -> this.t = $$0x);
   }

   private static double a(cvl $$0, bof $$1) {
      double $$2 = (double)jd.a($$0.e, 8);
      double $$3 = (double)jd.a($$0.f, 8);
      double $$4 = $$2 - $$1.do();
      double $$5 = $$3 - $$1.du();
      return $$4 * $$4 + $$5 * $$5;
   }

   boolean a(apb $$0, int $$1, int $$2) {
      return $$0.W().a($$1, $$2) && !$$0.d.f.a(cvl.c($$1, $$2));
   }

   private boolean b(apb $$0, int $$1, int $$2) {
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

   protected apd e() {
      return this.r;
   }

   @Nullable
   protected aoi a(long $$0) {
      return (aoi)this.m.get($$0);
   }

   @Nullable
   protected aoi b(long $$0) {
      return (aoi)this.n.get($$0);
   }

   protected IntSupplier c(long $$0) {
      return () -> {
         aoi $$1 = this.b($$0);
         return $$1 == null ? aol.a - 1 : Math.min($$1.n(), aol.a - 1);
      };
   }

   public String a(cvl $$0) {
      aoi $$1 = this.b($$0.a());
      if ($$1 == null) {
         return "null";
      } else {
         String $$2 = $$1.m() + "\n";
         dof $$3 = $$1.h();
         doa $$4 = $$1.i();
         if ($$3 != null) {
            $$2 = $$2 + "St: §" + $$3.c() + $$3 + "§r\n";
         }

         if ($$4 != null) {
            $$2 = $$2 + "Ch: §" + $$4.j().c() + $$4.j() + "§r\n";
         }

         aot $$5 = $$1.k();
         $$2 = $$2 + '§' + $$5.ordinal() + $$5;
         return $$2 + "§r";
      }
   }

   private CompletableFuture<Either<List<doa>, aoi.a>> a(aoi $$0, int $$1, IntFunction<dof> $$2) {
      if ($$1 == 0) {
         dof $$3 = $$2.apply(0);
         return $$0.a($$3, this).thenApply($$0x -> $$0x.mapLeft(List::of));
      } else {
         List<CompletableFuture<Either<doa, aoi.a>>> $$4 = new ArrayList<>();
         List<aoi> $$5 = new ArrayList<>();
         cvl $$6 = $$0.l();
         int $$7 = $$6.e;
         int $$8 = $$6.f;

         for (int $$9 = -$$1; $$9 <= $$1; $$9++) {
            for (int $$10 = -$$1; $$10 <= $$1; $$10++) {
               int $$11 = Math.max(Math.abs($$10), Math.abs($$9));
               final cvl $$12 = new cvl($$7 + $$10, $$8 + $$9);
               long $$13 = $$12.a();
               aoi $$14 = this.a($$13);
               if ($$14 == null) {
                  return CompletableFuture.completedFuture(Either.right(new aoi.a() {
                     @Override
                     public String toString() {
                        return "Unloaded " + $$12;
                     }
                  }));
               }

               dof $$15 = $$2.apply($$11);
               CompletableFuture<Either<doa, aoi.a>> $$16 = $$14.a($$15, this);
               $$5.add($$14);
               $$4.add($$16);
            }
         }

         CompletableFuture<List<Either<doa, aoi.a>>> $$17 = ac.d($$4);
         CompletableFuture<Either<List<doa>, aoi.a>> $$18 = $$17.thenApply($$3 -> {
            List<doa> $$4x = Lists.newArrayList();
            int $$5x = 0;

            for (final Either<doa, aoi.a> $$6x : $$3) {
               if ($$6x == null) {
                  throw this.a(new IllegalStateException("At least one of the chunk futures were null"), "n/a");
               }

               Optional<doa> $$7x = $$6x.left();
               if ($$7x.isEmpty()) {
                  final int $$8x = $$5x;
                  return Either.right(new aoi.a() {
                     @Override
                     public String toString() {
                        return "Unloaded " + new cvl($$7 + $$8x % ($$1 * 2 + 1), $$8 + $$8x / ($$1 * 2 + 1)) + " " + $$6x.right().get();
                     }
                  });
               }

               $$4x.add($$7x.get());
               $$5x++;
            }

            return Either.left($$4x);
         });

         for (aoi $$19 : $$5) {
            $$19.a("getChunkRangeFuture " + $$6 + " " + $$1, $$18);
         }

         return $$18;
      }
   }

   public y a(IllegalStateException $$0, String $$1) {
      StringBuilder $$2 = new StringBuilder();
      Consumer<aoi> $$3 = $$1x -> $$1x.q().forEach($$2x -> {
            dof $$3x = (dof)$$2x.getFirst();
            CompletableFuture<Either<doa, aoi.a>> $$4x = (CompletableFuture<Either<doa, aoi.a>>)$$2x.getSecond();
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

   public CompletableFuture<Either<dol, aoi.a>> a(aoi $$0) {
      return this.a($$0, 2, $$0x -> dof.n).thenApplyAsync($$0x -> $$0x.mapLeft($$0xx -> (dol)$$0xx.get($$0xx.size() / 2)), this.s);
   }

   @Nullable
   aoi a(long $$0, int $$1, @Nullable aoi $$2, int $$3) {
      if (!aoj.e($$3) && !aoj.e($$1)) {
         return $$2;
      } else {
         if ($$2 != null) {
            $$2.a($$1);
         }

         if ($$2 != null) {
            if (!aoj.e($$1)) {
               this.y.add($$0);
            } else {
               this.y.remove($$0);
            }
         }

         if (aoj.e($$1) && $$2 == null) {
            $$2 = (aoi)this.o.remove($$0);
            if ($$2 != null) {
               $$2.a($$1);
            } else {
               $$2 = new aoi(new cvl($$0), $$1, this.q, this.r, this.A, this);
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
         List<aoi> $$1 = this.n.values().stream().filter(aoi::o).peek(aoi::p).toList();
         MutableBoolean $$2 = new MutableBoolean();

         do {
            $$2.setFalse();
            $$1.stream().map($$0x -> {
               CompletableFuture<doa> $$1x;
               do {
                  $$1x = $$0x.j();
                  this.s.c($$1x::isDone);
               } while ($$1x != $$0x.j());

               return $$1x.join();
            }).filter($$0x -> $$0x instanceof dok || $$0x instanceof dol).filter(this::a).forEach($$1x -> $$2.setTrue());
         } while ($$2.isTrue());

         this.b((BooleanSupplier)(() -> true));
         this.o();
      } else {
         this.n.values().forEach(this::e);
      }
   }

   protected void a(BooleanSupplier $$0) {
      bjc $$1 = this.q.ae();
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
         aoi $$4 = (aoi)this.m.remove($$3);
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
      ObjectIterator<aoi> $$8 = this.n.values().iterator();

      while ($$7 < 20 && $$0.getAsBoolean() && $$8.hasNext()) {
         if (this.e((aoi)$$8.next())) {
            $$7++;
         }
      }
   }

   private void a(long $$0, aoi $$1) {
      CompletableFuture<doa> $$2 = $$1.j();
      $$2.thenAcceptAsync($$3 -> {
         CompletableFuture<doa> $$4 = $$1.j();
         if ($$4 != $$2) {
            this.a($$0, $$1);
         } else {
            if (this.o.remove($$0, $$1) && $$3 != null) {
               if ($$3 instanceof dol) {
                  ((dol)$$3).c(false);
               }

               this.a($$3);
               if (this.p.remove($$0) && $$3 instanceof dol $$5) {
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

   public CompletableFuture<Either<doa, aoi.a>> a(aoi $$0, dof $$1) {
      cvl $$2 = $$0.l();
      if ($$1 == dof.c) {
         return this.g($$2);
      } else {
         if ($$1 == dof.l) {
            this.F.a(apf.e, $$2, aoj.a(dof.l), $$2);
         }

         if (!$$1.f()) {
            Optional<doa> $$3 = $$0.a($$1.d(), this).getNow(aoi.a).left();
            if ($$3.isPresent() && $$3.get().j().b($$1)) {
               CompletableFuture<Either<doa, aoi.a>> $$4 = $$1.a(this.q, this.H, this.r, $$1x -> this.d($$0), $$3.get());
               this.D.a($$2, $$1);
               return $$4;
            }
         }

         return this.b($$0, $$1);
      }
   }

   private CompletableFuture<Either<doa, aoi.a>> g(cvl $$0) {
      return this.k($$0).thenApply($$1 -> $$1.filter($$1x -> {
            boolean $$2 = b($$1x);
            if (!$$2) {
               i.error("Chunk file at {} is missing level data, skipping", $$0);
            }

            return $$2;
         })).thenApplyAsync($$1 -> {
         this.q.ae().d("chunkLoad");
         if ($$1.isPresent()) {
            doa $$2 = dpb.a(this.q, this.x, $$0, $$1.get());
            this.a($$0, $$2.j().g());
            return Either.left($$2);
         } else {
            return Either.left(this.h($$0));
         }
      }, this.s).exceptionallyAsync($$1 -> this.a($$1, $$0), this.s);
   }

   private static boolean b(sy $$0) {
      return $$0.b("Status", 8);
   }

   private Either<doa, aoi.a> a(Throwable $$0, cvl $$1) {
      if ($$0 instanceof y $$2) {
         Throwable $$3 = $$2.getCause();
         if (!($$3 instanceof IOException)) {
            this.i($$1);
            throw $$2;
         }

         i.error("Couldn't load chunk {}", $$1, $$3);
      } else if ($$0 instanceof IOException) {
         i.error("Couldn't load chunk {}", $$1, $$0);
      }

      return Either.left(this.h($$1));
   }

   private doa h(cvl $$0) {
      this.i($$0);
      return new dov($$0, doy.a, this.q, this.q.I_().d(ki.au), null);
   }

   private void i(cvl $$0) {
      this.L.put($$0.a(), (byte)-1);
   }

   private byte a(cvl $$0, dof.a $$1) {
      return this.L.put($$0.a(), (byte)($$1 == dof.a.a ? -1 : 1));
   }

   private CompletableFuture<Either<doa, aoi.a>> b(aoi $$0, dof $$1) {
      cvl $$2 = $$0.l();
      CompletableFuture<Either<List<doa>, aoi.a>> $$3 = this.a($$0, $$1.e(), $$1x -> this.a($$1, $$1x));
      this.q.ae().c(() -> "chunkGenerate " + $$1);
      Executor $$4 = $$1x -> this.B.a(aom.a($$0, $$1x));
      return $$3.thenComposeAsync($$4x -> (CompletionStage<Either<doa, aoi.a>>)$$4x.map($$4xx -> {
            try {
               doa $$5 = (doa)$$4xx.get($$4xx.size() / 2);
               CompletableFuture<Either<doa, aoi.a>> $$6;
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
               $$10.a("Position hash", cvl.c($$2.e, $$2.f));
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

   protected void b(cvl $$0) {
      this.s.i(ac.a((Runnable)(() -> this.F.b(apf.e, $$0, aoj.a(dof.l), $$0)), (Supplier<String>)(() -> "release light ticket " + $$0)));
   }

   private dof a(dof $$0, int $$1) {
      dof $$2;
      if ($$1 == 0) {
         $$2 = $$0.d();
      } else {
         $$2 = dof.a(dof.a($$0) + $$1);
      }

      return $$2;
   }

   private static void a(apa $$0, List<sy> $$1) {
      if (!$$1.isEmpty()) {
         $$0.b(bol.a($$1, $$0));
      }
   }

   private CompletableFuture<Either<doa, aoi.a>> d(aoi $$0) {
      CompletableFuture<Either<doa, aoi.a>> $$1 = $$0.a(dof.n.d());
      return $$1.thenApplyAsync($$1x -> {
         dof $$2 = aoj.a($$0.m());
         return !$$2.b(dof.n) ? aoi.a : $$1x.mapLeft($$1xx -> {
            cvl $$2x = $$0.l();
            dov $$3 = (dov)$$1xx;
            dol $$4;
            if ($$3 instanceof dok) {
               $$4 = ((dok)$$3).C();
            } else {
               $$4 = new dol(this.q, $$3, $$1xxx -> a(this.q, $$3.E()));
               $$0.a(new dok($$4, false));
            }

            $$4.b(() -> aoj.b($$0.m()));
            $$4.E();
            if (this.p.add($$2x.a())) {
               $$4.c(true);
               $$4.J();
               $$4.a(this.q);
            }

            return $$4;
         });
      }, $$1x -> this.C.a(aom.a($$1x, $$0.l().a(), $$0::m)));
   }

   public CompletableFuture<Either<dol, aoi.a>> b(aoi $$0) {
      CompletableFuture<Either<List<doa>, aoi.a>> $$1 = this.a($$0, 1, $$0x -> dof.n);
      CompletableFuture<Either<dol, aoi.a>> $$2 = $$1.<Either>thenApplyAsync(
            $$0x -> $$0x.mapLeft($$0xx -> (dol)$$0xx.get($$0xx.size() / 2)), $$1x -> this.C.a(aom.a($$0, $$1x))
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

   private void a(dol $$0) {
      cvl $$1 = $$0.f();

      for (apb $$2 : this.J.a()) {
         if ($$2.W().a($$1)) {
            a($$2, $$0);
         }
      }
   }

   public CompletableFuture<Either<dol, aoi.a>> c(aoi $$0) {
      return this.a($$0, 1, dof::a).thenApplyAsync($$0x -> $$0x.mapLeft($$0xx -> (dol)$$0xx.get($$0xx.size() / 2)), $$1 -> this.C.a(aom.a($$0, $$1)));
   }

   public int h() {
      return this.G.get();
   }

   private boolean e(aoi $$0) {
      if (!$$0.o()) {
         return false;
      } else {
         doa $$1 = $$0.j().getNow(null);
         if (!($$1 instanceof dok) && !($$1 instanceof dol)) {
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

   private boolean a(doa $$0) {
      this.x.a($$0.f());
      if (!$$0.i()) {
         return false;
      } else {
         $$0.a(false);
         cvl $$1 = $$0.f();

         try {
            dof $$2 = $$0.j();
            if ($$2.g() != dof.a.b) {
               if (this.j($$1)) {
                  return false;
               }

               if ($$2 == dof.c && $$0.g().values().stream().noneMatch(eco::b)) {
                  return false;
               }
            }

            this.q.ae().d("chunkSave");
            sy $$3 = dpb.a(this.q, $$0);
            this.a($$1, $$3);
            this.a($$1, $$2.g());
            return true;
         } catch (Exception var5) {
            i.error("Failed to save chunk {},{}", new Object[]{$$1.e, $$1.f, var5});
            return false;
         }
      }
   }

   private boolean j(cvl $$0) {
      byte $$1 = this.L.get($$0.a());
      if ($$1 != 0) {
         return $$1 == 1;
      } else {
         sy $$2;
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

         dof.a $$5 = dpb.a($$2);
         return this.a($$0, $$5) == 1;
      }
   }

   protected void a(int $$0) {
      int $$1 = awm.a($$0, 2, 32);
      if ($$1 != this.O) {
         this.O = $$1;
         this.F.a(this.O);

         for (apb $$2 : this.J.a()) {
            this.e($$2);
         }
      }
   }

   int b(apb $$0) {
      return awm.a($$0.E(), 2, this.O);
   }

   private void a(apb $$0, cvl $$1) {
      dol $$2 = this.d($$1.a());
      if ($$2 != null) {
         a($$0, $$2);
      }
   }

   private static void a(apb $$0, dol $$1) {
      $$0.d.f.a($$1);
   }

   private static void b(apb $$0, cvl $$1) {
      $$0.d.f.a($$0, $$1);
   }

   @Nullable
   public dol d(long $$0) {
      aoi $$1 = this.b($$0);
      return $$1 == null ? null : $$1.f();
   }

   public int i() {
      return this.n.size();
   }

   public aos j() {
      return this.F;
   }

   protected Iterable<aoi> k() {
      return Iterables.unmodifiableIterable(this.n.values());
   }

   void a(Writer $$0) throws IOException {
      avm $$1 = avm.a()
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
      apg $$2 = this.F.d();
      ObjectBidirectionalIterator var4 = this.n.long2ObjectEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<aoi> $$3 = (Entry<aoi>)var4.next();
         long $$4 = $$3.getLongKey();
         cvl $$5 = new cvl($$4);
         aoi $$6 = (aoi)$$3.getValue();
         Optional<doa> $$7 = Optional.ofNullable($$6.i());
         Optional<dol> $$8 = $$7.flatMap($$0x -> $$0x instanceof dol ? Optional.of((dol)$$0x) : Optional.empty());
         $$1.a(
            $$5.e,
            $$5.f,
            $$6.m(),
            $$7.isPresent(),
            $$7.map(doa::j).orElse(null),
            $$8.map(dol::D).orElse(null),
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

   private static String a(CompletableFuture<Either<dol, aoi.a>> $$0) {
      try {
         Either<dol, aoi.a> $$1 = $$0.getNow(null);
         return $$1 != null ? (String)$$1.map($$0x -> "done", $$0x -> "unloaded") : "not completed";
      } catch (CompletionException var2) {
         return "failed " + var2.getCause().getMessage();
      } catch (CancellationException var3) {
         return "cancelled";
      }
   }

   private CompletableFuture<Optional<sy>> k(cvl $$0) {
      return this.e($$0).thenApplyAsync($$0x -> $$0x.map(this::c), ac.f());
   }

   private sy c(sy $$0) {
      return this.a(this.q.ad(), this.w, $$0, this.t.b());
   }

   boolean c(cvl $$0) {
      if (!this.F.f($$0.a())) {
         return false;
      } else {
         for (apb $$1 : this.J.a()) {
            if (this.c($$1, $$0)) {
               return true;
            }
         }

         return false;
      }
   }

   public List<apb> d(cvl $$0) {
      long $$1 = $$0.a();
      if (!this.F.f($$1)) {
         return List.of();
      } else {
         Builder<apb> $$2 = ImmutableList.builder();

         for (apb $$3 : this.J.a()) {
            if (this.c($$3, $$0)) {
               $$2.add($$3);
            }
         }

         return $$2.build();
      }
   }

   private boolean c(apb $$0, cvl $$1) {
      if ($$0.P_()) {
         return false;
      } else {
         double $$2 = a($$1, $$0);
         return $$2 < 16384.0;
      }
   }

   private boolean c(apb $$0) {
      return $$0.P_() && !this.q.Z().b(cwa.r);
   }

   void a(apb $$0, boolean $$1) {
      boolean $$2 = this.c($$0);
      boolean $$3 = this.J.d($$0);
      if ($$1) {
         this.J.a($$0, $$2);
         this.d($$0);
         if (!$$2) {
            this.F.a(jd.a($$0), $$0);
         }

         $$0.a(aoo.a);
         this.e($$0);
      } else {
         jd $$4 = $$0.V();
         this.J.a($$0);
         if (!$$3) {
            this.F.b($$4, $$0);
         }

         this.a($$0, aoo.a);
      }
   }

   private void d(apb $$0) {
      jd $$1 = jd.a($$0);
      $$0.a($$1);
   }

   public void a(apb $$0) {
      ObjectIterator $$2 = this.K.values().iterator();

      while ($$2.hasNext()) {
         aok.b $$1 = (aok.b)$$2.next();
         if ($$1.c == $$0) {
            $$1.a(this.q.x());
         } else {
            $$1.b($$0);
         }
      }

      jd $$2x = $$0.V();
      jd $$3 = jd.a($$0);
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

   private void e(apb $$0) {
      cvl $$1 = $$0.dl();
      int $$2 = this.b($$0);
      if ($$0.W() instanceof aoo.a $$3 && $$3.a().equals($$1) && $$3.b() == $$2) {
         return;
      }

      this.a($$0, aoo.a($$1, $$2));
   }

   private void a(apb $$0, aoo $$1) {
      if ($$0.dJ() == this.q) {
         aoo $$2 = $$0.W();
         if ($$1 instanceof aoo.a $$3 && (!($$2 instanceof aoo.a $$4) || !$$4.a().equals($$3.a()))) {
            $$0.d.b(new adi($$3.a().e, $$3.a().f));
         }

         aoo.a($$2, $$1, $$1x -> this.a($$0, $$1x), $$1x -> b($$0, $$1x));
         $$0.a($$1);
      }
   }

   @Override
   public List<apb> a(cvl $$0, boolean $$1) {
      Set<apb> $$2 = this.J.a();
      Builder<apb> $$3 = ImmutableList.builder();

      for (apb $$4 : $$2) {
         if ($$1 && this.b($$4, $$0.e, $$0.f) || !$$1 && this.a($$4, $$0.e, $$0.f)) {
            $$3.add($$4);
         }
      }

      return $$3.build();
   }

   protected void a(bof $$0) {
      if (!($$0 instanceof cdd)) {
         bol<?> $$1 = $$0.ai();
         int $$2 = $$1.o() * 16;
         if ($$2 != 0) {
            int $$3 = $$1.p();
            if (this.K.containsKey($$0.aj())) {
               throw (IllegalStateException)ac.b(new IllegalStateException("Entity is already tracked!"));
            } else {
               aok.b $$4 = new aok.b($$0, $$2, $$3, $$1.q());
               this.K.put($$0.aj(), $$4);
               $$4.a(this.q.x());
               if ($$0 instanceof apb $$5) {
                  this.a($$5, true);
                  ObjectIterator var7 = this.K.values().iterator();

                  while (var7.hasNext()) {
                     aok.b $$6 = (aok.b)var7.next();
                     if ($$6.c != $$5) {
                        $$6.b($$5);
                     }
                  }
               }
            }
         }
      }
   }

   protected void b(bof $$0) {
      if ($$0 instanceof apb $$1) {
         this.a($$1, false);
         ObjectIterator var3 = this.K.values().iterator();

         while (var3.hasNext()) {
            aok.b $$2 = (aok.b)var3.next();
            $$2.a($$1);
         }
      }

      aok.b $$3 = (aok.b)this.K.remove($$0.aj());
      if ($$3 != null) {
         $$3.a();
      }
   }

   protected void l() {
      for (apb $$0 : this.J.a()) {
         this.e($$0);
      }

      List<apb> $$1 = Lists.newArrayList();
      List<apb> $$2 = this.q.x();
      ObjectIterator var3 = this.K.values().iterator();

      while (var3.hasNext()) {
         aok.b $$3 = (aok.b)var3.next();
         jd $$4 = $$3.e;
         jd $$5 = jd.a($$3.c);
         boolean $$6 = !Objects.equals($$4, $$5);
         if ($$6) {
            $$3.a($$2);
            bof $$7 = $$3.c;
            if ($$7 instanceof apb) {
               $$1.add((apb)$$7);
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
            aok.b $$8 = (aok.b)var3.next();
            $$8.a($$1);
         }
      }
   }

   public void a(bof $$0, xz<?> $$1) {
      aok.b $$2 = (aok.b)this.K.get($$0.aj());
      if ($$2 != null) {
         $$2.a($$1);
      }
   }

   protected void b(bof $$0, xz<?> $$1) {
      aok.b $$2 = (aok.b)this.K.get($$0.aj());
      if ($$2 != null) {
         $$2.b($$1);
      }
   }

   public void a(List<doa> $$0) {
      Map<apb, List<dol>> $$1 = new HashMap<>();

      for (doa $$2 : $$0) {
         cvl $$3 = $$2.f();
         dol $$5;
         if ($$2 instanceof dol $$4) {
            $$5 = $$4;
         } else {
            $$5 = this.q.d($$3.e, $$3.f);
         }

         for (apb $$7 : this.a($$3, false)) {
            $$1.computeIfAbsent($$7, $$0x -> new ArrayList<>()).add($$5);
         }
      }

      $$1.forEach(($$0x, $$1x) -> $$0x.d.b(aay.a($$1x)));
   }

   protected caa m() {
      return this.x;
   }

   public String n() {
      return this.I;
   }

   void a(cvl $$0, aot $$1) {
      this.E.onChunkStatusChange($$0, $$1);
   }

   public void a(cvl $$0, int $$1) {
      int $$2 = $$1 + 1;
      cvl.a($$0, $$2).forEach($$0x -> {
         aoi $$1x = this.b($$0x.a());
         if ($$1x != null) {
            $$1x.a(this.r.a($$0x.e, $$0x.f));
         }
      });
   }

   class a extends aos {
      protected a(Executor $$0, Executor $$1) {
         super($$0, $$1);
      }

      @Override
      protected boolean a(long $$0) {
         return aok.this.y.contains($$0);
      }

      @Nullable
      @Override
      protected aoi b(long $$0) {
         return aok.this.a($$0);
      }

      @Nullable
      @Override
      protected aoi a(long $$0, int $$1, @Nullable aoi $$2, int $$3) {
         return aok.this.a($$0, $$1, $$2, $$3);
      }
   }

   class b {
      final aoz b;
      final bof c;
      private final int d;
      jd e;
      private final Set<aqc> f = Sets.newIdentityHashSet();

      public b(bof $$0, int $$1, int $$2, boolean $$3) {
         this.b = new aoz(aok.this.q, $$0, $$2, $$3, this::a);
         this.c = $$0;
         this.d = $$1;
         this.e = jd.a($$0);
      }

      @Override
      public boolean equals(Object $$0) {
         return $$0 instanceof aok.b ? ((aok.b)$$0).c.aj() == this.c.aj() : false;
      }

      @Override
      public int hashCode() {
         return this.c.aj();
      }

      public void a(xz<?> $$0) {
         for (aqc $$1 : this.f) {
            $$1.b($$0);
         }
      }

      public void b(xz<?> $$0) {
         this.a($$0);
         if (this.c instanceof apb) {
            ((apb)this.c).d.b($$0);
         }
      }

      public void a() {
         for (aqc $$0 : this.f) {
            this.b.a($$0.p());
         }
      }

      public void a(apb $$0) {
         if (this.f.remove($$0.d)) {
            this.b.a($$0);
         }
      }

      public void b(apb $$0) {
         if ($$0 != this.c) {
            eov $$1 = $$0.dh().d(this.c.dh());
            int $$2 = aok.this.b($$0);
            double $$3 = (double)Math.min(this.b(), $$2 * 16);
            double $$4 = $$1.c * $$1.c + $$1.e * $$1.e;
            double $$5 = $$3 * $$3;
            boolean $$6 = $$4 <= $$5 && this.c.a($$0) && aok.this.a($$0, this.c.dl().e, this.c.dl().f);
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
         return aok.this.q.o().b($$0);
      }

      private int b() {
         int $$0 = this.d;

         for (bof $$1 : this.c.cQ()) {
            int $$2 = $$1.ai().o() * 16;
            if ($$2 > $$0) {
               $$0 = $$2;
            }
         }

         return this.a($$0);
      }

      public void a(List<apb> $$0) {
         for (apb $$1 : $$0) {
            this.b($$1);
         }
      }
   }
}
