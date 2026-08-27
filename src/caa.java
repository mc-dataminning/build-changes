import java.util.List;
import java.util.UUID;
import org.joml.Vector3f;

public class caa extends cde implements bzo {
   private static final UUID b = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
   private static final bkm e = new bkm(b, "Drinking speed penalty", -0.25, bkm.a.a);
   private static final aeg<Boolean> bT = aej.a(caa.class, aei.k);
   private int bU;
   private bry<cde> bV;
   private brx<cbw> bW;

   public caa(biw<? extends caa> $$0, cpx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bV = new bry<>(this, cde.class, true, $$0 -> $$0 != null && this.gs() && $$0.ag() != biw.bj);
      this.bW = new brx<>(this, cbw.class, 10, true, false, null);
      this.bO.a(1, new bpx(this));
      this.bO.a(2, new brc(this, 1.0, 60, 10.0F));
      this.bO.a(2, new brq(this, 1.0));
      this.bO.a(3, new bql(this, cbw.class, 8.0F));
      this.bO.a(3, new bqy(this));
      this.bP.a(1, new brv(this, cde.class));
      this.bP.a(2, this.bV);
      this.bP.a(3, this.bW);
   }

   @Override
   protected void a_() {
      super.a_();
      this.al().a(bT, false);
   }

   @Override
   protected ape w() {
      return apf.Ad;
   }

   @Override
   protected ape d(bhq $$0) {
      return apf.Ah;
   }

   @Override
   protected ape l_() {
      return apf.Af;
   }

   public void y(boolean $$0) {
      this.al().b(bT, $$0);
   }

   public boolean s() {
      return this.al().b(bT);
   }

   public static bkn.a t() {
      return bzk.gj().a(bko.a, 26.0).a(bko.d, 0.25);
   }

   @Override
   public void b_() {
      if (!this.dL().B && this.bv()) {
         this.bV.k();
         if (this.bV.i() <= 0) {
            this.bW.a(true);
         } else {
            this.bW.a(false);
         }

         if (this.s()) {
            if (this.bU-- <= 0) {
               this.y(false);
               cjh $$0 = this.eS();
               this.a(bix.a, cjh.b);
               if ($$0.a(cjk.rv)) {
                  List<bif> $$1 = clg.a($$0);
                  if ($$1 != null) {
                     for (bif $$2 : $$1) {
                        this.b(new bif($$2));
                     }
                  }
               }

               this.a(djv.l);
               this.a(bko.d).b(e.a());
            }
         } else {
            cle $$3 = null;
            if (this.ag.i() < 0.15F && this.a(apz.a) && !this.a(bih.m)) {
               $$3 = clh.y;
            } else if (this.ag.i() < 0.15F && (this.bM() || this.ew() != null && this.ew().a(apw.i)) && !this.a(bih.l)) {
               $$3 = clh.n;
            } else if (this.ag.i() < 0.05F && this.eu() < this.eL()) {
               $$3 = clh.A;
            } else if (this.ag.i() < 0.5F && this.q() != null && !this.a(bih.a) && this.q().f(this) > 121.0) {
               $$3 = clh.p;
            }

            if ($$3 != null) {
               this.a(bix.a, clg.a(new cjh(cjk.rv), $$3));
               this.bU = this.eS().r();
               this.y(true);
               if (!this.aS()) {
                  this.dL().a(null, this.dq(), this.ds(), this.dw(), apf.Ag, this.da(), 1.0F, 0.8F + this.ag.i() * 0.4F);
               }

               bkk $$4 = this.a(bko.d);
               $$4.b(e.a());
               $$4.b(e);
            }
         }

         if (this.ag.i() < 7.5E-4F) {
            this.dL().a(this, (byte)15);
         }
      }

      super.b_();
   }

   @Override
   public ape ac_() {
      return apf.Ae;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 15) {
         for (int $$1 = 0; $$1 < this.ag.a(35) + 10; $$1++) {
            this.dL().a(ix.ah, this.dq() + this.ag.k() * 0.13F, this.cG().e + 0.5 + this.ag.k() * 0.13F, this.dw() + this.ag.k() * 0.13F, 0.0, 0.0, 0.0);
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   protected float e(bhq $$0, float $$1) {
      $$1 = super.e($$0, $$1);
      if ($$0.d() == this) {
         $$1 = 0.0F;
      }

      if ($$0.a(apw.k)) {
         $$1 *= 0.15F;
      }

      return $$1;
   }

   @Override
   public void a(bji $$0, float $$1) {
      if (!this.s()) {
         ehp $$2 = $$0.do();
         double $$3 = $$0.dq() + $$2.c - this.dq();
         double $$4 = $$0.du() - 1.1F - this.ds();
         double $$5 = $$0.dw() + $$2.e - this.dw();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         cle $$7 = clh.C;
         if ($$0 instanceof cde) {
            if ($$0.eu() <= 4.0F) {
               $$7 = clh.A;
            } else {
               $$7 = clh.H;
            }

            this.h(null);
         } else if ($$6 >= 8.0 && !$$0.a(bih.b)) {
            $$7 = clh.s;
         } else if ($$0.eu() >= 8.0F && !$$0.a(bih.s)) {
            $$7 = clh.E;
         } else if ($$6 <= 3.0 && !$$0.a(bih.r) && this.ag.i() < 0.25F) {
            $$7 = clh.N;
         }

         ccz $$8 = new ccz(this.dL(), this);
         $$8.a(clg.a(new cjh(cjk.uu), $$7));
         $$8.s($$8.dD() - -20.0F);
         $$8.c($$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         if (!this.aS()) {
            this.dL().a(null, this.dq(), this.ds(), this.dw(), apf.Ai, this.da(), 1.0F, 0.8F + this.ag.i() * 0.4F);
         }

         this.dL().b($$8);
      }
   }

   @Override
   protected float b(bju $$0, bit $$1) {
      return 1.62F;
   }

   @Override
   protected Vector3f a(bis $$0, bit $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.3125F * $$2, 0.0F);
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public boolean ge() {
      return false;
   }
}
