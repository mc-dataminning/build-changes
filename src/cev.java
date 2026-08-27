import java.util.List;

public class cev extends cfc {
   public static final float b = bol.C.k() / bol.X.k();
   private static final int e = 1200;
   private static final int bV = 50;
   private static final int bW = 6000;
   private static final int bX = 2;
   private static final int bY = 1200;

   public cev(bol<? extends cev> $$0, cwe $$1) {
      super($$0, $$1);
      this.fQ();
      if (this.d != null) {
         this.d.c(400);
      }
   }

   public static bqd.a u() {
      return cfc.gl().a(bqe.o, 0.3F).a(bqe.c, 8.0).a(bqe.n, 80.0);
   }

   @Override
   public int w() {
      return 60;
   }

   @Override
   protected ato y() {
      return this.bc() ? atp.hA : atp.hB;
   }

   @Override
   protected ato d(bne $$0) {
      return this.bc() ? atp.hG : atp.hH;
   }

   @Override
   protected ato n_() {
      return this.bc() ? atp.hD : atp.hE;
   }

   @Override
   protected ato A() {
      return atp.hF;
   }

   @Override
   protected void aa() {
      super.aa();
      if ((this.ag + this.aj()) % 1200 == 0) {
         bns $$0 = new bns(bnu.d, 6000, 2);
         List<apb> $$1 = bnt.a((apa)this.dJ(), this, this.dh(), 50.0, $$0, 1200);
         $$1.forEach($$0x -> $$0x.d.b(new abp(abp.l, this.aU() ? 0.0F : 1.0F)));
      }

      if (!this.fX()) {
         this.a(this.dj(), 16);
      }
   }
}
