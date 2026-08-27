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

public class dic {
   public static final int a = 8;
   private static final EnumSet<dlk.a> o = EnumSet.of(dlk.a.c, dlk.a.a);
   public static final EnumSet<dlk.a> b = EnumSet.of(dlk.a.d, dlk.a.b, dlk.a.e, dlk.a.f);
   private static final dic.c p = ($$0, $$1, $$2, $$3, $$4, $$5) -> CompletableFuture.completedFuture(Either.left($$5));
   public static final dic c = a("empty", null, -1, o, dic.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
   });
   public static final dic d = a("structure_starts", c, 0, false, o, dic.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      if ($$2.n().aT().A().c()) {
         $$3.a($$2.H_(), $$2.k().h(), $$2.a(), $$8, $$4);
      }

      $$2.a($$8);
      return CompletableFuture.completedFuture(Either.left($$8));
   }, ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      $$1.a($$5);
      return CompletableFuture.completedFuture(Either.left($$5));
   });
   public static final dic e = a("structure_references", d, 8, o, dic.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      alx $$5 = new alx($$1, $$3, $$0, -1);
      $$2.a($$5, $$1.a().a($$5), $$4);
   });
   public static final dic f = a("biomes", e, 8, o, dic.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      alx $$9 = new alx($$2, $$7, $$0, -1);
      return $$3.a($$1, $$2.k().i(), dmm.a($$9), $$2.a().a($$9), $$8).thenApply($$0x -> Either.left($$0x));
   });
   public static final dic g = a("noise", f, 8, o, dic.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      alx $$9 = new alx($$2, $$7, $$0, 0);
      return $$3.a($$1, dmm.a($$9), $$2.k().i(), $$2.a().a($$9), $$8).thenApply($$0x -> {
         if ($$0x instanceof dis $$1x) {
            dky $$2x = $$1x.x();
            if ($$2x != null) {
               dky.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return Either.left($$0x);
      });
   });
   public static final dic h = a("surface", g, 8, o, dic.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      alx $$5 = new alx($$1, $$3, $$0, 0);
      $$2.a($$5, $$1.a().a($$5), $$1.k().i(), $$4);
   });
   public static final dic i = a("carvers", h, 8, b, dic.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      alx $$5 = new alx($$1, $$3, $$0, 0);
      if ($$4 instanceof dis $$6) {
         dmm.a($$5, $$6);
      }

      $$2.a($$5, $$1.A(), $$1.k().i(), $$1.F_(), $$1.a().a($$5), $$4, dlg.a.a);
   });
   public static final dic j = a("features", i, 8, b, dic.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      dlk.a($$4, EnumSet.of(dlk.a.e, dlk.a.f, dlk.a.d, dlk.a.b));
      alx $$5 = new alx($$1, $$3, $$0, 1);
      $$2.a($$5, $$4, $$1.a().a($$5));
      dmm.a($$5, $$4);
   });
   public static final dic k = a(
      "initialize_light", j, 0, false, b, dic.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> a($$5, $$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$3, $$5)
   );
   public static final dic l = a(
      "light", k, 1, true, b, dic.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> b($$5, $$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> b($$3, $$5)
   );
   public static final dic m = a("spawn", l, 0, b, dic.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      if (!$$4.y()) {
         $$2.a(new alx($$1, $$3, $$0, -1));
      }
   });
   public static final dic n = a(
      "full", m, 0, false, b, dic.a.b, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> $$6.apply($$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> $$4.apply($$5)
   );
   private static final List<dic> q = ImmutableList.of(n, k, i, f, d, d, d, d, d, d, d, d, new dic[0]);
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
   private final dic t;
   private final dic.b u;
   private final dic.c v;
   private final int w;
   private final boolean x;
   private final dic.a y;
   private final EnumSet<dlk.a> z;

   private static CompletableFuture<Either<dhx, aky.a>> a(alt $$0, dhx $$1) {
      $$1.A();
      ((dis)$$1).a($$0);
      boolean $$2 = a($$1);
      return $$0.a($$1, $$2).thenApply(Either::left);
   }

   private static CompletableFuture<Either<dhx, aky.a>> b(alt $$0, dhx $$1) {
      boolean $$2 = a($$1);
      return $$0.b($$1, $$2).thenApply(Either::left);
   }

   private static dic a(String $$0, @Nullable dic $$1, int $$2, EnumSet<dlk.a> $$3, dic.a $$4, dic.d $$5) {
      return a($$0, $$1, $$2, $$3, $$4, (dic.b)$$5);
   }

   private static dic a(String $$0, @Nullable dic $$1, int $$2, EnumSet<dlk.a> $$3, dic.a $$4, dic.b $$5) {
      return a($$0, $$1, $$2, false, $$3, $$4, $$5, p);
   }

   private static dic a(String $$0, @Nullable dic $$1, int $$2, boolean $$3, EnumSet<dlk.a> $$4, dic.a $$5, dic.b $$6, dic.c $$7) {
      return io.a(jy.o, $$0, new dic($$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public static List<dic> a() {
      List<dic> $$0 = Lists.newArrayList();

      dic $$1;
      for ($$1 = n; $$1.d() != $$1; $$1 = $$1.d()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   private static boolean a(dhx $$0) {
      return $$0.j().b(l) && $$0.v();
   }

   public static dic a(int $$0) {
      if ($$0 >= q.size()) {
         return c;
      } else {
         return $$0 < 0 ? n : q.get($$0);
      }
   }

   public static int b() {
      return q.size();
   }

   public static int a(dic $$0) {
      return r.getInt($$0.c());
   }

   dic(@Nullable dic $$0, int $$1, boolean $$2, EnumSet<dlk.a> $$3, dic.a $$4, dic.b $$5, dic.c $$6) {
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

   public dic d() {
      return this.t;
   }

   public CompletableFuture<Either<dhx, aky.a>> a(
      Executor $$0, alq $$1, dhy $$2, dzu $$3, alt $$4, Function<dhx, CompletableFuture<Either<dhx, aky.a>>> $$5, List<dhx> $$6
   ) {
      dhx $$7 = $$6.get($$6.size() / 2);
      bfb $$8 = bey.e.a($$7.f(), $$1.ac(), this.toString());
      return this.u.doWork(this, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7).thenApply($$1x -> {
         $$1x.ifLeft($$0xx -> {
            if ($$0xx instanceof dis $$1xx && !$$1xx.j().b(this)) {
               $$1xx.a(this);
            }
         });
         if ($$8 != null) {
            $$8.finish();
         }

         return $$1x;
      });
   }

   public CompletableFuture<Either<dhx, aky.a>> a(alq $$0, dzu $$1, alt $$2, Function<dhx, CompletableFuture<Either<dhx, aky.a>>> $$3, dhx $$4) {
      return this.v.doWork(this, $$0, $$1, $$2, $$3, $$4);
   }

   public int e() {
      return this.w;
   }

   public boolean f() {
      return this.x;
   }

   public dic.a g() {
      return this.y;
   }

   public static dic a(String $$0) {
      return jy.o.a(afw.a($$0));
   }

   public EnumSet<dlk.a> h() {
      return this.z;
   }

   public boolean b(dic $$0) {
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
      CompletableFuture<Either<dhx, aky.a>> doWork(
         dic var1, Executor var2, alq var3, dhy var4, dzu var5, alt var6, Function<dhx, CompletableFuture<Either<dhx, aky.a>>> var7, List<dhx> var8, dhx var9
      );
   }

   interface c {
      CompletableFuture<Either<dhx, aky.a>> doWork(dic var1, alq var2, dzu var3, alt var4, Function<dhx, CompletableFuture<Either<dhx, aky.a>>> var5, dhx var6);
   }

   interface d extends dic.b {
      @Override
      default CompletableFuture<Either<dhx, aky.a>> doWork(
         dic $$0, Executor $$1, alq $$2, dhy $$3, dzu $$4, alt $$5, Function<dhx, CompletableFuture<Either<dhx, aky.a>>> $$6, List<dhx> $$7, dhx $$8
      ) {
         this.doWork($$0, $$2, $$3, $$7, $$8);
         return CompletableFuture.completedFuture(Either.left($$8));
      }

      void doWork(dic var1, alq var2, dhy var3, List<dhx> var4, dhx var5);
   }
}
