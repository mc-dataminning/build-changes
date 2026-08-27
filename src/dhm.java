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

public class dhm {
   public static final int a = 8;
   private static final EnumSet<dku.a> o = EnumSet.of(dku.a.c, dku.a.a);
   public static final EnumSet<dku.a> b = EnumSet.of(dku.a.d, dku.a.b, dku.a.e, dku.a.f);
   private static final dhm.c p = ($$0, $$1, $$2, $$3, $$4, $$5) -> CompletableFuture.completedFuture(Either.left($$5));
   public static final dhm c = a("empty", null, -1, o, dhm.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
   });
   public static final dhm d = a("structure_starts", c, 0, false, o, dhm.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      if ($$2.n().aT().A().c()) {
         $$3.a($$2.G_(), $$2.k().h(), $$2.a(), $$8, $$4);
      }

      $$2.a($$8);
      return CompletableFuture.completedFuture(Either.left($$8));
   }, ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      $$1.a($$5);
      return CompletableFuture.completedFuture(Either.left($$5));
   });
   public static final dhm e = a("structure_references", d, 8, o, dhm.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      akz $$5 = new akz($$1, $$3, $$0, -1);
      $$2.a($$5, $$1.a().a($$5), $$4);
   });
   public static final dhm f = a("biomes", e, 8, o, dhm.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      akz $$9 = new akz($$2, $$7, $$0, -1);
      return $$3.a($$1, $$2.k().i(), dlw.a($$9), $$2.a().a($$9), $$8).thenApply($$0x -> Either.left($$0x));
   });
   public static final dhm g = a("noise", f, 8, o, dhm.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      akz $$9 = new akz($$2, $$7, $$0, 0);
      return $$3.a($$1, dlw.a($$9), $$2.k().i(), $$2.a().a($$9), $$8).thenApply($$0x -> {
         if ($$0x instanceof dic $$1x) {
            dki $$2x = $$1x.x();
            if ($$2x != null) {
               dki.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return Either.left($$0x);
      });
   });
   public static final dhm h = a("surface", g, 8, o, dhm.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      akz $$5 = new akz($$1, $$3, $$0, 0);
      $$2.a($$5, $$1.a().a($$5), $$1.k().i(), $$4);
   });
   public static final dhm i = a("carvers", h, 8, b, dhm.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      akz $$5 = new akz($$1, $$3, $$0, 0);
      if ($$4 instanceof dic $$6) {
         dlw.a($$5, $$6);
      }

      $$2.a($$5, $$1.A(), $$1.k().i(), $$1.E_(), $$1.a().a($$5), $$4, dkq.a.a);
   });
   public static final dhm j = a("features", i, 8, b, dhm.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      dku.a($$4, EnumSet.of(dku.a.e, dku.a.f, dku.a.d, dku.a.b));
      akz $$5 = new akz($$1, $$3, $$0, 1);
      $$2.a($$5, $$4, $$1.a().a($$5));
      dlw.a($$5, $$4);
   });
   public static final dhm k = a(
      "initialize_light", j, 0, false, b, dhm.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> a($$5, $$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$3, $$5)
   );
   public static final dhm l = a(
      "light", k, 1, true, b, dhm.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> b($$5, $$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> b($$3, $$5)
   );
   public static final dhm m = a("spawn", l, 0, b, dhm.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      if (!$$4.y()) {
         $$2.a(new akz($$1, $$3, $$0, -1));
      }
   });
   public static final dhm n = a(
      "full", m, 0, false, b, dhm.a.b, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> $$6.apply($$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> $$4.apply($$5)
   );
   private static final List<dhm> q = ImmutableList.of(n, k, i, f, d, d, d, d, d, d, d, d, new dhm[0]);
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
   private final dhm t;
   private final dhm.b u;
   private final dhm.c v;
   private final int w;
   private final boolean x;
   private final dhm.a y;
   private final EnumSet<dku.a> z;

   private static CompletableFuture<Either<dhh, aka.a>> a(akv $$0, dhh $$1) {
      $$1.A();
      ((dic)$$1).a($$0);
      boolean $$2 = a($$1);
      return $$0.a($$1, $$2).thenApply(Either::left);
   }

   private static CompletableFuture<Either<dhh, aka.a>> b(akv $$0, dhh $$1) {
      boolean $$2 = a($$1);
      return $$0.b($$1, $$2).thenApply(Either::left);
   }

   private static dhm a(String $$0, @Nullable dhm $$1, int $$2, EnumSet<dku.a> $$3, dhm.a $$4, dhm.d $$5) {
      return a($$0, $$1, $$2, $$3, $$4, (dhm.b)$$5);
   }

   private static dhm a(String $$0, @Nullable dhm $$1, int $$2, EnumSet<dku.a> $$3, dhm.a $$4, dhm.b $$5) {
      return a($$0, $$1, $$2, false, $$3, $$4, $$5, p);
   }

   private static dhm a(String $$0, @Nullable dhm $$1, int $$2, boolean $$3, EnumSet<dku.a> $$4, dhm.a $$5, dhm.b $$6, dhm.c $$7) {
      return ht.a(jd.o, $$0, new dhm($$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public static List<dhm> a() {
      List<dhm> $$0 = Lists.newArrayList();

      dhm $$1;
      for ($$1 = n; $$1.d() != $$1; $$1 = $$1.d()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   private static boolean a(dhh $$0) {
      return $$0.j().b(l) && $$0.v();
   }

   public static dhm a(int $$0) {
      if ($$0 >= q.size()) {
         return c;
      } else {
         return $$0 < 0 ? n : q.get($$0);
      }
   }

   public static int b() {
      return q.size();
   }

   public static int a(dhm $$0) {
      return r.getInt($$0.c());
   }

   dhm(@Nullable dhm $$0, int $$1, boolean $$2, EnumSet<dku.a> $$3, dhm.a $$4, dhm.b $$5, dhm.c $$6) {
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

   public dhm d() {
      return this.t;
   }

   public CompletableFuture<Either<dhh, aka.a>> a(
      Executor $$0, aks $$1, dhi $$2, dze $$3, akv $$4, Function<dhh, CompletableFuture<Either<dhh, aka.a>>> $$5, List<dhh> $$6
   ) {
      dhh $$7 = $$6.get($$6.size() / 2);
      bea $$8 = bdx.e.a($$7.f(), $$1.ac(), this.toString());
      return this.u.doWork(this, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7).thenApply($$1x -> {
         $$1x.ifLeft($$0xx -> {
            if ($$0xx instanceof dic $$1xx && !$$1xx.j().b(this)) {
               $$1xx.a(this);
            }
         });
         if ($$8 != null) {
            $$8.finish();
         }

         return $$1x;
      });
   }

   public CompletableFuture<Either<dhh, aka.a>> a(aks $$0, dze $$1, akv $$2, Function<dhh, CompletableFuture<Either<dhh, aka.a>>> $$3, dhh $$4) {
      return this.v.doWork(this, $$0, $$1, $$2, $$3, $$4);
   }

   public int e() {
      return this.w;
   }

   public boolean f() {
      return this.x;
   }

   public dhm.a g() {
      return this.y;
   }

   public static dhm a(String $$0) {
      return jd.o.a(aey.a($$0));
   }

   public EnumSet<dku.a> h() {
      return this.z;
   }

   public boolean b(dhm $$0) {
      return this.c() >= $$0.c();
   }

   @Override
   public String toString() {
      return jd.o.b(this).toString();
   }

   public static enum a {
      a,
      b;
   }

   interface b {
      CompletableFuture<Either<dhh, aka.a>> doWork(
         dhm var1, Executor var2, aks var3, dhi var4, dze var5, akv var6, Function<dhh, CompletableFuture<Either<dhh, aka.a>>> var7, List<dhh> var8, dhh var9
      );
   }

   interface c {
      CompletableFuture<Either<dhh, aka.a>> doWork(dhm var1, aks var2, dze var3, akv var4, Function<dhh, CompletableFuture<Either<dhh, aka.a>>> var5, dhh var6);
   }

   interface d extends dhm.b {
      @Override
      default CompletableFuture<Either<dhh, aka.a>> doWork(
         dhm $$0, Executor $$1, aks $$2, dhi $$3, dze $$4, akv $$5, Function<dhh, CompletableFuture<Either<dhh, aka.a>>> $$6, List<dhh> $$7, dhh $$8
      ) {
         this.doWork($$0, $$2, $$3, $$7, $$8);
         return CompletableFuture.completedFuture(Either.left($$8));
      }

      void doWork(dhm var1, aks var2, dhi var3, List<dhh> var4, dhh var5);
   }
}
