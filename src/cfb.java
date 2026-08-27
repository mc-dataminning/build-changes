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

public class cfb extends cdp implements bry, bsz<cfb.d>, cdr {
   public static final int bY = 200;
   protected static final ImmutableList<? extends cck<? extends ccj<? super cfb>>> bZ = ImmutableList.of(cck.c, cck.o, cck.f, cck.p, cck.q);
   protected static final ImmutableList<? extends cbd<?>> cb = ImmutableList.of(
      cbd.r, cbd.g, cbd.h, cbd.k, cbd.l, cbd.n, cbd.m, cbd.E, cbd.t, cbd.o, cbd.p, cbd.K, new cbd[]{cbd.y, cbd.N, cbd.B, cbd.O, cbd.P, cbd.R, cbd.U, cbd.Z}
   );
   private static final ajm<Integer> cf = ajq.a(cfb.class, ajo.b);
   private static final ajm<Boolean> cg = ajq.a(cfb.class, ajo.k);
   private static final ajm<Boolean> ch = ajq.a(cfb.class, ajo.k);
   public static final double cc = 20.0;
   public static final int cd = 1200;
   private static final int ci = 6000;
   public static final String ce = "Variant";
   private static final int cj = 1800;
   private static final int ck = 2400;
   private final Map<String, Vector3f> cl = Maps.newHashMap();
   private static final int cm = 100;

   public cfb(brn<? extends cfb> $$0, dad $$1) {
      super($$0, $$1);
      this.a(emr.j, 0.0F);
      this.bP = new cfb.c(this);
      this.bO = new cfb.b(this, 20);
   }

   @Override
   public Map<String, Vector3f> a() {
      return this.cl;
   }

   @Override
   public float a(in $$0, dag $$1) {
      return 0.0F;
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(cf, 0);
      $$0.a(cg, false);
      $$0.a(ch, false);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Variant", this.gp().a());
      $$0.a("FromBucket", this.u());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.a(cfb.d.a($$0.h("Variant")));
      this.w($$0.q("FromBucket"));
   }

   @Override
   public void P() {
      if (!this.gv()) {
         super.P();
      }
   }

   @Override
   public bss a(das $$0, bpk $$1, bse $$2, @Nullable bss $$3) {
      boolean $$4 = false;
      if ($$2 == bse.l) {
         return $$3;
      } else {
         ayg $$5 = $$0.E_();
         if ($$3 instanceof cfb.a) {
            if (((cfb.a)$$3).a() >= 2) {
               $$4 = true;
            }
         } else {
            $$3 = new cfb.a(cfb.d.a($$5), cfb.d.a($$5));
         }

         this.a(((cfb.a)$$3).a($$5));
         if ($$4) {
            this.c_(-24000);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void as() {
      int $$0 = this.cj();
      super.as();
      if (!this.gf()) {
         this.u($$0);
      }
   }

   protected void u(int $$0) {
      if (this.bB() && !this.be()) {
         this.k($$0 - 1);
         if (this.cj() == -20) {
            this.k(0);
            this.a(this.dO().r(), 2.0F);
         }
      } else {
         this.k(this.ci());
      }
   }

   @Override
   public void r() {
      int $$0 = this.cj() + 1800;
      this.k(Math.min($$0, this.ci()));
   }

   @Override
   public int ci() {
      return 6000;
   }

   public cfb.d gp() {
      return cfb.d.a(this.ao.a(cf));
   }

   public void a(cfb.d $$0) {
      this.ao.a(cf, $$0.a());
   }

   private static boolean a(ayg $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(dag $$0) {
      return $$0.f(this);
   }

   @Override
   public boolean cA() {
      return false;
   }

   public void x(boolean $$0) {
      this.ao.a(cg, $$0);
   }

   public boolean gv() {
      return this.ao.a(cg);
   }

   @Override
   public boolean u() {
      return this.ao.a(ch);
   }

   @Override
   public void w(boolean $$0) {
      this.ao.a(ch, $$0);
   }

   @Nullable
   @Override
   public brb a(aqh $$0, brb $$1) {
      cfb $$2 = brn.f.a((dad)$$0);
      if ($$2 != null) {
         cfb.d $$3;
         if (a(this.ah)) {
            $$3 = cfb.d.b(this.ah);
         } else {
            $$3 = this.ah.h() ? this.gp() : ((cfb)$$1).gp();
         }

         $$2.a($$3);
         $$2.fT();
      }

      return $$2;
   }

   @Override
   public boolean o(csz $$0) {
      return $$0.a(avz.ay);
   }

   @Override
   public boolean a(clh $$0) {
      return true;
   }

   @Override
   protected void Y() {
      this.dN().af().a("axolotlBrain");
      this.dQ().a((aqh)this.dN(), this);
      this.dN().af().c();
      this.dN().af().a("axolotlActivityUpdate");
      cfc.a(this);
      this.dN().af().c();
      if (!this.gf()) {
         Optional<Integer> $$0 = this.dQ().c(cbd.N);
         this.x($$0.isPresent() && $$0.get() > 0);
      }
   }

   public static btg.a gw() {
      return bsc.A().a(bth.q, 14.0).a(bth.r, 1.0).a(bth.c, 2.0).a(bth.v, 1.0);
   }

   @Override
   protected cbl b(dad $$0) {
      return new cbi(this, $$0);
   }

   @Override
   public boolean C(brh $$0) {
      boolean $$1 = $$0.a(this.dO().b((bsa)this), (float)((int)this.g(bth.c)));
      if ($$1) {
         this.a(this, $$0);
         this.a(avc.aK, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public boolean a(bqf $$0, float $$1) {
      float $$2 = this.ey();
      if (!this.dN().B
         && !this.gf()
         && this.dN().z.a(3) == 0
         && ((float)this.dN().z.a(3) < $$1 || $$2 / this.eP() < 0.5F)
         && $$1 < $$2
         && this.bc()
         && ($$0.d() != null || $$0.c() != null)
         && !this.gv()) {
         this.bE.a(cbd.N, 200);
      }

      return super.a($$0, $$1);
   }

   @Override
   public int Z() {
      return 1;
   }

   @Override
   public int aa() {
      return 1;
   }

   @Override
   public bpm b(clh $$0, bpl $$1) {
      return cdr.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void n(csz $$0) {
      cdr.a(this, $$0);
      cvm.a(ka.L, $$0, $$0x -> {
         $$0x.a("Variant", this.gp().a());
         $$0x.a("Age", this.g());
         btb<?> $$1 = this.dQ();
         if ($$1.a(cbd.U)) {
            $$0x.a("HuntingCooldown", $$1.e(cbd.U));
         }
      });
   }

   @Override
   public void c(ua $$0) {
      cdr.a(this, $$0);
      this.a(cfb.d.a($$0.h("Variant")));
      if ($$0.e("Age")) {
         this.c_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.dQ().a(cbd.U, true, $$0.i("HuntingCooldown"));
      }
   }

   @Override
   public csz b() {
      return new csz(ctc.qJ);
   }

   @Override
   public avb y() {
      return avc.dj;
   }

   @Override
   public boolean er() {
      return !this.gv() && super.er();
   }

   public static void a(cfb $$0, bsa $$1) {
      dad $$2 = $$0.dN();
      if ($$1.ez()) {
         bqf $$3 = $$1.eA();
         if ($$3 != null) {
            brh $$4 = $$3.d();
            if ($$4 != null && $$4.ai() == brn.bx) {
               clh $$5 = (clh)$$4;
               List<clh> $$6 = $$2.a(clh.class, $$0.cI().g(20.0));
               if ($$6.contains($$5)) {
                  $$0.f($$5);
               }
            }
         }
      }
   }

   public void f(clh $$0) {
      bqt $$1 = $$0.c(bqv.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.d() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new bqt(bqv.j, $$3, 0), this);
      }

      $$0.e(bqv.d);
   }

   @Override
   public boolean V() {
      return super.V() || this.u();
   }

   @Override
   protected avb d(bqf $$0) {
      return avc.aM;
   }

   @Nullable
   @Override
   protected avb o_() {
      return avc.aL;
   }

   @Nullable
   @Override
   protected avb v() {
      return this.bc() ? avc.aO : avc.aN;
   }

   @Override
   protected avb aO() {
      return avc.aP;
   }

   @Override
   protected avb aN() {
      return avc.aQ;
   }

   @Override
   protected btb.b<cfb> dR() {
      return btb.a(cb, bZ);
   }

   @Override
   protected btb<?> a(Dynamic<?> $$0) {
      return cfc.a(this.dR().a($$0));
   }

   @Override
   public btb<cfb> dQ() {
      return (btb<cfb>)super.dQ();
   }

   @Override
   protected void X() {
      super.X();
      afw.a(this);
   }

   @Override
   public void a(etp $$0) {
      if (this.cY() && this.bc()) {
         this.a(this.fl(), $$0);
         this.a(bsf.a, this.dq());
         this.g(this.dq().a(0.9));
      } else {
         super.a($$0);
      }
   }

   @Override
   protected void a(clh $$0, bpl $$1, csz $$2) {
      if ($$2.a(ctc.qI)) {
         $$0.a($$1, new csz(ctc.qz));
      } else {
         super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.u() && !this.ae();
   }

   public static boolean a(brn<? extends bsa> $$0, das $$1, bse $$2, in $$3, ayg $$4) {
      return $$1.a_($$3.d()).a(avr.bY);
   }

   public static class a extends brb.a {
      public final cfb.d[] a;

      public a(cfb.d... $$0) {
         super(false);
         this.a = $$0;
      }

      public cfb.d a(ayg $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class b extends byb {
      public b(cfb $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!cfb.this.gv()) {
            super.a();
         }
      }
   }

   static class c extends byc {
      private final cfb l;

      public c(cfb $$0) {
         super($$0, 85, 10, 0.1F, 0.5F, false);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (!this.l.gv()) {
            super.a();
         }
      }
   }

   public static enum d implements ayt {
      a(0, "lucy", true),
      b(1, "wild", true),
      c(2, "gold", true),
      d(3, "cyan", true),
      e(4, "blue", false);

      private static final IntFunction<cfb.d> g = awq.a(cfb.d::a, values(), awq.a.a);
      public static final Codec<cfb.d> f = ayt.a(cfb.d::values);
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

      public static cfb.d a(int $$0) {
         return g.apply($$0);
      }

      public static cfb.d a(ayg $$0) {
         return a($$0, true);
      }

      public static cfb.d b(ayg $$0) {
         return a($$0, false);
      }

      private static cfb.d a(ayg $$0, boolean $$1) {
         cfb.d[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.j == $$1).toArray(cfb.d[]::new);
         return ac.a($$2, $$0);
      }
   }
}
