import com.google.common.collect.ImmutableList;
import java.util.List;
import javax.annotation.Nullable;

public class fsw implements fsx {
   private static final ald a = ald.b("toast/system");
   private static final int e = 200;
   private static final int f = 12;
   private static final int g = 10;
   private final fsw.a h;
   private wv i;
   private List<ayw> j;
   private long k;
   private boolean l;
   private final int m;
   private boolean n;
   private fsx.a o = fsx.a.b;

   public fsw(fsw.a $$0, wv $$1, @Nullable wv $$2) {
      this($$0, $$1, a($$2), Math.max(160, 30 + Math.max(fnd.Q().h.a($$1), $$2 == null ? 0 : fnd.Q().h.a($$2))));
   }

   public static fsw a(fnd $$0, fsw.a $$1, wv $$2, wv $$3) {
      fpx $$4 = $$0.h;
      List<ayw> $$5 = $$4.c($$3, 200);
      int $$6 = Math.max(200, $$5.stream().mapToInt($$4::a).max().orElse(200));
      return new fsw($$1, $$2, $$5, $$6 + 30);
   }

   private fsw(fsw.a $$0, wv $$1, List<ayw> $$2, int $$3) {
      this.h = $$0;
      this.i = $$1;
      this.j = $$2;
      this.m = $$3;
   }

   private static ImmutableList<ayw> a(@Nullable wv $$0) {
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
   public fsx.a a() {
      return this.o;
   }

   @Override
   public void a(fsy $$0, long $$1) {
      if (this.l) {
         this.k = $$1;
         this.l = false;
      }

      double $$2 = (double)this.h.l * $$0.d();
      long $$3 = $$1 - this.k;
      this.o = !this.n && (double)$$3 < $$2 ? fsx.a.a : fsx.a.b;
   }

   @Override
   public void a(fpz $$0, fpx $$1, long $$2) {
      $$0.a(goi::H, a, 0, 0, this.c(), this.d());
      if (this.j.isEmpty()) {
         $$0.a($$1, this.i, 18, 12, -256, false);
      } else {
         $$0.a($$1, this.i, 18, 7, -256, false);

         for (int $$3 = 0; $$3 < this.j.size(); $$3++) {
            $$0.a($$1, this.j.get($$3), 18, 18 + $$3 * 12, -1, false);
         }
      }
   }

   public void a(wv $$0, @Nullable wv $$1) {
      this.i = $$0;
      this.j = a($$1);
      this.l = true;
   }

   public fsw.a f() {
      return this.h;
   }

   public static void a(fsy $$0, fsw.a $$1, wv $$2, @Nullable wv $$3) {
      $$0.a(new fsw($$1, $$2, $$3));
   }

   public static void b(fsy $$0, fsw.a $$1, wv $$2, @Nullable wv $$3) {
      fsw $$4 = $$0.a(fsw.class, $$1);
      if ($$4 == null) {
         a($$0, $$1, $$2, $$3);
      } else {
         $$4.a($$2, $$3);
      }
   }

   public static void a(fsy $$0, fsw.a $$1) {
      fsw $$2 = $$0.a(fsw.class, $$1);
      if ($$2 != null) {
         $$2.e();
      }
   }

   public static void a(fnd $$0, String $$1) {
      a($$0.aA(), fsw.a.d, wv.c("selectWorld.access_failure"), wv.b($$1));
   }

   public static void b(fnd $$0, String $$1) {
      a($$0.aA(), fsw.a.d, wv.c("selectWorld.delete_failure"), wv.b($$1));
   }

   public static void c(fnd $$0, String $$1) {
      a($$0.aA(), fsw.a.e, wv.c("pack.copyFailure"), wv.b($$1));
   }

   public static void a(fnd $$0, int $$1) {
      a($$0.aA(), fsw.a.f, wv.c("gui.fileDropFailure.title"), wv.a("gui.fileDropFailure.detail", $$1));
   }

   public static void a(fnd $$0) {
      b($$0.aA(), fsw.a.h, wv.c("chunk.toast.lowDiskSpace"), wv.c("chunk.toast.lowDiskSpace.description"));
   }

   public static void a(fnd $$0, dgw $$1) {
      b($$0.aA(), fsw.a.i, wv.a("chunk.toast.loadFailure", wv.a($$1)).a(n.m), wv.c("chunk.toast.checkLog"));
   }

   public static void b(fnd $$0, dgw $$1) {
      b($$0.aA(), fsw.a.j, wv.a("chunk.toast.saveFailure", wv.a($$1)).a(n.m), wv.c("chunk.toast.checkLog"));
   }

   public static class a {
      public static final fsw.a a = new fsw.a();
      public static final fsw.a b = new fsw.a();
      public static final fsw.a c = new fsw.a();
      public static final fsw.a d = new fsw.a();
      public static final fsw.a e = new fsw.a();
      public static final fsw.a f = new fsw.a();
      public static final fsw.a g = new fsw.a();
      public static final fsw.a h = new fsw.a(10000L);
      public static final fsw.a i = new fsw.a();
      public static final fsw.a j = new fsw.a();
      public static final fsw.a k = new fsw.a(10000L);
      final long l;

      public a(long $$0) {
         this.l = $$0;
      }

      public a() {
         this(5000L);
      }
   }
}
