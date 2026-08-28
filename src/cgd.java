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

public class cgd extends cer implements bsz, bub<cgd.d>, cet {
   public static final int ca = 200;
   protected static final ImmutableList<? extends cdm<? extends cdl<? super cgd>>> cb = ImmutableList.of(cdm.c, cdm.o, cdm.f, cdm.p, cdm.q);
   protected static final ImmutableList<? extends ccf<?>> cd = ImmutableList.of(
      ccf.r, ccf.g, ccf.h, ccf.k, ccf.l, ccf.n, ccf.m, ccf.E, ccf.t, ccf.o, ccf.p, ccf.K, new ccf[]{ccf.y, ccf.N, ccf.B, ccf.O, ccf.P, ccf.R, ccf.U, ccf.Z}
   );
   private static final ajp<Integer> ch = ajt.a(cgd.class, ajr.b);
   private static final ajp<Boolean> ci = ajt.a(cgd.class, ajr.k);
   private static final ajp<Boolean> cj = ajt.a(cgd.class, ajr.k);
   public static final double ce = 20.0;
   public static final int cf = 1200;
   private static final int ck = 6000;
   public static final String cg = "Variant";
   private static final int cl = 1800;
   private static final int cm = 2400;
   private final Map<String, Vector3f> cn = Maps.newHashMap();
   private static final int co = 100;

   public cgd(bsm<? extends cgd> $$0, dcf $$1) {
      super($$0, $$1);
      this.a(eoy.j, 0.0F);
      this.bR = new cgd.c(this);
      this.bQ = new cgd.b(this, 20);
   }

   @Override
   public Map<String, Vector3f> a() {
      return this.cn;
   }

   @Override
   public float a(ja $$0, dci $$1) {
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
      $$0.a("Variant", this.go().a());
      $$0.a("FromBucket", this.u());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.a(cgd.d.a($$0.h("Variant")));
      this.w($$0.q("FromBucket"));
   }

   @Override
   public void Q() {
      if (!this.gu()) {
         super.Q();
      }
   }

   @Override
   public btu a(dcu $$0, bqe $$1, btf $$2, @Nullable btu $$3) {
      boolean $$4 = false;
      if ($$2 == btf.l) {
         return $$3;
      } else {
         ayo $$5 = $$0.E_();
         if ($$3 instanceof cgd.a) {
            if (((cgd.a)$$3).a() >= 2) {
               $$4 = true;
            }
         } else {
            $$3 = new cgd.a(cgd.d.a($$5), cgd.d.a($$5));
         }

         this.a(((cgd.a)$$3).a($$5));
         if ($$4) {
            this.c_(-24000);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void av() {
      int $$0 = this.cm();
      super.av();
      if (!this.gd()) {
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

   public cgd.d go() {
      return cgd.d.a(this.ao.a(ch));
   }

   public void a(cgd.d $$0) {
      this.ao.a(ch, $$0.a());
   }

   private static boolean a(ayo $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(dci $$0) {
      return $$0.f(this);
   }

   @Override
   public boolean cD() {
      return false;
   }

   public void x(boolean $$0) {
      this.ao.a(ci, $$0);
   }

   public boolean gu() {
      return this.ao.a(ci);
   }

   @Override
   public boolean u() {
      return this.ao.a(cj);
   }

   @Override
   public void w(boolean $$0) {
      this.ao.a(cj, $$0);
   }

   @Nullable
   @Override
   public bsa a(aqm $$0, bsa $$1) {
      cgd $$2 = bsm.f.a((dcf)$$0);
      if ($$2 != null) {
         cgd.d $$3;
         if (a(this.ah)) {
            $$3 = cgd.d.b(this.ah);
         } else {
            $$3 = this.ah.h() ? this.go() : ((cgd)$$1).go();
         }

         $$2.a($$3);
         $$2.fR();
      }

      return $$2;
   }

   @Override
   public boolean o(cuc $$0) {
      return $$0.a(awf.ay);
   }

   @Override
   public boolean a(cmk $$0) {
      return true;
   }

   @Override
   protected void Z() {
      this.dQ().ag().a("axolotlBrain");
      this.dU().a((aqm)this.dQ(), this);
      this.dQ().ag().c();
      this.dQ().ag().a("axolotlActivityUpdate");
      cge.a(this);
      this.dQ().ag().c();
      if (!this.gd()) {
         Optional<Integer> $$0 = this.dU().c(ccf.N);
         this.x($$0.isPresent() && $$0.get() > 0);
      }
   }

   public static bui.a gv() {
      return btd.A().a(buj.s, 14.0).a(buj.v, 1.0).a(buj.c, 2.0).a(buj.B, 1.0);
   }

   @Override
   protected ccn b(dcf $$0) {
      return new cck(this, $$0);
   }

   @Override
   public void gh() {
      this.a(avh.aK, 1.0F, 1.0F);
   }

   @Override
   public boolean a(bqz $$0, float $$1) {
      float $$2 = this.ex();
      if (!this.dQ().B
         && !this.gd()
         && this.dQ().z.a(3) == 0
         && ((float)this.dQ().z.a(3) < $$1 || $$2 / this.eO() < 0.5F)
         && $$1 < $$2
         && this.bf()
         && ($$0.d() != null || $$0.c() != null)
         && !this.gu()) {
         this.bF.a(ccf.N, 200);
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
   public bqg b(cmk $$0, bqf $$1) {
      return cet.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void n(cuc $$0) {
      cet.a(this, $$0);
      cwq.a(kn.N, $$0, $$0x -> {
         $$0x.a("Variant", this.go().a());
         $$0x.a("Age", this.g());
         bud<?> $$1 = this.dU();
         if ($$1.a(ccf.U)) {
            $$0x.a("HuntingCooldown", $$1.e(ccf.U));
         }
      });
   }

   @Override
   public void c(tx $$0) {
      cet.a(this, $$0);
      this.a(cgd.d.a($$0.h("Variant")));
      if ($$0.e("Age")) {
         this.c_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.dU().a(ccf.U, true, $$0.i("HuntingCooldown"));
      }
   }

   @Override
   public cuc b() {
      return new cuc(cuf.qJ);
   }

   @Override
   public avg y() {
      return avh.dj;
   }

   @Override
   public boolean eq() {
      return !this.gu() && super.eq();
   }

   public static void a(cgd $$0, btb $$1) {
      dcf $$2 = $$0.dQ();
      if ($$1.ey()) {
         bqz $$3 = $$1.ez();
         if ($$3 != null) {
            bsg $$4 = $$3.d();
            if ($$4 != null && $$4.al() == bsm.by) {
               cmk $$5 = (cmk)$$4;
               List<cmk> $$6 = $$2.a(cmk.class, $$0.cL().g(20.0));
               if ($$6.contains($$5)) {
                  $$0.f($$5);
               }
            }
         }
      }
   }

   public void f(cmk $$0) {
      bro $$1 = $$0.c(brq.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.d() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new bro(brq.j, $$3, 0), this);
      }

      $$0.e(brq.d);
   }

   @Override
   public boolean W() {
      return super.W() || this.u();
   }

   @Override
   protected avg d(bqz $$0) {
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
      return this.bf() ? avh.aO : avh.aN;
   }

   @Override
   protected avg aR() {
      return avh.aP;
   }

   @Override
   protected avg aQ() {
      return avh.aQ;
   }

   @Override
   protected bud.b<cgd> dV() {
      return bud.a(cd, cb);
   }

   @Override
   protected bud<?> a(Dynamic<?> $$0) {
      return cge.a(this.dV().a($$0));
   }

   @Override
   public bud<cgd> dU() {
      return (bud<cgd>)super.dU();
   }

   @Override
   protected void Y() {
      super.Y();
      afy.a(this);
   }

   @Override
   public void a(ewf $$0) {
      if (this.db() && this.bf()) {
         this.a(this.fk(), $$0);
         this.a(btg.a, this.dt());
         this.i(this.dt().a(0.9));
      } else {
         super.a($$0);
      }
   }

   @Override
   protected void a(cmk $$0, bqf $$1, cuc $$2) {
      if ($$2.a(cuf.qI)) {
         $$0.a($$1, cue.a($$2, $$0, new cuc(cuf.qz)));
      } else {
         super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.u() && !this.ah();
   }

   @Nullable
   @Override
   public btb p() {
      return this.N();
   }

   public static boolean a(bsm<? extends btb> $$0, dcu $$1, btf $$2, ja $$3, ayo $$4) {
      return $$1.a_($$3.d()).a(avw.bY);
   }

   public static class a extends bsa.a {
      public final cgd.d[] a;

      public a(cgd.d... $$0) {
         super(false);
         this.a = $$0;
      }

      public cgd.d a(ayo $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class b extends bzd {
      public b(final cgd $$0, final int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!cgd.this.gu()) {
            super.a();
         }
      }
   }

   static class c extends bze {
      private final cgd l;

      public c(cgd $$0) {
         super($$0, 85, 10, 0.1F, 0.5F, false);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (!this.l.gu()) {
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

      private static final IntFunction<cgd.d> g = aww.a(cgd.d::a, values(), aww.a.a);
      public static final Codec<cgd.d> f = azc.a(cgd.d::values);
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

      public static cgd.d a(int $$0) {
         return g.apply($$0);
      }

      public static cgd.d a(ayo $$0) {
         return a($$0, true);
      }

      public static cgd.d b(ayo $$0) {
         return a($$0, false);
      }

      private static cgd.d a(ayo $$0, boolean $$1) {
         cgd.d[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.j == $$1).toArray(cgd.d[]::new);
         return ac.a($$2, $$0);
      }
   }
}
