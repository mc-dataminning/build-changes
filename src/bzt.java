import java.util.List;
import java.util.UUID;
import org.joml.Vector3f;

public class bzt extends ccx implements bzh {
   private static final UUID b = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
   private static final bkf e = new bkf(b, "Drinking speed penalty", -0.25, bkf.a.a);
   private static final aec<Boolean> bT = aef.a(bzt.class, aee.k);
   private int bU;
   private brr<ccx> bV;
   private brq<cbp> bW;

   public bzt(bip<? extends bzt> $$0, cpq $$1) {
      super($$0, $$1);
   }

   @Override
   protected void w() {
      super.w();
      this.bV = new brr<>(this, ccx.class, true, $$0 -> $$0 != null && this.gp() && $$0.ag() != bip.bj);
      this.bW = new brq<>(this, cbp.class, 10, true, false, null);
      this.bO.a(1, new bpq(this));
      this.bO.a(2, new bqv(this, 1.0, 60, 10.0F));
      this.bO.a(2, new brj(this, 1.0));
      this.bO.a(3, new bqe(this, cbp.class, 8.0F));
      this.bO.a(3, new bqr(this));
      this.bP.a(1, new bro(this, ccx.class));
      this.bP.a(2, this.bV);
      this.bP.a(3, this.bW);
   }

   @Override
   protected void a_() {
      super.a_();
      this.al().a(bT, false);
   }

   @Override
   protected aoy r() {
      return aoz.Ad;
   }

   @Override
   protected aoy d(bhj $$0) {
      return aoz.Ah;
   }

   @Override
   protected aoy h_() {
      return aoz.Af;
   }

   public void y(boolean $$0) {
      this.al().b(bT, $$0);
   }

   @Override
   public boolean p() {
      return this.al().b(bT);
   }

   public static bkg.a q() {
      return bzd.gg().a(bkh.a, 26.0).a(bkh.d, 0.25);
   }

   @Override
   public void b_() {
      if (!this.dK().B && this.bv()) {
         this.bV.k();
         if (this.bV.i() <= 0) {
            this.bW.a(true);
         } else {
            this.bW.a(false);
         }

         if (this.p()) {
            if (this.bU-- <= 0) {
               this.y(false);
               cja $$0 = this.eR();
               this.a(biq.a, cja.b);
               if ($$0.a(cjd.rv)) {
                  List<bhy> $$1 = ckz.a($$0);
                  if ($$1 != null) {
                     for (bhy $$2 : $$1) {
                        this.b(new bhy($$2));
                     }
                  }
               }

               this.a(djo.l);
               this.a(bkh.d).b(e.a());
            }
         } else {
            ckx $$3 = null;
            if (this.ag.i() < 0.15F && this.a(apt.a) && !this.a(bia.m)) {
               $$3 = cla.y;
            } else if (this.ag.i() < 0.15F && (this.bM() || this.ev() != null && this.ev().a(apq.i)) && !this.a(bia.l)) {
               $$3 = cla.n;
            } else if (this.ag.i() < 0.05F && this.et() < this.eK()) {
               $$3 = cla.A;
            } else if (this.ag.i() < 0.5F && this.j() != null && !this.a(bia.a) && this.j().f(this) > 121.0) {
               $$3 = cla.p;
            }

            if ($$3 != null) {
               this.a(biq.a, ckz.a(new cja(cjd.rv), $$3));
               this.bU = this.eR().r();
               this.y(true);
               if (!this.aS()) {
                  this.dK().a(null, this.dp(), this.dr(), this.dv(), aoz.Ag, this.da(), 1.0F, 0.8F + this.ag.i() * 0.4F);
               }

               bkd $$4 = this.a(bkh.d);
               $$4.b(e.a());
               $$4.b(e);
            }
         }

         if (this.ag.i() < 7.5E-4F) {
            this.dK().a(this, (byte)15);
         }
      }

      super.b_();
   }

   @Override
   public aoy X_() {
      return aoz.Ae;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 15) {
         for (int $$1 = 0; $$1 < this.ag.a(35) + 10; $$1++) {
            this.dK().a(ix.ah, this.dp() + this.ag.k() * 0.13F, this.cG().e + 0.5 + this.ag.k() * 0.13F, this.dv() + this.ag.k() * 0.13F, 0.0, 0.0, 0.0);
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   protected float e(bhj $$0, float $$1) {
      $$1 = super.e($$0, $$1);
      if ($$0.d() == this) {
         $$1 = 0.0F;
      }

      if ($$0.a(apq.k)) {
         $$1 *= 0.15F;
      }

      return $$1;
   }

   @Override
   public void a(bjb $$0, float $$1) {
      if (!this.p()) {
         ehi $$2 = $$0.dn();
         double $$3 = $$0.dp() + $$2.c - this.dp();
         double $$4 = $$0.dt() - 1.1F - this.dr();
         double $$5 = $$0.dv() + $$2.e - this.dv();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         ckx $$7 = cla.C;
         if ($$0 instanceof ccx) {
            if ($$0.et() <= 4.0F) {
               $$7 = cla.A;
            } else {
               $$7 = cla.H;
            }

            this.h(null);
         } else if ($$6 >= 8.0 && !$$0.a(bia.b)) {
            $$7 = cla.s;
         } else if ($$0.et() >= 8.0F && !$$0.a(bia.s)) {
            $$7 = cla.E;
         } else if ($$6 <= 3.0 && !$$0.a(bia.r) && this.ag.i() < 0.25F) {
            $$7 = cla.N;
         }

         ccs $$8 = new ccs(this.dK(), this);
         $$8.a(ckz.a(new cja(cjd.uu), $$7));
         $$8.s($$8.dC() - -20.0F);
         $$8.c($$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         if (!this.aS()) {
            this.dK().a(null, this.dp(), this.dr(), this.dv(), aoz.Ai, this.da(), 1.0F, 0.8F + this.ag.i() * 0.4F);
         }

         this.dK().b($$8);
      }
   }

   @Override
   protected float b(bjn $$0, bim $$1) {
      return 1.62F;
   }

   @Override
   protected Vector3f a(bil $$0, bim $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.3125F * $$2, 0.0F);
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public boolean gb() {
      return false;
   }
}
