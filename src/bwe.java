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

public class bwe extends bux implements bjk, bkk<bwe.d>, buz {
   public static final int bT = 200;
   protected static final ImmutableList<? extends bts<? extends btr<? super bwe>>> bU = ImmutableList.of(bts.c, bts.n, bts.f, bts.o, bts.p);
   protected static final ImmutableList<? extends bsn<?>> bW = ImmutableList.of(
      bsn.r, bsn.g, bsn.h, bsn.k, bsn.l, bsn.n, bsn.m, bsn.E, bsn.t, bsn.o, bsn.p, bsn.J, new bsn[]{bsn.y, bsn.M, bsn.B, bsn.N, bsn.O, bsn.Q, bsn.T, bsn.Y}
   );
   private static final aef<Integer> ca = aei.a(bwe.class, aeh.b);
   private static final aef<Boolean> cb = aei.a(bwe.class, aeh.k);
   private static final aef<Boolean> cc = aei.a(bwe.class, aeh.k);
   public static final double bX = 20.0;
   public static final int bY = 1200;
   private static final int cd = 6000;
   public static final String bZ = "Variant";
   private static final int ce = 1800;
   private static final int cf = 2400;
   private final Map<String, Vector3f> cg = Maps.newHashMap();
   private static final int ch = 100;

   public bwe(bja<? extends bwe> $$0, cqb $$1) {
      super($$0, $$1);
      this.a(ear.j, 0.0F);
      this.bL = new bwe.c(this);
      this.bK = new bwe.b(this, 20);
      this.t(1.0F);
   }

   @Override
   public Map<String, Vector3f> a() {
      return this.cg;
   }

   @Override
   public float a(gw $$0, cqe $$1) {
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
   public void b(qw $$0) {
      super.b($$0);
      $$0.a("Variant", this.ge().a());
      $$0.a("FromBucket", this.t());
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      this.a(bwe.d.a($$0.h("Variant")));
      this.w($$0.q("FromBucket"));
   }

   @Override
   public void P() {
      if (!this.gk()) {
         super.P();
      }
   }

   @Override
   public bkf a(cqq $$0, bhc $$1, bjq $$2, @Nullable bkf $$3, @Nullable qw $$4) {
      boolean $$5 = false;
      if ($$2 == bjq.l) {
         return $$3;
      } else {
         ash $$6 = $$0.D_();
         if ($$3 instanceof bwe.a) {
            if (((bwe.a)$$3).a() >= 2) {
               $$5 = true;
            }
         } else {
            $$3 = new bwe.a(bwe.d.a($$6), bwe.d.a($$6));
         }

         this.a(((bwe.a)$$3).a($$6));
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
      if (!this.fU()) {
         this.t($$0);
      }
   }

   protected void t(int $$0) {
      if (this.bv() && !this.aZ()) {
         this.j($$0 - 1);
         if (this.ch() == -20) {
            this.j(0);
            this.a(this.dM().r(), 2.0F);
         }
      } else {
         this.j(this.cg());
      }
   }

   @Override
   public void s() {
      int $$0 = this.ch() + 1800;
      this.j(Math.min($$0, this.cg()));
   }

   @Override
   public int cg() {
      return 6000;
   }

   public bwe.d ge() {
      return bwe.d.a(this.an.b(ca));
   }

   public void a(bwe.d $$0) {
      this.an.b(ca, $$0.a());
   }

   private static boolean a(ash $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(cqe $$0) {
      return $$0.f(this);
   }

   @Override
   public boolean cy() {
      return false;
   }

   @Override
   public bjr eR() {
      return bjr.e;
   }

   public void x(boolean $$0) {
      this.an.b(cb, $$0);
   }

   public boolean gk() {
      return this.an.b(cb);
   }

   @Override
   public boolean t() {
      return this.an.b(cc);
   }

   @Override
   public void w(boolean $$0) {
      this.an.b(cc, $$0);
   }

   @Nullable
   @Override
   public bir a(akt $$0, bir $$1) {
      bwe $$2 = bja.f.a((cqb)$$0);
      if ($$2 != null) {
         bwe.d $$3;
         if (a(this.ag)) {
            $$3 = bwe.d.b(this.ag);
         } else {
            $$3 = this.ag.h() ? this.ge() : ((bwe)$$1).ge();
         }

         $$2.a($$3);
         $$2.fJ();
      }

      return $$2;
   }

   @Override
   public boolean m(cjl $$0) {
      return $$0.a(aqd.aA);
   }

   @Override
   public boolean a(cca $$0) {
      return true;
   }

   @Override
   protected void X() {
      this.dL().ad().a("axolotlBrain");
      this.dN().a((akt)this.dL(), this);
      this.dL().ad().c();
      this.dL().ad().a("axolotlActivityUpdate");
      bwf.a(this);
      this.dL().ad().c();
      if (!this.fU()) {
         Optional<Integer> $$0 = this.dN().c(bsn.M);
         this.x($$0.isPresent() && $$0.get() > 0);
      }
   }

   public static bkr.a gl() {
      return bjo.A().a(bks.l, 14.0).a(bks.m, 1.0).a(bks.c, 2.0);
   }

   @Override
   protected bsv b(cqb $$0) {
      return new bss(this, $$0);
   }

   @Override
   public boolean C(biw $$0) {
      boolean $$1 = $$0.a(this.dM().b((bjm)this), (float)((int)this.b(bks.c)));
      if ($$1) {
         this.a(this, $$0);
         this.a(apg.av, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public boolean a(bhu $$0, float $$1) {
      float $$2 = this.eu();
      if (!this.dL().B
         && !this.fU()
         && this.dL().z.a(3) == 0
         && ((float)this.dL().z.a(3) < $$1 || $$2 / this.eL() < 0.5F)
         && $$1 < $$2
         && this.aX()
         && ($$0.d() != null || $$0.c() != null)
         && !this.gk()) {
         this.bz.a(bsn.M, 200);
      }

      return super.a($$0, $$1);
   }

   @Override
   protected float b(bjy $$0, bix $$1) {
      return $$1.b * 0.655F;
   }

   @Override
   public int Y() {
      return 1;
   }

   @Override
   public int Z() {
      return 1;
   }

   @Override
   public bhe b(cca $$0, bhd $$1) {
      return buz.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void l(cjl $$0) {
      buz.a(this, $$0);
      qw $$1 = $$0.w();
      $$1.a("Variant", this.ge().a());
      $$1.a("Age", this.h());
      bkm<?> $$2 = this.dN();
      if ($$2.a(bsn.T)) {
         $$1.a("HuntingCooldown", $$2.e(bsn.T));
      }
   }

   @Override
   public void c(qw $$0) {
      buz.a(this, $$0);
      this.a(bwe.d.a($$0.h("Variant")));
      if ($$0.e("Age")) {
         this.c_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.dN().a(bsn.T, true, $$0.i("HuntingCooldown"));
      }
   }

   @Override
   public cjl b() {
      return new cjl(cjo.pV);
   }

   @Override
   public apf y() {
      return apg.cC;
   }

   @Override
   public boolean en() {
      return !this.gk() && super.en();
   }

   public static void a(bwe $$0, bjm $$1) {
      cqb $$2 = $$0.dL();
      if ($$1.ev()) {
         bhu $$3 = $$1.ew();
         if ($$3 != null) {
            biw $$4 = $$3.d();
            if ($$4 != null && $$4.ag() == bja.bt) {
               cca $$5 = (cca)$$4;
               List<cca> $$6 = $$2.a(cca.class, $$0.cG().g(20.0));
               if ($$6.contains($$5)) {
                  $$0.f($$5);
               }
            }
         }
      }
   }

   public void f(cca $$0) {
      bij $$1 = $$0.b(bil.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.d() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new bij(bil.j, $$3, 0), this);
      }

      $$0.d(bil.d);
   }

   @Override
   public boolean U() {
      return super.U() || this.t();
   }

   @Override
   protected apf d(bhu $$0) {
      return apg.ax;
   }

   @Nullable
   @Override
   protected apf l_() {
      return apg.aw;
   }

   @Nullable
   @Override
   protected apf w() {
      return this.aX() ? apg.az : apg.ay;
   }

   @Override
   protected apf aM() {
      return apg.aA;
   }

   @Override
   protected apf aL() {
      return apg.aB;
   }

   @Override
   protected bkm.b<bwe> dO() {
      return bkm.a(bW, bU);
   }

   @Override
   protected bkm<?> a(Dynamic<?> $$0) {
      return bwf.a(this.dO().a($$0));
   }

   @Override
   public bkm<bwe> dN() {
      return (bkm<bwe>)super.dN();
   }

   @Override
   protected void W() {
      super.W();
      abc.a(this);
   }

   @Override
   public void h(ehh $$0) {
      if (this.cW() && this.aX()) {
         this.a(this.fe(), $$0);
         this.a(bjs.a, this.do());
         this.f(this.do().a(0.9));
      } else {
         super.h($$0);
      }
   }

   @Override
   protected void a(cca $$0, bhd $$1, cjl $$2) {
      if ($$2.a(cjo.pU)) {
         $$0.a($$1, new cjl(cjo.pL));
      } else {
         super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.t() && !this.ac();
   }

   public static boolean a(bja<? extends bjm> $$0, cqq $$1, bjq $$2, gw $$3, ash $$4) {
      return $$1.a_($$3.d()).a(apv.bQ);
   }

   public static class a extends bir.a {
      public final bwe.d[] a;

      public a(bwe.d... $$0) {
         super(false);
         this.a = $$0;
      }

      public bwe.d a(ash $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class b extends bpl {
      public b(bwe $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!bwe.this.gk()) {
            super.a();
         }
      }
   }

   static class c extends bpm {
      private final bwe l;

      public c(bwe $$0) {
         super($$0, 85, 10, 0.1F, 0.5F, false);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (!this.l.gk()) {
            super.a();
         }
      }
   }

   public static enum d implements asu {
      a(0, "lucy", true),
      b(1, "wild", true),
      c(2, "gold", true),
      d(3, "cyan", true),
      e(4, "blue", false);

      private static final IntFunction<bwe.d> g = aqu.a(bwe.d::a, values(), aqu.a.a);
      public static final Codec<bwe.d> f = asu.a(bwe.d::values);
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

      public static bwe.d a(int $$0) {
         return g.apply($$0);
      }

      public static bwe.d a(ash $$0) {
         return a($$0, true);
      }

      public static bwe.d b(ash $$0) {
         return a($$0, false);
      }

      private static bwe.d a(ash $$0, boolean $$1) {
         bwe.d[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.j == $$1).toArray(bwe.d[]::new);
         return ac.a($$2, $$0);
      }
   }
}
