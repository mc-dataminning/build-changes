import com.google.common.collect.ImmutableList;
import java.util.List;
import javax.annotation.Nullable;

public class fnq implements fnr {
   private static final ali a = ali.b("toast/system");
   private static final int e = 200;
   private static final int f = 12;
   private static final int g = 10;
   private final fnq.a h;
   private xi i;
   private List<ayw> j;
   private long k;
   private boolean l;
   private final int m;
   private boolean n;
   private fnr.a o = fnr.a.b;

   public fnq(fnq.a $$0, xi $$1, @Nullable xi $$2) {
      this($$0, $$1, a($$2), Math.max(160, 30 + Math.max(fji.Q().h.a($$1), $$2 == null ? 0 : fji.Q().h.a($$2))));
   }

   public static fnq a(fji $$0, fnq.a $$1, xi $$2, xi $$3) {
      fks $$4 = $$0.h;
      List<ayw> $$5 = $$4.c($$3, 200);
      int $$6 = Math.max(200, $$5.stream().mapToInt($$4::a).max().orElse(200));
      return new fnq($$1, $$2, $$5, $$6 + 30);
   }

   private fnq(fnq.a $$0, xi $$1, List<ayw> $$2, int $$3) {
      this.h = $$0;
      this.i = $$1;
      this.j = $$2;
      this.m = $$3;
   }

   private static ImmutableList<ayw> a(@Nullable xi $$0) {
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
   public fnr.a a() {
      return this.o;
   }

   @Override
   public void a(fns $$0, long $$1) {
      if (this.l) {
         this.k = $$1;
         this.l = false;
      }

      double $$2 = (double)this.h.l * $$0.d();
      long $$3 = $$1 - this.k;
      this.o = !this.n && (double)$$3 < $$2 ? fnr.a.a : fnr.a.b;
   }

   @Override
   public void a(fku $$0, fks $$1, long $$2) {
      int $$3 = this.b();
      if ($$3 == 160 && this.j.size() <= 1) {
         $$0.a(gir::B, a, 0, 0, $$3, this.c());
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

   private void a(fku $$0, int $$1, int $$2, int $$3, int $$4) {
      int $$5 = $$2 == 0 ? 20 : 5;
      int $$6 = Math.min(60, $$1 - $$5);
      ali $$7 = a;
      $$0.a(gir::B, $$7, 160, 32, 0, $$2, 0, $$3, $$5, $$4);

      for (int $$8 = $$5; $$8 < $$1 - $$6; $$8 += 64) {
         $$0.a(gir::B, $$7, 160, 32, 32, $$2, $$8, $$3, Math.min(64, $$1 - $$8 - $$6), $$4);
      }

      $$0.a(gir::B, $$7, 160, 32, 160 - $$6, $$2, $$1 - $$6, $$3, $$6, $$4);
   }

   public void a(xi $$0, @Nullable xi $$1) {
      this.i = $$0;
      this.j = a($$1);
      this.l = true;
   }

   public fnq.a e() {
      return this.h;
   }

   public static void a(fns $$0, fnq.a $$1, xi $$2, @Nullable xi $$3) {
      $$0.a(new fnq($$1, $$2, $$3));
   }

   public static void b(fns $$0, fnq.a $$1, xi $$2, @Nullable xi $$3) {
      fnq $$4 = $$0.a(fnq.class, $$1);
      if ($$4 == null) {
         a($$0, $$1, $$2, $$3);
      } else {
         $$4.a($$2, $$3);
      }
   }

   public static void a(fns $$0, fnq.a $$1) {
      fnq $$2 = $$0.a(fnq.class, $$1);
      if ($$2 != null) {
         $$2.d();
      }
   }

   public static void a(fji $$0, String $$1) {
      a($$0.aA(), fnq.a.d, xi.c("selectWorld.access_failure"), xi.b($$1));
   }

   public static void b(fji $$0, String $$1) {
      a($$0.aA(), fnq.a.d, xi.c("selectWorld.delete_failure"), xi.b($$1));
   }

   public static void c(fji $$0, String $$1) {
      a($$0.aA(), fnq.a.e, xi.c("pack.copyFailure"), xi.b($$1));
   }

   public static void a(fji $$0, int $$1) {
      a($$0.aA(), fnq.a.f, xi.c("gui.fileDropFailure.title"), xi.a("gui.fileDropFailure.detail", $$1));
   }

   public static void a(fji $$0) {
      b($$0.aA(), fnq.a.h, xi.c("chunk.toast.lowDiskSpace"), xi.c("chunk.toast.lowDiskSpace.description"));
   }

   public static void a(fji $$0, deh $$1) {
      b($$0.aA(), fnq.a.i, xi.a("chunk.toast.loadFailure", xi.a($$1)).a(n.m), xi.c("chunk.toast.checkLog"));
   }

   public static void b(fji $$0, deh $$1) {
      b($$0.aA(), fnq.a.j, xi.a("chunk.toast.saveFailure", xi.a($$1)).a(n.m), xi.c("chunk.toast.checkLog"));
   }

   public static class a {
      public static final fnq.a a = new fnq.a();
      public static final fnq.a b = new fnq.a();
      public static final fnq.a c = new fnq.a();
      public static final fnq.a d = new fnq.a();
      public static final fnq.a e = new fnq.a();
      public static final fnq.a f = new fnq.a();
      public static final fnq.a g = new fnq.a();
      public static final fnq.a h = new fnq.a(10000L);
      public static final fnq.a i = new fnq.a();
      public static final fnq.a j = new fnq.a();
      public static final fnq.a k = new fnq.a(10000L);
      final long l;

      public a(long $$0) {
         this.l = $$0;
      }

      public a() {
         this(5000L);
      }
   }
}
