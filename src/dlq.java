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

public class dlq {
   public static final int a = 8;
   private static final EnumSet<doy.a> o = EnumSet.of(doy.a.c, doy.a.a);
   public static final EnumSet<doy.a> b = EnumSet.of(doy.a.d, doy.a.b, doy.a.e, doy.a.f);
   private static final dlq.c p = ($$0, $$1, $$2, $$3, $$4, $$5) -> CompletableFuture.completedFuture(Either.left($$5));
   public static final dlq c = a("empty", null, -1, o, dlq.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
   });
   public static final dlq d = a("structure_starts", c, 0, false, o, dlq.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      if ($$2.o().aY().A().c()) {
         $$3.a($$2.I_(), $$2.l().h(), $$2.a(), $$8, $$4);
      }

      $$2.a($$8);
      return CompletableFuture.completedFuture(Either.left($$8));
   }, ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      $$1.a($$5);
      return CompletableFuture.completedFuture(Either.left($$5));
   });
   public static final dlq e = a("structure_references", d, 8, o, dlq.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      anl $$5 = new anl($$1, $$3, $$0, -1);
      $$2.a($$5, $$1.a().a($$5), $$4);
   });
   public static final dlq f = a("biomes", e, 8, o, dlq.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      anl $$9 = new anl($$2, $$7, $$0, -1);
      return $$3.a($$1, $$2.l().i(), dqa.a($$9), $$2.a().a($$9), $$8).thenApply($$0x -> Either.left($$0x));
   });
   public static final dlq g = a("noise", f, 8, o, dlq.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      anl $$9 = new anl($$2, $$7, $$0, 0);
      return $$3.a($$1, dqa.a($$9), $$2.l().i(), $$2.a().a($$9), $$8).thenApply($$0x -> {
         if ($$0x instanceof dmg $$1x) {
            dom $$2x = $$1x.x();
            if ($$2x != null) {
               dom.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return Either.left($$0x);
      });
   });
   public static final dlq h = a("surface", g, 8, o, dlq.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      anl $$5 = new anl($$1, $$3, $$0, 0);
      $$2.a($$5, $$1.a().a($$5), $$1.l().i(), $$4);
   });
   public static final dlq i = a("carvers", h, 8, b, dlq.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      anl $$5 = new anl($$1, $$3, $$0, 0);
      if ($$4 instanceof dmg $$6) {
         dqa.a($$5, $$6);
      }

      $$2.a($$5, $$1.C(), $$1.l().i(), $$1.G_(), $$1.a().a($$5), $$4, dou.a.a);
   });
   public static final dlq j = a("features", i, 8, b, dlq.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      doy.a($$4, EnumSet.of(doy.a.e, doy.a.f, doy.a.d, doy.a.b));
      anl $$5 = new anl($$1, $$3, $$0, 1);
      $$2.a($$5, $$4, $$1.a().a($$5));
      dqa.a($$5, $$4);
   });
   public static final dlq k = a(
      "initialize_light", j, 0, false, b, dlq.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> a($$5, $$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$3, $$5)
   );
   public static final dlq l = a(
      "light", k, 1, true, b, dlq.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> b($$5, $$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> b($$3, $$5)
   );
   public static final dlq m = a("spawn", l, 0, b, dlq.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      if (!$$4.y()) {
         $$2.a(new anl($$1, $$3, $$0, -1));
      }
   });
   public static final dlq n = a(
      "full", m, 0, false, b, dlq.a.b, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> $$6.apply($$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> $$4.apply($$5)
   );
   private static final List<dlq> q = ImmutableList.of(n, k, i, f, d, d, d, d, d, d, d, d, new dlq[0]);
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
   private final dlq t;
   private final dlq.b u;
   private final dlq.c v;
   private final int w;
   private final boolean x;
   private final dlq.a y;
   private final EnumSet<doy.a> z;

   private static CompletableFuture<Either<dll, amm.a>> a(anh $$0, dll $$1) {
      $$1.A();
      ((dmg)$$1).a($$0);
      boolean $$2 = a($$1);
      return $$0.a($$1, $$2).thenApply(Either::left);
   }

   private static CompletableFuture<Either<dll, amm.a>> b(anh $$0, dll $$1) {
      boolean $$2 = a($$1);
      return $$0.b($$1, $$2).thenApply(Either::left);
   }

   private static dlq a(String $$0, @Nullable dlq $$1, int $$2, EnumSet<doy.a> $$3, dlq.a $$4, dlq.d $$5) {
      return a($$0, $$1, $$2, $$3, $$4, (dlq.b)$$5);
   }

   private static dlq a(String $$0, @Nullable dlq $$1, int $$2, EnumSet<doy.a> $$3, dlq.a $$4, dlq.b $$5) {
      return a($$0, $$1, $$2, false, $$3, $$4, $$5, p);
   }

   private static dlq a(String $$0, @Nullable dlq $$1, int $$2, boolean $$3, EnumSet<doy.a> $$4, dlq.a $$5, dlq.b $$6, dlq.c $$7) {
      return it.a(kd.n, $$0, new dlq($$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public static List<dlq> a() {
      List<dlq> $$0 = Lists.newArrayList();

      dlq $$1;
      for ($$1 = n; $$1.d() != $$1; $$1 = $$1.d()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   private static boolean a(dll $$0) {
      return $$0.j().b(l) && $$0.v();
   }

   public static dlq a(int $$0) {
      if ($$0 >= q.size()) {
         return c;
      } else {
         return $$0 < 0 ? n : q.get($$0);
      }
   }

   public static int b() {
      return q.size();
   }

   public static int a(dlq $$0) {
      return r.getInt($$0.c());
   }

   dlq(@Nullable dlq $$0, int $$1, boolean $$2, EnumSet<doy.a> $$3, dlq.a $$4, dlq.b $$5, dlq.c $$6) {
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

   public dlq d() {
      return this.t;
   }

   public CompletableFuture<Either<dll, amm.a>> a(
      Executor $$0, ane $$1, dlm $$2, edp $$3, anh $$4, Function<dll, CompletableFuture<Either<dll, amm.a>>> $$5, List<dll> $$6
   ) {
      dll $$7 = $$6.get($$6.size() / 2);
      bhc $$8 = bgz.e.a($$7.f(), $$1.ae(), this.toString());
      return this.u.doWork(this, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7).thenApply($$1x -> {
         $$1x.ifLeft($$0xx -> {
            if ($$0xx instanceof dmg $$1xx && !$$1xx.j().b(this)) {
               $$1xx.a(this);
            }
         });
         if ($$8 != null) {
            $$8.finish();
         }

         return $$1x;
      });
   }

   public CompletableFuture<Either<dll, amm.a>> a(ane $$0, edp $$1, anh $$2, Function<dll, CompletableFuture<Either<dll, amm.a>>> $$3, dll $$4) {
      return this.v.doWork(this, $$0, $$1, $$2, $$3, $$4);
   }

   public int e() {
      return this.w;
   }

   public boolean f() {
      return this.x;
   }

   public dlq.a g() {
      return this.y;
   }

   public static dlq a(String $$0) {
      return kd.n.a(ahh.a($$0));
   }

   public EnumSet<doy.a> h() {
      return this.z;
   }

   public boolean b(dlq $$0) {
      return this.c() >= $$0.c();
   }

   @Override
   public String toString() {
      return kd.n.b(this).toString();
   }

   public static enum a {
      a,
      b;
   }

   interface b {
      CompletableFuture<Either<dll, amm.a>> doWork(
         dlq var1, Executor var2, ane var3, dlm var4, edp var5, anh var6, Function<dll, CompletableFuture<Either<dll, amm.a>>> var7, List<dll> var8, dll var9
      );
   }

   interface c {
      CompletableFuture<Either<dll, amm.a>> doWork(dlq var1, ane var2, edp var3, anh var4, Function<dll, CompletableFuture<Either<dll, amm.a>>> var5, dll var6);
   }

   interface d extends dlq.b {
      @Override
      default CompletableFuture<Either<dll, amm.a>> doWork(
         dlq $$0, Executor $$1, ane $$2, dlm $$3, edp $$4, anh $$5, Function<dll, CompletableFuture<Either<dll, amm.a>>> $$6, List<dll> $$7, dll $$8
      ) {
         this.doWork($$0, $$2, $$3, $$7, $$8);
         return CompletableFuture.completedFuture(Either.left($$8));
      }

      void doWork(dlq var1, ane var2, dlm var3, List<dll> var4, dll var5);
   }
}
