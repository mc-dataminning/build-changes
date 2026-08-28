import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public abstract class cql extends coz {
   protected static final akl<Boolean> a = akp.a(cql.class, akn.k);
   public static final int b = 300;
   private static final boolean d = false;
   private static final int e = 0;
   protected int c = 0;

   public cql(bxc<? extends cql> $$0, djx $$1) {
      super($$0, $$1);
      this.a_(true);
      this.n();
      this.a(eyf.n, 16.0F);
      this.a(eyf.o, -1.0F);
   }

   private void n() {
      if (cio.a(this)) {
         ((chd)this.O()).b(true);
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
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(a, false);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("IsImmuneToZombification", this.m());
      $$0.a("TimeInOverworld", this.c);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      if (!$$0.b("CanPickUpLoot")) {
         this.a_(true);
      }

      this.w($$0.b("IsImmuneToZombification", false));
      this.c = $$0.b("TimeInOverworld", 0);
   }

   @Override
   protected void a(ars $$0) {
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

   protected void g(ars $$0) {
      this.a(bxc.bS, bwn.a(this, true, true), $$0x -> $$0x.a(new bvx(bvz.i, 200, 0)));
   }

   public boolean t() {
      return !this.n_();
   }

   public abstract cqo x();

   @Nullable
   @Override
   public bxu f() {
      return this.Q();
   }

   protected boolean gu() {
      return this.fb().c(kk.A);
   }

   @Override
   public void T() {
      if (cqn.c(this)) {
         super.T();
      }
   }

   @Override
   protected void ac() {
      super.ac();
      ago.a(this);
   }

   protected abstract void gv();
}
