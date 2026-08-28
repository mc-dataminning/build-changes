import java.util.UUID;
import javax.annotation.Nullable;

public class chi extends cgt implements bvk {
   protected static final ajx<Byte> c = akb.a(chi.class, ajz.a);
   private static final int d = 25;
   private int bY;
   private int bZ;
   private static final brt ca = baa.a(20, 39);
   private int cb;
   @Nullable
   private UUID cc;

   public chi(buq<? extends chi> $$0, dgg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bS.a(1, new ccn(this, 1.0, true));
      this.bS.a(2, new ccs(this, 0.9, 32.0F));
      this.bS.a(2, new cco(this, 0.6, false));
      this.bS.a(4, new ccf(this, 0.6));
      this.bS.a(5, new ccu(this));
      this.bS.a(7, new ccl(this, cov.class, 6.0F));
      this.bS.a(8, new ccy(this));
      this.bT.a(1, new cdu(this));
      this.bT.a(2, new cdv(this));
      this.bT.a(3, new cdw<>(this, cov.class, 10, true, false, this::a));
      this.bT.a(3, new cdw<>(this, bvh.class, 5, false, false, ($$0, $$1) -> $$0 instanceof clo && !($$0 instanceof cli)));
      this.bT.a(4, new cec<>(this, false));
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(c, (byte)0);
   }

   public static bwm.a m() {
      return bvh.C().a(bwn.s, 100.0).a(bwn.v, 0.25).a(bwn.p, 1.0).a(bwn.c, 15.0).a(bwn.B, 1.0);
   }

   @Override
   protected int l(int $$0) {
      return $$0;
   }

   @Override
   protected void D(buj $$0) {
      if ($$0 instanceof clo && !($$0 instanceof cli) && this.dZ().a(20) == 0) {
         this.h((bvf)$$0);
      }

      super.D($$0);
   }

   @Override
   public void d_() {
      super.d_();
      if (this.bY > 0) {
         this.bY--;
      }

      if (this.bZ > 0) {
         this.bZ--;
      }

      if (!this.dW().C) {
         this.a((arc)this.dW(), true);
      }
   }

   @Override
   public boolean bv() {
      return this.dz().j() > 2.5000003E-7F && this.ae.a(5) == 0;
   }

   @Override
   public boolean a(buq<?> $$0) {
      if (this.gp() && $$0 == buq.bR) {
         return false;
      } else {
         return $$0 == buq.E ? false : super.a($$0);
      }
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("PlayerCreated", this.gp());
      this.a_($$0);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.y($$0.q("PlayerCreated"));
      this.a(this.dW(), $$0);
   }

   @Override
   public void c() {
      this.a(ca.a(this.ae));
   }

   @Override
   public void a(int $$0) {
      this.cb = $$0;
   }

   @Override
   public int a() {
      return this.cb;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cc = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cc;
   }

   private float gq() {
      return (float)this.h(bwn.c);
   }

   @Override
   public boolean c(arc $$0, buj $$1) {
      this.bY = 10;
      $$0.a(this, (byte)4);
      float $$2 = this.gq();
      float $$3 = (int)$$2 > 0 ? $$2 / 2.0F + (float)this.ae.a((int)$$2) : $$2;
      bsz $$4 = this.dX().b((bvf)this);
      boolean $$5 = $$1.a($$0, $$4, $$3);
      if ($$5) {
         double $$7 = $$1 instanceof bvf $$6 ? $$6.h(bwn.p) : 0.0;
         double $$8 = Math.max(0.0, 1.0 - $$7);
         $$1.h($$1.dz().b(0.0, 0.4F * $$8, 0.0));
         dcz.a($$0, $$1, $$4);
      }

      this.a(avz.nM, 1.0F, 1.0F);
      return $$5;
   }

   @Override
   public boolean a(arc $$0, bsz $$1, float $$2) {
      bug.a $$3 = this.p();
      boolean $$4 = super.a($$0, $$1, $$2);
      if ($$4 && this.p() != $$3) {
         this.a(avz.nN, 1.0F, 1.0F);
      }

      return $$4;
   }

   public bug.a p() {
      return bug.a.a(this.eE() / this.eS());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.bY = 10;
         this.a(avz.nM, 1.0F, 1.0F);
      } else if ($$0 == 11) {
         this.bZ = 400;
      } else if ($$0 == 34) {
         this.bZ = 0;
      } else {
         super.b($$0);
      }
   }

   public int t() {
      return this.bY;
   }

   public void x(boolean $$0) {
      if ($$0) {
         this.bZ = 400;
         this.dW().a(this, (byte)11);
      } else {
         this.bZ = 0;
         this.dW().a(this, (byte)34);
      }
   }

   @Override
   protected avy e(bsz $$0) {
      return avz.nP;
   }

   @Override
   protected avy o_() {
      return avz.nO;
   }

   @Override
   protected bsi b(cov $$0, bsh $$1) {
      cwn $$2 = $$0.b($$1);
      if (!$$2.a(cwr.pk)) {
         return bsi.e;
      } else {
         float $$3 = this.eE();
         this.c(25.0F);
         if (this.eE() == $$3) {
            return bsi.e;
         } else {
            float $$4 = 1.0F + (this.ae.i() - this.ae.i()) * 0.2F;
            this.a(avz.nQ, 1.0F, $$4);
            $$2.a(1, $$0);
            return bsi.a;
         }
      }
   }

   @Override
   protected void b(ji $$0, dwv $$1) {
      this.a(avz.nR, 1.0F, 1.0F);
   }

   public int x() {
      return this.bZ;
   }

   public boolean gp() {
      return (this.al.a(c) & 1) != 0;
   }

   public void y(boolean $$0) {
      byte $$1 = this.al.a(c);
      if ($$0) {
         this.al.a(c, (byte)($$1 | 1));
      } else {
         this.al.a(c, (byte)($$1 & -2));
      }
   }

   @Override
   public void a(bsz $$0) {
      super.a($$0);
   }

   @Override
   public boolean a(dgj $$0) {
      ji $$1 = this.dw();
      ji $$2 = $$1.e();
      dwv $$3 = $$0.a_($$2);
      if (!$$3.a($$0, $$2, this)) {
         return false;
      } else {
         for (int $$4 = 1; $$4 < 3; $$4++) {
            ji $$5 = $$1.b($$4);
            dwv $$6 = $$0.a_($$5);
            if (!dgr.a($$0, $$5, $$6, $$6.y(), buq.ap)) {
               return false;
            }
         }

         return dgr.a($$0, $$1, $$0.a_($$1), esy.a.g(), buq.ap) && $$0.f(this);
      }
   }

   @Override
   public fay cT() {
      return new fay(0.0, (double)(0.875F * this.cS()), (double)(this.dr() * 0.4F));
   }
}
