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

public class dhb {
   public static final int a = 8;
   private static final EnumSet<dkj.a> o = EnumSet.of(dkj.a.c, dkj.a.a);
   public static final EnumSet<dkj.a> b = EnumSet.of(dkj.a.d, dkj.a.b, dkj.a.e, dkj.a.f);
   private static final dhb.c p = ($$0, $$1, $$2, $$3, $$4, $$5) -> CompletableFuture.completedFuture(Either.left($$5));
   public static final dhb c = a("empty", null, -1, o, dhb.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
   });
   public static final dhb d = a("structure_starts", c, 0, false, o, dhb.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      if ($$2.n().aU().A().c()) {
         $$3.a($$2.B_(), $$2.k().h(), $$2.a(), $$8, $$4);
      }

      $$2.a($$8);
      return CompletableFuture.completedFuture(Either.left($$8));
   }, ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      $$1.a($$5);
      return CompletableFuture.completedFuture(Either.left($$5));
   });
   public static final dhb e = a("structure_references", d, 8, o, dhb.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      akr $$5 = new akr($$1, $$3, $$0, -1);
      $$2.a($$5, $$1.a().a($$5), $$4);
   });
   public static final dhb f = a("biomes", e, 8, o, dhb.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      akr $$9 = new akr($$2, $$7, $$0, -1);
      return $$3.a($$1, $$2.k().i(), dll.a($$9), $$2.a().a($$9), $$8).thenApply($$0x -> Either.left($$0x));
   });
   public static final dhb g = a("noise", f, 8, o, dhb.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      akr $$9 = new akr($$2, $$7, $$0, 0);
      return $$3.a($$1, dll.a($$9), $$2.k().i(), $$2.a().a($$9), $$8).thenApply($$0x -> {
         if ($$0x instanceof dhr $$1x) {
            djx $$2x = $$1x.x();
            if ($$2x != null) {
               djx.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return Either.left($$0x);
      });
   });
   public static final dhb h = a("surface", g, 8, o, dhb.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      akr $$5 = new akr($$1, $$3, $$0, 0);
      $$2.a($$5, $$1.a().a($$5), $$1.k().i(), $$4);
   });
   public static final dhb i = a("carvers", h, 8, b, dhb.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      akr $$5 = new akr($$1, $$3, $$0, 0);
      if ($$4 instanceof dhr $$6) {
         dll.a($$5, $$6);
      }

      $$2.a($$5, $$1.A(), $$1.k().i(), $$1.z_(), $$1.a().a($$5), $$4, dkf.a.a);
   });
   public static final dhb j = a("features", i, 8, b, dhb.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      dkj.a($$4, EnumSet.of(dkj.a.e, dkj.a.f, dkj.a.d, dkj.a.b));
      akr $$5 = new akr($$1, $$3, $$0, 1);
      $$2.a($$5, $$4, $$1.a().a($$5));
      dll.a($$5, $$4);
   });
   public static final dhb k = a(
      "initialize_light", j, 0, false, b, dhb.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> a($$5, $$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$3, $$5)
   );
   public static final dhb l = a(
      "light", k, 1, true, b, dhb.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> b($$5, $$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> b($$3, $$5)
   );
   public static final dhb m = a("spawn", l, 0, b, dhb.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      if (!$$4.y()) {
         $$2.a(new akr($$1, $$3, $$0, -1));
      }
   });
   public static final dhb n = a(
      "full", m, 0, false, b, dhb.a.b, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> $$6.apply($$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> $$4.apply($$5)
   );
   private static final List<dhb> q = ImmutableList.of(n, k, i, f, d, d, d, d, d, d, d, d, new dhb[0]);
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
   private final dhb t;
   private final dhb.b u;
   private final dhb.c v;
   private final int w;
   private final boolean x;
   private final dhb.a y;
   private final EnumSet<dkj.a> z;

   private static CompletableFuture<Either<dgw, ajt.a>> a(akn $$0, dgw $$1) {
      $$1.A();
      ((dhr)$$1).a($$0);
      boolean $$2 = a($$1);
      return $$0.a($$1, $$2).thenApply(Either::left);
   }

   private static CompletableFuture<Either<dgw, ajt.a>> b(akn $$0, dgw $$1) {
      boolean $$2 = a($$1);
      return $$0.b($$1, $$2).thenApply(Either::left);
   }

   private static dhb a(String $$0, @Nullable dhb $$1, int $$2, EnumSet<dkj.a> $$3, dhb.a $$4, dhb.d $$5) {
      return a($$0, $$1, $$2, $$3, $$4, (dhb.b)$$5);
   }

   private static dhb a(String $$0, @Nullable dhb $$1, int $$2, EnumSet<dkj.a> $$3, dhb.a $$4, dhb.b $$5) {
      return a($$0, $$1, $$2, false, $$3, $$4, $$5, p);
   }

   private static dhb a(String $$0, @Nullable dhb $$1, int $$2, boolean $$3, EnumSet<dkj.a> $$4, dhb.a $$5, dhb.b $$6, dhb.c $$7) {
      return hr.a(jb.o, $$0, new dhb($$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public static List<dhb> a() {
      List<dhb> $$0 = Lists.newArrayList();

      dhb $$1;
      for ($$1 = n; $$1.d() != $$1; $$1 = $$1.d()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   private static boolean a(dgw $$0) {
      return $$0.j().b(l) && $$0.v();
   }

   public static dhb a(int $$0) {
      if ($$0 >= q.size()) {
         return c;
      } else {
         return $$0 < 0 ? n : q.get($$0);
      }
   }

   public static int b() {
      return q.size();
   }

   public static int a(dhb $$0) {
      return r.getInt($$0.c());
   }

   dhb(@Nullable dhb $$0, int $$1, boolean $$2, EnumSet<dkj.a> $$3, dhb.a $$4, dhb.b $$5, dhb.c $$6) {
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

   public dhb d() {
      return this.t;
   }

   public CompletableFuture<Either<dgw, ajt.a>> a(
      Executor $$0, akk $$1, dgx $$2, dyt $$3, akn $$4, Function<dgw, CompletableFuture<Either<dgw, ajt.a>>> $$5, List<dgw> $$6
   ) {
      dgw $$7 = $$6.get($$6.size() / 2);
      bdq $$8 = bdn.e.a($$7.f(), $$1.ac(), this.toString());
      return this.u.doWork(this, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7).thenApply($$1x -> {
         $$1x.ifLeft($$0xx -> {
            if ($$0xx instanceof dhr $$1xx && !$$1xx.j().b(this)) {
               $$1xx.a(this);
            }
         });
         if ($$8 != null) {
            $$8.finish();
         }

         return $$1x;
      });
   }

   public CompletableFuture<Either<dgw, ajt.a>> a(akk $$0, dyt $$1, akn $$2, Function<dgw, CompletableFuture<Either<dgw, ajt.a>>> $$3, dgw $$4) {
      return this.v.doWork(this, $$0, $$1, $$2, $$3, $$4);
   }

   public int e() {
      return this.w;
   }

   public boolean f() {
      return this.x;
   }

   public dhb.a g() {
      return this.y;
   }

   public static dhb a(String $$0) {
      return jb.o.a(aer.a($$0));
   }

   public EnumSet<dkj.a> h() {
      return this.z;
   }

   public boolean b(dhb $$0) {
      return this.c() >= $$0.c();
   }

   @Override
   public String toString() {
      return jb.o.b(this).toString();
   }

   public static enum a {
      a,
      b;
   }

   interface b {
      CompletableFuture<Either<dgw, ajt.a>> doWork(
         dhb var1, Executor var2, akk var3, dgx var4, dyt var5, akn var6, Function<dgw, CompletableFuture<Either<dgw, ajt.a>>> var7, List<dgw> var8, dgw var9
      );
   }

   interface c {
      CompletableFuture<Either<dgw, ajt.a>> doWork(dhb var1, akk var2, dyt var3, akn var4, Function<dgw, CompletableFuture<Either<dgw, ajt.a>>> var5, dgw var6);
   }

   interface d extends dhb.b {
      @Override
      default CompletableFuture<Either<dgw, ajt.a>> doWork(
         dhb $$0, Executor $$1, akk $$2, dgx $$3, dyt $$4, akn $$5, Function<dgw, CompletableFuture<Either<dgw, ajt.a>>> $$6, List<dgw> $$7, dgw $$8
      ) {
         this.doWork($$0, $$2, $$3, $$7, $$8);
         return CompletableFuture.completedFuture(Either.left($$8));
      }

      void doWork(dhb var1, akk var2, dgx var3, List<dgw> var4, dgw var5);
   }
}
