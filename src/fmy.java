import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fmy extends frp {
   private static final all a = all.b("popup/background");
   private static final int b = 12;
   private static final int c = 18;
   private static final int d = 6;
   private static final int s = 130;
   private static final int u = 64;
   private static final int v = 250;
   private final frp w;
   @Nullable
   private final all x;
   private final xl y;
   private final List<fmy.b> z;
   @Nullable
   private final Runnable A;
   private final int B;
   private final fpp C = fpp.d();

   fmy(frp $$0, int $$1, @Nullable all $$2, xl $$3, xl $$4, List<fmy.b> $$5, @Nullable Runnable $$6) {
      super($$3);
      this.w = $$0;
      this.x = $$2;
      this.y = $$4;
      this.z = $$5;
      this.A = $$6;
      this.B = $$1 - 36;
   }

   @Override
   public void aJ_() {
      super.aJ_();
      this.w.o();
   }

   @Override
   protected void aS_() {
      this.w.b(this.m, this.n, this.o);
      this.C.a(12).c().b();
      this.C.a(new fmq(this.l.f().a(n.r), this.p).d(this.B).b(true));
      if (this.x != null) {
         this.C.a(fmj.a(130, 64, this.x, 130, 64));
      }

      this.C.a(new fmq(this.y, this.p).d(this.B).b(true));
      this.C.a(this.m());
      this.C.a($$1 -> {
         flu var10000 = this.c($$1);
      });
      this.c();
   }

   private fpp m() {
      int $$0 = 6 * (this.z.size() - 1);
      int $$1 = Math.min((this.B - $$0) / this.z.size(), 150);
      fpp $$2 = fpp.e();
      $$2.a(6);

      for (fmy.b $$3 : this.z) {
         $$2.a(flw.a($$3.a(), $$1x -> $$3.b().accept(this)).a($$1).a());
      }

      return $$2;
   }

   @Override
   protected void c() {
      this.w.a(this.m, this.n, this.o);
      this.C.a();
      fpj.a(this.C, this.H());
   }

   @Override
   public void b(flj $$0, int $$1, int $$2, float $$3) {
      this.w.a($$0, -1, -1, $$3);
      $$0.d();
      RenderSystem.clear(256);
      this.b($$0);
      $$0.a(gjh::B, a, this.C.D() - 18, this.C.E() - 18, this.C.y() + 36, this.C.w() + 36);
   }

   @Override
   public xl i() {
      return xk.a(this.l, this.y);
   }

   @Override
   public void aP_() {
      if (this.A != null) {
         this.A.run();
      }

      this.m.a(this.w);
   }

   public static class a {
      private final frp a;
      private final xl b;
      private xl c = xk.a;
      private int d = 250;
      @Nullable
      private all e;
      private final List<fmy.b> f = new ArrayList<>();
      @Nullable
      private Runnable g = null;

      public a(frp $$0, xl $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fmy.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public fmy.a a(all $$0) {
         this.e = $$0;
         return this;
      }

      public fmy.a a(xl $$0) {
         this.c = $$0;
         return this;
      }

      public fmy.a a(xl $$0, Consumer<fmy> $$1) {
         this.f.add(new fmy.b($$0, $$1));
         return this;
      }

      public fmy.a a(Runnable $$0) {
         this.g = $$0;
         return this;
      }

      public fmy a() {
         if (this.f.isEmpty()) {
            throw new IllegalStateException("Popup must have at least one button");
         } else {
            return new fmy(this.a, this.d, this.e, this.b, this.c, List.copyOf(this.f), this.g);
         }
      }
   }

   static record b(xl a, Consumer<fmy> b) {
   }
}
