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

public class dgz {
   public static final int a = 8;
   private static final EnumSet<dkh.a> o = EnumSet.of(dkh.a.c, dkh.a.a);
   public static final EnumSet<dkh.a> b = EnumSet.of(dkh.a.d, dkh.a.b, dkh.a.e, dkh.a.f);
   private static final dgz.c p = ($$0, $$1, $$2, $$3, $$4, $$5) -> CompletableFuture.completedFuture(Either.left($$5));
   public static final dgz c = a("empty", null, -1, o, dgz.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
   });
   public static final dgz d = a("structure_starts", c, 0, false, o, dgz.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      if ($$2.n().aU().A().c()) {
         $$3.a($$2.B_(), $$2.k().h(), $$2.a(), $$8, $$4);
      }

      $$2.a($$8);
      return CompletableFuture.completedFuture(Either.left($$8));
   }, ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      $$1.a($$5);
      return CompletableFuture.completedFuture(Either.left($$5));
   });
   public static final dgz e = a("structure_references", d, 8, o, dgz.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      akp $$5 = new akp($$1, $$3, $$0, -1);
      $$2.a($$5, $$1.a().a($$5), $$4);
   });
   public static final dgz f = a("biomes", e, 8, o, dgz.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      akp $$9 = new akp($$2, $$7, $$0, -1);
      return $$3.a($$1, $$2.k().i(), dlj.a($$9), $$2.a().a($$9), $$8).thenApply($$0x -> Either.left($$0x));
   });
   public static final dgz g = a("noise", f, 8, o, dgz.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      akp $$9 = new akp($$2, $$7, $$0, 0);
      return $$3.a($$1, dlj.a($$9), $$2.k().i(), $$2.a().a($$9), $$8).thenApply($$0x -> {
         if ($$0x instanceof dhp $$1x) {
            djv $$2x = $$1x.x();
            if ($$2x != null) {
               djv.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return Either.left($$0x);
      });
   });
   public static final dgz h = a("surface", g, 8, o, dgz.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      akp $$5 = new akp($$1, $$3, $$0, 0);
      $$2.a($$5, $$1.a().a($$5), $$1.k().i(), $$4);
   });
   public static final dgz i = a("carvers", h, 8, b, dgz.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      akp $$5 = new akp($$1, $$3, $$0, 0);
      if ($$4 instanceof dhp $$6) {
         dlj.a($$5, $$6);
      }

      $$2.a($$5, $$1.A(), $$1.k().i(), $$1.z_(), $$1.a().a($$5), $$4, dkd.a.a);
   });
   public static final dgz j = a("features", i, 8, b, dgz.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      dkh.a($$4, EnumSet.of(dkh.a.e, dkh.a.f, dkh.a.d, dkh.a.b));
      akp $$5 = new akp($$1, $$3, $$0, 1);
      $$2.a($$5, $$4, $$1.a().a($$5));
      dlj.a($$5, $$4);
   });
   public static final dgz k = a(
      "initialize_light", j, 0, false, b, dgz.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> a($$5, $$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$3, $$5)
   );
   public static final dgz l = a(
      "light", k, 1, true, b, dgz.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> b($$5, $$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> b($$3, $$5)
   );
   public static final dgz m = a("spawn", l, 0, b, dgz.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      if (!$$4.y()) {
         $$2.a(new akp($$1, $$3, $$0, -1));
      }
   });
   public static final dgz n = a(
      "full", m, 0, false, b, dgz.a.b, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> $$6.apply($$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> $$4.apply($$5)
   );
   private static final List<dgz> q = ImmutableList.of(n, k, i, f, d, d, d, d, d, d, d, d, new dgz[0]);
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
   private final dgz t;
   private final dgz.b u;
   private final dgz.c v;
   private final int w;
   private final boolean x;
   private final dgz.a y;
   private final EnumSet<dkh.a> z;

   private static CompletableFuture<Either<dgu, ajr.a>> a(akl $$0, dgu $$1) {
      $$1.A();
      ((dhp)$$1).a($$0);
      boolean $$2 = a($$1);
      return $$0.a($$1, $$2).thenApply(Either::left);
   }

   private static CompletableFuture<Either<dgu, ajr.a>> b(akl $$0, dgu $$1) {
      boolean $$2 = a($$1);
      return $$0.b($$1, $$2).thenApply(Either::left);
   }

   private static dgz a(String $$0, @Nullable dgz $$1, int $$2, EnumSet<dkh.a> $$3, dgz.a $$4, dgz.d $$5) {
      return a($$0, $$1, $$2, $$3, $$4, (dgz.b)$$5);
   }

   private static dgz a(String $$0, @Nullable dgz $$1, int $$2, EnumSet<dkh.a> $$3, dgz.a $$4, dgz.b $$5) {
      return a($$0, $$1, $$2, false, $$3, $$4, $$5, p);
   }

   private static dgz a(String $$0, @Nullable dgz $$1, int $$2, boolean $$3, EnumSet<dkh.a> $$4, dgz.a $$5, dgz.b $$6, dgz.c $$7) {
      return hs.a(jc.o, $$0, new dgz($$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public static List<dgz> a() {
      List<dgz> $$0 = Lists.newArrayList();

      dgz $$1;
      for ($$1 = n; $$1.d() != $$1; $$1 = $$1.d()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   private static boolean a(dgu $$0) {
      return $$0.j().b(l) && $$0.v();
   }

   public static dgz a(int $$0) {
      if ($$0 >= q.size()) {
         return c;
      } else {
         return $$0 < 0 ? n : q.get($$0);
      }
   }

   public static int b() {
      return q.size();
   }

   public static int a(dgz $$0) {
      return r.getInt($$0.c());
   }

   dgz(@Nullable dgz $$0, int $$1, boolean $$2, EnumSet<dkh.a> $$3, dgz.a $$4, dgz.b $$5, dgz.c $$6) {
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

   public dgz d() {
      return this.t;
   }

   public CompletableFuture<Either<dgu, ajr.a>> a(
      Executor $$0, aki $$1, dgv $$2, dyr $$3, akl $$4, Function<dgu, CompletableFuture<Either<dgu, ajr.a>>> $$5, List<dgu> $$6
   ) {
      dgu $$7 = $$6.get($$6.size() / 2);
      bdn $$8 = bdk.e.a($$7.f(), $$1.ac(), this.toString());
      return this.u.doWork(this, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7).thenApply($$1x -> {
         $$1x.ifLeft($$0xx -> {
            if ($$0xx instanceof dhp $$1xx && !$$1xx.j().b(this)) {
               $$1xx.a(this);
            }
         });
         if ($$8 != null) {
            $$8.finish();
         }

         return $$1x;
      });
   }

   public CompletableFuture<Either<dgu, ajr.a>> a(aki $$0, dyr $$1, akl $$2, Function<dgu, CompletableFuture<Either<dgu, ajr.a>>> $$3, dgu $$4) {
      return this.v.doWork(this, $$0, $$1, $$2, $$3, $$4);
   }

   public int e() {
      return this.w;
   }

   public boolean f() {
      return this.x;
   }

   public dgz.a g() {
      return this.y;
   }

   public static dgz a(String $$0) {
      return jc.o.a(aep.a($$0));
   }

   public EnumSet<dkh.a> h() {
      return this.z;
   }

   public boolean b(dgz $$0) {
      return this.c() >= $$0.c();
   }

   @Override
   public String toString() {
      return jc.o.b(this).toString();
   }

   public static enum a {
      a,
      b;
   }

   interface b {
      CompletableFuture<Either<dgu, ajr.a>> doWork(
         dgz var1, Executor var2, aki var3, dgv var4, dyr var5, akl var6, Function<dgu, CompletableFuture<Either<dgu, ajr.a>>> var7, List<dgu> var8, dgu var9
      );
   }

   interface c {
      CompletableFuture<Either<dgu, ajr.a>> doWork(dgz var1, aki var2, dyr var3, akl var4, Function<dgu, CompletableFuture<Either<dgu, ajr.a>>> var5, dgu var6);
   }

   interface d extends dgz.b {
      @Override
      default CompletableFuture<Either<dgu, ajr.a>> doWork(
         dgz $$0, Executor $$1, aki $$2, dgv $$3, dyr $$4, akl $$5, Function<dgu, CompletableFuture<Either<dgu, ajr.a>>> $$6, List<dgu> $$7, dgu $$8
      ) {
         this.doWork($$0, $$2, $$3, $$7, $$8);
         return CompletableFuture.completedFuture(Either.left($$8));
      }

      void doWork(dgz var1, aki var2, dgv var3, List<dgu> var4, dgu var5);
   }
}
