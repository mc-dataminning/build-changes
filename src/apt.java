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

public class apt extends dvr implements apr.b, aqe {
   private static final apu<List<duh>> f = apu.a("Unloaded chunks found in range");
   private static final CompletableFuture<apu<List<duh>>> g = CompletableFuture.completedFuture(f);
   private static final byte h = -1;
   private static final byte i = 0;
   private static final byte j = 1;
   private static final Logger k = LogUtils.getLogger();
   private static final int l = 200;
   private static final int m = 20;
   private static final int n = 10000;
   public static final int a = 2;
   public static final int b = 32;
   public static final int c = aps.a(aqd.d);
   private final Long2ObjectLinkedOpenHashMap<apr> o = new Long2ObjectLinkedOpenHashMap();
   private volatile Long2ObjectLinkedOpenHashMap<apr> p = this.o.clone();
   private final Long2ObjectLinkedOpenHashMap<apr> q = new Long2ObjectLinkedOpenHashMap();
   private final List<apq> r = new ArrayList<>();
   final aqm s;
   private final aqp t;
   private final box<Runnable> u;
   private final dyu v;
   private final duj w;
   private final Supplier<eqe> x;
   private final ceg y;
   final LongSet z = new LongOpenHashSet();
   private boolean A;
   private final apw B;
   private final boz<apw.a<Runnable>> C;
   private final boz<apw.a<Runnable>> D;
   private final aqv E;
   private final dwn F;
   private final apt.a G;
   private final AtomicInteger H = new AtomicInteger();
   private final String I;
   private final aqg J = new aqg();
   private final Int2ObjectMap<apt.b> K = new Int2ObjectOpenHashMap();
   private final Long2ByteMap L = new Long2ByteOpenHashMap();
   private final Long2LongMap M = new Long2LongOpenHashMap();
   private final Queue<Runnable> N = Queues.newConcurrentLinkedQueue();
   private int O;
   private final dvn P;

   public apt(
      aqm $$0,
      eqk.c $$1,
      DataFixer $$2,
      emz $$3,
      Executor $$4,
      box<Runnable> $$5,
      duu $$6,
      dui $$7,
      aqv $$8,
      dwn $$9,
      Supplier<eqe> $$10,
      int $$11,
      boolean $$12
   ) {
      super(new dwa($$1.f(), $$0.af(), "chunk"), $$1.a($$0.af()).resolve("region"), $$2, $$12);
      Path $$13 = $$1.a($$0.af());
      this.I = $$13.getFileName().toString();
      this.s = $$0;
      jx $$14 = $$0.H_();
      long $$15 = $$0.C();
      if ($$7 instanceof dyj $$16) {
         this.v = dyu.a($$16.h().a(), $$14.b(lr.aO), $$15);
      } else {
         this.v = dyu.a(dyl.e(), $$14.b(lr.aO), $$15);
      }

      this.w = $$7.a($$14.b(lr.aS), this.v, $$15);
      this.u = $$5;
      bpa<Runnable> $$17 = bpa.a($$4, "worldgen");
      boz<Runnable> $$18 = boz.a("main", $$5::i);
      this.E = $$8;
      this.F = $$9;
      bpa<Runnable> $$19 = bpa.a($$4, "light");
      this.B = new apw(ImmutableList.of($$17, $$18, $$19), $$4, Integer.MAX_VALUE);
      this.C = this.B.a($$17, false);
      this.D = this.B.a($$18, false);
      this.t = new aqp($$6, this, this.s.D_().g(), $$19, this.B.a($$19, false));
      this.G = new apt.a($$4, $$5);
      this.x = $$10;
      this.y = new ceg(new dwa($$1.f(), $$0.af(), "poi"), $$13.resolve("poi"), $$2, $$12, $$14, $$0);
      this.a($$11);
      this.P = new dvn($$0, $$7, $$3, this.t, this.D);
   }

   protected dui a() {
      return this.P.b();
   }

   protected duj b() {
      return this.w;
   }

   protected dyu c() {
      return this.v;
   }

   private static double a(dbn $$0, bsh $$1) {
      double $$2 = (double)kc.a($$0.e, 8);
      double $$3 = (double)kc.a($$0.f, 8);
      double $$4 = $$2 - $$1.dw();
      double $$5 = $$3 - $$1.dC();
      return $$4 * $$4 + $$5 * $$5;
   }

   boolean a(aqn $$0, int $$1, int $$2) {
      return $$0.X().a($$1, $$2) && !$$0.c.g.a(dbn.c($$1, $$2));
   }

   private boolean b(aqn $$0, int $$1, int $$2) {
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

   protected aqp d() {
      return this.t;
   }

   @Nullable
   protected apr a(long $$0) {
      return (apr)this.o.get($$0);
   }

   @Nullable
   protected apr b(long $$0) {
      return (apr)this.p.get($$0);
   }

   protected IntSupplier c(long $$0) {
      return () -> {
         apr $$1 = this.b($$0);
         return $$1 == null ? apv.a - 1 : Math.min($$1.j(), apv.a - 1);
      };
   }

   public String a(dbn $$0) {
      apr $$1 = this.b($$0.a());
      if ($$1 == null) {
         return "null";
      } else {
         String $$2 = $$1.i() + "\n";
         dvi $$3 = $$1.u();
         duh $$4 = $$1.p();
         if ($$3 != null) {
            $$2 = $$2 + "St: §" + $$3.b() + $$3 + "§r\n";
         }

         if ($$4 != null) {
            $$2 = $$2 + "Ch: §" + $$4.j().b() + $$4.j() + "§r\n";
         }

         aqd $$5 = $$1.s();
         $$2 = $$2 + '§' + $$5.ordinal() + $$5;
         return $$2 + "§r";
      }
   }

   private CompletableFuture<apu<List<duh>>> a(apr $$0, int $$1, IntFunction<dvi> $$2) {
      if ($$1 == 0) {
         dvi $$3 = $$2.apply(0);
         return $$0.a($$3, this).thenApply($$0x -> $$0x.a(List::of));
      } else {
         List<CompletableFuture<apu<duh>>> $$4 = new ArrayList<>();
         dbn $$5 = $$0.r();

         for (int $$6 = -$$1; $$6 <= $$1; $$6++) {
            for (int $$7 = -$$1; $$7 <= $$1; $$7++) {
               int $$8 = Math.max(Math.abs($$7), Math.abs($$6));
               long $$9 = dbn.c($$5.e + $$7, $$5.f + $$6);
               apr $$10 = this.a($$9);
               if ($$10 == null) {
                  return g;
               }

               dvi $$11 = $$2.apply($$8);
               $$4.add($$10.a($$11, this));
            }
         }

         return ac.d($$4).thenApply($$0x -> {
            List<duh> $$1x = Lists.newArrayList();

            for (apu<duh> $$2x : $$0x) {
               if ($$2x == null) {
                  throw this.a(new IllegalStateException("At least one of the chunk futures were null"), "n/a");
               }

               duh $$3 = $$2x.b(null);
               if ($$3 == null) {
                  return f;
               }

               $$1x.add($$3);
            }

            return apu.a($$1x);
         });
      }
   }

   public y a(IllegalStateException $$0, String $$1) {
      StringBuilder $$2 = new StringBuilder();
      Consumer<apr> $$3 = $$1x -> $$1x.t().forEach($$2x -> {
            dvi $$3x = (dvi)$$2x.getFirst();
            CompletableFuture<apu<duh>> $$4x = (CompletableFuture<apu<duh>>)$$2x.getSecond();
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
      return new y($$4);
   }

   public CompletableFuture<apu<dur>> a(apr $$0) {
      return this.a($$0, 2, $$0x -> dvi.n).thenApplyAsync($$0x -> $$0x.a($$0xx -> (dur)$$0xx.get($$0xx.size() / 2)), this.u);
   }

   @Nullable
   apr a(long $$0, int $$1, @Nullable apr $$2, int $$3) {
      if (!aps.f($$3) && !aps.f($$1)) {
         return $$2;
      } else {
         if ($$2 != null) {
            $$2.a($$1);
         }

         if ($$2 != null) {
            if (!aps.f($$1)) {
               this.z.add($$0);
            } else {
               this.z.remove($$0);
            }
         }

         if (aps.f($$1) && $$2 == null) {
            $$2 = (apr)this.q.remove($$0);
            if ($$2 != null) {
               $$2.a($$1);
            } else {
               $$2 = new apr(new dbn($$0), $$1, this.s, this.t, this.B, this);
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
         List<apr> $$1 = this.p.values().stream().filter(apr::k).peek(apr::l).toList();
         MutableBoolean $$2 = new MutableBoolean();

         do {
            $$2.setFalse();
            $$1.stream().map($$0x -> {
               this.u.b($$0x::h);
               return $$0x.p();
            }).filter($$0x -> $$0x instanceof duq || $$0x instanceof dur).filter(this::a).forEach($$1x -> $$2.setTrue());
         } while ($$2.isTrue());

         this.b(() -> true);
         this.o();
      } else {
         this.p.values().forEach(this::d);
      }
   }

   protected void a(BooleanSupplier $$0) {
      bmv $$1 = this.s.ag();
      $$1.a("poi");
      this.y.a($$0);
      $$1.b("chunk_unload");
      if (!this.s.t()) {
         this.b($$0);
      }

      $$1.c();
   }

   public boolean e() {
      return this.t.K_() || !this.q.isEmpty() || !this.o.isEmpty() || this.y.a() || !this.z.isEmpty() || !this.N.isEmpty() || this.B.a() || this.G.f();
   }

   private void b(BooleanSupplier $$0) {
      LongIterator $$1 = this.z.iterator();
      int $$2 = 0;

      while ($$1.hasNext() && ($$0.getAsBoolean() || $$2 < 200 || this.z.size() > 2000)) {
         long $$3 = $$1.nextLong();
         apr $$4 = (apr)this.o.get($$3);
         if ($$4 != null) {
            if ($$4.o() != 0) {
               continue;
            }

            this.o.remove($$3);
            this.q.put($$3, $$4);
            this.A = true;
            $$2++;
            this.a($$3, $$4);
         }

         $$1.remove();
      }

      int $$5 = Math.max(0, this.N.size() - 2000);

      Runnable $$6;
      while (($$0.getAsBoolean() || $$5 > 0) && ($$6 = this.N.poll()) != null) {
         $$5--;
         $$6.run();
      }

      int $$7 = 0;
      ObjectIterator<apr> $$8 = this.p.values().iterator();

      while ($$7 < 20 && $$0.getAsBoolean() && $$8.hasNext()) {
         if (this.d((apr)$$8.next())) {
            $$7++;
         }
      }
   }

   private void a(long $$0, apr $$1) {
      $$1.g().thenRunAsync(() -> {
         if (!$$1.h()) {
            this.a($$0, $$1);
         } else {
            duh $$2 = $$1.p();
            if (this.q.remove($$0, $$1) && $$2 != null) {
               if ($$2 instanceof dur $$3) {
                  $$3.c(false);
               }

               this.a($$2);
               if ($$2 instanceof dur $$4) {
                  this.s.a($$4);
               }

               this.t.a($$2.f());
               this.t.b();
               this.E.a($$2.f(), null);
               this.M.remove($$2.f().a());
            }
         }
      }, this.N::add).whenComplete(($$1x, $$2) -> {
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

   private CompletableFuture<duh> f(dbn $$0) {
      return this.j($$0).thenApply($$1 -> $$1.filter($$1x -> {
            boolean $$2 = b($$1x);
            if (!$$2) {
               k.error("Chunk file at {} is missing level data, skipping", $$0);
            }

            return $$2;
         })).thenApplyAsync($$1 -> {
         this.s.ag().d("chunkLoad");
         if ($$1.isPresent()) {
            duh $$2 = dvq.a(this.s, this.y, $$0, $$1.get());
            this.a($$0, $$2.j().d());
            return $$2;
         } else {
            return this.g($$0);
         }
      }, this.u).exceptionallyAsync($$1 -> this.a($$1, $$0), this.u);
   }

   private static boolean b(tx $$0) {
      return $$0.b("Status", 8);
   }

   private duh a(Throwable $$0, dbn $$1) {
      Throwable $$3 = $$0 instanceof CompletionException $$2 ? $$2.getCause() : $$0;
      Throwable $$5 = $$3 instanceof y $$4 ? $$4.getCause() : $$3;
      boolean $$6 = $$5 instanceof Error;
      boolean $$7 = $$5 instanceof IOException || $$5 instanceof ui;
      if (!$$6 && $$7) {
         k.error("Couldn't load chunk {}", $$1, $$5);
         this.s.o().a($$1);
         return this.g($$1);
      } else {
         o $$8 = o.a($$0, "Exception loading chunk");
         p $$9 = $$8.a("Chunk being loaded");
         $$9.a("pos", $$1);
         this.h($$1);
         throw new y($$8);
      }
   }

   private duh g(dbn $$0) {
      this.h($$0);
      return new dvb($$0, dve.a, this.s, this.s.H_().d(lr.aE), null);
   }

   private void h(dbn $$0) {
      this.L.put($$0.a(), (byte)-1);
   }

   private byte a(dbn $$0, dvm $$1) {
      return this.L.put($$0.a(), (byte)($$1 == dvm.a ? -1 : 1));
   }

   @Override
   public aqf d(long $$0) {
      apr $$1 = (apr)this.o.get($$0);
      $$1.m();
      return $$1;
   }

   @Override
   public void a(aqf $$0) {
      $$0.n();
   }

   @Override
   public CompletableFuture<duh> a(aqf $$0, dvl $$1, aza<aqf> $$2) {
      dbn $$3 = $$0.r();
      if ($$1.a() == dvi.c) {
         return this.f($$3);
      } else {
         try {
            aqf $$4 = $$2.a($$3.e, $$3.f);
            duh $$5 = $$4.a($$1.a().c());
            if ($$5 == null) {
               throw new IllegalStateException("Parent chunk missing");
            } else {
               CompletableFuture<duh> $$6 = $$1.a(this.P, $$2, $$5);
               this.E.a($$3, $$1.a());
               return $$6;
            }
         } catch (Exception var8) {
            var8.getStackTrace();
            o $$8 = o.a(var8, "Exception generating new chunk");
            p $$9 = $$8.a("Chunk to be generated");
            $$9.a("Status being generated", () -> $$1.a().f());
            $$9.a("Location", String.format(Locale.ROOT, "%d,%d", $$3.e, $$3.f));
            $$9.a("Position hash", dbn.c($$3.e, $$3.f));
            $$9.a("Generator", this.a());
            this.u.execute(() -> {
               throw new y($$8);
            });
            throw new y($$8);
         }
      }
   }

   @Override
   public apq a(dvi $$0, dbn $$1) {
      apq $$2 = apq.a(this, $$0, $$1);
      this.r.add($$2);
      return $$2;
   }

   private void a(apq $$0) {
      this.C.a(apw.a($$0.c(), () -> {
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

   public CompletableFuture<apu<dur>> b(apr $$0) {
      CompletableFuture<apu<List<duh>>> $$1 = this.a($$0, 1, $$0x -> dvi.n);
      CompletableFuture<apu<dur>> $$2 = $$1.<apu<dur>>thenApplyAsync(
            $$0x -> $$0x.a($$0xx -> (dur)$$0xx.get($$0xx.size() / 2)), $$1x -> this.D.a(apw.a($$0, $$1x))
         )
         .thenApplyAsync($$1x -> $$1x.a($$1xx -> {
               $$1xx.H();
               this.s.b($$1xx);
               CompletableFuture<?> $$2x = $$0.f();
               if ($$2x.isDone()) {
                  this.a($$1xx);
               } else {
                  $$2x.thenAcceptAsync($$1xxx -> this.a($$1xx), this.u);
               }
            }), this.u);
      $$2.handle(($$0x, $$1x) -> {
         this.H.getAndIncrement();
         return null;
      });
      return $$2;
   }

   private void a(dur $$0) {
      dbn $$1 = $$0.f();

      for (aqn $$2 : this.J.a()) {
         if ($$2.X().a($$1)) {
            a($$2, $$0);
         }
      }
   }

   public CompletableFuture<apu<dur>> c(apr $$0) {
      return this.a($$0, 1, aps::b).thenApplyAsync($$0x -> $$0x.a($$0xx -> (dur)$$0xx.get($$0xx.size() / 2)), $$1 -> this.D.a(apw.a($$0, $$1)));
   }

   public int h() {
      return this.H.get();
   }

   private boolean d(apr $$0) {
      if ($$0.k() && $$0.h()) {
         duh $$1 = $$0.p();
         if (!($$1 instanceof duq) && !($$1 instanceof dur)) {
            return false;
         } else {
            long $$2 = $$1.f().a();
            long $$3 = this.M.getOrDefault($$2, -1L);
            long $$4 = System.currentTimeMillis();
            if ($$4 < $$3) {
               return false;
            } else {
               boolean $$5 = this.a($$1);
               $$0.l();
               if ($$5) {
                  this.M.put($$2, $$4 + 10000L);
               }

               return $$5;
            }
         }
      } else {
         return false;
      }
   }

   private boolean a(duh $$0) {
      this.y.a($$0.f());
      if (!$$0.i()) {
         return false;
      } else {
         $$0.a(false);
         dbn $$1 = $$0.f();

         try {
            dvi $$2 = $$0.j();
            if ($$2.d() != dvm.b) {
               if (this.i($$1)) {
                  return false;
               }

               if ($$2 == dvi.c && $$0.g().values().stream().noneMatch(ejf::b)) {
                  return false;
               }
            }

            this.s.ag().d("chunkSave");
            tx $$3 = dvq.a(this.s, $$0);
            this.a($$1, $$3).exceptionallyAsync($$1x -> {
               this.s.o().b($$1);
               return null;
            }, this.u);
            this.a($$1, $$2.d());
            return true;
         } catch (Exception var5) {
            k.error("Failed to save chunk {},{}", new Object[]{$$1.e, $$1.f, var5});
            this.s.o().b($$1);
            return false;
         }
      }
   }

   private boolean i(dbn $$0) {
      byte $$1 = this.L.get($$0.a());
      if ($$1 != 0) {
         return $$1 == 1;
      } else {
         tx $$2;
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

         dvm $$5 = dvq.a($$2);
         return this.a($$0, $$5) == 1;
      }
   }

   protected void a(int $$0) {
      int $$1 = ayg.a($$0, 2, 32);
      if ($$1 != this.O) {
         this.O = $$1;
         this.G.a(this.O);

         for (aqn $$2 : this.J.a()) {
            this.e($$2);
         }
      }
   }

   int b(aqn $$0) {
      return ayg.a($$0.F(), 2, this.O);
   }

   private void a(aqn $$0, dbn $$1) {
      dur $$2 = this.e($$1.a());
      if ($$2 != null) {
         a($$0, $$2);
      }
   }

   private static void a(aqn $$0, dur $$1) {
      $$0.c.g.a($$1);
   }

   private static void b(aqn $$0, dbn $$1) {
      $$0.c.g.a($$0, $$1);
   }

   @Nullable
   public dur e(long $$0) {
      apr $$1 = this.b($$0);
      return $$1 == null ? null : $$1.e();
   }

   public int i() {
      return this.p.size();
   }

   public aqc j() {
      return this.G;
   }

   protected Iterable<apr> k() {
      return Iterables.unmodifiableIterable(this.p.values());
   }

   void a(Writer $$0) throws IOException {
      axf $$1 = axf.a()
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
      aqs $$2 = this.G.d();
      ObjectBidirectionalIterator var4 = this.p.long2ObjectEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<apr> $$3 = (Entry<apr>)var4.next();
         long $$4 = $$3.getLongKey();
         dbn $$5 = new dbn($$4);
         apr $$6 = (apr)$$3.getValue();
         Optional<duh> $$7 = Optional.ofNullable($$6.p());
         Optional<dur> $$8 = $$7.flatMap($$0x -> $$0x instanceof dur ? Optional.of((dur)$$0x) : Optional.empty());
         $$1.a(
            $$5.e,
            $$5.f,
            $$6.i(),
            $$7.isPresent(),
            $$7.map(duh::j).orElse(null),
            $$8.map(dur::D).orElse(null),
            a($$6.c()),
            a($$6.a()),
            a($$6.b()),
            this.G.e($$4),
            this.b($$5),
            $$8.<Integer>map($$0x -> $$0x.G().size()).orElse(0),
            $$2.d($$4),
            $$2.c($$4),
            $$8.<Integer>map($$0x -> $$0x.o().a()).orElse(0),
            $$8.<Integer>map($$0x -> $$0x.p().a()).orElse(0)
         );
      }
   }

   private static String a(CompletableFuture<apu<dur>> $$0) {
      try {
         apu<dur> $$1 = $$0.getNow(null);
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

   private CompletableFuture<Optional<tx>> j(dbn $$0) {
      return this.d($$0).thenApplyAsync($$0x -> $$0x.map(this::c), ac.g());
   }

   private tx c(tx $$0) {
      return this.a(this.s.af(), this.x, $$0, this.a().c());
   }

   boolean b(dbn $$0) {
      if (!this.G.f($$0.a())) {
         return false;
      } else {
         for (aqn $$1 : this.J.a()) {
            if (this.c($$1, $$0)) {
               return true;
            }
         }

         return false;
      }
   }

   public List<aqn> c(dbn $$0) {
      long $$1 = $$0.a();
      if (!this.G.f($$1)) {
         return List.of();
      } else {
         Builder<aqn> $$2 = ImmutableList.builder();

         for (aqn $$3 : this.J.a()) {
            if (this.c($$3, $$0)) {
               $$2.add($$3);
            }
         }

         return $$2.build();
      }
   }

   private boolean c(aqn $$0, dbn $$1) {
      if ($$0.N_()) {
         return false;
      } else {
         double $$2 = a($$1, $$0);
         return $$2 < 16384.0;
      }
   }

   private boolean c(aqn $$0) {
      return $$0.N_() && !this.s.ab().b(dcc.r);
   }

   void a(aqn $$0, boolean $$1) {
      boolean $$2 = this.c($$0);
      boolean $$3 = this.J.d($$0);
      if ($$1) {
         this.J.a($$0, $$2);
         this.d($$0);
         if (!$$2) {
            this.G.a(kc.a($$0), $$0);
         }

         $$0.a(apy.a);
         this.e($$0);
      } else {
         kc $$4 = $$0.W();
         this.J.a($$0);
         if (!$$3) {
            this.G.b($$4, $$0);
         }

         this.a($$0, apy.a);
      }
   }

   private void d(aqn $$0) {
      kc $$1 = kc.a($$0);
      $$0.a($$1);
   }

   public void a(aqn $$0) {
      ObjectIterator $$2 = this.K.values().iterator();

      while ($$2.hasNext()) {
         apt.b $$1 = (apt.b)$$2.next();
         if ($$1.c == $$0) {
            $$1.a(this.s.x());
         } else {
            $$1.b($$0);
         }
      }

      kc $$2x = $$0.W();
      kc $$3 = kc.a($$0);
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

   private void e(aqn $$0) {
      dbn $$1 = $$0.dt();
      int $$2 = this.b($$0);
      if ($$0.X() instanceof apy.a $$3 && $$3.a().equals($$1) && $$3.b() == $$2) {
         return;
      }

      this.a($$0, apy.a($$1, $$2));
   }

   private void a(aqn $$0, apy $$1) {
      if ($$0.dR() == this.s) {
         apy $$2 = $$0.X();
         if ($$1 instanceof apy.a $$3 && (!($$2 instanceof apy.a $$4) || !$$4.a().equals($$3.a()))) {
            $$0.c.b(new aeo($$3.a().e, $$3.a().f));
         }

         apy.a($$2, $$1, $$1x -> this.a($$0, $$1x), $$1x -> b($$0, $$1x));
         $$0.a($$1);
      }
   }

   @Override
   public List<aqn> a(dbn $$0, boolean $$1) {
      Set<aqn> $$2 = this.J.a();
      Builder<aqn> $$3 = ImmutableList.builder();

      for (aqn $$4 : $$2) {
         if ($$1 && this.b($$4, $$0.e, $$0.f) || !$$1 && this.a($$4, $$0.e, $$0.f)) {
            $$3.add($$4);
         }
      }

      return $$3.build();
   }

   protected void a(bsh $$0) {
      if (!($$0 instanceof chm)) {
         bsn<?> $$1 = $$0.am();
         int $$2 = $$1.o() * 16;
         if ($$2 != 0) {
            int $$3 = $$1.p();
            if (this.K.containsKey($$0.an())) {
               throw (IllegalStateException)ac.b(new IllegalStateException("Entity is already tracked!"));
            } else {
               apt.b $$4 = new apt.b($$0, $$2, $$3, $$1.q());
               this.K.put($$0.an(), $$4);
               $$4.a(this.s.x());
               if ($$0 instanceof aqn $$5) {
                  this.a($$5, true);
                  ObjectIterator var7 = this.K.values().iterator();

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

   protected void b(bsh $$0) {
      if ($$0 instanceof aqn $$1) {
         this.a($$1, false);
         ObjectIterator var3 = this.K.values().iterator();

         while (var3.hasNext()) {
            apt.b $$2 = (apt.b)var3.next();
            $$2.a($$1);
         }
      }

      apt.b $$3 = (apt.b)this.K.remove($$0.an());
      if ($$3 != null) {
         $$3.a();
      }
   }

   protected void l() {
      for (aqn $$0 : this.J.a()) {
         this.e($$0);
      }

      List<aqn> $$1 = Lists.newArrayList();
      List<aqn> $$2 = this.s.x();
      ObjectIterator var3 = this.K.values().iterator();

      while (var3.hasNext()) {
         apt.b $$3 = (apt.b)var3.next();
         kc $$4 = $$3.e;
         kc $$5 = kc.a($$3.c);
         boolean $$6 = !Objects.equals($$4, $$5);
         if ($$6) {
            $$3.a($$2);
            bsh $$7 = $$3.c;
            if ($$7 instanceof aqn) {
               $$1.add((aqn)$$7);
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
            apt.b $$8 = (apt.b)var3.next();
            $$8.a($$1);
         }
      }
   }

   public void a(bsh $$0, zb<?> $$1) {
      apt.b $$2 = (apt.b)this.K.get($$0.an());
      if ($$2 != null) {
         $$2.a($$1);
      }
   }

   protected void b(bsh $$0, zb<?> $$1) {
      apt.b $$2 = (apt.b)this.K.get($$0.an());
      if ($$2 != null) {
         $$2.b($$1);
      }
   }

   public void a(List<duh> $$0) {
      Map<aqn, List<dur>> $$1 = new HashMap<>();

      for (duh $$2 : $$0) {
         dbn $$3 = $$2.f();
         dur $$5;
         if ($$2 instanceof dur $$4) {
            $$5 = $$4;
         } else {
            $$5 = this.s.d($$3.e, $$3.f);
         }

         for (aqn $$7 : this.a($$3, false)) {
            $$1.computeIfAbsent($$7, $$0x -> new ArrayList<>()).add($$5);
         }
      }

      $$1.forEach(($$0x, $$1x) -> $$0x.c.b(acd.a($$1x)));
   }

   protected ceg m() {
      return this.y;
   }

   public String n() {
      return this.I;
   }

   void a(dbn $$0, aqd $$1) {
      this.F.onChunkStatusChange($$0, $$1);
   }

   public void a(dbn $$0, int $$1) {
      int $$2 = $$1 + 1;
      dbn.a($$0, $$2).forEach($$0x -> {
         apr $$1x = this.b($$0x.a());
         if ($$1x != null) {
            $$1x.a(this.t.a($$0x.e, $$0x.f));
         }
      });
   }

   class a extends aqc {
      protected a(final Executor $$0, final Executor $$1) {
         super($$0, $$1);
      }

      @Override
      protected boolean a(long $$0) {
         return apt.this.z.contains($$0);
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
      final aql b;
      final bsh c;
      private final int d;
      kc e;
      private final Set<arp> f = Sets.newIdentityHashSet();

      public b(final bsh $$0, final int $$1, final int $$2, final boolean $$3) {
         this.b = new aql(apt.this.s, $$0, $$2, $$3, this::a);
         this.c = $$0;
         this.d = $$1;
         this.e = kc.a($$0);
      }

      @Override
      public boolean equals(Object $$0) {
         return $$0 instanceof apt.b ? ((apt.b)$$0).c.an() == this.c.an() : false;
      }

      @Override
      public int hashCode() {
         return this.c.an();
      }

      public void a(zb<?> $$0) {
         for (arp $$1 : this.f) {
            $$1.b($$0);
         }
      }

      public void b(zb<?> $$0) {
         this.a($$0);
         if (this.c instanceof aqn) {
            ((aqn)this.c).c.b($$0);
         }
      }

      public void a() {
         for (arp $$0 : this.f) {
            this.b.a($$0.o());
         }
      }

      public void a(aqn $$0) {
         if (this.f.remove($$0.c)) {
            this.b.a($$0);
         }
      }

      public void b(aqn $$0) {
         if ($$0 != this.c) {
            ewh $$1 = $$0.dp().d(this.c.dp());
            int $$2 = apt.this.b($$0);
            double $$3 = (double)Math.min(this.b(), $$2 * 16);
            double $$4 = $$1.c * $$1.c + $$1.e * $$1.e;
            double $$5 = $$3 * $$3;
            boolean $$6 = $$4 <= $$5 && this.c.a($$0) && apt.this.a($$0, this.c.dt().e, this.c.dt().f);
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
         return apt.this.s.o().b($$0);
      }

      private int b() {
         int $$0 = this.d;

         for (bsh $$1 : this.c.cY()) {
            int $$2 = $$1.am().o() * 16;
            if ($$2 > $$0) {
               $$0 = $$2;
            }
         }

         return this.a($$0);
      }

      public void a(List<aqn> $$0) {
         for (aqn $$1 : $$0) {
            this.b($$1);
         }
      }
   }
}
