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

public class cgs extends cfg implements bto, buq<cgs.d>, cfi {
   public static final int bY = 200;
   protected static final ImmutableList<? extends ceb<? extends cea<? super cgs>>> bZ = ImmutableList.of(ceb.c, ceb.o, ceb.f, ceb.p, ceb.q);
   protected static final ImmutableList<? extends ccu<?>> cb = ImmutableList.of(
      ccu.r, ccu.g, ccu.h, ccu.k, ccu.l, ccu.n, ccu.m, ccu.E, ccu.t, ccu.o, ccu.p, ccu.K, new ccu[]{ccu.y, ccu.N, ccu.B, ccu.O, ccu.P, ccu.R, ccu.U, ccu.Z}
   );
   private static final akk<Integer> cf = ako.a(cgs.class, akm.b);
   private static final akk<Boolean> cg = ako.a(cgs.class, akm.k);
   private static final akk<Boolean> ch = ako.a(cgs.class, akm.k);
   public static final double cc = 20.0;
   public static final int cd = 1200;
   private static final int ci = 6000;
   public static final String ce = "Variant";
   private static final int cj = 1800;
   private static final int ck = 2400;
   private final Map<String, Vector3f> cl = Maps.newHashMap();
   private static final int cm = 100;

   public cgs(btb<? extends cgs> $$0, dbz $$1) {
      super($$0, $$1);
      this.a(eon.j, 0.0F);
      this.bP = new cgs.c(this);
      this.bO = new cgs.b(this, 20);
   }

   @Override
   public Map<String, Vector3f> a() {
      return this.cl;
   }

   @Override
   public float a(iz $$0, dcc $$1) {
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
      this.a(cgs.d.a($$0.h("Variant")));
      this.w($$0.q("FromBucket"));
   }

   @Override
   public void Q() {
      if (!this.gw()) {
         super.Q();
      }
   }

   @Override
   public buj a(dco $$0, bqt $$1, btu $$2, @Nullable buj $$3) {
      boolean $$4 = false;
      if ($$2 == btu.l) {
         return $$3;
      } else {
         azh $$5 = $$0.E_();
         if ($$3 instanceof cgs.a) {
            if (((cgs.a)$$3).a() >= 2) {
               $$4 = true;
            }
         } else {
            $$3 = new cgs.a(cgs.d.a($$5), cgs.d.a($$5));
         }

         this.a(((cgs.a)$$3).a($$5));
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

   public cgs.d gq() {
      return cgs.d.a(this.ao.a(cf));
   }

   public void a(cgs.d $$0) {
      this.ao.a(cf, $$0.a());
   }

   private static boolean a(azh $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(dcc $$0) {
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
   public bsp a(arf $$0, bsp $$1) {
      cgs $$2 = btb.f.a((dbz)$$0);
      if ($$2 != null) {
         cgs.d $$3;
         if (a(this.ah)) {
            $$3 = cgs.d.b(this.ah);
         } else {
            $$3 = this.ah.h() ? this.gq() : ((cgs)$$1).gq();
         }

         $$2.a($$3);
         $$2.fU();
      }

      return $$2;
   }

   @Override
   public boolean o(cuq $$0) {
      return $$0.a(awy.ay);
   }

   @Override
   public boolean a(cmy $$0) {
      return true;
   }

   @Override
   protected void Z() {
      this.dP().ag().a("axolotlBrain");
      this.dS().a((arf)this.dP(), this);
      this.dP().ag().c();
      this.dP().ag().a("axolotlActivityUpdate");
      cgt.a(this);
      this.dP().ag().c();
      if (!this.gg()) {
         Optional<Integer> $$0 = this.dS().c(ccu.N);
         this.x($$0.isPresent() && $$0.get() > 0);
      }
   }

   public static bux.a gx() {
      return bts.A().a(buy.q, 14.0).a(buy.r, 1.0).a(buy.c, 2.0).a(buy.v, 1.0);
   }

   @Override
   protected cdc b(dbz $$0) {
      return new ccz(this, $$0);
   }

   @Override
   public boolean C(bsv $$0) {
      boolean $$1 = $$0.a(this.dQ().b((btq)this), (float)((int)this.g(buy.c)));
      if ($$1) {
         this.a(this, $$0);
         this.a(awa.aK, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public boolean a(bro $$0, float $$1) {
      float $$2 = this.eA();
      if (!this.dP().B
         && !this.gg()
         && this.dP().z.a(3) == 0
         && ((float)this.dP().z.a(3) < $$1 || $$2 / this.eR() < 0.5F)
         && $$1 < $$2
         && this.be()
         && ($$0.d() != null || $$0.c() != null)
         && !this.gw()) {
         this.bD.a(ccu.N, 200);
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
   public bqv b(cmy $$0, bqu $$1) {
      return cfi.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void n(cuq $$0) {
      cfi.a(this, $$0);
      cxf.a(km.N, $$0, $$0x -> {
         $$0x.a("Variant", this.gq().a());
         $$0x.a("Age", this.g());
         bus<?> $$1 = this.dS();
         if ($$1.a(ccu.U)) {
            $$0x.a("HuntingCooldown", $$1.e(ccu.U));
         }
      });
   }

   @Override
   public void c(us $$0) {
      cfi.a(this, $$0);
      this.a(cgs.d.a($$0.h("Variant")));
      if ($$0.e("Age")) {
         this.c_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.dS().a(ccu.U, true, $$0.i("HuntingCooldown"));
      }
   }

   @Override
   public cuq b() {
      return new cuq(cut.qJ);
   }

   @Override
   public avz y() {
      return awa.dj;
   }

   @Override
   public boolean et() {
      return !this.gw() && super.et();
   }

   public static void a(cgs $$0, btq $$1) {
      dbz $$2 = $$0.dP();
      if ($$1.eB()) {
         bro $$3 = $$1.eC();
         if ($$3 != null) {
            bsv $$4 = $$3.d();
            if ($$4 != null && $$4.ak() == btb.by) {
               cmy $$5 = (cmy)$$4;
               List<cmy> $$6 = $$2.a(cmy.class, $$0.cK().g(20.0));
               if ($$6.contains($$5)) {
                  $$0.f($$5);
               }
            }
         }
      }
   }

   public void f(cmy $$0) {
      bsd $$1 = $$0.c(bsf.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.d() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new bsd(bsf.j, $$3, 0), this);
      }

      $$0.e(bsf.d);
   }

   @Override
   public boolean W() {
      return super.W() || this.u();
   }

   @Override
   protected avz d(bro $$0) {
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
   protected bus.b<cgs> dT() {
      return bus.a(cb, bZ);
   }

   @Override
   protected bus<?> a(Dynamic<?> $$0) {
      return cgt.a(this.dT().a($$0));
   }

   @Override
   public bus<cgs> dS() {
      return (bus<cgs>)super.dS();
   }

   @Override
   protected void Y() {
      super.Y();
      agt.a(this);
   }

   @Override
   public void a(evs $$0) {
      if (this.da() && this.be()) {
         this.a(this.fn(), $$0);
         this.a(btv.a, this.ds());
         this.h(this.ds().a(0.9));
      } else {
         super.a($$0);
      }
   }

   @Override
   protected void a(cmy $$0, bqu $$1, cuq $$2) {
      if ($$2.a(cut.qI)) {
         $$0.a($$1, new cuq(cut.qz));
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
   public btq p() {
      return this.N();
   }

   public static boolean a(btb<? extends btq> $$0, dco $$1, btu $$2, iz $$3, azh $$4) {
      return $$1.a_($$3.d()).a(awp.bY);
   }

   public static class a extends bsp.a {
      public final cgs.d[] a;

      public a(cgs.d... $$0) {
         super(false);
         this.a = $$0;
      }

      public cgs.d a(azh $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class b extends bzs {
      public b(final cgs $$0, final int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!cgs.this.gw()) {
            super.a();
         }
      }
   }

   static class c extends bzt {
      private final cgs l;

      public c(cgs $$0) {
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

      private static final IntFunction<cgs.d> g = axp.a(cgs.d::a, values(), axp.a.a);
      public static final Codec<cgs.d> f = azu.a(cgs.d::values);
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

      public static cgs.d a(int $$0) {
         return g.apply($$0);
      }

      public static cgs.d a(azh $$0) {
         return a($$0, true);
      }

      public static cgs.d b(azh $$0) {
         return a($$0, false);
      }

      private static cgs.d a(azh $$0, boolean $$1) {
         cgs.d[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.j == $$1).toArray(cgs.d[]::new);
         return ac.a($$2, $$0);
      }
   }
}
