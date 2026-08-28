import java.util.UUID;
import javax.annotation.Nullable;

public class cjk extends cir implements bxj {
   protected static final akj<Byte> c = akn.a(cjk.class, akl.a);
   private static final int d = 25;
   private int bG;
   private int bH;
   private static final bto bI = baq.a(20, 39);
   private int bJ;
   @Nullable
   private UUID bK;

   public cjk(bwo<? extends cjk> $$0, dja $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bD.a(1, new cek(this, 1.0, true));
      this.bD.a(2, new cep(this, 0.9, 32.0F));
      this.bD.a(2, new cel(this, 0.6, false));
      this.bD.a(4, new cec(this, 0.6));
      this.bD.a(5, new cer(this));
      this.bD.a(7, new cei(this, crc.class, 6.0F));
      this.bD.a(8, new cev(this));
      this.bE.a(1, new cfr(this));
      this.bE.a(2, new cfs(this));
      this.bE.a(3, new cft<>(this, crc.class, 10, true, false, this::a));
      this.bE.a(3, new cft<>(this, bxg.class, 5, false, false, ($$0, $$1) -> $$0 instanceof cnv && !($$0 instanceof cnp)));
      this.bE.a(4, new cfz<>(this, false));
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(c, (byte)0);
   }

   public static byj.a j() {
      return bxg.E().a(byk.s, 100.0).a(byk.v, 0.25).a(byk.p, 1.0).a(byk.c, 15.0).a(byk.B, 1.0);
   }

   @Override
   protected int l(int $$0) {
      return $$0;
   }

   @Override
   protected void D(bwf $$0) {
      if ($$0 instanceof cnv && !($$0 instanceof cnp) && this.dY().a(20) == 0) {
         this.g((bxe)$$0);
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

      if (!this.dV().C) {
         this.a((arq)this.dV(), true);
      }
   }

   @Override
   public boolean bu() {
      return this.dy().j() > 2.5000003E-7F && this.ae.a(5) == 0;
   }

   @Override
   public boolean a(bwo<?> $$0) {
      if (this.t() && $$0 == bwo.bS) {
         return false;
      } else {
         return $$0 == bwo.E ? false : super.a($$0);
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
      this.x($$0.q("PlayerCreated"));
      this.a(this.dV(), $$0);
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
      return (float)this.h(byk.c);
   }

   @Override
   public boolean c(arq $$0, bwf $$1) {
      this.bG = 10;
      $$0.a(this, (byte)4);
      float $$2 = this.x();
      float $$3 = (int)$$2 > 0 ? $$2 / 2.0F + (float)this.ae.a((int)$$2) : $$2;
      buu $$4 = this.dW().b((bxe)this);
      boolean $$5 = $$1.a($$0, $$4, $$3);
      if ($$5) {
         double $$7 = $$1 instanceof bxe $$6 ? $$6.h(byk.p) : 0.0;
         double $$8 = Math.max(0.0, 1.0 - $$7);
         $$1.i($$1.dy().b(0.0, 0.4F * $$8, 0.0));
         dfs.a($$0, $$1, $$4);
      }

      this.a(awn.nV, 1.0F, 1.0F);
      return $$5;
   }

   @Override
   public boolean a(arq $$0, buu $$1, float $$2) {
      bwb.a $$3 = this.m();
      boolean $$4 = super.a($$0, $$1, $$2);
      if ($$4 && this.m() != $$3) {
         this.a(awn.nW, 1.0F, 1.0F);
      }

      return $$4;
   }

   public bwb.a m() {
      return bwb.a.a(this.eG() / this.eU());
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
         this.dV().a(this, (byte)11);
      } else {
         this.bH = 0;
         this.dV().a(this, (byte)34);
      }
   }

   @Override
   protected awm e(buu $$0) {
      return awn.nY;
   }

   @Override
   protected awm l_() {
      return awn.nX;
   }

   @Override
   protected bud b(crc $$0, buc $$1) {
      czd $$2 = $$0.b($$1);
      if (!$$2.a(czh.pt)) {
         return bud.e;
      } else {
         float $$3 = this.eG();
         this.c(25.0F);
         if (this.eG() == $$3) {
            return bud.e;
         } else {
            float $$4 = 1.0F + (this.ae.i() - this.ae.i()) * 0.2F;
            this.a(awn.nZ, 1.0F, $$4);
            $$2.a(1, $$0);
            return bud.a;
         }
      }
   }

   @Override
   protected void b(iu $$0, eah $$1) {
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
   public void a(buu $$0) {
      super.a($$0);
   }

   @Override
   public boolean a(djd $$0) {
      iu $$1 = this.dv();
      iu $$2 = $$1.e();
      eah $$3 = $$0.a_($$2);
      if (!$$3.b($$0, $$2, this)) {
         return false;
      } else {
         for (int $$4 = 1; $$4 < 3; $$4++) {
            iu $$5 = $$1.b($$4);
            eah $$6 = $$0.a_($$5);
            if (!djl.a($$0, $$5, $$6, $$6.y(), bwo.ap)) {
               return false;
            }
         }

         return djl.a($$0, $$1, $$0.a_($$1), ewp.a.g(), bwo.ap) && $$0.f(this);
      }
   }

   @Override
   public feq cT() {
      return new feq(0.0, (double)(0.875F * this.cS()), (double)(this.dq() * 0.4F));
   }
}
