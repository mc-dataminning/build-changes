import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bxb extends bvu implements bkh, blh<bxb.d>, bvw {
   public static final int bT = 200;
   protected static final ImmutableList<? extends bup<? extends buo<? super bxb>>> bU = ImmutableList.of(bup.c, bup.n, bup.f, bup.o, bup.p);
   protected static final ImmutableList<? extends btk<?>> bW = ImmutableList.of(
      btk.r, btk.g, btk.h, btk.k, btk.l, btk.n, btk.m, btk.E, btk.t, btk.o, btk.p, btk.J, new btk[]{btk.y, btk.M, btk.B, btk.N, btk.O, btk.Q, btk.T, btk.Y}
   );
   private static final afc<Integer> ca = aff.a(bxb.class, afe.b);
   private static final afc<Boolean> cb = aff.a(bxb.class, afe.k);
   private static final afc<Boolean> cc = aff.a(bxb.class, afe.k);
   public static final double bX = 20.0;
   public static final int bY = 1200;
   private static final int cd = 6000;
   public static final String bZ = "Variant";
   private static final int ce = 1800;
   private static final int cf = 2400;
   private final Map<String, Vector3f> cg = Maps.newHashMap();
   private static final int ch = 100;

   public bxb(bjx<? extends bxb> $$0, cqz $$1) {
      super($$0, $$1);
      this.a(ebp.j, 0.0F);
      this.bL = new bxb.c(this);
      this.bK = new bxb.b(this, 20);
      this.t(1.0F);
   }

   @Override
   public Map<String, Vector3f> a() {
      return this.cg;
   }

   @Override
   public float a(ht $$0, crc $$1) {
      return 0.0F;
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(ca, 0);
      this.an.a(cb, false);
      this.an.a(cc, false);
   }

   @Override
   public void b(rt $$0) {
      super.b($$0);
      $$0.a("Variant", this.ge().a());
      $$0.a("FromBucket", this.t());
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      this.a(bxb.d.a($$0.h("Variant")));
      this.w($$0.q("FromBucket"));
   }

   @Override
   public void P() {
      if (!this.gk()) {
         super.P();
      }
   }

   @Override
   public blc a(cro $$0, bhz $$1, bkn $$2, @Nullable blc $$3, @Nullable rt $$4) {
      boolean $$5 = false;
      if ($$2 == bkn.l) {
         return $$3;
      } else {
         ate $$6 = $$0.E_();
         if ($$3 instanceof bxb.a) {
            if (((bxb.a)$$3).a() >= 2) {
               $$5 = true;
            }
         } else {
            $$3 = new bxb.a(bxb.d.a($$6), bxb.d.a($$6));
         }

         this.a(((bxb.a)$$3).a($$6));
         if ($$5) {
            this.c_(-24000);
         }

         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void aq() {
      int $$0 = this.ch();
      super.aq();
      if (!this.fU()) {
         this.t($$0);
      }
   }

   protected void t(int $$0) {
      if (this.bv() && !this.aZ()) {
         this.j($$0 - 1);
         if (this.ch() == -20) {
            this.j(0);
            this.a(this.dM().r(), 2.0F);
         }
      } else {
         this.j(this.cg());
      }
   }

   @Override
   public void s() {
      int $$0 = this.ch() + 1800;
      this.j(Math.min($$0, this.cg()));
   }

   @Override
   public int cg() {
      return 6000;
   }

   public bxb.d ge() {
      return bxb.d.a(this.an.b(ca));
   }

   public void a(bxb.d $$0) {
      this.an.b(ca, $$0.a());
   }

   private static boolean a(ate $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(crc $$0) {
      return $$0.f(this);
   }

   @Override
   public boolean cy() {
      return false;
   }

   @Override
   public bko eR() {
      return bko.e;
   }

   public void x(boolean $$0) {
      this.an.b(cb, $$0);
   }

   public boolean gk() {
      return this.an.b(cb);
   }

   @Override
   public boolean t() {
      return this.an.b(cc);
   }

   @Override
   public void w(boolean $$0) {
      this.an.b(cc, $$0);
   }

   @Nullable
   @Override
   public bjo a(alq $$0, bjo $$1) {
      bxb $$2 = bjx.f.a((cqz)$$0);
      if ($$2 != null) {
         bxb.d $$3;
         if (a(this.ag)) {
            $$3 = bxb.d.b(this.ag);
         } else {
            $$3 = this.ag.h() ? this.ge() : ((bxb)$$1).ge();
         }

         $$2.a($$3);
         $$2.fJ();
      }

      return $$2;
   }

   @Override
   public boolean m(ckj $$0) {
      return $$0.a(ara.aA);
   }

   @Override
   public boolean a(ccx $$0) {
      return true;
   }

   @Override
   protected void X() {
      this.dL().ad().a("axolotlBrain");
      this.dN().a((alq)this.dL(), this);
      this.dL().ad().c();
      this.dL().ad().a("axolotlActivityUpdate");
      bxc.a(this);
      this.dL().ad().c();
      if (!this.fU()) {
         Optional<Integer> $$0 = this.dN().c(btk.M);
         this.x($$0.isPresent() && $$0.get() > 0);
      }
   }

   public static blo.a gl() {
      return bkl.A().a(blp.l, 14.0).a(blp.m, 1.0).a(blp.c, 2.0);
   }

   @Override
   protected bts b(cqz $$0) {
      return new btp(this, $$0);
   }

   @Override
   public boolean C(bjt $$0) {
      boolean $$1 = $$0.a(this.dM().b((bkj)this), (float)((int)this.b(blp.c)));
      if ($$1) {
         this.a(this, $$0);
         this.a(aqd.av, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public boolean a(bir $$0, float $$1) {
      float $$2 = this.eu();
      if (!this.dL().B
         && !this.fU()
         && this.dL().z.a(3) == 0
         && ((float)this.dL().z.a(3) < $$1 || $$2 / this.eL() < 0.5F)
         && $$1 < $$2
         && this.aX()
         && ($$0.d() != null || $$0.c() != null)
         && !this.gk()) {
         this.bz.a(btk.M, 200);
      }

      return super.a($$0, $$1);
   }

   @Override
   protected float b(bkv $$0, bju $$1) {
      return $$1.b * 0.655F;
   }

   @Override
   public int Y() {
      return 1;
   }

   @Override
   public int Z() {
      return 1;
   }

   @Override
   public bib b(ccx $$0, bia $$1) {
      return bvw.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void l(ckj $$0) {
      bvw.a(this, $$0);
      rt $$1 = $$0.w();
      $$1.a("Variant", this.ge().a());
      $$1.a("Age", this.h());
      blj<?> $$2 = this.dN();
      if ($$2.a(btk.T)) {
         $$1.a("HuntingCooldown", $$2.e(btk.T));
      }
   }

   @Override
   public void c(rt $$0) {
      bvw.a(this, $$0);
      this.a(bxb.d.a($$0.h("Variant")));
      if ($$0.e("Age")) {
         this.c_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.dN().a(btk.T, true, $$0.i("HuntingCooldown"));
      }
   }

   @Override
   public ckj b() {
      return new ckj(ckm.pV);
   }

   @Override
   public aqc y() {
      return aqd.cC;
   }

   @Override
   public boolean en() {
      return !this.gk() && super.en();
   }

   public static void a(bxb $$0, bkj $$1) {
      cqz $$2 = $$0.dL();
      if ($$1.ev()) {
         bir $$3 = $$1.ew();
         if ($$3 != null) {
            bjt $$4 = $$3.d();
            if ($$4 != null && $$4.ag() == bjx.bt) {
               ccx $$5 = (ccx)$$4;
               List<ccx> $$6 = $$2.a(ccx.class, $$0.cG().g(20.0));
               if ($$6.contains($$5)) {
                  $$0.f($$5);
               }
            }
         }
      }
   }

   public void f(ccx $$0) {
      bjg $$1 = $$0.b(bji.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.d() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new bjg(bji.j, $$3, 0), this);
      }

      $$0.d(bji.d);
   }

   @Override
   public boolean U() {
      return super.U() || this.t();
   }

   @Override
   protected aqc d(bir $$0) {
      return aqd.ax;
   }

   @Nullable
   @Override
   protected aqc m_() {
      return aqd.aw;
   }

   @Nullable
   @Override
   protected aqc w() {
      return this.aX() ? aqd.az : aqd.ay;
   }

   @Override
   protected aqc aM() {
      return aqd.aA;
   }

   @Override
   protected aqc aL() {
      return aqd.aB;
   }

   @Override
   protected blj.b<bxb> dO() {
      return blj.a(bW, bU);
   }

   @Override
   protected blj<?> a(Dynamic<?> $$0) {
      return bxc.a(this.dO().a($$0));
   }

   @Override
   public blj<bxb> dN() {
      return (blj<bxb>)super.dN();
   }

   @Override
   protected void W() {
      super.W();
      abz.a(this);
   }

   @Override
   public void h(eif $$0) {
      if (this.cW() && this.aX()) {
         this.a(this.fe(), $$0);
         this.a(bkp.a, this.do());
         this.f(this.do().a(0.9));
      } else {
         super.h($$0);
      }
   }

   @Override
   protected void a(ccx $$0, bia $$1, ckj $$2) {
      if ($$2.a(ckm.pU)) {
         $$0.a($$1, new ckj(ckm.pL));
      } else {
         super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.t() && !this.ac();
   }

   public static boolean a(bjx<? extends bkj> $$0, cro $$1, bkn $$2, ht $$3, ate $$4) {
      return $$1.a_($$3.d()).a(aqs.bQ);
   }

   public static class a extends bjo.a {
      public final bxb.d[] a;

      public a(bxb.d... $$0) {
         super(false);
         this.a = $$0;
      }

      public bxb.d a(ate $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class b extends bqi {
      public b(bxb $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!bxb.this.gk()) {
            super.a();
         }
      }
   }

   static class c extends bqj {
      private final bxb l;

      public c(bxb $$0) {
         super($$0, 85, 10, 0.1F, 0.5F, false);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (!this.l.gk()) {
            super.a();
         }
      }
   }

   public static enum d implements atr {
      a(0, "lucy", true),
      b(1, "wild", true),
      c(2, "gold", true),
      d(3, "cyan", true),
      e(4, "blue", false);

      private static final IntFunction<bxb.d> g = arr.a(bxb.d::a, values(), arr.a.a);
      public static final Codec<bxb.d> f = atr.a(bxb.d::values);
      private final int h;
      private final String i;
      private final boolean j;

      private d(int $$0, String $$1, boolean $$2) {
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

      public static bxb.d a(int $$0) {
         return g.apply($$0);
      }

      public static bxb.d a(ate $$0) {
         return a($$0, true);
      }

      public static bxb.d b(ate $$0) {
         return a($$0, false);
      }

      private static bxb.d a(ate $$0, boolean $$1) {
         bxb.d[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.j == $$1).toArray(bxb.d[]::new);
         return ac.a($$2, $$0);
      }
   }
}
