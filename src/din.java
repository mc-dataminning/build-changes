import com.mojang.serialization.MapCodec;

public class din extends djk implements djn {
   public static final MapCodec<din> a = b(din::new);
   protected static final float b = 4.0F;
   protected static final fbs c = djk.a(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   @Override
   public MapCodec<din> a() {
      return a;
   }

   public din(dwu.d $$0) {
      super($$0);
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      fay $$4 = $$0.a($$2);
      return c.a($$4.d, $$4.e, $$4.f);
   }

   @Override
   protected void b(dwv $$0, arc $$1, ji $$2, azg $$3) {
      if ($$3.a(3) == 0 && $$1.u($$2.d()) && $$1.b($$2.d(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected boolean a(dwv $$0, dgj $$1, ji $$2) {
      return $$1.a_($$2.e()).a(awo.ax);
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      if (!$$0.a($$1, $$3)) {
         return djm.a.m();
      } else {
         return $$4 == jn.b && $$6.a(djm.nB) ? djm.nB.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected cwn a(dgj $$0, ji $$1, dwv $$2, boolean $$3) {
      return new cwn(cwr.ed);
   }

   @Override
   public boolean a(dgj $$0, ji $$1, dwv $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dgg $$0, azg $$1, ji $$2, dwv $$3) {
      return true;
   }

   @Override
   public void a(arc $$0, azg $$1, ji $$2, dwv $$3) {
      this.a($$0, $$2);
   }

   @Override
   protected float a(dwv $$0, cov $$1, dfl $$2, ji $$3) {
      return $$1.eZ().h() instanceof cyb ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dgg $$0, ji $$1) {
      $$0.a($$1.d(), djm.nB.m().b(dio.i, dxh.b), 3);
   }
}
