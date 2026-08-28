import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cjp extends bwz implements cps, edv {
   private static final Logger bE = LogUtils.getLogger();
   private static final kn bF = new kn(1, 1, 1);
   private static final int bG = 5;
   private static final float bH = 55.0F;
   private static final float bI = 15.0F;
   private static final int bJ = 6000;
   private static final int bK = 3;
   public static final int a = 1024;
   private static final akg<Boolean> bL = akk.a(cjp.class, aki.k);
   private static final akg<Boolean> bM = akk.a(cjp.class, aki.k);
   protected static final ImmutableList<cha<? extends cgz<? super cjp>>> b = ImmutableList.of(cha.c, cha.d, cha.f, cha.b);
   protected static final ImmutableList<cft<?>> c = ImmutableList.of(
      cft.u, cft.o, cft.h, cft.n, cft.F, cft.y, cft.M, cft.aN, cft.aO, cft.aP, cft.aQ, cft.aa, new cft[0]
   );
   public static final ImmutableList<Float> d = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final edj<edv.b> bN;
   private edv.a bO;
   private final edv.d bP;
   private final edj<cjp.a> bQ;
   private final btx bR = new btx(1);
   @Nullable
   private jj bS;
   private long bT;
   private float bU;
   private float bV;
   private float bW;
   private float bX;
   private float bY;

   public cjp(bwb<? extends cjp> $$0, dhp $$1) {
      super($$0, $$1);
      this.by = new ccn(this, 20, true);
      this.a_(this.fM());
      this.bP = new cjp.b();
      this.bO = new edv.a();
      this.bN = new edj<>(new edv.b(this));
      this.bQ = new edj<>(new cjp.a(this.bP.b(), edm.E.a().a()));
   }

   @Override
   protected bxr.b<cjp> ec() {
      return bxr.a(c, b);
   }

   @Override
   protected bxr<?> a(Dynamic<?> $$0) {
      return cjq.a(this.ec().a($$0));
   }

   @Override
   public bxr<cjp> eb() {
      return (bxr<cjp>)super.eb();
   }

   public static bxw.a j() {
      return bwt.E().a(bxx.s, 20.0).a(bxx.l, 0.1F).a(bxx.v, 0.1F).a(bxx.c, 2.0);
   }

   @Override
   protected cgb b(dhp $$0) {
      cfz $$1 = new cfz(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.a(48.0F);
      return $$1;
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bL, false);
      $$0.a(bM, true);
   }

   @Override
   public void a_(fcu $$0) {
      if (this.bj()) {
         this.a(0.02F, $$0);
         this.a(bwv.a, this.dy());
         this.i(this.dy().c(0.8F));
      } else if (this.bw()) {
         this.a(0.02F, $$0);
         this.a(bwv.a, this.dy());
         this.i(this.dy().c(0.5));
      } else {
         this.a(this.fn(), $$0);
         this.a(bwv.a, this.dy());
         this.i(this.dy().c(0.91F));
      }
   }

   @Override
   public boolean a(arn $$0, buh $$1, float $$2) {
      return this.b($$1.d()) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean t(bvs $$0) {
      return this.b($$0) || super.t($$0);
   }

   private boolean b(@Nullable bvs $$0) {
      if (!($$0 instanceof cqi $$1)) {
         return false;
      } else {
         Optional<UUID> $$2 = this.eb().c(cft.aN);
         return $$2.isPresent() && $$1.cG().equals($$2.get());
      }
   }

   @Override
   protected void b(jj $$0, dym $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, dym $$2, jj $$3) {
   }

   @Override
   protected awj u() {
      return this.d(bwc.a) ? awk.a : awk.b;
   }

   @Override
   protected awj e(buh $$0) {
      return awk.d;
   }

   @Override
   protected awj l_() {
      return awk.c;
   }

   @Override
   protected float fd() {
      return 0.4F;
   }

   @Override
   protected void a(arn $$0) {
      bqb $$1 = bqa.a();
      $$1.a("allayBrain");
      this.eb().a($$0, this);
      $$1.c();
      $$1.a("allayActivityUpdate");
      cjq.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   public void k_() {
      super.k_();
      if (!this.dV().C && this.bK() && this.af % 10 == 0) {
         this.c(1.0F);
      }

      if (this.q() && this.gs() && this.af % 20 == 0) {
         this.w(false);
         this.bS = null;
      }

      this.gt();
   }

   @Override
   public void h() {
      super.h();
      if (this.dV().C) {
         this.bV = this.bU;
         if (this.m()) {
            this.bU = azk.a(this.bU + 1.0F, 0.0F, 5.0F);
         } else {
            this.bU = azk.a(this.bU - 1.0F, 0.0F, 5.0F);
         }

         if (this.q()) {
            this.bW++;
            this.bY = this.bX;
            if (this.t()) {
               this.bX++;
            } else {
               this.bX--;
            }

            this.bX = azk.a(this.bX, 0.0F, 15.0F);
         } else {
            this.bW = 0.0F;
            this.bX = 0.0F;
            this.bY = 0.0F;
         }
      } else {
         edv.c.a(this.dV(), this.bO, this.bP);
         if (this.gn()) {
            this.w(false);
         }
      }
   }

   @Override
   public boolean fM() {
      return !this.gr() && this.m();
   }

   public boolean m() {
      return !this.b(btp.a).f();
   }

   @Override
   protected boolean f(bwc $$0) {
      return false;
   }

   private boolean gr() {
      return this.eb().a(cft.aQ, cfu.a);
   }

   @Override
   protected btq b(cqi $$0, btp $$1) {
      cxy $$2 = $$0.b($$1);
      cxy $$3 = this.b(btp.a);
      if (this.q() && $$2.a(axi.W) && this.gw()) {
         this.gu();
         this.dV().a(this, (byte)18);
         this.dV().a($$0, this, awk.E, awl.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return btq.a;
      } else if ($$3.f() && !$$2.f()) {
         cxy $$4 = $$2.c(1);
         this.a(btp.a, $$4);
         this.a($$0, $$2);
         this.dV().a($$0, this, awk.e, awl.g, 2.0F, 1.0F);
         this.eb().a(cft.aN, $$0.cG());
         return btq.a;
      } else if (!$$3.f() && $$1 == btp.a && $$2.f()) {
         this.a(bwc.a, cxy.k);
         this.dV().a($$0, this, awk.f, awl.g, 2.0F, 1.0F);
         this.a(btp.a);

         for (cxy $$5 : this.n().f()) {
            byk.a(this, $$5, this.dt());
         }

         this.eb().b(cft.aN);
         $$0.j($$3);
         return btq.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void b(jj $$0, boolean $$1) {
      if ($$1) {
         if (!this.q()) {
            this.bS = $$0;
            this.w(true);
         }
      } else if ($$0.equals(this.bS) || this.bS == null) {
         this.bS = null;
         this.w(false);
      }
   }

   @Override
   public btx n() {
      return this.bR;
   }

   @Override
   protected kn X() {
      return bF;
   }

   @Override
   public boolean c(arn $$0, cxy $$1) {
      cxy $$2 = this.b(btp.a);
      return !$$2.f() && $$0.O().c(dhl.c) && this.bR.c($$1) && this.c($$2, $$1);
   }

   private boolean c(cxy $$0, cxy $$1) {
      return cxy.b($$0, $$1) && !this.d($$0, $$1);
   }

   private boolean d(cxy $$0, cxy $$1) {
      czu $$2 = $$0.a(kx.R);
      czu $$3 = $$1.a(kx.R);
      return !Objects.equals($$2, $$3);
   }

   @Override
   protected void a(arn $$0, cmn $$1) {
      cps.a($$0, this, this, $$1);
   }

   @Override
   protected void ab() {
      super.ab();
      agj.a(this);
   }

   @Override
   public boolean ba() {
      return !this.aJ();
   }

   @Override
   public void a(BiConsumer<edj<?>, arn> $$0) {
      if (this.dV() instanceof arn $$1) {
         $$0.accept(this.bN, $$1);
         $$0.accept(this.bQ, $$1);
      }
   }

   public boolean q() {
      return this.al.a(bL);
   }

   public void w(boolean $$0) {
      if (!this.dV().C && this.dj() && (!$$0 || !this.gn())) {
         this.al.a(bL, $$0);
      }
   }

   private boolean gs() {
      return this.bS == null || !this.bS.a(this.dt(), (double)edm.E.a().a()) || !this.dV().a_(this.bS).a(dkw.eg);
   }

   public float K(float $$0) {
      return azk.h($$0, this.bV, this.bU) / 5.0F;
   }

   public boolean t() {
      float $$0 = this.bW % 55.0F;
      return $$0 < 15.0F;
   }

   public float L(float $$0) {
      return azk.h($$0, this.bY, this.bX) / 15.0F;
   }

   @Override
   public boolean a(cxy $$0, cxy $$1) {
      return !this.c($$0, $$1);
   }

   @Override
   protected void f(arn $$0) {
      super.f($$0);
      this.bR.f().forEach($$1x -> this.a($$0, $$1x));
      cxy $$1 = this.a(bwc.a);
      if (!$$1.f() && !dej.a($$1, dei.D)) {
         this.a($$0, $$1);
         this.a(bwc.a, cxy.k);
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      this.b($$0, this.dX());
      alb<ut> $$1 = this.dX().a(uk.a);
      edv.a.a
         .encodeStart($$1, this.bO)
         .resultOrPartial($$0x -> bE.error("Failed to encode vibration listener for Allay: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
      $$0.a("DuplicationCooldown", this.bT);
      $$0.a("CanDuplicate", this.gw());
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      this.a($$0, this.dX());
      alb<ut> $$1 = this.dX().a(uk.a);
      if ($$0.b("listener", 10)) {
         edv.a.a
            .parse($$1, $$0.p("listener"))
            .resultOrPartial($$0x -> bE.error("Failed to parse vibration listener for Allay: '{}'", $$0x))
            .ifPresent($$0x -> this.bO = $$0x);
      }

      this.bT = (long)$$0.h("DuplicationCooldown");
      this.al.a(bM, $$0.q("CanDuplicate"));
   }

   @Override
   protected boolean go() {
      return false;
   }

   private void gt() {
      if (this.bT > 0L) {
         this.bT--;
      }

      if (!this.dV().w_() && this.bT == 0L && !this.gw()) {
         this.al.a(bM, true);
      }
   }

   private void gu() {
      cjp $$0 = bwb.c.a(this.dV(), bwa.e);
      if ($$0 != null) {
         $$0.f(this.dt());
         $$0.fY();
         $$0.gv();
         this.gv();
         this.dV().b($$0);
      }
   }

   private void gv() {
      this.bT = 6000L;
      this.al.a(bM, false);
   }

   private boolean gw() {
      return this.al.a(bM);
   }

   private void a(cqi $$0, cxy $$1) {
      $$1.a(1, $$0);
   }

   @Override
   public fcu cT() {
      return new fcu(0.0, (double)this.cS() * 0.6, (double)this.dq() * 0.1);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 3; $$1++) {
            this.gx();
         }
      } else {
         super.b($$0);
      }
   }

   private void gx() {
      double $$0 = this.ae.k() * 0.02;
      double $$1 = this.ae.k() * 0.02;
      double $$2 = this.ae.k() * 0.02;
      this.dV().a(lv.S, this.d(1.0), this.dD() + 0.5, this.g(1.0), $$0, $$1, $$2);
   }

   @Override
   public edv.a x() {
      return this.bO;
   }

   @Override
   public edv.d gq() {
      return this.bP;
   }

   class a implements edo {
      private final edq b;
      private final int c;

      public a(final edq $$0, final int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public edq a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(arn $$0, js<edm> $$1, edm.a $$2, fcu $$3) {
         if ($$1.a(edm.E)) {
            cjp.this.b(jj.a((kc)$$3), true);
            return true;
         } else if ($$1.a(edm.F)) {
            cjp.this.b(jj.a((kc)$$3), false);
            return true;
         } else {
            return false;
         }
      }
   }

   class b implements edv.d {
      private static final int b = 16;
      private final edq c = new edk(cjp.this, cjp.this.cS());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public edq b() {
         return this.c;
      }

      @Override
      public boolean a(arn $$0, jj $$1, js<edm> $$2, edm.a $$3) {
         if (cjp.this.gf()) {
            return false;
         } else {
            Optional<jr> $$4 = cjp.this.eb().c(cft.aO);
            if ($$4.isEmpty()) {
               return true;
            } else {
               jr $$5 = $$4.get();
               return $$5.a($$0.aj(), cjp.this.dv(), 1024) && $$5.b().equals($$1);
            }
         }
      }

      @Override
      public void a(arn $$0, jj $$1, js<edm> $$2, @Nullable bvs $$3, @Nullable bvs $$4, float $$5) {
         if ($$2.a(edm.H)) {
            cjq.a(cjp.this, new jj($$1));
         }
      }

      @Override
      public axp<edm> c() {
         return axg.e;
      }
   }
}
