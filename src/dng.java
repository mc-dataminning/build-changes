import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Either;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dng {
   public static final int a = 8;
   private static final EnumSet<dqo.a> o = EnumSet.of(dqo.a.c, dqo.a.a);
   public static final EnumSet<dqo.a> b = EnumSet.of(dqo.a.d, dqo.a.b, dqo.a.e, dqo.a.f);
   private static final dng.c p = ($$0, $$1, $$2, $$3, $$4, $$5) -> CompletableFuture.completedFuture(Either.left($$5));
   public static final dng c = a("empty", null, -1, o, dng.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
   });
   public static final dng d = a("structure_starts", c, 0, false, o, dng.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      if ($$2.o().aY().y().c()) {
         $$3.a($$2.I_(), $$2.l().h(), $$2.a(), $$8, $$4);
      }

      $$2.a($$8);
      return CompletableFuture.completedFuture(Either.left($$8));
   }, ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      $$1.a($$5);
      return CompletableFuture.completedFuture(Either.left($$5));
   });
   public static final dng e = a("structure_references", d, 8, o, dng.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      apc $$5 = new apc($$1, $$3, $$0, -1);
      $$2.a($$5, $$1.a().a($$5), $$4);
   });
   public static final dng f = a("biomes", e, 8, o, dng.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      apc $$9 = new apc($$2, $$7, $$0, -1);
      return $$3.a($$1, $$2.l().i(), drq.a($$9), $$2.a().a($$9), $$8).thenApply($$0x -> Either.left($$0x));
   });
   public static final dng g = a("noise", f, 8, o, dng.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      apc $$9 = new apc($$2, $$7, $$0, 0);
      return $$3.a($$1, drq.a($$9), $$2.l().i(), $$2.a().a($$9), $$8).thenApply($$0x -> {
         if ($$0x instanceof dnw $$1x) {
            dqc $$2x = $$1x.x();
            if ($$2x != null) {
               dqc.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return Either.left($$0x);
      });
   });
   public static final dng h = a("surface", g, 8, o, dng.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      apc $$5 = new apc($$1, $$3, $$0, 0);
      $$2.a($$5, $$1.a().a($$5), $$1.l().i(), $$4);
   });
   public static final dng i = a("carvers", h, 8, b, dng.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      apc $$5 = new apc($$1, $$3, $$0, 0);
      if ($$4 instanceof dnw $$6) {
         drq.a($$5, $$6);
      }

      $$2.a($$5, $$1.C(), $$1.l().i(), $$1.G_(), $$1.a().a($$5), $$4, dqk.a.a);
   });
   public static final dng j = a("features", i, 8, b, dng.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      dqo.a($$4, EnumSet.of(dqo.a.e, dqo.a.f, dqo.a.d, dqo.a.b));
      apc $$5 = new apc($$1, $$3, $$0, 1);
      $$2.a($$5, $$4, $$1.a().a($$5));
      drq.a($$5, $$4);
   });
   public static final dng k = a(
      "initialize_light", j, 0, false, b, dng.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> a($$5, $$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$3, $$5)
   );
   public static final dng l = a(
      "light", k, 1, true, b, dng.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> b($$5, $$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> b($$3, $$5)
   );
   public static final dng m = a("spawn", l, 0, b, dng.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      if (!$$4.y()) {
         $$2.a(new apc($$1, $$3, $$0, -1));
      }
   });
   public static final dng n = a(
      "full", m, 0, false, b, dng.a.b, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> $$6.apply($$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> $$4.apply($$5)
   );
   private static final List<dng> q = ImmutableList.of(n, k, i, f, d, d, d, d, d, d, d, d, new dng[0]);
   private static final IntList r = ac.a(new IntArrayList(a().size()), $$0 -> {
      int $$1 = 0;

      for (int $$2 = a().size() - 1; $$2 >= 0; $$2--) {
         while ($$1 + 1 < q.size() && $$2 <= q.get($$1 + 1).c()) {
            $$1++;
         }

         $$0.add(0, $$1);
      }
   });
   private final int s;
   private final dng t;
   private final dng.b u;
   private final dng.c v;
   private final int w;
   private final boolean x;
   private final dng.a y;
   private final EnumSet<dqo.a> z;

   private static CompletableFuture<Either<dnb, aod.a>> a(aoy $$0, dnb $$1) {
      $$1.A();
      ((dnw)$$1).a($$0);
      boolean $$2 = a($$1);
      return $$0.a($$1, $$2).thenApply(Either::left);
   }

   private static CompletableFuture<Either<dnb, aod.a>> b(aoy $$0, dnb $$1) {
      boolean $$2 = a($$1);
      return $$0.b($$1, $$2).thenApply(Either::left);
   }

   private static dng a(String $$0, @Nullable dng $$1, int $$2, EnumSet<dqo.a> $$3, dng.a $$4, dng.d $$5) {
      return a($$0, $$1, $$2, $$3, $$4, (dng.b)$$5);
   }

   private static dng a(String $$0, @Nullable dng $$1, int $$2, EnumSet<dqo.a> $$3, dng.a $$4, dng.b $$5) {
      return a($$0, $$1, $$2, false, $$3, $$4, $$5, p);
   }

   private static dng a(String $$0, @Nullable dng $$1, int $$2, boolean $$3, EnumSet<dqo.a> $$4, dng.a $$5, dng.b $$6, dng.c $$7) {
      return iv.a(kf.n, $$0, new dng($$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public static List<dng> a() {
      List<dng> $$0 = Lists.newArrayList();

      dng $$1;
      for ($$1 = n; $$1.d() != $$1; $$1 = $$1.d()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   private static boolean a(dnb $$0) {
      return $$0.j().b(l) && $$0.v();
   }

   public static dng a(int $$0) {
      if ($$0 >= q.size()) {
         return c;
      } else {
         return $$0 < 0 ? n : q.get($$0);
      }
   }

   public static int b() {
      return q.size();
   }

   public static int a(dng $$0) {
      return r.getInt($$0.c());
   }

   dng(@Nullable dng $$0, int $$1, boolean $$2, EnumSet<dqo.a> $$3, dng.a $$4, dng.b $$5, dng.c $$6) {
      this.t = $$0 == null ? this : $$0;
      this.u = $$5;
      this.v = $$6;
      this.w = $$1;
      this.x = $$2;
      this.y = $$4;
      this.z = $$3;
      this.s = $$0 == null ? 0 : $$0.c() + 1;
   }

   public int c() {
      return this.s;
   }

   public dng d() {
      return this.t;
   }

   public CompletableFuture<Either<dnb, aod.a>> a(
      Executor $$0, aov $$1, dnc $$2, eff $$3, aoy $$4, Function<dnb, CompletableFuture<Either<dnb, aod.a>>> $$5, List<dnb> $$6
   ) {
      dnb $$7 = $$6.get($$6.size() / 2);
      biu $$8 = bir.e.a($$7.f(), $$1.ae(), this.toString());
      return this.u.doWork(this, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7).thenApply($$1x -> {
         $$1x.ifLeft($$0xx -> {
            if ($$0xx instanceof dnw $$1xx && !$$1xx.j().b(this)) {
               $$1xx.a(this);
            }
         });
         if ($$8 != null) {
            $$8.finish();
         }

         return $$1x;
      });
   }

   public CompletableFuture<Either<dnb, aod.a>> a(aov $$0, eff $$1, aoy $$2, Function<dnb, CompletableFuture<Either<dnb, aod.a>>> $$3, dnb $$4) {
      return this.v.doWork(this, $$0, $$1, $$2, $$3, $$4);
   }

   public int e() {
      return this.w;
   }

   public boolean f() {
      return this.x;
   }

   public dng.a g() {
      return this.y;
   }

   public static dng a(String $$0) {
      return kf.n.a(aiy.a($$0));
   }

   public EnumSet<dqo.a> h() {
      return this.z;
   }

   public boolean b(dng $$0) {
      return this.c() >= $$0.c();
   }

   @Override
   public String toString() {
      return kf.n.b(this).toString();
   }

   public static enum a {
      a,
      b;
   }

   interface b {
      CompletableFuture<Either<dnb, aod.a>> doWork(
         dng var1, Executor var2, aov var3, dnc var4, eff var5, aoy var6, Function<dnb, CompletableFuture<Either<dnb, aod.a>>> var7, List<dnb> var8, dnb var9
      );
   }

   interface c {
      CompletableFuture<Either<dnb, aod.a>> doWork(dng var1, aov var2, eff var3, aoy var4, Function<dnb, CompletableFuture<Either<dnb, aod.a>>> var5, dnb var6);
   }

   interface d extends dng.b {
      @Override
      default CompletableFuture<Either<dnb, aod.a>> doWork(
         dng $$0, Executor $$1, aov $$2, dnc $$3, eff $$4, aoy $$5, Function<dnb, CompletableFuture<Either<dnb, aod.a>>> $$6, List<dnb> $$7, dnb $$8
      ) {
         this.doWork($$0, $$2, $$3, $$7, $$8);
         return CompletableFuture.completedFuture(Either.left($$8));
      }

      void doWork(dng var1, aov var2, dnc var3, List<dnb> var4, dnb var5);
   }
}
