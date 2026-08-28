import com.mojang.serialization.MapCodec;

public class dio extends djl implements djo {
   public static final MapCodec<dio> a = b(dio::new);
   protected static final float b = 4.0F;
   protected static final fbt c = djl.a(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   @Override
   public MapCodec<dio> a() {
      return a;
   }

   public dio(dwv.d $$0) {
      super($$0);
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      faz $$4 = $$0.a($$2);
      return c.a($$4.d, $$4.e, $$4.f);
   }

   @Override
   protected void b(dww $$0, ard $$1, ji $$2, azh $$3) {
      if ($$3.a(3) == 0 && $$1.u($$2.d()) && $$1.b($$2.d(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected boolean a(dww $$0, dgk $$1, ji $$2) {
      return $$1.a_($$2.e()).a(awp.ax);
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      if (!$$0.a($$1, $$3)) {
         return djn.a.m();
      } else {
         return $$4 == jn.b && $$6.a(djn.nB) ? djn.nB.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected cwo a(dgk $$0, ji $$1, dww $$2, boolean $$3) {
      return new cwo(cws.ed);
   }

   @Override
   public boolean a(dgk $$0, ji $$1, dww $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dgh $$0, azh $$1, ji $$2, dww $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dww $$3) {
      this.a($$0, $$2);
   }

   @Override
   protected float a(dww $$0, cow $$1, dfm $$2, ji $$3) {
      return $$1.eZ().h() instanceof cyc ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dgh $$0, ji $$1) {
      $$0.a($$1.d(), djn.nB.m().b(dip.i, dxi.b), 3);
   }
}
