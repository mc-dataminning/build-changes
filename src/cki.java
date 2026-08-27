import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cki extends ceg implements ciw, ckk {
   private static final ajs<Boolean> cb = ajw.a(cki.class, aju.k);
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
   protected static final ImmutableList<? extends cdb<? extends cda<? super cki>>> bY = ImmutableList.of(cdb.c, cdb.d, cdb.o, cdb.n);
   protected static final ImmutableList<? extends cbu<?>> bZ = ImmutableList.of(
      cbu.r,
      cbu.g,
      cbu.h,
      cbu.k,
      cbu.l,
      cbu.n,
      cbu.m,
      cbu.E,
      cbu.t,
      cbu.o,
      cbu.p,
      cbu.aq,
      new cbu[]{cbu.z, cbu.as, cbu.at, cbu.ap, cbu.K, cbu.aw, cbu.ax, cbu.Z}
   );

   public cki(bsc<? extends cki> $$0, daz $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   public boolean a(cly $$0) {
      return !this.gc();
   }

   public static btx.a s() {
      return cje.gv().a(bty.q, 40.0).a(bty.r, 0.3F).a(bty.n, 0.6F).a(bty.d, 1.0).a(bty.c, 6.0);
   }

   @Override
   public boolean C(brw $$0) {
      if (!($$0 instanceof bsq)) {
         return false;
      } else {
         this.ck = 10;
         this.dP().a(this, (byte)4);
         this.b(avi.mq);
         ckj.a(this, (bsq)$$0);
         return ckk.a(this, (bsq)$$0);
      }
   }

   @Override
   protected void e(bsq $$0) {
      if (this.u()) {
         ckk.b(this, $$0);
      }
   }

   @Override
   public boolean a(bqp $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dP().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bsq) {
            ckj.b(this, (bsq)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected bts.b<cki> dT() {
      return bts.a(bZ, bY);
   }

   @Override
   protected bts<?> a(Dynamic<?> $$0) {
      return ckj.a(this.dT().a($$0));
   }

   @Override
   public bts<cki> dS() {
      return (bts<cki>)super.dS();
   }

   @Override
   protected void Y() {
      this.dP().af().a("hoglinBrain");
      this.dS().a((aqn)this.dP(), this);
      this.dP().af().c();
      ckj.a(this);
      if (this.y()) {
         this.cl++;
         if (this.cl > 300) {
            this.b(avi.mr);
            this.c((aqn)this.dP());
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
         this.f(bty.c).a(0.5);
      } else {
         this.bN = 5;
         this.f(bty.c).a(6.0);
      }
   }

   public static boolean c(bsc<cki> $$0, dba $$1, bsu $$2, io $$3, aym $$4) {
      return !$$1.a_($$3.d()).a(dec.kK);
   }

   @Nullable
   @Override
   public btj a(dbo $$0, bpu $$1, bsu $$2, @Nullable btj $$3) {
      if ($$0.E_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean h(double $$0) {
      return !this.fV();
   }

   @Override
   public float a(io $$0, dbc $$1) {
      if (ckj.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.d()).a(dec.ow) ? 10.0F : 0.0F;
      }
   }

   @Override
   public bpw b(cly $$0, bpv $$1) {
      bpw $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.fT();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.ck = 10;
         this.b(avi.mq);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int gp() {
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

   private void c(aqn $$0) {
      cjw $$1 = this.a(bsc.bt, true);
      if ($$1 != null) {
         $$1.b(new bre(brg.i, 200, 0));
      }
   }

   @Override
   public boolean o(ctq $$0) {
      return $$0.a(awf.am);
   }

   public boolean u() {
      return !this.p_();
   }

   @Override
   protected void a(ajw.a $$0) {
      super.a($$0);
      $$0.a(cb, false);
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      if (this.gw()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.cl);
      if (this.cm) {
         $$0.a("CannotBeHunted", true);
      }
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      this.w($$0.q("IsImmuneToZombification"));
      this.cl = $$0.h("TimeInOverworld");
      this.x($$0.q("CannotBeHunted"));
   }

   public void w(boolean $$0) {
      this.ap().a(cb, $$0);
   }

   private boolean gw() {
      return this.ap().a(cb);
   }

   public boolean y() {
      return !this.dP().D_().b() && !this.gw() && !this.gf();
   }

   private void x(boolean $$0) {
      this.cm = $$0;
   }

   public boolean gv() {
      return this.u() && !this.cm;
   }

   @Nullable
   @Override
   public brq a(aqn $$0, brq $$1) {
      cki $$2 = bsc.Z.a((daz)$$0);
      if ($$2 != null) {
         $$2.fT();
      }

      return $$2;
   }

   @Override
   public boolean gq() {
      return !ckj.c(this) && super.gq();
   }

   @Override
   public avj de() {
      return avj.f;
   }

   @Override
   protected avh v() {
      return this.dP().B ? null : ckj.b(this).orElse(null);
   }

   @Override
   protected avh d(bqp $$0) {
      return avi.mt;
   }

   @Override
   protected avh o_() {
      return avi.ms;
   }

   @Override
   protected avh aP() {
      return avi.mY;
   }

   @Override
   protected avh aQ() {
      return avi.mX;
   }

   @Override
   protected void b(io $$0, drd $$1) {
      this.a(avi.mv, 0.15F, 1.0F);
   }

   @Override
   protected void X() {
      super.X();
      agb.a(this);
   }
}
