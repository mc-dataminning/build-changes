import java.util.List;
import org.joml.Vector3f;

public class byo extends byv {
   public static final float b = bik.A.k() / bik.V.k();
   private static final int e = 1200;
   private static final int bT = 50;
   private static final int bU = 6000;
   private static final int bV = 2;
   private static final int bW = 1200;

   public byo(bik<? extends byo> $$0, cpk $$1) {
      super($$0, $$1);
      this.fF();
      if (this.d != null) {
         this.d.c(400);
      }
   }

   public static bkc.a p() {
      return byv.fZ().a(bkd.d, 0.3F).a(bkd.f, 8.0).a(bkd.a, 80.0);
   }

   @Override
   public int q() {
      return 60;
   }

   @Override
   protected aot r() {
      return this.ba() ? aou.gH : aou.gI;
   }

   @Override
   protected aot d(bhe $$0) {
      return this.ba() ? aou.gN : aou.gO;
   }

   @Override
   protected aot h_() {
      return this.ba() ? aou.gK : aou.gL;
   }

   @Override
   protected aot t() {
      return aou.gM;
   }

   @Override
   protected void V() {
      super.V();
      if ((this.ah + this.ah()) % 1200 == 0) {
         bht $$0 = new bht(bhv.d, 6000, 2);
         List<akj> $$1 = bhu.a((aki)this.dK(), this, this.di(), 50.0, $$0, 1200);
         $$1.forEach($$0x -> $$0x.c.b(new xu(xu.k, this.aS() ? 0.0F : 1.0F)));
      }

      if (!this.fM()) {
         this.a(this.dk(), 16);
      }
   }

   @Override
   protected Vector3f a(big $$0, bih $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.353125F * $$2, 0.0F);
   }
}
