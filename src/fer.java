import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fer extends fjo {
   private static final ajt a = new ajt("popup/background");
   private static final int b = 12;
   private static final int c = 18;
   private static final int d = 6;
   private static final int o = 130;
   private static final int p = 64;
   private static final int q = 250;
   private final fjo r;
   @Nullable
   private final ajt s;
   private final wg u;
   private final List<fer.b> v;
   @Nullable
   private final Runnable w;
   private final int x;
   private final fhg y = fhg.d();

   fer(fjo $$0, int $$1, @Nullable ajt $$2, wg $$3, wg $$4, List<fer.b> $$5, @Nullable Runnable $$6) {
      super($$3);
      this.r = $$0;
      this.s = $$2;
      this.u = $$4;
      this.v = $$5;
      this.w = $$6;
      this.x = $$1 - 36;
   }

   @Override
   public void aG_() {
      super.aG_();
      this.r.o();
   }

   @Override
   protected void aN_() {
      this.y.a(12).c().b();
      this.y.a(new fej(this.i.f().a(n.r), this.m).d(this.x).b(true));
      if (this.s != null) {
         this.y.a(fec.a(130, 64, this.s, 130, 64));
      }

      this.y.a(new fej(this.u, this.m).d(this.x).b(true));
      this.y.a(this.m());
      this.y.a($$1 -> {
         fdn var10000 = this.c($$1);
      });
      this.c();
   }

   private fhg m() {
      int $$0 = 6 * (this.v.size() - 1);
      int $$1 = Math.min((this.x - $$0) / this.v.size(), 150);
      fhg $$2 = fhg.e();
      $$2.a(6);

      for (fer.b $$3 : this.v) {
         $$2.a(fdp.a($$3.a(), $$1x -> $$3.b().accept(this)).a($$1).a());
      }

      return $$2;
   }

   @Override
   protected void c() {
      this.r.a(this.j, this.k, this.l);
      this.y.a();
      fha.a(this.y, this.G());
   }

   @Override
   public void b(fdc $$0, int $$1, int $$2, float $$3) {
      this.r.a($$0, -1, -1, $$3);
      $$0.e();
      RenderSystem.clear(256, fbp.a);
      this.b($$0);
      $$0.a(a, this.y.C() - 18, this.y.D() - 18, this.y.x() + 36, this.y.v() + 36);
   }

   @Override
   public wg i() {
      return wf.a(this.i, this.u);
   }

   @Override
   public void d() {
      if (this.w != null) {
         this.w.run();
      }

      this.j.a(this.r);
   }

   public static class a {
      private final fjo a;
      private final wg b;
      private wg c = wf.a;
      private int d = 250;
      @Nullable
      private ajt e;
      private final List<fer.b> f = new ArrayList<>();
      @Nullable
      private Runnable g = null;

      public a(fjo $$0, wg $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fer.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public fer.a a(ajt $$0) {
         this.e = $$0;
         return this;
      }

      public fer.a a(wg $$0) {
         this.c = $$0;
         return this;
      }

      public fer.a a(wg $$0, Consumer<fer> $$1) {
         this.f.add(new fer.b($$0, $$1));
         return this;
      }

      public fer.a a(Runnable $$0) {
         this.g = $$0;
         return this;
      }

      public fer a() {
         if (this.f.isEmpty()) {
            throw new IllegalStateException("Popup must have at least one button");
         } else {
            return new fer(this.a, this.d, this.e, this.b, this.c, List.copyOf(this.f), this.g);
         }
      }
   }

   static record b(wg a, Consumer<fer> b) {
   }
}
