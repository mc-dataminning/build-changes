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

public class cdu extends cci implements bqr, brs<cdu.d>, cck {
   public static final int bX = 200;
   protected static final ImmutableList<? extends cbd<? extends cbc<? super cdu>>> bY = ImmutableList.of(cbd.c, cbd.o, cbd.f, cbd.p, cbd.q);
   protected static final ImmutableList<? extends bzw<?>> ca = ImmutableList.of(
      bzw.r, bzw.g, bzw.h, bzw.k, bzw.l, bzw.n, bzw.m, bzw.E, bzw.t, bzw.o, bzw.p, bzw.K, new bzw[]{bzw.y, bzw.N, bzw.B, bzw.O, bzw.P, bzw.R, bzw.U, bzw.Z}
   );
   private static final aja<Integer> ce = aje.a(cdu.class, ajc.b);
   private static final aja<Boolean> cf = aje.a(cdu.class, ajc.k);
   private static final aja<Boolean> cg = aje.a(cdu.class, ajc.k);
   public static final double cb = 20.0;
   public static final int cc = 1200;
   private static final int ch = 6000;
   public static final String cd = "Variant";
   private static final int ci = 1800;
   private static final int cj = 2400;
   private final Map<String, Vector3f> ck = Maps.newHashMap();
   private static final int cl = 100;

   public cdu(bqg<? extends cdu> $$0, czg $$1) {
      super($$0, $$1);
      this.a(els.j, 0.0F);
      this.bO = new cdu.c(this);
      this.bN = new cdu.b(this, 20);
   }

   @Override
   public Map<String, Vector3f> a() {
      return this.ck;
   }

   @Override
   public float a(id $$0, czj $$1) {
      return 0.0F;
   }

   @Override
   protected void a(aje.a $$0) {
      super.a($$0);
      $$0.a(ce, 0);
      $$0.a(cf, false);
      $$0.a(cg, false);
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      $$0.a("Variant", this.gn().a());
      $$0.a("FromBucket", this.u());
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      this.a(cdu.d.a($$0.h("Variant")));
      this.w($$0.q("FromBucket"));
   }

   @Override
   public void P() {
      if (!this.gt()) {
         super.P();
      }
   }

   @Override
   public brl a(czv $$0, bod $$1, bqx $$2, @Nullable brl $$3) {
      boolean $$4 = false;
      if ($$2 == bqx.l) {
         return $$3;
      } else {
         axt $$5 = $$0.E_();
         if ($$3 instanceof cdu.a) {
            if (((cdu.a)$$3).a() >= 2) {
               $$4 = true;
            }
         } else {
            $$3 = new cdu.a(cdu.d.a($$5), cdu.d.a($$5));
         }

         this.a(((cdu.a)$$3).a($$5));
         if ($$4) {
            this.c_(-24000);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void as() {
      int $$0 = this.ci();
      super.as();
      if (!this.gd()) {
         this.u($$0);
      }
   }

   protected void u(int $$0) {
      if (this.bA() && !this.be()) {
         this.k($$0 - 1);
         if (this.ci() == -20) {
            this.k(0);
            this.a(this.dN().r(), 2.0F);
         }
      } else {
         this.k(this.ch());
      }
   }

   @Override
   public void r() {
      int $$0 = this.ci() + 1800;
      this.k(Math.min($$0, this.ch()));
   }

   @Override
   public int ch() {
      return 6000;
   }

   public cdu.d gn() {
      return cdu.d.a(this.an.a(ce));
   }

   public void a(cdu.d $$0) {
      this.an.a(ce, $$0.a());
   }

   private static boolean a(axt $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(czj $$0) {
      return $$0.f(this);
   }

   @Override
   public boolean cz() {
      return false;
   }

   public void x(boolean $$0) {
      this.an.a(cf, $$0);
   }

   public boolean gt() {
      return this.an.a(cf);
   }

   @Override
   public boolean u() {
      return this.an.a(cg);
   }

   @Override
   public void w(boolean $$0) {
      this.an.a(cg, $$0);
   }

   @Nullable
   @Override
   public bpu a(apu $$0, bpu $$1) {
      cdu $$2 = bqg.f.a((czg)$$0);
      if ($$2 != null) {
         cdu.d $$3;
         if (a(this.ag)) {
            $$3 = cdu.d.b(this.ag);
         } else {
            $$3 = this.ag.h() ? this.gn() : ((cdu)$$1).gn();
         }

         $$2.a($$3);
         $$2.fS();
      }

      return $$2;
   }

   @Override
   public boolean o(crs $$0) {
      return $$0.a(avm.aA);
   }

   @Override
   public boolean a(cka $$0) {
      return true;
   }

   @Override
   protected void Y() {
      this.dM().af().a("axolotlBrain");
      this.dP().a((apu)this.dM(), this);
      this.dM().af().c();
      this.dM().af().a("axolotlActivityUpdate");
      cdv.a(this);
      this.dM().af().c();
      if (!this.gd()) {
         Optional<Integer> $$0 = this.dP().c(bzw.N);
         this.x($$0.isPresent() && $$0.get() > 0);
      }
   }

   public static brz.a gu() {
      return bqv.A().a(bsa.q, 14.0).a(bsa.r, 1.0).a(bsa.c, 2.0).a(bsa.v, 1.0);
   }

   @Override
   protected cae b(czg $$0) {
      return new cab(this, $$0);
   }

   @Override
   public boolean C(bqa $$0) {
      boolean $$1 = $$0.a(this.dN().b((bqt)this), (float)((int)this.g(bsa.c)));
      if ($$1) {
         this.a(this, $$0);
         this.a(auo.aK, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public boolean a(boy $$0, float $$1) {
      float $$2 = this.ex();
      if (!this.dM().B
         && !this.gd()
         && this.dM().z.a(3) == 0
         && ((float)this.dM().z.a(3) < $$1 || $$2 / this.eO() < 0.5F)
         && $$1 < $$2
         && this.bc()
         && ($$0.d() != null || $$0.c() != null)
         && !this.gt()) {
         this.bC.a(bzw.N, 200);
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
   public bof b(cka $$0, boe $$1) {
      return cck.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void n(crs $$0) {
      cck.a(this, $$0);
      cuc.a(jr.E, $$0, $$0x -> {
         $$0x.a("Variant", this.gn().a());
         $$0x.a("Age", this.g());
         bru<?> $$1 = this.dP();
         if ($$1.a(bzw.U)) {
            $$0x.a("HuntingCooldown", $$1.e(bzw.U));
         }
      });
   }

   @Override
   public void c(to $$0) {
      cck.a(this, $$0);
      this.a(cdu.d.a($$0.h("Variant")));
      if ($$0.e("Age")) {
         this.c_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.dP().a(bzw.U, true, $$0.i("HuntingCooldown"));
      }
   }

   @Override
   public crs b() {
      return new crs(crv.qI);
   }

   @Override
   public aun y() {
      return auo.dj;
   }

   @Override
   public boolean eq() {
      return !this.gt() && super.eq();
   }

   public static void a(cdu $$0, bqt $$1) {
      czg $$2 = $$0.dM();
      if ($$1.ey()) {
         boy $$3 = $$1.ez();
         if ($$3 != null) {
            bqa $$4 = $$3.d();
            if ($$4 != null && $$4.ai() == bqg.bx) {
               cka $$5 = (cka)$$4;
               List<cka> $$6 = $$2.a(cka.class, $$0.cH().g(20.0));
               if ($$6.contains($$5)) {
                  $$0.f($$5);
               }
            }
         }
      }
   }

   public void f(cka $$0) {
      bpm $$1 = $$0.c(bpo.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.c() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new bpm(bpo.j, $$3, 0), this);
      }

      $$0.e(bpo.d);
   }

   @Override
   public boolean V() {
      return super.V() || this.u();
   }

   @Override
   protected aun d(boy $$0) {
      return auo.aM;
   }

   @Nullable
   @Override
   protected aun o_() {
      return auo.aL;
   }

   @Nullable
   @Override
   protected aun v() {
      return this.bc() ? auo.aO : auo.aN;
   }

   @Override
   protected aun aO() {
      return auo.aP;
   }

   @Override
   protected aun aN() {
      return auo.aQ;
   }

   @Override
   protected bru.b<cdu> dQ() {
      return bru.a(ca, bY);
   }

   @Override
   protected bru<?> a(Dynamic<?> $$0) {
      return cdv.a(this.dQ().a($$0));
   }

   @Override
   public bru<cdu> dP() {
      return (bru<cdu>)super.dP();
   }

   @Override
   protected void X() {
      super.X();
      afk.a(this);
   }

   @Override
   public void a(esj $$0) {
      if (this.cX() && this.bc()) {
         this.a(this.fk(), $$0);
         this.a(bqy.a, this.dp());
         this.g(this.dp().a(0.9));
      } else {
         super.a($$0);
      }
   }

   @Override
   protected void a(cka $$0, boe $$1, crs $$2) {
      if ($$2.a(crv.qH)) {
         $$0.a($$1, new crs(crv.qy));
      } else {
         super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.u() && !this.ae();
   }

   public static boolean a(bqg<? extends bqt> $$0, czv $$1, bqx $$2, id $$3, axt $$4) {
      return $$1.a_($$3.d()).a(ave.bS);
   }

   public static class a extends bpu.a {
      public final cdu.d[] a;

      public a(cdu.d... $$0) {
         super(false);
         this.a = $$0;
      }

      public cdu.d a(axt $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class b extends bwu {
      public b(cdu $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!cdu.this.gt()) {
            super.a();
         }
      }
   }

   static class c extends bwv {
      private final cdu l;

      public c(cdu $$0) {
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

   public static enum d implements ayg {
      a(0, "lucy", true),
      b(1, "wild", true),
      c(2, "gold", true),
      d(3, "cyan", true),
      e(4, "blue", false);

      private static final IntFunction<cdu.d> g = awd.a(cdu.d::a, values(), awd.a.a);
      public static final Codec<cdu.d> f = ayg.a(cdu.d::values);
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

      public static cdu.d a(int $$0) {
         return g.apply($$0);
      }

      public static cdu.d a(axt $$0) {
         return a($$0, true);
      }

      public static cdu.d b(axt $$0) {
         return a($$0, false);
      }

      private static cdu.d a(axt $$0, boolean $$1) {
         cdu.d[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.j == $$1).toArray(cdu.d[]::new);
         return ac.a($$2, $$0);
      }
   }
}
