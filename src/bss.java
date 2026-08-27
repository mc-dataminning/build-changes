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

public class bss extends brl implements bfx, bgy<bss.d>, brn {
   public static final int bT = 200;
   protected static final ImmutableList<? extends bqg<? extends bqf<? super bss>>> bU = ImmutableList.of(bqg.c, bqg.n, bqg.f, bqg.o, bqg.p);
   protected static final ImmutableList<? extends bpb<?>> bW = ImmutableList.of(
      bpb.r, bpb.g, bpb.h, bpb.k, bpb.l, bpb.n, bpb.m, bpb.E, bpb.t, bpb.o, bpb.p, bpb.J, new bpb[]{bpb.y, bpb.M, bpb.B, bpb.N, bpb.O, bpb.Q, bpb.T, bpb.Y}
   );
   private static final aby<Integer> ca = acb.a(bss.class, aca.b);
   private static final aby<Boolean> cb = acb.a(bss.class, aca.k);
   private static final aby<Boolean> cc = acb.a(bss.class, aca.k);
   public static final double bX = 20.0;
   public static final int bY = 1200;
   private static final int cd = 6000;
   public static final String bZ = "Variant";
   private static final int ce = 1800;
   private static final int cf = 2400;
   private final Map<String, Vector3f> cg = Maps.newHashMap();
   private static final int ch = 100;

   public bss(bfn<? extends bss> $$0, cmm $$1) {
      super($$0, $$1);
      this.a(dxp.j, 0.0F);
      this.bL = new bss.c(this);
      this.bK = new bss.b(this, 20);
      this.r(1.0F);
   }

   @Override
   public Map<String, Vector3f> a() {
      return this.cg;
   }

   @Override
   public float a(gu $$0, cmp $$1) {
      return 0.0F;
   }

   @Override
   protected void a_() {
      super.a_();
      this.am.a(ca, 0);
      this.am.a(cb, false);
      this.am.a(cc, false);
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("Variant", this.fY().a());
      $$0.a("FromBucket", this.r());
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.a(bss.d.a($$0.h("Variant")));
      this.w($$0.q("FromBucket"));
   }

   @Override
   public void N() {
      if (!this.ge()) {
         super.N();
      }
   }

   @Override
   public bgt a(cnb $$0, bdv $$1, bgd $$2, @Nullable bgt $$3, @Nullable qr $$4) {
      boolean $$5 = false;
      if ($$2 == bgd.l) {
         return $$3;
      } else {
         apf $$6 = $$0.y_();
         if ($$3 instanceof bss.a) {
            if (((bss.a)$$3).a() >= 2) {
               $$5 = true;
            }
         } else {
            $$3 = new bss.a(bss.d.a($$6), bss.d.a($$6));
         }

         this.a(((bss.a)$$3).a($$6));
         if ($$5) {
            this.c_(-24000);
         }

         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void ao() {
      int $$0 = this.cf();
      super.ao();
      if (!this.fQ()) {
         this.t($$0);
      }
   }

   protected void t(int $$0) {
      if (this.bs() && !this.aX()) {
         this.j($$0 - 1);
         if (this.cf() == -20) {
            this.j(0);
            this.a(this.dJ().r(), 2.0F);
         }
      } else {
         this.j(this.ce());
      }
   }

   @Override
   public void q() {
      int $$0 = this.cf() + 1800;
      this.j(Math.min($$0, this.ce()));
   }

   @Override
   public int ce() {
      return 6000;
   }

   public bss.d fY() {
      return bss.d.a(this.am.b(ca));
   }

   public void a(bss.d $$0) {
      this.am.b(ca, $$0.a());
   }

   private static boolean a(apf $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(cmp $$0) {
      return $$0.f(this);
   }

   @Override
   public boolean dN() {
      return true;
   }

   @Override
   public boolean cw() {
      return false;
   }

   @Override
   public bge eN() {
      return bge.e;
   }

   public void x(boolean $$0) {
      this.am.b(cb, $$0);
   }

   public boolean ge() {
      return this.am.b(cb);
   }

   @Override
   public boolean r() {
      return this.am.b(cc);
   }

   @Override
   public void w(boolean $$0) {
      this.am.b(cc, $$0);
   }

   @Nullable
   @Override
   public bfe a(aif $$0, bfe $$1) {
      bss $$2 = bfn.f.a((cmm)$$0);
      if ($$2 != null) {
         bss.d $$3;
         if (a(this.af)) {
            $$3 = bss.d.b(this.af);
         } else {
            $$3 = this.af.h() ? this.fY() : ((bss)$$1).fY();
         }

         $$2.a($$3);
         $$2.fF();
      }

      return $$2;
   }

   @Override
   public double i(bfz $$0) {
      return 1.5 + (double)$$0.dd() * 2.0;
   }

   @Override
   public boolean m(cfz $$0) {
      return $$0.a(ane.aA);
   }

   @Override
   public boolean a(byo $$0) {
      return true;
   }

   @Override
   protected void W() {
      this.dI().ad().a("axolotlBrain");
      this.dK().a((aif)this.dI(), this);
      this.dI().ad().c();
      this.dI().ad().a("axolotlActivityUpdate");
      bst.a(this);
      this.dI().ad().c();
      if (!this.fQ()) {
         Optional<Integer> $$0 = this.dK().c(bpb.M);
         this.x($$0.isPresent() && $$0.get() > 0);
      }
   }

   public static bhf.a gf() {
      return bgb.y().a(bhg.a, 14.0).a(bhg.d, 1.0).a(bhg.f, 2.0);
   }

   @Override
   protected bpj b(cmm $$0) {
      return new bpg(this, $$0);
   }

   @Override
   public boolean z(bfj $$0) {
      boolean $$1 = $$0.a(this.dJ().b((bfz)this), (float)((int)this.b(bhg.f)));
      if ($$1) {
         this.a(this, $$0);
         this.a(amh.av, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public boolean a(ben $$0, float $$1) {
      float $$2 = this.er();
      if (!this.dI().B
         && !this.fQ()
         && this.dI().z.a(3) == 0
         && ((float)this.dI().z.a(3) < $$1 || $$2 / this.eI() < 0.5F)
         && $$1 < $$2
         && this.aV()
         && ($$0.d() != null || $$0.c() != null)
         && !this.ge()) {
         this.bA.a(bpb.M, 200);
      }

      return super.a($$0, $$1);
   }

   @Override
   protected float b(bgl $$0, bfk $$1) {
      return $$1.b * 0.655F;
   }

   @Override
   public int X() {
      return 1;
   }

   @Override
   public int fC() {
      return 1;
   }

   @Override
   public bdx b(byo $$0, bdw $$1) {
      return brn.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void l(cfz $$0) {
      brn.a(this, $$0);
      qr $$1 = $$0.w();
      $$1.a("Variant", this.fY().a());
      $$1.a("Age", this.h());
      bha<?> $$2 = this.dK();
      if ($$2.a(bpb.T)) {
         $$1.a("HuntingCooldown", $$2.e(bpb.T));
      }
   }

   @Override
   public void c(qr $$0) {
      brn.a(this, $$0);
      this.a(bss.d.a($$0.h("Variant")));
      if ($$0.e("Age")) {
         this.c_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.dK().a(bpb.T, true, $$0.i("HuntingCooldown"));
      }
   }

   @Override
   public cfz b() {
      return new cfz(cgc.pV);
   }

   @Override
   public amg w() {
      return amh.cC;
   }

   @Override
   public boolean ek() {
      return !this.ge() && super.ek();
   }

   public static void a(bss $$0, bfz $$1) {
      cmm $$2 = $$0.dI();
      if ($$1.es()) {
         ben $$3 = $$1.et();
         if ($$3 != null) {
            bfj $$4 = $$3.d();
            if ($$4 != null && $$4.ae() == bfn.bt) {
               byo $$5 = (byo)$$4;
               List<byo> $$6 = $$2.a(byo.class, $$0.cE().g(20.0));
               if ($$6.contains($$5)) {
                  $$0.f($$5);
               }
            }
         }
      }
   }

   public void f(byo $$0) {
      bfa $$1 = $$0.b(bfc.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.d() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new bfa(bfc.j, $$3, 0), this);
      }

      $$0.d(bfc.d);
   }

   @Override
   public boolean T() {
      return super.T() || this.r();
   }

   @Override
   protected amg d(ben $$0) {
      return amh.ax;
   }

   @Nullable
   @Override
   protected amg g_() {
      return amh.aw;
   }

   @Nullable
   @Override
   protected amg s() {
      return this.aV() ? amh.az : amh.ay;
   }

   @Override
   protected amg aK() {
      return amh.aA;
   }

   @Override
   protected amg aJ() {
      return amh.aB;
   }

   @Override
   protected bha.b<bss> dL() {
      return bha.a(bW, bU);
   }

   @Override
   protected bha<?> a(Dynamic<?> $$0) {
      return bst.a(this.dL().a($$0));
   }

   @Override
   public bha<bss> dK() {
      return (bha<bss>)super.dK();
   }

   @Override
   protected void V() {
      super.V();
      za.a(this);
   }

   @Override
   public void h(eei $$0) {
      if (this.cU() && this.aV()) {
         this.a(this.fa(), $$0);
         this.a(bgf.a, this.dl());
         this.f(this.dl().a(0.9));
      } else {
         super.h($$0);
      }
   }

   @Override
   protected void a(byo $$0, bdw $$1, cfz $$2) {
      if ($$2.a(cgc.pU)) {
         $$0.a($$1, new cfz(cgc.pL));
      } else {
         super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.r() && !this.aa();
   }

   public static boolean a(bfn<? extends bfz> $$0, cnb $$1, bgd $$2, gu $$3, apf $$4) {
      return $$1.a_($$3.d()).a(amw.bO);
   }

   public static class a extends bfe.a {
      public final bss.d[] a;

      public a(bss.d... $$0) {
         super(false);
         this.a = $$0;
      }

      public bss.d a(apf $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class b extends blz {
      public b(bss $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!bss.this.ge()) {
            super.a();
         }
      }
   }

   static class c extends bma {
      private final bss l;

      public c(bss $$0) {
         super($$0, 85, 10, 0.1F, 0.5F, false);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (!this.l.ge()) {
            super.a();
         }
      }
   }

   public static enum d implements apr {
      a(0, "lucy", true),
      b(1, "wild", true),
      c(2, "gold", true),
      d(3, "cyan", true),
      e(4, "blue", false);

      private static final IntFunction<bss.d> g = anu.a(bss.d::a, values(), anu.a.a);
      public static final Codec<bss.d> f = apr.a(bss.d::values);
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

      public static bss.d a(int $$0) {
         return g.apply($$0);
      }

      public static bss.d a(apf $$0) {
         return a($$0, true);
      }

      public static bss.d b(apf $$0) {
         return a($$0, false);
      }

      private static bss.d a(apf $$0, boolean $$1) {
         bss.d[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.j == $$1).toArray(bss.d[]::new);
         return ac.a($$2, $$0);
      }
   }
}
