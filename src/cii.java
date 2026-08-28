import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cii extends cgz {
   public static final float bY = 0.6F;
   public static final float bZ = 32.5F;
   public static final int ca = 80;
   private static final double cf = 7.0;
   private static final double cg = 2.0;
   private static final ajy<cii.a> ch = akc.a(cii.class, aka.B);
   private long ci = 0L;
   public final bue cc = new bue();
   public final bue cd = new bue();
   public final bue ce = new bue();
   private int cj;
   private boolean ck = false;

   public cii(but<? extends cgz> $$0, dgj $$1) {
      super($$0, $$1);
      this.P().a(true);
      this.cj = this.gF();
   }

   @Nullable
   @Override
   public bud a(ard $$0, bud $$1) {
      return but.e.a($$0, bus.e);
   }

   public static bwp.a p() {
      return cgz.gx().a(bwq.s, 12.0).a(bwq.v, 0.14);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(ch, cii.a.a);
   }

   public boolean t() {
      return this.al.a(ch) != cii.a.a;
   }

   public boolean x() {
      return this.gt().a(this.ci);
   }

   public boolean gs() {
      return this.gt() == cii.a.b && this.ci > (long)cii.a.b.b();
   }

   public cii.a gt() {
      return this.al.a(ch);
   }

   @Override
   protected void ac() {
      super.ac();
      agd.a(this);
   }

   public void a(cii.a $$0) {
      this.al.a(ch, $$0);
   }

   @Override
   public void a(ajy<?> $$0) {
      if (ch.equals($$0)) {
         this.ci = 0L;
      }

      super.a($$0);
   }

   @Override
   protected bwk.b<cii> ec() {
      return cij.a();
   }

   @Override
   protected bwk<?> a(Dynamic<?> $$0) {
      return cij.a(this.ec().a($$0));
   }

   @Override
   protected void a(ard $$0) {
      bou $$1 = bot.a();
      $$1.a("armadilloBrain");
      ((bwk<cii>)this.bE).a($$0, this);
      $$1.c();
      $$1.a("armadilloActivityUpdate");
      cij.a(this);
      $$1.c();
      if (this.bL() && !this.e_() && --this.cj <= 0) {
         if (this.a($$0, evo.aJ, this::a)) {
            this.a(awa.ak, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            this.a(ebu.t);
         }

         this.cj = this.gF();
      }

      super.a($$0);
   }

   private int gF() {
      return this.ae.a(20 * bab.e * 5) + 20 * bab.e * 5;
   }

   @Override
   public void h() {
      super.h();
      if (this.dV().B_()) {
         this.gG();
      }

      if (this.t()) {
         this.ag();
      }

      this.ci++;
   }

   @Override
   public float ei() {
      return this.e_() ? 0.6F : 1.0F;
   }

   private void gG() {
      switch (this.gt()) {
         case a:
            this.cc.a();
            this.cd.a();
            this.ce.a();
            break;
         case b:
            this.cc.a();
            this.cd.b(this.af);
            this.ce.a();
            break;
         case c:
            this.cc.a();
            this.cd.a();
            if (this.ck) {
               this.ce.a();
               this.ck = false;
            }

            if (this.ci == 0L) {
               this.ce.a(this.af);
               this.ce.a(cii.a.c.b(), 1.0F);
            } else {
               this.ce.b(this.af);
            }
            break;
         case d:
            this.cc.b(this.af);
            this.cd.a();
            this.ce.a();
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 64 && this.dV().C) {
         this.ck = true;
         this.dV().a(this.dA(), this.dC(), this.dG(), awa.am, this.dm(), 1.0F, 1.0F, false);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean j(cwq $$0) {
      return $$0.a(awy.al);
   }

   public static boolean c(but<cii> $$0, dgk $$1, bus $$2, ji $$3, azh $$4) {
      return $$1.a_($$3.e()).a(awp.bZ) && a($$1, $$3);
   }

   public boolean j(bvi $$0) {
      if (!this.cR().c(7.0, 2.0, 7.0).c($$0.cR())) {
         return false;
      } else if ($$0.aq().a(awt.d)) {
         return true;
      } else if (this.ep() == $$0) {
         return true;
      } else if ($$0 instanceof coy $$1) {
         return $$1.Z_() ? false : $$1.cj() || $$1.bZ();
      } else {
         return false;
      }
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("state", this.gt().c());
      $$0.a("scute_time", this.cj);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.a(cii.a.a($$0.l("state")));
      if ($$0.e("scute_time")) {
         this.cj = $$0.h("scute_time");
      }
   }

   public void gu() {
      if (!this.t()) {
         this.X();
         this.gD();
         this.a(ebu.u);
         this.b(awa.ai);
         this.a(cii.a.b);
      }
   }

   public void gv() {
      if (this.t()) {
         this.a(ebu.u);
         this.b(awa.al);
         this.a(cii.a.a);
      }
   }

   @Override
   public boolean a(ard $$0, btc $$1, float $$2) {
      if (this.t()) {
         $$2 = ($$2 - 1.0F) / 2.0F;
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected void b(ard $$0, btc $$1, float $$2) {
      super.b($$0, $$1, $$2);
      if (!this.gf() && !this.eE()) {
         if ($$1.d() instanceof bvi) {
            this.eb().a(cem.G, true, 80L);
            if (this.gE()) {
               this.gu();
            }
         } else if ($$1.a(awr.G)) {
            this.gv();
         }
      }
   }

   @Override
   public bsl b(coy $$0, bsk $$1) {
      cwq $$2 = $$0.b($$1);
      if ($$2.a(cwu.yv) && this.gw()) {
         $$2.a(16, $$0, d($$1));
         return bsl.a;
      } else {
         return (bsl)(this.t() ? bsl.d : super.b($$0, $$1));
      }
   }

   public boolean gw() {
      if (this.e_()) {
         return false;
      } else {
         if (this.dV() instanceof ard $$0) {
            this.a($$0, new cwq(cwu.oV));
            this.a(ebu.r);
            this.a(awa.ao);
         }

         return true;
      }
   }

   public boolean gE() {
      return !this.gp() && !this.bn() && !this.P_() && !this.bZ() && !this.ca();
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
   protected avz o_() {
      return awa.ah;
   }

   @Override
   protected avz e(btc $$0) {
      return this.t() ? awa.ae : awa.ad;
   }

   @Override
   protected void b(ji $$0, dwy $$1) {
      this.a(awa.ag, 0.15F, 1.0F);
   }

   @Override
   public int af() {
      return this.t() ? 0 : 32;
   }

   @Override
   protected cbe J() {
      return new cbe(this) {
         @Override
         public void a() {
            if (!cii.this.t()) {
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

      private static final azv.a<cii.a> f = azv.a(cii.a::values);
      private static final IntFunction<cii.a> g = axq.a(cii.a::d, values(), axq.a.a);
      public static final yn<ByteBuf, cii.a> e = yl.a(g, cii.a::d);
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

      public static cii.a a(String $$0) {
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
