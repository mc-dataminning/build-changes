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

public class aqs extends dyj implements aqq.b, ard {
   private static final aqt<List<dwz>> f = aqt.a("Unloaded chunks found in range");
   private static final CompletableFuture<aqt<List<dwz>>> g = CompletableFuture.completedFuture(f);
   private static final byte h = -1;
   private static final byte i = 0;
   private static final byte j = 1;
   private static final Logger k = LogUtils.getLogger();
   private static final int l = 200;
   private static final int m = 20;
   private static final int n = 10000;
   public static final int a = 2;
   public static final int b = 32;
   public static final int c = aqr.a(arc.d);
   private final Long2ObjectLinkedOpenHashMap<aqq> o = new Long2ObjectLinkedOpenHashMap();
   private volatile Long2ObjectLinkedOpenHashMap<aqq> p = this.o.clone();
   private final Long2ObjectLinkedOpenHashMap<aqq> q = new Long2ObjectLinkedOpenHashMap();
   private final List<aqp> r = new ArrayList<>();
   final arm s;
   private final arp t;
   private final bqn<Runnable> u;
   private final ebn v;
   private final dxb w;
   private final Supplier<ete> x;
   private final cfz y;
   final LongSet z = new LongOpenHashSet();
   private boolean A;
   private final aqu B;
   private final aqu C;
   private final arw D;
   private final dzg E;
   private final aqs.a F;
   private final AtomicInteger G = new AtomicInteger();
   private final String H;
   private final arg I = new arg();
   private final Int2ObjectMap<aqs.b> J = new Int2ObjectOpenHashMap();
   private final Long2ByteMap K = new Long2ByteOpenHashMap();
   private final Long2LongMap L = new Long2LongOpenHashMap();
   private final Queue<Runnable> M = Queues.newConcurrentLinkedQueue();
   private int N;
   private final dyf O;

   public aqs(
      arm $$0,
      etk.c $$1,
      DataFixer $$2,
      epu $$3,
      Executor $$4,
      bqn<Runnable> $$5,
      dxm $$6,
      dxa $$7,
      arw $$8,
      dzg $$9,
      Supplier<ete> $$10,
      int $$11,
      boolean $$12
   ) {
      super(new dys($$1.f(), $$0.ag(), "chunk"), $$1.a($$0.ag()).resolve("region"), $$2, $$12);
      Path $$13 = $$1.a($$0.ag());
      this.H = $$13.getFileName().toString();
      this.s = $$0;
      kd $$14 = $$0.H_();
      long $$15 = $$0.C();
      if ($$7 instanceof ebc $$16) {
         this.v = ebn.a($$16.h().a(), $$14.e(ly.aQ), $$15);
      } else {
         this.v = ebn.a(ebe.e(), $$14.e(ly.aQ), $$15);
      }

      this.w = $$7.a($$14.e(ly.aU), this.v, $$15);
      this.u = $$5;
      bqo $$17 = new bqo($$4, "worldgen");
      this.D = $$8;
      this.E = $$9;
      bqo $$18 = new bqo($$4, "light");
      this.B = new aqu($$17, $$4);
      this.C = new aqu($$18, $$4);
      this.t = new arp($$6, this, this.s.D_().g(), $$18, this.C);
      this.F = new aqs.a($$4, $$5);
      this.x = $$10;
      this.y = new cfz(new dys($$1.f(), $$0.ag(), "poi"), $$13.resolve("poi"), $$2, $$12, $$14, $$0.o(), $$0);
      this.a($$11);
      this.O = new dyf($$0, $$7, $$3, this.t, $$5);
   }

   protected dxa a() {
      return this.O.b();
   }

   protected dxb b() {
      return this.w;
   }

   protected ebn c() {
      return this.v;
   }

   private static double a(deb $$0, btz $$1) {
      double $$2 = (double)ki.a($$0.e, 8);
      double $$3 = (double)ki.a($$0.f, 8);
      double $$4 = $$2 - $$1.dC();
      double $$5 = $$3 - $$1.dI();
      return $$4 * $$4 + $$5 * $$5;
   }

   boolean a(arn $$0, int $$1, int $$2) {
      return $$0.Z().a($$1, $$2) && !$$0.d.g.a(deb.c($$1, $$2));
   }

   private boolean b(arn $$0, int $$1, int $$2) {
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

   protected arp d() {
      return this.t;
   }

   @Nullable
   protected aqq a(long $$0) {
      return (aqq)this.o.get($$0);
   }

   @Nullable
   protected aqq b(long $$0) {
      return (aqq)this.p.get($$0);
   }

   protected IntSupplier c(long $$0) {
      return () -> {
         aqq $$1 = this.b($$0);
         return $$1 == null ? aqv.a - 1 : Math.min($$1.j(), aqv.a - 1);
      };
   }

   public String a(deb $$0) {
      aqq $$1 = this.b($$0.a());
      if ($$1 == null) {
         return "null";
      } else {
         String $$2 = $$1.i() + "\n";
         dya $$3 = $$1.t();
         dwz $$4 = $$1.o();
         if ($$3 != null) {
            $$2 = $$2 + "St: §" + $$3.b() + $$3 + "§r\n";
         }

         if ($$4 != null) {
            $$2 = $$2 + "Ch: §" + $$4.j().b() + $$4.j() + "§r\n";
         }

         arc $$5 = $$1.r();
         $$2 = $$2 + '§' + $$5.ordinal() + $$5;
         return $$2 + "§r";
      }
   }

   private CompletableFuture<aqt<List<dwz>>> a(aqq $$0, int $$1, IntFunction<dya> $$2) {
      if ($$1 == 0) {
         dya $$3 = $$2.apply(0);
         return $$0.a($$3, this).thenApply($$0x -> $$0x.a(List::of));
      } else {
         int $$4 = azj.h($$1 * 2 + 1);
         List<CompletableFuture<aqt<dwz>>> $$5 = new ArrayList<>($$4);
         deb $$6 = $$0.q();

         for (int $$7 = -$$1; $$7 <= $$1; $$7++) {
            for (int $$8 = -$$1; $$8 <= $$1; $$8++) {
               int $$9 = Math.max(Math.abs($$8), Math.abs($$7));
               long $$10 = deb.c($$6.e + $$8, $$6.f + $$7);
               aqq $$11 = this.a($$10);
               if ($$11 == null) {
                  return g;
               }

               dya $$12 = $$2.apply($$9);
               $$5.add($$11.a($$12, this));
            }
         }

         return ad.d($$5).thenApply($$0x -> {
            List<dwz> $$1x = new ArrayList<>($$0x.size());

            for (aqt<dwz> $$2x : $$0x) {
               if ($$2x == null) {
                  throw this.a(new IllegalStateException("At least one of the chunk futures were null"), "n/a");
               }

               dwz $$3 = $$2x.b(null);
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
      Consumer<aqq> $$3 = $$1x -> $$1x.s().forEach($$2x -> {
            dya $$3x = (dya)$$2x.getFirst();
            CompletableFuture<aqt<dwz>> $$4x = (CompletableFuture<aqt<dwz>>)$$2x.getSecond();
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

   public CompletableFuture<aqt<dxj>> a(aqq $$0) {
      return this.a($$0, 2, $$0x -> dya.n).thenApply($$0x -> $$0x.a($$0xx -> (dxj)$$0xx.get($$0xx.size() / 2)));
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
               this.z.add($$0);
            } else {
               this.z.remove($$0);
            }
         }

         if (aqr.f($$1) && $$2 == null) {
            $$2 = (aqq)this.q.remove($$0);
            if ($$2 != null) {
               $$2.a($$1);
            } else {
               $$2 = new aqq(new deb($$0), $$1, this.s, this.t, this::a, this);
            }

            this.o.put($$0, $$2);
            this.A = true;
         }

         return $$2;
      }
   }

   private void a(deb $$0, IntSupplier $$1, int $$2, IntConsumer $$3) {
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
         List<aqq> $$1 = this.p.values().stream().filter(aqq::k).peek(aqq::l).toList();
         MutableBoolean $$2 = new MutableBoolean();

         do {
            $$2.setFalse();
            $$1.stream().map($$0x -> {
               this.u.b($$0x::h);
               return $$0x.o();
            }).filter($$0x -> $$0x instanceof dxi || $$0x instanceof dxj).filter(this::a).forEach($$1x -> $$2.setTrue());
         } while ($$2.isTrue());

         this.y.a();
         this.b(() -> true);
         this.o();
      } else {
         long $$3 = ad.c();
         ObjectIterator var4 = this.p.values().iterator();

         while (var4.hasNext()) {
            aqq $$4 = (aqq)var4.next();
            this.a($$4, $$3);
         }
      }
   }

   protected void a(BooleanSupplier $$0) {
      bok $$1 = this.s.ah();
      $$1.a("poi");
      this.y.a($$0);
      $$1.b("chunk_unload");
      if (!this.s.t()) {
         this.b($$0);
      }

      $$1.c();
   }

   public boolean e() {
      return this.t.K_()
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
         aqq $$3 = (aqq)this.o.get($$2);
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

      long $$6 = ad.c();
      int $$7 = 0;
      LongIterator $$8 = this.F.f().iterator();

      while ($$7 < 20 && $$0.getAsBoolean() && $$8.hasNext()) {
         long $$9 = $$8.nextLong();
         aqq $$10 = (aqq)this.p.get($$9);
         if ($$10 != null && this.a($$10, $$6)) {
            $$7++;
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
            dwz $$4 = $$1.o();
            if (this.q.remove($$0, $$1) && $$4 != null) {
               if ($$4 instanceof dxj $$5) {
                  $$5.c(false);
               }

               this.a($$4);
               if ($$4 instanceof dxj $$6) {
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

   private CompletableFuture<dwz> f(deb $$0) {
      CompletableFuture<Optional<dyu>> $$1 = this.j($$0).thenApplyAsync($$1x -> $$1x.map($$1xx -> {
            dyu $$2x = dyu.a(this.s, this.s.H_(), $$1xx);
            if ($$2x == null) {
               k.error("Chunk file at {} is missing level data, skipping", $$0);
            }

            return $$2x;
         }), ad.g());
      CompletableFuture<?> $$2 = this.y.a($$0);
      return $$1.<Object, Optional>thenCombine((CompletionStage<? extends Object>)$$2, ($$0x, $$1x) -> $$0x).thenApplyAsync($$1x -> {
         this.s.ah().d("chunkLoad");
         if ($$1x.isPresent()) {
            dwz $$2x = ((dyu)$$1x.get()).a(this.s, this.y, this.q(), $$0);
            this.a($$0, $$2x.j().d());
            return $$2x;
         } else {
            return this.g($$0);
         }
      }, this.u).exceptionallyAsync($$1x -> this.a($$1x, $$0), this.u);
   }

   private dwz a(Throwable $$0, deb $$1) {
      Throwable $$3 = $$0 instanceof CompletionException $$2 ? $$2.getCause() : $$0;
      Throwable $$5 = $$3 instanceof z $$4 ? $$4.getCause() : $$3;
      boolean $$6 = $$5 instanceof Error;
      boolean $$7 = $$5 instanceof IOException || $$5 instanceof uu;
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

   private dwz g(deb $$0) {
      this.h($$0);
      return new dxt($$0, dxw.a, this.s, this.s.H_().e(ly.aG), null);
   }

   private void h(deb $$0) {
      this.K.put($$0.a(), (byte)-1);
   }

   private byte a(deb $$0, dye $$1) {
      return this.K.put($$0.a(), (byte)($$1 == dye.a ? -1 : 1));
   }

   @Override
   public are d(long $$0) {
      aqq $$1 = (aqq)this.o.get($$0);
      $$1.m();
      return $$1;
   }

   @Override
   public void a(are $$0) {
      $$0.n();
   }

   @Override
   public CompletableFuture<dwz> a(are $$0, dyd $$1, bad<are> $$2) {
      deb $$3 = $$0.q();
      if ($$1.a() == dya.c) {
         return this.f($$3);
      } else {
         try {
            are $$4 = $$2.a($$3.e, $$3.f);
            dwz $$5 = $$4.a($$1.a().c());
            if ($$5 == null) {
               throw new IllegalStateException("Parent chunk missing");
            } else {
               CompletableFuture<dwz> $$6 = $$1.a(this.O, $$2, $$5);
               this.D.a($$3, $$1.a());
               return $$6;
            }
         } catch (Exception var8) {
            var8.getStackTrace();
            o $$8 = o.a(var8, "Exception generating new chunk");
            p $$9 = $$8.a("Chunk to be generated");
            $$9.a("Status being generated", () -> $$1.a().f());
            $$9.a("Location", String.format(Locale.ROOT, "%d,%d", $$3.e, $$3.f));
            $$9.a("Position hash", deb.c($$3.e, $$3.f));
            $$9.a("Generator", this.a());
            this.u.execute(() -> {
               throw new z($$8);
            });
            throw new z($$8);
         }
      }
   }

   @Override
   public aqp a(dya $$0, deb $$1) {
      aqp $$2 = aqp.a(this, $$0, $$1);
      this.r.add($$2);
      return $$2;
   }

   private void a(aqp $$0) {
      are $$1 = $$0.c();
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

   public CompletableFuture<aqt<dxj>> b(aqq $$0) {
      CompletableFuture<aqt<List<dwz>>> $$1 = this.a($$0, 1, $$0x -> dya.n);
      CompletableFuture<aqt<dxj>> $$2 = $$1.thenApplyAsync($$1x -> $$1x.a($$1xx -> {
            dxj $$2x = (dxj)$$1xx.get($$1xx.size() / 2);
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

   private void a(dxj $$0) {
      deb $$1 = $$0.f();

      for (arn $$2 : this.I.a()) {
         if ($$2.Z().a($$1)) {
            a($$2, $$0);
         }
      }
   }

   public CompletableFuture<aqt<dxj>> c(aqq $$0) {
      return this.a($$0, 1, aqr::b).thenApply($$0x -> $$0x.a($$0xx -> (dxj)$$0xx.get($$0xx.size() / 2)));
   }

   public int h() {
      return this.G.get();
   }

   private boolean a(aqq $$0, long $$1) {
      if ($$0.k() && $$0.h()) {
         dwz $$2 = $$0.o();
         if (!($$2 instanceof dxi) && !($$2 instanceof dxj)) {
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

   private boolean a(dwz $$0) {
      this.y.b($$0.f());
      if (!$$0.i()) {
         return false;
      } else {
         $$0.a(false);
         deb $$1 = $$0.f();

         try {
            dya $$2 = $$0.j();
            if ($$2.d() != dye.b) {
               if (this.i($$1)) {
                  return false;
               }

               if ($$2 == dya.c && $$0.g().values().stream().noneMatch(elz::b)) {
                  return false;
               }
            }

            this.s.ah().d("chunkSave");
            dyu $$3 = dyu.a(this.s, $$0);
            CompletableFuture<uj> $$4 = CompletableFuture.supplyAsync($$3::a, ad.g());
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

   private boolean i(deb $$0) {
      byte $$1 = this.K.get($$0.a());
      if ($$1 != 0) {
         return $$1 == 1;
      } else {
         uj $$2;
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

         dye $$5 = dyu.a($$2);
         return this.a($$0, $$5) == 1;
      }
   }

   protected void a(int $$0) {
      int $$1 = azj.a($$0, 2, 32);
      if ($$1 != this.N) {
         this.N = $$1;
         this.F.a(this.N);

         for (arn $$2 : this.I.a()) {
            this.e($$2);
         }
      }
   }

   int b(arn $$0) {
      return azj.a($$0.G(), 2, this.N);
   }

   private void a(arn $$0, deb $$1) {
      dxj $$2 = this.e($$1.a());
      if ($$2 != null) {
         a($$0, $$2);
      }
   }

   private static void a(arn $$0, dxj $$1) {
      $$0.d.g.a($$1);
   }

   private static void b(arn $$0, deb $$1) {
      $$0.d.g.a($$0, $$1);
   }

   @Nullable
   public dxj e(long $$0) {
      aqq $$1 = this.b($$0);
      return $$1 == null ? null : $$1.e();
   }

   public int i() {
      return this.p.size();
   }

   public arb j() {
      return this.F;
   }

   protected Iterable<aqq> k() {
      return Iterables.unmodifiableIterable(this.p.values());
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
      art $$2 = this.F.e();
      ObjectBidirectionalIterator var4 = this.p.long2ObjectEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<aqq> $$3 = (Entry<aqq>)var4.next();
         long $$4 = $$3.getLongKey();
         deb $$5 = new deb($$4);
         aqq $$6 = (aqq)$$3.getValue();
         Optional<dwz> $$7 = Optional.ofNullable($$6.o());
         Optional<dxj> $$8 = $$7.flatMap($$0x -> $$0x instanceof dxj ? Optional.of((dxj)$$0x) : Optional.empty());
         $$1.a(
            $$5.e,
            $$5.f,
            $$6.i(),
            $$7.isPresent(),
            $$7.map(dwz::j).orElse(null),
            $$8.map(dxj::C).orElse(null),
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

   private static String a(CompletableFuture<aqt<dxj>> $$0) {
      try {
         aqt<dxj> $$1 = $$0.getNow(null);
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

   private CompletableFuture<Optional<uj>> j(deb $$0) {
      return this.d($$0).thenApplyAsync($$0x -> $$0x.map(this::b), ad.g());
   }

   private uj b(uj $$0) {
      return this.a(this.s.ag(), this.x, $$0, this.a().c());
   }

   void a(Consumer<aqq> $$0) {
      LongIterator $$1 = this.F.c();

      while ($$1.hasNext()) {
         long $$2 = $$1.nextLong();
         aqq $$3 = (aqq)this.p.get($$2);
         if ($$3 != null && this.k($$3.q())) {
            $$0.accept($$3);
         }
      }
   }

   boolean b(deb $$0) {
      return !this.F.f($$0.a()) ? false : this.k($$0);
   }

   private boolean k(deb $$0) {
      for (arn $$1 : this.I.a()) {
         if (this.c($$1, $$0)) {
            return true;
         }
      }

      return false;
   }

   public List<arn> c(deb $$0) {
      long $$1 = $$0.a();
      if (!this.F.f($$1)) {
         return List.of();
      } else {
         Builder<arn> $$2 = ImmutableList.builder();

         for (arn $$3 : this.I.a()) {
            if (this.c($$3, $$0)) {
               $$2.add($$3);
            }
         }

         return $$2.build();
      }
   }

   private boolean c(arn $$0, deb $$1) {
      if ($$0.R_()) {
         return false;
      } else {
         double $$2 = a($$1, $$0);
         return $$2 < 16384.0;
      }
   }

   private boolean c(arn $$0) {
      return $$0.R_() && !this.s.ac().b(der.r);
   }

   void a(arn $$0, boolean $$1) {
      boolean $$2 = this.c($$0);
      boolean $$3 = this.I.d($$0);
      if ($$1) {
         this.I.a($$0, $$2);
         this.d($$0);
         if (!$$2) {
            this.F.a(ki.a($$0), $$0);
         }

         $$0.a(aqx.a);
         this.e($$0);
      } else {
         ki $$4 = $$0.Y();
         this.I.a($$0);
         if (!$$3) {
            this.F.b($$4, $$0);
         }

         this.a($$0, aqx.a);
      }
   }

   private void d(arn $$0) {
      ki $$1 = ki.a($$0);
      $$0.a($$1);
   }

   public void a(arn $$0) {
      ObjectIterator $$2 = this.J.values().iterator();

      while ($$2.hasNext()) {
         aqs.b $$1 = (aqs.b)$$2.next();
         if ($$1.c == $$0) {
            $$1.a(this.s.x());
         } else {
            $$1.b($$0);
         }
      }

      ki $$2x = $$0.Y();
      ki $$3 = ki.a($$0);
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

   private void e(arn $$0) {
      deb $$1 = $$0.dz();
      int $$2 = this.b($$0);
      if ($$0.Z() instanceof aqx.a $$3 && $$3.a().equals($$1) && $$3.b() == $$2) {
         return;
      }

      this.a($$0, aqx.a($$1, $$2));
   }

   private void a(arn $$0, aqx $$1) {
      if ($$0.dX() == this.s) {
         aqx $$2 = $$0.Z();
         if ($$1 instanceof aqx.a $$3 && (!($$2 instanceof aqx.a $$4) || !$$4.a().equals($$3.a()))) {
            $$0.d.b(new afe($$3.a().e, $$3.a().f));
         }

         aqx.a($$2, $$1, $$1x -> this.a($$0, $$1x), $$1x -> b($$0, $$1x));
         $$0.a($$1);
      }
   }

   @Override
   public List<arn> a(deb $$0, boolean $$1) {
      Set<arn> $$2 = this.I.a();
      Builder<arn> $$3 = ImmutableList.builder();

      for (arn $$4 : $$2) {
         if ($$1 && this.b($$4, $$0.e, $$0.f) || !$$1 && this.a($$4, $$0.e, $$0.f)) {
            $$3.add($$4);
         }
      }

      return $$3.build();
   }

   protected void a(btz $$0) {
      if (!($$0 instanceof cjg)) {
         bug<?> $$1 = $$0.aq();
         int $$2 = $$1.o() * 16;
         if ($$2 != 0) {
            int $$3 = $$1.p();
            if (this.J.containsKey($$0.ar())) {
               throw (IllegalStateException)ad.b(new IllegalStateException("Entity is already tracked!"));
            } else {
               aqs.b $$4 = new aqs.b($$0, $$2, $$3, $$1.q());
               this.J.put($$0.ar(), $$4);
               $$4.a(this.s.x());
               if ($$0 instanceof arn $$5) {
                  this.a($$5, true);
                  ObjectIterator var7 = this.J.values().iterator();

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

   protected void b(btz $$0) {
      if ($$0 instanceof arn $$1) {
         this.a($$1, false);
         ObjectIterator var3 = this.J.values().iterator();

         while (var3.hasNext()) {
            aqs.b $$2 = (aqs.b)var3.next();
            $$2.a($$1);
         }
      }

      aqs.b $$3 = (aqs.b)this.J.remove($$0.ar());
      if ($$3 != null) {
         $$3.a();
      }
   }

   protected void l() {
      for (arn $$0 : this.I.a()) {
         this.e($$0);
      }

      List<arn> $$1 = Lists.newArrayList();
      List<arn> $$2 = this.s.x();
      ObjectIterator var3 = this.J.values().iterator();

      while (var3.hasNext()) {
         aqs.b $$3 = (aqs.b)var3.next();
         ki $$4 = $$3.e;
         ki $$5 = ki.a($$3.c);
         boolean $$6 = !Objects.equals($$4, $$5);
         if ($$6) {
            $$3.a($$2);
            btz $$7 = $$3.c;
            if ($$7 instanceof arn) {
               $$1.add((arn)$$7);
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
            aqs.b $$8 = (aqs.b)var3.next();
            $$8.a($$1);
         }
      }
   }

   public void a(btz $$0, zo<?> $$1) {
      aqs.b $$2 = (aqs.b)this.J.get($$0.ar());
      if ($$2 != null) {
         $$2.a($$1);
      }
   }

   protected void b(btz $$0, zo<?> $$1) {
      aqs.b $$2 = (aqs.b)this.J.get($$0.ar());
      if ($$2 != null) {
         $$2.b($$1);
      }
   }

   public void a(List<dwz> $$0) {
      Map<arn, List<dxj>> $$1 = new HashMap<>();

      for (dwz $$2 : $$0) {
         deb $$3 = $$2.f();
         dxj $$5;
         if ($$2 instanceof dxj $$4) {
            $$5 = $$4;
         } else {
            $$5 = this.s.d($$3.e, $$3.f);
         }

         for (arn $$7 : this.a($$3, false)) {
            $$1.computeIfAbsent($$7, $$0x -> new ArrayList<>()).add($$5);
         }
      }

      $$1.forEach(($$0x, $$1x) -> $$0x.d.b(act.a($$1x)));
   }

   protected cfz m() {
      return this.y;
   }

   public String n() {
      return this.H;
   }

   void a(deb $$0, arc $$1) {
      this.E.onChunkStatusChange($$0, $$1);
   }

   public void a(deb $$0, int $$1) {
      int $$2 = $$1 + 1;
      deb.a($$0, $$2).forEach($$0x -> {
         aqq $$1x = this.b($$0x.a());
         if ($$1x != null) {
            $$1x.a(this.t.a($$0x.e, $$0x.f));
         }
      });
   }

   class a extends arb {
      protected a(final Executor $$0, final Executor $$1) {
         super($$0, $$1);
      }

      @Override
      protected boolean a(long $$0) {
         return aqs.this.z.contains($$0);
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
      final arl b;
      final btz c;
      private final int d;
      ki e;
      private final Set<ass> f = Sets.newIdentityHashSet();

      public b(final btz $$0, final int $$1, final int $$2, final boolean $$3) {
         this.b = new arl(aqs.this.s, $$0, $$2, $$3, this::a);
         this.c = $$0;
         this.d = $$1;
         this.e = ki.a($$0);
      }

      @Override
      public boolean equals(Object $$0) {
         return $$0 instanceof aqs.b ? ((aqs.b)$$0).c.ar() == this.c.ar() : false;
      }

      @Override
      public int hashCode() {
         return this.c.ar();
      }

      public void a(zo<?> $$0) {
         for (ass $$1 : this.f) {
            $$1.b($$0);
         }
      }

      public void b(zo<?> $$0) {
         this.a($$0);
         if (this.c instanceof arn) {
            ((arn)this.c).d.b($$0);
         }
      }

      public void a() {
         for (ass $$0 : this.f) {
            this.b.a($$0.o());
         }
      }

      public void a(arn $$0) {
         if (this.f.remove($$0.d)) {
            this.b.a($$0);
         }
      }

      public void b(arn $$0) {
         if ($$0 != this.c) {
            ezh $$1 = $$0.dv().d(this.c.dv());
            int $$2 = aqs.this.b($$0);
            double $$3 = (double)Math.min(this.b(), $$2 * 16);
            double $$4 = $$1.d * $$1.d + $$1.f * $$1.f;
            double $$5 = $$3 * $$3;
            boolean $$6 = $$4 <= $$5 && this.c.a($$0) && aqs.this.a($$0, this.c.dz().e, this.c.dz().f);
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
         return aqs.this.s.o().b($$0);
      }

      private int b() {
         int $$0 = this.d;

         for (btz $$1 : this.c.de()) {
            int $$2 = $$1.aq().o() * 16;
            if ($$2 > $$0) {
               $$0 = $$2;
            }
         }

         return this.a($$0);
      }

      public void a(List<arn> $$0) {
         for (arn $$1 : $$0) {
            this.b($$1);
         }
      }
   }
}
