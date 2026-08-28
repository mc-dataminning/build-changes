import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class clg extends cfe implements cju, cli {
   private static final akj<Boolean> cb = akn.a(clg.class, akl.k);
   private static final float cc = 0.2F;
   private static final int cd = 40;
   private static final float ce = 0.3F;
   private static final int cf = 1;
   private static final float cg = 0.6F;
   private static final int ch = 6;
   private static final float ci = 0.5F;
   private static final int cj = 300;
   private int ck;
   private int cl;
   private boolean cm;
   protected static final ImmutableList<? extends cdz<? extends cdy<? super clg>>> bY = ImmutableList.of(cdz.c, cdz.d, cdz.o, cdz.n);
   protected static final ImmutableList<? extends ccs<?>> bZ = ImmutableList.of(
      ccs.r,
      ccs.g,
      ccs.h,
      ccs.k,
      ccs.l,
      ccs.n,
      ccs.m,
      ccs.E,
      ccs.t,
      ccs.o,
      ccs.p,
      ccs.aq,
      new ccs[]{ccs.z, ccs.as, ccs.at, ccs.ap, ccs.K, ccs.aw, ccs.ax, ccs.Z}
   );

   public clg(bsz<? extends clg> $$0, dbx $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   public boolean a(cmw $$0) {
      return !this.gd();
   }

   public static buv.a s() {
      return ckc.gw().a(buw.q, 40.0).a(buw.r, 0.3F).a(buw.n, 0.6F).a(buw.d, 1.0).a(buw.c, 6.0);
   }

   @Override
   public boolean C(bst $$0) {
      if (!($$0 instanceof bto)) {
         return false;
      } else {
         this.ck = 10;
         this.dP().a(this, (byte)4);
         this.b(avz.mq);
         clh.a(this, (bto)$$0);
         return cli.a(this, (bto)$$0);
      }
   }

   @Override
   protected void e(bto $$0) {
      if (this.u()) {
         cli.b(this, $$0);
      }
   }

   @Override
   public boolean a(brm $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dP().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bto) {
            clh.b(this, (bto)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected buq.b<clg> dT() {
      return buq.a(bZ, bY);
   }

   @Override
   protected buq<?> a(Dynamic<?> $$0) {
      return clh.a(this.dT().a($$0));
   }

   @Override
   public buq<clg> dS() {
      return (buq<clg>)super.dS();
   }

   @Override
   protected void Z() {
      this.dP().ag().a("hoglinBrain");
      this.dS().a((are)this.dP(), this);
      this.dP().ag().c();
      clh.a(this);
      if (this.y()) {
         this.cl++;
         if (this.cl > 300) {
            this.b(avz.mr);
            this.c((are)this.dP());
         }
      } else {
         this.cl = 0;
      }
   }

   @Override
   public void n_() {
      if (this.ck > 0) {
         this.ck--;
      }

      super.n_();
   }

   @Override
   protected void k() {
      if (this.p_()) {
         this.bN = 3;
         this.f(buw.c).a(0.5);
      } else {
         this.bN = 5;
         this.f(buw.c).a(6.0);
      }
   }

   public static boolean c(bsz<clg> $$0, dby $$1, bts $$2, iz $$3, azg $$4) {
      return !$$1.a_($$3.d()).a(dfa.kK);
   }

   @Nullable
   @Override
   public buh a(dcm $$0, bqr $$1, bts $$2, @Nullable buh $$3) {
      if ($$0.E_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean h(double $$0) {
      return !this.fW();
   }

   @Override
   public float a(iz $$0, dca $$1) {
      if (clh.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.d()).a(dfa.ow) ? 10.0F : 0.0F;
      }
   }

   @Override
   public bqt b(cmw $$0, bqs $$1) {
      bqt $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.fU();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.ck = 10;
         this.b(avz.mq);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int gq() {
      return this.ck;
   }

   @Override
   public boolean eh() {
      return true;
   }

   @Override
   public int ej() {
      return this.bN;
   }

   private void c(are $$0) {
      cku $$1 = this.a(bsz.bt, true);
      if ($$1 != null) {
         $$1.b(new bsb(bsd.i, 200, 0));
      }
   }

   @Override
   public boolean o(cuo $$0) {
      return $$0.a(awx.am);
   }

   public boolean u() {
      return !this.p_();
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(cb, false);
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      if (this.gx()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.cl);
      if (this.cm) {
         $$0.a("CannotBeHunted", true);
      }
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      this.w($$0.q("IsImmuneToZombification"));
      this.cl = $$0.h("TimeInOverworld");
      this.x($$0.q("CannotBeHunted"));
   }

   public void w(boolean $$0) {
      this.ap().a(cb, $$0);
   }

   private boolean gx() {
      return this.ap().a(cb);
   }

   public boolean y() {
      return !this.dP().D_().b() && !this.gx() && !this.gg();
   }

   private void x(boolean $$0) {
      this.cm = $$0;
   }

   public boolean gw() {
      return this.u() && !this.cm;
   }

   @Nullable
   @Override
   public bsn a(are $$0, bsn $$1) {
      clg $$2 = bsz.Z.a((dbx)$$0);
      if ($$2 != null) {
         $$2.fU();
      }

      return $$2;
   }

   @Override
   public boolean gr() {
      return !clh.c(this) && super.gr();
   }

   @Override
   public awa de() {
      return awa.f;
   }

   @Override
   protected avy v() {
      return this.dP().B ? null : clh.b(this).orElse(null);
   }

   @Override
   protected avy d(brm $$0) {
      return avz.mt;
   }

   @Override
   protected avy o_() {
      return avz.ms;
   }

   @Override
   protected avy aP() {
      return avz.mY;
   }

   @Override
   protected avy aQ() {
      return avz.mX;
   }

   @Override
   protected void b(iz $$0, dsb $$1) {
      this.a(avz.mv, 0.15F, 1.0F);
   }

   @Override
   protected void Y() {
      super.Y();
      ags.a(this);
   }

   @Nullable
   @Override
   public bto p() {
      return this.N();
   }
}
