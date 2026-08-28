import com.google.common.collect.ImmutableList;
import java.util.List;
import javax.annotation.Nullable;

public class fjl implements fjm {
   private static final ale a = new ale("toast/system");
   private static final int d = 200;
   private static final int e = 12;
   private static final int f = 10;
   private final fjl.a g;
   private xo h;
   private List<ayk> i;
   private long j;
   private boolean k;
   private final int l;
   private boolean m;

   public fjl(fjl.a $$0, xo $$1, @Nullable xo $$2) {
      this($$0, $$1, a($$2), Math.max(160, 30 + Math.max(ffe.Q().h.a($$1), $$2 == null ? 0 : ffe.Q().h.a($$2))));
   }

   public static fjl a(ffe $$0, fjl.a $$1, xo $$2, xo $$3) {
      fgo $$4 = $$0.h;
      List<ayk> $$5 = $$4.c($$3, 200);
      int $$6 = Math.max(200, $$5.stream().mapToInt($$4::a).max().orElse(200));
      return new fjl($$1, $$2, $$5, $$6 + 30);
   }

   private fjl(fjl.a $$0, xo $$1, List<ayk> $$2, int $$3) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
      this.l = $$3;
   }

   private static ImmutableList<ayk> a(@Nullable xo $$0) {
      return $$0 == null ? ImmutableList.of() : ImmutableList.of($$0.g());
   }

   @Override
   public int a() {
      return this.l;
   }

   @Override
   public int b() {
      return 20 + Math.max(this.i.size(), 1) * 12;
   }

   public void c() {
      this.m = true;
   }

   @Override
   public fjm.a a(fgq $$0, fjn $$1, long $$2) {
      if (this.k) {
         this.j = $$2;
         this.k = false;
      }

      int $$3 = this.a();
      if ($$3 == 160 && this.i.size() <= 1) {
         $$0.a(a, 0, 0, $$3, this.b());
      } else {
         int $$4 = this.b();
         int $$5 = 28;
         int $$6 = Math.min(4, $$4 - 28);
         this.a($$0, $$3, 0, 0, 28);

         for (int $$7 = 28; $$7 < $$4 - $$6; $$7 += 10) {
            this.a($$0, $$3, 16, $$7, Math.min(16, $$4 - $$7 - $$6));
         }

         this.a($$0, $$3, 32 - $$6, $$4 - $$6, $$6);
      }

      if (this.i.isEmpty()) {
         $$0.a($$1.b().h, this.h, 18, 12, -256, false);
      } else {
         $$0.a($$1.b().h, this.h, 18, 7, -256, false);

         for (int $$8 = 0; $$8 < this.i.size(); $$8++) {
            $$0.a($$1.b().h, this.i.get($$8), 18, 18 + $$8 * 12, -1, false);
         }
      }

      double $$9 = (double)this.g.k * $$1.c();
      long $$10 = $$2 - this.j;
      return !this.m && (double)$$10 < $$9 ? fjm.a.a : fjm.a.b;
   }

   private void a(fgq $$0, int $$1, int $$2, int $$3, int $$4) {
      int $$5 = $$2 == 0 ? 20 : 5;
      int $$6 = Math.min(60, $$1 - $$5);
      ale $$7 = a;
      $$0.a($$7, 160, 32, 0, $$2, 0, $$3, $$5, $$4);

      for (int $$8 = $$5; $$8 < $$1 - $$6; $$8 += 64) {
         $$0.a($$7, 160, 32, 32, $$2, $$8, $$3, Math.min(64, $$1 - $$8 - $$6), $$4);
      }

      $$0.a($$7, 160, 32, 160 - $$6, $$2, $$1 - $$6, $$3, $$6, $$4);
   }

   public void a(xo $$0, @Nullable xo $$1) {
      this.h = $$0;
      this.i = a($$1);
      this.k = true;
   }

   public fjl.a d() {
      return this.g;
   }

   public static void a(fjn $$0, fjl.a $$1, xo $$2, @Nullable xo $$3) {
      $$0.a(new fjl($$1, $$2, $$3));
   }

   public static void b(fjn $$0, fjl.a $$1, xo $$2, @Nullable xo $$3) {
      fjl $$4 = $$0.a(fjl.class, $$1);
      if ($$4 == null) {
         a($$0, $$1, $$2, $$3);
      } else {
         $$4.a($$2, $$3);
      }
   }

   public static void a(fjn $$0, fjl.a $$1) {
      fjl $$2 = $$0.a(fjl.class, $$1);
      if ($$2 != null) {
         $$2.c();
      }
   }

   public static void a(ffe $$0, String $$1) {
      a($$0.ax(), fjl.a.d, xo.c("selectWorld.access_failure"), xo.b($$1));
   }

   public static void b(ffe $$0, String $$1) {
      a($$0.ax(), fjl.a.d, xo.c("selectWorld.delete_failure"), xo.b($$1));
   }

   public static void c(ffe $$0, String $$1) {
      a($$0.ax(), fjl.a.e, xo.c("pack.copyFailure"), xo.b($$1));
   }

   public static void a(ffe $$0) {
      b($$0.ax(), fjl.a.g, xo.c("chunk.toast.lowDiskSpace"), xo.c("chunk.toast.lowDiskSpace.description"));
   }

   public static void a(ffe $$0, dbe $$1) {
      b($$0.ax(), fjl.a.h, xo.a("chunk.toast.loadFailure", $$1).a(n.m), xo.c("chunk.toast.checkLog"));
   }

   public static void b(ffe $$0, dbe $$1) {
      b($$0.ax(), fjl.a.i, xo.a("chunk.toast.saveFailure", $$1).a(n.m), xo.c("chunk.toast.checkLog"));
   }

   public static class a {
      public static final fjl.a a = new fjl.a();
      public static final fjl.a b = new fjl.a();
      public static final fjl.a c = new fjl.a();
      public static final fjl.a d = new fjl.a();
      public static final fjl.a e = new fjl.a();
      public static final fjl.a f = new fjl.a();
      public static final fjl.a g = new fjl.a(10000L);
      public static final fjl.a h = new fjl.a();
      public static final fjl.a i = new fjl.a();
      public static final fjl.a j = new fjl.a(10000L);
      final long k;

      public a(long $$0) {
         this.k = $$0;
      }

      public a() {
         this(5000L);
      }
   }
}
