import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cew extends cfd implements btq<cew.b>, cep {
   private static final ajs<Integer> cf = ajw.a(cew.class, aju.b);
   private static final Predicate<bss> cg = new Predicate<bss>() {
      public boolean a(@Nullable bss $$0) {
         return $$0 != null && cew.ch.containsKey($$0.ak());
      }
   };
   static final Map<bsc<?>, avh> ch = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bsc.i, avi.sH);
      $$0.put(bsc.l, avi.sI);
      $$0.put(bsc.m, avi.sJ);
      $$0.put(bsc.q, avi.tf);
      $$0.put(bsc.x, avi.sK);
      $$0.put(bsc.B, avi.sL);
      $$0.put(bsc.D, avi.sM);
      $$0.put(bsc.F, avi.sN);
      $$0.put(bsc.I, avi.sO);
      $$0.put(bsc.J, avi.sP);
      $$0.put(bsc.T, avi.sQ);
      $$0.put(bsc.Y, avi.sR);
      $$0.put(bsc.Z, avi.sS);
      $$0.put(bsc.ac, avi.sT);
      $$0.put(bsc.ad, avi.sU);
      $$0.put(bsc.ap, avi.sV);
      $$0.put(bsc.ay, avi.sW);
      $$0.put(bsc.aA, avi.sX);
      $$0.put(bsc.aB, avi.sY);
      $$0.put(bsc.aC, avi.sZ);
      $$0.put(bsc.aH, avi.ta);
      $$0.put(bsc.aK, avi.tb);
      $$0.put(bsc.aM, avi.tc);
      $$0.put(bsc.aN, avi.td);
      $$0.put(bsc.aP, avi.te);
      $$0.put(bsc.aW, avi.tf);
      $$0.put(bsc.aY, avi.tg);
      $$0.put(bsc.bi, avi.th);
      $$0.put(bsc.bk, avi.ti);
      $$0.put(bsc.bm, avi.tj);
      $$0.put(bsc.bo, avi.tk);
      $$0.put(bsc.bp, avi.tl);
      $$0.put(bsc.bq, avi.tm);
      $$0.put(bsc.bt, avi.tn);
      $$0.put(bsc.bu, avi.to);
      $$0.put(bsc.bw, avi.tp);
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

   public cew(bsc<? extends cew> $$0, daz $$1) {
      super($$0, $$1);
      this.bP = new byo(this, 10, false);
      this.a(enn.n, -1.0F);
      this.a(enn.o, -1.0F);
      this.a(enn.x, -1.0F);
   }

   @Nullable
   @Override
   public btj a(dbo $$0, bpu $$1, bsu $$2, @Nullable btj $$3) {
      this.a(ac.a(cew.b.values(), $$0.E_()));
      if ($$3 == null) {
         $$3 = new brq.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean p_() {
      return false;
   }

   @Override
   protected void z() {
      this.bS.a(0, new cah(this, 1.25));
      this.bS.a(0, new bzi(this));
      this.bS.a(1, new bzw(this, cly.class, 8.0F));
      this.bS.a(2, new cat(this));
      this.bS.a(2, new bzm(this, 1.0, 5.0F, 1.0F, true));
      this.bS.a(2, new cew.a(this, 1.0));
      this.bS.a(3, new bzt(this));
      this.bS.a(3, new bzl(this, 1.0, 3.0F, 7.0F));
   }

   public static btx.a gv() {
      return bss.A().a(bty.q, 6.0).a(bty.j, 0.4F).a(bty.r, 0.2F);
   }

   @Override
   protected ccc b(daz $$0) {
      cca $$1 = new cca(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   public void n_() {
      if (this.cl == null || !this.cl.a(this.dn(), 3.46) || !this.dP().a_(this.cl).a(dec.dT)) {
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
      this.cc = ayf.a(this.cc, 0.0F, 1.0F);
      if (!this.aE() && this.ci < 1.0F) {
         this.ci = 1.0F;
      }

      this.ci *= 0.9F;
      eum $$0 = this.ds();
      if (!this.aE() && $$0.d < 0.0) {
         this.g($$0.d(1.0, 0.6, 1.0));
      }

      this.cb = this.cb + this.ci * 2.0F;
   }

   public static boolean a(daz $$0, brw $$1) {
      if ($$1.bD() && !$$1.aW() && $$0.z.a(2) == 0) {
         List<bss> $$2 = $$0.a(bss.class, $$1.cK().g(20.0), cg);
         if (!$$2.isEmpty()) {
            bss $$3 = $$2.get($$0.z.a($$2.size()));
            if (!$$3.aW()) {
               avh $$4 = b($$3.ak());
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
   public bpw b(cly $$0, bpv $$1) {
      ctq $$2 = $$0.b($$1);
      if (!this.s() && $$2.a(awf.aw)) {
         $$2.a(1, $$0);
         if (!this.aW()) {
            this.dP().a(null, this.du(), this.dw(), this.dA(), avi.sE, this.de(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
         }

         if (!this.dP().B) {
            if (this.ah.a(10) == 0) {
               this.f($$0);
               this.dP().a(this, (byte)7);
            } else {
               this.dP().a(this, (byte)6);
            }
         }

         return bpw.a(this.dP().B);
      } else if (!$$2.a(awf.ax)) {
         if (!this.gC() && this.s() && this.j($$0)) {
            if (!this.dP().B) {
               this.y(!this.gp());
            }

            return bpw.a(this.dP().B);
         } else {
            return super.b($$0, $$1);
         }
      } else {
         $$2.a(1, $$0);
         this.b(new bre(brg.s, 900));
         if ($$0.f() || !this.cu()) {
            this.a(this.dQ().a($$0), Float.MAX_VALUE);
         }

         return bpw.a(this.dP().B);
      }
   }

   @Override
   public boolean o(ctq $$0) {
      return false;
   }

   public static boolean c(bsc<cew> $$0, dba $$1, bsu $$2, io $$3, aym $$4) {
      return $$1.a_($$3.d()).a(avx.cb) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, drd $$2, io $$3) {
   }

   @Override
   public boolean a(ceg $$0) {
      return false;
   }

   @Nullable
   @Override
   public brq a(aqn $$0, brq $$1) {
      return null;
   }

   @Override
   public boolean C(brw $$0) {
      return $$0.a(this.dQ().b((bsq)this), 3.0F);
   }

   @Nullable
   @Override
   public avh v() {
      return a(this.dP(), this.dP().z);
   }

   public static avh a(daz $$0, aym $$1) {
      if ($$0.ak() != bpt.a && $$1.a(1000) == 0) {
         List<bsc<?>> $$2 = Lists.newArrayList(ch.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return avi.sC;
      }
   }

   private static avh b(bsc<?> $$0) {
      return ch.getOrDefault($$0, avi.sC);
   }

   @Override
   protected avh d(bqp $$0) {
      return avi.sG;
   }

   @Override
   protected avh o_() {
      return avi.sD;
   }

   @Override
   protected void b(io $$0, drd $$1) {
      this.a(avi.tq, 0.15F, 1.0F);
   }

   @Override
   protected boolean aV() {
      return this.ab > this.cj;
   }

   @Override
   protected void aU() {
      this.a(avi.sF, 0.15F, 1.0F);
      this.cj = this.ab + this.cc / 2.0F;
   }

   @Override
   public float ff() {
      return a(this.ah);
   }

   public static float a(aym $$0) {
      return ($$0.i() - $$0.i()) * 0.2F + 1.0F;
   }

   @Override
   public avj de() {
      return avj.g;
   }

   @Override
   public boolean bA() {
      return true;
   }

   @Override
   protected void D(brw $$0) {
      if (!($$0 instanceof cly)) {
         super.D($$0);
      }
   }

   @Override
   public boolean a(bqp $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dP().B) {
            this.y(false);
         }

         return super.a($$0, $$1);
      }
   }

   public cew.b gx() {
      return cew.b.a(this.ao.a(cf));
   }

   public void a(cew.b $$0) {
      this.ao.a(cf, $$0.h);
   }

   @Override
   protected void a(ajw.a $$0) {
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
      this.a(cew.b.a($$0.h("Variant")));
   }

   @Override
   public boolean gC() {
      return !this.aE();
   }

   @Override
   public eum cM() {
      return new eum(0.0, (double)(0.5F * this.cL()), (double)(this.dj() * 0.4F));
   }

   static class a extends cba {
      public a(bsz $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected eum h() {
         eum $$0 = null;
         if (this.b.be()) {
            $$0 = cdo.a(this.b, 15, 15);
         }

         if (this.b.el().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private eum k() {
         io $$0 = this.b.dp();
         io.a $$1 = new io.a();
         io.a $$2 = new io.a();

         for (io $$4 : io.b(
            ayf.a(this.b.du() - 3.0),
            ayf.a(this.b.dw() - 6.0),
            ayf.a(this.b.dA() - 3.0),
            ayf.a(this.b.du() + 3.0),
            ayf.a(this.b.dw() + 6.0),
            ayf.a(this.b.dA() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               drd $$5 = this.b.dP().a_($$2.a($$4, it.a));
               boolean $$6 = $$5.b() instanceof dik || $$5.a(avx.t);
               if ($$6 && this.b.dP().u($$4) && this.b.dP().u($$1.a($$4, it.b))) {
                  return eum.c($$4);
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

      public static final Codec<cew.b> f = ayz.a(cew.b::values);
      private static final IntFunction<cew.b> g = aww.a(cew.b::a, values(), aww.a.c);
      final int h;
      private final String i;

      private b(int $$0, String $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public int a() {
         return this.h;
      }

      public static cew.b a(int $$0) {
         return g.apply($$0);
      }

      @Override
      public String c() {
         return this.i;
      }
   }
}
