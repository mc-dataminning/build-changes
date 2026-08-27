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

public class dnk {
   public static final int a = 8;
   private static final EnumSet<dqv.a> o = EnumSet.of(dqv.a.c, dqv.a.a);
   public static final EnumSet<dqv.a> b = EnumSet.of(dqv.a.d, dqv.a.b, dqv.a.e, dqv.a.f);
   private static final dnk.c p = ($$0, $$1, $$2, $$3, $$4, $$5) -> CompletableFuture.completedFuture(Either.left($$5));
   public static final dnk c = a("empty", null, -1, o, dnk.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
   });
   public static final dnk d = a("structure_starts", c, 0, false, o, dnk.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      if ($$2.o().ba().y().c()) {
         $$3.a($$2.I_(), $$2.l().h(), $$2.a(), $$8, $$4);
      }

      $$2.a($$8);
      return CompletableFuture.completedFuture(Either.left($$8));
   }, ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      $$1.a($$5);
      return CompletableFuture.completedFuture(Either.left($$5));
   });
   public static final dnk e = a("structure_references", d, 8, o, dnk.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      apd $$5 = new apd($$1, $$3, $$0, -1);
      $$2.a($$5, $$1.a().a($$5), $$4);
   });
   public static final dnk f = a("biomes", e, 8, o, dnk.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      apd $$9 = new apd($$2, $$7, $$0, -1);
      return $$3.a($$1, $$2.l().i(), drx.a($$9), $$2.a().a($$9), $$8).thenApply($$0x -> Either.left($$0x));
   });
   public static final dnk g = a("noise", f, 8, o, dnk.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      apd $$9 = new apd($$2, $$7, $$0, 0);
      return $$3.a($$1, drx.a($$9), $$2.l().i(), $$2.a().a($$9), $$8).thenApply($$0x -> {
         if ($$0x instanceof doa $$1x) {
            dqj $$2x = $$1x.x();
            if ($$2x != null) {
               dqj.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return Either.left($$0x);
      });
   });
   public static final dnk h = a("surface", g, 8, o, dnk.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      apd $$5 = new apd($$1, $$3, $$0, 0);
      $$2.a($$5, $$1.a().a($$5), $$1.l().i(), $$4);
   });
   public static final dnk i = a("carvers", h, 8, b, dnk.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      apd $$5 = new apd($$1, $$3, $$0, 0);
      if ($$4 instanceof doa $$6) {
         drx.a($$5, $$6);
      }

      $$2.a($$5, $$1.C(), $$1.l().i(), $$1.G_(), $$1.a().a($$5), $$4, dqr.a.a);
   });
   public static final dnk j = a("features", i, 8, b, dnk.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      dqv.a($$4, EnumSet.of(dqv.a.e, dqv.a.f, dqv.a.d, dqv.a.b));
      apd $$5 = new apd($$1, $$3, $$0, 1);
      $$2.a($$5, $$4, $$1.a().a($$5));
      drx.a($$5, $$4);
   });
   public static final dnk k = a(
      "initialize_light", j, 0, false, b, dnk.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> a($$5, $$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$3, $$5)
   );
   public static final dnk l = a(
      "light", k, 1, true, b, dnk.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> b($$5, $$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> b($$3, $$5)
   );
   public static final dnk m = a("spawn", l, 0, b, dnk.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      if (!$$4.y()) {
         $$2.a(new apd($$1, $$3, $$0, -1));
      }
   });
   public static final dnk n = a(
      "full", m, 0, false, b, dnk.a.b, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> $$6.apply($$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> $$4.apply($$5)
   );
   private static final List<dnk> q = ImmutableList.of(n, k, i, f, d, d, d, d, d, d, d, d, new dnk[0]);
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
   private final dnk t;
   private final dnk.b u;
   private final dnk.c v;
   private final int w;
   private final boolean x;
   private final dnk.a y;
   private final EnumSet<dqv.a> z;

   private static CompletableFuture<Either<dnf, aoe.a>> a(aoz $$0, dnf $$1) {
      $$1.A();
      ((doa)$$1).a($$0);
      boolean $$2 = a($$1);
      return $$0.a($$1, $$2).thenApply(Either::left);
   }

   private static CompletableFuture<Either<dnf, aoe.a>> b(aoz $$0, dnf $$1) {
      boolean $$2 = a($$1);
      return $$0.b($$1, $$2).thenApply(Either::left);
   }

   private static dnk a(String $$0, @Nullable dnk $$1, int $$2, EnumSet<dqv.a> $$3, dnk.a $$4, dnk.d $$5) {
      return a($$0, $$1, $$2, $$3, $$4, (dnk.b)$$5);
   }

   private static dnk a(String $$0, @Nullable dnk $$1, int $$2, EnumSet<dqv.a> $$3, dnk.a $$4, dnk.b $$5) {
      return a($$0, $$1, $$2, false, $$3, $$4, $$5, p);
   }

   private static dnk a(String $$0, @Nullable dnk $$1, int $$2, boolean $$3, EnumSet<dqv.a> $$4, dnk.a $$5, dnk.b $$6, dnk.c $$7) {
      return iv.a(kf.n, $$0, new dnk($$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public static List<dnk> a() {
      List<dnk> $$0 = Lists.newArrayList();

      dnk $$1;
      for ($$1 = n; $$1.d() != $$1; $$1 = $$1.d()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   private static boolean a(dnf $$0) {
      return $$0.j().b(l) && $$0.v();
   }

   public static dnk a(int $$0) {
      if ($$0 >= q.size()) {
         return c;
      } else {
         return $$0 < 0 ? n : q.get($$0);
      }
   }

   public static int b() {
      return q.size();
   }

   public static int a(dnk $$0) {
      return r.getInt($$0.c());
   }

   dnk(@Nullable dnk $$0, int $$1, boolean $$2, EnumSet<dqv.a> $$3, dnk.a $$4, dnk.b $$5, dnk.c $$6) {
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

   public dnk d() {
      return this.t;
   }

   public CompletableFuture<Either<dnf, aoe.a>> a(
      Executor $$0, aow $$1, dng $$2, efm $$3, aoz $$4, Function<dnf, CompletableFuture<Either<dnf, aoe.a>>> $$5, List<dnf> $$6
   ) {
      dnf $$7 = $$6.get($$6.size() / 2);
      biw $$8 = bit.e.a($$7.f(), $$1.ad(), this.toString());
      return this.u.doWork(this, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7).thenApply($$1x -> {
         $$1x.ifLeft($$0xx -> {
            if ($$0xx instanceof doa $$1xx && !$$1xx.j().b(this)) {
               $$1xx.a(this);
            }
         });
         if ($$8 != null) {
            $$8.finish();
         }

         return $$1x;
      });
   }

   public CompletableFuture<Either<dnf, aoe.a>> a(aow $$0, efm $$1, aoz $$2, Function<dnf, CompletableFuture<Either<dnf, aoe.a>>> $$3, dnf $$4) {
      return this.v.doWork(this, $$0, $$1, $$2, $$3, $$4);
   }

   public int e() {
      return this.w;
   }

   public boolean f() {
      return this.x;
   }

   public dnk.a g() {
      return this.y;
   }

   public static dnk a(String $$0) {
      return kf.n.a(aiy.a($$0));
   }

   public EnumSet<dqv.a> h() {
      return this.z;
   }

   public boolean b(dnk $$0) {
      return this.c() >= $$0.c();
   }

   @Override
   public String toString() {
      return kf.n.b(this).toString();
   }

   public static enum a {
      a,
      b;
   }

   interface b {
      CompletableFuture<Either<dnf, aoe.a>> doWork(
         dnk var1, Executor var2, aow var3, dng var4, efm var5, aoz var6, Function<dnf, CompletableFuture<Either<dnf, aoe.a>>> var7, List<dnf> var8, dnf var9
      );
   }

   interface c {
      CompletableFuture<Either<dnf, aoe.a>> doWork(dnk var1, aow var2, efm var3, aoz var4, Function<dnf, CompletableFuture<Either<dnf, aoe.a>>> var5, dnf var6);
   }

   interface d extends dnk.b {
      @Override
      default CompletableFuture<Either<dnf, aoe.a>> doWork(
         dnk $$0, Executor $$1, aow $$2, dng $$3, efm $$4, aoz $$5, Function<dnf, CompletableFuture<Either<dnf, aoe.a>>> $$6, List<dnf> $$7, dnf $$8
      ) {
         this.doWork($$0, $$2, $$3, $$7, $$8);
         return CompletableFuture.completedFuture(Either.left($$8));
      }

      void doWork(dnk var1, aow var2, dng var3, List<dnf> var4, dnf var5);
   }
}
