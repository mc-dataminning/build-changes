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
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.slf4j.Logger;

public class aqu extends dza implements aqs.b, arf {
   private static final aqv<List<dxq>> f = aqv.a("Unloaded chunks found in range");
   private static final CompletableFuture<aqv<List<dxq>>> g = CompletableFuture.completedFuture(f);
   private static final byte h = -1;
   private static final byte i = 0;
   private static final byte j = 1;
   private static final Logger k = LogUtils.getLogger();
   private static final int l = 200;
   private static final int m = 20;
   private static final int n = 10000;
   public static final int a = 2;
   public static final int b = 32;
   public static final int c = aqt.a(are.d);
   private final Long2ObjectLinkedOpenHashMap<aqs> o = new Long2ObjectLinkedOpenHashMap();
   private volatile Long2ObjectLinkedOpenHashMap<aqs> p = this.o.clone();
   private final Long2ObjectLinkedOpenHashMap<aqs> q = new Long2ObjectLinkedOpenHashMap();
   private final List<aqr> r = new ArrayList<>();
   final arp s;
   private final ars t;
   private final bqz<Runnable> u;
   private final ece v;
   private final dxs w;
   private final Supplier<etv> x;
   private final cgl y;
   final LongSet z = new LongOpenHashSet();
   private boolean A;
   private final aqw B;
   private final aqw C;
   private final arz D;
   private final dzx E;
   private final aqu.a F;
   private final AtomicInteger G = new AtomicInteger();
   private final String H;
   private final ari I = new ari();
   private final Int2ObjectMap<aqu.b> J = new Int2ObjectOpenHashMap();
   private final Long2ByteMap K = new Long2ByteOpenHashMap();
   private final Long2LongMap L = new Long2LongOpenHashMap();
   private final Queue<Runnable> M = Queues.newConcurrentLinkedQueue();
   private int N;
   private final dyw O;

   public aqu(
      arp $$0,
      eub.c $$1,
      DataFixer $$2,
      eql $$3,
      Executor $$4,
      bqz<Runnable> $$5,
      dyd $$6,
      dxr $$7,
      arz $$8,
      dzx $$9,
      Supplier<etv> $$10,
      int $$11,
      boolean $$12
   ) {
      super(new dzj($$1.f(), $$0.ag(), "chunk"), $$1.a($$0.ag()).resolve("region"), $$2, $$12);
      Path $$13 = $$1.a($$0.ag());
      this.H = $$13.getFileName().toString();
      this.s = $$0;
      ke $$14 = $$0.J_();
      long $$15 = $$0.D();
      if ($$7 instanceof ebt $$16) {
         this.v = ece.a($$16.h().a(), $$14.e(ma.aQ), $$15);
      } else {
         this.v = ece.a(ebv.e(), $$14.e(ma.aQ), $$15);
      }

      this.w = $$7.a($$14.e(ma.aU), this.v, $$15);
      this.u = $$5;
      bra $$17 = new bra($$4, "worldgen");
      this.D = $$8;
      this.E = $$9;
      bra $$18 = new bra($$4, "light");
      this.B = new aqw($$17, $$4);
      this.C = new aqw($$18, $$4);
      this.t = new ars($$6, this, this.s.F_().g(), $$18, this.C);
      this.F = new aqu.a($$4, $$5);
      this.x = $$10;
      this.y = new cgl(new dzj($$1.f(), $$0.ag(), "poi"), $$13.resolve("poi"), $$2, $$12, $$14, $$0.p(), $$0);
      this.a($$11);
      this.O = new dyw($$0, $$7, $$3, this.t, $$5);
   }

   protected dxr a() {
      return this.O.b();
   }

   protected dxs b() {
      return this.w;
   }

   protected ece c() {
      return this.v;
   }

   private static double a(des $$0, bul $$1) {
      double $$2 = (double)kj.a($$0.g, 8);
      double $$3 = (double)kj.a($$0.h, 8);
      double $$4 = $$2 - $$1.dA();
      double $$5 = $$3 - $$1.dG();
      return $$4 * $$4 + $$5 * $$5;
   }

   boolean a(arq $$0, int $$1, int $$2) {
      return $$0.Y().a($$1, $$2) && !$$0.f.g.a(des.c($$1, $$2));
   }

   private boolean b(arq $$0, int $$1, int $$2) {
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
      return this.t;
   }

   @Nullable
   protected aqs a(long $$0) {
      return (aqs)this.o.get($$0);
   }

   @Nullable
   protected aqs b(long $$0) {
      return (aqs)this.p.get($$0);
   }

   protected IntSupplier c(long $$0) {
      return () -> {
         aqs $$1 = this.b($$0);
         return $$1 == null ? aqx.a - 1 : Math.min($$1.j(), aqx.a - 1);
      };
   }

   public String a(des $$0) {
      aqs $$1 = this.b($$0.a());
      if ($$1 == null) {
         return "null";
      } else {
         String $$2 = $$1.i() + "\n";
         dyr $$3 = $$1.t();
         dxq $$4 = $$1.o();
         if ($$3 != null) {
            $$2 = $$2 + "St: §" + $$3.b() + $$3 + "§r\n";
         }

         if ($$4 != null) {
            $$2 = $$2 + "Ch: §" + $$4.j().b() + $$4.j() + "§r\n";
         }

         are $$5 = $$1.r();
         $$2 = $$2 + '§' + $$5.ordinal() + $$5;
         return $$2 + "§r";
      }
   }

   private CompletableFuture<aqv<List<dxq>>> a(aqs $$0, int $$1, IntFunction<dyr> $$2) {
      if ($$1 == 0) {
         dyr $$3 = $$2.apply(0);
         return $$0.a($$3, this).thenApply($$0x -> $$0x.a(List::of));
      } else {
         int $$4 = azm.h($$1 * 2 + 1);
         List<CompletableFuture<aqv<dxq>>> $$5 = new ArrayList<>($$4);
         des $$6 = $$0.q();

         for (int $$7 = -$$1; $$7 <= $$1; $$7++) {
            for (int $$8 = -$$1; $$8 <= $$1; $$8++) {
               int $$9 = Math.max(Math.abs($$8), Math.abs($$7));
               long $$10 = des.c($$6.g + $$8, $$6.h + $$7);
               aqs $$11 = this.a($$10);
               if ($$11 == null) {
                  return g;
               }

               dyr $$12 = $$2.apply($$9);
               $$5.add($$11.a($$12, this));
            }
         }

         return ae.d($$5).thenApply($$0x -> {
            List<dxq> $$1x = new ArrayList<>($$0x.size());

            for (aqv<dxq> $$2x : $$0x) {
               if ($$2x == null) {
                  throw this.a(new IllegalStateException("At least one of the chunk futures were null"), "n/a");
               }

               dxq $$3 = $$2x.b(null);
               if ($$3 == null) {
                  return f;
               }

               $$1x.add($$3);
            }

            return aqv.a($$1x);
         });
      }
   }

   public z a(IllegalStateException $$0, String $$1) {
      StringBuilder $$2 = new StringBuilder();
      Consumer<aqs> $$3 = $$1x -> $$1x.s().forEach($$2x -> {
            dyr $$3x = (dyr)$$2x.getFirst();
            CompletableFuture<aqv<dxq>> $$4x = (CompletableFuture<aqv<dxq>>)$$2x.getSecond();
            if ($$4x != null && $$4x.isDone() && $$4x.join() == null) {
               $$2.append($$1x.q()).append(" - status: ").append($$3x).append(" future: ").append($$4x).append(System.lineSeparator());
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

   public CompletableFuture<aqv<dya>> a(aqs $$0) {
      return this.a($$0, 2, $$0x -> dyr.n).thenApply($$0x -> $$0x.a($$0xx -> (dya)$$0xx.get($$0xx.size() / 2)));
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
               this.z.add($$0);
            } else {
               this.z.remove($$0);
            }
         }

         if (aqt.f($$1) && $$2 == null) {
            $$2 = (aqs)this.q.remove($$0);
            if ($$2 != null) {
               $$2.a($$1);
            } else {
               $$2 = new aqs(new des($$0), $$1, this.s, this.t, this::a, this);
            }

            this.o.put($$0, $$2);
            this.A = true;
         }

         return $$2;
      }
   }

   private void a(des $$0, IntSupplier $$1, int $$2, IntConsumer $$3) {
      this.B.onLevelChange($$0, $$1, $$2, $$3);
      this.C.onLevelChange($$0, $$1, $$2, $$3);
   }

   @Override
   public void close() throws IOException {
      try {
         this.B.close();
         this.C.close();
         this.y.close();
      } finally {
         super.close();
      }
   }

   protected void a(boolean $$0) {
      if ($$0) {
         List<aqs> $$1 = this.p.values().stream().filter(aqs::k).peek(aqs::l).toList();
         MutableBoolean $$2 = new MutableBoolean();

         do {
            $$2.setFalse();
            $$1.stream().map($$0x -> {
               this.u.b($$0x::h);
               return $$0x.o();
            }).filter($$0x -> $$0x instanceof dxz || $$0x instanceof dya).filter(this::a).forEach($$1x -> $$2.setTrue());
         } while ($$2.isTrue());

         this.y.a();
         this.b(() -> true);
         this.o();
      } else {
         long $$3 = ae.c();
         ObjectIterator var4 = this.p.values().iterator();

         while (var4.hasNext()) {
            aqs $$4 = (aqs)var4.next();
            this.a($$4, $$3);
         }
      }
   }

   protected void a(BooleanSupplier $$0) {
      bou $$1 = bot.a();
      $$1.a("poi");
      this.y.a($$0);
      $$1.b("chunk_unload");
      if (!this.s.u()) {
         this.b($$0);
      }

      $$1.c();
   }

   public boolean e() {
      return this.t.M_()
         || !this.q.isEmpty()
         || !this.o.isEmpty()
         || this.y.b()
         || !this.z.isEmpty()
         || !this.M.isEmpty()
         || this.B.a()
         || this.C.a()
         || this.F.h();
   }

   private void b(BooleanSupplier $$0) {
      for (LongIterator $$1 = this.z.iterator(); $$1.hasNext(); $$1.remove()) {
         long $$2 = $$1.nextLong();
         aqs $$3 = (aqs)this.o.get($$2);
         if ($$3 != null) {
            this.o.remove($$2);
            this.q.put($$2, $$3);
            this.A = true;
            this.a($$2, $$3);
         }
      }

      int $$4 = Math.max(0, this.M.size() - 2000);

      Runnable $$5;
      while (($$4 > 0 || $$0.getAsBoolean()) && ($$5 = this.M.poll()) != null) {
         $$4--;
         $$5.run();
      }

      long $$6 = ae.c();
      int $$7 = 0;
      LongIterator $$8 = this.F.f().iterator();

      while ($$7 < 20 && $$0.getAsBoolean() && $$8.hasNext()) {
         long $$9 = $$8.nextLong();
         aqs $$10 = (aqs)this.p.get($$9);
         if ($$10 != null && this.a($$10, $$6)) {
            $$7++;
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
            dxq $$4 = $$1.o();
            if (this.q.remove($$0, $$1) && $$4 != null) {
               if ($$4 instanceof dya $$5) {
                  $$5.c(false);
               }

               this.a($$4);
               if ($$4 instanceof dya $$6) {
                  this.s.a($$6);
               }

               this.t.a($$4.f());
               this.t.b();
               this.D.a($$4.f(), null);
               this.L.remove($$4.f().a());
            }
         }
      }, this.M::add).whenComplete(($$1x, $$2x) -> {
         if ($$2x != null) {
            k.error("Failed to save chunk {}", $$1.q(), $$2x);
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

   private CompletableFuture<dxq> f(des $$0) {
      CompletableFuture<Optional<dzl>> $$1 = this.j($$0).thenApplyAsync($$1x -> $$1x.map($$1xx -> {
            dzl $$2x = dzl.a(this.s, this.s.J_(), $$1xx);
            if ($$2x == null) {
               k.error("Chunk file at {} is missing level data, skipping", $$0);
            }

            return $$2x;
         }), ae.g().a("parseChunk"));
      CompletableFuture<?> $$2 = this.y.a($$0);
      return $$1.<Object, Optional>thenCombine((CompletionStage<? extends Object>)$$2, ($$0x, $$1x) -> $$0x).thenApplyAsync($$1x -> {
         bot.a().f("chunkLoad");
         if ($$1x.isPresent()) {
            dxq $$2x = ((dzl)$$1x.get()).a(this.s, this.y, this.q(), $$0);
            this.a($$0, $$2x.j().d());
            return $$2x;
         } else {
            return this.g($$0);
         }
      }, this.u).exceptionallyAsync($$1x -> this.a($$1x, $$0), this.u);
   }

   private dxq a(Throwable $$0, des $$1) {
      Throwable $$3 = $$0 instanceof CompletionException $$2 ? $$2.getCause() : $$0;
      Throwable $$5 = $$3 instanceof z $$4 ? $$4.getCause() : $$3;
      boolean $$6 = $$5 instanceof Error;
      boolean $$7 = $$5 instanceof IOException || $$5 instanceof uw;
      if (!$$6 && $$7) {
         this.s.p().a($$5, this.q(), $$1);
         return this.g($$1);
      } else {
         o $$8 = o.a($$0, "Exception loading chunk");
         p $$9 = $$8.a("Chunk being loaded");
         $$9.a("pos", $$1);
         this.h($$1);
         throw new z($$8);
      }
   }

   private dxq g(des $$0) {
      this.h($$0);
      return new dyk($$0, dyn.a, this.s, this.s.J_().e(ma.aG), null);
   }

   private void h(des $$0) {
      this.K.put($$0.a(), (byte)-1);
   }

   private byte a(des $$0, dyv $$1) {
      return this.K.put($$0.a(), (byte)($$1 == dyv.a ? -1 : 1));
   }

   @Override
   public arg d(long $$0) {
      aqs $$1 = (aqs)this.o.get($$0);
      $$1.m();
      return $$1;
   }

   @Override
   public void a(arg $$0) {
      $$0.n();
   }

   @Override
   public CompletableFuture<dxq> a(arg $$0, dyu $$1, bag<arg> $$2) {
      des $$3 = $$0.q();
      if ($$1.a() == dyr.c) {
         return this.f($$3);
      } else {
         try {
            arg $$4 = $$2.a($$3.g, $$3.h);
            dxq $$5 = $$4.a($$1.a().c());
            if ($$5 == null) {
               throw new IllegalStateException("Parent chunk missing");
            } else {
               CompletableFuture<dxq> $$6 = $$1.a(this.O, $$2, $$5);
               this.D.a($$3, $$1.a());
               return $$6;
            }
         } catch (Exception var8) {
            var8.getStackTrace();
            o $$8 = o.a(var8, "Exception generating new chunk");
            p $$9 = $$8.a("Chunk to be generated");
            $$9.a("Status being generated", () -> $$1.a().f());
            $$9.a("Location", String.format(Locale.ROOT, "%d,%d", $$3.g, $$3.h));
            $$9.a("Position hash", des.c($$3.g, $$3.h));
            $$9.a("Generator", this.a());
            this.u.execute(() -> {
               throw new z($$8);
            });
            throw new z($$8);
         }
      }
   }

   @Override
   public aqr a(dyr $$0, des $$1) {
      aqr $$2 = aqr.a(this, $$0, $$1);
      this.r.add($$2);
      return $$2;
   }

   private void a(aqr $$0) {
      arg $$1 = $$0.c();
      this.B.a(() -> {
         CompletableFuture<?> $$1x = $$0.a();
         if ($$1x != null) {
            $$1x.thenRun(() -> this.a($$0));
         }
      }, $$1.q().a(), $$1::j);
   }

   @Override
   public void g() {
      this.r.forEach(this::a);
      this.r.clear();
   }

   public CompletableFuture<aqv<dya>> b(aqs $$0) {
      CompletableFuture<aqv<List<dxq>>> $$1 = this.a($$0, 1, $$0x -> dyr.n);
      CompletableFuture<aqv<dya>> $$2 = $$1.thenApplyAsync($$1x -> $$1x.a($$1xx -> {
            dya $$2x = (dya)$$1xx.get($$1xx.size() / 2);
            $$2x.a(this.s);
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

   private void a(dya $$0) {
      des $$1 = $$0.f();

      for (arq $$2 : this.I.a()) {
         if ($$2.Y().a($$1)) {
            a($$2, $$0);
         }
      }
   }

   public CompletableFuture<aqv<dya>> c(aqs $$0) {
      return this.a($$0, 1, aqt::b).thenApply($$0x -> $$0x.a($$0xx -> (dya)$$0xx.get($$0xx.size() / 2)));
   }

   public int h() {
      return this.G.get();
   }

   private boolean a(aqs $$0, long $$1) {
      if ($$0.k() && $$0.h()) {
         dxq $$2 = $$0.o();
         if (!($$2 instanceof dxz) && !($$2 instanceof dya)) {
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

   private boolean a(dxq $$0) {
      this.y.b($$0.f());
      if (!$$0.i()) {
         return false;
      } else {
         $$0.a(false);
         des $$1 = $$0.f();

         try {
            dyr $$2 = $$0.j();
            if ($$2.d() != dyv.b) {
               if (this.i($$1)) {
                  return false;
               }

               if ($$2 == dyr.c && $$0.g().values().stream().noneMatch(emq::b)) {
                  return false;
               }
            }

            bot.a().f("chunkSave");
            dzl $$3 = dzl.a(this.s, $$0);
            CompletableFuture<ul> $$4 = CompletableFuture.supplyAsync($$3::a, ae.g());
            this.a($$1, $$4::join).exceptionally($$1x -> {
               this.s.p().b($$1x, this.q(), $$1);
               return null;
            });
            this.a($$1, $$2.d());
            return true;
         } catch (Exception var6) {
            this.s.p().b(var6, this.q(), $$1);
            return false;
         }
      }
   }

   private boolean i(des $$0) {
      byte $$1 = this.K.get($$0.a());
      if ($$1 != 0) {
         return $$1 == 1;
      } else {
         ul $$2;
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

         dyv $$5 = dzl.a($$2);
         return this.a($$0, $$5) == 1;
      }
   }

   protected void a(int $$0) {
      int $$1 = azm.a($$0, 2, 32);
      if ($$1 != this.N) {
         this.N = $$1;
         this.F.a(this.N);

         for (arq $$2 : this.I.a()) {
            this.e($$2);
         }
      }
   }

   int b(arq $$0) {
      return azm.a($$0.F(), 2, this.N);
   }

   private void a(arq $$0, des $$1) {
      dya $$2 = this.e($$1.a());
      if ($$2 != null) {
         a($$0, $$2);
      }
   }

   private static void a(arq $$0, dya $$1) {
      $$0.f.g.a($$1);
   }

   private static void b(arq $$0, des $$1) {
      $$0.f.g.a($$0, $$1);
   }

   @Nullable
   public dya e(long $$0) {
      aqs $$1 = this.b($$0);
      return $$1 == null ? null : $$1.e();
   }

   public int i() {
      return this.p.size();
   }

   public ard j() {
      return this.F;
   }

   protected Iterable<aqs> k() {
      return Iterables.unmodifiableIterable(this.p.values());
   }

   void a(Writer $$0) throws IOException {
      aym $$1 = aym.a()
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
      arw $$2 = this.F.e();
      ObjectBidirectionalIterator var4 = this.p.long2ObjectEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<aqs> $$3 = (Entry<aqs>)var4.next();
         long $$4 = $$3.getLongKey();
         des $$5 = new des($$4);
         aqs $$6 = (aqs)$$3.getValue();
         Optional<dxq> $$7 = Optional.ofNullable($$6.o());
         Optional<dya> $$8 = $$7.flatMap($$0x -> $$0x instanceof dya ? Optional.of((dya)$$0x) : Optional.empty());
         $$1.a(
            $$5.g,
            $$5.h,
            $$6.i(),
            $$7.isPresent(),
            $$7.map(dxq::j).orElse(null),
            $$8.map(dya::C).orElse(null),
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

   private static String a(CompletableFuture<aqv<dya>> $$0) {
      try {
         aqv<dya> $$1 = $$0.getNow(null);
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

   private CompletableFuture<Optional<ul>> j(des $$0) {
      return this.d($$0).thenApplyAsync($$0x -> $$0x.map(this::b), ae.g().a("upgradeChunk"));
   }

   private ul b(ul $$0) {
      return this.a(this.s.ag(), this.x, $$0, this.a().c());
   }

   void a(Consumer<aqs> $$0) {
      LongIterator $$1 = this.F.c();

      while ($$1.hasNext()) {
         long $$2 = $$1.nextLong();
         aqs $$3 = (aqs)this.p.get($$2);
         if ($$3 != null && this.k($$3.q())) {
            $$0.accept($$3);
         }
      }
   }

   boolean b(des $$0) {
      return !this.F.f($$0.a()) ? false : this.k($$0);
   }

   private boolean k(des $$0) {
      for (arq $$1 : this.I.a()) {
         if (this.c($$1, $$0)) {
            return true;
         }
      }

      return false;
   }

   public List<arq> c(des $$0) {
      long $$1 = $$0.a();
      if (!this.F.f($$1)) {
         return List.of();
      } else {
         Builder<arq> $$2 = ImmutableList.builder();

         for (arq $$3 : this.I.a()) {
            if (this.c($$3, $$0)) {
               $$2.add($$3);
            }
         }

         return $$2.build();
      }
   }

   private boolean c(arq $$0, des $$1) {
      if ($$0.Y_()) {
         return false;
      } else {
         double $$2 = a($$1, $$0);
         return $$2 < 16384.0;
      }
   }

   private boolean c(arq $$0) {
      return $$0.Y_() && !this.s.N().b(dfi.r);
   }

   void a(arq $$0, boolean $$1) {
      boolean $$2 = this.c($$0);
      boolean $$3 = this.I.d($$0);
      if ($$1) {
         this.I.a($$0, $$2);
         this.d($$0);
         if (!$$2) {
            this.F.a(kj.a($$0), $$0);
         }

         $$0.a(aqz.a);
         this.e($$0);
      } else {
         kj $$4 = $$0.X();
         this.I.a($$0);
         if (!$$3) {
            this.F.b($$4, $$0);
         }

         this.a($$0, aqz.a);
      }
   }

   private void d(arq $$0) {
      kj $$1 = kj.a($$0);
      $$0.a($$1);
   }

   public void a(arq $$0) {
      ObjectIterator $$2 = this.J.values().iterator();

      while ($$2.hasNext()) {
         aqu.b $$1 = (aqu.b)$$2.next();
         if ($$1.c == $$0) {
            $$1.a(this.s.y());
         } else {
            $$1.b($$0);
         }
      }

      kj $$2x = $$0.X();
      kj $$3 = kj.a($$0);
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

   private void e(arq $$0) {
      des $$1 = $$0.dx();
      int $$2 = this.b($$0);
      if ($$0.Y() instanceof aqz.a $$3 && $$3.a().equals($$1) && $$3.b() == $$2) {
         return;
      }

      this.a($$0, aqz.a($$1, $$2));
   }

   private void a(arq $$0, aqz $$1) {
      if ($$0.dV() == this.s) {
         aqz $$2 = $$0.Y();
         if ($$1 instanceof aqz.a $$3 && (!($$2 instanceof aqz.a $$4) || !$$4.a().equals($$3.a()))) {
            $$0.f.b(new afg($$3.a().g, $$3.a().h));
         }

         aqz.a($$2, $$1, $$1x -> this.a($$0, $$1x), $$1x -> b($$0, $$1x));
         $$0.a($$1);
      }
   }

   @Override
   public List<arq> a(des $$0, boolean $$1) {
      Set<arq> $$2 = this.I.a();
      Builder<arq> $$3 = ImmutableList.builder();

      for (arq $$4 : $$2) {
         if ($$1 && this.b($$4, $$0.g, $$0.h) || !$$1 && this.a($$4, $$0.g, $$0.h)) {
            $$3.add($$4);
         }
      }

      return $$3.build();
   }

   protected void a(bul $$0) {
      if (!($$0 instanceof cjs)) {
         bus<?> $$1 = $$0.aq();
         int $$2 = $$1.o() * 16;
         if ($$2 != 0) {
            int $$3 = $$1.p();
            if (this.J.containsKey($$0.ar())) {
               throw (IllegalStateException)ae.b(new IllegalStateException("Entity is already tracked!"));
            } else {
               aqu.b $$4 = new aqu.b($$0, $$2, $$3, $$1.q());
               this.J.put($$0.ar(), $$4);
               $$4.a(this.s.y());
               if ($$0 instanceof arq $$5) {
                  this.a($$5, true);
                  ObjectIterator var7 = this.J.values().iterator();

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

   protected void b(bul $$0) {
      if ($$0 instanceof arq $$1) {
         this.a($$1, false);
         ObjectIterator var3 = this.J.values().iterator();

         while (var3.hasNext()) {
            aqu.b $$2 = (aqu.b)var3.next();
            $$2.a($$1);
         }
      }

      aqu.b $$3 = (aqu.b)this.J.remove($$0.ar());
      if ($$3 != null) {
         $$3.a();
      }
   }

   protected void l() {
      for (arq $$0 : this.I.a()) {
         this.e($$0);
      }

      List<arq> $$1 = Lists.newArrayList();
      List<arq> $$2 = this.s.y();
      ObjectIterator var3 = this.J.values().iterator();

      while (var3.hasNext()) {
         aqu.b $$3 = (aqu.b)var3.next();
         kj $$4 = $$3.e;
         kj $$5 = kj.a($$3.c);
         boolean $$6 = !Objects.equals($$4, $$5);
         if ($$6) {
            $$3.a($$2);
            bul $$7 = $$3.c;
            if ($$7 instanceof arq) {
               $$1.add((arq)$$7);
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
            aqu.b $$8 = (aqu.b)var3.next();
            $$8.a($$1);
         }
      }
   }

   public void a(bul $$0, zq<?> $$1) {
      aqu.b $$2 = (aqu.b)this.J.get($$0.ar());
      if ($$2 != null) {
         $$2.a($$1);
      }
   }

   protected void b(bul $$0, zq<?> $$1) {
      aqu.b $$2 = (aqu.b)this.J.get($$0.ar());
      if ($$2 != null) {
         $$2.b($$1);
      }
   }

   public void a(List<dxq> $$0) {
      Map<arq, List<dya>> $$1 = new HashMap<>();

      for (dxq $$2 : $$0) {
         des $$3 = $$2.f();
         dya $$5;
         if ($$2 instanceof dya $$4) {
            $$5 = $$4;
         } else {
            $$5 = this.s.d($$3.g, $$3.h);
         }

         for (arq $$7 : this.a($$3, false)) {
            $$1.computeIfAbsent($$7, $$0x -> new ArrayList<>()).add($$5);
         }
      }

      $$1.forEach(($$0x, $$1x) -> $$0x.f.b(acv.a($$1x)));
   }

   protected cgl m() {
      return this.y;
   }

   public String n() {
      return this.H;
   }

   void a(des $$0, are $$1) {
      this.E.onChunkStatusChange($$0, $$1);
   }

   public void a(des $$0, int $$1) {
      int $$2 = $$1 + 1;
      des.a($$0, $$2).forEach($$0x -> {
         aqs $$1x = this.b($$0x.a());
         if ($$1x != null) {
            $$1x.a(this.t.a($$0x.g, $$0x.h));
         }
      });
   }

   class a extends ard {
      protected a(final Executor $$0, final Executor $$1) {
         super($$0, $$1);
      }

      @Override
      protected boolean a(long $$0) {
         return aqu.this.z.contains($$0);
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
      final arn b;
      final bul c;
      private final int d;
      kj e;
      private final Set<asv> f = Sets.newIdentityHashSet();

      public b(final bul $$0, final int $$1, final int $$2, final boolean $$3) {
         this.b = new arn(aqu.this.s, $$0, $$2, $$3, this::a);
         this.c = $$0;
         this.d = $$1;
         this.e = kj.a($$0);
      }

      @Override
      public boolean equals(Object $$0) {
         return $$0 instanceof aqu.b ? ((aqu.b)$$0).c.ar() == this.c.ar() : false;
      }

      @Override
      public int hashCode() {
         return this.c.ar();
      }

      public void a(zq<?> $$0) {
         for (asv $$1 : this.f) {
            $$1.b($$0);
         }
      }

      public void b(zq<?> $$0) {
         this.a($$0);
         if (this.c instanceof arq) {
            ((arq)this.c).f.b($$0);
         }
      }

      public void a() {
         for (asv $$0 : this.f) {
            this.b.a($$0.o());
         }
      }

      public void a(arq $$0) {
         if (this.f.remove($$0.f)) {
            this.b.a($$0);
         }
      }

      public void b(arq $$0) {
         if ($$0 != this.c) {
            ezy $$1 = $$0.dt().d(this.c.dt());
            int $$2 = aqu.this.b($$0);
            double $$3 = (double)Math.min(this.b(), $$2 * 16);
            double $$4 = $$1.d * $$1.d + $$1.f * $$1.f;
            double $$5 = $$3 * $$3;
            boolean $$6 = $$4 <= $$5 && this.c.a($$0) && aqu.this.a($$0, this.c.dx().g, this.c.dx().h);
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
         return aqu.this.s.p().b($$0);
      }

      private int b() {
         int $$0 = this.d;

         for (bul $$1 : this.c.dd()) {
            int $$2 = $$1.aq().o() * 16;
            if ($$2 > $$0) {
               $$0 = $$2;
            }
         }

         return this.a($$0);
      }

      public void a(List<arq> $$0) {
         for (arq $$1 : $$0) {
            this.b($$1);
         }
      }
   }
}
