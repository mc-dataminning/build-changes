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

public class dli {
   public static final int a = 8;
   private static final EnumSet<doq.a> o = EnumSet.of(doq.a.c, doq.a.a);
   public static final EnumSet<doq.a> b = EnumSet.of(doq.a.d, doq.a.b, doq.a.e, doq.a.f);
   private static final dli.c p = ($$0, $$1, $$2, $$3, $$4, $$5) -> CompletableFuture.completedFuture(Either.left($$5));
   public static final dli c = a("empty", null, -1, o, dli.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
   });
   public static final dli d = a("structure_starts", c, 0, false, o, dli.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      if ($$2.o().aY().A().c()) {
         $$3.a($$2.I_(), $$2.l().h(), $$2.a(), $$8, $$4);
      }

      $$2.a($$8);
      return CompletableFuture.completedFuture(Either.left($$8));
   }, ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      $$1.a($$5);
      return CompletableFuture.completedFuture(Either.left($$5));
   });
   public static final dli e = a("structure_references", d, 8, o, dli.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      ank $$5 = new ank($$1, $$3, $$0, -1);
      $$2.a($$5, $$1.a().a($$5), $$4);
   });
   public static final dli f = a("biomes", e, 8, o, dli.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      ank $$9 = new ank($$2, $$7, $$0, -1);
      return $$3.a($$1, $$2.l().i(), dps.a($$9), $$2.a().a($$9), $$8).thenApply($$0x -> Either.left($$0x));
   });
   public static final dli g = a("noise", f, 8, o, dli.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      ank $$9 = new ank($$2, $$7, $$0, 0);
      return $$3.a($$1, dps.a($$9), $$2.l().i(), $$2.a().a($$9), $$8).thenApply($$0x -> {
         if ($$0x instanceof dly $$1x) {
            doe $$2x = $$1x.x();
            if ($$2x != null) {
               doe.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return Either.left($$0x);
      });
   });
   public static final dli h = a("surface", g, 8, o, dli.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      ank $$5 = new ank($$1, $$3, $$0, 0);
      $$2.a($$5, $$1.a().a($$5), $$1.l().i(), $$4);
   });
   public static final dli i = a("carvers", h, 8, b, dli.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      ank $$5 = new ank($$1, $$3, $$0, 0);
      if ($$4 instanceof dly $$6) {
         dps.a($$5, $$6);
      }

      $$2.a($$5, $$1.C(), $$1.l().i(), $$1.G_(), $$1.a().a($$5), $$4, dom.a.a);
   });
   public static final dli j = a("features", i, 8, b, dli.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      doq.a($$4, EnumSet.of(doq.a.e, doq.a.f, doq.a.d, doq.a.b));
      ank $$5 = new ank($$1, $$3, $$0, 1);
      $$2.a($$5, $$4, $$1.a().a($$5));
      dps.a($$5, $$4);
   });
   public static final dli k = a(
      "initialize_light", j, 0, false, b, dli.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> a($$5, $$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$3, $$5)
   );
   public static final dli l = a(
      "light", k, 1, true, b, dli.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> b($$5, $$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> b($$3, $$5)
   );
   public static final dli m = a("spawn", l, 0, b, dli.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      if (!$$4.y()) {
         $$2.a(new ank($$1, $$3, $$0, -1));
      }
   });
   public static final dli n = a(
      "full", m, 0, false, b, dli.a.b, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> $$6.apply($$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> $$4.apply($$5)
   );
   private static final List<dli> q = ImmutableList.of(n, k, i, f, d, d, d, d, d, d, d, d, new dli[0]);
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
   private final dli t;
   private final dli.b u;
   private final dli.c v;
   private final int w;
   private final boolean x;
   private final dli.a y;
   private final EnumSet<doq.a> z;

   private static CompletableFuture<Either<dld, aml.a>> a(ang $$0, dld $$1) {
      $$1.A();
      ((dly)$$1).a($$0);
      boolean $$2 = a($$1);
      return $$0.a($$1, $$2).thenApply(Either::left);
   }

   private static CompletableFuture<Either<dld, aml.a>> b(ang $$0, dld $$1) {
      boolean $$2 = a($$1);
      return $$0.b($$1, $$2).thenApply(Either::left);
   }

   private static dli a(String $$0, @Nullable dli $$1, int $$2, EnumSet<doq.a> $$3, dli.a $$4, dli.d $$5) {
      return a($$0, $$1, $$2, $$3, $$4, (dli.b)$$5);
   }

   private static dli a(String $$0, @Nullable dli $$1, int $$2, EnumSet<doq.a> $$3, dli.a $$4, dli.b $$5) {
      return a($$0, $$1, $$2, false, $$3, $$4, $$5, p);
   }

   private static dli a(String $$0, @Nullable dli $$1, int $$2, boolean $$3, EnumSet<doq.a> $$4, dli.a $$5, dli.b $$6, dli.c $$7) {
      return it.a(kd.n, $$0, new dli($$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public static List<dli> a() {
      List<dli> $$0 = Lists.newArrayList();

      dli $$1;
      for ($$1 = n; $$1.d() != $$1; $$1 = $$1.d()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   private static boolean a(dld $$0) {
      return $$0.j().b(l) && $$0.v();
   }

   public static dli a(int $$0) {
      if ($$0 >= q.size()) {
         return c;
      } else {
         return $$0 < 0 ? n : q.get($$0);
      }
   }

   public static int b() {
      return q.size();
   }

   public static int a(dli $$0) {
      return r.getInt($$0.c());
   }

   dli(@Nullable dli $$0, int $$1, boolean $$2, EnumSet<doq.a> $$3, dli.a $$4, dli.b $$5, dli.c $$6) {
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

   public dli d() {
      return this.t;
   }

   public CompletableFuture<Either<dld, aml.a>> a(
      Executor $$0, and $$1, dle $$2, edh $$3, ang $$4, Function<dld, CompletableFuture<Either<dld, aml.a>>> $$5, List<dld> $$6
   ) {
      dld $$7 = $$6.get($$6.size() / 2);
      bhb $$8 = bgy.e.a($$7.f(), $$1.ae(), this.toString());
      return this.u.doWork(this, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7).thenApply($$1x -> {
         $$1x.ifLeft($$0xx -> {
            if ($$0xx instanceof dly $$1xx && !$$1xx.j().b(this)) {
               $$1xx.a(this);
            }
         });
         if ($$8 != null) {
            $$8.finish();
         }

         return $$1x;
      });
   }

   public CompletableFuture<Either<dld, aml.a>> a(and $$0, edh $$1, ang $$2, Function<dld, CompletableFuture<Either<dld, aml.a>>> $$3, dld $$4) {
      return this.v.doWork(this, $$0, $$1, $$2, $$3, $$4);
   }

   public int e() {
      return this.w;
   }

   public boolean f() {
      return this.x;
   }

   public dli.a g() {
      return this.y;
   }

   public static dli a(String $$0) {
      return kd.n.a(ahg.a($$0));
   }

   public EnumSet<doq.a> h() {
      return this.z;
   }

   public boolean b(dli $$0) {
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
      CompletableFuture<Either<dld, aml.a>> doWork(
         dli var1, Executor var2, and var3, dle var4, edh var5, ang var6, Function<dld, CompletableFuture<Either<dld, aml.a>>> var7, List<dld> var8, dld var9
      );
   }

   interface c {
      CompletableFuture<Either<dld, aml.a>> doWork(dli var1, and var2, edh var3, ang var4, Function<dld, CompletableFuture<Either<dld, aml.a>>> var5, dld var6);
   }

   interface d extends dli.b {
      @Override
      default CompletableFuture<Either<dld, aml.a>> doWork(
         dli $$0, Executor $$1, and $$2, dle $$3, edh $$4, ang $$5, Function<dld, CompletableFuture<Either<dld, aml.a>>> $$6, List<dld> $$7, dld $$8
      ) {
         this.doWork($$0, $$2, $$3, $$7, $$8);
         return CompletableFuture.completedFuture(Either.left($$8));
      }

      void doWork(dli var1, and var2, dle var3, List<dld> var4, dld var5);
   }
}
