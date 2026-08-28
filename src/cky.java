import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cky extends cjm {
   public static final float bI = 0.6F;
   public static final float bJ = 32.5F;
   public static final int bK = 80;
   private static final double bP = 7.0;
   private static final double bQ = 2.0;
   private static final akn<cky.a> bR = akr.a(cky.class, akp.F);
   private long bS = 0L;
   public final bwm bM = new bwm();
   public final bwm bN = new bwm();
   public final bwm bO = new bwm();
   private int bT;
   private boolean bU = false;

   public cky(bxe<? extends cjm> $$0, djz $$1) {
      super($$0, $$1);
      this.O().a(true);
      this.bT = this.gH();
   }

   @Nullable
   @Override
   public bwl a(aru $$0, bwl $$1) {
      return bxe.f.a($$0, bxd.e);
   }

   public static bzb.a q() {
      return cjm.gz().a(bzc.s, 12.0).a(bzc.v, 0.14);
   }

   @Override
   protected void a(akr.a $$0) {
      super.a($$0);
      $$0.a(bR, cky.a.a);
   }

   public boolean t() {
      return this.al.a(bR) != cky.a.a;
   }

   public boolean x() {
      return this.gv().a(this.bS);
   }

   public boolean gu() {
      return this.gv() == cky.a.b && this.bS > (long)cky.a.b.b();
   }

   public cky.a gv() {
      return this.al.a(bR);
   }

   @Override
   protected void ac() {
      super.ac();
      agq.a(this);
   }

   public void a(cky.a $$0) {
      this.al.a(bR, $$0);
   }

   @Override
   public void a(akn<?> $$0) {
      if (bR.equals($$0)) {
         this.bS = 0L;
      }

      super.a($$0);
   }

   @Override
   protected byw.b<cky> ed() {
      return ckz.a();
   }

   @Override
   protected byw<?> a(Dynamic<?> $$0) {
      return ckz.a(this.ed().a($$0));
   }

   @Override
   protected void a(aru $$0) {
      brd $$1 = brc.a();
      $$1.a("armadilloBrain");
      ((byw<cky>)this.bs).a($$0, this);
      $$1.c();
      $$1.a("armadilloActivityUpdate");
      ckz.a(this);
      $$1.c();
      if (this.bJ() && !this.n_() && --this.bT <= 0) {
         if (this.a($$0, faf.aJ, this::a)) {
            this.a(awr.ak, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            this.a(egg.t);
         }

         this.bT = this.gH();
      }

      super.a($$0);
   }

   private int gH() {
      return this.ae.a(20 * bau.e * 5) + 20 * bau.e * 5;
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
               this.bO.a(cky.a.c.b(), 1.0F);
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
         this.dV().a(this.dA(), this.dC(), this.dG(), awr.am, this.dm(), 1.0F, 1.0F, false);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean i(daa $$0) {
      return $$0.a(axo.an);
   }

   public static boolean c(bxe<cky> $$0, dka $$1, bxd $$2, iw $$3, azz $$4) {
      return $$1.a_($$3.e()).a(axg.cb) && a($$1, $$3);
   }

   public boolean i(bxw $$0) {
      if (!this.cR().c(7.0, 2.0, 7.0).c($$0.cR())) {
         return false;
      } else if ($$0.an().a(axj.d)) {
         return true;
      } else if (this.er() == $$0) {
         return true;
      } else if ($$0 instanceof crz $$1) {
         return $$1.Z_() ? false : $$1.ci() || $$1.bY();
      } else {
         return false;
      }
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("state", cky.a.f, this.gv());
      $$0.a("scute_time", this.bT);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.a($$0.<cky.a>a("state", cky.a.f).orElse(cky.a.a));
      $$0.e("scute_time").ifPresent($$0x -> this.bT = $$0x);
   }

   public void gw() {
      if (!this.t()) {
         this.W();
         this.gF();
         this.a(egg.u);
         this.b(awr.ai);
         this.a(cky.a.b);
      }
   }

   public void gx() {
      if (this.t()) {
         this.a(egg.u);
         this.b(awr.al);
         this.a(cky.a.a);
      }
   }

   @Override
   public boolean a(aru $$0, bvk $$1, float $$2) {
      if (this.t()) {
         $$2 = ($$2 - 1.0F) / 2.0F;
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected void c(aru $$0, bvk $$1, float $$2) {
      super.c($$0, $$1, $$2);
      if (!this.gj() && !this.eH()) {
         if ($$1.d() instanceof bxw) {
            this.ec().a(cgy.H, true, 80L);
            if (this.gG()) {
               this.gw();
            }
         } else if ($$1.a(axh.G)) {
            this.gx();
         }
      }
   }

   @Override
   public but b(crz $$0, bus $$1) {
      daa $$2 = $$0.b($$1);
      if ($$2.a(dae.yG) && this.gy()) {
         $$2.a(16, $$0, d($$1));
         return but.a;
      } else {
         return (but)(this.t() ? but.d : super.b($$0, $$1));
      }
   }

   public boolean gy() {
      if (this.n_()) {
         return false;
      } else {
         if (this.dV() instanceof aru $$0) {
            this.a($$0, new daa(dae.pe));
            this.a(egg.r);
            this.a(awr.ao);
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
   protected awq u() {
      return this.t() ? null : awr.af;
   }

   @Override
   protected void gA() {
      this.b(awr.ac);
   }

   @Override
   protected awq l_() {
      return awr.ah;
   }

   @Override
   protected awq e(bvk $$0) {
      return this.t() ? awr.ae : awr.ad;
   }

   @Override
   protected void b(iw $$0, ebg $$1) {
      this.a(awr.ag, 0.15F, 1.0F);
   }

   @Override
   public int af() {
      return this.t() ? 0 : 32;
   }

   @Override
   protected cdq I() {
      return new cdq(this) {
         @Override
         public void a() {
            if (!cky.this.t()) {
               super.a();
            }
         }
      };
   }

   public static enum a implements bao {
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

      static final Codec<cky.a> f = bao.a(cky.a::values);
      private static final IntFunction<cky.a> g = ayg.a(cky.a::d, values(), ayg.a.a);
      public static final za<ByteBuf, cky.a> e = yy.a(g, cky.a::d);
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
