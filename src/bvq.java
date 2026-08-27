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

public class bvq extends buj implements biw, bjw<bvq.d>, bul {
   public static final int bT = 200;
   protected static final ImmutableList<? extends bte<? extends btd<? super bvq>>> bU = ImmutableList.of(bte.c, bte.n, bte.f, bte.o, bte.p);
   protected static final ImmutableList<? extends brz<?>> bW = ImmutableList.of(
      brz.r, brz.g, brz.h, brz.k, brz.l, brz.n, brz.m, brz.E, brz.t, brz.o, brz.p, brz.J, new brz[]{brz.y, brz.M, brz.B, brz.N, brz.O, brz.Q, brz.T, brz.Y}
   );
   private static final adz<Integer> ca = aec.a(bvq.class, aeb.b);
   private static final adz<Boolean> cb = aec.a(bvq.class, aeb.k);
   private static final adz<Boolean> cc = aec.a(bvq.class, aeb.k);
   public static final double bX = 20.0;
   public static final int bY = 1200;
   private static final int cd = 6000;
   public static final String bZ = "Variant";
   private static final int ce = 1800;
   private static final int cf = 2400;
   private final Map<String, Vector3f> cg = Maps.newHashMap();
   private static final int ch = 100;

   public bvq(bim<? extends bvq> $$0, cpl $$1) {
      super($$0, $$1);
      this.a(ean.j, 0.0F);
      this.bL = new bvq.c(this);
      this.bK = new bvq.b(this, 20);
      this.t(1.0F);
   }

   @Override
   public Map<String, Vector3f> a() {
      return this.cg;
   }

   @Override
   public float a(gu $$0, cpo $$1) {
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
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("Variant", this.ga().a());
      $$0.a("FromBucket", this.q());
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.a(bvq.d.a($$0.h("Variant")));
      this.w($$0.q("FromBucket"));
   }

   @Override
   public void M() {
      if (!this.gg()) {
         super.M();
      }
   }

   @Override
   public bjr a(cqa $$0, bgo $$1, bjc $$2, @Nullable bjr $$3, @Nullable qr $$4) {
      boolean $$5 = false;
      if ($$2 == bjc.l) {
         return $$3;
      } else {
         aru $$6 = $$0.y_();
         if ($$3 instanceof bvq.a) {
            if (((bvq.a)$$3).a() >= 2) {
               $$5 = true;
            }
         } else {
            $$3 = new bvq.a(bvq.d.a($$6), bvq.d.a($$6));
         }

         this.a(((bvq.a)$$3).a($$6));
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

   public bvq.d ga() {
      return bvq.d.a(this.an.b(ca));
   }

   public void a(bvq.d $$0) {
      this.an.b(ca, $$0.a());
   }

   private static boolean a(aru $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(cpo $$0) {
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
   public bjd eQ() {
      return bjd.e;
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
   public bid a(akk $$0, bid $$1) {
      bvq $$2 = bim.f.a((cpl)$$0);
      if ($$2 != null) {
         bvq.d $$3;
         if (a(this.ag)) {
            $$3 = bvq.d.b(this.ag);
         } else {
            $$3 = this.ag.h() ? this.ga() : ((bvq)$$1).ga();
         }

         $$2.a($$3);
         $$2.fF();
      }

      return $$2;
   }

   @Override
   public boolean m(cix $$0) {
      return $$0.a(apt.aA);
   }

   @Override
   public boolean a(cbm $$0) {
      return true;
   }

   @Override
   protected void V() {
      this.dK().ad().a("axolotlBrain");
      this.dM().a((akk)this.dK(), this);
      this.dK().ad().c();
      this.dK().ad().a("axolotlActivityUpdate");
      bvr.a(this);
      this.dK().ad().c();
      if (!this.fQ()) {
         Optional<Integer> $$0 = this.dM().c(brz.M);
         this.x($$0.isPresent() && $$0.get() > 0);
      }
   }

   public static bkd.a gh() {
      return bja.x().a(bke.a, 14.0).a(bke.d, 1.0).a(bke.f, 2.0);
   }

   @Override
   protected bsh b(cpl $$0) {
      return new bse(this, $$0);
   }

   @Override
   public boolean C(bii $$0) {
      boolean $$1 = $$0.a(this.dL().b((biy)this), (float)((int)this.b(bke.f)));
      if ($$1) {
         this.a(this, $$0);
         this.a(aow.av, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public boolean a(bhg $$0, float $$1) {
      float $$2 = this.et();
      if (!this.dK().B
         && !this.fQ()
         && this.dK().z.a(3) == 0
         && ((float)this.dK().z.a(3) < $$1 || $$2 / this.eK() < 0.5F)
         && $$1 < $$2
         && this.aX()
         && ($$0.d() != null || $$0.c() != null)
         && !this.gg()) {
         this.bz.a(brz.M, 200);
      }

      return super.a($$0, $$1);
   }

   @Override
   protected float b(bjk $$0, bij $$1) {
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
   public bgq b(cbm $$0, bgp $$1) {
      return bul.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void l(cix $$0) {
      bul.a(this, $$0);
      qr $$1 = $$0.w();
      $$1.a("Variant", this.ga().a());
      $$1.a("Age", this.h());
      bjy<?> $$2 = this.dM();
      if ($$2.a(brz.T)) {
         $$1.a("HuntingCooldown", $$2.e(brz.T));
      }
   }

   @Override
   public void c(qr $$0) {
      bul.a(this, $$0);
      this.a(bvq.d.a($$0.h("Variant")));
      if ($$0.e("Age")) {
         this.c_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.dM().a(brz.T, true, $$0.i("HuntingCooldown"));
      }
   }

   @Override
   public cix b() {
      return new cix(cja.pV);
   }

   @Override
   public aov t() {
      return aow.cC;
   }

   @Override
   public boolean em() {
      return !this.gg() && super.em();
   }

   public static void a(bvq $$0, biy $$1) {
      cpl $$2 = $$0.dK();
      if ($$1.eu()) {
         bhg $$3 = $$1.ev();
         if ($$3 != null) {
            bii $$4 = $$3.d();
            if ($$4 != null && $$4.ag() == bim.bt) {
               cbm $$5 = (cbm)$$4;
               List<cbm> $$6 = $$2.a(cbm.class, $$0.cG().g(20.0));
               if ($$6.contains($$5)) {
                  $$0.f($$5);
               }
            }
         }
      }
   }

   public void f(cbm $$0) {
      bhv $$1 = $$0.b(bhx.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.d() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new bhv(bhx.j, $$3, 0), this);
      }

      $$0.d(bhx.d);
   }

   @Override
   public boolean R() {
      return super.R() || this.q();
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.ax;
   }

   @Nullable
   @Override
   protected aov h_() {
      return aow.aw;
   }

   @Nullable
   @Override
   protected aov r() {
      return this.aX() ? aow.az : aow.ay;
   }

   @Override
   protected aov aM() {
      return aow.aA;
   }

   @Override
   protected aov aL() {
      return aow.aB;
   }

   @Override
   protected bjy.b<bvq> dN() {
      return bjy.a(bW, bU);
   }

   @Override
   protected bjy<?> a(Dynamic<?> $$0) {
      return bvr.a(this.dN().a($$0));
   }

   @Override
   public bjy<bvq> dM() {
      return (bjy<bvq>)super.dM();
   }

   @Override
   protected void T() {
      super.T();
      aav.a(this);
   }

   @Override
   public void h(ehd $$0) {
      if (this.cW() && this.aX()) {
         this.a(this.fd(), $$0);
         this.a(bje.a, this.dn());
         this.f(this.dn().a(0.9));
      } else {
         super.h($$0);
      }
   }

   @Override
   protected void a(cbm $$0, bgp $$1, cix $$2) {
      if ($$2.a(cja.pU)) {
         $$0.a($$1, new cix(cja.pL));
      } else {
         super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.q() && !this.ac();
   }

   public static boolean a(bim<? extends biy> $$0, cqa $$1, bjc $$2, gu $$3, aru $$4) {
      return $$1.a_($$3.d()).a(apl.bQ);
   }

   public static class a extends bid.a {
      public final bvq.d[] a;

      public a(bvq.d... $$0) {
         super(false);
         this.a = $$0;
      }

      public bvq.d a(aru $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class b extends box {
      public b(bvq $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!bvq.this.gg()) {
            super.a();
         }
      }
   }

   static class c extends boy {
      private final bvq l;

      public c(bvq $$0) {
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

   public static enum d implements ash {
      a(0, "lucy", true),
      b(1, "wild", true),
      c(2, "gold", true),
      d(3, "cyan", true),
      e(4, "blue", false);

      private static final IntFunction<bvq.d> g = aqk.a(bvq.d::a, values(), aqk.a.a);
      public static final Codec<bvq.d> f = ash.a(bvq.d::values);
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

      public static bvq.d a(int $$0) {
         return g.apply($$0);
      }

      public static bvq.d a(aru $$0) {
         return a($$0, true);
      }

      public static bvq.d b(aru $$0) {
         return a($$0, false);
      }

      private static bvq.d a(aru $$0, boolean $$1) {
         bvq.d[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.j == $$1).toArray(bvq.d[]::new);
         return ac.a($$2, $$0);
      }
   }
}
