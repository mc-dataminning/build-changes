import com.google.common.collect.ImmutableList;
import java.util.List;
import javax.annotation.Nullable;

public class fmt implements fmu {
   private static final alc a = alc.b("toast/system");
   private static final int e = 200;
   private static final int f = 12;
   private static final int g = 10;
   private final fmt.a h;
   private xd i;
   private List<ayp> j;
   private long k;
   private boolean l;
   private final int m;
   private boolean n;
   private fmu.a o = fmu.a.b;

   public fmt(fmt.a $$0, xd $$1, @Nullable xd $$2) {
      this($$0, $$1, a($$2), Math.max(160, 30 + Math.max(fil.Q().h.a($$1), $$2 == null ? 0 : fil.Q().h.a($$2))));
   }

   public static fmt a(fil $$0, fmt.a $$1, xd $$2, xd $$3) {
      fjv $$4 = $$0.h;
      List<ayp> $$5 = $$4.c($$3, 200);
      int $$6 = Math.max(200, $$5.stream().mapToInt($$4::a).max().orElse(200));
      return new fmt($$1, $$2, $$5, $$6 + 30);
   }

   private fmt(fmt.a $$0, xd $$1, List<ayp> $$2, int $$3) {
      this.h = $$0;
      this.i = $$1;
      this.j = $$2;
      this.m = $$3;
   }

   private static ImmutableList<ayp> a(@Nullable xd $$0) {
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
   public fmu.a a() {
      return this.o;
   }

   @Override
   public void a(fmv $$0, long $$1) {
      if (this.l) {
         this.k = $$1;
         this.l = false;
      }

      double $$2 = (double)this.h.l * $$0.d();
      long $$3 = $$1 - this.k;
      this.o = !this.n && (double)$$3 < $$2 ? fmu.a.a : fmu.a.b;
   }

   @Override
   public void a(fjx $$0, fjv $$1, long $$2) {
      int $$3 = this.b();
      if ($$3 == 160 && this.j.size() <= 1) {
         $$0.a(ghq::B, a, 0, 0, $$3, this.c());
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

   private void a(fjx $$0, int $$1, int $$2, int $$3, int $$4) {
      int $$5 = $$2 == 0 ? 20 : 5;
      int $$6 = Math.min(60, $$1 - $$5);
      alc $$7 = a;
      $$0.a(ghq::B, $$7, 160, 32, 0, $$2, 0, $$3, $$5, $$4);

      for (int $$8 = $$5; $$8 < $$1 - $$6; $$8 += 64) {
         $$0.a(ghq::B, $$7, 160, 32, 32, $$2, $$8, $$3, Math.min(64, $$1 - $$8 - $$6), $$4);
      }

      $$0.a(ghq::B, $$7, 160, 32, 160 - $$6, $$2, $$1 - $$6, $$3, $$6, $$4);
   }

   public void a(xd $$0, @Nullable xd $$1) {
      this.i = $$0;
      this.j = a($$1);
      this.l = true;
   }

   public fmt.a e() {
      return this.h;
   }

   public static void a(fmv $$0, fmt.a $$1, xd $$2, @Nullable xd $$3) {
      $$0.a(new fmt($$1, $$2, $$3));
   }

   public static void b(fmv $$0, fmt.a $$1, xd $$2, @Nullable xd $$3) {
      fmt $$4 = $$0.a(fmt.class, $$1);
      if ($$4 == null) {
         a($$0, $$1, $$2, $$3);
      } else {
         $$4.a($$2, $$3);
      }
   }

   public static void a(fmv $$0, fmt.a $$1) {
      fmt $$2 = $$0.a(fmt.class, $$1);
      if ($$2 != null) {
         $$2.d();
      }
   }

   public static void a(fil $$0, String $$1) {
      a($$0.aA(), fmt.a.d, xd.c("selectWorld.access_failure"), xd.b($$1));
   }

   public static void b(fil $$0, String $$1) {
      a($$0.aA(), fmt.a.d, xd.c("selectWorld.delete_failure"), xd.b($$1));
   }

   public static void c(fil $$0, String $$1) {
      a($$0.aA(), fmt.a.e, xd.c("pack.copyFailure"), xd.b($$1));
   }

   public static void a(fil $$0, int $$1) {
      a($$0.aA(), fmt.a.f, xd.c("gui.fileDropFailure.title"), xd.a("gui.fileDropFailure.detail", $$1));
   }

   public static void a(fil $$0) {
      b($$0.aA(), fmt.a.h, xd.c("chunk.toast.lowDiskSpace"), xd.c("chunk.toast.lowDiskSpace.description"));
   }

   public static void a(fil $$0, ddm $$1) {
      b($$0.aA(), fmt.a.i, xd.a("chunk.toast.loadFailure", xd.a($$1)).a(n.m), xd.c("chunk.toast.checkLog"));
   }

   public static void b(fil $$0, ddm $$1) {
      b($$0.aA(), fmt.a.j, xd.a("chunk.toast.saveFailure", xd.a($$1)).a(n.m), xd.c("chunk.toast.checkLog"));
   }

   public static class a {
      public static final fmt.a a = new fmt.a();
      public static final fmt.a b = new fmt.a();
      public static final fmt.a c = new fmt.a();
      public static final fmt.a d = new fmt.a();
      public static final fmt.a e = new fmt.a();
      public static final fmt.a f = new fmt.a();
      public static final fmt.a g = new fmt.a();
      public static final fmt.a h = new fmt.a(10000L);
      public static final fmt.a i = new fmt.a();
      public static final fmt.a j = new fmt.a();
      public static final fmt.a k = new fmt.a(10000L);
      final long l;

      public a(long $$0) {
         this.l = $$0;
      }

      public a() {
         this(5000L);
      }
   }
}
