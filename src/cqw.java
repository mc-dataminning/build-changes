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
      this.n();
      this.a(eyr.n, 16.0F);
      this.a(eyr.o, -1.0F);
   }

   private void n() {
      if (ciz.a(this)) {
         ((cho)this.O()).b(true);
      }
   }

   protected abstract boolean j();

   public void w(boolean $$0) {
      this.ar().a(a, $$0);
   }

   protected boolean m() {
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
      $$0.a("IsImmuneToZombification", this.m());
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
      if (this.q()) {
         this.c++;
      } else {
         this.c = 0;
      }

      if (this.c > 300) {
         this.gv();
         this.g($$0);
      }
   }

   @VisibleForTesting
   public void b(int $$0) {
      this.c = $$0;
   }

   public boolean q() {
      return !this.dV().F_().b() && !this.m() && !this.gj();
   }

   protected void g(asb $$0) {
      this.a(bxn.bS, bwy.a(this, true, true), $$0x -> $$0x.a(new bwi(bwk.i, 200, 0)));
   }

   public boolean t() {
      return !this.n_();
   }

   public abstract cqz x();

   @Nullable
   @Override
   public byf f() {
      return this.Q();
   }

   protected boolean gu() {
      return this.fb().c(kl.A);
   }

   @Override
   public void T() {
      if (cqy.c(this)) {
         super.T();
      }
   }

   @Override
   protected void ac() {
      super.ac();
      agx.a(this);
   }

   protected abstract void gv();
}
