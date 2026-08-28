import com.google.common.collect.ImmutableList;
import java.util.List;
import javax.annotation.Nullable;

public class fni implements fnj {
   private static final alh a = alh.b("toast/system");
   private static final int e = 200;
   private static final int f = 12;
   private static final int g = 10;
   private final fni.a h;
   private xh i;
   private List<ayv> j;
   private long k;
   private boolean l;
   private final int m;
   private boolean n;
   private fnj.a o = fnj.a.b;

   public fni(fni.a $$0, xh $$1, @Nullable xh $$2) {
      this($$0, $$1, a($$2), Math.max(160, 30 + Math.max(fja.Q().h.a($$1), $$2 == null ? 0 : fja.Q().h.a($$2))));
   }

   public static fni a(fja $$0, fni.a $$1, xh $$2, xh $$3) {
      fkk $$4 = $$0.h;
      List<ayv> $$5 = $$4.c($$3, 200);
      int $$6 = Math.max(200, $$5.stream().mapToInt($$4::a).max().orElse(200));
      return new fni($$1, $$2, $$5, $$6 + 30);
   }

   private fni(fni.a $$0, xh $$1, List<ayv> $$2, int $$3) {
      this.h = $$0;
      this.i = $$1;
      this.j = $$2;
      this.m = $$3;
   }

   private static ImmutableList<ayv> a(@Nullable xh $$0) {
      return $$0 == null ? ImmutableList.of() : ImmutableList.of($$0.g());
   }

   @Override
   public int b() {
      return this.m;
   }

   @Override
   public int c() {
      return 20 + Math.max(this.j.size(), 1) * 12;
   }

   public void d() {
      this.n = true;
   }

   @Override
   public fnj.a a() {
      return this.o;
   }

   @Override
   public void a(fnk $$0, long $$1) {
      if (this.l) {
         this.k = $$1;
         this.l = false;
      }

      double $$2 = (double)this.h.l * $$0.d();
      long $$3 = $$1 - this.k;
      this.o = !this.n && (double)$$3 < $$2 ? fnj.a.a : fnj.a.b;
   }

   @Override
   public void a(fkm $$0, fkk $$1, long $$2) {
      int $$3 = this.b();
      if ($$3 == 160 && this.j.size() <= 1) {
         $$0.a(gig::B, a, 0, 0, $$3, this.c());
      } else {
         int $$4 = this.c();
         int $$5 = 28;
         int $$6 = Math.min(4, $$4 - 28);
         this.a($$0, $$3, 0, 0, 28);

         for (int $$7 = 28; $$7 < $$4 - $$6; $$7 += 10) {
            this.a($$0, $$3, 16, $$7, Math.min(16, $$4 - $$7 - $$6));
         }

         this.a($$0, $$3, 32 - $$6, $$4 - $$6, $$6);
      }

      if (this.j.isEmpty()) {
         $$0.a($$1, this.i, 18, 12, -256, false);
      } else {
         $$0.a($$1, this.i, 18, 7, -256, false);

         for (int $$8 = 0; $$8 < this.j.size(); $$8++) {
            $$0.a($$1, this.j.get($$8), 18, 18 + $$8 * 12, -1, false);
         }
      }
   }

   private void a(fkm $$0, int $$1, int $$2, int $$3, int $$4) {
      int $$5 = $$2 == 0 ? 20 : 5;
      int $$6 = Math.min(60, $$1 - $$5);
      alh $$7 = a;
      $$0.a(gig::B, $$7, 160, 32, 0, $$2, 0, $$3, $$5, $$4);

      for (int $$8 = $$5; $$8 < $$1 - $$6; $$8 += 64) {
         $$0.a(gig::B, $$7, 160, 32, 32, $$2, $$8, $$3, Math.min(64, $$1 - $$8 - $$6), $$4);
      }

      $$0.a(gig::B, $$7, 160, 32, 160 - $$6, $$2, $$1 - $$6, $$3, $$6, $$4);
   }

   public void a(xh $$0, @Nullable xh $$1) {
      this.i = $$0;
      this.j = a($$1);
      this.l = true;
   }

   public fni.a e() {
      return this.h;
   }

   public static void a(fnk $$0, fni.a $$1, xh $$2, @Nullable xh $$3) {
      $$0.a(new fni($$1, $$2, $$3));
   }

   public static void b(fnk $$0, fni.a $$1, xh $$2, @Nullable xh $$3) {
      fni $$4 = $$0.a(fni.class, $$1);
      if ($$4 == null) {
         a($$0, $$1, $$2, $$3);
      } else {
         $$4.a($$2, $$3);
      }
   }

   public static void a(fnk $$0, fni.a $$1) {
      fni $$2 = $$0.a(fni.class, $$1);
      if ($$2 != null) {
         $$2.d();
      }
   }

   public static void a(fja $$0, String $$1) {
      a($$0.aA(), fni.a.d, xh.c("selectWorld.access_failure"), xh.b($$1));
   }

   public static void b(fja $$0, String $$1) {
      a($$0.aA(), fni.a.d, xh.c("selectWorld.delete_failure"), xh.b($$1));
   }

   public static void c(fja $$0, String $$1) {
      a($$0.aA(), fni.a.e, xh.c("pack.copyFailure"), xh.b($$1));
   }

   public static void a(fja $$0, int $$1) {
      a($$0.aA(), fni.a.f, xh.c("gui.fileDropFailure.title"), xh.a("gui.fileDropFailure.detail", $$1));
   }

   public static void a(fja $$0) {
      b($$0.aA(), fni.a.h, xh.c("chunk.toast.lowDiskSpace"), xh.c("chunk.toast.lowDiskSpace.description"));
   }

   public static void a(fja $$0, deb $$1) {
      b($$0.aA(), fni.a.i, xh.a("chunk.toast.loadFailure", xh.a($$1)).a(n.m), xh.c("chunk.toast.checkLog"));
   }

   public static void b(fja $$0, deb $$1) {
      b($$0.aA(), fni.a.j, xh.a("chunk.toast.saveFailure", xh.a($$1)).a(n.m), xh.c("chunk.toast.checkLog"));
   }

   public static class a {
      public static final fni.a a = new fni.a();
      public static final fni.a b = new fni.a();
      public static final fni.a c = new fni.a();
      public static final fni.a d = new fni.a();
      public static final fni.a e = new fni.a();
      public static final fni.a f = new fni.a();
      public static final fni.a g = new fni.a();
      public static final fni.a h = new fni.a(10000L);
      public static final fni.a i = new fni.a();
      public static final fni.a j = new fni.a();
      public static final fni.a k = new fni.a(10000L);
      final long l;

      public a(long $$0) {
         this.l = $$0;
      }

      public a() {
         this(5000L);
      }
   }
}
