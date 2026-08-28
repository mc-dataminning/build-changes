import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fpv extends ful {
   private static final akv a = akv.b("popup/background");
   private static final int b = 12;
   private static final int c = 18;
   private static final int d = 6;
   private static final int s = 130;
   private static final int u = 64;
   private static final int v = 250;
   private final ful w;
   @Nullable
   private final akv x;
   private final wp y;
   private final List<fpv.b> z;
   @Nullable
   private final Runnable A;
   private final int B;
   private final fsl C = fsl.d();

   fpv(ful $$0, int $$1, @Nullable akv $$2, wp $$3, wp $$4, List<fpv.b> $$5, @Nullable Runnable $$6) {
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
   protected void aR_() {
      this.w.b(this.m, this.n, this.o);
      this.C.a(12).c().b();
      this.C.a(new fpn(this.l.f().a(n.r), this.p).d(this.B).b(true));
      if (this.x != null) {
         this.C.a(fpg.a(130, 64, this.x, 130, 64));
      }

      this.C.a(new fpn(this.y, this.p).d(this.B).b(true));
      this.C.a(this.m());
      this.C.a($$1 -> {
         foq var10000 = this.c($$1);
      });
      this.c();
   }

   private fsl m() {
      int $$0 = 6 * (this.z.size() - 1);
      int $$1 = Math.min((this.B - $$0) / this.z.size(), 150);
      fsl $$2 = fsl.e();
      $$2.a(6);

      for (fpv.b $$3 : this.z) {
         $$2.a(fot.a($$3.a(), $$1x -> $$3.b().accept(this)).a($$1).a());
      }

      return $$2;
   }

   @Override
   protected void c() {
      this.w.a(this.m, this.n, this.o);
      this.C.a();
      fsf.a(this.C, this.J());
   }

   @Override
   public void b(foe $$0, int $$1, int $$2, float $$3) {
      this.w.a($$0, -1, -1, $$3);
      $$0.d();
      RenderSystem.clear(256);
      this.b($$0);
      $$0.a(gmi::H, a, this.C.F() - 18, this.C.G() - 18, this.C.A() + 36, this.C.y() + 36);
   }

   @Override
   public wp i() {
      return wo.a(this.l, this.y);
   }

   @Override
   public void aO_() {
      if (this.A != null) {
         this.A.run();
      }

      this.m.a(this.w);
   }

   public static class a {
      private final ful a;
      private final wp b;
      private wp c = wo.a;
      private int d = 250;
      @Nullable
      private akv e;
      private final List<fpv.b> f = new ArrayList<>();
      @Nullable
      private Runnable g = null;

      public a(ful $$0, wp $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fpv.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public fpv.a a(akv $$0) {
         this.e = $$0;
         return this;
      }

      public fpv.a a(wp $$0) {
         this.c = $$0;
         return this;
      }

      public fpv.a a(wp $$0, Consumer<fpv> $$1) {
         this.f.add(new fpv.b($$0, $$1));
         return this;
      }

      public fpv.a a(Runnable $$0) {
         this.g = $$0;
         return this;
      }

      public fpv a() {
         if (this.f.isEmpty()) {
            throw new IllegalStateException("Popup must have at least one button");
         } else {
            return new fpv(this.a, this.d, this.e, this.b, this.c, List.copyOf(this.f), this.g);
         }
      }
   }

   static record b(wp a, Consumer<fpv> b) {
   }
}
