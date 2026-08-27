import java.util.List;
import java.util.UUID;
import org.joml.Vector3f;

public class bzp extends cct implements bzd {
   private static final UUID b = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
   private static final bkb e = new bkb(b, "Drinking speed penalty", -0.25, bkb.a.a);
   private static final adx<Boolean> bT = aea.a(bzp.class, adz.k);
   private int bU;
   private brn<cct> bV;
   private brm<cbl> bW;

   public bzp(bik<? extends bzp> $$0, cpk $$1) {
      super($$0, $$1);
   }

   @Override
   protected void w() {
      super.w();
      this.bV = new brn<>(this, cct.class, true, $$0 -> $$0 != null && this.go() && $$0.ag() != bik.bj);
      this.bW = new brm<>(this, cbl.class, 10, true, false, null);
      this.bO.a(1, new bpm(this));
      this.bO.a(2, new bqr(this, 1.0, 60, 10.0F));
      this.bO.a(2, new brf(this, 1.0));
      this.bO.a(3, new bqa(this, cbl.class, 8.0F));
      this.bO.a(3, new bqn(this));
      this.bP.a(1, new brk(this, cct.class));
      this.bP.a(2, this.bV);
      this.bP.a(3, this.bW);
   }

   @Override
   protected void a_() {
      super.a_();
      this.al().a(bT, false);
   }

   @Override
   protected aot r() {
      return aou.zT;
   }

   @Override
   protected aot d(bhe $$0) {
      return aou.zX;
   }

   @Override
   protected aot h_() {
      return aou.zV;
   }

   public void y(boolean $$0) {
      this.al().b(bT, $$0);
   }

   @Override
   public boolean p() {
      return this.al().b(bT);
   }

   public static bkc.a q() {
      return byz.gf().a(bkd.a, 26.0).a(bkd.d, 0.25);
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
               ciw $$0 = this.eR();
               this.a(bil.a, ciw.b);
               if ($$0.a(ciz.rv)) {
                  List<bht> $$1 = ckv.a($$0);
                  if ($$1 != null) {
                     for (bht $$2 : $$1) {
                        this.b(new bht($$2));
                     }
                  }
               }

               this.a(dji.l);
               this.a(bkd.d).b(e.a());
            }
         } else {
            ckt $$3 = null;
            if (this.ag.i() < 0.15F && this.a(apo.a) && !this.a(bhv.m)) {
               $$3 = ckw.y;
            } else if (this.ag.i() < 0.15F && (this.bM() || this.ev() != null && this.ev().a(apl.i)) && !this.a(bhv.l)) {
               $$3 = ckw.n;
            } else if (this.ag.i() < 0.05F && this.et() < this.eK()) {
               $$3 = ckw.A;
            } else if (this.ag.i() < 0.5F && this.j() != null && !this.a(bhv.a) && this.j().f(this) > 121.0) {
               $$3 = ckw.p;
            }

            if ($$3 != null) {
               this.a(bil.a, ckv.a(new ciw(ciz.rv), $$3));
               this.bU = this.eR().r();
               this.y(true);
               if (!this.aS()) {
                  this.dK().a(null, this.dp(), this.dr(), this.dv(), aou.zW, this.da(), 1.0F, 0.8F + this.ag.i() * 0.4F);
               }

               bjz $$4 = this.a(bkd.d);
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
   public aot Y_() {
      return aou.zU;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 15) {
         for (int $$1 = 0; $$1 < this.ag.a(35) + 10; $$1++) {
            this.dK().a(iw.ah, this.dp() + this.ag.k() * 0.13F, this.cG().e + 0.5 + this.ag.k() * 0.13F, this.dv() + this.ag.k() * 0.13F, 0.0, 0.0, 0.0);
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   protected float e(bhe $$0, float $$1) {
      $$1 = super.e($$0, $$1);
      if ($$0.d() == this) {
         $$1 = 0.0F;
      }

      if ($$0.a(apl.k)) {
         $$1 *= 0.15F;
      }

      return $$1;
   }

   @Override
   public void a(biw $$0, float $$1) {
      if (!this.p()) {
         ehf $$2 = $$0.dn();
         double $$3 = $$0.dp() + $$2.c - this.dp();
         double $$4 = $$0.dt() - 1.1F - this.dr();
         double $$5 = $$0.dv() + $$2.e - this.dv();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         ckt $$7 = ckw.C;
         if ($$0 instanceof cct) {
            if ($$0.et() <= 4.0F) {
               $$7 = ckw.A;
            } else {
               $$7 = ckw.H;
            }

            this.h(null);
         } else if ($$6 >= 8.0 && !$$0.a(bhv.b)) {
            $$7 = ckw.s;
         } else if ($$0.et() >= 8.0F && !$$0.a(bhv.s)) {
            $$7 = ckw.E;
         } else if ($$6 <= 3.0 && !$$0.a(bhv.r) && this.ag.i() < 0.25F) {
            $$7 = ckw.N;
         }

         cco $$8 = new cco(this.dK(), this);
         $$8.a(ckv.a(new ciw(ciz.uu), $$7));
         $$8.s($$8.dC() - -20.0F);
         $$8.c($$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         if (!this.aS()) {
            this.dK().a(null, this.dp(), this.dr(), this.dv(), aou.zY, this.da(), 1.0F, 0.8F + this.ag.i() * 0.4F);
         }

         this.dK().b($$8);
      }
   }

   @Override
   protected float b(bji $$0, bih $$1) {
      return 1.62F;
   }

   @Override
   protected Vector3f a(big $$0, bih $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.3125F * $$2, 0.0F);
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public boolean ga() {
      return false;
   }
}
