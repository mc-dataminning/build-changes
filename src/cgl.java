import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cgl extends cgs implements bve<cgl.b>, cge {
   private static final akg<Integer> ch = akk.a(cgl.class, aki.b);
   private static final Predicate<buh> ci = new Predicate<buh>() {
      public boolean a(@Nullable buh $$0) {
         return $$0 != null && cgl.cj.containsKey($$0.ao());
      }
   };
   static final Map<btq<?>, awc> cj = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put(btq.i, awd.sL);
      $$0.put(btq.l, awd.sM);
      $$0.put(btq.m, awd.sN);
      $$0.put(btq.q, awd.tj);
      $$0.put(btq.x, awd.sO);
      $$0.put(btq.B, awd.sP);
      $$0.put(btq.D, awd.sQ);
      $$0.put(btq.F, awd.sR);
      $$0.put(btq.I, awd.sS);
      $$0.put(btq.J, awd.sT);
      $$0.put(btq.T, awd.sU);
      $$0.put(btq.Y, awd.sV);
      $$0.put(btq.Z, awd.sW);
      $$0.put(btq.ac, awd.sX);
      $$0.put(btq.ad, awd.sY);
      $$0.put(btq.ap, awd.sZ);
      $$0.put(btq.ay, awd.ta);
      $$0.put(btq.aA, awd.tb);
      $$0.put(btq.aB, awd.tc);
      $$0.put(btq.aC, awd.td);
      $$0.put(btq.aH, awd.te);
      $$0.put(btq.aK, awd.tf);
      $$0.put(btq.aM, awd.tg);
      $$0.put(btq.aN, awd.th);
      $$0.put(btq.aP, awd.ti);
      $$0.put(btq.aW, awd.tj);
      $$0.put(btq.aY, awd.tk);
      $$0.put(btq.bi, awd.tl);
      $$0.put(btq.bk, awd.tm);
      $$0.put(btq.bm, awd.tn);
      $$0.put(btq.bo, awd.to);
      $$0.put(btq.bp, awd.tp);
      $$0.put(btq.bq, awd.tq);
      $$0.put(btq.bt, awd.tr);
      $$0.put(btq.bu, awd.ts);
      $$0.put(btq.bw, awd.tt);
   });
   public float cd;
   public float ce;
   public float cf;
   public float cg;
   private float ck = 1.0F;
   private float cl = 1.0F;
   private boolean cm;
   @Nullable
   private je cn;

   public cgl(btq<? extends cgl> $$0, dds $$1) {
      super($$0, $$1);
      this.bQ = new cac(this, 10, false);
      this.a(eqs.n, -1.0F);
      this.a(eqs.o, -1.0F);
      this.a(eqs.x, -1.0F);
   }

   @Nullable
   @Override
   public bux a(dei $$0, bri $$1, btp $$2, @Nullable bux $$3) {
      this.a(ad.a(cgl.b.values(), $$0.C_()));
      if ($$3 == null) {
         $$3 = new btc.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean o_() {
      return false;
   }

   @Override
   protected void D() {
      this.bT.a(0, new bvb.a(1.25));
      this.bT.a(0, new caw(this));
      this.bT.a(1, new cbk(this, cnp.class, 8.0F));
      this.bT.a(2, new cch(this));
      this.bT.a(2, new cba(this, 1.0, 5.0F, 1.0F));
      this.bT.a(2, new cgl.a(this, 1.0));
      this.bT.a(3, new cbh(this));
      this.bT.a(3, new caz(this, 1.0, 3.0F, 7.0F));
   }

   public static bvl.a gA() {
      return cfv.gt().a(bvm.s, 6.0).a(bvm.l, 0.4F).a(bvm.v, 0.2F).a(bvm.c, 3.0);
   }

   @Override
   protected cdq b(dds $$0) {
      cdo $$1 = new cdo(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   public void m_() {
      if (this.cn == null || !this.cn.a(this.dq(), 3.46) || !this.dS().a_(this.cn).a(dgx.dT)) {
         this.cm = false;
         this.cn = null;
      }

      if (this.dS().z.a(400) == 0) {
         a(this.dS(), this);
      }

      super.m_();
      this.gF();
   }

   @Override
   public void a(je $$0, boolean $$1) {
      this.cn = $$0;
      this.cm = $$1;
   }

   public boolean gB() {
      return this.cm;
   }

   private void gF() {
      this.cg = this.cd;
      this.cf = this.ce;
      this.ce = this.ce + (float)(!this.aH() && !this.bW() ? 4 : -1) * 0.3F;
      this.ce = azc.a(this.ce, 0.0F, 1.0F);
      if (!this.aH() && this.ck < 1.0F) {
         this.ck = 1.0F;
      }

      this.ck *= 0.9F;
      eye $$0 = this.dv();
      if (!this.aH() && $$0.e < 0.0) {
         this.h($$0.d(1.0, 0.6, 1.0));
      }

      this.cd = this.cd + this.ck * 2.0F;
   }

   public static boolean a(dds $$0, btj $$1) {
      if ($$1.bI() && !$$1.ba() && $$0.z.a(2) == 0) {
         List<buh> $$2 = $$0.a(buh.class, $$1.cO().g(20.0), ci);
         if (!$$2.isEmpty()) {
            buh $$3 = $$2.get($$0.z.a($$2.size()));
            if (!$$3.ba()) {
               awc $$4 = b($$3.ao());
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
   public brk b(cnp $$0, brj $$1) {
      cvl $$2 = $$0.b($$1);
      if (!this.q() && $$2.a(axb.aw)) {
         $$2.a(1, $$0);
         if (!this.ba()) {
            this.dS().a(null, this.dx(), this.dz(), this.dD(), awd.sI, this.di(), 1.0F, 1.0F + (this.af.i() - this.af.i()) * 0.2F);
         }

         if (!this.dS().B) {
            if (this.af.a(10) == 0) {
               this.a($$0);
               this.dS().a(this, (byte)7);
            } else {
               this.dS().a(this, (byte)6);
            }
         }

         return brk.a;
      } else if (!$$2.a(axb.ax)) {
         if (!this.gD() && this.q() && this.j($$0)) {
            if (!this.dS().B) {
               this.z(!this.go());
            }

            return brk.a;
         } else {
            return super.b($$0, $$1);
         }
      } else {
         $$2.a(1, $$0);
         this.b(new bsq(bss.s, 900));
         if ($$0.f() || !this.cz()) {
            this.a(this.dT().a($$0), Float.MAX_VALUE);
         }

         return brk.a;
      }
   }

   @Override
   public boolean p(cvl $$0) {
      return false;
   }

   public static boolean c(btq<cgl> $$0, ddt $$1, btp $$2, je $$3, azk $$4) {
      return $$1.a_($$3.e()).a(aws.cc) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, dua $$2, je $$3) {
   }

   @Override
   public boolean a(cfv $$0) {
      return false;
   }

   @Nullable
   @Override
   public btc a(arg $$0, btc $$1) {
      return null;
   }

   @Nullable
   @Override
   public awc w() {
      return a(this.dS(), this.dS().z);
   }

   public static awc a(dds $$0, azk $$1) {
      if ($$0.am() != brh.a && $$1.a(1000) == 0) {
         List<btq<?>> $$2 = Lists.newArrayList(cj.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return awd.sG;
      }
   }

   private static awc b(btq<?> $$0) {
      return cj.getOrDefault($$0, awd.sG);
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.sK;
   }

   @Override
   protected awc n_() {
      return awd.sH;
   }

   @Override
   protected void b(je $$0, dua $$1) {
      this.a(awd.tu, 0.15F, 1.0F);
   }

   @Override
   protected boolean aZ() {
      return this.Z > this.cl;
   }

   @Override
   protected void aY() {
      this.a(awd.sJ, 0.15F, 1.0F);
      this.cl = this.Z + this.ce / 2.0F;
   }

   @Override
   public float fe() {
      return a(this.af);
   }

   public static float a(azk $$0) {
      return ($$0.i() - $$0.i()) * 0.2F + 1.0F;
   }

   @Override
   public awe di() {
      return awe.g;
   }

   @Override
   public boolean bF() {
      return true;
   }

   @Override
   protected void F(btj $$0) {
      if (!($$0 instanceof cnp)) {
         super.F($$0);
      }
   }

   @Override
   public boolean a(bsb $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dS().B) {
            this.z(false);
         }

         return super.a($$0, $$1);
      }
   }

   public cgl.b gC() {
      return cgl.b.a(this.am.a(ch));
   }

   public void a(cgl.b $$0) {
      this.am.a(ch, $$0.h);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(ch, 0);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("Variant", this.gC().h);
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.a(cgl.b.a($$0.h("Variant")));
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
   public eye cQ() {
      return new eye(0.0, (double)(0.5F * this.cP()), (double)(this.dn() * 0.4F));
   }

   static class a extends cco {
      public a(bun $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected eye h() {
         eye $$0 = null;
         if (this.b.bi()) {
            $$0 = cfc.a(this.b, 15, 15);
         }

         if (this.b.dV().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private eye k() {
         je $$0 = this.b.ds();
         je.a $$1 = new je.a();
         je.a $$2 = new je.a();

         for (je $$4 : je.b(
            azc.a(this.b.dx() - 3.0),
            azc.a(this.b.dz() - 6.0),
            azc.a(this.b.dD() - 3.0),
            azc.a(this.b.dx() + 3.0),
            azc.a(this.b.dz() + 6.0),
            azc.a(this.b.dD() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               dua $$5 = this.b.dS().a_($$2.a($$4, jj.a));
               boolean $$6 = $$5.b() instanceof dlf || $$5.a(aws.u);
               if ($$6 && this.b.dS().u($$4) && this.b.dS().u($$1.a($$4, jj.b))) {
                  return eye.c($$4);
               }
            }
         }

         return null;
      }
   }

   public static enum b implements azy {
      a(0, "red_blue"),
      b(1, "blue"),
      c(2, "green"),
      d(3, "yellow_blue"),
      e(4, "gray");

      public static final Codec<cgl.b> f = azy.a(cgl.b::values);
      private static final IntFunction<cgl.b> g = axt.a(cgl.b::a, values(), axt.a.c);
      final int h;
      private final String i;

      private b(final int $$0, final String $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public int a() {
         return this.h;
      }

      public static cgl.b a(int $$0) {
         return g.apply($$0);
      }

      @Override
      public String c() {
         return this.i;
      }
   }
}
