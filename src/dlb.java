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

public class dlb {
   public static final int a = 8;
   private static final EnumSet<doj.a> o = EnumSet.of(doj.a.c, doj.a.a);
   public static final EnumSet<doj.a> b = EnumSet.of(doj.a.d, doj.a.b, doj.a.e, doj.a.f);
   private static final dlb.c p = ($$0, $$1, $$2, $$3, $$4, $$5) -> CompletableFuture.completedFuture(Either.left($$5));
   public static final dlb c = a("empty", null, -1, o, dlb.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
   });
   public static final dlb d = a("structure_starts", c, 0, false, o, dlb.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      if ($$2.o().aY().A().c()) {
         $$3.a($$2.I_(), $$2.l().h(), $$2.a(), $$8, $$4);
      }

      $$2.a($$8);
      return CompletableFuture.completedFuture(Either.left($$8));
   }, ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      $$1.a($$5);
      return CompletableFuture.completedFuture(Either.left($$5));
   });
   public static final dlb e = a("structure_references", d, 8, o, dlb.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      ang $$5 = new ang($$1, $$3, $$0, -1);
      $$2.a($$5, $$1.a().a($$5), $$4);
   });
   public static final dlb f = a("biomes", e, 8, o, dlb.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      ang $$9 = new ang($$2, $$7, $$0, -1);
      return $$3.a($$1, $$2.l().i(), dpl.a($$9), $$2.a().a($$9), $$8).thenApply($$0x -> Either.left($$0x));
   });
   public static final dlb g = a("noise", f, 8, o, dlb.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      ang $$9 = new ang($$2, $$7, $$0, 0);
      return $$3.a($$1, dpl.a($$9), $$2.l().i(), $$2.a().a($$9), $$8).thenApply($$0x -> {
         if ($$0x instanceof dlr $$1x) {
            dnx $$2x = $$1x.x();
            if ($$2x != null) {
               dnx.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return Either.left($$0x);
      });
   });
   public static final dlb h = a("surface", g, 8, o, dlb.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      ang $$5 = new ang($$1, $$3, $$0, 0);
      $$2.a($$5, $$1.a().a($$5), $$1.l().i(), $$4);
   });
   public static final dlb i = a("carvers", h, 8, b, dlb.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      ang $$5 = new ang($$1, $$3, $$0, 0);
      if ($$4 instanceof dlr $$6) {
         dpl.a($$5, $$6);
      }

      $$2.a($$5, $$1.C(), $$1.l().i(), $$1.G_(), $$1.a().a($$5), $$4, dof.a.a);
   });
   public static final dlb j = a("features", i, 8, b, dlb.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      doj.a($$4, EnumSet.of(doj.a.e, doj.a.f, doj.a.d, doj.a.b));
      ang $$5 = new ang($$1, $$3, $$0, 1);
      $$2.a($$5, $$4, $$1.a().a($$5));
      dpl.a($$5, $$4);
   });
   public static final dlb k = a(
      "initialize_light", j, 0, false, b, dlb.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> a($$5, $$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$3, $$5)
   );
   public static final dlb l = a(
      "light", k, 1, true, b, dlb.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> b($$5, $$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> b($$3, $$5)
   );
   public static final dlb m = a("spawn", l, 0, b, dlb.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      if (!$$4.y()) {
         $$2.a(new ang($$1, $$3, $$0, -1));
      }
   });
   public static final dlb n = a(
      "full", m, 0, false, b, dlb.a.b, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> $$6.apply($$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> $$4.apply($$5)
   );
   private static final List<dlb> q = ImmutableList.of(n, k, i, f, d, d, d, d, d, d, d, d, new dlb[0]);
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
   private final dlb t;
   private final dlb.b u;
   private final dlb.c v;
   private final int w;
   private final boolean x;
   private final dlb.a y;
   private final EnumSet<doj.a> z;

   private static CompletableFuture<Either<dkw, amh.a>> a(anc $$0, dkw $$1) {
      $$1.A();
      ((dlr)$$1).a($$0);
      boolean $$2 = a($$1);
      return $$0.a($$1, $$2).thenApply(Either::left);
   }

   private static CompletableFuture<Either<dkw, amh.a>> b(anc $$0, dkw $$1) {
      boolean $$2 = a($$1);
      return $$0.b($$1, $$2).thenApply(Either::left);
   }

   private static dlb a(String $$0, @Nullable dlb $$1, int $$2, EnumSet<doj.a> $$3, dlb.a $$4, dlb.d $$5) {
      return a($$0, $$1, $$2, $$3, $$4, (dlb.b)$$5);
   }

   private static dlb a(String $$0, @Nullable dlb $$1, int $$2, EnumSet<doj.a> $$3, dlb.a $$4, dlb.b $$5) {
      return a($$0, $$1, $$2, false, $$3, $$4, $$5, p);
   }

   private static dlb a(String $$0, @Nullable dlb $$1, int $$2, boolean $$3, EnumSet<doj.a> $$4, dlb.a $$5, dlb.b $$6, dlb.c $$7) {
      return it.a(kd.n, $$0, new dlb($$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public static List<dlb> a() {
      List<dlb> $$0 = Lists.newArrayList();

      dlb $$1;
      for ($$1 = n; $$1.d() != $$1; $$1 = $$1.d()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   private static boolean a(dkw $$0) {
      return $$0.j().b(l) && $$0.v();
   }

   public static dlb a(int $$0) {
      if ($$0 >= q.size()) {
         return c;
      } else {
         return $$0 < 0 ? n : q.get($$0);
      }
   }

   public static int b() {
      return q.size();
   }

   public static int a(dlb $$0) {
      return r.getInt($$0.c());
   }

   dlb(@Nullable dlb $$0, int $$1, boolean $$2, EnumSet<doj.a> $$3, dlb.a $$4, dlb.b $$5, dlb.c $$6) {
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

   public dlb d() {
      return this.t;
   }

   public CompletableFuture<Either<dkw, amh.a>> a(
      Executor $$0, amz $$1, dkx $$2, eda $$3, anc $$4, Function<dkw, CompletableFuture<Either<dkw, amh.a>>> $$5, List<dkw> $$6
   ) {
      dkw $$7 = $$6.get($$6.size() / 2);
      bgv $$8 = bgs.e.a($$7.f(), $$1.ae(), this.toString());
      return this.u.doWork(this, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7).thenApply($$1x -> {
         $$1x.ifLeft($$0xx -> {
            if ($$0xx instanceof dlr $$1xx && !$$1xx.j().b(this)) {
               $$1xx.a(this);
            }
         });
         if ($$8 != null) {
            $$8.finish();
         }

         return $$1x;
      });
   }

   public CompletableFuture<Either<dkw, amh.a>> a(amz $$0, eda $$1, anc $$2, Function<dkw, CompletableFuture<Either<dkw, amh.a>>> $$3, dkw $$4) {
      return this.v.doWork(this, $$0, $$1, $$2, $$3, $$4);
   }

   public int e() {
      return this.w;
   }

   public boolean f() {
      return this.x;
   }

   public dlb.a g() {
      return this.y;
   }

   public static dlb a(String $$0) {
      return kd.n.a(ahd.a($$0));
   }

   public EnumSet<doj.a> h() {
      return this.z;
   }

   public boolean b(dlb $$0) {
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
      CompletableFuture<Either<dkw, amh.a>> doWork(
         dlb var1, Executor var2, amz var3, dkx var4, eda var5, anc var6, Function<dkw, CompletableFuture<Either<dkw, amh.a>>> var7, List<dkw> var8, dkw var9
      );
   }

   interface c {
      CompletableFuture<Either<dkw, amh.a>> doWork(dlb var1, amz var2, eda var3, anc var4, Function<dkw, CompletableFuture<Either<dkw, amh.a>>> var5, dkw var6);
   }

   interface d extends dlb.b {
      @Override
      default CompletableFuture<Either<dkw, amh.a>> doWork(
         dlb $$0, Executor $$1, amz $$2, dkx $$3, eda $$4, anc $$5, Function<dkw, CompletableFuture<Either<dkw, amh.a>>> $$6, List<dkw> $$7, dkw $$8
      ) {
         this.doWork($$0, $$2, $$3, $$7, $$8);
         return CompletableFuture.completedFuture(Either.left($$8));
      }

      void doWork(dlb var1, amz var2, dkx var3, List<dkw> var4, dkw var5);
   }
}
