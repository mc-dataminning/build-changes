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

public class dhk {
   public static final int a = 8;
   private static final EnumSet<dks.a> o = EnumSet.of(dks.a.c, dks.a.a);
   public static final EnumSet<dks.a> b = EnumSet.of(dks.a.d, dks.a.b, dks.a.e, dks.a.f);
   private static final dhk.c p = ($$0, $$1, $$2, $$3, $$4, $$5) -> CompletableFuture.completedFuture(Either.left($$5));
   public static final dhk c = a("empty", null, -1, o, dhk.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
   });
   public static final dhk d = a("structure_starts", c, 0, false, o, dhk.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      if ($$2.n().aT().A().c()) {
         $$3.a($$2.G_(), $$2.k().h(), $$2.a(), $$8, $$4);
      }

      $$2.a($$8);
      return CompletableFuture.completedFuture(Either.left($$8));
   }, ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      $$1.a($$5);
      return CompletableFuture.completedFuture(Either.left($$5));
   });
   public static final dhk e = a("structure_references", d, 8, o, dhk.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      aky $$5 = new aky($$1, $$3, $$0, -1);
      $$2.a($$5, $$1.a().a($$5), $$4);
   });
   public static final dhk f = a("biomes", e, 8, o, dhk.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      aky $$9 = new aky($$2, $$7, $$0, -1);
      return $$3.a($$1, $$2.k().i(), dlu.a($$9), $$2.a().a($$9), $$8).thenApply($$0x -> Either.left($$0x));
   });
   public static final dhk g = a("noise", f, 8, o, dhk.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      aky $$9 = new aky($$2, $$7, $$0, 0);
      return $$3.a($$1, dlu.a($$9), $$2.k().i(), $$2.a().a($$9), $$8).thenApply($$0x -> {
         if ($$0x instanceof dia $$1x) {
            dkg $$2x = $$1x.x();
            if ($$2x != null) {
               dkg.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return Either.left($$0x);
      });
   });
   public static final dhk h = a("surface", g, 8, o, dhk.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      aky $$5 = new aky($$1, $$3, $$0, 0);
      $$2.a($$5, $$1.a().a($$5), $$1.k().i(), $$4);
   });
   public static final dhk i = a("carvers", h, 8, b, dhk.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      aky $$5 = new aky($$1, $$3, $$0, 0);
      if ($$4 instanceof dia $$6) {
         dlu.a($$5, $$6);
      }

      $$2.a($$5, $$1.A(), $$1.k().i(), $$1.E_(), $$1.a().a($$5), $$4, dko.a.a);
   });
   public static final dhk j = a("features", i, 8, b, dhk.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      dks.a($$4, EnumSet.of(dks.a.e, dks.a.f, dks.a.d, dks.a.b));
      aky $$5 = new aky($$1, $$3, $$0, 1);
      $$2.a($$5, $$4, $$1.a().a($$5));
      dlu.a($$5, $$4);
   });
   public static final dhk k = a(
      "initialize_light", j, 0, false, b, dhk.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> a($$5, $$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$3, $$5)
   );
   public static final dhk l = a(
      "light", k, 1, true, b, dhk.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> b($$5, $$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> b($$3, $$5)
   );
   public static final dhk m = a("spawn", l, 0, b, dhk.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      if (!$$4.y()) {
         $$2.a(new aky($$1, $$3, $$0, -1));
      }
   });
   public static final dhk n = a(
      "full", m, 0, false, b, dhk.a.b, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> $$6.apply($$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> $$4.apply($$5)
   );
   private static final List<dhk> q = ImmutableList.of(n, k, i, f, d, d, d, d, d, d, d, d, new dhk[0]);
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
   private final dhk t;
   private final dhk.b u;
   private final dhk.c v;
   private final int w;
   private final boolean x;
   private final dhk.a y;
   private final EnumSet<dks.a> z;

   private static CompletableFuture<Either<dhf, ajz.a>> a(aku $$0, dhf $$1) {
      $$1.A();
      ((dia)$$1).a($$0);
      boolean $$2 = a($$1);
      return $$0.a($$1, $$2).thenApply(Either::left);
   }

   private static CompletableFuture<Either<dhf, ajz.a>> b(aku $$0, dhf $$1) {
      boolean $$2 = a($$1);
      return $$0.b($$1, $$2).thenApply(Either::left);
   }

   private static dhk a(String $$0, @Nullable dhk $$1, int $$2, EnumSet<dks.a> $$3, dhk.a $$4, dhk.d $$5) {
      return a($$0, $$1, $$2, $$3, $$4, (dhk.b)$$5);
   }

   private static dhk a(String $$0, @Nullable dhk $$1, int $$2, EnumSet<dks.a> $$3, dhk.a $$4, dhk.b $$5) {
      return a($$0, $$1, $$2, false, $$3, $$4, $$5, p);
   }

   private static dhk a(String $$0, @Nullable dhk $$1, int $$2, boolean $$3, EnumSet<dks.a> $$4, dhk.a $$5, dhk.b $$6, dhk.c $$7) {
      return ht.a(jd.o, $$0, new dhk($$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public static List<dhk> a() {
      List<dhk> $$0 = Lists.newArrayList();

      dhk $$1;
      for ($$1 = n; $$1.d() != $$1; $$1 = $$1.d()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   private static boolean a(dhf $$0) {
      return $$0.j().b(l) && $$0.v();
   }

   public static dhk a(int $$0) {
      if ($$0 >= q.size()) {
         return c;
      } else {
         return $$0 < 0 ? n : q.get($$0);
      }
   }

   public static int b() {
      return q.size();
   }

   public static int a(dhk $$0) {
      return r.getInt($$0.c());
   }

   dhk(@Nullable dhk $$0, int $$1, boolean $$2, EnumSet<dks.a> $$3, dhk.a $$4, dhk.b $$5, dhk.c $$6) {
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

   public dhk d() {
      return this.t;
   }

   public CompletableFuture<Either<dhf, ajz.a>> a(
      Executor $$0, akr $$1, dhg $$2, dzc $$3, aku $$4, Function<dhf, CompletableFuture<Either<dhf, ajz.a>>> $$5, List<dhf> $$6
   ) {
      dhf $$7 = $$6.get($$6.size() / 2);
      bdy $$8 = bdv.e.a($$7.f(), $$1.ac(), this.toString());
      return this.u.doWork(this, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7).thenApply($$1x -> {
         $$1x.ifLeft($$0xx -> {
            if ($$0xx instanceof dia $$1xx && !$$1xx.j().b(this)) {
               $$1xx.a(this);
            }
         });
         if ($$8 != null) {
            $$8.finish();
         }

         return $$1x;
      });
   }

   public CompletableFuture<Either<dhf, ajz.a>> a(akr $$0, dzc $$1, aku $$2, Function<dhf, CompletableFuture<Either<dhf, ajz.a>>> $$3, dhf $$4) {
      return this.v.doWork(this, $$0, $$1, $$2, $$3, $$4);
   }

   public int e() {
      return this.w;
   }

   public boolean f() {
      return this.x;
   }

   public dhk.a g() {
      return this.y;
   }

   public static dhk a(String $$0) {
      return jd.o.a(aex.a($$0));
   }

   public EnumSet<dks.a> h() {
      return this.z;
   }

   public boolean b(dhk $$0) {
      return this.c() >= $$0.c();
   }

   @Override
   public String toString() {
      return jd.o.b(this).toString();
   }

   public static enum a {
      a,
      b;
   }

   interface b {
      CompletableFuture<Either<dhf, ajz.a>> doWork(
         dhk var1, Executor var2, akr var3, dhg var4, dzc var5, aku var6, Function<dhf, CompletableFuture<Either<dhf, ajz.a>>> var7, List<dhf> var8, dhf var9
      );
   }

   interface c {
      CompletableFuture<Either<dhf, ajz.a>> doWork(dhk var1, akr var2, dzc var3, aku var4, Function<dhf, CompletableFuture<Either<dhf, ajz.a>>> var5, dhf var6);
   }

   interface d extends dhk.b {
      @Override
      default CompletableFuture<Either<dhf, ajz.a>> doWork(
         dhk $$0, Executor $$1, akr $$2, dhg $$3, dzc $$4, aku $$5, Function<dhf, CompletableFuture<Either<dhf, ajz.a>>> $$6, List<dhf> $$7, dhf $$8
      ) {
         this.doWork($$0, $$2, $$3, $$7, $$8);
         return CompletableFuture.completedFuture(Either.left($$8));
      }

      void doWork(dhk var1, akr var2, dhg var3, List<dhf> var4, dhf var5);
   }
}
