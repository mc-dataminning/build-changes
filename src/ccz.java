import java.util.List;
import java.util.UUID;
import org.joml.Vector3f;

public class ccz extends cgk implements ccn {
   private static final UUID b = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
   private static final bnj e = new bnj(b, "Drinking speed penalty", -0.25, bnj.a.a);
   private static final agj<Boolean> bT = agm.a(ccz.class, agl.k);
   private int bU;
   private buw<cgk> bV;
   private buv<cfb> bW;

   public ccz(blt<? extends ccz> $$0, cti $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bV = new buw<>(this, cgk.class, true, $$0 -> $$0 != null && this.gt() && $$0.ai() != blt.bl);
      this.bW = new buv<>(this, cfb.class, 10, true, false, null);
      this.bO.a(1, new bsv(this));
      this.bO.a(2, new bua(this, 1.0, 60, 10.0F));
      this.bO.a(2, new buo(this, 1.0));
      this.bO.a(3, new btj(this, cfb.class, 8.0F));
      this.bO.a(3, new btw(this));
      this.bP.a(1, new but(this, cgk.class));
      this.bP.a(2, this.bV);
      this.bP.a(3, this.bW);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an().a(bT, false);
   }

   @Override
   protected arl y() {
      return arm.Bf;
   }

   @Override
   protected arl d(bkn $$0) {
      return arm.Bj;
   }

   @Override
   protected arl n_() {
      return arm.Bh;
   }

   public void y(boolean $$0) {
      this.an().b(bT, $$0);
   }

   @Override
   public boolean u() {
      return this.an().b(bT);
   }

   public static bnk.a w() {
      return ccj.gk().a(bnl.l, 26.0).a(bnl.m, 0.25);
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
               cmr $$0 = this.eT();
               this.a(blu.a, cmr.f);
               if ($$0.a(cmu.sh)) {
                  List<blc> $$1 = cor.a($$0);
                  if ($$1 != null) {
                     for (blc $$2 : $$1) {
                        this.b(new blc($$2));
                     }
                  }
               }

               this.a(dnk.l);
               this.a(bnl.m).b(e.a());
            }
         } else {
            cop $$3 = null;
            if (this.ag.i() < 0.15F && this.a(asg.a) && !this.a(ble.m)) {
               $$3 = cos.y;
            } else if (this.ag.i() < 0.15F && (this.bN() || this.ex() != null && this.ex().a(asd.j)) && !this.a(ble.l)) {
               $$3 = cos.n;
            } else if (this.ag.i() < 0.05F && this.ev() < this.eM()) {
               $$3 = cos.A;
            } else if (this.ag.i() < 0.5F && this.q() != null && !this.a(ble.a) && this.q().f(this) > 121.0) {
               $$3 = cos.p;
            }

            if ($$3 != null) {
               this.a(blu.a, cor.a(new cmr(cmu.sh), $$3));
               this.bU = this.eT().r();
               this.y(true);
               if (!this.aU()) {
                  this.dM().a(null, this.dr(), this.dt(), this.dx(), arm.Bi, this.db(), 1.0F, 0.8F + this.ag.i() * 0.4F);
               }

               bnh $$4 = this.a(bnl.m);
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
   public arl af_() {
      return arm.Bg;
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
   protected float e(bkn $$0, float $$1) {
      $$1 = super.e($$0, $$1);
      if ($$0.d() == this) {
         $$1 = 0.0F;
      }

      if ($$0.a(asd.l)) {
         $$1 *= 0.15F;
      }

      return $$1;
   }

   @Override
   public void a(bmf $$0, float $$1) {
      if (!this.u()) {
         elm $$2 = $$0.dp();
         double $$3 = $$0.dr() + $$2.c - this.dr();
         double $$4 = $$0.dv() - 1.1F - this.dt();
         double $$5 = $$0.dx() + $$2.e - this.dx();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         cop $$7 = cos.C;
         if ($$0 instanceof cgk) {
            if ($$0.ev() <= 4.0F) {
               $$7 = cos.A;
            } else {
               $$7 = cos.H;
            }

            this.h(null);
         } else if ($$6 >= 8.0 && !$$0.a(ble.b)) {
            $$7 = cos.s;
         } else if ($$0.ev() >= 8.0F && !$$0.a(ble.s)) {
            $$7 = cos.E;
         } else if ($$6 <= 3.0 && !$$0.a(ble.r) && this.ag.i() < 0.25F) {
            $$7 = cos.N;
         }

         cge $$8 = new cge(this.dM(), this);
         $$8.a(cor.a(new cmr(cmu.vh), $$7));
         $$8.s($$8.dE() - -20.0F);
         $$8.c($$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         if (!this.aU()) {
            this.dM().a(null, this.dr(), this.dt(), this.dx(), arm.Bk, this.db(), 1.0F, 0.8F + this.ag.i() * 0.4F);
         }

         this.dM().b($$8);
      }
   }

   @Override
   protected float b(bmr $$0, blq $$1) {
      return 1.62F;
   }

   @Override
   protected Vector3f a(blp $$0, blq $$1, float $$2) {
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
