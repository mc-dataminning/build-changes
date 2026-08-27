import java.util.List;
import org.joml.Vector3f;

public class byx extends bze {
   public static final float b = biu.A.k() / biu.V.k();
   private static final int e = 1200;
   private static final int bT = 50;
   private static final int bU = 6000;
   private static final int bV = 2;
   private static final int bW = 1200;

   public byx(biu<? extends byx> $$0, cpv $$1) {
      super($$0, $$1);
      this.fI();
      if (this.d != null) {
         this.d.c(400);
      }
   }

   public static bkl.a s() {
      return bze.gd().a(bkm.d, 0.3F).a(bkm.f, 8.0).a(bkm.a, 80.0);
   }

   @Override
   public int t() {
      return 60;
   }

   @Override
   protected apd w() {
      return this.bb() ? ape.gH : ape.gI;
   }

   @Override
   protected apd d(bho $$0) {
      return this.bb() ? ape.gN : ape.gO;
   }

   @Override
   protected apd l_() {
      return this.bb() ? ape.gK : ape.gL;
   }

   @Override
   protected apd y() {
      return ape.gM;
   }

   @Override
   protected void Y() {
      super.Y();
      if ((this.ah + this.ai()) % 1200 == 0) {
         bid $$0 = new bid(bif.d, 6000, 2);
         List<aks> $$1 = bie.a((akr)this.dL(), this, this.dj(), 50.0, $$0, 1200);
         $$1.forEach($$0x -> $$0x.c.b(new yc(yc.k, this.aT() ? 0.0F : 1.0F)));
      }

      if (!this.fP()) {
         this.a(this.dl(), 16);
      }
   }

   @Override
   protected Vector3f a(biq $$0, bir $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.353125F * $$2, 0.0F);
   }
}
