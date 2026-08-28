import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class chl extends chs implements bwe<chl.b>, che {
   private static final ako<Integer> cg = aks.a(chl.class, akq.b);
   private static final Predicate<bvg> ch = new Predicate<bvg>() {
      public boolean a(@Nullable bvg $$0) {
         return $$0 != null && chl.ci.containsKey($$0.ar());
      }
   };
   static final Map<bup<?>, awn> ci = ae.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bup.i, awo.sJ);
      $$0.put(bup.l, awo.sK);
      $$0.put(bup.m, awo.sL);
      $$0.put(bup.q, awo.th);
      $$0.put(bup.x, awo.sM);
      $$0.put(bup.B, awo.sN);
      $$0.put(bup.D, awo.sO);
      $$0.put(bup.F, awo.sP);
      $$0.put(bup.I, awo.sQ);
      $$0.put(bup.J, awo.sR);
      $$0.put(bup.T, awo.sS);
      $$0.put(bup.Y, awo.sT);
      $$0.put(bup.Z, awo.sU);
      $$0.put(bup.ac, awo.sV);
      $$0.put(bup.ad, awo.sW);
      $$0.put(bup.ap, awo.sX);
      $$0.put(bup.ay, awo.sY);
      $$0.put(bup.aA, awo.sZ);
      $$0.put(bup.aB, awo.ta);
      $$0.put(bup.aC, awo.tb);
      $$0.put(bup.aH, awo.tc);
      $$0.put(bup.aK, awo.td);
      $$0.put(bup.aM, awo.te);
      $$0.put(bup.aN, awo.tf);
      $$0.put(bup.aP, awo.tg);
      $$0.put(bup.aW, awo.th);
      $$0.put(bup.aY, awo.ti);
      $$0.put(bup.bi, awo.tj);
      $$0.put(bup.bk, awo.tk);
      $$0.put(bup.bm, awo.tl);
      $$0.put(bup.bo, awo.tm);
      $$0.put(bup.bp, awo.tn);
      $$0.put(bup.bq, awo.to);
      $$0.put(bup.bt, awo.tp);
      $$0.put(bup.bu, awo.tq);
      $$0.put(bup.bw, awo.tr);
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

   public chl(bup<? extends chl> $$0, dff $$1) {
      super($$0, $$1);
      this.bP = new cbc(this, 10, false);
      this.a(esf.n, -1.0F);
      this.a(esf.o, -1.0F);
      this.a(esf.x, -1.0F);
   }

   @Nullable
   @Override
   public bvx a(dfw $$0, bsf $$1, buo $$2, @Nullable bvx $$3) {
      this.a(ae.a(chl.b.values(), $$0.E_()));
      if ($$3 == null) {
         $$3 = new btz.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean p_() {
      return false;
   }

   @Override
   protected void D() {
      this.bS.a(0, new bwb.a(1.25));
      this.bS.a(0, new cbw(this));
      this.bS.a(1, new cck(this, cor.class, 8.0F));
      this.bS.a(2, new cdh(this));
      this.bS.a(2, new cca(this, 1.0, 5.0F, 1.0F));
      this.bS.a(2, new chl.a(this, 1.0));
      this.bS.a(3, new cch(this));
      this.bS.a(3, new cbz(this, 1.0, 3.0F, 7.0F));
   }

   public static bwl.a gH() {
      return cgv.gA().a(bwm.s, 6.0).a(bwm.l, 0.4F).a(bwm.v, 0.2F).a(bwm.c, 3.0);
   }

   @Override
   protected ceq b(dff $$0) {
      ceo $$1 = new ceo(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   public void n_() {
      if (this.cm == null || !this.cm.a(this.dw(), 3.46) || !this.dY().a_(this.cm).a(dil.dT)) {
         this.cl = false;
         this.cm = null;
      }

      if (this.dY().A.a(400) == 0) {
         a(this.dY(), this);
      }

      super.n_();
      this.gM();
   }

   @Override
   public void a(jh $$0, boolean $$1) {
      this.cm = $$0;
      this.cl = $$1;
   }

   public boolean gI() {
      return this.cl;
   }

   private void gM() {
      this.cf = this.cc;
      this.ce = this.cd;
      this.cd = this.cd + (float)(!this.aL() && !this.cb() ? 4 : -1) * 0.3F;
      this.cd = azn.a(this.cd, 0.0F, 1.0F);
      if (!this.aL() && this.cj < 1.0F) {
         this.cj = 1.0F;
      }

      this.cj *= 0.9F;
      ezr $$0 = this.dB();
      if (!this.aL() && $$0.e < 0.0) {
         this.h($$0.d(1.0, 0.6, 1.0));
      }

      this.cc = this.cc + this.cj * 2.0F;
   }

   public static boolean a(dff $$0, bui $$1) {
      if ($$1.bN() && !$$1.bd() && $$0.A.a(2) == 0) {
         List<bvg> $$2 = $$0.a(bvg.class, $$1.cT().g(20.0), ch);
         if (!$$2.isEmpty()) {
            bvg $$3 = $$2.get($$0.A.a($$2.size()));
            if (!$$3.bd()) {
               awn $$4 = b($$3.ar());
               $$0.a(null, $$1.dD(), $$1.dF(), $$1.dJ(), $$4, $$1.do(), 0.7F, a($$0.A));
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public bsh b(cor $$0, bsg $$1) {
      cwf $$2 = $$0.b($$1);
      if (!this.q() && $$2.a(axm.aB)) {
         $$2.a(1, $$0);
         if (!this.bd()) {
            this.dY().a(null, this.dD(), this.dF(), this.dJ(), awo.sG, this.do(), 1.0F, 1.0F + (this.af.i() - this.af.i()) * 0.2F);
         }

         if (!this.dY().C) {
            if (this.af.a(10) == 0) {
               this.a($$0);
               this.dY().a(this, (byte)7);
            } else {
               this.dY().a(this, (byte)6);
            }
         }

         return bsh.a;
      } else if (!$$2.a(axm.aC)) {
         if (!this.gK() && this.q() && this.j($$0)) {
            if (!this.dY().C) {
               this.z(!this.gv());
            }

            return bsh.a;
         } else {
            return super.b($$0, $$1);
         }
      } else {
         $$2.a(1, $$0);
         this.a(new btn(btp.s, 900));
         if ($$0.f() || !this.cE()) {
            this.a(this.dZ().a($$0), Float.MAX_VALUE);
         }

         return bsh.a;
      }
   }

   @Override
   public boolean l(cwf $$0) {
      return false;
   }

   public static boolean c(bup<chl> $$0, dfg $$1, buo $$2, jh $$3, azv $$4) {
      return $$1.a_($$3.e()).a(axd.cc) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, dvo $$2, jh $$3) {
   }

   @Override
   public boolean a(cgv $$0) {
      return false;
   }

   @Nullable
   @Override
   public btz a(arq $$0, btz $$1) {
      return null;
   }

   @Nullable
   @Override
   public awn w() {
      return a(this.dY(), this.dY().A);
   }

   public static awn a(dff $$0, azv $$1) {
      if ($$0.ak() != bse.a && $$1.a(1000) == 0) {
         List<bup<?>> $$2 = Lists.newArrayList(ci.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return awo.sE;
      }
   }

   private static awn b(bup<?> $$0) {
      return ci.getOrDefault($$0, awo.sE);
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.sI;
   }

   @Override
   protected awn o_() {
      return awo.sF;
   }

   @Override
   protected void b(jh $$0, dvo $$1) {
      this.a(awo.ts, 0.15F, 1.0F);
   }

   @Override
   protected boolean bc() {
      return this.Z > this.ck;
   }

   @Override
   protected void bb() {
      this.a(awo.sH, 0.15F, 1.0F);
      this.ck = this.Z + this.cd / 2.0F;
   }

   @Override
   public float fk() {
      return a(this.af);
   }

   public static float a(azv $$0) {
      return ($$0.i() - $$0.i()) * 0.2F + 1.0F;
   }

   @Override
   public awp do() {
      return awp.g;
   }

   @Override
   public boolean bK() {
      return true;
   }

   @Override
   protected void F(bui $$0) {
      if (!($$0 instanceof cor)) {
         super.F($$0);
      }
   }

   @Override
   public boolean a(bsy $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dY().C) {
            this.z(false);
         }

         return super.a($$0, $$1);
      }
   }

   public chl.b gJ() {
      return chl.b.a(this.am.a(cg));
   }

   public void a(chl.b $$0) {
      this.am.a(cg, $$0.h);
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(cg, 0);
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      $$0.a("Variant", this.gJ().h);
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      this.a(chl.b.a($$0.h("Variant")));
   }

   @Override
   public boolean gK() {
      return !this.aL();
   }

   @Override
   protected boolean gz() {
      return true;
   }

   @Override
   public ezr cV() {
      return new ezr(0.0, (double)(0.5F * this.cU()), (double)(this.dt() * 0.4F));
   }

   static class a extends cdo {
      public a(bvm $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected ezr h() {
         ezr $$0 = null;
         if (this.b.bl()) {
            $$0 = cgc.a(this.b, 15, 15);
         }

         if (this.b.eb().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private ezr k() {
         jh $$0 = this.b.dy();
         jh.a $$1 = new jh.a();
         jh.a $$2 = new jh.a();

         for (jh $$4 : jh.b(
            azn.a(this.b.dD() - 3.0),
            azn.a(this.b.dF() - 6.0),
            azn.a(this.b.dJ() - 3.0),
            azn.a(this.b.dD() + 3.0),
            azn.a(this.b.dF() + 6.0),
            azn.a(this.b.dJ() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               dvo $$5 = this.b.dY().a_($$2.a($$4, jm.a));
               boolean $$6 = $$5.b() instanceof dms || $$5.a(axd.u);
               if ($$6 && this.b.dY().u($$4) && this.b.dY().u($$1.a($$4, jm.b))) {
                  return ezr.c($$4);
               }
            }
         }

         return null;
      }
   }

   public static enum b implements baj {
      a(0, "red_blue"),
      b(1, "blue"),
      c(2, "green"),
      d(3, "yellow_blue"),
      e(4, "gray");

      public static final Codec<chl.b> f = baj.a(chl.b::values);
      private static final IntFunction<chl.b> g = aye.a(chl.b::a, values(), aye.a.c);
      final int h;
      private final String i;

      private b(final int $$0, final String $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public int a() {
         return this.h;
      }

      public static chl.b a(int $$0) {
         return g.apply($$0);
      }

      @Override
      public String c() {
         return this.i;
      }
   }
}
