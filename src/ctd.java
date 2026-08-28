import java.util.function.Supplier;
import javax.annotation.Nullable;

public abstract class ctd extends ctc implements bwr, ctj {
   private static final int h = 27;
   private jn<cys> i = jn.a(27, cys.k);
   @Nullable
   private ald<eys> j;
   private long k;

   public ctd(bwj<? extends ctd> $$0, dip $$1, Supplier<cyo> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected float m() {
      return 0.15F;
   }

   @Override
   protected int n() {
      return 1;
   }

   @Override
   protected void b(tx $$0) {
      super.b($$0);
      this.a($$0, this.dX());
   }

   @Override
   protected void a(tx $$0) {
      super.a($$0);
      this.b($$0, this.dX());
   }

   @Override
   public void a(aro $$0, bup $$1) {
      this.a($$0, this.o());
      this.a($$1, $$0, this);
   }

   @Override
   public void a(bwa.e $$0) {
      if (!this.dV().C && $$0.a()) {
         btu.a(this.dV(), this, this);
      }

      super.a($$0);
   }

   @Override
   public bty a(cqs $$0, btx $$1) {
      if (!$$0.fX()) {
         bty $$2 = super.a($$0, $$1);
         if ($$2 != bty.e) {
            return $$2;
         }
      }

      if (this.r($$0) && !$$0.fX()) {
         return bty.e;
      } else {
         bty $$3 = this.b_($$0);
         if ($$3.a() && $$0.dV() instanceof aro $$4) {
            this.a(eeo.k, $$0);
            cpi.a($$4, $$0, true);
         }

         return $$3;
      }
   }

   @Override
   public void b(cqs $$0) {
      $$0.a(this);
      if ($$0.dV() instanceof aro $$1) {
         this.a(eeo.k, $$0);
         cpi.a($$1, $$0, true);
      }
   }

   @Override
   public void a() {
      this.af_();
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   public cys a(int $$0) {
      return this.g_($$0);
   }

   @Override
   public cys a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cys b(int $$0) {
      return this.f_($$0);
   }

   @Override
   public void a(int $$0, cys $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bxq a_(int $$0) {
      return this.h_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cqs $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public cuk createMenu(int $$0, cqr $$1, cqs $$2) {
      if (this.j != null && $$2.U_()) {
         return null;
      } else {
         this.e($$1.k);
         return cut.a($$0, $$1, this);
      }
   }

   public void e(@Nullable cqs $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public ald<eys> q() {
      return this.j;
   }

   @Override
   public void a(@Nullable ald<eys> $$0) {
      this.j = $$0;
   }

   @Override
   public long s() {
      return this.k;
   }

   @Override
   public void a(long $$0) {
      this.k = $$0;
   }

   @Override
   public jn<cys> t() {
      return this.i;
   }

   @Override
   public void u() {
      this.i = jn.a(this.b(), cys.k);
   }

   @Override
   public void c(cqs $$0) {
      this.dV().a(eeo.j, this.dt(), eeo.a.a($$0));
   }
}
