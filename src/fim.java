import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class fim extends fhe {
   @Nullable
   protected fit a;
   protected boolean b;

   public fim(int $$0, int $$1, int $$2, int $$3, boolean $$4) {
      super($$0, $$1, $$2, $$3, xo.a);
      this.b = $$4;
   }

   public void a(fit $$0) {
      this.a = $$0;
   }

   public void b(boolean $$0) {
      this.b = $$0;
   }

   public boolean a() {
      return this.b;
   }

   @Override
   public void a(flc $$0) {
      this.c($$0);
   }

   @Override
   public void b(fgt $$0, int $$1, int $$2, float $$3) {
      if (this.a != null) {
         RenderSystem.disableDepthTest();
         $$0.a(this.a.a(this.b, this.A()), this.C(), this.D(), this.g, this.h);
         RenderSystem.enableDepthTest();
      }
   }
}
