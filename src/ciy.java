import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ciy extends bwg implements cpb, ecy {
   private static final Logger bF = LogUtils.getLogger();
   private static final km bG = new km(1, 1, 1);
   private static final int bH = 5;
   private static final float bI = 55.0F;
   private static final float bJ = 15.0F;
   private static final int bK = 6000;
   private static final int bL = 3;
   public static final int a = 1024;
   private static final ajx<Boolean> bM = akb.a(ciy.class, ajz.k);
   private static final ajx<Boolean> bN = akb.a(ciy.class, ajz.k);
   protected static final ImmutableList<cgj<? extends cgi<? super ciy>>> b = ImmutableList.of(cgj.c, cgj.d, cgj.f, cgj.b);
   protected static final ImmutableList<cfc<?>> c = ImmutableList.of(
      cfc.t, cfc.n, cfc.h, cfc.m, cfc.E, cfc.x, cfc.L, cfc.aM, cfc.aN, cfc.aO, cfc.aP, cfc.Z, new cfc[0]
   );
   public static final ImmutableList<Float> d = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final ecm<ecy.b> bO;
   private ecy.a bP;
   private final ecy.d bQ;
   private final ecm<ciy.a> bR;
   private final btf bS = new btf(1);
   @Nullable
   private ji bT;
   private long bU;
   private float bV;
   private float bW;
   private float bX;
   private float bY;
   private float bZ;

   public ciy(bvi<? extends ciy> $$0, dgz $$1) {
      super($$0, $$1);
      this.bz = new cbw(this, 20, true);
      this.a_(this.fP());
      this.bQ = new ciy.b();
      this.bP = new ecy.a();
      this.bO = new ecm<>(new ecy.b(this));
      this.bR = new ecm<>(new ciy.a(this.bQ.b(), ecp.E.a().a()));
   }

   @Override
   protected bxa.b<ciy> eb() {
      return bxa.a(c, b);
   }

   @Override
   protected bxa<?> a(Dynamic<?> $$0) {
      return ciz.a(this.eb().a($$0));
   }

   @Override
   public bxa<ciy> ea() {
      return (bxa<ciy>)super.ea();
   }

   public static bxf.a j() {
      return bwa.E().a(bxg.s, 20.0).a(bxg.l, 0.1F).a(bxg.v, 0.1F).a(bxg.c, 2.0);
   }

   @Override
   protected cfk b(dgz $$0) {
      cfi $$1 = new cfi(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.a(48.0F);
      return $$1;
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(bM, false);
      $$0.a(bN, true);
   }

   @Override
   public void a_(fbx $$0) {
      if (this.bj()) {
         this.a(0.02F, $$0);
         this.a(bwc.a, this.dx());
         this.i(this.dx().c(0.8F));
      } else if (this.bv()) {
         this.a(0.02F, $$0);
         this.a(bwc.a, this.dx());
         this.i(this.dx().c(0.5));
      } else {
         this.a(this.fq(), $$0);
         this.a(bwc.a, this.dx());
         this.i(this.dx().c(0.91F));
      }
   }

   @Override
   public boolean a(ard $$0, btp $$1, float $$2) {
      return this.b($$1.d()) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean t(bva $$0) {
      return this.b($$0) || super.t($$0);
   }

   private boolean b(@Nullable bva $$0) {
      if (!($$0 instanceof cpr $$1)) {
         return false;
      } else {
         Optional<UUID> $$2 = this.ea().c(cfc.aM);
         return $$2.isPresent() && $$1.cF().equals($$2.get());
      }
   }

   @Override
   protected void b(ji $$0, dxq $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, dxq $$2, ji $$3) {
   }

   @Override
   protected avz u() {
      return this.d(bvj.a) ? awa.a : awa.b;
   }

   @Override
   protected avz e(btp $$0) {
      return awa.d;
   }

   @Override
   protected avz l_() {
      return awa.c;
   }

   @Override
   protected float fg() {
      return 0.4F;
   }

   @Override
   protected void a(ard $$0) {
      bpj $$1 = bpi.a();
      $$1.a("allayBrain");
      this.ea().a($$0, this);
      $$1.c();
      $$1.a("allayActivityUpdate");
      ciz.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   public void k_() {
      super.k_();
      if (!this.dU().C && this.bJ() && this.af % 10 == 0) {
         this.c(1.0F);
      }

      if (this.q() && this.gu() && this.af % 20 == 0) {
         this.w(false);
         this.bT = null;
      }

      this.gv();
   }

   @Override
   public void h() {
      super.h();
      if (this.dU().C) {
         this.bW = this.bV;
         if (this.m()) {
            this.bV = ayz.a(this.bV + 1.0F, 0.0F, 5.0F);
         } else {
            this.bV = ayz.a(this.bV - 1.0F, 0.0F, 5.0F);
         }

         if (this.q()) {
            this.bX++;
            this.bZ = this.bY;
            if (this.t()) {
               this.bY++;
            } else {
               this.bY--;
            }

            this.bY = ayz.a(this.bY, 0.0F, 15.0F);
         } else {
            this.bX = 0.0F;
            this.bY = 0.0F;
            this.bZ = 0.0F;
         }
      } else {
         ecy.c.a(this.dU(), this.bP, this.bQ);
         if (this.gp()) {
            this.w(false);
         }
      }
   }

   @Override
   public boolean fP() {
      return !this.gt() && this.m();
   }

   public boolean m() {
      return !this.b(bsx.a).f();
   }

   @Override
   protected boolean f(bvj $$0) {
      return false;
   }

   private boolean gt() {
      return this.ea().a(cfc.aP, cfd.a);
   }

   @Override
   protected bsy b(cpr $$0, bsx $$1) {
      cxh $$2 = $$0.b($$1);
      cxh $$3 = this.b(bsx.a);
      if (this.q() && $$2.a(awy.W) && this.gy()) {
         this.gw();
         this.dU().a(this, (byte)18);
         this.dU().a($$0, this, awa.E, awb.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return bsy.a;
      } else if ($$3.f() && !$$2.f()) {
         cxh $$4 = $$2.c(1);
         this.a(bsx.a, $$4);
         this.a($$0, $$2);
         this.dU().a($$0, this, awa.e, awb.g, 2.0F, 1.0F);
         this.ea().a(cfc.aM, $$0.cF());
         return bsy.a;
      } else if (!$$3.f() && $$1 == bsx.a && $$2.f()) {
         this.a(bvj.a, cxh.k);
         this.dU().a($$0, this, awa.f, awb.g, 2.0F, 1.0F);
         this.a(bsx.a);

         for (cxh $$5 : this.n().f()) {
            bxt.a(this, $$5, this.ds());
         }

         this.ea().b(cfc.aM);
         $$0.i($$3);
         return bsy.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void b(ji $$0, boolean $$1) {
      if ($$1) {
         if (!this.q()) {
            this.bT = $$0;
            this.w(true);
         }
      } else if ($$0.equals(this.bT) || this.bT == null) {
         this.bT = null;
         this.w(false);
      }
   }

   @Override
   public btf n() {
      return this.bS;
   }

   @Override
   protected km X() {
      return bG;
   }

   @Override
   public boolean c(ard $$0, cxh $$1) {
      cxh $$2 = this.b(bsx.a);
      return !$$2.f() && $$0.O().b(dgv.c) && this.bS.c($$1) && this.c($$2, $$1);
   }

   private boolean c(cxh $$0, cxh $$1) {
      return cxh.b($$0, $$1) && !this.d($$0, $$1);
   }

   private boolean d(cxh $$0, cxh $$1) {
      cze $$2 = $$0.a(kv.R);
      cze $$3 = $$1.a(kv.R);
      return !Objects.equals($$2, $$3);
   }

   @Override
   protected void a(ard $$0, clw $$1) {
      cpb.a($$0, this, this, $$1);
   }

   @Override
   protected void ab() {
      super.ab();
      agc.a(this);
   }

   @Override
   public boolean ba() {
      return !this.aJ();
   }

   @Override
   public void a(BiConsumer<ecm<?>, ard> $$0) {
      if (this.dU() instanceof ard $$1) {
         $$0.accept(this.bO, $$1);
         $$0.accept(this.bR, $$1);
      }
   }

   public boolean q() {
      return this.al.a(bM);
   }

   public void w(boolean $$0) {
      if (!this.dU().C && this.di() && (!$$0 || !this.gp())) {
         this.al.a(bM, $$0);
      }
   }

   private boolean gu() {
      return this.bT == null || !this.bT.a(this.ds(), (double)ecp.E.a().a()) || !this.dU().a_(this.bT).a(dkg.eg);
   }

   public float K(float $$0) {
      return ayz.h($$0, this.bW, this.bV) / 5.0F;
   }

   public boolean t() {
      float $$0 = this.bX % 55.0F;
      return $$0 < 15.0F;
   }

   public float L(float $$0) {
      return ayz.h($$0, this.bZ, this.bY) / 15.0F;
   }

   @Override
   public boolean a(cxh $$0, cxh $$1) {
      return !this.c($$0, $$1);
   }

   @Override
   protected void f(ard $$0) {
      super.f($$0);
      this.bS.f().forEach($$1x -> this.a($$0, $$1x));
      cxh $$1 = this.a(bvj.a);
      if (!$$1.f() && !ddt.a($$1, dds.D)) {
         this.a($$0, $$1);
         this.a(bvj.a, cxh.k);
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      this.b($$0, this.dW());
      aks<un> $$1 = this.dW().a(ue.a);
      ecy.a.a
         .encodeStart($$1, this.bP)
         .resultOrPartial($$0x -> bF.error("Failed to encode vibration listener for Allay: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
      $$0.a("DuplicationCooldown", this.bU);
      $$0.a("CanDuplicate", this.gy());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.a($$0, this.dW());
      aks<un> $$1 = this.dW().a(ue.a);
      if ($$0.b("listener", 10)) {
         ecy.a.a
            .parse($$1, $$0.p("listener"))
            .resultOrPartial($$0x -> bF.error("Failed to parse vibration listener for Allay: '{}'", $$0x))
            .ifPresent($$0x -> this.bP = $$0x);
      }

      this.bU = (long)$$0.h("DuplicationCooldown");
      this.al.a(bN, $$0.q("CanDuplicate"));
   }

   @Override
   protected boolean gq() {
      return false;
   }

   private void gv() {
      if (this.bU > 0L) {
         this.bU--;
      }

      if (!this.dU().w_() && this.bU == 0L && !this.gy()) {
         this.al.a(bN, true);
      }
   }

   private void gw() {
      ciy $$0 = bvi.c.a(this.dU(), bvh.e);
      if ($$0 != null) {
         $$0.f(this.ds());
         $$0.ga();
         $$0.gx();
         this.gx();
         this.dU().b($$0);
      }
   }

   private void gx() {
      this.bU = 6000L;
      this.al.a(bN, false);
   }

   private boolean gy() {
      return this.al.a(bN);
   }

   private void a(cpr $$0, cxh $$1) {
      $$1.a(1, $$0);
   }

   @Override
   public fbx cS() {
      return new fbx(0.0, (double)this.cR() * 0.6, (double)this.dp() * 0.1);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 3; $$1++) {
            this.gz();
         }
      } else {
         super.b($$0);
      }
   }

   private void gz() {
      double $$0 = this.ae.k() * 0.02;
      double $$1 = this.ae.k() * 0.02;
      double $$2 = this.ae.k() * 0.02;
      this.dU().a(lt.S, this.d(1.0), this.dC() + 0.5, this.g(1.0), $$0, $$1, $$2);
   }

   @Override
   public ecy.a x() {
      return this.bP;
   }

   @Override
   public ecy.d gs() {
      return this.bQ;
   }

   class a implements ecr {
      private final ect b;
      private final int c;

      public a(final ect $$0, final int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public ect a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(ard $$0, jr<ecp> $$1, ecp.a $$2, fbx $$3) {
         if ($$1.a(ecp.E)) {
            ciy.this.b(ji.a((kb)$$3), true);
            return true;
         } else if ($$1.a(ecp.F)) {
            ciy.this.b(ji.a((kb)$$3), false);
            return true;
         } else {
            return false;
         }
      }
   }

   class b implements ecy.d {
      private static final int b = 16;
      private final ect c = new ecn(ciy.this, ciy.this.cR());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public ect b() {
         return this.c;
      }

      @Override
      public boolean a(ard $$0, ji $$1, jr<ecp> $$2, ecp.a $$3) {
         if (ciy.this.gh()) {
            return false;
         } else {
            Optional<jq> $$4 = ciy.this.ea().c(cfc.aN);
            if ($$4.isEmpty()) {
               return true;
            } else {
               jq $$5 = $$4.get();
               return $$5.a($$0.aj(), ciy.this.du(), 1024) && $$5.b().equals($$1);
            }
         }
      }

      @Override
      public void a(ard $$0, ji $$1, jr<ecp> $$2, @Nullable bva $$3, @Nullable bva $$4, float $$5) {
         if ($$2.a(ecp.H)) {
            ciz.a(ciy.this, new ji($$1));
         }
      }

      @Override
      public axf<ecp> c() {
         return aww.e;
      }
   }
}
