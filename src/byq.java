import java.util.List;
import org.joml.Vector3f;

public class byq extends byx {
   public static final float b = bim.A.k() / bim.V.k();
   private static final int e = 1200;
   private static final int bT = 50;
   private static final int bU = 6000;
   private static final int bV = 2;
   private static final int bW = 1200;

   public byq(bim<? extends byq> $$0, cpm $$1) {
      super($$0, $$1);
      this.fF();
      if (this.d != null) {
         this.d.c(400);
      }
   }

   public static bke.a p() {
      return byx.fZ().a(bkf.d, 0.3F).a(bkf.f, 8.0).a(bkf.a, 80.0);
   }

   @Override
   public int q() {
      return 60;
   }

   @Override
   protected aov r() {
      return this.ba() ? aow.gH : aow.gI;
   }

   @Override
   protected aov d(bhg $$0) {
      return this.ba() ? aow.gN : aow.gO;
   }

   @Override
   protected aov h_() {
      return this.ba() ? aow.gK : aow.gL;
   }

   @Override
   protected aov t() {
      return aow.gM;
   }

   @Override
   protected void V() {
      super.V();
      if ((this.ah + this.ah()) % 1200 == 0) {
         bhv $$0 = new bhv(bhx.d, 6000, 2);
         List<akl> $$1 = bhw.a((akk)this.dK(), this, this.di(), 50.0, $$0, 1200);
         $$1.forEach($$0x -> $$0x.c.b(new xv(xv.k, this.aS() ? 0.0F : 1.0F)));
      }

      if (!this.fM()) {
         this.a(this.dk(), 16);
      }
   }

   @Override
   protected Vector3f a(bii $$0, bij $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.353125F * $$2, 0.0F);
   }
}
