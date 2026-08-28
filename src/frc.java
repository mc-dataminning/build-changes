import com.google.common.collect.ImmutableList;
import java.util.List;
import javax.annotation.Nullable;

public class frc implements frd {
   private static final akv a = akv.b("toast/system");
   private static final int e = 200;
   private static final int f = 12;
   private static final int g = 10;
   private final frc.a h;
   private wp i;
   private List<ayl> j;
   private long k;
   private boolean l;
   private final int m;
   private boolean n;
   private frd.a o = frd.a.b;

   public frc(frc.a $$0, wp $$1, @Nullable wp $$2) {
      this($$0, $$1, a($$2), Math.max(160, 30 + Math.max(flj.Q().h.a($$1), $$2 == null ? 0 : flj.Q().h.a($$2))));
   }

   public static frc a(flj $$0, frc.a $$1, wp $$2, wp $$3) {
      foc $$4 = $$0.h;
      List<ayl> $$5 = $$4.c($$3, 200);
      int $$6 = Math.max(200, $$5.stream().mapToInt($$4::a).max().orElse(200));
      return new frc($$1, $$2, $$5, $$6 + 30);
   }

   private frc(frc.a $$0, wp $$1, List<ayl> $$2, int $$3) {
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
   public frd.a a() {
      return this.o;
   }

   @Override
   public void a(fre $$0, long $$1) {
      if (this.l) {
         this.k = $$1;
         this.l = false;
      }

      double $$2 = (double)this.h.l * $$0.d();
      long $$3 = $$1 - this.k;
      this.o = !this.n && (double)$$3 < $$2 ? frd.a.a : frd.a.b;
   }

   @Override
   public void a(foe $$0, foc $$1, long $$2) {
      $$0.a(gmi::H, a, 0, 0, this.b(), this.c());
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

   public frc.a e() {
      return this.h;
   }

   public static void a(fre $$0, frc.a $$1, wp $$2, @Nullable wp $$3) {
      $$0.a(new frc($$1, $$2, $$3));
   }

   public static void b(fre $$0, frc.a $$1, wp $$2, @Nullable wp $$3) {
      frc $$4 = $$0.a(frc.class, $$1);
      if ($$4 == null) {
         a($$0, $$1, $$2, $$3);
      } else {
         $$4.a($$2, $$3);
      }
   }

   public static void a(fre $$0, frc.a $$1) {
      frc $$2 = $$0.a(frc.class, $$1);
      if ($$2 != null) {
         $$2.d();
      }
   }

   public static void a(flj $$0, String $$1) {
      a($$0.aA(), frc.a.d, wp.c("selectWorld.access_failure"), wp.b($$1));
   }

   public static void b(flj $$0, String $$1) {
      a($$0.aA(), frc.a.d, wp.c("selectWorld.delete_failure"), wp.b($$1));
   }

   public static void c(flj $$0, String $$1) {
      a($$0.aA(), frc.a.e, wp.c("pack.copyFailure"), wp.b($$1));
   }

   public static void a(flj $$0, int $$1) {
      a($$0.aA(), frc.a.f, wp.c("gui.fileDropFailure.title"), wp.a("gui.fileDropFailure.detail", $$1));
   }

   public static void a(flj $$0) {
      b($$0.aA(), frc.a.h, wp.c("chunk.toast.lowDiskSpace"), wp.c("chunk.toast.lowDiskSpace.description"));
   }

   public static void a(flj $$0, dfo $$1) {
      b($$0.aA(), frc.a.i, wp.a("chunk.toast.loadFailure", wp.a($$1)).a(n.m), wp.c("chunk.toast.checkLog"));
   }

   public static void b(flj $$0, dfo $$1) {
      b($$0.aA(), frc.a.j, wp.a("chunk.toast.saveFailure", wp.a($$1)).a(n.m), wp.c("chunk.toast.checkLog"));
   }

   public static class a {
      public static final frc.a a = new frc.a();
      public static final frc.a b = new frc.a();
      public static final frc.a c = new frc.a();
      public static final frc.a d = new frc.a();
      public static final frc.a e = new frc.a();
      public static final frc.a f = new frc.a();
      public static final frc.a g = new frc.a();
      public static final frc.a h = new frc.a(10000L);
      public static final frc.a i = new frc.a();
      public static final frc.a j = new frc.a();
      public static final frc.a k = new frc.a(10000L);
      final long l;

      public a(long $$0) {
         this.l = $$0;
      }

      public a() {
         this(5000L);
      }
   }
}
