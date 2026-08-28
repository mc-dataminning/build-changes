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

public class cgp extends cfd implements btl, bun<cgp.d>, cff {
   public static final int bY = 200;
   protected static final ImmutableList<? extends cdy<? extends cdx<? super cgp>>> bZ = ImmutableList.of(cdy.c, cdy.o, cdy.f, cdy.p, cdy.q);
   protected static final ImmutableList<? extends ccr<?>> cb = ImmutableList.of(
      ccr.r, ccr.g, ccr.h, ccr.k, ccr.l, ccr.n, ccr.m, ccr.E, ccr.t, ccr.o, ccr.p, ccr.K, new ccr[]{ccr.y, ccr.N, ccr.B, ccr.O, ccr.P, ccr.R, ccr.U, ccr.Z}
   );
   private static final akj<Integer> cf = akn.a(cgp.class, akl.b);
   private static final akj<Boolean> cg = akn.a(cgp.class, akl.k);
   private static final akj<Boolean> ch = akn.a(cgp.class, akl.k);
   public static final double cc = 20.0;
   public static final int cd = 1200;
   private static final int ci = 6000;
   public static final String ce = "Variant";
   private static final int cj = 1800;
   private static final int ck = 2400;
   private final Map<String, Vector3f> cl = Maps.newHashMap();
   private static final int cm = 100;

   public cgp(bsy<? extends cgp> $$0, dbw $$1) {
      super($$0, $$1);
      this.a(eok.j, 0.0F);
      this.bP = new cgp.c(this);
      this.bO = new cgp.b(this, 20);
   }

   @Override
   public Map<String, Vector3f> a() {
      return this.cl;
   }

   @Override
   public float a(iz $$0, dbz $$1) {
      return 0.0F;
   }

   @Override
   protected void a(akn.a $$0) {
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
      this.a(cgp.d.a($$0.h("Variant")));
      this.w($$0.q("FromBucket"));
   }

   @Override
   public void Q() {
      if (!this.gw()) {
         super.Q();
      }
   }

   @Override
   public bug a(dcl $$0, bqq $$1, btr $$2, @Nullable bug $$3) {
      boolean $$4 = false;
      if ($$2 == btr.l) {
         return $$3;
      } else {
         azf $$5 = $$0.E_();
         if ($$3 instanceof cgp.a) {
            if (((cgp.a)$$3).a() >= 2) {
               $$4 = true;
            }
         } else {
            $$3 = new cgp.a(cgp.d.a($$5), cgp.d.a($$5));
         }

         this.a(((cgp.a)$$3).a($$5));
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

   public cgp.d gq() {
      return cgp.d.a(this.ao.a(cf));
   }

   public void a(cgp.d $$0) {
      this.ao.a(cf, $$0.a());
   }

   private static boolean a(azf $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(dbz $$0) {
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
   public bsm a(are $$0, bsm $$1) {
      cgp $$2 = bsy.f.a((dbw)$$0);
      if ($$2 != null) {
         cgp.d $$3;
         if (a(this.ah)) {
            $$3 = cgp.d.b(this.ah);
         } else {
            $$3 = this.ah.h() ? this.gq() : ((cgp)$$1).gq();
         }

         $$2.a($$3);
         $$2.fU();
      }

      return $$2;
   }

   @Override
   public boolean o(cun $$0) {
      return $$0.a(awx.ay);
   }

   @Override
   public boolean a(cmv $$0) {
      return true;
   }

   @Override
   protected void Z() {
      this.dP().ag().a("axolotlBrain");
      this.dS().a((are)this.dP(), this);
      this.dP().ag().c();
      this.dP().ag().a("axolotlActivityUpdate");
      cgq.a(this);
      this.dP().ag().c();
      if (!this.gg()) {
         Optional<Integer> $$0 = this.dS().c(ccr.N);
         this.x($$0.isPresent() && $$0.get() > 0);
      }
   }

   public static buu.a gx() {
      return btp.A().a(buv.q, 14.0).a(buv.r, 1.0).a(buv.c, 2.0).a(buv.v, 1.0);
   }

   @Override
   protected ccz b(dbw $$0) {
      return new ccw(this, $$0);
   }

   @Override
   public boolean C(bss $$0) {
      boolean $$1 = $$0.a(this.dQ().b((btn)this), (float)((int)this.g(buv.c)));
      if ($$1) {
         this.a(this, $$0);
         this.a(avz.aK, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public boolean a(brl $$0, float $$1) {
      float $$2 = this.eA();
      if (!this.dP().B
         && !this.gg()
         && this.dP().z.a(3) == 0
         && ((float)this.dP().z.a(3) < $$1 || $$2 / this.eR() < 0.5F)
         && $$1 < $$2
         && this.be()
         && ($$0.d() != null || $$0.c() != null)
         && !this.gw()) {
         this.bD.a(ccr.N, 200);
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
   public bqs b(cmv $$0, bqr $$1) {
      return cff.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void n(cun $$0) {
      cff.a(this, $$0);
      cxc.a(km.M, $$0, $$0x -> {
         $$0x.a("Variant", this.gq().a());
         $$0x.a("Age", this.g());
         bup<?> $$1 = this.dS();
         if ($$1.a(ccr.U)) {
            $$0x.a("HuntingCooldown", $$1.e(ccr.U));
         }
      });
   }

   @Override
   public void c(ur $$0) {
      cff.a(this, $$0);
      this.a(cgp.d.a($$0.h("Variant")));
      if ($$0.e("Age")) {
         this.c_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.dS().a(ccr.U, true, $$0.i("HuntingCooldown"));
      }
   }

   @Override
   public cun b() {
      return new cun(cuq.qJ);
   }

   @Override
   public avy y() {
      return avz.dj;
   }

   @Override
   public boolean et() {
      return !this.gw() && super.et();
   }

   public static void a(cgp $$0, btn $$1) {
      dbw $$2 = $$0.dP();
      if ($$1.eB()) {
         brl $$3 = $$1.eC();
         if ($$3 != null) {
            bss $$4 = $$3.d();
            if ($$4 != null && $$4.ak() == bsy.by) {
               cmv $$5 = (cmv)$$4;
               List<cmv> $$6 = $$2.a(cmv.class, $$0.cK().g(20.0));
               if ($$6.contains($$5)) {
                  $$0.f($$5);
               }
            }
         }
      }
   }

   public void f(cmv $$0) {
      bsa $$1 = $$0.c(bsc.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.d() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new bsa(bsc.j, $$3, 0), this);
      }

      $$0.e(bsc.d);
   }

   @Override
   public boolean W() {
      return super.W() || this.u();
   }

   @Override
   protected avy d(brl $$0) {
      return avz.aM;
   }

   @Nullable
   @Override
   protected avy o_() {
      return avz.aL;
   }

   @Nullable
   @Override
   protected avy v() {
      return this.be() ? avz.aO : avz.aN;
   }

   @Override
   protected avy aQ() {
      return avz.aP;
   }

   @Override
   protected avy aP() {
      return avz.aQ;
   }

   @Override
   protected bup.b<cgp> dT() {
      return bup.a(cb, bZ);
   }

   @Override
   protected bup<?> a(Dynamic<?> $$0) {
      return cgq.a(this.dT().a($$0));
   }

   @Override
   public bup<cgp> dS() {
      return (bup<cgp>)super.dS();
   }

   @Override
   protected void Y() {
      super.Y();
      ags.a(this);
   }

   @Override
   public void a(evp $$0) {
      if (this.da() && this.be()) {
         this.a(this.fn(), $$0);
         this.a(bts.a, this.ds());
         this.h(this.ds().a(0.9));
      } else {
         super.a($$0);
      }
   }

   @Override
   protected void a(cmv $$0, bqr $$1, cun $$2) {
      if ($$2.a(cuq.qI)) {
         $$0.a($$1, new cun(cuq.qz));
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
   public btn p() {
      return this.N();
   }

   public static boolean a(bsy<? extends btn> $$0, dcl $$1, btr $$2, iz $$3, azf $$4) {
      return $$1.a_($$3.d()).a(awo.bY);
   }

   public static class a extends bsm.a {
      public final cgp.d[] a;

      public a(cgp.d... $$0) {
         super(false);
         this.a = $$0;
      }

      public cgp.d a(azf $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class b extends bzp {
      public b(final cgp $$0, final int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!cgp.this.gw()) {
            super.a();
         }
      }
   }

   static class c extends bzq {
      private final cgp l;

      public c(cgp $$0) {
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

   public static enum d implements azs {
      a(0, "lucy", true),
      b(1, "wild", true),
      c(2, "gold", true),
      d(3, "cyan", true),
      e(4, "blue", false);

      private static final IntFunction<cgp.d> g = axo.a(cgp.d::a, values(), axo.a.a);
      public static final Codec<cgp.d> f = azs.a(cgp.d::values);
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

      public static cgp.d a(int $$0) {
         return g.apply($$0);
      }

      public static cgp.d a(azf $$0) {
         return a($$0, true);
      }

      public static cgp.d b(azf $$0) {
         return a($$0, false);
      }

      private static cgp.d a(azf $$0, boolean $$1) {
         cgp.d[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.j == $$1).toArray(cgp.d[]::new);
         return ac.a($$2, $$0);
      }
   }
}
