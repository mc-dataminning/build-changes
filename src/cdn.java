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

public class cdn extends ccd implements bqm, brn<cdn.d>, ccf {
   public static final int bX = 200;
   protected static final ImmutableList<? extends cay<? extends cax<? super cdn>>> bY = ImmutableList.of(cay.c, cay.o, cay.f, cay.p, cay.q);
   protected static final ImmutableList<? extends bzr<?>> ca = ImmutableList.of(
      bzr.r, bzr.g, bzr.h, bzr.k, bzr.l, bzr.n, bzr.m, bzr.E, bzr.t, bzr.o, bzr.p, bzr.K, new bzr[]{bzr.y, bzr.N, bzr.B, bzr.O, bzr.P, bzr.R, bzr.U, bzr.Z}
   );
   private static final aiy<Integer> ce = ajc.a(cdn.class, aja.b);
   private static final aiy<Boolean> cf = ajc.a(cdn.class, aja.k);
   private static final aiy<Boolean> cg = ajc.a(cdn.class, aja.k);
   public static final double cb = 20.0;
   public static final int cc = 1200;
   private static final int ch = 6000;
   public static final String cd = "Variant";
   private static final int ci = 1800;
   private static final int cj = 2400;
   private final Map<String, Vector3f> ck = Maps.newHashMap();
   private static final int cl = 100;

   public cdn(bqb<? extends cdn> $$0, cyx $$1) {
      super($$0, $$1);
      this.a(elj.j, 0.0F);
      this.bO = new cdn.c(this);
      this.bN = new cdn.b(this, 20);
   }

   @Override
   public Map<String, Vector3f> a() {
      return this.ck;
   }

   @Override
   public float a(ib $$0, cza $$1) {
      return 0.0F;
   }

   @Override
   protected void a(ajc.a $$0) {
      super.a($$0);
      $$0.a(ce, 0);
      $$0.a(cf, false);
      $$0.a(cg, false);
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      $$0.a("Variant", this.gn().a());
      $$0.a("FromBucket", this.u());
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      this.a(cdn.d.a($$0.h("Variant")));
      this.w($$0.q("FromBucket"));
   }

   @Override
   public void P() {
      if (!this.gt()) {
         super.P();
      }
   }

   @Override
   public brg a(czm $$0, bny $$1, bqs $$2, @Nullable brg $$3) {
      boolean $$4 = false;
      if ($$2 == bqs.l) {
         return $$3;
      } else {
         axr $$5 = $$0.E_();
         if ($$3 instanceof cdn.a) {
            if (((cdn.a)$$3).a() >= 2) {
               $$4 = true;
            }
         } else {
            $$3 = new cdn.a(cdn.d.a($$5), cdn.d.a($$5));
         }

         this.a(((cdn.a)$$3).a($$5));
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

   public cdn.d gn() {
      return cdn.d.a(this.an.a(ce));
   }

   public void a(cdn.d $$0) {
      this.an.a(ce, $$0.a());
   }

   private static boolean a(axr $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(cza $$0) {
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
   public bpp a(aps $$0, bpp $$1) {
      cdn $$2 = bqb.f.a((cyx)$$0);
      if ($$2 != null) {
         cdn.d $$3;
         if (a(this.ag)) {
            $$3 = cdn.d.b(this.ag);
         } else {
            $$3 = this.ag.h() ? this.gn() : ((cdn)$$1).gn();
         }

         $$2.a($$3);
         $$2.fS();
      }

      return $$2;
   }

   @Override
   public boolean o(crj $$0) {
      return $$0.a(avk.aA);
   }

   @Override
   public boolean a(cjt $$0) {
      return true;
   }

   @Override
   protected void Y() {
      this.dM().af().a("axolotlBrain");
      this.dP().a((aps)this.dM(), this);
      this.dM().af().c();
      this.dM().af().a("axolotlActivityUpdate");
      cdo.a(this);
      this.dM().af().c();
      if (!this.gd()) {
         Optional<Integer> $$0 = this.dP().c(bzr.N);
         this.x($$0.isPresent() && $$0.get() > 0);
      }
   }

   public static bru.a gu() {
      return bqq.A().a(brv.q, 14.0).a(brv.r, 1.0).a(brv.c, 2.0).a(brv.v, 1.0);
   }

   @Override
   protected bzz b(cyx $$0) {
      return new bzw(this, $$0);
   }

   @Override
   public boolean C(bpv $$0) {
      boolean $$1 = $$0.a(this.dN().b((bqo)this), (float)((int)this.g(brv.c)));
      if ($$1) {
         this.a(this, $$0);
         this.a(aum.aK, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public boolean a(bot $$0, float $$1) {
      float $$2 = this.ex();
      if (!this.dM().B
         && !this.gd()
         && this.dM().z.a(3) == 0
         && ((float)this.dM().z.a(3) < $$1 || $$2 / this.eO() < 0.5F)
         && $$1 < $$2
         && this.bc()
         && ($$0.d() != null || $$0.c() != null)
         && !this.gt()) {
         this.bC.a(bzr.N, 200);
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
   public boa b(cjt $$0, bnz $$1) {
      return ccf.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void n(crj $$0) {
      ccf.a(this, $$0);
      ctt.a(jp.E, $$0, $$0x -> {
         $$0x.a("Variant", this.gn().a());
         $$0x.a("Age", this.g());
         brp<?> $$1 = this.dP();
         if ($$1.a(bzr.U)) {
            $$0x.a("HuntingCooldown", $$1.e(bzr.U));
         }
      });
   }

   @Override
   public void c(tm $$0) {
      ccf.a(this, $$0);
      this.a(cdn.d.a($$0.h("Variant")));
      if ($$0.e("Age")) {
         this.c_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.dP().a(bzr.U, true, $$0.i("HuntingCooldown"));
      }
   }

   @Override
   public crj b() {
      return new crj(crm.qI);
   }

   @Override
   public aul y() {
      return aum.dj;
   }

   @Override
   public boolean eq() {
      return !this.gt() && super.eq();
   }

   public static void a(cdn $$0, bqo $$1) {
      cyx $$2 = $$0.dM();
      if ($$1.ey()) {
         bot $$3 = $$1.ez();
         if ($$3 != null) {
            bpv $$4 = $$3.d();
            if ($$4 != null && $$4.ai() == bqb.bx) {
               cjt $$5 = (cjt)$$4;
               List<cjt> $$6 = $$2.a(cjt.class, $$0.cH().g(20.0));
               if ($$6.contains($$5)) {
                  $$0.f($$5);
               }
            }
         }
      }
   }

   public void f(cjt $$0) {
      bph $$1 = $$0.c(bpj.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.c() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new bph(bpj.j, $$3, 0), this);
      }

      $$0.e(bpj.d);
   }

   @Override
   public boolean V() {
      return super.V() || this.u();
   }

   @Override
   protected aul d(bot $$0) {
      return aum.aM;
   }

   @Nullable
   @Override
   protected aul o_() {
      return aum.aL;
   }

   @Nullable
   @Override
   protected aul v() {
      return this.bc() ? aum.aO : aum.aN;
   }

   @Override
   protected aul aO() {
      return aum.aP;
   }

   @Override
   protected aul aN() {
      return aum.aQ;
   }

   @Override
   protected brp.b<cdn> dQ() {
      return brp.a(ca, bY);
   }

   @Override
   protected brp<?> a(Dynamic<?> $$0) {
      return cdo.a(this.dQ().a($$0));
   }

   @Override
   public brp<cdn> dP() {
      return (brp<cdn>)super.dP();
   }

   @Override
   protected void X() {
      super.X();
      afi.a(this);
   }

   @Override
   public void a(esa $$0) {
      if (this.cX() && this.bc()) {
         this.a(this.fk(), $$0);
         this.a(bqt.a, this.dp());
         this.g(this.dp().a(0.9));
      } else {
         super.a($$0);
      }
   }

   @Override
   protected void a(cjt $$0, bnz $$1, crj $$2) {
      if ($$2.a(crm.qH)) {
         $$0.a($$1, new crj(crm.qy));
      } else {
         super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.u() && !this.ae();
   }

   public static boolean a(bqb<? extends bqo> $$0, czm $$1, bqs $$2, ib $$3, axr $$4) {
      return $$1.a_($$3.d()).a(avc.bS);
   }

   public static class a extends bpp.a {
      public final cdn.d[] a;

      public a(cdn.d... $$0) {
         super(false);
         this.a = $$0;
      }

      public cdn.d a(axr $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class b extends bwp {
      public b(cdn $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!cdn.this.gt()) {
            super.a();
         }
      }
   }

   static class c extends bwq {
      private final cdn l;

      public c(cdn $$0) {
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

   public static enum d implements aye {
      a(0, "lucy", true),
      b(1, "wild", true),
      c(2, "gold", true),
      d(3, "cyan", true),
      e(4, "blue", false);

      private static final IntFunction<cdn.d> g = awb.a(cdn.d::a, values(), awb.a.a);
      public static final Codec<cdn.d> f = aye.a(cdn.d::values);
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

      public static cdn.d a(int $$0) {
         return g.apply($$0);
      }

      public static cdn.d a(axr $$0) {
         return a($$0, true);
      }

      public static cdn.d b(axr $$0) {
         return a($$0, false);
      }

      private static cdn.d a(axr $$0, boolean $$1) {
         cdn.d[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.j == $$1).toArray(cdn.d[]::new);
         return ac.a($$2, $$0);
      }
   }
}
