import com.google.common.collect.ImmutableList;
import java.util.List;
import javax.annotation.Nullable;

public class fku implements fkv {
   private static final akr a = akr.b("toast/system");
   private static final int d = 200;
   private static final int e = 12;
   private static final int f = 10;
   private final fku.a g;
   private wz h;
   private List<aya> i;
   private long j;
   private boolean k;
   private final int l;
   private boolean m;

   public fku(fku.a $$0, wz $$1, @Nullable wz $$2) {
      this($$0, $$1, a($$2), Math.max(160, 30 + Math.max(fgo.Q().h.a($$1), $$2 == null ? 0 : fgo.Q().h.a($$2))));
   }

   public static fku a(fgo $$0, fku.a $$1, wz $$2, wz $$3) {
      fhx $$4 = $$0.h;
      List<aya> $$5 = $$4.c($$3, 200);
      int $$6 = Math.max(200, $$5.stream().mapToInt($$4::a).max().orElse(200));
      return new fku($$1, $$2, $$5, $$6 + 30);
   }

   private fku(fku.a $$0, wz $$1, List<aya> $$2, int $$3) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
      this.l = $$3;
   }

   private static ImmutableList<aya> a(@Nullable wz $$0) {
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
   public fkv.a a(fhz $$0, fkw $$1, long $$2) {
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

      double $$9 = (double)this.g.l * $$1.c();
      long $$10 = $$2 - this.j;
      return !this.m && (double)$$10 < $$9 ? fkv.a.a : fkv.a.b;
   }

   private void a(fhz $$0, int $$1, int $$2, int $$3, int $$4) {
      int $$5 = $$2 == 0 ? 20 : 5;
      int $$6 = Math.min(60, $$1 - $$5);
      akr $$7 = a;
      $$0.a($$7, 160, 32, 0, $$2, 0, $$3, $$5, $$4);

      for (int $$8 = $$5; $$8 < $$1 - $$6; $$8 += 64) {
         $$0.a($$7, 160, 32, 32, $$2, $$8, $$3, Math.min(64, $$1 - $$8 - $$6), $$4);
      }

      $$0.a($$7, 160, 32, 160 - $$6, $$2, $$1 - $$6, $$3, $$6, $$4);
   }

   public void a(wz $$0, @Nullable wz $$1) {
      this.h = $$0;
      this.i = a($$1);
      this.k = true;
   }

   public fku.a d() {
      return this.g;
   }

   public static void a(fkw $$0, fku.a $$1, wz $$2, @Nullable wz $$3) {
      $$0.a(new fku($$1, $$2, $$3));
   }

   public static void b(fkw $$0, fku.a $$1, wz $$2, @Nullable wz $$3) {
      fku $$4 = $$0.a(fku.class, $$1);
      if ($$4 == null) {
         a($$0, $$1, $$2, $$3);
      } else {
         $$4.a($$2, $$3);
      }
   }

   public static void a(fkw $$0, fku.a $$1) {
      fku $$2 = $$0.a(fku.class, $$1);
      if ($$2 != null) {
         $$2.c();
      }
   }

   public static void a(fgo $$0, String $$1) {
      a($$0.aw(), fku.a.d, wz.c("selectWorld.access_failure"), wz.b($$1));
   }

   public static void b(fgo $$0, String $$1) {
      a($$0.aw(), fku.a.d, wz.c("selectWorld.delete_failure"), wz.b($$1));
   }

   public static void c(fgo $$0, String $$1) {
      a($$0.aw(), fku.a.e, wz.c("pack.copyFailure"), wz.b($$1));
   }

   public static void a(fgo $$0, int $$1) {
      a($$0.aw(), fku.a.f, wz.c("gui.fileDropFailure.title"), wz.a("gui.fileDropFailure.detail", $$1));
   }

   public static void a(fgo $$0) {
      b($$0.aw(), fku.a.h, wz.c("chunk.toast.lowDiskSpace"), wz.c("chunk.toast.lowDiskSpace.description"));
   }

   public static void a(fgo $$0, dcd $$1) {
      b($$0.aw(), fku.a.i, wz.a("chunk.toast.loadFailure", wz.a($$1)).a(n.m), wz.c("chunk.toast.checkLog"));
   }

   public static void b(fgo $$0, dcd $$1) {
      b($$0.aw(), fku.a.j, wz.a("chunk.toast.saveFailure", wz.a($$1)).a(n.m), wz.c("chunk.toast.checkLog"));
   }

   public static class a {
      public static final fku.a a = new fku.a();
      public static final fku.a b = new fku.a();
      public static final fku.a c = new fku.a();
      public static final fku.a d = new fku.a();
      public static final fku.a e = new fku.a();
      public static final fku.a f = new fku.a();
      public static final fku.a g = new fku.a();
      public static final fku.a h = new fku.a(10000L);
      public static final fku.a i = new fku.a();
      public static final fku.a j = new fku.a();
      public static final fku.a k = new fku.a(10000L);
      final long l;

      public a(long $$0) {
         this.l = $$0;
      }

      public a() {
         this(5000L);
      }
   }
}
