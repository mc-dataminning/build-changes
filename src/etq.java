import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class etq extends esj {
   @Nullable
   protected etx a;
   protected boolean b;

   public etq(int $$0, int $$1, int $$2, int $$3, boolean $$4) {
      super($$0, $$1, $$2, $$3, th.a);
      this.b = $$4;
   }

   public void a(etx $$0) {
      this.a = $$0;
   }

   public void b(boolean $$0) {
      this.b = $$0;
   }

   public boolean a() {
      return this.b;
   }

   @Override
   public void a(ewd $$0) {
      this.c($$0);
   }

   @Override
   public void b(esa $$0, int $$1, int $$2, float $$3) {
      if (this.a != null) {
         RenderSystem.disableDepthTest();
         $$0.a(this.a.a(this.b, this.o()), this.r(), this.t(), this.f, this.g);
         RenderSystem.enableDepthTest();
      }
   }
}
