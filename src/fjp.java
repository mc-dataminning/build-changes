import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fjp extends fon {
   private static final akt a = new akt("popup/background");
   private static final int b = 12;
   private static final int c = 18;
   private static final int d = 6;
   private static final int r = 130;
   private static final int s = 64;
   private static final int u = 250;
   private final fon v;
   @Nullable
   private final akt w;
   private final xe x;
   private final List<fjp.b> y;
   @Nullable
   private final Runnable z;
   private final int A;
   private final fme B = fme.d();

   fjp(fon $$0, int $$1, @Nullable akt $$2, xe $$3, xe $$4, List<fjp.b> $$5, @Nullable Runnable $$6) {
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
   protected void aN_() {
      this.B.a(12).c().b();
      this.B.a(new fjh(this.l.f().a(n.r), this.p).d(this.A).b(true));
      if (this.w != null) {
         this.B.a(fja.a(130, 64, this.w, 130, 64));
      }

      this.B.a(new fjh(this.x, this.p).d(this.A).b(true));
      this.B.a(this.B());
      this.B.a($$1 -> {
         fil var10000 = this.c($$1);
      });
      this.c();
   }

   private fme B() {
      int $$0 = 6 * (this.y.size() - 1);
      int $$1 = Math.min((this.A - $$0) / this.y.size(), 150);
      fme $$2 = fme.e();
      $$2.a(6);

      for (fjp.b $$3 : this.y) {
         $$2.a(fin.a($$3.a(), $$1x -> $$3.b().accept(this)).a($$1).a());
      }

      return $$2;
   }

   @Override
   protected void c() {
      this.v.a(this.m, this.n, this.o);
      this.B.a();
      fly.a(this.B, this.G());
   }

   @Override
   public void b(fia $$0, int $$1, int $$2, float $$3) {
      this.v.a($$0, -1, -1, $$3);
      $$0.e();
      RenderSystem.clear(256, fgj.a);
      this.b($$0);
      $$0.a(a, this.B.C() - 18, this.B.D() - 18, this.B.x() + 36, this.B.v() + 36);
   }

   @Override
   public xe i() {
      return xd.a(this.l, this.x);
   }

   @Override
   public void d() {
      if (this.z != null) {
         this.z.run();
      }

      this.m.a(this.v);
   }

   public static class a {
      private final fon a;
      private final xe b;
      private xe c = xd.a;
      private int d = 250;
      @Nullable
      private akt e;
      private final List<fjp.b> f = new ArrayList<>();
      @Nullable
      private Runnable g = null;

      public a(fon $$0, xe $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fjp.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public fjp.a a(akt $$0) {
         this.e = $$0;
         return this;
      }

      public fjp.a a(xe $$0) {
         this.c = $$0;
         return this;
      }

      public fjp.a a(xe $$0, Consumer<fjp> $$1) {
         this.f.add(new fjp.b($$0, $$1));
         return this;
      }

      public fjp.a a(Runnable $$0) {
         this.g = $$0;
         return this;
      }

      public fjp a() {
         if (this.f.isEmpty()) {
            throw new IllegalStateException("Popup must have at least one button");
         } else {
            return new fjp(this.a, this.d, this.e, this.b, this.c, List.copyOf(this.f), this.g);
         }
      }
   }

   static record b(xe a, Consumer<fjp> b) {
   }
}
