import com.google.common.collect.ImmutableList;
import java.util.List;
import javax.annotation.Nullable;

public class fqi implements fqj {
   private static final alp a = alp.b("toast/system");
   private static final int e = 200;
   private static final int f = 12;
   private static final int g = 10;
   private final fqi.a h;
   private xk i;
   private List<azg> j;
   private long k;
   private boolean l;
   private final int m;
   private boolean n;
   private fqj.a o = fqj.a.b;

   public fqi(fqi.a $$0, xk $$1, @Nullable xk $$2) {
      this($$0, $$1, a($$2), Math.max(160, 30 + Math.max(flz.Q().h.a($$1), $$2 == null ? 0 : flz.Q().h.a($$2))));
   }

   public static fqi a(flz $$0, fqi.a $$1, xk $$2, xk $$3) {
      fnj $$4 = $$0.h;
      List<azg> $$5 = $$4.c($$3, 200);
      int $$6 = Math.max(200, $$5.stream().mapToInt($$4::a).max().orElse(200));
      return new fqi($$1, $$2, $$5, $$6 + 30);
   }

   private fqi(fqi.a $$0, xk $$1, List<azg> $$2, int $$3) {
      this.h = $$0;
      this.i = $$1;
      this.j = $$2;
      this.m = $$3;
   }

   private static ImmutableList<azg> a(@Nullable xk $$0) {
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
   public fqj.a a() {
      return this.o;
   }

   @Override
   public void a(fqk $$0, long $$1) {
      if (this.l) {
         this.k = $$1;
         this.l = false;
      }

      double $$2 = (double)this.h.l * $$0.d();
      long $$3 = $$1 - this.k;
      this.o = !this.n && (double)$$3 < $$2 ? fqj.a.a : fqj.a.b;
   }

   @Override
   public void a(fnl $$0, fnj $$1, long $$2) {
      $$0.a(glq::H, a, 0, 0, this.b(), this.c());
      if (this.j.isEmpty()) {
         $$0.a($$1, this.i, 18, 12, -256, false);
      } else {
         $$0.a($$1, this.i, 18, 7, -256, false);

         for (int $$3 = 0; $$3 < this.j.size(); $$3++) {
            $$0.a($$1, this.j.get($$3), 18, 18 + $$3 * 12, -1, false);
         }
      }
   }

   public void a(xk $$0, @Nullable xk $$1) {
      this.i = $$0;
      this.j = a($$1);
      this.l = true;
   }

   public fqi.a e() {
      return this.h;
   }

   public static void a(fqk $$0, fqi.a $$1, xk $$2, @Nullable xk $$3) {
      $$0.a(new fqi($$1, $$2, $$3));
   }

   public static void b(fqk $$0, fqi.a $$1, xk $$2, @Nullable xk $$3) {
      fqi $$4 = $$0.a(fqi.class, $$1);
      if ($$4 == null) {
         a($$0, $$1, $$2, $$3);
      } else {
         $$4.a($$2, $$3);
      }
   }

   public static void a(fqk $$0, fqi.a $$1) {
      fqi $$2 = $$0.a(fqi.class, $$1);
      if ($$2 != null) {
         $$2.d();
      }
   }

   public static void a(flz $$0, String $$1) {
      a($$0.aA(), fqi.a.d, xk.c("selectWorld.access_failure"), xk.b($$1));
   }

   public static void b(flz $$0, String $$1) {
      a($$0.aA(), fqi.a.d, xk.c("selectWorld.delete_failure"), xk.b($$1));
   }

   public static void c(flz $$0, String $$1) {
      a($$0.aA(), fqi.a.e, xk.c("pack.copyFailure"), xk.b($$1));
   }

   public static void a(flz $$0, int $$1) {
      a($$0.aA(), fqi.a.f, xk.c("gui.fileDropFailure.title"), xk.a("gui.fileDropFailure.detail", $$1));
   }

   public static void a(flz $$0) {
      b($$0.aA(), fqi.a.h, xk.c("chunk.toast.lowDiskSpace"), xk.c("chunk.toast.lowDiskSpace.description"));
   }

   public static void a(flz $$0, dgf $$1) {
      b($$0.aA(), fqi.a.i, xk.a("chunk.toast.loadFailure", xk.a($$1)).a(n.m), xk.c("chunk.toast.checkLog"));
   }

   public static void b(flz $$0, dgf $$1) {
      b($$0.aA(), fqi.a.j, xk.a("chunk.toast.saveFailure", xk.a($$1)).a(n.m), xk.c("chunk.toast.checkLog"));
   }

   public static class a {
      public static final fqi.a a = new fqi.a();
      public static final fqi.a b = new fqi.a();
      public static final fqi.a c = new fqi.a();
      public static final fqi.a d = new fqi.a();
      public static final fqi.a e = new fqi.a();
      public static final fqi.a f = new fqi.a();
      public static final fqi.a g = new fqi.a();
      public static final fqi.a h = new fqi.a(10000L);
      public static final fqi.a i = new fqi.a();
      public static final fqi.a j = new fqi.a();
      public static final fqi.a k = new fqi.a(10000L);
      final long l;

      public a(long $$0) {
         this.l = $$0;
      }

      public a() {
         this(5000L);
      }
   }
}
