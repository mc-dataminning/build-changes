import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class faj extends ffe {
   private static final aiy a = new aiy("popup/background");
   private static final int b = 12;
   private static final int c = 18;
   private static final int k = 6;
   private static final int l = 130;
   private static final int m = 64;
   private static final int n = 250;
   private final ffe o;
   @Nullable
   private final aiy p;
   private final vq q;
   private final List<faj.b> r;
   @Nullable
   private final Runnable t;
   private final int u;
   private final fcx v = fcx.d();

   faj(ffe $$0, int $$1, @Nullable aiy $$2, vq $$3, vq $$4, List<faj.b> $$5, @Nullable Runnable $$6) {
      super($$3);
      this.o = $$0;
      this.p = $$2;
      this.q = $$4;
      this.r = $$5;
      this.t = $$6;
      this.u = $$1 - 36;
   }

   @Override
   public void aI_() {
      super.aI_();
      this.o.q();
   }

   @Override
   protected void aQ_() {
      this.v.a(12).c().b();
      this.v.a(new fab(this.e.f().a(n.r), this.i).c(this.u).b(true));
      if (this.p != null) {
         this.v.a(ezu.a(130, 64, this.p, 130, 64));
      }

      this.v.a(new fab(this.q, this.i).c(this.u).b(true));
      this.v.a(this.o());
      this.v.a($$1 -> {
         ezf var10000 = this.d($$1);
      });
      this.c();
   }

   private fcx o() {
      int $$0 = 6 * (this.r.size() - 1);
      int $$1 = Math.min((this.u - $$0) / this.r.size(), 150);
      fcx $$2 = fcx.e();
      $$2.a(6);

      for (faj.b $$3 : this.r) {
         $$2.a(ezh.a($$3.a(), $$1x -> $$3.b().accept(this)).a($$1).a());
      }

      return $$2;
   }

   @Override
   protected void c() {
      this.o.a(this.f, this.g, this.h);
      this.v.a();
      fcr.a(this.v, this.F());
   }

   @Override
   public void b(eyu $$0, int $$1, int $$2, float $$3) {
      this.o.a($$0, -1, -1, $$3);
      $$0.e();
      RenderSystem.clear(256, exh.a);
      this.a($$0);
      $$0.a(a, this.v.B() - 18, this.v.C() - 18, this.v.w() + 36, this.v.u() + 36);
   }

   @Override
   public vq i() {
      return vp.a(this.e, this.q);
   }

   @Override
   public void d() {
      if (this.t != null) {
         this.t.run();
      }

      this.f.a(this.o);
   }

   public static class a {
      private final ffe a;
      private final vq b;
      private vq c = vp.a;
      private int d = 250;
      @Nullable
      private aiy e;
      private final List<faj.b> f = new ArrayList<>();
      @Nullable
      private Runnable g = null;

      public a(ffe $$0, vq $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public faj.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public faj.a a(aiy $$0) {
         this.e = $$0;
         return this;
      }

      public faj.a a(vq $$0) {
         this.c = $$0;
         return this;
      }

      public faj.a a(vq $$0, Consumer<faj> $$1) {
         this.f.add(new faj.b($$0, $$1));
         return this;
      }

      public faj.a a(Runnable $$0) {
         this.g = $$0;
         return this;
      }

      public faj a() {
         if (this.f.isEmpty()) {
            throw new IllegalStateException("Popup must have at least one button");
         } else {
            return new faj(this.a, this.d, this.e, this.b, this.c, List.copyOf(this.f), this.g);
         }
      }
   }

   static record b(vq a, Consumer<faj> b) {
   }
}
