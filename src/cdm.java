import java.util.List;
import java.util.UUID;

public class cdm extends cgz implements cda {
   private static final UUID b = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
   private static final bns e = new bns(b, "Drinking speed penalty", -0.25, bns.a.a);
   private static final agn<Boolean> bU = agq.a(cdm.class, agp.k);
   private int bV;
   private bvf<cgz> bW;
   private bve<cfq> bX;

   public cdm(bmc<? extends cdm> $$0, ctx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bW = new bvf<>(this, cgz.class, true, $$0 -> $$0 != null && this.gu() && $$0.ai() != bmc.bm);
      this.bX = new bve<>(this, cfq.class, 10, true, false, null);
      this.bP.a(1, new bte(this));
      this.bP.a(2, new buj(this, 1.0, 60, 10.0F));
      this.bP.a(2, new bux(this, 1.0));
      this.bP.a(3, new bts(this, cfq.class, 8.0F));
      this.bP.a(3, new buf(this));
      this.bQ.a(1, new bvc(this, cgz.class));
      this.bQ.a(2, this.bW);
      this.bQ.a(3, this.bX);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an().a(bU, false);
   }

   @Override
   protected ars y() {
      return art.Bu;
   }

   @Override
   protected ars d(bkv $$0) {
      return art.By;
   }

   @Override
   protected ars n_() {
      return art.Bw;
   }

   public void y(boolean $$0) {
      this.an().b(bU, $$0);
   }

   @Override
   public boolean u() {
      return this.an().b(bU);
   }

   public static bnt.a w() {
      return ccw.gl().a(bnu.n, 26.0).a(bnu.o, 0.25);
   }

   @Override
   public void d_() {
      if (!this.dL().B && this.bx()) {
         this.bW.k();
         if (this.bW.i() <= 0) {
            this.bX.a(true);
         } else {
            this.bX.a(false);
         }

         if (this.u()) {
            if (this.bV-- <= 0) {
               this.y(false);
               cng $$0 = this.eT();
               this.a(bmd.a, cng.f);
               if ($$0.a(cnj.sj)) {
                  List<blj> $$1 = cpg.a($$0);
                  if ($$1 != null) {
                     for (blj $$2 : $$1) {
                        this.b(new blj($$2));
                     }
                  }
               }

               this.b(dnz.l);
               this.f(bnu.o).b(e.a());
            }
         } else {
            ih<cpe> $$3 = null;
            if (this.ag.i() < 0.15F && this.a(asn.a) && !this.a(bll.m)) {
               $$3 = cph.y;
            } else if (this.ag.i() < 0.15F && (this.bN() || this.ex() != null && this.ex().a(ask.j)) && !this.a(bll.l)) {
               $$3 = cph.n;
            } else if (this.ag.i() < 0.05F && this.ev() < this.eM()) {
               $$3 = cph.A;
            } else if (this.ag.i() < 0.5F && this.q() != null && !this.a(bll.a) && this.q().f(this) > 121.0) {
               $$3 = cph.p;
            }

            if ($$3 != null) {
               this.a(bmd.a, cpg.a(new cng(cnj.sj), $$3));
               this.bV = this.eT().r();
               this.y(true);
               if (!this.aU()) {
                  this.dL().a(null, this.dq(), this.ds(), this.dw(), art.Bx, this.db(), 1.0F, 0.8F + this.ag.i() * 0.4F);
               }

               bnq $$4 = this.f(bnu.o);
               $$4.b(e.a());
               $$4.c(e);
            }
         }

         if (this.ag.i() < 7.5E-4F) {
            this.dL().a(this, (byte)15);
         }
      }

      super.d_();
   }

   @Override
   public ars ag_() {
      return art.Bv;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 15) {
         for (int $$1 = 0; $$1 < this.ag.a(35) + 10; $$1++) {
            this.dL().a(jx.ak, this.dq() + this.ag.k() * 0.13F, this.cH().e + 0.5 + this.ag.k() * 0.13F, this.dw() + this.ag.k() * 0.13F, 0.0, 0.0, 0.0);
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   protected float e(bkv $$0, float $$1) {
      $$1 = super.e($$0, $$1);
      if ($$0.d() == this) {
         $$1 = 0.0F;
      }

      if ($$0.a(ask.l)) {
         $$1 *= 0.15F;
      }

      return $$1;
   }

   @Override
   public void a(bmo $$0, float $$1) {
      if (!this.u()) {
         emc $$2 = $$0.do();
         double $$3 = $$0.dq() + $$2.c - this.dq();
         double $$4 = $$0.du() - 1.1F - this.ds();
         double $$5 = $$0.dw() + $$2.e - this.dw();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         ih<cpe> $$7 = cph.C;
         if ($$0 instanceof cgz) {
            if ($$0.ev() <= 4.0F) {
               $$7 = cph.A;
            } else {
               $$7 = cph.H;
            }

            this.h(null);
         } else if ($$6 >= 8.0 && !$$0.a(bll.b)) {
            $$7 = cph.s;
         } else if ($$0.ev() >= 8.0F && !$$0.a(bll.s)) {
            $$7 = cph.E;
         } else if ($$6 <= 3.0 && !$$0.a(bll.r) && this.ag.i() < 0.25F) {
            $$7 = cph.N;
         }

         cgt $$8 = new cgt(this.dL(), this);
         $$8.a(cpg.a(new cng(cnj.vk), $$7));
         $$8.s($$8.dD() - -20.0F);
         $$8.c($$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         if (!this.aU()) {
            this.dL().a(null, this.dq(), this.ds(), this.dw(), art.Bz, this.db(), 1.0F, 0.8F + this.ag.i() * 0.4F);
         }

         this.dL().b($$8);
      }
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public boolean gg() {
      return false;
   }
}
