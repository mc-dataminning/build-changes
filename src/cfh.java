import java.util.List;
import java.util.UUID;

public class cfh extends civ implements cev {
   private static final UUID b = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
   private static final bpn e = new bpn(b, "Drinking speed penalty", -0.25, bpn.a.a);
   private static final aie<Boolean> bT = aih.a(cfh.class, aig.k);
   private int bU;
   private bxa<civ> bV;
   private bwz<chl> bW;

   public cfh(bnw<? extends cfh> $$0, cvr $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bV = new bxa<>(this, civ.class, true, $$0 -> $$0 != null && this.gv() && $$0.ai() != bnw.bm);
      this.bW = new bwz<>(this, chl.class, 10, true, false, null);
      this.bO.a(1, new buz(this));
      this.bO.a(2, new bwe(this, 1.0, 60, 10.0F));
      this.bO.a(2, new bws(this, 1.0));
      this.bO.a(3, new bvn(this, chl.class, 8.0F));
      this.bO.a(3, new bwa(this));
      this.bP.a(1, new bwx(this, civ.class));
      this.bP.a(2, this.bV);
      this.bP.a(3, this.bW);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an().a(bT, false);
   }

   @Override
   protected atk y() {
      return atl.Bv;
   }

   @Override
   protected atk d(bmp $$0) {
      return atl.Bz;
   }

   @Override
   protected atk n_() {
      return atl.Bx;
   }

   public void y(boolean $$0) {
      this.an().b(bT, $$0);
   }

   @Override
   public boolean u() {
      return this.an().b(bT);
   }

   public static bpo.a w() {
      return cer.gm().a(bpp.n, 26.0).a(bpp.o, 0.25);
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
               cpd $$0 = this.eT();
               this.a(bnx.a, cpd.h);
               if ($$0.a(cpg.sj)) {
                  List<bnd> $$1 = crb.a($$0);
                  if ($$1 != null) {
                     for (bnd $$2 : $$1) {
                        this.b(new bnd($$2));
                     }
                  }
               }

               this.b(dpw.l);
               this.f(bpp.o).b(e.a());
            }
         } else {
            ij<cqz> $$3 = null;
            if (this.af.i() < 0.15F && this.a(auf.a) && !this.a(bnf.m)) {
               $$3 = crc.y;
            } else if (this.af.i() < 0.15F && (this.bN() || this.ey() != null && this.ey().a(auc.j)) && !this.a(bnf.l)) {
               $$3 = crc.n;
            } else if (this.af.i() < 0.05F && this.ew() < this.eN()) {
               $$3 = crc.A;
            } else if (this.af.i() < 0.5F && this.q() != null && !this.a(bnf.a) && this.q().f(this) > 121.0) {
               $$3 = crc.p;
            }

            if ($$3 != null) {
               this.a(bnx.a, crb.a(new cpd(cpg.sj), $$3));
               this.bU = this.eT().s();
               this.y(true);
               if (!this.aU()) {
                  this.dM().a(null, this.dr(), this.dt(), this.dx(), atl.By, this.db(), 1.0F, 0.8F + this.af.i() * 0.4F);
               }

               bpl $$4 = this.f(bpp.o);
               $$4.b(e.a());
               $$4.c(e);
            }
         }

         if (this.af.i() < 7.5E-4F) {
            this.dM().a(this, (byte)15);
         }
      }

      super.d_();
   }

   @Override
   public atk ag_() {
      return atl.Bw;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 15) {
         for (int $$1 = 0; $$1 < this.af.a(35) + 10; $$1++) {
            this.dM().a(jz.ak, this.dr() + this.af.k() * 0.13F, this.cH().e + 0.5 + this.af.k() * 0.13F, this.dx() + this.af.k() * 0.13F, 0.0, 0.0, 0.0);
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   protected float e(bmp $$0, float $$1) {
      $$1 = super.e($$0, $$1);
      if ($$0.d() == this) {
         $$1 = 0.0F;
      }

      if ($$0.a(auc.l)) {
         $$1 *= 0.15F;
      }

      return $$1;
   }

   @Override
   public void a(boi $$0, float $$1) {
      if (!this.u()) {
         enz $$2 = $$0.dp();
         double $$3 = $$0.dr() + $$2.c - this.dr();
         double $$4 = $$0.dv() - 1.1F - this.dt();
         double $$5 = $$0.dx() + $$2.e - this.dx();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         ij<cqz> $$7 = crc.C;
         if ($$0 instanceof civ) {
            if ($$0.ew() <= 4.0F) {
               $$7 = crc.A;
            } else {
               $$7 = crc.H;
            }

            this.h(null);
         } else if ($$6 >= 8.0 && !$$0.a(bnf.b)) {
            $$7 = crc.s;
         } else if ($$0.ew() >= 8.0F && !$$0.a(bnf.s)) {
            $$7 = crc.E;
         } else if ($$6 <= 3.0 && !$$0.a(bnf.r) && this.af.i() < 0.25F) {
            $$7 = crc.N;
         }

         cip $$8 = new cip(this.dM(), this);
         $$8.a(crb.a(new cpd(cpg.vk), $$7));
         $$8.s($$8.dE() - -20.0F);
         $$8.c($$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         if (!this.aU()) {
            this.dM().a(null, this.dr(), this.dt(), this.dx(), atl.BA, this.db(), 1.0F, 0.8F + this.af.i() * 0.4F);
         }

         this.dM().b($$8);
      }
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public boolean gh() {
      return false;
   }
}
