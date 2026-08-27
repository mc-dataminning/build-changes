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

public class dlh {
   public static final int a = 8;
   private static final EnumSet<dop.a> o = EnumSet.of(dop.a.c, dop.a.a);
   public static final EnumSet<dop.a> b = EnumSet.of(dop.a.d, dop.a.b, dop.a.e, dop.a.f);
   private static final dlh.c p = ($$0, $$1, $$2, $$3, $$4, $$5) -> CompletableFuture.completedFuture(Either.left($$5));
   public static final dlh c = a("empty", null, -1, o, dlh.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
   });
   public static final dlh d = a("structure_starts", c, 0, false, o, dlh.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      if ($$2.o().aY().A().c()) {
         $$3.a($$2.I_(), $$2.l().h(), $$2.a(), $$8, $$4);
      }

      $$2.a($$8);
      return CompletableFuture.completedFuture(Either.left($$8));
   }, ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      $$1.a($$5);
      return CompletableFuture.completedFuture(Either.left($$5));
   });
   public static final dlh e = a("structure_references", d, 8, o, dlh.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      ank $$5 = new ank($$1, $$3, $$0, -1);
      $$2.a($$5, $$1.a().a($$5), $$4);
   });
   public static final dlh f = a("biomes", e, 8, o, dlh.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      ank $$9 = new ank($$2, $$7, $$0, -1);
      return $$3.a($$1, $$2.l().i(), dpr.a($$9), $$2.a().a($$9), $$8).thenApply($$0x -> Either.left($$0x));
   });
   public static final dlh g = a("noise", f, 8, o, dlh.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      ank $$9 = new ank($$2, $$7, $$0, 0);
      return $$3.a($$1, dpr.a($$9), $$2.l().i(), $$2.a().a($$9), $$8).thenApply($$0x -> {
         if ($$0x instanceof dlx $$1x) {
            dod $$2x = $$1x.x();
            if ($$2x != null) {
               dod.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return Either.left($$0x);
      });
   });
   public static final dlh h = a("surface", g, 8, o, dlh.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      ank $$5 = new ank($$1, $$3, $$0, 0);
      $$2.a($$5, $$1.a().a($$5), $$1.l().i(), $$4);
   });
   public static final dlh i = a("carvers", h, 8, b, dlh.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      ank $$5 = new ank($$1, $$3, $$0, 0);
      if ($$4 instanceof dlx $$6) {
         dpr.a($$5, $$6);
      }

      $$2.a($$5, $$1.C(), $$1.l().i(), $$1.G_(), $$1.a().a($$5), $$4, dol.a.a);
   });
   public static final dlh j = a("features", i, 8, b, dlh.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      dop.a($$4, EnumSet.of(dop.a.e, dop.a.f, dop.a.d, dop.a.b));
      ank $$5 = new ank($$1, $$3, $$0, 1);
      $$2.a($$5, $$4, $$1.a().a($$5));
      dpr.a($$5, $$4);
   });
   public static final dlh k = a(
      "initialize_light", j, 0, false, b, dlh.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> a($$5, $$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$3, $$5)
   );
   public static final dlh l = a(
      "light", k, 1, true, b, dlh.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> b($$5, $$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> b($$3, $$5)
   );
   public static final dlh m = a("spawn", l, 0, b, dlh.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      if (!$$4.y()) {
         $$2.a(new ank($$1, $$3, $$0, -1));
      }
   });
   public static final dlh n = a(
      "full", m, 0, false, b, dlh.a.b, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> $$6.apply($$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> $$4.apply($$5)
   );
   private static final List<dlh> q = ImmutableList.of(n, k, i, f, d, d, d, d, d, d, d, d, new dlh[0]);
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
   private final dlh t;
   private final dlh.b u;
   private final dlh.c v;
   private final int w;
   private final boolean x;
   private final dlh.a y;
   private final EnumSet<dop.a> z;

   private static CompletableFuture<Either<dlc, aml.a>> a(ang $$0, dlc $$1) {
      $$1.A();
      ((dlx)$$1).a($$0);
      boolean $$2 = a($$1);
      return $$0.a($$1, $$2).thenApply(Either::left);
   }

   private static CompletableFuture<Either<dlc, aml.a>> b(ang $$0, dlc $$1) {
      boolean $$2 = a($$1);
      return $$0.b($$1, $$2).thenApply(Either::left);
   }

   private static dlh a(String $$0, @Nullable dlh $$1, int $$2, EnumSet<dop.a> $$3, dlh.a $$4, dlh.d $$5) {
      return a($$0, $$1, $$2, $$3, $$4, (dlh.b)$$5);
   }

   private static dlh a(String $$0, @Nullable dlh $$1, int $$2, EnumSet<dop.a> $$3, dlh.a $$4, dlh.b $$5) {
      return a($$0, $$1, $$2, false, $$3, $$4, $$5, p);
   }

   private static dlh a(String $$0, @Nullable dlh $$1, int $$2, boolean $$3, EnumSet<dop.a> $$4, dlh.a $$5, dlh.b $$6, dlh.c $$7) {
      return it.a(kd.n, $$0, new dlh($$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public static List<dlh> a() {
      List<dlh> $$0 = Lists.newArrayList();

      dlh $$1;
      for ($$1 = n; $$1.d() != $$1; $$1 = $$1.d()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   private static boolean a(dlc $$0) {
      return $$0.j().b(l) && $$0.v();
   }

   public static dlh a(int $$0) {
      if ($$0 >= q.size()) {
         return c;
      } else {
         return $$0 < 0 ? n : q.get($$0);
      }
   }

   public static int b() {
      return q.size();
   }

   public static int a(dlh $$0) {
      return r.getInt($$0.c());
   }

   dlh(@Nullable dlh $$0, int $$1, boolean $$2, EnumSet<dop.a> $$3, dlh.a $$4, dlh.b $$5, dlh.c $$6) {
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

   public dlh d() {
      return this.t;
   }

   public CompletableFuture<Either<dlc, aml.a>> a(
      Executor $$0, and $$1, dld $$2, edg $$3, ang $$4, Function<dlc, CompletableFuture<Either<dlc, aml.a>>> $$5, List<dlc> $$6
   ) {
      dlc $$7 = $$6.get($$6.size() / 2);
      bha $$8 = bgx.e.a($$7.f(), $$1.ae(), this.toString());
      return this.u.doWork(this, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7).thenApply($$1x -> {
         $$1x.ifLeft($$0xx -> {
            if ($$0xx instanceof dlx $$1xx && !$$1xx.j().b(this)) {
               $$1xx.a(this);
            }
         });
         if ($$8 != null) {
            $$8.finish();
         }

         return $$1x;
      });
   }

   public CompletableFuture<Either<dlc, aml.a>> a(and $$0, edg $$1, ang $$2, Function<dlc, CompletableFuture<Either<dlc, aml.a>>> $$3, dlc $$4) {
      return this.v.doWork(this, $$0, $$1, $$2, $$3, $$4);
   }

   public int e() {
      return this.w;
   }

   public boolean f() {
      return this.x;
   }

   public dlh.a g() {
      return this.y;
   }

   public static dlh a(String $$0) {
      return kd.n.a(ahg.a($$0));
   }

   public EnumSet<dop.a> h() {
      return this.z;
   }

   public boolean b(dlh $$0) {
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
      CompletableFuture<Either<dlc, aml.a>> doWork(
         dlh var1, Executor var2, and var3, dld var4, edg var5, ang var6, Function<dlc, CompletableFuture<Either<dlc, aml.a>>> var7, List<dlc> var8, dlc var9
      );
   }

   interface c {
      CompletableFuture<Either<dlc, aml.a>> doWork(dlh var1, and var2, edg var3, ang var4, Function<dlc, CompletableFuture<Either<dlc, aml.a>>> var5, dlc var6);
   }

   interface d extends dlh.b {
      @Override
      default CompletableFuture<Either<dlc, aml.a>> doWork(
         dlh $$0, Executor $$1, and $$2, dld $$3, edg $$4, ang $$5, Function<dlc, CompletableFuture<Either<dlc, aml.a>>> $$6, List<dlc> $$7, dlc $$8
      ) {
         this.doWork($$0, $$2, $$3, $$7, $$8);
         return CompletableFuture.completedFuture(Either.left($$8));
      }

      void doWork(dlh var1, and var2, dld var3, List<dlc> var4, dlc var5);
   }
}
