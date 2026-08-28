import com.google.common.collect.ImmutableList;
import java.util.List;
import javax.annotation.Nullable;

public class fmx implements fmy {
   private static final ale a = ale.b("toast/system");
   private static final int e = 200;
   private static final int f = 12;
   private static final int g = 10;
   private final fmx.a h;
   private xe i;
   private List<ayr> j;
   private long k;
   private boolean l;
   private final int m;
   private boolean n;
   private fmy.a o = fmy.a.b;

   public fmx(fmx.a $$0, xe $$1, @Nullable xe $$2) {
      this($$0, $$1, a($$2), Math.max(160, 30 + Math.max(fip.Q().h.a($$1), $$2 == null ? 0 : fip.Q().h.a($$2))));
   }

   public static fmx a(fip $$0, fmx.a $$1, xe $$2, xe $$3) {
      fjz $$4 = $$0.h;
      List<ayr> $$5 = $$4.c($$3, 200);
      int $$6 = Math.max(200, $$5.stream().mapToInt($$4::a).max().orElse(200));
      return new fmx($$1, $$2, $$5, $$6 + 30);
   }

   private fmx(fmx.a $$0, xe $$1, List<ayr> $$2, int $$3) {
      this.h = $$0;
      this.i = $$1;
      this.j = $$2;
      this.m = $$3;
   }

   private static ImmutableList<ayr> a(@Nullable xe $$0) {
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
   public fmy.a a() {
      return this.o;
   }

   @Override
   public void a(fmz $$0, long $$1) {
      if (this.l) {
         this.k = $$1;
         this.l = false;
      }

      double $$2 = (double)this.h.l * $$0.d();
      long $$3 = $$1 - this.k;
      this.o = !this.n && (double)$$3 < $$2 ? fmy.a.a : fmy.a.b;
   }

   @Override
   public void a(fkb $$0, fjz $$1, long $$2) {
      int $$3 = this.b();
      if ($$3 == 160 && this.j.size() <= 1) {
         $$0.a(ghv::B, a, 0, 0, $$3, this.c());
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

   private void a(fkb $$0, int $$1, int $$2, int $$3, int $$4) {
      int $$5 = $$2 == 0 ? 20 : 5;
      int $$6 = Math.min(60, $$1 - $$5);
      ale $$7 = a;
      $$0.a(ghv::B, $$7, 160, 32, 0, $$2, 0, $$3, $$5, $$4);

      for (int $$8 = $$5; $$8 < $$1 - $$6; $$8 += 64) {
         $$0.a(ghv::B, $$7, 160, 32, 32, $$2, $$8, $$3, Math.min(64, $$1 - $$8 - $$6), $$4);
      }

      $$0.a(ghv::B, $$7, 160, 32, 160 - $$6, $$2, $$1 - $$6, $$3, $$6, $$4);
   }

   public void a(xe $$0, @Nullable xe $$1) {
      this.i = $$0;
      this.j = a($$1);
      this.l = true;
   }

   public fmx.a e() {
      return this.h;
   }

   public static void a(fmz $$0, fmx.a $$1, xe $$2, @Nullable xe $$3) {
      $$0.a(new fmx($$1, $$2, $$3));
   }

   public static void b(fmz $$0, fmx.a $$1, xe $$2, @Nullable xe $$3) {
      fmx $$4 = $$0.a(fmx.class, $$1);
      if ($$4 == null) {
         a($$0, $$1, $$2, $$3);
      } else {
         $$4.a($$2, $$3);
      }
   }

   public static void a(fmz $$0, fmx.a $$1) {
      fmx $$2 = $$0.a(fmx.class, $$1);
      if ($$2 != null) {
         $$2.d();
      }
   }

   public static void a(fip $$0, String $$1) {
      a($$0.aA(), fmx.a.d, xe.c("selectWorld.access_failure"), xe.b($$1));
   }

   public static void b(fip $$0, String $$1) {
      a($$0.aA(), fmx.a.d, xe.c("selectWorld.delete_failure"), xe.b($$1));
   }

   public static void c(fip $$0, String $$1) {
      a($$0.aA(), fmx.a.e, xe.c("pack.copyFailure"), xe.b($$1));
   }

   public static void a(fip $$0, int $$1) {
      a($$0.aA(), fmx.a.f, xe.c("gui.fileDropFailure.title"), xe.a("gui.fileDropFailure.detail", $$1));
   }

   public static void a(fip $$0) {
      b($$0.aA(), fmx.a.h, xe.c("chunk.toast.lowDiskSpace"), xe.c("chunk.toast.lowDiskSpace.description"));
   }

   public static void a(fip $$0, ddp $$1) {
      b($$0.aA(), fmx.a.i, xe.a("chunk.toast.loadFailure", xe.a($$1)).a(n.m), xe.c("chunk.toast.checkLog"));
   }

   public static void b(fip $$0, ddp $$1) {
      b($$0.aA(), fmx.a.j, xe.a("chunk.toast.saveFailure", xe.a($$1)).a(n.m), xe.c("chunk.toast.checkLog"));
   }

   public static class a {
      public static final fmx.a a = new fmx.a();
      public static final fmx.a b = new fmx.a();
      public static final fmx.a c = new fmx.a();
      public static final fmx.a d = new fmx.a();
      public static final fmx.a e = new fmx.a();
      public static final fmx.a f = new fmx.a();
      public static final fmx.a g = new fmx.a();
      public static final fmx.a h = new fmx.a(10000L);
      public static final fmx.a i = new fmx.a();
      public static final fmx.a j = new fmx.a();
      public static final fmx.a k = new fmx.a(10000L);
      final long l;

      public a(long $$0) {
         this.l = $$0;
      }

      public a() {
         this(5000L);
      }
   }
}
