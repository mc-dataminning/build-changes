import java.util.List;
import org.joml.Vector3f;

public class byz extends bzg {
   public static final float b = biw.A.k() / biw.V.k();
   private static final int e = 1200;
   private static final int bT = 50;
   private static final int bU = 6000;
   private static final int bV = 2;
   private static final int bW = 1200;

   public byz(biw<? extends byz> $$0, cpx $$1) {
      super($$0, $$1);
      this.fI();
      if (this.d != null) {
         this.d.c(400);
      }
   }

   public static bkn.a s() {
      return bzg.gd().a(bko.d, 0.3F).a(bko.f, 8.0).a(bko.a, 80.0);
   }

   @Override
   public int t() {
      return 60;
   }

   @Override
   protected ape w() {
      return this.ba() ? apf.gH : apf.gI;
   }

   @Override
   protected ape d(bhq $$0) {
      return this.ba() ? apf.gN : apf.gO;
   }

   @Override
   protected ape l_() {
      return this.ba() ? apf.gK : apf.gL;
   }

   @Override
   protected ape y() {
      return apf.gM;
   }

   @Override
   protected void X() {
      super.X();
      if ((this.ah + this.ah()) % 1200 == 0) {
         bif $$0 = new bif(bih.d, 6000, 2);
         List<akt> $$1 = big.a((aks)this.dL(), this, this.dj(), 50.0, $$0, 1200);
         $$1.forEach($$0x -> $$0x.c.b(new yd(yd.k, this.aS() ? 0.0F : 1.0F)));
      }

      if (!this.fP()) {
         this.a(this.dl(), 16);
      }
   }

   @Override
   protected Vector3f a(bis $$0, bit $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.353125F * $$2, 0.0F);
   }
}
