import java.util.List;

public class clb extends cli {
   public static final float b = bug.D.l() / bug.Y.l();
   private static final int e = 1200;
   private static final int bY = 50;
   private static final int bZ = 6000;
   private static final int ca = 2;
   private static final int cb = 1200;

   public clb(bug<? extends clb> $$0, dev $$1) {
      super($$0, $$1);
      this.gb();
      if (this.d != null) {
         this.d.c(400);
      }
   }

   public static bwc.a q() {
      return cli.gv().a(bwd.v, 0.3F).a(bwd.c, 8.0).a(bwd.s, 80.0);
   }

   @Override
   public int t() {
      return 60;
   }

   @Override
   protected awj w() {
      return this.bn() ? awk.hP : awk.hQ;
   }

   @Override
   protected awj d(bsp $$0) {
      return this.bn() ? awk.hV : awk.hW;
   }

   @Override
   protected awj o_() {
      return this.bn() ? awk.hS : awk.hT;
   }

   @Override
   protected awj y() {
      return awk.hU;
   }

   @Override
   protected void ac() {
      super.ac();
      if ((this.ag + this.ar()) % 1200 == 0) {
         bte $$0 = new bte(btg.d, 6000, 2);
         List<arn> $$1 = btf.a((arm)this.dX(), this, this.dv(), 50.0, $$0, 1200);
         $$1.forEach($$0x -> $$0x.d.b(new adk(adk.l, this.bc() ? 0.0F : 1.0F)));
      }

      if (!this.gh()) {
         this.a(this.dx(), 16);
      }
   }
}
