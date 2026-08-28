import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cih extends cgy {
   public static final float bY = 0.6F;
   public static final float bZ = 32.5F;
   public static final int ca = 80;
   private static final double cf = 7.0;
   private static final double cg = 2.0;
   private static final ajy<cih.a> ch = akc.a(cih.class, aka.B);
   private long ci = 0L;
   public final bud cc = new bud();
   public final bud cd = new bud();
   public final bud ce = new bud();
   private int cj;
   private boolean ck = false;

   public cih(bus<? extends cgy> $$0, dgi $$1) {
      super($$0, $$1);
      this.P().a(true);
      this.cj = this.gF();
   }

   @Nullable
   @Override
   public buc a(ard $$0, buc $$1) {
      return bus.e.a($$0, bur.e);
   }

   public static bwo.a p() {
      return cgy.gx().a(bwp.s, 12.0).a(bwp.v, 0.14);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(ch, cih.a.a);
   }

   public boolean t() {
      return this.al.a(ch) != cih.a.a;
   }

   public boolean x() {
      return this.gt().a(this.ci);
   }

   public boolean gs() {
      return this.gt() == cih.a.b && this.ci > (long)cih.a.b.b();
   }

   public cih.a gt() {
      return this.al.a(ch);
   }

   @Override
   protected void ac() {
      super.ac();
      agd.a(this);
   }

   public void a(cih.a $$0) {
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
   protected bwj.b<cih> ec() {
      return cii.a();
   }

   @Override
   protected bwj<?> a(Dynamic<?> $$0) {
      return cii.a(this.ec().a($$0));
   }

   @Override
   protected void a(ard $$0) {
      bot $$1 = bos.a();
      $$1.a("armadilloBrain");
      ((bwj<cih>)this.bE).a($$0, this);
      $$1.c();
      $$1.a("armadilloActivityUpdate");
      cii.a(this);
      $$1.c();
      if (this.bL() && !this.e_() && --this.cj <= 0) {
         if (this.a($$0, evn.aJ, this::a)) {
            this.a(awa.ak, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            this.a(ebt.t);
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
               this.ce.a(cih.a.c.b(), 1.0F);
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
   public boolean j(cwp $$0) {
      return $$0.a(awy.al);
   }

   public static boolean c(bus<cih> $$0, dgj $$1, bur $$2, ji $$3, azh $$4) {
      return $$1.a_($$3.e()).a(awp.bZ) && a($$1, $$3);
   }

   public boolean j(bvh $$0) {
      if (!this.cR().c(7.0, 2.0, 7.0).c($$0.cR())) {
         return false;
      } else if ($$0.aq().a(awt.d)) {
         return true;
      } else if (this.ep() == $$0) {
         return true;
      } else if ($$0 instanceof cox $$1) {
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
      this.a(cih.a.a($$0.l("state")));
      if ($$0.e("scute_time")) {
         this.cj = $$0.h("scute_time");
      }
   }

   public void gu() {
      if (!this.t()) {
         this.X();
         this.gD();
         this.a(ebt.u);
         this.b(awa.ai);
         this.a(cih.a.b);
      }
   }

   public void gv() {
      if (this.t()) {
         this.a(ebt.u);
         this.b(awa.al);
         this.a(cih.a.a);
      }
   }

   @Override
   public boolean a(ard $$0, btb $$1, float $$2) {
      if (this.t()) {
         $$2 = ($$2 - 1.0F) / 2.0F;
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected void b(ard $$0, btb $$1, float $$2) {
      super.b($$0, $$1, $$2);
      if (!this.gf() && !this.eE()) {
         if ($$1.d() instanceof bvh) {
            this.eb().a(cel.G, true, 80L);
            if (this.gE()) {
               this.gu();
            }
         } else if ($$1.a(awr.G)) {
            this.gv();
         }
      }
   }

   @Override
   public bsk b(cox $$0, bsj $$1) {
      cwp $$2 = $$0.b($$1);
      if ($$2.a(cwt.yv) && this.gw()) {
         $$2.a(16, $$0, d($$1));
         return bsk.a;
      } else {
         return (bsk)(this.t() ? bsk.d : super.b($$0, $$1));
      }
   }

   public boolean gw() {
      if (this.e_()) {
         return false;
      } else {
         if (this.dV() instanceof ard $$0) {
            this.a($$0, new cwp(cwt.oV));
            this.a(ebt.r);
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
   protected avz e(btb $$0) {
      return this.t() ? awa.ae : awa.ad;
   }

   @Override
   protected void b(ji $$0, dwx $$1) {
      this.a(awa.ag, 0.15F, 1.0F);
   }

   @Override
   public int af() {
      return this.t() ? 0 : 32;
   }

   @Override
   protected cbd J() {
      return new cbd(this) {
         @Override
         public void a() {
            if (!cih.this.t()) {
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

      private static final azv.a<cih.a> f = azv.a(cih.a::values);
      private static final IntFunction<cih.a> g = axq.a(cih.a::d, values(), axq.a.a);
      public static final yn<ByteBuf, cih.a> e = yl.a(g, cih.a::d);
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

      public static cih.a a(String $$0) {
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
