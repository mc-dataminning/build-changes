import com.google.common.collect.ImmutableList;
import java.util.List;
import javax.annotation.Nullable;

public class fof implements fog {
   private static final all a = all.b("toast/system");
   private static final int e = 200;
   private static final int f = 12;
   private static final int g = 10;
   private final fof.a h;
   private xl i;
   private List<ayz> j;
   private long k;
   private boolean l;
   private final int m;
   private boolean n;
   private fog.a o = fog.a.b;

   public fof(fof.a $$0, xl $$1, @Nullable xl $$2) {
      this($$0, $$1, a($$2), Math.max(160, 30 + Math.max(fjx.Q().h.a($$1), $$2 == null ? 0 : fjx.Q().h.a($$2))));
   }

   public static fof a(fjx $$0, fof.a $$1, xl $$2, xl $$3) {
      flh $$4 = $$0.h;
      List<ayz> $$5 = $$4.c($$3, 200);
      int $$6 = Math.max(200, $$5.stream().mapToInt($$4::a).max().orElse(200));
      return new fof($$1, $$2, $$5, $$6 + 30);
   }

   private fof(fof.a $$0, xl $$1, List<ayz> $$2, int $$3) {
      this.h = $$0;
      this.i = $$1;
      this.j = $$2;
      this.m = $$3;
   }

   private static ImmutableList<ayz> a(@Nullable xl $$0) {
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
   public fog.a a() {
      return this.o;
   }

   @Override
   public void a(foh $$0, long $$1) {
      if (this.l) {
         this.k = $$1;
         this.l = false;
      }

      double $$2 = (double)this.h.l * $$0.d();
      long $$3 = $$1 - this.k;
      this.o = !this.n && (double)$$3 < $$2 ? fog.a.a : fog.a.b;
   }

   @Override
   public void a(flj $$0, flh $$1, long $$2) {
      int $$3 = this.b();
      if ($$3 == 160 && this.j.size() <= 1) {
         $$0.a(gjh::B, a, 0, 0, $$3, this.c());
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

   private void a(flj $$0, int $$1, int $$2, int $$3, int $$4) {
      int $$5 = $$2 == 0 ? 20 : 5;
      int $$6 = Math.min(60, $$1 - $$5);
      all $$7 = a;
      $$0.a(gjh::B, $$7, 160, 32, 0, $$2, 0, $$3, $$5, $$4);

      for (int $$8 = $$5; $$8 < $$1 - $$6; $$8 += 64) {
         $$0.a(gjh::B, $$7, 160, 32, 32, $$2, $$8, $$3, Math.min(64, $$1 - $$8 - $$6), $$4);
      }

      $$0.a(gjh::B, $$7, 160, 32, 160 - $$6, $$2, $$1 - $$6, $$3, $$6, $$4);
   }

   public void a(xl $$0, @Nullable xl $$1) {
      this.i = $$0;
      this.j = a($$1);
      this.l = true;
   }

   public fof.a e() {
      return this.h;
   }

   public static void a(foh $$0, fof.a $$1, xl $$2, @Nullable xl $$3) {
      $$0.a(new fof($$1, $$2, $$3));
   }

   public static void b(foh $$0, fof.a $$1, xl $$2, @Nullable xl $$3) {
      fof $$4 = $$0.a(fof.class, $$1);
      if ($$4 == null) {
         a($$0, $$1, $$2, $$3);
      } else {
         $$4.a($$2, $$3);
      }
   }

   public static void a(foh $$0, fof.a $$1) {
      fof $$2 = $$0.a(fof.class, $$1);
      if ($$2 != null) {
         $$2.d();
      }
   }

   public static void a(fjx $$0, String $$1) {
      a($$0.aA(), fof.a.d, xl.c("selectWorld.access_failure"), xl.b($$1));
   }

   public static void b(fjx $$0, String $$1) {
      a($$0.aA(), fof.a.d, xl.c("selectWorld.delete_failure"), xl.b($$1));
   }

   public static void c(fjx $$0, String $$1) {
      a($$0.aA(), fof.a.e, xl.c("pack.copyFailure"), xl.b($$1));
   }

   public static void a(fjx $$0, int $$1) {
      a($$0.aA(), fof.a.f, xl.c("gui.fileDropFailure.title"), xl.a("gui.fileDropFailure.detail", $$1));
   }

   public static void a(fjx $$0) {
      b($$0.aA(), fof.a.h, xl.c("chunk.toast.lowDiskSpace"), xl.c("chunk.toast.lowDiskSpace.description"));
   }

   public static void a(fjx $$0, del $$1) {
      b($$0.aA(), fof.a.i, xl.a("chunk.toast.loadFailure", xl.a($$1)).a(n.m), xl.c("chunk.toast.checkLog"));
   }

   public static void b(fjx $$0, del $$1) {
      b($$0.aA(), fof.a.j, xl.a("chunk.toast.saveFailure", xl.a($$1)).a(n.m), xl.c("chunk.toast.checkLog"));
   }

   public static class a {
      public static final fof.a a = new fof.a();
      public static final fof.a b = new fof.a();
      public static final fof.a c = new fof.a();
      public static final fof.a d = new fof.a();
      public static final fof.a e = new fof.a();
      public static final fof.a f = new fof.a();
      public static final fof.a g = new fof.a();
      public static final fof.a h = new fof.a(10000L);
      public static final fof.a i = new fof.a();
      public static final fof.a j = new fof.a();
      public static final fof.a k = new fof.a(10000L);
      final long l;

      public a(long $$0) {
         this.l = $$0;
      }

      public a() {
         this(5000L);
      }
   }
}
