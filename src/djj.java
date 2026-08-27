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

public class djj {
   public static final int a = 8;
   private static final EnumSet<dmr.a> o = EnumSet.of(dmr.a.c, dmr.a.a);
   public static final EnumSet<dmr.a> b = EnumSet.of(dmr.a.d, dmr.a.b, dmr.a.e, dmr.a.f);
   private static final djj.c p = ($$0, $$1, $$2, $$3, $$4, $$5) -> CompletableFuture.completedFuture(Either.left($$5));
   public static final djj c = a("empty", null, -1, o, djj.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
   });
   public static final djj d = a("structure_starts", c, 0, false, o, djj.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      if ($$2.n().aY().A().c()) {
         $$3.a($$2.H_(), $$2.k().h(), $$2.a(), $$8, $$4);
      }

      $$2.a($$8);
      return CompletableFuture.completedFuture(Either.left($$8));
   }, ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      $$1.a($$5);
      return CompletableFuture.completedFuture(Either.left($$5));
   });
   public static final djj e = a("structure_references", d, 8, o, djj.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      aml $$5 = new aml($$1, $$3, $$0, -1);
      $$2.a($$5, $$1.a().a($$5), $$4);
   });
   public static final djj f = a("biomes", e, 8, o, djj.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      aml $$9 = new aml($$2, $$7, $$0, -1);
      return $$3.a($$1, $$2.k().i(), dnt.a($$9), $$2.a().a($$9), $$8).thenApply($$0x -> Either.left($$0x));
   });
   public static final djj g = a("noise", f, 8, o, djj.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      aml $$9 = new aml($$2, $$7, $$0, 0);
      return $$3.a($$1, dnt.a($$9), $$2.k().i(), $$2.a().a($$9), $$8).thenApply($$0x -> {
         if ($$0x instanceof djz $$1x) {
            dmf $$2x = $$1x.x();
            if ($$2x != null) {
               dmf.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return Either.left($$0x);
      });
   });
   public static final djj h = a("surface", g, 8, o, djj.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      aml $$5 = new aml($$1, $$3, $$0, 0);
      $$2.a($$5, $$1.a().a($$5), $$1.k().i(), $$4);
   });
   public static final djj i = a("carvers", h, 8, b, djj.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      aml $$5 = new aml($$1, $$3, $$0, 0);
      if ($$4 instanceof djz $$6) {
         dnt.a($$5, $$6);
      }

      $$2.a($$5, $$1.B(), $$1.k().i(), $$1.F_(), $$1.a().a($$5), $$4, dmn.a.a);
   });
   public static final djj j = a("features", i, 8, b, djj.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      dmr.a($$4, EnumSet.of(dmr.a.e, dmr.a.f, dmr.a.d, dmr.a.b));
      aml $$5 = new aml($$1, $$3, $$0, 1);
      $$2.a($$5, $$4, $$1.a().a($$5));
      dnt.a($$5, $$4);
   });
   public static final djj k = a(
      "initialize_light", j, 0, false, b, djj.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> a($$5, $$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$3, $$5)
   );
   public static final djj l = a(
      "light", k, 1, true, b, djj.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> b($$5, $$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> b($$3, $$5)
   );
   public static final djj m = a("spawn", l, 0, b, djj.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      if (!$$4.y()) {
         $$2.a(new aml($$1, $$3, $$0, -1));
      }
   });
   public static final djj n = a(
      "full", m, 0, false, b, djj.a.b, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> $$6.apply($$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> $$4.apply($$5)
   );
   private static final List<djj> q = ImmutableList.of(n, k, i, f, d, d, d, d, d, d, d, d, new djj[0]);
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
   private final djj t;
   private final djj.b u;
   private final djj.c v;
   private final int w;
   private final boolean x;
   private final djj.a y;
   private final EnumSet<dmr.a> z;

   private static CompletableFuture<Either<dje, alm.a>> a(amh $$0, dje $$1) {
      $$1.A();
      ((djz)$$1).a($$0);
      boolean $$2 = a($$1);
      return $$0.a($$1, $$2).thenApply(Either::left);
   }

   private static CompletableFuture<Either<dje, alm.a>> b(amh $$0, dje $$1) {
      boolean $$2 = a($$1);
      return $$0.b($$1, $$2).thenApply(Either::left);
   }

   private static djj a(String $$0, @Nullable djj $$1, int $$2, EnumSet<dmr.a> $$3, djj.a $$4, djj.d $$5) {
      return a($$0, $$1, $$2, $$3, $$4, (djj.b)$$5);
   }

   private static djj a(String $$0, @Nullable djj $$1, int $$2, EnumSet<dmr.a> $$3, djj.a $$4, djj.b $$5) {
      return a($$0, $$1, $$2, false, $$3, $$4, $$5, p);
   }

   private static djj a(String $$0, @Nullable djj $$1, int $$2, boolean $$3, EnumSet<dmr.a> $$4, djj.a $$5, djj.b $$6, djj.c $$7) {
      return io.a(jy.o, $$0, new djj($$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public static List<djj> a() {
      List<djj> $$0 = Lists.newArrayList();

      djj $$1;
      for ($$1 = n; $$1.d() != $$1; $$1 = $$1.d()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   private static boolean a(dje $$0) {
      return $$0.j().b(l) && $$0.v();
   }

   public static djj a(int $$0) {
      if ($$0 >= q.size()) {
         return c;
      } else {
         return $$0 < 0 ? n : q.get($$0);
      }
   }

   public static int b() {
      return q.size();
   }

   public static int a(djj $$0) {
      return r.getInt($$0.c());
   }

   djj(@Nullable djj $$0, int $$1, boolean $$2, EnumSet<dmr.a> $$3, djj.a $$4, djj.b $$5, djj.c $$6) {
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

   public djj d() {
      return this.t;
   }

   public CompletableFuture<Either<dje, alm.a>> a(
      Executor $$0, ame $$1, djf $$2, ebi $$3, amh $$4, Function<dje, CompletableFuture<Either<dje, alm.a>>> $$5, List<dje> $$6
   ) {
      dje $$7 = $$6.get($$6.size() / 2);
      bfx $$8 = bfu.e.a($$7.f(), $$1.ad(), this.toString());
      return this.u.doWork(this, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7).thenApply($$1x -> {
         $$1x.ifLeft($$0xx -> {
            if ($$0xx instanceof djz $$1xx && !$$1xx.j().b(this)) {
               $$1xx.a(this);
            }
         });
         if ($$8 != null) {
            $$8.finish();
         }

         return $$1x;
      });
   }

   public CompletableFuture<Either<dje, alm.a>> a(ame $$0, ebi $$1, amh $$2, Function<dje, CompletableFuture<Either<dje, alm.a>>> $$3, dje $$4) {
      return this.v.doWork(this, $$0, $$1, $$2, $$3, $$4);
   }

   public int e() {
      return this.w;
   }

   public boolean f() {
      return this.x;
   }

   public djj.a g() {
      return this.y;
   }

   public static djj a(String $$0) {
      return jy.o.a(agi.a($$0));
   }

   public EnumSet<dmr.a> h() {
      return this.z;
   }

   public boolean b(djj $$0) {
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
      CompletableFuture<Either<dje, alm.a>> doWork(
         djj var1, Executor var2, ame var3, djf var4, ebi var5, amh var6, Function<dje, CompletableFuture<Either<dje, alm.a>>> var7, List<dje> var8, dje var9
      );
   }

   interface c {
      CompletableFuture<Either<dje, alm.a>> doWork(djj var1, ame var2, ebi var3, amh var4, Function<dje, CompletableFuture<Either<dje, alm.a>>> var5, dje var6);
   }

   interface d extends djj.b {
      @Override
      default CompletableFuture<Either<dje, alm.a>> doWork(
         djj $$0, Executor $$1, ame $$2, djf $$3, ebi $$4, amh $$5, Function<dje, CompletableFuture<Either<dje, alm.a>>> $$6, List<dje> $$7, dje $$8
      ) {
         this.doWork($$0, $$2, $$3, $$7, $$8);
         return CompletableFuture.completedFuture(Either.left($$8));
      }

      void doWork(djj var1, ame var2, djf var3, List<dje> var4, dje var5);
   }
}
