import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fji extends fnx {
   private static final akq a = akq.b("popup/background");
   private static final int b = 12;
   private static final int c = 18;
   private static final int q = 6;
   private static final int r = 130;
   private static final int s = 64;
   private static final int u = 250;
   private final fnx v;
   @Nullable
   private final akq w;
   private final wy x;
   private final List<fji.b> y;
   @Nullable
   private final Runnable z;
   private final int A;
   private final flx B = flx.d();

   fji(fnx $$0, int $$1, @Nullable akq $$2, wy $$3, wy $$4, List<fji.b> $$5, @Nullable Runnable $$6) {
      super($$3);
      this.v = $$0;
      this.w = $$2;
      this.x = $$4;
      this.y = $$5;
      this.z = $$6;
      this.A = $$1 - 36;
   }

   @Override
   public void aH_() {
      super.aH_();
      this.v.o();
   }

   @Override
   protected void aP_() {
      this.v.b(this.l, this.m, this.n);
      this.B.a(12).c().b();
      this.B.a(new fja(this.k.f().a(n.r), this.o).d(this.A).b(true));
      if (this.w != null) {
         this.B.a(fit.a(130, 64, this.w, 130, 64));
      }

      this.B.a(new fja(this.x, this.o).d(this.A).b(true));
      this.B.a(this.m());
      this.B.a($$1 -> {
         fie var10000 = this.c($$1);
      });
      this.c();
   }

   private flx m() {
      int $$0 = 6 * (this.y.size() - 1);
      int $$1 = Math.min((this.A - $$0) / this.y.size(), 150);
      flx $$2 = flx.e();
      $$2.a(6);

      for (fji.b $$3 : this.y) {
         $$2.a(fig.a($$3.a(), $$1x -> $$3.b().accept(this)).a($$1).a());
      }

      return $$2;
   }

   @Override
   protected void c() {
      this.v.a(this.l, this.m, this.n);
      this.B.a();
      flr.a(this.B, this.H());
   }

   @Override
   public void b(fht $$0, int $$1, int $$2, float $$3) {
      this.v.a($$0, -1, -1, $$3);
      $$0.e();
      RenderSystem.clear(256, fgi.a);
      this.b($$0);
      $$0.a(a, this.B.D() - 18, this.B.E() - 18, this.B.y() + 36, this.B.w() + 36);
   }

   @Override
   public wy i() {
      return wx.a(this.k, this.x);
   }

   @Override
   public void d() {
      if (this.z != null) {
         this.z.run();
      }

      this.l.a(this.v);
   }

   public static class a {
      private final fnx a;
      private final wy b;
      private wy c = wx.a;
      private int d = 250;
      @Nullable
      private akq e;
      private final List<fji.b> f = new ArrayList<>();
      @Nullable
      private Runnable g = null;

      public a(fnx $$0, wy $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fji.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public fji.a a(akq $$0) {
         this.e = $$0;
         return this;
      }

      public fji.a a(wy $$0) {
         this.c = $$0;
         return this;
      }

      public fji.a a(wy $$0, Consumer<fji> $$1) {
         this.f.add(new fji.b($$0, $$1));
         return this;
      }

      public fji.a a(Runnable $$0) {
         this.g = $$0;
         return this;
      }

      public fji a() {
         if (this.f.isEmpty()) {
            throw new IllegalStateException("Popup must have at least one button");
         } else {
            return new fji(this.a, this.d, this.e, this.b, this.c, List.copyOf(this.f), this.g);
         }
      }
   }

   static record b(wy a, Consumer<fji> b) {
   }
}
