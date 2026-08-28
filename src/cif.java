import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cif extends cgw {
   public static final float bY = 0.6F;
   public static final float bZ = 32.5F;
   public static final int ca = 80;
   private static final double cf = 7.0;
   private static final double cg = 2.0;
   private static final ajx<cif.a> ch = akb.a(cif.class, ajz.B);
   private long ci = 0L;
   public final bub cc = new bub();
   public final bub cd = new bub();
   public final bub ce = new bub();
   private int cj;
   private boolean ck = false;

   public cif(buq<? extends cgw> $$0, dgg $$1) {
      super($$0, $$1);
      this.L().a(true);
      this.cj = this.gC();
   }

   @Nullable
   @Override
   public bua a(arc $$0, bua $$1) {
      return buq.e.a($$0, bup.e);
   }

   public static bwm.a p() {
      return cgw.gu().a(bwn.s, 12.0).a(bwn.v, 0.14);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(ch, cif.a.a);
   }

   public boolean t() {
      return this.al.a(ch) != cif.a.a;
   }

   public boolean x() {
      return this.gq().a(this.ci);
   }

   public boolean gp() {
      return this.gq() == cif.a.b && this.ci > (long)cif.a.b.b();
   }

   public cif.a gq() {
      return this.al.a(ch);
   }

   @Override
   protected void Z() {
      super.Z();
      agc.a(this);
   }

   public void a(cif.a $$0) {
      this.al.a(ch, $$0);
   }

   @Override
   public void a(ajx<?> $$0) {
      if (ch.equals($$0)) {
         this.ci = 0L;
      }

      super.a($$0);
   }

   @Override
   protected bwh.b<cif> ed() {
      return cig.a();
   }

   @Override
   protected bwh<?> a(Dynamic<?> $$0) {
      return cig.a(this.ed().a($$0));
   }

   @Override
   protected void a(arc $$0) {
      bor $$1 = boq.a();
      $$1.a("armadilloBrain");
      ((bwh<cif>)this.bE).a($$0, this);
      $$1.c();
      $$1.a("armadilloActivityUpdate");
      cig.a(this);
      $$1.c();
      if (this.bL() && !this.e_() && --this.cj <= 0) {
         if (this.a($$0, evl.aJ, this::a)) {
            this.a(avz.ak, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            this.a(ebr.t);
         }

         this.cj = this.gC();
      }

      super.a($$0);
   }

   private int gC() {
      return this.ae.a(20 * baa.e * 5) + 20 * baa.e * 5;
   }

   @Override
   public void h() {
      super.h();
      if (this.dW().B_()) {
         this.gD();
      }

      if (this.t()) {
         this.ac();
      }

      this.ci++;
   }

   @Override
   public float ej() {
      return this.e_() ? 0.6F : 1.0F;
   }

   private void gD() {
      switch (this.gq()) {
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
               this.ce.a(cif.a.c.b(), 1.0F);
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
      if ($$0 == 64 && this.dW().C) {
         this.ck = true;
         this.dW().a(this.dB(), this.dD(), this.dH(), avz.am, this.dn(), 1.0F, 1.0F, false);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean j(cwn $$0) {
      return $$0.a(awx.al);
   }

   public static boolean c(buq<cif> $$0, dgh $$1, bup $$2, ji $$3, azg $$4) {
      return $$1.a_($$3.e()).a(awo.bZ) && a($$1, $$3);
   }

   public boolean j(bvf $$0) {
      if (!this.cR().c(7.0, 2.0, 7.0).c($$0.cR())) {
         return false;
      } else if ($$0.aq().a(aws.d)) {
         return true;
      } else if (this.eq() == $$0) {
         return true;
      } else if ($$0 instanceof cov $$1) {
         return $$1.Z_() ? false : $$1.cj() || $$1.bZ();
      } else {
         return false;
      }
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("state", this.gq().c());
      $$0.a("scute_time", this.cj);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.a(cif.a.a($$0.l("state")));
      if ($$0.e("scute_time")) {
         this.cj = $$0.h("scute_time");
      }
   }

   public void gr() {
      if (!this.t()) {
         this.U();
         this.gA();
         this.a(ebr.u);
         this.b(avz.ai);
         this.a(cif.a.b);
      }
   }

   public void gs() {
      if (this.t()) {
         this.a(ebr.u);
         this.b(avz.al);
         this.a(cif.a.a);
      }
   }

   @Override
   public boolean a(arc $$0, bsz $$1, float $$2) {
      if (this.t()) {
         $$2 = ($$2 - 1.0F) / 2.0F;
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected void b(arc $$0, bsz $$1, float $$2) {
      super.b($$0, $$1, $$2);
      if (!this.gc() && !this.eF()) {
         if ($$1.d() instanceof bvf) {
            this.ec().a(cej.G, true, 80L);
            if (this.gB()) {
               this.gr();
            }
         } else if ($$1.a(awq.G)) {
            this.gs();
         }
      }
   }

   @Override
   public bsi b(cov $$0, bsh $$1) {
      cwn $$2 = $$0.b($$1);
      if ($$2.a(cwr.yv) && this.gt()) {
         $$2.a(16, $$0, d($$1));
         return bsi.a;
      } else {
         return (bsi)(this.t() ? bsi.d : super.b($$0, $$1));
      }
   }

   public boolean gt() {
      if (this.e_()) {
         return false;
      } else {
         if (this.dW() instanceof arc $$0) {
            this.a($$0, new cwn(cwr.oV));
            this.a(ebr.r);
            this.a(avz.ao);
         }

         return true;
      }
   }

   public boolean gB() {
      return !this.gm() && !this.bn() && !this.P_() && !this.bZ() && !this.ca();
   }

   @Override
   public boolean gw() {
      return super.gw() && !this.t();
   }

   @Override
   protected avy u() {
      return this.t() ? null : avz.af;
   }

   @Override
   protected void gv() {
      this.b(avz.ac);
   }

   @Override
   protected avy o_() {
      return avz.ah;
   }

   @Override
   protected avy e(bsz $$0) {
      return this.t() ? avz.ae : avz.ad;
   }

   @Override
   protected void b(ji $$0, dwv $$1) {
      this.a(avz.ag, 0.15F, 1.0F);
   }

   @Override
   public int ab() {
      return this.t() ? 0 : 32;
   }

   @Override
   protected cbb G() {
      return new cbb(this) {
         @Override
         public void a() {
            if (!cif.this.t()) {
               super.a();
            }
         }
      };
   }

   public static enum a implements azu {
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

      private static final azu.a<cif.a> f = azu.a(cif.a::values);
      private static final IntFunction<cif.a> g = axp.a(cif.a::d, values(), axp.a.a);
      public static final ym<ByteBuf, cif.a> e = yk.a(g, cif.a::d);
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

      public static cif.a a(String $$0) {
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
