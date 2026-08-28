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

public class arm extends eaz implements ark.b, arx {
   private static final arn<List<dzp>> f = arn.a("Unloaded chunks found in range");
   private static final CompletableFuture<arn<List<dzp>>> g = CompletableFuture.completedFuture(f);
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
   public static final int c = arl.a(arw.d);
   private final Long2ObjectLinkedOpenHashMap<ark> p = new Long2ObjectLinkedOpenHashMap();
   private volatile Long2ObjectLinkedOpenHashMap<ark> q = this.p.clone();
   private final Long2ObjectLinkedOpenHashMap<ark> r = new Long2ObjectLinkedOpenHashMap();
   private final List<arj> s = new ArrayList<>();
   final ash t;
   private final ask u;
   private final brx<Runnable> v;
   private final eed w;
   private final dzr x;
   private final Supplier<evw> y;
   private final chj z;
   final LongSet A = new LongOpenHashSet();
   private boolean B;
   private final aro C;
   private final aro D;
   private final asr E;
   private final ebw F;
   private final arm.a G;
   private final AtomicInteger H = new AtomicInteger();
   private final String I;
   private final asa J = new asa();
   private final Int2ObjectMap<arm.b> K = new Int2ObjectOpenHashMap();
   private final Long2ByteMap L = new Long2ByteOpenHashMap();
   private final Long2LongMap M = new Long2LongOpenHashMap();
   private final LongSet N = new LongLinkedOpenHashSet();
   private final Queue<Runnable> O = Queues.newConcurrentLinkedQueue();
   private final AtomicInteger P = new AtomicInteger();
   private int Q;
   private final eav R;

   public arm(
      ash $$0,
      ewc.c $$1,
      DataFixer $$2,
      esm $$3,
      Executor $$4,
      brx<Runnable> $$5,
      eac $$6,
      dzq $$7,
      asr $$8,
      ebw $$9,
      Supplier<evw> $$10,
      int $$11,
      boolean $$12
   ) {
      super(new ebi($$1.f(), $$0.ah(), "chunk"), $$1.a($$0.ah()).resolve("region"), $$2, $$12);
      Path $$13 = $$1.a($$0.ah());
      this.I = $$13.getFileName().toString();
      this.t = $$0;
      ke $$14 = $$0.K_();
      long $$15 = $$0.D();
      if ($$7 instanceof eds $$16) {
         this.w = eed.a($$16.h().a(), $$14.e(mb.aS), $$15);
      } else {
         this.w = eed.a(edu.e(), $$14.e(mb.aS), $$15);
      }

      this.x = $$7.a($$14.e(mb.aW), this.w, $$15);
      this.v = $$5;
      bry $$17 = new bry($$4, "worldgen");
      this.E = $$8;
      this.F = $$9;
      bry $$18 = new bry($$4, "light");
      this.C = new aro($$17, $$4);
      this.D = new aro($$18, $$4);
      this.u = new ask($$6, this, this.t.G_().g(), $$18, this.D);
      this.G = new arm.a($$4, $$5);
      this.y = $$10;
      this.z = new chj(new ebi($$1.f(), $$0.ah(), "poi"), $$13.resolve("poi"), $$2, $$12, $$14, $$0.p(), $$0);
      this.a($$11);
      this.R = new eav($$0, $$7, $$3, this.u, $$5, this::f);
   }

   private void f(dgn $$0) {
      this.N.add($$0.a());
   }

   protected dzq a() {
      return this.R.b();
   }

   protected dzr b() {
      return this.x;
   }

   protected eed c() {
      return this.w;
   }

   private static double a(dgn $$0, bvj $$1) {
      double $$2 = (double)kj.a($$0.h, 8);
      double $$3 = (double)kj.a($$0.i, 8);
      double $$4 = $$2 - $$1.dB();
      double $$5 = $$3 - $$1.dH();
      return $$4 * $$4 + $$5 * $$5;
   }

   boolean a(asi $$0, int $$1, int $$2) {
      return $$0.Y().a($$1, $$2) && !$$0.f.g.a(dgn.c($$1, $$2));
   }

   private boolean b(asi $$0, int $$1, int $$2) {
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

   protected ask d() {
      return this.u;
   }

   @Nullable
   protected ark a(long $$0) {
      return (ark)this.p.get($$0);
   }

   @Nullable
   protected ark b(long $$0) {
      return (ark)this.q.get($$0);
   }

   protected IntSupplier c(long $$0) {
      return () -> {
         ark $$1 = this.b($$0);
         return $$1 == null ? arp.a - 1 : Math.min($$1.k(), arp.a - 1);
      };
   }

   public String a(dgn $$0) {
      ark $$1 = this.b($$0.a());
      if ($$1 == null) {
         return "null";
      } else {
         String $$2 = $$1.j() + "\n";
         eaq $$3 = $$1.u();
         dzp $$4 = $$1.p();
         if ($$3 != null) {
            $$2 = $$2 + "St: §" + $$3.b() + $$3 + "§r\n";
         }

         if ($$4 != null) {
            $$2 = $$2 + "Ch: §" + $$4.n().b() + $$4.n() + "§r\n";
         }

         arw $$5 = $$1.s();
         $$2 = $$2 + '§' + $$5.ordinal() + $$5;
         return $$2 + "§r";
      }
   }

   private CompletableFuture<arn<List<dzp>>> a(ark $$0, int $$1, IntFunction<eaq> $$2) {
      if ($$1 == 0) {
         eaq $$3 = $$2.apply(0);
         return $$0.a($$3, this).thenApply($$0x -> $$0x.a(List::of));
      } else {
         int $$4 = bae.h($$1 * 2 + 1);
         List<CompletableFuture<arn<dzp>>> $$5 = new ArrayList<>($$4);
         dgn $$6 = $$0.r();

         for (int $$7 = -$$1; $$7 <= $$1; $$7++) {
            for (int $$8 = -$$1; $$8 <= $$1; $$8++) {
               int $$9 = Math.max(Math.abs($$8), Math.abs($$7));
               long $$10 = dgn.c($$6.h + $$8, $$6.i + $$7);
               ark $$11 = this.a($$10);
               if ($$11 == null) {
                  return g;
               }

               eaq $$12 = $$2.apply($$9);
               $$5.add($$11.a($$12, this));
            }
         }

         return ae.d($$5).thenApply($$0x -> {
            List<dzp> $$1x = new ArrayList<>($$0x.size());

            for (arn<dzp> $$2x : $$0x) {
               if ($$2x == null) {
                  throw this.a(new IllegalStateException("At least one of the chunk futures were null"), "n/a");
               }

               dzp $$3 = $$2x.b(null);
               if ($$3 == null) {
                  return f;
               }

               $$1x.add($$3);
            }

            return arn.a($$1x);
         });
      }
   }

   public z a(IllegalStateException $$0, String $$1) {
      StringBuilder $$2 = new StringBuilder();
      Consumer<ark> $$3 = $$1x -> $$1x.t().forEach($$2x -> {
            eaq $$3x = (eaq)$$2x.getFirst();
            CompletableFuture<arn<dzp>> $$4x = (CompletableFuture<arn<dzp>>)$$2x.getSecond();
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

   public CompletableFuture<arn<dzz>> a(ark $$0) {
      return this.a($$0, 2, $$0x -> eaq.n).thenApply($$0x -> $$0x.a($$0xx -> (dzz)$$0xx.get($$0xx.size() / 2)));
   }

   @Nullable
   ark a(long $$0, int $$1, @Nullable ark $$2, int $$3) {
      if (!arl.f($$3) && !arl.f($$1)) {
         return $$2;
      } else {
         if ($$2 != null) {
            $$2.a($$1);
         }

         if ($$2 != null) {
            if (!arl.f($$1)) {
               this.A.add($$0);
            } else {
               this.A.remove($$0);
            }
         }

         if (arl.f($$1) && $$2 == null) {
            $$2 = (ark)this.r.remove($$0);
            if ($$2 != null) {
               $$2.a($$1);
            } else {
               $$2 = new ark(new dgn($$0), $$1, this.t, this.u, this::a, this);
            }

            this.p.put($$0, $$2);
            this.B = true;
         }

         return $$2;
      }
   }

   private void a(dgn $$0, IntSupplier $$1, int $$2, IntConsumer $$3) {
      this.C.onLevelChange($$0, $$1, $$2, $$3);
      this.D.onLevelChange($$0, $$1, $$2, $$3);
   }

   @Override
   public void close() throws IOException {
      try {
         this.C.close();
         this.D.close();
         this.z.close();
      } finally {
         super.close();
      }
   }

   protected void a(boolean $$0) {
      if ($$0) {
         List<ark> $$1 = this.q.values().stream().filter(ark::l).peek(ark::m).toList();
         MutableBoolean $$2 = new MutableBoolean();

         do {
            $$2.setFalse();
            $$1.stream().map($$0x -> {
               this.v.b($$0x::h);
               return $$0x.p();
            }).filter($$0x -> $$0x instanceof dzy || $$0x instanceof dzz).filter(this::a).forEach($$1x -> $$2.setTrue());
         } while ($$2.isTrue());

         this.z.a();
         this.b(() -> true);
         this.o();
      } else {
         this.M.clear();
         long $$3 = ae.c();
         ObjectIterator var4 = this.q.values().iterator();

         while (var4.hasNext()) {
            ark $$4 = (ark)var4.next();
            this.a($$4, $$3);
         }
      }
   }

   protected void a(BooleanSupplier $$0) {
      bps $$1 = bpr.a();
      $$1.a("poi");
      this.z.a($$0);
      $$1.b("chunk_unload");
      if (!this.t.u()) {
         this.b($$0);
      }

      $$1.c();
   }

   public boolean e() {
      return this.u.N_()
         || !this.r.isEmpty()
         || !this.p.isEmpty()
         || this.z.b()
         || !this.A.isEmpty()
         || !this.O.isEmpty()
         || this.C.a()
         || this.D.a()
         || this.G.h();
   }

   private void b(BooleanSupplier $$0) {
      for (LongIterator $$1 = this.A.iterator(); $$1.hasNext(); $$1.remove()) {
         long $$2 = $$1.nextLong();
         ark $$3 = (ark)this.p.get($$2);
         if ($$3 != null) {
            this.p.remove($$2);
            this.r.put($$2, $$3);
            this.B = true;
            this.a($$2, $$3);
         }
      }

      int $$4 = Math.max(0, this.O.size() - 2000);

      Runnable $$5;
      while (($$4 > 0 || $$0.getAsBoolean()) && ($$5 = this.O.poll()) != null) {
         $$4--;
         $$5.run();
      }

      this.c($$0);
   }

   private void c(BooleanSupplier $$0) {
      long $$1 = ae.c();
      int $$2 = 0;
      LongIterator $$3 = this.N.iterator();

      while ($$2 < 20 && this.P.get() < 128 && $$0.getAsBoolean() && $$3.hasNext()) {
         long $$4 = $$3.nextLong();
         ark $$5 = (ark)this.q.get($$4);
         dzp $$6 = $$5 != null ? $$5.p() : null;
         if ($$6 == null || !$$6.k()) {
            $$3.remove();
         } else if (this.a($$5, $$1)) {
            $$2++;
            $$3.remove();
         }
      }
   }

   private void a(long $$0, ark $$1) {
      CompletableFuture<?> $$2 = $$1.g();
      $$2.thenRunAsync(() -> {
         CompletableFuture<?> $$3 = $$1.g();
         if ($$3 != $$2) {
            this.a($$0, $$1);
         } else {
            dzp $$4 = $$1.p();
            if (this.r.remove($$0, $$1) && $$4 != null) {
               if ($$4 instanceof dzz $$5) {
                  $$5.b(false);
               }

               this.a($$4);
               if ($$4 instanceof dzz $$6) {
                  this.t.a($$6);
               }

               this.u.a($$4.f());
               this.u.b();
               this.E.a($$4.f(), null);
               this.M.remove($$4.f().a());
            }
         }
      }, this.O::add).whenComplete(($$1x, $$2x) -> {
         if ($$2x != null) {
            k.error("Failed to save chunk {}", $$1.r(), $$2x);
         }
      });
   }

   protected boolean f() {
      if (!this.B) {
         return false;
      } else {
         this.q = this.p.clone();
         this.B = false;
         return true;
      }
   }

   private CompletableFuture<dzp> g(dgn $$0) {
      CompletableFuture<Optional<ebk>> $$1 = this.k($$0).thenApplyAsync($$1x -> $$1x.map($$1xx -> {
            ebk $$2x = ebk.a(this.t, this.t.K_(), $$1xx);
            if ($$2x == null) {
               k.error("Chunk file at {} is missing level data, skipping", $$0);
            }

            return $$2x;
         }), ae.g().a("parseChunk"));
      CompletableFuture<?> $$2 = this.z.a($$0);
      return $$1.<Object, Optional>thenCombine((CompletionStage<? extends Object>)$$2, ($$0x, $$1x) -> $$0x).thenApplyAsync($$1x -> {
         bpr.a().f("chunkLoad");
         if ($$1x.isPresent()) {
            dzp $$2x = ((ebk)$$1x.get()).a(this.t, this.z, this.q(), $$0);
            this.a($$0, $$2x.n().d());
            return $$2x;
         } else {
            return this.h($$0);
         }
      }, this.v).exceptionallyAsync($$1x -> this.a($$1x, $$0), this.v);
   }

   private dzp a(Throwable $$0, dgn $$1) {
      Throwable $$3 = $$0 instanceof CompletionException $$2 ? $$2.getCause() : $$0;
      Throwable $$5 = $$3 instanceof z $$4 ? $$4.getCause() : $$3;
      boolean $$6 = $$5 instanceof Error;
      boolean $$7 = $$5 instanceof IOException || $$5 instanceof vi;
      if (!$$6) {
         if (!$$7) {
         }

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

   private dzp h(dgn $$0) {
      this.i($$0);
      return new eaj($$0, eam.a, this.t, this.t.K_().e(mb.aI), null);
   }

   private void i(dgn $$0) {
      this.L.put($$0.a(), (byte)-1);
   }

   private byte a(dgn $$0, eau $$1) {
      return this.L.put($$0.a(), (byte)($$1 == eau.a ? -1 : 1));
   }

   @Override
   public ary d(long $$0) {
      ark $$1 = (ark)this.p.get($$0);
      $$1.n();
      return $$1;
   }

   @Override
   public void a(ary $$0) {
      $$0.o();
   }

   @Override
   public CompletableFuture<dzp> a(ary $$0, eat $$1, bay<ary> $$2) {
      dgn $$3 = $$0.r();
      if ($$1.a() == eaq.c) {
         return this.g($$3);
      } else {
         try {
            ary $$4 = $$2.a($$3.h, $$3.i);
            dzp $$5 = $$4.a($$1.a().c());
            if ($$5 == null) {
               throw new IllegalStateException("Parent chunk missing");
            } else {
               CompletableFuture<dzp> $$6 = $$1.a(this.R, $$2, $$5);
               this.E.a($$3, $$1.a());
               return $$6;
            }
         } catch (Exception var8) {
            var8.getStackTrace();
            o $$8 = o.a(var8, "Exception generating new chunk");
            p $$9 = $$8.a("Chunk to be generated");
            $$9.a("Status being generated", () -> $$1.a().f());
            $$9.a("Location", String.format(Locale.ROOT, "%d,%d", $$3.h, $$3.i));
            $$9.a("Position hash", dgn.c($$3.h, $$3.i));
            $$9.a("Generator", this.a());
            this.v.execute(() -> {
               throw new z($$8);
            });
            throw new z($$8);
         }
      }
   }

   @Override
   public arj a(eaq $$0, dgn $$1) {
      arj $$2 = arj.a(this, $$0, $$1);
      this.s.add($$2);
      return $$2;
   }

   private void a(arj $$0) {
      ary $$1 = $$0.c();
      this.C.a(() -> {
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

   public CompletableFuture<arn<dzz>> b(ark $$0) {
      CompletableFuture<arn<List<dzp>>> $$1 = this.a($$0, 1, $$0x -> eaq.n);
      CompletableFuture<arn<dzz>> $$2 = $$1.thenApplyAsync($$1x -> $$1x.a($$1xx -> {
            dzz $$2x = (dzz)$$1xx.get($$1xx.size() / 2);
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
         this.H.getAndIncrement();
         return null;
      });
      return $$2;
   }

   private void a(ark $$0, dzz $$1) {
      dgn $$2 = $$1.f();

      for (asi $$3 : this.J.a()) {
         if ($$3.Y().a($$2)) {
            a($$3, $$1);
         }
      }

      this.t.m().a($$0);
   }

   public CompletableFuture<arn<dzz>> c(ark $$0) {
      return this.a($$0, 1, arl::b).thenApply($$0x -> $$0x.a($$0xx -> (dzz)$$0xx.get($$0xx.size() / 2)));
   }

   public int h() {
      return this.H.get();
   }

   private boolean a(ark $$0, long $$1) {
      if ($$0.l() && $$0.h()) {
         dzp $$2 = $$0.p();
         if (!($$2 instanceof dzy) && !($$2 instanceof dzz)) {
            return false;
         } else if (!$$2.k()) {
            return false;
         } else {
            long $$3 = $$2.f().a();
            long $$4 = this.M.getOrDefault($$3, -1L);
            if ($$1 < $$4) {
               return false;
            } else {
               boolean $$5 = this.a($$2);
               $$0.m();
               if ($$5) {
                  this.M.put($$3, $$1 + 10000L);
               }

               return $$5;
            }
         }
      } else {
         return false;
      }
   }

   private boolean a(dzp $$0) {
      this.z.b($$0.f());
      if (!$$0.j()) {
         return false;
      } else {
         dgn $$1 = $$0.f();

         try {
            eaq $$2 = $$0.n();
            if ($$2.d() != eau.b) {
               if (this.j($$1)) {
                  return false;
               }

               if ($$2 == eaq.c && $$0.g().values().stream().noneMatch(eor::b)) {
                  return false;
               }
            }

            bpr.a().f("chunkSave");
            this.P.incrementAndGet();
            ebk $$3 = ebk.a(this.t, $$0);
            CompletableFuture<ux> $$4 = CompletableFuture.supplyAsync($$3::a, ae.g());
            this.a($$1, $$4::join).handle(($$1x, $$2x) -> {
               if ($$2x != null) {
                  this.t.p().b($$2x, this.q(), $$1);
               }

               this.P.decrementAndGet();
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

   private boolean j(dgn $$0) {
      byte $$1 = this.L.get($$0.a());
      if ($$1 != 0) {
         return $$1 == 1;
      } else {
         ux $$2;
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

         eau $$5 = ebk.a($$2);
         return this.a($$0, $$5) == 1;
      }
   }

   protected void a(int $$0) {
      int $$1 = bae.a($$0, 2, 32);
      if ($$1 != this.Q) {
         this.Q = $$1;
         this.G.a(this.Q);

         for (asi $$2 : this.J.a()) {
            this.e($$2);
         }
      }
   }

   int b(asi $$0) {
      return bae.a($$0.F(), 2, this.Q);
   }

   private void a(asi $$0, dgn $$1) {
      dzz $$2 = this.e($$1.a());
      if ($$2 != null) {
         a($$0, $$2);
      }
   }

   private static void a(asi $$0, dzz $$1) {
      $$0.f.g.a($$1);
   }

   private static void b(asi $$0, dgn $$1) {
      $$0.f.g.a($$0, $$1);
   }

   @Nullable
   public dzz e(long $$0) {
      ark $$1 = this.b($$0);
      return $$1 == null ? null : $$1.e();
   }

   public int i() {
      return this.q.size();
   }

   public arv j() {
      return this.G;
   }

   protected Iterable<ark> k() {
      return Iterables.unmodifiableIterable(this.q.values());
   }

   void a(Writer $$0) throws IOException {
      aze $$1 = aze.a()
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
      aso $$2 = this.G.e();
      ObjectBidirectionalIterator var4 = this.q.long2ObjectEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<ark> $$3 = (Entry<ark>)var4.next();
         long $$4 = $$3.getLongKey();
         dgn $$5 = new dgn($$4);
         ark $$6 = (ark)$$3.getValue();
         Optional<dzp> $$7 = Optional.ofNullable($$6.p());
         Optional<dzz> $$8 = $$7.flatMap($$0x -> $$0x instanceof dzz ? Optional.of((dzz)$$0x) : Optional.empty());
         $$1.a(
            $$5.h,
            $$5.i,
            $$6.j(),
            $$7.isPresent(),
            $$7.map(dzp::n).orElse(null),
            $$8.map(dzz::F).orElse(null),
            a($$6.c()),
            a($$6.a()),
            a($$6.b()),
            this.G.e($$4),
            this.b($$5),
            $$8.<Integer>map($$0x -> $$0x.I().size()).orElse(0),
            $$2.d($$4),
            $$2.c($$4),
            $$8.<Integer>map($$0x -> $$0x.q().a()).orElse(0),
            $$8.<Integer>map($$0x -> $$0x.r().a()).orElse(0)
         );
      }
   }

   private static String a(CompletableFuture<arn<dzz>> $$0) {
      try {
         arn<dzz> $$1 = $$0.getNow(null);
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

   private CompletableFuture<Optional<ux>> k(dgn $$0) {
      return this.d($$0).thenApplyAsync($$0x -> $$0x.map(this::b), ae.g().a("upgradeChunk"));
   }

   private ux b(ux $$0) {
      return this.a(this.t.ah(), this.y, $$0, this.a().c());
   }

   void a(Consumer<ark> $$0) {
      LongIterator $$1 = this.G.c();

      while ($$1.hasNext()) {
         long $$2 = $$1.nextLong();
         ark $$3 = (ark)this.q.get($$2);
         if ($$3 != null && this.l($$3.r())) {
            $$0.accept($$3);
         }
      }
   }

   boolean b(dgn $$0) {
      return !this.G.f($$0.a()) ? false : this.l($$0);
   }

   private boolean l(dgn $$0) {
      for (asi $$1 : this.J.a()) {
         if (this.c($$1, $$0)) {
            return true;
         }
      }

      return false;
   }

   public List<asi> c(dgn $$0) {
      long $$1 = $$0.a();
      if (!this.G.f($$1)) {
         return List.of();
      } else {
         Builder<asi> $$2 = ImmutableList.builder();

         for (asi $$3 : this.J.a()) {
            if (this.c($$3, $$0)) {
               $$2.add($$3);
            }
         }

         return $$2.build();
      }
   }

   private boolean c(asi $$0, dgn $$1) {
      if ($$0.aa_()) {
         return false;
      } else {
         double $$2 = a($$1, $$0);
         return $$2 < 16384.0;
      }
   }

   private boolean c(asi $$0) {
      return $$0.aa_() && !this.t.N().b(dhd.r);
   }

   void a(asi $$0, boolean $$1) {
      boolean $$2 = this.c($$0);
      boolean $$3 = this.J.d($$0);
      if ($$1) {
         this.J.a($$0, $$2);
         this.d($$0);
         if (!$$2) {
            this.G.a(kj.a($$0), $$0);
         }

         $$0.a(arr.a);
         this.e($$0);
      } else {
         kj $$4 = $$0.X();
         this.J.a($$0);
         if (!$$3) {
            this.G.b($$4, $$0);
         }

         this.a($$0, arr.a);
      }
   }

   private void d(asi $$0) {
      kj $$1 = kj.a($$0);
      $$0.a($$1);
   }

   public void a(asi $$0) {
      ObjectIterator $$2 = this.K.values().iterator();

      while ($$2.hasNext()) {
         arm.b $$1 = (arm.b)$$2.next();
         if ($$1.c == $$0) {
            $$1.a(this.t.y());
         } else {
            $$1.b($$0);
         }
      }

      kj $$2x = $$0.X();
      kj $$3 = kj.a($$0);
      boolean $$4 = this.J.e($$0);
      boolean $$5 = this.c($$0);
      boolean $$6 = $$2x.s() != $$3.s();
      if ($$6 || $$4 != $$5) {
         this.d($$0);
         if (!$$4) {
            this.G.b($$2x, $$0);
         }

         if (!$$5) {
            this.G.a($$3, $$0);
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

   private void e(asi $$0) {
      dgn $$1 = $$0.dy();
      int $$2 = this.b($$0);
      if ($$0.Y() instanceof arr.a $$3 && $$3.a().equals($$1) && $$3.b() == $$2) {
         return;
      }

      this.a($$0, arr.a($$1, $$2));
   }

   private void a(asi $$0, arr $$1) {
      if ($$0.dW() == this.t) {
         arr $$2 = $$0.Y();
         if ($$1 instanceof arr.a $$3 && (!($$2 instanceof arr.a $$4) || !$$4.a().equals($$3.a()))) {
            $$0.f.b(new afw($$3.a().h, $$3.a().i));
         }

         arr.a($$2, $$1, $$1x -> this.a($$0, $$1x), $$1x -> b($$0, $$1x));
         $$0.a($$1);
      }
   }

   @Override
   public List<asi> a(dgn $$0, boolean $$1) {
      Set<asi> $$2 = this.J.a();
      Builder<asi> $$3 = ImmutableList.builder();

      for (asi $$4 : $$2) {
         if ($$1 && this.b($$4, $$0.h, $$0.i) || !$$1 && this.a($$4, $$0.h, $$0.i)) {
            $$3.add($$4);
         }
      }

      return $$3.build();
   }

   protected void a(bvj $$0) {
      if (!($$0 instanceof ckq)) {
         bvq<?> $$1 = $$0.aq();
         int $$2 = $$1.o() * 16;
         if ($$2 != 0) {
            int $$3 = $$1.p();
            if (this.K.containsKey($$0.ar())) {
               throw (IllegalStateException)ae.b(new IllegalStateException("Entity is already tracked!"));
            } else {
               arm.b $$4 = new arm.b($$0, $$2, $$3, $$1.q());
               this.K.put($$0.ar(), $$4);
               $$4.a(this.t.y());
               if ($$0 instanceof asi $$5) {
                  this.a($$5, true);
                  ObjectIterator var7 = this.K.values().iterator();

                  while (var7.hasNext()) {
                     arm.b $$6 = (arm.b)var7.next();
                     if ($$6.c != $$5) {
                        $$6.b($$5);
                     }
                  }
               }
            }
         }
      }
   }

   protected void b(bvj $$0) {
      if ($$0 instanceof asi $$1) {
         this.a($$1, false);
         ObjectIterator var3 = this.K.values().iterator();

         while (var3.hasNext()) {
            arm.b $$2 = (arm.b)var3.next();
            $$2.a($$1);
         }
      }

      arm.b $$3 = (arm.b)this.K.remove($$0.ar());
      if ($$3 != null) {
         $$3.a();
      }
   }

   protected void l() {
      for (asi $$0 : this.J.a()) {
         this.e($$0);
      }

      List<asi> $$1 = Lists.newArrayList();
      List<asi> $$2 = this.t.y();
      ObjectIterator var3 = this.K.values().iterator();

      while (var3.hasNext()) {
         arm.b $$3 = (arm.b)var3.next();
         kj $$4 = $$3.e;
         kj $$5 = kj.a($$3.c);
         boolean $$6 = !Objects.equals($$4, $$5);
         if ($$6) {
            $$3.a($$2);
            bvj $$7 = $$3.c;
            if ($$7 instanceof asi) {
               $$1.add((asi)$$7);
            }

            $$3.e = $$5;
         }

         if ($$6 || this.G.c($$5.r().a())) {
            $$3.b.a();
         }
      }

      if (!$$1.isEmpty()) {
         var3 = this.K.values().iterator();

         while (var3.hasNext()) {
            arm.b $$8 = (arm.b)var3.next();
            $$8.a($$1);
         }
      }
   }

   public void a(bvj $$0, aac<?> $$1) {
      arm.b $$2 = (arm.b)this.K.get($$0.ar());
      if ($$2 != null) {
         $$2.a($$1);
      }
   }

   protected void b(bvj $$0, aac<?> $$1) {
      arm.b $$2 = (arm.b)this.K.get($$0.ar());
      if ($$2 != null) {
         $$2.b($$1);
      }
   }

   public void a(List<dzp> $$0) {
      Map<asi, List<dzz>> $$1 = new HashMap<>();

      for (dzp $$2 : $$0) {
         dgn $$3 = $$2.f();
         dzz $$5;
         if ($$2 instanceof dzz $$4) {
            $$5 = $$4;
         } else {
            $$5 = this.t.d($$3.h, $$3.i);
         }

         for (asi $$7 : this.a($$3, false)) {
            $$1.computeIfAbsent($$7, $$0x -> new ArrayList<>()).add($$5);
         }
      }

      $$1.forEach(($$0x, $$1x) -> $$0x.f.b(adh.a($$1x)));
   }

   protected chj m() {
      return this.z;
   }

   public String n() {
      return this.I;
   }

   void a(dgn $$0, arw $$1) {
      this.F.onChunkStatusChange($$0, $$1);
   }

   public void a(dgn $$0, int $$1) {
      int $$2 = $$1 + 1;
      dgn.a($$0, $$2).forEach($$0x -> {
         ark $$1x = this.b($$0x.a());
         if ($$1x != null) {
            $$1x.a(this.u.a($$0x.h, $$0x.i));
         }
      });
   }

   class a extends arv {
      protected a(final Executor $$0, final Executor $$1) {
         super($$0, $$1);
      }

      @Override
      protected boolean a(long $$0) {
         return arm.this.A.contains($$0);
      }

      @Nullable
      @Override
      protected ark b(long $$0) {
         return arm.this.a($$0);
      }

      @Nullable
      @Override
      protected ark a(long $$0, int $$1, @Nullable ark $$2, int $$3) {
         return arm.this.a($$0, $$1, $$2, $$3);
      }
   }

   class b {
      final asf b;
      final bvj c;
      private final int d;
      kj e;
      private final Set<atn> f = Sets.newIdentityHashSet();

      public b(final bvj $$0, final int $$1, final int $$2, final boolean $$3) {
         this.b = new asf(arm.this.t, $$0, $$2, $$3, this::a);
         this.c = $$0;
         this.d = $$1;
         this.e = kj.a($$0);
      }

      @Override
      public boolean equals(Object $$0) {
         return $$0 instanceof arm.b ? ((arm.b)$$0).c.ar() == this.c.ar() : false;
      }

      @Override
      public int hashCode() {
         return this.c.ar();
      }

      public void a(aac<?> $$0) {
         for (atn $$1 : this.f) {
            $$1.b($$0);
         }
      }

      public void b(aac<?> $$0) {
         this.a($$0);
         if (this.c instanceof asi) {
            ((asi)this.c).f.b($$0);
         }
      }

      public void a() {
         for (atn $$0 : this.f) {
            this.b.a($$0.o());
         }
      }

      public void a(asi $$0) {
         if (this.f.remove($$0.f)) {
            this.b.a($$0);
         }
      }

      public void b(asi $$0) {
         if ($$0 != this.c) {
            fbx $$1 = $$0.du().d(this.c.du());
            int $$2 = arm.this.b($$0);
            double $$3 = (double)Math.min(this.b(), $$2 * 16);
            double $$4 = $$1.d * $$1.d + $$1.f * $$1.f;
            double $$5 = $$3 * $$3;
            boolean $$6 = $$4 <= $$5 && this.c.a($$0) && arm.this.a($$0, this.c.dy().h, this.c.dy().i);
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
         return arm.this.t.p().b($$0);
      }

      private int b() {
         int $$0 = this.d;

         for (bvj $$1 : this.c.dd()) {
            int $$2 = $$1.aq().o() * 16;
            if ($$2 > $$0) {
               $$0 = $$2;
            }
         }

         return this.a($$0);
      }

      public void a(List<asi> $$0) {
         for (asi $$1 : $$0) {
            this.b($$1);
         }
      }
   }
}
