import java.util.List;
import org.joml.Vector3f;

public class bzd extends bzk {
   public static final float b = bja.A.k() / bja.V.k();
   private static final int e = 1200;
   private static final int bT = 50;
   private static final int bU = 6000;
   private static final int bV = 2;
   private static final int bW = 1200;

   public bzd(bja<? extends bzd> $$0, cqb $$1) {
      super($$0, $$1);
      this.fJ();
      if (this.d != null) {
         this.d.c(400);
      }
   }

   public static bkr.a s() {
      return bzk.ge().a(bks.m, 0.3F).a(bks.c, 8.0).a(bks.l, 80.0);
   }

   @Override
   public int t() {
      return 60;
   }

   @Override
   protected apf w() {
      return this.ba() ? apg.gH : apg.gI;
   }

   @Override
   protected apf d(bhu $$0) {
      return this.ba() ? apg.gN : apg.gO;
   }

   @Override
   protected apf l_() {
      return this.ba() ? apg.gK : apg.gL;
   }

   @Override
   protected apf y() {
      return apg.gM;
   }

   @Override
   protected void X() {
      super.X();
      if ((this.ah + this.ah()) % 1200 == 0) {
         bij $$0 = new bij(bil.d, 6000, 2);
         List<aku> $$1 = bik.a((akt)this.dL(), this, this.dj(), 50.0, $$0, 1200);
         $$1.forEach($$0x -> $$0x.c.b(new yc(yc.k, this.aS() ? 0.0F : 1.0F)));
      }

      if (!this.fQ()) {
         this.a(this.dl(), 16);
      }
   }

   @Override
   protected Vector3f a(biw $$0, bix $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.353125F * $$2, 0.0F);
   }
}
