import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ceu extends cfb implements bto<ceu.b>, cen {
   private static final ajr<Integer> cf = ajv.a(ceu.class, ajt.b);
   private static final Predicate<bsq> cg = new Predicate<bsq>() {
      public boolean a(@Nullable bsq $$0) {
         return $$0 != null && ceu.ch.containsKey($$0.ak());
      }
   };
   static final Map<bsa<?>, avg> ch = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bsa.i, avh.sH);
      $$0.put(bsa.l, avh.sI);
      $$0.put(bsa.m, avh.sJ);
      $$0.put(bsa.q, avh.tf);
      $$0.put(bsa.x, avh.sK);
      $$0.put(bsa.B, avh.sL);
      $$0.put(bsa.D, avh.sM);
      $$0.put(bsa.F, avh.sN);
      $$0.put(bsa.I, avh.sO);
      $$0.put(bsa.J, avh.sP);
      $$0.put(bsa.T, avh.sQ);
      $$0.put(bsa.Y, avh.sR);
      $$0.put(bsa.Z, avh.sS);
      $$0.put(bsa.ac, avh.sT);
      $$0.put(bsa.ad, avh.sU);
      $$0.put(bsa.ap, avh.sV);
      $$0.put(bsa.ay, avh.sW);
      $$0.put(bsa.aA, avh.sX);
      $$0.put(bsa.aB, avh.sY);
      $$0.put(bsa.aC, avh.sZ);
      $$0.put(bsa.aH, avh.ta);
      $$0.put(bsa.aK, avh.tb);
      $$0.put(bsa.aM, avh.tc);
      $$0.put(bsa.aN, avh.td);
      $$0.put(bsa.aP, avh.te);
      $$0.put(bsa.aW, avh.tf);
      $$0.put(bsa.aY, avh.tg);
      $$0.put(bsa.bi, avh.th);
      $$0.put(bsa.bk, avh.ti);
      $$0.put(bsa.bm, avh.tj);
      $$0.put(bsa.bo, avh.tk);
      $$0.put(bsa.bp, avh.tl);
      $$0.put(bsa.bq, avh.tm);
      $$0.put(bsa.bt, avh.tn);
      $$0.put(bsa.bu, avh.to);
      $$0.put(bsa.bw, avh.tp);
   });
   public float cb;
   public float cc;
   public float cd;
   public float ce;
   private float ci = 1.0F;
   private float cj = 1.0F;
   private boolean ck;
   @Nullable
   private io cl;

   public ceu(bsa<? extends ceu> $$0, dax $$1) {
      super($$0, $$1);
      this.bP = new bym(this, 10, false);
      this.a(enl.n, -1.0F);
      this.a(enl.o, -1.0F);
      this.a(enl.x, -1.0F);
   }

   @Nullable
   @Override
   public bth a(dbm $$0, bps $$1, bss $$2, @Nullable bth $$3) {
      this.a(ac.a(ceu.b.values(), $$0.E_()));
      if ($$3 == null) {
         $$3 = new bro.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean p_() {
      return false;
   }

   @Override
   protected void z() {
      this.bS.a(0, new caf(this, 1.25));
      this.bS.a(0, new bzg(this));
      this.bS.a(1, new bzu(this, clw.class, 8.0F));
      this.bS.a(2, new car(this));
      this.bS.a(2, new bzk(this, 1.0, 5.0F, 1.0F, true));
      this.bS.a(2, new ceu.a(this, 1.0));
      this.bS.a(3, new bzr(this));
      this.bS.a(3, new bzj(this, 1.0, 3.0F, 7.0F));
   }

   public static btv.a gv() {
      return bsq.A().a(btw.q, 6.0).a(btw.j, 0.4F).a(btw.r, 0.2F);
   }

   @Override
   protected cca b(dax $$0) {
      cby $$1 = new cby(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   public void n_() {
      if (this.cl == null || !this.cl.a(this.dn(), 3.46) || !this.dP().a_(this.cl).a(dea.dT)) {
         this.ck = false;
         this.cl = null;
      }

      if (this.dP().z.a(400) == 0) {
         a(this.dP(), this);
      }

      super.n_();
      this.gz();
   }

   @Override
   public void a(io $$0, boolean $$1) {
      this.cl = $$0;
      this.ck = $$1;
   }

   public boolean gw() {
      return this.ck;
   }

   private void gz() {
      this.ce = this.cb;
      this.cd = this.cc;
      this.cc = this.cc + (float)(!this.aE() && !this.bR() ? 4 : -1) * 0.3F;
      this.cc = ayd.a(this.cc, 0.0F, 1.0F);
      if (!this.aE() && this.ci < 1.0F) {
         this.ci = 1.0F;
      }

      this.ci *= 0.9F;
      euk $$0 = this.ds();
      if (!this.aE() && $$0.d < 0.0) {
         this.g($$0.d(1.0, 0.6, 1.0));
      }

      this.cb = this.cb + this.ci * 2.0F;
   }

   public static boolean a(dax $$0, bru $$1) {
      if ($$1.bD() && !$$1.aW() && $$0.z.a(2) == 0) {
         List<bsq> $$2 = $$0.a(bsq.class, $$1.cK().g(20.0), cg);
         if (!$$2.isEmpty()) {
            bsq $$3 = $$2.get($$0.z.a($$2.size()));
            if (!$$3.aW()) {
               avg $$4 = b($$3.ak());
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
   public bpu b(clw $$0, bpt $$1) {
      cto $$2 = $$0.b($$1);
      if (!this.s() && $$2.a(awe.aw)) {
         $$2.a(1, $$0);
         if (!this.aW()) {
            this.dP().a(null, this.du(), this.dw(), this.dA(), avh.sE, this.de(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
         }

         if (!this.dP().B) {
            if (this.ah.a(10) == 0) {
               this.f($$0);
               this.dP().a(this, (byte)7);
            } else {
               this.dP().a(this, (byte)6);
            }
         }

         return bpu.a(this.dP().B);
      } else if (!$$2.a(awe.ax)) {
         if (!this.gC() && this.s() && this.j($$0)) {
            if (!this.dP().B) {
               this.y(!this.gp());
            }

            return bpu.a(this.dP().B);
         } else {
            return super.b($$0, $$1);
         }
      } else {
         $$2.a(1, $$0);
         this.b(new brc(bre.s, 900));
         if ($$0.f() || !this.cu()) {
            this.a(this.dQ().a($$0), Float.MAX_VALUE);
         }

         return bpu.a(this.dP().B);
      }
   }

   @Override
   public boolean o(cto $$0) {
      return false;
   }

   public static boolean c(bsa<ceu> $$0, day $$1, bss $$2, io $$3, ayk $$4) {
      return $$1.a_($$3.d()).a(avw.cb) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, drb $$2, io $$3) {
   }

   @Override
   public boolean a(cee $$0) {
      return false;
   }

   @Nullable
   @Override
   public bro a(aqm $$0, bro $$1) {
      return null;
   }

   @Override
   public boolean C(bru $$0) {
      return $$0.a(this.dQ().b((bso)this), 3.0F);
   }

   @Nullable
   @Override
   public avg v() {
      return a(this.dP(), this.dP().z);
   }

   public static avg a(dax $$0, ayk $$1) {
      if ($$0.ak() != bpr.a && $$1.a(1000) == 0) {
         List<bsa<?>> $$2 = Lists.newArrayList(ch.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return avh.sC;
      }
   }

   private static avg b(bsa<?> $$0) {
      return ch.getOrDefault($$0, avh.sC);
   }

   @Override
   protected avg d(bqn $$0) {
      return avh.sG;
   }

   @Override
   protected avg o_() {
      return avh.sD;
   }

   @Override
   protected void b(io $$0, drb $$1) {
      this.a(avh.tq, 0.15F, 1.0F);
   }

   @Override
   protected boolean aV() {
      return this.ab > this.cj;
   }

   @Override
   protected void aU() {
      this.a(avh.sF, 0.15F, 1.0F);
      this.cj = this.ab + this.cc / 2.0F;
   }

   @Override
   public float ff() {
      return a(this.ah);
   }

   public static float a(ayk $$0) {
      return ($$0.i() - $$0.i()) * 0.2F + 1.0F;
   }

   @Override
   public avi de() {
      return avi.g;
   }

   @Override
   public boolean bA() {
      return true;
   }

   @Override
   protected void D(bru $$0) {
      if (!($$0 instanceof clw)) {
         super.D($$0);
      }
   }

   @Override
   public boolean a(bqn $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dP().B) {
            this.y(false);
         }

         return super.a($$0, $$1);
      }
   }

   public ceu.b gx() {
      return ceu.b.a(this.ao.a(cf));
   }

   public void a(ceu.b $$0) {
      this.ao.a(cf, $$0.h);
   }

   @Override
   protected void a(ajv.a $$0) {
      super.a($$0);
      $$0.a(cf, 0);
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("Variant", this.gx().h);
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      this.a(ceu.b.a($$0.h("Variant")));
   }

   @Override
   public boolean gC() {
      return !this.aE();
   }

   @Override
   public euk cM() {
      return new euk(0.0, (double)(0.5F * this.cL()), (double)(this.dj() * 0.4F));
   }

   static class a extends cay {
      public a(bsx $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected euk h() {
         euk $$0 = null;
         if (this.b.be()) {
            $$0 = cdm.a(this.b, 15, 15);
         }

         if (this.b.el().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private euk k() {
         io $$0 = this.b.dp();
         io.a $$1 = new io.a();
         io.a $$2 = new io.a();

         for (io $$4 : io.b(
            ayd.a(this.b.du() - 3.0),
            ayd.a(this.b.dw() - 6.0),
            ayd.a(this.b.dA() - 3.0),
            ayd.a(this.b.du() + 3.0),
            ayd.a(this.b.dw() + 6.0),
            ayd.a(this.b.dA() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               drb $$5 = this.b.dP().a_($$2.a($$4, it.a));
               boolean $$6 = $$5.b() instanceof dii || $$5.a(avw.t);
               if ($$6 && this.b.dP().u($$4) && this.b.dP().u($$1.a($$4, it.b))) {
                  return euk.c($$4);
               }
            }
         }

         return null;
      }
   }

   public static enum b implements ayx {
      a(0, "red_blue"),
      b(1, "blue"),
      c(2, "green"),
      d(3, "yellow_blue"),
      e(4, "gray");

      public static final Codec<ceu.b> f = ayx.a(ceu.b::values);
      private static final IntFunction<ceu.b> g = awv.a(ceu.b::a, values(), awv.a.c);
      final int h;
      private final String i;

      private b(int $$0, String $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public int a() {
         return this.h;
      }

      public static ceu.b a(int $$0) {
         return g.apply($$0);
      }

      @Override
      public String c() {
         return this.i;
      }
   }
}
