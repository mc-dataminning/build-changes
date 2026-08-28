import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cgq extends cgx implements bvj<cgq.b>, cgj {
   private static final akg<Integer> cg = akk.a(cgq.class, aki.b);
   private static final Predicate<bum> ch = new Predicate<bum>() {
      public boolean a(@Nullable bum $$0) {
         return $$0 != null && cgq.ci.containsKey($$0.ao());
      }
   };
   static final Map<btv<?>, awd> ci = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put(btv.i, awe.sL);
      $$0.put(btv.l, awe.sM);
      $$0.put(btv.m, awe.sN);
      $$0.put(btv.q, awe.tj);
      $$0.put(btv.x, awe.sO);
      $$0.put(btv.B, awe.sP);
      $$0.put(btv.D, awe.sQ);
      $$0.put(btv.F, awe.sR);
      $$0.put(btv.I, awe.sS);
      $$0.put(btv.J, awe.sT);
      $$0.put(btv.T, awe.sU);
      $$0.put(btv.Y, awe.sV);
      $$0.put(btv.Z, awe.sW);
      $$0.put(btv.ac, awe.sX);
      $$0.put(btv.ad, awe.sY);
      $$0.put(btv.ap, awe.sZ);
      $$0.put(btv.ay, awe.ta);
      $$0.put(btv.aA, awe.tb);
      $$0.put(btv.aB, awe.tc);
      $$0.put(btv.aC, awe.td);
      $$0.put(btv.aH, awe.te);
      $$0.put(btv.aK, awe.tf);
      $$0.put(btv.aM, awe.tg);
      $$0.put(btv.aN, awe.th);
      $$0.put(btv.aP, awe.ti);
      $$0.put(btv.aW, awe.tj);
      $$0.put(btv.aY, awe.tk);
      $$0.put(btv.bi, awe.tl);
      $$0.put(btv.bk, awe.tm);
      $$0.put(btv.bm, awe.tn);
      $$0.put(btv.bo, awe.to);
      $$0.put(btv.bp, awe.tp);
      $$0.put(btv.bq, awe.tq);
      $$0.put(btv.bt, awe.tr);
      $$0.put(btv.bu, awe.ts);
      $$0.put(btv.bw, awe.tt);
   });
   public float cc;
   public float cd;
   public float ce;
   public float cf;
   private float cj = 1.0F;
   private float ck = 1.0F;
   private boolean cl;
   @Nullable
   private je cm;

   public cgq(btv<? extends cgq> $$0, deg $$1) {
      super($$0, $$1);
      this.bP = new cah(this, 10, false);
      this.a(erg.n, -1.0F);
      this.a(erg.o, -1.0F);
      this.a(erg.x, -1.0F);
   }

   @Nullable
   @Override
   public bvc a(dew $$0, brn $$1, btu $$2, @Nullable bvc $$3) {
      this.a(ad.a(cgq.b.values(), $$0.C_()));
      if ($$3 == null) {
         $$3 = new bth.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean o_() {
      return false;
   }

   @Override
   protected void D() {
      this.bS.a(0, new bvg.a(1.25));
      this.bS.a(0, new cbb(this));
      this.bS.a(1, new cbp(this, cnu.class, 8.0F));
      this.bS.a(2, new ccm(this));
      this.bS.a(2, new cbf(this, 1.0, 5.0F, 1.0F));
      this.bS.a(2, new cgq.a(this, 1.0));
      this.bS.a(3, new cbm(this));
      this.bS.a(3, new cbe(this, 1.0, 3.0F, 7.0F));
   }

   public static bvq.a gB() {
      return cga.gu().a(bvr.s, 6.0).a(bvr.l, 0.4F).a(bvr.v, 0.2F).a(bvr.c, 3.0);
   }

   @Override
   protected cdv b(deg $$0) {
      cdt $$1 = new cdt(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   public void m_() {
      if (this.cm == null || !this.cm.a(this.dq(), 3.46) || !this.dS().a_(this.cm).a(dhl.dT)) {
         this.cl = false;
         this.cm = null;
      }

      if (this.dS().z.a(400) == 0) {
         a(this.dS(), this);
      }

      super.m_();
      this.gG();
   }

   @Override
   public void a(je $$0, boolean $$1) {
      this.cm = $$0;
      this.cl = $$1;
   }

   public boolean gC() {
      return this.cl;
   }

   private void gG() {
      this.cf = this.cc;
      this.ce = this.cd;
      this.cd = this.cd + (float)(!this.aH() && !this.bW() ? 4 : -1) * 0.3F;
      this.cd = azd.a(this.cd, 0.0F, 1.0F);
      if (!this.aH() && this.cj < 1.0F) {
         this.cj = 1.0F;
      }

      this.cj *= 0.9F;
      eys $$0 = this.dv();
      if (!this.aH() && $$0.e < 0.0) {
         this.h($$0.d(1.0, 0.6, 1.0));
      }

      this.cc = this.cc + this.cj * 2.0F;
   }

   public static boolean a(deg $$0, bto $$1) {
      if ($$1.bI() && !$$1.ba() && $$0.z.a(2) == 0) {
         List<bum> $$2 = $$0.a(bum.class, $$1.cO().g(20.0), ch);
         if (!$$2.isEmpty()) {
            bum $$3 = $$2.get($$0.z.a($$2.size()));
            if (!$$3.ba()) {
               awd $$4 = b($$3.ao());
               $$0.a(null, $$1.dx(), $$1.dz(), $$1.dD(), $$4, $$1.di(), 0.7F, a($$0.z));
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public brp b(cnu $$0, bro $$1) {
      cvp $$2 = $$0.b($$1);
      if (!this.q() && $$2.a(axc.aw)) {
         $$2.a(1, $$0);
         if (!this.ba()) {
            this.dS().a(null, this.dx(), this.dz(), this.dD(), awe.sI, this.di(), 1.0F, 1.0F + (this.af.i() - this.af.i()) * 0.2F);
         }

         if (!this.dS().B) {
            if (this.af.a(10) == 0) {
               this.a($$0);
               this.dS().a(this, (byte)7);
            } else {
               this.dS().a(this, (byte)6);
            }
         }

         return brp.a;
      } else if (!$$2.a(axc.ax)) {
         if (!this.gE() && this.q() && this.j($$0)) {
            if (!this.dS().B) {
               this.z(!this.gp());
            }

            return brp.a;
         } else {
            return super.b($$0, $$1);
         }
      } else {
         $$2.a(1, $$0);
         this.a(new bsv(bsx.s, 900));
         if ($$0.f() || !this.cz()) {
            this.a(this.dT().a($$0), Float.MAX_VALUE);
         }

         return brp.a;
      }
   }

   @Override
   public boolean n(cvp $$0) {
      return false;
   }

   public static boolean c(btv<cgq> $$0, deh $$1, btu $$2, je $$3, azl $$4) {
      return $$1.a_($$3.e()).a(awt.cc) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, duo $$2, je $$3) {
   }

   @Override
   public boolean a(cga $$0) {
      return false;
   }

   @Nullable
   @Override
   public bth a(arh $$0, bth $$1) {
      return null;
   }

   @Nullable
   @Override
   public awd w() {
      return a(this.dS(), this.dS().z);
   }

   public static awd a(deg $$0, azl $$1) {
      if ($$0.am() != brm.a && $$1.a(1000) == 0) {
         List<btv<?>> $$2 = Lists.newArrayList(ci.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return awe.sG;
      }
   }

   private static awd b(btv<?> $$0) {
      return ci.getOrDefault($$0, awe.sG);
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.sK;
   }

   @Override
   protected awd n_() {
      return awe.sH;
   }

   @Override
   protected void b(je $$0, duo $$1) {
      this.a(awe.tu, 0.15F, 1.0F);
   }

   @Override
   protected boolean aZ() {
      return this.Z > this.ck;
   }

   @Override
   protected void aY() {
      this.a(awe.sJ, 0.15F, 1.0F);
      this.ck = this.Z + this.cd / 2.0F;
   }

   @Override
   public float fe() {
      return a(this.af);
   }

   public static float a(azl $$0) {
      return ($$0.i() - $$0.i()) * 0.2F + 1.0F;
   }

   @Override
   public awf di() {
      return awf.g;
   }

   @Override
   public boolean bF() {
      return true;
   }

   @Override
   protected void F(bto $$0) {
      if (!($$0 instanceof cnu)) {
         super.F($$0);
      }
   }

   @Override
   public boolean a(bsg $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dS().B) {
            this.z(false);
         }

         return super.a($$0, $$1);
      }
   }

   public cgq.b gD() {
      return cgq.b.a(this.am.a(cg));
   }

   public void a(cgq.b $$0) {
      this.am.a(cg, $$0.h);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(cg, 0);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("Variant", this.gD().h);
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.a(cgq.b.a($$0.h("Variant")));
   }

   @Override
   public boolean gE() {
      return !this.aH();
   }

   @Override
   protected boolean gt() {
      return true;
   }

   @Override
   public eys cQ() {
      return new eys(0.0, (double)(0.5F * this.cP()), (double)(this.dn() * 0.4F));
   }

   static class a extends cct {
      public a(bus $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected eys h() {
         eys $$0 = null;
         if (this.b.bi()) {
            $$0 = cfh.a(this.b, 15, 15);
         }

         if (this.b.dV().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private eys k() {
         je $$0 = this.b.ds();
         je.a $$1 = new je.a();
         je.a $$2 = new je.a();

         for (je $$4 : je.b(
            azd.a(this.b.dx() - 3.0),
            azd.a(this.b.dz() - 6.0),
            azd.a(this.b.dD() - 3.0),
            azd.a(this.b.dx() + 3.0),
            azd.a(this.b.dz() + 6.0),
            azd.a(this.b.dD() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               duo $$5 = this.b.dS().a_($$2.a($$4, jj.a));
               boolean $$6 = $$5.b() instanceof dlt || $$5.a(awt.u);
               if ($$6 && this.b.dS().u($$4) && this.b.dS().u($$1.a($$4, jj.b))) {
                  return eys.c($$4);
               }
            }
         }

         return null;
      }
   }

   public static enum b implements azz {
      a(0, "red_blue"),
      b(1, "blue"),
      c(2, "green"),
      d(3, "yellow_blue"),
      e(4, "gray");

      public static final Codec<cgq.b> f = azz.a(cgq.b::values);
      private static final IntFunction<cgq.b> g = axu.a(cgq.b::a, values(), axu.a.c);
      final int h;
      private final String i;

      private b(final int $$0, final String $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public int a() {
         return this.h;
      }

      public static cgq.b a(int $$0) {
         return g.apply($$0);
      }

      @Override
      public String c() {
         return this.i;
      }
   }
}
