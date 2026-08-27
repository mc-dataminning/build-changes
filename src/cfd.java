import java.util.List;
import java.util.UUID;

public class cfd extends cir implements cer {
   private static final UUID b = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
   private static final bpj e = new bpj(b, "Drinking speed penalty", -0.25, bpj.a.a);
   private static final aie<Boolean> bT = aih.a(cfd.class, aig.k);
   private int bU;
   private bww<cir> bV;
   private bwv<chh> bW;

   public cfd(bnu<? extends cfd> $$0, cvn $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bV = new bww<>(this, cir.class, true, $$0 -> $$0 != null && this.gv() && $$0.ai() != bnu.bm);
      this.bW = new bwv<>(this, chh.class, 10, true, false, null);
      this.bO.a(1, new buv(this));
      this.bO.a(2, new bwa(this, 1.0, 60, 10.0F));
      this.bO.a(2, new bwo(this, 1.0));
      this.bO.a(3, new bvj(this, chh.class, 8.0F));
      this.bO.a(3, new bvw(this));
      this.bP.a(1, new bwt(this, cir.class));
      this.bP.a(2, this.bV);
      this.bP.a(3, this.bW);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an().a(bT, false);
   }

   @Override
   protected atj y() {
      return atk.Bu;
   }

   @Override
   protected atj d(bmn $$0) {
      return atk.By;
   }

   @Override
   protected atj n_() {
      return atk.Bw;
   }

   public void y(boolean $$0) {
      this.an().b(bT, $$0);
   }

   @Override
   public boolean u() {
      return this.an().b(bT);
   }

   public static bpk.a w() {
      return cen.gm().a(bpl.n, 26.0).a(bpl.o, 0.25);
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
               coz $$0 = this.eT();
               this.a(bnv.a, coz.h);
               if ($$0.a(cpc.sj)) {
                  List<bnb> $$1 = cqx.a($$0);
                  if ($$1 != null) {
                     for (bnb $$2 : $$1) {
                        this.b(new bnb($$2));
                     }
                  }
               }

               this.b(dpp.l);
               this.f(bpl.o).b(e.a());
            }
         } else {
            ij<cqv> $$3 = null;
            if (this.af.i() < 0.15F && this.a(aue.a) && !this.a(bnd.m)) {
               $$3 = cqy.y;
            } else if (this.af.i() < 0.15F && (this.bN() || this.ey() != null && this.ey().a(aub.j)) && !this.a(bnd.l)) {
               $$3 = cqy.n;
            } else if (this.af.i() < 0.05F && this.ew() < this.eN()) {
               $$3 = cqy.A;
            } else if (this.af.i() < 0.5F && this.q() != null && !this.a(bnd.a) && this.q().f(this) > 121.0) {
               $$3 = cqy.p;
            }

            if ($$3 != null) {
               this.a(bnv.a, cqx.a(new coz(cpc.sj), $$3));
               this.bU = this.eT().s();
               this.y(true);
               if (!this.aU()) {
                  this.dM().a(null, this.dr(), this.dt(), this.dx(), atk.Bx, this.db(), 1.0F, 0.8F + this.af.i() * 0.4F);
               }

               bph $$4 = this.f(bpl.o);
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
   public atj ag_() {
      return atk.Bv;
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
   protected float e(bmn $$0, float $$1) {
      $$1 = super.e($$0, $$1);
      if ($$0.d() == this) {
         $$1 = 0.0F;
      }

      if ($$0.a(aub.l)) {
         $$1 *= 0.15F;
      }

      return $$1;
   }

   @Override
   public void a(bog $$0, float $$1) {
      if (!this.u()) {
         ens $$2 = $$0.dp();
         double $$3 = $$0.dr() + $$2.c - this.dr();
         double $$4 = $$0.dv() - 1.1F - this.dt();
         double $$5 = $$0.dx() + $$2.e - this.dx();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         ij<cqv> $$7 = cqy.C;
         if ($$0 instanceof cir) {
            if ($$0.ew() <= 4.0F) {
               $$7 = cqy.A;
            } else {
               $$7 = cqy.H;
            }

            this.h(null);
         } else if ($$6 >= 8.0 && !$$0.a(bnd.b)) {
            $$7 = cqy.s;
         } else if ($$0.ew() >= 8.0F && !$$0.a(bnd.s)) {
            $$7 = cqy.E;
         } else if ($$6 <= 3.0 && !$$0.a(bnd.r) && this.af.i() < 0.25F) {
            $$7 = cqy.N;
         }

         cil $$8 = new cil(this.dM(), this);
         $$8.a(cqx.a(new coz(cpc.vk), $$7));
         $$8.s($$8.dE() - -20.0F);
         $$8.c($$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         if (!this.aU()) {
            this.dM().a(null, this.dr(), this.dt(), this.dx(), atk.Bz, this.db(), 1.0F, 0.8F + this.af.i() * 0.4F);
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
