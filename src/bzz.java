import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzz extends bum implements byv, cab {
   private static final aec<Boolean> bW = aef.a(bzz.class, aee.k);
   private static final float bX = 0.2F;
   private static final int bY = 40;
   private static final float bZ = 0.3F;
   private static final int ca = 1;
   private static final float cb = 0.6F;
   private static final int cc = 6;
   private static final float cd = 0.5F;
   private static final int ce = 300;
   private int cf;
   private int cg;
   private boolean ch;
   protected static final ImmutableList<? extends bth<? extends btg<? super bzz>>> bT = ImmutableList.of(bth.c, bth.d, bth.n, bth.m);
   protected static final ImmutableList<? extends bsc<?>> bU = ImmutableList.of(
      bsc.r, bsc.g, bsc.h, bsc.k, bsc.l, bsc.n, bsc.m, bsc.E, bsc.t, bsc.o, bsc.p, bsc.ap, new bsc[]{bsc.z, bsc.ar, bsc.as, bsc.ao, bsc.J, bsc.av, bsc.aw}
   );

   public bzz(bip<? extends bzz> $$0, cpq $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   public boolean a(cbp $$0) {
      return !this.fO();
   }

   public static bkg.a p() {
      return bzd.gg().a(bkh.a, 40.0).a(bkh.d, 0.3F).a(bkh.c, 0.6F).a(bkh.g, 1.0).a(bkh.f, 6.0);
   }

   @Override
   public boolean C(bil $$0) {
      if (!($$0 instanceof bjb)) {
         return false;
      } else {
         this.cf = 10;
         this.dK().a(this, (byte)4);
         this.a(aoz.kO, 1.0F, this.eV());
         caa.a(this, (bjb)$$0);
         return cab.a(this, (bjb)$$0);
      }
   }

   @Override
   protected void e(bjb $$0) {
      if (this.q()) {
         cab.b(this, $$0);
      }
   }

   @Override
   public boolean a(bhj $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dK().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bjb) {
            caa.b(this, (bjb)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected bkb.b<bzz> dN() {
      return bkb.a(bU, bT);
   }

   @Override
   protected bkb<?> a(Dynamic<?> $$0) {
      return caa.a(this.dN().a($$0));
   }

   @Override
   public bkb<bzz> dM() {
      return (bkb<bzz>)super.dM();
   }

   @Override
   protected void V() {
      this.dK().ad().a("hoglinBrain");
      this.dM().a((akn)this.dK(), this);
      this.dK().ad().c();
      caa.a(this);
      if (this.t()) {
         this.cg++;
         if (this.cg > 300) {
            this.b(aoz.kP);
            this.c((akn)this.dK());
         }
      } else {
         this.cg = 0;
      }
   }

   @Override
   public void b_() {
      if (this.cf > 0) {
         this.cf--;
      }

      super.b_();
   }

   @Override
   protected void m() {
      if (this.i_()) {
         this.bJ = 3;
         this.a(bkh.f).a(0.5);
      } else {
         this.bJ = 5;
         this.a(bkh.f).a(6.0);
      }
   }

   public static boolean c(bip<bzz> $$0, cpr $$1, bjf $$2, gw $$3, arx $$4) {
      return !$$1.a_($$3.d()).a(csr.kK);
   }

   @Nullable
   @Override
   public bju a(cqf $$0, bgr $$1, bjf $$2, @Nullable bju $$3, @Nullable qu $$4) {
      if ($$0.y_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean h(double $$0) {
      return !this.fH();
   }

   @Override
   public float a(gw $$0, cpt $$1) {
      if (caa.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.d()).a(csr.ow) ? 10.0F : 0.0F;
      }
   }

   @Override
   protected Vector3f a(bil $$0, bim $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.09375F * $$2, 0.0F);
   }

   @Override
   public bgt b(cbp $$0, bgs $$1) {
      bgt $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.fF();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cf = 10;
         this.a(aoz.kO, 1.0F, this.eV());
      } else {
         super.b($$0);
      }
   }

   @Override
   public int ga() {
      return this.cf;
   }

   @Override
   public boolean ea() {
      return true;
   }

   @Override
   public int ec() {
      return this.bJ;
   }

   private void c(akn $$0) {
      bzv $$1 = this.a(bip.bo, true);
      if ($$1 != null) {
         $$1.b(new bhy(bia.i, 200, 0));
      }
   }

   @Override
   public boolean m(cja $$0) {
      return $$0.a(cjd.dg);
   }

   public boolean q() {
      return !this.i_();
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bW, false);
   }

   @Override
   public void b(qu $$0) {
      super.b($$0);
      if (this.gh()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.cg);
      if (this.ch) {
         $$0.a("CannotBeHunted", true);
      }
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      this.w($$0.q("IsImmuneToZombification"));
      this.cg = $$0.h("TimeInOverworld");
      this.x($$0.q("CannotBeHunted"));
   }

   public void w(boolean $$0) {
      this.al().b(bW, $$0);
   }

   private boolean gh() {
      return this.al().b(bW);
   }

   public boolean t() {
      return !this.dK().x_().b() && !this.gh() && !this.fQ();
   }

   private void x(boolean $$0) {
      this.ch = $$0;
   }

   public boolean gg() {
      return this.q() && !this.ch;
   }

   @Nullable
   @Override
   public big a(akn $$0, big $$1) {
      bzz $$2 = bip.W.a((cpq)$$0);
      if ($$2 != null) {
         $$2.fF();
      }

      return $$2;
   }

   @Override
   public boolean gb() {
      return !caa.c(this) && super.gb();
   }

   @Override
   public apa da() {
      return apa.f;
   }

   @Override
   protected aoy r() {
      return this.dK().B ? null : caa.b(this).orElse(null);
   }

   @Override
   protected aoy d(bhj $$0) {
      return aoz.kR;
   }

   @Override
   protected aoy h_() {
      return aoz.kQ;
   }

   @Override
   protected aoy aL() {
      return aoz.lw;
   }

   @Override
   protected aoy aM() {
      return aoz.lv;
   }

   @Override
   protected void b(gw $$0, dfe $$1) {
      this.a(aoz.kT, 0.15F, 1.0F);
   }

   protected void b(aoy $$0) {
      this.a($$0, this.eU(), this.eV());
   }

   @Override
   protected void T() {
      super.T();
      aay.a(this);
   }
}
