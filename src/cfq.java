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

public class cfq extends cee implements bsm, bto<cfq.d>, ceg {
   public static final int bY = 200;
   protected static final ImmutableList<? extends ccz<? extends ccy<? super cfq>>> bZ = ImmutableList.of(ccz.c, ccz.o, ccz.f, ccz.p, ccz.q);
   protected static final ImmutableList<? extends cbs<?>> cb = ImmutableList.of(
      cbs.r, cbs.g, cbs.h, cbs.k, cbs.l, cbs.n, cbs.m, cbs.E, cbs.t, cbs.o, cbs.p, cbs.K, new cbs[]{cbs.y, cbs.N, cbs.B, cbs.O, cbs.P, cbs.R, cbs.U, cbs.Z}
   );
   private static final ajr<Integer> cf = ajv.a(cfq.class, ajt.b);
   private static final ajr<Boolean> cg = ajv.a(cfq.class, ajt.k);
   private static final ajr<Boolean> ch = ajv.a(cfq.class, ajt.k);
   public static final double cc = 20.0;
   public static final int cd = 1200;
   private static final int ci = 6000;
   public static final String ce = "Variant";
   private static final int cj = 1800;
   private static final int ck = 2400;
   private final Map<String, Vector3f> cl = Maps.newHashMap();
   private static final int cm = 100;

   public cfq(bsa<? extends cfq> $$0, dax $$1) {
      super($$0, $$1);
      this.a(enl.j, 0.0F);
      this.bP = new cfq.c(this);
      this.bO = new cfq.b(this, 20);
   }

   @Override
   public Map<String, Vector3f> a() {
      return this.cl;
   }

   @Override
   public float a(io $$0, dba $$1) {
      return 0.0F;
   }

   @Override
   protected void a(ajv.a $$0) {
      super.a($$0);
      $$0.a(cf, 0);
      $$0.a(cg, false);
      $$0.a(ch, false);
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("Variant", this.gp().a());
      $$0.a("FromBucket", this.u());
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      this.a(cfq.d.a($$0.h("Variant")));
      this.w($$0.q("FromBucket"));
   }

   @Override
   public void P() {
      if (!this.gv()) {
         super.P();
      }
   }

   @Override
   public bth a(dbm $$0, bps $$1, bss $$2, @Nullable bth $$3) {
      boolean $$4 = false;
      if ($$2 == bss.l) {
         return $$3;
      } else {
         ayk $$5 = $$0.E_();
         if ($$3 instanceof cfq.a) {
            if (((cfq.a)$$3).a() >= 2) {
               $$4 = true;
            }
         } else {
            $$3 = new cfq.a(cfq.d.a($$5), cfq.d.a($$5));
         }

         this.a(((cfq.a)$$3).a($$5));
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
      if (!this.gf()) {
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

   public cfq.d gp() {
      return cfq.d.a(this.ao.a(cf));
   }

   public void a(cfq.d $$0) {
      this.ao.a(cf, $$0.a());
   }

   private static boolean a(ayk $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(dba $$0) {
      return $$0.f(this);
   }

   @Override
   public boolean cC() {
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
   public bro a(aqm $$0, bro $$1) {
      cfq $$2 = bsa.f.a((dax)$$0);
      if ($$2 != null) {
         cfq.d $$3;
         if (a(this.ah)) {
            $$3 = cfq.d.b(this.ah);
         } else {
            $$3 = this.ah.h() ? this.gp() : ((cfq)$$1).gp();
         }

         $$2.a($$3);
         $$2.fT();
      }

      return $$2;
   }

   @Override
   public boolean o(cto $$0) {
      return $$0.a(awe.ay);
   }

   @Override
   public boolean a(clw $$0) {
      return true;
   }

   @Override
   protected void Y() {
      this.dP().af().a("axolotlBrain");
      this.dS().a((aqm)this.dP(), this);
      this.dP().af().c();
      this.dP().af().a("axolotlActivityUpdate");
      cfr.a(this);
      this.dP().af().c();
      if (!this.gf()) {
         Optional<Integer> $$0 = this.dS().c(cbs.N);
         this.x($$0.isPresent() && $$0.get() > 0);
      }
   }

   public static btv.a gw() {
      return bsq.A().a(btw.q, 14.0).a(btw.r, 1.0).a(btw.c, 2.0).a(btw.v, 1.0);
   }

   @Override
   protected cca b(dax $$0) {
      return new cbx(this, $$0);
   }

   @Override
   public boolean C(bru $$0) {
      boolean $$1 = $$0.a(this.dQ().b((bso)this), (float)((int)this.g(btw.c)));
      if ($$1) {
         this.a(this, $$0);
         this.a(avh.aK, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public boolean a(bqn $$0, float $$1) {
      float $$2 = this.eA();
      if (!this.dP().B
         && !this.gf()
         && this.dP().z.a(3) == 0
         && ((float)this.dP().z.a(3) < $$1 || $$2 / this.eR() < 0.5F)
         && $$1 < $$2
         && this.be()
         && ($$0.d() != null || $$0.c() != null)
         && !this.gv()) {
         this.bE.a(cbs.N, 200);
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
   public bpu b(clw $$0, bpt $$1) {
      return ceg.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void n(cto $$0) {
      ceg.a(this, $$0);
      cwd.a(kb.M, $$0, $$0x -> {
         $$0x.a("Variant", this.gp().a());
         $$0x.a("Age", this.g());
         btq<?> $$1 = this.dS();
         if ($$1.a(cbs.U)) {
            $$0x.a("HuntingCooldown", $$1.e(cbs.U));
         }
      });
   }

   @Override
   public void c(ud $$0) {
      ceg.a(this, $$0);
      this.a(cfq.d.a($$0.h("Variant")));
      if ($$0.e("Age")) {
         this.c_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.dS().a(cbs.U, true, $$0.i("HuntingCooldown"));
      }
   }

   @Override
   public cto b() {
      return new cto(ctr.qJ);
   }

   @Override
   public avg y() {
      return avh.dj;
   }

   @Override
   public boolean et() {
      return !this.gv() && super.et();
   }

   public static void a(cfq $$0, bso $$1) {
      dax $$2 = $$0.dP();
      if ($$1.eB()) {
         bqn $$3 = $$1.eC();
         if ($$3 != null) {
            bru $$4 = $$3.d();
            if ($$4 != null && $$4.ak() == bsa.by) {
               clw $$5 = (clw)$$4;
               List<clw> $$6 = $$2.a(clw.class, $$0.cK().g(20.0));
               if ($$6.contains($$5)) {
                  $$0.f($$5);
               }
            }
         }
      }
   }

   public void f(clw $$0) {
      brc $$1 = $$0.c(bre.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.d() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new brc(bre.j, $$3, 0), this);
      }

      $$0.e(bre.d);
   }

   @Override
   public boolean V() {
      return super.V() || this.u();
   }

   @Override
   protected avg d(bqn $$0) {
      return avh.aM;
   }

   @Nullable
   @Override
   protected avg o_() {
      return avh.aL;
   }

   @Nullable
   @Override
   protected avg v() {
      return this.be() ? avh.aO : avh.aN;
   }

   @Override
   protected avg aQ() {
      return avh.aP;
   }

   @Override
   protected avg aP() {
      return avh.aQ;
   }

   @Override
   protected btq.b<cfq> dT() {
      return btq.a(cb, bZ);
   }

   @Override
   protected btq<?> a(Dynamic<?> $$0) {
      return cfr.a(this.dT().a($$0));
   }

   @Override
   public btq<cfq> dS() {
      return (btq<cfq>)super.dS();
   }

   @Override
   protected void X() {
      super.X();
      aga.a(this);
   }

   @Override
   public void a(euk $$0) {
      if (this.da() && this.be()) {
         this.a(this.fn(), $$0);
         this.a(bst.a, this.ds());
         this.g(this.ds().a(0.9));
      } else {
         super.a($$0);
      }
   }

   @Override
   protected void a(clw $$0, bpt $$1, cto $$2) {
      if ($$2.a(ctr.qI)) {
         $$0.a($$1, new cto(ctr.qz));
      } else {
         super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.u() && !this.ag();
   }

   public static boolean a(bsa<? extends bso> $$0, dbm $$1, bss $$2, io $$3, ayk $$4) {
      return $$1.a_($$3.d()).a(avw.bY);
   }

   public static class a extends bro.a {
      public final cfq.d[] a;

      public a(cfq.d... $$0) {
         super(false);
         this.a = $$0;
      }

      public cfq.d a(ayk $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class b extends byq {
      public b(cfq $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!cfq.this.gv()) {
            super.a();
         }
      }
   }

   static class c extends byr {
      private final cfq l;

      public c(cfq $$0) {
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

   public static enum d implements ayx {
      a(0, "lucy", true),
      b(1, "wild", true),
      c(2, "gold", true),
      d(3, "cyan", true),
      e(4, "blue", false);

      private static final IntFunction<cfq.d> g = awv.a(cfq.d::a, values(), awv.a.a);
      public static final Codec<cfq.d> f = ayx.a(cfq.d::values);
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

      public static cfq.d a(int $$0) {
         return g.apply($$0);
      }

      public static cfq.d a(ayk $$0) {
         return a($$0, true);
      }

      public static cfq.d b(ayk $$0) {
         return a($$0, false);
      }

      private static cfq.d a(ayk $$0, boolean $$1) {
         cfq.d[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.j == $$1).toArray(cfq.d[]::new);
         return ac.a($$2, $$0);
      }
   }
}
