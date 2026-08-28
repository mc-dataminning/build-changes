import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfu extends cgb implements buo<cfu.b>, cfn {
   private static final ajw<Integer> ck = aka.a(cfu.class, ajy.b);
   private static final Predicate<btp> cl = new Predicate<btp>() {
      public boolean a(@Nullable btp $$0) {
         return $$0 != null && cfu.cm.containsKey($$0.am());
      }
   };
   static final Map<bsx<?>, avo> cm = ad.a(Maps.newHashMap(), $$0 -> {
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
   public float cg;
   public float ch;
   public float ci;
   public float cj;
   private float cn = 1.0F;
   private float co = 1.0F;
   private boolean cp;
   @Nullable
   private jd cq;

   public cfu(bsx<? extends cfu> $$0, dcw $$1) {
      super($$0, $$1);
      this.bT = new bzm(this, 10, false);
      this.a(epv.n, -1.0F);
      this.a(epv.o, -1.0F);
      this.a(epv.x, -1.0F);
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
      this.bW.a(0, new bul.a(1.25));
      this.bW.a(0, new cag(this));
      this.bW.a(1, new cau(this, cmx.class, 8.0F));
      this.bW.a(2, new cbr(this));
      this.bW.a(2, new cak(this, 1.0, 5.0F, 1.0F));
      this.bW.a(2, new cfu.a(this, 1.0));
      this.bW.a(3, new car(this));
      this.bW.a(3, new caj(this, 1.0, 3.0F, 7.0F));
   }

   public static buv.a gu() {
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
      if (this.cq == null || !this.cq.a(this.dm(), 3.46) || !this.dO().a_(this.cq).a(dga.dT)) {
         this.cp = false;
         this.cq = null;
      }

      if (this.dO().z.a(400) == 0) {
         a(this.dO(), this);
      }

      super.m_();
      this.gz();
   }

   @Override
   public void a(jd $$0, boolean $$1) {
      this.cq = $$0;
      this.cp = $$1;
   }

   public boolean gv() {
      return this.cp;
   }

   private void gz() {
      this.cj = this.cg;
      this.ci = this.ch;
      this.ch = this.ch + (float)(!this.aF() && !this.bS() ? 4 : -1) * 0.3F;
      this.ch = ayo.a(this.ch, 0.0F, 1.0F);
      if (!this.aF() && this.cn < 1.0F) {
         this.cn = 1.0F;
      }

      this.cn *= 0.9F;
      exc $$0 = this.dr();
      if (!this.aF() && $$0.d < 0.0) {
         this.i($$0.d(1.0, 0.6, 1.0));
      }

      this.cg = this.cg + this.cn * 2.0F;
   }

   public static boolean a(dcw $$0, bsr $$1) {
      if ($$1.bE() && !$$1.aX() && $$0.z.a(2) == 0) {
         List<btp> $$2 = $$0.a(btp.class, $$1.cK().g(20.0), cl);
         if (!$$2.isEmpty()) {
            btp $$3 = $$2.get($$0.z.a($$2.size()));
            if (!$$3.aX()) {
               avo $$4 = b($$3.am());
               $$0.a(null, $$1.dt(), $$1.dv(), $$1.dz(), $$4, $$1.de(), 0.7F, a($$0.z));
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
            this.dO().a(null, this.dt(), this.dv(), this.dz(), avp.sH, this.de(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
         }

         if (!this.dO().B) {
            if (this.ah.a(10) == 0) {
               this.a($$0);
               this.dO().a(this, (byte)7);
            } else {
               this.dO().a(this, (byte)6);
            }
         }

         return bqr.a(this.dO().B);
      } else if (!$$2.a(awn.ax)) {
         if (!this.gx() && this.s() && this.j($$0)) {
            if (!this.dO().B) {
               this.z(!this.gk());
            }

            return bqr.a(this.dO().B);
         } else {
            return super.b($$0, $$1);
         }
      } else {
         $$2.a(1, $$0);
         this.b(new brz(bsb.s, 900));
         if ($$0.f() || !this.cv()) {
            this.a(this.dP().a($$0), Float.MAX_VALUE);
         }

         return bqr.a(this.dO().B);
      }
   }

   @Override
   public boolean o(cuq $$0) {
      return false;
   }

   public static boolean c(bsx<cfu> $$0, dcx $$1, btr $$2, jd $$3, ayw $$4) {
      return $$1.a_($$3.e()).a(awe.cc) && a($$1, $$3);
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
      return a(this.dO(), this.dO().z);
   }

   public static avo a(dcw $$0, ayw $$1) {
      if ($$0.al() != bqo.a && $$1.a(1000) == 0) {
         List<bsx<?>> $$2 = Lists.newArrayList(cm.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return avp.sF;
      }
   }

   private static avo b(bsx<?> $$0) {
      return cm.getOrDefault($$0, avp.sF);
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
      return this.ab > this.co;
   }

   @Override
   protected void aV() {
      this.a(avp.sI, 0.15F, 1.0F);
      this.co = this.ab + this.ch / 2.0F;
   }

   @Override
   public float fb() {
      return a(this.ah);
   }

   public static float a(ayw $$0) {
      return ($$0.i() - $$0.i()) * 0.2F + 1.0F;
   }

   @Override
   public avq de() {
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
         if (!this.dO().B) {
            this.z(false);
         }

         return super.a($$0, $$1);
      }
   }

   public cfu.b gw() {
      return cfu.b.a(this.ao.a(ck));
   }

   public void a(cfu.b $$0) {
      this.ao.a(ck, $$0.h);
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(ck, 0);
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("Variant", this.gw().h);
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      this.a(cfu.b.a($$0.h("Variant")));
   }

   @Override
   public boolean gx() {
      return !this.aF();
   }

   @Override
   protected boolean go() {
      return true;
   }

   @Override
   public exc cM() {
      return new exc(0.0, (double)(0.5F * this.cL()), (double)(this.dj() * 0.4F));
   }

   static class a extends cby {
      public a(btw $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected exc h() {
         exc $$0 = null;
         if (this.b.bf()) {
            $$0 = cem.a(this.b, 15, 15);
         }

         if (this.b.dR().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private exc k() {
         jd $$0 = this.b.do();
         jd.a $$1 = new jd.a();
         jd.a $$2 = new jd.a();

         for (jd $$4 : jd.b(
            ayo.a(this.b.dt() - 3.0),
            ayo.a(this.b.dv() - 6.0),
            ayo.a(this.b.dz() - 3.0),
            ayo.a(this.b.dt() + 3.0),
            ayo.a(this.b.dv() + 6.0),
            ayo.a(this.b.dz() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               dtc $$5 = this.b.dO().a_($$2.a($$4, ji.a));
               boolean $$6 = $$5.b() instanceof dki || $$5.a(awe.u);
               if ($$6 && this.b.dO().u($$4) && this.b.dO().u($$1.a($$4, ji.b))) {
                  return exc.c($$4);
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
