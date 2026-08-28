import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cjp extends chl {
   @VisibleForTesting
   public static int a = Math.abs(-24000);
   public static final float b = 0.4F;
   public static final float c = 0.3F;
   private int bH;
   protected static final ImmutableList<cgj<? extends cgi<? super cjp>>> bF = ImmutableList.of(cgj.c, cgj.d, cgj.f, cgj.s);
   protected static final ImmutableList<cfc<?>> bG = ImmutableList.of(cfc.n, cfc.h, cfc.m, cfc.E, cfc.t, cfc.K, cfc.P, cfc.R, cfc.O, cfc.r, cfc.Z);

   public cjp(bvi<? extends chl> $$0, dgz $$1) {
      super($$0, $$1);
      this.bz = new ccb(this, 85, 10, 0.02F, 0.1F, true);
      this.by = new cca(this, 10);
   }

   @Override
   protected cfk b(dgz $$0) {
      return new cfm(this, $$0);
   }

   @Override
   protected bxa.b<cjp> eb() {
      return bxa.a(bG, bF);
   }

   @Override
   protected bxa<?> a(Dynamic<?> $$0) {
      return cjq.a(this.eb().a($$0));
   }

   @Override
   public bxa<cjp> ea() {
      return (bxa<cjp>)super.ea();
   }

   @Override
   protected avz t() {
      return awa.As;
   }

   @Override
   protected void a(ard $$0) {
      bpj $$1 = bpi.a();
      $$1.a("tadpoleBrain");
      this.ea().a($$0, this);
      $$1.c();
      $$1.a("tadpoleActivityUpdate");
      cjq.a(this);
      $$1.c();
      super.a($$0);
   }

   public static bxf.a x() {
      return chp.gx().a(bxg.v, 1.0).a(bxg.s, 6.0);
   }

   @Override
   public void k_() {
      super.k_();
      if (!this.dU().C) {
         this.c(this.bH + 1);
      }
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("Age", this.bH);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.c($$0.h("Age"));
   }

   @Nullable
   @Override
   protected avz u() {
      return null;
   }

   @Nullable
   @Override
   protected avz e(btp $$0) {
      return awa.Au;
   }

   @Nullable
   @Override
   protected avz l_() {
      return awa.Ar;
   }

   @Override
   public bsy b(cpr $$0, bsx $$1) {
      cxh $$2 = $$0.b($$1);
      if (this.j($$2)) {
         this.a($$0, $$2);
         return bsy.a;
      } else {
         return chr.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void ab() {
      super.ab();
      agc.a(this);
   }

   @Override
   public boolean m() {
      return true;
   }

   @Override
   public void w(boolean $$0) {
   }

   @Override
   public void i(cxh $$0) {
      chr.a(this, $$0);
      czo.a(kv.Z, $$0, $$0x -> $$0x.a("Age", this.gs()));
   }

   @Override
   public void h(tq $$0) {
      chr.a(this, $$0);
      if ($$0.e("Age")) {
         this.c($$0.h("Age"));
      }
   }

   @Override
   public cxh R_() {
      return new cxh(cxl.rt);
   }

   @Override
   public avz n() {
      return awa.do;
   }

   private boolean j(cxh $$0) {
      return $$0.a(awy.ao);
   }

   private void a(cpr $$0, cxh $$1) {
      this.b($$0, $$1);
      this.b(buq.d_(this.gu()));
      this.dU().a(lt.Q, this.d(1.0), this.dC() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(cpr $$0, cxh $$1) {
      $$1.a(1, $$0);
   }

   private int gs() {
      return this.bH;
   }

   private void b(int $$0) {
      this.c(this.bH + $$0 * 20);
   }

   private void c(int $$0) {
      this.bH = $$0;
      if (this.bH >= a) {
         this.gt();
      }
   }

   private void gt() {
      if (this.dU() instanceof ard $$0) {
         this.a(bvi.ab, buu.a(this, false, false), $$1 -> {
            $$1.a($$0, this.dU().d_($$1.du()), bvh.i, null);
            $$1.ga();
            $$1.a(this.a(this.aw()));
            this.a(awa.At, 0.15F, 1.0F);
         });
      }
   }

   private int gu() {
      return Math.max(0, a - this.bH);
   }

   @Override
   public boolean em() {
      return false;
   }
}
