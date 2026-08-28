import java.util.function.Supplier;
import javax.annotation.Nullable;

public abstract class cuu extends cut implements bxv, cva {
   private static final int j = 27;
   private jp<dak> k = jp.a(27, dak.l);
   @Nullable
   private alq<fay> l;
   private long m;

   public cuu(bxn<? extends cuu> $$0, dkj $$1, Supplier<dag> $$2) {
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
   protected void b(ua $$0) {
      super.b($$0);
      this.a($$0, this.dX());
   }

   @Override
   protected void a(ua $$0) {
      super.a($$0);
      this.b($$0, this.dX());
   }

   @Override
   public void a(asb $$0, bvt $$1) {
      this.a($$0, this.p());
      this.a($$1, $$0, this);
   }

   @Override
   public void a(bxe.d $$0) {
      if (!this.dV().C && $$0.a()) {
         buy.a(this.dV(), this, this);
      }

      super.a($$0);
   }

   @Override
   public bvc a(csi $$0, bvb $$1) {
      if (!$$0.fY()) {
         bvc $$2 = super.a($$0, $$1);
         if ($$2 != bvc.e) {
            return $$2;
         }
      }

      if (this.r($$0) && !$$0.fY()) {
         return bvc.e;
      } else {
         bvc $$3 = this.b_($$0);
         if ($$3.a() && $$0.dV() instanceof asb $$4) {
            this.a(egq.k, $$0);
            cqy.a($$4, $$0, true);
         }

         return $$3;
      }
   }

   @Override
   public void b(csi $$0) {
      $$0.a(this);
      if ($$0.dV() instanceof asb $$1) {
         this.a(egq.k, $$0);
         cqy.a($$1, $$0, true);
      }
   }

   @Override
   public void a() {
      this.ah_();
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   public dak a(int $$0) {
      return this.g_($$0);
   }

   @Override
   public dak a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public dak b(int $$0) {
      return this.f_($$0);
   }

   @Override
   public void a(int $$0, dak $$1) {
      this.c($$0, $$1);
   }

   @Override
   public byw a_(int $$0) {
      return this.h_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(csi $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public cwb createMenu(int $$0, csh $$1, csi $$2) {
      if (this.l != null && $$2.ak()) {
         return null;
      } else {
         this.e($$1.h);
         return cwk.a($$0, $$1, this);
      }
   }

   public void e(@Nullable csi $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public alq<fay> r() {
      return this.l;
   }

   @Override
   public void a(@Nullable alq<fay> $$0) {
      this.l = $$0;
   }

   @Override
   public long s() {
      return this.m;
   }

   @Override
   public void a(long $$0) {
      this.m = $$0;
   }

   @Override
   public jp<dak> t() {
      return this.k;
   }

   @Override
   public void u() {
      this.k = jp.a(this.b(), dak.l);
   }

   @Override
   public void c(csi $$0) {
      this.dV().a(egq.j, this.dt(), egq.a.a($$0));
   }
}
