import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fss extends fxi {
   private static final ale a = ale.b("popup/background");
   private static final int b = 12;
   private static final int c = 18;
   private static final int d = 6;
   private static final int s = 130;
   private static final int u = 64;
   private static final int v = 250;
   private final fxi w;
   @Nullable
   private final ale x;
   private final ww y;
   private final List<fss.b> z;
   @Nullable
   private final Runnable A;
   private final int B;
   private final fvi C = fvi.d();

   fss(fxi $$0, int $$1, @Nullable ale $$2, ww $$3, ww $$4, List<fss.b> $$5, @Nullable Runnable $$6) {
      super($$3);
      this.w = $$0;
      this.x = $$2;
      this.y = $$4;
      this.z = $$5;
      this.A = $$6;
      this.B = $$1 - 36;
   }

   @Override
   public void aF_() {
      super.aF_();
      this.w.o();
   }

   @Override
   protected void aN_() {
      this.w.b(this.m, this.n, this.o);
      this.C.a(12).c().b();
      this.C.a(new fsk(this.l.f().a(n.r), this.p).d(this.B).b(true));
      if (this.x != null) {
         this.C.a(fsd.a(130, 64, this.x, 130, 64));
      }

      this.C.a(new fsk(this.y, this.p).d(this.B).b(true));
      this.C.a(this.m());
      this.C.a($$1 -> {
         fro var10000 = this.c($$1);
      });
      this.c();
   }

   private fvi m() {
      int $$0 = 6 * (this.z.size() - 1);
      int $$1 = Math.min((this.B - $$0) / this.z.size(), 150);
      fvi $$2 = fvi.e();
      $$2.a(6);

      for (fss.b $$3 : this.z) {
         $$2.a(frq.a($$3.a(), $$1x -> $$3.b().accept(this)).a($$1).a());
      }

      return $$2;
   }

   @Override
   protected void c() {
      this.w.a(this.m, this.n, this.o);
      this.C.a();
      fvc.a(this.C, this.J());
   }

   @Override
   public void b(frc $$0, int $$1, int $$2, float $$3) {
      this.w.a($$0, -1, -1, $$3);
      $$0.d();
      RenderSystem.clear(256);
      this.b($$0);
      $$0.a(gpn::H, a, this.C.F() - 18, this.C.G() - 18, this.C.A() + 36, this.C.y() + 36);
   }

   @Override
   public ww i() {
      return wv.a(this.l, this.y);
   }

   @Override
   public void aK_() {
      if (this.A != null) {
         this.A.run();
      }

      this.m.a(this.w);
   }

   public static class a {
      private final fxi a;
      private final ww b;
      private ww c = wv.a;
      private int d = 250;
      @Nullable
      private ale e;
      private final List<fss.b> f = new ArrayList<>();
      @Nullable
      private Runnable g = null;

      public a(fxi $$0, ww $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fss.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public fss.a a(ale $$0) {
         this.e = $$0;
         return this;
      }

      public fss.a a(ww $$0) {
         this.c = $$0;
         return this;
      }

      public fss.a a(ww $$0, Consumer<fss> $$1) {
         this.f.add(new fss.b($$0, $$1));
         return this;
      }

      public fss.a a(Runnable $$0) {
         this.g = $$0;
         return this;
      }

      public fss a() {
         if (this.f.isEmpty()) {
            throw new IllegalStateException("Popup must have at least one button");
         } else {
            return new fss(this.a, this.d, this.e, this.b, this.c, List.copyOf(this.f), this.g);
         }
      }
   }

   static record b(ww a, Consumer<fss> b) {
   }
}
