import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cef extends cem implements bsz<cef.b>, cdy {
   private static final ajm<Integer> cf = ajq.a(cef.class, ajo.b);
   private static final Predicate<bsc> cg = new Predicate<bsc>() {
      public boolean a(@Nullable bsc $$0) {
         return $$0 != null && cef.ch.containsKey($$0.ai());
      }
   };
   static final Map<brn<?>, avb> ch = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(brn.i, avc.sw);
      $$0.put(brn.l, avc.sx);
      $$0.put(brn.m, avc.sy);
      $$0.put(brn.q, avc.sU);
      $$0.put(brn.x, avc.sz);
      $$0.put(brn.B, avc.sA);
      $$0.put(brn.D, avc.sB);
      $$0.put(brn.F, avc.sC);
      $$0.put(brn.I, avc.sD);
      $$0.put(brn.J, avc.sE);
      $$0.put(brn.T, avc.sF);
      $$0.put(brn.Y, avc.sG);
      $$0.put(brn.Z, avc.sH);
      $$0.put(brn.ac, avc.sI);
      $$0.put(brn.ad, avc.sJ);
      $$0.put(brn.ao, avc.sK);
      $$0.put(brn.ax, avc.sL);
      $$0.put(brn.az, avc.sM);
      $$0.put(brn.aA, avc.sN);
      $$0.put(brn.aB, avc.sO);
      $$0.put(brn.aG, avc.sP);
      $$0.put(brn.aJ, avc.sQ);
      $$0.put(brn.aL, avc.sR);
      $$0.put(brn.aM, avc.sS);
      $$0.put(brn.aO, avc.sT);
      $$0.put(brn.aV, avc.sU);
      $$0.put(brn.aX, avc.sV);
      $$0.put(brn.bh, avc.sW);
      $$0.put(brn.bj, avc.sX);
      $$0.put(brn.bl, avc.sY);
      $$0.put(brn.bn, avc.sZ);
      $$0.put(brn.bo, avc.ta);
      $$0.put(brn.bp, avc.tb);
      $$0.put(brn.bs, avc.tc);
      $$0.put(brn.bt, avc.td);
      $$0.put(brn.bv, avc.te);
   });
   public float cb;
   public float cc;
   public float cd;
   public float ce;
   private float ci = 1.0F;
   private float cj = 1.0F;
   private boolean ck;
   @Nullable
   private in cl;

   public cef(brn<? extends cef> $$0, dad $$1) {
      super($$0, $$1);
      this.bP = new bxx(this, 10, false);
      this.a(emr.n, -1.0F);
      this.a(emr.o, -1.0F);
      this.a(emr.x, -1.0F);
   }

   @Nullable
   @Override
   public bss a(das $$0, bpk $$1, bse $$2, @Nullable bss $$3) {
      this.a(ac.a(cef.b.values(), $$0.E_()));
      if ($$3 == null) {
         $$3 = new brb.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean p_() {
      return false;
   }

   @Override
   protected void z() {
      this.bS.a(0, new bzq(this, 1.25));
      this.bS.a(0, new byr(this));
      this.bS.a(1, new bzf(this, clh.class, 8.0F));
      this.bS.a(2, new cac(this));
      this.bS.a(2, new byv(this, 1.0, 5.0F, 1.0F, true));
      this.bS.a(2, new cef.a(this, 1.0));
      this.bS.a(3, new bzc(this));
      this.bS.a(3, new byu(this, 1.0, 3.0F, 7.0F));
   }

   public static btg.a gv() {
      return bsc.A().a(bth.q, 6.0).a(bth.j, 0.4F).a(bth.r, 0.2F);
   }

   @Override
   protected cbl b(dad $$0) {
      cbj $$1 = new cbj(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   public void n_() {
      if (this.cl == null || !this.cl.a(this.dl(), 3.46) || !this.dN().a_(this.cl).a(ddg.dT)) {
         this.ck = false;
         this.cl = null;
      }

      if (this.dN().z.a(400) == 0) {
         a(this.dN(), this);
      }

      super.n_();
      this.gz();
   }

   @Override
   public void a(in $$0, boolean $$1) {
      this.cl = $$0;
      this.ck = $$1;
   }

   public boolean gw() {
      return this.ck;
   }

   private void gz() {
      this.ce = this.cb;
      this.cd = this.cc;
      this.cc = this.cc + (float)(!this.aC() && !this.bP() ? 4 : -1) * 0.3F;
      this.cc = axz.a(this.cc, 0.0F, 1.0F);
      if (!this.aC() && this.ci < 1.0F) {
         this.ci = 1.0F;
      }

      this.ci *= 0.9F;
      etp $$0 = this.dq();
      if (!this.aC() && $$0.d < 0.0) {
         this.g($$0.d(1.0, 0.6, 1.0));
      }

      this.cb = this.cb + this.ci * 2.0F;
   }

   public static boolean a(dad $$0, brh $$1) {
      if ($$1.bB() && !$$1.aU() && $$0.z.a(2) == 0) {
         List<bsc> $$2 = $$0.a(bsc.class, $$1.cI().g(20.0), cg);
         if (!$$2.isEmpty()) {
            bsc $$3 = $$2.get($$0.z.a($$2.size()));
            if (!$$3.aU()) {
               avb $$4 = b($$3.ai());
               $$0.a(null, $$1.ds(), $$1.du(), $$1.dy(), $$4, $$1.dc(), 0.7F, a($$0.z));
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public bpm b(clh $$0, bpl $$1) {
      csz $$2 = $$0.b($$1);
      if (!this.r() && $$2.a(avz.aw)) {
         $$2.a(1, $$0);
         if (!this.aU()) {
            this.dN().a(null, this.ds(), this.du(), this.dy(), avc.st, this.dc(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
         }

         if (!this.dN().B) {
            if (this.ah.a(10) == 0) {
               this.f($$0);
               this.dN().a(this, (byte)7);
            } else {
               this.dN().a(this, (byte)6);
            }
         }

         return bpm.a(this.dN().B);
      } else if (!$$2.a(avz.ax)) {
         if (!this.gC() && this.r() && this.j($$0)) {
            if (!this.dN().B) {
               this.y(!this.gp());
            }

            return bpm.a(this.dN().B);
         } else {
            return super.b($$0, $$1);
         }
      } else {
         $$2.a(1, $$0);
         this.b(new bqt(bqv.s, 900));
         if ($$0.f() || !this.cs()) {
            this.a(this.dO().a($$0), Float.MAX_VALUE);
         }

         return bpm.a(this.dN().B);
      }
   }

   @Override
   public boolean o(csz $$0) {
      return false;
   }

   public static boolean c(brn<cef> $$0, dae $$1, bse $$2, in $$3, ayg $$4) {
      return $$1.a_($$3.d()).a(avr.cb) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, dqh $$2, in $$3) {
   }

   @Override
   public boolean a(cdp $$0) {
      return false;
   }

   @Nullable
   @Override
   public brb a(aqh $$0, brb $$1) {
      return null;
   }

   @Override
   public boolean C(brh $$0) {
      return $$0.a(this.dO().b((bsa)this), 3.0F);
   }

   @Nullable
   @Override
   public avb v() {
      return a(this.dN(), this.dN().z);
   }

   public static avb a(dad $$0, ayg $$1) {
      if ($$0.ak() != bpj.a && $$1.a(1000) == 0) {
         List<brn<?>> $$2 = Lists.newArrayList(ch.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return avc.sr;
      }
   }

   private static avb b(brn<?> $$0) {
      return ch.getOrDefault($$0, avc.sr);
   }

   @Override
   protected avb d(bqf $$0) {
      return avc.sv;
   }

   @Override
   protected avb o_() {
      return avc.ss;
   }

   @Override
   protected void b(in $$0, dqh $$1) {
      this.a(avc.tf, 0.15F, 1.0F);
   }

   @Override
   protected boolean aT() {
      return this.ab > this.cj;
   }

   @Override
   protected void aS() {
      this.a(avc.su, 0.15F, 1.0F);
      this.cj = this.ab + this.cc / 2.0F;
   }

   @Override
   public float fd() {
      return a(this.ah);
   }

   public static float a(ayg $$0) {
      return ($$0.i() - $$0.i()) * 0.2F + 1.0F;
   }

   @Override
   public avd dc() {
      return avd.g;
   }

   @Override
   public boolean by() {
      return true;
   }

   @Override
   protected void D(brh $$0) {
      if (!($$0 instanceof clh)) {
         super.D($$0);
      }
   }

   @Override
   public boolean a(bqf $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dN().B) {
            this.y(false);
         }

         return super.a($$0, $$1);
      }
   }

   public cef.b gx() {
      return cef.b.a(this.ao.a(cf));
   }

   public void a(cef.b $$0) {
      this.ao.a(cf, $$0.h);
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(cf, 0);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Variant", this.gx().h);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.a(cef.b.a($$0.h("Variant")));
   }

   @Override
   public boolean gC() {
      return !this.aC();
   }

   @Override
   public etp cK() {
      return new etp(0.0, (double)(0.5F * this.cJ()), (double)(this.dh() * 0.4F));
   }

   static class a extends caj {
      public a(bsi $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected etp h() {
         etp $$0 = null;
         if (this.b.bc()) {
            $$0 = ccx.a(this.b, 15, 15);
         }

         if (this.b.ej().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private etp k() {
         in $$0 = this.b.dn();
         in.a $$1 = new in.a();
         in.a $$2 = new in.a();

         for (in $$4 : in.b(
            axz.a(this.b.ds() - 3.0),
            axz.a(this.b.du() - 6.0),
            axz.a(this.b.dy() - 3.0),
            axz.a(this.b.ds() + 3.0),
            axz.a(this.b.du() + 6.0),
            axz.a(this.b.dy() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               dqh $$5 = this.b.dN().a_($$2.a($$4, is.a));
               boolean $$6 = $$5.b() instanceof dho || $$5.a(avr.t);
               if ($$6 && this.b.dN().u($$4) && this.b.dN().u($$1.a($$4, is.b))) {
                  return etp.c($$4);
               }
            }
         }

         return null;
      }
   }

   public static enum b implements ayt {
      a(0, "red_blue"),
      b(1, "blue"),
      c(2, "green"),
      d(3, "yellow_blue"),
      e(4, "gray");

      public static final Codec<cef.b> f = ayt.a(cef.b::values);
      private static final IntFunction<cef.b> g = awq.a(cef.b::a, values(), awq.a.c);
      final int h;
      private final String i;

      private b(int $$0, String $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public int a() {
         return this.h;
      }

      public static cef.b a(int $$0) {
         return g.apply($$0);
      }

      @Override
      public String c() {
         return this.i;
      }
   }
}
