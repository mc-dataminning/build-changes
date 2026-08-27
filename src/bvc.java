import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bvc extends bvj implements bjz<bvc.b>, buv {
   private static final aec<Integer> ca = aef.a(bvc.class, aee.b);
   private static final Predicate<bjd> cb = new Predicate<bjd>() {
      public boolean a(@Nullable bjd $$0) {
         return $$0 != null && bvc.ce.containsKey($$0.ag());
      }
   };
   private static final civ cc = cjd.re;
   private static final Set<civ> cd = Sets.newHashSet(new civ[]{cjd.oH, cjd.rk, cjd.rj, cjd.ur, cjd.uo, cjd.up});
   static final Map<bip<?>, aoy> ce = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bip.i, aoz.ra);
      $$0.put(bip.n, aoz.rw);
      $$0.put(bip.u, aoz.rb);
      $$0.put(bip.y, aoz.rc);
      $$0.put(bip.A, aoz.rd);
      $$0.put(bip.C, aoz.re);
      $$0.put(bip.F, aoz.rf);
      $$0.put(bip.G, aoz.rg);
      $$0.put(bip.Q, aoz.rh);
      $$0.put(bip.V, aoz.ri);
      $$0.put(bip.W, aoz.rj);
      $$0.put(bip.Z, aoz.rk);
      $$0.put(bip.aa, aoz.rl);
      $$0.put(bip.al, aoz.rm);
      $$0.put(bip.au, aoz.rn);
      $$0.put(bip.aw, aoz.ro);
      $$0.put(bip.ax, aoz.rp);
      $$0.put(bip.ay, aoz.rq);
      $$0.put(bip.aD, aoz.rr);
      $$0.put(bip.aG, aoz.rs);
      $$0.put(bip.aI, aoz.rt);
      $$0.put(bip.aJ, aoz.ru);
      $$0.put(bip.aL, aoz.rv);
      $$0.put(bip.aS, aoz.rw);
      $$0.put(bip.aU, aoz.rx);
      $$0.put(bip.be, aoz.ry);
      $$0.put(bip.bg, aoz.rz);
      $$0.put(bip.bi, aoz.rA);
      $$0.put(bip.bj, aoz.rB);
      $$0.put(bip.bk, aoz.rC);
      $$0.put(bip.bl, aoz.rD);
      $$0.put(bip.bo, aoz.rE);
      $$0.put(bip.bp, aoz.rF);
      $$0.put(bip.br, aoz.rG);
   });
   public float bW;
   public float bX;
   public float bY;
   public float bZ;
   private float cf = 1.0F;
   private float cg = 1.0F;
   private boolean ch;
   @Nullable
   private gw ci;

   public bvc(bip<? extends bvc> $$0, cpq $$1) {
      super($$0, $$1);
      this.bL = new bow(this, 10, false);
      this.a(eas.n, -1.0F);
      this.a(eas.o, -1.0F);
      this.a(eas.x, -1.0F);
   }

   @Nullable
   @Override
   public bju a(cqf $$0, bgr $$1, bjf $$2, @Nullable bju $$3, @Nullable qu $$4) {
      this.a(ac.a(bvc.b.values(), $$0.y_()));
      if ($$3 == null) {
         $$3 = new big.a(false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean i_() {
      return false;
   }

   @Override
   protected void w() {
      this.bO.a(0, new bqp(this, 1.25));
      this.bO.a(0, new bpq(this));
      this.bO.a(1, new bqe(this, cbp.class, 8.0F));
      this.bO.a(2, new brb(this));
      this.bO.a(2, new bpu(this, 1.0, 5.0F, 1.0F, true));
      this.bO.a(2, new bvc.a(this, 1.0));
      this.bO.a(3, new bqb(this));
      this.bO.a(3, new bpt(this, 1.0, 3.0F, 7.0F));
   }

   public static bkg.a gg() {
      return bjd.x().a(bkh.a, 6.0).a(bkh.e, 0.4F).a(bkh.d, 0.2F);
   }

   @Override
   protected bsk b(cpq $$0) {
      bsi $$1 = new bsi(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected float b(bjn $$0, bim $$1) {
      return $$1.b * 0.6F;
   }

   @Override
   public void b_() {
      if (this.ci == null || !this.ci.a(this.di(), 3.46) || !this.dK().a_(this.ci).a(csr.dT)) {
         this.ch = false;
         this.ci = null;
      }

      if (this.dK().z.a(400) == 0) {
         a(this.dK(), this);
      }

      super.b_();
      this.gk();
   }

   @Override
   public void a(gw $$0, boolean $$1) {
      this.ci = $$0;
      this.ch = $$1;
   }

   public boolean gh() {
      return this.ch;
   }

   private void gk() {
      this.bZ = this.bW;
      this.bY = this.bX;
      this.bX = this.bX + (float)(!this.aA() && !this.bN() ? 4 : -1) * 0.3F;
      this.bX = ars.a(this.bX, 0.0F, 1.0F);
      if (!this.aA() && this.cf < 1.0F) {
         this.cf = 1.0F;
      }

      this.cf *= 0.9F;
      ehi $$0 = this.dn();
      if (!this.aA() && $$0.d < 0.0) {
         this.f($$0.d(1.0, 0.6, 1.0));
      }

      this.bW = this.bW + this.cf * 2.0F;
   }

   public static boolean a(cpq $$0, bil $$1) {
      if ($$1.bv() && !$$1.aS() && $$0.z.a(2) == 0) {
         List<bjd> $$2 = $$0.a(bjd.class, $$1.cG().g(20.0), cb);
         if (!$$2.isEmpty()) {
            bjd $$3 = $$2.get($$0.z.a($$2.size()));
            if (!$$3.aS()) {
               aoy $$4 = b($$3.ag());
               $$0.a(null, $$1.dp(), $$1.dr(), $$1.dv(), $$4, $$1.da(), 0.7F, a($$0.z));
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public bgt b(cbp $$0, bgs $$1) {
      cja $$2 = $$0.b($$1);
      if (!this.p() && cd.contains($$2.d())) {
         if (!$$0.fR().d) {
            $$2.h(1);
         }

         if (!this.aS()) {
            this.dK().a(null, this.dp(), this.dr(), this.dv(), aoz.qX, this.da(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
         }

         if (!this.dK().B) {
            if (this.ag.a(10) == 0) {
               this.f($$0);
               this.dK().a(this, (byte)7);
            } else {
               this.dK().a(this, (byte)6);
            }
         }

         return bgt.a(this.dK().B);
      } else if ($$2.a(cc)) {
         if (!$$0.fR().d) {
            $$2.h(1);
         }

         this.b(new bhy(bia.s, 900));
         if ($$0.f() || !this.cq()) {
            this.a(this.dL().a($$0), Float.MAX_VALUE);
         }

         return bgt.a(this.dK().B);
      } else if (!this.gn() && this.p() && this.j($$0)) {
         if (!this.dK().B) {
            this.z(!this.ga());
         }

         return bgt.a(this.dK().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean m(cja $$0) {
      return false;
   }

   public static boolean c(bip<bvc> $$0, cpr $$1, bjf $$2, gw $$3, arx $$4) {
      return $$1.a_($$3.d()).a(apo.bT) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, dfe $$2, gw $$3) {
   }

   @Override
   public boolean a(bum $$0) {
      return false;
   }

   @Nullable
   @Override
   public big a(akn $$0, big $$1) {
      return null;
   }

   @Override
   public boolean C(bil $$0) {
      return $$0.a(this.dL().b((bjb)this), 3.0F);
   }

   @Nullable
   @Override
   public aoy r() {
      return a(this.dK(), this.dK().z);
   }

   public static aoy a(cpq $$0, arx $$1) {
      if ($$0.ai() != bgq.a && $$1.a(1000) == 0) {
         List<bip<?>> $$2 = Lists.newArrayList(ce.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return aoz.qV;
      }
   }

   private static aoy b(bip<?> $$0) {
      return ce.getOrDefault($$0, aoz.qV);
   }

   @Override
   protected aoy d(bhj $$0) {
      return aoz.qZ;
   }

   @Override
   protected aoy h_() {
      return aoz.qW;
   }

   @Override
   protected void b(gw $$0, dfe $$1) {
      this.a(aoz.rH, 0.15F, 1.0F);
   }

   @Override
   protected boolean aR() {
      return this.aa > this.cg;
   }

   @Override
   protected void aQ() {
      this.a(aoz.qY, 0.15F, 1.0F);
      this.cg = this.aa + this.bX / 2.0F;
   }

   @Override
   public float eV() {
      return a(this.ag);
   }

   public static float a(arx $$0) {
      return ($$0.i() - $$0.i()) * 0.2F + 1.0F;
   }

   @Override
   public apa da() {
      return apa.g;
   }

   @Override
   public boolean bs() {
      return true;
   }

   @Override
   protected void D(bil $$0) {
      if (!($$0 instanceof cbp)) {
         super.D($$0);
      }
   }

   @Override
   public boolean a(bhj $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dK().B) {
            this.z(false);
         }

         return super.a($$0, $$1);
      }
   }

   public bvc.b gi() {
      return bvc.b.a(this.an.b(ca));
   }

   public void a(bvc.b $$0) {
      this.an.b(ca, $$0.h);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(ca, 0);
   }

   @Override
   public void b(qu $$0) {
      super.b($$0);
      $$0.a("Variant", this.gi().h);
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      this.a(bvc.b.a($$0.h("Variant")));
   }

   @Override
   public boolean gn() {
      return !this.aA();
   }

   @Override
   public ehi cI() {
      return new ehi(0.0, (double)(0.5F * this.cH()), (double)(this.df() * 0.4F));
   }

   @Override
   protected Vector3f a(bil $$0, bim $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.4375F * $$2, 0.0F);
   }

   static class a extends bri {
      public a(bjk $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected ehi h() {
         ehi $$0 = null;
         if (this.b.aX()) {
            $$0 = btu.a(this.b, 15, 15);
         }

         if (this.b.ee().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private ehi k() {
         gw $$0 = this.b.dk();
         gw.a $$1 = new gw.a();
         gw.a $$2 = new gw.a();

         for (gw $$4 : gw.b(
            ars.a(this.b.dp() - 3.0),
            ars.a(this.b.dr() - 6.0),
            ars.a(this.b.dv() - 3.0),
            ars.a(this.b.dp() + 3.0),
            ars.a(this.b.dr() + 6.0),
            ars.a(this.b.dv() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               dfe $$5 = this.b.dK().a_($$2.a($$4, hc.a));
               boolean $$6 = $$5.b() instanceof cwx || $$5.a(apo.t);
               if ($$6 && this.b.dK().t($$4) && this.b.dK().t($$1.a($$4, hc.b))) {
                  return ehi.c($$4);
               }
            }
         }

         return null;
      }
   }

   public static enum b implements ask {
      a(0, "red_blue"),
      b(1, "blue"),
      c(2, "green"),
      d(3, "yellow_blue"),
      e(4, "gray");

      public static final Codec<bvc.b> f = ask.a(bvc.b::values);
      private static final IntFunction<bvc.b> g = aqn.a(bvc.b::a, values(), aqn.a.c);
      final int h;
      private final String i;

      private b(int $$0, String $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public int a() {
         return this.h;
      }

      public static bvc.b a(int $$0) {
         return g.apply($$0);
      }

      @Override
      public String c() {
         return this.i;
      }
   }
}
