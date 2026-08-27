import java.util.List;
import java.util.UUID;
import org.joml.Vector3f;

public class bzq extends ccu implements bze {
   private static final UUID b = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
   private static final bkc e = new bkc(b, "Drinking speed penalty", -0.25, bkc.a.a);
   private static final adz<Boolean> bT = aec.a(bzq.class, aeb.k);
   private int bU;
   private bro<ccu> bV;
   private brn<cbm> bW;

   public bzq(bim<? extends bzq> $$0, cpl $$1) {
      super($$0, $$1);
   }

   @Override
   protected void w() {
      super.w();
      this.bV = new bro<>(this, ccu.class, true, $$0 -> $$0 != null && this.gp() && $$0.ag() != bim.bj);
      this.bW = new brn<>(this, cbm.class, 10, true, false, null);
      this.bO.a(1, new bpn(this));
      this.bO.a(2, new bqs(this, 1.0, 60, 10.0F));
      this.bO.a(2, new brg(this, 1.0));
      this.bO.a(3, new bqb(this, cbm.class, 8.0F));
      this.bO.a(3, new bqo(this));
      this.bP.a(1, new brl(this, ccu.class));
      this.bP.a(2, this.bV);
      this.bP.a(3, this.bW);
   }

   @Override
   protected void a_() {
      super.a_();
      this.al().a(bT, false);
   }

   @Override
   protected aov r() {
      return aow.Ad;
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.Ah;
   }

   @Override
   protected aov h_() {
      return aow.Af;
   }

   public void y(boolean $$0) {
      this.al().b(bT, $$0);
   }

   @Override
   public boolean p() {
      return this.al().b(bT);
   }

   public static bkd.a q() {
      return bza.gg().a(bke.a, 26.0).a(bke.d, 0.25);
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
               cix $$0 = this.eR();
               this.a(bin.a, cix.b);
               if ($$0.a(cja.rv)) {
                  List<bhv> $$1 = ckw.a($$0);
                  if ($$1 != null) {
                     for (bhv $$2 : $$1) {
                        this.b(new bhv($$2));
                     }
                  }
               }

               this.a(djj.l);
               this.a(bke.d).b(e.a());
            }
         } else {
            cku $$3 = null;
            if (this.ag.i() < 0.15F && this.a(apq.a) && !this.a(bhx.m)) {
               $$3 = ckx.y;
            } else if (this.ag.i() < 0.15F && (this.bM() || this.ev() != null && this.ev().a(apn.i)) && !this.a(bhx.l)) {
               $$3 = ckx.n;
            } else if (this.ag.i() < 0.05F && this.et() < this.eK()) {
               $$3 = ckx.A;
            } else if (this.ag.i() < 0.5F && this.j() != null && !this.a(bhx.a) && this.j().f(this) > 121.0) {
               $$3 = ckx.p;
            }

            if ($$3 != null) {
               this.a(bin.a, ckw.a(new cix(cja.rv), $$3));
               this.bU = this.eR().r();
               this.y(true);
               if (!this.aS()) {
                  this.dK().a(null, this.dp(), this.dr(), this.dv(), aow.Ag, this.da(), 1.0F, 0.8F + this.ag.i() * 0.4F);
               }

               bka $$4 = this.a(bke.d);
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
   public aov X_() {
      return aow.Ae;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 15) {
         for (int $$1 = 0; $$1 < this.ag.a(35) + 10; $$1++) {
            this.dK().a(iv.ah, this.dp() + this.ag.k() * 0.13F, this.cG().e + 0.5 + this.ag.k() * 0.13F, this.dv() + this.ag.k() * 0.13F, 0.0, 0.0, 0.0);
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   protected float e(bhg $$0, float $$1) {
      $$1 = super.e($$0, $$1);
      if ($$0.d() == this) {
         $$1 = 0.0F;
      }

      if ($$0.a(apn.k)) {
         $$1 *= 0.15F;
      }

      return $$1;
   }

   @Override
   public void a(biy $$0, float $$1) {
      if (!this.p()) {
         ehd $$2 = $$0.dn();
         double $$3 = $$0.dp() + $$2.c - this.dp();
         double $$4 = $$0.dt() - 1.1F - this.dr();
         double $$5 = $$0.dv() + $$2.e - this.dv();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         cku $$7 = ckx.C;
         if ($$0 instanceof ccu) {
            if ($$0.et() <= 4.0F) {
               $$7 = ckx.A;
            } else {
               $$7 = ckx.H;
            }

            this.h(null);
         } else if ($$6 >= 8.0 && !$$0.a(bhx.b)) {
            $$7 = ckx.s;
         } else if ($$0.et() >= 8.0F && !$$0.a(bhx.s)) {
            $$7 = ckx.E;
         } else if ($$6 <= 3.0 && !$$0.a(bhx.r) && this.ag.i() < 0.25F) {
            $$7 = ckx.N;
         }

         ccp $$8 = new ccp(this.dK(), this);
         $$8.a(ckw.a(new cix(cja.uu), $$7));
         $$8.s($$8.dC() - -20.0F);
         $$8.c($$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         if (!this.aS()) {
            this.dK().a(null, this.dp(), this.dr(), this.dv(), aow.Ai, this.da(), 1.0F, 0.8F + this.ag.i() * 0.4F);
         }

         this.dK().b($$8);
      }
   }

   @Override
   protected float b(bjk $$0, bij $$1) {
      return 1.62F;
   }

   @Override
   protected Vector3f a(bii $$0, bij $$1, float $$2) {
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
