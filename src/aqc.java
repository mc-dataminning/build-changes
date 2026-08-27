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

public class aqc extends dwf implements aqa.c {
   private static final byte f = -1;
   private static final byte g = 0;
   private static final byte h = 1;
   private static final Logger i = LogUtils.getLogger();
   private static final int j = 200;
   private static final int k = 20;
   private static final int l = 10000;
   public static final int a = 2;
   public static final int b = 32;
   public static final int c = aqb.a(aqm.d);
   private final Long2ObjectLinkedOpenHashMap<aqa> m = new Long2ObjectLinkedOpenHashMap();
   private volatile Long2ObjectLinkedOpenHashMap<aqa> n = this.m.clone();
   private final Long2ObjectLinkedOpenHashMap<aqa> o = new Long2ObjectLinkedOpenHashMap();
   private final LongSet p = new LongOpenHashSet();
   final aqt q;
   private final aqw r;
   private final boq<Runnable> s;
   private duz t;
   private final dzi u;
   private final dva v;
   private final Supplier<eqz> w;
   private final cdr x;
   final LongSet y = new LongOpenHashSet();
   private boolean z;
   private final aqf A;
   private final bos<aqf.a<Runnable>> B;
   private final bos<aqf.a<Runnable>> C;
   private final arc D;
   private final dxb E;
   private final aqc.a F;
   private final AtomicInteger G = new AtomicInteger();
   private final String H;
   private final aqn I = new aqn();
   private final Int2ObjectMap<aqc.b> J = new Int2ObjectOpenHashMap();
   private final Long2ByteMap K = new Long2ByteOpenHashMap();
   private final Long2LongMap L = new Long2LongOpenHashMap();
   private final Queue<Runnable> M = Queues.newConcurrentLinkedQueue();
   private int N;
   private dwb O;

   public aqc(
      aqt $$0,
      erf.c $$1,
      DataFixer $$2,
      enu $$3,
      Executor $$4,
      boq<Runnable> $$5,
      dvl $$6,
      duz $$7,
      arc $$8,
      dxb $$9,
      Supplier<eqz> $$10,
      int $$11,
      boolean $$12
   ) {
      super(new dwo($$1.f(), $$0.af(), "chunk"), $$1.a($$0.af()).resolve("region"), $$2, $$12);
      Path $$13 = $$1.a($$0.af());
      this.H = $$13.getFileName().toString();
      this.q = $$0;
      this.t = $$7;
      jo $$14 = $$0.I_();
      long $$15 = $$0.C();
      if ($$7 instanceof dyx $$16) {
         this.u = dzi.a($$16.g().a(), $$14.b(li.aH), $$15);
      } else {
         this.u = dzi.a(dyz.e(), $$14.b(li.aH), $$15);
      }

      this.v = $$7.a($$14.b(li.aL), this.u, $$15);
      this.s = $$5;
      bot<Runnable> $$17 = bot.a($$4, "worldgen");
      bos<Runnable> $$18 = bos.a("main", $$5::i);
      this.D = $$8;
      this.E = $$9;
      bot<Runnable> $$19 = bot.a($$4, "light");
      this.A = new aqf(ImmutableList.of($$17, $$18, $$19), $$4, Integer.MAX_VALUE);
      this.B = this.A.a($$17, false);
      this.C = this.A.a($$18, false);
      this.r = new aqw($$6, this, this.q.E_().g(), $$19, this.A.a($$19, false));
      this.F = new aqc.a($$4, $$5);
      this.w = $$10;
      this.x = new cdr(new dwo($$1.f(), $$0.af(), "poi"), $$13.resolve("poi"), $$2, $$12, $$14, $$0);
      this.a($$11);
      this.O = new dwb($$0, $$7, $$3, this.r);
   }

   protected duz a() {
      return this.t;
   }

   protected dva b() {
      return this.v;
   }

   protected dzi c() {
      return this.u;
   }

   public void d() {
      DataResult<JsonElement> $$0 = duz.a.encodeStart(JsonOps.INSTANCE, this.t);
      DataResult<duz> $$1 = $$0.flatMap($$0x -> duz.a.parse(JsonOps.INSTANCE, $$0x));
      $$1.result().ifPresent($$0x -> {
         this.t = $$0x;
         this.O = new dwb(this.O.a(), $$0x, this.O.c(), this.O.d());
      });
   }

   private static double a(dbh $$0, brv $$1) {
      double $$2 = (double)jt.a($$0.e, 8);
      double $$3 = (double)jt.a($$0.f, 8);
      double $$4 = $$2 - $$1.dz();
      double $$5 = $$3 - $$1.dF();
      return $$4 * $$4 + $$5 * $$5;
   }

   boolean a(aqu $$0, int $$1, int $$2) {
      return $$0.Y().a($$1, $$2) && !$$0.d.f.a(dbh.c($$1, $$2));
   }

   private boolean b(aqu $$0, int $$1, int $$2) {
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

   protected aqw e() {
      return this.r;
   }

   @Nullable
   protected aqa a(long $$0) {
      return (aqa)this.m.get($$0);
   }

   @Nullable
   protected aqa b(long $$0) {
      return (aqa)this.n.get($$0);
   }

   protected IntSupplier c(long $$0) {
      return () -> {
         aqa $$1 = this.b($$0);
         return $$1 == null ? aqe.a - 1 : Math.min($$1.m(), aqe.a - 1);
      };
   }

   public String a(dbh $$0) {
      aqa $$1 = this.b($$0.a());
      if ($$1 == null) {
         return "null";
      } else {
         String $$2 = $$1.l() + "\n";
         dvx $$3 = $$1.g();
         duy $$4 = $$1.h();
         if ($$3 != null) {
            $$2 = $$2 + "St: §" + $$3.c() + $$3 + "§r\n";
         }

         if ($$4 != null) {
            $$2 = $$2 + "Ch: §" + $$4.k().c() + $$4.k() + "§r\n";
         }

         aqm $$5 = $$1.j();
         $$2 = $$2 + '§' + $$5.ordinal() + $$5;
         return $$2 + "§r";
      }
   }

   private CompletableFuture<aqd<List<duy>>> a(aqa $$0, int $$1, IntFunction<dvx> $$2) {
      if ($$1 == 0) {
         dvx $$3 = $$2.apply(0);
         return $$0.a($$3, this).thenApply($$0x -> $$0x.a(List::of));
      } else {
         List<CompletableFuture<aqd<duy>>> $$4 = new ArrayList<>();
         List<aqa> $$5 = new ArrayList<>();
         dbh $$6 = $$0.k();
         int $$7 = $$6.e;
         int $$8 = $$6.f;

         for (int $$9 = -$$1; $$9 <= $$1; $$9++) {
            for (int $$10 = -$$1; $$10 <= $$1; $$10++) {
               int $$11 = Math.max(Math.abs($$10), Math.abs($$9));
               dbh $$12 = new dbh($$7 + $$10, $$8 + $$9);
               long $$13 = $$12.a();
               aqa $$14 = this.a($$13);
               if ($$14 == null) {
                  return CompletableFuture.completedFuture(aqd.a(() -> "Unloaded " + $$12));
               }

               dvx $$15 = $$2.apply($$11);
               CompletableFuture<aqd<duy>> $$16 = $$14.a($$15, this);
               $$5.add($$14);
               $$4.add($$16);
            }
         }

         CompletableFuture<List<aqd<duy>>> $$17 = ad.d($$4);
         CompletableFuture<aqd<List<duy>>> $$18 = $$17.thenApply($$3 -> {
            List<duy> $$4x = Lists.newArrayList();
            int $$5x = 0;

            for (aqd<duy> $$6x : $$3) {
               if ($$6x == null) {
                  throw this.a(new IllegalStateException("At least one of the chunk futures were null"), "n/a");
               }

               duy $$7x = $$6x.b(null);
               if ($$7x == null) {
                  int $$8x = $$5x;
                  return aqd.a(() -> "Unloaded " + new dbh($$7 + $$8x % ($$1 * 2 + 1), $$8 + $$8x / ($$1 * 2 + 1)) + " " + $$6x.b());
               }

               $$4x.add($$7x);
               $$5x++;
            }

            return aqd.a($$4x);
         });

         for (aqa $$19 : $$5) {
            $$19.a("getChunkRangeFuture " + $$6 + " " + $$1, $$18);
         }

         return $$18;
      }
   }

   public z a(IllegalStateException $$0, String $$1) {
      StringBuilder $$2 = new StringBuilder();
      Consumer<aqa> $$3 = $$1x -> $$1x.p().forEach($$2x -> {
            dvx $$3x = (dvx)$$2x.getFirst();
            CompletableFuture<aqd<duy>> $$4x = (CompletableFuture<aqd<duy>>)$$2x.getSecond();
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
      return new z($$4);
   }

   public CompletableFuture<aqd<dvi>> a(aqa $$0) {
      return this.a($$0, 2, $$0x -> dvx.n).thenApplyAsync($$0x -> $$0x.a($$0xx -> (dvi)$$0xx.get($$0xx.size() / 2)), this.s);
   }

   @Nullable
   aqa a(long $$0, int $$1, @Nullable aqa $$2, int $$3) {
      if (!aqb.e($$3) && !aqb.e($$1)) {
         return $$2;
      } else {
         if ($$2 != null) {
            $$2.a($$1);
         }

         if ($$2 != null) {
            if (!aqb.e($$1)) {
               this.y.add($$0);
            } else {
               this.y.remove($$0);
            }
         }

         if (aqb.e($$1) && $$2 == null) {
            $$2 = (aqa)this.o.remove($$0);
            if ($$2 != null) {
               $$2.a($$1);
            } else {
               $$2 = new aqa(new dbh($$0), $$1, this.q, this.r, this.A, this);
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
         List<aqa> $$1 = this.n.values().stream().filter(aqa::n).peek(aqa::o).toList();
         MutableBoolean $$2 = new MutableBoolean();

         do {
            $$2.setFalse();
            $$1.stream().map($$0x -> {
               CompletableFuture<duy> $$1x;
               do {
                  $$1x = $$0x.i();
                  this.s.c($$1x::isDone);
               } while ($$1x != $$0x.i());

               return $$1x.join();
            }).filter($$0x -> $$0x instanceof dvh || $$0x instanceof dvi).filter(this::a).forEach($$1x -> $$2.setTrue());
         } while ($$2.isTrue());

         this.b(() -> true);
         this.o();
      } else {
         this.n.values().forEach(this::d);
      }
   }

   protected void a(BooleanSupplier $$0) {
      bmo $$1 = this.q.ag();
      $$1.a("poi");
      this.x.a($$0);
      $$1.b("chunk_unload");
      if (!this.q.t()) {
         this.b($$0);
      }

      $$1.c();
   }

   public boolean f() {
      return this.r.L_() || !this.o.isEmpty() || !this.m.isEmpty() || this.x.a() || !this.y.isEmpty() || !this.M.isEmpty() || this.A.a() || this.F.f();
   }

   private void b(BooleanSupplier $$0) {
      LongIterator $$1 = this.y.iterator();

      for (int $$2 = 0; $$1.hasNext() && ($$0.getAsBoolean() || $$2 < 200 || this.y.size() > 2000); $$1.remove()) {
         long $$3 = $$1.nextLong();
         aqa $$4 = (aqa)this.m.remove($$3);
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
      ObjectIterator<aqa> $$8 = this.n.values().iterator();

      while ($$7 < 20 && $$0.getAsBoolean() && $$8.hasNext()) {
         if (this.d((aqa)$$8.next())) {
            $$7++;
         }
      }
   }

   private void a(long $$0, aqa $$1) {
      CompletableFuture<duy> $$2 = $$1.i();
      $$2.thenAcceptAsync($$3 -> {
         CompletableFuture<duy> $$4 = $$1.i();
         if ($$4 != $$2) {
            this.a($$0, $$1);
         } else {
            if (this.o.remove($$0, $$1) && $$3 != null) {
               if ($$3 instanceof dvi) {
                  ((dvi)$$3).c(false);
               }

               this.a($$3);
               if (this.p.remove($$0) && $$3 instanceof dvi $$5) {
                  this.q.a($$5);
               }

               this.r.a($$3.g());
               this.r.b();
               this.D.a($$3.g(), null);
               this.L.remove($$3.g().a());
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

   public CompletableFuture<aqd<duy>> a(aqa $$0, dvx $$1) {
      dbh $$2 = $$0.k();
      if ($$1 == dvx.c) {
         return this.g($$2).thenApply(aqd::a);
      } else {
         if ($$1 == dvx.l) {
            this.F.a(aqy.e, $$2, aqb.a(dvx.l), $$2);
         }

         if (!$$1.f()) {
            duy $$3 = $$0.a($$1.d(), this).getNow(aqa.a).b(null);
            if ($$3 != null && $$3.k().b($$1)) {
               CompletableFuture<duy> $$4 = $$1.a(this.O, $$1x -> this.a($$0, $$1x), $$3);
               this.D.a($$2, $$1);
               return $$4.thenApply(aqd::a);
            }
         }

         return this.b($$0, $$1);
      }
   }

   private CompletableFuture<duy> g(dbh $$0) {
      return this.k($$0).thenApply($$1 -> $$1.filter($$1x -> {
            boolean $$2 = b($$1x);
            if (!$$2) {
               i.error("Chunk file at {} is missing level data, skipping", $$0);
            }

            return $$2;
         })).thenApplyAsync($$1 -> {
         this.q.ag().d("chunkLoad");
         if ($$1.isPresent()) {
            duy $$2 = dwe.a(this.q, this.x, $$0, $$1.get());
            this.a($$0, $$2.k().g());
            return $$2;
         } else {
            return this.h($$0);
         }
      }, this.s).exceptionallyAsync($$1 -> this.a($$1, $$0), this.s);
   }

   private static boolean b(uk $$0) {
      return $$0.b("Status", 8);
   }

   private duy a(Throwable $$0, dbh $$1) {
      Throwable $$3 = $$0 instanceof CompletionException $$2 ? $$2.getCause() : $$0;
      Throwable $$5 = $$3 instanceof z $$4 ? $$4.getCause() : $$3;
      if (!($$5 instanceof IOException) && !($$5 instanceof dwe.a)) {
         o $$6 = o.a($$0, "Exception loading chunk");
         p $$7 = $$6.a("Chunk being loaded");
         $$7.a("pos", $$1);
         this.i($$1);
         throw new z($$6);
      } else {
         i.error("Couldn't load chunk {}", $$1, $$5);
         this.q.o().a($$1);
         return this.h($$1);
      }
   }

   private duy h(dbh $$0) {
      this.i($$0);
      return new dvs($$0, dvv.a, this.q, this.q.I_().d(li.az), null);
   }

   private void i(dbh $$0) {
      this.K.put($$0.a(), (byte)-1);
   }

   private byte a(dbh $$0, dvz $$1) {
      return this.K.put($$0.a(), (byte)($$1 == dvz.a ? -1 : 1));
   }

   private CompletableFuture<aqd<duy>> b(aqa $$0, dvx $$1) {
      dbh $$2 = $$0.k();
      CompletableFuture<aqd<List<duy>>> $$3 = this.a($$0, $$1.e(), $$1x -> this.a($$1, $$1x));
      this.q.ag().c(() -> "chunkGenerate " + $$1);
      Executor $$4 = $$1x -> this.B.a(aqf.a($$0, $$1x));
      return $$3.thenComposeAsync($$4x -> {
         List<duy> $$5 = (List<duy>)$$4x.b(null);
         if ($$5 == null) {
            this.b($$2);
            return CompletableFuture.completedFuture(aqd.a($$4x::b));
         } else {
            try {
               duy $$6 = $$5.get($$5.size() / 2);
               CompletableFuture<duy> $$7;
               if ($$6.k().b($$1)) {
                  $$7 = $$1.a(this.O, $$1xx -> this.a($$0, $$1xx), $$6);
               } else {
                  $$7 = $$1.a(this.O, $$4, $$1xx -> this.a($$0, $$1xx), $$5);
               }

               this.D.a($$2, $$1);
               return $$7.thenApply(aqd::a);
            } catch (Exception var10) {
               var10.getStackTrace();
               o $$10 = o.a(var10, "Exception generating new chunk");
               p $$11 = $$10.a("Chunk to be generated");
               $$11.a("Status being generated", () -> lh.n.b($$1).toString());
               $$11.a("Location", String.format(Locale.ROOT, "%d,%d", $$2.e, $$2.f));
               $$11.a("Position hash", dbh.c($$2.e, $$2.f));
               $$11.a("Generator", this.t);
               this.s.execute(() -> {
                  throw new z($$10);
               });
               throw new z($$10);
            }
         }
      }, $$4);
   }

   protected void b(dbh $$0) {
      this.s.i(ad.a((Runnable)(() -> this.F.b(aqy.e, $$0, aqb.a(dvx.l), $$0)), (Supplier<String>)(() -> "release light ticket " + $$0)));
   }

   private dvx a(dvx $$0, int $$1) {
      dvx $$2;
      if ($$1 == 0) {
         $$2 = $$0.d();
      } else {
         $$2 = dvx.a(dvx.a($$0) + $$1);
      }

      return $$2;
   }

   private static void a(aqt $$0, List<uk> $$1) {
      if (!$$1.isEmpty()) {
         $$0.b(bsb.a($$1, $$0));
      }
   }

   private CompletableFuture<duy> a(aqa $$0, duy $$1) {
      return CompletableFuture.supplyAsync(() -> {
         dbh $$2 = $$0.k();
         dvs $$3 = (dvs)$$1;
         dvi $$4;
         if ($$3 instanceof dvh) {
            $$4 = ((dvh)$$3).D();
         } else {
            $$4 = new dvi(this.q, $$3, $$1xx -> a(this.q, $$3.F()));
            $$0.a(new dvh($$4, false));
         }

         $$4.b(() -> aqb.b($$0.l()));
         $$4.F();
         if (this.p.add($$2.a())) {
            $$4.c(true);
            $$4.K();
            $$4.a(this.q);
         }

         return $$4;
      }, $$1x -> this.C.a(aqf.a($$1x, $$0.k().a(), $$0::l)));
   }

   public CompletableFuture<aqd<dvi>> b(aqa $$0) {
      CompletableFuture<aqd<List<duy>>> $$1 = this.a($$0, 1, $$0x -> dvx.n);
      CompletableFuture<aqd<dvi>> $$2 = $$1.<aqd<dvi>>thenApplyAsync(
            $$0x -> $$0x.a($$0xx -> (dvi)$$0xx.get($$0xx.size() / 2)), $$1x -> this.C.a(aqf.a($$0, $$1x))
         )
         .thenApplyAsync($$1x -> $$1x.a($$1xx -> {
               $$1xx.I();
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

   private void a(dvi $$0) {
      dbh $$1 = $$0.g();

      for (aqu $$2 : this.I.a()) {
         if ($$2.Y().a($$1)) {
            a($$2, $$0);
         }
      }
   }

   public CompletableFuture<aqd<dvi>> c(aqa $$0) {
      return this.a($$0, 1, dvx::a).thenApplyAsync($$0x -> $$0x.a($$0xx -> (dvi)$$0xx.get($$0xx.size() / 2)), $$1 -> this.C.a(aqf.a($$0, $$1)));
   }

   public int h() {
      return this.G.get();
   }

   private boolean d(aqa $$0) {
      if (!$$0.n()) {
         return false;
      } else {
         duy $$1 = $$0.i().getNow(null);
         if (!($$1 instanceof dvh) && !($$1 instanceof dvi)) {
            return false;
         } else {
            long $$2 = $$1.g().a();
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

   private boolean a(duy $$0) {
      this.x.a($$0.g());
      if (!$$0.j()) {
         return false;
      } else {
         $$0.a(false);
         dbh $$1 = $$0.g();

         try {
            dvx $$2 = $$0.k();
            if ($$2.g() != dvz.b) {
               if (this.j($$1)) {
                  return false;
               }

               if ($$2 == dvx.c && $$0.h().values().stream().noneMatch(ekb::b)) {
                  return false;
               }
            }

            this.q.ag().d("chunkSave");
            uk $$3 = dwe.a(this.q, $$0);
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

   private boolean j(dbh $$0) {
      byte $$1 = this.K.get($$0.a());
      if ($$1 != 0) {
         return $$1 == 1;
      } else {
         uk $$2;
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

         dvz $$5 = dwe.a($$2);
         return this.a($$0, $$5) == 1;
      }
   }

   protected void a(int $$0) {
      int $$1 = aym.a($$0, 2, 32);
      if ($$1 != this.N) {
         this.N = $$1;
         this.F.a(this.N);

         for (aqu $$2 : this.I.a()) {
            this.e($$2);
         }
      }
   }

   int b(aqu $$0) {
      return aym.a($$0.G(), 2, this.N);
   }

   private void a(aqu $$0, dbh $$1) {
      dvi $$2 = this.d($$1.a());
      if ($$2 != null) {
         a($$0, $$2);
      }
   }

   private static void a(aqu $$0, dvi $$1) {
      $$0.d.f.a($$1);
   }

   private static void b(aqu $$0, dbh $$1) {
      $$0.d.f.a($$0, $$1);
   }

   @Nullable
   public dvi d(long $$0) {
      aqa $$1 = this.b($$0);
      return $$1 == null ? null : $$1.f();
   }

   public int i() {
      return this.n.size();
   }

   public aql j() {
      return this.F;
   }

   protected Iterable<aqa> k() {
      return Iterables.unmodifiableIterable(this.n.values());
   }

   void a(Writer $$0) throws IOException {
      axm $$1 = axm.a()
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
      aqz $$2 = this.F.d();
      ObjectBidirectionalIterator var4 = this.n.long2ObjectEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<aqa> $$3 = (Entry<aqa>)var4.next();
         long $$4 = $$3.getLongKey();
         dbh $$5 = new dbh($$4);
         aqa $$6 = (aqa)$$3.getValue();
         Optional<duy> $$7 = Optional.ofNullable($$6.h());
         Optional<dvi> $$8 = $$7.flatMap($$0x -> $$0x instanceof dvi ? Optional.of((dvi)$$0x) : Optional.empty());
         $$1.a(
            $$5.e,
            $$5.f,
            $$6.l(),
            $$7.isPresent(),
            $$7.map(duy::k).orElse(null),
            $$8.map(dvi::E).orElse(null),
            a($$6.c()),
            a($$6.a()),
            a($$6.b()),
            this.F.e($$4),
            this.c($$5),
            $$8.<Integer>map($$0x -> $$0x.H().size()).orElse(0),
            $$2.d($$4),
            $$2.c($$4),
            $$8.<Integer>map($$0x -> $$0x.p().a()).orElse(0),
            $$8.<Integer>map($$0x -> $$0x.q().a()).orElse(0)
         );
      }
   }

   private static String a(CompletableFuture<aqd<dvi>> $$0) {
      try {
         aqd<dvi> $$1 = $$0.getNow(null);
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

   private CompletableFuture<Optional<uk>> k(dbh $$0) {
      return this.e($$0).thenApplyAsync($$0x -> $$0x.map(this::c), ad.f());
   }

   private uk c(uk $$0) {
      return this.a(this.q.af(), this.w, $$0, this.t.b());
   }

   boolean c(dbh $$0) {
      if (!this.F.f($$0.a())) {
         return false;
      } else {
         for (aqu $$1 : this.I.a()) {
            if (this.c($$1, $$0)) {
               return true;
            }
         }

         return false;
      }
   }

   public List<aqu> d(dbh $$0) {
      long $$1 = $$0.a();
      if (!this.F.f($$1)) {
         return List.of();
      } else {
         Builder<aqu> $$2 = ImmutableList.builder();

         for (aqu $$3 : this.I.a()) {
            if (this.c($$3, $$0)) {
               $$2.add($$3);
            }
         }

         return $$2.build();
      }
   }

   private boolean c(aqu $$0, dbh $$1) {
      if ($$0.O_()) {
         return false;
      } else {
         double $$2 = a($$1, $$0);
         return $$2 < 16384.0;
      }
   }

   private boolean c(aqu $$0) {
      return $$0.O_() && !this.q.ab().b(dbw.r);
   }

   void a(aqu $$0, boolean $$1) {
      boolean $$2 = this.c($$0);
      boolean $$3 = this.I.d($$0);
      if ($$1) {
         this.I.a($$0, $$2);
         this.d($$0);
         if (!$$2) {
            this.F.a(jt.a($$0), $$0);
         }

         $$0.a(aqh.a);
         this.e($$0);
      } else {
         jt $$4 = $$0.X();
         this.I.a($$0);
         if (!$$3) {
            this.F.b($$4, $$0);
         }

         this.a($$0, aqh.a);
      }
   }

   private void d(aqu $$0) {
      jt $$1 = jt.a($$0);
      $$0.a($$1);
   }

   public void a(aqu $$0) {
      ObjectIterator $$2 = this.J.values().iterator();

      while ($$2.hasNext()) {
         aqc.b $$1 = (aqc.b)$$2.next();
         if ($$1.c == $$0) {
            $$1.a(this.q.x());
         } else {
            $$1.b($$0);
         }
      }

      jt $$2x = $$0.X();
      jt $$3 = jt.a($$0);
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

   private void e(aqu $$0) {
      dbh $$1 = $$0.dw();
      int $$2 = this.b($$0);
      if ($$0.Y() instanceof aqh.a $$3 && $$3.a().equals($$1) && $$3.b() == $$2) {
         return;
      }

      this.a($$0, aqh.a($$1, $$2));
   }

   private void a(aqu $$0, aqh $$1) {
      if ($$0.dU() == this.q) {
         aqh $$2 = $$0.Y();
         if ($$1 instanceof aqh.a $$3 && (!($$2 instanceof aqh.a $$4) || !$$4.a().equals($$3.a()))) {
            $$0.d.b(new aex($$3.a().e, $$3.a().f));
         }

         aqh.a($$2, $$1, $$1x -> this.a($$0, $$1x), $$1x -> b($$0, $$1x));
         $$0.a($$1);
      }
   }

   @Override
   public List<aqu> a(dbh $$0, boolean $$1) {
      Set<aqu> $$2 = this.I.a();
      Builder<aqu> $$3 = ImmutableList.builder();

      for (aqu $$4 : $$2) {
         if ($$1 && this.b($$4, $$0.e, $$0.f) || !$$1 && this.a($$4, $$0.e, $$0.f)) {
            $$3.add($$4);
         }
      }

      return $$3.build();
   }

   protected void a(brv $$0) {
      if (!($$0 instanceof cgy)) {
         bsb<?> $$1 = $$0.ak();
         int $$2 = $$1.o() * 16;
         if ($$2 != 0) {
            int $$3 = $$1.p();
            if (this.J.containsKey($$0.al())) {
               throw (IllegalStateException)ad.b(new IllegalStateException("Entity is already tracked!"));
            } else {
               aqc.b $$4 = new aqc.b($$0, $$2, $$3, $$1.q());
               this.J.put($$0.al(), $$4);
               $$4.a(this.q.x());
               if ($$0 instanceof aqu $$5) {
                  this.a($$5, true);
                  ObjectIterator var7 = this.J.values().iterator();

                  while (var7.hasNext()) {
                     aqc.b $$6 = (aqc.b)var7.next();
                     if ($$6.c != $$5) {
                        $$6.b($$5);
                     }
                  }
               }
            }
         }
      }
   }

   protected void b(brv $$0) {
      if ($$0 instanceof aqu $$1) {
         this.a($$1, false);
         ObjectIterator var3 = this.J.values().iterator();

         while (var3.hasNext()) {
            aqc.b $$2 = (aqc.b)var3.next();
            $$2.a($$1);
         }
      }

      aqc.b $$3 = (aqc.b)this.J.remove($$0.al());
      if ($$3 != null) {
         $$3.a();
      }
   }

   protected void l() {
      for (aqu $$0 : this.I.a()) {
         this.e($$0);
      }

      List<aqu> $$1 = Lists.newArrayList();
      List<aqu> $$2 = this.q.x();
      ObjectIterator var3 = this.J.values().iterator();

      while (var3.hasNext()) {
         aqc.b $$3 = (aqc.b)var3.next();
         jt $$4 = $$3.e;
         jt $$5 = jt.a($$3.c);
         boolean $$6 = !Objects.equals($$4, $$5);
         if ($$6) {
            $$3.a($$2);
            brv $$7 = $$3.c;
            if ($$7 instanceof aqu) {
               $$1.add((aqu)$$7);
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
            aqc.b $$8 = (aqc.b)var3.next();
            $$8.a($$1);
         }
      }
   }

   public void a(brv $$0, zl<?> $$1) {
      aqc.b $$2 = (aqc.b)this.J.get($$0.al());
      if ($$2 != null) {
         $$2.a($$1);
      }
   }

   protected void b(brv $$0, zl<?> $$1) {
      aqc.b $$2 = (aqc.b)this.J.get($$0.al());
      if ($$2 != null) {
         $$2.b($$1);
      }
   }

   public void a(List<duy> $$0) {
      Map<aqu, List<dvi>> $$1 = new HashMap<>();

      for (duy $$2 : $$0) {
         dbh $$3 = $$2.g();
         dvi $$5;
         if ($$2 instanceof dvi $$4) {
            $$5 = $$4;
         } else {
            $$5 = this.q.c($$3.e, $$3.f);
         }

         for (aqu $$7 : this.a($$3, false)) {
            $$1.computeIfAbsent($$7, $$0x -> new ArrayList<>()).add($$5);
         }
      }

      $$1.forEach(($$0x, $$1x) -> $$0x.d.b(acn.a($$1x)));
   }

   protected cdr m() {
      return this.x;
   }

   public String n() {
      return this.H;
   }

   void a(dbh $$0, aqm $$1) {
      this.E.onChunkStatusChange($$0, $$1);
   }

   public void a(dbh $$0, int $$1) {
      int $$2 = $$1 + 1;
      dbh.a($$0, $$2).forEach($$0x -> {
         aqa $$1x = this.b($$0x.a());
         if ($$1x != null) {
            $$1x.a(this.r.a($$0x.e, $$0x.f));
         }
      });
   }

   class a extends aql {
      protected a(Executor $$0, Executor $$1) {
         super($$0, $$1);
      }

      @Override
      protected boolean a(long $$0) {
         return aqc.this.y.contains($$0);
      }

      @Nullable
      @Override
      protected aqa b(long $$0) {
         return aqc.this.a($$0);
      }

      @Nullable
      @Override
      protected aqa a(long $$0, int $$1, @Nullable aqa $$2, int $$3) {
         return aqc.this.a($$0, $$1, $$2, $$3);
      }
   }

   class b {
      final aqs b;
      final brv c;
      private final int d;
      jt e;
      private final Set<arw> f = Sets.newIdentityHashSet();

      public b(brv $$0, int $$1, int $$2, boolean $$3) {
         this.b = new aqs(aqc.this.q, $$0, $$2, $$3, this::a);
         this.c = $$0;
         this.d = $$1;
         this.e = jt.a($$0);
      }

      @Override
      public boolean equals(Object $$0) {
         return $$0 instanceof aqc.b ? ((aqc.b)$$0).c.al() == this.c.al() : false;
      }

      @Override
      public int hashCode() {
         return this.c.al();
      }

      public void a(zl<?> $$0) {
         for (arw $$1 : this.f) {
            $$1.b($$0);
         }
      }

      public void b(zl<?> $$0) {
         this.a($$0);
         if (this.c instanceof aqu) {
            ((aqu)this.c).d.b($$0);
         }
      }

      public void a() {
         for (arw $$0 : this.f) {
            this.b.a($$0.p());
         }
      }

      public void a(aqu $$0) {
         if (this.f.remove($$0.d)) {
            this.b.a($$0);
         }
      }

      public void b(aqu $$0) {
         if ($$0 != this.c) {
            ewu $$1 = $$0.ds().d(this.c.ds());
            int $$2 = aqc.this.b($$0);
            double $$3 = (double)Math.min(this.b(), $$2 * 16);
            double $$4 = $$1.c * $$1.c + $$1.e * $$1.e;
            double $$5 = $$3 * $$3;
            boolean $$6 = $$4 <= $$5 && this.c.a($$0) && aqc.this.a($$0, this.c.dw().e, this.c.dw().f);
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
         return aqc.this.q.o().b($$0);
      }

      private int b() {
         int $$0 = this.d;

         for (brv $$1 : this.c.db()) {
            int $$2 = $$1.ak().o() * 16;
            if ($$2 > $$0) {
               $$0 = $$2;
            }
         }

         return this.a($$0);
      }

      public void a(List<aqu> $$0) {
         for (aqu $$1 : $$0) {
            this.b($$1);
         }
      }
   }
}
