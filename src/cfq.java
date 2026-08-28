import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfq extends cfx implements buk<cfq.b>, cfj {
   private static final akg<Integer> cf = akk.a(cfq.class, aki.b);
   private static final Predicate<btm> cg = new Predicate<btm>() {
      public boolean a(@Nullable btm $$0) {
         return $$0 != null && cfq.ch.containsKey($$0.ak());
      }
   };
   static final Map<bsv<?>, avv> ch = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bsv.i, avw.sH);
      $$0.put(bsv.l, avw.sI);
      $$0.put(bsv.m, avw.sJ);
      $$0.put(bsv.q, avw.tf);
      $$0.put(bsv.x, avw.sK);
      $$0.put(bsv.B, avw.sL);
      $$0.put(bsv.D, avw.sM);
      $$0.put(bsv.F, avw.sN);
      $$0.put(bsv.I, avw.sO);
      $$0.put(bsv.J, avw.sP);
      $$0.put(bsv.T, avw.sQ);
      $$0.put(bsv.Y, avw.sR);
      $$0.put(bsv.Z, avw.sS);
      $$0.put(bsv.ac, avw.sT);
      $$0.put(bsv.ad, avw.sU);
      $$0.put(bsv.ap, avw.sV);
      $$0.put(bsv.ay, avw.sW);
      $$0.put(bsv.aA, avw.sX);
      $$0.put(bsv.aB, avw.sY);
      $$0.put(bsv.aC, avw.sZ);
      $$0.put(bsv.aH, avw.ta);
      $$0.put(bsv.aK, avw.tb);
      $$0.put(bsv.aM, avw.tc);
      $$0.put(bsv.aN, avw.td);
      $$0.put(bsv.aP, avw.te);
      $$0.put(bsv.aW, avw.tf);
      $$0.put(bsv.aY, avw.tg);
      $$0.put(bsv.bi, avw.th);
      $$0.put(bsv.bk, avw.ti);
      $$0.put(bsv.bm, avw.tj);
      $$0.put(bsv.bo, avw.tk);
      $$0.put(bsv.bp, avw.tl);
      $$0.put(bsv.bq, avw.tm);
      $$0.put(bsv.bt, avw.tn);
      $$0.put(bsv.bu, avw.to);
      $$0.put(bsv.bw, avw.tp);
   });
   public float cb;
   public float cc;
   public float cd;
   public float ce;
   private float ci = 1.0F;
   private float cj = 1.0F;
   private boolean ck;
   @Nullable
   private iz cl;

   public cfq(bsv<? extends cfq> $$0, dbt $$1) {
      super($$0, $$1);
      this.bP = new bzi(this, 10, false);
      this.a(eoh.n, -1.0F);
      this.a(eoh.o, -1.0F);
      this.a(eoh.x, -1.0F);
   }

   @Nullable
   @Override
   public bud a(dci $$0, bqn $$1, bto $$2, @Nullable bud $$3) {
      this.a(ac.a(cfq.b.values(), $$0.E_()));
      if ($$3 == null) {
         $$3 = new bsj.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean p_() {
      return false;
   }

   @Override
   protected void z() {
      this.bS.a(0, new cbb(this, 1.25));
      this.bS.a(0, new cac(this));
      this.bS.a(1, new caq(this, cms.class, 8.0F));
      this.bS.a(2, new cbn(this));
      this.bS.a(2, new cag(this, 1.0, 5.0F, 1.0F, true));
      this.bS.a(2, new cfq.a(this, 1.0));
      this.bS.a(3, new can(this));
      this.bS.a(3, new caf(this, 1.0, 3.0F, 7.0F));
   }

   public static bur.a gw() {
      return btm.A().a(bus.q, 6.0).a(bus.j, 0.4F).a(bus.r, 0.2F);
   }

   @Override
   protected ccw b(dbt $$0) {
      ccu $$1 = new ccu(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   public void n_() {
      if (this.cl == null || !this.cl.a(this.dn(), 3.46) || !this.dP().a_(this.cl).a(dew.dT)) {
         this.ck = false;
         this.cl = null;
      }

      if (this.dP().z.a(400) == 0) {
         a(this.dP(), this);
      }

      super.n_();
      this.gA();
   }

   @Override
   public void a(iz $$0, boolean $$1) {
      this.cl = $$0;
      this.ck = $$1;
   }

   public boolean gx() {
      return this.ck;
   }

   private void gA() {
      this.ce = this.cb;
      this.cd = this.cc;
      this.cc = this.cc + (float)(!this.aE() && !this.bR() ? 4 : -1) * 0.3F;
      this.cc = ayu.a(this.cc, 0.0F, 1.0F);
      if (!this.aE() && this.ci < 1.0F) {
         this.ci = 1.0F;
      }

      this.ci *= 0.9F;
      evm $$0 = this.ds();
      if (!this.aE() && $$0.d < 0.0) {
         this.h($$0.d(1.0, 0.6, 1.0));
      }

      this.cb = this.cb + this.ci * 2.0F;
   }

   public static boolean a(dbt $$0, bsp $$1) {
      if ($$1.bD() && !$$1.aW() && $$0.z.a(2) == 0) {
         List<btm> $$2 = $$0.a(btm.class, $$1.cK().g(20.0), cg);
         if (!$$2.isEmpty()) {
            btm $$3 = $$2.get($$0.z.a($$2.size()));
            if (!$$3.aW()) {
               avv $$4 = b($$3.ak());
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
   public bqp b(cms $$0, bqo $$1) {
      cuk $$2 = $$0.b($$1);
      if (!this.s() && $$2.a(awu.aw)) {
         $$2.a(1, $$0);
         if (!this.aW()) {
            this.dP().a(null, this.du(), this.dw(), this.dA(), avw.sE, this.de(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
         }

         if (!this.dP().B) {
            if (this.ah.a(10) == 0) {
               this.f($$0);
               this.dP().a(this, (byte)7);
            } else {
               this.dP().a(this, (byte)6);
            }
         }

         return bqp.a(this.dP().B);
      } else if (!$$2.a(awu.ax)) {
         if (!this.gD() && this.s() && this.j($$0)) {
            if (!this.dP().B) {
               this.y(!this.gq());
            }

            return bqp.a(this.dP().B);
         } else {
            return super.b($$0, $$1);
         }
      } else {
         $$2.a(1, $$0);
         this.b(new brx(brz.s, 900));
         if ($$0.f() || !this.cu()) {
            this.a(this.dQ().a($$0), Float.MAX_VALUE);
         }

         return bqp.a(this.dP().B);
      }
   }

   @Override
   public boolean o(cuk $$0) {
      return false;
   }

   public static boolean c(bsv<cfq> $$0, dbu $$1, bto $$2, iz $$3, azc $$4) {
      return $$1.a_($$3.d()).a(awl.cb) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, drx $$2, iz $$3) {
   }

   @Override
   public boolean a(cfa $$0) {
      return false;
   }

   @Nullable
   @Override
   public bsj a(arb $$0, bsj $$1) {
      return null;
   }

   @Override
   public boolean C(bsp $$0) {
      return $$0.a(this.dQ().b((btk)this), 3.0F);
   }

   @Nullable
   @Override
   public avv v() {
      return a(this.dP(), this.dP().z);
   }

   public static avv a(dbt $$0, azc $$1) {
      if ($$0.al() != bqm.a && $$1.a(1000) == 0) {
         List<bsv<?>> $$2 = Lists.newArrayList(ch.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return avw.sC;
      }
   }

   private static avv b(bsv<?> $$0) {
      return ch.getOrDefault($$0, avw.sC);
   }

   @Override
   protected avv d(bri $$0) {
      return avw.sG;
   }

   @Override
   protected avv o_() {
      return avw.sD;
   }

   @Override
   protected void b(iz $$0, drx $$1) {
      this.a(avw.tq, 0.15F, 1.0F);
   }

   @Override
   protected boolean aV() {
      return this.ab > this.cj;
   }

   @Override
   protected void aU() {
      this.a(avw.sF, 0.15F, 1.0F);
      this.cj = this.ab + this.cc / 2.0F;
   }

   @Override
   public float ff() {
      return a(this.ah);
   }

   public static float a(azc $$0) {
      return ($$0.i() - $$0.i()) * 0.2F + 1.0F;
   }

   @Override
   public avx de() {
      return avx.g;
   }

   @Override
   public boolean bA() {
      return true;
   }

   @Override
   protected void D(bsp $$0) {
      if (!($$0 instanceof cms)) {
         super.D($$0);
      }
   }

   @Override
   public boolean a(bri $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dP().B) {
            this.y(false);
         }

         return super.a($$0, $$1);
      }
   }

   public cfq.b gy() {
      return cfq.b.a(this.ao.a(cf));
   }

   public void a(cfq.b $$0) {
      this.ao.a(cf, $$0.h);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(cf, 0);
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("Variant", this.gy().h);
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      this.a(cfq.b.a($$0.h("Variant")));
   }

   @Override
   public boolean gD() {
      return !this.aE();
   }

   @Override
   public evm cM() {
      return new evm(0.0, (double)(0.5F * this.cL()), (double)(this.dj() * 0.4F));
   }

   static class a extends cbu {
      public a(btt $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected evm h() {
         evm $$0 = null;
         if (this.b.be()) {
            $$0 = cei.a(this.b, 15, 15);
         }

         if (this.b.el().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private evm k() {
         iz $$0 = this.b.dp();
         iz.a $$1 = new iz.a();
         iz.a $$2 = new iz.a();

         for (iz $$4 : iz.b(
            ayu.a(this.b.du() - 3.0),
            ayu.a(this.b.dw() - 6.0),
            ayu.a(this.b.dA() - 3.0),
            ayu.a(this.b.du() + 3.0),
            ayu.a(this.b.dw() + 6.0),
            ayu.a(this.b.dA() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               drx $$5 = this.b.dP().a_($$2.a($$4, je.a));
               boolean $$6 = $$5.b() instanceof dje || $$5.a(awl.t);
               if ($$6 && this.b.dP().u($$4) && this.b.dP().u($$1.a($$4, je.b))) {
                  return evm.c($$4);
               }
            }
         }

         return null;
      }
   }

   public static enum b implements azp {
      a(0, "red_blue"),
      b(1, "blue"),
      c(2, "green"),
      d(3, "yellow_blue"),
      e(4, "gray");

      public static final Codec<cfq.b> f = azp.a(cfq.b::values);
      private static final IntFunction<cfq.b> g = axl.a(cfq.b::a, values(), axl.a.c);
      final int h;
      private final String i;

      private b(final int $$0, final String $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public int a() {
         return this.h;
      }

      public static cfq.b a(int $$0) {
         return g.apply($$0);
      }

      @Override
      public String c() {
         return this.i;
      }
   }
}
