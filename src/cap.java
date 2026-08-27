import java.util.List;
import org.joml.Vector3f;

public class cap extends caw {
   public static final float b = bkm.A.k() / bkm.V.k();
   private static final int e = 1200;
   private static final int bT = 50;
   private static final int bU = 6000;
   private static final int bV = 2;
   private static final int bW = 1200;

   public cap(bkm<? extends cap> $$0, crs $$1) {
      super($$0, $$1);
      this.fJ();
      if (this.d != null) {
         this.d.c(400);
      }
   }

   public static bmd.a s() {
      return caw.ge().a(bme.m, 0.3F).a(bme.c, 8.0).a(bme.l, 80.0);
   }

   @Override
   public int t() {
      return 60;
   }

   @Override
   protected aqm w() {
      return this.ba() ? aqn.gL : aqn.gM;
   }

   @Override
   protected aqm d(bjg $$0) {
      return this.ba() ? aqn.gR : aqn.gS;
   }

   @Override
   protected aqm m_() {
      return this.ba() ? aqn.gO : aqn.gP;
   }

   @Override
   protected aqm y() {
      return aqn.gQ;
   }

   @Override
   protected void X() {
      super.X();
      if ((this.ah + this.ah()) % 1200 == 0) {
         bjv $$0 = new bjv(bjx.d, 6000, 2);
         List<amb> $$1 = bjw.a((ama)this.dL(), this, this.dj(), 50.0, $$0, 1200);
         $$1.forEach($$0x -> $$0x.c.b(new zi(zi.k, this.aS() ? 0.0F : 1.0F)));
      }

      if (!this.fQ()) {
         this.a(this.dl(), 16);
      }
   }

   @Override
   protected Vector3f a(bki $$0, bkj $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.353125F * $$2, 0.0F);
   }
}
