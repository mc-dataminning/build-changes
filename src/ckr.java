import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class ckr extends ckn {
   private static final int ci = 50;
   private static final float cj = 0.35F;
   private static final int ck = 7;
   protected static final ImmutableList<ccy<? extends ccx<? super ckr>>> e = ImmutableList.of(ccy.c, ccy.d, ccy.b, ccy.f, ccy.m);
   protected static final ImmutableList<cbr<?>> ch = ImmutableList.of(
      cbr.n, cbr.v, cbr.g, cbr.h, cbr.k, cbr.l, cbr.ao, cbr.an, cbr.x, cbr.y, cbr.m, cbr.E, new cbr[]{cbr.o, cbr.p, cbr.q, cbr.t, cbr.ab, cbr.M, cbr.b}
   );

   public ckr(bsb<? extends ckr> $$0, dca $$1) {
      super($$0, $$1);
      this.bW = 20;
   }

   public static btu.a x() {
      return cjd.gG().a(btv.q, 50.0).a(btv.r, 0.35F).a(btv.c, 7.0);
   }

   @Nullable
   @Override
   public btg a(dcp $$0, bpy $$1, bss $$2, @Nullable btg $$3) {
      cks.a(this);
      this.a($$0.F_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(ayt $$0, bpy $$1) {
      this.a(bsc.a, new cuh(cuk.qr));
   }

   @Override
   protected btp.b<ckr> ea() {
      return btp.a(ch, e);
   }

   @Override
   protected btp<?> a(Dynamic<?> $$0) {
      return cks.a(this, this.ea().a($$0));
   }

   @Override
   public btp<ckr> dZ() {
      return (btp<ckr>)super.dZ();
   }

   @Override
   public boolean r() {
      return false;
   }

   @Override
   public boolean k(cuh $$0) {
      return $$0.a(cuk.qr) ? super.k($$0) : false;
   }

   @Override
   protected void Y() {
      this.dU().ag().a("piglinBruteBrain");
      this.dZ().a((aqt)this.dU(), this);
      this.dU().ag().c();
      cks.b(this);
      cks.c(this);
      super.Y();
   }

   @Override
   public ckq gA() {
      return this.gq() && this.gB() ? ckq.a : ckq.f;
   }

   @Override
   public boolean a(bqt $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dU().C) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bso) {
            cks.a(this, (bso)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected avn u() {
      return avo.uk;
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.un;
   }

   @Override
   protected avn n_() {
      return avo.um;
   }

   @Override
   protected void b(ir $$0, dtc $$1) {
      this.a(avo.uo, 0.15F, 1.0F);
   }

   protected void gD() {
      this.b(avo.ul);
   }

   @Override
   protected void gC() {
      this.b(avo.up);
   }
}
