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

public class aqn extends dxu implements aql.b, aqy {
   private static final aqo<List<dwk>> f = aqo.a("Unloaded chunks found in range");
   private static final CompletableFuture<aqo<List<dwk>>> g = CompletableFuture.completedFuture(f);
   private static final byte h = -1;
   private static final byte i = 0;
   private static final byte j = 1;
   private static final Logger k = LogUtils.getLogger();
   private static final int l = 200;
   private static final int m = 20;
   private static final int n = 10000;
   public static final int a = 2;
   public static final int b = 32;
   public static final int c = aqm.a(aqx.d);
   private final Long2ObjectLinkedOpenHashMap<aql> o = new Long2ObjectLinkedOpenHashMap();
   private volatile Long2ObjectLinkedOpenHashMap<aql> p = this.o.clone();
   private final Long2ObjectLinkedOpenHashMap<aql> q = new Long2ObjectLinkedOpenHashMap();
   private final List<aqk> r = new ArrayList<>();
   final arh s;
   private final ark t;
   private final bqf<Runnable> u;
   private final eay v;
   private final dwm w;
   private final Supplier<esp> x;
   private final cfn y;
   final LongSet z = new LongOpenHashSet();
   private boolean A;
   private final aqq B;
   private final bqh<aqq.a<Runnable>> C;
   private final arq D;
   private final dyr E;
   private final aqn.a F;
   private final AtomicInteger G = new AtomicInteger();
   private final String H;
   private final arb I = new arb();
   private final Int2ObjectMap<aqn.b> J = new Int2ObjectOpenHashMap();
   private final Long2ByteMap K = new Long2ByteOpenHashMap();
   private final Long2LongMap L = new Long2LongOpenHashMap();
   private final Queue<Runnable> M = Queues.newConcurrentLinkedQueue();
   private int N;
   private final dxq O;

   public aqn(
      arh $$0,
      esv.c $$1,
      DataFixer $$2,
      epf $$3,
      Executor $$4,
      bqf<Runnable> $$5,
      dwx $$6,
      dwl $$7,
      arq $$8,
      dyr $$9,
      Supplier<esp> $$10,
      int $$11,
      boolean $$12
   ) {
      super(new dyd($$1.f(), $$0.ag(), "chunk"), $$1.a($$0.ag()).resolve("region"), $$2, $$12);
      Path $$13 = $$1.a($$0.ag());
      this.H = $$13.getFileName().toString();
      this.s = $$0;
      kb $$14 = $$0.F_();
      long $$15 = $$0.C();
      if ($$7 instanceof ean $$16) {
         this.v = eay.a($$16.h().a(), $$14.b(lv.aQ), $$15);
      } else {
         this.v = eay.a(eap.e(), $$14.b(lv.aQ), $$15);
      }

      this.w = $$7.a($$14.b(lv.aU), this.v, $$15);
      this.u = $$5;
      bqi<Runnable> $$17 = bqi.a($$4, "worldgen");
      this.D = $$8;
      this.E = $$9;
      bqi<Runnable> $$18 = bqi.a($$4, "light");
      this.B = new aqq(ImmutableList.of($$17, $$18), $$4, Integer.MAX_VALUE);
      this.C = this.B.a($$17, false);
      this.t = new ark($$6, this, this.s.B_().g(), $$18, this.B.a($$18, false));
      this.F = new aqn.a($$4, $$5);
      this.x = $$10;
      this.y = new cfn(new dyd($$1.f(), $$0.ag(), "poi"), $$13.resolve("poi"), $$2, $$12, $$14, $$0.o(), $$0);
      this.a($$11);
      this.O = new dxq($$0, $$7, $$3, this.t, $$5);
   }

   protected dwl a() {
      return this.O.b();
   }

   protected dwm b() {
      return this.w;
   }

   protected eay c() {
      return this.v;
   }

   private static double a(ddm $$0, bto $$1) {
      double $$2 = (double)kg.a($$0.e, 8);
      double $$3 = (double)kg.a($$0.f, 8);
      double $$4 = $$2 - $$1.dx();
      double $$5 = $$3 - $$1.dD();
      return $$4 * $$4 + $$5 * $$5;
   }

   boolean a(ari $$0, int $$1, int $$2) {
      return $$0.Z().a($$1, $$2) && !$$0.c.g.a(ddm.c($$1, $$2));
   }

   private boolean b(ari $$0, int $$1, int $$2) {
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

   protected ark d() {
      return this.t;
   }

   @Nullable
   protected aql a(long $$0) {
      return (aql)this.o.get($$0);
   }

   @Nullable
   protected aql b(long $$0) {
      return (aql)this.p.get($$0);
   }

   protected IntSupplier c(long $$0) {
      return () -> {
         aql $$1 = this.b($$0);
         return $$1 == null ? aqp.a - 1 : Math.min($$1.j(), aqp.a - 1);
      };
   }

   public String a(ddm $$0) {
      aql $$1 = this.b($$0.a());
      if ($$1 == null) {
         return "null";
      } else {
         String $$2 = $$1.i() + "\n";
         dxl $$3 = $$1.u();
         dwk $$4 = $$1.p();
         if ($$3 != null) {
            $$2 = $$2 + "St: §" + $$3.b() + $$3 + "§r\n";
         }

         if ($$4 != null) {
            $$2 = $$2 + "Ch: §" + $$4.j().b() + $$4.j() + "§r\n";
         }

         aqx $$5 = $$1.s();
         $$2 = $$2 + '§' + $$5.ordinal() + $$5;
         return $$2 + "§r";
      }
   }

   private CompletableFuture<aqo<List<dwk>>> a(aql $$0, int $$1, IntFunction<dxl> $$2) {
      if ($$1 == 0) {
         dxl $$3 = $$2.apply(0);
         return $$0.a($$3, this).thenApply($$0x -> $$0x.a(List::of));
      } else {
         int $$4 = azd.h($$1 * 2 + 1);
         List<CompletableFuture<aqo<dwk>>> $$5 = new ArrayList<>($$4);
         ddm $$6 = $$0.r();

         for (int $$7 = -$$1; $$7 <= $$1; $$7++) {
            for (int $$8 = -$$1; $$8 <= $$1; $$8++) {
               int $$9 = Math.max(Math.abs($$8), Math.abs($$7));
               long $$10 = ddm.c($$6.e + $$8, $$6.f + $$7);
               aql $$11 = this.a($$10);
               if ($$11 == null) {
                  return g;
               }

               dxl $$12 = $$2.apply($$9);
               $$5.add($$11.a($$12, this));
            }
         }

         return ad.d($$5).thenApply($$0x -> {
            List<dwk> $$1x = new ArrayList<>($$0x.size());

            for (aqo<dwk> $$2x : $$0x) {
               if ($$2x == null) {
                  throw this.a(new IllegalStateException("At least one of the chunk futures were null"), "n/a");
               }

               dwk $$3 = $$2x.b(null);
               if ($$3 == null) {
                  return f;
               }

               $$1x.add($$3);
            }

            return aqo.a($$1x);
         });
      }
   }

   public z a(IllegalStateException $$0, String $$1) {
      StringBuilder $$2 = new StringBuilder();
      Consumer<aql> $$3 = $$1x -> $$1x.t().forEach($$2x -> {
            dxl $$3x = (dxl)$$2x.getFirst();
            CompletableFuture<aqo<dwk>> $$4x = (CompletableFuture<aqo<dwk>>)$$2x.getSecond();
            if ($$4x != null && $$4x.isDone() && $$4x.join() == null) {
               $$2.append($$1x.r()).append(" - status: ").append($$3x).append(" future: ").append($$4x).append(System.lineSeparator());
            }
         });
      $$2.append("Updating:").append(System.lineSeparator());
      this.o.values().forEach($$3);
      $$2.append("Visible:").append(System.lineSeparator());
      this.p.values().forEach($$3);
      o $$4 = o.a($$0, "Chunk loading");
      p $$5 = $$4.a("Chunk loading");
      $$5.a("Details", $$1);
      $$5.a("Futures", $$2);
      return new z($$4);
   }

   public CompletableFuture<aqo<dwu>> a(aql $$0) {
      return this.a($$0, 2, $$0x -> dxl.n).thenApply($$0x -> $$0x.a($$0xx -> (dwu)$$0xx.get($$0xx.size() / 2)));
   }

   @Nullable
   aql a(long $$0, int $$1, @Nullable aql $$2, int $$3) {
      if (!aqm.f($$3) && !aqm.f($$1)) {
         return $$2;
      } else {
         if ($$2 != null) {
            $$2.a($$1);
         }

         if ($$2 != null) {
            if (!aqm.f($$1)) {
               this.z.add($$0);
            } else {
               this.z.remove($$0);
            }
         }

         if (aqm.f($$1) && $$2 == null) {
            $$2 = (aql)this.q.remove($$0);
            if ($$2 != null) {
               $$2.a($$1);
            } else {
               $$2 = new aql(new ddm($$0), $$1, this.s, this.t, this.B, this);
            }

            this.o.put($$0, $$2);
            this.A = true;
         }

         return $$2;
      }
   }

   @Override
   public void close() throws IOException {
      try {
         this.B.close();
         this.y.close();
      } finally {
         super.close();
      }
   }

   protected void a(boolean $$0) {
      if ($$0) {
         List<aql> $$1 = this.p.values().stream().filter(aql::k).peek(aql::l).toList();
         MutableBoolean $$2 = new MutableBoolean();

         do {
            $$2.setFalse();
            $$1.stream().map($$0x -> {
               this.u.b($$0x::h);
               return $$0x.p();
            }).filter($$0x -> $$0x instanceof dwt || $$0x instanceof dwu).filter(this::a).forEach($$1x -> $$2.setTrue());
         } while ($$2.isTrue());

         this.y.a();
         this.b(() -> true);
         this.o();
      } else {
         long $$3 = ad.c();
         ObjectIterator var4 = this.p.values().iterator();

         while (var4.hasNext()) {
            aql $$4 = (aql)var4.next();
            this.a($$4, $$3);
         }
      }
   }

   protected void a(BooleanSupplier $$0) {
      bod $$1 = this.s.ah();
      $$1.a("poi");
      this.y.a($$0);
      $$1.b("chunk_unload");
      if (!this.s.t()) {
         this.b($$0);
      }

      $$1.c();
   }

   public boolean e() {
      return this.t.I_() || !this.q.isEmpty() || !this.o.isEmpty() || this.y.b() || !this.z.isEmpty() || !this.M.isEmpty() || this.B.a() || this.F.h();
   }

   private void b(BooleanSupplier $$0) {
      LongIterator $$1 = this.z.iterator();

      while ($$1.hasNext()) {
         long $$2 = $$1.nextLong();
         aql $$3 = (aql)this.o.get($$2);
         if ($$3 != null) {
            if ($$3.o() != 0) {
               continue;
            }

            this.o.remove($$2);
            this.q.put($$2, $$3);
            this.A = true;
            this.a($$2, $$3);
         }

         $$1.remove();
      }

      int $$4 = Math.max(0, this.M.size() - 2000);

      Runnable $$5;
      while (($$4 > 0 || $$0.getAsBoolean()) && ($$5 = this.M.poll()) != null) {
         $$4--;
         $$5.run();
      }

      long $$6 = ad.c();
      int $$7 = 0;
      LongIterator $$8 = this.F.f().iterator();

      while ($$7 < 20 && $$0.getAsBoolean() && $$8.hasNext()) {
         long $$9 = $$8.nextLong();
         aql $$10 = (aql)this.p.get($$9);
         if ($$10 != null && this.a($$10, $$6)) {
            $$7++;
         }
      }
   }

   private void a(long $$0, aql $$1) {
      $$1.g().thenRunAsync(() -> {
         if (!$$1.h()) {
            this.a($$0, $$1);
         } else {
            dwk $$2 = $$1.p();
            if (this.q.remove($$0, $$1) && $$2 != null) {
               if ($$2 instanceof dwu $$3) {
                  $$3.c(false);
               }

               this.a($$2);
               if ($$2 instanceof dwu $$4) {
                  this.s.a($$4);
               }

               this.t.a($$2.f());
               this.t.b();
               this.D.a($$2.f(), null);
               this.L.remove($$2.f().a());
            }
         }
      }, this.M::add).whenComplete(($$1x, $$2) -> {
         if ($$2 != null) {
            k.error("Failed to save chunk {}", $$1.r(), $$2);
         }
      });
   }

   protected boolean f() {
      if (!this.A) {
         return false;
      } else {
         this.p = this.o.clone();
         this.A = false;
         return true;
      }
   }

   private CompletableFuture<dwk> f(ddm $$0) {
      CompletableFuture<Optional<dyf>> $$1 = this.j($$0).thenApplyAsync($$1x -> $$1x.map($$1xx -> {
            dyf $$2x = dyf.a(this.s, this.s.F_(), $$1xx);
            if ($$2x == null) {
               k.error("Chunk file at {} is missing level data, skipping", $$0);
            }

            return $$2x;
         }), ad.g());
      CompletableFuture<?> $$2 = this.y.a($$0);
      return $$1.<Object, Optional>thenCombine((CompletionStage<? extends Object>)$$2, ($$0x, $$1x) -> $$0x).thenApplyAsync($$1x -> {
         this.s.ah().d("chunkLoad");
         if ($$1x.isPresent()) {
            dwk $$2x = ((dyf)$$1x.get()).a(this.s, this.y, this.q(), $$0);
            this.a($$0, $$2x.j().d());
            return $$2x;
         } else {
            return this.g($$0);
         }
      }, this.u).exceptionallyAsync($$1x -> this.a($$1x, $$0), this.u);
   }

   private dwk a(Throwable $$0, ddm $$1) {
      Throwable $$3 = $$0 instanceof CompletionException $$2 ? $$2.getCause() : $$0;
      Throwable $$5 = $$3 instanceof z $$4 ? $$4.getCause() : $$3;
      boolean $$6 = $$5 instanceof Error;
      boolean $$7 = $$5 instanceof IOException || $$5 instanceof uq;
      if (!$$6 && $$7) {
         this.s.o().a($$5, this.q(), $$1);
         return this.g($$1);
      } else {
         o $$8 = o.a($$0, "Exception loading chunk");
         p $$9 = $$8.a("Chunk being loaded");
         $$9.a("pos", $$1);
         this.h($$1);
         throw new z($$8);
      }
   }

   private dwk g(ddm $$0) {
      this.h($$0);
      return new dxe($$0, dxh.a, this.s, this.s.F_().d(lv.aG), null);
   }

   private void h(ddm $$0) {
      this.K.put($$0.a(), (byte)-1);
   }

   private byte a(ddm $$0, dxp $$1) {
      return this.K.put($$0.a(), (byte)($$1 == dxp.a ? -1 : 1));
   }

   @Override
   public aqz d(long $$0) {
      aql $$1 = (aql)this.o.get($$0);
      $$1.m();
      return $$1;
   }

   @Override
   public void a(aqz $$0) {
      $$0.n();
   }

   @Override
   public CompletableFuture<dwk> a(aqz $$0, dxo $$1, azx<aqz> $$2) {
      ddm $$3 = $$0.r();
      if ($$1.a() == dxl.c) {
         return this.f($$3);
      } else {
         try {
            aqz $$4 = $$2.a($$3.e, $$3.f);
            dwk $$5 = $$4.a($$1.a().c());
            if ($$5 == null) {
               throw new IllegalStateException("Parent chunk missing");
            } else {
               CompletableFuture<dwk> $$6 = $$1.a(this.O, $$2, $$5);
               this.D.a($$3, $$1.a());
               return $$6;
            }
         } catch (Exception var8) {
            var8.getStackTrace();
            o $$8 = o.a(var8, "Exception generating new chunk");
            p $$9 = $$8.a("Chunk to be generated");
            $$9.a("Status being generated", () -> $$1.a().f());
            $$9.a("Location", String.format(Locale.ROOT, "%d,%d", $$3.e, $$3.f));
            $$9.a("Position hash", ddm.c($$3.e, $$3.f));
            $$9.a("Generator", this.a());
            this.u.execute(() -> {
               throw new z($$8);
            });
            throw new z($$8);
         }
      }
   }

   @Override
   public aqk a(dxl $$0, ddm $$1) {
      aqk $$2 = aqk.a(this, $$0, $$1);
      this.r.add($$2);
      return $$2;
   }

   private void a(aqk $$0) {
      this.C.a(aqq.a($$0.c(), () -> {
         CompletableFuture<?> $$1 = $$0.a();
         if ($$1 != null) {
            $$1.thenRun(() -> this.a($$0));
         }
      }));
   }

   @Override
   public void g() {
      this.r.forEach(this::a);
      this.r.clear();
   }

   public CompletableFuture<aqo<dwu>> b(aql $$0) {
      CompletableFuture<aqo<List<dwk>>> $$1 = this.a($$0, 1, $$0x -> dxl.n);
      CompletableFuture<aqo<dwu>> $$2 = $$1.thenApplyAsync($$1x -> $$1x.a($$1xx -> {
            dwu $$2x = (dwu)$$1xx.get($$1xx.size() / 2);
            $$2x.G();
            this.s.b($$2x);
            CompletableFuture<?> $$3 = $$0.f();
            if ($$3.isDone()) {
               this.a($$2x);
            } else {
               $$3.thenAcceptAsync($$1xxx -> this.a($$2x), this.u);
            }

            return $$2x;
         }), this.u);
      $$2.handle(($$0x, $$1x) -> {
         this.G.getAndIncrement();
         return null;
      });
      return $$2;
   }

   private void a(dwu $$0) {
      ddm $$1 = $$0.f();

      for (ari $$2 : this.I.a()) {
         if ($$2.Z().a($$1)) {
            a($$2, $$0);
         }
      }
   }

   public CompletableFuture<aqo<dwu>> c(aql $$0) {
      return this.a($$0, 1, aqm::b).thenApply($$0x -> $$0x.a($$0xx -> (dwu)$$0xx.get($$0xx.size() / 2)));
   }

   public int h() {
      return this.G.get();
   }

   private boolean a(aql $$0, long $$1) {
      if ($$0.k() && $$0.h()) {
         dwk $$2 = $$0.p();
         if (!($$2 instanceof dwt) && !($$2 instanceof dwu)) {
            return false;
         } else if (!$$2.i()) {
            return false;
         } else {
            long $$3 = $$2.f().a();
            long $$4 = this.L.getOrDefault($$3, -1L);
            if ($$1 < $$4) {
               return false;
            } else {
               boolean $$5 = this.a($$2);
               $$0.l();
               if ($$5) {
                  this.L.put($$3, $$1 + 10000L);
               }

               return $$5;
            }
         }
      } else {
         return false;
      }
   }

   private boolean a(dwk $$0) {
      this.y.b($$0.f());
      if (!$$0.i()) {
         return false;
      } else {
         $$0.a(false);
         ddm $$1 = $$0.f();

         try {
            dxl $$2 = $$0.j();
            if ($$2.d() != dxp.b) {
               if (this.i($$1)) {
                  return false;
               }

               if ($$2 == dxl.c && $$0.g().values().stream().noneMatch(elk::b)) {
                  return false;
               }
            }

            this.s.ah().d("chunkSave");
            dyf $$3 = dyf.a(this.s, $$0);
            CompletableFuture<uf> $$4 = CompletableFuture.supplyAsync($$3::a, ad.g());
            this.a($$1, $$4::join).exceptionally($$1x -> {
               this.s.o().b($$1x, this.q(), $$1);
               return null;
            });
            this.a($$1, $$2.d());
            return true;
         } catch (Exception var6) {
            this.s.o().b(var6, this.q(), $$1);
            return false;
         }
      }
   }

   private boolean i(ddm $$0) {
      byte $$1 = this.K.get($$0.a());
      if ($$1 != 0) {
         return $$1 == 1;
      } else {
         uf $$2;
         try {
            $$2 = this.j($$0).join().orElse(null);
            if ($$2 == null) {
               this.h($$0);
               return false;
            }
         } catch (Exception var5) {
            k.error("Failed to read chunk {}", $$0, var5);
            this.h($$0);
            return false;
         }

         dxp $$5 = dyf.a($$2);
         return this.a($$0, $$5) == 1;
      }
   }

   protected void a(int $$0) {
      int $$1 = azd.a($$0, 2, 32);
      if ($$1 != this.N) {
         this.N = $$1;
         this.F.a(this.N);

         for (ari $$2 : this.I.a()) {
            this.e($$2);
         }
      }
   }

   int b(ari $$0) {
      return azd.a($$0.G(), 2, this.N);
   }

   private void a(ari $$0, ddm $$1) {
      dwu $$2 = this.e($$1.a());
      if ($$2 != null) {
         a($$0, $$2);
      }
   }

   private static void a(ari $$0, dwu $$1) {
      $$0.c.g.a($$1);
   }

   private static void b(ari $$0, ddm $$1) {
      $$0.c.g.a($$0, $$1);
   }

   @Nullable
   public dwu e(long $$0) {
      aql $$1 = this.b($$0);
      return $$1 == null ? null : $$1.e();
   }

   public int i() {
      return this.p.size();
   }

   public aqw j() {
      return this.F;
   }

   protected Iterable<aql> k() {
      return Iterables.unmodifiableIterable(this.p.values());
   }

   void a(Writer $$0) throws IOException {
      ayd $$1 = ayd.a()
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
      arn $$2 = this.F.e();
      ObjectBidirectionalIterator var4 = this.p.long2ObjectEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<aql> $$3 = (Entry<aql>)var4.next();
         long $$4 = $$3.getLongKey();
         ddm $$5 = new ddm($$4);
         aql $$6 = (aql)$$3.getValue();
         Optional<dwk> $$7 = Optional.ofNullable($$6.p());
         Optional<dwu> $$8 = $$7.flatMap($$0x -> $$0x instanceof dwu ? Optional.of((dwu)$$0x) : Optional.empty());
         $$1.a(
            $$5.e,
            $$5.f,
            $$6.i(),
            $$7.isPresent(),
            $$7.map(dwk::j).orElse(null),
            $$8.map(dwu::C).orElse(null),
            a($$6.c()),
            a($$6.a()),
            a($$6.b()),
            this.F.e($$4),
            this.b($$5),
            $$8.<Integer>map($$0x -> $$0x.F().size()).orElse(0),
            $$2.d($$4),
            $$2.c($$4),
            $$8.<Integer>map($$0x -> $$0x.o().a()).orElse(0),
            $$8.<Integer>map($$0x -> $$0x.p().a()).orElse(0)
         );
      }
   }

   private static String a(CompletableFuture<aqo<dwu>> $$0) {
      try {
         aqo<dwu> $$1 = $$0.getNow(null);
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

   private CompletableFuture<Optional<uf>> j(ddm $$0) {
      return this.d($$0).thenApplyAsync($$0x -> $$0x.map(this::b), ad.g());
   }

   private uf b(uf $$0) {
      return this.a(this.s.ag(), this.x, $$0, this.a().c());
   }

   void a(Consumer<aql> $$0) {
      LongIterator $$1 = this.F.c();

      while ($$1.hasNext()) {
         long $$2 = $$1.nextLong();
         aql $$3 = (aql)this.p.get($$2);
         if ($$3 != null && this.k($$3.r())) {
            $$0.accept($$3);
         }
      }
   }

   boolean b(ddm $$0) {
      return !this.F.f($$0.a()) ? false : this.k($$0);
   }

   private boolean k(ddm $$0) {
      for (ari $$1 : this.I.a()) {
         if (this.c($$1, $$0)) {
            return true;
         }
      }

      return false;
   }

   public List<ari> c(ddm $$0) {
      long $$1 = $$0.a();
      if (!this.F.f($$1)) {
         return List.of();
      } else {
         Builder<ari> $$2 = ImmutableList.builder();

         for (ari $$3 : this.I.a()) {
            if (this.c($$3, $$0)) {
               $$2.add($$3);
            }
         }

         return $$2.build();
      }
   }

   private boolean c(ari $$0, ddm $$1) {
      if ($$0.P_()) {
         return false;
      } else {
         double $$2 = a($$1, $$0);
         return $$2 < 16384.0;
      }
   }

   private boolean c(ari $$0) {
      return $$0.P_() && !this.s.ac().b(dec.r);
   }

   void a(ari $$0, boolean $$1) {
      boolean $$2 = this.c($$0);
      boolean $$3 = this.I.d($$0);
      if ($$1) {
         this.I.a($$0, $$2);
         this.d($$0);
         if (!$$2) {
            this.F.a(kg.a($$0), $$0);
         }

         $$0.a(aqs.a);
         this.e($$0);
      } else {
         kg $$4 = $$0.Y();
         this.I.a($$0);
         if (!$$3) {
            this.F.b($$4, $$0);
         }

         this.a($$0, aqs.a);
      }
   }

   private void d(ari $$0) {
      kg $$1 = kg.a($$0);
      $$0.a($$1);
   }

   public void a(ari $$0) {
      ObjectIterator $$2 = this.J.values().iterator();

      while ($$2.hasNext()) {
         aqn.b $$1 = (aqn.b)$$2.next();
         if ($$1.c == $$0) {
            $$1.a(this.s.x());
         } else {
            $$1.b($$0);
         }
      }

      kg $$2x = $$0.Y();
      kg $$3 = kg.a($$0);
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

   private void e(ari $$0) {
      ddm $$1 = $$0.du();
      int $$2 = this.b($$0);
      if ($$0.Z() instanceof aqs.a $$3 && $$3.a().equals($$1) && $$3.b() == $$2) {
         return;
      }

      this.a($$0, aqs.a($$1, $$2));
   }

   private void a(ari $$0, aqs $$1) {
      if ($$0.dS() == this.s) {
         aqs $$2 = $$0.Z();
         if ($$1 instanceof aqs.a $$3 && (!($$2 instanceof aqs.a $$4) || !$$4.a().equals($$3.a()))) {
            $$0.c.b(new afa($$3.a().e, $$3.a().f));
         }

         aqs.a($$2, $$1, $$1x -> this.a($$0, $$1x), $$1x -> b($$0, $$1x));
         $$0.a($$1);
      }
   }

   @Override
   public List<ari> a(ddm $$0, boolean $$1) {
      Set<ari> $$2 = this.I.a();
      Builder<ari> $$3 = ImmutableList.builder();

      for (ari $$4 : $$2) {
         if ($$1 && this.b($$4, $$0.e, $$0.f) || !$$1 && this.a($$4, $$0.e, $$0.f)) {
            $$3.add($$4);
         }
      }

      return $$3.build();
   }

   protected void a(bto $$0) {
      if (!($$0 instanceof ciu)) {
         btv<?> $$1 = $$0.ao();
         int $$2 = $$1.o() * 16;
         if ($$2 != 0) {
            int $$3 = $$1.p();
            if (this.J.containsKey($$0.ap())) {
               throw (IllegalStateException)ad.b(new IllegalStateException("Entity is already tracked!"));
            } else {
               aqn.b $$4 = new aqn.b($$0, $$2, $$3, $$1.q());
               this.J.put($$0.ap(), $$4);
               $$4.a(this.s.x());
               if ($$0 instanceof ari $$5) {
                  this.a($$5, true);
                  ObjectIterator var7 = this.J.values().iterator();

                  while (var7.hasNext()) {
                     aqn.b $$6 = (aqn.b)var7.next();
                     if ($$6.c != $$5) {
                        $$6.b($$5);
                     }
                  }
               }
            }
         }
      }
   }

   protected void b(bto $$0) {
      if ($$0 instanceof ari $$1) {
         this.a($$1, false);
         ObjectIterator var3 = this.J.values().iterator();

         while (var3.hasNext()) {
            aqn.b $$2 = (aqn.b)var3.next();
            $$2.a($$1);
         }
      }

      aqn.b $$3 = (aqn.b)this.J.remove($$0.ap());
      if ($$3 != null) {
         $$3.a();
      }
   }

   protected void l() {
      for (ari $$0 : this.I.a()) {
         this.e($$0);
      }

      List<ari> $$1 = Lists.newArrayList();
      List<ari> $$2 = this.s.x();
      ObjectIterator var3 = this.J.values().iterator();

      while (var3.hasNext()) {
         aqn.b $$3 = (aqn.b)var3.next();
         kg $$4 = $$3.e;
         kg $$5 = kg.a($$3.c);
         boolean $$6 = !Objects.equals($$4, $$5);
         if ($$6) {
            $$3.a($$2);
            bto $$7 = $$3.c;
            if ($$7 instanceof ari) {
               $$1.add((ari)$$7);
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
            aqn.b $$8 = (aqn.b)var3.next();
            $$8.a($$1);
         }
      }
   }

   public void a(bto $$0, zk<?> $$1) {
      aqn.b $$2 = (aqn.b)this.J.get($$0.ap());
      if ($$2 != null) {
         $$2.a($$1);
      }
   }

   protected void b(bto $$0, zk<?> $$1) {
      aqn.b $$2 = (aqn.b)this.J.get($$0.ap());
      if ($$2 != null) {
         $$2.b($$1);
      }
   }

   public void a(List<dwk> $$0) {
      Map<ari, List<dwu>> $$1 = new HashMap<>();

      for (dwk $$2 : $$0) {
         ddm $$3 = $$2.f();
         dwu $$5;
         if ($$2 instanceof dwu $$4) {
            $$5 = $$4;
         } else {
            $$5 = this.s.d($$3.e, $$3.f);
         }

         for (ari $$7 : this.a($$3, false)) {
            $$1.computeIfAbsent($$7, $$0x -> new ArrayList<>()).add($$5);
         }
      }

      $$1.forEach(($$0x, $$1x) -> $$0x.c.b(acp.a($$1x)));
   }

   protected cfn m() {
      return this.y;
   }

   public String n() {
      return this.H;
   }

   void a(ddm $$0, aqx $$1) {
      this.E.onChunkStatusChange($$0, $$1);
   }

   public void a(ddm $$0, int $$1) {
      int $$2 = $$1 + 1;
      ddm.a($$0, $$2).forEach($$0x -> {
         aql $$1x = this.b($$0x.a());
         if ($$1x != null) {
            $$1x.a(this.t.a($$0x.e, $$0x.f));
         }
      });
   }

   class a extends aqw {
      protected a(final Executor $$0, final Executor $$1) {
         super($$0, $$1);
      }

      @Override
      protected boolean a(long $$0) {
         return aqn.this.z.contains($$0);
      }

      @Nullable
      @Override
      protected aql b(long $$0) {
         return aqn.this.a($$0);
      }

      @Nullable
      @Override
      protected aql a(long $$0, int $$1, @Nullable aql $$2, int $$3) {
         return aqn.this.a($$0, $$1, $$2, $$3);
      }
   }

   class b {
      final arg b;
      final bto c;
      private final int d;
      kg e;
      private final Set<asm> f = Sets.newIdentityHashSet();

      public b(final bto $$0, final int $$1, final int $$2, final boolean $$3) {
         this.b = new arg(aqn.this.s, $$0, $$2, $$3, this::a);
         this.c = $$0;
         this.d = $$1;
         this.e = kg.a($$0);
      }

      @Override
      public boolean equals(Object $$0) {
         return $$0 instanceof aqn.b ? ((aqn.b)$$0).c.ap() == this.c.ap() : false;
      }

      @Override
      public int hashCode() {
         return this.c.ap();
      }

      public void a(zk<?> $$0) {
         for (asm $$1 : this.f) {
            $$1.b($$0);
         }
      }

      public void b(zk<?> $$0) {
         this.a($$0);
         if (this.c instanceof ari) {
            ((ari)this.c).c.b($$0);
         }
      }

      public void a() {
         for (asm $$0 : this.f) {
            this.b.a($$0.o());
         }
      }

      public void a(ari $$0) {
         if (this.f.remove($$0.c)) {
            this.b.a($$0);
         }
      }

      public void b(ari $$0) {
         if ($$0 != this.c) {
            eys $$1 = $$0.dq().d(this.c.dq());
            int $$2 = aqn.this.b($$0);
            double $$3 = (double)Math.min(this.b(), $$2 * 16);
            double $$4 = $$1.d * $$1.d + $$1.f * $$1.f;
            double $$5 = $$3 * $$3;
            boolean $$6 = $$4 <= $$5 && this.c.a($$0) && aqn.this.a($$0, this.c.du().e, this.c.du().f);
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
         return aqn.this.s.o().b($$0);
      }

      private int b() {
         int $$0 = this.d;

         for (bto $$1 : this.c.da()) {
            int $$2 = $$1.ao().o() * 16;
            if ($$2 > $$0) {
               $$0 = $$2;
            }
         }

         return this.a($$0);
      }

      public void a(List<ari> $$0) {
         for (ari $$1 : $$0) {
            this.b($$1);
         }
      }
   }
}
