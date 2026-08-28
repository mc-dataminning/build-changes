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

public class cge extends ces implements bta, buc<cge.d>, ceu {
   public static final int ca = 200;
   protected static final ImmutableList<? extends cdn<? extends cdm<? super cge>>> cb = ImmutableList.of(cdn.c, cdn.o, cdn.f, cdn.p, cdn.q);
   protected static final ImmutableList<? extends ccg<?>> cd = ImmutableList.of(
      ccg.r, ccg.g, ccg.h, ccg.k, ccg.l, ccg.n, ccg.m, ccg.E, ccg.t, ccg.o, ccg.p, ccg.K, new ccg[]{ccg.y, ccg.N, ccg.B, ccg.O, ccg.P, ccg.R, ccg.U, ccg.Z}
   );
   private static final ajp<Integer> ch = ajt.a(cge.class, ajr.b);
   private static final ajp<Boolean> ci = ajt.a(cge.class, ajr.k);
   private static final ajp<Boolean> cj = ajt.a(cge.class, ajr.k);
   public static final double ce = 20.0;
   public static final int cf = 1200;
   private static final int ck = 6000;
   public static final String cg = "Variant";
   private static final int cl = 1800;
   private static final int cm = 2400;
   private final Map<String, Vector3f> cn = Maps.newHashMap();
   private static final int co = 100;

   public cge(bsn<? extends cge> $$0, dcg $$1) {
      super($$0, $$1);
      this.a(epa.j, 0.0F);
      this.bR = new cge.c(this);
      this.bQ = new cge.b(this, 20);
   }

   @Override
   public Map<String, Vector3f> a() {
      return this.cn;
   }

   @Override
   public float a(ja $$0, dcj $$1) {
      return 0.0F;
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(ch, 0);
      $$0.a(ci, false);
      $$0.a(cj, false);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("Variant", this.gn().a());
      $$0.a("FromBucket", this.t());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.a(cge.d.a($$0.h("Variant")));
      this.w($$0.q("FromBucket"));
   }

   @Override
   public void Q() {
      if (!this.gt()) {
         super.Q();
      }
   }

   @Override
   public btv a(dcv $$0, bqf $$1, btg $$2, @Nullable btv $$3) {
      boolean $$4 = false;
      if ($$2 == btg.l) {
         return $$3;
      } else {
         ayo $$5 = $$0.E_();
         if ($$3 instanceof cge.a) {
            if (((cge.a)$$3).a() >= 2) {
               $$4 = true;
            }
         } else {
            $$3 = new cge.a(cge.d.a($$5), cge.d.a($$5));
         }

         this.a(((cge.a)$$3).a($$5));
         if ($$4) {
            this.c_(-24000);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void aw() {
      int $$0 = this.cn();
      super.aw();
      if (!this.gc()) {
         this.t($$0);
      }
   }

   protected void t(int $$0) {
      if (this.bF() && !this.bi()) {
         this.j($$0 - 1);
         if (this.cn() == -20) {
            this.j(0);
            this.a(this.dS().s(), 2.0F);
         }
      } else {
         this.j(this.cm());
      }
   }

   @Override
   public void s() {
      int $$0 = this.cn() + 1800;
      this.j(Math.min($$0, this.cm()));
   }

   @Override
   public int cm() {
      return 6000;
   }

   public cge.d gn() {
      return cge.d.a(this.ao.a(ch));
   }

   public void a(cge.d $$0) {
      this.ao.a(ch, $$0.a());
   }

   private static boolean a(ayo $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(dcj $$0) {
      return $$0.f(this);
   }

   @Override
   public boolean cE() {
      return false;
   }

   public void x(boolean $$0) {
      this.ao.a(ci, $$0);
   }

   public boolean gt() {
      return this.ao.a(ci);
   }

   @Override
   public boolean t() {
      return this.ao.a(cj);
   }

   @Override
   public void w(boolean $$0) {
      this.ao.a(cj, $$0);
   }

   @Nullable
   @Override
   public bsb a(aqm $$0, bsb $$1) {
      cge $$2 = bsn.f.a((dcg)$$0);
      if ($$2 != null) {
         cge.d $$3;
         if (a(this.ah)) {
            $$3 = cge.d.b(this.ah);
         } else {
            $$3 = this.ah.h() ? this.gn() : ((cge)$$1).gn();
         }

         $$2.a($$3);
         $$2.fQ();
      }

      return $$2;
   }

   @Override
   public boolean o(cud $$0) {
      return $$0.a(awf.ay);
   }

   @Override
   public boolean a(cml $$0) {
      return true;
   }

   @Override
   protected void Z() {
      this.dR().ag().a("axolotlBrain");
      this.dV().a((aqm)this.dR(), this);
      this.dR().ag().c();
      this.dR().ag().a("axolotlActivityUpdate");
      cgf.a(this);
      this.dR().ag().c();
      if (!this.gc()) {
         Optional<Integer> $$0 = this.dV().c(ccg.N);
         this.x($$0.isPresent() && $$0.get() > 0);
      }
   }

   public static buj.a gu() {
      return bte.A().a(buk.s, 14.0).a(buk.v, 1.0).a(buk.c, 2.0).a(buk.B, 1.0);
   }

   @Override
   protected cco b(dcg $$0) {
      return new ccl(this, $$0);
   }

   @Override
   public void gg() {
      this.a(avh.aK, 1.0F, 1.0F);
   }

   @Override
   public boolean a(bra $$0, float $$1) {
      float $$2 = this.ey();
      if (!this.dR().B
         && !this.gc()
         && this.dR().z.a(3) == 0
         && ((float)this.dR().z.a(3) < $$1 || $$2 / this.eP() < 0.5F)
         && $$1 < $$2
         && this.bg()
         && ($$0.d() != null || $$0.c() != null)
         && !this.gt()) {
         this.bG.a(ccg.N, 200);
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
   public bqh b(cml $$0, bqg $$1) {
      return ceu.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void n(cud $$0) {
      ceu.a(this, $$0);
      cwr.a(kn.N, $$0, $$0x -> {
         $$0x.a("Variant", this.gn().a());
         $$0x.a("Age", this.g());
         bue<?> $$1 = this.dV();
         if ($$1.a(ccg.U)) {
            $$0x.a("HuntingCooldown", $$1.e(ccg.U));
         }
      });
   }

   @Override
   public void c(tx $$0) {
      ceu.a(this, $$0);
      this.a(cge.d.a($$0.h("Variant")));
      if ($$0.e("Age")) {
         this.c_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.dV().a(ccg.U, true, $$0.i("HuntingCooldown"));
      }
   }

   @Override
   public cud b() {
      return new cud(cug.qJ);
   }

   @Override
   public avg x() {
      return avh.dj;
   }

   @Override
   public boolean er() {
      return !this.gt() && super.er();
   }

   public static void a(cge $$0, btc $$1) {
      dcg $$2 = $$0.dR();
      if ($$1.ez()) {
         bra $$3 = $$1.eA();
         if ($$3 != null) {
            bsh $$4 = $$3.d();
            if ($$4 != null && $$4.am() == bsn.by) {
               cml $$5 = (cml)$$4;
               List<cml> $$6 = $$2.a(cml.class, $$0.cM().g(20.0));
               if ($$6.contains($$5)) {
                  $$0.f($$5);
               }
            }
         }
      }
   }

   public void f(cml $$0) {
      brp $$1 = $$0.c(brr.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.d() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new brp(brr.j, $$3, 0), this);
      }

      $$0.e(brr.d);
   }

   @Override
   public boolean W() {
      return super.W() || this.t();
   }

   @Override
   protected avg d(bra $$0) {
      return avh.aM;
   }

   @Nullable
   @Override
   protected avg n_() {
      return avh.aL;
   }

   @Nullable
   @Override
   protected avg v() {
      return this.bg() ? avh.aO : avh.aN;
   }

   @Override
   protected avg aS() {
      return avh.aP;
   }

   @Override
   protected avg aR() {
      return avh.aQ;
   }

   @Override
   protected bue.b<cge> dW() {
      return bue.a(cd, cb);
   }

   @Override
   protected bue<?> a(Dynamic<?> $$0) {
      return cgf.a(this.dW().a($$0));
   }

   @Override
   public bue<cge> dV() {
      return (bue<cge>)super.dV();
   }

   @Override
   protected void Y() {
      super.Y();
      afy.a(this);
   }

   @Override
   public void a(ewh $$0) {
      if (this.dc() && this.bg()) {
         this.a(this.fl(), $$0);
         this.a(bth.a, this.du());
         this.j(this.du().a(0.9));
      } else {
         super.a($$0);
      }
   }

   @Override
   protected void a(cml $$0, bqg $$1, cud $$2) {
      if ($$2.a(cug.qI)) {
         $$0.a($$1, cuf.a($$2, $$0, new cud(cug.qz)));
      } else {
         super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.t() && !this.ai();
   }

   @Nullable
   @Override
   public btc p() {
      return this.N();
   }

   public static boolean a(bsn<? extends btc> $$0, dcv $$1, btg $$2, ja $$3, ayo $$4) {
      return $$1.a_($$3.d()).a(avw.bY);
   }

   public static class a extends bsb.a {
      public final cge.d[] a;

      public a(cge.d... $$0) {
         super(false);
         this.a = $$0;
      }

      public cge.d a(ayo $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class b extends bze {
      public b(final cge $$0, final int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!cge.this.gt()) {
            super.a();
         }
      }
   }

   static class c extends bzf {
      private final cge l;

      public c(cge $$0) {
         super($$0, 85, 10, 0.1F, 0.5F, false);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (!this.l.gt()) {
            super.a();
         }
      }
   }

   public static enum d implements azc {
      a(0, "lucy", true),
      b(1, "wild", true),
      c(2, "gold", true),
      d(3, "cyan", true),
      e(4, "blue", false);

      private static final IntFunction<cge.d> g = aww.a(cge.d::a, values(), aww.a.a);
      public static final Codec<cge.d> f = azc.a(cge.d::values);
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

      public static cge.d a(int $$0) {
         return g.apply($$0);
      }

      public static cge.d a(ayo $$0) {
         return a($$0, true);
      }

      public static cge.d b(ayo $$0) {
         return a($$0, false);
      }

      private static cge.d a(ayo $$0, boolean $$1) {
         cge.d[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.j == $$1).toArray(cge.d[]::new);
         return ac.a($$2, $$0);
      }
   }
}
