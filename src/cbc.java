import java.util.List;
import org.joml.Vector3f;

public class cbc extends cbj {
   public static final float b = bkz.A.k() / bkz.V.k();
   private static final int e = 1200;
   private static final int bT = 50;
   private static final int bU = 6000;
   private static final int bV = 2;
   private static final int bW = 1200;

   public cbc(bkz<? extends cbc> $$0, csf $$1) {
      super($$0, $$1);
      this.fK();
      if (this.d != null) {
         this.d.c(400);
      }
   }

   public static bmq.a u() {
      return cbj.gf().a(bmr.m, 0.3F).a(bmr.c, 8.0).a(bmr.l, 80.0);
   }

   @Override
   public int w() {
      return 60;
   }

   @Override
   protected aqu y() {
      return this.bc() ? aqv.hb : aqv.hc;
   }

   @Override
   protected aqu d(bjt $$0) {
      return this.bc() ? aqv.hh : aqv.hi;
   }

   @Override
   protected aqu n_() {
      return this.bc() ? aqv.he : aqv.hf;
   }

   @Override
   protected aqu A() {
      return aqv.hg;
   }

   @Override
   protected void Z() {
      super.Z();
      if ((this.ah + this.aj()) % 1200 == 0) {
         bki $$0 = new bki(bkk.d, 6000, 2);
         List<amj> $$1 = bkj.a((ami)this.dN(), this, this.dl(), 50.0, $$0, 1200);
         $$1.forEach($$0x -> $$0x.c.b(new zm(zm.k, this.aU() ? 0.0F : 1.0F)));
      }

      if (!this.fR()) {
         this.a(this.dn(), 16);
      }
   }

   @Override
   protected Vector3f a(bkv $$0, bkw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.353125F * $$2, 0.0F);
   }
}
