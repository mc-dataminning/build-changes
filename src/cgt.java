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

public class cgt extends cfh implements btp, bur<cgt.d>, cfj {
   public static final int bY = 200;
   protected static final ImmutableList<? extends cec<? extends ceb<? super cgt>>> bZ = ImmutableList.of(cec.c, cec.o, cec.f, cec.p, cec.q);
   protected static final ImmutableList<? extends ccv<?>> cb = ImmutableList.of(
      ccv.r, ccv.g, ccv.h, ccv.k, ccv.l, ccv.n, ccv.m, ccv.E, ccv.t, ccv.o, ccv.p, ccv.K, new ccv[]{ccv.y, ccv.N, ccv.B, ccv.O, ccv.P, ccv.R, ccv.U, ccv.Z}
   );
   private static final akk<Integer> cf = ako.a(cgt.class, akm.b);
   private static final akk<Boolean> cg = ako.a(cgt.class, akm.k);
   private static final akk<Boolean> ch = ako.a(cgt.class, akm.k);
   public static final double cc = 20.0;
   public static final int cd = 1200;
   private static final int ci = 6000;
   public static final String ce = "Variant";
   private static final int cj = 1800;
   private static final int ck = 2400;
   private final Map<String, Vector3f> cl = Maps.newHashMap();
   private static final int cm = 100;

   public cgt(btc<? extends cgt> $$0, dca $$1) {
      super($$0, $$1);
      this.a(eoo.j, 0.0F);
      this.bP = new cgt.c(this);
      this.bO = new cgt.b(this, 20);
   }

   @Override
   public Map<String, Vector3f> a() {
      return this.cl;
   }

   @Override
   public float a(iz $$0, dcd $$1) {
      return 0.0F;
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(cf, 0);
      $$0.a(cg, false);
      $$0.a(ch, false);
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      $$0.a("Variant", this.gq().a());
      $$0.a("FromBucket", this.u());
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      this.a(cgt.d.a($$0.h("Variant")));
      this.w($$0.q("FromBucket"));
   }

   @Override
   public void Q() {
      if (!this.gw()) {
         super.Q();
      }
   }

   @Override
   public buk a(dcp $$0, bqu $$1, btv $$2, @Nullable buk $$3) {
      boolean $$4 = false;
      if ($$2 == btv.l) {
         return $$3;
      } else {
         azh $$5 = $$0.E_();
         if ($$3 instanceof cgt.a) {
            if (((cgt.a)$$3).a() >= 2) {
               $$4 = true;
            }
         } else {
            $$3 = new cgt.a(cgt.d.a($$5), cgt.d.a($$5));
         }

         this.a(((cgt.a)$$3).a($$5));
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

   public cgt.d gq() {
      return cgt.d.a(this.ao.a(cf));
   }

   public void a(cgt.d $$0) {
      this.ao.a(cf, $$0.a());
   }

   private static boolean a(azh $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(dcd $$0) {
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
   public bsq a(arf $$0, bsq $$1) {
      cgt $$2 = btc.f.a((dca)$$0);
      if ($$2 != null) {
         cgt.d $$3;
         if (a(this.ah)) {
            $$3 = cgt.d.b(this.ah);
         } else {
            $$3 = this.ah.h() ? this.gq() : ((cgt)$$1).gq();
         }

         $$2.a($$3);
         $$2.fU();
      }

      return $$2;
   }

   @Override
   public boolean o(cur $$0) {
      return $$0.a(awy.ay);
   }

   @Override
   public boolean a(cmz $$0) {
      return true;
   }

   @Override
   protected void Z() {
      this.dP().ag().a("axolotlBrain");
      this.dS().a((arf)this.dP(), this);
      this.dP().ag().c();
      this.dP().ag().a("axolotlActivityUpdate");
      cgu.a(this);
      this.dP().ag().c();
      if (!this.gg()) {
         Optional<Integer> $$0 = this.dS().c(ccv.N);
         this.x($$0.isPresent() && $$0.get() > 0);
      }
   }

   public static buy.a gx() {
      return btt.A().a(buz.q, 14.0).a(buz.r, 1.0).a(buz.c, 2.0).a(buz.v, 1.0);
   }

   @Override
   protected cdd b(dca $$0) {
      return new cda(this, $$0);
   }

   @Override
   public boolean C(bsw $$0) {
      boolean $$1 = $$0.a(this.dQ().b((btr)this), (float)((int)this.g(buz.c)));
      if ($$1) {
         this.a(this, $$0);
         this.a(awa.aK, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public boolean a(brp $$0, float $$1) {
      float $$2 = this.eA();
      if (!this.dP().B
         && !this.gg()
         && this.dP().z.a(3) == 0
         && ((float)this.dP().z.a(3) < $$1 || $$2 / this.eR() < 0.5F)
         && $$1 < $$2
         && this.be()
         && ($$0.d() != null || $$0.c() != null)
         && !this.gw()) {
         this.bD.a(ccv.N, 200);
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
   public bqw b(cmz $$0, bqv $$1) {
      return cfj.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void n(cur $$0) {
      cfj.a(this, $$0);
      cxg.a(km.N, $$0, $$0x -> {
         $$0x.a("Variant", this.gq().a());
         $$0x.a("Age", this.g());
         but<?> $$1 = this.dS();
         if ($$1.a(ccv.U)) {
            $$0x.a("HuntingCooldown", $$1.e(ccv.U));
         }
      });
   }

   @Override
   public void c(us $$0) {
      cfj.a(this, $$0);
      this.a(cgt.d.a($$0.h("Variant")));
      if ($$0.e("Age")) {
         this.c_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.dS().a(ccv.U, true, $$0.i("HuntingCooldown"));
      }
   }

   @Override
   public cur b() {
      return new cur(cuu.qJ);
   }

   @Override
   public avz y() {
      return awa.dj;
   }

   @Override
   public boolean et() {
      return !this.gw() && super.et();
   }

   public static void a(cgt $$0, btr $$1) {
      dca $$2 = $$0.dP();
      if ($$1.eB()) {
         brp $$3 = $$1.eC();
         if ($$3 != null) {
            bsw $$4 = $$3.d();
            if ($$4 != null && $$4.ak() == btc.by) {
               cmz $$5 = (cmz)$$4;
               List<cmz> $$6 = $$2.a(cmz.class, $$0.cK().g(20.0));
               if ($$6.contains($$5)) {
                  $$0.f($$5);
               }
            }
         }
      }
   }

   public void f(cmz $$0) {
      bse $$1 = $$0.c(bsg.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.d() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new bse(bsg.j, $$3, 0), this);
      }

      $$0.e(bsg.d);
   }

   @Override
   public boolean W() {
      return super.W() || this.u();
   }

   @Override
   protected avz d(brp $$0) {
      return awa.aM;
   }

   @Nullable
   @Override
   protected avz o_() {
      return awa.aL;
   }

   @Nullable
   @Override
   protected avz v() {
      return this.be() ? awa.aO : awa.aN;
   }

   @Override
   protected avz aQ() {
      return awa.aP;
   }

   @Override
   protected avz aP() {
      return awa.aQ;
   }

   @Override
   protected but.b<cgt> dT() {
      return but.a(cb, bZ);
   }

   @Override
   protected but<?> a(Dynamic<?> $$0) {
      return cgu.a(this.dT().a($$0));
   }

   @Override
   public but<cgt> dS() {
      return (but<cgt>)super.dS();
   }

   @Override
   protected void Y() {
      super.Y();
      agt.a(this);
   }

   @Override
   public void a(evt $$0) {
      if (this.da() && this.be()) {
         this.a(this.fn(), $$0);
         this.a(btw.a, this.ds());
         this.h(this.ds().a(0.9));
      } else {
         super.a($$0);
      }
   }

   @Override
   protected void a(cmz $$0, bqv $$1, cur $$2) {
      if ($$2.a(cuu.qI)) {
         $$0.a($$1, new cur(cuu.qz));
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
   public btr p() {
      return this.N();
   }

   public static boolean a(btc<? extends btr> $$0, dcp $$1, btv $$2, iz $$3, azh $$4) {
      return $$1.a_($$3.d()).a(awp.bY);
   }

   public static class a extends bsq.a {
      public final cgt.d[] a;

      public a(cgt.d... $$0) {
         super(false);
         this.a = $$0;
      }

      public cgt.d a(azh $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class b extends bzt {
      public b(final cgt $$0, final int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!cgt.this.gw()) {
            super.a();
         }
      }
   }

   static class c extends bzu {
      private final cgt l;

      public c(cgt $$0) {
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

   public static enum d implements azu {
      a(0, "lucy", true),
      b(1, "wild", true),
      c(2, "gold", true),
      d(3, "cyan", true),
      e(4, "blue", false);

      private static final IntFunction<cgt.d> g = axp.a(cgt.d::a, values(), axp.a.a);
      public static final Codec<cgt.d> f = azu.a(cgt.d::values);
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

      public static cgt.d a(int $$0) {
         return g.apply($$0);
      }

      public static cgt.d a(azh $$0) {
         return a($$0, true);
      }

      public static cgt.d b(azh $$0) {
         return a($$0, false);
      }

      private static cgt.d a(azh $$0, boolean $$1) {
         cgt.d[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.j == $$1).toArray(cgt.d[]::new);
         return ac.a($$2, $$0);
      }
   }
}
