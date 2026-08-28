import com.google.common.collect.ImmutableList;
import java.util.List;
import javax.annotation.Nullable;

public class fmj implements fmk {
   private static final alb a = alb.b("toast/system");
   private static final int e = 200;
   private static final int f = 12;
   private static final int g = 10;
   private final fmj.a h;
   private xd i;
   private List<ayo> j;
   private long k;
   private boolean l;
   private final int m;
   private boolean n;
   private fmk.a o = fmk.a.b;

   public fmj(fmj.a $$0, xd $$1, @Nullable xd $$2) {
      this($$0, $$1, a($$2), Math.max(160, 30 + Math.max(fib.Q().h.a($$1), $$2 == null ? 0 : fib.Q().h.a($$2))));
   }

   public static fmj a(fib $$0, fmj.a $$1, xd $$2, xd $$3) {
      fjl $$4 = $$0.h;
      List<ayo> $$5 = $$4.c($$3, 200);
      int $$6 = Math.max(200, $$5.stream().mapToInt($$4::a).max().orElse(200));
      return new fmj($$1, $$2, $$5, $$6 + 30);
   }

   private fmj(fmj.a $$0, xd $$1, List<ayo> $$2, int $$3) {
      this.h = $$0;
      this.i = $$1;
      this.j = $$2;
      this.m = $$3;
   }

   private static ImmutableList<ayo> a(@Nullable xd $$0) {
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
   public fmk.a a() {
      return this.o;
   }

   @Override
   public void a(fml $$0, long $$1) {
      if (this.l) {
         this.k = $$1;
         this.l = false;
      }

      double $$2 = (double)this.h.l * $$0.d();
      long $$3 = $$1 - this.k;
      this.o = !this.n && (double)$$3 < $$2 ? fmk.a.a : fmk.a.b;
   }

   @Override
   public void a(fjn $$0, fjl $$1, long $$2) {
      int $$3 = this.b();
      if ($$3 == 160 && this.j.size() <= 1) {
         $$0.a(ghe::C, a, 0, 0, $$3, this.c());
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

   private void a(fjn $$0, int $$1, int $$2, int $$3, int $$4) {
      int $$5 = $$2 == 0 ? 20 : 5;
      int $$6 = Math.min(60, $$1 - $$5);
      alb $$7 = a;
      $$0.a(ghe::C, $$7, 160, 32, 0, $$2, 0, $$3, $$5, $$4);

      for (int $$8 = $$5; $$8 < $$1 - $$6; $$8 += 64) {
         $$0.a(ghe::C, $$7, 160, 32, 32, $$2, $$8, $$3, Math.min(64, $$1 - $$8 - $$6), $$4);
      }

      $$0.a(ghe::C, $$7, 160, 32, 160 - $$6, $$2, $$1 - $$6, $$3, $$6, $$4);
   }

   public void a(xd $$0, @Nullable xd $$1) {
      this.i = $$0;
      this.j = a($$1);
      this.l = true;
   }

   public fmj.a e() {
      return this.h;
   }

   public static void a(fml $$0, fmj.a $$1, xd $$2, @Nullable xd $$3) {
      $$0.a(new fmj($$1, $$2, $$3));
   }

   public static void b(fml $$0, fmj.a $$1, xd $$2, @Nullable xd $$3) {
      fmj $$4 = $$0.a(fmj.class, $$1);
      if ($$4 == null) {
         a($$0, $$1, $$2, $$3);
      } else {
         $$4.a($$2, $$3);
      }
   }

   public static void a(fml $$0, fmj.a $$1) {
      fmj $$2 = $$0.a(fmj.class, $$1);
      if ($$2 != null) {
         $$2.d();
      }
   }

   public static void a(fib $$0, String $$1) {
      a($$0.az(), fmj.a.d, xd.c("selectWorld.access_failure"), xd.b($$1));
   }

   public static void b(fib $$0, String $$1) {
      a($$0.az(), fmj.a.d, xd.c("selectWorld.delete_failure"), xd.b($$1));
   }

   public static void c(fib $$0, String $$1) {
      a($$0.az(), fmj.a.e, xd.c("pack.copyFailure"), xd.b($$1));
   }

   public static void a(fib $$0, int $$1) {
      a($$0.az(), fmj.a.f, xd.c("gui.fileDropFailure.title"), xd.a("gui.fileDropFailure.detail", $$1));
   }

   public static void a(fib $$0) {
      b($$0.az(), fmj.a.h, xd.c("chunk.toast.lowDiskSpace"), xd.c("chunk.toast.lowDiskSpace.description"));
   }

   public static void a(fib $$0, dcy $$1) {
      b($$0.az(), fmj.a.i, xd.a("chunk.toast.loadFailure", xd.a($$1)).a(n.m), xd.c("chunk.toast.checkLog"));
   }

   public static void b(fib $$0, dcy $$1) {
      b($$0.az(), fmj.a.j, xd.a("chunk.toast.saveFailure", xd.a($$1)).a(n.m), xd.c("chunk.toast.checkLog"));
   }

   public static class a {
      public static final fmj.a a = new fmj.a();
      public static final fmj.a b = new fmj.a();
      public static final fmj.a c = new fmj.a();
      public static final fmj.a d = new fmj.a();
      public static final fmj.a e = new fmj.a();
      public static final fmj.a f = new fmj.a();
      public static final fmj.a g = new fmj.a();
      public static final fmj.a h = new fmj.a(10000L);
      public static final fmj.a i = new fmj.a();
      public static final fmj.a j = new fmj.a();
      public static final fmj.a k = new fmj.a(10000L);
      final long l;

      public a(long $$0) {
         this.l = $$0;
      }

      public a() {
         this(5000L);
      }
   }
}
