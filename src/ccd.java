import java.util.List;
import org.joml.Vector3f;

public class ccd extends cck {
   public static final float b = bly.B.k() / bly.W.k();
   private static final int e = 1200;
   private static final int bT = 50;
   private static final int bU = 6000;
   private static final int bV = 2;
   private static final int bW = 1200;

   public ccd(bly<? extends ccd> $$0, cto $$1) {
      super($$0, $$1);
      this.fJ();
      if (this.d != null) {
         this.d.c(400);
      }
   }

   public static bnp.a u() {
      return cck.ge().a(bnq.m, 0.3F).a(bnq.c, 8.0).a(bnq.l, 80.0);
   }

   @Override
   public int w() {
      return 60;
   }

   @Override
   protected arq y() {
      return this.bc() ? arr.hk : arr.hl;
   }

   @Override
   protected arq d(bks $$0) {
      return this.bc() ? arr.hq : arr.hr;
   }

   @Override
   protected arq n_() {
      return this.bc() ? arr.hn : arr.ho;
   }

   @Override
   protected arq A() {
      return arr.hp;
   }

   @Override
   protected void Z() {
      super.Z();
      if ((this.ah + this.aj()) % 1200 == 0) {
         blh $$0 = new blh(blj.d, 6000, 2);
         List<ane> $$1 = bli.a((and)this.dM(), this, this.dk(), 50.0, $$0, 1200);
         $$1.forEach($$0x -> $$0x.c.b(new aaf(aaf.k, this.aU() ? 0.0F : 1.0F)));
      }

      if (!this.fQ()) {
         this.a(this.dm(), 16);
      }
   }

   @Override
   protected Vector3f a(blu $$0, blv $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.353125F * $$2, 0.0F);
   }
}
