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

public class apt extends dvk implements apr.c {
   private static final byte f = -1;
   private static final byte g = 0;
   private static final byte h = 1;
   private static final Logger i = LogUtils.getLogger();
   private static final int j = 200;
   private static final int k = 20;
   private static final int l = 10000;
   public static final int a = 2;
   public static final int b = 32;
   public static final int c = aps.a(aqd.d);
   private final Long2ObjectLinkedOpenHashMap<apr> m = new Long2ObjectLinkedOpenHashMap();
   private volatile Long2ObjectLinkedOpenHashMap<apr> n = this.m.clone();
   private final Long2ObjectLinkedOpenHashMap<apr> o = new Long2ObjectLinkedOpenHashMap();
   private final LongSet p = new LongOpenHashSet();
   final aqk q;
   private final aqn r;
   private final bot<Runnable> s;
   private due t;
   private final dyn u;
   private final duf v;
   private final Supplier<epw> w;
   private final cec x;
   final LongSet y = new LongOpenHashSet();
   private boolean z;
   private final apw A;
   private final bov<apw.a<Runnable>> B;
   private final bov<apw.a<Runnable>> C;
   private final aqt D;
   private final dwg E;
   private final apt.a F;
   private final AtomicInteger G = new AtomicInteger();
   private final String H;
   private final aqe I = new aqe();
   private final Int2ObjectMap<apt.b> J = new Int2ObjectOpenHashMap();
   private final Long2ByteMap K = new Long2ByteOpenHashMap();
   private final Long2LongMap L = new Long2LongOpenHashMap();
   private final Queue<Runnable> M = Queues.newConcurrentLinkedQueue();
   private int N;
   private dvg O;

   public apt(
      aqk $$0,
      eqc.c $$1,
      DataFixer $$2,
      emr $$3,
      Executor $$4,
      bot<Runnable> $$5,
      duq $$6,
      due $$7,
      aqt $$8,
      dwg $$9,
      Supplier<epw> $$10,
      int $$11,
      boolean $$12
   ) {
      super(new dvt($$1.f(), $$0.af(), "chunk"), $$1.a($$0.af()).resolve("region"), $$2, $$12);
      Path $$13 = $$1.a($$0.af());
      this.H = $$13.getFileName().toString();
      this.q = $$0;
      this.t = $$7;
      jx $$14 = $$0.H_();
      long $$15 = $$0.C();
      if ($$7 instanceof dyc $$16) {
         this.u = dyn.a($$16.h().a(), $$14.b(lr.aO), $$15);
      } else {
         this.u = dyn.a(dye.e(), $$14.b(lr.aO), $$15);
      }

      this.v = $$7.a($$14.b(lr.aS), this.u, $$15);
      this.s = $$5;
      bow<Runnable> $$17 = bow.a($$4, "worldgen");
      bov<Runnable> $$18 = bov.a("main", $$5::i);
      this.D = $$8;
      this.E = $$9;
      bow<Runnable> $$19 = bow.a($$4, "light");
      this.A = new apw(ImmutableList.of($$17, $$18, $$19), $$4, Integer.MAX_VALUE);
      this.B = this.A.a($$17, false);
      this.C = this.A.a($$18, false);
      this.r = new aqn($$6, this, this.q.D_().g(), $$19, this.A.a($$19, false));
      this.F = new apt.a($$4, $$5);
      this.w = $$10;
      this.x = new cec(new dvt($$1.f(), $$0.af(), "poi"), $$13.resolve("poi"), $$2, $$12, $$14, $$0);
      this.a($$11);
      this.O = new dvg($$0, $$7, $$3, this.r);
   }

   protected due a() {
      return this.t;
   }

   protected duf b() {
      return this.v;
   }

   protected dyn c() {
      return this.u;
   }

   public void d() {
      DataResult<JsonElement> $$0 = due.a.encodeStart(JsonOps.INSTANCE, this.t);
      DataResult<due> $$1 = $$0.flatMap($$0x -> due.a.parse(JsonOps.INSTANCE, $$0x));
      $$1.ifSuccess($$0x -> {
         this.t = $$0x;
         this.O = new dvg(this.O.a(), $$0x, this.O.c(), this.O.d());
      });
   }

   private static double a(dbk $$0, bsd $$1) {
      double $$2 = (double)kc.a($$0.e, 8);
      double $$3 = (double)kc.a($$0.f, 8);
      double $$4 = $$2 - $$1.du();
      double $$5 = $$3 - $$1.dA();
      return $$4 * $$4 + $$5 * $$5;
   }

   boolean a(aql $$0, int $$1, int $$2) {
      return $$0.W().a($$1, $$2) && !$$0.c.g.a(dbk.c($$1, $$2));
   }

   private boolean b(aql $$0, int $$1, int $$2) {
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

   protected aqn e() {
      return this.r;
   }

   @Nullable
   protected apr a(long $$0) {
      return (apr)this.m.get($$0);
   }

   @Nullable
   protected apr b(long $$0) {
      return (apr)this.n.get($$0);
   }

   protected IntSupplier c(long $$0) {
      return () -> {
         apr $$1 = this.b($$0);
         return $$1 == null ? apv.a - 1 : Math.min($$1.m(), apv.a - 1);
      };
   }

   public String a(dbk $$0) {
      apr $$1 = this.b($$0.a());
      if ($$1 == null) {
         return "null";
      } else {
         String $$2 = $$1.l() + "\n";
         dvc $$3 = $$1.g();
         dud $$4 = $$1.h();
         if ($$3 != null) {
            $$2 = $$2 + "St: §" + $$3.c() + $$3 + "§r\n";
         }

         if ($$4 != null) {
            $$2 = $$2 + "Ch: §" + $$4.j().c() + $$4.j() + "§r\n";
         }

         aqd $$5 = $$1.j();
         $$2 = $$2 + '§' + $$5.ordinal() + $$5;
         return $$2 + "§r";
      }
   }

   private CompletableFuture<apu<List<dud>>> a(apr $$0, int $$1, IntFunction<dvc> $$2) {
      if ($$1 == 0) {
         dvc $$3 = $$2.apply(0);
         return $$0.a($$3, this).thenApply($$0x -> $$0x.a(List::of));
      } else {
         List<CompletableFuture<apu<dud>>> $$4 = new ArrayList<>();
         List<apr> $$5 = new ArrayList<>();
         dbk $$6 = $$0.k();
         int $$7 = $$6.e;
         int $$8 = $$6.f;

         for (int $$9 = -$$1; $$9 <= $$1; $$9++) {
            for (int $$10 = -$$1; $$10 <= $$1; $$10++) {
               int $$11 = Math.max(Math.abs($$10), Math.abs($$9));
               dbk $$12 = new dbk($$7 + $$10, $$8 + $$9);
               long $$13 = $$12.a();
               apr $$14 = this.a($$13);
               if ($$14 == null) {
                  return CompletableFuture.completedFuture(apu.a(() -> "Unloaded " + $$12));
               }

               dvc $$15 = $$2.apply($$11);
               CompletableFuture<apu<dud>> $$16 = $$14.a($$15, this);
               $$5.add($$14);
               $$4.add($$16);
            }
         }

         CompletableFuture<List<apu<dud>>> $$17 = ac.d($$4);
         CompletableFuture<apu<List<dud>>> $$18 = $$17.thenApply($$3 -> {
            List<dud> $$4x = Lists.newArrayList();
            int $$5x = 0;

            for (apu<dud> $$6x : $$3) {
               if ($$6x == null) {
                  throw this.a(new IllegalStateException("At least one of the chunk futures were null"), "n/a");
               }

               dud $$7x = $$6x.b(null);
               if ($$7x == null) {
                  int $$8x = $$5x;
                  return apu.a(() -> "Unloaded " + new dbk($$7 + $$8x % ($$1 * 2 + 1), $$8 + $$8x / ($$1 * 2 + 1)) + " " + $$6x.b());
               }

               $$4x.add($$7x);
               $$5x++;
            }

            return apu.a($$4x);
         });

         for (apr $$19 : $$5) {
            $$19.a("getChunkRangeFuture " + $$6 + " " + $$1, $$18);
         }

         return $$18;
      }
   }

   public y a(IllegalStateException $$0, String $$1) {
      StringBuilder $$2 = new StringBuilder();
      Consumer<apr> $$3 = $$1x -> $$1x.p().forEach($$2x -> {
            dvc $$3x = (dvc)$$2x.getFirst();
            CompletableFuture<apu<dud>> $$4x = (CompletableFuture<apu<dud>>)$$2x.getSecond();
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

   public CompletableFuture<apu<dun>> a(apr $$0) {
      return this.a($$0, 2, $$0x -> dvc.n).thenApplyAsync($$0x -> $$0x.a($$0xx -> (dun)$$0xx.get($$0xx.size() / 2)), this.s);
   }

   @Nullable
   apr a(long $$0, int $$1, @Nullable apr $$2, int $$3) {
      if (!aps.e($$3) && !aps.e($$1)) {
         return $$2;
      } else {
         if ($$2 != null) {
            $$2.a($$1);
         }

         if ($$2 != null) {
            if (!aps.e($$1)) {
               this.y.add($$0);
            } else {
               this.y.remove($$0);
            }
         }

         if (aps.e($$1) && $$2 == null) {
            $$2 = (apr)this.o.remove($$0);
            if ($$2 != null) {
               $$2.a($$1);
            } else {
               $$2 = new apr(new dbk($$0), $$1, this.q, this.r, this.A, this);
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
         List<apr> $$1 = this.n.values().stream().filter(apr::n).peek(apr::o).toList();
         MutableBoolean $$2 = new MutableBoolean();

         do {
            $$2.setFalse();
            $$1.stream().map($$0x -> {
               CompletableFuture<dud> $$1x;
               do {
                  $$1x = $$0x.i();
                  this.s.c($$1x::isDone);
               } while ($$1x != $$0x.i());

               return $$1x.join();
            }).filter($$0x -> $$0x instanceof dum || $$0x instanceof dun).filter(this::a).forEach($$1x -> $$2.setTrue());
         } while ($$2.isTrue());

         this.b(() -> true);
         this.o();
      } else {
         this.n.values().forEach(this::d);
      }
   }

   protected void a(BooleanSupplier $$0) {
      bmr $$1 = this.q.ag();
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
         apr $$4 = (apr)this.m.remove($$3);
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
      ObjectIterator<apr> $$8 = this.n.values().iterator();

      while ($$7 < 20 && $$0.getAsBoolean() && $$8.hasNext()) {
         if (this.d((apr)$$8.next())) {
            $$7++;
         }
      }
   }

   private void a(long $$0, apr $$1) {
      CompletableFuture<dud> $$2 = $$1.i();
      $$2.thenAcceptAsync($$3 -> {
         CompletableFuture<dud> $$4 = $$1.i();
         if ($$4 != $$2) {
            this.a($$0, $$1);
         } else {
            if (this.o.remove($$0, $$1) && $$3 != null) {
               if ($$3 instanceof dun) {
                  ((dun)$$3).c(false);
               }

               this.a($$3);
               if (this.p.remove($$0) && $$3 instanceof dun $$5) {
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

   public CompletableFuture<apu<dud>> a(apr $$0, dvc $$1) {
      dbk $$2 = $$0.k();
      if ($$1 == dvc.c) {
         return this.g($$2).thenApply(apu::a);
      } else {
         if ($$1 == dvc.l) {
            this.F.a(aqp.e, $$2, aps.a(dvc.l), $$2);
         }

         if (!$$1.f()) {
            dud $$3 = $$0.a($$1.d(), this).getNow(apr.a).b(null);
            if ($$3 != null && $$3.j().b($$1)) {
               CompletableFuture<dud> $$4 = $$1.a(this.O, $$1x -> this.a($$0, $$1x), $$3);
               this.D.a($$2, $$1);
               return $$4.thenApply(apu::a);
            }
         }

         return this.b($$0, $$1);
      }
   }

   private CompletableFuture<dud> g(dbk $$0) {
      return this.k($$0).thenApply($$1 -> $$1.filter($$1x -> {
            boolean $$2 = b($$1x);
            if (!$$2) {
               i.error("Chunk file at {} is missing level data, skipping", $$0);
            }

            return $$2;
         })).thenApplyAsync($$1 -> {
         this.q.ag().d("chunkLoad");
         if ($$1.isPresent()) {
            dud $$2 = dvj.a(this.q, this.x, $$0, $$1.get());
            this.a($$0, $$2.j().g());
            return $$2;
         } else {
            return this.h($$0);
         }
      }, this.s).exceptionallyAsync($$1 -> this.a($$1, $$0), this.s);
   }

   private static boolean b(tx $$0) {
      return $$0.b("Status", 8);
   }

   private dud a(Throwable $$0, dbk $$1) {
      Throwable $$3 = $$0 instanceof CompletionException $$2 ? $$2.getCause() : $$0;
      Throwable $$5 = $$3 instanceof y $$4 ? $$4.getCause() : $$3;
      boolean $$6 = $$5 instanceof Error;
      boolean $$7 = $$5 instanceof IOException || $$5 instanceof ui;
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

   private dud h(dbk $$0) {
      this.i($$0);
      return new dux($$0, dva.a, this.q, this.q.H_().d(lr.aE), null);
   }

   private void i(dbk $$0) {
      this.K.put($$0.a(), (byte)-1);
   }

   private byte a(dbk $$0, dve $$1) {
      return this.K.put($$0.a(), (byte)($$1 == dve.a ? -1 : 1));
   }

   private CompletableFuture<apu<dud>> b(apr $$0, dvc $$1) {
      dbk $$2 = $$0.k();
      CompletableFuture<apu<List<dud>>> $$3 = this.a($$0, $$1.e(), $$1x -> this.a($$1, $$1x));
      this.q.ag().c(() -> "chunkGenerate " + $$1);
      Executor $$4 = $$1x -> this.B.a(apw.a($$0, $$1x));
      return $$3.thenComposeAsync($$4x -> {
         List<dud> $$5 = (List<dud>)$$4x.b(null);
         if ($$5 == null) {
            this.b($$2);
            return CompletableFuture.completedFuture(apu.a($$4x::b));
         } else {
            try {
               dud $$6 = $$5.get($$5.size() / 2);
               CompletableFuture<dud> $$7;
               if ($$6.j().b($$1)) {
                  $$7 = $$1.a(this.O, $$1xx -> this.a($$0, $$1xx), $$6);
               } else {
                  $$7 = $$1.a(this.O, $$4, $$1xx -> this.a($$0, $$1xx), $$5);
               }

               this.D.a($$2, $$1);
               return $$7.thenApply(apu::a);
            } catch (Exception var10) {
               var10.getStackTrace();
               o $$10 = o.a(var10, "Exception generating new chunk");
               p $$11 = $$10.a("Chunk to be generated");
               $$11.a("Status being generated", () -> lq.l.b($$1).toString());
               $$11.a("Location", String.format(Locale.ROOT, "%d,%d", $$2.e, $$2.f));
               $$11.a("Position hash", dbk.c($$2.e, $$2.f));
               $$11.a("Generator", this.t);
               this.s.execute(() -> {
                  throw new y($$10);
               });
               throw new y($$10);
            }
         }
      }, $$4);
   }

   protected void b(dbk $$0) {
      this.s.i(ac.a((Runnable)(() -> this.F.b(aqp.e, $$0, aps.a(dvc.l), $$0)), (Supplier<String>)(() -> "release light ticket " + $$0)));
   }

   private dvc a(dvc $$0, int $$1) {
      dvc $$2;
      if ($$1 == 0) {
         $$2 = $$0.d();
      } else {
         $$2 = dvc.a(dvc.a($$0) + $$1);
      }

      return $$2;
   }

   private static void a(aqk $$0, List<tx> $$1) {
      if (!$$1.isEmpty()) {
         $$0.b(bsj.a($$1, $$0));
      }
   }

   private CompletableFuture<dud> a(apr $$0, dud $$1) {
      return CompletableFuture.supplyAsync(() -> {
         dbk $$2 = $$0.k();
         dux $$3 = (dux)$$1;
         dun $$4;
         if ($$3 instanceof dum) {
            $$4 = ((dum)$$3).C();
         } else {
            $$4 = new dun(this.q, $$3, $$1xx -> a(this.q, $$3.E()));
            $$0.a(new dum($$4, false));
         }

         $$4.b(() -> aps.b($$0.l()));
         $$4.E();
         if (this.p.add($$2.a())) {
            $$4.c(true);
            $$4.J();
            $$4.a(this.q);
         }

         return $$4;
      }, $$1x -> this.C.a(apw.a($$1x, $$0.k().a(), $$0::l)));
   }

   public CompletableFuture<apu<dun>> b(apr $$0) {
      CompletableFuture<apu<List<dud>>> $$1 = this.a($$0, 1, $$0x -> dvc.n);
      CompletableFuture<apu<dun>> $$2 = $$1.<apu<dun>>thenApplyAsync(
            $$0x -> $$0x.a($$0xx -> (dun)$$0xx.get($$0xx.size() / 2)), $$1x -> this.C.a(apw.a($$0, $$1x))
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

   private void a(dun $$0) {
      dbk $$1 = $$0.f();

      for (aql $$2 : this.I.a()) {
         if ($$2.W().a($$1)) {
            a($$2, $$0);
         }
      }
   }

   public CompletableFuture<apu<dun>> c(apr $$0) {
      return this.a($$0, 1, dvc::a).thenApplyAsync($$0x -> $$0x.a($$0xx -> (dun)$$0xx.get($$0xx.size() / 2)), $$1 -> this.C.a(apw.a($$0, $$1)));
   }

   public int h() {
      return this.G.get();
   }

   private boolean d(apr $$0) {
      if (!$$0.n()) {
         return false;
      } else {
         dud $$1 = $$0.i().getNow(null);
         if (!($$1 instanceof dum) && !($$1 instanceof dun)) {
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

   private boolean a(dud $$0) {
      this.x.a($$0.f());
      if (!$$0.i()) {
         return false;
      } else {
         $$0.a(false);
         dbk $$1 = $$0.f();

         try {
            dvc $$2 = $$0.j();
            if ($$2.g() != dve.b) {
               if (this.j($$1)) {
                  return false;
               }

               if ($$2 == dvc.c && $$0.g().values().stream().noneMatch(eiy::b)) {
                  return false;
               }
            }

            this.q.ag().d("chunkSave");
            tx $$3 = dvj.a(this.q, $$0);
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

   private boolean j(dbk $$0) {
      byte $$1 = this.K.get($$0.a());
      if ($$1 != 0) {
         return $$1 == 1;
      } else {
         tx $$2;
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

         dve $$5 = dvj.a($$2);
         return this.a($$0, $$5) == 1;
      }
   }

   protected void a(int $$0) {
      int $$1 = aye.a($$0, 2, 32);
      if ($$1 != this.N) {
         this.N = $$1;
         this.F.a(this.N);

         for (aql $$2 : this.I.a()) {
            this.e($$2);
         }
      }
   }

   int b(aql $$0) {
      return aye.a($$0.E(), 2, this.N);
   }

   private void a(aql $$0, dbk $$1) {
      dun $$2 = this.d($$1.a());
      if ($$2 != null) {
         a($$0, $$2);
      }
   }

   private static void a(aql $$0, dun $$1) {
      $$0.c.g.a($$1);
   }

   private static void b(aql $$0, dbk $$1) {
      $$0.c.g.a($$0, $$1);
   }

   @Nullable
   public dun d(long $$0) {
      apr $$1 = this.b($$0);
      return $$1 == null ? null : $$1.f();
   }

   public int i() {
      return this.n.size();
   }

   public aqc j() {
      return this.F;
   }

   protected Iterable<apr> k() {
      return Iterables.unmodifiableIterable(this.n.values());
   }

   void a(Writer $$0) throws IOException {
      axd $$1 = axd.a()
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
      aqq $$2 = this.F.d();
      ObjectBidirectionalIterator var4 = this.n.long2ObjectEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<apr> $$3 = (Entry<apr>)var4.next();
         long $$4 = $$3.getLongKey();
         dbk $$5 = new dbk($$4);
         apr $$6 = (apr)$$3.getValue();
         Optional<dud> $$7 = Optional.ofNullable($$6.h());
         Optional<dun> $$8 = $$7.flatMap($$0x -> $$0x instanceof dun ? Optional.of((dun)$$0x) : Optional.empty());
         $$1.a(
            $$5.e,
            $$5.f,
            $$6.l(),
            $$7.isPresent(),
            $$7.map(dud::j).orElse(null),
            $$8.map(dun::D).orElse(null),
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

   private static String a(CompletableFuture<apu<dun>> $$0) {
      try {
         apu<dun> $$1 = $$0.getNow(null);
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

   private CompletableFuture<Optional<tx>> k(dbk $$0) {
      return this.e($$0).thenApplyAsync($$0x -> $$0x.map(this::c), ac.g());
   }

   private tx c(tx $$0) {
      return this.a(this.q.af(), this.w, $$0, this.t.c());
   }

   boolean c(dbk $$0) {
      if (!this.F.f($$0.a())) {
         return false;
      } else {
         for (aql $$1 : this.I.a()) {
            if (this.c($$1, $$0)) {
               return true;
            }
         }

         return false;
      }
   }

   public List<aql> d(dbk $$0) {
      long $$1 = $$0.a();
      if (!this.F.f($$1)) {
         return List.of();
      } else {
         Builder<aql> $$2 = ImmutableList.builder();

         for (aql $$3 : this.I.a()) {
            if (this.c($$3, $$0)) {
               $$2.add($$3);
            }
         }

         return $$2.build();
      }
   }

   private boolean c(aql $$0, dbk $$1) {
      if ($$0.N_()) {
         return false;
      } else {
         double $$2 = a($$1, $$0);
         return $$2 < 16384.0;
      }
   }

   private boolean c(aql $$0) {
      return $$0.N_() && !this.q.ab().b(dbz.r);
   }

   void a(aql $$0, boolean $$1) {
      boolean $$2 = this.c($$0);
      boolean $$3 = this.I.d($$0);
      if ($$1) {
         this.I.a($$0, $$2);
         this.d($$0);
         if (!$$2) {
            this.F.a(kc.a($$0), $$0);
         }

         $$0.a(apy.a);
         this.e($$0);
      } else {
         kc $$4 = $$0.V();
         this.I.a($$0);
         if (!$$3) {
            this.F.b($$4, $$0);
         }

         this.a($$0, apy.a);
      }
   }

   private void d(aql $$0) {
      kc $$1 = kc.a($$0);
      $$0.a($$1);
   }

   public void a(aql $$0) {
      ObjectIterator $$2 = this.J.values().iterator();

      while ($$2.hasNext()) {
         apt.b $$1 = (apt.b)$$2.next();
         if ($$1.c == $$0) {
            $$1.a(this.q.x());
         } else {
            $$1.b($$0);
         }
      }

      kc $$2x = $$0.V();
      kc $$3 = kc.a($$0);
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

   private void e(aql $$0) {
      dbk $$1 = $$0.dr();
      int $$2 = this.b($$0);
      if ($$0.W() instanceof apy.a $$3 && $$3.a().equals($$1) && $$3.b() == $$2) {
         return;
      }

      this.a($$0, apy.a($$1, $$2));
   }

   private void a(aql $$0, apy $$1) {
      if ($$0.dP() == this.q) {
         apy $$2 = $$0.W();
         if ($$1 instanceof apy.a $$3 && (!($$2 instanceof apy.a $$4) || !$$4.a().equals($$3.a()))) {
            $$0.c.b(new aeo($$3.a().e, $$3.a().f));
         }

         apy.a($$2, $$1, $$1x -> this.a($$0, $$1x), $$1x -> b($$0, $$1x));
         $$0.a($$1);
      }
   }

   @Override
   public List<aql> a(dbk $$0, boolean $$1) {
      Set<aql> $$2 = this.I.a();
      Builder<aql> $$3 = ImmutableList.builder();

      for (aql $$4 : $$2) {
         if ($$1 && this.b($$4, $$0.e, $$0.f) || !$$1 && this.a($$4, $$0.e, $$0.f)) {
            $$3.add($$4);
         }
      }

      return $$3.build();
   }

   protected void a(bsd $$0) {
      if (!($$0 instanceof chi)) {
         bsj<?> $$1 = $$0.ak();
         int $$2 = $$1.o() * 16;
         if ($$2 != 0) {
            int $$3 = $$1.p();
            if (this.J.containsKey($$0.al())) {
               throw (IllegalStateException)ac.b(new IllegalStateException("Entity is already tracked!"));
            } else {
               apt.b $$4 = new apt.b($$0, $$2, $$3, $$1.q());
               this.J.put($$0.al(), $$4);
               $$4.a(this.q.x());
               if ($$0 instanceof aql $$5) {
                  this.a($$5, true);
                  ObjectIterator var7 = this.J.values().iterator();

                  while (var7.hasNext()) {
                     apt.b $$6 = (apt.b)var7.next();
                     if ($$6.c != $$5) {
                        $$6.b($$5);
                     }
                  }
               }
            }
         }
      }
   }

   protected void b(bsd $$0) {
      if ($$0 instanceof aql $$1) {
         this.a($$1, false);
         ObjectIterator var3 = this.J.values().iterator();

         while (var3.hasNext()) {
            apt.b $$2 = (apt.b)var3.next();
            $$2.a($$1);
         }
      }

      apt.b $$3 = (apt.b)this.J.remove($$0.al());
      if ($$3 != null) {
         $$3.a();
      }
   }

   protected void l() {
      for (aql $$0 : this.I.a()) {
         this.e($$0);
      }

      List<aql> $$1 = Lists.newArrayList();
      List<aql> $$2 = this.q.x();
      ObjectIterator var3 = this.J.values().iterator();

      while (var3.hasNext()) {
         apt.b $$3 = (apt.b)var3.next();
         kc $$4 = $$3.e;
         kc $$5 = kc.a($$3.c);
         boolean $$6 = !Objects.equals($$4, $$5);
         if ($$6) {
            $$3.a($$2);
            bsd $$7 = $$3.c;
            if ($$7 instanceof aql) {
               $$1.add((aql)$$7);
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
            apt.b $$8 = (apt.b)var3.next();
            $$8.a($$1);
         }
      }
   }

   public void a(bsd $$0, zb<?> $$1) {
      apt.b $$2 = (apt.b)this.J.get($$0.al());
      if ($$2 != null) {
         $$2.a($$1);
      }
   }

   protected void b(bsd $$0, zb<?> $$1) {
      apt.b $$2 = (apt.b)this.J.get($$0.al());
      if ($$2 != null) {
         $$2.b($$1);
      }
   }

   public void a(List<dud> $$0) {
      Map<aql, List<dun>> $$1 = new HashMap<>();

      for (dud $$2 : $$0) {
         dbk $$3 = $$2.f();
         dun $$5;
         if ($$2 instanceof dun $$4) {
            $$5 = $$4;
         } else {
            $$5 = this.q.d($$3.e, $$3.f);
         }

         for (aql $$7 : this.a($$3, false)) {
            $$1.computeIfAbsent($$7, $$0x -> new ArrayList<>()).add($$5);
         }
      }

      $$1.forEach(($$0x, $$1x) -> $$0x.c.b(acd.a($$1x)));
   }

   protected cec m() {
      return this.x;
   }

   public String n() {
      return this.H;
   }

   void a(dbk $$0, aqd $$1) {
      this.E.onChunkStatusChange($$0, $$1);
   }

   public void a(dbk $$0, int $$1) {
      int $$2 = $$1 + 1;
      dbk.a($$0, $$2).forEach($$0x -> {
         apr $$1x = this.b($$0x.a());
         if ($$1x != null) {
            $$1x.a(this.r.a($$0x.e, $$0x.f));
         }
      });
   }

   class a extends aqc {
      protected a(final Executor $$0, final Executor $$1) {
         super($$0, $$1);
      }

      @Override
      protected boolean a(long $$0) {
         return apt.this.y.contains($$0);
      }

      @Nullable
      @Override
      protected apr b(long $$0) {
         return apt.this.a($$0);
      }

      @Nullable
      @Override
      protected apr a(long $$0, int $$1, @Nullable apr $$2, int $$3) {
         return apt.this.a($$0, $$1, $$2, $$3);
      }
   }

   class b {
      final aqj b;
      final bsd c;
      private final int d;
      kc e;
      private final Set<arn> f = Sets.newIdentityHashSet();

      public b(final bsd $$0, final int $$1, final int $$2, final boolean $$3) {
         this.b = new aqj(apt.this.q, $$0, $$2, $$3, this::a);
         this.c = $$0;
         this.d = $$1;
         this.e = kc.a($$0);
      }

      @Override
      public boolean equals(Object $$0) {
         return $$0 instanceof apt.b ? ((apt.b)$$0).c.al() == this.c.al() : false;
      }

      @Override
      public int hashCode() {
         return this.c.al();
      }

      public void a(zb<?> $$0) {
         for (arn $$1 : this.f) {
            $$1.b($$0);
         }
      }

      public void b(zb<?> $$0) {
         this.a($$0);
         if (this.c instanceof aql) {
            ((aql)this.c).c.b($$0);
         }
      }

      public void a() {
         for (arn $$0 : this.f) {
            this.b.a($$0.o());
         }
      }

      public void a(aql $$0) {
         if (this.f.remove($$0.c)) {
            this.b.a($$0);
         }
      }

      public void b(aql $$0) {
         if ($$0 != this.c) {
            evz $$1 = $$0.dn().d(this.c.dn());
            int $$2 = apt.this.b($$0);
            double $$3 = (double)Math.min(this.b(), $$2 * 16);
            double $$4 = $$1.c * $$1.c + $$1.e * $$1.e;
            double $$5 = $$3 * $$3;
            boolean $$6 = $$4 <= $$5 && this.c.a($$0) && apt.this.a($$0, this.c.dr().e, this.c.dr().f);
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
         return apt.this.q.o().b($$0);
      }

      private int b() {
         int $$0 = this.d;

         for (bsd $$1 : this.c.cW()) {
            int $$2 = $$1.ak().o() * 16;
            if ($$2 > $$0) {
               $$0 = $$2;
            }
         }

         return this.a($$0);
      }

      public void a(List<aql> $$0) {
         for (aql $$1 : $$0) {
            this.b($$1);
         }
      }
   }
}
