import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public abstract class cnh extends cly {
   protected static final akm<Boolean> a = akq.a(cnh.class, ako.k);
   public static final int b = 300;
   protected int c;

   public cnh(bus<? extends cnh> $$0, dfm $$1) {
      super($$0, $$1);
      this.a_(true);
      this.v();
      this.a(esm.n, 16.0F);
      this.a(esm.o, -1.0F);
   }

   private void v() {
      if (cgd.a(this)) {
         ((ces)this.L()).b(true);
      }
   }

   @Override
   protected abstract boolean n();

   public void x(boolean $$0) {
      this.au().a(a, $$0);
   }

   protected boolean q() {
      return this.au().a(a);
   }

   @Override
   protected void a(akq.a $$0) {
      super.a($$0);
      $$0.a(a, false);
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      if (this.q()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.c);
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      this.x($$0.q("IsImmuneToZombification"));
      this.c = $$0.h("TimeInOverworld");
   }

   @Override
   protected void a(arp $$0) {
      super.a($$0);
      if (this.gm()) {
         this.c++;
      } else {
         this.c = 0;
      }

      if (this.c > 300) {
         this.gq();
         this.g($$0);
      }
   }

   @VisibleForTesting
   public void b(int $$0) {
      this.c = $$0;
   }

   public boolean gm() {
      return !this.dV().F_().b() && !this.q() && !this.fZ();
   }

   protected void g(arp $$0) {
      this.a(bus.bN, bug.a(this, true, true), $$0x -> $$0x.a(new btq(bts.i, 200, 0)));
   }

   public boolean gn() {
      return !this.e_();
   }

   public abstract cnk go();

   @Nullable
   @Override
   public bvh aa_() {
      return this.O();
   }

   protected boolean gp() {
      return this.eX().b(ku.B);
   }

   @Override
   public void R() {
      if (cnj.c(this)) {
         super.R();
      }
   }

   @Override
   protected void Y() {
      super.Y();
      agt.a(this);
   }

   protected abstract void gq();
}
