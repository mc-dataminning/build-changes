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

public class cgr extends cff implements btn, bup<cgr.d>, cfh {
   public static final int bY = 200;
   protected static final ImmutableList<? extends cea<? extends cdz<? super cgr>>> bZ = ImmutableList.of(cea.c, cea.o, cea.f, cea.p, cea.q);
   protected static final ImmutableList<? extends cct<?>> cb = ImmutableList.of(
      cct.r, cct.g, cct.h, cct.k, cct.l, cct.n, cct.m, cct.E, cct.t, cct.o, cct.p, cct.K, new cct[]{cct.y, cct.N, cct.B, cct.O, cct.P, cct.R, cct.U, cct.Z}
   );
   private static final akk<Integer> cf = ako.a(cgr.class, akm.b);
   private static final akk<Boolean> cg = ako.a(cgr.class, akm.k);
   private static final akk<Boolean> ch = ako.a(cgr.class, akm.k);
   public static final double cc = 20.0;
   public static final int cd = 1200;
   private static final int ci = 6000;
   public static final String ce = "Variant";
   private static final int cj = 1800;
   private static final int ck = 2400;
   private final Map<String, Vector3f> cl = Maps.newHashMap();
   private static final int cm = 100;

   public cgr(bta<? extends cgr> $$0, dby $$1) {
      super($$0, $$1);
      this.a(eom.j, 0.0F);
      this.bP = new cgr.c(this);
      this.bO = new cgr.b(this, 20);
   }

   @Override
   public Map<String, Vector3f> a() {
      return this.cl;
   }

   @Override
   public float a(iz $$0, dcb $$1) {
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
      this.a(cgr.d.a($$0.h("Variant")));
      this.w($$0.q("FromBucket"));
   }

   @Override
   public void Q() {
      if (!this.gw()) {
         super.Q();
      }
   }

   @Override
   public bui a(dcn $$0, bqs $$1, btt $$2, @Nullable bui $$3) {
      boolean $$4 = false;
      if ($$2 == btt.l) {
         return $$3;
      } else {
         azh $$5 = $$0.E_();
         if ($$3 instanceof cgr.a) {
            if (((cgr.a)$$3).a() >= 2) {
               $$4 = true;
            }
         } else {
            $$3 = new cgr.a(cgr.d.a($$5), cgr.d.a($$5));
         }

         this.a(((cgr.a)$$3).a($$5));
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

   public cgr.d gq() {
      return cgr.d.a(this.ao.a(cf));
   }

   public void a(cgr.d $$0) {
      this.ao.a(cf, $$0.a());
   }

   private static boolean a(azh $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(dcb $$0) {
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
   public bso a(arf $$0, bso $$1) {
      cgr $$2 = bta.f.a((dby)$$0);
      if ($$2 != null) {
         cgr.d $$3;
         if (a(this.ah)) {
            $$3 = cgr.d.b(this.ah);
         } else {
            $$3 = this.ah.h() ? this.gq() : ((cgr)$$1).gq();
         }

         $$2.a($$3);
         $$2.fU();
      }

      return $$2;
   }

   @Override
   public boolean o(cup $$0) {
      return $$0.a(awy.ay);
   }

   @Override
   public boolean a(cmx $$0) {
      return true;
   }

   @Override
   protected void Z() {
      this.dP().ag().a("axolotlBrain");
      this.dS().a((arf)this.dP(), this);
      this.dP().ag().c();
      this.dP().ag().a("axolotlActivityUpdate");
      cgs.a(this);
      this.dP().ag().c();
      if (!this.gg()) {
         Optional<Integer> $$0 = this.dS().c(cct.N);
         this.x($$0.isPresent() && $$0.get() > 0);
      }
   }

   public static buw.a gx() {
      return btr.A().a(bux.q, 14.0).a(bux.r, 1.0).a(bux.c, 2.0).a(bux.v, 1.0);
   }

   @Override
   protected cdb b(dby $$0) {
      return new ccy(this, $$0);
   }

   @Override
   public boolean C(bsu $$0) {
      boolean $$1 = $$0.a(this.dQ().b((btp)this), (float)((int)this.g(bux.c)));
      if ($$1) {
         this.a(this, $$0);
         this.a(awa.aK, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public boolean a(brn $$0, float $$1) {
      float $$2 = this.eA();
      if (!this.dP().B
         && !this.gg()
         && this.dP().z.a(3) == 0
         && ((float)this.dP().z.a(3) < $$1 || $$2 / this.eR() < 0.5F)
         && $$1 < $$2
         && this.be()
         && ($$0.d() != null || $$0.c() != null)
         && !this.gw()) {
         this.bD.a(cct.N, 200);
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
   public bqu b(cmx $$0, bqt $$1) {
      return cfh.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void n(cup $$0) {
      cfh.a(this, $$0);
      cxe.a(km.N, $$0, $$0x -> {
         $$0x.a("Variant", this.gq().a());
         $$0x.a("Age", this.g());
         bur<?> $$1 = this.dS();
         if ($$1.a(cct.U)) {
            $$0x.a("HuntingCooldown", $$1.e(cct.U));
         }
      });
   }

   @Override
   public void c(us $$0) {
      cfh.a(this, $$0);
      this.a(cgr.d.a($$0.h("Variant")));
      if ($$0.e("Age")) {
         this.c_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.dS().a(cct.U, true, $$0.i("HuntingCooldown"));
      }
   }

   @Override
   public cup b() {
      return new cup(cus.qJ);
   }

   @Override
   public avz y() {
      return awa.dj;
   }

   @Override
   public boolean et() {
      return !this.gw() && super.et();
   }

   public static void a(cgr $$0, btp $$1) {
      dby $$2 = $$0.dP();
      if ($$1.eB()) {
         brn $$3 = $$1.eC();
         if ($$3 != null) {
            bsu $$4 = $$3.d();
            if ($$4 != null && $$4.ak() == bta.by) {
               cmx $$5 = (cmx)$$4;
               List<cmx> $$6 = $$2.a(cmx.class, $$0.cK().g(20.0));
               if ($$6.contains($$5)) {
                  $$0.f($$5);
               }
            }
         }
      }
   }

   public void f(cmx $$0) {
      bsc $$1 = $$0.c(bse.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.d() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new bsc(bse.j, $$3, 0), this);
      }

      $$0.e(bse.d);
   }

   @Override
   public boolean W() {
      return super.W() || this.u();
   }

   @Override
   protected avz d(brn $$0) {
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
   protected bur.b<cgr> dT() {
      return bur.a(cb, bZ);
   }

   @Override
   protected bur<?> a(Dynamic<?> $$0) {
      return cgs.a(this.dT().a($$0));
   }

   @Override
   public bur<cgr> dS() {
      return (bur<cgr>)super.dS();
   }

   @Override
   protected void Y() {
      super.Y();
      agt.a(this);
   }

   @Override
   public void a(evr $$0) {
      if (this.da() && this.be()) {
         this.a(this.fn(), $$0);
         this.a(btu.a, this.ds());
         this.h(this.ds().a(0.9));
      } else {
         super.a($$0);
      }
   }

   @Override
   protected void a(cmx $$0, bqt $$1, cup $$2) {
      if ($$2.a(cus.qI)) {
         $$0.a($$1, new cup(cus.qz));
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
   public btp p() {
      return this.N();
   }

   public static boolean a(bta<? extends btp> $$0, dcn $$1, btt $$2, iz $$3, azh $$4) {
      return $$1.a_($$3.d()).a(awp.bY);
   }

   public static class a extends bso.a {
      public final cgr.d[] a;

      public a(cgr.d... $$0) {
         super(false);
         this.a = $$0;
      }

      public cgr.d a(azh $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class b extends bzr {
      public b(final cgr $$0, final int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!cgr.this.gw()) {
            super.a();
         }
      }
   }

   static class c extends bzs {
      private final cgr l;

      public c(cgr $$0) {
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

      private static final IntFunction<cgr.d> g = axp.a(cgr.d::a, values(), axp.a.a);
      public static final Codec<cgr.d> f = azu.a(cgr.d::values);
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

      public static cgr.d a(int $$0) {
         return g.apply($$0);
      }

      public static cgr.d a(azh $$0) {
         return a($$0, true);
      }

      public static cgr.d b(azh $$0) {
         return a($$0, false);
      }

      private static cgr.d a(azh $$0, boolean $$1) {
         cgr.d[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.j == $$1).toArray(cgr.d[]::new);
         return ac.a($$2, $$0);
      }
   }
}
