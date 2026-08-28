import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class chc extends chj implements bvv<chc.b>, cgv {
   private static final akk<Integer> cg = ako.a(chc.class, akm.b);
   private static final Predicate<bux> ch = new Predicate<bux>() {
      public boolean a(@Nullable bux $$0) {
         return $$0 != null && chc.ci.containsKey($$0.aq());
      }
   };
   static final Map<bug<?>, awj> ci = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bug.i, awk.sJ);
      $$0.put(bug.l, awk.sK);
      $$0.put(bug.m, awk.sL);
      $$0.put(bug.q, awk.th);
      $$0.put(bug.x, awk.sM);
      $$0.put(bug.B, awk.sN);
      $$0.put(bug.D, awk.sO);
      $$0.put(bug.F, awk.sP);
      $$0.put(bug.I, awk.sQ);
      $$0.put(bug.J, awk.sR);
      $$0.put(bug.T, awk.sS);
      $$0.put(bug.Y, awk.sT);
      $$0.put(bug.Z, awk.sU);
      $$0.put(bug.ac, awk.sV);
      $$0.put(bug.ad, awk.sW);
      $$0.put(bug.ap, awk.sX);
      $$0.put(bug.ay, awk.sY);
      $$0.put(bug.aA, awk.sZ);
      $$0.put(bug.aB, awk.ta);
      $$0.put(bug.aC, awk.tb);
      $$0.put(bug.aH, awk.tc);
      $$0.put(bug.aK, awk.td);
      $$0.put(bug.aM, awk.te);
      $$0.put(bug.aN, awk.tf);
      $$0.put(bug.aP, awk.tg);
      $$0.put(bug.aW, awk.th);
      $$0.put(bug.aY, awk.ti);
      $$0.put(bug.bi, awk.tj);
      $$0.put(bug.bk, awk.tk);
      $$0.put(bug.bm, awk.tl);
      $$0.put(bug.bo, awk.tm);
      $$0.put(bug.bp, awk.tn);
      $$0.put(bug.bq, awk.to);
      $$0.put(bug.bt, awk.tp);
      $$0.put(bug.bu, awk.tq);
      $$0.put(bug.bw, awk.tr);
   });
   public float cc;
   public float cd;
   public float ce;
   public float cf;
   private float cj = 1.0F;
   private float ck = 1.0F;
   private boolean cl;
   @Nullable
   private jg cm;

   public chc(bug<? extends chc> $$0, dev $$1) {
      super($$0, $$1);
      this.bP = new cat(this, 10, false);
      this.a(erv.n, -1.0F);
      this.a(erv.o, -1.0F);
      this.a(erv.x, -1.0F);
   }

   @Nullable
   @Override
   public bvo a(dfl $$0, brw $$1, buf $$2, @Nullable bvo $$3) {
      this.a(ad.a(chc.b.values(), $$0.E_()));
      if ($$3 == null) {
         $$3 = new btq.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean p_() {
      return false;
   }

   @Override
   protected void D() {
      this.bS.a(0, new bvs.a(1.25));
      this.bS.a(0, new cbn(this));
      this.bS.a(1, new ccb(this, coh.class, 8.0F));
      this.bS.a(2, new ccy(this));
      this.bS.a(2, new cbr(this, 1.0, 5.0F, 1.0F));
      this.bS.a(2, new chc.a(this, 1.0));
      this.bS.a(3, new cby(this));
      this.bS.a(3, new cbq(this, 1.0, 3.0F, 7.0F));
   }

   public static bwc.a gH() {
      return cgm.gA().a(bwd.s, 6.0).a(bwd.l, 0.4F).a(bwd.v, 0.2F).a(bwd.c, 3.0);
   }

   @Override
   protected ceh b(dev $$0) {
      cef $$1 = new cef(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   public void n_() {
      if (this.cm == null || !this.cm.a(this.dv(), 3.46) || !this.dX().a_(this.cm).a(dia.dT)) {
         this.cl = false;
         this.cm = null;
      }

      if (this.dX().A.a(400) == 0) {
         a(this.dX(), this);
      }

      super.n_();
      this.gM();
   }

   @Override
   public void a(jg $$0, boolean $$1) {
      this.cm = $$0;
      this.cl = $$1;
   }

   public boolean gI() {
      return this.cl;
   }

   private void gM() {
      this.cf = this.cc;
      this.ce = this.cd;
      this.cd = this.cd + (float)(!this.aJ() && !this.ca() ? 4 : -1) * 0.3F;
      this.cd = azj.a(this.cd, 0.0F, 1.0F);
      if (!this.aJ() && this.cj < 1.0F) {
         this.cj = 1.0F;
      }

      this.cj *= 0.9F;
      ezh $$0 = this.dA();
      if (!this.aJ() && $$0.e < 0.0) {
         this.h($$0.d(1.0, 0.6, 1.0));
      }

      this.cc = this.cc + this.cj * 2.0F;
   }

   public static boolean a(dev $$0, btz $$1) {
      if ($$1.bM() && !$$1.bc() && $$0.A.a(2) == 0) {
         List<bux> $$2 = $$0.a(bux.class, $$1.cS().g(20.0), ch);
         if (!$$2.isEmpty()) {
            bux $$3 = $$2.get($$0.A.a($$2.size()));
            if (!$$3.bc()) {
               awj $$4 = b($$3.aq());
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
   public bry b(coh $$0, brx $$1) {
      cvx $$2 = $$0.b($$1);
      if (!this.q() && $$2.a(axi.ax)) {
         $$2.a(1, $$0);
         if (!this.bc()) {
            this.dX().a(null, this.dC(), this.dE(), this.dI(), awk.sG, this.dn(), 1.0F, 1.0F + (this.af.i() - this.af.i()) * 0.2F);
         }

         if (!this.dX().C) {
            if (this.af.a(10) == 0) {
               this.a($$0);
               this.dX().a(this, (byte)7);
            } else {
               this.dX().a(this, (byte)6);
            }
         }

         return bry.a;
      } else if (!$$2.a(axi.ay)) {
         if (!this.gK() && this.q() && this.j($$0)) {
            if (!this.dX().C) {
               this.z(!this.gv());
            }

            return bry.a;
         } else {
            return super.b($$0, $$1);
         }
      } else {
         $$2.a(1, $$0);
         this.a(new bte(btg.s, 900));
         if ($$0.f() || !this.cD()) {
            this.a(this.dY().a($$0), Float.MAX_VALUE);
         }

         return bry.a;
      }
   }

   @Override
   public boolean l(cvx $$0) {
      return false;
   }

   public static boolean c(bug<chc> $$0, dew $$1, buf $$2, jg $$3, azr $$4) {
      return $$1.a_($$3.e()).a(awz.cc) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, dvd $$2, jg $$3) {
   }

   @Override
   public boolean a(cgm $$0) {
      return false;
   }

   @Nullable
   @Override
   public btq a(arm $$0, btq $$1) {
      return null;
   }

   @Nullable
   @Override
   public awj w() {
      return a(this.dX(), this.dX().A);
   }

   public static awj a(dev $$0, azr $$1) {
      if ($$0.am() != brv.a && $$1.a(1000) == 0) {
         List<bug<?>> $$2 = Lists.newArrayList(ci.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return awk.sE;
      }
   }

   private static awj b(bug<?> $$0) {
      return ci.getOrDefault($$0, awk.sE);
   }

   @Override
   protected awj d(bsp $$0) {
      return awk.sI;
   }

   @Override
   protected awj o_() {
      return awk.sF;
   }

   @Override
   protected void b(jg $$0, dvd $$1) {
      this.a(awk.ts, 0.15F, 1.0F);
   }

   @Override
   protected boolean bb() {
      return this.Z > this.ck;
   }

   @Override
   protected void ba() {
      this.a(awk.sH, 0.15F, 1.0F);
      this.ck = this.Z + this.cd / 2.0F;
   }

   @Override
   public float fj() {
      return a(this.af);
   }

   public static float a(azr $$0) {
      return ($$0.i() - $$0.i()) * 0.2F + 1.0F;
   }

   @Override
   public awl dn() {
      return awl.g;
   }

   @Override
   public boolean bJ() {
      return true;
   }

   @Override
   protected void F(btz $$0) {
      if (!($$0 instanceof coh)) {
         super.F($$0);
      }
   }

   @Override
   public boolean a(bsp $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dX().C) {
            this.z(false);
         }

         return super.a($$0, $$1);
      }
   }

   public chc.b gJ() {
      return chc.b.a(this.am.a(cg));
   }

   public void a(chc.b $$0) {
      this.am.a(cg, $$0.h);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(cg, 0);
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      $$0.a("Variant", this.gJ().h);
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      this.a(chc.b.a($$0.h("Variant")));
   }

   @Override
   public boolean gK() {
      return !this.aJ();
   }

   @Override
   protected boolean gz() {
      return true;
   }

   @Override
   public ezh cU() {
      return new ezh(0.0, (double)(0.5F * this.cT()), (double)(this.ds() * 0.4F));
   }

   static class a extends cdf {
      public a(bvd $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected ezh h() {
         ezh $$0 = null;
         if (this.b.bk()) {
            $$0 = cft.a(this.b, 15, 15);
         }

         if (this.b.ea().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private ezh k() {
         jg $$0 = this.b.dx();
         jg.a $$1 = new jg.a();
         jg.a $$2 = new jg.a();

         for (jg $$4 : jg.b(
            azj.a(this.b.dC() - 3.0),
            azj.a(this.b.dE() - 6.0),
            azj.a(this.b.dI() - 3.0),
            azj.a(this.b.dC() + 3.0),
            azj.a(this.b.dE() + 6.0),
            azj.a(this.b.dI() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               dvd $$5 = this.b.dX().a_($$2.a($$4, jl.a));
               boolean $$6 = $$5.b() instanceof dmh || $$5.a(awz.u);
               if ($$6 && this.b.dX().u($$4) && this.b.dX().u($$1.a($$4, jl.b))) {
                  return ezh.c($$4);
               }
            }
         }

         return null;
      }
   }

   public static enum b implements baf {
      a(0, "red_blue"),
      b(1, "blue"),
      c(2, "green"),
      d(3, "yellow_blue"),
      e(4, "gray");

      public static final Codec<chc.b> f = baf.a(chc.b::values);
      private static final IntFunction<chc.b> g = aya.a(chc.b::a, values(), aya.a.c);
      final int h;
      private final String i;

      private b(final int $$0, final String $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public int a() {
         return this.h;
      }

      public static chc.b a(int $$0) {
         return g.apply($$0);
      }

      @Override
      public String c() {
         return this.i;
      }
   }
}
