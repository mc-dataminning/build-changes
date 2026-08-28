import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public abstract class cqw extends cpk {
   protected static final aku<Boolean> a = aky.a(cqw.class, akw.k);
   public static final int b = 300;
   private static final boolean d = false;
   private static final int e = 0;
   protected int c = 0;

   public cqw(bxn<? extends cqw> $$0, dkj $$1) {
      super($$0, $$1);
      this.a_(true);
      this.u();
      this.a(eyr.n, 16.0F);
      this.a(eyr.o, -1.0F);
   }

   private void u() {
      if (ciz.a(this)) {
         ((cho)this.N()).b(true);
      }
   }

   protected abstract boolean m();

   public void w(boolean $$0) {
      this.ar().a(a, $$0);
   }

   protected boolean p() {
      return this.ar().a(a);
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(a, false);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("IsImmuneToZombification", this.p());
      $$0.a("TimeInOverworld", this.c);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      if (!$$0.b("CanPickUpLoot")) {
         this.a_(true);
      }

      this.w($$0.b("IsImmuneToZombification", false));
      this.c = $$0.b("TimeInOverworld", 0);
   }

   @Override
   protected void a(asb $$0) {
      super.a($$0);
      if (this.gu()) {
         this.c++;
      } else {
         this.c = 0;
      }

      if (this.c > 300) {
         this.gy();
         this.g($$0);
      }
   }

   @VisibleForTesting
   public void b(int $$0) {
      this.c = $$0;
   }

   public boolean gu() {
      return !this.dV().F_().b() && !this.p() && !this.gj();
   }

   protected void g(asb $$0) {
      this.a(bxn.bS, bwy.a(this, true, true), $$0x -> $$0x.a(new bwi(bwk.i, 200, 0)));
   }

   public boolean gv() {
      return !this.e_();
   }

   public abstract cqz gw();

   @Nullable
   @Override
   public byf e() {
      return this.P();
   }

   protected boolean gx() {
      return this.fb().c(kl.A);
   }

   @Override
   public void S() {
      if (cqy.c(this)) {
         super.S();
      }
   }

   @Override
   protected void ab() {
      super.ab();
      agx.a(this);
   }

   protected abstract void gy();
}
