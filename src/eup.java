import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class eup extends eth {
   @Nullable
   protected euw a;
   protected boolean b;

   public eup(int $$0, int $$1, int $$2, int $$3, boolean $$4) {
      super($$0, $$1, $$2, $$3, uh.a);
      this.b = $$4;
   }

   public void a(euw $$0) {
      this.a = $$0;
   }

   public void b(boolean $$0) {
      this.b = $$0;
   }

   public boolean a() {
      return this.b;
   }

   @Override
   public void a(exc $$0) {
      this.c($$0);
   }

   @Override
   public void b(esy $$0, int $$1, int $$2, float $$3) {
      if (this.a != null) {
         RenderSystem.disableDepthTest();
         $$0.a(this.a.a(this.b, this.n()), this.p(), this.r(), this.f, this.g);
         RenderSystem.enableDepthTest();
      }
   }
}
