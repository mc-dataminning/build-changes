import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.google.common.collect.Sets;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet;
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
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.slf4j.Logger;

public class aqu extends edv implements aqs.b, arf {
   private static final aqv<List<ecl>> f = aqv.a("Unloaded chunks found in range");
   private static final CompletableFuture<aqv<List<ecl>>> g = CompletableFuture.completedFuture(f);
   private static final byte h = -1;
   private static final byte i = 0;
   private static final byte j = 1;
   private static final Logger k = LogUtils.getLogger();
   private static final int l = 200;
   private static final int m = 20;
   private static final int n = 10000;
   private static final int o = 128;
   public static final int a = 2;
   public static final int b = 32;
   public static final int c = aqt.a(are.d);
   private final Long2ObjectLinkedOpenHashMap<aqs> p = new Long2ObjectLinkedOpenHashMap();
   private volatile Long2ObjectLinkedOpenHashMap<aqs> q = this.p.clone();
   private final Long2ObjectLinkedOpenHashMap<aqs> r = new Long2ObjectLinkedOpenHashMap();
   private final List<aqr> s = new ArrayList<>();
   final arq t;
   private final aru u;
   private final bsu<Runnable> v;
   private final ehb w;
   private final ecn x;
   private final Supplier<eyw> y;
   private final dke z;
   private final cil A;
   final LongSet B = new LongOpenHashSet();
   private boolean C;
   private final aqw D;
   private final aqw E;
   private final asa F;
   private final ees G;
   private final aqu.a H;
   private final AtomicInteger I = new AtomicInteger();
   private final String J;
   private final arj K = new arj();
   private final Int2ObjectMap<aqu.b> L = new Int2ObjectOpenHashMap();
   private final Long2ByteMap M = new Long2ByteOpenHashMap();
   private final Long2LongMap N = new Long2LongOpenHashMap();
   private final LongSet O = new LongLinkedOpenHashSet();
   private final Queue<Runnable> P = Queues.newConcurrentLinkedQueue();
   private final AtomicInteger Q = new AtomicInteger();
   private int R;
   private final edr S;

   public aqu(
      arq $$0,
      ezc.c $$1,
      DataFixer $$2,
      evl $$3,
      Executor $$4,
      bsu<Runnable> $$5,
      ecy $$6,
      ecm $$7,
      asa $$8,
      ees $$9,
      Supplier<eyw> $$10,
      dke $$11,
      int $$12,
      boolean $$13
   ) {
      super(new eee($$1.f(), $$0.aj(), "chunk"), $$1.a($$0.aj()).resolve("region"), $$2, $$13);
      Path $$14 = $$1.a($$0.aj());
      this.J = $$14.getFileName().toString();
      this.t = $$0;
      jt $$15 = $$0.F_();
      long $$16 = $$0.E();
      if ($$7 instanceof egq $$17) {
         this.w = ehb.a($$17.h().a(), $$15.f(mh.aY), $$16);
      } else {
         this.w = ehb.a(egs.e(), $$15.f(mh.aY), $$16);
      }

      this.x = $$7.a($$15.f(mh.bd), this.w, $$16);
      this.v = $$5;
      bsv $$18 = new bsv($$4, "worldgen");
      this.F = $$8;
      this.G = $$9;
      bsv $$19 = new bsv($$4, "light");
      this.D = new aqw($$18, $$4);
      this.E = new aqw($$19, $$4);
      this.u = new aru($$6, this, this.t.B_().g(), $$19, this.E);
      this.H = new aqu.a($$11, $$4, $$5);
      this.y = $$10;
      this.z = $$11;
      this.A = new cil(new eee($$1.f(), $$0.aj(), "poi"), $$14.resolve("poi"), $$2, $$13, $$15, $$0.p(), $$0);
      this.a($$12);
      this.S = new edr($$0, $$7, $$3, this.u, $$5, this::f);
   }

   private void f(dio $$0) {
      this.O.add($$0.a());
   }

   protected ecm a() {
      return this.S.b();
   }

   protected ecn b() {
      return this.x;
   }

   protected ehb c() {
      return this.w;
   }

   boolean a(arr $$0, int $$1, int $$2) {
      return $$0.V().a($$1, $$2) && !$$0.f.g.a(dio.c($$1, $$2));
   }

   private boolean b(arr $$0, int $$1, int $$2) {
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

   protected aru d() {
      return this.u;
   }

   @Nullable
   protected aqs a(long $$0) {
      return (aqs)this.p.get($$0);
   }

   @Nullable
   protected aqs b(long $$0) {
      return (aqs)this.q.get($$0);
   }

   protected IntSupplier c(long $$0) {
      return () -> {
         aqs $$1 = this.b($$0);
         return $$1 == null ? aqx.a - 1 : Math.min($$1.k(), aqx.a - 1);
      };
   }

   public String a(dio $$0) {
      aqs $$1 = this.b($$0.a());
      if ($$1 == null) {
         return "null";
      } else {
         String $$2 = $$1.j() + "\n";
         edm $$3 = $$1.u();
         ecl $$4 = $$1.p();
         if ($$3 != null) {
            $$2 = $$2 + "St: §" + $$3.b() + $$3 + "§r\n";
         }

         if ($$4 != null) {
            $$2 = $$2 + "Ch: §" + $$4.n().b() + $$4.n() + "§r\n";
         }

         are $$5 = $$1.s();
         $$2 = $$2 + '§' + $$5.ordinal() + $$5;
         return $$2 + "§r";
      }
   }

   private CompletableFuture<aqv<List<ecl>>> a(aqs $$0, int $$1, IntFunction<edm> $$2) {
      if ($$1 == 0) {
         edm $$3 = $$2.apply(0);
         return $$0.a($$3, this).thenApply($$0x -> $$0x.a(List::of));
      } else {
         int $$4 = azm.h($$1 * 2 + 1);
         List<CompletableFuture<aqv<ecl>>> $$5 = new ArrayList<>($$4);
         dio $$6 = $$0.r();

         for (int $$7 = -$$1; $$7 <= $$1; $$7++) {
            for (int $$8 = -$$1; $$8 <= $$1; $$8++) {
               int $$9 = Math.max(Math.abs($$8), Math.abs($$7));
               long $$10 = dio.c($$6.h + $$8, $$6.i + $$7);
               aqs $$11 = this.a($$10);
               if ($$11 == null) {
                  return g;
               }

               edm $$12 = $$2.apply($$9);
               $$5.add($$11.a($$12, this));
            }
         }

         return ag.d($$5).thenApply($$0x -> {
            List<ecl> $$1x = new ArrayList<>($$0x.size());

            for (aqv<ecl> $$2x : $$0x) {
               if ($$2x == null) {
                  throw this.a(new IllegalStateException("At least one of the chunk futures were null"), "n/a");
               }

               ecl $$3 = $$2x.b(null);
               if ($$3 == null) {
                  return f;
               }

               $$1x.add($$3);
            }

            return aqv.a($$1x);
         });
      }
   }

   public aa a(IllegalStateException $$0, String $$1) {
      StringBuilder $$2 = new StringBuilder();
      Consumer<aqs> $$3 = $$1x -> $$1x.t().forEach($$2x -> {
            edm $$3x = (edm)$$2x.getFirst();
            CompletableFuture<aqv<ecl>> $$4x = (CompletableFuture<aqv<ecl>>)$$2x.getSecond();
            if ($$4x != null && $$4x.isDone() && $$4x.join() == null) {
               $$2.append($$1x.r()).append(" - status: ").append($$3x).append(" future: ").append($$4x).append(System.lineSeparator());
            }
         });
      $$2.append("Updating:").append(System.lineSeparator());
      this.p.values().forEach($$3);
      $$2.append("Visible:").append(System.lineSeparator());
      this.q.values().forEach($$3);
      p $$4 = p.a($$0, "Chunk loading");
      q $$5 = $$4.a("Chunk loading");
      $$5.a("Details", $$1);
      $$5.a("Futures", $$2);
      return new aa($$4);
   }

   public CompletableFuture<aqv<ecv>> a(aqs $$0) {
      return this.a($$0, 2, $$0x -> edm.n).thenApply($$0x -> $$0x.a($$0xx -> (ecv)$$0xx.get($$0xx.size() / 2)));
   }

   @Nullable
   aqs a(long $$0, int $$1, @Nullable aqs $$2, int $$3) {
      if (!aqt.f($$3) && !aqt.f($$1)) {
         return $$2;
      } else {
         if ($$2 != null) {
            $$2.a($$1);
         }

         if ($$2 != null) {
            if (!aqt.f($$1)) {
               this.B.add($$0);
            } else {
               this.B.remove($$0);
            }
         }

         if (aqt.f($$1) && $$2 == null) {
            $$2 = (aqs)this.r.remove($$0);
            if ($$2 != null) {
               $$2.a($$1);
            } else {
               $$2 = new aqs(new dio($$0), $$1, this.t, this.u, this::a, this);
            }

            this.p.put($$0, $$2);
            this.C = true;
         }

         return $$2;
      }
   }

   private void a(dio $$0, IntSupplier $$1, int $$2, IntConsumer $$3) {
      this.D.onLevelChange($$0, $$1, $$2, $$3);
      this.E.onLevelChange($$0, $$1, $$2, $$3);
   }

   @Override
   public void close() throws IOException {
      try {
         this.D.close();
         this.E.close();
         this.A.close();
      } finally {
         super.close();
      }
   }

   protected void a(boolean $$0) {
      if ($$0) {
         List<aqs> $$1 = this.q.values().stream().filter(aqs::l).peek(aqs::m).toList();
         MutableBoolean $$2 = new MutableBoolean();

         do {
            $$2.setFalse();
            $$1.stream().map($$0x -> {
               this.v.b($$0x::h);
               return $$0x.p();
            }).filter($$0x -> $$0x instanceof ecu || $$0x instanceof ecv).filter(this::a).forEach($$1x -> $$2.setTrue());
         } while ($$2.isTrue());

         this.A.a();
         this.b(() -> true);
         this.o();
      } else {
         this.N.clear();
         long $$3 = ag.c();
         ObjectIterator var4 = this.q.values().iterator();

         while (var4.hasNext()) {
            aqs $$4 = (aqs)var4.next();
            this.a($$4, $$3);
         }
      }
   }

   protected void a(BooleanSupplier $$0) {
      bqq $$1 = bqp.a();
      $$1.a("poi");
      this.A.a($$0);
      $$1.b("chunk_unload");
      if (!this.t.v()) {
         this.b($$0);
      }

      $$1.c();
   }

   public boolean e() {
      return this.u.I_()
         || !this.r.isEmpty()
         || !this.p.isEmpty()
         || this.A.b()
         || !this.B.isEmpty()
         || !this.P.isEmpty()
         || this.D.a()
         || this.E.a()
         || this.H.d();
   }

   private void b(BooleanSupplier $$0) {
      for (LongIterator $$1 = this.B.iterator(); $$1.hasNext(); $$1.remove()) {
         long $$2 = $$1.nextLong();
         aqs $$3 = (aqs)this.p.get($$2);
         if ($$3 != null) {
            this.p.remove($$2);
            this.r.put($$2, $$3);
            this.C = true;
            this.a($$2, $$3);
         }
      }

      int $$4 = Math.max(0, this.P.size() - 2000);

      Runnable $$5;
      while (($$4 > 0 || $$0.getAsBoolean()) && ($$5 = this.P.poll()) != null) {
         $$4--;
         $$5.run();
      }

      this.c($$0);
   }

   private void c(BooleanSupplier $$0) {
      long $$1 = ag.c();
      int $$2 = 0;
      LongIterator $$3 = this.O.iterator();

      while ($$2 < 20 && this.Q.get() < 128 && $$0.getAsBoolean() && $$3.hasNext()) {
         long $$4 = $$3.nextLong();
         aqs $$5 = (aqs)this.q.get($$4);
         ecl $$6 = $$5 != null ? $$5.p() : null;
         if ($$6 == null || !$$6.k()) {
            $$3.remove();
         } else if (this.a($$5, $$1)) {
            $$2++;
            $$3.remove();
         }
      }
   }

   private void a(long $$0, aqs $$1) {
      CompletableFuture<?> $$2 = $$1.g();
      $$2.thenRunAsync(() -> {
         CompletableFuture<?> $$3 = $$1.g();
         if ($$3 != $$2) {
            this.a($$0, $$1);
         } else {
            ecl $$4 = $$1.p();
            if (this.r.remove($$0, $$1) && $$4 != null) {
               if ($$4 instanceof ecv $$5) {
                  $$5.b(false);
               }

               this.a($$4);
               if ($$4 instanceof ecv $$6) {
                  this.t.b($$6);
               }

               this.u.a($$4.f());
               this.u.b();
               this.F.a($$4.f(), null);
               this.N.remove($$4.f().a());
            }
         }
      }, this.P::add).whenComplete(($$1x, $$2x) -> {
         if ($$2x != null) {
            k.error("Failed to save chunk {}", $$1.r(), $$2x);
         }
      });
   }

   protected boolean f() {
      if (!this.C) {
         return false;
      } else {
         this.q = this.p.clone();
         this.C = false;
         return true;
      }
   }

   private CompletableFuture<ecl> g(dio $$0) {
      CompletableFuture<Optional<eeg>> $$1 = this.k($$0).thenApplyAsync($$1x -> $$1x.map($$1xx -> {
            eeg $$2x = eeg.a(this.t, this.t.F_(), $$1xx);
            if ($$2x == null) {
               k.error("Chunk file at {} is missing level data, skipping", $$0);
            }

            return $$2x;
         }), ag.h().a("parseChunk"));
      CompletableFuture<?> $$2 = this.A.a($$0);
      return $$1.<Object, Optional>thenCombine((CompletionStage<? extends Object>)$$2, ($$0x, $$1x) -> $$0x).thenApplyAsync($$1x -> {
         bqp.a().f("chunkLoad");
         if ($$1x.isPresent()) {
            ecl $$2x = ((eeg)$$1x.get()).a(this.t, this.A, this.q(), $$0);
            this.a($$0, $$2x.n().d());
            return $$2x;
         } else {
            return this.h($$0);
         }
      }, this.v).exceptionallyAsync($$1x -> this.a($$1x, $$0), this.v);
   }

   private ecl a(Throwable $$0, dio $$1) {
      Throwable $$3 = $$0 instanceof CompletionException $$2 ? $$2.getCause() : $$0;
      Throwable $$5 = $$3 instanceof aa $$4 ? $$4.getCause() : $$3;
      boolean $$6 = $$5 instanceof Error;
      boolean $$7 = $$5 instanceof IOException || $$5 instanceof uk;
      if (!$$6 && $$7) {
         this.t.p().a($$5, this.q(), $$1);
         return this.h($$1);
      } else {
         p $$8 = p.a($$0, "Exception loading chunk");
         q $$9 = $$8.a("Chunk being loaded");
         $$9.a("pos", $$1);
         this.i($$1);
         throw new aa($$8);
      }
   }

   private ecl h(dio $$0) {
      this.i($$0);
      return new edf($$0, edi.a, this.t, this.t.F_().f(mh.aG), null);
   }

   private void i(dio $$0) {
      this.M.put($$0.a(), (byte)-1);
   }

   private byte a(dio $$0, edq $$1) {
      return this.M.put($$0.a(), (byte)($$1 == edq.a ? -1 : 1));
   }

   @Override
   public arg d(long $$0) {
      aqs $$1 = (aqs)this.p.get($$0);
      $$1.n();
      return $$1;
   }

   @Override
   public void a(arg $$0) {
      $$0.o();
   }

   @Override
   public CompletableFuture<ecl> a(arg $$0, edp $$1, bai<arg> $$2) {
      dio $$3 = $$0.r();
      if ($$1.a() == edm.c) {
         return this.g($$3);
      } else {
         try {
            arg $$4 = $$2.a($$3.h, $$3.i);
            ecl $$5 = $$4.a($$1.a().c());
            if ($$5 == null) {
               throw new IllegalStateException("Parent chunk missing");
            } else {
               CompletableFuture<ecl> $$6 = $$1.a(this.S, $$2, $$5);
               this.F.a($$3, $$1.a());
               return $$6;
            }
         } catch (Exception var8) {
            var8.getStackTrace();
            p $$8 = p.a(var8, "Exception generating new chunk");
            q $$9 = $$8.a("Chunk to be generated");
            $$9.a("Status being generated", () -> $$1.a().f());
            $$9.a("Location", String.format(Locale.ROOT, "%d,%d", $$3.h, $$3.i));
            $$9.a("Position hash", dio.c($$3.h, $$3.i));
            $$9.a("Generator", this.a());
            this.v.execute(() -> {
               throw new aa($$8);
            });
            throw new aa($$8);
         }
      }
   }

   @Override
   public aqr a(edm $$0, dio $$1) {
      aqr $$2 = aqr.a(this, $$0, $$1);
      this.s.add($$2);
      return $$2;
   }

   private void a(aqr $$0) {
      arg $$1 = $$0.c();
      this.D.a(() -> {
         CompletableFuture<?> $$1x = $$0.a();
         if ($$1x != null) {
            $$1x.thenRun(() -> this.a($$0));
         }
      }, $$1.r().a(), $$1::k);
   }

   @Override
   public void g() {
      this.s.forEach(this::a);
      this.s.clear();
   }

   public CompletableFuture<aqv<ecv>> b(aqs $$0) {
      CompletableFuture<aqv<List<ecl>>> $$1 = this.a($$0, 1, $$0x -> edm.n);
      CompletableFuture<aqv<ecv>> $$2 = $$1.thenApplyAsync($$1x -> $$1x.a($$1xx -> {
            ecv $$2x = (ecv)$$1xx.get($$1xx.size() / 2);
            $$2x.a(this.t);
            this.t.c($$2x);
            CompletableFuture<?> $$3 = $$0.f();
            if ($$3.isDone()) {
               this.a($$0, $$2x);
            } else {
               $$3.thenAcceptAsync($$2xx -> this.a($$0, $$2x), this.v);
            }

            return $$2x;
         }), this.v);
      $$2.handle(($$0x, $$1x) -> {
         this.I.getAndIncrement();
         return null;
      });
      return $$2;
   }

   private void a(aqs $$0, ecv $$1) {
      dio $$2 = $$1.f();

      for (arr $$3 : this.K.a()) {
         if ($$3.V().a($$2)) {
            a($$3, $$1);
         }
      }

      this.t.m().a($$0);
   }

   public CompletableFuture<aqv<ecv>> c(aqs $$0) {
      return this.a($$0, 1, aqt::b).thenApply($$0x -> $$0x.a($$0xx -> (ecv)$$0xx.get($$0xx.size() / 2)));
   }

   public int h() {
      return this.I.get();
   }

   private boolean a(aqs $$0, long $$1) {
      if ($$0.l() && $$0.h()) {
         ecl $$2 = $$0.p();
         if (!($$2 instanceof ecu) && !($$2 instanceof ecv)) {
            return false;
         } else if (!$$2.k()) {
            return false;
         } else {
            long $$3 = $$2.f().a();
            long $$4 = this.N.getOrDefault($$3, -1L);
            if ($$1 < $$4) {
               return false;
            } else {
               boolean $$5 = this.a($$2);
               $$0.m();
               if ($$5) {
                  this.N.put($$3, $$1 + 10000L);
               }

               return $$5;
            }
         }
      } else {
         return false;
      }
   }

   private boolean a(ecl $$0) {
      this.A.b($$0.f());
      if (!$$0.j()) {
         return false;
      } else {
         dio $$1 = $$0.f();

         try {
            edm $$2 = $$0.n();
            if ($$2.d() != edq.b) {
               if (this.j($$1)) {
                  return false;
               }

               if ($$2 == edm.c && $$0.g().values().stream().noneMatch(erq::b)) {
                  return false;
               }
            }

            bqp.a().f("chunkSave");
            this.Q.incrementAndGet();
            eeg $$3 = eeg.a(this.t, $$0);
            CompletableFuture<tz> $$4 = CompletableFuture.supplyAsync($$3::a, ag.h());
            this.a($$1, $$4::join).handle(($$1x, $$2x) -> {
               if ($$2x != null) {
                  this.t.p().b($$2x, this.q(), $$1);
               }

               this.Q.decrementAndGet();
               return null;
            });
            this.a($$1, $$2.d());
            return true;
         } catch (Exception var6) {
            this.t.p().b(var6, this.q(), $$1);
            return false;
         }
      }
   }

   private boolean j(dio $$0) {
      byte $$1 = this.M.get($$0.a());
      if ($$1 != 0) {
         return $$1 == 1;
      } else {
         tz $$2;
         try {
            $$2 = this.k($$0).join().orElse(null);
            if ($$2 == null) {
               this.i($$0);
               return false;
            }
         } catch (Exception var5) {
            k.error("Failed to read chunk {}", $$0, var5);
            this.i($$0);
            return false;
         }

         edq $$5 = eeg.a($$2).d();
         return this.a($$0, $$5) == 1;
      }
   }

   protected void a(int $$0) {
      int $$1 = azm.a($$0, 2, 32);
      if ($$1 != this.R) {
         this.R = $$1;
         this.H.a(this.R);

         for (arr $$2 : this.K.a()) {
            this.e($$2);
         }
      }
   }

   int b(arr $$0) {
      return azm.a($$0.F(), 2, this.R);
   }

   private void a(arr $$0, dio $$1) {
      ecv $$2 = this.e($$1.a());
      if ($$2 != null) {
         a($$0, $$2);
      }
   }

   private static void a(arr $$0, ecv $$1) {
      $$0.f.g.a($$1);
   }

   private static void b(arr $$0, dio $$1) {
      $$0.f.g.a($$0, $$1);
   }

   @Nullable
   public ecv e(long $$0) {
      aqs $$1 = this.b($$0);
      return $$1 == null ? null : $$1.e();
   }

   public int i() {
      return this.q.size();
   }

   public ard j() {
      return this.H;
   }

   protected Iterable<aqs> k() {
      return Iterables.unmodifiableIterable(this.q.values());
   }

   void a(Writer $$0) throws IOException {
      ayl $$1 = ayl.a()
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
      ObjectBidirectionalIterator var3 = this.q.long2ObjectEntrySet().iterator();

      while (var3.hasNext()) {
         Entry<aqs> $$2 = (Entry<aqs>)var3.next();
         long $$3 = $$2.getLongKey();
         dio $$4 = new dio($$3);
         aqs $$5 = (aqs)$$2.getValue();
         Optional<ecl> $$6 = Optional.ofNullable($$5.p());
         Optional<ecv> $$7 = $$6.flatMap($$0x -> $$0x instanceof ecv ? Optional.of((ecv)$$0x) : Optional.empty());
         $$1.a(
            $$4.h,
            $$4.i,
            $$5.j(),
            $$6.isPresent(),
            $$6.map(ecl::n).orElse(null),
            $$7.map(ecv::F).orElse(null),
            a($$5.c()),
            a($$5.a()),
            a($$5.b()),
            this.z.b($$3, false),
            this.b($$4),
            $$7.<Integer>map($$0x -> $$0x.I().size()).orElse(0),
            this.z.b($$3, true),
            this.H.a($$3, true),
            $$7.<Integer>map($$0x -> $$0x.q().a()).orElse(0),
            $$7.<Integer>map($$0x -> $$0x.r().a()).orElse(0)
         );
      }
   }

   private static String a(CompletableFuture<aqv<ecv>> $$0) {
      try {
         aqv<ecv> $$1 = $$0.getNow(null);
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

   private CompletableFuture<Optional<tz>> k(dio $$0) {
      return this.d($$0).thenApplyAsync($$0x -> $$0x.map(this::b), ag.h().a("upgradeChunk"));
   }

   private tz b(tz $$0) {
      return this.a(this.t.aj(), this.y, $$0, this.a().c());
   }

   void a(List<ecv> $$0) {
      LongIterator $$1 = this.H.b();

      while ($$1.hasNext()) {
         aqs $$2 = (aqs)this.q.get($$1.nextLong());
         if ($$2 != null) {
            ecv $$3 = $$2.d();
            if ($$3 != null && this.l($$2.r())) {
               $$0.add($$3);
            }
         }
      }
   }

   void a(Consumer<ecv> $$0) {
      this.H.a($$1 -> {
         aqs $$2 = (aqs)this.q.get($$1);
         if ($$2 != null) {
            ecv $$3 = $$2.d();
            if ($$3 != null) {
               $$0.accept($$3);
            }
         }
      });
   }

   boolean b(dio $$0) {
      bas $$1 = this.H.e($$0.a());
      return $$1 == bas.c ? this.l($$0) : $$1.a(true);
   }

   private boolean l(dio $$0) {
      for (arr $$1 : this.K.a()) {
         if (this.c($$1, $$0)) {
            return true;
         }
      }

      return false;
   }

   public List<arr> c(dio $$0) {
      long $$1 = $$0.a();
      if (!this.H.e($$1).a(true)) {
         return List.of();
      } else {
         Builder<arr> $$2 = ImmutableList.builder();

         for (arr $$3 : this.K.a()) {
            if (this.c($$3, $$0)) {
               $$2.add($$3);
            }
         }

         return $$2.build();
      }
   }

   private boolean c(arr $$0, dio $$1) {
      if ($$0.V_()) {
         return false;
      } else {
         double $$2 = a($$1, $$0.ds());
         return $$2 < 16384.0;
      }
   }

   private static double a(dio $$0, fex $$1) {
      double $$2 = (double)jy.a($$0.h, 8);
      double $$3 = (double)jy.a($$0.i, 8);
      double $$4 = $$2 - $$1.d;
      double $$5 = $$3 - $$1.f;
      return $$4 * $$4 + $$5 * $$5;
   }

   private boolean c(arr $$0) {
      return $$0.V_() && !this.t.O().c(djd.s);
   }

   void a(arr $$0, boolean $$1) {
      boolean $$2 = this.c($$0);
      boolean $$3 = this.K.d($$0);
      if ($$1) {
         this.K.a($$0, $$2);
         this.d($$0);
         if (!$$2) {
            this.H.a(jy.a($$0), $$0);
         }

         $$0.a(aqz.a);
         this.e($$0);
      } else {
         jy $$4 = $$0.U();
         this.K.a($$0);
         if (!$$3) {
            this.H.b($$4, $$0);
         }

         this.a($$0, aqz.a);
      }
   }

   private void d(arr $$0) {
      jy $$1 = jy.a($$0);
      $$0.a($$1);
   }

   public void a(arr $$0) {
      ObjectIterator $$2 = this.L.values().iterator();

      while ($$2.hasNext()) {
         aqu.b $$1 = (aqu.b)$$2.next();
         if ($$1.c == $$0) {
            $$1.a(this.t.z());
         } else {
            $$1.b($$0);
         }
      }

      jy $$2x = $$0.U();
      jy $$3 = jy.a($$0);
      boolean $$4 = this.K.e($$0);
      boolean $$5 = this.c($$0);
      boolean $$6 = $$2x.s() != $$3.s();
      if ($$6 || $$4 != $$5) {
         this.d($$0);
         if (!$$4) {
            this.H.b($$2x, $$0);
         }

         if (!$$5) {
            this.H.a($$3, $$0);
         }

         if (!$$4 && $$5) {
            this.K.b($$0);
         }

         if ($$4 && !$$5) {
            this.K.c($$0);
         }

         this.e($$0);
      }
   }

   private void e(arr $$0) {
      dio $$1 = $$0.dw();
      int $$2 = this.b($$0);
      if ($$0.V() instanceof aqz.a $$3 && $$3.a().equals($$1) && $$3.b() == $$2) {
         return;
      }

      this.a($$0, aqz.a($$1, $$2));
   }

   private void a(arr $$0, aqz $$1) {
      if ($$0.dU() == this.t) {
         aqz $$2 = $$0.V();
         if ($$1 instanceof aqz.a $$3 && (!($$2 instanceof aqz.a $$4) || !$$4.a().equals($$3.a()))) {
            $$0.f.b(new aey($$3.a().h, $$3.a().i));
         }

         aqz.a($$2, $$1, $$1x -> this.a($$0, $$1x), $$1x -> b($$0, $$1x));
         $$0.a($$1);
      }
   }

   @Override
   public List<arr> a(dio $$0, boolean $$1) {
      Set<arr> $$2 = this.K.a();
      Builder<arr> $$3 = ImmutableList.builder();

      for (arr $$4 : $$2) {
         if ($$1 && this.b($$4, $$0.h, $$0.i) || !$$1 && this.a($$4, $$0.h, $$0.i)) {
            $$3.add($$4);
         }
      }

      return $$3.build();
   }

   protected void a(bwi $$0) {
      if (!($$0 instanceof cme)) {
         bwr<?> $$1 = $$0.an();
         int $$2 = $$1.o() * 16;
         if ($$2 != 0) {
            int $$3 = $$1.p();
            if (this.L.containsKey($$0.ao())) {
               throw (IllegalStateException)ag.b(new IllegalStateException("Entity is already tracked!"));
            } else {
               aqu.b $$4 = new aqu.b($$0, $$2, $$3, $$1.q());
               this.L.put($$0.ao(), $$4);
               $$4.a(this.t.z());
               if ($$0 instanceof arr $$5) {
                  this.a($$5, true);
                  ObjectIterator var7 = this.L.values().iterator();

                  while (var7.hasNext()) {
                     aqu.b $$6 = (aqu.b)var7.next();
                     if ($$6.c != $$5) {
                        $$6.b($$5);
                     }
                  }
               }
            }
         }
      }
   }

   protected void b(bwi $$0) {
      if ($$0 instanceof arr $$1) {
         this.a($$1, false);
         ObjectIterator var3 = this.L.values().iterator();

         while (var3.hasNext()) {
            aqu.b $$2 = (aqu.b)var3.next();
            $$2.a($$1);
         }
      }

      aqu.b $$3 = (aqu.b)this.L.remove($$0.ao());
      if ($$3 != null) {
         $$3.a();
      }
   }

   protected void l() {
      for (arr $$0 : this.K.a()) {
         this.e($$0);
      }

      List<arr> $$1 = Lists.newArrayList();
      List<arr> $$2 = this.t.z();
      ObjectIterator var3 = this.L.values().iterator();

      while (var3.hasNext()) {
         aqu.b $$3 = (aqu.b)var3.next();
         jy $$4 = $$3.e;
         jy $$5 = jy.a($$3.c);
         boolean $$6 = !Objects.equals($$4, $$5);
         if ($$6) {
            $$3.a($$2);
            bwi $$7 = $$3.c;
            if ($$7 instanceof arr) {
               $$1.add((arr)$$7);
            }

            $$3.e = $$5;
         }

         if ($$6 || this.H.c($$5.r().a())) {
            $$3.b.a();
         }
      }

      if (!$$1.isEmpty()) {
         var3 = this.L.values().iterator();

         while (var3.hasNext()) {
            aqu.b $$8 = (aqu.b)var3.next();
            $$8.a($$1);
         }
      }
   }

   public void a(bwi $$0, zf<?> $$1) {
      aqu.b $$2 = (aqu.b)this.L.get($$0.ao());
      if ($$2 != null) {
         $$2.a($$1);
      }
   }

   protected void b(bwi $$0, zf<?> $$1) {
      aqu.b $$2 = (aqu.b)this.L.get($$0.ao());
      if ($$2 != null) {
         $$2.b($$1);
      }
   }

   public void b(List<ecl> $$0) {
      Map<arr, List<ecv>> $$1 = new HashMap<>();

      for (ecl $$2 : $$0) {
         dio $$3 = $$2.f();
         ecv $$5;
         if ($$2 instanceof ecv $$4) {
            $$5 = $$4;
         } else {
            $$5 = this.t.d($$3.h, $$3.i);
         }

         for (arr $$7 : this.a($$3, false)) {
            $$1.computeIfAbsent($$7, $$0x -> new ArrayList<>()).add($$5);
         }
      }

      $$1.forEach(($$0x, $$1x) -> $$0x.f.b(acj.a($$1x)));
   }

   protected cil m() {
      return this.A;
   }

   public String n() {
      return this.J;
   }

   void a(dio $$0, are $$1) {
      this.G.onChunkStatusChange($$0, $$1);
   }

   public void a(dio $$0, int $$1) {
      int $$2 = $$1 + 1;
      dio.a($$0, $$2).forEach($$0x -> {
         aqs $$1x = this.b($$0x.a());
         if ($$1x != null) {
            $$1x.a(this.u.a($$0x.h, $$0x.i));
         }
      });
   }

   class a extends ard {
      protected a(final dke $$0, final Executor $$1, final Executor $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      protected boolean a(long $$0) {
         return aqu.this.B.contains($$0);
      }

      @Nullable
      @Override
      protected aqs b(long $$0) {
         return aqu.this.a($$0);
      }

      @Nullable
      @Override
      protected aqs a(long $$0, int $$1, @Nullable aqs $$2, int $$3) {
         return aqu.this.a($$0, $$1, $$2, $$3);
      }
   }

   class b {
      final aro b;
      final bwi c;
      private final int d;
      jy e;
      private final Set<asw> f = Sets.newIdentityHashSet();

      public b(final bwi $$0, final int $$1, final int $$2, final boolean $$3) {
         this.b = new aro(aqu.this.t, $$0, $$2, $$3, this::a, this::a);
         this.c = $$0;
         this.d = $$1;
         this.e = jy.a($$0);
      }

      @Override
      public boolean equals(Object $$0) {
         return $$0 instanceof aqu.b ? ((aqu.b)$$0).c.ao() == this.c.ao() : false;
      }

      @Override
      public int hashCode() {
         return this.c.ao();
      }

      public void a(zf<?> $$0) {
         for (asw $$1 : this.f) {
            $$1.b($$0);
         }
      }

      public void a(zf<?> $$0, List<UUID> $$1) {
         for (asw $$2 : this.f) {
            if (!$$1.contains($$2.o().cF())) {
               $$2.b($$0);
            }
         }
      }

      public void b(zf<?> $$0) {
         this.a($$0);
         if (this.c instanceof arr) {
            ((arr)this.c).f.b($$0);
         }
      }

      public void a() {
         for (asw $$0 : this.f) {
            this.b.a($$0.o());
         }
      }

      public void a(arr $$0) {
         if (this.f.remove($$0.f)) {
            this.b.a($$0);
         }
      }

      public void b(arr $$0) {
         if ($$0 != this.c) {
            fex $$1 = $$0.ds().d(this.c.ds());
            int $$2 = aqu.this.b($$0);
            double $$3 = (double)Math.min(this.b(), $$2 * 16);
            double $$4 = $$1.d * $$1.d + $$1.f * $$1.f;
            double $$5 = $$3 * $$3;
            boolean $$6 = $$4 <= $$5 && this.c.a($$0) && aqu.this.a($$0, this.c.dw().h, this.c.dw().i);
            if ($$6) {
               if (this.f.add($$0.f)) {
                  this.b.b($$0);
               }
            } else if (this.f.remove($$0.f)) {
               this.b.a($$0);
            }
         }
      }

      private int a(int $$0) {
         return aqu.this.t.p().b($$0);
      }

      private int b() {
         int $$0 = this.d;

         for (bwi $$1 : this.c.db()) {
            int $$2 = $$1.an().o() * 16;
            if ($$2 > $$0) {
               $$0 = $$2;
            }
         }

         return this.a($$0);
      }

      public void a(List<arr> $$0) {
         for (arr $$1 : $$0) {
            this.b($$1);
         }
      }
   }
}
