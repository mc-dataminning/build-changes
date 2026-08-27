import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cch extends caj {
   @VisibleForTesting
   public static int b = Math.abs(-24000);
   public static float c = 0.4F;
   public static float d = 0.3F;
   private int bW;
   protected static final ImmutableList<bzh<? extends bzg<? super cch>>> e = ImmutableList.of(bzh.c, bzh.d, bzh.f, bzh.s);
   protected static final ImmutableList<bya<?>> bV = ImmutableList.of(bya.n, bya.h, bya.m, bya.E, bya.t, bya.K, bya.P, bya.R, bya.O, bya.r, bya.Z);

   public cch(bol<? extends caj> $$0, cwe $$1) {
      super($$0, $$1);
      this.bM = new buz(this, 85, 10, 0.02F, 0.1F, true);
      this.bL = new buy(this, 10);
   }

   @Override
   protected byi b(cwe $$0) {
      return new byk(this, $$0);
   }

   @Override
   protected bpy.b<cch> dN() {
      return bpy.a(bV, e);
   }

   @Override
   protected bpy<?> a(Dynamic<?> $$0) {
      return cci.a(this.dN().a($$0));
   }

   @Override
   public bpy<cch> dM() {
      return (bpy<cch>)super.dM();
   }

   @Override
   protected ato gm() {
      return atp.yN;
   }

   @Override
   protected void aa() {
      this.dJ().ae().a("tadpoleBrain");
      this.dM().a((apa)this.dJ(), this);
      this.dJ().ae().c();
      this.dJ().ae().a("tadpoleActivityUpdate");
      cci.a(this);
      this.dJ().ae().c();
      super.aa();
   }

   public static bqd.a gn() {
      return boz.C().a(bqe.o, 1.0).a(bqe.n, 6.0);
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dJ().B) {
         this.t(this.bW + 1);
      }
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      $$0.a("Age", this.bW);
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      this.t($$0.h("Age"));
   }

   @Nullable
   @Override
   protected ato y() {
      return null;
   }

   @Nullable
   @Override
   protected ato d(bne $$0) {
      return atp.yP;
   }

   @Nullable
   @Override
   protected ato n_() {
      return atp.yM;
   }

   @Override
   public bml b(cia $$0, bmk $$1) {
      cpq $$2 = $$0.b($$1);
      if (this.o($$2)) {
         this.a($$0, $$2);
         return bml.a(this.dJ().B);
      } else {
         return cao.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void Z() {
      super.Z();
      aes.a(this);
   }

   @Override
   public boolean w() {
      return true;
   }

   @Override
   public void w(boolean $$0) {
   }

   @Override
   public void n(cpq $$0) {
      cao.a(this, $$0);
      sy $$1 = $$0.x();
      $$1.a("Age", this.go());
   }

   @Override
   public void c(sy $$0) {
      cao.a(this, $$0);
      if ($$0.e("Age")) {
         this.t($$0.h("Age"));
      }
   }

   @Override
   public cpq b() {
      return new cpq(cpt.qJ);
   }

   @Override
   public ato A() {
      return atp.df;
   }

   private boolean o(cpq $$0) {
      return cce.bV.a($$0);
   }

   private void a(cia $$0, cpq $$1) {
      this.b($$0, $$1);
      this.c(boa.d_(this.gq()));
      this.dJ().a(kb.M, this.d(1.0), this.dr() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(cia $$0, cpq $$1) {
      if (!$$0.fW().d) {
         $$1.h(1);
      }
   }

   private int go() {
      return this.bW;
   }

   private void c(int $$0) {
      this.t(this.bW + $$0 * 20);
   }

   private void t(int $$0) {
      this.bW = $$0;
      if (this.bW >= b) {
         this.gp();
      }
   }

   private void gp() {
      if (this.dJ() instanceof apa $$0) {
         cce $$1 = bol.Q.a(this.dJ());
         if ($$1 != null) {
            $$1.b(this.do(), this.dq(), this.du(), this.dz(), this.dB());
            $$1.a($$0, this.dJ().d_($$1.dj()), bpb.i, null);
            $$1.t(this.gb());
            if (this.ae()) {
               $$1.b(this.af());
               $$1.n(this.cy());
            }

            $$1.fQ();
            this.a(atp.yO, 0.15F, 1.0F);
            $$0.a_($$1);
            this.am();
         }
      }
   }

   private int gq() {
      return Math.max(0, b - this.bW);
   }

   @Override
   public boolean eb() {
      return false;
   }
}
