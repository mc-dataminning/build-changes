import com.google.common.collect.ImmutableList;
import java.util.List;
import javax.annotation.Nullable;

public class frb implements frc {
   private static final aku a = aku.b("toast/system");
   private static final int e = 200;
   private static final int f = 12;
   private static final int g = 10;
   private final frb.a h;
   private wo i;
   private List<ayl> j;
   private long k;
   private boolean l;
   private final int m;
   private boolean n;
   private frc.a o = frc.a.b;

   public frb(frb.a $$0, wo $$1, @Nullable wo $$2) {
      this($$0, $$1, a($$2), Math.max(160, 30 + Math.max(flj.Q().h.a($$1), $$2 == null ? 0 : flj.Q().h.a($$2))));
   }

   public static frb a(flj $$0, frb.a $$1, wo $$2, wo $$3) {
      fob $$4 = $$0.h;
      List<ayl> $$5 = $$4.c($$3, 200);
      int $$6 = Math.max(200, $$5.stream().mapToInt($$4::a).max().orElse(200));
      return new frb($$1, $$2, $$5, $$6 + 30);
   }

   private frb(frb.a $$0, wo $$1, List<ayl> $$2, int $$3) {
      this.h = $$0;
      this.i = $$1;
      this.j = $$2;
      this.m = $$3;
   }

   private static ImmutableList<ayl> a(@Nullable wo $$0) {
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
   public frc.a a() {
      return this.o;
   }

   @Override
   public void a(frd $$0, long $$1) {
      if (this.l) {
         this.k = $$1;
         this.l = false;
      }

      double $$2 = (double)this.h.l * $$0.d();
      long $$3 = $$1 - this.k;
      this.o = !this.n && (double)$$3 < $$2 ? frc.a.a : frc.a.b;
   }

   @Override
   public void a(fod $$0, fob $$1, long $$2) {
      $$0.a(gmh::H, a, 0, 0, this.b(), this.c());
      if (this.j.isEmpty()) {
         $$0.a($$1, this.i, 18, 12, -256, false);
      } else {
         $$0.a($$1, this.i, 18, 7, -256, false);

         for (int $$3 = 0; $$3 < this.j.size(); $$3++) {
            $$0.a($$1, this.j.get($$3), 18, 18 + $$3 * 12, -1, false);
         }
      }
   }

   public void a(wo $$0, @Nullable wo $$1) {
      this.i = $$0;
      this.j = a($$1);
      this.l = true;
   }

   public frb.a e() {
      return this.h;
   }

   public static void a(frd $$0, frb.a $$1, wo $$2, @Nullable wo $$3) {
      $$0.a(new frb($$1, $$2, $$3));
   }

   public static void b(frd $$0, frb.a $$1, wo $$2, @Nullable wo $$3) {
      frb $$4 = $$0.a(frb.class, $$1);
      if ($$4 == null) {
         a($$0, $$1, $$2, $$3);
      } else {
         $$4.a($$2, $$3);
      }
   }

   public static void a(frd $$0, frb.a $$1) {
      frb $$2 = $$0.a(frb.class, $$1);
      if ($$2 != null) {
         $$2.d();
      }
   }

   public static void a(flj $$0, String $$1) {
      a($$0.aA(), frb.a.d, wo.c("selectWorld.access_failure"), wo.b($$1));
   }

   public static void b(flj $$0, String $$1) {
      a($$0.aA(), frb.a.d, wo.c("selectWorld.delete_failure"), wo.b($$1));
   }

   public static void c(flj $$0, String $$1) {
      a($$0.aA(), frb.a.e, wo.c("pack.copyFailure"), wo.b($$1));
   }

   public static void a(flj $$0, int $$1) {
      a($$0.aA(), frb.a.f, wo.c("gui.fileDropFailure.title"), wo.a("gui.fileDropFailure.detail", $$1));
   }

   public static void a(flj $$0) {
      b($$0.aA(), frb.a.h, wo.c("chunk.toast.lowDiskSpace"), wo.c("chunk.toast.lowDiskSpace.description"));
   }

   public static void a(flj $$0, dfo $$1) {
      b($$0.aA(), frb.a.i, wo.a("chunk.toast.loadFailure", wo.a($$1)).a(n.m), wo.c("chunk.toast.checkLog"));
   }

   public static void b(flj $$0, dfo $$1) {
      b($$0.aA(), frb.a.j, wo.a("chunk.toast.saveFailure", wo.a($$1)).a(n.m), wo.c("chunk.toast.checkLog"));
   }

   public static class a {
      public static final frb.a a = new frb.a();
      public static final frb.a b = new frb.a();
      public static final frb.a c = new frb.a();
      public static final frb.a d = new frb.a();
      public static final frb.a e = new frb.a();
      public static final frb.a f = new frb.a();
      public static final frb.a g = new frb.a();
      public static final frb.a h = new frb.a(10000L);
      public static final frb.a i = new frb.a();
      public static final frb.a j = new frb.a();
      public static final frb.a k = new frb.a(10000L);
      final long l;

      public a(long $$0) {
         this.l = $$0;
      }

      public a() {
         this(5000L);
      }
   }
}
