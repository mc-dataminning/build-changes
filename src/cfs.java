import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfs extends cfz implements bum<cfs.b>, cfl {
   private static final ajv<Integer> ci = ajz.a(cfs.class, ajx.b);
   private static final Predicate<btn> cj = new Predicate<btn>() {
      public boolean a(@Nullable btn $$0) {
         return $$0 != null && cfs.ck.containsKey($$0.am());
      }
   };
   static final Map<bsw<?>, avn> ck = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bsw.i, avo.sK);
      $$0.put(bsw.l, avo.sL);
      $$0.put(bsw.m, avo.sM);
      $$0.put(bsw.q, avo.ti);
      $$0.put(bsw.x, avo.sN);
      $$0.put(bsw.B, avo.sO);
      $$0.put(bsw.D, avo.sP);
      $$0.put(bsw.F, avo.sQ);
      $$0.put(bsw.I, avo.sR);
      $$0.put(bsw.J, avo.sS);
      $$0.put(bsw.T, avo.sT);
      $$0.put(bsw.Y, avo.sU);
      $$0.put(bsw.Z, avo.sV);
      $$0.put(bsw.ac, avo.sW);
      $$0.put(bsw.ad, avo.sX);
      $$0.put(bsw.ap, avo.sY);
      $$0.put(bsw.ay, avo.sZ);
      $$0.put(bsw.aA, avo.ta);
      $$0.put(bsw.aB, avo.tb);
      $$0.put(bsw.aC, avo.tc);
      $$0.put(bsw.aH, avo.td);
      $$0.put(bsw.aK, avo.te);
      $$0.put(bsw.aM, avo.tf);
      $$0.put(bsw.aN, avo.tg);
      $$0.put(bsw.aP, avo.th);
      $$0.put(bsw.aW, avo.ti);
      $$0.put(bsw.aY, avo.tj);
      $$0.put(bsw.bi, avo.tk);
      $$0.put(bsw.bk, avo.tl);
      $$0.put(bsw.bm, avo.tm);
      $$0.put(bsw.bo, avo.tn);
      $$0.put(bsw.bp, avo.to);
      $$0.put(bsw.bq, avo.tp);
      $$0.put(bsw.bt, avo.tq);
      $$0.put(bsw.bu, avo.tr);
      $$0.put(bsw.bw, avo.ts);
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

   public cfs(bsw<? extends cfs> $$0, dcu $$1) {
      super($$0, $$1);
      this.bR = new bzk(this, 10, false);
      this.a(epp.n, -1.0F);
      this.a(epp.o, -1.0F);
      this.a(epp.x, -1.0F);
   }

   @Nullable
   @Override
   public buf a(ddj $$0, bqo $$1, btp $$2, @Nullable buf $$3) {
      this.a(ad.a(cfs.b.values(), $$0.E_()));
      if ($$3 == null) {
         $$3 = new bsk.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean o_() {
      return false;
   }

   @Override
   protected void z() {
      this.bU.a(0, new buj.a(1.25));
      this.bU.a(0, new cae(this));
      this.bU.a(1, new cas(this, cmv.class, 8.0F));
      this.bU.a(2, new cbp(this));
      this.bU.a(2, new cai(this, 1.0, 5.0F, 1.0F));
      this.bU.a(2, new cfs.a(this, 1.0));
      this.bU.a(3, new cap(this));
      this.bU.a(3, new cah(this, 1.0, 3.0F, 7.0F));
   }

   public static but.a gw() {
      return btn.A().a(buu.s, 6.0).a(buu.l, 0.4F).a(buu.v, 0.2F).a(buu.c, 3.0);
   }

   @Override
   protected ccy b(dcu $$0) {
      ccw $$1 = new ccw(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   public void m_() {
      if (this.co == null || !this.co.a(this.do(), 3.46) || !this.dQ().a_(this.co).a(dfy.dT)) {
         this.cn = false;
         this.co = null;
      }

      if (this.dQ().z.a(400) == 0) {
         a(this.dQ(), this);
      }

      super.m_();
      this.gB();
   }

   @Override
   public void a(jd $$0, boolean $$1) {
      this.co = $$0;
      this.cn = $$1;
   }

   public boolean gx() {
      return this.cn;
   }

   private void gB() {
      this.ch = this.ce;
      this.cg = this.cf;
      this.cf = this.cf + (float)(!this.aF() && !this.bS() ? 4 : -1) * 0.3F;
      this.cf = ayn.a(this.cf, 0.0F, 1.0F);
      if (!this.aF() && this.cl < 1.0F) {
         this.cl = 1.0F;
      }

      this.cl *= 0.9F;
      eww $$0 = this.dt();
      if (!this.aF() && $$0.d < 0.0) {
         this.i($$0.d(1.0, 0.6, 1.0));
      }

      this.ce = this.ce + this.cl * 2.0F;
   }

   public static boolean a(dcu $$0, bsq $$1) {
      if ($$1.bE() && !$$1.aX() && $$0.z.a(2) == 0) {
         List<btn> $$2 = $$0.a(btn.class, $$1.cL().g(20.0), cj);
         if (!$$2.isEmpty()) {
            btn $$3 = $$2.get($$0.z.a($$2.size()));
            if (!$$3.aX()) {
               avn $$4 = b($$3.am());
               $$0.a(null, $$1.dv(), $$1.dx(), $$1.dB(), $$4, $$1.df(), 0.7F, a($$0.z));
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public bqq b(cmv $$0, bqp $$1) {
      cuo $$2 = $$0.b($$1);
      if (!this.s() && $$2.a(awm.aw)) {
         $$2.a(1, $$0);
         if (!this.aX()) {
            this.dQ().a(null, this.dv(), this.dx(), this.dB(), avo.sH, this.df(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
         }

         if (!this.dQ().B) {
            if (this.ah.a(10) == 0) {
               this.f($$0);
               this.dQ().a(this, (byte)7);
            } else {
               this.dQ().a(this, (byte)6);
            }
         }

         return bqq.a(this.dQ().B);
      } else if (!$$2.a(awm.ax)) {
         if (!this.gz() && this.s() && this.j($$0)) {
            if (!this.dQ().B) {
               this.y(!this.gm());
            }

            return bqq.a(this.dQ().B);
         } else {
            return super.b($$0, $$1);
         }
      } else {
         $$2.a(1, $$0);
         this.b(new bry(bsa.s, 900));
         if ($$0.f() || !this.cv()) {
            this.a(this.dR().a($$0), Float.MAX_VALUE);
         }

         return bqq.a(this.dQ().B);
      }
   }

   @Override
   public boolean o(cuo $$0) {
      return false;
   }

   public static boolean c(bsw<cfs> $$0, dcv $$1, btp $$2, jd $$3, ayv $$4) {
      return $$1.a_($$3.d()).a(awd.cb) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, dta $$2, jd $$3) {
   }

   @Override
   public boolean a(cfc $$0) {
      return false;
   }

   @Nullable
   @Override
   public bsk a(aqt $$0, bsk $$1) {
      return null;
   }

   @Nullable
   @Override
   public avn v() {
      return a(this.dQ(), this.dQ().z);
   }

   public static avn a(dcu $$0, ayv $$1) {
      if ($$0.al() != bqn.a && $$1.a(1000) == 0) {
         List<bsw<?>> $$2 = Lists.newArrayList(ck.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return avo.sF;
      }
   }

   private static avn b(bsw<?> $$0) {
      return ck.getOrDefault($$0, avo.sF);
   }

   @Override
   protected avn d(brj $$0) {
      return avo.sJ;
   }

   @Override
   protected avn n_() {
      return avo.sG;
   }

   @Override
   protected void b(jd $$0, dta $$1) {
      this.a(avo.tt, 0.15F, 1.0F);
   }

   @Override
   protected boolean aW() {
      return this.ab > this.cm;
   }

   @Override
   protected void aV() {
      this.a(avo.sI, 0.15F, 1.0F);
      this.cm = this.ab + this.cf / 2.0F;
   }

   @Override
   public float fc() {
      return a(this.ah);
   }

   public static float a(ayv $$0) {
      return ($$0.i() - $$0.i()) * 0.2F + 1.0F;
   }

   @Override
   public avp df() {
      return avp.g;
   }

   @Override
   public boolean bB() {
      return true;
   }

   @Override
   protected void E(bsq $$0) {
      if (!($$0 instanceof cmv)) {
         super.E($$0);
      }
   }

   @Override
   public boolean a(brj $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dQ().B) {
            this.y(false);
         }

         return super.a($$0, $$1);
      }
   }

   public cfs.b gy() {
      return cfs.b.a(this.ao.a(ci));
   }

   public void a(cfs.b $$0) {
      this.ao.a(ci, $$0.h);
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(ci, 0);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Variant", this.gy().h);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.a(cfs.b.a($$0.h("Variant")));
   }

   @Override
   public boolean gz() {
      return !this.aF();
   }

   @Override
   protected boolean gq() {
      return true;
   }

   @Override
   public eww cN() {
      return new eww(0.0, (double)(0.5F * this.cM()), (double)(this.dk() * 0.4F));
   }

   static class a extends cbw {
      public a(btu $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected eww h() {
         eww $$0 = null;
         if (this.b.bf()) {
            $$0 = cek.a(this.b, 15, 15);
         }

         if (this.b.dT().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private eww k() {
         jd $$0 = this.b.dq();
         jd.a $$1 = new jd.a();
         jd.a $$2 = new jd.a();

         for (jd $$4 : jd.b(
            ayn.a(this.b.dv() - 3.0),
            ayn.a(this.b.dx() - 6.0),
            ayn.a(this.b.dB() - 3.0),
            ayn.a(this.b.dv() + 3.0),
            ayn.a(this.b.dx() + 6.0),
            ayn.a(this.b.dB() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               dta $$5 = this.b.dQ().a_($$2.a($$4, ji.a));
               boolean $$6 = $$5.b() instanceof dkg || $$5.a(awd.t);
               if ($$6 && this.b.dQ().u($$4) && this.b.dQ().u($$1.a($$4, ji.b))) {
                  return eww.c($$4);
               }
            }
         }

         return null;
      }
   }

   public static enum b implements azj {
      a(0, "red_blue"),
      b(1, "blue"),
      c(2, "green"),
      d(3, "yellow_blue"),
      e(4, "gray");

      public static final Codec<cfs.b> f = azj.a(cfs.b::values);
      private static final IntFunction<cfs.b> g = axd.a(cfs.b::a, values(), axd.a.c);
      final int h;
      private final String i;

      private b(final int $$0, final String $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public int a() {
         return this.h;
      }

      public static cfs.b a(int $$0) {
         return g.apply($$0);
      }

      @Override
      public String c() {
         return this.i;
      }
   }
}
