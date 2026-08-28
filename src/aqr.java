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

public class aqr extends ebt implements aqp.b, arc {
   private static final aqs<List<eaj>> f = aqs.a("Unloaded chunks found in range");
   private static final CompletableFuture<aqs<List<eaj>>> g = CompletableFuture.completedFuture(f);
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
   public static final int c = aqq.a(arb.d);
   private final Long2ObjectLinkedOpenHashMap<aqp> p = new Long2ObjectLinkedOpenHashMap();
   private volatile Long2ObjectLinkedOpenHashMap<aqp> q = this.p.clone();
   private final Long2ObjectLinkedOpenHashMap<aqp> r = new Long2ObjectLinkedOpenHashMap();
   private final List<aqo> s = new ArrayList<>();
   final arn t;
   private final arr u;
   private final bsf<Runnable> v;
   private final eez w;
   private final eal x;
   private final Supplier<ewt> y;
   private final dim z;
   private final cht A;
   final LongSet B = new LongOpenHashSet();
   private boolean C;
   private final aqt D;
   private final aqt E;
   private final arx F;
   private final ecq G;
   private final aqr.a H;
   private final AtomicInteger I = new AtomicInteger();
   private final String J;
   private final arg K = new arg();
   private final Int2ObjectMap<aqr.b> L = new Int2ObjectOpenHashMap();
   private final Long2ByteMap M = new Long2ByteOpenHashMap();
   private final Long2LongMap N = new Long2LongOpenHashMap();
   private final LongSet O = new LongLinkedOpenHashSet();
   private final Queue<Runnable> P = Queues.newConcurrentLinkedQueue();
   private final AtomicInteger Q = new AtomicInteger();
   private int R;
   private final ebp S;

   public aqr(
      arn $$0,
      ewz.c $$1,
      DataFixer $$2,
      etj $$3,
      Executor $$4,
      bsf<Runnable> $$5,
      eaw $$6,
      eak $$7,
      arx $$8,
      ecq $$9,
      Supplier<ewt> $$10,
      dim $$11,
      int $$12,
      boolean $$13
   ) {
      super(new ecc($$1.f(), $$0.aj(), "chunk"), $$1.a($$0.aj()).resolve("region"), $$2, $$13);
      Path $$14 = $$1.a($$0.aj());
      this.J = $$14.getFileName().toString();
      this.t = $$0;
      kg $$15 = $$0.F_();
      long $$16 = $$0.E();
      if ($$7 instanceof eeo $$17) {
         this.w = eez.a($$17.h().a(), $$15.f(me.aW), $$16);
      } else {
         this.w = eez.a(eeq.e(), $$15.f(me.aW), $$16);
      }

      this.x = $$7.a($$15.f(me.bb), this.w, $$16);
      this.v = $$5;
      bsg $$18 = new bsg($$4, "worldgen");
      this.F = $$8;
      this.G = $$9;
      bsg $$19 = new bsg($$4, "light");
      this.D = new aqt($$18, $$4);
      this.E = new aqt($$19, $$4);
      this.u = new arr($$6, this, this.t.B_().g(), $$19, this.E);
      this.H = new aqr.a($$11, $$4, $$5);
      this.y = $$10;
      this.z = $$11;
      this.A = new cht(new ecc($$1.f(), $$0.aj(), "poi"), $$14.resolve("poi"), $$2, $$13, $$15, $$0.p(), $$0);
      this.a($$12);
      this.S = new ebp($$0, $$7, $$3, this.u, $$5, this::f);
   }

   private void f(dgw $$0) {
      this.O.add($$0.a());
   }

   protected eak a() {
      return this.S.b();
   }

   protected eal b() {
      return this.x;
   }

   protected eez c() {
      return this.w;
   }

   private static double a(dgw $$0, bvs $$1) {
      double $$2 = (double)kl.a($$0.h, 8);
      double $$3 = (double)kl.a($$0.i, 8);
      double $$4 = $$2 - $$1.dA();
      double $$5 = $$3 - $$1.dG();
      return $$4 * $$4 + $$5 * $$5;
   }

   boolean a(aro $$0, int $$1, int $$2) {
      return $$0.Y().a($$1, $$2) && !$$0.f.g.a(dgw.c($$1, $$2));
   }

   private boolean b(aro $$0, int $$1, int $$2) {
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

   protected arr d() {
      return this.u;
   }

   @Nullable
   protected aqp a(long $$0) {
      return (aqp)this.p.get($$0);
   }

   @Nullable
   protected aqp b(long $$0) {
      return (aqp)this.q.get($$0);
   }

   protected IntSupplier c(long $$0) {
      return () -> {
         aqp $$1 = this.b($$0);
         return $$1 == null ? aqu.a - 1 : Math.min($$1.k(), aqu.a - 1);
      };
   }

   public String a(dgw $$0) {
      aqp $$1 = this.b($$0.a());
      if ($$1 == null) {
         return "null";
      } else {
         String $$2 = $$1.j() + "\n";
         ebk $$3 = $$1.u();
         eaj $$4 = $$1.p();
         if ($$3 != null) {
            $$2 = $$2 + "St: §" + $$3.b() + $$3 + "§r\n";
         }

         if ($$4 != null) {
            $$2 = $$2 + "Ch: §" + $$4.n().b() + $$4.n() + "§r\n";
         }

         arb $$5 = $$1.s();
         $$2 = $$2 + '§' + $$5.ordinal() + $$5;
         return $$2 + "§r";
      }
   }

   private CompletableFuture<aqs<List<eaj>>> a(aqp $$0, int $$1, IntFunction<ebk> $$2) {
      if ($$1 == 0) {
         ebk $$3 = $$2.apply(0);
         return $$0.a($$3, this).thenApply($$0x -> $$0x.a(List::of));
      } else {
         int $$4 = azk.h($$1 * 2 + 1);
         List<CompletableFuture<aqs<eaj>>> $$5 = new ArrayList<>($$4);
         dgw $$6 = $$0.r();

         for (int $$7 = -$$1; $$7 <= $$1; $$7++) {
            for (int $$8 = -$$1; $$8 <= $$1; $$8++) {
               int $$9 = Math.max(Math.abs($$8), Math.abs($$7));
               long $$10 = dgw.c($$6.h + $$8, $$6.i + $$7);
               aqp $$11 = this.a($$10);
               if ($$11 == null) {
                  return g;
               }

               ebk $$12 = $$2.apply($$9);
               $$5.add($$11.a($$12, this));
            }
         }

         return af.d($$5).thenApply($$0x -> {
            List<eaj> $$1x = new ArrayList<>($$0x.size());

            for (aqs<eaj> $$2x : $$0x) {
               if ($$2x == null) {
                  throw this.a(new IllegalStateException("At least one of the chunk futures were null"), "n/a");
               }

               eaj $$3 = $$2x.b(null);
               if ($$3 == null) {
                  return f;
               }

               $$1x.add($$3);
            }

            return aqs.a($$1x);
         });
      }
   }

   public z a(IllegalStateException $$0, String $$1) {
      StringBuilder $$2 = new StringBuilder();
      Consumer<aqp> $$3 = $$1x -> $$1x.t().forEach($$2x -> {
            ebk $$3x = (ebk)$$2x.getFirst();
            CompletableFuture<aqs<eaj>> $$4x = (CompletableFuture<aqs<eaj>>)$$2x.getSecond();
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

   public CompletableFuture<aqs<eat>> a(aqp $$0) {
      return this.a($$0, 2, $$0x -> ebk.n).thenApply($$0x -> $$0x.a($$0xx -> (eat)$$0xx.get($$0xx.size() / 2)));
   }

   @Nullable
   aqp a(long $$0, int $$1, @Nullable aqp $$2, int $$3) {
      if (!aqq.f($$3) && !aqq.f($$1)) {
         return $$2;
      } else {
         if ($$2 != null) {
            $$2.a($$1);
         }

         if ($$2 != null) {
            if (!aqq.f($$1)) {
               this.B.add($$0);
            } else {
               this.B.remove($$0);
            }
         }

         if (aqq.f($$1) && $$2 == null) {
            $$2 = (aqp)this.r.remove($$0);
            if ($$2 != null) {
               $$2.a($$1);
            } else {
               $$2 = new aqp(new dgw($$0), $$1, this.t, this.u, this::a, this);
            }

            this.p.put($$0, $$2);
            this.C = true;
         }

         return $$2;
      }
   }

   private void a(dgw $$0, IntSupplier $$1, int $$2, IntConsumer $$3) {
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
         List<aqp> $$1 = this.q.values().stream().filter(aqp::l).peek(aqp::m).toList();
         MutableBoolean $$2 = new MutableBoolean();

         do {
            $$2.setFalse();
            $$1.stream().map($$0x -> {
               this.v.b($$0x::h);
               return $$0x.p();
            }).filter($$0x -> $$0x instanceof eas || $$0x instanceof eat).filter(this::a).forEach($$1x -> $$2.setTrue());
         } while ($$2.isTrue());

         this.A.a();
         this.b(() -> true);
         this.o();
      } else {
         this.N.clear();
         long $$3 = af.c();
         ObjectIterator var4 = this.q.values().iterator();

         while (var4.hasNext()) {
            aqp $$4 = (aqp)var4.next();
            this.a($$4, $$3);
         }
      }
   }

   protected void a(BooleanSupplier $$0) {
      bqb $$1 = bqa.a();
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
         aqp $$3 = (aqp)this.p.get($$2);
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
         aqp $$5 = (aqp)this.q.get($$4);
         eaj $$6 = $$5 != null ? $$5.p() : null;
         if ($$6 == null || !$$6.k()) {
            $$3.remove();
         } else if (this.a($$5, $$1)) {
            $$2++;
            $$3.remove();
         }
      }
   }

   private void a(long $$0, aqp $$1) {
      CompletableFuture<?> $$2 = $$1.g();
      $$2.thenRunAsync(() -> {
         CompletableFuture<?> $$3 = $$1.g();
         if ($$3 != $$2) {
            this.a($$0, $$1);
         } else {
            eaj $$4 = $$1.p();
            if (this.r.remove($$0, $$1) && $$4 != null) {
               if ($$4 instanceof eat $$5) {
                  $$5.b(false);
               }

               this.a($$4);
               if ($$4 instanceof eat $$6) {
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

   private CompletableFuture<eaj> g(dgw $$0) {
      CompletableFuture<Optional<ece>> $$1 = this.k($$0).thenApplyAsync($$1x -> $$1x.map($$1xx -> {
            ece $$2x = ece.a(this.t, this.t.F_(), $$1xx);
            if ($$2x == null) {
               k.error("Chunk file at {} is missing level data, skipping", $$0);
            }

            return $$2x;
         }), af.h().a("parseChunk"));
      CompletableFuture<?> $$2 = this.A.a($$0);
      return $$1.<Object, Optional>thenCombine((CompletionStage<? extends Object>)$$2, ($$0x, $$1x) -> $$0x).thenApplyAsync($$1x -> {
         bqa.a().f("chunkLoad");
         if ($$1x.isPresent()) {
            eaj $$2x = ((ece)$$1x.get()).a(this.t, this.A, this.q(), $$0);
            this.a($$0, $$2x.n().d());
            return $$2x;
         } else {
            return this.h($$0);
         }
      }, this.v).exceptionallyAsync($$1x -> this.a($$1x, $$0), this.v);
   }

   private eaj a(Throwable $$0, dgw $$1) {
      Throwable $$3 = $$0 instanceof CompletionException $$2 ? $$2.getCause() : $$0;
      Throwable $$5 = $$3 instanceof z $$4 ? $$4.getCause() : $$3;
      boolean $$6 = $$5 instanceof Error;
      boolean $$7 = $$5 instanceof IOException || $$5 instanceof uh;
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

   private eaj h(dgw $$0) {
      this.i($$0);
      return new ebd($$0, ebg.a, this.t, this.t.F_().f(me.aM), null);
   }

   private void i(dgw $$0) {
      this.M.put($$0.a(), (byte)-1);
   }

   private byte a(dgw $$0, ebo $$1) {
      return this.M.put($$0.a(), (byte)($$1 == ebo.a ? -1 : 1));
   }

   @Override
   public ard d(long $$0) {
      aqp $$1 = (aqp)this.p.get($$0);
      $$1.n();
      return $$1;
   }

   @Override
   public void a(ard $$0) {
      $$0.o();
   }

   @Override
   public CompletableFuture<eaj> a(ard $$0, ebn $$1, bae<ard> $$2) {
      dgw $$3 = $$0.r();
      if ($$1.a() == ebk.c) {
         return this.g($$3);
      } else {
         try {
            ard $$4 = $$2.a($$3.h, $$3.i);
            eaj $$5 = $$4.a($$1.a().c());
            if ($$5 == null) {
               throw new IllegalStateException("Parent chunk missing");
            } else {
               CompletableFuture<eaj> $$6 = $$1.a(this.S, $$2, $$5);
               this.F.a($$3, $$1.a());
               return $$6;
            }
         } catch (Exception var8) {
            var8.getStackTrace();
            o $$8 = o.a(var8, "Exception generating new chunk");
            p $$9 = $$8.a("Chunk to be generated");
            $$9.a("Status being generated", () -> $$1.a().f());
            $$9.a("Location", String.format(Locale.ROOT, "%d,%d", $$3.h, $$3.i));
            $$9.a("Position hash", dgw.c($$3.h, $$3.i));
            $$9.a("Generator", this.a());
            this.v.execute(() -> {
               throw new z($$8);
            });
            throw new z($$8);
         }
      }
   }

   @Override
   public aqo a(ebk $$0, dgw $$1) {
      aqo $$2 = aqo.a(this, $$0, $$1);
      this.s.add($$2);
      return $$2;
   }

   private void a(aqo $$0) {
      ard $$1 = $$0.c();
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

   public CompletableFuture<aqs<eat>> b(aqp $$0) {
      CompletableFuture<aqs<List<eaj>>> $$1 = this.a($$0, 1, $$0x -> ebk.n);
      CompletableFuture<aqs<eat>> $$2 = $$1.thenApplyAsync($$1x -> $$1x.a($$1xx -> {
            eat $$2x = (eat)$$1xx.get($$1xx.size() / 2);
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

   private void a(aqp $$0, eat $$1) {
      dgw $$2 = $$1.f();

      for (aro $$3 : this.K.a()) {
         if ($$3.Y().a($$2)) {
            a($$3, $$1);
         }
      }

      this.t.m().a($$0);
   }

   public CompletableFuture<aqs<eat>> c(aqp $$0) {
      return this.a($$0, 1, aqq::b).thenApply($$0x -> $$0x.a($$0xx -> (eat)$$0xx.get($$0xx.size() / 2)));
   }

   public int h() {
      return this.I.get();
   }

   private boolean a(aqp $$0, long $$1) {
      if ($$0.l() && $$0.h()) {
         eaj $$2 = $$0.p();
         if (!($$2 instanceof eas) && !($$2 instanceof eat)) {
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

   private boolean a(eaj $$0) {
      this.A.b($$0.f());
      if (!$$0.j()) {
         return false;
      } else {
         dgw $$1 = $$0.f();

         try {
            ebk $$2 = $$0.n();
            if ($$2.d() != ebo.b) {
               if (this.j($$1)) {
                  return false;
               }

               if ($$2 == ebk.c && $$0.g().values().stream().noneMatch(epo::b)) {
                  return false;
               }
            }

            bqa.a().f("chunkSave");
            this.Q.incrementAndGet();
            ece $$3 = ece.a(this.t, $$0);
            CompletableFuture<tw> $$4 = CompletableFuture.supplyAsync($$3::a, af.h());
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

   private boolean j(dgw $$0) {
      byte $$1 = this.M.get($$0.a());
      if ($$1 != 0) {
         return $$1 == 1;
      } else {
         tw $$2;
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

         ebo $$5 = ece.a($$2);
         return this.a($$0, $$5) == 1;
      }
   }

   protected void a(int $$0) {
      int $$1 = azk.a($$0, 2, 32);
      if ($$1 != this.R) {
         this.R = $$1;
         this.H.a(this.R);

         for (aro $$2 : this.K.a()) {
            this.e($$2);
         }
      }
   }

   int b(aro $$0) {
      return azk.a($$0.F(), 2, this.R);
   }

   private void a(aro $$0, dgw $$1) {
      eat $$2 = this.e($$1.a());
      if ($$2 != null) {
         a($$0, $$2);
      }
   }

   private static void a(aro $$0, eat $$1) {
      $$0.f.g.a($$1);
   }

   private static void b(aro $$0, dgw $$1) {
      $$0.f.g.a($$0, $$1);
   }

   @Nullable
   public eat e(long $$0) {
      aqp $$1 = this.b($$0);
      return $$1 == null ? null : $$1.e();
   }

   public int i() {
      return this.q.size();
   }

   public ara j() {
      return this.H;
   }

   protected Iterable<aqp> k() {
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
         Entry<aqp> $$2 = (Entry<aqp>)var3.next();
         long $$3 = $$2.getLongKey();
         dgw $$4 = new dgw($$3);
         aqp $$5 = (aqp)$$2.getValue();
         Optional<eaj> $$6 = Optional.ofNullable($$5.p());
         Optional<eat> $$7 = $$6.flatMap($$0x -> $$0x instanceof eat ? Optional.of((eat)$$0x) : Optional.empty());
         $$1.a(
            $$4.h,
            $$4.i,
            $$5.j(),
            $$6.isPresent(),
            $$6.map(eaj::n).orElse(null),
            $$7.map(eat::F).orElse(null),
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

   private static String a(CompletableFuture<aqs<eat>> $$0) {
      try {
         aqs<eat> $$1 = $$0.getNow(null);
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

   private CompletableFuture<Optional<tw>> k(dgw $$0) {
      return this.d($$0).thenApplyAsync($$0x -> $$0x.map(this::b), af.h().a("upgradeChunk"));
   }

   private tw b(tw $$0) {
      return this.a(this.t.aj(), this.y, $$0, this.a().c());
   }

   void a(Consumer<aqp> $$0) {
      LongIterator $$1 = this.H.b();

      while ($$1.hasNext()) {
         long $$2 = $$1.nextLong();
         aqp $$3 = (aqp)this.q.get($$2);
         if ($$3 != null && this.l($$3.r())) {
            $$0.accept($$3);
         }
      }
   }

   boolean b(dgw $$0) {
      return !this.H.e($$0.a()) ? false : this.l($$0);
   }

   private boolean l(dgw $$0) {
      for (aro $$1 : this.K.a()) {
         if (this.c($$1, $$0)) {
            return true;
         }
      }

      return false;
   }

   public List<aro> c(dgw $$0) {
      long $$1 = $$0.a();
      if (!this.H.e($$1)) {
         return List.of();
      } else {
         Builder<aro> $$2 = ImmutableList.builder();

         for (aro $$3 : this.K.a()) {
            if (this.c($$3, $$0)) {
               $$2.add($$3);
            }
         }

         return $$2.build();
      }
   }

   private boolean c(aro $$0, dgw $$1) {
      if ($$0.U_()) {
         return false;
      } else {
         double $$2 = a($$1, $$0);
         return $$2 < 16384.0;
      }
   }

   private boolean c(aro $$0) {
      return $$0.U_() && !this.t.O().c(dhl.r);
   }

   void a(aro $$0, boolean $$1) {
      boolean $$2 = this.c($$0);
      boolean $$3 = this.K.d($$0);
      if ($$1) {
         this.K.a($$0, $$2);
         this.d($$0);
         if (!$$2) {
            this.H.a(kl.a($$0), $$0);
         }

         $$0.a(aqw.a);
         this.e($$0);
      } else {
         kl $$4 = $$0.X();
         this.K.a($$0);
         if (!$$3) {
            this.H.b($$4, $$0);
         }

         this.a($$0, aqw.a);
      }
   }

   private void d(aro $$0) {
      kl $$1 = kl.a($$0);
      $$0.a($$1);
   }

   public void a(aro $$0) {
      ObjectIterator $$2 = this.L.values().iterator();

      while ($$2.hasNext()) {
         aqr.b $$1 = (aqr.b)$$2.next();
         if ($$1.c == $$0) {
            $$1.a(this.t.z());
         } else {
            $$1.b($$0);
         }
      }

      kl $$2x = $$0.X();
      kl $$3 = kl.a($$0);
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

   private void e(aro $$0) {
      dgw $$1 = $$0.dx();
      int $$2 = this.b($$0);
      if ($$0.Y() instanceof aqw.a $$3 && $$3.a().equals($$1) && $$3.b() == $$2) {
         return;
      }

      this.a($$0, aqw.a($$1, $$2));
   }

   private void a(aro $$0, aqw $$1) {
      if ($$0.dV() == this.t) {
         aqw $$2 = $$0.Y();
         if ($$1 instanceof aqw.a $$3 && (!($$2 instanceof aqw.a $$4) || !$$4.a().equals($$3.a()))) {
            $$0.f.b(new aev($$3.a().h, $$3.a().i));
         }

         aqw.a($$2, $$1, $$1x -> this.a($$0, $$1x), $$1x -> b($$0, $$1x));
         $$0.a($$1);
      }
   }

   @Override
   public List<aro> a(dgw $$0, boolean $$1) {
      Set<aro> $$2 = this.K.a();
      Builder<aro> $$3 = ImmutableList.builder();

      for (aro $$4 : $$2) {
         if ($$1 && this.b($$4, $$0.h, $$0.i) || !$$1 && this.a($$4, $$0.h, $$0.i)) {
            $$3.add($$4);
         }
      }

      return $$3.build();
   }

   protected void a(bvs $$0) {
      if (!($$0 instanceof cld)) {
         bwb<?> $$1 = $$0.aq();
         int $$2 = $$1.o() * 16;
         if ($$2 != 0) {
            int $$3 = $$1.p();
            if (this.L.containsKey($$0.ar())) {
               throw (IllegalStateException)af.b(new IllegalStateException("Entity is already tracked!"));
            } else {
               aqr.b $$4 = new aqr.b($$0, $$2, $$3, $$1.q());
               this.L.put($$0.ar(), $$4);
               $$4.a(this.t.z());
               if ($$0 instanceof aro $$5) {
                  this.a($$5, true);
                  ObjectIterator var7 = this.L.values().iterator();

                  while (var7.hasNext()) {
                     aqr.b $$6 = (aqr.b)var7.next();
                     if ($$6.c != $$5) {
                        $$6.b($$5);
                     }
                  }
               }
            }
         }
      }
   }

   protected void b(bvs $$0) {
      if ($$0 instanceof aro $$1) {
         this.a($$1, false);
         ObjectIterator var3 = this.L.values().iterator();

         while (var3.hasNext()) {
            aqr.b $$2 = (aqr.b)var3.next();
            $$2.a($$1);
         }
      }

      aqr.b $$3 = (aqr.b)this.L.remove($$0.ar());
      if ($$3 != null) {
         $$3.a();
      }
   }

   protected void l() {
      for (aro $$0 : this.K.a()) {
         this.e($$0);
      }

      List<aro> $$1 = Lists.newArrayList();
      List<aro> $$2 = this.t.z();
      ObjectIterator var3 = this.L.values().iterator();

      while (var3.hasNext()) {
         aqr.b $$3 = (aqr.b)var3.next();
         kl $$4 = $$3.e;
         kl $$5 = kl.a($$3.c);
         boolean $$6 = !Objects.equals($$4, $$5);
         if ($$6) {
            $$3.a($$2);
            bvs $$7 = $$3.c;
            if ($$7 instanceof aro) {
               $$1.add((aro)$$7);
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
            aqr.b $$8 = (aqr.b)var3.next();
            $$8.a($$1);
         }
      }
   }

   public void a(bvs $$0, zc<?> $$1) {
      aqr.b $$2 = (aqr.b)this.L.get($$0.ar());
      if ($$2 != null) {
         $$2.a($$1);
      }
   }

   protected void b(bvs $$0, zc<?> $$1) {
      aqr.b $$2 = (aqr.b)this.L.get($$0.ar());
      if ($$2 != null) {
         $$2.b($$1);
      }
   }

   public void a(List<eaj> $$0) {
      Map<aro, List<eat>> $$1 = new HashMap<>();

      for (eaj $$2 : $$0) {
         dgw $$3 = $$2.f();
         eat $$5;
         if ($$2 instanceof eat $$4) {
            $$5 = $$4;
         } else {
            $$5 = this.t.d($$3.h, $$3.i);
         }

         for (aro $$7 : this.a($$3, false)) {
            $$1.computeIfAbsent($$7, $$0x -> new ArrayList<>()).add($$5);
         }
      }

      $$1.forEach(($$0x, $$1x) -> $$0x.f.b(acg.a($$1x)));
   }

   protected cht m() {
      return this.A;
   }

   public String n() {
      return this.J;
   }

   void a(dgw $$0, arb $$1) {
      this.G.onChunkStatusChange($$0, $$1);
   }

   public void a(dgw $$0, int $$1) {
      int $$2 = $$1 + 1;
      dgw.a($$0, $$2).forEach($$0x -> {
         aqp $$1x = this.b($$0x.a());
         if ($$1x != null) {
            $$1x.a(this.u.a($$0x.h, $$0x.i));
         }
      });
   }

   class a extends ara {
      protected a(final dim $$0, final Executor $$1, final Executor $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      protected boolean a(long $$0) {
         return aqr.this.B.contains($$0);
      }

      @Nullable
      @Override
      protected aqp b(long $$0) {
         return aqr.this.a($$0);
      }

      @Nullable
      @Override
      protected aqp a(long $$0, int $$1, @Nullable aqp $$2, int $$3) {
         return aqr.this.a($$0, $$1, $$2, $$3);
      }
   }

   class b {
      final arl b;
      final bvs c;
      private final int d;
      kl e;
      private final Set<ast> f = Sets.newIdentityHashSet();

      public b(final bvs $$0, final int $$1, final int $$2, final boolean $$3) {
         this.b = new arl(aqr.this.t, $$0, $$2, $$3, this::a, this::a);
         this.c = $$0;
         this.d = $$1;
         this.e = kl.a($$0);
      }

      @Override
      public boolean equals(Object $$0) {
         return $$0 instanceof aqr.b ? ((aqr.b)$$0).c.ar() == this.c.ar() : false;
      }

      @Override
      public int hashCode() {
         return this.c.ar();
      }

      public void a(zc<?> $$0) {
         for (ast $$1 : this.f) {
            $$1.b($$0);
         }
      }

      public void a(zc<?> $$0, List<UUID> $$1) {
         for (ast $$2 : this.f) {
            if (!$$1.contains($$2.o().cG())) {
               $$2.b($$0);
            }
         }
      }

      public void b(zc<?> $$0) {
         this.a($$0);
         if (this.c instanceof aro) {
            ((aro)this.c).f.b($$0);
         }
      }

      public void a() {
         for (ast $$0 : this.f) {
            this.b.a($$0.o());
         }
      }

      public void a(aro $$0) {
         if (this.f.remove($$0.f)) {
            this.b.a($$0);
         }
      }

      public void b(aro $$0) {
         if ($$0 != this.c) {
            fcu $$1 = $$0.dt().d(this.c.dt());
            int $$2 = aqr.this.b($$0);
            double $$3 = (double)Math.min(this.b(), $$2 * 16);
            double $$4 = $$1.d * $$1.d + $$1.f * $$1.f;
            double $$5 = $$3 * $$3;
            boolean $$6 = $$4 <= $$5 && this.c.a($$0) && aqr.this.a($$0, this.c.dx().h, this.c.dx().i);
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
         return aqr.this.t.p().b($$0);
      }

      private int b() {
         int $$0 = this.d;

         for (bvs $$1 : this.c.dc()) {
            int $$2 = $$1.aq().o() * 16;
            if ($$2 > $$0) {
               $$0 = $$2;
            }
         }

         return this.a($$0);
      }

      public void a(List<aro> $$0) {
         for (aro $$1 : $$0) {
            this.b($$1);
         }
      }
   }
}
