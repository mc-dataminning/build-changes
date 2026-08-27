import com.mojang.blaze3d.systems.RenderSystem;

public class eqj extends epf {
   protected acq a;
   protected boolean b;
   protected int c;
   protected int d;
   protected int e;
   protected int f;

   public eqj(int $$0, int $$1, int $$2, int $$3, boolean $$4) {
      super($$0, $$1, $$2, $$3, sv.a);
      this.b = $$4;
   }

   public void a(int $$0, int $$1, int $$2, int $$3, acq $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.a = $$4;
   }

   public void b(boolean $$0) {
      this.b = $$0;
   }

   public boolean a() {
      return this.b;
   }

   @Override
   public void a(esp $$0) {
      this.c($$0);
   }

   @Override
   public void b(eox $$0, int $$1, int $$2, float $$3) {
      RenderSystem.disableDepthTest();
      int $$4 = this.c;
      int $$5 = this.d;
      if (this.b) {
         $$4 += this.e;
      }

      if (this.n()) {
         $$5 += this.f;
      }

      $$0.a(this.a, this.p(), this.r(), $$4, $$5, this.o, this.p);
      RenderSystem.enableDepthTest();
   }
}
