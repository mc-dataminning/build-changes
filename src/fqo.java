import com.google.common.collect.ImmutableList;
import java.util.List;
import javax.annotation.Nullable;

public class fqo implements fqp {
   private static final alz a = alz.b("toast/system");
   private static final int e = 200;
   private static final int f = 12;
   private static final int g = 10;
   private final fqo.a h;
   private xv i;
   private List<azq> j;
   private long k;
   private boolean l;
   private final int m;
   private boolean n;
   private fqp.a o = fqp.a.b;

   public fqo(fqo.a $$0, xv $$1, @Nullable xv $$2) {
      this($$0, $$1, a($$2), Math.max(160, 30 + Math.max(fmf.Q().h.a($$1), $$2 == null ? 0 : fmf.Q().h.a($$2))));
   }

   public static fqo a(fmf $$0, fqo.a $$1, xv $$2, xv $$3) {
      fnp $$4 = $$0.h;
      List<azq> $$5 = $$4.c($$3, 200);
      int $$6 = Math.max(200, $$5.stream().mapToInt($$4::a).max().orElse(200));
      return new fqo($$1, $$2, $$5, $$6 + 30);
   }

   private fqo(fqo.a $$0, xv $$1, List<azq> $$2, int $$3) {
      this.h = $$0;
      this.i = $$1;
      this.j = $$2;
      this.m = $$3;
   }

   private static ImmutableList<azq> a(@Nullable xv $$0) {
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
   public fqp.a a() {
      return this.o;
   }

   @Override
   public void a(fqq $$0, long $$1) {
      if (this.l) {
         this.k = $$1;
         this.l = false;
      }

      double $$2 = (double)this.h.l * $$0.d();
      long $$3 = $$1 - this.k;
      this.o = !this.n && (double)$$3 < $$2 ? fqp.a.a : fqp.a.b;
   }

   @Override
   public void a(fnr $$0, fnp $$1, long $$2) {
      int $$3 = this.b();
      if ($$3 == 160 && this.j.size() <= 1) {
         $$0.a(glu::C, a, 0, 0, $$3, this.c());
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

   private void a(fnr $$0, int $$1, int $$2, int $$3, int $$4) {
      int $$5 = $$2 == 0 ? 20 : 5;
      int $$6 = Math.min(60, $$1 - $$5);
      alz $$7 = a;
      $$0.a(glu::C, $$7, 160, 32, 0, $$2, 0, $$3, $$5, $$4);

      for (int $$8 = $$5; $$8 < $$1 - $$6; $$8 += 64) {
         $$0.a(glu::C, $$7, 160, 32, 32, $$2, $$8, $$3, Math.min(64, $$1 - $$8 - $$6), $$4);
      }

      $$0.a(glu::C, $$7, 160, 32, 160 - $$6, $$2, $$1 - $$6, $$3, $$6, $$4);
   }

   public void a(xv $$0, @Nullable xv $$1) {
      this.i = $$0;
      this.j = a($$1);
      this.l = true;
   }

   public fqo.a e() {
      return this.h;
   }

   public static void a(fqq $$0, fqo.a $$1, xv $$2, @Nullable xv $$3) {
      $$0.a(new fqo($$1, $$2, $$3));
   }

   public static void b(fqq $$0, fqo.a $$1, xv $$2, @Nullable xv $$3) {
      fqo $$4 = $$0.a(fqo.class, $$1);
      if ($$4 == null) {
         a($$0, $$1, $$2, $$3);
      } else {
         $$4.a($$2, $$3);
      }
   }

   public static void a(fqq $$0, fqo.a $$1) {
      fqo $$2 = $$0.a(fqo.class, $$1);
      if ($$2 != null) {
         $$2.d();
      }
   }

   public static void a(fmf $$0, String $$1) {
      a($$0.aA(), fqo.a.d, xv.c("selectWorld.access_failure"), xv.b($$1));
   }

   public static void b(fmf $$0, String $$1) {
      a($$0.aA(), fqo.a.d, xv.c("selectWorld.delete_failure"), xv.b($$1));
   }

   public static void c(fmf $$0, String $$1) {
      a($$0.aA(), fqo.a.e, xv.c("pack.copyFailure"), xv.b($$1));
   }

   public static void a(fmf $$0, int $$1) {
      a($$0.aA(), fqo.a.f, xv.c("gui.fileDropFailure.title"), xv.a("gui.fileDropFailure.detail", $$1));
   }

   public static void a(fmf $$0) {
      b($$0.aA(), fqo.a.h, xv.c("chunk.toast.lowDiskSpace"), xv.c("chunk.toast.lowDiskSpace.description"));
   }

   public static void a(fmf $$0, dgn $$1) {
      b($$0.aA(), fqo.a.i, xv.a("chunk.toast.loadFailure", xv.a($$1)).a(n.m), xv.c("chunk.toast.checkLog"));
   }

   public static void b(fmf $$0, dgn $$1) {
      b($$0.aA(), fqo.a.j, xv.a("chunk.toast.saveFailure", xv.a($$1)).a(n.m), xv.c("chunk.toast.checkLog"));
   }

   public static class a {
      public static final fqo.a a = new fqo.a();
      public static final fqo.a b = new fqo.a();
      public static final fqo.a c = new fqo.a();
      public static final fqo.a d = new fqo.a();
      public static final fqo.a e = new fqo.a();
      public static final fqo.a f = new fqo.a();
      public static final fqo.a g = new fqo.a();
      public static final fqo.a h = new fqo.a(10000L);
      public static final fqo.a i = new fqo.a();
      public static final fqo.a j = new fqo.a();
      public static final fqo.a k = new fqo.a(10000L);
      final long l;

      public a(long $$0) {
         this.l = $$0;
      }

      public a() {
         this(5000L);
      }
   }
}
