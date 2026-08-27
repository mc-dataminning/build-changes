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

public class dkq {
   public static final int a = 8;
   private static final EnumSet<dny.a> o = EnumSet.of(dny.a.c, dny.a.a);
   public static final EnumSet<dny.a> b = EnumSet.of(dny.a.d, dny.a.b, dny.a.e, dny.a.f);
   private static final dkq.c p = ($$0, $$1, $$2, $$3, $$4, $$5) -> CompletableFuture.completedFuture(Either.left($$5));
   public static final dkq c = a("empty", null, -1, o, dkq.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
   });
   public static final dkq d = a("structure_starts", c, 0, false, o, dkq.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      if ($$2.n().aY().A().c()) {
         $$3.a($$2.I_(), $$2.k().h(), $$2.a(), $$8, $$4);
      }

      $$2.a($$8);
      return CompletableFuture.completedFuture(Either.left($$8));
   }, ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      $$1.a($$5);
      return CompletableFuture.completedFuture(Either.left($$5));
   });
   public static final dkq e = a("structure_references", d, 8, o, dkq.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      amw $$5 = new amw($$1, $$3, $$0, -1);
      $$2.a($$5, $$1.a().a($$5), $$4);
   });
   public static final dkq f = a("biomes", e, 8, o, dkq.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      amw $$9 = new amw($$2, $$7, $$0, -1);
      return $$3.a($$1, $$2.k().i(), dpa.a($$9), $$2.a().a($$9), $$8).thenApply($$0x -> Either.left($$0x));
   });
   public static final dkq g = a("noise", f, 8, o, dkq.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> {
      amw $$9 = new amw($$2, $$7, $$0, 0);
      return $$3.a($$1, dpa.a($$9), $$2.k().i(), $$2.a().a($$9), $$8).thenApply($$0x -> {
         if ($$0x instanceof dlg $$1x) {
            dnm $$2x = $$1x.x();
            if ($$2x != null) {
               dnm.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return Either.left($$0x);
      });
   });
   public static final dkq h = a("surface", g, 8, o, dkq.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      amw $$5 = new amw($$1, $$3, $$0, 0);
      $$2.a($$5, $$1.a().a($$5), $$1.k().i(), $$4);
   });
   public static final dkq i = a("carvers", h, 8, b, dkq.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      amw $$5 = new amw($$1, $$3, $$0, 0);
      if ($$4 instanceof dlg $$6) {
         dpa.a($$5, $$6);
      }

      $$2.a($$5, $$1.B(), $$1.k().i(), $$1.G_(), $$1.a().a($$5), $$4, dnu.a.a);
   });
   public static final dkq j = a("features", i, 8, b, dkq.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      dny.a($$4, EnumSet.of(dny.a.e, dny.a.f, dny.a.d, dny.a.b));
      amw $$5 = new amw($$1, $$3, $$0, 1);
      $$2.a($$5, $$4, $$1.a().a($$5));
      dpa.a($$5, $$4);
   });
   public static final dkq k = a(
      "initialize_light", j, 0, false, b, dkq.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> a($$5, $$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$3, $$5)
   );
   public static final dkq l = a(
      "light", k, 1, true, b, dkq.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> b($$5, $$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> b($$3, $$5)
   );
   public static final dkq m = a("spawn", l, 0, b, dkq.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      if (!$$4.y()) {
         $$2.a(new amw($$1, $$3, $$0, -1));
      }
   });
   public static final dkq n = a(
      "full", m, 0, false, b, dkq.a.b, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> $$6.apply($$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> $$4.apply($$5)
   );
   private static final List<dkq> q = ImmutableList.of(n, k, i, f, d, d, d, d, d, d, d, d, new dkq[0]);
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
   private final dkq t;
   private final dkq.b u;
   private final dkq.c v;
   private final int w;
   private final boolean x;
   private final dkq.a y;
   private final EnumSet<dny.a> z;

   private static CompletableFuture<Either<dkl, alx.a>> a(ams $$0, dkl $$1) {
      $$1.A();
      ((dlg)$$1).a($$0);
      boolean $$2 = a($$1);
      return $$0.a($$1, $$2).thenApply(Either::left);
   }

   private static CompletableFuture<Either<dkl, alx.a>> b(ams $$0, dkl $$1) {
      boolean $$2 = a($$1);
      return $$0.b($$1, $$2).thenApply(Either::left);
   }

   private static dkq a(String $$0, @Nullable dkq $$1, int $$2, EnumSet<dny.a> $$3, dkq.a $$4, dkq.d $$5) {
      return a($$0, $$1, $$2, $$3, $$4, (dkq.b)$$5);
   }

   private static dkq a(String $$0, @Nullable dkq $$1, int $$2, EnumSet<dny.a> $$3, dkq.a $$4, dkq.b $$5) {
      return a($$0, $$1, $$2, false, $$3, $$4, $$5, p);
   }

   private static dkq a(String $$0, @Nullable dkq $$1, int $$2, boolean $$3, EnumSet<dny.a> $$4, dkq.a $$5, dkq.b $$6, dkq.c $$7) {
      return ir.a(kb.n, $$0, new dkq($$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public static List<dkq> a() {
      List<dkq> $$0 = Lists.newArrayList();

      dkq $$1;
      for ($$1 = n; $$1.d() != $$1; $$1 = $$1.d()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   private static boolean a(dkl $$0) {
      return $$0.j().b(l) && $$0.v();
   }

   public static dkq a(int $$0) {
      if ($$0 >= q.size()) {
         return c;
      } else {
         return $$0 < 0 ? n : q.get($$0);
      }
   }

   public static int b() {
      return q.size();
   }

   public static int a(dkq $$0) {
      return r.getInt($$0.c());
   }

   dkq(@Nullable dkq $$0, int $$1, boolean $$2, EnumSet<dny.a> $$3, dkq.a $$4, dkq.b $$5, dkq.c $$6) {
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

   public dkq d() {
      return this.t;
   }

   public CompletableFuture<Either<dkl, alx.a>> a(
      Executor $$0, amp $$1, dkm $$2, ecp $$3, ams $$4, Function<dkl, CompletableFuture<Either<dkl, alx.a>>> $$5, List<dkl> $$6
   ) {
      dkl $$7 = $$6.get($$6.size() / 2);
      bgl $$8 = bgi.e.a($$7.f(), $$1.ad(), this.toString());
      return this.u.doWork(this, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7).thenApply($$1x -> {
         $$1x.ifLeft($$0xx -> {
            if ($$0xx instanceof dlg $$1xx && !$$1xx.j().b(this)) {
               $$1xx.a(this);
            }
         });
         if ($$8 != null) {
            $$8.finish();
         }

         return $$1x;
      });
   }

   public CompletableFuture<Either<dkl, alx.a>> a(amp $$0, ecp $$1, ams $$2, Function<dkl, CompletableFuture<Either<dkl, alx.a>>> $$3, dkl $$4) {
      return this.v.doWork(this, $$0, $$1, $$2, $$3, $$4);
   }

   public int e() {
      return this.w;
   }

   public boolean f() {
      return this.x;
   }

   public dkq.a g() {
      return this.y;
   }

   public static dkq a(String $$0) {
      return kb.n.a(agt.a($$0));
   }

   public EnumSet<dny.a> h() {
      return this.z;
   }

   public boolean b(dkq $$0) {
      return this.c() >= $$0.c();
   }

   @Override
   public String toString() {
      return kb.n.b(this).toString();
   }

   public static enum a {
      a,
      b;
   }

   interface b {
      CompletableFuture<Either<dkl, alx.a>> doWork(
         dkq var1, Executor var2, amp var3, dkm var4, ecp var5, ams var6, Function<dkl, CompletableFuture<Either<dkl, alx.a>>> var7, List<dkl> var8, dkl var9
      );
   }

   interface c {
      CompletableFuture<Either<dkl, alx.a>> doWork(dkq var1, amp var2, ecp var3, ams var4, Function<dkl, CompletableFuture<Either<dkl, alx.a>>> var5, dkl var6);
   }

   interface d extends dkq.b {
      @Override
      default CompletableFuture<Either<dkl, alx.a>> doWork(
         dkq $$0, Executor $$1, amp $$2, dkm $$3, ecp $$4, ams $$5, Function<dkl, CompletableFuture<Either<dkl, alx.a>>> $$6, List<dkl> $$7, dkl $$8
      ) {
         this.doWork($$0, $$2, $$3, $$7, $$8);
         return CompletableFuture.completedFuture(Either.left($$8));
      }

      void doWork(dkq var1, amp var2, dkm var3, List<dkl> var4, dkl var5);
   }
}
