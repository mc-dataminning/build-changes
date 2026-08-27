import java.util.List;
import org.joml.Vector3f;

public class cce extends ccl {
   public static final float b = blz.B.k() / blz.W.k();
   private static final int e = 1200;
   private static final int bT = 50;
   private static final int bU = 6000;
   private static final int bV = 2;
   private static final int bW = 1200;

   public cce(blz<? extends cce> $$0, ctp $$1) {
      super($$0, $$1);
      this.fJ();
      if (this.d != null) {
         this.d.c(400);
      }
   }

   public static bnq.a u() {
      return ccl.ge().a(bnr.m, 0.3F).a(bnr.c, 8.0).a(bnr.l, 80.0);
   }

   @Override
   public int w() {
      return 60;
   }

   @Override
   protected arr y() {
      return this.bc() ? ars.hk : ars.hl;
   }

   @Override
   protected arr d(bkt $$0) {
      return this.bc() ? ars.hq : ars.hr;
   }

   @Override
   protected arr n_() {
      return this.bc() ? ars.hn : ars.ho;
   }

   @Override
   protected arr A() {
      return ars.hp;
   }

   @Override
   protected void Z() {
      super.Z();
      if ((this.ah + this.aj()) % 1200 == 0) {
         bli $$0 = new bli(blk.d, 6000, 2);
         List<ane> $$1 = blj.a((and)this.dM(), this, this.dk(), 50.0, $$0, 1200);
         $$1.forEach($$0x -> $$0x.c.b(new aaf(aaf.k, this.aU() ? 0.0F : 1.0F)));
      }

      if (!this.fQ()) {
         this.a(this.dm(), 16);
      }
   }

   @Override
   protected Vector3f a(blv $$0, blw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.353125F * $$2, 0.0F);
   }
}
