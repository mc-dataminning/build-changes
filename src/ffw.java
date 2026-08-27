import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ffw extends fkt {
   private static final akf a = new akf("popup/background");
   private static final int b = 12;
   private static final int c = 18;
   private static final int d = 6;
   private static final int r = 130;
   private static final int s = 64;
   private static final int u = 250;
   private final fkt v;
   @Nullable
   private final akf w;
   private final ws x;
   private final List<ffw.b> y;
   @Nullable
   private final Runnable z;
   private final int A;
   private final fil B = fil.d();

   ffw(fkt $$0, int $$1, @Nullable akf $$2, ws $$3, ws $$4, List<ffw.b> $$5, @Nullable Runnable $$6) {
      super($$3);
      this.v = $$0;
      this.w = $$2;
      this.x = $$4;
      this.y = $$5;
      this.z = $$6;
      this.A = $$1 - 36;
   }

   @Override
   public void aF_() {
      super.aF_();
      this.v.o();
   }

   @Override
   protected void aM_() {
      this.B.a(12).c().b();
      this.B.a(new ffo(this.l.f().a(n.r), this.p).d(this.A).b(true));
      if (this.w != null) {
         this.B.a(ffh.a(130, 64, this.w, 130, 64));
      }

      this.B.a(new ffo(this.x, this.p).d(this.A).b(true));
      this.B.a(this.m());
      this.B.a($$1 -> {
         fes var10000 = this.c($$1);
      });
      this.c();
   }

   private fil m() {
      int $$0 = 6 * (this.y.size() - 1);
      int $$1 = Math.min((this.A - $$0) / this.y.size(), 150);
      fil $$2 = fil.e();
      $$2.a(6);

      for (ffw.b $$3 : this.y) {
         $$2.a(feu.a($$3.a(), $$1x -> $$3.b().accept(this)).a($$1).a());
      }

      return $$2;
   }

   @Override
   protected void c() {
      this.v.a(this.m, this.n, this.o);
      this.B.a();
      fif.a(this.B, this.G());
   }

   @Override
   public void b(feh $$0, int $$1, int $$2, float $$3) {
      this.v.a($$0, -1, -1, $$3);
      $$0.e();
      RenderSystem.clear(256, fcu.a);
      this.b($$0);
      $$0.a(a, this.B.C() - 18, this.B.D() - 18, this.B.x() + 36, this.B.v() + 36);
   }

   @Override
   public ws i() {
      return wr.a(this.l, this.x);
   }

   @Override
   public void d() {
      if (this.z != null) {
         this.z.run();
      }

      this.m.a(this.v);
   }

   public static class a {
      private final fkt a;
      private final ws b;
      private ws c = wr.a;
      private int d = 250;
      @Nullable
      private akf e;
      private final List<ffw.b> f = new ArrayList<>();
      @Nullable
      private Runnable g = null;

      public a(fkt $$0, ws $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public ffw.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public ffw.a a(akf $$0) {
         this.e = $$0;
         return this;
      }

      public ffw.a a(ws $$0) {
         this.c = $$0;
         return this;
      }

      public ffw.a a(ws $$0, Consumer<ffw> $$1) {
         this.f.add(new ffw.b($$0, $$1));
         return this;
      }

      public ffw.a a(Runnable $$0) {
         this.g = $$0;
         return this;
      }

      public ffw a() {
         if (this.f.isEmpty()) {
            throw new IllegalStateException("Popup must have at least one button");
         } else {
            return new ffw(this.a, this.d, this.e, this.b, this.c, List.copyOf(this.f), this.g);
         }
      }
   }

   static record b(ws a, Consumer<ffw> b) {
   }
}
