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

public class cga extends ceo implements bsw, bty<cga.d>, ceq {
   public static final int ca = 200;
   protected static final ImmutableList<? extends cdj<? extends cdi<? super cga>>> cb = ImmutableList.of(cdj.c, cdj.o, cdj.f, cdj.p, cdj.q);
   protected static final ImmutableList<? extends ccc<?>> cd = ImmutableList.of(
      ccc.r, ccc.g, ccc.h, ccc.k, ccc.l, ccc.n, ccc.m, ccc.E, ccc.t, ccc.o, ccc.p, ccc.K, new ccc[]{ccc.y, ccc.N, ccc.B, ccc.O, ccc.P, ccc.R, ccc.U, ccc.Z}
   );
   private static final ajp<Integer> ch = ajt.a(cga.class, ajr.b);
   private static final ajp<Boolean> ci = ajt.a(cga.class, ajr.k);
   private static final ajp<Boolean> cj = ajt.a(cga.class, ajr.k);
   public static final double ce = 20.0;
   public static final int cf = 1200;
   private static final int ck = 6000;
   public static final String cg = "Variant";
   private static final int cl = 1800;
   private static final int cm = 2400;
   private final Map<String, Vector3f> cn = Maps.newHashMap();
   private static final int co = 100;

   public cga(bsj<? extends cga> $$0, dcd $$1) {
      super($$0, $$1);
      this.a(eos.j, 0.0F);
      this.bR = new cga.c(this);
      this.bQ = new cga.b(this, 20);
   }

   @Override
   public Map<String, Vector3f> a() {
      return this.cn;
   }

   @Override
   public float a(ja $$0, dcg $$1) {
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
      $$0.a("FromBucket", this.u());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.a(cga.d.a($$0.h("Variant")));
      this.w($$0.q("FromBucket"));
   }

   @Override
   public void Q() {
      if (!this.gt()) {
         super.Q();
      }
   }

   @Override
   public btr a(dcs $$0, bqb $$1, btc $$2, @Nullable btr $$3) {
      boolean $$4 = false;
      if ($$2 == btc.l) {
         return $$3;
      } else {
         aym $$5 = $$0.E_();
         if ($$3 instanceof cga.a) {
            if (((cga.a)$$3).a() >= 2) {
               $$4 = true;
            }
         } else {
            $$3 = new cga.a(cga.d.a($$5), cga.d.a($$5));
         }

         this.a(((cga.a)$$3).a($$5));
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
      if (!this.gc()) {
         this.t($$0);
      }
   }

   protected void t(int $$0) {
      if (this.bD() && !this.bg()) {
         this.j($$0 - 1);
         if (this.cl() == -20) {
            this.j(0);
            this.a(this.dQ().s(), 2.0F);
         }
      } else {
         this.j(this.ck());
      }
   }

   @Override
   public void s() {
      int $$0 = this.cl() + 1800;
      this.j(Math.min($$0, this.ck()));
   }

   @Override
   public int ck() {
      return 6000;
   }

   public cga.d gn() {
      return cga.d.a(this.ao.a(ch));
   }

   public void a(cga.d $$0) {
      this.ao.a(ch, $$0.a());
   }

   private static boolean a(aym $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(dcg $$0) {
      return $$0.f(this);
   }

   @Override
   public boolean cC() {
      return false;
   }

   public void x(boolean $$0) {
      this.ao.a(ci, $$0);
   }

   public boolean gt() {
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
   public brx a(aqk $$0, brx $$1) {
      cga $$2 = bsj.f.a((dcd)$$0);
      if ($$2 != null) {
         cga.d $$3;
         if (a(this.ah)) {
            $$3 = cga.d.b(this.ah);
         } else {
            $$3 = this.ah.h() ? this.gn() : ((cga)$$1).gn();
         }

         $$2.a($$3);
         $$2.fQ();
      }

      return $$2;
   }

   @Override
   public boolean o(cua $$0) {
      return $$0.a(awd.ay);
   }

   @Override
   public boolean a(cmh $$0) {
      return true;
   }

   @Override
   protected void Z() {
      this.dP().ag().a("axolotlBrain");
      this.dT().a((aqk)this.dP(), this);
      this.dP().ag().c();
      this.dP().ag().a("axolotlActivityUpdate");
      cgb.a(this);
      this.dP().ag().c();
      if (!this.gc()) {
         Optional<Integer> $$0 = this.dT().c(ccc.N);
         this.x($$0.isPresent() && $$0.get() > 0);
      }
   }

   public static buf.a gu() {
      return bta.A().a(bug.s, 14.0).a(bug.v, 1.0).a(bug.c, 2.0).a(bug.B, 1.0);
   }

   @Override
   protected cck b(dcd $$0) {
      return new cch(this, $$0);
   }

   @Override
   public void gg() {
      this.a(avf.aK, 1.0F, 1.0F);
   }

   @Override
   public boolean a(bqw $$0, float $$1) {
      float $$2 = this.ew();
      if (!this.dP().B
         && !this.gc()
         && this.dP().z.a(3) == 0
         && ((float)this.dP().z.a(3) < $$1 || $$2 / this.eN() < 0.5F)
         && $$1 < $$2
         && this.be()
         && ($$0.d() != null || $$0.c() != null)
         && !this.gt()) {
         this.bF.a(ccc.N, 200);
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
   public bqd b(cmh $$0, bqc $$1) {
      return ceq.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void n(cua $$0) {
      ceq.a(this, $$0);
      cwo.a(kn.N, $$0, $$0x -> {
         $$0x.a("Variant", this.gn().a());
         $$0x.a("Age", this.g());
         bua<?> $$1 = this.dT();
         if ($$1.a(ccc.U)) {
            $$0x.a("HuntingCooldown", $$1.e(ccc.U));
         }
      });
   }

   @Override
   public void c(tx $$0) {
      ceq.a(this, $$0);
      this.a(cga.d.a($$0.h("Variant")));
      if ($$0.e("Age")) {
         this.c_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.dT().a(ccc.U, true, $$0.i("HuntingCooldown"));
      }
   }

   @Override
   public cua b() {
      return new cua(cud.qJ);
   }

   @Override
   public ave y() {
      return avf.dj;
   }

   @Override
   public boolean ep() {
      return !this.gt() && super.ep();
   }

   public static void a(cga $$0, bsy $$1) {
      dcd $$2 = $$0.dP();
      if ($$1.ex()) {
         bqw $$3 = $$1.ey();
         if ($$3 != null) {
            bsd $$4 = $$3.d();
            if ($$4 != null && $$4.ak() == bsj.by) {
               cmh $$5 = (cmh)$$4;
               List<cmh> $$6 = $$2.a(cmh.class, $$0.cK().g(20.0));
               if ($$6.contains($$5)) {
                  $$0.f($$5);
               }
            }
         }
      }
   }

   public void f(cmh $$0) {
      brl $$1 = $$0.c(brn.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.d() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new brl(brn.j, $$3, 0), this);
      }

      $$0.e(brn.d);
   }

   @Override
   public boolean W() {
      return super.W() || this.u();
   }

   @Override
   protected ave d(bqw $$0) {
      return avf.aM;
   }

   @Nullable
   @Override
   protected ave o_() {
      return avf.aL;
   }

   @Nullable
   @Override
   protected ave v() {
      return this.be() ? avf.aO : avf.aN;
   }

   @Override
   protected ave aQ() {
      return avf.aP;
   }

   @Override
   protected ave aP() {
      return avf.aQ;
   }

   @Override
   protected bua.b<cga> dU() {
      return bua.a(cd, cb);
   }

   @Override
   protected bua<?> a(Dynamic<?> $$0) {
      return cgb.a(this.dU().a($$0));
   }

   @Override
   public bua<cga> dT() {
      return (bua<cga>)super.dT();
   }

   @Override
   protected void Y() {
      super.Y();
      afy.a(this);
   }

   @Override
   public void a(evz $$0) {
      if (this.da() && this.be()) {
         this.a(this.fj(), $$0);
         this.a(btd.a, this.ds());
         this.h(this.ds().a(0.9));
      } else {
         super.a($$0);
      }
   }

   @Override
   protected void a(cmh $$0, bqc $$1, cua $$2) {
      if ($$2.a(cud.qI)) {
         $$0.a($$1, new cua(cud.qz));
      } else {
         super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.u() && !this.ag();
   }

   @Nullable
   @Override
   public bsy p() {
      return this.N();
   }

   public static boolean a(bsj<? extends bsy> $$0, dcs $$1, btc $$2, ja $$3, aym $$4) {
      return $$1.a_($$3.d()).a(avu.bY);
   }

   public static class a extends brx.a {
      public final cga.d[] a;

      public a(cga.d... $$0) {
         super(false);
         this.a = $$0;
      }

      public cga.d a(aym $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class b extends bza {
      public b(final cga $$0, final int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!cga.this.gt()) {
            super.a();
         }
      }
   }

   static class c extends bzb {
      private final cga l;

      public c(cga $$0) {
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

   public static enum d implements ayz {
      a(0, "lucy", true),
      b(1, "wild", true),
      c(2, "gold", true),
      d(3, "cyan", true),
      e(4, "blue", false);

      private static final IntFunction<cga.d> g = awu.a(cga.d::a, values(), awu.a.a);
      public static final Codec<cga.d> f = ayz.a(cga.d::values);
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

      public static cga.d a(int $$0) {
         return g.apply($$0);
      }

      public static cga.d a(aym $$0) {
         return a($$0, true);
      }

      public static cga.d b(aym $$0) {
         return a($$0, false);
      }

      private static cga.d a(aym $$0, boolean $$1) {
         cga.d[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.j == $$1).toArray(cga.d[]::new);
         return ac.a($$2, $$0);
      }
   }
}
