import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfi extends cfp implements buc<cfi.b>, cfb {
   private static final ajp<Integer> ch = ajt.a(cfi.class, ajr.b);
   private static final Predicate<bte> ci = new Predicate<bte>() {
      public boolean a(@Nullable bte $$0) {
         return $$0 != null && cfi.cj.containsKey($$0.am());
      }
   };
   static final Map<bsn<?>, avg> cj = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bsn.i, avh.sK);
      $$0.put(bsn.l, avh.sL);
      $$0.put(bsn.m, avh.sM);
      $$0.put(bsn.q, avh.ti);
      $$0.put(bsn.x, avh.sN);
      $$0.put(bsn.B, avh.sO);
      $$0.put(bsn.D, avh.sP);
      $$0.put(bsn.F, avh.sQ);
      $$0.put(bsn.I, avh.sR);
      $$0.put(bsn.J, avh.sS);
      $$0.put(bsn.T, avh.sT);
      $$0.put(bsn.Y, avh.sU);
      $$0.put(bsn.Z, avh.sV);
      $$0.put(bsn.ac, avh.sW);
      $$0.put(bsn.ad, avh.sX);
      $$0.put(bsn.ap, avh.sY);
      $$0.put(bsn.ay, avh.sZ);
      $$0.put(bsn.aA, avh.ta);
      $$0.put(bsn.aB, avh.tb);
      $$0.put(bsn.aC, avh.tc);
      $$0.put(bsn.aH, avh.td);
      $$0.put(bsn.aK, avh.te);
      $$0.put(bsn.aM, avh.tf);
      $$0.put(bsn.aN, avh.tg);
      $$0.put(bsn.aP, avh.th);
      $$0.put(bsn.aW, avh.ti);
      $$0.put(bsn.aY, avh.tj);
      $$0.put(bsn.bi, avh.tk);
      $$0.put(bsn.bk, avh.tl);
      $$0.put(bsn.bm, avh.tm);
      $$0.put(bsn.bo, avh.tn);
      $$0.put(bsn.bp, avh.to);
      $$0.put(bsn.bq, avh.tp);
      $$0.put(bsn.bt, avh.tq);
      $$0.put(bsn.bu, avh.tr);
      $$0.put(bsn.bw, avh.ts);
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

   public cfi(bsn<? extends cfi> $$0, dcg $$1) {
      super($$0, $$1);
      this.bR = new bza(this, 10, false);
      this.a(epa.n, -1.0F);
      this.a(epa.o, -1.0F);
      this.a(epa.x, -1.0F);
   }

   @Nullable
   @Override
   public btv a(dcv $$0, bqf $$1, btg $$2, @Nullable btv $$3) {
      this.a(ac.a(cfi.b.values(), $$0.E_()));
      if ($$3 == null) {
         $$3 = new bsb.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean o_() {
      return false;
   }

   @Override
   protected void z() {
      this.bU.a(0, new cat(this, 1.25));
      this.bU.a(0, new bzu(this));
      this.bU.a(1, new cai(this, cml.class, 8.0F));
      this.bU.a(2, new cbf(this));
      this.bU.a(2, new bzy(this, 1.0, 5.0F, 1.0F, true));
      this.bU.a(2, new cfi.a(this, 1.0));
      this.bU.a(3, new caf(this));
      this.bU.a(3, new bzx(this, 1.0, 3.0F, 7.0F));
   }

   public static buj.a gt() {
      return bte.A().a(buk.s, 6.0).a(buk.l, 0.4F).a(buk.v, 0.2F).a(buk.c, 3.0);
   }

   @Override
   protected cco b(dcg $$0) {
      ccm $$1 = new ccm(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   public void m_() {
      if (this.cn == null || !this.cn.a(this.dp(), 3.46) || !this.dR().a_(this.cn).a(dfk.dT)) {
         this.cm = false;
         this.cn = null;
      }

      if (this.dR().z.a(400) == 0) {
         a(this.dR(), this);
      }

      super.m_();
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
      this.ce = this.ce + (float)(!this.aG() && !this.bT() ? 4 : -1) * 0.3F;
      this.ce = ayg.a(this.ce, 0.0F, 1.0F);
      if (!this.aG() && this.ck < 1.0F) {
         this.ck = 1.0F;
      }

      this.ck *= 0.9F;
      ewh $$0 = this.du();
      if (!this.aG() && $$0.d < 0.0) {
         this.j($$0.d(1.0, 0.6, 1.0));
      }

      this.cd = this.cd + this.ck * 2.0F;
   }

   public static boolean a(dcg $$0, bsh $$1) {
      if ($$1.bF() && !$$1.aY() && $$0.z.a(2) == 0) {
         List<bte> $$2 = $$0.a(bte.class, $$1.cM().g(20.0), ci);
         if (!$$2.isEmpty()) {
            bte $$3 = $$2.get($$0.z.a($$2.size()));
            if (!$$3.aY()) {
               avg $$4 = b($$3.am());
               $$0.a(null, $$1.dw(), $$1.dy(), $$1.dC(), $$4, $$1.dg(), 0.7F, a($$0.z));
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public bqh b(cml $$0, bqg $$1) {
      cud $$2 = $$0.b($$1);
      if (!this.s() && $$2.a(awf.aw)) {
         $$2.a(1, $$0);
         if (!this.aY()) {
            this.dR().a(null, this.dw(), this.dy(), this.dC(), avh.sH, this.dg(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
         }

         if (!this.dR().B) {
            if (this.ah.a(10) == 0) {
               this.f($$0);
               this.dR().a(this, (byte)7);
            } else {
               this.dR().a(this, (byte)6);
            }
         }

         return bqh.a(this.dR().B);
      } else if (!$$2.a(awf.ax)) {
         if (!this.gA() && this.s() && this.j($$0)) {
            if (!this.dR().B) {
               this.y(!this.gn());
            }

            return bqh.a(this.dR().B);
         } else {
            return super.b($$0, $$1);
         }
      } else {
         $$2.a(1, $$0);
         this.b(new brp(brr.s, 900));
         if ($$0.f() || !this.cw()) {
            this.a(this.dS().a($$0), Float.MAX_VALUE);
         }

         return bqh.a(this.dR().B);
      }
   }

   @Override
   public boolean o(cud $$0) {
      return false;
   }

   public static boolean c(bsn<cfi> $$0, dch $$1, btg $$2, ja $$3, ayo $$4) {
      return $$1.a_($$3.d()).a(avw.cb) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, dsl $$2, ja $$3) {
   }

   @Override
   public boolean a(ces $$0) {
      return false;
   }

   @Nullable
   @Override
   public bsb a(aqm $$0, bsb $$1) {
      return null;
   }

   @Nullable
   @Override
   public avg v() {
      return a(this.dR(), this.dR().z);
   }

   public static avg a(dcg $$0, ayo $$1) {
      if ($$0.al() != bqe.a && $$1.a(1000) == 0) {
         List<bsn<?>> $$2 = Lists.newArrayList(cj.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return avh.sF;
      }
   }

   private static avg b(bsn<?> $$0) {
      return cj.getOrDefault($$0, avh.sF);
   }

   @Override
   protected avg d(bra $$0) {
      return avh.sJ;
   }

   @Override
   protected avg n_() {
      return avh.sG;
   }

   @Override
   protected void b(ja $$0, dsl $$1) {
      this.a(avh.tt, 0.15F, 1.0F);
   }

   @Override
   protected boolean aX() {
      return this.ab > this.cl;
   }

   @Override
   protected void aW() {
      this.a(avh.sI, 0.15F, 1.0F);
      this.cl = this.ab + this.ce / 2.0F;
   }

   @Override
   public float fd() {
      return a(this.ah);
   }

   public static float a(ayo $$0) {
      return ($$0.i() - $$0.i()) * 0.2F + 1.0F;
   }

   @Override
   public avi dg() {
      return avi.g;
   }

   @Override
   public boolean bC() {
      return true;
   }

   @Override
   protected void E(bsh $$0) {
      if (!($$0 instanceof cml)) {
         super.E($$0);
      }
   }

   @Override
   public boolean a(bra $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dR().B) {
            this.y(false);
         }

         return super.a($$0, $$1);
      }
   }

   public cfi.b gv() {
      return cfi.b.a(this.ao.a(ch));
   }

   public void a(cfi.b $$0) {
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
      this.a(cfi.b.a($$0.h("Variant")));
   }

   @Override
   public boolean gA() {
      return !this.aG();
   }

   @Override
   public ewh cO() {
      return new ewh(0.0, (double)(0.5F * this.cN()), (double)(this.dl() * 0.4F));
   }

   static class a extends cbm {
      public a(btl $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected ewh h() {
         ewh $$0 = null;
         if (this.b.bg()) {
            $$0 = cea.a(this.b, 15, 15);
         }

         if (this.b.dU().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private ewh k() {
         ja $$0 = this.b.dr();
         ja.a $$1 = new ja.a();
         ja.a $$2 = new ja.a();

         for (ja $$4 : ja.b(
            ayg.a(this.b.dw() - 3.0),
            ayg.a(this.b.dy() - 6.0),
            ayg.a(this.b.dC() - 3.0),
            ayg.a(this.b.dw() + 3.0),
            ayg.a(this.b.dy() + 6.0),
            ayg.a(this.b.dC() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               dsl $$5 = this.b.dR().a_($$2.a($$4, jf.a));
               boolean $$6 = $$5.b() instanceof djs || $$5.a(avw.t);
               if ($$6 && this.b.dR().u($$4) && this.b.dR().u($$1.a($$4, jf.b))) {
                  return ewh.c($$4);
               }
            }
         }

         return null;
      }
   }

   public static enum b implements azc {
      a(0, "red_blue"),
      b(1, "blue"),
      c(2, "green"),
      d(3, "yellow_blue"),
      e(4, "gray");

      public static final Codec<cfi.b> f = azc.a(cfi.b::values);
      private static final IntFunction<cfi.b> g = aww.a(cfi.b::a, values(), aww.a.c);
      final int h;
      private final String i;

      private b(final int $$0, final String $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public int a() {
         return this.h;
      }

      public static cfi.b a(int $$0) {
         return g.apply($$0);
      }

      @Override
      public String c() {
         return this.i;
      }
   }
}
