import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class fja extends fhs {
   @Nullable
   protected fjh a;
   protected boolean b;

   public fja(int $$0, int $$1, int $$2, int $$3, boolean $$4) {
      super($$0, $$1, $$2, $$3, wt.a);
      this.b = $$4;
   }

   public void a(fjh $$0) {
      this.a = $$0;
   }

   public void b(boolean $$0) {
      this.b = $$0;
   }

   public boolean a() {
      return this.b;
   }

   @Override
   public void a(flq $$0) {
      this.c($$0);
   }

   @Override
   public void b(fhh $$0, int $$1, int $$2, float $$3) {
      if (this.a != null) {
         RenderSystem.disableDepthTest();
         $$0.a(this.a.a(this.b, this.B()), this.D(), this.E(), this.g, this.h);
         RenderSystem.enableDepthTest();
      }
   }
}
