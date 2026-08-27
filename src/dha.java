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

public class dha {
   public static final int a = 8;
   private static final EnumSet<dki.a> o = EnumSet.of(dki.a.c, dki.a.a);
   public static final EnumSet<dki.a> b = EnumSet.of(dki.a.d, dki.a.b, dki.a.e, dki.a.f);
   private static final dha.c p = ($$0, $$1, $$2, $$3, $$4, $$5) -> CompletableFuture.completedFuture(Either.left($$5));
   public static final dha c = a("empty", null, -1, o, dha.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
   });
   public static final dha d = a("structure_starts", c, 0, false, o, dha.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      if ($$2.n().aT().A().c()) {
         $$3.a($$2.B_(), $$2.k().h(), $$2.a(), $$8, $$4);
      }

      $$2.a($$8);
      return CompletableFuture.completedFuture(Either.left($$8));
   }, ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      $$1.a($$5);
      return CompletableFuture.completedFuture(Either.left($$5));
   });
   public static final dha e = a("structure_references", d, 8, o, dha.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      akr $$5 = new akr($$1, $$3, $$0, -1);
      $$2.a($$5, $$1.a().a($$5), $$4);
   });
   public static final dha f = a("biomes", e, 8, o, dha.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      akr $$9 = new akr($$2, $$7, $$0, -1);
      return $$3.a($$1, $$2.k().i(), dlk.a($$9), $$2.a().a($$9), $$8).thenApply($$0x -> Either.left($$0x));
   });
   public static final dha g = a("noise", f, 8, o, dha.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      akr $$9 = new akr($$2, $$7, $$0, 0);
      return $$3.a($$1, dlk.a($$9), $$2.k().i(), $$2.a().a($$9), $$8).thenApply($$0x -> {
         if ($$0x instanceof dhq $$1x) {
            djw $$2x = $$1x.x();
            if ($$2x != null) {
               djw.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return Either.left($$0x);
      });
   });
   public static final dha h = a("surface", g, 8, o, dha.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      akr $$5 = new akr($$1, $$3, $$0, 0);
      $$2.a($$5, $$1.a().a($$5), $$1.k().i(), $$4);
   });
   public static final dha i = a("carvers", h, 8, b, dha.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      akr $$5 = new akr($$1, $$3, $$0, 0);
      if ($$4 instanceof dhq $$6) {
         dlk.a($$5, $$6);
      }

      $$2.a($$5, $$1.A(), $$1.k().i(), $$1.z_(), $$1.a().a($$5), $$4, dke.a.a);
   });
   public static final dha j = a("features", i, 8, b, dha.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      dki.a($$4, EnumSet.of(dki.a.e, dki.a.f, dki.a.d, dki.a.b));
      akr $$5 = new akr($$1, $$3, $$0, 1);
      $$2.a($$5, $$4, $$1.a().a($$5));
      dlk.a($$5, $$4);
   });
   public static final dha k = a(
      "initialize_light", j, 0, false, b, dha.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> a($$5, $$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$3, $$5)
   );
   public static final dha l = a(
      "light", k, 1, true, b, dha.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> b($$5, $$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> b($$3, $$5)
   );
   public static final dha m = a("spawn", l, 0, b, dha.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      if (!$$4.y()) {
         $$2.a(new akr($$1, $$3, $$0, -1));
      }
   });
   public static final dha n = a(
      "full", m, 0, false, b, dha.a.b, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> $$6.apply($$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> $$4.apply($$5)
   );
   private static final List<dha> q = ImmutableList.of(n, k, i, f, d, d, d, d, d, d, d, d, new dha[0]);
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
   private final dha t;
   private final dha.b u;
   private final dha.c v;
   private final int w;
   private final boolean x;
   private final dha.a y;
   private final EnumSet<dki.a> z;

   private static CompletableFuture<Either<dgv, ajt.a>> a(akn $$0, dgv $$1) {
      $$1.A();
      ((dhq)$$1).a($$0);
      boolean $$2 = a($$1);
      return $$0.a($$1, $$2).thenApply(Either::left);
   }

   private static CompletableFuture<Either<dgv, ajt.a>> b(akn $$0, dgv $$1) {
      boolean $$2 = a($$1);
      return $$0.b($$1, $$2).thenApply(Either::left);
   }

   private static dha a(String $$0, @Nullable dha $$1, int $$2, EnumSet<dki.a> $$3, dha.a $$4, dha.d $$5) {
      return a($$0, $$1, $$2, $$3, $$4, (dha.b)$$5);
   }

   private static dha a(String $$0, @Nullable dha $$1, int $$2, EnumSet<dki.a> $$3, dha.a $$4, dha.b $$5) {
      return a($$0, $$1, $$2, false, $$3, $$4, $$5, p);
   }

   private static dha a(String $$0, @Nullable dha $$1, int $$2, boolean $$3, EnumSet<dki.a> $$4, dha.a $$5, dha.b $$6, dha.c $$7) {
      return hr.a(jb.o, $$0, new dha($$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public static List<dha> a() {
      List<dha> $$0 = Lists.newArrayList();

      dha $$1;
      for ($$1 = n; $$1.d() != $$1; $$1 = $$1.d()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   private static boolean a(dgv $$0) {
      return $$0.j().b(l) && $$0.v();
   }

   public static dha a(int $$0) {
      if ($$0 >= q.size()) {
         return c;
      } else {
         return $$0 < 0 ? n : q.get($$0);
      }
   }

   public static int b() {
      return q.size();
   }

   public static int a(dha $$0) {
      return r.getInt($$0.c());
   }

   dha(@Nullable dha $$0, int $$1, boolean $$2, EnumSet<dki.a> $$3, dha.a $$4, dha.b $$5, dha.c $$6) {
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

   public dha d() {
      return this.t;
   }

   public CompletableFuture<Either<dgv, ajt.a>> a(
      Executor $$0, akk $$1, dgw $$2, dys $$3, akn $$4, Function<dgv, CompletableFuture<Either<dgv, ajt.a>>> $$5, List<dgv> $$6
   ) {
      dgv $$7 = $$6.get($$6.size() / 2);
      bdq $$8 = bdn.e.a($$7.f(), $$1.ac(), this.toString());
      return this.u.doWork(this, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7).thenApply($$1x -> {
         $$1x.ifLeft($$0xx -> {
            if ($$0xx instanceof dhq $$1xx && !$$1xx.j().b(this)) {
               $$1xx.a(this);
            }
         });
         if ($$8 != null) {
            $$8.finish();
         }

         return $$1x;
      });
   }

   public CompletableFuture<Either<dgv, ajt.a>> a(akk $$0, dys $$1, akn $$2, Function<dgv, CompletableFuture<Either<dgv, ajt.a>>> $$3, dgv $$4) {
      return this.v.doWork(this, $$0, $$1, $$2, $$3, $$4);
   }

   public int e() {
      return this.w;
   }

   public boolean f() {
      return this.x;
   }

   public dha.a g() {
      return this.y;
   }

   public static dha a(String $$0) {
      return jb.o.a(aer.a($$0));
   }

   public EnumSet<dki.a> h() {
      return this.z;
   }

   public boolean b(dha $$0) {
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
      CompletableFuture<Either<dgv, ajt.a>> doWork(
         dha var1, Executor var2, akk var3, dgw var4, dys var5, akn var6, Function<dgv, CompletableFuture<Either<dgv, ajt.a>>> var7, List<dgv> var8, dgv var9
      );
   }

   interface c {
      CompletableFuture<Either<dgv, ajt.a>> doWork(dha var1, akk var2, dys var3, akn var4, Function<dgv, CompletableFuture<Either<dgv, ajt.a>>> var5, dgv var6);
   }

   interface d extends dha.b {
      @Override
      default CompletableFuture<Either<dgv, ajt.a>> doWork(
         dha $$0, Executor $$1, akk $$2, dgw $$3, dys $$4, akn $$5, Function<dgv, CompletableFuture<Either<dgv, ajt.a>>> $$6, List<dgv> $$7, dgv $$8
      ) {
         this.doWork($$0, $$2, $$3, $$7, $$8);
         return CompletableFuture.completedFuture(Either.left($$8));
      }

      void doWork(dha var1, akk var2, dgw var3, List<dgv> var4, dgv var5);
   }
}
