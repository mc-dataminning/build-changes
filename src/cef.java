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

public class cef extends cct implements brc, bsd<cef.d>, ccv {
   public static final int bY = 200;
   protected static final ImmutableList<? extends cbo<? extends cbn<? super cef>>> bZ = ImmutableList.of(cbo.c, cbo.o, cbo.f, cbo.p, cbo.q);
   protected static final ImmutableList<? extends cah<?>> cb = ImmutableList.of(
      cah.r, cah.g, cah.h, cah.k, cah.l, cah.n, cah.m, cah.E, cah.t, cah.o, cah.p, cah.K, new cah[]{cah.y, cah.N, cah.B, cah.O, cah.P, cah.R, cah.U, cah.Z}
   );
   private static final ajk<Integer> cf = ajo.a(cef.class, ajm.b);
   private static final ajk<Boolean> cg = ajo.a(cef.class, ajm.k);
   private static final ajk<Boolean> ch = ajo.a(cef.class, ajm.k);
   public static final double cc = 20.0;
   public static final int cd = 1200;
   private static final int ci = 6000;
   public static final String ce = "Variant";
   private static final int cj = 1800;
   private static final int ck = 2400;
   private final Map<String, Vector3f> cl = Maps.newHashMap();
   private static final int cm = 100;

   public cef(bqr<? extends cef> $$0, czu $$1) {
      super($$0, $$1);
      this.a(emi.j, 0.0F);
      this.bP = new cef.c(this);
      this.bO = new cef.b(this, 20);
   }

   @Override
   public Map<String, Vector3f> a() {
      return this.cl;
   }

   @Override
   public float a(im $$0, czx $$1) {
      return 0.0F;
   }

   @Override
   protected void a(ajo.a $$0) {
      super.a($$0);
      $$0.a(cf, 0);
      $$0.a(cg, false);
      $$0.a(ch, false);
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      $$0.a("Variant", this.gp().a());
      $$0.a("FromBucket", this.u());
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      this.a(cef.d.a($$0.h("Variant")));
      this.w($$0.q("FromBucket"));
   }

   @Override
   public void P() {
      if (!this.gv()) {
         super.P();
      }
   }

   @Override
   public brw a(daj $$0, boo $$1, bri $$2, @Nullable brw $$3) {
      boolean $$4 = false;
      if ($$2 == bri.l) {
         return $$3;
      } else {
         ayd $$5 = $$0.E_();
         if ($$3 instanceof cef.a) {
            if (((cef.a)$$3).a() >= 2) {
               $$4 = true;
            }
         } else {
            $$3 = new cef.a(cef.d.a($$5), cef.d.a($$5));
         }

         this.a(((cef.a)$$3).a($$5));
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

   public cef.d gp() {
      return cef.d.a(this.ao.a(cf));
   }

   public void a(cef.d $$0) {
      this.ao.a(cf, $$0.a());
   }

   private static boolean a(ayd $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(czx $$0) {
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
   public bqf a(aqe $$0, bqf $$1) {
      cef $$2 = bqr.f.a((czu)$$0);
      if ($$2 != null) {
         cef.d $$3;
         if (a(this.ah)) {
            $$3 = cef.d.b(this.ah);
         } else {
            $$3 = this.ah.h() ? this.gp() : ((cef)$$1).gp();
         }

         $$2.a($$3);
         $$2.fT();
      }

      return $$2;
   }

   @Override
   public boolean o(csd $$0) {
      return $$0.a(avw.aA);
   }

   @Override
   public boolean a(ckl $$0) {
      return true;
   }

   @Override
   protected void Y() {
      this.dN().af().a("axolotlBrain");
      this.dQ().a((aqe)this.dN(), this);
      this.dN().af().c();
      this.dN().af().a("axolotlActivityUpdate");
      ceg.a(this);
      this.dN().af().c();
      if (!this.gf()) {
         Optional<Integer> $$0 = this.dQ().c(cah.N);
         this.x($$0.isPresent() && $$0.get() > 0);
      }
   }

   public static bsk.a gw() {
      return brg.A().a(bsl.q, 14.0).a(bsl.r, 1.0).a(bsl.c, 2.0).a(bsl.v, 1.0);
   }

   @Override
   protected cap b(czu $$0) {
      return new cam(this, $$0);
   }

   @Override
   public boolean C(bql $$0) {
      boolean $$1 = $$0.a(this.dO().b((bre)this), (float)((int)this.g(bsl.c)));
      if ($$1) {
         this.a(this, $$0);
         this.a(auz.aK, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public boolean a(bpj $$0, float $$1) {
      float $$2 = this.ey();
      if (!this.dN().B
         && !this.gf()
         && this.dN().z.a(3) == 0
         && ((float)this.dN().z.a(3) < $$1 || $$2 / this.eP() < 0.5F)
         && $$1 < $$2
         && this.bc()
         && ($$0.d() != null || $$0.c() != null)
         && !this.gv()) {
         this.bE.a(cah.N, 200);
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
   public boq b(ckl $$0, bop $$1) {
      return ccv.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void n(csd $$0) {
      ccv.a(this, $$0);
      cuq.a(jz.E, $$0, $$0x -> {
         $$0x.a("Variant", this.gp().a());
         $$0x.a("Age", this.g());
         bsf<?> $$1 = this.dQ();
         if ($$1.a(cah.U)) {
            $$0x.a("HuntingCooldown", $$1.e(cah.U));
         }
      });
   }

   @Override
   public void c(ty $$0) {
      ccv.a(this, $$0);
      this.a(cef.d.a($$0.h("Variant")));
      if ($$0.e("Age")) {
         this.c_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.dQ().a(cah.U, true, $$0.i("HuntingCooldown"));
      }
   }

   @Override
   public csd b() {
      return new csd(csg.qJ);
   }

   @Override
   public auy y() {
      return auz.dj;
   }

   @Override
   public boolean er() {
      return !this.gv() && super.er();
   }

   public static void a(cef $$0, bre $$1) {
      czu $$2 = $$0.dN();
      if ($$1.ez()) {
         bpj $$3 = $$1.eA();
         if ($$3 != null) {
            bql $$4 = $$3.d();
            if ($$4 != null && $$4.ai() == bqr.bx) {
               ckl $$5 = (ckl)$$4;
               List<ckl> $$6 = $$2.a(ckl.class, $$0.cI().g(20.0));
               if ($$6.contains($$5)) {
                  $$0.f($$5);
               }
            }
         }
      }
   }

   public void f(ckl $$0) {
      bpx $$1 = $$0.c(bpz.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.d() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new bpx(bpz.j, $$3, 0), this);
      }

      $$0.e(bpz.d);
   }

   @Override
   public boolean V() {
      return super.V() || this.u();
   }

   @Override
   protected auy d(bpj $$0) {
      return auz.aM;
   }

   @Nullable
   @Override
   protected auy o_() {
      return auz.aL;
   }

   @Nullable
   @Override
   protected auy v() {
      return this.bc() ? auz.aO : auz.aN;
   }

   @Override
   protected auy aO() {
      return auz.aP;
   }

   @Override
   protected auy aN() {
      return auz.aQ;
   }

   @Override
   protected bsf.b<cef> dR() {
      return bsf.a(cb, bZ);
   }

   @Override
   protected bsf<?> a(Dynamic<?> $$0) {
      return ceg.a(this.dR().a($$0));
   }

   @Override
   public bsf<cef> dQ() {
      return (bsf<cef>)super.dQ();
   }

   @Override
   protected void X() {
      super.X();
      afu.a(this);
   }

   @Override
   public void a(etf $$0) {
      if (this.cY() && this.bc()) {
         this.a(this.fl(), $$0);
         this.a(brj.a, this.dq());
         this.g(this.dq().a(0.9));
      } else {
         super.a($$0);
      }
   }

   @Override
   protected void a(ckl $$0, bop $$1, csd $$2) {
      if ($$2.a(csg.qI)) {
         $$0.a($$1, new csd(csg.qz));
      } else {
         super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.u() && !this.ae();
   }

   public static boolean a(bqr<? extends bre> $$0, daj $$1, bri $$2, im $$3, ayd $$4) {
      return $$1.a_($$3.d()).a(avo.bS);
   }

   public static class a extends bqf.a {
      public final cef.d[] a;

      public a(cef.d... $$0) {
         super(false);
         this.a = $$0;
      }

      public cef.d a(ayd $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class b extends bxf {
      public b(cef $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!cef.this.gv()) {
            super.a();
         }
      }
   }

   static class c extends bxg {
      private final cef l;

      public c(cef $$0) {
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

   public static enum d implements ayq {
      a(0, "lucy", true),
      b(1, "wild", true),
      c(2, "gold", true),
      d(3, "cyan", true),
      e(4, "blue", false);

      private static final IntFunction<cef.d> g = awn.a(cef.d::a, values(), awn.a.a);
      public static final Codec<cef.d> f = ayq.a(cef.d::values);
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

      public static cef.d a(int $$0) {
         return g.apply($$0);
      }

      public static cef.d a(ayd $$0) {
         return a($$0, true);
      }

      public static cef.d b(ayd $$0) {
         return a($$0, false);
      }

      private static cef.d a(ayd $$0, boolean $$1) {
         cef.d[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.j == $$1).toArray(cef.d[]::new);
         return ac.a($$2, $$0);
      }
   }
}
