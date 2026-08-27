import java.util.List;
import java.util.UUID;

public class cgq extends ckg implements cge {
   private static final UUID b = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
   private static final bqu e = new bqu(b, "Drinking speed penalty", -0.25, bqu.a.a);
   private static final aim<Boolean> bX = aiq.a(cgq.class, aio.k);
   private int bY;
   private byh<ckg> bZ;
   private byg<ciu> ca;

   public cgq(bpd<? extends cgq> $$0, cxb $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bZ = new byh<>(this, ckg.class, true, $$0 -> $$0 != null && this.gC() && $$0.ai() != bpd.bo);
      this.ca = new byg<>(this, ciu.class, 10, true, false, null);
      this.bR.a(1, new bwg(this));
      this.bR.a(2, new bxl(this, 1.0, 60, 10.0F));
      this.bR.a(2, new bxz(this, 1.0));
      this.bR.a(3, new bwu(this, ciu.class, 8.0F));
      this.bR.a(3, new bxh(this));
      this.bS.a(1, new bye(this, ckg.class));
      this.bS.a(2, this.bZ);
      this.bS.a(3, this.ca);
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(bX, false);
   }

   @Override
   protected atx v() {
      return aty.BR;
   }

   @Override
   protected atx d(bnw $$0) {
      return aty.BV;
   }

   @Override
   protected atx n_() {
      return aty.BT;
   }

   public void y(boolean $$0) {
      this.an().a(bX, $$0);
   }

   public boolean r() {
      return this.an().a(bX);
   }

   public static bqv.a s() {
      return cga.gt().a(bqw.q, 26.0).a(bqw.r, 0.25);
   }

   @Override
   public void m_() {
      if (!this.dM().B && this.bA()) {
         this.bZ.k();
         if (this.bZ.i() <= 0) {
            this.ca.a(true);
         } else {
            this.ca.a(false);
         }

         if (this.r()) {
            if (this.bY-- <= 0) {
               this.y(false);
               cqm $$0 = this.eU();
               this.a(bpe.a, cqm.h);
               if ($$0.a(cqp.sj)) {
                  List<bok> $$1 = csl.a($$0);
                  if ($$1 != null) {
                     for (bok $$2 : $$1) {
                        this.b(new bok($$2));
                     }
                  }
               }

               this.b(drp.l);
               this.f(bqw.r).b(e.a());
            }
         } else {
            il<csj> $$3 = null;
            if (this.ag.i() < 0.15F && this.a(aus.a) && !this.a(bom.m)) {
               $$3 = csm.y;
            } else if (this.ag.i() < 0.15F && (this.bN() || this.ez() != null && this.ez().a(aup.j)) && !this.a(bom.l)) {
               $$3 = csm.n;
            } else if (this.ag.i() < 0.05F && this.ex() < this.eO()) {
               $$3 = csm.A;
            } else if (this.ag.i() < 0.5F && this.p() != null && !this.a(bom.a) && this.p().g(this) > 121.0) {
               $$3 = csm.p;
            }

            if ($$3 != null) {
               this.a(bpe.a, csl.a(new cqm(cqp.sj), $$3));
               this.bY = this.eU().s();
               this.y(true);
               if (!this.aU()) {
                  this.dM().a(null, this.dr(), this.dt(), this.dx(), aty.BU, this.db(), 1.0F, 0.8F + this.ag.i() * 0.4F);
               }

               bqs $$4 = this.f(bqw.r);
               $$4.b(e.a());
               $$4.c(e);
            }
         }

         if (this.ag.i() < 7.5E-4F) {
            this.dM().a(this, (byte)15);
         }
      }

      super.m_();
   }

   @Override
   public atx ae_() {
      return aty.BS;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 15) {
         for (int $$1 = 0; $$1 < this.ag.a(35) + 10; $$1++) {
            this.dM().a(kc.al, this.dr() + this.ag.k() * 0.13F, this.cH().e + 0.5 + this.ag.k() * 0.13F, this.dx() + this.ag.k() * 0.13F, 0.0, 0.0, 0.0);
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   protected float e(bnw $$0, float $$1) {
      $$1 = super.e($$0, $$1);
      if ($$0.d() == this) {
         $$1 = 0.0F;
      }

      if ($$0.a(aup.l)) {
         $$1 *= 0.15F;
      }

      return $$1;
   }

   @Override
   public void a(bpp $$0, float $$1) {
      if (!this.r()) {
         ept $$2 = $$0.dp();
         double $$3 = $$0.dr() + $$2.c - this.dr();
         double $$4 = $$0.dv() - 1.1F - this.dt();
         double $$5 = $$0.dx() + $$2.e - this.dx();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         il<csj> $$7 = csm.C;
         if ($$0 instanceof ckg) {
            if ($$0.ex() <= 4.0F) {
               $$7 = csm.A;
            } else {
               $$7 = csm.H;
            }

            this.h(null);
         } else if ($$6 >= 8.0 && !$$0.a(bom.b)) {
            $$7 = csm.s;
         } else if ($$0.ex() >= 8.0F && !$$0.a(bom.s)) {
            $$7 = csm.E;
         } else if ($$6 <= 3.0 && !$$0.a(bom.r) && this.ag.i() < 0.25F) {
            $$7 = csm.N;
         }

         cjy $$8 = new cjy(this.dM(), this);
         $$8.a(csl.a(new cqm(cqp.vm), $$7));
         $$8.s($$8.dE() - -20.0F);
         $$8.c($$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         if (!this.aU()) {
            this.dM().a(null, this.dr(), this.dt(), this.dx(), aty.BW, this.db(), 1.0F, 0.8F + this.ag.i() * 0.4F);
         }

         this.dM().b($$8);
      }
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public boolean go() {
      return false;
   }
}
