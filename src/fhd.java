import com.mojang.blaze3d.systems.RenderSystem;

public abstract class fhd extends fhk {
   protected static final int e = 2;
   private static final fiz a = new fiz(new akk("widget/button"), new akk("widget/button_disabled"), new akk("widget/button_highlighted"));

   public fhd(int $$0, int $$1, int $$2, int $$3, wu $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public abstract void b();

   @Override
   protected void b(fgz $$0, int $$1, int $$2, float $$3) {
      ffn $$4 = ffn.Q();
      $$0.a(1.0F, 1.0F, 1.0F, this.l);
      RenderSystem.enableBlend();
      RenderSystem.enableDepthTest();
      $$0.a(a.a(this.j, this.B()), this.D(), this.E(), this.y(), this.w());
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      int $$5 = this.j ? 16777215 : 10526880;
      this.a($$0, $$4.h, $$5 | aye.f(this.l * 255.0F) << 24);
   }

   public void a(fgz $$0, fgx $$1, int $$2) {
      this.a($$0, $$1, 2, $$2);
   }

   @Override
   public void a(double $$0, double $$1) {
      this.b();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (!this.j || !this.k) {
         return false;
      } else if (fln.a($$0)) {
         this.a(ffn.Q().aj());
         this.b();
         return true;
      } else {
         return false;
      }
   }
}
