import java.util.UUID;

public class ckg extends cnw implements cju {
   private static final UUID b = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
   private static final buh e = new buh(b, "Drinking speed penalty", -0.25, buh.a.a);
   private static final ajp<Boolean> ca = ajt.a(ckg.class, ajr.k);
   private int cb;
   private cbu<cnw> cc;
   private cbt<cmk> cd;

   public ckg(bsm<? extends ckg> $$0, dcf $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.cc = new cbu<>(this, cnw.class, true, $$0 -> $$0 != null && this.gF() && $$0.al() != bsm.bo);
      this.cd = new cbt<>(this, cmk.class, 10, true, false, null);
      this.bU.a(1, new bzt(this));
      this.bU.a(2, new cay(this, 1.0, 60, 10.0F));
      this.bU.a(2, new cbm(this, 1.0));
      this.bU.a(3, new cah(this, cmk.class, 8.0F));
      this.bU.a(3, new cau(this));
      this.bV.a(1, new cbr(this, cnw.class));
      this.bV.a(2, this.cc);
      this.bV.a(3, this.cd);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(ca, false);
   }

   @Override
   protected avg v() {
      return avh.Cr;
   }

   @Override
   protected avg d(bqz $$0) {
      return avh.Cv;
   }

   @Override
   protected avg o_() {
      return avh.Ct;
   }

   public void y(boolean $$0) {
      this.aq().a(ca, $$0);
   }

   public boolean s() {
      return this.aq().a(ca);
   }

   public static bui.a u() {
      return cjq.gu().a(buj.s, 26.0).a(buj.v, 0.25);
   }

   @Override
   public void n_() {
      if (!this.dQ().B && this.bE()) {
         this.cc.k();
         if (this.cc.i() <= 0) {
            this.cd.a(true);
         } else {
            this.cd.a(false);
         }

         if (this.s()) {
            if (this.cb-- <= 0) {
               this.y(false);
               cuc $$0 = this.eU();
               this.a(bsn.a, cuc.l);
               cwd $$1 = $$0.a(kn.G);
               if ($$0.a(cuf.sk) && $$1 != null) {
                  $$1.a(this::b);
               }

               this.a(dxg.l);
               this.f(buj.v).b(e.b());
            }
         } else {
            jj<cwb> $$2 = null;
            if (this.ah.i() < 0.15F && this.a(awc.a) && !this.b(brq.m)) {
               $$2 = cwe.w;
            } else if (this.ah.i() < 0.15F && (this.bR() || this.ez() != null && this.ez().a(avy.j)) && !this.b(brq.l)) {
               $$2 = cwe.l;
            } else if (this.ah.i() < 0.05F && this.ex() < this.eO()) {
               $$2 = cwe.y;
            } else if (this.ah.i() < 0.5F && this.p() != null && !this.b(brq.a) && this.p().g(this) > 121.0) {
               $$2 = cwe.n;
            }

            if ($$2 != null) {
               this.a(bsn.a, cwd.a(cuf.sk, $$2));
               this.cb = this.eU().a((btb)this);
               this.y(true);
               if (!this.aX()) {
                  this.dQ().a(null, this.dv(), this.dx(), this.dB(), avh.Cu, this.df(), 1.0F, 0.8F + this.ah.i() * 0.4F);
               }

               buf $$3 = this.f(buj.v);
               $$3.b(e.b());
               $$3.c(e);
            }
         }

         if (this.ah.i() < 7.5E-4F) {
            this.dQ().a(this, (byte)15);
         }
      }

      super.n_();
   }

   @Override
   public avg ae_() {
      return avh.Cs;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 15) {
         for (int $$1 = 0; $$1 < this.ah.a(35) + 10; $$1++) {
            this.dQ().a(lj.an, this.dv() + this.ah.k() * 0.13F, this.cL().e + 0.5 + this.ah.k() * 0.13F, this.dB() + this.ah.k() * 0.13F, 0.0, 0.0, 0.0);
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   protected float e(bqz $$0, float $$1) {
      $$1 = super.e($$0, $$1);
      if ($$0.d() == this) {
         $$1 = 0.0F;
      }

      if ($$0.a(avy.l)) {
         $$1 *= 0.15F;
      }

      return $$1;
   }

   @Override
   public void a(btb $$0, float $$1) {
      if (!this.s()) {
         ewf $$2 = $$0.dt();
         double $$3 = $$0.dv() + $$2.c - this.dv();
         double $$4 = $$0.dz() - 1.1F - this.dx();
         double $$5 = $$0.dB() + $$2.e - this.dB();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         jj<cwb> $$7 = cwe.A;
         if ($$0 instanceof cnw) {
            if ($$0.ex() <= 4.0F) {
               $$7 = cwe.y;
            } else {
               $$7 = cwe.F;
            }

            this.h(null);
         } else if ($$6 >= 8.0 && !$$0.b(brq.b)) {
            $$7 = cwe.q;
         } else if ($$0.ex() >= 8.0F && !$$0.b(brq.s)) {
            $$7 = cwe.C;
         } else if ($$6 <= 3.0 && !$$0.b(brq.r) && this.ah.i() < 0.25F) {
            $$7 = cwe.L;
         }

         cno $$8 = new cno(this.dQ(), this);
         $$8.a(cwd.a(cuf.vo, $$7));
         $$8.t($$8.dI() - -20.0F);
         $$8.c($$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         if (!this.aX()) {
            this.dQ().a(null, this.dv(), this.dx(), this.dB(), avh.Cw, this.df(), 1.0F, 0.8F + this.ah.i() * 0.4F);
         }

         this.dQ().b($$8);
      }
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public boolean gp() {
      return false;
   }
}
