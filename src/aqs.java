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

public class aqs extends ecv implements aqq.b, ard {
   private static final aqt<List<ebl>> f = aqt.a("Unloaded chunks found in range");
   private static final CompletableFuture<aqt<List<ebl>>> g = CompletableFuture.completedFuture(f);
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
   public static final int c = aqr.a(arc.d);
   private final Long2ObjectLinkedOpenHashMap<aqq> p = new Long2ObjectLinkedOpenHashMap();
   private volatile Long2ObjectLinkedOpenHashMap<aqq> q = this.p.clone();
   private final Long2ObjectLinkedOpenHashMap<aqq> r = new Long2ObjectLinkedOpenHashMap();
   private final List<aqp> s = new ArrayList<>();
   final aro t;
   private final ars u;
   private final bsn<Runnable> v;
   private final egb w;
   private final ebn x;
   private final Supplier<exv> y;
   private final djm z;
   private final cib A;
   final LongSet B = new LongOpenHashSet();
   private boolean C;
   private final aqu D;
   private final aqu E;
   private final ary F;
   private final eds G;
   private final aqs.a H;
   private final AtomicInteger I = new AtomicInteger();
   private final String J;
   private final arh K = new arh();
   private final Int2ObjectMap<aqs.b> L = new Int2ObjectOpenHashMap();
   private final Long2ByteMap M = new Long2ByteOpenHashMap();
   private final Long2LongMap N = new Long2LongOpenHashMap();
   private final LongSet O = new LongLinkedOpenHashSet();
   private final Queue<Runnable> P = Queues.newConcurrentLinkedQueue();
   private final AtomicInteger Q = new AtomicInteger();
   private int R;
   private final ecr S;

   public aqs(
      aro $$0,
      eyb.c $$1,
      DataFixer $$2,
      eul $$3,
      Executor $$4,
      bsn<Runnable> $$5,
      eby $$6,
      ebm $$7,
      ary $$8,
      eds $$9,
      Supplier<exv> $$10,
      djm $$11,
      int $$12,
      boolean $$13
   ) {
      super(new ede($$1.f(), $$0.aj(), "chunk"), $$1.a($$0.aj()).resolve("region"), $$2, $$13);
      Path $$14 = $$1.a($$0.aj());
      this.J = $$14.getFileName().toString();
      this.t = $$0;
      js $$15 = $$0.F_();
      long $$16 = $$0.E();
      if ($$7 instanceof efq $$17) {
         this.w = egb.a($$17.h().a(), $$15.f(mg.aW), $$16);
      } else {
         this.w = egb.a(efs.e(), $$15.f(mg.aW), $$16);
      }

      this.x = $$7.a($$15.f(mg.bb), this.w, $$16);
      this.v = $$5;
      bso $$18 = new bso($$4, "worldgen");
      this.F = $$8;
      this.G = $$9;
      bso $$19 = new bso($$4, "light");
      this.D = new aqu($$18, $$4);
      this.E = new aqu($$19, $$4);
      this.u = new ars($$6, this, this.t.B_().g(), $$19, this.E);
      this.H = new aqs.a($$11, $$4, $$5);
      this.y = $$10;
      this.z = $$11;
      this.A = new cib(new ede($$1.f(), $$0.aj(), "poi"), $$14.resolve("poi"), $$2, $$13, $$15, $$0.p(), $$0);
      this.a($$12);
      this.S = new ecr($$0, $$7, $$3, this.u, $$5, this::f);
   }

   private void f(dhw $$0) {
      this.O.add($$0.a());
   }

   protected ebm a() {
      return this.S.b();
   }

   protected ebn b() {
      return this.x;
   }

   protected egb c() {
      return this.w;
   }

   private static double a(dhw $$0, bwa $$1) {
      double $$2 = (double)jx.a($$0.h, 8);
      double $$3 = (double)jx.a($$0.i, 8);
      double $$4 = $$2 - $$1.dA();
      double $$5 = $$3 - $$1.dG();
      return $$4 * $$4 + $$5 * $$5;
   }

   boolean a(arp $$0, int $$1, int $$2) {
      return $$0.Y().a($$1, $$2) && !$$0.f.g.a(dhw.c($$1, $$2));
   }

   private boolean b(arp $$0, int $$1, int $$2) {
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

   protected ars d() {
      return this.u;
   }

   @Nullable
   protected aqq a(long $$0) {
      return (aqq)this.p.get($$0);
   }

   @Nullable
   protected aqq b(long $$0) {
      return (aqq)this.q.get($$0);
   }

   protected IntSupplier c(long $$0) {
      return () -> {
         aqq $$1 = this.b($$0);
         return $$1 == null ? aqv.a - 1 : Math.min($$1.k(), aqv.a - 1);
      };
   }

   public String a(dhw $$0) {
      aqq $$1 = this.b($$0.a());
      if ($$1 == null) {
         return "null";
      } else {
         String $$2 = $$1.j() + "\n";
         ecm $$3 = $$1.u();
         ebl $$4 = $$1.p();
         if ($$3 != null) {
            $$2 = $$2 + "St: §" + $$3.b() + $$3 + "§r\n";
         }

         if ($$4 != null) {
            $$2 = $$2 + "Ch: §" + $$4.n().b() + $$4.n() + "§r\n";
         }

         arc $$5 = $$1.s();
         $$2 = $$2 + '§' + $$5.ordinal() + $$5;
         return $$2 + "§r";
      }
   }

   private CompletableFuture<aqt<List<ebl>>> a(aqq $$0, int $$1, IntFunction<ecm> $$2) {
      if ($$1 == 0) {
         ecm $$3 = $$2.apply(0);
         return $$0.a($$3, this).thenApply($$0x -> $$0x.a(List::of));
      } else {
         int $$4 = azk.h($$1 * 2 + 1);
         List<CompletableFuture<aqt<ebl>>> $$5 = new ArrayList<>($$4);
         dhw $$6 = $$0.r();

         for (int $$7 = -$$1; $$7 <= $$1; $$7++) {
            for (int $$8 = -$$1; $$8 <= $$1; $$8++) {
               int $$9 = Math.max(Math.abs($$8), Math.abs($$7));
               long $$10 = dhw.c($$6.h + $$8, $$6.i + $$7);
               aqq $$11 = this.a($$10);
               if ($$11 == null) {
                  return g;
               }

               ecm $$12 = $$2.apply($$9);
               $$5.add($$11.a($$12, this));
            }
         }

         return af.d($$5).thenApply($$0x -> {
            List<ebl> $$1x = new ArrayList<>($$0x.size());

            for (aqt<ebl> $$2x : $$0x) {
               if ($$2x == null) {
                  throw this.a(new IllegalStateException("At least one of the chunk futures were null"), "n/a");
               }

               ebl $$3 = $$2x.b(null);
               if ($$3 == null) {
                  return f;
               }

               $$1x.add($$3);
            }

            return aqt.a($$1x);
         });
      }
   }

   public z a(IllegalStateException $$0, String $$1) {
      StringBuilder $$2 = new StringBuilder();
      Consumer<aqq> $$3 = $$1x -> $$1x.t().forEach($$2x -> {
            ecm $$3x = (ecm)$$2x.getFirst();
            CompletableFuture<aqt<ebl>> $$4x = (CompletableFuture<aqt<ebl>>)$$2x.getSecond();
            if ($$4x != null && $$4x.isDone() && $$4x.join() == null) {
               $$2.append($$1x.r()).append(" - status: ").append($$3x).append(" future: ").append($$4x).append(System.lineSeparator());
            }
         });
      $$2.append("Updating:").append(System.lineSeparator());
      this.p.values().forEach($$3);
      $$2.append("Visible:").append(System.lineSeparator());
      this.q.values().forEach($$3);
      o $$4 = o.a($$0, "Chunk loading");
      p $$5 = $$4.a("Chunk loading");
      $$5.a("Details", $$1);
      $$5.a("Futures", $$2);
      return new z($$4);
   }

   public CompletableFuture<aqt<ebv>> a(aqq $$0) {
      return this.a($$0, 2, $$0x -> ecm.n).thenApply($$0x -> $$0x.a($$0xx -> (ebv)$$0xx.get($$0xx.size() / 2)));
   }

   @Nullable
   aqq a(long $$0, int $$1, @Nullable aqq $$2, int $$3) {
      if (!aqr.f($$3) && !aqr.f($$1)) {
         return $$2;
      } else {
         if ($$2 != null) {
            $$2.a($$1);
         }

         if ($$2 != null) {
            if (!aqr.f($$1)) {
               this.B.add($$0);
            } else {
               this.B.remove($$0);
            }
         }

         if (aqr.f($$1) && $$2 == null) {
            $$2 = (aqq)this.r.remove($$0);
            if ($$2 != null) {
               $$2.a($$1);
            } else {
               $$2 = new aqq(new dhw($$0), $$1, this.t, this.u, this::a, this);
            }

            this.p.put($$0, $$2);
            this.C = true;
         }

         return $$2;
      }
   }

   private void a(dhw $$0, IntSupplier $$1, int $$2, IntConsumer $$3) {
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
         List<aqq> $$1 = this.q.values().stream().filter(aqq::l).peek(aqq::m).toList();
         MutableBoolean $$2 = new MutableBoolean();

         do {
            $$2.setFalse();
            $$1.stream().map($$0x -> {
               this.v.b($$0x::h);
               return $$0x.p();
            }).filter($$0x -> $$0x instanceof ebu || $$0x instanceof ebv).filter(this::a).forEach($$1x -> $$2.setTrue());
         } while ($$2.isTrue());

         this.A.a();
         this.b(() -> true);
         this.o();
      } else {
         this.N.clear();
         long $$3 = af.c();
         ObjectIterator var4 = this.q.values().iterator();

         while (var4.hasNext()) {
            aqq $$4 = (aqq)var4.next();
            this.a($$4, $$3);
         }
      }
   }

   protected void a(BooleanSupplier $$0) {
      bqj $$1 = bqi.a();
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
         aqq $$3 = (aqq)this.p.get($$2);
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
      long $$1 = af.c();
      int $$2 = 0;
      LongIterator $$3 = this.O.iterator();

      while ($$2 < 20 && this.Q.get() < 128 && $$0.getAsBoolean() && $$3.hasNext()) {
         long $$4 = $$3.nextLong();
         aqq $$5 = (aqq)this.q.get($$4);
         ebl $$6 = $$5 != null ? $$5.p() : null;
         if ($$6 == null || !$$6.k()) {
            $$3.remove();
         } else if (this.a($$5, $$1)) {
            $$2++;
            $$3.remove();
         }
      }
   }

   private void a(long $$0, aqq $$1) {
      CompletableFuture<?> $$2 = $$1.g();
      $$2.thenRunAsync(() -> {
         CompletableFuture<?> $$3 = $$1.g();
         if ($$3 != $$2) {
            this.a($$0, $$1);
         } else {
            ebl $$4 = $$1.p();
            if (this.r.remove($$0, $$1) && $$4 != null) {
               if ($$4 instanceof ebv $$5) {
                  $$5.b(false);
               }

               this.a($$4);
               if ($$4 instanceof ebv $$6) {
                  this.t.a($$6);
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

   private CompletableFuture<ebl> g(dhw $$0) {
      CompletableFuture<Optional<edg>> $$1 = this.k($$0).thenApplyAsync($$1x -> $$1x.map($$1xx -> {
            edg $$2x = edg.a(this.t, this.t.F_(), $$1xx);
            if ($$2x == null) {
               k.error("Chunk file at {} is missing level data, skipping", $$0);
            }

            return $$2x;
         }), af.h().a("parseChunk"));
      CompletableFuture<?> $$2 = this.A.a($$0);
      return $$1.<Object, Optional>thenCombine((CompletionStage<? extends Object>)$$2, ($$0x, $$1x) -> $$0x).thenApplyAsync($$1x -> {
         bqi.a().f("chunkLoad");
         if ($$1x.isPresent()) {
            ebl $$2x = ((edg)$$1x.get()).a(this.t, this.A, this.q(), $$0);
            this.a($$0, $$2x.n().d());
            return $$2x;
         } else {
            return this.h($$0);
         }
      }, this.v).exceptionallyAsync($$1x -> this.a($$1x, $$0), this.v);
   }

   private ebl a(Throwable $$0, dhw $$1) {
      Throwable $$3 = $$0 instanceof CompletionException $$2 ? $$2.getCause() : $$0;
      Throwable $$5 = $$3 instanceof z $$4 ? $$4.getCause() : $$3;
      boolean $$6 = $$5 instanceof Error;
      boolean $$7 = $$5 instanceof IOException || $$5 instanceof ui;
      if (!$$6 && $$7) {
         this.t.p().a($$5, this.q(), $$1);
         return this.h($$1);
      } else {
         o $$8 = o.a($$0, "Exception loading chunk");
         p $$9 = $$8.a("Chunk being loaded");
         $$9.a("pos", $$1);
         this.i($$1);
         throw new z($$8);
      }
   }

   private ebl h(dhw $$0) {
      this.i($$0);
      return new ecf($$0, eci.a, this.t, this.t.F_().f(mg.aG), null);
   }

   private void i(dhw $$0) {
      this.M.put($$0.a(), (byte)-1);
   }

   private byte a(dhw $$0, ecq $$1) {
      return this.M.put($$0.a(), (byte)($$1 == ecq.a ? -1 : 1));
   }

   @Override
   public are d(long $$0) {
      aqq $$1 = (aqq)this.p.get($$0);
      $$1.n();
      return $$1;
   }

   @Override
   public void a(are $$0) {
      $$0.o();
   }

   @Override
   public CompletableFuture<ebl> a(are $$0, ecp $$1, bag<are> $$2) {
      dhw $$3 = $$0.r();
      if ($$1.a() == ecm.c) {
         return this.g($$3);
      } else {
         try {
            are $$4 = $$2.a($$3.h, $$3.i);
            ebl $$5 = $$4.a($$1.a().c());
            if ($$5 == null) {
               throw new IllegalStateException("Parent chunk missing");
            } else {
               CompletableFuture<ebl> $$6 = $$1.a(this.S, $$2, $$5);
               this.F.a($$3, $$1.a());
               return $$6;
            }
         } catch (Exception var8) {
            var8.getStackTrace();
            o $$8 = o.a(var8, "Exception generating new chunk");
            p $$9 = $$8.a("Chunk to be generated");
            $$9.a("Status being generated", () -> $$1.a().f());
            $$9.a("Location", String.format(Locale.ROOT, "%d,%d", $$3.h, $$3.i));
            $$9.a("Position hash", dhw.c($$3.h, $$3.i));
            $$9.a("Generator", this.a());
            this.v.execute(() -> {
               throw new z($$8);
            });
            throw new z($$8);
         }
      }
   }

   @Override
   public aqp a(ecm $$0, dhw $$1) {
      aqp $$2 = aqp.a(this, $$0, $$1);
      this.s.add($$2);
      return $$2;
   }

   private void a(aqp $$0) {
      are $$1 = $$0.c();
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

   public CompletableFuture<aqt<ebv>> b(aqq $$0) {
      CompletableFuture<aqt<List<ebl>>> $$1 = this.a($$0, 1, $$0x -> ecm.n);
      CompletableFuture<aqt<ebv>> $$2 = $$1.thenApplyAsync($$1x -> $$1x.a($$1xx -> {
            ebv $$2x = (ebv)$$1xx.get($$1xx.size() / 2);
            $$2x.a(this.t);
            this.t.b($$2x);
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

   private void a(aqq $$0, ebv $$1) {
      dhw $$2 = $$1.f();

      for (arp $$3 : this.K.a()) {
         if ($$3.Y().a($$2)) {
            a($$3, $$1);
         }
      }

      this.t.m().a($$0);
   }

   public CompletableFuture<aqt<ebv>> c(aqq $$0) {
      return this.a($$0, 1, aqr::b).thenApply($$0x -> $$0x.a($$0xx -> (ebv)$$0xx.get($$0xx.size() / 2)));
   }

   public int h() {
      return this.I.get();
   }

   private boolean a(aqq $$0, long $$1) {
      if ($$0.l() && $$0.h()) {
         ebl $$2 = $$0.p();
         if (!($$2 instanceof ebu) && !($$2 instanceof ebv)) {
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

   private boolean a(ebl $$0) {
      this.A.b($$0.f());
      if (!$$0.j()) {
         return false;
      } else {
         dhw $$1 = $$0.f();

         try {
            ecm $$2 = $$0.n();
            if ($$2.d() != ecq.b) {
               if (this.j($$1)) {
                  return false;
               }

               if ($$2 == ecm.c && $$0.g().values().stream().noneMatch(eqq::b)) {
                  return false;
               }
            }

            bqi.a().f("chunkSave");
            this.Q.incrementAndGet();
            edg $$3 = edg.a(this.t, $$0);
            CompletableFuture<tx> $$4 = CompletableFuture.supplyAsync($$3::a, af.h());
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

   private boolean j(dhw $$0) {
      byte $$1 = this.M.get($$0.a());
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
            k.error("Failed to read chunk {}", $$0, var5);
            this.i($$0);
            return false;
         }

         ecq $$5 = edg.a($$2);
         return this.a($$0, $$5) == 1;
      }
   }

   protected void a(int $$0) {
      int $$1 = azk.a($$0, 2, 32);
      if ($$1 != this.R) {
         this.R = $$1;
         this.H.a(this.R);

         for (arp $$2 : this.K.a()) {
            this.e($$2);
         }
      }
   }

   int b(arp $$0) {
      return azk.a($$0.F(), 2, this.R);
   }

   private void a(arp $$0, dhw $$1) {
      ebv $$2 = this.e($$1.a());
      if ($$2 != null) {
         a($$0, $$2);
      }
   }

   private static void a(arp $$0, ebv $$1) {
      $$0.f.g.a($$1);
   }

   private static void b(arp $$0, dhw $$1) {
      $$0.f.g.a($$0, $$1);
   }

   @Nullable
   public ebv e(long $$0) {
      aqq $$1 = this.b($$0);
      return $$1 == null ? null : $$1.e();
   }

   public int i() {
      return this.q.size();
   }

   public arb j() {
      return this.H;
   }

   protected Iterable<aqq> k() {
      return Iterables.unmodifiableIterable(this.q.values());
   }

   void a(Writer $$0) throws IOException {
      ayj $$1 = ayj.a()
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
         Entry<aqq> $$2 = (Entry<aqq>)var3.next();
         long $$3 = $$2.getLongKey();
         dhw $$4 = new dhw($$3);
         aqq $$5 = (aqq)$$2.getValue();
         Optional<ebl> $$6 = Optional.ofNullable($$5.p());
         Optional<ebv> $$7 = $$6.flatMap($$0x -> $$0x instanceof ebv ? Optional.of((ebv)$$0x) : Optional.empty());
         $$1.a(
            $$4.h,
            $$4.i,
            $$5.j(),
            $$6.isPresent(),
            $$6.map(ebl::n).orElse(null),
            $$7.map(ebv::F).orElse(null),
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

   private static String a(CompletableFuture<aqt<ebv>> $$0) {
      try {
         aqt<ebv> $$1 = $$0.getNow(null);
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

   private CompletableFuture<Optional<tx>> k(dhw $$0) {
      return this.d($$0).thenApplyAsync($$0x -> $$0x.map(this::b), af.h().a("upgradeChunk"));
   }

   private tx b(tx $$0) {
      return this.a(this.t.aj(), this.y, $$0, this.a().c());
   }

   void a(Consumer<aqq> $$0) {
      LongIterator $$1 = this.H.b();

      while ($$1.hasNext()) {
         long $$2 = $$1.nextLong();
         aqq $$3 = (aqq)this.q.get($$2);
         if ($$3 != null && this.l($$3.r())) {
            $$0.accept($$3);
         }
      }
   }

   boolean b(dhw $$0) {
      return !this.H.e($$0.a()) ? false : this.l($$0);
   }

   private boolean l(dhw $$0) {
      for (arp $$1 : this.K.a()) {
         if (this.c($$1, $$0)) {
            return true;
         }
      }

      return false;
   }

   public List<arp> c(dhw $$0) {
      long $$1 = $$0.a();
      if (!this.H.e($$1)) {
         return List.of();
      } else {
         Builder<arp> $$2 = ImmutableList.builder();

         for (arp $$3 : this.K.a()) {
            if (this.c($$3, $$0)) {
               $$2.add($$3);
            }
         }

         return $$2.build();
      }
   }

   private boolean c(arp $$0, dhw $$1) {
      if ($$0.U_()) {
         return false;
      } else {
         double $$2 = a($$1, $$0);
         return $$2 < 16384.0;
      }
   }

   private boolean c(arp $$0) {
      return $$0.U_() && !this.t.O().c(dil.r);
   }

   void a(arp $$0, boolean $$1) {
      boolean $$2 = this.c($$0);
      boolean $$3 = this.K.d($$0);
      if ($$1) {
         this.K.a($$0, $$2);
         this.d($$0);
         if (!$$2) {
            this.H.a(jx.a($$0), $$0);
         }

         $$0.a(aqx.a);
         this.e($$0);
      } else {
         jx $$4 = $$0.X();
         this.K.a($$0);
         if (!$$3) {
            this.H.b($$4, $$0);
         }

         this.a($$0, aqx.a);
      }
   }

   private void d(arp $$0) {
      jx $$1 = jx.a($$0);
      $$0.a($$1);
   }

   public void a(arp $$0) {
      ObjectIterator $$2 = this.L.values().iterator();

      while ($$2.hasNext()) {
         aqs.b $$1 = (aqs.b)$$2.next();
         if ($$1.c == $$0) {
            $$1.a(this.t.z());
         } else {
            $$1.b($$0);
         }
      }

      jx $$2x = $$0.X();
      jx $$3 = jx.a($$0);
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

   private void e(arp $$0) {
      dhw $$1 = $$0.dx();
      int $$2 = this.b($$0);
      if ($$0.Y() instanceof aqx.a $$3 && $$3.a().equals($$1) && $$3.b() == $$2) {
         return;
      }

      this.a($$0, aqx.a($$1, $$2));
   }

   private void a(arp $$0, aqx $$1) {
      if ($$0.dV() == this.t) {
         aqx $$2 = $$0.Y();
         if ($$1 instanceof aqx.a $$3 && (!($$2 instanceof aqx.a $$4) || !$$4.a().equals($$3.a()))) {
            $$0.f.b(new aew($$3.a().h, $$3.a().i));
         }

         aqx.a($$2, $$1, $$1x -> this.a($$0, $$1x), $$1x -> b($$0, $$1x));
         $$0.a($$1);
      }
   }

   @Override
   public List<arp> a(dhw $$0, boolean $$1) {
      Set<arp> $$2 = this.K.a();
      Builder<arp> $$3 = ImmutableList.builder();

      for (arp $$4 : $$2) {
         if ($$1 && this.b($$4, $$0.h, $$0.i) || !$$1 && this.a($$4, $$0.h, $$0.i)) {
            $$3.add($$4);
         }
      }

      return $$3.build();
   }

   protected void a(bwa $$0) {
      if (!($$0 instanceof cln)) {
         bwj<?> $$1 = $$0.aq();
         int $$2 = $$1.o() * 16;
         if ($$2 != 0) {
            int $$3 = $$1.p();
            if (this.L.containsKey($$0.ar())) {
               throw (IllegalStateException)af.b(new IllegalStateException("Entity is already tracked!"));
            } else {
               aqs.b $$4 = new aqs.b($$0, $$2, $$3, $$1.q());
               this.L.put($$0.ar(), $$4);
               $$4.a(this.t.z());
               if ($$0 instanceof arp $$5) {
                  this.a($$5, true);
                  ObjectIterator var7 = this.L.values().iterator();

                  while (var7.hasNext()) {
                     aqs.b $$6 = (aqs.b)var7.next();
                     if ($$6.c != $$5) {
                        $$6.b($$5);
                     }
                  }
               }
            }
         }
      }
   }

   protected void b(bwa $$0) {
      if ($$0 instanceof arp $$1) {
         this.a($$1, false);
         ObjectIterator var3 = this.L.values().iterator();

         while (var3.hasNext()) {
            aqs.b $$2 = (aqs.b)var3.next();
            $$2.a($$1);
         }
      }

      aqs.b $$3 = (aqs.b)this.L.remove($$0.ar());
      if ($$3 != null) {
         $$3.a();
      }
   }

   protected void l() {
      for (arp $$0 : this.K.a()) {
         this.e($$0);
      }

      List<arp> $$1 = Lists.newArrayList();
      List<arp> $$2 = this.t.z();
      ObjectIterator var3 = this.L.values().iterator();

      while (var3.hasNext()) {
         aqs.b $$3 = (aqs.b)var3.next();
         jx $$4 = $$3.e;
         jx $$5 = jx.a($$3.c);
         boolean $$6 = !Objects.equals($$4, $$5);
         if ($$6) {
            $$3.a($$2);
            bwa $$7 = $$3.c;
            if ($$7 instanceof arp) {
               $$1.add((arp)$$7);
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
            aqs.b $$8 = (aqs.b)var3.next();
            $$8.a($$1);
         }
      }
   }

   public void a(bwa $$0, zd<?> $$1) {
      aqs.b $$2 = (aqs.b)this.L.get($$0.ar());
      if ($$2 != null) {
         $$2.a($$1);
      }
   }

   protected void b(bwa $$0, zd<?> $$1) {
      aqs.b $$2 = (aqs.b)this.L.get($$0.ar());
      if ($$2 != null) {
         $$2.b($$1);
      }
   }

   public void a(List<ebl> $$0) {
      Map<arp, List<ebv>> $$1 = new HashMap<>();

      for (ebl $$2 : $$0) {
         dhw $$3 = $$2.f();
         ebv $$5;
         if ($$2 instanceof ebv $$4) {
            $$5 = $$4;
         } else {
            $$5 = this.t.d($$3.h, $$3.i);
         }

         for (arp $$7 : this.a($$3, false)) {
            $$1.computeIfAbsent($$7, $$0x -> new ArrayList<>()).add($$5);
         }
      }

      $$1.forEach(($$0x, $$1x) -> $$0x.f.b(ach.a($$1x)));
   }

   protected cib m() {
      return this.A;
   }

   public String n() {
      return this.J;
   }

   void a(dhw $$0, arc $$1) {
      this.G.onChunkStatusChange($$0, $$1);
   }

   public void a(dhw $$0, int $$1) {
      int $$2 = $$1 + 1;
      dhw.a($$0, $$2).forEach($$0x -> {
         aqq $$1x = this.b($$0x.a());
         if ($$1x != null) {
            $$1x.a(this.u.a($$0x.h, $$0x.i));
         }
      });
   }

   class a extends arb {
      protected a(final djm $$0, final Executor $$1, final Executor $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      protected boolean a(long $$0) {
         return aqs.this.B.contains($$0);
      }

      @Nullable
      @Override
      protected aqq b(long $$0) {
         return aqs.this.a($$0);
      }

      @Nullable
      @Override
      protected aqq a(long $$0, int $$1, @Nullable aqq $$2, int $$3) {
         return aqs.this.a($$0, $$1, $$2, $$3);
      }
   }

   class b {
      final arm b;
      final bwa c;
      private final int d;
      jx e;
      private final Set<asu> f = Sets.newIdentityHashSet();

      public b(final bwa $$0, final int $$1, final int $$2, final boolean $$3) {
         this.b = new arm(aqs.this.t, $$0, $$2, $$3, this::a, this::a);
         this.c = $$0;
         this.d = $$1;
         this.e = jx.a($$0);
      }

      @Override
      public boolean equals(Object $$0) {
         return $$0 instanceof aqs.b ? ((aqs.b)$$0).c.ar() == this.c.ar() : false;
      }

      @Override
      public int hashCode() {
         return this.c.ar();
      }

      public void a(zd<?> $$0) {
         for (asu $$1 : this.f) {
            $$1.b($$0);
         }
      }

      public void a(zd<?> $$0, List<UUID> $$1) {
         for (asu $$2 : this.f) {
            if (!$$1.contains($$2.o().cG())) {
               $$2.b($$0);
            }
         }
      }

      public void b(zd<?> $$0) {
         this.a($$0);
         if (this.c instanceof arp) {
            ((arp)this.c).f.b($$0);
         }
      }

      public void a() {
         for (asu $$0 : this.f) {
            this.b.a($$0.o());
         }
      }

      public void a(arp $$0) {
         if (this.f.remove($$0.f)) {
            this.b.a($$0);
         }
      }

      public void b(arp $$0) {
         if ($$0 != this.c) {
            fdw $$1 = $$0.dt().d(this.c.dt());
            int $$2 = aqs.this.b($$0);
            double $$3 = (double)Math.min(this.b(), $$2 * 16);
            double $$4 = $$1.d * $$1.d + $$1.f * $$1.f;
            double $$5 = $$3 * $$3;
            boolean $$6 = $$4 <= $$5 && this.c.a($$0) && aqs.this.a($$0, this.c.dx().h, this.c.dx().i);
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
         return aqs.this.t.p().b($$0);
      }

      private int b() {
         int $$0 = this.d;

         for (bwa $$1 : this.c.dc()) {
            int $$2 = $$1.aq().o() * 16;
            if ($$2 > $$0) {
               $$0 = $$2;
            }
         }

         return this.a($$0);
      }

      public void a(List<arp> $$0) {
         for (arp $$1 : $$0) {
            this.b($$1);
         }
      }
   }
}
