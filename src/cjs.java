import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cjs extends cig {
   public static final float bE = 0.6F;
   public static final float bF = 32.5F;
   public static final int bG = 80;
   private static final double bL = 7.0;
   private static final double bM = 2.0;
   private static final akg<cjs.a> bN = akk.a(cjs.class, aki.C);
   private long bO = 0L;
   public final bvj bI = new bvj();
   public final bvj bJ = new bvj();
   public final bvj bK = new bvj();
   private int bP;
   private boolean bQ = false;

   public cjs(bwb<? extends cig> $$0, dhp $$1) {
      super($$0, $$1);
      this.O().a(true);
      this.bP = this.gD();
   }

   @Nullable
   @Override
   public bvi a(arn $$0, bvi $$1) {
      return bwb.e.a($$0, bwa.e);
   }

   public static bxw.a q() {
      return cig.gv().a(bxx.s, 12.0).a(bxx.v, 0.14);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bN, cjs.a.a);
   }

   public boolean t() {
      return this.al.a(bN) != cjs.a.a;
   }

   public boolean x() {
      return this.gr().a(this.bO);
   }

   public boolean gq() {
      return this.gr() == cjs.a.b && this.bO > (long)cjs.a.b.b();
   }

   public cjs.a gr() {
      return this.al.a(bN);
   }

   @Override
   protected void ab() {
      super.ab();
      agj.a(this);
   }

   public void a(cjs.a $$0) {
      this.al.a(bN, $$0);
   }

   @Override
   public void a(akg<?> $$0) {
      if (bN.equals($$0)) {
         this.bO = 0L;
      }

      super.a($$0);
   }

   @Override
   protected bxr.b<cjs> ec() {
      return cjt.a();
   }

   @Override
   protected bxr<?> a(Dynamic<?> $$0) {
      return cjt.a(this.ec().a($$0));
   }

   @Override
   protected void a(arn $$0) {
      bqb $$1 = bqa.a();
      $$1.a("armadilloBrain");
      ((bxr<cjs>)this.br).a($$0, this);
      $$1.c();
      $$1.a("armadilloActivityUpdate");
      cjt.a(this);
      $$1.c();
      if (this.bK() && !this.n_() && --this.bP <= 0) {
         if (this.a($$0, exh.aJ, this::a)) {
            this.a(awk.ak, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            this.a(edm.t);
         }

         this.bP = this.gD();
      }

      super.a($$0);
   }

   private int gD() {
      return this.ae.a(20 * bam.e * 5) + 20 * bam.e * 5;
   }

   @Override
   public void h() {
      super.h();
      if (this.dV().w_()) {
         this.gE();
      }

      if (this.t()) {
         this.af();
      }

      this.bO++;
   }

   @Override
   public float ej() {
      return this.n_() ? 0.6F : 1.0F;
   }

   private void gE() {
      switch (this.gr()) {
         case a:
            this.bI.a();
            this.bJ.a();
            this.bK.a();
            break;
         case b:
            this.bI.a();
            this.bJ.b(this.af);
            this.bK.a();
            break;
         case c:
            this.bI.a();
            this.bJ.a();
            if (this.bQ) {
               this.bK.a();
               this.bQ = false;
            }

            if (this.bO == 0L) {
               this.bK.a(this.af);
               this.bK.a(cjs.a.c.b(), 1.0F);
            } else {
               this.bK.b(this.af);
            }
            break;
         case d:
            this.bI.b(this.af);
            this.bJ.a();
            this.bK.a();
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 64 && this.dV().C) {
         this.bQ = true;
         this.dV().a(this.dA(), this.dC(), this.dG(), awk.am, this.dm(), 1.0F, 1.0F, false);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean k(cxy $$0) {
      return $$0.a(axi.al);
   }

   public static boolean c(bwb<cjs> $$0, dhq $$1, bwa $$2, jj $$3, azs $$4) {
      return $$1.a_($$3.e()).a(awz.ca) && a($$1, $$3);
   }

   public boolean j(bwr $$0) {
      if (!this.cR().c(7.0, 2.0, 7.0).c($$0.cR())) {
         return false;
      } else if ($$0.aq().a(axd.d)) {
         return true;
      } else if (this.eq() == $$0) {
         return true;
      } else if ($$0 instanceof cqi $$1) {
         return $$1.U_() ? false : $$1.cj() || $$1.bZ();
      } else {
         return false;
      }
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      $$0.a("state", this.gr().c());
      $$0.a("scute_time", this.bP);
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      this.a(cjs.a.a($$0.l("state")));
      if ($$0.e("scute_time")) {
         this.bP = $$0.h("scute_time");
      }
   }

   public void gs() {
      if (!this.t()) {
         this.W();
         this.gB();
         this.a(edm.u);
         this.b(awk.ai);
         this.a(cjs.a.b);
      }
   }

   public void gt() {
      if (this.t()) {
         this.a(edm.u);
         this.b(awk.al);
         this.a(cjs.a.a);
      }
   }

   @Override
   public boolean a(arn $$0, buh $$1, float $$2) {
      if (this.t()) {
         $$2 = ($$2 - 1.0F) / 2.0F;
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected void b(arn $$0, buh $$1, float $$2) {
      super.b($$0, $$1, $$2);
      if (!this.gf() && !this.eG()) {
         if ($$1.d() instanceof bwr) {
            this.eb().a(cft.H, true, 80L);
            if (this.gC()) {
               this.gs();
            }
         } else if ($$1.a(axb.G)) {
            this.gt();
         }
      }
   }

   @Override
   public btq b(cqi $$0, btp $$1) {
      cxy $$2 = $$0.b($$1);
      if ($$2.a(cyc.yz) && this.gu()) {
         $$2.a(16, $$0, d($$1));
         return btq.a;
      } else {
         return (btq)(this.t() ? btq.d : super.b($$0, $$1));
      }
   }

   public boolean gu() {
      if (this.n_()) {
         return false;
      } else {
         if (this.dV() instanceof arn $$0) {
            this.a($$0, new cxy(cyc.oZ));
            this.a(edm.r);
            this.a(awk.ao);
         }

         return true;
      }
   }

   public boolean gC() {
      return !this.gn() && !this.bm() && !this.O_() && !this.bZ() && !this.ca();
   }

   @Override
   public boolean gx() {
      return super.gx() && !this.t();
   }

   @Override
   protected awj u() {
      return this.t() ? null : awk.af;
   }

   @Override
   protected void gw() {
      this.b(awk.ac);
   }

   @Override
   protected awj l_() {
      return awk.ah;
   }

   @Override
   protected awj e(buh $$0) {
      return this.t() ? awk.ae : awk.ad;
   }

   @Override
   protected void b(jj $$0, dym $$1) {
      this.a(awk.ag, 0.15F, 1.0F);
   }

   @Override
   public int ad() {
      return this.t() ? 0 : 32;
   }

   @Override
   protected ccl I() {
      return new ccl(this) {
         @Override
         public void a() {
            if (!cjs.this.t()) {
               super.a();
            }
         }
      };
   }

   public static enum a implements bag {
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

      private static final bag.a<cjs.a> f = bag.a(cjs.a::values);
      private static final IntFunction<cjs.a> g = aya.a(cjs.a::d, values(), aya.a.a);
      public static final yt<ByteBuf, cjs.a> e = yr.a(g, cjs.a::d);
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

      public static cjs.a a(String $$0) {
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
