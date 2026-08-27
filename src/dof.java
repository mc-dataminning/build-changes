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

public class dof {
   public static final int a = 8;
   private static final EnumSet<drq.a> o = EnumSet.of(drq.a.c, drq.a.a);
   public static final EnumSet<drq.a> b = EnumSet.of(drq.a.d, drq.a.b, drq.a.e, drq.a.f);
   private static final dof.c p = ($$0, $$1, $$2, $$3, $$4, $$5) -> CompletableFuture.completedFuture(Either.left($$5));
   public static final dof c = a("empty", null, -1, o, dof.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
   });
   public static final dof d = a("structure_starts", c, 0, false, o, dof.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      if ($$2.o().bc().y().c()) {
         $$3.a($$2.I_(), $$2.l().h(), $$2.a(), $$8, $$4);
      }

      $$2.a($$8);
      return CompletableFuture.completedFuture(Either.left($$8));
   }, ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      $$1.a($$5);
      return CompletableFuture.completedFuture(Either.left($$5));
   });
   public static final dof e = a("structure_references", d, 8, o, dof.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      aph $$5 = new aph($$1, $$3, $$0, -1);
      $$2.a($$5, $$1.a().a($$5), $$4);
   });
   public static final dof f = a("biomes", e, 8, o, dof.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      aph $$9 = new aph($$2, $$7, $$0, -1);
      return $$3.a($$1, $$2.l().i(), dss.a($$9), $$2.a().a($$9), $$8).thenApply($$0x -> Either.left($$0x));
   });
   public static final dof g = a("noise", f, 8, o, dof.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      aph $$9 = new aph($$2, $$7, $$0, 0);
      return $$3.a($$1, dss.a($$9), $$2.l().i(), $$2.a().a($$9), $$8).thenApply($$0x -> {
         if ($$0x instanceof dov $$1x) {
            dre $$2x = $$1x.x();
            if ($$2x != null) {
               dre.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return Either.left($$0x);
      });
   });
   public static final dof h = a("surface", g, 8, o, dof.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      aph $$5 = new aph($$1, $$3, $$0, 0);
      $$2.a($$5, $$1.a().a($$5), $$1.l().i(), $$4);
   });
   public static final dof i = a("carvers", h, 8, b, dof.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      aph $$5 = new aph($$1, $$3, $$0, 0);
      if ($$4 instanceof dov $$6) {
         dss.a($$5, $$6);
      }

      $$2.a($$5, $$1.C(), $$1.l().i(), $$1.G_(), $$1.a().a($$5), $$4, drm.a.a);
   });
   public static final dof j = a("features", i, 8, b, dof.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      drq.a($$4, EnumSet.of(drq.a.e, drq.a.f, drq.a.d, drq.a.b));
      aph $$5 = new aph($$1, $$3, $$0, 1);
      $$2.a($$5, $$4, $$1.a().a($$5));
      dss.a($$5, $$4);
   });
   public static final dof k = a(
      "initialize_light", j, 0, false, b, dof.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> a($$5, $$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$3, $$5)
   );
   public static final dof l = a(
      "light", k, 1, true, b, dof.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> b($$5, $$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> b($$3, $$5)
   );
   public static final dof m = a("spawn", l, 0, b, dof.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      if (!$$4.y()) {
         $$2.a(new aph($$1, $$3, $$0, -1));
      }
   });
   public static final dof n = a(
      "full", m, 0, false, b, dof.a.b, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> $$6.apply($$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> $$4.apply($$5)
   );
   private static final List<dof> q = ImmutableList.of(n, k, i, f, d, d, d, d, d, d, d, d, new dof[0]);
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
   private final dof t;
   private final dof.b u;
   private final dof.c v;
   private final int w;
   private final boolean x;
   private final dof.a y;
   private final EnumSet<drq.a> z;

   private static CompletableFuture<Either<doa, aoi.a>> a(apd $$0, doa $$1) {
      $$1.A();
      ((dov)$$1).a($$0);
      boolean $$2 = a($$1);
      return $$0.a($$1, $$2).thenApply(Either::left);
   }

   private static CompletableFuture<Either<doa, aoi.a>> b(apd $$0, doa $$1) {
      boolean $$2 = a($$1);
      return $$0.b($$1, $$2).thenApply(Either::left);
   }

   private static dof a(String $$0, @Nullable dof $$1, int $$2, EnumSet<drq.a> $$3, dof.a $$4, dof.d $$5) {
      return a($$0, $$1, $$2, $$3, $$4, (dof.b)$$5);
   }

   private static dof a(String $$0, @Nullable dof $$1, int $$2, EnumSet<drq.a> $$3, dof.a $$4, dof.b $$5) {
      return a($$0, $$1, $$2, false, $$3, $$4, $$5, p);
   }

   private static dof a(String $$0, @Nullable dof $$1, int $$2, boolean $$3, EnumSet<drq.a> $$4, dof.a $$5, dof.b $$6, dof.c $$7) {
      return ix.a(kh.n, $$0, new dof($$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public static List<dof> a() {
      List<dof> $$0 = Lists.newArrayList();

      dof $$1;
      for ($$1 = n; $$1.d() != $$1; $$1 = $$1.d()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   private static boolean a(doa $$0) {
      return $$0.j().b(l) && $$0.v();
   }

   public static dof a(int $$0) {
      if ($$0 >= q.size()) {
         return c;
      } else {
         return $$0 < 0 ? n : q.get($$0);
      }
   }

   public static int b() {
      return q.size();
   }

   public static int a(dof $$0) {
      return r.getInt($$0.c());
   }

   dof(@Nullable dof $$0, int $$1, boolean $$2, EnumSet<drq.a> $$3, dof.a $$4, dof.b $$5, dof.c $$6) {
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

   public dof d() {
      return this.t;
   }

   public CompletableFuture<Either<doa, aoi.a>> a(
      Executor $$0, apa $$1, dob $$2, egh $$3, apd $$4, Function<doa, CompletableFuture<Either<doa, aoi.a>>> $$5, List<doa> $$6
   ) {
      doa $$7 = $$6.get($$6.size() / 2);
      bjl $$8 = bji.e.a($$7.f(), $$1.ad(), this.toString());
      return this.u.doWork(this, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7).thenApply($$1x -> {
         $$1x.ifLeft($$0xx -> {
            if ($$0xx instanceof dov $$1xx && !$$1xx.j().b(this)) {
               $$1xx.a(this);
            }
         });
         if ($$8 != null) {
            $$8.finish();
         }

         return $$1x;
      });
   }

   public CompletableFuture<Either<doa, aoi.a>> a(apa $$0, egh $$1, apd $$2, Function<doa, CompletableFuture<Either<doa, aoi.a>>> $$3, doa $$4) {
      return this.v.doWork(this, $$0, $$1, $$2, $$3, $$4);
   }

   public int e() {
      return this.w;
   }

   public boolean f() {
      return this.x;
   }

   public dof.a g() {
      return this.y;
   }

   public static dof a(String $$0) {
      return kh.n.a(ajc.a($$0));
   }

   public EnumSet<drq.a> h() {
      return this.z;
   }

   public boolean b(dof $$0) {
      return this.c() >= $$0.c();
   }

   @Override
   public String toString() {
      return kh.n.b(this).toString();
   }

   public static enum a {
      a,
      b;
   }

   interface b {
      CompletableFuture<Either<doa, aoi.a>> doWork(
         dof var1, Executor var2, apa var3, dob var4, egh var5, apd var6, Function<doa, CompletableFuture<Either<doa, aoi.a>>> var7, List<doa> var8, doa var9
      );
   }

   interface c {
      CompletableFuture<Either<doa, aoi.a>> doWork(dof var1, apa var2, egh var3, apd var4, Function<doa, CompletableFuture<Either<doa, aoi.a>>> var5, doa var6);
   }

   interface d extends dof.b {
      @Override
      default CompletableFuture<Either<doa, aoi.a>> doWork(
         dof $$0, Executor $$1, apa $$2, dob $$3, egh $$4, apd $$5, Function<doa, CompletableFuture<Either<doa, aoi.a>>> $$6, List<doa> $$7, doa $$8
      ) {
         this.doWork($$0, $$2, $$3, $$7, $$8);
         return CompletableFuture.completedFuture(Either.left($$8));
      }

      void doWork(dof var1, apa var2, dob var3, List<doa> var4, doa var5);
   }
}
