import javax.annotation.Nullable;

public class chj extends chc {
   @Nullable
   private ewu b;

   public chj(cha $$0) {
      super($$0);
   }

   @Override
   public void b() {
      ewu $$0 = this.a.F(1.0F).d();
      $$0.b((float) (-Math.PI / 4));
      double $$1 = this.a.e.dz();
      double $$2 = this.a.e.e(0.5);
      double $$3 = this.a.e.dF();

      for (int $$4 = 0; $$4 < 8; $$4++) {
         ayt $$5 = this.a.et();
         double $$6 = $$1 + $$5.k() / 2.0;
         double $$7 = $$2 + $$5.k() / 2.0;
         double $$8 = $$3 + $$5.k() / 2.0;
         ewu $$9 = this.a.dx();
         this.a.dU().a(lb.h, $$6, $$7, $$8, -$$0.c * 0.08F + $$9.c, -$$0.d * 0.3F + $$9.d, -$$0.e * 0.08F + $$9.e);
         $$0.b((float) (Math.PI / 16));
      }
   }

   @Override
   public void c() {
      if (this.b == null) {
         this.b = ewu.c(this.a.dU().a(dyu.a.f, ebz.a(this.a.r())));
      }

      if (this.b.c(this.a.dz(), this.a.dB(), this.a.dF()) < 1.0) {
         this.a.gv().b(chq.f).j();
         this.a.gv().a(chq.g);
      }
   }

   @Override
   public float f() {
      return 1.5F;
   }

   @Override
   public float h() {
      float $$0 = (float)this.a.dx().h() + 1.0F;
      float $$1 = Math.min($$0, 40.0F);
      return $$1 / $$0;
   }

   @Override
   public void d() {
      this.b = null;
   }

   @Nullable
   @Override
   public ewu g() {
      return this.b;
   }

   @Override
   public chq<chj> i() {
      return chq.d;
   }
}
