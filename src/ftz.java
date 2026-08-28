import com.google.common.collect.ImmutableList;
import java.util.List;
import javax.annotation.Nullable;

public class ftz implements fua {
   private static final ale a = ale.b("toast/system");
   private static final int e = 200;
   private static final int f = 12;
   private static final int g = 10;
   private final ftz.a h;
   private ww i;
   private List<ayw> j;
   private long k;
   private boolean l;
   private final int m;
   private boolean n;
   private fua.a o = fua.a.b;

   public ftz(ftz.a $$0, ww $$1, @Nullable ww $$2) {
      this($$0, $$1, a($$2), Math.max(160, 30 + Math.max(fof.Q().h.a($$1), $$2 == null ? 0 : fof.Q().h.a($$2))));
   }

   public static ftz a(fof $$0, ftz.a $$1, ww $$2, ww $$3) {
      fra $$4 = $$0.h;
      List<ayw> $$5 = $$4.c($$3, 200);
      int $$6 = Math.max(200, $$5.stream().mapToInt($$4::a).max().orElse(200));
      return new ftz($$1, $$2, $$5, $$6 + 30);
   }

   private ftz(ftz.a $$0, ww $$1, List<ayw> $$2, int $$3) {
      this.h = $$0;
      this.i = $$1;
      this.j = $$2;
      this.m = $$3;
   }

   private static ImmutableList<ayw> a(@Nullable ww $$0) {
      return $$0 == null ? ImmutableList.of() : ImmutableList.of($$0.g());
   }

   @Override
   public int c() {
      return this.m;
   }

   @Override
   public int d() {
      return 20 + Math.max(this.j.size(), 1) * 12;
   }

   public void e() {
      this.n = true;
   }

   @Override
   public fua.a a() {
      return this.o;
   }

   @Override
   public void a(fub $$0, long $$1) {
      if (this.l) {
         this.k = $$1;
         this.l = false;
      }

      double $$2 = (double)this.h.l * $$0.d();
      long $$3 = $$1 - this.k;
      this.o = !this.n && (double)$$3 < $$2 ? fua.a.a : fua.a.b;
   }

   @Override
   public void a(frc $$0, fra $$1, long $$2) {
      $$0.a(gpn::H, a, 0, 0, this.c(), this.d());
      if (this.j.isEmpty()) {
         $$0.a($$1, this.i, 18, 12, -256, false);
      } else {
         $$0.a($$1, this.i, 18, 7, -256, false);

         for (int $$3 = 0; $$3 < this.j.size(); $$3++) {
            $$0.a($$1, this.j.get($$3), 18, 18 + $$3 * 12, -1, false);
         }
      }
   }

   public void a(ww $$0, @Nullable ww $$1) {
      this.i = $$0;
      this.j = a($$1);
      this.l = true;
   }

   public ftz.a f() {
      return this.h;
   }

   public static void a(fub $$0, ftz.a $$1, ww $$2, @Nullable ww $$3) {
      $$0.a(new ftz($$1, $$2, $$3));
   }

   public static void b(fub $$0, ftz.a $$1, ww $$2, @Nullable ww $$3) {
      ftz $$4 = $$0.a(ftz.class, $$1);
      if ($$4 == null) {
         a($$0, $$1, $$2, $$3);
      } else {
         $$4.a($$2, $$3);
      }
   }

   public static void a(fub $$0, ftz.a $$1) {
      ftz $$2 = $$0.a(ftz.class, $$1);
      if ($$2 != null) {
         $$2.e();
      }
   }

   public static void a(fof $$0, String $$1) {
      a($$0.aA(), ftz.a.d, ww.c("selectWorld.access_failure"), ww.b($$1));
   }

   public static void b(fof $$0, String $$1) {
      a($$0.aA(), ftz.a.d, ww.c("selectWorld.delete_failure"), ww.b($$1));
   }

   public static void c(fof $$0, String $$1) {
      a($$0.aA(), ftz.a.e, ww.c("pack.copyFailure"), ww.b($$1));
   }

   public static void a(fof $$0, int $$1) {
      a($$0.aA(), ftz.a.f, ww.c("gui.fileDropFailure.title"), ww.a("gui.fileDropFailure.detail", $$1));
   }

   public static void a(fof $$0) {
      b($$0.aA(), ftz.a.h, ww.c("chunk.toast.lowDiskSpace"), ww.c("chunk.toast.lowDiskSpace.description"));
   }

   public static void a(fof $$0, dhw $$1) {
      b($$0.aA(), ftz.a.i, ww.a("chunk.toast.loadFailure", ww.a($$1)).a(n.m), ww.c("chunk.toast.checkLog"));
   }

   public static void b(fof $$0, dhw $$1) {
      b($$0.aA(), ftz.a.j, ww.a("chunk.toast.saveFailure", ww.a($$1)).a(n.m), ww.c("chunk.toast.checkLog"));
   }

   public static class a {
      public static final ftz.a a = new ftz.a();
      public static final ftz.a b = new ftz.a();
      public static final ftz.a c = new ftz.a();
      public static final ftz.a d = new ftz.a();
      public static final ftz.a e = new ftz.a();
      public static final ftz.a f = new ftz.a();
      public static final ftz.a g = new ftz.a();
      public static final ftz.a h = new ftz.a(10000L);
      public static final ftz.a i = new ftz.a();
      public static final ftz.a j = new ftz.a();
      public static final ftz.a k = new ftz.a(10000L);
      final long l;

      public a(long $$0) {
         this.l = $$0;
      }

      public a() {
         this(5000L);
      }
   }
}
