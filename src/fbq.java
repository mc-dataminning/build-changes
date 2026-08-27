import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class fbq extends fai {
   @Nullable
   protected fbx a;
   protected boolean b;

   public fbq(int $$0, int $$1, int $$2, int $$3, boolean $$4) {
      super($$0, $$1, $$2, $$3, vr.a);
      this.b = $$4;
   }

   public void a(fbx $$0) {
      this.a = $$0;
   }

   public void b(boolean $$0) {
      this.b = $$0;
   }

   public boolean a() {
      return this.b;
   }

   @Override
   public void a(fef $$0) {
      this.c($$0);
   }

   @Override
   public void b(ezx $$0, int $$1, int $$2, float $$3) {
      if (this.a != null) {
         RenderSystem.disableDepthTest();
         $$0.a(this.a.a(this.b, this.z()), this.B(), this.C(), this.g, this.h);
         RenderSystem.enableDepthTest();
      }
   }
}
