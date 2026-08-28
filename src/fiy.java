import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class fiy extends fhq {
   @Nullable
   protected fjf a;
   protected boolean b;

   public fiy(int $$0, int $$1, int $$2, int $$3, boolean $$4) {
      super($$0, $$1, $$2, $$3, wt.a);
      this.b = $$4;
   }

   public void a(fjf $$0) {
      this.a = $$0;
   }

   public void b(boolean $$0) {
      this.b = $$0;
   }

   public boolean a() {
      return this.b;
   }

   @Override
   public void a(flo $$0) {
      this.c($$0);
   }

   @Override
   public void b(fhf $$0, int $$1, int $$2, float $$3) {
      if (this.a != null) {
         RenderSystem.disableDepthTest();
         $$0.a(this.a.a(this.b, this.B()), this.D(), this.E(), this.g, this.h);
         RenderSystem.enableDepthTest();
      }
   }
}
