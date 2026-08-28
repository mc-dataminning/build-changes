import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cjx extends bxh implements cqc, eex {
   private static final Logger bF = LogUtils.getLogger();
   private static final jz bG = new jz(1, 1, 1);
   private static final int bH = 5;
   private static final float bI = 55.0F;
   private static final float bJ = 15.0F;
   private static final int bK = 6000;
   private static final int bL = 3;
   public static final int a = 1024;
   private static final akh<Boolean> bM = akl.a(cjx.class, akj.k);
   private static final akh<Boolean> bN = akl.a(cjx.class, akj.k);
   protected static final ImmutableList<chi<? extends chh<? super cjx>>> b = ImmutableList.of(chi.c, chi.d, chi.f, chi.b);
   protected static final ImmutableList<cgb<?>> c = ImmutableList.of(
      cgb.u, cgb.o, cgb.h, cgb.n, cgb.F, cgb.y, cgb.M, cgb.aN, cgb.aO, cgb.aP, cgb.aQ, cgb.aa, new cgb[0]
   );
   public static final ImmutableList<Float> d = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final eel<eex.b> bO;
   private eex.a bP;
   private final eex.d bQ;
   private final eel<cjx.a> bR;
   private final buf bS = new buf(1);
   @Nullable
   private iu bT;
   private long bU;
   private float bV;
   private float bW;
   private float bX;
   private float bY;
   private float bZ;

   public cjx(bwj<? extends cjx> $$0, dip $$1) {
      super($$0, $$1);
      this.bz = new ccv(this, 20, true);
      this.a_(this.fM());
      this.bQ = new cjx.b();
      this.bP = new eex.a();
      this.bO = new eel<>(new eex.b(this));
      this.bR = new eel<>(new cjx.a(this.bQ.b(), eeo.E.a().a()));
   }

   @Override
   protected bxz.b<cjx> ec() {
      return bxz.a(c, b);
   }

   @Override
   protected bxz<?> a(Dynamic<?> $$0) {
      return cjy.a(this.ec().a($$0));
   }

   @Override
   public bxz<cjx> eb() {
      return (bxz<cjx>)super.eb();
   }

   public static bye.a j() {
      return bxb.E().a(byf.s, 20.0).a(byf.l, 0.1F).a(byf.v, 0.1F).a(byf.c, 2.0);
   }

   @Override
   protected cgj b(dip $$0) {
      cgh $$1 = new cgh(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.a(48.0F);
      return $$1;
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(bM, false);
      $$0.a(bN, true);
   }

   @Override
   public void a_(fdw $$0) {
      if (this.bj()) {
         this.a(0.02F, $$0);
         this.a(bxd.a, this.dy());
         this.i(this.dy().c(0.8F));
      } else if (this.bw()) {
         this.a(0.02F, $$0);
         this.a(bxd.a, this.dy());
         this.i(this.dy().c(0.5));
      } else {
         this.a(this.fn(), $$0);
         this.a(bxd.a, this.dy());
         this.i(this.dy().c(0.91F));
      }
   }

   @Override
   public boolean a(aro $$0, bup $$1, float $$2) {
      return this.b($$1.d()) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean t(bwa $$0) {
      return this.b($$0) || super.t($$0);
   }

   private boolean b(@Nullable bwa $$0) {
      if (!($$0 instanceof cqs $$1)) {
         return false;
      } else {
         Optional<UUID> $$2 = this.eb().c(cgb.aN);
         return $$2.isPresent() && $$1.cG().equals($$2.get());
      }
   }

   @Override
   protected void b(iu $$0, dzo $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, dzo $$2, iu $$3) {
   }

   @Override
   protected awk u() {
      return this.d(bwk.a) ? awl.a : awl.b;
   }

   @Override
   protected awk e(bup $$0) {
      return awl.d;
   }

   @Override
   protected awk l_() {
      return awl.c;
   }

   @Override
   protected float fd() {
      return 0.4F;
   }

   @Override
   protected void a(aro $$0) {
      bqj $$1 = bqi.a();
      $$1.a("allayBrain");
      this.eb().a($$0, this);
      $$1.c();
      $$1.a("allayActivityUpdate");
      cjy.a(this);
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
         this.bT = null;
      }

      this.gt();
   }

   @Override
   public void h() {
      super.h();
      if (this.dV().C) {
         this.bW = this.bV;
         if (this.m()) {
            this.bV = azk.a(this.bV + 1.0F, 0.0F, 5.0F);
         } else {
            this.bV = azk.a(this.bV - 1.0F, 0.0F, 5.0F);
         }

         if (this.q()) {
            this.bX++;
            this.bZ = this.bY;
            if (this.t()) {
               this.bY++;
            } else {
               this.bY--;
            }

            this.bY = azk.a(this.bY, 0.0F, 15.0F);
         } else {
            this.bX = 0.0F;
            this.bY = 0.0F;
            this.bZ = 0.0F;
         }
      } else {
         eex.c.a(this.dV(), this.bP, this.bQ);
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
      return !this.b(btx.a).f();
   }

   @Override
   protected boolean f(bwk $$0) {
      return false;
   }

   private boolean gr() {
      return this.eb().a(cgb.aQ, cgc.a);
   }

   @Override
   protected bty b(cqs $$0, btx $$1) {
      cys $$2 = $$0.b($$1);
      cys $$3 = this.b(btx.a);
      if (this.q() && $$2.a(axi.W) && this.gw()) {
         this.gu();
         this.dV().a(this, (byte)18);
         this.dV().a($$0, this, awl.E, awm.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return bty.a;
      } else if ($$3.f() && !$$2.f()) {
         cys $$4 = $$2.c(1);
         this.a(btx.a, $$4);
         this.a($$0, $$2);
         this.dV().a($$0, this, awl.e, awm.g, 2.0F, 1.0F);
         this.eb().a(cgb.aN, $$0.cG());
         return bty.a;
      } else if (!$$3.f() && $$1 == btx.a && $$2.f()) {
         this.a(bwk.a, cys.k);
         this.dV().a($$0, this, awl.f, awm.g, 2.0F, 1.0F);
         this.a(btx.a);

         for (cys $$5 : this.n().f()) {
            bys.a(this, $$5, this.dt());
         }

         this.eb().b(cgb.aN);
         $$0.i($$3);
         return bty.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void b(iu $$0, boolean $$1) {
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
   public buf n() {
      return this.bS;
   }

   @Override
   protected jz X() {
      return bG;
   }

   @Override
   public boolean c(aro $$0, cys $$1) {
      cys $$2 = this.b(btx.a);
      return !$$2.f() && $$0.O().c(dil.c) && this.bS.c($$1) && this.c($$2, $$1);
   }

   private boolean c(cys $$0, cys $$1) {
      return cys.b($$0, $$1) && !this.d($$0, $$1);
   }

   private boolean d(cys $$0, cys $$1) {
      dao $$2 = $$0.a(kj.R);
      dao $$3 = $$1.a(kj.R);
      return !Objects.equals($$2, $$3);
   }

   @Override
   protected void a(aro $$0, cmx $$1) {
      cqc.a($$0, this, this, $$1);
   }

   @Override
   protected void ab() {
      super.ab();
      agk.a(this);
   }

   @Override
   public boolean ba() {
      return !this.aJ();
   }

   @Override
   public void a(BiConsumer<eel<?>, aro> $$0) {
      if (this.dV() instanceof aro $$1) {
         $$0.accept(this.bO, $$1);
         $$0.accept(this.bR, $$1);
      }
   }

   public boolean q() {
      return this.al.a(bM);
   }

   public void w(boolean $$0) {
      if (!this.dV().C && this.dj() && (!$$0 || !this.gn())) {
         this.al.a(bM, $$0);
      }
   }

   private boolean gs() {
      return this.bT == null || !this.bT.a(this.dt(), (double)eeo.E.a().a()) || !this.dV().a_(this.bT).a(dlw.eg);
   }

   public float J(float $$0) {
      return azk.h($$0, this.bW, this.bV) / 5.0F;
   }

   public boolean t() {
      float $$0 = this.bX % 55.0F;
      return $$0 < 15.0F;
   }

   public float K(float $$0) {
      return azk.h($$0, this.bZ, this.bY) / 15.0F;
   }

   @Override
   public boolean a(cys $$0, cys $$1) {
      return !this.c($$0, $$1);
   }

   @Override
   protected void f(aro $$0) {
      super.f($$0);
      this.bS.f().forEach($$1x -> this.a($$0, $$1x));
      cys $$1 = this.a(bwk.a);
      if (!$$1.f() && !dfh.a($$1, dfg.D)) {
         this.a($$0, $$1);
         this.a(bwk.a, cys.k);
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      this.b($$0, this.dX());
      alc<uu> $$1 = this.dX().a(ul.a);
      eex.a.a
         .encodeStart($$1, this.bP)
         .resultOrPartial($$0x -> bF.error("Failed to encode vibration listener for Allay: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
      $$0.a("DuplicationCooldown", this.bU);
      $$0.a("CanDuplicate", this.gw());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.a($$0, this.dX());
      alc<uu> $$1 = this.dX().a(ul.a);
      if ($$0.b("listener", 10)) {
         eex.a.a
            .parse($$1, $$0.p("listener"))
            .resultOrPartial($$0x -> bF.error("Failed to parse vibration listener for Allay: '{}'", $$0x))
            .ifPresent($$0x -> this.bP = $$0x);
      }

      this.bU = (long)$$0.h("DuplicationCooldown");
      this.al.a(bN, $$0.q("CanDuplicate"));
   }

   @Override
   protected boolean go() {
      return false;
   }

   private void gt() {
      if (this.bU > 0L) {
         this.bU--;
      }

      if (!this.dV().w_() && this.bU == 0L && !this.gw()) {
         this.al.a(bN, true);
      }
   }

   private void gu() {
      cjx $$0 = bwj.c.a(this.dV(), bwi.e);
      if ($$0 != null) {
         $$0.f(this.dt());
         $$0.fY();
         $$0.gv();
         this.gv();
         this.dV().b($$0);
      }
   }

   private void gv() {
      this.bU = 6000L;
      this.al.a(bN, false);
   }

   private boolean gw() {
      return this.al.a(bN);
   }

   private void a(cqs $$0, cys $$1) {
      $$1.a(1, $$0);
   }

   @Override
   public fdw cT() {
      return new fdw(0.0, (double)this.cS() * 0.6, (double)this.dq() * 0.1);
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
      this.dV().a(lx.S, this.d(1.0), this.dD() + 0.5, this.g(1.0), $$0, $$1, $$2);
   }

   @Override
   public eex.a x() {
      return this.bP;
   }

   @Override
   public eex.d gq() {
      return this.bQ;
   }

   class a implements eeq {
      private final ees b;
      private final int c;

      public a(final ees $$0, final int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public ees a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(aro $$0, je<eeo> $$1, eeo.a $$2, fdw $$3) {
         if ($$1.a(eeo.E)) {
            cjx.this.b(iu.a((jo)$$3), true);
            return true;
         } else if ($$1.a(eeo.F)) {
            cjx.this.b(iu.a((jo)$$3), false);
            return true;
         } else {
            return false;
         }
      }
   }

   class b implements eex.d {
      private static final int b = 16;
      private final ees c = new eem(cjx.this, cjx.this.cS());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public ees b() {
         return this.c;
      }

      @Override
      public boolean a(aro $$0, iu $$1, je<eeo> $$2, eeo.a $$3) {
         if (cjx.this.gf()) {
            return false;
         } else {
            Optional<jd> $$4 = cjx.this.eb().c(cgb.aO);
            if ($$4.isEmpty()) {
               return true;
            } else {
               jd $$5 = $$4.get();
               return $$5.a($$0.aj(), cjx.this.dv(), 1024) && $$5.b().equals($$1);
            }
         }
      }

      @Override
      public void a(aro $$0, iu $$1, je<eeo> $$2, @Nullable bwa $$3, @Nullable bwa $$4, float $$5) {
         if ($$2.a(eeo.H)) {
            cjy.a(cjx.this, new iu($$1));
         }
      }

      @Override
      public axp<eeo> c() {
         return axg.e;
      }
   }
}
