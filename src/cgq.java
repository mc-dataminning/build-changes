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

public class cgq extends cfe implements btm, buo<cgq.d>, cfg {
   public static final int bY = 200;
   protected static final ImmutableList<? extends cdz<? extends cdy<? super cgq>>> bZ = ImmutableList.of(cdz.c, cdz.o, cdz.f, cdz.p, cdz.q);
   protected static final ImmutableList<? extends ccs<?>> cb = ImmutableList.of(
      ccs.r, ccs.g, ccs.h, ccs.k, ccs.l, ccs.n, ccs.m, ccs.E, ccs.t, ccs.o, ccs.p, ccs.K, new ccs[]{ccs.y, ccs.N, ccs.B, ccs.O, ccs.P, ccs.R, ccs.U, ccs.Z}
   );
   private static final akj<Integer> cf = akn.a(cgq.class, akl.b);
   private static final akj<Boolean> cg = akn.a(cgq.class, akl.k);
   private static final akj<Boolean> ch = akn.a(cgq.class, akl.k);
   public static final double cc = 20.0;
   public static final int cd = 1200;
   private static final int ci = 6000;
   public static final String ce = "Variant";
   private static final int cj = 1800;
   private static final int ck = 2400;
   private final Map<String, Vector3f> cl = Maps.newHashMap();
   private static final int cm = 100;

   public cgq(bsz<? extends cgq> $$0, dbx $$1) {
      super($$0, $$1);
      this.a(eol.j, 0.0F);
      this.bP = new cgq.c(this);
      this.bO = new cgq.b(this, 20);
   }

   @Override
   public Map<String, Vector3f> a() {
      return this.cl;
   }

   @Override
   public float a(iz $$0, dca $$1) {
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
      this.a(cgq.d.a($$0.h("Variant")));
      this.w($$0.q("FromBucket"));
   }

   @Override
   public void Q() {
      if (!this.gw()) {
         super.Q();
      }
   }

   @Override
   public buh a(dcm $$0, bqr $$1, bts $$2, @Nullable buh $$3) {
      boolean $$4 = false;
      if ($$2 == bts.l) {
         return $$3;
      } else {
         azg $$5 = $$0.E_();
         if ($$3 instanceof cgq.a) {
            if (((cgq.a)$$3).a() >= 2) {
               $$4 = true;
            }
         } else {
            $$3 = new cgq.a(cgq.d.a($$5), cgq.d.a($$5));
         }

         this.a(((cgq.a)$$3).a($$5));
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

   public cgq.d gq() {
      return cgq.d.a(this.ao.a(cf));
   }

   public void a(cgq.d $$0) {
      this.ao.a(cf, $$0.a());
   }

   private static boolean a(azg $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(dca $$0) {
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
   public bsn a(are $$0, bsn $$1) {
      cgq $$2 = bsz.f.a((dbx)$$0);
      if ($$2 != null) {
         cgq.d $$3;
         if (a(this.ah)) {
            $$3 = cgq.d.b(this.ah);
         } else {
            $$3 = this.ah.h() ? this.gq() : ((cgq)$$1).gq();
         }

         $$2.a($$3);
         $$2.fU();
      }

      return $$2;
   }

   @Override
   public boolean o(cuo $$0) {
      return $$0.a(awx.ay);
   }

   @Override
   public boolean a(cmw $$0) {
      return true;
   }

   @Override
   protected void Z() {
      this.dP().ag().a("axolotlBrain");
      this.dS().a((are)this.dP(), this);
      this.dP().ag().c();
      this.dP().ag().a("axolotlActivityUpdate");
      cgr.a(this);
      this.dP().ag().c();
      if (!this.gg()) {
         Optional<Integer> $$0 = this.dS().c(ccs.N);
         this.x($$0.isPresent() && $$0.get() > 0);
      }
   }

   public static buv.a gx() {
      return btq.A().a(buw.q, 14.0).a(buw.r, 1.0).a(buw.c, 2.0).a(buw.v, 1.0);
   }

   @Override
   protected cda b(dbx $$0) {
      return new ccx(this, $$0);
   }

   @Override
   public boolean C(bst $$0) {
      boolean $$1 = $$0.a(this.dQ().b((bto)this), (float)((int)this.g(buw.c)));
      if ($$1) {
         this.a(this, $$0);
         this.a(avz.aK, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public boolean a(brm $$0, float $$1) {
      float $$2 = this.eA();
      if (!this.dP().B
         && !this.gg()
         && this.dP().z.a(3) == 0
         && ((float)this.dP().z.a(3) < $$1 || $$2 / this.eR() < 0.5F)
         && $$1 < $$2
         && this.be()
         && ($$0.d() != null || $$0.c() != null)
         && !this.gw()) {
         this.bD.a(ccs.N, 200);
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
   public bqt b(cmw $$0, bqs $$1) {
      return cfg.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void n(cuo $$0) {
      cfg.a(this, $$0);
      cxd.a(km.N, $$0, $$0x -> {
         $$0x.a("Variant", this.gq().a());
         $$0x.a("Age", this.g());
         buq<?> $$1 = this.dS();
         if ($$1.a(ccs.U)) {
            $$0x.a("HuntingCooldown", $$1.e(ccs.U));
         }
      });
   }

   @Override
   public void c(ur $$0) {
      cfg.a(this, $$0);
      this.a(cgq.d.a($$0.h("Variant")));
      if ($$0.e("Age")) {
         this.c_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.dS().a(ccs.U, true, $$0.i("HuntingCooldown"));
      }
   }

   @Override
   public cuo b() {
      return new cuo(cur.qJ);
   }

   @Override
   public avy y() {
      return avz.dj;
   }

   @Override
   public boolean et() {
      return !this.gw() && super.et();
   }

   public static void a(cgq $$0, bto $$1) {
      dbx $$2 = $$0.dP();
      if ($$1.eB()) {
         brm $$3 = $$1.eC();
         if ($$3 != null) {
            bst $$4 = $$3.d();
            if ($$4 != null && $$4.ak() == bsz.by) {
               cmw $$5 = (cmw)$$4;
               List<cmw> $$6 = $$2.a(cmw.class, $$0.cK().g(20.0));
               if ($$6.contains($$5)) {
                  $$0.f($$5);
               }
            }
         }
      }
   }

   public void f(cmw $$0) {
      bsb $$1 = $$0.c(bsd.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.d() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new bsb(bsd.j, $$3, 0), this);
      }

      $$0.e(bsd.d);
   }

   @Override
   public boolean W() {
      return super.W() || this.u();
   }

   @Override
   protected avy d(brm $$0) {
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
   protected buq.b<cgq> dT() {
      return buq.a(cb, bZ);
   }

   @Override
   protected buq<?> a(Dynamic<?> $$0) {
      return cgr.a(this.dT().a($$0));
   }

   @Override
   public buq<cgq> dS() {
      return (buq<cgq>)super.dS();
   }

   @Override
   protected void Y() {
      super.Y();
      ags.a(this);
   }

   @Override
   public void a(evq $$0) {
      if (this.da() && this.be()) {
         this.a(this.fn(), $$0);
         this.a(btt.a, this.ds());
         this.h(this.ds().a(0.9));
      } else {
         super.a($$0);
      }
   }

   @Override
   protected void a(cmw $$0, bqs $$1, cuo $$2) {
      if ($$2.a(cur.qI)) {
         $$0.a($$1, new cuo(cur.qz));
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
   public bto p() {
      return this.N();
   }

   public static boolean a(bsz<? extends bto> $$0, dcm $$1, bts $$2, iz $$3, azg $$4) {
      return $$1.a_($$3.d()).a(awo.bY);
   }

   public static class a extends bsn.a {
      public final cgq.d[] a;

      public a(cgq.d... $$0) {
         super(false);
         this.a = $$0;
      }

      public cgq.d a(azg $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class b extends bzq {
      public b(final cgq $$0, final int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!cgq.this.gw()) {
            super.a();
         }
      }
   }

   static class c extends bzr {
      private final cgq l;

      public c(cgq $$0) {
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

   public static enum d implements azt {
      a(0, "lucy", true),
      b(1, "wild", true),
      c(2, "gold", true),
      d(3, "cyan", true),
      e(4, "blue", false);

      private static final IntFunction<cgq.d> g = axo.a(cgq.d::a, values(), axo.a.a);
      public static final Codec<cgq.d> f = azt.a(cgq.d::values);
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

      public static cgq.d a(int $$0) {
         return g.apply($$0);
      }

      public static cgq.d a(azg $$0) {
         return a($$0, true);
      }

      public static cgq.d b(azg $$0) {
         return a($$0, false);
      }

      private static cgq.d a(azg $$0, boolean $$1) {
         cgq.d[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.j == $$1).toArray(cgq.d[]::new);
         return ac.a($$2, $$0);
      }
   }
}
