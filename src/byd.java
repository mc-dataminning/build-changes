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

public class byd extends bww implements blj, bmj<byd.d>, bwy {
   public static final int bT = 200;
   protected static final ImmutableList<? extends bvr<? extends bvq<? super byd>>> bU = ImmutableList.of(bvr.c, bvr.n, bvr.f, bvr.o, bvr.p);
   protected static final ImmutableList<? extends bum<?>> bW = ImmutableList.of(
      bum.r, bum.g, bum.h, bum.k, bum.l, bum.n, bum.m, bum.E, bum.t, bum.o, bum.p, bum.J, new bum[]{bum.y, bum.M, bum.B, bum.N, bum.O, bum.Q, bum.T, bum.Y}
   );
   private static final afs<Integer> ca = afv.a(byd.class, afu.b);
   private static final afs<Boolean> cb = afv.a(byd.class, afu.k);
   private static final afs<Boolean> cc = afv.a(byd.class, afu.k);
   public static final double bX = 20.0;
   public static final int bY = 1200;
   private static final int cd = 6000;
   public static final String bZ = "Variant";
   private static final int ce = 1800;
   private static final int cf = 2400;
   private final Map<String, Vector3f> cg = Maps.newHashMap();
   private static final int ch = 100;

   public byd(bkz<? extends byd> $$0, csf $$1) {
      super($$0, $$1);
      this.a(edi.j, 0.0F);
      this.bL = new byd.c(this);
      this.bK = new byd.b(this, 20);
      this.t(1.0F);
   }

   @Override
   public Map<String, Vector3f> a() {
      return this.cg;
   }

   @Override
   public float a(hx $$0, csi $$1) {
      return 0.0F;
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(ca, 0);
      this.an.a(cb, false);
      this.an.a(cc, false);
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      $$0.a("Variant", this.gf().a());
      $$0.a("FromBucket", this.w());
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      this.a(byd.d.a($$0.h("Variant")));
      this.w($$0.q("FromBucket"));
   }

   @Override
   public void R() {
      if (!this.gl()) {
         super.R();
      }
   }

   @Override
   public bme a(csu $$0, biz $$1, blp $$2, @Nullable bme $$3, @Nullable sd $$4) {
      boolean $$5 = false;
      if ($$2 == blp.l) {
         return $$3;
      } else {
         atw $$6 = $$0.F_();
         if ($$3 instanceof byd.a) {
            if (((byd.a)$$3).a() >= 2) {
               $$5 = true;
            }
         } else {
            $$3 = new byd.a(byd.d.a($$6), byd.d.a($$6));
         }

         this.a(((byd.a)$$3).a($$6));
         if ($$5) {
            this.c_(-24000);
         }

         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void as() {
      int $$0 = this.ci();
      super.as();
      if (!this.fV()) {
         this.t($$0);
      }
   }

   protected void t(int $$0) {
      if (this.bx() && !this.bb()) {
         this.j($$0 - 1);
         if (this.ci() == -20) {
            this.j(0);
            this.a(this.dO().r(), 2.0F);
         }
      } else {
         this.j(this.ch());
      }
   }

   @Override
   public void u() {
      int $$0 = this.ci() + 1800;
      this.j(Math.min($$0, this.ch()));
   }

   @Override
   public int ch() {
      return 6000;
   }

   public byd.d gf() {
      return byd.d.a(this.an.b(ca));
   }

   public void a(byd.d $$0) {
      this.an.b(ca, $$0.a());
   }

   private static boolean a(atw $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(csi $$0) {
      return $$0.f(this);
   }

   @Override
   public boolean cz() {
      return false;
   }

   @Override
   public blq eT() {
      return blq.e;
   }

   public void x(boolean $$0) {
      this.an.b(cb, $$0);
   }

   public boolean gl() {
      return this.an.b(cb);
   }

   @Override
   public boolean w() {
      return this.an.b(cc);
   }

   @Override
   public void w(boolean $$0) {
      this.an.b(cc, $$0);
   }

   @Nullable
   @Override
   public bkq a(ami $$0, bkq $$1) {
      byd $$2 = bkz.f.a((csf)$$0);
      if ($$2 != null) {
         byd.d $$3;
         if (a(this.ag)) {
            $$3 = byd.d.b(this.ag);
         } else {
            $$3 = this.ag.h() ? this.gf() : ((byd)$$1).gf();
         }

         $$2.a($$3);
         $$2.fK();
      }

      return $$2;
   }

   @Override
   public boolean m(clo $$0) {
      return $$0.a(ars.aA);
   }

   @Override
   public boolean a(cdz $$0) {
      return true;
   }

   @Override
   protected void Z() {
      this.dN().ae().a("axolotlBrain");
      this.dP().a((ami)this.dN(), this);
      this.dN().ae().c();
      this.dN().ae().a("axolotlActivityUpdate");
      bye.a(this);
      this.dN().ae().c();
      if (!this.fV()) {
         Optional<Integer> $$0 = this.dP().c(bum.M);
         this.x($$0.isPresent() && $$0.get() > 0);
      }
   }

   public static bmq.a gm() {
      return bln.C().a(bmr.l, 14.0).a(bmr.m, 1.0).a(bmr.c, 2.0);
   }

   @Override
   protected buu b(csf $$0) {
      return new bur(this, $$0);
   }

   @Override
   public boolean C(bkv $$0) {
      boolean $$1 = $$0.a(this.dO().b((bll)this), (float)((int)this.b(bmr.c)));
      if ($$1) {
         this.a(this, $$0);
         this.a(aqv.av, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public boolean a(bjt $$0, float $$1) {
      float $$2 = this.ew();
      if (!this.dN().B
         && !this.fV()
         && this.dN().z.a(3) == 0
         && ((float)this.dN().z.a(3) < $$1 || $$2 / this.eN() < 0.5F)
         && $$1 < $$2
         && this.aZ()
         && ($$0.d() != null || $$0.c() != null)
         && !this.gl()) {
         this.bz.a(bum.M, 200);
      }

      return super.a($$0, $$1);
   }

   @Override
   protected float b(blx $$0, bkw $$1) {
      return $$1.b * 0.655F;
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
   public bjb b(cdz $$0, bja $$1) {
      return bwy.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void l(clo $$0) {
      bwy.a(this, $$0);
      sd $$1 = $$0.w();
      $$1.a("Variant", this.gf().a());
      $$1.a("Age", this.h());
      bml<?> $$2 = this.dP();
      if ($$2.a(bum.T)) {
         $$1.a("HuntingCooldown", $$2.e(bum.T));
      }
   }

   @Override
   public void c(sd $$0) {
      bwy.a(this, $$0);
      this.a(byd.d.a($$0.h("Variant")));
      if ($$0.e("Age")) {
         this.c_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.dP().a(bum.T, true, $$0.i("HuntingCooldown"));
      }
   }

   @Override
   public clo b() {
      return new clo(clr.qG);
   }

   @Override
   public aqu A() {
      return aqv.cC;
   }

   @Override
   public boolean ep() {
      return !this.gl() && super.ep();
   }

   public static void a(byd $$0, bll $$1) {
      csf $$2 = $$0.dN();
      if ($$1.ex()) {
         bjt $$3 = $$1.ey();
         if ($$3 != null) {
            bkv $$4 = $$3.d();
            if ($$4 != null && $$4.ai() == bkz.bt) {
               cdz $$5 = (cdz)$$4;
               List<cdz> $$6 = $$2.a(cdz.class, $$0.cH().g(20.0));
               if ($$6.contains($$5)) {
                  $$0.f($$5);
               }
            }
         }
      }
   }

   public void f(cdz $$0) {
      bki $$1 = $$0.b(bkk.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.d() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new bki(bkk.j, $$3, 0), this);
      }

      $$0.d(bkk.d);
   }

   @Override
   public boolean W() {
      return super.W() || this.w();
   }

   @Override
   protected aqu d(bjt $$0) {
      return aqv.ax;
   }

   @Nullable
   @Override
   protected aqu n_() {
      return aqv.aw;
   }

   @Nullable
   @Override
   protected aqu y() {
      return this.aZ() ? aqv.az : aqv.ay;
   }

   @Override
   protected aqu aO() {
      return aqv.aA;
   }

   @Override
   protected aqu aN() {
      return aqv.aB;
   }

   @Override
   protected bml.b<byd> dQ() {
      return bml.a(bW, bU);
   }

   @Override
   protected bml<?> a(Dynamic<?> $$0) {
      return bye.a(this.dQ().a($$0));
   }

   @Override
   public bml<byd> dP() {
      return (bml<byd>)super.dP();
   }

   @Override
   protected void Y() {
      super.Y();
      aco.a(this);
   }

   @Override
   public void a(ejz $$0) {
      if (this.cY() && this.aZ()) {
         this.a(this.fg(), $$0);
         this.a(blr.a, this.dq());
         this.g(this.dq().a(0.9));
      } else {
         super.a($$0);
      }
   }

   @Override
   protected void a(cdz $$0, bja $$1, clo $$2) {
      if ($$2.a(clr.qF)) {
         $$0.a($$1, new clo(clr.qw));
      } else {
         super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.w() && !this.ae();
   }

   public static boolean a(bkz<? extends bll> $$0, csu $$1, blp $$2, hx $$3, atw $$4) {
      return $$1.a_($$3.d()).a(ark.bQ);
   }

   public static class a extends bkq.a {
      public final byd.d[] a;

      public a(byd.d... $$0) {
         super(false);
         this.a = $$0;
      }

      public byd.d a(atw $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class b extends brk {
      public b(byd $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!byd.this.gl()) {
            super.a();
         }
      }
   }

   static class c extends brl {
      private final byd l;

      public c(byd $$0) {
         super($$0, 85, 10, 0.1F, 0.5F, false);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (!this.l.gl()) {
            super.a();
         }
      }
   }

   public static enum d implements auk {
      a(0, "lucy", true),
      b(1, "wild", true),
      c(2, "gold", true),
      d(3, "cyan", true),
      e(4, "blue", false);

      private static final IntFunction<byd.d> g = asj.a(byd.d::a, values(), asj.a.a);
      public static final Codec<byd.d> f = auk.a(byd.d::values);
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

      public static byd.d a(int $$0) {
         return g.apply($$0);
      }

      public static byd.d a(atw $$0) {
         return a($$0, true);
      }

      public static byd.d b(atw $$0) {
         return a($$0, false);
      }

      private static byd.d a(atw $$0, boolean $$1) {
         byd.d[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.j == $$1).toArray(byd.d[]::new);
         return ac.a($$2, $$0);
      }
   }
}
