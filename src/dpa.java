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

public class dpa {
   public static final int a = 8;
   private static final EnumSet<dsm.a> o = EnumSet.of(dsm.a.c, dsm.a.a);
   public static final EnumSet<dsm.a> b = EnumSet.of(dsm.a.d, dsm.a.b, dsm.a.e, dsm.a.f);
   private static final dpa.c p = ($$0, $$1, $$2, $$3, $$4, $$5) -> CompletableFuture.completedFuture(Either.left($$5));
   public static final dpa c = a("empty", null, -1, o, dpa.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
   });
   public static final dpa d = a("structure_starts", c, 0, false, o, dpa.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      if ($$2.o().bc().y().c()) {
         $$3.a($$2.H_(), $$2.l().h(), $$2.a(), $$8, $$4);
      }

      $$2.a($$8);
      return CompletableFuture.completedFuture(Either.left($$8));
   }, ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      $$1.a($$5);
      return CompletableFuture.completedFuture(Either.left($$5));
   });
   public static final dpa e = a("structure_references", d, 8, o, dpa.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      apm $$5 = new apm($$1, $$3, $$0, -1);
      $$2.a($$5, $$1.a().a($$5), $$4);
   });
   public static final dpa f = a("biomes", e, 8, o, dpa.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      apm $$9 = new apm($$2, $$7, $$0, -1);
      return $$3.a($$1, $$2.l().i(), dto.a($$9), $$2.a().a($$9), $$8).thenApply($$0x -> Either.left($$0x));
   });
   public static final dpa g = a("noise", f, 8, o, dpa.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      apm $$9 = new apm($$2, $$7, $$0, 0);
      return $$3.a($$1, dto.a($$9), $$2.l().i(), $$2.a().a($$9), $$8).thenApply($$0x -> {
         if ($$0x instanceof dpq $$1x) {
            dsa $$2x = $$1x.x();
            if ($$2x != null) {
               dsa.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return Either.left($$0x);
      });
   });
   public static final dpa h = a("surface", g, 8, o, dpa.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      apm $$5 = new apm($$1, $$3, $$0, 0);
      $$2.a($$5, $$1.a().a($$5), $$1.l().i(), $$4);
   });
   public static final dpa i = a("carvers", h, 8, b, dpa.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      apm $$5 = new apm($$1, $$3, $$0, 0);
      if ($$4 instanceof dpq $$6) {
         dto.a($$5, $$6);
      }

      $$2.a($$5, $$1.C(), $$1.l().i(), $$1.F_(), $$1.a().a($$5), $$4, dsi.a.a);
   });
   public static final dpa j = a("features", i, 8, b, dpa.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      dsm.a($$4, EnumSet.of(dsm.a.e, dsm.a.f, dsm.a.d, dsm.a.b));
      apm $$5 = new apm($$1, $$3, $$0, 1);
      $$2.a($$5, $$4, $$1.a().a($$5));
      dto.a($$5, $$4);
   });
   public static final dpa k = a(
      "initialize_light", j, 0, false, b, dpa.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> a($$5, $$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$3, $$5)
   );
   public static final dpa l = a(
      "light", k, 1, true, b, dpa.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> b($$5, $$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> b($$3, $$5)
   );
   public static final dpa m = a("spawn", l, 1, b, dpa.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      if (!$$4.y()) {
         $$2.a(new apm($$1, $$3, $$0, -1));
      }
   });
   public static final dpa n = a(
      "full", m, 0, false, b, dpa.a.b, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> $$6.apply($$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> $$4.apply($$5)
   );
   private static final List<dpa> q = ImmutableList.of(n, k, i, f, d, d, d, d, d, d, d, d, new dpa[0]);
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
   private final dpa t;
   private final dpa.b u;
   private final dpa.c v;
   private final int w;
   private final boolean x;
   private final dpa.a y;
   private final EnumSet<dsm.a> z;

   private static CompletableFuture<Either<dov, aon.a>> a(api $$0, dov $$1) {
      $$1.A();
      ((dpq)$$1).a($$0);
      boolean $$2 = a($$1);
      return $$0.a($$1, $$2).thenApply(Either::left);
   }

   private static CompletableFuture<Either<dov, aon.a>> b(api $$0, dov $$1) {
      boolean $$2 = a($$1);
      return $$0.b($$1, $$2).thenApply(Either::left);
   }

   private static dpa a(String $$0, @Nullable dpa $$1, int $$2, EnumSet<dsm.a> $$3, dpa.a $$4, dpa.d $$5) {
      return a($$0, $$1, $$2, $$3, $$4, (dpa.b)$$5);
   }

   private static dpa a(String $$0, @Nullable dpa $$1, int $$2, EnumSet<dsm.a> $$3, dpa.a $$4, dpa.b $$5) {
      return a($$0, $$1, $$2, false, $$3, $$4, $$5, p);
   }

   private static dpa a(String $$0, @Nullable dpa $$1, int $$2, boolean $$3, EnumSet<dsm.a> $$4, dpa.a $$5, dpa.b $$6, dpa.c $$7) {
      return iy.a(ki.n, $$0, new dpa($$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public static List<dpa> a() {
      List<dpa> $$0 = Lists.newArrayList();

      dpa $$1;
      for ($$1 = n; $$1.d() != $$1; $$1 = $$1.d()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   private static boolean a(dov $$0) {
      return $$0.j().b(l) && $$0.v();
   }

   public static dpa a(int $$0) {
      if ($$0 >= q.size()) {
         return c;
      } else {
         return $$0 < 0 ? n : q.get($$0);
      }
   }

   public static int b() {
      return q.size();
   }

   public static int a(dpa $$0) {
      return r.getInt($$0.c());
   }

   dpa(@Nullable dpa $$0, int $$1, boolean $$2, EnumSet<dsm.a> $$3, dpa.a $$4, dpa.b $$5, dpa.c $$6) {
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

   public dpa d() {
      return this.t;
   }

   public CompletableFuture<Either<dov, aon.a>> a(
      Executor $$0, apf $$1, dow $$2, ehd $$3, api $$4, Function<dov, CompletableFuture<Either<dov, aon.a>>> $$5, List<dov> $$6
   ) {
      dov $$7 = $$6.get($$6.size() / 2);
      bjz $$8 = bjw.f.a($$7.f(), $$1.ad(), this.toString());
      return this.u.doWork(this, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7).thenApply($$1x -> {
         $$1x.ifLeft($$0xx -> {
            if ($$0xx instanceof dpq $$1xx && !$$1xx.j().b(this)) {
               $$1xx.a(this);
            }
         });
         if ($$8 != null) {
            $$8.finish();
         }

         return $$1x;
      });
   }

   public CompletableFuture<Either<dov, aon.a>> a(apf $$0, ehd $$1, api $$2, Function<dov, CompletableFuture<Either<dov, aon.a>>> $$3, dov $$4) {
      return this.v.doWork(this, $$0, $$1, $$2, $$3, $$4);
   }

   public int e() {
      return this.w;
   }

   public boolean f() {
      return this.x;
   }

   public dpa.a g() {
      return this.y;
   }

   public static dpa a(String $$0) {
      return ki.n.a(ajh.a($$0));
   }

   public EnumSet<dsm.a> h() {
      return this.z;
   }

   public boolean b(dpa $$0) {
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
      CompletableFuture<Either<dov, aon.a>> doWork(
         dpa var1, Executor var2, apf var3, dow var4, ehd var5, api var6, Function<dov, CompletableFuture<Either<dov, aon.a>>> var7, List<dov> var8, dov var9
      );
   }

   interface c {
      CompletableFuture<Either<dov, aon.a>> doWork(dpa var1, apf var2, ehd var3, api var4, Function<dov, CompletableFuture<Either<dov, aon.a>>> var5, dov var6);
   }

   interface d extends dpa.b {
      @Override
      default CompletableFuture<Either<dov, aon.a>> doWork(
         dpa $$0, Executor $$1, apf $$2, dow $$3, ehd $$4, api $$5, Function<dov, CompletableFuture<Either<dov, aon.a>>> $$6, List<dov> $$7, dov $$8
      ) {
         this.doWork($$0, $$2, $$3, $$7, $$8);
         return CompletableFuture.completedFuture(Either.left($$8));
      }

      void doWork(dpa var1, apf var2, dow var3, List<dov> var4, dov var5);
   }
}
