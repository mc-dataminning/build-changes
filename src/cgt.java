import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cgt extends cha implements bvm<cgt.b>, cgm {
   private static final akh<Integer> cg = akl.a(cgt.class, akj.b);
   private static final Predicate<bup> ch = new Predicate<bup>() {
      public boolean a(@Nullable bup $$0) {
         return $$0 != null && cgt.ci.containsKey($$0.ao());
      }
   };
   static final Map<bty<?>, awf> ci = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bty.i, awg.sL);
      $$0.put(bty.l, awg.sM);
      $$0.put(bty.m, awg.sN);
      $$0.put(bty.q, awg.tj);
      $$0.put(bty.x, awg.sO);
      $$0.put(bty.B, awg.sP);
      $$0.put(bty.D, awg.sQ);
      $$0.put(bty.F, awg.sR);
      $$0.put(bty.I, awg.sS);
      $$0.put(bty.J, awg.sT);
      $$0.put(bty.T, awg.sU);
      $$0.put(bty.Y, awg.sV);
      $$0.put(bty.Z, awg.sW);
      $$0.put(bty.ac, awg.sX);
      $$0.put(bty.ad, awg.sY);
      $$0.put(bty.ap, awg.sZ);
      $$0.put(bty.ay, awg.ta);
      $$0.put(bty.aA, awg.tb);
      $$0.put(bty.aB, awg.tc);
      $$0.put(bty.aC, awg.td);
      $$0.put(bty.aH, awg.te);
      $$0.put(bty.aK, awg.tf);
      $$0.put(bty.aM, awg.tg);
      $$0.put(bty.aN, awg.th);
      $$0.put(bty.aP, awg.ti);
      $$0.put(bty.aW, awg.tj);
      $$0.put(bty.aY, awg.tk);
      $$0.put(bty.bi, awg.tl);
      $$0.put(bty.bk, awg.tm);
      $$0.put(bty.bm, awg.tn);
      $$0.put(bty.bo, awg.to);
      $$0.put(bty.bp, awg.tp);
      $$0.put(bty.bq, awg.tq);
      $$0.put(bty.bt, awg.tr);
      $$0.put(bty.bu, awg.ts);
      $$0.put(bty.bw, awg.tt);
   });
   public float cc;
   public float cd;
   public float ce;
   public float cf;
   private float cj = 1.0F;
   private float ck = 1.0F;
   private boolean cl;
   @Nullable
   private jf cm;

   public cgt(bty<? extends cgt> $$0, dej $$1) {
      super($$0, $$1);
      this.bP = new cak(this, 10, false);
      this.a(erk.n, -1.0F);
      this.a(erk.o, -1.0F);
      this.a(erk.x, -1.0F);
   }

   @Nullable
   @Override
   public bvf a(dez $$0, brq $$1, btx $$2, @Nullable bvf $$3) {
      this.a(ad.a(cgt.b.values(), $$0.D_()));
      if ($$3 == null) {
         $$3 = new btk.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean p_() {
      return false;
   }

   @Override
   protected void D() {
      this.bS.a(0, new bvj.a(1.25));
      this.bS.a(0, new cbe(this));
      this.bS.a(1, new cbs(this, cnx.class, 8.0F));
      this.bS.a(2, new ccp(this));
      this.bS.a(2, new cbi(this, 1.0, 5.0F, 1.0F));
      this.bS.a(2, new cgt.a(this, 1.0));
      this.bS.a(3, new cbp(this));
      this.bS.a(3, new cbh(this, 1.0, 3.0F, 7.0F));
   }

   public static bvt.a gA() {
      return cgd.gt().a(bvu.s, 6.0).a(bvu.l, 0.4F).a(bvu.v, 0.2F).a(bvu.c, 3.0);
   }

   @Override
   protected cdy b(dej $$0) {
      cdw $$1 = new cdw(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   public void n_() {
      if (this.cm == null || !this.cm.a(this.dq(), 3.46) || !this.dS().a_(this.cm).a(dho.dT)) {
         this.cl = false;
         this.cm = null;
      }

      if (this.dS().z.a(400) == 0) {
         a(this.dS(), this);
      }

      super.n_();
      this.gF();
   }

   @Override
   public void a(jf $$0, boolean $$1) {
      this.cm = $$0;
      this.cl = $$1;
   }

   public boolean gB() {
      return this.cl;
   }

   private void gF() {
      this.cf = this.cc;
      this.ce = this.cd;
      this.cd = this.cd + (float)(!this.aH() && !this.bW() ? 4 : -1) * 0.3F;
      this.cd = azf.a(this.cd, 0.0F, 1.0F);
      if (!this.aH() && this.cj < 1.0F) {
         this.cj = 1.0F;
      }

      this.cj *= 0.9F;
      eyw $$0 = this.dv();
      if (!this.aH() && $$0.e < 0.0) {
         this.h($$0.d(1.0, 0.6, 1.0));
      }

      this.cc = this.cc + this.cj * 2.0F;
   }

   public static boolean a(dej $$0, btr $$1) {
      if ($$1.bI() && !$$1.ba() && $$0.z.a(2) == 0) {
         List<bup> $$2 = $$0.a(bup.class, $$1.cO().g(20.0), ch);
         if (!$$2.isEmpty()) {
            bup $$3 = $$2.get($$0.z.a($$2.size()));
            if (!$$3.ba()) {
               awf $$4 = b($$3.ao());
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
   public brs b(cnx $$0, brr $$1) {
      cvs $$2 = $$0.b($$1);
      if (!this.q() && $$2.a(axe.aw)) {
         $$2.a(1, $$0);
         if (!this.ba()) {
            this.dS().a(null, this.dx(), this.dz(), this.dD(), awg.sI, this.di(), 1.0F, 1.0F + (this.af.i() - this.af.i()) * 0.2F);
         }

         if (!this.dS().B) {
            if (this.af.a(10) == 0) {
               this.a($$0);
               this.dS().a(this, (byte)7);
            } else {
               this.dS().a(this, (byte)6);
            }
         }

         return brs.a;
      } else if (!$$2.a(axe.ax)) {
         if (!this.gD() && this.q() && this.j($$0)) {
            if (!this.dS().B) {
               this.z(!this.go());
            }

            return brs.a;
         } else {
            return super.b($$0, $$1);
         }
      } else {
         $$2.a(1, $$0);
         this.a(new bsy(bta.s, 900));
         if ($$0.f() || !this.cz()) {
            this.a(this.dT().a($$0), Float.MAX_VALUE);
         }

         return brs.a;
      }
   }

   @Override
   public boolean n(cvs $$0) {
      return false;
   }

   public static boolean c(bty<cgt> $$0, dek $$1, btx $$2, jf $$3, azn $$4) {
      return $$1.a_($$3.e()).a(awv.cc) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, dus $$2, jf $$3) {
   }

   @Override
   public boolean a(cgd $$0) {
      return false;
   }

   @Nullable
   @Override
   public btk a(arj $$0, btk $$1) {
      return null;
   }

   @Nullable
   @Override
   public awf w() {
      return a(this.dS(), this.dS().z);
   }

   public static awf a(dej $$0, azn $$1) {
      if ($$0.am() != brp.a && $$1.a(1000) == 0) {
         List<bty<?>> $$2 = Lists.newArrayList(ci.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return awg.sG;
      }
   }

   private static awf b(bty<?> $$0) {
      return ci.getOrDefault($$0, awg.sG);
   }

   @Override
   protected awf d(bsj $$0) {
      return awg.sK;
   }

   @Override
   protected awf o_() {
      return awg.sH;
   }

   @Override
   protected void b(jf $$0, dus $$1) {
      this.a(awg.tu, 0.15F, 1.0F);
   }

   @Override
   protected boolean aZ() {
      return this.Z > this.ck;
   }

   @Override
   protected void aY() {
      this.a(awg.sJ, 0.15F, 1.0F);
      this.ck = this.Z + this.cd / 2.0F;
   }

   @Override
   public float fe() {
      return a(this.af);
   }

   public static float a(azn $$0) {
      return ($$0.i() - $$0.i()) * 0.2F + 1.0F;
   }

   @Override
   public awh di() {
      return awh.g;
   }

   @Override
   public boolean bF() {
      return true;
   }

   @Override
   protected void F(btr $$0) {
      if (!($$0 instanceof cnx)) {
         super.F($$0);
      }
   }

   @Override
   public boolean a(bsj $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dS().B) {
            this.z(false);
         }

         return super.a($$0, $$1);
      }
   }

   public cgt.b gC() {
      return cgt.b.a(this.am.a(cg));
   }

   public void a(cgt.b $$0) {
      this.am.a(cg, $$0.h);
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(cg, 0);
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      $$0.a("Variant", this.gC().h);
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      this.a(cgt.b.a($$0.h("Variant")));
   }

   @Override
   public boolean gD() {
      return !this.aH();
   }

   @Override
   protected boolean gs() {
      return true;
   }

   @Override
   public eyw cQ() {
      return new eyw(0.0, (double)(0.5F * this.cP()), (double)(this.dn() * 0.4F));
   }

   static class a extends ccw {
      public a(buv $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected eyw h() {
         eyw $$0 = null;
         if (this.b.bi()) {
            $$0 = cfk.a(this.b, 15, 15);
         }

         if (this.b.dV().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private eyw k() {
         jf $$0 = this.b.ds();
         jf.a $$1 = new jf.a();
         jf.a $$2 = new jf.a();

         for (jf $$4 : jf.b(
            azf.a(this.b.dx() - 3.0),
            azf.a(this.b.dz() - 6.0),
            azf.a(this.b.dD() - 3.0),
            azf.a(this.b.dx() + 3.0),
            azf.a(this.b.dz() + 6.0),
            azf.a(this.b.dD() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               dus $$5 = this.b.dS().a_($$2.a($$4, jk.a));
               boolean $$6 = $$5.b() instanceof dlw || $$5.a(awv.u);
               if ($$6 && this.b.dS().u($$4) && this.b.dS().u($$1.a($$4, jk.b))) {
                  return eyw.c($$4);
               }
            }
         }

         return null;
      }
   }

   public static enum b implements bab {
      a(0, "red_blue"),
      b(1, "blue"),
      c(2, "green"),
      d(3, "yellow_blue"),
      e(4, "gray");

      public static final Codec<cgt.b> f = bab.a(cgt.b::values);
      private static final IntFunction<cgt.b> g = axw.a(cgt.b::a, values(), axw.a.c);
      final int h;
      private final String i;

      private b(final int $$0, final String $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public int a() {
         return this.h;
      }

      public static cgt.b a(int $$0) {
         return g.apply($$0);
      }

      @Override
      public String c() {
         return this.i;
      }
   }
}
