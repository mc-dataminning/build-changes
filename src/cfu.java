import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfu extends cgb implements buo<cfu.b>, cfn {
   private static final ajw<Integer> ci = aka.a(cfu.class, ajy.b);
   private static final Predicate<btp> cj = new Predicate<btp>() {
      public boolean a(@Nullable btp $$0) {
         return $$0 != null && cfu.ck.containsKey($$0.am());
      }
   };
   static final Map<bsx<?>, avo> ck = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bsx.i, avp.sK);
      $$0.put(bsx.l, avp.sL);
      $$0.put(bsx.m, avp.sM);
      $$0.put(bsx.q, avp.ti);
      $$0.put(bsx.x, avp.sN);
      $$0.put(bsx.B, avp.sO);
      $$0.put(bsx.D, avp.sP);
      $$0.put(bsx.F, avp.sQ);
      $$0.put(bsx.I, avp.sR);
      $$0.put(bsx.J, avp.sS);
      $$0.put(bsx.T, avp.sT);
      $$0.put(bsx.Y, avp.sU);
      $$0.put(bsx.Z, avp.sV);
      $$0.put(bsx.ac, avp.sW);
      $$0.put(bsx.ad, avp.sX);
      $$0.put(bsx.ap, avp.sY);
      $$0.put(bsx.ay, avp.sZ);
      $$0.put(bsx.aA, avp.ta);
      $$0.put(bsx.aB, avp.tb);
      $$0.put(bsx.aC, avp.tc);
      $$0.put(bsx.aH, avp.td);
      $$0.put(bsx.aK, avp.te);
      $$0.put(bsx.aM, avp.tf);
      $$0.put(bsx.aN, avp.tg);
      $$0.put(bsx.aP, avp.th);
      $$0.put(bsx.aW, avp.ti);
      $$0.put(bsx.aY, avp.tj);
      $$0.put(bsx.bi, avp.tk);
      $$0.put(bsx.bk, avp.tl);
      $$0.put(bsx.bm, avp.tm);
      $$0.put(bsx.bo, avp.tn);
      $$0.put(bsx.bp, avp.to);
      $$0.put(bsx.bq, avp.tp);
      $$0.put(bsx.bt, avp.tq);
      $$0.put(bsx.bu, avp.tr);
      $$0.put(bsx.bw, avp.ts);
   });
   public float ce;
   public float cf;
   public float cg;
   public float ch;
   private float cl = 1.0F;
   private float cm = 1.0F;
   private boolean cn;
   @Nullable
   private jd co;

   public cfu(bsx<? extends cfu> $$0, dcw $$1) {
      super($$0, $$1);
      this.bR = new bzm(this, 10, false);
      this.a(ept.n, -1.0F);
      this.a(ept.o, -1.0F);
      this.a(ept.x, -1.0F);
   }

   @Nullable
   @Override
   public buh a(ddl $$0, bqp $$1, btr $$2, @Nullable buh $$3) {
      this.a(ad.a(cfu.b.values(), $$0.E_()));
      if ($$3 == null) {
         $$3 = new bsl.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean o_() {
      return false;
   }

   @Override
   protected void B() {
      this.bU.a(0, new bul.a(1.25));
      this.bU.a(0, new cag(this));
      this.bU.a(1, new cau(this, cmx.class, 8.0F));
      this.bU.a(2, new cbr(this));
      this.bU.a(2, new cak(this, 1.0, 5.0F, 1.0F));
      this.bU.a(2, new cfu.a(this, 1.0));
      this.bU.a(3, new car(this));
      this.bU.a(3, new caj(this, 1.0, 3.0F, 7.0F));
   }

   public static buv.a gv() {
      return btp.C().a(buw.s, 6.0).a(buw.l, 0.4F).a(buw.v, 0.2F).a(buw.c, 3.0);
   }

   @Override
   protected cda b(dcw $$0) {
      ccy $$1 = new ccy(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   public void m_() {
      if (this.co == null || !this.co.a(this.dn(), 3.46) || !this.dP().a_(this.co).a(dga.dT)) {
         this.cn = false;
         this.co = null;
      }

      if (this.dP().z.a(400) == 0) {
         a(this.dP(), this);
      }

      super.m_();
      this.gA();
   }

   @Override
   public void a(jd $$0, boolean $$1) {
      this.co = $$0;
      this.cn = $$1;
   }

   public boolean gw() {
      return this.cn;
   }

   private void gA() {
      this.ch = this.ce;
      this.cg = this.cf;
      this.cf = this.cf + (float)(!this.aF() && !this.bS() ? 4 : -1) * 0.3F;
      this.cf = ayo.a(this.cf, 0.0F, 1.0F);
      if (!this.aF() && this.cl < 1.0F) {
         this.cl = 1.0F;
      }

      this.cl *= 0.9F;
      exa $$0 = this.ds();
      if (!this.aF() && $$0.d < 0.0) {
         this.i($$0.d(1.0, 0.6, 1.0));
      }

      this.ce = this.ce + this.cl * 2.0F;
   }

   public static boolean a(dcw $$0, bsr $$1) {
      if ($$1.bE() && !$$1.aX() && $$0.z.a(2) == 0) {
         List<btp> $$2 = $$0.a(btp.class, $$1.cL().g(20.0), cj);
         if (!$$2.isEmpty()) {
            btp $$3 = $$2.get($$0.z.a($$2.size()));
            if (!$$3.aX()) {
               avo $$4 = b($$3.am());
               $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), $$4, $$1.df(), 0.7F, a($$0.z));
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public bqr b(cmx $$0, bqq $$1) {
      cuq $$2 = $$0.b($$1);
      if (!this.s() && $$2.a(awn.aw)) {
         $$2.a(1, $$0);
         if (!this.aX()) {
            this.dP().a(null, this.du(), this.dw(), this.dA(), avp.sH, this.df(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
         }

         if (!this.dP().B) {
            if (this.ah.a(10) == 0) {
               this.a($$0);
               this.dP().a(this, (byte)7);
            } else {
               this.dP().a(this, (byte)6);
            }
         }

         return bqr.a(this.dP().B);
      } else if (!$$2.a(awn.ax)) {
         if (!this.gy() && this.s() && this.j($$0)) {
            if (!this.dP().B) {
               this.y(!this.gl());
            }

            return bqr.a(this.dP().B);
         } else {
            return super.b($$0, $$1);
         }
      } else {
         $$2.a(1, $$0);
         this.b(new brz(bsb.s, 900));
         if ($$0.f() || !this.cv()) {
            this.a(this.dQ().a($$0), Float.MAX_VALUE);
         }

         return bqr.a(this.dP().B);
      }
   }

   @Override
   public boolean o(cuq $$0) {
      return false;
   }

   public static boolean c(bsx<cfu> $$0, dcx $$1, btr $$2, jd $$3, ayw $$4) {
      return $$1.a_($$3.e()).a(awe.cb) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, dtc $$2, jd $$3) {
   }

   @Override
   public boolean a(cfe $$0) {
      return false;
   }

   @Nullable
   @Override
   public bsl a(aqu $$0, bsl $$1) {
      return null;
   }

   @Nullable
   @Override
   public avo v() {
      return a(this.dP(), this.dP().z);
   }

   public static avo a(dcw $$0, ayw $$1) {
      if ($$0.al() != bqo.a && $$1.a(1000) == 0) {
         List<bsx<?>> $$2 = Lists.newArrayList(ck.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return avp.sF;
      }
   }

   private static avo b(bsx<?> $$0) {
      return ck.getOrDefault($$0, avp.sF);
   }

   @Override
   protected avo d(brk $$0) {
      return avp.sJ;
   }

   @Override
   protected avo n_() {
      return avp.sG;
   }

   @Override
   protected void b(jd $$0, dtc $$1) {
      this.a(avp.tt, 0.15F, 1.0F);
   }

   @Override
   protected boolean aW() {
      return this.ab > this.cm;
   }

   @Override
   protected void aV() {
      this.a(avp.sI, 0.15F, 1.0F);
      this.cm = this.ab + this.cf / 2.0F;
   }

   @Override
   public float fc() {
      return a(this.ah);
   }

   public static float a(ayw $$0) {
      return ($$0.i() - $$0.i()) * 0.2F + 1.0F;
   }

   @Override
   public avq df() {
      return avq.g;
   }

   @Override
   public boolean bB() {
      return true;
   }

   @Override
   protected void E(bsr $$0) {
      if (!($$0 instanceof cmx)) {
         super.E($$0);
      }
   }

   @Override
   public boolean a(brk $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dP().B) {
            this.y(false);
         }

         return super.a($$0, $$1);
      }
   }

   public cfu.b gx() {
      return cfu.b.a(this.ao.a(ci));
   }

   public void a(cfu.b $$0) {
      this.ao.a(ci, $$0.h);
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(ci, 0);
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("Variant", this.gx().h);
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      this.a(cfu.b.a($$0.h("Variant")));
   }

   @Override
   public boolean gy() {
      return !this.aF();
   }

   @Override
   protected boolean gp() {
      return true;
   }

   @Override
   public exa cN() {
      return new exa(0.0, (double)(0.5F * this.cM()), (double)(this.dk() * 0.4F));
   }

   static class a extends cby {
      public a(btw $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected exa h() {
         exa $$0 = null;
         if (this.b.bf()) {
            $$0 = cem.a(this.b, 15, 15);
         }

         if (this.b.dS().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private exa k() {
         jd $$0 = this.b.dp();
         jd.a $$1 = new jd.a();
         jd.a $$2 = new jd.a();

         for (jd $$4 : jd.b(
            ayo.a(this.b.du() - 3.0),
            ayo.a(this.b.dw() - 6.0),
            ayo.a(this.b.dA() - 3.0),
            ayo.a(this.b.du() + 3.0),
            ayo.a(this.b.dw() + 6.0),
            ayo.a(this.b.dA() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               dtc $$5 = this.b.dP().a_($$2.a($$4, ji.a));
               boolean $$6 = $$5.b() instanceof dki || $$5.a(awe.t);
               if ($$6 && this.b.dP().u($$4) && this.b.dP().u($$1.a($$4, ji.b))) {
                  return exa.c($$4);
               }
            }
         }

         return null;
      }
   }

   public static enum b implements azk {
      a(0, "red_blue"),
      b(1, "blue"),
      c(2, "green"),
      d(3, "yellow_blue"),
      e(4, "gray");

      public static final Codec<cfu.b> f = azk.a(cfu.b::values);
      private static final IntFunction<cfu.b> g = axe.a(cfu.b::a, values(), axe.a.c);
      final int h;
      private final String i;

      private b(final int $$0, final String $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public int a() {
         return this.h;
      }

      public static cfu.b a(int $$0) {
         return g.apply($$0);
      }

      @Override
      public String c() {
         return this.i;
      }
   }
}
