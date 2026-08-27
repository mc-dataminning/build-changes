import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cid extends ccd implements cgr, cif {
   private static final aiy<Boolean> ca = ajc.a(cid.class, aja.k);
   private static final float cb = 0.2F;
   private static final int cc = 40;
   private static final float cd = 0.3F;
   private static final int ce = 1;
   private static final float cf = 0.6F;
   private static final int cg = 6;
   private static final float ch = 0.5F;
   private static final int ci = 300;
   private int cj;
   private int ck;
   private boolean cl;
   protected static final ImmutableList<? extends cay<? extends cax<? super cid>>> bX = ImmutableList.of(cay.c, cay.d, cay.o, cay.n);
   protected static final ImmutableList<? extends bzr<?>> bY = ImmutableList.of(
      bzr.r,
      bzr.g,
      bzr.h,
      bzr.k,
      bzr.l,
      bzr.n,
      bzr.m,
      bzr.E,
      bzr.t,
      bzr.o,
      bzr.p,
      bzr.aq,
      new bzr[]{bzr.z, bzr.as, bzr.at, bzr.ap, bzr.K, bzr.aw, bzr.ax, bzr.Z}
   );

   public cid(bqb<? extends cid> $$0, cyx $$1) {
      super($$0, $$1);
      this.bM = 5;
   }

   @Override
   public boolean a(cjt $$0) {
      return !this.gb();
   }

   public static bru.a r() {
      return cgz.gt().a(brv.q, 40.0).a(brv.r, 0.3F).a(brv.n, 0.6F).a(brv.d, 1.0).a(brv.c, 6.0);
   }

   @Override
   public boolean C(bpv $$0) {
      if (!($$0 instanceof bqo)) {
         return false;
      } else {
         this.cj = 10;
         this.dM().a(this, (byte)4);
         this.b(aum.mb);
         cie.a(this, (bqo)$$0);
         return cif.a(this, (bqo)$$0);
      }
   }

   @Override
   protected void e(bqo $$0) {
      if (this.u()) {
         cif.b(this, $$0);
      }
   }

   @Override
   public boolean a(bot $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dM().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bqo) {
            cie.b(this, (bqo)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected brp.b<cid> dQ() {
      return brp.a(bY, bX);
   }

   @Override
   protected brp<?> a(Dynamic<?> $$0) {
      return cie.a(this.dQ().a($$0));
   }

   @Override
   public brp<cid> dP() {
      return (brp<cid>)super.dP();
   }

   @Override
   protected void Y() {
      this.dM().af().a("hoglinBrain");
      this.dP().a((aps)this.dM(), this);
      this.dM().af().c();
      cie.a(this);
      if (this.y()) {
         this.ck++;
         if (this.ck > 300) {
            this.b(aum.mc);
            this.c((aps)this.dM());
         }
      } else {
         this.ck = 0;
      }
   }

   @Override
   public void n_() {
      if (this.cj > 0) {
         this.cj--;
      }

      super.n_();
   }

   @Override
   protected void k() {
      if (this.p_()) {
         this.bM = 3;
         this.f(brv.c).a(0.5);
      } else {
         this.bM = 5;
         this.f(brv.c).a(6.0);
      }
   }

   public static boolean c(bqb<cid> $$0, cyy $$1, bqs $$2, ib $$3, axr $$4) {
      return !$$1.a_($$3.d()).a(dca.kK);
   }

   @Nullable
   @Override
   public brg a(czm $$0, bny $$1, bqs $$2, @Nullable brg $$3) {
      if ($$0.E_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean h(double $$0) {
      return !this.fU();
   }

   @Override
   public float a(ib $$0, cza $$1) {
      if (cie.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.d()).a(dca.ow) ? 10.0F : 0.0F;
      }
   }

   @Override
   public boa b(cjt $$0, bnz $$1) {
      boa $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.fS();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cj = 10;
         this.b(aum.mb);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int gn() {
      return this.cj;
   }

   @Override
   public boolean ee() {
      return true;
   }

   @Override
   public int eg() {
      return this.bM;
   }

   private void c(aps $$0) {
      chr $$1 = this.a(bqb.bs, true);
      if ($$1 != null) {
         $$1.b(new bph(bpj.i, 200, 0));
      }
   }

   @Override
   public boolean o(crj $$0) {
      return $$0.a(crm.dB);
   }

   public boolean u() {
      return !this.p_();
   }

   @Override
   protected void a(ajc.a $$0) {
      super.a($$0);
      $$0.a(ca, false);
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      if (this.gu()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.ck);
      if (this.cl) {
         $$0.a("CannotBeHunted", true);
      }
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      this.w($$0.q("IsImmuneToZombification"));
      this.ck = $$0.h("TimeInOverworld");
      this.x($$0.q("CannotBeHunted"));
   }

   public void w(boolean $$0) {
      this.an().a(ca, $$0);
   }

   private boolean gu() {
      return this.an().a(ca);
   }

   public boolean y() {
      return !this.dM().D_().b() && !this.gu() && !this.gd();
   }

   private void x(boolean $$0) {
      this.cl = $$0;
   }

   public boolean gt() {
      return this.u() && !this.cl;
   }

   @Nullable
   @Override
   public bpp a(aps $$0, bpp $$1) {
      cid $$2 = bqb.Z.a((cyx)$$0);
      if ($$2 != null) {
         $$2.fS();
      }

      return $$2;
   }

   @Override
   public boolean go() {
      return !cie.c(this) && super.go();
   }

   @Override
   public aun db() {
      return aun.f;
   }

   @Override
   protected aul v() {
      return this.dM().B ? null : cie.b(this).orElse(null);
   }

   @Override
   protected aul d(bot $$0) {
      return aum.me;
   }

   @Override
   protected aul o_() {
      return aum.md;
   }

   @Override
   protected aul aN() {
      return aum.mJ;
   }

   @Override
   protected aul aO() {
      return aum.mI;
   }

   @Override
   protected void b(ib $$0, doz $$1) {
      this.a(aum.mg, 0.15F, 1.0F);
   }

   @Override
   protected void X() {
      super.X();
      afi.a(this);
   }
}
