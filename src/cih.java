import javax.annotation.Nullable;

public class cih extends cia {
   @Nullable
   private eww b;

   public cih(chy $$0) {
      super($$0);
   }

   @Override
   public void b() {
      eww $$0 = this.a.G(1.0F).d();
      $$0.b((float) (-Math.PI / 4));
      double $$1 = this.a.e.dv();
      double $$2 = this.a.e.e(0.5);
      double $$3 = this.a.e.dB();

      for (int $$4 = 0; $$4 < 8; $$4++) {
         ayv $$5 = this.a.dT();
         double $$6 = $$1 + $$5.k() / 2.0;
         double $$7 = $$2 + $$5.k() / 2.0;
         double $$8 = $$3 + $$5.k() / 2.0;
         eww $$9 = this.a.dt();
         this.a.dQ().a(lm.h, $$6, $$7, $$8, -$$0.c * 0.08F + $$9.c, -$$0.d * 0.3F + $$9.d, -$$0.e * 0.08F + $$9.e);
         $$0.b((float) (Math.PI / 16));
      }
   }

   @Override
   public void c() {
      if (this.b == null) {
         this.b = eww.c(this.a.dQ().a(dyv.a.f, ebz.a(this.a.s())));
      }

      if (this.b.c(this.a.dv(), this.a.dx(), this.a.dB()) < 1.0) {
         this.a.gj().b(cio.f).j();
         this.a.gj().a(cio.g);
      }
   }

   @Override
   public float f() {
      return 1.5F;
   }

   @Override
   public float h() {
      float $$0 = (float)this.a.dt().h() + 1.0F;
      float $$1 = Math.min($$0, 40.0F);
      return $$1 / $$0;
   }

   @Override
   public void d() {
      this.b = null;
   }

   @Nullable
   @Override
   public eww g() {
      return this.b;
   }

   @Override
   public cio<cih> i() {
      return cio.d;
   }
}
