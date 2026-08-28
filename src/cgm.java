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

public class cgm extends cfa implements bti, buk<cgm.d>, cfc {
   public static final int bY = 200;
   protected static final ImmutableList<? extends cdv<? extends cdu<? super cgm>>> bZ = ImmutableList.of(cdv.c, cdv.o, cdv.f, cdv.p, cdv.q);
   protected static final ImmutableList<? extends cco<?>> cb = ImmutableList.of(
      cco.r, cco.g, cco.h, cco.k, cco.l, cco.n, cco.m, cco.E, cco.t, cco.o, cco.p, cco.K, new cco[]{cco.y, cco.N, cco.B, cco.O, cco.P, cco.R, cco.U, cco.Z}
   );
   private static final akg<Integer> cf = akk.a(cgm.class, aki.b);
   private static final akg<Boolean> cg = akk.a(cgm.class, aki.k);
   private static final akg<Boolean> ch = akk.a(cgm.class, aki.k);
   public static final double cc = 20.0;
   public static final int cd = 1200;
   private static final int ci = 6000;
   public static final String ce = "Variant";
   private static final int cj = 1800;
   private static final int ck = 2400;
   private final Map<String, Vector3f> cl = Maps.newHashMap();
   private static final int cm = 100;

   public cgm(bsv<? extends cgm> $$0, dbt $$1) {
      super($$0, $$1);
      this.a(eoh.j, 0.0F);
      this.bP = new cgm.c(this);
      this.bO = new cgm.b(this, 20);
   }

   @Override
   public Map<String, Vector3f> a() {
      return this.cl;
   }

   @Override
   public float a(iz $$0, dbw $$1) {
      return 0.0F;
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(cf, 0);
      $$0.a(cg, false);
      $$0.a(ch, false);
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("Variant", this.gq().a());
      $$0.a("FromBucket", this.u());
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      this.a(cgm.d.a($$0.h("Variant")));
      this.w($$0.q("FromBucket"));
   }

   @Override
   public void Q() {
      if (!this.gw()) {
         super.Q();
      }
   }

   @Override
   public bud a(dci $$0, bqn $$1, bto $$2, @Nullable bud $$3) {
      boolean $$4 = false;
      if ($$2 == bto.l) {
         return $$3;
      } else {
         azc $$5 = $$0.E_();
         if ($$3 instanceof cgm.a) {
            if (((cgm.a)$$3).a() >= 2) {
               $$4 = true;
            }
         } else {
            $$3 = new cgm.a(cgm.d.a($$5), cgm.d.a($$5));
         }

         this.a(((cgm.a)$$3).a($$5));
         if ($$4) {
            this.c_(-24000);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void au() {
      int $$0 = this.cl();
      super.au();
      if (!this.gg()) {
         this.u($$0);
      }
   }

   protected void u(int $$0) {
      if (this.bD() && !this.bg()) {
         this.k($$0 - 1);
         if (this.cl() == -20) {
            this.k(0);
            this.a(this.dQ().r(), 2.0F);
         }
      } else {
         this.k(this.ck());
      }
   }

   @Override
   public void s() {
      int $$0 = this.cl() + 1800;
      this.k(Math.min($$0, this.ck()));
   }

   @Override
   public int ck() {
      return 6000;
   }

   public cgm.d gq() {
      return cgm.d.a(this.ao.a(cf));
   }

   public void a(cgm.d $$0) {
      this.ao.a(cf, $$0.a());
   }

   private static boolean a(azc $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(dbw $$0) {
      return $$0.f(this);
   }

   @Override
   public boolean cC() {
      return false;
   }

   public void x(boolean $$0) {
      this.ao.a(cg, $$0);
   }

   public boolean gw() {
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
   public bsj a(arb $$0, bsj $$1) {
      cgm $$2 = bsv.f.a((dbt)$$0);
      if ($$2 != null) {
         cgm.d $$3;
         if (a(this.ah)) {
            $$3 = cgm.d.b(this.ah);
         } else {
            $$3 = this.ah.h() ? this.gq() : ((cgm)$$1).gq();
         }

         $$2.a($$3);
         $$2.fU();
      }

      return $$2;
   }

   @Override
   public boolean o(cuk $$0) {
      return $$0.a(awu.ay);
   }

   @Override
   public boolean a(cms $$0) {
      return true;
   }

   @Override
   protected void Z() {
      this.dP().ag().a("axolotlBrain");
      this.dS().a((arb)this.dP(), this);
      this.dP().ag().c();
      this.dP().ag().a("axolotlActivityUpdate");
      cgn.a(this);
      this.dP().ag().c();
      if (!this.gg()) {
         Optional<Integer> $$0 = this.dS().c(cco.N);
         this.x($$0.isPresent() && $$0.get() > 0);
      }
   }

   public static bur.a gx() {
      return btm.A().a(bus.q, 14.0).a(bus.r, 1.0).a(bus.c, 2.0).a(bus.v, 1.0);
   }

   @Override
   protected ccw b(dbt $$0) {
      return new cct(this, $$0);
   }

   @Override
   public boolean C(bsp $$0) {
      boolean $$1 = $$0.a(this.dQ().b((btk)this), (float)((int)this.g(bus.c)));
      if ($$1) {
         this.a(this, $$0);
         this.a(avw.aK, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public boolean a(bri $$0, float $$1) {
      float $$2 = this.eA();
      if (!this.dP().B
         && !this.gg()
         && this.dP().z.a(3) == 0
         && ((float)this.dP().z.a(3) < $$1 || $$2 / this.eR() < 0.5F)
         && $$1 < $$2
         && this.be()
         && ($$0.d() != null || $$0.c() != null)
         && !this.gw()) {
         this.bD.a(cco.N, 200);
      }

      return super.a($$0, $$1);
   }

   @Override
   public int aa() {
      return 1;
   }

   @Override
   public int ab() {
      return 1;
   }

   @Override
   public bqp b(cms $$0, bqo $$1) {
      return cfc.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void n(cuk $$0) {
      cfc.a(this, $$0);
      cwz.a(km.M, $$0, $$0x -> {
         $$0x.a("Variant", this.gq().a());
         $$0x.a("Age", this.g());
         bum<?> $$1 = this.dS();
         if ($$1.a(cco.U)) {
            $$0x.a("HuntingCooldown", $$1.e(cco.U));
         }
      });
   }

   @Override
   public void c(ur $$0) {
      cfc.a(this, $$0);
      this.a(cgm.d.a($$0.h("Variant")));
      if ($$0.e("Age")) {
         this.c_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.dS().a(cco.U, true, $$0.i("HuntingCooldown"));
      }
   }

   @Override
   public cuk b() {
      return new cuk(cun.qJ);
   }

   @Override
   public avv y() {
      return avw.dj;
   }

   @Override
   public boolean et() {
      return !this.gw() && super.et();
   }

   public static void a(cgm $$0, btk $$1) {
      dbt $$2 = $$0.dP();
      if ($$1.eB()) {
         bri $$3 = $$1.eC();
         if ($$3 != null) {
            bsp $$4 = $$3.d();
            if ($$4 != null && $$4.ak() == bsv.by) {
               cms $$5 = (cms)$$4;
               List<cms> $$6 = $$2.a(cms.class, $$0.cK().g(20.0));
               if ($$6.contains($$5)) {
                  $$0.f($$5);
               }
            }
         }
      }
   }

   public void f(cms $$0) {
      brx $$1 = $$0.c(brz.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.d() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new brx(brz.j, $$3, 0), this);
      }

      $$0.e(brz.d);
   }

   @Override
   public boolean W() {
      return super.W() || this.u();
   }

   @Override
   protected avv d(bri $$0) {
      return avw.aM;
   }

   @Nullable
   @Override
   protected avv o_() {
      return avw.aL;
   }

   @Nullable
   @Override
   protected avv v() {
      return this.be() ? avw.aO : avw.aN;
   }

   @Override
   protected avv aQ() {
      return avw.aP;
   }

   @Override
   protected avv aP() {
      return avw.aQ;
   }

   @Override
   protected bum.b<cgm> dT() {
      return bum.a(cb, bZ);
   }

   @Override
   protected bum<?> a(Dynamic<?> $$0) {
      return cgn.a(this.dT().a($$0));
   }

   @Override
   public bum<cgm> dS() {
      return (bum<cgm>)super.dS();
   }

   @Override
   protected void Y() {
      super.Y();
      agp.a(this);
   }

   @Override
   public void a(evm $$0) {
      if (this.da() && this.be()) {
         this.a(this.fn(), $$0);
         this.a(btp.a, this.ds());
         this.h(this.ds().a(0.9));
      } else {
         super.a($$0);
      }
   }

   @Override
   protected void a(cms $$0, bqo $$1, cuk $$2) {
      if ($$2.a(cun.qI)) {
         $$0.a($$1, new cuk(cun.qz));
      } else {
         super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.u() && !this.ag();
   }

   @Nullable
   @Override
   public btk p() {
      return this.N();
   }

   public static boolean a(bsv<? extends btk> $$0, dci $$1, bto $$2, iz $$3, azc $$4) {
      return $$1.a_($$3.d()).a(awl.bY);
   }

   public static class a extends bsj.a {
      public final cgm.d[] a;

      public a(cgm.d... $$0) {
         super(false);
         this.a = $$0;
      }

      public cgm.d a(azc $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class b extends bzm {
      public b(final cgm $$0, final int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!cgm.this.gw()) {
            super.a();
         }
      }
   }

   static class c extends bzn {
      private final cgm l;

      public c(cgm $$0) {
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

   public static enum d implements azp {
      a(0, "lucy", true),
      b(1, "wild", true),
      c(2, "gold", true),
      d(3, "cyan", true),
      e(4, "blue", false);

      private static final IntFunction<cgm.d> g = axl.a(cgm.d::a, values(), axl.a.a);
      public static final Codec<cgm.d> f = azp.a(cgm.d::values);
      private final int h;
      private final String i;
      private final boolean j;

      private d(final int $$0, final String $$1, final boolean $$2) {
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

      public static cgm.d a(int $$0) {
         return g.apply($$0);
      }

      public static cgm.d a(azc $$0) {
         return a($$0, true);
      }

      public static cgm.d b(azc $$0) {
         return a($$0, false);
      }

      private static cgm.d a(azc $$0, boolean $$1) {
         cgm.d[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.j == $$1).toArray(cgm.d[]::new);
         return ac.a($$2, $$0);
      }
   }
}
