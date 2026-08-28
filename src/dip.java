import com.mojang.serialization.MapCodec;

public class dip extends djm implements djp {
   public static final MapCodec<dip> a = b(dip::new);
   protected static final float b = 4.0F;
   protected static final fbu c = djm.a(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   @Override
   public MapCodec<dip> a() {
      return a;
   }

   public dip(dww.d $$0) {
      super($$0);
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      fba $$4 = $$0.a($$2);
      return c.a($$4.d, $$4.e, $$4.f);
   }

   @Override
   protected void b(dwx $$0, ard $$1, ji $$2, azh $$3) {
      if ($$3.a(3) == 0 && $$1.u($$2.d()) && $$1.b($$2.d(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected boolean a(dwx $$0, dgl $$1, ji $$2) {
      return $$1.a_($$2.e()).a(awp.ax);
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      if (!$$0.a($$1, $$3)) {
         return djo.a.m();
      } else {
         return $$4 == jn.b && $$6.a(djo.nB) ? djo.nB.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected cwp a(dgl $$0, ji $$1, dwx $$2, boolean $$3) {
      return new cwp(cwt.ed);
   }

   @Override
   public boolean a(dgl $$0, ji $$1, dwx $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dgi $$0, azh $$1, ji $$2, dwx $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dwx $$3) {
      this.a($$0, $$2);
   }

   @Override
   protected float a(dwx $$0, cox $$1, dfn $$2, ji $$3) {
      return $$1.eZ().h() instanceof cyd ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dgi $$0, ji $$1) {
      $$0.a($$1.d(), djo.nB.m().b(diq.i, dxj.b), 3);
   }
}
