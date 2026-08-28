import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class ckg extends cis {
   public static final float bF = 0.6F;
   public static final float bG = 32.5F;
   public static final int bH = 80;
   private static final double bM = 7.0;
   private static final double bN = 2.0;
   private static final akj<ckg.a> bO = akn.a(ckg.class, akl.D);
   private long bP = 0L;
   public final bvu bJ = new bvu();
   public final bvu bK = new bvu();
   public final bvu bL = new bvu();
   private int bQ;
   private boolean bR = false;

   public ckg(bwm<? extends cis> $$0, div $$1) {
      super($$0, $$1);
      this.O().a(true);
      this.bQ = this.gD();
   }

   @Nullable
   @Override
   public bvt a(arq $$0, bvt $$1) {
      return bwm.e.a($$0, bwl.e);
   }

   public static byh.a q() {
      return cis.gv().a(byi.s, 12.0).a(byi.v, 0.14);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bO, ckg.a.a);
   }

   public boolean t() {
      return this.al.a(bO) != ckg.a.a;
   }

   public boolean x() {
      return this.gr().a(this.bP);
   }

   public boolean gq() {
      return this.gr() == ckg.a.b && this.bP > (long)ckg.a.b.b();
   }

   public ckg.a gr() {
      return this.al.a(bO);
   }

   @Override
   protected void ab() {
      super.ab();
      agm.a(this);
   }

   public void a(ckg.a $$0) {
      this.al.a(bO, $$0);
   }

   @Override
   public void a(akj<?> $$0) {
      if (bO.equals($$0)) {
         this.bP = 0L;
      }

      super.a($$0);
   }

   @Override
   protected byc.b<ckg> ec() {
      return ckh.a();
   }

   @Override
   protected byc<?> a(Dynamic<?> $$0) {
      return ckh.a(this.ec().a($$0));
   }

   @Override
   protected void a(arq $$0) {
      bqm $$1 = bql.a();
      $$1.a("armadilloBrain");
      ((byc<ckg>)this.bs).a($$0, this);
      $$1.c();
      $$1.a("armadilloActivityUpdate");
      ckh.a(this);
      $$1.c();
      if (this.bK() && !this.n_() && --this.bQ <= 0) {
         if (this.a($$0, eyv.aJ, this::a)) {
            this.a(awn.ak, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            this.a(eez.t);
         }

         this.bQ = this.gD();
      }

      super.a($$0);
   }

   private int gD() {
      return this.ae.a(20 * baq.e * 5) + 20 * baq.e * 5;
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
               this.bL.a(ckg.a.c.b(), 1.0F);
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
         this.dV().a(this.dA(), this.dC(), this.dG(), awn.am, this.dm(), 1.0F, 1.0F, false);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean j(cyy $$0) {
      return $$0.a(axk.al);
   }

   public static boolean c(bwm<ckg> $$0, diw $$1, bwl $$2, iu $$3, azv $$4) {
      return $$1.a_($$3.e()).a(axc.ca) && a($$1, $$3);
   }

   public boolean i(bxc $$0) {
      if (!this.cR().c(7.0, 2.0, 7.0).c($$0.cR())) {
         return false;
      } else if ($$0.aq().a(axf.d)) {
         return true;
      } else if (this.eq() == $$0) {
         return true;
      } else if ($$0 instanceof cqy $$1) {
         return $$1.U_() ? false : $$1.cj() || $$1.bZ();
      } else {
         return false;
      }
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("state", this.gr().c());
      $$0.a("scute_time", this.bQ);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a(ckg.a.a($$0.l("state")));
      if ($$0.e("scute_time")) {
         this.bQ = $$0.h("scute_time");
      }
   }

   public void gs() {
      if (!this.t()) {
         this.W();
         this.gB();
         this.a(eez.u);
         this.b(awn.ai);
         this.a(ckg.a.b);
      }
   }

   public void gt() {
      if (this.t()) {
         this.a(eez.u);
         this.b(awn.al);
         this.a(ckg.a.a);
      }
   }

   @Override
   public boolean a(arq $$0, bus $$1, float $$2) {
      if (this.t()) {
         $$2 = ($$2 - 1.0F) / 2.0F;
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected void c(arq $$0, bus $$1, float $$2) {
      super.c($$0, $$1, $$2);
      if (!this.gf() && !this.eG()) {
         if ($$1.d() instanceof bxc) {
            this.eb().a(cge.H, true, 80L);
            if (this.gC()) {
               this.gs();
            }
         } else if ($$1.a(axd.G)) {
            this.gt();
         }
      }
   }

   @Override
   public bub b(cqy $$0, bua $$1) {
      cyy $$2 = $$0.b($$1);
      if ($$2.a(czc.yB) && this.gu()) {
         $$2.a(16, $$0, d($$1));
         return bub.a;
      } else {
         return (bub)(this.t() ? bub.d : super.b($$0, $$1));
      }
   }

   public boolean gu() {
      if (this.n_()) {
         return false;
      } else {
         if (this.dV() instanceof arq $$0) {
            this.a($$0, new cyy(czc.pb));
            this.a(eez.r);
            this.a(awn.ao);
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
   protected awm u() {
      return this.t() ? null : awn.af;
   }

   @Override
   protected void gw() {
      this.b(awn.ac);
   }

   @Override
   protected awm l_() {
      return awn.ah;
   }

   @Override
   protected awm e(bus $$0) {
      return this.t() ? awn.ae : awn.ad;
   }

   @Override
   protected void b(iu $$0, dzz $$1) {
      this.a(awn.ag, 0.15F, 1.0F);
   }

   @Override
   public int ad() {
      return this.t() ? 0 : 32;
   }

   @Override
   protected ccw I() {
      return new ccw(this) {
         @Override
         public void a() {
            if (!ckg.this.t()) {
               super.a();
            }
         }
      };
   }

   public static enum a implements bak {
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

      private static final bak.a<ckg.a> f = bak.a(ckg.a::values);
      private static final IntFunction<ckg.a> g = ayc.a(ckg.a::d, values(), ayc.a.a);
      public static final yw<ByteBuf, ckg.a> e = yu.a(g, ckg.a::d);
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

      public static ckg.a a(String $$0) {
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
