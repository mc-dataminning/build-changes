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

public class dhf {
   public static final int a = 8;
   private static final EnumSet<dkn.a> o = EnumSet.of(dkn.a.c, dkn.a.a);
   public static final EnumSet<dkn.a> b = EnumSet.of(dkn.a.d, dkn.a.b, dkn.a.e, dkn.a.f);
   private static final dhf.c p = ($$0, $$1, $$2, $$3, $$4, $$5) -> CompletableFuture.completedFuture(Either.left($$5));
   public static final dhf c = a("empty", null, -1, o, dhf.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
   });
   public static final dhf d = a("structure_starts", c, 0, false, o, dhf.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      if ($$2.n().aT().A().c()) {
         $$3.a($$2.B_(), $$2.k().h(), $$2.a(), $$8, $$4);
      }

      $$2.a($$8);
      return CompletableFuture.completedFuture(Either.left($$8));
   }, ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      $$1.a($$5);
      return CompletableFuture.completedFuture(Either.left($$5));
   });
   public static final dhf e = a("structure_references", d, 8, o, dhf.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      aku $$5 = new aku($$1, $$3, $$0, -1);
      $$2.a($$5, $$1.a().a($$5), $$4);
   });
   public static final dhf f = a("biomes", e, 8, o, dhf.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      aku $$9 = new aku($$2, $$7, $$0, -1);
      return $$3.a($$1, $$2.k().i(), dlp.a($$9), $$2.a().a($$9), $$8).thenApply($$0x -> Either.left($$0x));
   });
   public static final dhf g = a("noise", f, 8, o, dhf.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      aku $$9 = new aku($$2, $$7, $$0, 0);
      return $$3.a($$1, dlp.a($$9), $$2.k().i(), $$2.a().a($$9), $$8).thenApply($$0x -> {
         if ($$0x instanceof dhv $$1x) {
            dkb $$2x = $$1x.x();
            if ($$2x != null) {
               dkb.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return Either.left($$0x);
      });
   });
   public static final dhf h = a("surface", g, 8, o, dhf.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      aku $$5 = new aku($$1, $$3, $$0, 0);
      $$2.a($$5, $$1.a().a($$5), $$1.k().i(), $$4);
   });
   public static final dhf i = a("carvers", h, 8, b, dhf.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      aku $$5 = new aku($$1, $$3, $$0, 0);
      if ($$4 instanceof dhv $$6) {
         dlp.a($$5, $$6);
      }

      $$2.a($$5, $$1.A(), $$1.k().i(), $$1.z_(), $$1.a().a($$5), $$4, dkj.a.a);
   });
   public static final dhf j = a("features", i, 8, b, dhf.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      dkn.a($$4, EnumSet.of(dkn.a.e, dkn.a.f, dkn.a.d, dkn.a.b));
      aku $$5 = new aku($$1, $$3, $$0, 1);
      $$2.a($$5, $$4, $$1.a().a($$5));
      dlp.a($$5, $$4);
   });
   public static final dhf k = a(
      "initialize_light", j, 0, false, b, dhf.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> a($$5, $$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$3, $$5)
   );
   public static final dhf l = a(
      "light", k, 1, true, b, dhf.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> b($$5, $$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> b($$3, $$5)
   );
   public static final dhf m = a("spawn", l, 0, b, dhf.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      if (!$$4.y()) {
         $$2.a(new aku($$1, $$3, $$0, -1));
      }
   });
   public static final dhf n = a(
      "full", m, 0, false, b, dhf.a.b, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> $$6.apply($$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> $$4.apply($$5)
   );
   private static final List<dhf> q = ImmutableList.of(n, k, i, f, d, d, d, d, d, d, d, d, new dhf[0]);
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
   private final dhf t;
   private final dhf.b u;
   private final dhf.c v;
   private final int w;
   private final boolean x;
   private final dhf.a y;
   private final EnumSet<dkn.a> z;

   private static CompletableFuture<Either<dha, ajw.a>> a(akq $$0, dha $$1) {
      $$1.A();
      ((dhv)$$1).a($$0);
      boolean $$2 = a($$1);
      return $$0.a($$1, $$2).thenApply(Either::left);
   }

   private static CompletableFuture<Either<dha, ajw.a>> b(akq $$0, dha $$1) {
      boolean $$2 = a($$1);
      return $$0.b($$1, $$2).thenApply(Either::left);
   }

   private static dhf a(String $$0, @Nullable dhf $$1, int $$2, EnumSet<dkn.a> $$3, dhf.a $$4, dhf.d $$5) {
      return a($$0, $$1, $$2, $$3, $$4, (dhf.b)$$5);
   }

   private static dhf a(String $$0, @Nullable dhf $$1, int $$2, EnumSet<dkn.a> $$3, dhf.a $$4, dhf.b $$5) {
      return a($$0, $$1, $$2, false, $$3, $$4, $$5, p);
   }

   private static dhf a(String $$0, @Nullable dhf $$1, int $$2, boolean $$3, EnumSet<dkn.a> $$4, dhf.a $$5, dhf.b $$6, dhf.c $$7) {
      return ht.a(jd.o, $$0, new dhf($$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public static List<dhf> a() {
      List<dhf> $$0 = Lists.newArrayList();

      dhf $$1;
      for ($$1 = n; $$1.d() != $$1; $$1 = $$1.d()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   private static boolean a(dha $$0) {
      return $$0.j().b(l) && $$0.v();
   }

   public static dhf a(int $$0) {
      if ($$0 >= q.size()) {
         return c;
      } else {
         return $$0 < 0 ? n : q.get($$0);
      }
   }

   public static int b() {
      return q.size();
   }

   public static int a(dhf $$0) {
      return r.getInt($$0.c());
   }

   dhf(@Nullable dhf $$0, int $$1, boolean $$2, EnumSet<dkn.a> $$3, dhf.a $$4, dhf.b $$5, dhf.c $$6) {
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

   public dhf d() {
      return this.t;
   }

   public CompletableFuture<Either<dha, ajw.a>> a(
      Executor $$0, akn $$1, dhb $$2, dyx $$3, akq $$4, Function<dha, CompletableFuture<Either<dha, ajw.a>>> $$5, List<dha> $$6
   ) {
      dha $$7 = $$6.get($$6.size() / 2);
      bdt $$8 = bdq.e.a($$7.f(), $$1.ac(), this.toString());
      return this.u.doWork(this, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7).thenApply($$1x -> {
         $$1x.ifLeft($$0xx -> {
            if ($$0xx instanceof dhv $$1xx && !$$1xx.j().b(this)) {
               $$1xx.a(this);
            }
         });
         if ($$8 != null) {
            $$8.finish();
         }

         return $$1x;
      });
   }

   public CompletableFuture<Either<dha, ajw.a>> a(akn $$0, dyx $$1, akq $$2, Function<dha, CompletableFuture<Either<dha, ajw.a>>> $$3, dha $$4) {
      return this.v.doWork(this, $$0, $$1, $$2, $$3, $$4);
   }

   public int e() {
      return this.w;
   }

   public boolean f() {
      return this.x;
   }

   public dhf.a g() {
      return this.y;
   }

   public static dhf a(String $$0) {
      return jd.o.a(aeu.a($$0));
   }

   public EnumSet<dkn.a> h() {
      return this.z;
   }

   public boolean b(dhf $$0) {
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
      CompletableFuture<Either<dha, ajw.a>> doWork(
         dhf var1, Executor var2, akn var3, dhb var4, dyx var5, akq var6, Function<dha, CompletableFuture<Either<dha, ajw.a>>> var7, List<dha> var8, dha var9
      );
   }

   interface c {
      CompletableFuture<Either<dha, ajw.a>> doWork(dhf var1, akn var2, dyx var3, akq var4, Function<dha, CompletableFuture<Either<dha, ajw.a>>> var5, dha var6);
   }

   interface d extends dhf.b {
      @Override
      default CompletableFuture<Either<dha, ajw.a>> doWork(
         dhf $$0, Executor $$1, akn $$2, dhb $$3, dyx $$4, akq $$5, Function<dha, CompletableFuture<Either<dha, ajw.a>>> $$6, List<dha> $$7, dha $$8
      ) {
         this.doWork($$0, $$2, $$3, $$7, $$8);
         return CompletableFuture.completedFuture(Either.left($$8));
      }

      void doWork(dhf var1, akn var2, dhb var3, List<dha> var4, dha var5);
   }
}
