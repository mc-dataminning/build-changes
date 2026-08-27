import java.util.List;
import org.joml.Vector3f;

public class cby extends ccf {
   public static final float b = blt.B.k() / blt.W.k();
   private static final int e = 1200;
   private static final int bT = 50;
   private static final int bU = 6000;
   private static final int bV = 2;
   private static final int bW = 1200;

   public cby(blt<? extends cby> $$0, cti $$1) {
      super($$0, $$1);
      this.fJ();
      if (this.d != null) {
         this.d.c(400);
      }
   }

   public static bnk.a u() {
      return ccf.ge().a(bnl.m, 0.3F).a(bnl.c, 8.0).a(bnl.l, 80.0);
   }

   @Override
   public int w() {
      return 60;
   }

   @Override
   protected arl y() {
      return this.bc() ? arm.hk : arm.hl;
   }

   @Override
   protected arl d(bkn $$0) {
      return this.bc() ? arm.hq : arm.hr;
   }

   @Override
   protected arl n_() {
      return this.bc() ? arm.hn : arm.ho;
   }

   @Override
   protected arl A() {
      return arm.hp;
   }

   @Override
   protected void Z() {
      super.Z();
      if ((this.ah + this.aj()) % 1200 == 0) {
         blc $$0 = new blc(ble.d, 6000, 2);
         List<ana> $$1 = bld.a((amz)this.dM(), this, this.dk(), 50.0, $$0, 1200);
         $$1.forEach($$0x -> $$0x.c.b(new aac(aac.k, this.aU() ? 0.0F : 1.0F)));
      }

      if (!this.fQ()) {
         this.a(this.dm(), 16);
      }
   }

   @Override
   protected Vector3f a(blp $$0, blq $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.353125F * $$2, 0.0F);
   }
}
