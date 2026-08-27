import java.util.List;
import java.util.UUID;

public class cgo extends cke implements cgc {
   private static final UUID b = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
   private static final bqt e = new bqt(b, "Drinking speed penalty", -0.25, bqt.a.a);
   private static final aim<Boolean> bX = aiq.a(cgo.class, aio.k);
   private int bY;
   private byg<cke> bZ;
   private byf<cis> ca;

   public cgo(bpc<? extends cgo> $$0, cwz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bZ = new byg<>(this, cke.class, true, $$0 -> $$0 != null && this.gC() && $$0.ai() != bpc.bn);
      this.ca = new byf<>(this, cis.class, 10, true, false, null);
      this.bR.a(1, new bwf(this));
      this.bR.a(2, new bxk(this, 1.0, 60, 10.0F));
      this.bR.a(2, new bxy(this, 1.0));
      this.bR.a(3, new bwt(this, cis.class, 8.0F));
      this.bR.a(3, new bxg(this));
      this.bS.a(1, new byd(this, cke.class));
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
      return aty.BM;
   }

   @Override
   protected atx d(bnv $$0) {
      return aty.BQ;
   }

   @Override
   protected atx n_() {
      return aty.BO;
   }

   public void y(boolean $$0) {
      this.an().a(bX, $$0);
   }

   public boolean r() {
      return this.an().a(bX);
   }

   public static bqu.a s() {
      return cfy.gt().a(bqv.q, 26.0).a(bqv.r, 0.25);
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
               cqk $$0 = this.eU();
               this.a(bpd.a, cqk.h);
               if ($$0.a(cqn.sj)) {
                  List<boj> $$1 = csj.a($$0);
                  if ($$1 != null) {
                     for (boj $$2 : $$1) {
                        this.b(new boj($$2));
                     }
                  }
               }

               this.b(drn.l);
               this.f(bqv.r).b(e.a());
            }
         } else {
            il<csh> $$3 = null;
            if (this.ag.i() < 0.15F && this.a(aus.a) && !this.a(bol.m)) {
               $$3 = csk.y;
            } else if (this.ag.i() < 0.15F && (this.bN() || this.ez() != null && this.ez().a(aup.j)) && !this.a(bol.l)) {
               $$3 = csk.n;
            } else if (this.ag.i() < 0.05F && this.ex() < this.eO()) {
               $$3 = csk.A;
            } else if (this.ag.i() < 0.5F && this.p() != null && !this.a(bol.a) && this.p().g(this) > 121.0) {
               $$3 = csk.p;
            }

            if ($$3 != null) {
               this.a(bpd.a, csj.a(new cqk(cqn.sj), $$3));
               this.bY = this.eU().s();
               this.y(true);
               if (!this.aU()) {
                  this.dM().a(null, this.dr(), this.dt(), this.dx(), aty.BP, this.db(), 1.0F, 0.8F + this.ag.i() * 0.4F);
               }

               bqr $$4 = this.f(bqv.r);
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
      return aty.BN;
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
   protected float e(bnv $$0, float $$1) {
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
   public void a(bpo $$0, float $$1) {
      if (!this.r()) {
         epr $$2 = $$0.dp();
         double $$3 = $$0.dr() + $$2.c - this.dr();
         double $$4 = $$0.dv() - 1.1F - this.dt();
         double $$5 = $$0.dx() + $$2.e - this.dx();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         il<csh> $$7 = csk.C;
         if ($$0 instanceof cke) {
            if ($$0.ex() <= 4.0F) {
               $$7 = csk.A;
            } else {
               $$7 = csk.H;
            }

            this.h(null);
         } else if ($$6 >= 8.0 && !$$0.a(bol.b)) {
            $$7 = csk.s;
         } else if ($$0.ex() >= 8.0F && !$$0.a(bol.s)) {
            $$7 = csk.E;
         } else if ($$6 <= 3.0 && !$$0.a(bol.r) && this.ag.i() < 0.25F) {
            $$7 = csk.N;
         }

         cjw $$8 = new cjw(this.dM(), this);
         $$8.a(csj.a(new cqk(cqn.vl), $$7));
         $$8.s($$8.dE() - -20.0F);
         $$8.c($$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         if (!this.aU()) {
            this.dM().a(null, this.dr(), this.dt(), this.dx(), aty.BR, this.db(), 1.0F, 0.8F + this.ag.i() * 0.4F);
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
