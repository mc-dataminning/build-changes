import java.util.List;
import org.joml.Vector3f;

public class caa extends cah {
   public static final float b = bjx.A.k() / bjx.V.k();
   private static final int e = 1200;
   private static final int bT = 50;
   private static final int bU = 6000;
   private static final int bV = 2;
   private static final int bW = 1200;

   public caa(bjx<? extends caa> $$0, cqz $$1) {
      super($$0, $$1);
      this.fJ();
      if (this.d != null) {
         this.d.c(400);
      }
   }

   public static blo.a s() {
      return cah.ge().a(blp.m, 0.3F).a(blp.c, 8.0).a(blp.l, 80.0);
   }

   @Override
   public int t() {
      return 60;
   }

   @Override
   protected aqc w() {
      return this.ba() ? aqd.gJ : aqd.gK;
   }

   @Override
   protected aqc d(bir $$0) {
      return this.ba() ? aqd.gP : aqd.gQ;
   }

   @Override
   protected aqc m_() {
      return this.ba() ? aqd.gM : aqd.gN;
   }

   @Override
   protected aqc y() {
      return aqd.gO;
   }

   @Override
   protected void X() {
      super.X();
      if ((this.ah + this.ah()) % 1200 == 0) {
         bjg $$0 = new bjg(bji.d, 6000, 2);
         List<alr> $$1 = bjh.a((alq)this.dL(), this, this.dj(), 50.0, $$0, 1200);
         $$1.forEach($$0x -> $$0x.c.b(new yz(yz.k, this.aS() ? 0.0F : 1.0F)));
      }

      if (!this.fQ()) {
         this.a(this.dl(), 16);
      }
   }

   @Override
   protected Vector3f a(bjt $$0, bju $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.353125F * $$2, 0.0F);
   }
}
