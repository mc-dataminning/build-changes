import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfu extends cgb implements buo<cfu.b>, cfn {
   private static final akj<Integer> cf = akn.a(cfu.class, akl.b);
   private static final Predicate<btq> cg = new Predicate<btq>() {
      public boolean a(@Nullable btq $$0) {
         return $$0 != null && cfu.ch.containsKey($$0.ak());
      }
   };
   static final Map<bsz<?>, avy> ch = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bsz.i, avz.sH);
      $$0.put(bsz.l, avz.sI);
      $$0.put(bsz.m, avz.sJ);
      $$0.put(bsz.q, avz.tf);
      $$0.put(bsz.x, avz.sK);
      $$0.put(bsz.B, avz.sL);
      $$0.put(bsz.D, avz.sM);
      $$0.put(bsz.F, avz.sN);
      $$0.put(bsz.I, avz.sO);
      $$0.put(bsz.J, avz.sP);
      $$0.put(bsz.T, avz.sQ);
      $$0.put(bsz.Y, avz.sR);
      $$0.put(bsz.Z, avz.sS);
      $$0.put(bsz.ac, avz.sT);
      $$0.put(bsz.ad, avz.sU);
      $$0.put(bsz.ap, avz.sV);
      $$0.put(bsz.ay, avz.sW);
      $$0.put(bsz.aA, avz.sX);
      $$0.put(bsz.aB, avz.sY);
      $$0.put(bsz.aC, avz.sZ);
      $$0.put(bsz.aH, avz.ta);
      $$0.put(bsz.aK, avz.tb);
      $$0.put(bsz.aM, avz.tc);
      $$0.put(bsz.aN, avz.td);
      $$0.put(bsz.aP, avz.te);
      $$0.put(bsz.aW, avz.tf);
      $$0.put(bsz.aY, avz.tg);
      $$0.put(bsz.bi, avz.th);
      $$0.put(bsz.bk, avz.ti);
      $$0.put(bsz.bm, avz.tj);
      $$0.put(bsz.bo, avz.tk);
      $$0.put(bsz.bp, avz.tl);
      $$0.put(bsz.bq, avz.tm);
      $$0.put(bsz.bt, avz.tn);
      $$0.put(bsz.bu, avz.to);
      $$0.put(bsz.bw, avz.tp);
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

   public cfu(bsz<? extends cfu> $$0, dbx $$1) {
      super($$0, $$1);
      this.bP = new bzm(this, 10, false);
      this.a(eol.n, -1.0F);
      this.a(eol.o, -1.0F);
      this.a(eol.x, -1.0F);
   }

   @Nullable
   @Override
   public buh a(dcm $$0, bqr $$1, bts $$2, @Nullable buh $$3) {
      this.a(ac.a(cfu.b.values(), $$0.E_()));
      if ($$3 == null) {
         $$3 = new bsn.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean p_() {
      return false;
   }

   @Override
   protected void z() {
      this.bS.a(0, new cbf(this, 1.25));
      this.bS.a(0, new cag(this));
      this.bS.a(1, new cau(this, cmw.class, 8.0F));
      this.bS.a(2, new cbr(this));
      this.bS.a(2, new cak(this, 1.0, 5.0F, 1.0F, true));
      this.bS.a(2, new cfu.a(this, 1.0));
      this.bS.a(3, new car(this));
      this.bS.a(3, new caj(this, 1.0, 3.0F, 7.0F));
   }

   public static buv.a gw() {
      return btq.A().a(buw.q, 6.0).a(buw.j, 0.4F).a(buw.r, 0.2F);
   }

   @Override
   protected cda b(dbx $$0) {
      ccy $$1 = new ccy(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   public void n_() {
      if (this.cl == null || !this.cl.a(this.dn(), 3.46) || !this.dP().a_(this.cl).a(dfa.dT)) {
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
      this.cc = ayy.a(this.cc, 0.0F, 1.0F);
      if (!this.aE() && this.ci < 1.0F) {
         this.ci = 1.0F;
      }

      this.ci *= 0.9F;
      evq $$0 = this.ds();
      if (!this.aE() && $$0.d < 0.0) {
         this.h($$0.d(1.0, 0.6, 1.0));
      }

      this.cb = this.cb + this.ci * 2.0F;
   }

   public static boolean a(dbx $$0, bst $$1) {
      if ($$1.bD() && !$$1.aW() && $$0.z.a(2) == 0) {
         List<btq> $$2 = $$0.a(btq.class, $$1.cK().g(20.0), cg);
         if (!$$2.isEmpty()) {
            btq $$3 = $$2.get($$0.z.a($$2.size()));
            if (!$$3.aW()) {
               avy $$4 = b($$3.ak());
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
   public bqt b(cmw $$0, bqs $$1) {
      cuo $$2 = $$0.b($$1);
      if (!this.s() && $$2.a(awx.aw)) {
         $$2.a(1, $$0);
         if (!this.aW()) {
            this.dP().a(null, this.du(), this.dw(), this.dA(), avz.sE, this.de(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
         }

         if (!this.dP().B) {
            if (this.ah.a(10) == 0) {
               this.f($$0);
               this.dP().a(this, (byte)7);
            } else {
               this.dP().a(this, (byte)6);
            }
         }

         return bqt.a(this.dP().B);
      } else if (!$$2.a(awx.ax)) {
         if (!this.gD() && this.s() && this.j($$0)) {
            if (!this.dP().B) {
               this.y(!this.gq());
            }

            return bqt.a(this.dP().B);
         } else {
            return super.b($$0, $$1);
         }
      } else {
         $$2.a(1, $$0);
         this.b(new bsb(bsd.s, 900));
         if ($$0.f() || !this.cu()) {
            this.a(this.dQ().a($$0), Float.MAX_VALUE);
         }

         return bqt.a(this.dP().B);
      }
   }

   @Override
   public boolean o(cuo $$0) {
      return false;
   }

   public static boolean c(bsz<cfu> $$0, dby $$1, bts $$2, iz $$3, azg $$4) {
      return $$1.a_($$3.d()).a(awo.cb) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, dsb $$2, iz $$3) {
   }

   @Override
   public boolean a(cfe $$0) {
      return false;
   }

   @Nullable
   @Override
   public bsn a(are $$0, bsn $$1) {
      return null;
   }

   @Override
   public boolean C(bst $$0) {
      return $$0.a(this.dQ().b((bto)this), 3.0F);
   }

   @Nullable
   @Override
   public avy v() {
      return a(this.dP(), this.dP().z);
   }

   public static avy a(dbx $$0, azg $$1) {
      if ($$0.al() != bqq.a && $$1.a(1000) == 0) {
         List<bsz<?>> $$2 = Lists.newArrayList(ch.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return avz.sC;
      }
   }

   private static avy b(bsz<?> $$0) {
      return ch.getOrDefault($$0, avz.sC);
   }

   @Override
   protected avy d(brm $$0) {
      return avz.sG;
   }

   @Override
   protected avy o_() {
      return avz.sD;
   }

   @Override
   protected void b(iz $$0, dsb $$1) {
      this.a(avz.tq, 0.15F, 1.0F);
   }

   @Override
   protected boolean aV() {
      return this.ab > this.cj;
   }

   @Override
   protected void aU() {
      this.a(avz.sF, 0.15F, 1.0F);
      this.cj = this.ab + this.cc / 2.0F;
   }

   @Override
   public float ff() {
      return a(this.ah);
   }

   public static float a(azg $$0) {
      return ($$0.i() - $$0.i()) * 0.2F + 1.0F;
   }

   @Override
   public awa de() {
      return awa.g;
   }

   @Override
   public boolean bA() {
      return true;
   }

   @Override
   protected void D(bst $$0) {
      if (!($$0 instanceof cmw)) {
         super.D($$0);
      }
   }

   @Override
   public boolean a(brm $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dP().B) {
            this.y(false);
         }

         return super.a($$0, $$1);
      }
   }

   public cfu.b gy() {
      return cfu.b.a(this.ao.a(cf));
   }

   public void a(cfu.b $$0) {
      this.ao.a(cf, $$0.h);
   }

   @Override
   protected void a(akn.a $$0) {
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
      this.a(cfu.b.a($$0.h("Variant")));
   }

   @Override
   public boolean gD() {
      return !this.aE();
   }

   @Override
   public evq cM() {
      return new evq(0.0, (double)(0.5F * this.cL()), (double)(this.dj() * 0.4F));
   }

   static class a extends cby {
      public a(btx $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected evq h() {
         evq $$0 = null;
         if (this.b.be()) {
            $$0 = cem.a(this.b, 15, 15);
         }

         if (this.b.el().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private evq k() {
         iz $$0 = this.b.dp();
         iz.a $$1 = new iz.a();
         iz.a $$2 = new iz.a();

         for (iz $$4 : iz.b(
            ayy.a(this.b.du() - 3.0),
            ayy.a(this.b.dw() - 6.0),
            ayy.a(this.b.dA() - 3.0),
            ayy.a(this.b.du() + 3.0),
            ayy.a(this.b.dw() + 6.0),
            ayy.a(this.b.dA() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               dsb $$5 = this.b.dP().a_($$2.a($$4, je.a));
               boolean $$6 = $$5.b() instanceof dji || $$5.a(awo.t);
               if ($$6 && this.b.dP().u($$4) && this.b.dP().u($$1.a($$4, je.b))) {
                  return evq.c($$4);
               }
            }
         }

         return null;
      }
   }

   public static enum b implements azt {
      a(0, "red_blue"),
      b(1, "blue"),
      c(2, "green"),
      d(3, "yellow_blue"),
      e(4, "gray");

      public static final Codec<cfu.b> f = azt.a(cfu.b::values);
      private static final IntFunction<cfu.b> g = axo.a(cfu.b::a, values(), axo.a.c);
      final int h;
      private final String i;

      private b(final int $$0, final String $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public int a() {
         return this.h;
      }

      public static cfu.b a(int $$0) {
         return g.apply($$0);
      }

      @Override
      public String c() {
         return this.i;
      }
   }
}
