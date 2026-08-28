import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fmb extends fqs {
   private static final alh a = alh.b("popup/background");
   private static final int b = 12;
   private static final int c = 18;
   private static final int d = 6;
   private static final int s = 130;
   private static final int u = 64;
   private static final int v = 250;
   private final fqs w;
   @Nullable
   private final alh x;
   private final xh y;
   private final List<fmb.b> z;
   @Nullable
   private final Runnable A;
   private final int B;
   private final fos C = fos.d();

   fmb(fqs $$0, int $$1, @Nullable alh $$2, xh $$3, xh $$4, List<fmb.b> $$5, @Nullable Runnable $$6) {
      super($$3);
      this.w = $$0;
      this.x = $$2;
      this.y = $$4;
      this.z = $$5;
      this.A = $$6;
      this.B = $$1 - 36;
   }

   @Override
   public void aK_() {
      super.aK_();
      this.w.o();
   }

   @Override
   protected void aS_() {
      this.w.b(this.m, this.n, this.o);
      this.C.a(12).c().b();
      this.C.a(new flt(this.l.f().a(n.r), this.p).d(this.B).b(true));
      if (this.x != null) {
         this.C.a(flm.a(130, 64, this.x, 130, 64));
      }

      this.C.a(new flt(this.y, this.p).d(this.B).b(true));
      this.C.a(this.m());
      this.C.a($$1 -> {
         fkx var10000 = this.c($$1);
      });
      this.c();
   }

   private fos m() {
      int $$0 = 6 * (this.z.size() - 1);
      int $$1 = Math.min((this.B - $$0) / this.z.size(), 150);
      fos $$2 = fos.e();
      $$2.a(6);

      for (fmb.b $$3 : this.z) {
         $$2.a(fkz.a($$3.a(), $$1x -> $$3.b().accept(this)).a($$1).a());
      }

      return $$2;
   }

   @Override
   protected void c() {
      this.w.a(this.m, this.n, this.o);
      this.C.a();
      fol.a(this.C, this.H());
   }

   @Override
   public void b(fkm $$0, int $$1, int $$2, float $$3) {
      this.w.a($$0, -1, -1, $$3);
      $$0.d();
      RenderSystem.clear(256);
      this.b($$0);
      $$0.a(gig::B, a, this.C.D() - 18, this.C.E() - 18, this.C.y() + 36, this.C.w() + 36);
   }

   @Override
   public xh i() {
      return xg.a(this.l, this.y);
   }

   @Override
   public void d() {
      if (this.A != null) {
         this.A.run();
      }

      this.m.a(this.w);
   }

   public static class a {
      private final fqs a;
      private final xh b;
      private xh c = xg.a;
      private int d = 250;
      @Nullable
      private alh e;
      private final List<fmb.b> f = new ArrayList<>();
      @Nullable
      private Runnable g = null;

      public a(fqs $$0, xh $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fmb.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public fmb.a a(alh $$0) {
         this.e = $$0;
         return this;
      }

      public fmb.a a(xh $$0) {
         this.c = $$0;
         return this;
      }

      public fmb.a a(xh $$0, Consumer<fmb> $$1) {
         this.f.add(new fmb.b($$0, $$1));
         return this;
      }

      public fmb.a a(Runnable $$0) {
         this.g = $$0;
         return this;
      }

      public fmb a() {
         if (this.f.isEmpty()) {
            throw new IllegalStateException("Popup must have at least one button");
         } else {
            return new fmb(this.a, this.d, this.e, this.b, this.c, List.copyOf(this.f), this.g);
         }
      }
   }

   static record b(xh a, Consumer<fmb> b) {
   }
}
