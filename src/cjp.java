import java.util.UUID;
import javax.annotation.Nullable;

public class cjp extends ciw implements bxo {
   protected static final akj<Byte> c = akn.a(cjp.class, akl.a);
   private static final int d = 25;
   private int bG;
   private int bH;
   private static final btr bI = baq.a(20, 39);
   private int bJ;
   @Nullable
   private UUID bK;

   public cjp(bwr<? extends cjp> $$0, djm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bD.a(1, new cep(this, 1.0, true));
      this.bD.a(2, new ceu(this, 0.9, 32.0F));
      this.bD.a(2, new ceq(this, 0.6, false));
      this.bD.a(4, new ceh(this, 0.6));
      this.bD.a(5, new cew(this));
      this.bD.a(7, new cen(this, crm.class, 6.0F));
      this.bD.a(8, new cfa(this));
      this.bE.a(1, new cfw(this));
      this.bE.a(2, new cfx(this));
      this.bE.a(3, new cfy<>(this, crm.class, 10, true, false, this::a));
      this.bE.a(3, new cfy<>(this, bxl.class, 5, false, false, ($$0, $$1) -> $$0 instanceof cof && !($$0 instanceof cnz)));
      this.bE.a(4, new cge<>(this, false));
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(c, (byte)0);
   }

   public static byo.a j() {
      return bxl.E().a(byp.s, 100.0).a(byp.v, 0.25).a(byp.p, 1.0).a(byp.c, 15.0).a(byp.B, 1.0);
   }

   @Override
   protected int l(int $$0) {
      return $$0;
   }

   @Override
   protected void D(bwi $$0) {
      if ($$0 instanceof cof && !($$0 instanceof cnz) && this.dX().a(20) == 0) {
         this.g((bxj)$$0);
      }

      super.D($$0);
   }

   @Override
   public void k_() {
      super.k_();
      if (this.bG > 0) {
         this.bG--;
      }

      if (this.bH > 0) {
         this.bH--;
      }

      if (!this.dU().C) {
         this.a((arq)this.dU(), true);
      }
   }

   @Override
   public boolean bs() {
      return this.dx().j() > 2.5000003E-7F && this.ae.a(5) == 0;
   }

   @Override
   public boolean a(bwr<?> $$0) {
      if (this.t() && $$0 == bwr.bS) {
         return false;
      } else {
         return $$0 == bwr.E ? false : super.a($$0);
      }
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("PlayerCreated", this.t());
      this.a_($$0);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.x($$0.o("PlayerCreated"));
      this.a(this.dU(), $$0);
   }

   @Override
   public void c() {
      this.a(bI.a(this.ae));
   }

   @Override
   public void a(int $$0) {
      this.bJ = $$0;
   }

   @Override
   public int a() {
      return this.bJ;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.bK = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.bK;
   }

   private float x() {
      return (float)this.h(byp.c);
   }

   @Override
   public boolean c(arq $$0, bwi $$1) {
      this.bG = 10;
      $$0.a(this, (byte)4);
      float $$2 = this.x();
      float $$3 = (int)$$2 > 0 ? $$2 / 2.0F + (float)this.ae.a((int)$$2) : $$2;
      bux $$4 = this.dV().b((bxj)this);
      boolean $$5 = $$1.a($$0, $$4, $$3);
      if ($$5) {
         double $$7 = $$1 instanceof bxj $$6 ? $$6.h(byp.p) : 0.0;
         double $$8 = Math.max(0.0, 1.0 - $$7);
         $$1.i($$1.dx().b(0.0, 0.4F * $$8, 0.0));
         dgc.a($$0, $$1, $$4);
      }

      this.a(awn.nV, 1.0F, 1.0F);
      return $$5;
   }

   @Override
   public boolean a(arq $$0, bux $$1, float $$2) {
      bwe.a $$3 = this.m();
      boolean $$4 = super.a($$0, $$1, $$2);
      if ($$4 && this.m() != $$3) {
         this.a(awn.nW, 1.0F, 1.0F);
      }

      return $$4;
   }

   public bwe.a m() {
      return bwe.a.a(this.eF() / this.eT());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.bG = 10;
         this.a(awn.nV, 1.0F, 1.0F);
      } else if ($$0 == 11) {
         this.bH = 400;
      } else if ($$0 == 34) {
         this.bH = 0;
      } else {
         super.b($$0);
      }
   }

   public int n() {
      return this.bG;
   }

   public void w(boolean $$0) {
      if ($$0) {
         this.bH = 400;
         this.dU().a(this, (byte)11);
      } else {
         this.bH = 0;
         this.dU().a(this, (byte)34);
      }
   }

   @Override
   protected awm e(bux $$0) {
      return awn.nY;
   }

   @Override
   protected awm l_() {
      return awn.nX;
   }

   @Override
   protected bug b(crm $$0, buf $$1) {
      czn $$2 = $$0.b($$1);
      if (!$$2.a(czr.pt)) {
         return bug.e;
      } else {
         float $$3 = this.eF();
         this.c(25.0F);
         if (this.eF() == $$3) {
            return bug.e;
         } else {
            float $$4 = 1.0F + (this.ae.i() - this.ae.i()) * 0.2F;
            this.a(awn.nZ, 1.0F, $$4);
            $$2.a(1, $$0);
            return bug.a;
         }
      }
   }

   @Override
   protected void b(iv $$0, eat $$1) {
      this.a(awn.oa, 1.0F, 1.0F);
   }

   public int q() {
      return this.bH;
   }

   public boolean t() {
      return (this.al.a(c) & 1) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.al.a(c);
      if ($$0) {
         this.al.a(c, (byte)($$1 | 1));
      } else {
         this.al.a(c, (byte)($$1 & -2));
      }
   }

   @Override
   public void a(bux $$0) {
      super.a($$0);
   }

   @Override
   public boolean a(djp $$0) {
      iv $$1 = this.du();
      iv $$2 = $$1.e();
      eat $$3 = $$0.a_($$2);
      if (!$$3.b($$0, $$2, this)) {
         return false;
      } else {
         for (int $$4 = 1; $$4 < 3; $$4++) {
            iv $$5 = $$1.b($$4);
            eat $$6 = $$0.a_($$5);
            if (!djx.a($$0, $$5, $$6, $$6.y(), bwr.ap)) {
               return false;
            }
         }

         return djx.a($$0, $$1, $$0.a_($$1), exb.a.g(), bwr.ap) && $$0.f(this);
      }
   }

   @Override
   public ffc cS() {
      return new ffc(0.0, (double)(0.875F * this.cR()), (double)(this.dp() * 0.4F));
   }
}
