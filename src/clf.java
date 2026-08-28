import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class clf extends cfd implements cjt, clh {
   private static final akj<Boolean> cb = akn.a(clf.class, akl.k);
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
   protected static final ImmutableList<? extends cdy<? extends cdx<? super clf>>> bY = ImmutableList.of(cdy.c, cdy.d, cdy.o, cdy.n);
   protected static final ImmutableList<? extends ccr<?>> bZ = ImmutableList.of(
      ccr.r,
      ccr.g,
      ccr.h,
      ccr.k,
      ccr.l,
      ccr.n,
      ccr.m,
      ccr.E,
      ccr.t,
      ccr.o,
      ccr.p,
      ccr.aq,
      new ccr[]{ccr.z, ccr.as, ccr.at, ccr.ap, ccr.K, ccr.aw, ccr.ax, ccr.Z}
   );

   public clf(bsy<? extends clf> $$0, dbw $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   public boolean a(cmv $$0) {
      return !this.gd();
   }

   public static buu.a s() {
      return ckb.gw().a(buv.q, 40.0).a(buv.r, 0.3F).a(buv.n, 0.6F).a(buv.d, 1.0).a(buv.c, 6.0);
   }

   @Override
   public boolean C(bss $$0) {
      if (!($$0 instanceof btn)) {
         return false;
      } else {
         this.ck = 10;
         this.dP().a(this, (byte)4);
         this.b(avz.mq);
         clg.a(this, (btn)$$0);
         return clh.a(this, (btn)$$0);
      }
   }

   @Override
   protected void e(btn $$0) {
      if (this.u()) {
         clh.b(this, $$0);
      }
   }

   @Override
   public boolean a(brl $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dP().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof btn) {
            clg.b(this, (btn)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected bup.b<clf> dT() {
      return bup.a(bZ, bY);
   }

   @Override
   protected bup<?> a(Dynamic<?> $$0) {
      return clg.a(this.dT().a($$0));
   }

   @Override
   public bup<clf> dS() {
      return (bup<clf>)super.dS();
   }

   @Override
   protected void Z() {
      this.dP().ag().a("hoglinBrain");
      this.dS().a((are)this.dP(), this);
      this.dP().ag().c();
      clg.a(this);
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
         this.f(buv.c).a(0.5);
      } else {
         this.bN = 5;
         this.f(buv.c).a(6.0);
      }
   }

   public static boolean c(bsy<clf> $$0, dbx $$1, btr $$2, iz $$3, azf $$4) {
      return !$$1.a_($$3.d()).a(dez.kK);
   }

   @Nullable
   @Override
   public bug a(dcl $$0, bqq $$1, btr $$2, @Nullable bug $$3) {
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
   public float a(iz $$0, dbz $$1) {
      if (clg.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.d()).a(dez.ow) ? 10.0F : 0.0F;
      }
   }

   @Override
   public bqs b(cmv $$0, bqr $$1) {
      bqs $$2 = super.b($$0, $$1);
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
      ckt $$1 = this.a(bsy.bt, true);
      if ($$1 != null) {
         $$1.b(new bsa(bsc.i, 200, 0));
      }
   }

   @Override
   public boolean o(cun $$0) {
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
   public bsm a(are $$0, bsm $$1) {
      clf $$2 = bsy.Z.a((dbw)$$0);
      if ($$2 != null) {
         $$2.fU();
      }

      return $$2;
   }

   @Override
   public boolean gr() {
      return !clg.c(this) && super.gr();
   }

   @Override
   public awa de() {
      return awa.f;
   }

   @Override
   protected avy v() {
      return this.dP().B ? null : clg.b(this).orElse(null);
   }

   @Override
   protected avy d(brl $$0) {
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
   protected void b(iz $$0, dsa $$1) {
      this.a(avz.mv, 0.15F, 1.0F);
   }

   @Override
   protected void Y() {
      super.Y();
      ags.a(this);
   }

   @Nullable
   @Override
   public btn p() {
      return this.N();
   }
}
