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

public class cgo extends cfc implements btj, bum<cgo.d>, cfe {
   public static final int ca = 200;
   protected static final ImmutableList<? extends cdx<? extends cdw<? super cgo>>> cb = ImmutableList.of(cdx.c, cdx.o, cdx.f, cdx.p, cdx.q);
   protected static final ImmutableList<? extends ccq<?>> cc = ImmutableList.of(
      ccq.r, ccq.g, ccq.h, ccq.k, ccq.l, ccq.n, ccq.m, ccq.E, ccq.t, ccq.o, ccq.p, ccq.K, new ccq[]{ccq.y, ccq.N, ccq.B, ccq.O, ccq.P, ccq.R, ccq.U, ccq.Z}
   );
   private static final ajv<Integer> ch = ajz.a(cgo.class, ajx.b);
   private static final ajv<Boolean> ci = ajz.a(cgo.class, ajx.k);
   private static final ajv<Boolean> cj = ajz.a(cgo.class, ajx.k);
   public static final double ce = 20.0;
   public static final int cf = 1200;
   private static final int ck = 6000;
   public static final String cg = "Variant";
   private static final int cl = 1800;
   private static final int cm = 2400;
   private final Map<String, Vector3f> cn = Maps.newHashMap();
   private static final int co = 100;

   public cgo(bsw<? extends cgo> $$0, dcu $$1) {
      super($$0, $$1);
      this.a(epp.j, 0.0F);
      this.bR = new cgo.c(this);
      this.bQ = new cgo.b(this, 20);
   }

   @Override
   public Map<String, Vector3f> a() {
      return this.cn;
   }

   @Override
   public float a(jd $$0, dcx $$1) {
      return 0.0F;
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(ch, 0);
      $$0.a(ci, false);
      $$0.a(cj, false);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Variant", this.gm().a());
      $$0.a("FromBucket", this.t());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.a(cgo.d.a($$0.h("Variant")));
      this.w($$0.q("FromBucket"));
   }

   @Override
   public void Q() {
      if (!this.gn()) {
         super.Q();
      }
   }

   @Override
   public buf a(ddj $$0, bqo $$1, btp $$2, @Nullable buf $$3) {
      boolean $$4 = false;
      if ($$2 == btp.l) {
         return $$3;
      } else {
         ayv $$5 = $$0.E_();
         if ($$3 instanceof cgo.a) {
            if (((cgo.a)$$3).a() >= 2) {
               $$4 = true;
            }
         } else {
            $$3 = new cgo.a(cgo.d.a($$5), cgo.d.a($$5));
         }

         this.a(((cgo.a)$$3).a($$5));
         if ($$4) {
            this.c_(-24000);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void aw() {
      int $$0 = this.cm();
      super.aw();
      if (!this.gb()) {
         this.t($$0);
      }
   }

   protected void t(int $$0) {
      if (this.bE() && !this.bh()) {
         this.j($$0 - 1);
         if (this.cm() == -20) {
            this.j(0);
            this.a(this.dR().s(), 2.0F);
         }
      } else {
         this.j(this.cl());
      }
   }

   @Override
   public void s() {
      int $$0 = this.cm() + 1800;
      this.j(Math.min($$0, this.cl()));
   }

   @Override
   public int cl() {
      return 6000;
   }

   public cgo.d gm() {
      return cgo.d.a(this.ao.a(ch));
   }

   public void a(cgo.d $$0) {
      this.ao.a(ch, $$0.a());
   }

   private static boolean a(ayv $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(dcx $$0) {
      return $$0.f(this);
   }

   @Override
   public boolean cD() {
      return false;
   }

   public void x(boolean $$0) {
      this.ao.a(ci, $$0);
   }

   public boolean gn() {
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
   public bsk a(aqt $$0, bsk $$1) {
      cgo $$2 = bsw.f.a((dcu)$$0);
      if ($$2 != null) {
         cgo.d $$3;
         if (a(this.ah)) {
            $$3 = cgo.d.b(this.ah);
         } else {
            $$3 = this.ah.h() ? this.gm() : ((cgo)$$1).gm();
         }

         $$2.a($$3);
         $$2.fP();
      }

      return $$2;
   }

   @Override
   public boolean o(cuo $$0) {
      return $$0.a(awm.ay);
   }

   @Override
   public boolean a(cmv $$0) {
      return true;
   }

   @Override
   protected void Z() {
      this.dQ().ag().a("axolotlBrain");
      this.dU().a((aqt)this.dQ(), this);
      this.dQ().ag().c();
      this.dQ().ag().a("axolotlActivityUpdate");
      cgp.a(this);
      this.dQ().ag().c();
      if (!this.gb()) {
         Optional<Integer> $$0 = this.dU().c(ccq.N);
         this.x($$0.isPresent() && $$0.get() > 0);
      }
   }

   public static but.a go() {
      return btn.A().a(buu.s, 14.0).a(buu.v, 1.0).a(buu.c, 2.0).a(buu.B, 1.0);
   }

   @Override
   protected ccy b(dcu $$0) {
      return new ccv(this, $$0);
   }

   @Override
   public void gf() {
      this.a(avo.aK, 1.0F, 1.0F);
   }

   @Override
   public boolean a(brj $$0, float $$1) {
      float $$2 = this.ex();
      if (!this.dQ().B
         && !this.gb()
         && this.dQ().z.a(3) == 0
         && ((float)this.dQ().z.a(3) < $$1 || $$2 / this.eO() < 0.5F)
         && $$1 < $$2
         && this.bf()
         && ($$0.d() != null || $$0.c() != null)
         && !this.gn()) {
         this.bF.a(ccq.N, 200);
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
   public bqq b(cmv $$0, bqp $$1) {
      return cfe.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void n(cuo $$0) {
      cfe.a(this, $$0);
      cxf.a(kq.N, $$0, $$0x -> {
         $$0x.a("Variant", this.gm().a());
         $$0x.a("Age", this.g());
         buo<?> $$1 = this.dU();
         if ($$1.a(ccq.U)) {
            $$0x.a("HuntingCooldown", $$1.e(ccq.U));
         }
      });
   }

   @Override
   public void c(ua $$0) {
      cfe.a(this, $$0);
      this.a(cgo.d.a($$0.h("Variant")));
      if ($$0.e("Age")) {
         this.c_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.dU().a(ccq.U, true, $$0.i("HuntingCooldown"));
      }
   }

   @Override
   public cuo b() {
      return new cuo(cur.qJ);
   }

   @Override
   public avn x() {
      return avo.dj;
   }

   @Override
   public boolean eq() {
      return !this.gn() && super.eq();
   }

   public static void a(cgo $$0, btl $$1) {
      dcu $$2 = $$0.dQ();
      if ($$1.ey()) {
         brj $$3 = $$1.ez();
         if ($$3 != null) {
            bsq $$4 = $$3.d();
            if ($$4 != null && $$4.am() == bsw.by) {
               cmv $$5 = (cmv)$$4;
               List<cmv> $$6 = $$2.a(cmv.class, $$0.cL().g(20.0));
               if ($$6.contains($$5)) {
                  $$0.f($$5);
               }
            }
         }
      }
   }

   public void f(cmv $$0) {
      bry $$1 = $$0.c(bsa.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.d() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new bry(bsa.j, $$3, 0), this);
      }

      $$0.e(bsa.d);
   }

   @Override
   public boolean W() {
      return super.W() || this.t();
   }

   @Override
   protected avn d(brj $$0) {
      return avo.aM;
   }

   @Nullable
   @Override
   protected avn n_() {
      return avo.aL;
   }

   @Nullable
   @Override
   protected avn v() {
      return this.bf() ? avo.aO : avo.aN;
   }

   @Override
   protected avn aR() {
      return avo.aP;
   }

   @Override
   protected avn aQ() {
      return avo.aQ;
   }

   @Override
   protected buo.b<cgo> dV() {
      return buo.a(cc, cb);
   }

   @Override
   protected buo<?> a(Dynamic<?> $$0) {
      return cgp.a(this.dV().a($$0));
   }

   @Override
   public buo<cgo> dU() {
      return (buo<cgo>)super.dU();
   }

   @Override
   protected void Y() {
      super.Y();
      age.a(this);
   }

   @Override
   public void a(eww $$0) {
      if (this.db() && this.bf()) {
         this.a(this.fk(), $$0);
         this.a(btq.a, this.dt());
         this.i(this.dt().a(0.9));
      } else {
         super.a($$0);
      }
   }

   @Override
   protected void a(cmv $$0, bqp $$1, cuo $$2) {
      if ($$2.a(cur.qI)) {
         $$0.a($$1, cuq.a($$2, $$0, new cuo(cur.qz)));
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
   public btl p() {
      return this.N();
   }

   public static boolean a(bsw<? extends btl> $$0, ddj $$1, btp $$2, jd $$3, ayv $$4) {
      return $$1.a_($$3.d()).a(awd.bY);
   }

   public static class a extends bsk.a {
      public final cgo.d[] a;

      public a(cgo.d... $$0) {
         super(false);
         this.a = $$0;
      }

      public cgo.d a(ayv $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class b extends bzo {
      public b(final cgo $$0, final int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!cgo.this.gn()) {
            super.a();
         }
      }
   }

   static class c extends bzp {
      private final cgo l;

      public c(cgo $$0) {
         super($$0, 85, 10, 0.1F, 0.5F, false);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (!this.l.gn()) {
            super.a();
         }
      }
   }

   public static enum d implements azj {
      a(0, "lucy", true),
      b(1, "wild", true),
      c(2, "gold", true),
      d(3, "cyan", true),
      e(4, "blue", false);

      private static final IntFunction<cgo.d> g = axd.a(cgo.d::a, values(), axd.a.a);
      public static final Codec<cgo.d> f = azj.a(cgo.d::values);
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

      public static cgo.d a(int $$0) {
         return g.apply($$0);
      }

      public static cgo.d a(ayv $$0) {
         return a($$0, true);
      }

      public static cgo.d b(ayv $$0) {
         return a($$0, false);
      }

      private static cgo.d a(ayv $$0, boolean $$1) {
         cgo.d[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.j == $$1).toArray(cgo.d[]::new);
         return ad.a($$2, $$0);
      }
   }
}
