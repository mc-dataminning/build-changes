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

public class buz extends bvg implements bjw<buz.b>, bus {
   private static final adz<Integer> ca = aec.a(buz.class, aeb.b);
   private static final Predicate<bja> cb = new Predicate<bja>() {
      public boolean a(@Nullable bja $$0) {
         return $$0 != null && buz.ce.containsKey($$0.ag());
      }
   };
   private static final cis cc = cja.re;
   private static final Set<cis> cd = Sets.newHashSet(new cis[]{cja.oH, cja.rk, cja.rj, cja.ur, cja.uo, cja.up});
   static final Map<bim<?>, aov> ce = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bim.i, aow.ra);
      $$0.put(bim.n, aow.rw);
      $$0.put(bim.u, aow.rb);
      $$0.put(bim.y, aow.rc);
      $$0.put(bim.A, aow.rd);
      $$0.put(bim.C, aow.re);
      $$0.put(bim.F, aow.rf);
      $$0.put(bim.G, aow.rg);
      $$0.put(bim.Q, aow.rh);
      $$0.put(bim.V, aow.ri);
      $$0.put(bim.W, aow.rj);
      $$0.put(bim.Z, aow.rk);
      $$0.put(bim.aa, aow.rl);
      $$0.put(bim.al, aow.rm);
      $$0.put(bim.au, aow.rn);
      $$0.put(bim.aw, aow.ro);
      $$0.put(bim.ax, aow.rp);
      $$0.put(bim.ay, aow.rq);
      $$0.put(bim.aD, aow.rr);
      $$0.put(bim.aG, aow.rs);
      $$0.put(bim.aI, aow.rt);
      $$0.put(bim.aJ, aow.ru);
      $$0.put(bim.aL, aow.rv);
      $$0.put(bim.aS, aow.rw);
      $$0.put(bim.aU, aow.rx);
      $$0.put(bim.be, aow.ry);
      $$0.put(bim.bg, aow.rz);
      $$0.put(bim.bi, aow.rA);
      $$0.put(bim.bj, aow.rB);
      $$0.put(bim.bk, aow.rC);
      $$0.put(bim.bl, aow.rD);
      $$0.put(bim.bo, aow.rE);
      $$0.put(bim.bp, aow.rF);
      $$0.put(bim.br, aow.rG);
   });
   public float bW;
   public float bX;
   public float bY;
   public float bZ;
   private float cf = 1.0F;
   private float cg = 1.0F;
   private boolean ch;
   @Nullable
   private gu ci;

   public buz(bim<? extends buz> $$0, cpl $$1) {
      super($$0, $$1);
      this.bL = new bot(this, 10, false);
      this.a(ean.n, -1.0F);
      this.a(ean.o, -1.0F);
      this.a(ean.x, -1.0F);
   }

   @Nullable
   @Override
   public bjr a(cqa $$0, bgo $$1, bjc $$2, @Nullable bjr $$3, @Nullable qr $$4) {
      this.a(ac.a(buz.b.values(), $$0.y_()));
      if ($$3 == null) {
         $$3 = new bid.a(false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean i_() {
      return false;
   }

   @Override
   protected void w() {
      this.bO.a(0, new bqm(this, 1.25));
      this.bO.a(0, new bpn(this));
      this.bO.a(1, new bqb(this, cbm.class, 8.0F));
      this.bO.a(2, new bqy(this));
      this.bO.a(2, new bpr(this, 1.0, 5.0F, 1.0F, true));
      this.bO.a(2, new buz.a(this, 1.0));
      this.bO.a(3, new bpy(this));
      this.bO.a(3, new bpq(this, 1.0, 3.0F, 7.0F));
   }

   public static bkd.a gg() {
      return bja.x().a(bke.a, 6.0).a(bke.e, 0.4F).a(bke.d, 0.2F);
   }

   @Override
   protected bsh b(cpl $$0) {
      bsf $$1 = new bsf(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected float b(bjk $$0, bij $$1) {
      return $$1.b * 0.6F;
   }

   @Override
   public void b_() {
      if (this.ci == null || !this.ci.a(this.di(), 3.46) || !this.dK().a_(this.ci).a(csm.dT)) {
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
   public void a(gu $$0, boolean $$1) {
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
      this.bX = arp.a(this.bX, 0.0F, 1.0F);
      if (!this.aA() && this.cf < 1.0F) {
         this.cf = 1.0F;
      }

      this.cf *= 0.9F;
      ehd $$0 = this.dn();
      if (!this.aA() && $$0.d < 0.0) {
         this.f($$0.d(1.0, 0.6, 1.0));
      }

      this.bW = this.bW + this.cf * 2.0F;
   }

   public static boolean a(cpl $$0, bii $$1) {
      if ($$1.bv() && !$$1.aS() && $$0.z.a(2) == 0) {
         List<bja> $$2 = $$0.a(bja.class, $$1.cG().g(20.0), cb);
         if (!$$2.isEmpty()) {
            bja $$3 = $$2.get($$0.z.a($$2.size()));
            if (!$$3.aS()) {
               aov $$4 = b($$3.ag());
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
   public bgq b(cbm $$0, bgp $$1) {
      cix $$2 = $$0.b($$1);
      if (!this.p() && cd.contains($$2.d())) {
         if (!$$0.fR().d) {
            $$2.h(1);
         }

         if (!this.aS()) {
            this.dK().a(null, this.dp(), this.dr(), this.dv(), aow.qX, this.da(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
         }

         if (!this.dK().B) {
            if (this.ag.a(10) == 0) {
               this.f($$0);
               this.dK().a(this, (byte)7);
            } else {
               this.dK().a(this, (byte)6);
            }
         }

         return bgq.a(this.dK().B);
      } else if ($$2.a(cc)) {
         if (!$$0.fR().d) {
            $$2.h(1);
         }

         this.b(new bhv(bhx.s, 900));
         if ($$0.f() || !this.cq()) {
            this.a(this.dL().a($$0), Float.MAX_VALUE);
         }

         return bgq.a(this.dK().B);
      } else if (!this.gn() && this.p() && this.j($$0)) {
         if (!this.dK().B) {
            this.z(!this.ga());
         }

         return bgq.a(this.dK().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean m(cix $$0) {
      return false;
   }

   public static boolean c(bim<buz> $$0, cpm $$1, bjc $$2, gu $$3, aru $$4) {
      return $$1.a_($$3.d()).a(apl.bT) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, dez $$2, gu $$3) {
   }

   @Override
   public boolean a(buj $$0) {
      return false;
   }

   @Nullable
   @Override
   public bid a(akk $$0, bid $$1) {
      return null;
   }

   @Override
   public boolean C(bii $$0) {
      return $$0.a(this.dL().b((biy)this), 3.0F);
   }

   @Nullable
   @Override
   public aov r() {
      return a(this.dK(), this.dK().z);
   }

   public static aov a(cpl $$0, aru $$1) {
      if ($$0.ai() != bgn.a && $$1.a(1000) == 0) {
         List<bim<?>> $$2 = Lists.newArrayList(ce.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return aow.qV;
      }
   }

   private static aov b(bim<?> $$0) {
      return ce.getOrDefault($$0, aow.qV);
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.qZ;
   }

   @Override
   protected aov h_() {
      return aow.qW;
   }

   @Override
   protected void b(gu $$0, dez $$1) {
      this.a(aow.rH, 0.15F, 1.0F);
   }

   @Override
   protected boolean aR() {
      return this.aa > this.cg;
   }

   @Override
   protected void aQ() {
      this.a(aow.qY, 0.15F, 1.0F);
      this.cg = this.aa + this.bX / 2.0F;
   }

   @Override
   public float eV() {
      return a(this.ag);
   }

   public static float a(aru $$0) {
      return ($$0.i() - $$0.i()) * 0.2F + 1.0F;
   }

   @Override
   public aox da() {
      return aox.g;
   }

   @Override
   public boolean bs() {
      return true;
   }

   @Override
   protected void D(bii $$0) {
      if (!($$0 instanceof cbm)) {
         super.D($$0);
      }
   }

   @Override
   public boolean a(bhg $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dK().B) {
            this.z(false);
         }

         return super.a($$0, $$1);
      }
   }

   public buz.b gi() {
      return buz.b.a(this.an.b(ca));
   }

   public void a(buz.b $$0) {
      this.an.b(ca, $$0.h);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(ca, 0);
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("Variant", this.gi().h);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.a(buz.b.a($$0.h("Variant")));
   }

   @Override
   public boolean gn() {
      return !this.aA();
   }

   @Override
   public ehd cI() {
      return new ehd(0.0, (double)(0.5F * this.cH()), (double)(this.df() * 0.4F));
   }

   @Override
   protected Vector3f a(bii $$0, bij $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.4375F * $$2, 0.0F);
   }

   static class a extends brf {
      public a(bjh $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected ehd h() {
         ehd $$0 = null;
         if (this.b.aX()) {
            $$0 = btr.a(this.b, 15, 15);
         }

         if (this.b.ee().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private ehd k() {
         gu $$0 = this.b.dk();
         gu.a $$1 = new gu.a();
         gu.a $$2 = new gu.a();

         for (gu $$4 : gu.b(
            arp.a(this.b.dp() - 3.0),
            arp.a(this.b.dr() - 6.0),
            arp.a(this.b.dv() - 3.0),
            arp.a(this.b.dp() + 3.0),
            arp.a(this.b.dr() + 6.0),
            arp.a(this.b.dv() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               dez $$5 = this.b.dK().a_($$2.a($$4, ha.a));
               boolean $$6 = $$5.b() instanceof cws || $$5.a(apl.t);
               if ($$6 && this.b.dK().t($$4) && this.b.dK().t($$1.a($$4, ha.b))) {
                  return ehd.c($$4);
               }
            }
         }

         return null;
      }
   }

   public static enum b implements ash {
      a(0, "red_blue"),
      b(1, "blue"),
      c(2, "green"),
      d(3, "yellow_blue"),
      e(4, "gray");

      public static final Codec<buz.b> f = ash.a(buz.b::values);
      private static final IntFunction<buz.b> g = aqk.a(buz.b::a, values(), aqk.a.c);
      final int h;
      private final String i;

      private b(int $$0, String $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public int a() {
         return this.h;
      }

      public static buz.b a(int $$0) {
         return g.apply($$0);
      }

      @Override
      public String c() {
         return this.i;
      }
   }
}
