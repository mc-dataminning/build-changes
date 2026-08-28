import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfx extends cge implements bur<cfx.b>, cfq {
   private static final akk<Integer> cf = ako.a(cfx.class, akm.b);
   private static final Predicate<btt> cg = new Predicate<btt>() {
      public boolean a(@Nullable btt $$0) {
         return $$0 != null && cfx.ch.containsKey($$0.ak());
      }
   };
   static final Map<btc<?>, avz> ch = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(btc.i, awa.sH);
      $$0.put(btc.l, awa.sI);
      $$0.put(btc.m, awa.sJ);
      $$0.put(btc.q, awa.tf);
      $$0.put(btc.x, awa.sK);
      $$0.put(btc.B, awa.sL);
      $$0.put(btc.D, awa.sM);
      $$0.put(btc.F, awa.sN);
      $$0.put(btc.I, awa.sO);
      $$0.put(btc.J, awa.sP);
      $$0.put(btc.T, awa.sQ);
      $$0.put(btc.Y, awa.sR);
      $$0.put(btc.Z, awa.sS);
      $$0.put(btc.ac, awa.sT);
      $$0.put(btc.ad, awa.sU);
      $$0.put(btc.ap, awa.sV);
      $$0.put(btc.ay, awa.sW);
      $$0.put(btc.aA, awa.sX);
      $$0.put(btc.aB, awa.sY);
      $$0.put(btc.aC, awa.sZ);
      $$0.put(btc.aH, awa.ta);
      $$0.put(btc.aK, awa.tb);
      $$0.put(btc.aM, awa.tc);
      $$0.put(btc.aN, awa.td);
      $$0.put(btc.aP, awa.te);
      $$0.put(btc.aW, awa.tf);
      $$0.put(btc.aY, awa.tg);
      $$0.put(btc.bi, awa.th);
      $$0.put(btc.bk, awa.ti);
      $$0.put(btc.bm, awa.tj);
      $$0.put(btc.bo, awa.tk);
      $$0.put(btc.bp, awa.tl);
      $$0.put(btc.bq, awa.tm);
      $$0.put(btc.bt, awa.tn);
      $$0.put(btc.bu, awa.to);
      $$0.put(btc.bw, awa.tp);
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

   public cfx(btc<? extends cfx> $$0, dca $$1) {
      super($$0, $$1);
      this.bP = new bzp(this, 10, false);
      this.a(eoo.n, -1.0F);
      this.a(eoo.o, -1.0F);
      this.a(eoo.x, -1.0F);
   }

   @Nullable
   @Override
   public buk a(dcp $$0, bqu $$1, btv $$2, @Nullable buk $$3) {
      this.a(ac.a(cfx.b.values(), $$0.E_()));
      if ($$3 == null) {
         $$3 = new bsq.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean p_() {
      return false;
   }

   @Override
   protected void z() {
      this.bS.a(0, new cbi(this, 1.25));
      this.bS.a(0, new caj(this));
      this.bS.a(1, new cax(this, cmz.class, 8.0F));
      this.bS.a(2, new cbu(this));
      this.bS.a(2, new can(this, 1.0, 5.0F, 1.0F, true));
      this.bS.a(2, new cfx.a(this, 1.0));
      this.bS.a(3, new cau(this));
      this.bS.a(3, new cam(this, 1.0, 3.0F, 7.0F));
   }

   public static buy.a gw() {
      return btt.A().a(buz.q, 6.0).a(buz.j, 0.4F).a(buz.r, 0.2F);
   }

   @Override
   protected cdd b(dca $$0) {
      cdb $$1 = new cdb(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   public void n_() {
      if (this.cl == null || !this.cl.a(this.dn(), 3.46) || !this.dP().a_(this.cl).a(dfd.dT)) {
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
      this.cc = ayz.a(this.cc, 0.0F, 1.0F);
      if (!this.aE() && this.ci < 1.0F) {
         this.ci = 1.0F;
      }

      this.ci *= 0.9F;
      evt $$0 = this.ds();
      if (!this.aE() && $$0.d < 0.0) {
         this.h($$0.d(1.0, 0.6, 1.0));
      }

      this.cb = this.cb + this.ci * 2.0F;
   }

   public static boolean a(dca $$0, bsw $$1) {
      if ($$1.bD() && !$$1.aW() && $$0.z.a(2) == 0) {
         List<btt> $$2 = $$0.a(btt.class, $$1.cK().g(20.0), cg);
         if (!$$2.isEmpty()) {
            btt $$3 = $$2.get($$0.z.a($$2.size()));
            if (!$$3.aW()) {
               avz $$4 = b($$3.ak());
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
   public bqw b(cmz $$0, bqv $$1) {
      cur $$2 = $$0.b($$1);
      if (!this.s() && $$2.a(awy.aw)) {
         $$2.a(1, $$0);
         if (!this.aW()) {
            this.dP().a(null, this.du(), this.dw(), this.dA(), awa.sE, this.de(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
         }

         if (!this.dP().B) {
            if (this.ah.a(10) == 0) {
               this.f($$0);
               this.dP().a(this, (byte)7);
            } else {
               this.dP().a(this, (byte)6);
            }
         }

         return bqw.a(this.dP().B);
      } else if (!$$2.a(awy.ax)) {
         if (!this.gD() && this.s() && this.j($$0)) {
            if (!this.dP().B) {
               this.y(!this.gq());
            }

            return bqw.a(this.dP().B);
         } else {
            return super.b($$0, $$1);
         }
      } else {
         $$2.a(1, $$0);
         this.b(new bse(bsg.s, 900));
         if ($$0.f() || !this.cu()) {
            this.a(this.dQ().a($$0), Float.MAX_VALUE);
         }

         return bqw.a(this.dP().B);
      }
   }

   @Override
   public boolean o(cur $$0) {
      return false;
   }

   public static boolean c(btc<cfx> $$0, dcb $$1, btv $$2, iz $$3, azh $$4) {
      return $$1.a_($$3.d()).a(awp.cb) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, dse $$2, iz $$3) {
   }

   @Override
   public boolean a(cfh $$0) {
      return false;
   }

   @Nullable
   @Override
   public bsq a(arf $$0, bsq $$1) {
      return null;
   }

   @Override
   public boolean C(bsw $$0) {
      return $$0.a(this.dQ().b((btr)this), 3.0F);
   }

   @Nullable
   @Override
   public avz v() {
      return a(this.dP(), this.dP().z);
   }

   public static avz a(dca $$0, azh $$1) {
      if ($$0.al() != bqt.a && $$1.a(1000) == 0) {
         List<btc<?>> $$2 = Lists.newArrayList(ch.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return awa.sC;
      }
   }

   private static avz b(btc<?> $$0) {
      return ch.getOrDefault($$0, awa.sC);
   }

   @Override
   protected avz d(brp $$0) {
      return awa.sG;
   }

   @Override
   protected avz o_() {
      return awa.sD;
   }

   @Override
   protected void b(iz $$0, dse $$1) {
      this.a(awa.tq, 0.15F, 1.0F);
   }

   @Override
   protected boolean aV() {
      return this.ab > this.cj;
   }

   @Override
   protected void aU() {
      this.a(awa.sF, 0.15F, 1.0F);
      this.cj = this.ab + this.cc / 2.0F;
   }

   @Override
   public float ff() {
      return a(this.ah);
   }

   public static float a(azh $$0) {
      return ($$0.i() - $$0.i()) * 0.2F + 1.0F;
   }

   @Override
   public awb de() {
      return awb.g;
   }

   @Override
   public boolean bA() {
      return true;
   }

   @Override
   protected void D(bsw $$0) {
      if (!($$0 instanceof cmz)) {
         super.D($$0);
      }
   }

   @Override
   public boolean a(brp $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dP().B) {
            this.y(false);
         }

         return super.a($$0, $$1);
      }
   }

   public cfx.b gy() {
      return cfx.b.a(this.ao.a(cf));
   }

   public void a(cfx.b $$0) {
      this.ao.a(cf, $$0.h);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(cf, 0);
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      $$0.a("Variant", this.gy().h);
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      this.a(cfx.b.a($$0.h("Variant")));
   }

   @Override
   public boolean gD() {
      return !this.aE();
   }

   @Override
   public evt cM() {
      return new evt(0.0, (double)(0.5F * this.cL()), (double)(this.dj() * 0.4F));
   }

   static class a extends ccb {
      public a(bua $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected evt h() {
         evt $$0 = null;
         if (this.b.be()) {
            $$0 = cep.a(this.b, 15, 15);
         }

         if (this.b.el().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private evt k() {
         iz $$0 = this.b.dp();
         iz.a $$1 = new iz.a();
         iz.a $$2 = new iz.a();

         for (iz $$4 : iz.b(
            ayz.a(this.b.du() - 3.0),
            ayz.a(this.b.dw() - 6.0),
            ayz.a(this.b.dA() - 3.0),
            ayz.a(this.b.du() + 3.0),
            ayz.a(this.b.dw() + 6.0),
            ayz.a(this.b.dA() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               dse $$5 = this.b.dP().a_($$2.a($$4, je.a));
               boolean $$6 = $$5.b() instanceof djl || $$5.a(awp.t);
               if ($$6 && this.b.dP().u($$4) && this.b.dP().u($$1.a($$4, je.b))) {
                  return evt.c($$4);
               }
            }
         }

         return null;
      }
   }

   public static enum b implements azu {
      a(0, "red_blue"),
      b(1, "blue"),
      c(2, "green"),
      d(3, "yellow_blue"),
      e(4, "gray");

      public static final Codec<cfx.b> f = azu.a(cfx.b::values);
      private static final IntFunction<cfx.b> g = axp.a(cfx.b::a, values(), axp.a.c);
      final int h;
      private final String i;

      private b(final int $$0, final String $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public int a() {
         return this.h;
      }

      public static cfx.b a(int $$0) {
         return g.apply($$0);
      }

      @Override
      public String c() {
         return this.i;
      }
   }
}
