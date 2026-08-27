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

public class dhe {
   public static final int a = 8;
   private static final EnumSet<dkm.a> o = EnumSet.of(dkm.a.c, dkm.a.a);
   public static final EnumSet<dkm.a> b = EnumSet.of(dkm.a.d, dkm.a.b, dkm.a.e, dkm.a.f);
   private static final dhe.c p = ($$0, $$1, $$2, $$3, $$4, $$5) -> CompletableFuture.completedFuture(Either.left($$5));
   public static final dhe c = a("empty", null, -1, o, dhe.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
   });
   public static final dhe d = a("structure_starts", c, 0, false, o, dhe.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      if ($$2.n().aT().A().c()) {
         $$3.a($$2.G_(), $$2.k().h(), $$2.a(), $$8, $$4);
      }

      $$2.a($$8);
      return CompletableFuture.completedFuture(Either.left($$8));
   }, ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      $$1.a($$5);
      return CompletableFuture.completedFuture(Either.left($$5));
   });
   public static final dhe e = a("structure_references", d, 8, o, dhe.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      ala $$5 = new ala($$1, $$3, $$0, -1);
      $$2.a($$5, $$1.a().a($$5), $$4);
   });
   public static final dhe f = a("biomes", e, 8, o, dhe.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      ala $$9 = new ala($$2, $$7, $$0, -1);
      return $$3.a($$1, $$2.k().i(), dlo.a($$9), $$2.a().a($$9), $$8).thenApply($$0x -> Either.left($$0x));
   });
   public static final dhe g = a("noise", f, 8, o, dhe.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      ala $$9 = new ala($$2, $$7, $$0, 0);
      return $$3.a($$1, dlo.a($$9), $$2.k().i(), $$2.a().a($$9), $$8).thenApply($$0x -> {
         if ($$0x instanceof dhu $$1x) {
            dka $$2x = $$1x.x();
            if ($$2x != null) {
               dka.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return Either.left($$0x);
      });
   });
   public static final dhe h = a("surface", g, 8, o, dhe.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      ala $$5 = new ala($$1, $$3, $$0, 0);
      $$2.a($$5, $$1.a().a($$5), $$1.k().i(), $$4);
   });
   public static final dhe i = a("carvers", h, 8, b, dhe.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      ala $$5 = new ala($$1, $$3, $$0, 0);
      if ($$4 instanceof dhu $$6) {
         dlo.a($$5, $$6);
      }

      $$2.a($$5, $$1.A(), $$1.k().i(), $$1.E_(), $$1.a().a($$5), $$4, dki.a.a);
   });
   public static final dhe j = a("features", i, 8, b, dhe.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      dkm.a($$4, EnumSet.of(dkm.a.e, dkm.a.f, dkm.a.d, dkm.a.b));
      ala $$5 = new ala($$1, $$3, $$0, 1);
      $$2.a($$5, $$4, $$1.a().a($$5));
      dlo.a($$5, $$4);
   });
   public static final dhe k = a(
      "initialize_light", j, 0, false, b, dhe.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> a($$5, $$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$3, $$5)
   );
   public static final dhe l = a(
      "light", k, 1, true, b, dhe.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> b($$5, $$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> b($$3, $$5)
   );
   public static final dhe m = a("spawn", l, 0, b, dhe.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      if (!$$4.y()) {
         $$2.a(new ala($$1, $$3, $$0, -1));
      }
   });
   public static final dhe n = a(
      "full", m, 0, false, b, dhe.a.b, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> $$6.apply($$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> $$4.apply($$5)
   );
   private static final List<dhe> q = ImmutableList.of(n, k, i, f, d, d, d, d, d, d, d, d, new dhe[0]);
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
   private final dhe t;
   private final dhe.b u;
   private final dhe.c v;
   private final int w;
   private final boolean x;
   private final dhe.a y;
   private final EnumSet<dkm.a> z;

   private static CompletableFuture<Either<dgz, akb.a>> a(akw $$0, dgz $$1) {
      $$1.A();
      ((dhu)$$1).a($$0);
      boolean $$2 = a($$1);
      return $$0.a($$1, $$2).thenApply(Either::left);
   }

   private static CompletableFuture<Either<dgz, akb.a>> b(akw $$0, dgz $$1) {
      boolean $$2 = a($$1);
      return $$0.b($$1, $$2).thenApply(Either::left);
   }

   private static dhe a(String $$0, @Nullable dhe $$1, int $$2, EnumSet<dkm.a> $$3, dhe.a $$4, dhe.d $$5) {
      return a($$0, $$1, $$2, $$3, $$4, (dhe.b)$$5);
   }

   private static dhe a(String $$0, @Nullable dhe $$1, int $$2, EnumSet<dkm.a> $$3, dhe.a $$4, dhe.b $$5) {
      return a($$0, $$1, $$2, false, $$3, $$4, $$5, p);
   }

   private static dhe a(String $$0, @Nullable dhe $$1, int $$2, boolean $$3, EnumSet<dkm.a> $$4, dhe.a $$5, dhe.b $$6, dhe.c $$7) {
      return hq.a(jb.o, $$0, new dhe($$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public static List<dhe> a() {
      List<dhe> $$0 = Lists.newArrayList();

      dhe $$1;
      for ($$1 = n; $$1.d() != $$1; $$1 = $$1.d()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   private static boolean a(dgz $$0) {
      return $$0.j().b(l) && $$0.v();
   }

   public static dhe a(int $$0) {
      if ($$0 >= q.size()) {
         return c;
      } else {
         return $$0 < 0 ? n : q.get($$0);
      }
   }

   public static int b() {
      return q.size();
   }

   public static int a(dhe $$0) {
      return r.getInt($$0.c());
   }

   dhe(@Nullable dhe $$0, int $$1, boolean $$2, EnumSet<dkm.a> $$3, dhe.a $$4, dhe.b $$5, dhe.c $$6) {
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

   public dhe d() {
      return this.t;
   }

   public CompletableFuture<Either<dgz, akb.a>> a(
      Executor $$0, akt $$1, dha $$2, dyw $$3, akw $$4, Function<dgz, CompletableFuture<Either<dgz, akb.a>>> $$5, List<dgz> $$6
   ) {
      dgz $$7 = $$6.get($$6.size() / 2);
      bee $$8 = beb.e.a($$7.f(), $$1.ac(), this.toString());
      return this.u.doWork(this, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7).thenApply($$1x -> {
         $$1x.ifLeft($$0xx -> {
            if ($$0xx instanceof dhu $$1xx && !$$1xx.j().b(this)) {
               $$1xx.a(this);
            }
         });
         if ($$8 != null) {
            $$8.finish();
         }

         return $$1x;
      });
   }

   public CompletableFuture<Either<dgz, akb.a>> a(akt $$0, dyw $$1, akw $$2, Function<dgz, CompletableFuture<Either<dgz, akb.a>>> $$3, dgz $$4) {
      return this.v.doWork(this, $$0, $$1, $$2, $$3, $$4);
   }

   public int e() {
      return this.w;
   }

   public boolean f() {
      return this.x;
   }

   public dhe.a g() {
      return this.y;
   }

   public static dhe a(String $$0) {
      return jb.o.a(aez.a($$0));
   }

   public EnumSet<dkm.a> h() {
      return this.z;
   }

   public boolean b(dhe $$0) {
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
      CompletableFuture<Either<dgz, akb.a>> doWork(
         dhe var1, Executor var2, akt var3, dha var4, dyw var5, akw var6, Function<dgz, CompletableFuture<Either<dgz, akb.a>>> var7, List<dgz> var8, dgz var9
      );
   }

   interface c {
      CompletableFuture<Either<dgz, akb.a>> doWork(dhe var1, akt var2, dyw var3, akw var4, Function<dgz, CompletableFuture<Either<dgz, akb.a>>> var5, dgz var6);
   }

   interface d extends dhe.b {
      @Override
      default CompletableFuture<Either<dgz, akb.a>> doWork(
         dhe $$0, Executor $$1, akt $$2, dha $$3, dyw $$4, akw $$5, Function<dgz, CompletableFuture<Either<dgz, akb.a>>> $$6, List<dgz> $$7, dgz $$8
      ) {
         this.doWork($$0, $$2, $$3, $$7, $$8);
         return CompletableFuture.completedFuture(Either.left($$8));
      }

      void doWork(dhe var1, akt var2, dha var3, List<dgz> var4, dgz var5);
   }
}
