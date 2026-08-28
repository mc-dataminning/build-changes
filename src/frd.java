import com.google.common.collect.ImmutableList;
import java.util.List;
import javax.annotation.Nullable;

public class frd implements fre {
   private static final akv a = akv.b("toast/system");
   private static final int e = 200;
   private static final int f = 12;
   private static final int g = 10;
   private final frd.a h;
   private wp i;
   private List<ayl> j;
   private long k;
   private boolean l;
   private final int m;
   private boolean n;
   private fre.a o = fre.a.b;

   public frd(frd.a $$0, wp $$1, @Nullable wp $$2) {
      this($$0, $$1, a($$2), Math.max(160, 30 + Math.max(flk.Q().h.a($$1), $$2 == null ? 0 : flk.Q().h.a($$2))));
   }

   public static frd a(flk $$0, frd.a $$1, wp $$2, wp $$3) {
      fod $$4 = $$0.h;
      List<ayl> $$5 = $$4.c($$3, 200);
      int $$6 = Math.max(200, $$5.stream().mapToInt($$4::a).max().orElse(200));
      return new frd($$1, $$2, $$5, $$6 + 30);
   }

   private frd(frd.a $$0, wp $$1, List<ayl> $$2, int $$3) {
      this.h = $$0;
      this.i = $$1;
      this.j = $$2;
      this.m = $$3;
   }

   private static ImmutableList<ayl> a(@Nullable wp $$0) {
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
   public fre.a a() {
      return this.o;
   }

   @Override
   public void a(frf $$0, long $$1) {
      if (this.l) {
         this.k = $$1;
         this.l = false;
      }

      double $$2 = (double)this.h.l * $$0.d();
      long $$3 = $$1 - this.k;
      this.o = !this.n && (double)$$3 < $$2 ? fre.a.a : fre.a.b;
   }

   @Override
   public void a(fof $$0, fod $$1, long $$2) {
      $$0.a(gmj::H, a, 0, 0, this.b(), this.c());
      if (this.j.isEmpty()) {
         $$0.a($$1, this.i, 18, 12, -256, false);
      } else {
         $$0.a($$1, this.i, 18, 7, -256, false);

         for (int $$3 = 0; $$3 < this.j.size(); $$3++) {
            $$0.a($$1, this.j.get($$3), 18, 18 + $$3 * 12, -1, false);
         }
      }
   }

   public void a(wp $$0, @Nullable wp $$1) {
      this.i = $$0;
      this.j = a($$1);
      this.l = true;
   }

   public frd.a e() {
      return this.h;
   }

   public static void a(frf $$0, frd.a $$1, wp $$2, @Nullable wp $$3) {
      $$0.a(new frd($$1, $$2, $$3));
   }

   public static void b(frf $$0, frd.a $$1, wp $$2, @Nullable wp $$3) {
      frd $$4 = $$0.a(frd.class, $$1);
      if ($$4 == null) {
         a($$0, $$1, $$2, $$3);
      } else {
         $$4.a($$2, $$3);
      }
   }

   public static void a(frf $$0, frd.a $$1) {
      frd $$2 = $$0.a(frd.class, $$1);
      if ($$2 != null) {
         $$2.d();
      }
   }

   public static void a(flk $$0, String $$1) {
      a($$0.aA(), frd.a.d, wp.c("selectWorld.access_failure"), wp.b($$1));
   }

   public static void b(flk $$0, String $$1) {
      a($$0.aA(), frd.a.d, wp.c("selectWorld.delete_failure"), wp.b($$1));
   }

   public static void c(flk $$0, String $$1) {
      a($$0.aA(), frd.a.e, wp.c("pack.copyFailure"), wp.b($$1));
   }

   public static void a(flk $$0, int $$1) {
      a($$0.aA(), frd.a.f, wp.c("gui.fileDropFailure.title"), wp.a("gui.fileDropFailure.detail", $$1));
   }

   public static void a(flk $$0) {
      b($$0.aA(), frd.a.h, wp.c("chunk.toast.lowDiskSpace"), wp.c("chunk.toast.lowDiskSpace.description"));
   }

   public static void a(flk $$0, dfp $$1) {
      b($$0.aA(), frd.a.i, wp.a("chunk.toast.loadFailure", wp.a($$1)).a(n.m), wp.c("chunk.toast.checkLog"));
   }

   public static void b(flk $$0, dfp $$1) {
      b($$0.aA(), frd.a.j, wp.a("chunk.toast.saveFailure", wp.a($$1)).a(n.m), wp.c("chunk.toast.checkLog"));
   }

   public static class a {
      public static final frd.a a = new frd.a();
      public static final frd.a b = new frd.a();
      public static final frd.a c = new frd.a();
      public static final frd.a d = new frd.a();
      public static final frd.a e = new frd.a();
      public static final frd.a f = new frd.a();
      public static final frd.a g = new frd.a();
      public static final frd.a h = new frd.a(10000L);
      public static final frd.a i = new frd.a();
      public static final frd.a j = new frd.a();
      public static final frd.a k = new frd.a(10000L);
      final long l;

      public a(long $$0) {
         this.l = $$0;
      }

      public a() {
         this(5000L);
      }
   }
}
