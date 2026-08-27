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

public class cfq extends cee implements bsm, btn<cfq.d>, ceg {
   public static final int ch = 200;
   protected static final ImmutableList<? extends ccy<? extends ccx<? super cfq>>> ci = ImmutableList.of(ccy.c, ccy.o, ccy.f, ccy.p, ccy.q);
   protected static final ImmutableList<? extends cbr<?>> ck = ImmutableList.of(
      cbr.r, cbr.g, cbr.h, cbr.k, cbr.l, cbr.n, cbr.m, cbr.E, cbr.t, cbr.o, cbr.p, cbr.K, new cbr[]{cbr.y, cbr.N, cbr.B, cbr.O, cbr.P, cbr.R, cbr.U, cbr.Z}
   );
   private static final ajy<Integer> co = akc.a(cfq.class, aka.b);
   private static final ajy<Boolean> cp = akc.a(cfq.class, aka.k);
   private static final ajy<Boolean> cq = akc.a(cfq.class, aka.k);
   public static final double cl = 20.0;
   public static final int cm = 1200;
   private static final int cr = 6000;
   public static final String cn = "Variant";
   private static final int cs = 1800;
   private static final int ct = 2400;
   private final Map<String, Vector3f> cu = Maps.newHashMap();
   private static final int cv = 100;

   public cfq(bsb<? extends cfq> $$0, dca $$1) {
      super($$0, $$1);
      this.a(epv.j, 0.0F);
      this.bY = new cfq.c(this);
      this.bX = new cfq.b(this, 20);
   }

   @Override
   public Map<String, Vector3f> a() {
      return this.cu;
   }

   @Override
   public float a(ir $$0, dcd $$1) {
      return 0.0F;
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(co, 0);
      $$0.a(cp, false);
      $$0.a(cq, false);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("Variant", this.gy().a());
      $$0.a("FromBucket", this.t());
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.a(cfq.d.a($$0.h("Variant")));
      this.w($$0.q("FromBucket"));
   }

   @Override
   public void P() {
      if (!this.gE()) {
         super.P();
      }
   }

   @Override
   public btg a(dcp $$0, bpy $$1, bss $$2, @Nullable btg $$3) {
      boolean $$4 = false;
      if ($$2 == bss.l) {
         return $$3;
      } else {
         ayt $$5 = $$0.F_();
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
      int $$0 = this.cq();
      super.au();
      if (!this.go()) {
         this.v($$0);
      }
   }

   protected void v(int $$0) {
      if (this.bI() && !this.bk()) {
         this.k($$0 - 1);
         if (this.cq() == -20) {
            this.k(0);
            this.a(this.dX().t(), 2.0F);
         }
      } else {
         this.k(this.cp());
      }
   }

   @Override
   public void r() {
      int $$0 = this.cq() + 1800;
      this.k(Math.min($$0, this.cp()));
   }

   @Override
   public int cp() {
      return 6000;
   }

   public cfq.d gy() {
      return cfq.d.a(this.as.a(co));
   }

   public void a(cfq.d $$0) {
      this.as.a(co, $$0.a());
   }

   private static boolean a(ayt $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(dcd $$0) {
      return $$0.f(this);
   }

   @Override
   public boolean cH() {
      return false;
   }

   public void x(boolean $$0) {
      this.as.a(cp, $$0);
   }

   public boolean gE() {
      return this.as.a(cp);
   }

   @Override
   public boolean t() {
      return this.as.a(cq);
   }

   @Override
   public void w(boolean $$0) {
      this.as.a(cq, $$0);
   }

   @Nullable
   @Override
   public brp a(aqt $$0, brp $$1) {
      cfq $$2 = bsb.g.a((dca)$$0);
      if ($$2 != null) {
         cfq.d $$3;
         if (a(this.al)) {
            $$3 = cfq.d.b(this.al);
         } else {
            $$3 = this.al.h() ? this.gy() : ((cfq)$$1).gy();
         }

         $$2.a($$3);
         $$2.gc();
      }

      return $$2;
   }

   @Override
   public boolean o(cuh $$0) {
      return $$0.a(awm.ay);
   }

   @Override
   public boolean a(cly $$0) {
      return true;
   }

   @Override
   protected void Y() {
      this.dU().ag().a("axolotlBrain");
      this.dZ().a((aqt)this.dU(), this);
      this.dU().ag().c();
      this.dU().ag().a("axolotlActivityUpdate");
      cfr.a(this);
      this.dU().ag().c();
      if (!this.go()) {
         Optional<Integer> $$0 = this.dZ().c(cbr.N);
         this.x($$0.isPresent() && $$0.get() > 0);
      }
   }

   public static btu.a gF() {
      return bsq.A().a(btv.q, 14.0).a(btv.r, 1.0).a(btv.c, 2.0).a(btv.v, 1.0);
   }

   @Override
   protected cbz b(dca $$0) {
      return new cbw(this, $$0);
   }

   @Override
   public boolean C(brv $$0) {
      boolean $$1 = $$0.a(this.dX().b((bso)this), (float)((int)this.g(btv.c)));
      if ($$1) {
         this.a(this, $$0);
         this.a(avo.aP, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public boolean a(bqt $$0, float $$1) {
      float $$2 = this.eI();
      if (!this.dU().C
         && !this.go()
         && this.dU().A.a(3) == 0
         && ((float)this.dU().A.a(3) < $$1 || $$2 / this.eZ() < 0.5F)
         && $$1 < $$2
         && this.bi()
         && ($$0.d() != null || $$0.c() != null)
         && !this.gE()) {
         this.bO.a(cbr.N, 200);
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
   public bqa b(cly $$0, bpz $$1) {
      return ceg.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void n(cuh $$0) {
      ceg.a(this, $$0);
      cxf.a(ke.N, $$0, $$0x -> {
         $$0x.a("Variant", this.gy().a());
         $$0x.a("Age", this.g());
         btp<?> $$1 = this.dZ();
         if ($$1.a(cbr.U)) {
            $$0x.a("HuntingCooldown", $$1.e(cbr.U));
         }
      });
   }

   @Override
   public void c(uk $$0) {
      ceg.a(this, $$0);
      this.a(cfq.d.a($$0.h("Variant")));
      if ($$0.e("Age")) {
         this.c_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.dZ().a(cbr.U, true, $$0.i("HuntingCooldown"));
      }
   }

   @Override
   public cuh b() {
      return new cuh(cuk.sg);
   }

   @Override
   public avn x() {
      return avo.do;
   }

   @Override
   public boolean eB() {
      return !this.gE() && super.eB();
   }

   public static void a(cfq $$0, bso $$1) {
      dca $$2 = $$0.dU();
      if ($$1.eJ()) {
         bqt $$3 = $$1.eK();
         if ($$3 != null) {
            brv $$4 = $$3.d();
            if ($$4 != null && $$4.ak() == bsb.bE) {
               cly $$5 = (cly)$$4;
               List<cly> $$6 = $$2.a(cly.class, $$0.cP().g(20.0));
               if ($$6.contains($$5)) {
                  $$0.f($$5);
               }
            }
         }
      }
   }

   public void f(cly $$0) {
      brh $$1 = $$0.c(brj.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.d() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new brh(brj.j, $$3, 0), this);
      }

      $$0.e(brj.d);
   }

   @Override
   public boolean V() {
      return super.V() || this.t();
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.aR;
   }

   @Nullable
   @Override
   protected avn n_() {
      return avo.aQ;
   }

   @Nullable
   @Override
   protected avn u() {
      return this.bi() ? avo.aT : avo.aS;
   }

   @Override
   protected avn aU() {
      return avo.aU;
   }

   @Override
   protected avn aT() {
      return avo.aV;
   }

   @Override
   protected btp.b<cfq> ea() {
      return btp.a(ck, ci);
   }

   @Override
   protected btp<?> a(Dynamic<?> $$0) {
      return cfr.a(this.ea().a($$0));
   }

   @Override
   public btp<cfq> dZ() {
      return (btp<cfq>)super.dZ();
   }

   @Override
   protected void X() {
      super.X();
      agi.a(this);
   }

   @Override
   public void a(ewu $$0) {
      if (this.df() && this.bi()) {
         this.a(this.fw(), $$0);
         this.a(bst.a, this.dx());
         this.g(this.dx().a(0.9));
      } else {
         super.a($$0);
      }
   }

   @Override
   protected void a(cly $$0, bpz $$1, cuh $$2) {
      if ($$2.a(cuk.sf)) {
         $$0.a($$1, new cuh(cuk.rW));
      } else {
         super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.t() && !this.ag();
   }

   public static boolean a(bsb<? extends bso> $$0, dcp $$1, bss $$2, ir $$3, ayt $$4) {
      return $$1.a_($$3.d()).a(awe.cb);
   }

   public static class a extends brp.a {
      public final cfq.d[] a;

      public a(cfq.d... $$0) {
         super(false);
         this.a = $$0;
      }

      public cfq.d a(ayt $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class b extends byp {
      public b(cfq $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!cfq.this.gE()) {
            super.a();
         }
      }
   }

   static class c extends byq {
      private final cfq l;

      public c(cfq $$0) {
         super($$0, 85, 10, 0.1F, 0.5F, false);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (!this.l.gE()) {
            super.a();
         }
      }
   }

   public static enum d implements azg {
      a(0, "lucy", true),
      b(1, "wild", true),
      c(2, "gold", true),
      d(3, "cyan", true),
      e(4, "blue", false);

      private static final IntFunction<cfq.d> g = axd.a(cfq.d::a, values(), axd.a.a);
      public static final Codec<cfq.d> f = azg.a(cfq.d::values);
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

      public static cfq.d a(ayt $$0) {
         return a($$0, true);
      }

      public static cfq.d b(ayt $$0) {
         return a($$0, false);
      }

      private static cfq.d a(ayt $$0, boolean $$1) {
         cfq.d[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.j == $$1).toArray(cfq.d[]::new);
         return ad.a($$2, $$0);
      }
   }
}
