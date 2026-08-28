import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fjo extends fod {
   private static final akr a = akr.b("popup/background");
   private static final int b = 12;
   private static final int c = 18;
   private static final int r = 6;
   private static final int s = 130;
   private static final int u = 64;
   private static final int v = 250;
   private final fod w;
   @Nullable
   private final akr x;
   private final wz y;
   private final List<fjo.b> z;
   @Nullable
   private final Runnable A;
   private final int B;
   private final fmd C = fmd.d();

   fjo(fod $$0, int $$1, @Nullable akr $$2, wz $$3, wz $$4, List<fjo.b> $$5, @Nullable Runnable $$6) {
      super($$3);
      this.w = $$0;
      this.x = $$2;
      this.y = $$4;
      this.z = $$5;
      this.A = $$6;
      this.B = $$1 - 36;
   }

   @Override
   public void aL_() {
      super.aL_();
      this.w.o();
   }

   @Override
   protected void aT_() {
      this.w.b(this.l, this.m, this.n);
      this.C.a(12).c().b();
      this.C.a(new fjg(this.k.f().a(n.r), this.o).d(this.B).b(true));
      if (this.x != null) {
         this.C.a(fiz.a(130, 64, this.x, 130, 64));
      }

      this.C.a(new fjg(this.y, this.o).d(this.B).b(true));
      this.C.a(this.m());
      this.C.a($$1 -> {
         fik var10000 = this.c($$1);
      });
      this.c();
   }

   private fmd m() {
      int $$0 = 6 * (this.z.size() - 1);
      int $$1 = Math.min((this.B - $$0) / this.z.size(), 150);
      fmd $$2 = fmd.e();
      $$2.a(6);

      for (fjo.b $$3 : this.z) {
         $$2.a(fim.a($$3.a(), $$1x -> $$3.b().accept(this)).a($$1).a());
      }

      return $$2;
   }

   @Override
   protected void c() {
      this.w.a(this.l, this.m, this.n);
      this.C.a();
      flx.a(this.C, this.H());
   }

   @Override
   public void b(fhz $$0, int $$1, int $$2, float $$3) {
      this.w.a($$0, -1, -1, $$3);
      $$0.e();
      RenderSystem.clear(256, fgo.a);
      this.b($$0);
      $$0.a(a, this.C.D() - 18, this.C.E() - 18, this.C.y() + 36, this.C.w() + 36);
   }

   @Override
   public wz i() {
      return wy.a(this.k, this.y);
   }

   @Override
   public void d() {
      if (this.A != null) {
         this.A.run();
      }

      this.l.a(this.w);
   }

   public static class a {
      private final fod a;
      private final wz b;
      private wz c = wy.a;
      private int d = 250;
      @Nullable
      private akr e;
      private final List<fjo.b> f = new ArrayList<>();
      @Nullable
      private Runnable g = null;

      public a(fod $$0, wz $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fjo.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public fjo.a a(akr $$0) {
         this.e = $$0;
         return this;
      }

      public fjo.a a(wz $$0) {
         this.c = $$0;
         return this;
      }

      public fjo.a a(wz $$0, Consumer<fjo> $$1) {
         this.f.add(new fjo.b($$0, $$1));
         return this;
      }

      public fjo.a a(Runnable $$0) {
         this.g = $$0;
         return this;
      }

      public fjo a() {
         if (this.f.isEmpty()) {
            throw new IllegalStateException("Popup must have at least one button");
         } else {
            return new fjo(this.a, this.d, this.e, this.b, this.c, List.copyOf(this.f), this.g);
         }
      }
   }

   static record b(wz a, Consumer<fjo> b) {
   }
}
