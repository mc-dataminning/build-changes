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

public class bvt extends bum implements biz, bjz<bvt.d>, buo {
   public static final int bT = 200;
   protected static final ImmutableList<? extends bth<? extends btg<? super bvt>>> bU = ImmutableList.of(bth.c, bth.n, bth.f, bth.o, bth.p);
   protected static final ImmutableList<? extends bsc<?>> bW = ImmutableList.of(
      bsc.r, bsc.g, bsc.h, bsc.k, bsc.l, bsc.n, bsc.m, bsc.E, bsc.t, bsc.o, bsc.p, bsc.J, new bsc[]{bsc.y, bsc.M, bsc.B, bsc.N, bsc.O, bsc.Q, bsc.T, bsc.Y}
   );
   private static final aec<Integer> ca = aef.a(bvt.class, aee.b);
   private static final aec<Boolean> cb = aef.a(bvt.class, aee.k);
   private static final aec<Boolean> cc = aef.a(bvt.class, aee.k);
   public static final double bX = 20.0;
   public static final int bY = 1200;
   private static final int cd = 6000;
   public static final String bZ = "Variant";
   private static final int ce = 1800;
   private static final int cf = 2400;
   private final Map<String, Vector3f> cg = Maps.newHashMap();
   private static final int ch = 100;

   public bvt(bip<? extends bvt> $$0, cpq $$1) {
      super($$0, $$1);
      this.a(eas.j, 0.0F);
      this.bL = new bvt.c(this);
      this.bK = new bvt.b(this, 20);
      this.t(1.0F);
   }

   @Override
   public Map<String, Vector3f> a() {
      return this.cg;
   }

   @Override
   public float a(gw $$0, cpt $$1) {
      return 0.0F;
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(ca, 0);
      this.an.a(cb, false);
      this.an.a(cc, false);
   }

   @Override
   public void b(qu $$0) {
      super.b($$0);
      $$0.a("Variant", this.ga().a());
      $$0.a("FromBucket", this.q());
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      this.a(bvt.d.a($$0.h("Variant")));
      this.w($$0.q("FromBucket"));
   }

   @Override
   public void M() {
      if (!this.gg()) {
         super.M();
      }
   }

   @Override
   public bju a(cqf $$0, bgr $$1, bjf $$2, @Nullable bju $$3, @Nullable qu $$4) {
      boolean $$5 = false;
      if ($$2 == bjf.l) {
         return $$3;
      } else {
         arx $$6 = $$0.y_();
         if ($$3 instanceof bvt.a) {
            if (((bvt.a)$$3).a() >= 2) {
               $$5 = true;
            }
         } else {
            $$3 = new bvt.a(bvt.d.a($$6), bvt.d.a($$6));
         }

         this.a(((bvt.a)$$3).a($$6));
         if ($$5) {
            this.c_(-24000);
         }

         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void aq() {
      int $$0 = this.ch();
      super.aq();
      if (!this.fQ()) {
         this.t($$0);
      }
   }

   protected void t(int $$0) {
      if (this.bv() && !this.aZ()) {
         this.j($$0 - 1);
         if (this.ch() == -20) {
            this.j(0);
            this.a(this.dL().r(), 2.0F);
         }
      } else {
         this.j(this.cg());
      }
   }

   @Override
   public void p() {
      int $$0 = this.ch() + 1800;
      this.j(Math.min($$0, this.cg()));
   }

   @Override
   public int cg() {
      return 6000;
   }

   public bvt.d ga() {
      return bvt.d.a(this.an.b(ca));
   }

   public void a(bvt.d $$0) {
      this.an.b(ca, $$0.a());
   }

   private static boolean a(arx $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(cpt $$0) {
      return $$0.f(this);
   }

   @Override
   public boolean dP() {
      return true;
   }

   @Override
   public boolean cy() {
      return false;
   }

   @Override
   public bjg eQ() {
      return bjg.e;
   }

   public void x(boolean $$0) {
      this.an.b(cb, $$0);
   }

   public boolean gg() {
      return this.an.b(cb);
   }

   @Override
   public boolean q() {
      return this.an.b(cc);
   }

   @Override
   public void w(boolean $$0) {
      this.an.b(cc, $$0);
   }

   @Nullable
   @Override
   public big a(akn $$0, big $$1) {
      bvt $$2 = bip.f.a((cpq)$$0);
      if ($$2 != null) {
         bvt.d $$3;
         if (a(this.ag)) {
            $$3 = bvt.d.b(this.ag);
         } else {
            $$3 = this.ag.h() ? this.ga() : ((bvt)$$1).ga();
         }

         $$2.a($$3);
         $$2.fF();
      }

      return $$2;
   }

   @Override
   public boolean m(cja $$0) {
      return $$0.a(apw.aA);
   }

   @Override
   public boolean a(cbp $$0) {
      return true;
   }

   @Override
   protected void V() {
      this.dK().ad().a("axolotlBrain");
      this.dM().a((akn)this.dK(), this);
      this.dK().ad().c();
      this.dK().ad().a("axolotlActivityUpdate");
      bvu.a(this);
      this.dK().ad().c();
      if (!this.fQ()) {
         Optional<Integer> $$0 = this.dM().c(bsc.M);
         this.x($$0.isPresent() && $$0.get() > 0);
      }
   }

   public static bkg.a gh() {
      return bjd.x().a(bkh.a, 14.0).a(bkh.d, 1.0).a(bkh.f, 2.0);
   }

   @Override
   protected bsk b(cpq $$0) {
      return new bsh(this, $$0);
   }

   @Override
   public boolean C(bil $$0) {
      boolean $$1 = $$0.a(this.dL().b((bjb)this), (float)((int)this.b(bkh.f)));
      if ($$1) {
         this.a(this, $$0);
         this.a(aoz.av, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public boolean a(bhj $$0, float $$1) {
      float $$2 = this.et();
      if (!this.dK().B
         && !this.fQ()
         && this.dK().z.a(3) == 0
         && ((float)this.dK().z.a(3) < $$1 || $$2 / this.eK() < 0.5F)
         && $$1 < $$2
         && this.aX()
         && ($$0.d() != null || $$0.c() != null)
         && !this.gg()) {
         this.bz.a(bsc.M, 200);
      }

      return super.a($$0, $$1);
   }

   @Override
   protected float b(bjn $$0, bim $$1) {
      return $$1.b * 0.655F;
   }

   @Override
   public int W() {
      return 1;
   }

   @Override
   public int X() {
      return 1;
   }

   @Override
   public bgt b(cbp $$0, bgs $$1) {
      return buo.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void l(cja $$0) {
      buo.a(this, $$0);
      qu $$1 = $$0.w();
      $$1.a("Variant", this.ga().a());
      $$1.a("Age", this.h());
      bkb<?> $$2 = this.dM();
      if ($$2.a(bsc.T)) {
         $$1.a("HuntingCooldown", $$2.e(bsc.T));
      }
   }

   @Override
   public void c(qu $$0) {
      buo.a(this, $$0);
      this.a(bvt.d.a($$0.h("Variant")));
      if ($$0.e("Age")) {
         this.c_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.dM().a(bsc.T, true, $$0.i("HuntingCooldown"));
      }
   }

   @Override
   public cja b() {
      return new cja(cjd.pV);
   }

   @Override
   public aoy t() {
      return aoz.cC;
   }

   @Override
   public boolean em() {
      return !this.gg() && super.em();
   }

   public static void a(bvt $$0, bjb $$1) {
      cpq $$2 = $$0.dK();
      if ($$1.eu()) {
         bhj $$3 = $$1.ev();
         if ($$3 != null) {
            bil $$4 = $$3.d();
            if ($$4 != null && $$4.ag() == bip.bt) {
               cbp $$5 = (cbp)$$4;
               List<cbp> $$6 = $$2.a(cbp.class, $$0.cG().g(20.0));
               if ($$6.contains($$5)) {
                  $$0.f($$5);
               }
            }
         }
      }
   }

   public void f(cbp $$0) {
      bhy $$1 = $$0.b(bia.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.d() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new bhy(bia.j, $$3, 0), this);
      }

      $$0.d(bia.d);
   }

   @Override
   public boolean R() {
      return super.R() || this.q();
   }

   @Override
   protected aoy d(bhj $$0) {
      return aoz.ax;
   }

   @Nullable
   @Override
   protected aoy h_() {
      return aoz.aw;
   }

   @Nullable
   @Override
   protected aoy r() {
      return this.aX() ? aoz.az : aoz.ay;
   }

   @Override
   protected aoy aM() {
      return aoz.aA;
   }

   @Override
   protected aoy aL() {
      return aoz.aB;
   }

   @Override
   protected bkb.b<bvt> dN() {
      return bkb.a(bW, bU);
   }

   @Override
   protected bkb<?> a(Dynamic<?> $$0) {
      return bvu.a(this.dN().a($$0));
   }

   @Override
   public bkb<bvt> dM() {
      return (bkb<bvt>)super.dM();
   }

   @Override
   protected void T() {
      super.T();
      aay.a(this);
   }

   @Override
   public void h(ehi $$0) {
      if (this.cW() && this.aX()) {
         this.a(this.fd(), $$0);
         this.a(bjh.a, this.dn());
         this.f(this.dn().a(0.9));
      } else {
         super.h($$0);
      }
   }

   @Override
   protected void a(cbp $$0, bgs $$1, cja $$2) {
      if ($$2.a(cjd.pU)) {
         $$0.a($$1, new cja(cjd.pL));
      } else {
         super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.q() && !this.ac();
   }

   public static boolean a(bip<? extends bjb> $$0, cqf $$1, bjf $$2, gw $$3, arx $$4) {
      return $$1.a_($$3.d()).a(apo.bQ);
   }

   public static class a extends big.a {
      public final bvt.d[] a;

      public a(bvt.d... $$0) {
         super(false);
         this.a = $$0;
      }

      public bvt.d a(arx $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class b extends bpa {
      public b(bvt $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!bvt.this.gg()) {
            super.a();
         }
      }
   }

   static class c extends bpb {
      private final bvt l;

      public c(bvt $$0) {
         super($$0, 85, 10, 0.1F, 0.5F, false);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (!this.l.gg()) {
            super.a();
         }
      }
   }

   public static enum d implements ask {
      a(0, "lucy", true),
      b(1, "wild", true),
      c(2, "gold", true),
      d(3, "cyan", true),
      e(4, "blue", false);

      private static final IntFunction<bvt.d> g = aqn.a(bvt.d::a, values(), aqn.a.a);
      public static final Codec<bvt.d> f = ask.a(bvt.d::values);
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

      public static bvt.d a(int $$0) {
         return g.apply($$0);
      }

      public static bvt.d a(arx $$0) {
         return a($$0, true);
      }

      public static bvt.d b(arx $$0) {
         return a($$0, false);
      }

      private static bvt.d a(arx $$0, boolean $$1) {
         bvt.d[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.j == $$1).toArray(bvt.d[]::new);
         return ac.a($$2, $$0);
      }
   }
}
