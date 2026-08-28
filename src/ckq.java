import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class ckq extends cik {
   @VisibleForTesting
   public static int a = Math.abs(-24000);
   public static final float b = 0.4F;
   public static final float c = 0.3F;
   private int bH;
   protected static final ImmutableList<chi<? extends chh<? super ckq>>> bF = ImmutableList.of(chi.c, chi.d, chi.f, chi.s);
   protected static final ImmutableList<cgb<?>> bG = ImmutableList.of(cgb.o, cgb.h, cgb.n, cgb.F, cgb.u, cgb.L, cgb.Q, cgb.S, cgb.P, cgb.s, cgb.aa);

   public ckq(bwj<? extends cik> $$0, dip $$1) {
      super($$0, $$1);
      this.bz = new cda(this, 85, 10, 0.02F, 0.1F, true);
      this.by = new ccz(this, 10);
   }

   @Override
   protected cgj b(dip $$0) {
      return new cgl(this, $$0);
   }

   @Override
   protected bxz.b<ckq> ec() {
      return bxz.a(bG, bF);
   }

   @Override
   protected bxz<?> a(Dynamic<?> $$0) {
      return ckr.a(this.ec().a($$0));
   }

   @Override
   public bxz<ckq> eb() {
      return (bxz<ckq>)super.eb();
   }

   @Override
   protected awk t() {
      return awl.As;
   }

   @Override
   protected void a(aro $$0) {
      bqj $$1 = bqi.a();
      $$1.a("tadpoleBrain");
      this.eb().a($$0, this);
      $$1.c();
      $$1.a("tadpoleActivityUpdate");
      ckr.a(this);
      $$1.c();
      super.a($$0);
   }

   public static bye.a x() {
      return cio.gv().a(byf.v, 1.0).a(byf.s, 6.0);
   }

   @Override
   public void k_() {
      super.k_();
      if (!this.dV().C) {
         this.c(this.bH + 1);
      }
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("Age", this.bH);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.c($$0.h("Age"));
   }

   @Nullable
   @Override
   protected awk u() {
      return null;
   }

   @Nullable
   @Override
   protected awk e(bup $$0) {
      return awl.Au;
   }

   @Nullable
   @Override
   protected awk l_() {
      return awl.Ar;
   }

   @Override
   public bty b(cqs $$0, btx $$1) {
      cys $$2 = $$0.b($$1);
      if (this.k($$2)) {
         this.a($$0, $$2);
         return bty.a;
      } else {
         return ciq.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void ab() {
      super.ab();
      agk.a(this);
   }

   @Override
   public boolean m() {
      return true;
   }

   @Override
   public void w(boolean $$0) {
   }

   @Override
   public void j(cys $$0) {
      ciq.a(this, $$0);
      dba.a(kj.Z, $$0, $$0x -> $$0x.a("Age", this.gq()));
   }

   @Override
   public void h(tx $$0) {
      ciq.a(this, $$0);
      if ($$0.e("Age")) {
         this.c($$0.h("Age"));
      }
   }

   @Override
   public cys R_() {
      return new cys(cyw.rv);
   }

   @Override
   public awk n() {
      return awl.do;
   }

   private boolean k(cys $$0) {
      return $$0.a(axi.ao);
   }

   private void a(cqs $$0, cys $$1) {
      this.b($$0, $$1);
      this.b(bvq.d_(this.gs()));
      this.dV().a(lx.Q, this.d(1.0), this.dD() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(cqs $$0, cys $$1) {
      $$1.a(1, $$0);
   }

   private int gq() {
      return this.bH;
   }

   private void b(int $$0) {
      this.c(this.bH + $$0 * 20);
   }

   private void c(int $$0) {
      this.bH = $$0;
      if (this.bH >= a) {
         this.gr();
      }
   }

   private void gr() {
      if (this.dV() instanceof aro $$0) {
         this.a(bwj.ab, bvu.a(this, false, false), $$1 -> {
            $$1.a($$0, this.dV().d_($$1.dv()), bwi.i, null);
            $$1.fY();
            $$1.a(this.a(this.aw()));
            this.a(awl.At, 0.15F, 1.0F);
         });
      }
   }

   private int gs() {
      return Math.max(0, a - this.bH);
   }

   @Override
   public boolean en() {
      return false;
   }
}
