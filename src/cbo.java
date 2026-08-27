import java.util.List;
import org.joml.Vector3f;

public class cbo extends cbv {
   public static final float b = blj.B.k() / blj.W.k();
   private static final int e = 1200;
   private static final int bT = 50;
   private static final int bU = 6000;
   private static final int bV = 2;
   private static final int bW = 1200;

   public cbo(blj<? extends cbo> $$0, csy $$1) {
      super($$0, $$1);
      this.fJ();
      if (this.d != null) {
         this.d.c(400);
      }
   }

   public static bna.a u() {
      return cbv.ge().a(bnb.m, 0.3F).a(bnb.c, 8.0).a(bnb.l, 80.0);
   }

   @Override
   public int w() {
      return 60;
   }

   @Override
   protected arb y() {
      return this.bc() ? arc.hk : arc.hl;
   }

   @Override
   protected arb d(bkd $$0) {
      return this.bc() ? arc.hq : arc.hr;
   }

   @Override
   protected arb n_() {
      return this.bc() ? arc.hn : arc.ho;
   }

   @Override
   protected arb A() {
      return arc.hp;
   }

   @Override
   protected void Z() {
      super.Z();
      if ((this.ah + this.aj()) % 1200 == 0) {
         bks $$0 = new bks(bku.d, 6000, 2);
         List<amq> $$1 = bkt.a((amp)this.dM(), this, this.dk(), 50.0, $$0, 1200);
         $$1.forEach($$0x -> $$0x.c.b(new zt(zt.k, this.aU() ? 0.0F : 1.0F)));
      }

      if (!this.fQ()) {
         this.a(this.dm(), 16);
      }
   }

   @Override
   protected Vector3f a(blf $$0, blg $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.353125F * $$2, 0.0F);
   }
}
