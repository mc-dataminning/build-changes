import java.util.List;
import java.util.UUID;
import org.joml.Vector3f;

public class ccp extends cga implements ccd {
   private static final UUID b = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
   private static final bmz e = new bmz(b, "Drinking speed penalty", -0.25, bmz.a.a);
   private static final afz<Boolean> bT = agc.a(ccp.class, agb.k);
   private int bU;
   private bum<cga> bV;
   private bul<cer> bW;

   public ccp(blj<? extends ccp> $$0, csy $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bV = new bum<>(this, cga.class, true, $$0 -> $$0 != null && this.gt() && $$0.ai() != blj.bl);
      this.bW = new bul<>(this, cer.class, 10, true, false, null);
      this.bO.a(1, new bsl(this));
      this.bO.a(2, new btq(this, 1.0, 60, 10.0F));
      this.bO.a(2, new bue(this, 1.0));
      this.bO.a(3, new bsz(this, cer.class, 8.0F));
      this.bO.a(3, new btm(this));
      this.bP.a(1, new buj(this, cga.class));
      this.bP.a(2, this.bV);
      this.bP.a(3, this.bW);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an().a(bT, false);
   }

   @Override
   protected arb y() {
      return arc.Bf;
   }

   @Override
   protected arb d(bkd $$0) {
      return arc.Bj;
   }

   @Override
   protected arb n_() {
      return arc.Bh;
   }

   public void y(boolean $$0) {
      this.an().b(bT, $$0);
   }

   @Override
   public boolean u() {
      return this.an().b(bT);
   }

   public static bna.a w() {
      return cbz.gk().a(bnb.l, 26.0).a(bnb.m, 0.25);
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
               cmh $$0 = this.eT();
               this.a(blk.a, cmh.f);
               if ($$0.a(cmk.sh)) {
                  List<bks> $$1 = cog.a($$0);
                  if ($$1 != null) {
                     for (bks $$2 : $$1) {
                        this.b(new bks($$2));
                     }
                  }
               }

               this.a(dmz.l);
               this.a(bnb.m).b(e.a());
            }
         } else {
            coe $$3 = null;
            if (this.ag.i() < 0.15F && this.a(arw.a) && !this.a(bku.m)) {
               $$3 = coh.y;
            } else if (this.ag.i() < 0.15F && (this.bN() || this.ex() != null && this.ex().a(art.j)) && !this.a(bku.l)) {
               $$3 = coh.n;
            } else if (this.ag.i() < 0.05F && this.ev() < this.eM()) {
               $$3 = coh.A;
            } else if (this.ag.i() < 0.5F && this.q() != null && !this.a(bku.a) && this.q().f(this) > 121.0) {
               $$3 = coh.p;
            }

            if ($$3 != null) {
               this.a(blk.a, cog.a(new cmh(cmk.sh), $$3));
               this.bU = this.eT().r();
               this.y(true);
               if (!this.aU()) {
                  this.dM().a(null, this.dr(), this.dt(), this.dx(), arc.Bi, this.db(), 1.0F, 0.8F + this.ag.i() * 0.4F);
               }

               bmx $$4 = this.a(bnb.m);
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
   public arb af_() {
      return arc.Bg;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 15) {
         for (int $$1 = 0; $$1 < this.ag.a(35) + 10; $$1++) {
            this.dM().a(jv.ak, this.dr() + this.ag.k() * 0.13F, this.cH().e + 0.5 + this.ag.k() * 0.13F, this.dx() + this.ag.k() * 0.13F, 0.0, 0.0, 0.0);
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   protected float e(bkd $$0, float $$1) {
      $$1 = super.e($$0, $$1);
      if ($$0.d() == this) {
         $$1 = 0.0F;
      }

      if ($$0.a(art.l)) {
         $$1 *= 0.15F;
      }

      return $$1;
   }

   @Override
   public void a(blv $$0, float $$1) {
      if (!this.u()) {
         elb $$2 = $$0.dp();
         double $$3 = $$0.dr() + $$2.c - this.dr();
         double $$4 = $$0.dv() - 1.1F - this.dt();
         double $$5 = $$0.dx() + $$2.e - this.dx();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         coe $$7 = coh.C;
         if ($$0 instanceof cga) {
            if ($$0.ev() <= 4.0F) {
               $$7 = coh.A;
            } else {
               $$7 = coh.H;
            }

            this.h(null);
         } else if ($$6 >= 8.0 && !$$0.a(bku.b)) {
            $$7 = coh.s;
         } else if ($$0.ev() >= 8.0F && !$$0.a(bku.s)) {
            $$7 = coh.E;
         } else if ($$6 <= 3.0 && !$$0.a(bku.r) && this.ag.i() < 0.25F) {
            $$7 = coh.N;
         }

         cfu $$8 = new cfu(this.dM(), this);
         $$8.a(cog.a(new cmh(cmk.vh), $$7));
         $$8.s($$8.dE() - -20.0F);
         $$8.c($$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         if (!this.aU()) {
            this.dM().a(null, this.dr(), this.dt(), this.dx(), arc.Bk, this.db(), 1.0F, 0.8F + this.ag.i() * 0.4F);
         }

         this.dM().b($$8);
      }
   }

   @Override
   protected float b(bmh $$0, blg $$1) {
      return 1.62F;
   }

   @Override
   protected Vector3f a(blf $$0, blg $$1, float $$2) {
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
