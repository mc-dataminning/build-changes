import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class clh extends cjv {
   public static final float bI = 0.6F;
   public static final float bJ = 32.5F;
   public static final int bK = 80;
   private static final double bP = 7.0;
   private static final double bQ = 2.0;
   private static final aku<clh.a> bR = aky.a(clh.class, akw.F);
   private long bS = 0L;
   public final bwv bM = new bwv();
   public final bwv bN = new bwv();
   public final bwv bO = new bwv();
   private int bT;
   private boolean bU = false;

   public clh(bxn<? extends cjv> $$0, dkj $$1) {
      super($$0, $$1);
      this.O().a(true);
      this.bT = this.gH();
   }

   @Nullable
   @Override
   public bwu a(asb $$0, bwu $$1) {
      return bxn.f.a($$0, bxm.e);
   }

   public static bzk.a q() {
      return cjv.gz().a(bzl.s, 12.0).a(bzl.v, 0.14);
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(bR, clh.a.a);
   }

   public boolean t() {
      return this.al.a(bR) != clh.a.a;
   }

   public boolean x() {
      return this.gv().a(this.bS);
   }

   public boolean gu() {
      return this.gv() == clh.a.b && this.bS > (long)clh.a.b.b();
   }

   public clh.a gv() {
      return this.al.a(bR);
   }

   @Override
   protected void ac() {
      super.ac();
      agx.a(this);
   }

   public void a(clh.a $$0) {
      this.al.a(bR, $$0);
   }

   @Override
   public void a(aku<?> $$0) {
      if (bR.equals($$0)) {
         this.bS = 0L;
      }

      super.a($$0);
   }

   @Override
   protected bzf.b<clh> ed() {
      return cli.a();
   }

   @Override
   protected bzf<?> a(Dynamic<?> $$0) {
      return cli.a(this.ed().a($$0));
   }

   @Override
   protected void a(asb $$0) {
      brm $$1 = brl.a();
      $$1.a("armadilloBrain");
      ((bzf<clh>)this.bs).a($$0, this);
      $$1.c();
      $$1.a("armadilloActivityUpdate");
      cli.a(this);
      $$1.c();
      if (this.bJ() && !this.n_() && --this.bT <= 0) {
         if (this.a($$0, fap.aJ, this::a)) {
            this.a(awy.ak, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            this.a(egq.t);
         }

         this.bT = this.gH();
      }

      super.a($$0);
   }

   private int gH() {
      return this.ae.a(20 * bbd.e * 5) + 20 * bbd.e * 5;
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
               this.bO.a(clh.a.c.b(), 1.0F);
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
         this.dV().a(this.dA(), this.dC(), this.dG(), awy.am, this.dm(), 1.0F, 1.0F, false);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean i(dak $$0) {
      return $$0.a(axv.an);
   }

   public static boolean c(bxn<clh> $$0, dkk $$1, bxm $$2, iw $$3, bai $$4) {
      return $$1.a_($$3.e()).a(axn.cb) && a($$1, $$3);
   }

   public boolean i(byf $$0) {
      if (!this.cR().c(7.0, 2.0, 7.0).c($$0.cR())) {
         return false;
      } else if ($$0.an().a(axq.d)) {
         return true;
      } else if (this.er() == $$0) {
         return true;
      } else if ($$0 instanceof csi $$1) {
         return $$1.aa_() ? false : $$1.ci() || $$1.bY();
      } else {
         return false;
      }
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("state", clh.a.f, this.gv());
      $$0.a("scute_time", this.bT);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.a($$0.<clh.a>a("state", clh.a.f).orElse(clh.a.a));
      $$0.e("scute_time").ifPresent($$0x -> this.bT = $$0x);
   }

   public void gw() {
      if (!this.t()) {
         this.W();
         this.gF();
         this.a(egq.u);
         this.b(awy.ai);
         this.a(clh.a.b);
      }
   }

   public void gx() {
      if (this.t()) {
         this.a(egq.u);
         this.b(awy.al);
         this.a(clh.a.a);
      }
   }

   @Override
   public boolean a(asb $$0, bvt $$1, float $$2) {
      if (this.t()) {
         $$2 = ($$2 - 1.0F) / 2.0F;
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected void c(asb $$0, bvt $$1, float $$2) {
      super.c($$0, $$1, $$2);
      if (!this.gj() && !this.eH()) {
         if ($$1.d() instanceof byf) {
            this.ec().a(chh.H, true, 80L);
            if (this.gG()) {
               this.gw();
            }
         } else if ($$1.a(axo.G)) {
            this.gx();
         }
      }
   }

   @Override
   public bvc b(csi $$0, bvb $$1) {
      dak $$2 = $$0.b($$1);
      if ($$2.a(dao.yG) && this.gy()) {
         $$2.a(16, $$0, d($$1));
         return bvc.a;
      } else {
         return (bvc)(this.t() ? bvc.d : super.b($$0, $$1));
      }
   }

   public boolean gy() {
      if (this.n_()) {
         return false;
      } else {
         if (this.dV() instanceof asb $$0) {
            this.a($$0, new dak(dao.pe));
            this.a(egq.r);
            this.a(awy.ao);
         }

         return true;
      }
   }

   public boolean gG() {
      return !this.gr() && !this.bl() && !this.T_() && !this.bY() && !this.bZ();
   }

   @Override
   public boolean gB() {
      return super.gB() && !this.t();
   }

   @Override
   protected awx u() {
      return this.t() ? null : awy.af;
   }

   @Override
   protected void gA() {
      this.b(awy.ac);
   }

   @Override
   protected awx l_() {
      return awy.ah;
   }

   @Override
   protected awx e(bvt $$0) {
      return this.t() ? awy.ae : awy.ad;
   }

   @Override
   protected void b(iw $$0, ebq $$1) {
      this.a(awy.ag, 0.15F, 1.0F);
   }

   @Override
   public int af() {
      return this.t() ? 0 : 32;
   }

   @Override
   protected cdz I() {
      return new cdz(this) {
         @Override
         public void a() {
            if (!clh.this.t()) {
               super.a();
            }
         }
      };
   }

   public static enum a implements bax {
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

      static final Codec<clh.a> f = bax.a(clh.a::values);
      private static final IntFunction<clh.a> g = ayo.a(clh.a::d, values(), ayo.a.a);
      public static final ze<ByteBuf, clh.a> e = zc.a(g, clh.a::d);
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
