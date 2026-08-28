import java.util.function.Supplier;
import javax.annotation.Nullable;

public abstract class csg extends csf implements bwj, csm {
   private static final int h = 27;
   private kb<cxy> i = kb.a(27, cxy.k);
   @Nullable
   private alc<exq> j;
   private long k;

   public csg(bwb<? extends csg> $$0, dhp $$1, Supplier<cxu> $$2) {
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
   protected void b(tw $$0) {
      super.b($$0);
      this.a($$0, this.dX());
   }

   @Override
   protected void a(tw $$0) {
      super.a($$0);
      this.b($$0, this.dX());
   }

   @Override
   public void a(arn $$0, buh $$1) {
      this.a($$0, this.o());
      this.a($$1, $$0, this);
   }

   @Override
   public void a(bvs.e $$0) {
      if (!this.dV().C && $$0.a()) {
         btm.a(this.dV(), this, this);
      }

      super.a($$0);
   }

   @Override
   public btq a(cqi $$0, btp $$1) {
      if (!$$0.fX()) {
         btq $$2 = super.a($$0, $$1);
         if ($$2 != btq.e) {
            return $$2;
         }
      }

      if (this.r($$0) && !$$0.fX()) {
         return btq.e;
      } else {
         btq $$3 = this.b_($$0);
         if ($$3.a() && $$0.dV() instanceof arn $$4) {
            this.a(edm.k, $$0);
            coy.a($$4, $$0, true);
         }

         return $$3;
      }
   }

   @Override
   public void b(cqi $$0) {
      $$0.a(this);
      if ($$0.dV() instanceof arn $$1) {
         this.a(edm.k, $$0);
         coy.a($$1, $$0, true);
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
   public cxy a(int $$0) {
      return this.g_($$0);
   }

   @Override
   public cxy a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cxy b(int $$0) {
      return this.f_($$0);
   }

   @Override
   public void a(int $$0, cxy $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bxi a_(int $$0) {
      return this.h_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cqi $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public ctn createMenu(int $$0, cqh $$1, cqi $$2) {
      if (this.j != null && $$2.U_()) {
         return null;
      } else {
         this.e($$1.k);
         return ctw.a($$0, $$1, this);
      }
   }

   public void e(@Nullable cqi $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public alc<exq> q() {
      return this.j;
   }

   @Override
   public void a(@Nullable alc<exq> $$0) {
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
   public kb<cxy> t() {
      return this.i;
   }

   @Override
   public void u() {
      this.i = kb.a(this.b(), cxy.k);
   }

   @Override
   public void c(cqi $$0) {
      this.dV().a(edm.j, this.dt(), edm.a.a($$0));
   }
}
