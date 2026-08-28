import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cih extends cgv implements bwe<cih.e>, cgx {
   public static final int bY = 200;
   private static final int cj = 10;
   protected static final ImmutableList<? extends cfp<? extends cfo<? super cih>>> bZ = ImmutableList.of(cfp.c, cfp.o, cfp.f, cfp.p, cfp.q);
   protected static final ImmutableList<? extends cei<?>> ca = ImmutableList.of(
      cei.r, cei.g, cei.h, cei.k, cei.l, cei.n, cei.m, cei.E, cei.t, cei.o, cei.p, cei.K, new cei[]{cei.y, cei.N, cei.B, cei.O, cei.P, cei.R, cei.U, cei.Z}
   );
   private static final ako<Integer> ck = aks.a(cih.class, akq.b);
   private static final ako<Boolean> cl = aks.a(cih.class, akq.k);
   private static final ako<Boolean> cm = aks.a(cih.class, akq.k);
   public static final double cc = 20.0;
   public static final int cd = 1200;
   private static final int cn = 6000;
   public static final String ce = "Variant";
   private static final int co = 1800;
   private static final int cp = 2400;
   public final ayb cf = new ayb(10, azn::m);
   public final ayb cg = new ayb(10, azn::m);
   public final ayb ch = new ayb(10, azn::m);
   public final ayb ci = new ayb(10, azn::m);
   private static final int cq = 100;

   public cih(bup<? extends cih> $$0, dff $$1) {
      super($$0, $$1);
      this.a(esf.j, 0.0F);
      this.bP = new cih.d(this);
      this.bO = new cih.c(this, 20);
   }

   @Override
   public float a(jh $$0, dfi $$1) {
      return 0.0F;
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(ck, 0);
      $$0.a(cl, false);
      $$0.a(cm, false);
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      $$0.a("Variant", this.gv().a());
      $$0.a("FromBucket", this.t());
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      this.a(cih.e.a($$0.h("Variant")));
      this.x($$0.q("FromBucket"));
   }

   @Override
   public void U() {
      if (!this.gw()) {
         super.U();
      }
   }

   @Override
   public bvx a(dfw $$0, bsf $$1, buo $$2, @Nullable bvx $$3) {
      boolean $$4 = false;
      if ($$2 == buo.l) {
         return $$3;
      } else {
         azv $$5 = $$0.E_();
         if ($$3 instanceof cih.b) {
            if (((cih.b)$$3).a() >= 2) {
               $$4 = true;
            }
         } else {
            $$3 = new cih.b(cih.e.a($$5), cih.e.a($$5));
         }

         this.a(((cih.b)$$3).a($$5));
         if ($$4) {
            this.c_(-24000);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void aB() {
      int $$0 = this.cv();
      super.aB();
      if (!this.gi()) {
         this.t($$0);
      }

      if (this.dY().y_()) {
         this.gy();
      }
   }

   private void gy() {
      cih.a $$0;
      if (this.gw()) {
         $$0 = cih.a.a;
      } else if (this.bo()) {
         $$0 = cih.a.b;
      } else if (this.aL()) {
         $$0 = cih.a.c;
      } else {
         $$0 = cih.a.d;
      }

      this.cf.a($$0 == cih.a.a);
      this.cg.a($$0 == cih.a.b);
      this.ch.a($$0 == cih.a.c);
      boolean $$4 = this.aT.d() || this.dQ() != this.P || this.dO() != this.O;
      this.ci.a($$4);
   }

   protected void t(int $$0) {
      if (this.bN() && !this.bn()) {
         this.j($$0 - 1);
         if (this.cv() == -20) {
            this.j(0);
            this.a(this.dZ().t(), 2.0F);
         }
      } else {
         this.j(this.cu());
      }
   }

   @Override
   public void q() {
      int $$0 = this.cv() + 1800;
      this.j(Math.min($$0, this.cu()));
   }

   @Override
   public int cu() {
      return 6000;
   }

   public cih.e gv() {
      return cih.e.a(this.am.a(ck));
   }

   public void a(cih.e $$0) {
      this.am.a(ck, $$0.a());
   }

   private static boolean a(azv $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(dfi $$0) {
      return $$0.f(this);
   }

   @Override
   public boolean cL() {
      return false;
   }

   public void y(boolean $$0) {
      this.am.a(cl, $$0);
   }

   public boolean gw() {
      return this.am.a(cl);
   }

   @Override
   public boolean t() {
      return this.am.a(cm);
   }

   @Override
   public void x(boolean $$0) {
      this.am.a(cm, $$0);
   }

   @Nullable
   @Override
   public btz a(arq $$0, btz $$1) {
      cih $$2 = bup.f.a($$0, buo.e);
      if ($$2 != null) {
         cih.e $$3;
         if (a(this.af)) {
            $$3 = cih.e.b(this.af);
         } else {
            $$3 = this.af.h() ? this.gv() : ((cih)$$1).gv();
         }

         $$2.a($$3);
         $$2.gb();
      }

      return $$2;
   }

   @Override
   public boolean l(cwf $$0) {
      return $$0.a(axm.aD);
   }

   @Override
   public boolean A() {
      return true;
   }

   @Override
   protected void ac() {
      bor $$0 = boq.a();
      $$0.a("axolotlBrain");
      this.ee().a((arq)this.dY(), this);
      $$0.c();
      $$0.a("axolotlActivityUpdate");
      cii.a(this);
      $$0.c();
      if (!this.gi()) {
         Optional<Integer> $$1 = this.ee().c(cei.N);
         this.y($$1.isPresent() && $$1.get() > 0);
      }
   }

   public static bwl.a gx() {
      return cgv.gA().a(bwm.s, 14.0).a(bwm.v, 1.0).a(bwm.c, 2.0).a(bwm.B, 1.0);
   }

   @Override
   protected ceq b(dff $$0) {
      return new cen(this, $$0);
   }

   @Override
   public void gm() {
      this.a(awo.aK, 1.0F, 1.0F);
   }

   @Override
   public boolean a(bsy $$0, float $$1) {
      float $$2 = this.eH();
      if (!this.dY().C
         && !this.gi()
         && this.dY().A.a(3) == 0
         && ((float)this.dY().A.a(3) < $$1 || $$2 / this.eW() < 0.5F)
         && $$1 < $$2
         && this.bl()
         && ($$0.d() != null || $$0.c() != null)
         && !this.gw()) {
         this.bF.a(cei.N, 200);
      }

      return super.a($$0, $$1);
   }

   @Override
   public int ad() {
      return 1;
   }

   @Override
   public int ae() {
      return 1;
   }

   @Override
   public bsh b(cor $$0, bsg $$1) {
      return cgx.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void k(cwf $$0) {
      cgx.a(this, $$0);
      cyo.a(ku.X, $$0, $$0x -> {
         $$0x.a("Variant", this.gv().a());
         $$0x.a("Age", this.g());
         bwg<?> $$1 = this.ee();
         if ($$1.a(cei.U)) {
            $$0x.a("HuntingCooldown", $$1.e(cei.U));
         }
      });
   }

   @Override
   public void h(un $$0) {
      cgx.a(this, $$0);
      this.a(cih.e.a($$0.h("Variant")));
      if ($$0.e("Age")) {
         this.c_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.ee().a(cei.U, true, $$0.i("HuntingCooldown"));
      }
   }

   @Override
   public cwf X_() {
      return new cwf(cwj.qK);
   }

   @Override
   public awn y() {
      return awo.dj;
   }

   @Override
   public boolean eA() {
      return !this.gw() && super.eA();
   }

   public static void a(cih $$0, bve $$1) {
      dff $$2 = $$0.dY();
      if ($$1.eI()) {
         bsy $$3 = $$1.eJ();
         if ($$3 != null) {
            bui $$4 = $$3.d();
            if ($$4 != null && $$4.ar() == bup.by) {
               cor $$5 = (cor)$$4;
               List<cor> $$6 = $$2.a(cor.class, $$0.cT().g(20.0));
               if ($$6.contains($$5)) {
                  $$0.a($$5);
               }
            }
         }
      }
   }

   public void a(cor $$0) {
      btn $$1 = $$0.c(btp.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.d() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new btn(btp.j, $$3, 0), this);
      }

      $$0.e(btp.d);
   }

   @Override
   public boolean Z() {
      return super.Z() || this.t();
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.aM;
   }

   @Nullable
   @Override
   protected awn o_() {
      return awo.aL;
   }

   @Nullable
   @Override
   protected awn w() {
      return this.bl() ? awo.aO : awo.aN;
   }

   @Override
   protected awn aY() {
      return awo.aP;
   }

   @Override
   protected awn aX() {
      return awo.aQ;
   }

   @Override
   protected bwg.b<cih> ef() {
      return bwg.a(ca, bZ);
   }

   @Override
   protected bwg<?> a(Dynamic<?> $$0) {
      return cii.a(this.ef().a($$0));
   }

   @Override
   public bwg<cih> ee() {
      return (bwg<cih>)super.ee();
   }

   @Override
   protected void ab() {
      super.ab();
      agv.a(this);
   }

   @Override
   public void a_(ezr $$0) {
      if (this.dk() && this.bl()) {
         this.a(this.fs(), $$0);
         this.a(bvi.a, this.dB());
         this.h(this.dB().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   @Override
   protected void a(cor $$0, bsg $$1, cwf $$2) {
      if ($$2.a(cwj.qJ)) {
         $$0.a($$1, cwi.a($$2, $$0, new cwf(cwj.qA)));
      } else {
         super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.t() && !this.an();
   }

   @Nullable
   @Override
   public bve m() {
      return this.R();
   }

   public static boolean a(bup<? extends bve> $$0, dfw $$1, buo $$2, jh $$3, azv $$4) {
      return $$1.a_($$3.e()).a(axd.bZ);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }

   public static class b extends btz.a {
      public final cih.e[] a;

      public b(cih.e... $$0) {
         super(false);
         this.a = $$0;
      }

      public cih.e a(azv $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class c extends cbg {
      public c(final cih $$0, final int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!cih.this.gw()) {
            super.a();
         }
      }
   }

   static class d extends cbh {
      private final cih l;

      public d(cih $$0) {
         super($$0, 85, 10, 0.1F, 0.5F, false);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (!this.l.gw()) {
            super.a();
         }
      }
   }

   public static enum e implements baj {
      a(0, "lucy", true),
      b(1, "wild", true),
      c(2, "gold", true),
      d(3, "cyan", true),
      e(4, "blue", false);

      private static final IntFunction<cih.e> g = aye.a(cih.e::a, values(), aye.a.a);
      public static final Codec<cih.e> f = baj.a(cih.e::values);
      private final int h;
      private final String i;
      private final boolean j;

      private e(final int $$0, final String $$1, final boolean $$2) {
         this.h = $$0;
         this.i = $$1;
         this.j = $$2;
      }

      public int a() {
         return this.h;
      }

      public String b() {
         return this.i;
      }

      @Override
      public String c() {
         return this.i;
      }

      public static cih.e a(int $$0) {
         return g.apply($$0);
      }

      public static cih.e a(azv $$0) {
         return a($$0, true);
      }

      public static cih.e b(azv $$0) {
         return a($$0, false);
      }

      private static cih.e a(azv $$0, boolean $$1) {
         cih.e[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.j == $$1).toArray(cih.e[]::new);
         return ae.a($$2, $$0);
      }
   }
}
