import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class chh extends cho implements bwa<chh.b>, cha {
   private static final akl<Integer> cg = akp.a(chh.class, akn.b);
   private static final Predicate<bvc> ch = new Predicate<bvc>() {
      public boolean a(@Nullable bvc $$0) {
         return $$0 != null && chh.ci.containsKey($$0.ar());
      }
   };
   static final Map<bul<?>, awk> ci = ae.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bul.i, awl.sJ);
      $$0.put(bul.l, awl.sK);
      $$0.put(bul.m, awl.sL);
      $$0.put(bul.q, awl.th);
      $$0.put(bul.x, awl.sM);
      $$0.put(bul.B, awl.sN);
      $$0.put(bul.D, awl.sO);
      $$0.put(bul.F, awl.sP);
      $$0.put(bul.I, awl.sQ);
      $$0.put(bul.J, awl.sR);
      $$0.put(bul.T, awl.sS);
      $$0.put(bul.Y, awl.sT);
      $$0.put(bul.Z, awl.sU);
      $$0.put(bul.ac, awl.sV);
      $$0.put(bul.ad, awl.sW);
      $$0.put(bul.ap, awl.sX);
      $$0.put(bul.ay, awl.sY);
      $$0.put(bul.aA, awl.sZ);
      $$0.put(bul.aB, awl.ta);
      $$0.put(bul.aC, awl.tb);
      $$0.put(bul.aH, awl.tc);
      $$0.put(bul.aK, awl.td);
      $$0.put(bul.aM, awl.te);
      $$0.put(bul.aN, awl.tf);
      $$0.put(bul.aP, awl.tg);
      $$0.put(bul.aW, awl.th);
      $$0.put(bul.aY, awl.ti);
      $$0.put(bul.bi, awl.tj);
      $$0.put(bul.bk, awl.tk);
      $$0.put(bul.bm, awl.tl);
      $$0.put(bul.bo, awl.tm);
      $$0.put(bul.bp, awl.tn);
      $$0.put(bul.bq, awl.to);
      $$0.put(bul.bt, awl.tp);
      $$0.put(bul.bu, awl.tq);
      $$0.put(bul.bw, awl.tr);
   });
   public float cc;
   public float cd;
   public float ce;
   public float cf;
   private float cj = 1.0F;
   private float ck = 1.0F;
   private boolean cl;
   @Nullable
   private jh cm;

   public chh(bul<? extends chh> $$0, dfb $$1) {
      super($$0, $$1);
      this.bP = new cay(this, 10, false);
      this.a(esb.n, -1.0F);
      this.a(esb.o, -1.0F);
      this.a(esb.x, -1.0F);
   }

   @Nullable
   @Override
   public bvt a(dfr $$0, bsb $$1, buk $$2, @Nullable bvt $$3) {
      this.a(ae.a(chh.b.values(), $$0.E_()));
      if ($$3 == null) {
         $$3 = new btv.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean p_() {
      return false;
   }

   @Override
   protected void D() {
      this.bS.a(0, new bvx.a(1.25));
      this.bS.a(0, new cbs(this));
      this.bS.a(1, new ccg(this, com.class, 8.0F));
      this.bS.a(2, new cdd(this));
      this.bS.a(2, new cbw(this, 1.0, 5.0F, 1.0F));
      this.bS.a(2, new chh.a(this, 1.0));
      this.bS.a(3, new ccd(this));
      this.bS.a(3, new cbv(this, 1.0, 3.0F, 7.0F));
   }

   public static bwh.a gG() {
      return cgr.gz().a(bwi.s, 6.0).a(bwi.l, 0.4F).a(bwi.v, 0.2F).a(bwi.c, 3.0);
   }

   @Override
   protected cem b(dfb $$0) {
      cek $$1 = new cek(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   public void n_() {
      if (this.cm == null || !this.cm.a(this.dv(), 3.46) || !this.dX().a_(this.cm).a(dig.dT)) {
         this.cl = false;
         this.cm = null;
      }

      if (this.dX().A.a(400) == 0) {
         a(this.dX(), this);
      }

      super.n_();
      this.gL();
   }

   @Override
   public void a(jh $$0, boolean $$1) {
      this.cm = $$0;
      this.cl = $$1;
   }

   public boolean gH() {
      return this.cl;
   }

   private void gL() {
      this.cf = this.cc;
      this.ce = this.cd;
      this.cd = this.cd + (float)(!this.aK() && !this.ca() ? 4 : -1) * 0.3F;
      this.cd = azk.a(this.cd, 0.0F, 1.0F);
      if (!this.aK() && this.cj < 1.0F) {
         this.cj = 1.0F;
      }

      this.cj *= 0.9F;
      ezn $$0 = this.dA();
      if (!this.aK() && $$0.e < 0.0) {
         this.h($$0.d(1.0, 0.6, 1.0));
      }

      this.cc = this.cc + this.cj * 2.0F;
   }

   public static boolean a(dfb $$0, bue $$1) {
      if ($$1.bM() && !$$1.bc() && $$0.A.a(2) == 0) {
         List<bvc> $$2 = $$0.a(bvc.class, $$1.cS().g(20.0), ch);
         if (!$$2.isEmpty()) {
            bvc $$3 = $$2.get($$0.A.a($$2.size()));
            if (!$$3.bc()) {
               awk $$4 = b($$3.ar());
               $$0.a(null, $$1.dC(), $$1.dE(), $$1.dI(), $$4, $$1.dn(), 0.7F, a($$0.A));
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public bsd b(com $$0, bsc $$1) {
      cwb $$2 = $$0.b($$1);
      if (!this.q() && $$2.a(axj.aA)) {
         $$2.a(1, $$0);
         if (!this.bc()) {
            this.dX().a(null, this.dC(), this.dE(), this.dI(), awl.sG, this.dn(), 1.0F, 1.0F + (this.af.i() - this.af.i()) * 0.2F);
         }

         if (!this.dX().C) {
            if (this.af.a(10) == 0) {
               this.a($$0);
               this.dX().a(this, (byte)7);
            } else {
               this.dX().a(this, (byte)6);
            }
         }

         return bsd.a;
      } else if (!$$2.a(axj.aB)) {
         if (!this.gJ() && this.q() && this.j($$0)) {
            if (!this.dX().C) {
               this.z(!this.gu());
            }

            return bsd.a;
         } else {
            return super.b($$0, $$1);
         }
      } else {
         $$2.a(1, $$0);
         this.a(new btj(btl.s, 900));
         if ($$0.f() || !this.cD()) {
            this.a(this.dY().a($$0), Float.MAX_VALUE);
         }

         return bsd.a;
      }
   }

   @Override
   public boolean l(cwb $$0) {
      return false;
   }

   public static boolean c(bul<chh> $$0, dfc $$1, buk $$2, jh $$3, azs $$4) {
      return $$1.a_($$3.e()).a(axa.cc) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, dvj $$2, jh $$3) {
   }

   @Override
   public boolean a(cgr $$0) {
      return false;
   }

   @Nullable
   @Override
   public btv a(arn $$0, btv $$1) {
      return null;
   }

   @Nullable
   @Override
   public awk w() {
      return a(this.dX(), this.dX().A);
   }

   public static awk a(dfb $$0, azs $$1) {
      if ($$0.ak() != bsa.a && $$1.a(1000) == 0) {
         List<bul<?>> $$2 = Lists.newArrayList(ci.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return awl.sE;
      }
   }

   private static awk b(bul<?> $$0) {
      return ci.getOrDefault($$0, awl.sE);
   }

   @Override
   protected awk d(bsu $$0) {
      return awl.sI;
   }

   @Override
   protected awk o_() {
      return awl.sF;
   }

   @Override
   protected void b(jh $$0, dvj $$1) {
      this.a(awl.ts, 0.15F, 1.0F);
   }

   @Override
   protected boolean bb() {
      return this.Z > this.ck;
   }

   @Override
   protected void ba() {
      this.a(awl.sH, 0.15F, 1.0F);
      this.ck = this.Z + this.cd / 2.0F;
   }

   @Override
   public float fj() {
      return a(this.af);
   }

   public static float a(azs $$0) {
      return ($$0.i() - $$0.i()) * 0.2F + 1.0F;
   }

   @Override
   public awm dn() {
      return awm.g;
   }

   @Override
   public boolean bJ() {
      return true;
   }

   @Override
   protected void F(bue $$0) {
      if (!($$0 instanceof com)) {
         super.F($$0);
      }
   }

   @Override
   public boolean a(bsu $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dX().C) {
            this.z(false);
         }

         return super.a($$0, $$1);
      }
   }

   public chh.b gI() {
      return chh.b.a(this.am.a(cg));
   }

   public void a(chh.b $$0) {
      this.am.a(cg, $$0.h);
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(cg, 0);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("Variant", this.gI().h);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.a(chh.b.a($$0.h("Variant")));
   }

   @Override
   public boolean gJ() {
      return !this.aK();
   }

   @Override
   protected boolean gy() {
      return true;
   }

   @Override
   public ezn cU() {
      return new ezn(0.0, (double)(0.5F * this.cT()), (double)(this.ds() * 0.4F));
   }

   static class a extends cdk {
      public a(bvi $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected ezn h() {
         ezn $$0 = null;
         if (this.b.bk()) {
            $$0 = cfy.a(this.b, 15, 15);
         }

         if (this.b.ea().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private ezn k() {
         jh $$0 = this.b.dx();
         jh.a $$1 = new jh.a();
         jh.a $$2 = new jh.a();

         for (jh $$4 : jh.b(
            azk.a(this.b.dC() - 3.0),
            azk.a(this.b.dE() - 6.0),
            azk.a(this.b.dI() - 3.0),
            azk.a(this.b.dC() + 3.0),
            azk.a(this.b.dE() + 6.0),
            azk.a(this.b.dI() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               dvj $$5 = this.b.dX().a_($$2.a($$4, jm.a));
               boolean $$6 = $$5.b() instanceof dmn || $$5.a(axa.u);
               if ($$6 && this.b.dX().u($$4) && this.b.dX().u($$1.a($$4, jm.b))) {
                  return ezn.c($$4);
               }
            }
         }

         return null;
      }
   }

   public static enum b implements bag {
      a(0, "red_blue"),
      b(1, "blue"),
      c(2, "green"),
      d(3, "yellow_blue"),
      e(4, "gray");

      public static final Codec<chh.b> f = bag.a(chh.b::values);
      private static final IntFunction<chh.b> g = ayb.a(chh.b::a, values(), ayb.a.c);
      final int h;
      private final String i;

      private b(final int $$0, final String $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public int a() {
         return this.h;
      }

      public static chh.b a(int $$0) {
         return g.apply($$0);
      }

      @Override
      public String c() {
         return this.i;
      }
   }
}
