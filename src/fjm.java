import com.google.common.collect.ImmutableList;
import java.util.List;
import javax.annotation.Nullable;

public class fjm implements fjn {
   private static final alf a = new alf("toast/system");
   private static final int d = 200;
   private static final int e = 12;
   private static final int f = 10;
   private final fjm.a g;
   private xp h;
   private List<ayl> i;
   private long j;
   private boolean k;
   private final int l;
   private boolean m;

   public fjm(fjm.a $$0, xp $$1, @Nullable xp $$2) {
      this($$0, $$1, a($$2), Math.max(160, 30 + Math.max(fff.Q().h.a($$1), $$2 == null ? 0 : fff.Q().h.a($$2))));
   }

   public static fjm a(fff $$0, fjm.a $$1, xp $$2, xp $$3) {
      fgp $$4 = $$0.h;
      List<ayl> $$5 = $$4.c($$3, 200);
      int $$6 = Math.max(200, $$5.stream().mapToInt($$4::a).max().orElse(200));
      return new fjm($$1, $$2, $$5, $$6 + 30);
   }

   private fjm(fjm.a $$0, xp $$1, List<ayl> $$2, int $$3) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
      this.l = $$3;
   }

   private static ImmutableList<ayl> a(@Nullable xp $$0) {
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
   public fjn.a a(fgr $$0, fjo $$1, long $$2) {
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
      return !this.m && (double)$$10 < $$9 ? fjn.a.a : fjn.a.b;
   }

   private void a(fgr $$0, int $$1, int $$2, int $$3, int $$4) {
      int $$5 = $$2 == 0 ? 20 : 5;
      int $$6 = Math.min(60, $$1 - $$5);
      alf $$7 = a;
      $$0.a($$7, 160, 32, 0, $$2, 0, $$3, $$5, $$4);

      for (int $$8 = $$5; $$8 < $$1 - $$6; $$8 += 64) {
         $$0.a($$7, 160, 32, 32, $$2, $$8, $$3, Math.min(64, $$1 - $$8 - $$6), $$4);
      }

      $$0.a($$7, 160, 32, 160 - $$6, $$2, $$1 - $$6, $$3, $$6, $$4);
   }

   public void a(xp $$0, @Nullable xp $$1) {
      this.h = $$0;
      this.i = a($$1);
      this.k = true;
   }

   public fjm.a d() {
      return this.g;
   }

   public static void a(fjo $$0, fjm.a $$1, xp $$2, @Nullable xp $$3) {
      $$0.a(new fjm($$1, $$2, $$3));
   }

   public static void b(fjo $$0, fjm.a $$1, xp $$2, @Nullable xp $$3) {
      fjm $$4 = $$0.a(fjm.class, $$1);
      if ($$4 == null) {
         a($$0, $$1, $$2, $$3);
      } else {
         $$4.a($$2, $$3);
      }
   }

   public static void a(fjo $$0, fjm.a $$1) {
      fjm $$2 = $$0.a(fjm.class, $$1);
      if ($$2 != null) {
         $$2.c();
      }
   }

   public static void a(fff $$0, String $$1) {
      a($$0.ax(), fjm.a.d, xp.c("selectWorld.access_failure"), xp.b($$1));
   }

   public static void b(fff $$0, String $$1) {
      a($$0.ax(), fjm.a.d, xp.c("selectWorld.delete_failure"), xp.b($$1));
   }

   public static void c(fff $$0, String $$1) {
      a($$0.ax(), fjm.a.e, xp.c("pack.copyFailure"), xp.b($$1));
   }

   public static void a(fff $$0) {
      b($$0.ax(), fjm.a.g, xp.c("chunk.toast.lowDiskSpace"), xp.c("chunk.toast.lowDiskSpace.description"));
   }

   public static void a(fff $$0, dbf $$1) {
      b($$0.ax(), fjm.a.h, xp.a("chunk.toast.loadFailure", $$1).a(n.m), xp.c("chunk.toast.checkLog"));
   }

   public static void b(fff $$0, dbf $$1) {
      b($$0.ax(), fjm.a.i, xp.a("chunk.toast.saveFailure", $$1).a(n.m), xp.c("chunk.toast.checkLog"));
   }

   public static class a {
      public static final fjm.a a = new fjm.a();
      public static final fjm.a b = new fjm.a();
      public static final fjm.a c = new fjm.a();
      public static final fjm.a d = new fjm.a();
      public static final fjm.a e = new fjm.a();
      public static final fjm.a f = new fjm.a();
      public static final fjm.a g = new fjm.a(10000L);
      public static final fjm.a h = new fjm.a();
      public static final fjm.a i = new fjm.a();
      public static final fjm.a j = new fjm.a(10000L);
      final long k;

      public a(long $$0) {
         this.k = $$0;
      }

      public a() {
         this(5000L);
      }
   }
}
