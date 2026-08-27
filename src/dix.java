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

public class dix {
   public static final int a = 8;
   private static final EnumSet<dmf.a> o = EnumSet.of(dmf.a.c, dmf.a.a);
   public static final EnumSet<dmf.a> b = EnumSet.of(dmf.a.d, dmf.a.b, dmf.a.e, dmf.a.f);
   private static final dix.c p = ($$0, $$1, $$2, $$3, $$4, $$5) -> CompletableFuture.completedFuture(Either.left($$5));
   public static final dix c = a("empty", null, -1, o, dix.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
   });
   public static final dix d = a("structure_starts", c, 0, false, o, dix.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      if ($$2.n().aT().A().c()) {
         $$3.a($$2.H_(), $$2.k().h(), $$2.a(), $$8, $$4);
      }

      $$2.a($$8);
      return CompletableFuture.completedFuture(Either.left($$8));
   }, ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      $$1.a($$5);
      return CompletableFuture.completedFuture(Either.left($$5));
   });
   public static final dix e = a("structure_references", d, 8, o, dix.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      amh $$5 = new amh($$1, $$3, $$0, -1);
      $$2.a($$5, $$1.a().a($$5), $$4);
   });
   public static final dix f = a("biomes", e, 8, o, dix.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      amh $$9 = new amh($$2, $$7, $$0, -1);
      return $$3.a($$1, $$2.k().i(), dnh.a($$9), $$2.a().a($$9), $$8).thenApply($$0x -> Either.left($$0x));
   });
   public static final dix g = a("noise", f, 8, o, dix.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      amh $$9 = new amh($$2, $$7, $$0, 0);
      return $$3.a($$1, dnh.a($$9), $$2.k().i(), $$2.a().a($$9), $$8).thenApply($$0x -> {
         if ($$0x instanceof djn $$1x) {
            dlt $$2x = $$1x.x();
            if ($$2x != null) {
               dlt.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return Either.left($$0x);
      });
   });
   public static final dix h = a("surface", g, 8, o, dix.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      amh $$5 = new amh($$1, $$3, $$0, 0);
      $$2.a($$5, $$1.a().a($$5), $$1.k().i(), $$4);
   });
   public static final dix i = a("carvers", h, 8, b, dix.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      amh $$5 = new amh($$1, $$3, $$0, 0);
      if ($$4 instanceof djn $$6) {
         dnh.a($$5, $$6);
      }

      $$2.a($$5, $$1.A(), $$1.k().i(), $$1.F_(), $$1.a().a($$5), $$4, dmb.a.a);
   });
   public static final dix j = a("features", i, 8, b, dix.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      dmf.a($$4, EnumSet.of(dmf.a.e, dmf.a.f, dmf.a.d, dmf.a.b));
      amh $$5 = new amh($$1, $$3, $$0, 1);
      $$2.a($$5, $$4, $$1.a().a($$5));
      dnh.a($$5, $$4);
   });
   public static final dix k = a(
      "initialize_light", j, 0, false, b, dix.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> a($$5, $$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$3, $$5)
   );
   public static final dix l = a(
      "light", k, 1, true, b, dix.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> b($$5, $$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> b($$3, $$5)
   );
   public static final dix m = a("spawn", l, 0, b, dix.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      if (!$$4.y()) {
         $$2.a(new amh($$1, $$3, $$0, -1));
      }
   });
   public static final dix n = a(
      "full", m, 0, false, b, dix.a.b, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> $$6.apply($$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> $$4.apply($$5)
   );
   private static final List<dix> q = ImmutableList.of(n, k, i, f, d, d, d, d, d, d, d, d, new dix[0]);
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
   private final dix t;
   private final dix.b u;
   private final dix.c v;
   private final int w;
   private final boolean x;
   private final dix.a y;
   private final EnumSet<dmf.a> z;

   private static CompletableFuture<Either<dis, ali.a>> a(amd $$0, dis $$1) {
      $$1.A();
      ((djn)$$1).a($$0);
      boolean $$2 = a($$1);
      return $$0.a($$1, $$2).thenApply(Either::left);
   }

   private static CompletableFuture<Either<dis, ali.a>> b(amd $$0, dis $$1) {
      boolean $$2 = a($$1);
      return $$0.b($$1, $$2).thenApply(Either::left);
   }

   private static dix a(String $$0, @Nullable dix $$1, int $$2, EnumSet<dmf.a> $$3, dix.a $$4, dix.d $$5) {
      return a($$0, $$1, $$2, $$3, $$4, (dix.b)$$5);
   }

   private static dix a(String $$0, @Nullable dix $$1, int $$2, EnumSet<dmf.a> $$3, dix.a $$4, dix.b $$5) {
      return a($$0, $$1, $$2, false, $$3, $$4, $$5, p);
   }

   private static dix a(String $$0, @Nullable dix $$1, int $$2, boolean $$3, EnumSet<dmf.a> $$4, dix.a $$5, dix.b $$6, dix.c $$7) {
      return io.a(jy.o, $$0, new dix($$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public static List<dix> a() {
      List<dix> $$0 = Lists.newArrayList();

      dix $$1;
      for ($$1 = n; $$1.d() != $$1; $$1 = $$1.d()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   private static boolean a(dis $$0) {
      return $$0.j().b(l) && $$0.v();
   }

   public static dix a(int $$0) {
      if ($$0 >= q.size()) {
         return c;
      } else {
         return $$0 < 0 ? n : q.get($$0);
      }
   }

   public static int b() {
      return q.size();
   }

   public static int a(dix $$0) {
      return r.getInt($$0.c());
   }

   dix(@Nullable dix $$0, int $$1, boolean $$2, EnumSet<dmf.a> $$3, dix.a $$4, dix.b $$5, dix.c $$6) {
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

   public dix d() {
      return this.t;
   }

   public CompletableFuture<Either<dis, ali.a>> a(
      Executor $$0, ama $$1, dit $$2, eaw $$3, amd $$4, Function<dis, CompletableFuture<Either<dis, ali.a>>> $$5, List<dis> $$6
   ) {
      dis $$7 = $$6.get($$6.size() / 2);
      bfq $$8 = bfn.e.a($$7.f(), $$1.ac(), this.toString());
      return this.u.doWork(this, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7).thenApply($$1x -> {
         $$1x.ifLeft($$0xx -> {
            if ($$0xx instanceof djn $$1xx && !$$1xx.j().b(this)) {
               $$1xx.a(this);
            }
         });
         if ($$8 != null) {
            $$8.finish();
         }

         return $$1x;
      });
   }

   public CompletableFuture<Either<dis, ali.a>> a(ama $$0, eaw $$1, amd $$2, Function<dis, CompletableFuture<Either<dis, ali.a>>> $$3, dis $$4) {
      return this.v.doWork(this, $$0, $$1, $$2, $$3, $$4);
   }

   public int e() {
      return this.w;
   }

   public boolean f() {
      return this.x;
   }

   public dix.a g() {
      return this.y;
   }

   public static dix a(String $$0) {
      return jy.o.a(agg.a($$0));
   }

   public EnumSet<dmf.a> h() {
      return this.z;
   }

   public boolean b(dix $$0) {
      return this.c() >= $$0.c();
   }

   @Override
   public String toString() {
      return jy.o.b(this).toString();
   }

   public static enum a {
      a,
      b;
   }

   interface b {
      CompletableFuture<Either<dis, ali.a>> doWork(
         dix var1, Executor var2, ama var3, dit var4, eaw var5, amd var6, Function<dis, CompletableFuture<Either<dis, ali.a>>> var7, List<dis> var8, dis var9
      );
   }

   interface c {
      CompletableFuture<Either<dis, ali.a>> doWork(dix var1, ama var2, eaw var3, amd var4, Function<dis, CompletableFuture<Either<dis, ali.a>>> var5, dis var6);
   }

   interface d extends dix.b {
      @Override
      default CompletableFuture<Either<dis, ali.a>> doWork(
         dix $$0, Executor $$1, ama $$2, dit $$3, eaw $$4, amd $$5, Function<dis, CompletableFuture<Either<dis, ali.a>>> $$6, List<dis> $$7, dis $$8
      ) {
         this.doWork($$0, $$2, $$3, $$7, $$8);
         return CompletableFuture.completedFuture(Either.left($$8));
      }

      void doWork(dix var1, ama var2, dit var3, List<dis> var4, dis var5);
   }
}
