import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cix extends cho {
   public static final float bZ = 0.6F;
   public static final float ca = 32.5F;
   public static final int cb = 80;
   private static final double cg = 7.0;
   private static final double ch = 2.0;
   private static final aks<cix.a> ci = akw.a(cix.class, aku.B);
   private long cj = 0L;
   public final but cd = new but();
   public final but ce = new but();
   public final but cf = new but();
   private int ck;
   private boolean cl = false;

   public cix(bvi<? extends cho> $$0, dgz $$1) {
      super($$0, $$1);
      this.L().a(true);
      this.ck = this.gB();
   }

   @Nullable
   @Override
   public bus a(arx $$0, bus $$1) {
      return bvi.e.a($$0, bvh.e);
   }

   public static bxe.a p() {
      return cho.gt().a(bxf.s, 12.0).a(bxf.v, 0.14);
   }

   @Override
   protected void a(akw.a $$0) {
      super.a($$0);
      $$0.a(ci, cix.a.a);
   }

   public boolean t() {
      return this.al.a(ci) != cix.a.a;
   }

   public boolean x() {
      return this.gp().a(this.cj);
   }

   public boolean go() {
      return this.gp() == cix.a.b && this.cj > (long)cix.a.b.b();
   }

   public cix.a gp() {
      return this.al.a(ci);
   }

   @Override
   protected void Y() {
      super.Y();
      agy.a(this);
   }

   public void a(cix.a $$0) {
      this.al.a(ci, $$0);
   }

   @Override
   public void a(aks<?> $$0) {
      if (ci.equals($$0)) {
         this.cj = 0L;
      }

      super.a($$0);
   }

   @Override
   protected bwz.b<cix> ed() {
      return ciy.a();
   }

   @Override
   protected bwz<?> a(Dynamic<?> $$0) {
      return ciy.a(this.ed().a($$0));
   }

   @Override
   protected void a(arx $$0) {
      bpj $$1 = bpi.a();
      $$1.a("armadilloBrain");
      ((bwz<cix>)this.bF).a($$0, this);
      $$1.c();
      $$1.a("armadilloActivityUpdate");
      ciy.a(this);
      $$1.c();
      if (this.bL() && !this.e_() && --this.ck <= 0) {
         if (this.a($$0, ewe.aJ, this::a)) {
            this.a(awv.ak, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            this.a(eck.t);
         }

         this.ck = this.gB();
      }

      super.a($$0);
   }

   private int gB() {
      return this.ae.a(20 * baw.e * 5) + 20 * baw.e * 5;
   }

   @Override
   public void h() {
      super.h();
      if (this.dW().B_()) {
         this.gC();
      }

      if (this.t()) {
         this.ab();
      }

      this.cj++;
   }

   @Override
   public float ej() {
      return this.e_() ? 0.6F : 1.0F;
   }

   private void gC() {
      switch (this.gp()) {
         case a:
            this.cd.a();
            this.ce.a();
            this.cf.a();
            break;
         case b:
            this.cd.a();
            this.ce.b(this.af);
            this.cf.a();
            break;
         case c:
            this.cd.a();
            this.ce.a();
            if (this.cl) {
               this.cf.a();
               this.cl = false;
            }

            if (this.cj == 0L) {
               this.cf.a(this.af);
               this.cf.a(cix.a.c.b(), 1.0F);
            } else {
               this.cf.b(this.af);
            }
            break;
         case d:
            this.cd.b(this.af);
            this.ce.a();
            this.cf.a();
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 64 && this.dW().C) {
         this.cl = true;
         this.dW().a(this.dB(), this.dD(), this.dH(), awv.am, this.dn(), 1.0F, 1.0F, false);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean j(cxg $$0) {
      return $$0.a(axt.an);
   }

   public static boolean c(bvi<cix> $$0, dha $$1, bvh $$2, jh $$3, bac $$4) {
      return $$1.a_($$3.e()).a(axk.bZ) && a($$1, $$3);
   }

   public boolean j(bvx $$0) {
      if (!this.cR().c(7.0, 2.0, 7.0).c($$0.cR())) {
         return false;
      } else if ($$0.aq().a(axo.d)) {
         return true;
      } else if (this.eq() == $$0) {
         return true;
      } else if ($$0 instanceof cpo $$1) {
         return $$1.aa_() ? false : $$1.cj() || $$1.bZ();
      } else {
         return false;
      }
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      $$0.a("state", this.gp().c());
      $$0.a("scute_time", this.ck);
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      this.a(cix.a.a($$0.l("state")));
      if ($$0.e("scute_time")) {
         this.ck = $$0.h("scute_time");
      }
   }

   public void gq() {
      if (!this.t()) {
         this.U();
         this.gz();
         this.a(eck.u);
         this.b(awv.ai);
         this.a(cix.a.b);
      }
   }

   public void gr() {
      if (this.t()) {
         this.a(eck.u);
         this.b(awv.al);
         this.a(cix.a.a);
      }
   }

   @Override
   public boolean a(arx $$0, btr $$1, float $$2) {
      if (this.t()) {
         $$2 = ($$2 - 1.0F) / 2.0F;
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected void b(arx $$0, btr $$1, float $$2) {
      super.b($$0, $$1, $$2);
      if (!this.gb() && !this.eF()) {
         if ($$1.d() instanceof bvx) {
            this.ec().a(cfb.G, true, 80L);
            if (this.gA()) {
               this.gq();
            }
         } else if ($$1.a(axm.G)) {
            this.gr();
         }
      }
   }

   @Override
   public bta b(cpo $$0, bsz $$1) {
      cxg $$2 = $$0.b($$1);
      if ($$2.a(cxk.yv) && this.gs()) {
         $$2.a(16, $$0, d($$1));
         return bta.a;
      } else {
         return (bta)(this.t() ? bta.d : super.b($$0, $$1));
      }
   }

   public boolean gs() {
      if (this.e_()) {
         return false;
      } else {
         if (this.dW() instanceof arx $$0) {
            this.a($$0, new cxg(cxk.oV));
            this.a(eck.r);
            this.a(awv.ao);
         }

         return true;
      }
   }

   public boolean gA() {
      return !this.gl() && !this.bn() && !this.P_() && !this.bZ() && !this.ca();
   }

   @Override
   public boolean gv() {
      return super.gv() && !this.t();
   }

   @Override
   protected awu u() {
      return this.t() ? null : awv.af;
   }

   @Override
   protected void gu() {
      this.b(awv.ac);
   }

   @Override
   protected awu o_() {
      return awv.ah;
   }

   @Override
   protected awu e(btr $$0) {
      return this.t() ? awv.ae : awv.ad;
   }

   @Override
   protected void b(jh $$0, dxo $$1) {
      this.a(awv.ag, 0.15F, 1.0F);
   }

   @Override
   public int aa() {
      return this.t() ? 0 : 32;
   }

   @Override
   protected cbt G() {
      return new cbt(this) {
         @Override
         public void a() {
            if (!cix.this.t()) {
               super.a();
            }
         }
      };
   }

   public static enum a implements baq {
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

      private static final baq.a<cix.a> f = baq.a(cix.a::values);
      private static final IntFunction<cix.a> g = ayl.a(cix.a::d, values(), ayl.a.a);
      public static final zi<ByteBuf, cix.a> e = zg.a(g, cix.a::d);
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

      public static cix.a a(String $$0) {
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
