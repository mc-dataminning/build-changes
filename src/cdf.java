import java.util.List;
import java.util.UUID;
import org.joml.Vector3f;

public class cdf extends cgr implements cct {
   private static final UUID b = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
   private static final bnp e = new bnp(b, "Drinking speed penalty", -0.25, bnp.a.a);
   private static final agm<Boolean> bT = agp.a(cdf.class, ago.k);
   private int bU;
   private bvc<cgr> bV;
   private bvb<cfi> bW;

   public cdf(blz<? extends cdf> $$0, ctp $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bV = new bvc<>(this, cgr.class, true, $$0 -> $$0 != null && this.gt() && $$0.ai() != blz.bl);
      this.bW = new bvb<>(this, cfi.class, 10, true, false, null);
      this.bO.a(1, new btb(this));
      this.bO.a(2, new bug(this, 1.0, 60, 10.0F));
      this.bO.a(2, new buu(this, 1.0));
      this.bO.a(3, new btp(this, cfi.class, 8.0F));
      this.bO.a(3, new buc(this));
      this.bP.a(1, new buz(this, cgr.class));
      this.bP.a(2, this.bV);
      this.bP.a(3, this.bW);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an().a(bT, false);
   }

   @Override
   protected arr y() {
      return ars.Bf;
   }

   @Override
   protected arr d(bkt $$0) {
      return ars.Bj;
   }

   @Override
   protected arr n_() {
      return ars.Bh;
   }

   public void y(boolean $$0) {
      this.an().b(bT, $$0);
   }

   @Override
   public boolean u() {
      return this.an().b(bT);
   }

   public static bnq.a w() {
      return ccp.gk().a(bnr.l, 26.0).a(bnr.m, 0.25);
   }

   @Override
   public void d_() {
      if (!this.dM().B && this.bx()) {
         this.bV.k();
         if (this.bV.i() <= 0) {
            this.bW.a(true);
         } else {
            this.bW.a(false);
         }

         if (this.u()) {
            if (this.bU-- <= 0) {
               this.y(false);
               cmy $$0 = this.eT();
               this.a(bma.a, cmy.f);
               if ($$0.a(cnb.sh)) {
                  List<bli> $$1 = coy.a($$0);
                  if ($$1 != null) {
                     for (bli $$2 : $$1) {
                        this.b(new bli($$2));
                     }
                  }
               }

               this.a(dnr.l);
               this.a(bnr.m).b(e.a());
            }
         } else {
            cow $$3 = null;
            if (this.ag.i() < 0.15F && this.a(asm.a) && !this.a(blk.m)) {
               $$3 = coz.y;
            } else if (this.ag.i() < 0.15F && (this.bN() || this.ex() != null && this.ex().a(asj.j)) && !this.a(blk.l)) {
               $$3 = coz.n;
            } else if (this.ag.i() < 0.05F && this.ev() < this.eM()) {
               $$3 = coz.A;
            } else if (this.ag.i() < 0.5F && this.q() != null && !this.a(blk.a) && this.q().f(this) > 121.0) {
               $$3 = coz.p;
            }

            if ($$3 != null) {
               this.a(bma.a, coy.a(new cmy(cnb.sh), $$3));
               this.bU = this.eT().r();
               this.y(true);
               if (!this.aU()) {
                  this.dM().a(null, this.dr(), this.dt(), this.dx(), ars.Bi, this.db(), 1.0F, 0.8F + this.ag.i() * 0.4F);
               }

               bnn $$4 = this.a(bnr.m);
               $$4.b(e.a());
               $$4.b(e);
            }
         }

         if (this.ag.i() < 7.5E-4F) {
            this.dM().a(this, (byte)15);
         }
      }

      super.d_();
   }

   @Override
   public arr af_() {
      return ars.Bg;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 15) {
         for (int $$1 = 0; $$1 < this.ag.a(35) + 10; $$1++) {
            this.dM().a(jx.ak, this.dr() + this.ag.k() * 0.13F, this.cH().e + 0.5 + this.ag.k() * 0.13F, this.dx() + this.ag.k() * 0.13F, 0.0, 0.0, 0.0);
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   protected float e(bkt $$0, float $$1) {
      $$1 = super.e($$0, $$1);
      if ($$0.d() == this) {
         $$1 = 0.0F;
      }

      if ($$0.a(asj.l)) {
         $$1 *= 0.15F;
      }

      return $$1;
   }

   @Override
   public void a(bml $$0, float $$1) {
      if (!this.u()) {
         elt $$2 = $$0.dp();
         double $$3 = $$0.dr() + $$2.c - this.dr();
         double $$4 = $$0.dv() - 1.1F - this.dt();
         double $$5 = $$0.dx() + $$2.e - this.dx();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         cow $$7 = coz.C;
         if ($$0 instanceof cgr) {
            if ($$0.ev() <= 4.0F) {
               $$7 = coz.A;
            } else {
               $$7 = coz.H;
            }

            this.h(null);
         } else if ($$6 >= 8.0 && !$$0.a(blk.b)) {
            $$7 = coz.s;
         } else if ($$0.ev() >= 8.0F && !$$0.a(blk.s)) {
            $$7 = coz.E;
         } else if ($$6 <= 3.0 && !$$0.a(blk.r) && this.ag.i() < 0.25F) {
            $$7 = coz.N;
         }

         cgl $$8 = new cgl(this.dM(), this);
         $$8.a(coy.a(new cmy(cnb.vh), $$7));
         $$8.s($$8.dE() - -20.0F);
         $$8.c($$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         if (!this.aU()) {
            this.dM().a(null, this.dr(), this.dt(), this.dx(), ars.Bk, this.db(), 1.0F, 0.8F + this.ag.i() * 0.4F);
         }

         this.dM().b($$8);
      }
   }

   @Override
   protected float b(bmx $$0, blw $$1) {
      return 1.62F;
   }

   @Override
   protected Vector3f a(blv $$0, blw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.3125F * $$2, 0.0F);
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public boolean gf() {
      return false;
   }
}
