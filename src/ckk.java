import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class ckk extends ciu {
   public static final float bG = 0.6F;
   public static final float bH = 32.5F;
   public static final int bI = 80;
   private static final double bN = 7.0;
   private static final double bO = 2.0;
   private static final akj<ckk.a> bP = akn.a(ckk.class, akl.E);
   private long bQ = 0L;
   public final bvw bK = new bvw();
   public final bvw bL = new bvw();
   public final bvw bM = new bvw();
   private int bR;
   private boolean bS = false;

   public ckk(bwo<? extends ciu> $$0, dja $$1) {
      super($$0, $$1);
      this.O().a(true);
      this.bR = this.gE();
   }

   @Nullable
   @Override
   public bvv a(arq $$0, bvv $$1) {
      return bwo.e.a($$0, bwn.e);
   }

   public static byj.a q() {
      return ciu.gw().a(byk.s, 12.0).a(byk.v, 0.14);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bP, ckk.a.a);
   }

   public boolean t() {
      return this.al.a(bP) != ckk.a.a;
   }

   public boolean x() {
      return this.gs().a(this.bQ);
   }

   public boolean gr() {
      return this.gs() == ckk.a.b && this.bQ > (long)ckk.a.b.b();
   }

   public ckk.a gs() {
      return this.al.a(bP);
   }

   @Override
   protected void ab() {
      super.ab();
      agm.a(this);
   }

   public void a(ckk.a $$0) {
      this.al.a(bP, $$0);
   }

   @Override
   public void a(akj<?> $$0) {
      if (bP.equals($$0)) {
         this.bQ = 0L;
      }

      super.a($$0);
   }

   @Override
   protected bye.b<ckk> ed() {
      return ckl.a();
   }

   @Override
   protected bye<?> a(Dynamic<?> $$0) {
      return ckl.a(this.ed().a($$0));
   }

   @Override
   protected void a(arq $$0) {
      bqo $$1 = bqn.a();
      $$1.a("armadilloBrain");
      ((bye<ckk>)this.bs).a($$0, this);
      $$1.c();
      $$1.a("armadilloActivityUpdate");
      ckl.a(this);
      $$1.c();
      if (this.bK() && !this.n_() && --this.bR <= 0) {
         if (this.a($$0, ezd.aJ, this::a)) {
            this.a(awn.ak, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            this.a(efh.t);
         }

         this.bR = this.gE();
      }

      super.a($$0);
   }

   private int gE() {
      return this.ae.a(20 * baq.e * 5) + 20 * baq.e * 5;
   }

   @Override
   public void h() {
      super.h();
      if (this.dV().w_()) {
         this.gF();
      }

      if (this.t()) {
         this.af();
      }

      this.bQ++;
   }

   @Override
   public float ek() {
      return this.n_() ? 0.6F : 1.0F;
   }

   private void gF() {
      switch (this.gs()) {
         case a:
            this.bK.a();
            this.bL.a();
            this.bM.a();
            break;
         case b:
            this.bK.a();
            this.bL.b(this.af);
            this.bM.a();
            break;
         case c:
            this.bK.a();
            this.bL.a();
            if (this.bS) {
               this.bM.a();
               this.bS = false;
            }

            if (this.bQ == 0L) {
               this.bM.a(this.af);
               this.bM.a(ckk.a.c.b(), 1.0F);
            } else {
               this.bM.b(this.af);
            }
            break;
         case d:
            this.bK.b(this.af);
            this.bL.a();
            this.bM.a();
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 64 && this.dV().C) {
         this.bS = true;
         this.dV().a(this.dA(), this.dC(), this.dG(), awn.am, this.dm(), 1.0F, 1.0F, false);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean i(czd $$0) {
      return $$0.a(axk.am);
   }

   public static boolean c(bwo<ckk> $$0, djb $$1, bwn $$2, iu $$3, azv $$4) {
      return $$1.a_($$3.e()).a(axc.cb) && a($$1, $$3);
   }

   public boolean i(bxe $$0) {
      if (!this.cR().c(7.0, 2.0, 7.0).c($$0.cR())) {
         return false;
      } else if ($$0.aq().a(axf.d)) {
         return true;
      } else if (this.er() == $$0) {
         return true;
      } else if ($$0 instanceof crc $$1) {
         return $$1.V_() ? false : $$1.cj() || $$1.bZ();
      } else {
         return false;
      }
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("state", this.gs().c());
      $$0.a("scute_time", this.bR);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a(ckk.a.a($$0.l("state")));
      if ($$0.e("scute_time")) {
         this.bR = $$0.h("scute_time");
      }
   }

   public void gt() {
      if (!this.t()) {
         this.W();
         this.gC();
         this.a(efh.u);
         this.b(awn.ai);
         this.a(ckk.a.b);
      }
   }

   public void gu() {
      if (this.t()) {
         this.a(efh.u);
         this.b(awn.al);
         this.a(ckk.a.a);
      }
   }

   @Override
   public boolean a(arq $$0, buu $$1, float $$2) {
      if (this.t()) {
         $$2 = ($$2 - 1.0F) / 2.0F;
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected void c(arq $$0, buu $$1, float $$2) {
      super.c($$0, $$1, $$2);
      if (!this.gg() && !this.eH()) {
         if ($$1.d() instanceof bxe) {
            this.ec().a(cgg.H, true, 80L);
            if (this.gD()) {
               this.gt();
            }
         } else if ($$1.a(axd.G)) {
            this.gu();
         }
      }
   }

   @Override
   public bud b(crc $$0, buc $$1) {
      czd $$2 = $$0.b($$1);
      if ($$2.a(czh.yG) && this.gv()) {
         $$2.a(16, $$0, d($$1));
         return bud.a;
      } else {
         return (bud)(this.t() ? bud.d : super.b($$0, $$1));
      }
   }

   public boolean gv() {
      if (this.n_()) {
         return false;
      } else {
         if (this.dV() instanceof arq $$0) {
            this.a($$0, new czd(czh.pe));
            this.a(efh.r);
            this.a(awn.ao);
         }

         return true;
      }
   }

   public boolean gD() {
      return !this.go() && !this.bm() && !this.O_() && !this.bZ() && !this.ca();
   }

   @Override
   public boolean gy() {
      return super.gy() && !this.t();
   }

   @Override
   protected awm u() {
      return this.t() ? null : awn.af;
   }

   @Override
   protected void gx() {
      this.b(awn.ac);
   }

   @Override
   protected awm l_() {
      return awn.ah;
   }

   @Override
   protected awm e(buu $$0) {
      return this.t() ? awn.ae : awn.ad;
   }

   @Override
   protected void b(iu $$0, eah $$1) {
      this.a(awn.ag, 0.15F, 1.0F);
   }

   @Override
   public int ad() {
      return this.t() ? 0 : 32;
   }

   @Override
   protected ccy I() {
      return new ccy(this) {
         @Override
         public void a() {
            if (!ckk.this.t()) {
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

      private static final bak.a<ckk.a> f = bak.a(ckk.a::values);
      private static final IntFunction<ckk.a> g = ayc.a(ckk.a::d, values(), ayc.a.a);
      public static final yw<ByteBuf, ckk.a> e = yu.a(g, ckk.a::d);
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

      public static ckk.a a(String $$0) {
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
