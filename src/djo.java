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

public class djo {
   public static final int a = 8;
   private static final EnumSet<dmw.a> o = EnumSet.of(dmw.a.c, dmw.a.a);
   public static final EnumSet<dmw.a> b = EnumSet.of(dmw.a.d, dmw.a.b, dmw.a.e, dmw.a.f);
   private static final djo.c p = ($$0, $$1, $$2, $$3, $$4, $$5) -> CompletableFuture.completedFuture(Either.left($$5));
   public static final djo c = a("empty", null, -1, o, djo.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
   });
   public static final djo d = a("structure_starts", c, 0, false, o, djo.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      if ($$2.n().aY().A().c()) {
         $$3.a($$2.I_(), $$2.k().h(), $$2.a(), $$8, $$4);
      }

      $$2.a($$8);
      return CompletableFuture.completedFuture(Either.left($$8));
   }, ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      $$1.a($$5);
      return CompletableFuture.completedFuture(Either.left($$5));
   });
   public static final djo e = a("structure_references", d, 8, o, djo.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      amp $$5 = new amp($$1, $$3, $$0, -1);
      $$2.a($$5, $$1.a().a($$5), $$4);
   });
   public static final djo f = a("biomes", e, 8, o, djo.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      amp $$9 = new amp($$2, $$7, $$0, -1);
      return $$3.a($$1, $$2.k().i(), dny.a($$9), $$2.a().a($$9), $$8).thenApply($$0x -> Either.left($$0x));
   });
   public static final djo g = a("noise", f, 8, o, djo.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      amp $$9 = new amp($$2, $$7, $$0, 0);
      return $$3.a($$1, dny.a($$9), $$2.k().i(), $$2.a().a($$9), $$8).thenApply($$0x -> {
         if ($$0x instanceof dke $$1x) {
            dmk $$2x = $$1x.x();
            if ($$2x != null) {
               dmk.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return Either.left($$0x);
      });
   });
   public static final djo h = a("surface", g, 8, o, djo.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      amp $$5 = new amp($$1, $$3, $$0, 0);
      $$2.a($$5, $$1.a().a($$5), $$1.k().i(), $$4);
   });
   public static final djo i = a("carvers", h, 8, b, djo.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      amp $$5 = new amp($$1, $$3, $$0, 0);
      if ($$4 instanceof dke $$6) {
         dny.a($$5, $$6);
      }

      $$2.a($$5, $$1.B(), $$1.k().i(), $$1.G_(), $$1.a().a($$5), $$4, dms.a.a);
   });
   public static final djo j = a("features", i, 8, b, djo.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      dmw.a($$4, EnumSet.of(dmw.a.e, dmw.a.f, dmw.a.d, dmw.a.b));
      amp $$5 = new amp($$1, $$3, $$0, 1);
      $$2.a($$5, $$4, $$1.a().a($$5));
      dny.a($$5, $$4);
   });
   public static final djo k = a(
      "initialize_light", j, 0, false, b, djo.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> a($$5, $$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$3, $$5)
   );
   public static final djo l = a(
      "light", k, 1, true, b, djo.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> b($$5, $$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> b($$3, $$5)
   );
   public static final djo m = a("spawn", l, 0, b, djo.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      if (!$$4.y()) {
         $$2.a(new amp($$1, $$3, $$0, -1));
      }
   });
   public static final djo n = a(
      "full", m, 0, false, b, djo.a.b, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> $$6.apply($$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> $$4.apply($$5)
   );
   private static final List<djo> q = ImmutableList.of(n, k, i, f, d, d, d, d, d, d, d, d, new djo[0]);
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
   private final djo t;
   private final djo.b u;
   private final djo.c v;
   private final int w;
   private final boolean x;
   private final djo.a y;
   private final EnumSet<dmw.a> z;

   private static CompletableFuture<Either<djj, alq.a>> a(aml $$0, djj $$1) {
      $$1.A();
      ((dke)$$1).a($$0);
      boolean $$2 = a($$1);
      return $$0.a($$1, $$2).thenApply(Either::left);
   }

   private static CompletableFuture<Either<djj, alq.a>> b(aml $$0, djj $$1) {
      boolean $$2 = a($$1);
      return $$0.b($$1, $$2).thenApply(Either::left);
   }

   private static djo a(String $$0, @Nullable djo $$1, int $$2, EnumSet<dmw.a> $$3, djo.a $$4, djo.d $$5) {
      return a($$0, $$1, $$2, $$3, $$4, (djo.b)$$5);
   }

   private static djo a(String $$0, @Nullable djo $$1, int $$2, EnumSet<dmw.a> $$3, djo.a $$4, djo.b $$5) {
      return a($$0, $$1, $$2, false, $$3, $$4, $$5, p);
   }

   private static djo a(String $$0, @Nullable djo $$1, int $$2, boolean $$3, EnumSet<dmw.a> $$4, djo.a $$5, djo.b $$6, djo.c $$7) {
      return is.a(kc.o, $$0, new djo($$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public static List<djo> a() {
      List<djo> $$0 = Lists.newArrayList();

      djo $$1;
      for ($$1 = n; $$1.d() != $$1; $$1 = $$1.d()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   private static boolean a(djj $$0) {
      return $$0.j().b(l) && $$0.v();
   }

   public static djo a(int $$0) {
      if ($$0 >= q.size()) {
         return c;
      } else {
         return $$0 < 0 ? n : q.get($$0);
      }
   }

   public static int b() {
      return q.size();
   }

   public static int a(djo $$0) {
      return r.getInt($$0.c());
   }

   djo(@Nullable djo $$0, int $$1, boolean $$2, EnumSet<dmw.a> $$3, djo.a $$4, djo.b $$5, djo.c $$6) {
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

   public djo d() {
      return this.t;
   }

   public CompletableFuture<Either<djj, alq.a>> a(
      Executor $$0, ami $$1, djk $$2, ebn $$3, aml $$4, Function<djj, CompletableFuture<Either<djj, alq.a>>> $$5, List<djj> $$6
   ) {
      djj $$7 = $$6.get($$6.size() / 2);
      bgb $$8 = bfy.e.a($$7.f(), $$1.ad(), this.toString());
      return this.u.doWork(this, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7).thenApply($$1x -> {
         $$1x.ifLeft($$0xx -> {
            if ($$0xx instanceof dke $$1xx && !$$1xx.j().b(this)) {
               $$1xx.a(this);
            }
         });
         if ($$8 != null) {
            $$8.finish();
         }

         return $$1x;
      });
   }

   public CompletableFuture<Either<djj, alq.a>> a(ami $$0, ebn $$1, aml $$2, Function<djj, CompletableFuture<Either<djj, alq.a>>> $$3, djj $$4) {
      return this.v.doWork(this, $$0, $$1, $$2, $$3, $$4);
   }

   public int e() {
      return this.w;
   }

   public boolean f() {
      return this.x;
   }

   public djo.a g() {
      return this.y;
   }

   public static djo a(String $$0) {
      return kc.o.a(agm.a($$0));
   }

   public EnumSet<dmw.a> h() {
      return this.z;
   }

   public boolean b(djo $$0) {
      return this.c() >= $$0.c();
   }

   @Override
   public String toString() {
      return kc.o.b(this).toString();
   }

   public static enum a {
      a,
      b;
   }

   interface b {
      CompletableFuture<Either<djj, alq.a>> doWork(
         djo var1, Executor var2, ami var3, djk var4, ebn var5, aml var6, Function<djj, CompletableFuture<Either<djj, alq.a>>> var7, List<djj> var8, djj var9
      );
   }

   interface c {
      CompletableFuture<Either<djj, alq.a>> doWork(djo var1, ami var2, ebn var3, aml var4, Function<djj, CompletableFuture<Either<djj, alq.a>>> var5, djj var6);
   }

   interface d extends djo.b {
      @Override
      default CompletableFuture<Either<djj, alq.a>> doWork(
         djo $$0, Executor $$1, ami $$2, djk $$3, ebn $$4, aml $$5, Function<djj, CompletableFuture<Either<djj, alq.a>>> $$6, List<djj> $$7, djj $$8
      ) {
         this.doWork($$0, $$2, $$3, $$7, $$8);
         return CompletableFuture.completedFuture(Either.left($$8));
      }

      void doWork(djo var1, ami var2, djk var3, List<djj> var4, djj var5);
   }
}
