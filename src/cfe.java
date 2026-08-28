import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfe extends cfl implements bty<cfe.b>, cex {
   private static final ajp<Integer> ch = ajt.a(cfe.class, ajr.b);
   private static final Predicate<bta> ci = new Predicate<bta>() {
      public boolean a(@Nullable bta $$0) {
         return $$0 != null && cfe.cj.containsKey($$0.ak());
      }
   };
   static final Map<bsj<?>, ave> cj = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bsj.i, avf.sK);
      $$0.put(bsj.l, avf.sL);
      $$0.put(bsj.m, avf.sM);
      $$0.put(bsj.q, avf.ti);
      $$0.put(bsj.x, avf.sN);
      $$0.put(bsj.B, avf.sO);
      $$0.put(bsj.D, avf.sP);
      $$0.put(bsj.F, avf.sQ);
      $$0.put(bsj.I, avf.sR);
      $$0.put(bsj.J, avf.sS);
      $$0.put(bsj.T, avf.sT);
      $$0.put(bsj.Y, avf.sU);
      $$0.put(bsj.Z, avf.sV);
      $$0.put(bsj.ac, avf.sW);
      $$0.put(bsj.ad, avf.sX);
      $$0.put(bsj.ap, avf.sY);
      $$0.put(bsj.ay, avf.sZ);
      $$0.put(bsj.aA, avf.ta);
      $$0.put(bsj.aB, avf.tb);
      $$0.put(bsj.aC, avf.tc);
      $$0.put(bsj.aH, avf.td);
      $$0.put(bsj.aK, avf.te);
      $$0.put(bsj.aM, avf.tf);
      $$0.put(bsj.aN, avf.tg);
      $$0.put(bsj.aP, avf.th);
      $$0.put(bsj.aW, avf.ti);
      $$0.put(bsj.aY, avf.tj);
      $$0.put(bsj.bi, avf.tk);
      $$0.put(bsj.bk, avf.tl);
      $$0.put(bsj.bm, avf.tm);
      $$0.put(bsj.bo, avf.tn);
      $$0.put(bsj.bp, avf.to);
      $$0.put(bsj.bq, avf.tp);
      $$0.put(bsj.bt, avf.tq);
      $$0.put(bsj.bu, avf.tr);
      $$0.put(bsj.bw, avf.ts);
   });
   public float cd;
   public float ce;
   public float cf;
   public float cg;
   private float ck = 1.0F;
   private float cl = 1.0F;
   private boolean cm;
   @Nullable
   private ja cn;

   public cfe(bsj<? extends cfe> $$0, dcd $$1) {
      super($$0, $$1);
      this.bR = new byw(this, 10, false);
      this.a(eos.n, -1.0F);
      this.a(eos.o, -1.0F);
      this.a(eos.x, -1.0F);
   }

   @Nullable
   @Override
   public btr a(dcs $$0, bqb $$1, btc $$2, @Nullable btr $$3) {
      this.a(ac.a(cfe.b.values(), $$0.E_()));
      if ($$3 == null) {
         $$3 = new brx.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean p_() {
      return false;
   }

   @Override
   protected void z() {
      this.bU.a(0, new cap(this, 1.25));
      this.bU.a(0, new bzq(this));
      this.bU.a(1, new cae(this, cmh.class, 8.0F));
      this.bU.a(2, new cbb(this));
      this.bU.a(2, new bzu(this, 1.0, 5.0F, 1.0F, true));
      this.bU.a(2, new cfe.a(this, 1.0));
      this.bU.a(3, new cab(this));
      this.bU.a(3, new bzt(this, 1.0, 3.0F, 7.0F));
   }

   public static buf.a gt() {
      return bta.A().a(bug.s, 6.0).a(bug.l, 0.4F).a(bug.v, 0.2F).a(bug.c, 3.0);
   }

   @Override
   protected cck b(dcd $$0) {
      cci $$1 = new cci(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   public void n_() {
      if (this.cn == null || !this.cn.a(this.dn(), 3.46) || !this.dP().a_(this.cn).a(dfh.dT)) {
         this.cm = false;
         this.cn = null;
      }

      if (this.dP().z.a(400) == 0) {
         a(this.dP(), this);
      }

      super.n_();
      this.gx();
   }

   @Override
   public void a(ja $$0, boolean $$1) {
      this.cn = $$0;
      this.cm = $$1;
   }

   public boolean gu() {
      return this.cm;
   }

   private void gx() {
      this.cg = this.cd;
      this.cf = this.ce;
      this.ce = this.ce + (float)(!this.aE() && !this.bR() ? 4 : -1) * 0.3F;
      this.ce = aye.a(this.ce, 0.0F, 1.0F);
      if (!this.aE() && this.ck < 1.0F) {
         this.ck = 1.0F;
      }

      this.ck *= 0.9F;
      evz $$0 = this.ds();
      if (!this.aE() && $$0.d < 0.0) {
         this.h($$0.d(1.0, 0.6, 1.0));
      }

      this.cd = this.cd + this.ck * 2.0F;
   }

   public static boolean a(dcd $$0, bsd $$1) {
      if ($$1.bD() && !$$1.aW() && $$0.z.a(2) == 0) {
         List<bta> $$2 = $$0.a(bta.class, $$1.cK().g(20.0), ci);
         if (!$$2.isEmpty()) {
            bta $$3 = $$2.get($$0.z.a($$2.size()));
            if (!$$3.aW()) {
               ave $$4 = b($$3.ak());
               $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), $$4, $$1.de(), 0.7F, a($$0.z));
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public bqd b(cmh $$0, bqc $$1) {
      cua $$2 = $$0.b($$1);
      if (!this.s() && $$2.a(awd.aw)) {
         $$2.a(1, $$0);
         if (!this.aW()) {
            this.dP().a(null, this.du(), this.dw(), this.dA(), avf.sH, this.de(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
         }

         if (!this.dP().B) {
            if (this.ah.a(10) == 0) {
               this.f($$0);
               this.dP().a(this, (byte)7);
            } else {
               this.dP().a(this, (byte)6);
            }
         }

         return bqd.a(this.dP().B);
      } else if (!$$2.a(awd.ax)) {
         if (!this.gA() && this.s() && this.j($$0)) {
            if (!this.dP().B) {
               this.y(!this.gn());
            }

            return bqd.a(this.dP().B);
         } else {
            return super.b($$0, $$1);
         }
      } else {
         $$2.a(1, $$0);
         this.b(new brl(brn.s, 900));
         if ($$0.f() || !this.cu()) {
            this.a(this.dQ().a($$0), Float.MAX_VALUE);
         }

         return bqd.a(this.dP().B);
      }
   }

   @Override
   public boolean o(cua $$0) {
      return false;
   }

   public static boolean c(bsj<cfe> $$0, dce $$1, btc $$2, ja $$3, aym $$4) {
      return $$1.a_($$3.d()).a(avu.cb) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, dsh $$2, ja $$3) {
   }

   @Override
   public boolean a(ceo $$0) {
      return false;
   }

   @Nullable
   @Override
   public brx a(aqk $$0, brx $$1) {
      return null;
   }

   @Nullable
   @Override
   public ave v() {
      return a(this.dP(), this.dP().z);
   }

   public static ave a(dcd $$0, aym $$1) {
      if ($$0.al() != bqa.a && $$1.a(1000) == 0) {
         List<bsj<?>> $$2 = Lists.newArrayList(cj.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return avf.sF;
      }
   }

   private static ave b(bsj<?> $$0) {
      return cj.getOrDefault($$0, avf.sF);
   }

   @Override
   protected ave d(bqw $$0) {
      return avf.sJ;
   }

   @Override
   protected ave o_() {
      return avf.sG;
   }

   @Override
   protected void b(ja $$0, dsh $$1) {
      this.a(avf.tt, 0.15F, 1.0F);
   }

   @Override
   protected boolean aV() {
      return this.ab > this.cl;
   }

   @Override
   protected void aU() {
      this.a(avf.sI, 0.15F, 1.0F);
      this.cl = this.ab + this.ce / 2.0F;
   }

   @Override
   public float fb() {
      return a(this.ah);
   }

   public static float a(aym $$0) {
      return ($$0.i() - $$0.i()) * 0.2F + 1.0F;
   }

   @Override
   public avg de() {
      return avg.g;
   }

   @Override
   public boolean bA() {
      return true;
   }

   @Override
   protected void E(bsd $$0) {
      if (!($$0 instanceof cmh)) {
         super.E($$0);
      }
   }

   @Override
   public boolean a(bqw $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dP().B) {
            this.y(false);
         }

         return super.a($$0, $$1);
      }
   }

   public cfe.b gv() {
      return cfe.b.a(this.ao.a(ch));
   }

   public void a(cfe.b $$0) {
      this.ao.a(ch, $$0.h);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(ch, 0);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("Variant", this.gv().h);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.a(cfe.b.a($$0.h("Variant")));
   }

   @Override
   public boolean gA() {
      return !this.aE();
   }

   @Override
   public evz cM() {
      return new evz(0.0, (double)(0.5F * this.cL()), (double)(this.dj() * 0.4F));
   }

   static class a extends cbi {
      public a(bth $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected evz h() {
         evz $$0 = null;
         if (this.b.be()) {
            $$0 = cdw.a(this.b, 15, 15);
         }

         if (this.b.dS().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private evz k() {
         ja $$0 = this.b.dp();
         ja.a $$1 = new ja.a();
         ja.a $$2 = new ja.a();

         for (ja $$4 : ja.b(
            aye.a(this.b.du() - 3.0),
            aye.a(this.b.dw() - 6.0),
            aye.a(this.b.dA() - 3.0),
            aye.a(this.b.du() + 3.0),
            aye.a(this.b.dw() + 6.0),
            aye.a(this.b.dA() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               dsh $$5 = this.b.dP().a_($$2.a($$4, jf.a));
               boolean $$6 = $$5.b() instanceof djp || $$5.a(avu.t);
               if ($$6 && this.b.dP().u($$4) && this.b.dP().u($$1.a($$4, jf.b))) {
                  return evz.c($$4);
               }
            }
         }

         return null;
      }
   }

   public static enum b implements ayz {
      a(0, "red_blue"),
      b(1, "blue"),
      c(2, "green"),
      d(3, "yellow_blue"),
      e(4, "gray");

      public static final Codec<cfe.b> f = ayz.a(cfe.b::values);
      private static final IntFunction<cfe.b> g = awu.a(cfe.b::a, values(), awu.a.c);
      final int h;
      private final String i;

      private b(final int $$0, final String $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public int a() {
         return this.h;
      }

      public static cfe.b a(int $$0) {
         return g.apply($$0);
      }

      @Override
      public String c() {
         return this.i;
      }
   }
}
