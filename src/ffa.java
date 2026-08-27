import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ffa extends fjx {
   private static final ajv a = new ajv("popup/background");
   private static final int b = 12;
   private static final int c = 18;
   private static final int d = 6;
   private static final int o = 130;
   private static final int p = 64;
   private static final int q = 250;
   private final fjx r;
   @Nullable
   private final ajv s;
   private final wi u;
   private final List<ffa.b> v;
   @Nullable
   private final Runnable w;
   private final int x;
   private final fhp y = fhp.d();

   ffa(fjx $$0, int $$1, @Nullable ajv $$2, wi $$3, wi $$4, List<ffa.b> $$5, @Nullable Runnable $$6) {
      super($$3);
      this.r = $$0;
      this.s = $$2;
      this.u = $$4;
      this.v = $$5;
      this.w = $$6;
      this.x = $$1 - 36;
   }

   @Override
   public void aF_() {
      super.aF_();
      this.r.o();
   }

   @Override
   protected void aM_() {
      this.y.a(12).c().b();
      this.y.a(new fes(this.i.f().a(n.r), this.m).d(this.x).b(true));
      if (this.s != null) {
         this.y.a(fel.a(130, 64, this.s, 130, 64));
      }

      this.y.a(new fes(this.u, this.m).d(this.x).b(true));
      this.y.a(this.m());
      this.y.a($$1 -> {
         fdw var10000 = this.c($$1);
      });
      this.c();
   }

   private fhp m() {
      int $$0 = 6 * (this.v.size() - 1);
      int $$1 = Math.min((this.x - $$0) / this.v.size(), 150);
      fhp $$2 = fhp.e();
      $$2.a(6);

      for (ffa.b $$3 : this.v) {
         $$2.a(fdy.a($$3.a(), $$1x -> $$3.b().accept(this)).a($$1).a());
      }

      return $$2;
   }

   @Override
   protected void c() {
      this.r.a(this.j, this.k, this.l);
      this.y.a();
      fhj.a(this.y, this.G());
   }

   @Override
   public void b(fdl $$0, int $$1, int $$2, float $$3) {
      this.r.a($$0, -1, -1, $$3);
      $$0.e();
      RenderSystem.clear(256, fby.a);
      this.b($$0);
      $$0.a(a, this.y.C() - 18, this.y.D() - 18, this.y.x() + 36, this.y.v() + 36);
   }

   @Override
   public wi i() {
      return wh.a(this.i, this.u);
   }

   @Override
   public void d() {
      if (this.w != null) {
         this.w.run();
      }

      this.j.a(this.r);
   }

   public static class a {
      private final fjx a;
      private final wi b;
      private wi c = wh.a;
      private int d = 250;
      @Nullable
      private ajv e;
      private final List<ffa.b> f = new ArrayList<>();
      @Nullable
      private Runnable g = null;

      public a(fjx $$0, wi $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public ffa.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public ffa.a a(ajv $$0) {
         this.e = $$0;
         return this;
      }

      public ffa.a a(wi $$0) {
         this.c = $$0;
         return this;
      }

      public ffa.a a(wi $$0, Consumer<ffa> $$1) {
         this.f.add(new ffa.b($$0, $$1));
         return this;
      }

      public ffa.a a(Runnable $$0) {
         this.g = $$0;
         return this;
      }

      public ffa a() {
         if (this.f.isEmpty()) {
            throw new IllegalStateException("Popup must have at least one button");
         } else {
            return new ffa(this.a, this.d, this.e, this.b, this.c, List.copyOf(this.f), this.g);
         }
      }
   }

   static record b(wi a, Consumer<ffa> b) {
   }
}
