import com.google.common.collect.ImmutableList;
import java.util.List;
import javax.annotation.Nullable;

public class fko implements fkp {
   private static final akq a = akq.b("toast/system");
   private static final int d = 200;
   private static final int e = 12;
   private static final int f = 10;
   private final fko.a g;
   private wy h;
   private List<axz> i;
   private long j;
   private boolean k;
   private final int l;
   private boolean m;

   public fko(fko.a $$0, wy $$1, @Nullable wy $$2) {
      this($$0, $$1, a($$2), Math.max(160, 30 + Math.max(fgi.Q().h.a($$1), $$2 == null ? 0 : fgi.Q().h.a($$2))));
   }

   public static fko a(fgi $$0, fko.a $$1, wy $$2, wy $$3) {
      fhr $$4 = $$0.h;
      List<axz> $$5 = $$4.c($$3, 200);
      int $$6 = Math.max(200, $$5.stream().mapToInt($$4::a).max().orElse(200));
      return new fko($$1, $$2, $$5, $$6 + 30);
   }

   private fko(fko.a $$0, wy $$1, List<axz> $$2, int $$3) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
      this.l = $$3;
   }

   private static ImmutableList<axz> a(@Nullable wy $$0) {
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
   public fkp.a a(fht $$0, fkq $$1, long $$2) {
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
      return !this.m && (double)$$10 < $$9 ? fkp.a.a : fkp.a.b;
   }

   private void a(fht $$0, int $$1, int $$2, int $$3, int $$4) {
      int $$5 = $$2 == 0 ? 20 : 5;
      int $$6 = Math.min(60, $$1 - $$5);
      akq $$7 = a;
      $$0.a($$7, 160, 32, 0, $$2, 0, $$3, $$5, $$4);

      for (int $$8 = $$5; $$8 < $$1 - $$6; $$8 += 64) {
         $$0.a($$7, 160, 32, 32, $$2, $$8, $$3, Math.min(64, $$1 - $$8 - $$6), $$4);
      }

      $$0.a($$7, 160, 32, 160 - $$6, $$2, $$1 - $$6, $$3, $$6, $$4);
   }

   public void a(wy $$0, @Nullable wy $$1) {
      this.h = $$0;
      this.i = a($$1);
      this.k = true;
   }

   public fko.a d() {
      return this.g;
   }

   public static void a(fkq $$0, fko.a $$1, wy $$2, @Nullable wy $$3) {
      $$0.a(new fko($$1, $$2, $$3));
   }

   public static void b(fkq $$0, fko.a $$1, wy $$2, @Nullable wy $$3) {
      fko $$4 = $$0.a(fko.class, $$1);
      if ($$4 == null) {
         a($$0, $$1, $$2, $$3);
      } else {
         $$4.a($$2, $$3);
      }
   }

   public static void a(fkq $$0, fko.a $$1) {
      fko $$2 = $$0.a(fko.class, $$1);
      if ($$2 != null) {
         $$2.c();
      }
   }

   public static void a(fgi $$0, String $$1) {
      a($$0.aw(), fko.a.d, wy.c("selectWorld.access_failure"), wy.b($$1));
   }

   public static void b(fgi $$0, String $$1) {
      a($$0.aw(), fko.a.d, wy.c("selectWorld.delete_failure"), wy.b($$1));
   }

   public static void c(fgi $$0, String $$1) {
      a($$0.aw(), fko.a.e, wy.c("pack.copyFailure"), wy.b($$1));
   }

   public static void a(fgi $$0, int $$1) {
      a($$0.aw(), fko.a.f, wy.c("gui.fileDropFailure.title"), wy.a("gui.fileDropFailure.detail", $$1));
   }

   public static void a(fgi $$0) {
      b($$0.aw(), fko.a.h, wy.c("chunk.toast.lowDiskSpace"), wy.c("chunk.toast.lowDiskSpace.description"));
   }

   public static void a(fgi $$0, dcb $$1) {
      b($$0.aw(), fko.a.i, wy.a("chunk.toast.loadFailure", $$1).a(n.m), wy.c("chunk.toast.checkLog"));
   }

   public static void b(fgi $$0, dcb $$1) {
      b($$0.aw(), fko.a.j, wy.a("chunk.toast.saveFailure", $$1).a(n.m), wy.c("chunk.toast.checkLog"));
   }

   public static class a {
      public static final fko.a a = new fko.a();
      public static final fko.a b = new fko.a();
      public static final fko.a c = new fko.a();
      public static final fko.a d = new fko.a();
      public static final fko.a e = new fko.a();
      public static final fko.a f = new fko.a();
      public static final fko.a g = new fko.a();
      public static final fko.a h = new fko.a(10000L);
      public static final fko.a i = new fko.a();
      public static final fko.a j = new fko.a();
      public static final fko.a k = new fko.a(10000L);
      final long l;

      public a(long $$0) {
         this.l = $$0;
      }

      public a() {
         this(5000L);
      }
   }
}
