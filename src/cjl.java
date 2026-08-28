import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cjl extends chk {
   @VisibleForTesting
   public static int a = Math.abs(-24000);
   public static final float b = 0.4F;
   public static final float c = 0.3F;
   private int cb;
   protected static final ImmutableList<cgi<? extends cgh<? super cjl>>> bZ = ImmutableList.of(cgi.c, cgi.d, cgi.f, cgi.s);
   protected static final ImmutableList<cfb<?>> ca = ImmutableList.of(cfb.n, cfb.h, cfb.m, cfb.E, cfb.t, cfb.K, cfb.P, cfb.R, cfb.O, cfb.r, cfb.Z);

   public cjl(bvi<? extends chk> $$0, dgz $$1) {
      super($$0, $$1);
      this.bQ = new cca(this, 85, 10, 0.02F, 0.1F, true);
      this.bP = new cbz(this, 10);
   }

   @Override
   protected cfj b(dgz $$0) {
      return new cfl(this, $$0);
   }

   @Override
   protected bwz.b<cjl> ed() {
      return bwz.a(ca, bZ);
   }

   @Override
   protected bwz<?> a(Dynamic<?> $$0) {
      return cjm.a(this.ed().a($$0));
   }

   @Override
   public bwz<cjl> ec() {
      return (bwz<cjl>)super.ec();
   }

   @Override
   protected awu go() {
      return awv.Aj;
   }

   @Override
   protected void a(arx $$0) {
      bpj $$1 = bpi.a();
      $$1.a("tadpoleBrain");
      this.ec().a($$0, this);
      $$1.c();
      $$1.a("tadpoleActivityUpdate");
      cjm.a(this);
      $$1.c();
      super.a($$0);
   }

   public static bxe.a gp() {
      return cho.gt().a(bxf.v, 1.0).a(bxf.s, 6.0);
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dW().C) {
         this.c(this.cb + 1);
      }
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      $$0.a("Age", this.cb);
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      this.c($$0.h("Age"));
   }

   @Nullable
   @Override
   protected awu u() {
      return null;
   }

   @Nullable
   @Override
   protected awu e(btr $$0) {
      return awv.Al;
   }

   @Nullable
   @Override
   protected awu o_() {
      return awv.Ai;
   }

   @Override
   public bta b(cpo $$0, bsz $$1) {
      cxg $$2 = $$0.b($$1);
      if (this.j($$2)) {
         this.a($$0, $$2);
         return bta.a;
      } else {
         return chq.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void Y() {
      super.Y();
      agy.a(this);
   }

   @Override
   public boolean p() {
      return true;
   }

   @Override
   public void x(boolean $$0) {
   }

   @Override
   public void i(cxg $$0) {
      chq.a(this, $$0);
      czp.a(ku.X, $$0, $$0x -> $$0x.a("Age", this.gq()));
   }

   @Override
   public void h(um $$0) {
      chq.a(this, $$0);
      if ($$0.e("Age")) {
         this.c($$0.h("Age"));
      }
   }

   @Override
   public cxg X_() {
      return new cxg(cxk.rr);
   }

   @Override
   public awu t() {
      return awv.do;
   }

   private boolean j(cxg $$0) {
      return $$0.a(axt.aq);
   }

   private void a(cpo $$0, cxg $$1) {
      this.b($$0, $$1);
      this.b(bus.d_(this.gs()));
      this.dW().a(ls.P, this.d(1.0), this.dE() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(cpo $$0, cxg $$1) {
      $$1.a(1, $$0);
   }

   private int gq() {
      return this.cb;
   }

   private void b(int $$0) {
      this.c(this.cb + $$0 * 20);
   }

   private void c(int $$0) {
      this.cb = $$0;
      if (this.cb >= a) {
         this.gr();
      }
   }

   private void gr() {
      if (this.dW() instanceof arx $$0) {
         this.a(bvi.ac, buw.a(this, false, false), $$1 -> {
            $$1.a($$0, this.dW().d_($$1.dw()), bvh.i, null);
            $$1.ai();
            $$1.a(this.a(this.aw()));
            this.a(awv.Ak, 0.15F, 1.0F);
         });
      }
   }

   private int gs() {
      return Math.max(0, a - this.cb);
   }

   @Override
   public boolean en() {
      return false;
   }
}
