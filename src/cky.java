import javax.annotation.Nullable;

public class cky extends ckr {
   @Nullable
   private fbx b;

   public cky(ckp $$0) {
      super($$0);
   }

   @Override
   public void b() {
      fbx $$0 = this.a.K(1.0F).d();
      $$0.b((float) (-Math.PI / 4));
      double $$1 = this.a.c.dz();
      double $$2 = this.a.c.e(0.5);
      double $$3 = this.a.c.dF();

      for (int $$4 = 0; $$4 < 8; $$4++) {
         azh $$5 = this.a.dX();
         double $$6 = $$1 + $$5.k() / 2.0;
         double $$7 = $$2 + $$5.k() / 2.0;
         double $$8 = $$3 + $$5.k() / 2.0;
         fbx $$9 = this.a.dx();
         this.a.dU().a(lt.h, $$6, $$7, $$8, -$$0.d * 0.08F + $$9.d, -$$0.e * 0.3F + $$9.e, -$$0.f * 0.08F + $$9.f);
         $$0.b((float) (Math.PI / 16));
      }
   }

   @Override
   public void a(ard $$0) {
      if (this.b == null) {
         this.b = fbx.c($$0.a(edo.a.f, egt.a(this.a.j())));
      }

      if (this.b.c(this.a.dz(), this.a.dB(), this.a.dF()) < 1.0) {
         this.a.t().b(clf.f).i();
         this.a.t().a(clf.g);
      }
   }

   @Override
   public float e() {
      return 1.5F;
   }

   @Override
   public float g() {
      float $$0 = (float)this.a.dx().i() + 1.0F;
      float $$1 = Math.min($$0, 40.0F);
      return $$1 / $$0;
   }

   @Override
   public void c() {
      this.b = null;
   }

   @Nullable
   @Override
   public fbx f() {
      return this.b;
   }

   @Override
   public clf<cky> h() {
      return clf.d;
   }
}
