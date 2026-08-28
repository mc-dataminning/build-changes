import java.util.List;

public class clg extends cln {
   public static final float b = bul.D.l() / bul.Y.l();
   private static final int e = 1200;
   private static final int bY = 50;
   private static final int bZ = 6000;
   private static final int ca = 2;
   private static final int cb = 1200;

   public clg(bul<? extends clg> $$0, dfb $$1) {
      super($$0, $$1);
      this.ga();
      if (this.d != null) {
         this.d.c(400);
      }
   }

   public static bwh.a q() {
      return cln.gu().a(bwi.v, 0.3F).a(bwi.c, 8.0).a(bwi.s, 80.0);
   }

   @Override
   public int t() {
      return 60;
   }

   @Override
   protected awk w() {
      return this.bn() ? awl.hP : awl.hQ;
   }

   @Override
   protected awk d(bsu $$0) {
      return this.bn() ? awl.hV : awl.hW;
   }

   @Override
   protected awk o_() {
      return this.bn() ? awl.hS : awl.hT;
   }

   @Override
   protected awk y() {
      return awl.hU;
   }

   @Override
   protected void ac() {
      super.ac();
      if ((this.ag + this.as()) % 1200 == 0) {
         btj $$0 = new btj(btl.d, 6000, 2);
         List<aro> $$1 = btk.a((arn)this.dX(), this, this.dv(), 50.0, $$0, 1200);
         $$1.forEach($$0x -> $$0x.g.b(new adl(adl.l, this.bc() ? 0.0F : 1.0F)));
      }

      if (!this.gg()) {
         this.a(this.dx(), 16);
      }
   }
}
