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

public class bxq extends bwj implements bkw, blw<bxq.d>, bwl {
   public static final int bT = 200;
   protected static final ImmutableList<? extends bve<? extends bvd<? super bxq>>> bU = ImmutableList.of(bve.c, bve.n, bve.f, bve.o, bve.p);
   protected static final ImmutableList<? extends btz<?>> bW = ImmutableList.of(
      btz.r, btz.g, btz.h, btz.k, btz.l, btz.n, btz.m, btz.E, btz.t, btz.o, btz.p, btz.J, new btz[]{btz.y, btz.M, btz.B, btz.N, btz.O, btz.Q, btz.T, btz.Y}
   );
   private static final afm<Integer> ca = afp.a(bxq.class, afo.b);
   private static final afm<Boolean> cb = afp.a(bxq.class, afo.k);
   private static final afm<Boolean> cc = afp.a(bxq.class, afo.k);
   public static final double bX = 20.0;
   public static final int bY = 1200;
   private static final int cd = 6000;
   public static final String bZ = "Variant";
   private static final int ce = 1800;
   private static final int cf = 2400;
   private final Map<String, Vector3f> cg = Maps.newHashMap();
   private static final int ch = 100;

   public bxq(bkm<? extends bxq> $$0, crs $$1) {
      super($$0, $$1);
      this.a(ecr.j, 0.0F);
      this.bL = new bxq.c(this);
      this.bK = new bxq.b(this, 20);
      this.t(1.0F);
   }

   @Override
   public Map<String, Vector3f> a() {
      return this.cg;
   }

   @Override
   public float a(ht $$0, crv $$1) {
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
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("Variant", this.ge().a());
      $$0.a("FromBucket", this.t());
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.a(bxq.d.a($$0.h("Variant")));
      this.w($$0.q("FromBucket"));
   }

   @Override
   public void P() {
      if (!this.gk()) {
         super.P();
      }
   }

   @Override
   public blr a(csh $$0, bio $$1, blc $$2, @Nullable blr $$3, @Nullable rz $$4) {
      boolean $$5 = false;
      if ($$2 == blc.l) {
         return $$3;
      } else {
         ato $$6 = $$0.E_();
         if ($$3 instanceof bxq.a) {
            if (((bxq.a)$$3).a() >= 2) {
               $$5 = true;
            }
         } else {
            $$3 = new bxq.a(bxq.d.a($$6), bxq.d.a($$6));
         }

         this.a(((bxq.a)$$3).a($$6));
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

   public bxq.d ge() {
      return bxq.d.a(this.an.b(ca));
   }

   public void a(bxq.d $$0) {
      this.an.b(ca, $$0.a());
   }

   private static boolean a(ato $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(crv $$0) {
      return $$0.f(this);
   }

   @Override
   public boolean cy() {
      return false;
   }

   @Override
   public bld eR() {
      return bld.e;
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
   public bkd a(ama $$0, bkd $$1) {
      bxq $$2 = bkm.f.a((crs)$$0);
      if ($$2 != null) {
         bxq.d $$3;
         if (a(this.ag)) {
            $$3 = bxq.d.b(this.ag);
         } else {
            $$3 = this.ag.h() ? this.ge() : ((bxq)$$1).ge();
         }

         $$2.a($$3);
         $$2.fJ();
      }

      return $$2;
   }

   @Override
   public boolean m(clb $$0) {
      return $$0.a(ark.aA);
   }

   @Override
   public boolean a(cdm $$0) {
      return true;
   }

   @Override
   protected void X() {
      this.dL().ad().a("axolotlBrain");
      this.dN().a((ama)this.dL(), this);
      this.dL().ad().c();
      this.dL().ad().a("axolotlActivityUpdate");
      bxr.a(this);
      this.dL().ad().c();
      if (!this.fU()) {
         Optional<Integer> $$0 = this.dN().c(btz.M);
         this.x($$0.isPresent() && $$0.get() > 0);
      }
   }

   public static bmd.a gl() {
      return bla.A().a(bme.l, 14.0).a(bme.m, 1.0).a(bme.c, 2.0);
   }

   @Override
   protected buh b(crs $$0) {
      return new bue(this, $$0);
   }

   @Override
   public boolean C(bki $$0) {
      boolean $$1 = $$0.a(this.dM().b((bky)this), (float)((int)this.b(bme.c)));
      if ($$1) {
         this.a(this, $$0);
         this.a(aqn.av, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public boolean a(bjg $$0, float $$1) {
      float $$2 = this.eu();
      if (!this.dL().B
         && !this.fU()
         && this.dL().z.a(3) == 0
         && ((float)this.dL().z.a(3) < $$1 || $$2 / this.eL() < 0.5F)
         && $$1 < $$2
         && this.aX()
         && ($$0.d() != null || $$0.c() != null)
         && !this.gk()) {
         this.bz.a(btz.M, 200);
      }

      return super.a($$0, $$1);
   }

   @Override
   protected float b(blk $$0, bkj $$1) {
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
   public biq b(cdm $$0, bip $$1) {
      return bwl.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void l(clb $$0) {
      bwl.a(this, $$0);
      rz $$1 = $$0.w();
      $$1.a("Variant", this.ge().a());
      $$1.a("Age", this.h());
      bly<?> $$2 = this.dN();
      if ($$2.a(btz.T)) {
         $$1.a("HuntingCooldown", $$2.e(btz.T));
      }
   }

   @Override
   public void c(rz $$0) {
      bwl.a(this, $$0);
      this.a(bxq.d.a($$0.h("Variant")));
      if ($$0.e("Age")) {
         this.c_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.dN().a(btz.T, true, $$0.i("HuntingCooldown"));
      }
   }

   @Override
   public clb b() {
      return new clb(cle.pV);
   }

   @Override
   public aqm y() {
      return aqn.cC;
   }

   @Override
   public boolean en() {
      return !this.gk() && super.en();
   }

   public static void a(bxq $$0, bky $$1) {
      crs $$2 = $$0.dL();
      if ($$1.ev()) {
         bjg $$3 = $$1.ew();
         if ($$3 != null) {
            bki $$4 = $$3.d();
            if ($$4 != null && $$4.ag() == bkm.bt) {
               cdm $$5 = (cdm)$$4;
               List<cdm> $$6 = $$2.a(cdm.class, $$0.cG().g(20.0));
               if ($$6.contains($$5)) {
                  $$0.f($$5);
               }
            }
         }
      }
   }

   public void f(cdm $$0) {
      bjv $$1 = $$0.b(bjx.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.d() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new bjv(bjx.j, $$3, 0), this);
      }

      $$0.d(bjx.d);
   }

   @Override
   public boolean U() {
      return super.U() || this.t();
   }

   @Override
   protected aqm d(bjg $$0) {
      return aqn.ax;
   }

   @Nullable
   @Override
   protected aqm m_() {
      return aqn.aw;
   }

   @Nullable
   @Override
   protected aqm w() {
      return this.aX() ? aqn.az : aqn.ay;
   }

   @Override
   protected aqm aM() {
      return aqn.aA;
   }

   @Override
   protected aqm aL() {
      return aqn.aB;
   }

   @Override
   protected bly.b<bxq> dO() {
      return bly.a(bW, bU);
   }

   @Override
   protected bly<?> a(Dynamic<?> $$0) {
      return bxr.a(this.dO().a($$0));
   }

   @Override
   public bly<bxq> dN() {
      return (bly<bxq>)super.dN();
   }

   @Override
   protected void W() {
      super.W();
      aci.a(this);
   }

   @Override
   public void h(eji $$0) {
      if (this.cW() && this.aX()) {
         this.a(this.fe(), $$0);
         this.a(ble.a, this.do());
         this.f(this.do().a(0.9));
      } else {
         super.h($$0);
      }
   }

   @Override
   protected void a(cdm $$0, bip $$1, clb $$2) {
      if ($$2.a(cle.pU)) {
         $$0.a($$1, new clb(cle.pL));
      } else {
         super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.t() && !this.ac();
   }

   public static boolean a(bkm<? extends bky> $$0, csh $$1, blc $$2, ht $$3, ato $$4) {
      return $$1.a_($$3.d()).a(arc.bQ);
   }

   public static class a extends bkd.a {
      public final bxq.d[] a;

      public a(bxq.d... $$0) {
         super(false);
         this.a = $$0;
      }

      public bxq.d a(ato $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class b extends bqx {
      public b(bxq $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!bxq.this.gk()) {
            super.a();
         }
      }
   }

   static class c extends bqy {
      private final bxq l;

      public c(bxq $$0) {
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

   public static enum d implements aub {
      a(0, "lucy", true),
      b(1, "wild", true),
      c(2, "gold", true),
      d(3, "cyan", true),
      e(4, "blue", false);

      private static final IntFunction<bxq.d> g = asb.a(bxq.d::a, values(), asb.a.a);
      public static final Codec<bxq.d> f = aub.a(bxq.d::values);
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

      public static bxq.d a(int $$0) {
         return g.apply($$0);
      }

      public static bxq.d a(ato $$0) {
         return a($$0, true);
      }

      public static bxq.d b(ato $$0) {
         return a($$0, false);
      }

      private static bxq.d a(ato $$0, boolean $$1) {
         bxq.d[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.j == $$1).toArray(bxq.d[]::new);
         return ac.a($$2, $$0);
      }
   }
}
