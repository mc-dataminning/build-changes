import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class flc extends fpt {
   private static final alb a = alb.b("popup/background");
   private static final int b = 12;
   private static final int c = 18;
   private static final int d = 6;
   private static final int s = 130;
   private static final int u = 64;
   private static final int v = 250;
   private final fpt w;
   @Nullable
   private final alb x;
   private final xd y;
   private final List<flc.b> z;
   @Nullable
   private final Runnable A;
   private final int B;
   private final fns C = fns.d();

   flc(fpt $$0, int $$1, @Nullable alb $$2, xd $$3, xd $$4, List<flc.b> $$5, @Nullable Runnable $$6) {
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
      this.w.b(this.m, this.n, this.o);
      this.C.a(12).c().b();
      this.C.a(new fku(this.l.f().a(n.r), this.p).d(this.B).b(true));
      if (this.x != null) {
         this.C.a(fkn.a(130, 64, this.x, 130, 64));
      }

      this.C.a(new fku(this.y, this.p).d(this.B).b(true));
      this.C.a(this.m());
      this.C.a($$1 -> {
         fjy var10000 = this.c($$1);
      });
      this.c();
   }

   private fns m() {
      int $$0 = 6 * (this.z.size() - 1);
      int $$1 = Math.min((this.B - $$0) / this.z.size(), 150);
      fns $$2 = fns.e();
      $$2.a(6);

      for (flc.b $$3 : this.z) {
         $$2.a(fka.a($$3.a(), $$1x -> $$3.b().accept(this)).a($$1).a());
      }

      return $$2;
   }

   @Override
   protected void c() {
      this.w.a(this.m, this.n, this.o);
      this.C.a();
      fnm.a(this.C, this.H());
   }

   @Override
   public void b(fjn $$0, int $$1, int $$2, float $$3) {
      this.w.a($$0, -1, -1, $$3);
      $$0.e();
      RenderSystem.clear(256);
      this.b($$0);
      $$0.a(ghe::C, a, this.C.D() - 18, this.C.E() - 18, this.C.y() + 36, this.C.w() + 36);
   }

   @Override
   public xd i() {
      return xc.a(this.l, this.y);
   }

   @Override
   public void d() {
      if (this.A != null) {
         this.A.run();
      }

      this.m.a(this.w);
   }

   public static class a {
      private final fpt a;
      private final xd b;
      private xd c = xc.a;
      private int d = 250;
      @Nullable
      private alb e;
      private final List<flc.b> f = new ArrayList<>();
      @Nullable
      private Runnable g = null;

      public a(fpt $$0, xd $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public flc.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public flc.a a(alb $$0) {
         this.e = $$0;
         return this;
      }

      public flc.a a(xd $$0) {
         this.c = $$0;
         return this;
      }

      public flc.a a(xd $$0, Consumer<flc> $$1) {
         this.f.add(new flc.b($$0, $$1));
         return this;
      }

      public flc.a a(Runnable $$0) {
         this.g = $$0;
         return this;
      }

      public flc a() {
         if (this.f.isEmpty()) {
            throw new IllegalStateException("Popup must have at least one button");
         } else {
            return new flc(this.a, this.d, this.e, this.b, this.c, List.copyOf(this.f), this.g);
         }
      }
   }

   static record b(xd a, Consumer<flc> b) {
   }
}
