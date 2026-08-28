import java.util.List;

public class cjc extends cjj {
   public static final float b = bsj.D.l() / bsj.Y.l();
   private static final int e = 1200;
   private static final int ca = 50;
   private static final int cb = 6000;
   private static final int cc = 2;
   private static final int cd = 1200;

   public cjc(bsj<? extends cjc> $$0, dcd $$1) {
      super($$0, $$1);
      this.fQ();
      if (this.d != null) {
         this.d.c(400);
      }
   }

   public static buf.a s() {
      return cjj.gn().a(bug.v, 0.3F).a(bug.c, 8.0).a(bug.s, 80.0);
   }

   @Override
   public int u() {
      return 60;
   }

   @Override
   protected ave v() {
      return this.bh() ? avf.hO : avf.hP;
   }

   @Override
   protected ave d(bqw $$0) {
      return this.bh() ? avf.hU : avf.hV;
   }

   @Override
   protected ave o_() {
      return this.bh() ? avf.hR : avf.hS;
   }

   @Override
   protected ave y() {
      return avf.hT;
   }

   @Override
   protected void Z() {
      super.Z();
      if ((this.ai + this.al()) % 1200 == 0) {
         brl $$0 = new brl(brn.d, 6000, 2);
         List<aql> $$1 = brm.a((aqk)this.dP(), this, this.dn(), 50.0, $$0, 1200);
         $$1.forEach($$0x -> $$0x.c.b(new acu(acu.l, this.aW() ? 0.0F : 1.0F)));
      }

      if (!this.fX()) {
         this.a(this.dp(), 16);
      }
   }
}
