import java.util.List;
import org.joml.Vector3f;

public class bys extends byz {
   public static final float b = bip.A.k() / bip.V.k();
   private static final int e = 1200;
   private static final int bT = 50;
   private static final int bU = 6000;
   private static final int bV = 2;
   private static final int bW = 1200;

   public bys(bip<? extends bys> $$0, cpq $$1) {
      super($$0, $$1);
      this.fF();
      if (this.d != null) {
         this.d.c(400);
      }
   }

   public static bkg.a p() {
      return byz.ga().a(bkh.d, 0.3F).a(bkh.f, 8.0).a(bkh.a, 80.0);
   }

   @Override
   public int q() {
      return 60;
   }

   @Override
   protected aoy r() {
      return this.ba() ? aoz.gH : aoz.gI;
   }

   @Override
   protected aoy d(bhj $$0) {
      return this.ba() ? aoz.gN : aoz.gO;
   }

   @Override
   protected aoy h_() {
      return this.ba() ? aoz.gK : aoz.gL;
   }

   @Override
   protected aoy t() {
      return aoz.gM;
   }

   @Override
   protected void V() {
      super.V();
      if ((this.ah + this.ah()) % 1200 == 0) {
         bhy $$0 = new bhy(bia.d, 6000, 2);
         List<ako> $$1 = bhz.a((akn)this.dK(), this, this.di(), 50.0, $$0, 1200);
         $$1.forEach($$0x -> $$0x.c.b(new xy(xy.k, this.aS() ? 0.0F : 1.0F)));
      }

      if (!this.fM()) {
         this.a(this.dk(), 16);
      }
   }

   @Override
   protected Vector3f a(bil $$0, bim $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.353125F * $$2, 0.0F);
   }
}
