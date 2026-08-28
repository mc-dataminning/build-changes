import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cka extends cio {
   public static final float bF = 0.6F;
   public static final float bG = 32.5F;
   public static final int bH = 80;
   private static final double bM = 7.0;
   private static final double bN = 2.0;
   private static final akh<cka.a> bO = akl.a(cka.class, akj.C);
   private long bP = 0L;
   public final bvr bJ = new bvr();
   public final bvr bK = new bvr();
   public final bvr bL = new bvr();
   private int bQ;
   private boolean bR = false;

   public cka(bwj<? extends cio> $$0, dip $$1) {
      super($$0, $$1);
      this.O().a(true);
      this.bQ = this.gD();
   }

   @Nullable
   @Override
   public bvq a(aro $$0, bvq $$1) {
      return bwj.e.a($$0, bwi.e);
   }

   public static bye.a q() {
      return cio.gv().a(byf.s, 12.0).a(byf.v, 0.14);
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(bO, cka.a.a);
   }

   public boolean t() {
      return this.al.a(bO) != cka.a.a;
   }

   public boolean x() {
      return this.gr().a(this.bP);
   }

   public boolean gq() {
      return this.gr() == cka.a.b && this.bP > (long)cka.a.b.b();
   }

   public cka.a gr() {
      return this.al.a(bO);
   }

   @Override
   protected void ab() {
      super.ab();
      agk.a(this);
   }

   public void a(cka.a $$0) {
      this.al.a(bO, $$0);
   }

   @Override
   public void a(akh<?> $$0) {
      if (bO.equals($$0)) {
         this.bP = 0L;
      }

      super.a($$0);
   }

   @Override
   protected bxz.b<cka> ec() {
      return ckb.a();
   }

   @Override
   protected bxz<?> a(Dynamic<?> $$0) {
      return ckb.a(this.ec().a($$0));
   }

   @Override
   protected void a(aro $$0) {
      bqj $$1 = bqi.a();
      $$1.a("armadilloBrain");
      ((bxz<cka>)this.bs).a($$0, this);
      $$1.c();
      $$1.a("armadilloActivityUpdate");
      ckb.a(this);
      $$1.c();
      if (this.bK() && !this.n_() && --this.bQ <= 0) {
         if (this.a($$0, eyj.aJ, this::a)) {
            this.a(awl.ak, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            this.a(eeo.t);
         }

         this.bQ = this.gD();
      }

      super.a($$0);
   }

   private int gD() {
      return this.ae.a(20 * bao.e * 5) + 20 * bao.e * 5;
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

      this.bP++;
   }

   @Override
   public float ej() {
      return this.n_() ? 0.6F : 1.0F;
   }

   private void gE() {
      switch (this.gr()) {
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
               this.bL.a(cka.a.c.b(), 1.0F);
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
      if ($$0 == 64 && this.dV().C) {
         this.bR = true;
         this.dV().a(this.dA(), this.dC(), this.dG(), awl.am, this.dm(), 1.0F, 1.0F, false);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean k(cys $$0) {
      return $$0.a(axi.al);
   }

   public static boolean c(bwj<cka> $$0, diq $$1, bwi $$2, iu $$3, azt $$4) {
      return $$1.a_($$3.e()).a(axa.ca) && a($$1, $$3);
   }

   public boolean i(bwz $$0) {
      if (!this.cR().c(7.0, 2.0, 7.0).c($$0.cR())) {
         return false;
      } else if ($$0.aq().a(axd.d)) {
         return true;
      } else if (this.eq() == $$0) {
         return true;
      } else if ($$0 instanceof cqs $$1) {
         return $$1.U_() ? false : $$1.cj() || $$1.bZ();
      } else {
         return false;
      }
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("state", this.gr().c());
      $$0.a("scute_time", this.bQ);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.a(cka.a.a($$0.l("state")));
      if ($$0.e("scute_time")) {
         this.bQ = $$0.h("scute_time");
      }
   }

   public void gs() {
      if (!this.t()) {
         this.W();
         this.gB();
         this.a(eeo.u);
         this.b(awl.ai);
         this.a(cka.a.b);
      }
   }

   public void gt() {
      if (this.t()) {
         this.a(eeo.u);
         this.b(awl.al);
         this.a(cka.a.a);
      }
   }

   @Override
   public boolean a(aro $$0, bup $$1, float $$2) {
      if (this.t()) {
         $$2 = ($$2 - 1.0F) / 2.0F;
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected void b(aro $$0, bup $$1, float $$2) {
      super.b($$0, $$1, $$2);
      if (!this.gf() && !this.eG()) {
         if ($$1.d() instanceof bwz) {
            this.eb().a(cgb.H, true, 80L);
            if (this.gC()) {
               this.gs();
            }
         } else if ($$1.a(axb.G)) {
            this.gt();
         }
      }
   }

   @Override
   public bty b(cqs $$0, btx $$1) {
      cys $$2 = $$0.b($$1);
      if ($$2.a(cyw.yz) && this.gu()) {
         $$2.a(16, $$0, d($$1));
         return bty.a;
      } else {
         return (bty)(this.t() ? bty.d : super.b($$0, $$1));
      }
   }

   public boolean gu() {
      if (this.n_()) {
         return false;
      } else {
         if (this.dV() instanceof aro $$0) {
            this.a($$0, new cys(cyw.oZ));
            this.a(eeo.r);
            this.a(awl.ao);
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
   protected awk u() {
      return this.t() ? null : awl.af;
   }

   @Override
   protected void gw() {
      this.b(awl.ac);
   }

   @Override
   protected awk l_() {
      return awl.ah;
   }

   @Override
   protected awk e(bup $$0) {
      return this.t() ? awl.ae : awl.ad;
   }

   @Override
   protected void b(iu $$0, dzo $$1) {
      this.a(awl.ag, 0.15F, 1.0F);
   }

   @Override
   public int ad() {
      return this.t() ? 0 : 32;
   }

   @Override
   protected cct I() {
      return new cct(this) {
         @Override
         public void a() {
            if (!cka.this.t()) {
               super.a();
            }
         }
      };
   }

   public static enum a implements bai {
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

      private static final bai.a<cka.a> f = bai.a(cka.a::values);
      private static final IntFunction<cka.a> g = aya.a(cka.a::d, values(), aya.a.a);
      public static final yu<ByteBuf, cka.a> e = ys.a(g, cka.a::d);
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

      public static cka.a a(String $$0) {
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
