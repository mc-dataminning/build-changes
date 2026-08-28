import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cla extends ciq {
   @VisibleForTesting
   public static int a = Math.abs(-24000);
   public static final float b = 0.4F;
   public static final float c = 0.3F;
   private int bI;
   protected static final ImmutableList<chn<? extends chm<? super cla>>> bG = ImmutableList.of(chn.c, chn.d, chn.f, chn.s);
   protected static final ImmutableList<cgg<?>> bH = ImmutableList.of(cgg.o, cgg.h, cgg.n, cgg.F, cgg.u, cgg.L, cgg.Q, cgg.S, cgg.P, cgg.s, cgg.aa);

   public cla(bwo<? extends ciq> $$0, dja $$1) {
      super($$0, $$1);
      this.bA = new cdf(this, 85, 10, 0.02F, 0.1F, true);
      this.bz = new cde(this, 10);
   }

   @Override
   protected cgo b(dja $$0) {
      return new cgq(this, $$0);
   }

   @Override
   protected bye.b<cla> ed() {
      return bye.a(bH, bG);
   }

   @Override
   protected bye<?> a(Dynamic<?> $$0) {
      return clb.a(this.ed().a($$0));
   }

   @Override
   public bye<cla> ec() {
      return (bye<cla>)super.ec();
   }

   @Override
   protected awm t() {
      return awn.Ay;
   }

   @Override
   protected void a(arq $$0) {
      bqo $$1 = bqn.a();
      $$1.a("tadpoleBrain");
      this.ec().a($$0, this);
      $$1.c();
      $$1.a("tadpoleActivityUpdate");
      clb.a(this);
      $$1.c();
      super.a($$0);
   }

   public static byj.a x() {
      return ciu.gw().a(byk.v, 1.0).a(byk.s, 6.0);
   }

   @Override
   public void k_() {
      super.k_();
      if (!this.dV().C) {
         this.c(this.bI + 1);
      }
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("Age", this.bI);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.c($$0.h("Age"));
   }

   @Nullable
   @Override
   protected awm u() {
      return null;
   }

   @Nullable
   @Override
   protected awm e(buu $$0) {
      return awn.AA;
   }

   @Nullable
   @Override
   protected awm l_() {
      return awn.Ax;
   }

   @Override
   public bud b(crc $$0, buc $$1) {
      czd $$2 = $$0.b($$1);
      if (this.j($$2)) {
         this.a($$0, $$2);
         return bud.a;
      } else {
         return ciw.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void ab() {
      super.ab();
      agm.a(this);
   }

   @Override
   public boolean m() {
      return true;
   }

   @Override
   public void w(boolean $$0) {
   }

   @Override
   public void a_(czd $$0) {
      ciw.a(this, $$0);
      dbl.a(kj.Z, $$0, $$0x -> $$0x.a("Age", this.gr()));
   }

   @Override
   public void h(tz $$0) {
      ciw.a(this, $$0);
      if ($$0.e("Age")) {
         this.c($$0.h("Age"));
      }
   }

   @Override
   public czd S_() {
      return new czd(czh.rA);
   }

   @Override
   public awm n() {
      return awn.do;
   }

   private boolean j(czd $$0) {
      return $$0.a(axk.ap);
   }

   private void a(crc $$0, czd $$1) {
      this.b($$0, $$1);
      this.b(bvv.d_(this.gt()));
      this.dV().a(lx.Q, this.d(1.0), this.dD() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(crc $$0, czd $$1) {
      $$1.a(1, $$0);
   }

   private int gr() {
      return this.bI;
   }

   private void b(int $$0) {
      this.c(this.bI + $$0 * 20);
   }

   private void c(int $$0) {
      this.bI = $$0;
      if (this.bI >= a) {
         this.gs();
      }
   }

   private void gs() {
      if (this.dV() instanceof arq $$0) {
         this.a(bwo.ab, bvz.a(this, false, false), $$1 -> {
            $$1.a($$0, this.dV().d_($$1.dv()), bwn.i, null);
            $$1.fZ();
            $$1.a(this.a(this.aw()));
            this.a(awn.Az, 0.15F, 1.0F);
         });
      }
   }

   private int gt() {
      return Math.max(0, a - this.bI);
   }

   @Override
   public boolean eo() {
      return false;
   }
}
