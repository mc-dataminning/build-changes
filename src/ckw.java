import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class ckw extends cjk {
   public static final float bI = 0.6F;
   public static final float bJ = 32.5F;
   public static final int bK = 80;
   private static final double bP = 7.0;
   private static final double bQ = 2.0;
   private static final akl<ckw.a> bR = akp.a(ckw.class, akn.F);
   private long bS = 0L;
   public final bwk bM = new bwk();
   public final bwk bN = new bwk();
   public final bwk bO = new bwk();
   private int bT;
   private boolean bU = false;

   public ckw(bxc<? extends cjk> $$0, djx $$1) {
      super($$0, $$1);
      this.O().a(true);
      this.bT = this.gH();
   }

   @Nullable
   @Override
   public bwj a(ars $$0, bwj $$1) {
      return bxc.f.a($$0, bxb.e);
   }

   public static byz.a q() {
      return cjk.gz().a(bza.s, 12.0).a(bza.v, 0.14);
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(bR, ckw.a.a);
   }

   public boolean t() {
      return this.al.a(bR) != ckw.a.a;
   }

   public boolean x() {
      return this.gv().a(this.bS);
   }

   public boolean gu() {
      return this.gv() == ckw.a.b && this.bS > (long)ckw.a.b.b();
   }

   public ckw.a gv() {
      return this.al.a(bR);
   }

   @Override
   protected void ac() {
      super.ac();
      ago.a(this);
   }

   public void a(ckw.a $$0) {
      this.al.a(bR, $$0);
   }

   @Override
   public void a(akl<?> $$0) {
      if (bR.equals($$0)) {
         this.bS = 0L;
      }

      super.a($$0);
   }

   @Override
   protected byu.b<ckw> ed() {
      return ckx.a();
   }

   @Override
   protected byu<?> a(Dynamic<?> $$0) {
      return ckx.a(this.ed().a($$0));
   }

   @Override
   protected void a(ars $$0) {
      brb $$1 = bra.a();
      $$1.a("armadilloBrain");
      ((byu<ckw>)this.bs).a($$0, this);
      $$1.c();
      $$1.a("armadilloActivityUpdate");
      ckx.a(this);
      $$1.c();
      if (this.bJ() && !this.n_() && --this.bT <= 0) {
         if (this.a($$0, fad.aJ, this::a)) {
            this.a(awp.ak, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            this.a(ege.t);
         }

         this.bT = this.gH();
      }

      super.a($$0);
   }

   private int gH() {
      return this.ae.a(20 * bas.e * 5) + 20 * bas.e * 5;
   }

   @Override
   public void h() {
      super.h();
      if (this.dV().A_()) {
         this.gI();
      }

      if (this.t()) {
         this.ag();
      }

      this.bS++;
   }

   @Override
   public float ek() {
      return this.n_() ? 0.6F : 1.0F;
   }

   private void gI() {
      switch (this.gv()) {
         case a:
            this.bM.a();
            this.bN.a();
            this.bO.a();
            break;
         case b:
            this.bM.a();
            this.bN.b(this.af);
            this.bO.a();
            break;
         case c:
            this.bM.a();
            this.bN.a();
            if (this.bU) {
               this.bO.a();
               this.bU = false;
            }

            if (this.bS == 0L) {
               this.bO.a(this.af);
               this.bO.a(ckw.a.c.b(), 1.0F);
            } else {
               this.bO.b(this.af);
            }
            break;
         case d:
            this.bM.b(this.af);
            this.bN.a();
            this.bO.a();
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 64 && this.dV().C) {
         this.bU = true;
         this.dV().a(this.dA(), this.dC(), this.dG(), awp.am, this.dm(), 1.0F, 1.0F, false);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean i(czy $$0) {
      return $$0.a(axm.am);
   }

   public static boolean c(bxc<ckw> $$0, djy $$1, bxb $$2, iv $$3, azx $$4) {
      return $$1.a_($$3.e()).a(axe.cb) && a($$1, $$3);
   }

   public boolean i(bxu $$0) {
      if (!this.cR().c(7.0, 2.0, 7.0).c($$0.cR())) {
         return false;
      } else if ($$0.an().a(axh.d)) {
         return true;
      } else if (this.er() == $$0) {
         return true;
      } else if ($$0 instanceof crx $$1) {
         return $$1.Z_() ? false : $$1.ci() || $$1.bY();
      } else {
         return false;
      }
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("state", ckw.a.f, this.gv());
      $$0.a("scute_time", this.bT);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a($$0.<ckw.a>a("state", ckw.a.f).orElse(ckw.a.a));
      $$0.e("scute_time").ifPresent($$0x -> this.bT = $$0x);
   }

   public void gw() {
      if (!this.t()) {
         this.W();
         this.gF();
         this.a(ege.u);
         this.b(awp.ai);
         this.a(ckw.a.b);
      }
   }

   public void gx() {
      if (this.t()) {
         this.a(ege.u);
         this.b(awp.al);
         this.a(ckw.a.a);
      }
   }

   @Override
   public boolean a(ars $$0, bvi $$1, float $$2) {
      if (this.t()) {
         $$2 = ($$2 - 1.0F) / 2.0F;
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected void c(ars $$0, bvi $$1, float $$2) {
      super.c($$0, $$1, $$2);
      if (!this.gj() && !this.eH()) {
         if ($$1.d() instanceof bxu) {
            this.ec().a(cgw.H, true, 80L);
            if (this.gG()) {
               this.gw();
            }
         } else if ($$1.a(axf.G)) {
            this.gx();
         }
      }
   }

   @Override
   public bur b(crx $$0, buq $$1) {
      czy $$2 = $$0.b($$1);
      if ($$2.a(dac.yG) && this.gy()) {
         $$2.a(16, $$0, d($$1));
         return bur.a;
      } else {
         return (bur)(this.t() ? bur.d : super.b($$0, $$1));
      }
   }

   public boolean gy() {
      if (this.n_()) {
         return false;
      } else {
         if (this.dV() instanceof ars $$0) {
            this.a($$0, new czy(dac.pe));
            this.a(ege.r);
            this.a(awp.ao);
         }

         return true;
      }
   }

   public boolean gG() {
      return !this.gr() && !this.bl() && !this.S_() && !this.bY() && !this.bZ();
   }

   @Override
   public boolean gB() {
      return super.gB() && !this.t();
   }

   @Override
   protected awo u() {
      return this.t() ? null : awp.af;
   }

   @Override
   protected void gA() {
      this.b(awp.ac);
   }

   @Override
   protected awo l_() {
      return awp.ah;
   }

   @Override
   protected awo e(bvi $$0) {
      return this.t() ? awp.ae : awp.ad;
   }

   @Override
   protected void b(iv $$0, ebe $$1) {
      this.a(awp.ag, 0.15F, 1.0F);
   }

   @Override
   public int af() {
      return this.t() ? 0 : 32;
   }

   @Override
   protected cdo I() {
      return new cdo(this) {
         @Override
         public void a() {
            if (!ckw.this.t()) {
               super.a();
            }
         }
      };
   }

   public static enum a implements bam {
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

      static final Codec<ckw.a> f = bam.a(ckw.a::values);
      private static final IntFunction<ckw.a> g = aye.a(ckw.a::d, values(), aye.a.a);
      public static final yy<ByteBuf, ckw.a> e = yw.a(g, ckw.a::d);
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
