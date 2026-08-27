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

public class dpc {
   public static final int a = 8;
   private static final EnumSet<dso.a> o = EnumSet.of(dso.a.c, dso.a.a);
   public static final EnumSet<dso.a> b = EnumSet.of(dso.a.d, dso.a.b, dso.a.e, dso.a.f);
   private static final dpc.c p = ($$0, $$1, $$2, $$3, $$4, $$5) -> CompletableFuture.completedFuture(Either.left($$5));
   public static final dpc c = a("empty", null, -1, o, dpc.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
   });
   public static final dpc d = a("structure_starts", c, 0, false, o, dpc.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      if ($$2.o().bc().y().c()) {
         $$3.a($$2.H_(), $$2.l().h(), $$2.a(), $$8, $$4);
      }

      $$2.a($$8);
      return CompletableFuture.completedFuture(Either.left($$8));
   }, ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      $$1.a($$5);
      return CompletableFuture.completedFuture(Either.left($$5));
   });
   public static final dpc e = a("structure_references", d, 8, o, dpc.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      apm $$5 = new apm($$1, $$3, $$0, -1);
      $$2.a($$5, $$1.a().a($$5), $$4);
   });
   public static final dpc f = a("biomes", e, 8, o, dpc.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      apm $$9 = new apm($$2, $$7, $$0, -1);
      return $$3.a($$1, $$2.l().i(), dtq.a($$9), $$2.a().a($$9), $$8).thenApply($$0x -> Either.left($$0x));
   });
   public static final dpc g = a("noise", f, 8, o, dpc.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      apm $$9 = new apm($$2, $$7, $$0, 0);
      return $$3.a($$1, dtq.a($$9), $$2.l().i(), $$2.a().a($$9), $$8).thenApply($$0x -> {
         if ($$0x instanceof dps $$1x) {
            dsc $$2x = $$1x.x();
            if ($$2x != null) {
               dsc.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return Either.left($$0x);
      });
   });
   public static final dpc h = a("surface", g, 8, o, dpc.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      apm $$5 = new apm($$1, $$3, $$0, 0);
      $$2.a($$5, $$1.a().a($$5), $$1.l().i(), $$4);
   });
   public static final dpc i = a("carvers", h, 8, b, dpc.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      apm $$5 = new apm($$1, $$3, $$0, 0);
      if ($$4 instanceof dps $$6) {
         dtq.a($$5, $$6);
      }

      $$2.a($$5, $$1.C(), $$1.l().i(), $$1.F_(), $$1.a().a($$5), $$4, dsk.a.a);
   });
   public static final dpc j = a("features", i, 8, b, dpc.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      dso.a($$4, EnumSet.of(dso.a.e, dso.a.f, dso.a.d, dso.a.b));
      apm $$5 = new apm($$1, $$3, $$0, 1);
      $$2.a($$5, $$4, $$1.a().a($$5));
      dtq.a($$5, $$4);
   });
   public static final dpc k = a(
      "initialize_light", j, 0, false, b, dpc.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> a($$5, $$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$3, $$5)
   );
   public static final dpc l = a(
      "light", k, 1, true, b, dpc.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> b($$5, $$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> b($$3, $$5)
   );
   public static final dpc m = a("spawn", l, 1, b, dpc.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      if (!$$4.y()) {
         $$2.a(new apm($$1, $$3, $$0, -1));
      }
   });
   public static final dpc n = a(
      "full", m, 0, false, b, dpc.a.b, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> $$6.apply($$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> $$4.apply($$5)
   );
   private static final List<dpc> q = ImmutableList.of(n, k, i, f, d, d, d, d, d, d, d, d, new dpc[0]);
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
   private final dpc t;
   private final dpc.b u;
   private final dpc.c v;
   private final int w;
   private final boolean x;
   private final dpc.a y;
   private final EnumSet<dso.a> z;

   private static CompletableFuture<Either<dox, aon.a>> a(api $$0, dox $$1) {
      $$1.A();
      ((dps)$$1).a($$0);
      boolean $$2 = a($$1);
      return $$0.a($$1, $$2).thenApply(Either::left);
   }

   private static CompletableFuture<Either<dox, aon.a>> b(api $$0, dox $$1) {
      boolean $$2 = a($$1);
      return $$0.b($$1, $$2).thenApply(Either::left);
   }

   private static dpc a(String $$0, @Nullable dpc $$1, int $$2, EnumSet<dso.a> $$3, dpc.a $$4, dpc.d $$5) {
      return a($$0, $$1, $$2, $$3, $$4, (dpc.b)$$5);
   }

   private static dpc a(String $$0, @Nullable dpc $$1, int $$2, EnumSet<dso.a> $$3, dpc.a $$4, dpc.b $$5) {
      return a($$0, $$1, $$2, false, $$3, $$4, $$5, p);
   }

   private static dpc a(String $$0, @Nullable dpc $$1, int $$2, boolean $$3, EnumSet<dso.a> $$4, dpc.a $$5, dpc.b $$6, dpc.c $$7) {
      return iy.a(ki.n, $$0, new dpc($$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public static List<dpc> a() {
      List<dpc> $$0 = Lists.newArrayList();

      dpc $$1;
      for ($$1 = n; $$1.d() != $$1; $$1 = $$1.d()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   private static boolean a(dox $$0) {
      return $$0.j().b(l) && $$0.v();
   }

   public static dpc a(int $$0) {
      if ($$0 >= q.size()) {
         return c;
      } else {
         return $$0 < 0 ? n : q.get($$0);
      }
   }

   public static int b() {
      return q.size();
   }

   public static int a(dpc $$0) {
      return r.getInt($$0.c());
   }

   dpc(@Nullable dpc $$0, int $$1, boolean $$2, EnumSet<dso.a> $$3, dpc.a $$4, dpc.b $$5, dpc.c $$6) {
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

   public dpc d() {
      return this.t;
   }

   public CompletableFuture<Either<dox, aon.a>> a(
      Executor $$0, apf $$1, doy $$2, ehf $$3, api $$4, Function<dox, CompletableFuture<Either<dox, aon.a>>> $$5, List<dox> $$6
   ) {
      dox $$7 = $$6.get($$6.size() / 2);
      bka $$8 = bjx.f.a($$7.f(), $$1.ad(), this.toString());
      return this.u.doWork(this, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7).thenApply($$1x -> {
         $$1x.ifLeft($$0xx -> {
            if ($$0xx instanceof dps $$1xx && !$$1xx.j().b(this)) {
               $$1xx.a(this);
            }
         });
         if ($$8 != null) {
            $$8.finish();
         }

         return $$1x;
      });
   }

   public CompletableFuture<Either<dox, aon.a>> a(apf $$0, ehf $$1, api $$2, Function<dox, CompletableFuture<Either<dox, aon.a>>> $$3, dox $$4) {
      return this.v.doWork(this, $$0, $$1, $$2, $$3, $$4);
   }

   public int e() {
      return this.w;
   }

   public boolean f() {
      return this.x;
   }

   public dpc.a g() {
      return this.y;
   }

   public static dpc a(String $$0) {
      return ki.n.a(ajh.a($$0));
   }

   public EnumSet<dso.a> h() {
      return this.z;
   }

   public boolean b(dpc $$0) {
      return this.c() >= $$0.c();
   }

   @Override
   public String toString() {
      return ki.n.b(this).toString();
   }

   public static enum a {
      a,
      b;
   }

   interface b {
      CompletableFuture<Either<dox, aon.a>> doWork(
         dpc var1, Executor var2, apf var3, doy var4, ehf var5, api var6, Function<dox, CompletableFuture<Either<dox, aon.a>>> var7, List<dox> var8, dox var9
      );
   }

   interface c {
      CompletableFuture<Either<dox, aon.a>> doWork(dpc var1, apf var2, ehf var3, api var4, Function<dox, CompletableFuture<Either<dox, aon.a>>> var5, dox var6);
   }

   interface d extends dpc.b {
      @Override
      default CompletableFuture<Either<dox, aon.a>> doWork(
         dpc $$0, Executor $$1, apf $$2, doy $$3, ehf $$4, api $$5, Function<dox, CompletableFuture<Either<dox, aon.a>>> $$6, List<dox> $$7, dox $$8
      ) {
         this.doWork($$0, $$2, $$3, $$7, $$8);
         return CompletableFuture.completedFuture(Either.left($$8));
      }

      void doWork(dpc var1, apf var2, doy var3, List<dox> var4, dox var5);
   }
}
