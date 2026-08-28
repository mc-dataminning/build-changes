import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class ckg extends cic {
   @VisibleForTesting
   public static int a = Math.abs(-24000);
   public static final float b = 0.4F;
   public static final float c = 0.3F;
   private int bG;
   protected static final ImmutableList<cha<? extends cgz<? super ckg>>> bE = ImmutableList.of(cha.c, cha.d, cha.f, cha.s);
   protected static final ImmutableList<cft<?>> bF = ImmutableList.of(cft.o, cft.h, cft.n, cft.F, cft.u, cft.L, cft.Q, cft.S, cft.P, cft.s, cft.aa);

   public ckg(bwb<? extends cic> $$0, dhp $$1) {
      super($$0, $$1);
      this.by = new ccs(this, 85, 10, 0.02F, 0.1F, true);
      this.bx = new ccr(this, 10);
   }

   @Override
   protected cgb b(dhp $$0) {
      return new cgd(this, $$0);
   }

   @Override
   protected bxr.b<ckg> ec() {
      return bxr.a(bF, bE);
   }

   @Override
   protected bxr<?> a(Dynamic<?> $$0) {
      return ckh.a(this.ec().a($$0));
   }

   @Override
   public bxr<ckg> eb() {
      return (bxr<ckg>)super.eb();
   }

   @Override
   protected awj t() {
      return awk.As;
   }

   @Override
   protected void a(arn $$0) {
      bqb $$1 = bqa.a();
      $$1.a("tadpoleBrain");
      this.eb().a($$0, this);
      $$1.c();
      $$1.a("tadpoleActivityUpdate");
      ckh.a(this);
      $$1.c();
      super.a($$0);
   }

   public static bxw.a x() {
      return cig.gv().a(bxx.v, 1.0).a(bxx.s, 6.0);
   }

   @Override
   public void k_() {
      super.k_();
      if (!this.dV().C) {
         this.c(this.bG + 1);
      }
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      $$0.a("Age", this.bG);
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      this.c($$0.h("Age"));
   }

   @Nullable
   @Override
   protected awj u() {
      return null;
   }

   @Nullable
   @Override
   protected awj e(buh $$0) {
      return awk.Au;
   }

   @Nullable
   @Override
   protected awj l_() {
      return awk.Ar;
   }

   @Override
   public btq b(cqi $$0, btp $$1) {
      cxy $$2 = $$0.b($$1);
      if (this.k($$2)) {
         this.a($$0, $$2);
         return btq.a;
      } else {
         return cii.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void ab() {
      super.ab();
      agj.a(this);
   }

   @Override
   public boolean m() {
      return true;
   }

   @Override
   public void w(boolean $$0) {
   }

   @Override
   public void j(cxy $$0) {
      cii.a(this, $$0);
      dae.a(kx.Z, $$0, $$0x -> $$0x.a("Age", this.gq()));
   }

   @Override
   public void h(tw $$0) {
      cii.a(this, $$0);
      if ($$0.e("Age")) {
         this.c($$0.h("Age"));
      }
   }

   @Override
   public cxy R_() {
      return new cxy(cyc.rv);
   }

   @Override
   public awj n() {
      return awk.do;
   }

   private boolean k(cxy $$0) {
      return $$0.a(axi.ao);
   }

   private void a(cqi $$0, cxy $$1) {
      this.b($$0, $$1);
      this.b(bvi.d_(this.gs()));
      this.dV().a(lv.Q, this.d(1.0), this.dD() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(cqi $$0, cxy $$1) {
      $$1.a(1, $$0);
   }

   private int gq() {
      return this.bG;
   }

   private void b(int $$0) {
      this.c(this.bG + $$0 * 20);
   }

   private void c(int $$0) {
      this.bG = $$0;
      if (this.bG >= a) {
         this.gr();
      }
   }

   private void gr() {
      if (this.dV() instanceof arn $$0) {
         this.a(bwb.ab, bvm.a(this, false, false), $$1 -> {
            $$1.a($$0, this.dV().d_($$1.dv()), bwa.i, null);
            $$1.fY();
            $$1.a(this.a(this.aw()));
            this.a(awk.At, 0.15F, 1.0F);
         });
      }
   }

   private int gs() {
      return Math.max(0, a - this.bG);
   }

   @Override
   public boolean en() {
      return false;
   }
}
