import java.util.List;
import org.joml.Vector3f;

public class cax extends cbe {
   public static final float b = bku.A.k() / bku.V.k();
   private static final int e = 1200;
   private static final int bT = 50;
   private static final int bU = 6000;
   private static final int bV = 2;
   private static final int bW = 1200;

   public cax(bku<? extends cax> $$0, csa $$1) {
      super($$0, $$1);
      this.fK();
      if (this.d != null) {
         this.d.c(400);
      }
   }

   public static bml.a u() {
      return cbe.gf().a(bmm.m, 0.3F).a(bmm.c, 8.0).a(bmm.l, 80.0);
   }

   @Override
   public int w() {
      return 60;
   }

   @Override
   protected aqq y() {
      return this.bc() ? aqr.hb : aqr.hc;
   }

   @Override
   protected aqq d(bjo $$0) {
      return this.bc() ? aqr.hh : aqr.hi;
   }

   @Override
   protected aqq m_() {
      return this.bc() ? aqr.he : aqr.hf;
   }

   @Override
   protected aqq A() {
      return aqr.hg;
   }

   @Override
   protected void Z() {
      super.Z();
      if ((this.ah + this.aj()) % 1200 == 0) {
         bkd $$0 = new bkd(bkf.d, 6000, 2);
         List<amf> $$1 = bke.a((ame)this.dN(), this, this.dl(), 50.0, $$0, 1200);
         $$1.forEach($$0x -> $$0x.c.b(new zi(zi.k, this.aU() ? 0.0F : 1.0F)));
      }

      if (!this.fR()) {
         this.a(this.dn(), 16);
      }
   }

   @Override
   protected Vector3f a(bkq $$0, bkr $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.353125F * $$2, 0.0F);
   }
}
