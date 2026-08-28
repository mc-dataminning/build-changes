import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cjb extends chp {
   public static final float bF = 0.6F;
   public static final float bG = 32.5F;
   public static final int bH = 80;
   private static final double bM = 7.0;
   private static final double bN = 2.0;
   private static final ajx<cjb.a> bO = akb.a(cjb.class, ajz.C);
   private long bP = 0L;
   public final bur bJ = new bur();
   public final bur bK = new bur();
   public final bur bL = new bur();
   private int bQ;
   private boolean bR = false;

   public cjb(bvi<? extends chp> $$0, dgz $$1) {
      super($$0, $$1);
      this.O().a(true);
      this.bQ = this.gF();
   }

   @Nullable
   @Override
   public buq a(ard $$0, buq $$1) {
      return bvi.e.a($$0, bvh.e);
   }

   public static bxf.a q() {
      return chp.gx().a(bxg.s, 12.0).a(bxg.v, 0.14);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(bO, cjb.a.a);
   }

   public boolean t() {
      return this.al.a(bO) != cjb.a.a;
   }

   public boolean x() {
      return this.gt().a(this.bP);
   }

   public boolean gs() {
      return this.gt() == cjb.a.b && this.bP > (long)cjb.a.b.b();
   }

   public cjb.a gt() {
      return this.al.a(bO);
   }

   @Override
   protected void ab() {
      super.ab();
      agc.a(this);
   }

   public void a(cjb.a $$0) {
      this.al.a(bO, $$0);
   }

   @Override
   public void a(ajx<?> $$0) {
      if (bO.equals($$0)) {
         this.bP = 0L;
      }

      super.a($$0);
   }

   @Override
   protected bxa.b<cjb> eb() {
      return cjc.a();
   }

   @Override
   protected bxa<?> a(Dynamic<?> $$0) {
      return cjc.a(this.eb().a($$0));
   }

   @Override
   protected void a(ard $$0) {
      bpj $$1 = bpi.a();
      $$1.a("armadilloBrain");
      ((bxa<cjb>)this.bs).a($$0, this);
      $$1.c();
      $$1.a("armadilloActivityUpdate");
      cjc.a(this);
      $$1.c();
      if (this.bJ() && !this.n_() && --this.bQ <= 0) {
         if (this.a($$0, ewk.aJ, this::a)) {
            this.a(awa.ak, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            this.a(ecp.t);
         }

         this.bQ = this.gF();
      }

      super.a($$0);
   }

   private int gF() {
      return this.ae.a(20 * bab.e * 5) + 20 * bab.e * 5;
   }

   @Override
   public void h() {
      super.h();
      if (this.dU().w_()) {
         this.gG();
      }

      if (this.t()) {
         this.af();
      }

      this.bP++;
   }

   @Override
   public float ei() {
      return this.n_() ? 0.6F : 1.0F;
   }

   private void gG() {
      switch (this.gt()) {
         case a:
            this.bJ.a();
            this.bK.a();
            this.bL.a();
            break;
         case b:
            this.bJ.a();
            this.bK.b(this.af);
            this.bL.a();
            break;
         case c:
            this.bJ.a();
            this.bK.a();
            if (this.bR) {
               this.bL.a();
               this.bR = false;
            }

            if (this.bP == 0L) {
               this.bL.a(this.af);
               this.bL.a(cjb.a.c.b(), 1.0F);
            } else {
               this.bL.b(this.af);
            }
            break;
         case d:
            this.bJ.b(this.af);
            this.bK.a();
            this.bL.a();
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 64 && this.dU().C) {
         this.bR = true;
         this.dU().a(this.dz(), this.dB(), this.dF(), awa.am, this.dl(), 1.0F, 1.0F, false);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean j(cxh $$0) {
      return $$0.a(awy.al);
   }

   public static boolean c(bvi<cjb> $$0, dha $$1, bvh $$2, ji $$3, azh $$4) {
      return $$1.a_($$3.e()).a(awp.ca) && a($$1, $$3);
   }

   public boolean j(bvy $$0) {
      if (!this.cQ().c(7.0, 2.0, 7.0).c($$0.cQ())) {
         return false;
      } else if ($$0.aq().a(awt.d)) {
         return true;
      } else if (this.ep() == $$0) {
         return true;
      } else if ($$0 instanceof cpr $$1) {
         return $$1.U_() ? false : $$1.ci() || $$1.bY();
      } else {
         return false;
      }
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("state", this.gt().c());
      $$0.a("scute_time", this.bQ);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.a(cjb.a.a($$0.l("state")));
      if ($$0.e("scute_time")) {
         this.bQ = $$0.h("scute_time");
      }
   }

   public void gu() {
      if (!this.t()) {
         this.W();
         this.gD();
         this.a(ecp.u);
         this.b(awa.ai);
         this.a(cjb.a.b);
      }
   }

   public void gv() {
      if (this.t()) {
         this.a(ecp.u);
         this.b(awa.al);
         this.a(cjb.a.a);
      }
   }

   @Override
   public boolean a(ard $$0, btp $$1, float $$2) {
      if (this.t()) {
         $$2 = ($$2 - 1.0F) / 2.0F;
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected void b(ard $$0, btp $$1, float $$2) {
      super.b($$0, $$1, $$2);
      if (!this.gh() && !this.eF()) {
         if ($$1.d() instanceof bvy) {
            this.ea().a(cfc.G, true, 80L);
            if (this.gE()) {
               this.gu();
            }
         } else if ($$1.a(awr.G)) {
            this.gv();
         }
      }
   }

   @Override
   public bsy b(cpr $$0, bsx $$1) {
      cxh $$2 = $$0.b($$1);
      if ($$2.a(cxl.yx) && this.gw()) {
         $$2.a(16, $$0, d($$1));
         return bsy.a;
      } else {
         return (bsy)(this.t() ? bsy.d : super.b($$0, $$1));
      }
   }

   public boolean gw() {
      if (this.n_()) {
         return false;
      } else {
         if (this.dU() instanceof ard $$0) {
            this.a($$0, new cxh(cxl.oX));
            this.a(ecp.r);
            this.a(awa.ao);
         }

         return true;
      }
   }

   public boolean gE() {
      return !this.gp() && !this.bl() && !this.O_() && !this.bY() && !this.bZ();
   }

   @Override
   public boolean gz() {
      return super.gz() && !this.t();
   }

   @Override
   protected avz u() {
      return this.t() ? null : awa.af;
   }

   @Override
   protected void gy() {
      this.b(awa.ac);
   }

   @Override
   protected avz l_() {
      return awa.ah;
   }

   @Override
   protected avz e(btp $$0) {
      return this.t() ? awa.ae : awa.ad;
   }

   @Override
   protected void b(ji $$0, dxq $$1) {
      this.a(awa.ag, 0.15F, 1.0F);
   }

   @Override
   public int ad() {
      return this.t() ? 0 : 32;
   }

   @Override
   protected cbu I() {
      return new cbu(this) {
         @Override
         public void a() {
            if (!cjb.this.t()) {
               super.a();
            }
         }
      };
   }

   public static enum a implements azv {
      a("idle", false, 0, 0) {
         @Override
         public boolean a(long $$0) {
            return false;
         }
      },
      b("rolling", true, 10, 1) {
         @Override
         public boolean a(long $$0) {
            return $$0 > 5L;
         }
      },
      c("scared", true, 50, 2) {
         @Override
         public boolean a(long $$0) {
            return true;
         }
      },
      d("unrolling", true, 30, 3) {
         @Override
         public boolean a(long $$0) {
            return $$0 < 26L;
         }
      };

      private static final azv.a<cjb.a> f = azv.a(cjb.a::values);
      private static final IntFunction<cjb.a> g = axq.a(cjb.a::d, values(), axq.a.a);
      public static final yn<ByteBuf, cjb.a> e = yl.a(g, cjb.a::d);
      private final String h;
      private final boolean i;
      private final int j;
      private final int k;

      a(final String $$0, final boolean $$1, final int $$2, final int $$3) {
         this.h = $$0;
         this.i = $$1;
         this.j = $$2;
         this.k = $$3;
      }

      public static cjb.a a(String $$0) {
         return f.a($$0, a);
      }

      @Override
      public String c() {
         return this.h;
      }

      private int d() {
         return this.k;
      }

      public abstract boolean a(long var1);

      public boolean a() {
         return this.i;
      }

      public int b() {
         return this.j;
      }
   }
}
