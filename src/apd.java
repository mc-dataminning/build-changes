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

public class apd extends dsl implements apb.c {
   private static final byte f = -1;
   private static final byte g = 0;
   private static final byte h = 1;
   private static final Logger i = LogUtils.getLogger();
   private static final int j = 200;
   private static final int k = 20;
   private static final int l = 10000;
   public static final int a = 2;
   public static final int b = 32;
   public static final int c = apc.a(apn.d);
   private final Long2ObjectLinkedOpenHashMap<apb> m = new Long2ObjectLinkedOpenHashMap();
   private volatile Long2ObjectLinkedOpenHashMap<apb> n = this.m.clone();
   private final Long2ObjectLinkedOpenHashMap<apb> o = new Long2ObjectLinkedOpenHashMap();
   private final LongSet p = new LongOpenHashSet();
   final apu q;
   private final apx r;
   private final bmv<Runnable> s;
   private drf t;
   private final dvo u;
   private final drg v;
   private final Supplier<emu> w;
   private final cbw x;
   final LongSet y = new LongOpenHashSet();
   private boolean z;
   private final apg A;
   private final bmx<apg.a<Runnable>> B;
   private final bmx<apg.a<Runnable>> C;
   private final aqd D;
   private final dth E;
   private final apd.a F;
   private final AtomicInteger G = new AtomicInteger();
   private final String H;
   private final apo I = new apo();
   private final Int2ObjectMap<apd.b> J = new Int2ObjectOpenHashMap();
   private final Long2ByteMap K = new Long2ByteOpenHashMap();
   private final Long2LongMap L = new Long2LongOpenHashMap();
   private final Queue<Runnable> M = Queues.newConcurrentLinkedQueue();
   private int N;
   private dsh O;

   public apd(
      apu $$0,
      ena.c $$1,
      DataFixer $$2,
      ejr $$3,
      Executor $$4,
      bmv<Runnable> $$5,
      drr $$6,
      drf $$7,
      aqd $$8,
      dth $$9,
      Supplier<emu> $$10,
      int $$11,
      boolean $$12
   ) {
      super(new dsu($$1.f(), $$0.ae(), "chunk"), $$1.a($$0.ae()).resolve("region"), $$2, $$12);
      Path $$13 = $$1.a($$0.ae());
      this.H = $$13.getFileName().toString();
      this.q = $$0;
      this.t = $$7;
      jb $$14 = $$0.H_();
      long $$15 = $$0.C();
      if ($$7 instanceof dvd $$16) {
         this.u = dvo.a($$16.g().a(), $$14.b(ku.aE), $$15);
      } else {
         this.u = dvo.a(dvf.e(), $$14.b(ku.aE), $$15);
      }

      this.v = $$7.a($$14.b(ku.aI), this.u, $$15);
      this.s = $$5;
      bmy<Runnable> $$17 = bmy.a($$4, "worldgen");
      bmx<Runnable> $$18 = bmx.a("main", $$5::i);
      this.D = $$8;
      this.E = $$9;
      bmy<Runnable> $$19 = bmy.a($$4, "light");
      this.A = new apg(ImmutableList.of($$17, $$18, $$19), $$4, Integer.MAX_VALUE);
      this.B = this.A.a($$17, false);
      this.C = this.A.a($$18, false);
      this.r = new apx($$6, this, this.q.D_().g(), $$19, this.A.a($$19, false));
      this.F = new apd.a($$4, $$5);
      this.w = $$10;
      this.x = new cbw(new dsu($$1.f(), $$0.ae(), "poi"), $$13.resolve("poi"), $$2, $$12, $$14, $$0);
      this.a($$11);
      this.O = new dsh($$0, $$7, $$3, this.r);
   }

   protected drf a() {
      return this.t;
   }

   protected drg b() {
      return this.v;
   }

   protected dvo c() {
      return this.u;
   }

   public void d() {
      DataResult<JsonElement> $$0 = drf.a.encodeStart(JsonOps.INSTANCE, this.t);
      DataResult<drf> $$1 = $$0.flatMap($$0x -> drf.a.parse(JsonOps.INSTANCE, $$0x));
      $$1.result().ifPresent($$0x -> {
         this.t = $$0x;
         this.O = new dsh(this.O.a(), $$0x, this.O.c(), this.O.d());
      });
   }

   private static double a(cyn $$0, bqa $$1) {
      double $$2 = (double)jg.a($$0.e, 8);
      double $$3 = (double)jg.a($$0.f, 8);
      double $$4 = $$2 - $$1.dr();
      double $$5 = $$3 - $$1.dx();
      return $$4 * $$4 + $$5 * $$5;
   }

   boolean a(apv $$0, int $$1, int $$2) {
      return $$0.W().a($$1, $$2) && !$$0.d.f.a(cyn.c($$1, $$2));
   }

   private boolean b(apv $$0, int $$1, int $$2) {
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

   protected apx e() {
      return this.r;
   }

   @Nullable
   protected apb a(long $$0) {
      return (apb)this.m.get($$0);
   }

   @Nullable
   protected apb b(long $$0) {
      return (apb)this.n.get($$0);
   }

   protected IntSupplier c(long $$0) {
      return () -> {
         apb $$1 = this.b($$0);
         return $$1 == null ? apf.a - 1 : Math.min($$1.m(), apf.a - 1);
      };
   }

   public String a(cyn $$0) {
      apb $$1 = this.b($$0.a());
      if ($$1 == null) {
         return "null";
      } else {
         String $$2 = $$1.l() + "\n";
         dsd $$3 = $$1.g();
         dre $$4 = $$1.h();
         if ($$3 != null) {
            $$2 = $$2 + "St: §" + $$3.c() + $$3 + "§r\n";
         }

         if ($$4 != null) {
            $$2 = $$2 + "Ch: §" + $$4.j().c() + $$4.j() + "§r\n";
         }

         apn $$5 = $$1.j();
         $$2 = $$2 + '§' + $$5.ordinal() + $$5;
         return $$2 + "§r";
      }
   }

   private CompletableFuture<ape<List<dre>>> a(apb $$0, int $$1, IntFunction<dsd> $$2) {
      if ($$1 == 0) {
         dsd $$3 = $$2.apply(0);
         return $$0.a($$3, this).thenApply($$0x -> $$0x.a(List::of));
      } else {
         List<CompletableFuture<ape<dre>>> $$4 = new ArrayList<>();
         List<apb> $$5 = new ArrayList<>();
         cyn $$6 = $$0.k();
         int $$7 = $$6.e;
         int $$8 = $$6.f;

         for (int $$9 = -$$1; $$9 <= $$1; $$9++) {
            for (int $$10 = -$$1; $$10 <= $$1; $$10++) {
               int $$11 = Math.max(Math.abs($$10), Math.abs($$9));
               cyn $$12 = new cyn($$7 + $$10, $$8 + $$9);
               long $$13 = $$12.a();
               apb $$14 = this.a($$13);
               if ($$14 == null) {
                  return CompletableFuture.completedFuture(ape.a(() -> "Unloaded " + $$12));
               }

               dsd $$15 = $$2.apply($$11);
               CompletableFuture<ape<dre>> $$16 = $$14.a($$15, this);
               $$5.add($$14);
               $$4.add($$16);
            }
         }

         CompletableFuture<List<ape<dre>>> $$17 = ac.d($$4);
         CompletableFuture<ape<List<dre>>> $$18 = $$17.thenApply($$3 -> {
            List<dre> $$4x = Lists.newArrayList();
            int $$5x = 0;

            for (ape<dre> $$6x : $$3) {
               if ($$6x == null) {
                  throw this.a(new IllegalStateException("At least one of the chunk futures were null"), "n/a");
               }

               dre $$7x = $$6x.b(null);
               if ($$7x == null) {
                  int $$8x = $$5x;
                  return ape.a(() -> "Unloaded " + new cyn($$7 + $$8x % ($$1 * 2 + 1), $$8 + $$8x / ($$1 * 2 + 1)) + " " + $$6x.b());
               }

               $$4x.add($$7x);
               $$5x++;
            }

            return ape.a($$4x);
         });

         for (apb $$19 : $$5) {
            $$19.a("getChunkRangeFuture " + $$6 + " " + $$1, $$18);
         }

         return $$18;
      }
   }

   public y a(IllegalStateException $$0, String $$1) {
      StringBuilder $$2 = new StringBuilder();
      Consumer<apb> $$3 = $$1x -> $$1x.p().forEach($$2x -> {
            dsd $$3x = (dsd)$$2x.getFirst();
            CompletableFuture<ape<dre>> $$4x = (CompletableFuture<ape<dre>>)$$2x.getSecond();
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

   public CompletableFuture<ape<dro>> a(apb $$0) {
      return this.a($$0, 2, $$0x -> dsd.n).thenApplyAsync($$0x -> $$0x.a($$0xx -> (dro)$$0xx.get($$0xx.size() / 2)), this.s);
   }

   @Nullable
   apb a(long $$0, int $$1, @Nullable apb $$2, int $$3) {
      if (!apc.e($$3) && !apc.e($$1)) {
         return $$2;
      } else {
         if ($$2 != null) {
            $$2.a($$1);
         }

         if ($$2 != null) {
            if (!apc.e($$1)) {
               this.y.add($$0);
            } else {
               this.y.remove($$0);
            }
         }

         if (apc.e($$1) && $$2 == null) {
            $$2 = (apb)this.o.remove($$0);
            if ($$2 != null) {
               $$2.a($$1);
            } else {
               $$2 = new apb(new cyn($$0), $$1, this.q, this.r, this.A, this);
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
         List<apb> $$1 = this.n.values().stream().filter(apb::n).peek(apb::o).toList();
         MutableBoolean $$2 = new MutableBoolean();

         do {
            $$2.setFalse();
            $$1.stream().map($$0x -> {
               CompletableFuture<dre> $$1x;
               do {
                  $$1x = $$0x.i();
                  this.s.c($$1x::isDone);
               } while ($$1x != $$0x.i());

               return $$1x.join();
            }).filter($$0x -> $$0x instanceof drn || $$0x instanceof dro).filter(this::a).forEach($$1x -> $$2.setTrue());
         } while ($$2.isTrue());

         this.b(() -> true);
         this.o();
      } else {
         this.n.values().forEach(this::d);
      }
   }

   protected void a(BooleanSupplier $$0) {
      bkt $$1 = this.q.af();
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
         apb $$4 = (apb)this.m.remove($$3);
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
      ObjectIterator<apb> $$8 = this.n.values().iterator();

      while ($$7 < 20 && $$0.getAsBoolean() && $$8.hasNext()) {
         if (this.d((apb)$$8.next())) {
            $$7++;
         }
      }
   }

   private void a(long $$0, apb $$1) {
      CompletableFuture<dre> $$2 = $$1.i();
      $$2.thenAcceptAsync($$3 -> {
         CompletableFuture<dre> $$4 = $$1.i();
         if ($$4 != $$2) {
            this.a($$0, $$1);
         } else {
            if (this.o.remove($$0, $$1) && $$3 != null) {
               if ($$3 instanceof dro) {
                  ((dro)$$3).c(false);
               }

               this.a($$3);
               if (this.p.remove($$0) && $$3 instanceof dro $$5) {
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

   public CompletableFuture<ape<dre>> a(apb $$0, dsd $$1) {
      cyn $$2 = $$0.k();
      if ($$1 == dsd.c) {
         return this.g($$2).thenApply(ape::a);
      } else {
         if ($$1 == dsd.l) {
            this.F.a(apz.e, $$2, apc.a(dsd.l), $$2);
         }

         if (!$$1.f()) {
            dre $$3 = $$0.a($$1.d(), this).getNow(apb.a).b(null);
            if ($$3 != null && $$3.j().b($$1)) {
               CompletableFuture<dre> $$4 = $$1.a(this.O, $$1x -> this.a($$0, $$1x), $$3);
               this.D.a($$2, $$1);
               return $$4.thenApply(ape::a);
            }
         }

         return this.b($$0, $$1);
      }
   }

   private CompletableFuture<dre> g(cyn $$0) {
      return this.k($$0).thenApply($$1 -> $$1.filter($$1x -> {
            boolean $$2 = b($$1x);
            if (!$$2) {
               i.error("Chunk file at {} is missing level data, skipping", $$0);
            }

            return $$2;
         })).thenApplyAsync($$1 -> {
         this.q.af().d("chunkLoad");
         if ($$1.isPresent()) {
            dre $$2 = dsk.a(this.q, this.x, $$0, $$1.get());
            this.a($$0, $$2.j().g());
            return $$2;
         } else {
            return this.h($$0);
         }
      }, this.s).exceptionallyAsync($$1 -> this.a($$1, $$0), this.s);
   }

   private static boolean b(to $$0) {
      return $$0.b("Status", 8);
   }

   private dre a(Throwable $$0, cyn $$1) {
      Throwable $$3 = $$0 instanceof CompletionException $$2 ? $$2.getCause() : $$0;
      Throwable $$5 = $$3 instanceof y $$4 ? $$4.getCause() : $$3;
      if (!($$5 instanceof IOException) && !($$5 instanceof dsk.a)) {
         o $$6 = o.a($$0, "Exception loading chunk");
         p $$7 = $$6.a("Chunk being loaded");
         $$7.a("pos", $$1);
         this.i($$1);
         throw new y($$6);
      } else {
         i.error("Couldn't load chunk {}", $$1, $$5);
         this.q.o().a($$1);
         return this.h($$1);
      }
   }

   private dre h(cyn $$0) {
      this.i($$0);
      return new dry($$0, dsb.a, this.q, this.q.H_().d(ku.aw), null);
   }

   private void i(cyn $$0) {
      this.K.put($$0.a(), (byte)-1);
   }

   private byte a(cyn $$0, dsf $$1) {
      return this.K.put($$0.a(), (byte)($$1 == dsf.a ? -1 : 1));
   }

   private CompletableFuture<ape<dre>> b(apb $$0, dsd $$1) {
      cyn $$2 = $$0.k();
      CompletableFuture<ape<List<dre>>> $$3 = this.a($$0, $$1.e(), $$1x -> this.a($$1, $$1x));
      this.q.af().c(() -> "chunkGenerate " + $$1);
      Executor $$4 = $$1x -> this.B.a(apg.a($$0, $$1x));
      return $$3.thenComposeAsync($$4x -> {
         List<dre> $$5 = (List<dre>)$$4x.b(null);
         if ($$5 == null) {
            this.b($$2);
            return CompletableFuture.completedFuture(ape.a($$4x::b));
         } else {
            try {
               dre $$6 = $$5.get($$5.size() / 2);
               CompletableFuture<dre> $$7;
               if ($$6.j().b($$1)) {
                  $$7 = $$1.a(this.O, $$1xx -> this.a($$0, $$1xx), $$6);
               } else {
                  $$7 = $$1.a(this.O, $$4, $$1xx -> this.a($$0, $$1xx), $$5);
               }

               this.D.a($$2, $$1);
               return $$7.thenApply(ape::a);
            } catch (Exception var10) {
               var10.getStackTrace();
               o $$10 = o.a(var10, "Exception generating new chunk");
               p $$11 = $$10.a("Chunk to be generated");
               $$11.a("Status being generated", () -> kt.n.b($$1).toString());
               $$11.a("Location", String.format(Locale.ROOT, "%d,%d", $$2.e, $$2.f));
               $$11.a("Position hash", cyn.c($$2.e, $$2.f));
               $$11.a("Generator", this.t);
               this.s.execute(() -> {
                  throw new y($$10);
               });
               throw new y($$10);
            }
         }
      }, $$4);
   }

   protected void b(cyn $$0) {
      this.s.i(ac.a((Runnable)(() -> this.F.b(apz.e, $$0, apc.a(dsd.l), $$0)), (Supplier<String>)(() -> "release light ticket " + $$0)));
   }

   private dsd a(dsd $$0, int $$1) {
      dsd $$2;
      if ($$1 == 0) {
         $$2 = $$0.d();
      } else {
         $$2 = dsd.a(dsd.a($$0) + $$1);
      }

      return $$2;
   }

   private static void a(apu $$0, List<to> $$1) {
      if (!$$1.isEmpty()) {
         $$0.b(bqg.a($$1, $$0));
      }
   }

   private CompletableFuture<dre> a(apb $$0, dre $$1) {
      return CompletableFuture.supplyAsync(() -> {
         cyn $$2 = $$0.k();
         dry $$3 = (dry)$$1;
         dro $$4;
         if ($$3 instanceof drn) {
            $$4 = ((drn)$$3).C();
         } else {
            $$4 = new dro(this.q, $$3, $$1xx -> a(this.q, $$3.E()));
            $$0.a(new drn($$4, false));
         }

         $$4.b(() -> apc.b($$0.l()));
         $$4.E();
         if (this.p.add($$2.a())) {
            $$4.c(true);
            $$4.J();
            $$4.a(this.q);
         }

         return $$4;
      }, $$1x -> this.C.a(apg.a($$1x, $$0.k().a(), $$0::l)));
   }

   public CompletableFuture<ape<dro>> b(apb $$0) {
      CompletableFuture<ape<List<dre>>> $$1 = this.a($$0, 1, $$0x -> dsd.n);
      CompletableFuture<ape<dro>> $$2 = $$1.<ape<dro>>thenApplyAsync(
            $$0x -> $$0x.a($$0xx -> (dro)$$0xx.get($$0xx.size() / 2)), $$1x -> this.C.a(apg.a($$0, $$1x))
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

   private void a(dro $$0) {
      cyn $$1 = $$0.f();

      for (apv $$2 : this.I.a()) {
         if ($$2.W().a($$1)) {
            a($$2, $$0);
         }
      }
   }

   public CompletableFuture<ape<dro>> c(apb $$0) {
      return this.a($$0, 1, dsd::a).thenApplyAsync($$0x -> $$0x.a($$0xx -> (dro)$$0xx.get($$0xx.size() / 2)), $$1 -> this.C.a(apg.a($$0, $$1)));
   }

   public int h() {
      return this.G.get();
   }

   private boolean d(apb $$0) {
      if (!$$0.n()) {
         return false;
      } else {
         dre $$1 = $$0.i().getNow(null);
         if (!($$1 instanceof drn) && !($$1 instanceof dro)) {
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

   private boolean a(dre $$0) {
      this.x.a($$0.f());
      if (!$$0.i()) {
         return false;
      } else {
         $$0.a(false);
         cyn $$1 = $$0.f();

         try {
            dsd $$2 = $$0.j();
            if ($$2.g() != dsf.b) {
               if (this.j($$1)) {
                  return false;
               }

               if ($$2 == dsd.c && $$0.g().values().stream().noneMatch(efy::b)) {
                  return false;
               }
            }

            this.q.af().d("chunkSave");
            to $$3 = dsk.a(this.q, $$0);
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

   private boolean j(cyn $$0) {
      byte $$1 = this.K.get($$0.a());
      if ($$1 != 0) {
         return $$1 == 1;
      } else {
         to $$2;
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

         dsf $$5 = dsk.a($$2);
         return this.a($$0, $$5) == 1;
      }
   }

   protected void a(int $$0) {
      int $$1 = axm.a($$0, 2, 32);
      if ($$1 != this.N) {
         this.N = $$1;
         this.F.a(this.N);

         for (apv $$2 : this.I.a()) {
            this.e($$2);
         }
      }
   }

   int b(apv $$0) {
      return axm.a($$0.E(), 2, this.N);
   }

   private void a(apv $$0, cyn $$1) {
      dro $$2 = this.d($$1.a());
      if ($$2 != null) {
         a($$0, $$2);
      }
   }

   private static void a(apv $$0, dro $$1) {
      $$0.d.f.a($$1);
   }

   private static void b(apv $$0, cyn $$1) {
      $$0.d.f.a($$0, $$1);
   }

   @Nullable
   public dro d(long $$0) {
      apb $$1 = this.b($$0);
      return $$1 == null ? null : $$1.f();
   }

   public int i() {
      return this.n.size();
   }

   public apm j() {
      return this.F;
   }

   protected Iterable<apb> k() {
      return Iterables.unmodifiableIterable(this.n.values());
   }

   void a(Writer $$0) throws IOException {
      awm $$1 = awm.a()
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
      aqa $$2 = this.F.d();
      ObjectBidirectionalIterator var4 = this.n.long2ObjectEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<apb> $$3 = (Entry<apb>)var4.next();
         long $$4 = $$3.getLongKey();
         cyn $$5 = new cyn($$4);
         apb $$6 = (apb)$$3.getValue();
         Optional<dre> $$7 = Optional.ofNullable($$6.h());
         Optional<dro> $$8 = $$7.flatMap($$0x -> $$0x instanceof dro ? Optional.of((dro)$$0x) : Optional.empty());
         $$1.a(
            $$5.e,
            $$5.f,
            $$6.l(),
            $$7.isPresent(),
            $$7.map(dre::j).orElse(null),
            $$8.map(dro::D).orElse(null),
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

   private static String a(CompletableFuture<ape<dro>> $$0) {
      try {
         ape<dro> $$1 = $$0.getNow(null);
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

   private CompletableFuture<Optional<to>> k(cyn $$0) {
      return this.e($$0).thenApplyAsync($$0x -> $$0x.map(this::c), ac.f());
   }

   private to c(to $$0) {
      return this.a(this.q.ae(), this.w, $$0, this.t.b());
   }

   boolean c(cyn $$0) {
      if (!this.F.f($$0.a())) {
         return false;
      } else {
         for (apv $$1 : this.I.a()) {
            if (this.c($$1, $$0)) {
               return true;
            }
         }

         return false;
      }
   }

   public List<apv> d(cyn $$0) {
      long $$1 = $$0.a();
      if (!this.F.f($$1)) {
         return List.of();
      } else {
         Builder<apv> $$2 = ImmutableList.builder();

         for (apv $$3 : this.I.a()) {
            if (this.c($$3, $$0)) {
               $$2.add($$3);
            }
         }

         return $$2.build();
      }
   }

   private boolean c(apv $$0, cyn $$1) {
      if ($$0.N_()) {
         return false;
      } else {
         double $$2 = a($$1, $$0);
         return $$2 < 16384.0;
      }
   }

   private boolean c(apv $$0) {
      return $$0.N_() && !this.q.aa().b(czc.r);
   }

   void a(apv $$0, boolean $$1) {
      boolean $$2 = this.c($$0);
      boolean $$3 = this.I.d($$0);
      if ($$1) {
         this.I.a($$0, $$2);
         this.d($$0);
         if (!$$2) {
            this.F.a(jg.a($$0), $$0);
         }

         $$0.a(api.a);
         this.e($$0);
      } else {
         jg $$4 = $$0.V();
         this.I.a($$0);
         if (!$$3) {
            this.F.b($$4, $$0);
         }

         this.a($$0, api.a);
      }
   }

   private void d(apv $$0) {
      jg $$1 = jg.a($$0);
      $$0.a($$1);
   }

   public void a(apv $$0) {
      ObjectIterator $$2 = this.J.values().iterator();

      while ($$2.hasNext()) {
         apd.b $$1 = (apd.b)$$2.next();
         if ($$1.c == $$0) {
            $$1.a(this.q.x());
         } else {
            $$1.b($$0);
         }
      }

      jg $$2x = $$0.V();
      jg $$3 = jg.a($$0);
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

   private void e(apv $$0) {
      cyn $$1 = $$0.do();
      int $$2 = this.b($$0);
      if ($$0.W() instanceof api.a $$3 && $$3.a().equals($$1) && $$3.b() == $$2) {
         return;
      }

      this.a($$0, api.a($$1, $$2));
   }

   private void a(apv $$0, api $$1) {
      if ($$0.dM() == this.q) {
         api $$2 = $$0.W();
         if ($$1 instanceof api.a $$3 && (!($$2 instanceof api.a $$4) || !$$4.a().equals($$3.a()))) {
            $$0.d.b(new aea($$3.a().e, $$3.a().f));
         }

         api.a($$2, $$1, $$1x -> this.a($$0, $$1x), $$1x -> b($$0, $$1x));
         $$0.a($$1);
      }
   }

   @Override
   public List<apv> a(cyn $$0, boolean $$1) {
      Set<apv> $$2 = this.I.a();
      Builder<apv> $$3 = ImmutableList.builder();

      for (apv $$4 : $$2) {
         if ($$1 && this.b($$4, $$0.e, $$0.f) || !$$1 && this.a($$4, $$0.e, $$0.f)) {
            $$3.add($$4);
         }
      }

      return $$3.build();
   }

   protected void a(bqa $$0) {
      if (!($$0 instanceof cfc)) {
         bqg<?> $$1 = $$0.ai();
         int $$2 = $$1.o() * 16;
         if ($$2 != 0) {
            int $$3 = $$1.p();
            if (this.J.containsKey($$0.aj())) {
               throw (IllegalStateException)ac.b(new IllegalStateException("Entity is already tracked!"));
            } else {
               apd.b $$4 = new apd.b($$0, $$2, $$3, $$1.q());
               this.J.put($$0.aj(), $$4);
               $$4.a(this.q.x());
               if ($$0 instanceof apv $$5) {
                  this.a($$5, true);
                  ObjectIterator var7 = this.J.values().iterator();

                  while (var7.hasNext()) {
                     apd.b $$6 = (apd.b)var7.next();
                     if ($$6.c != $$5) {
                        $$6.b($$5);
                     }
                  }
               }
            }
         }
      }
   }

   protected void b(bqa $$0) {
      if ($$0 instanceof apv $$1) {
         this.a($$1, false);
         ObjectIterator var3 = this.J.values().iterator();

         while (var3.hasNext()) {
            apd.b $$2 = (apd.b)var3.next();
            $$2.a($$1);
         }
      }

      apd.b $$3 = (apd.b)this.J.remove($$0.aj());
      if ($$3 != null) {
         $$3.a();
      }
   }

   protected void l() {
      for (apv $$0 : this.I.a()) {
         this.e($$0);
      }

      List<apv> $$1 = Lists.newArrayList();
      List<apv> $$2 = this.q.x();
      ObjectIterator var3 = this.J.values().iterator();

      while (var3.hasNext()) {
         apd.b $$3 = (apd.b)var3.next();
         jg $$4 = $$3.e;
         jg $$5 = jg.a($$3.c);
         boolean $$6 = !Objects.equals($$4, $$5);
         if ($$6) {
            $$3.a($$2);
            bqa $$7 = $$3.c;
            if ($$7 instanceof apv) {
               $$1.add((apv)$$7);
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
            apd.b $$8 = (apd.b)var3.next();
            $$8.a($$1);
         }
      }
   }

   public void a(bqa $$0, yp<?> $$1) {
      apd.b $$2 = (apd.b)this.J.get($$0.aj());
      if ($$2 != null) {
         $$2.a($$1);
      }
   }

   protected void b(bqa $$0, yp<?> $$1) {
      apd.b $$2 = (apd.b)this.J.get($$0.aj());
      if ($$2 != null) {
         $$2.b($$1);
      }
   }

   public void a(List<dre> $$0) {
      Map<apv, List<dro>> $$1 = new HashMap<>();

      for (dre $$2 : $$0) {
         cyn $$3 = $$2.f();
         dro $$5;
         if ($$2 instanceof dro $$4) {
            $$5 = $$4;
         } else {
            $$5 = this.q.d($$3.e, $$3.f);
         }

         for (apv $$7 : this.a($$3, false)) {
            $$1.computeIfAbsent($$7, $$0x -> new ArrayList<>()).add($$5);
         }
      }

      $$1.forEach(($$0x, $$1x) -> $$0x.d.b(abq.a($$1x)));
   }

   protected cbw m() {
      return this.x;
   }

   public String n() {
      return this.H;
   }

   void a(cyn $$0, apn $$1) {
      this.E.onChunkStatusChange($$0, $$1);
   }

   public void a(cyn $$0, int $$1) {
      int $$2 = $$1 + 1;
      cyn.a($$0, $$2).forEach($$0x -> {
         apb $$1x = this.b($$0x.a());
         if ($$1x != null) {
            $$1x.a(this.r.a($$0x.e, $$0x.f));
         }
      });
   }

   class a extends apm {
      protected a(Executor $$0, Executor $$1) {
         super($$0, $$1);
      }

      @Override
      protected boolean a(long $$0) {
         return apd.this.y.contains($$0);
      }

      @Nullable
      @Override
      protected apb b(long $$0) {
         return apd.this.a($$0);
      }

      @Nullable
      @Override
      protected apb a(long $$0, int $$1, @Nullable apb $$2, int $$3) {
         return apd.this.a($$0, $$1, $$2, $$3);
      }
   }

   class b {
      final apt b;
      final bqa c;
      private final int d;
      jg e;
      private final Set<aqx> f = Sets.newIdentityHashSet();

      public b(bqa $$0, int $$1, int $$2, boolean $$3) {
         this.b = new apt(apd.this.q, $$0, $$2, $$3, this::a);
         this.c = $$0;
         this.d = $$1;
         this.e = jg.a($$0);
      }

      @Override
      public boolean equals(Object $$0) {
         return $$0 instanceof apd.b ? ((apd.b)$$0).c.aj() == this.c.aj() : false;
      }

      @Override
      public int hashCode() {
         return this.c.aj();
      }

      public void a(yp<?> $$0) {
         for (aqx $$1 : this.f) {
            $$1.b($$0);
         }
      }

      public void b(yp<?> $$0) {
         this.a($$0);
         if (this.c instanceof apv) {
            ((apv)this.c).d.b($$0);
         }
      }

      public void a() {
         for (aqx $$0 : this.f) {
            this.b.a($$0.p());
         }
      }

      public void a(apv $$0) {
         if (this.f.remove($$0.d)) {
            this.b.a($$0);
         }
      }

      public void b(apv $$0) {
         if ($$0 != this.c) {
            esj $$1 = $$0.dk().d(this.c.dk());
            int $$2 = apd.this.b($$0);
            double $$3 = (double)Math.min(this.b(), $$2 * 16);
            double $$4 = $$1.c * $$1.c + $$1.e * $$1.e;
            double $$5 = $$3 * $$3;
            boolean $$6 = $$4 <= $$5 && this.c.a($$0) && apd.this.a($$0, this.c.do().e, this.c.do().f);
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
         return apd.this.q.o().b($$0);
      }

      private int b() {
         int $$0 = this.d;

         for (bqa $$1 : this.c.cT()) {
            int $$2 = $$1.ai().o() * 16;
            if ($$2 > $$0) {
               $$0 = $$2;
            }
         }

         return this.a($$0);
      }

      public void a(List<apv> $$0) {
         for (apv $$1 : $$0) {
            this.b($$1);
         }
      }
   }
}
