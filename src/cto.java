import java.util.function.Supplier;
import javax.annotation.Nullable;

public abstract class cto extends ctn implements bww, ctu {
   private static final int h = 27;
   private jn<czd> i = jn.a(27, czd.k);
   @Nullable
   private alf<ezm> j;
   private long k;

   public cto(bwo<? extends cto> $$0, dja $$1, Supplier<cyz> $$2) {
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
   protected void b(tz $$0) {
      super.b($$0);
      this.a($$0, this.dX());
   }

   @Override
   protected void a(tz $$0) {
      super.a($$0);
      this.b($$0, this.dX());
   }

   @Override
   public void a(arq $$0, buu $$1) {
      this.a($$0, this.o());
      this.a($$1, $$0, this);
   }

   @Override
   public void a(bwf.e $$0) {
      if (!this.dV().C && $$0.a()) {
         btz.a(this.dV(), this, this);
      }

      super.a($$0);
   }

   @Override
   public bud a(crc $$0, buc $$1) {
      if (!$$0.fY()) {
         bud $$2 = super.a($$0, $$1);
         if ($$2 != bud.e) {
            return $$2;
         }
      }

      if (this.r($$0) && !$$0.fY()) {
         return bud.e;
      } else {
         bud $$3 = this.b_($$0);
         if ($$3.a() && $$0.dV() instanceof arq $$4) {
            this.a(efh.k, $$0);
            cps.a($$4, $$0, true);
         }

         return $$3;
      }
   }

   @Override
   public void b(crc $$0) {
      $$0.a(this);
      if ($$0.dV() instanceof arq $$1) {
         this.a(efh.k, $$0);
         cps.a($$1, $$0, true);
      }
   }

   @Override
   public void a() {
      this.ag_();
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   public czd a(int $$0) {
      return this.g_($$0);
   }

   @Override
   public czd a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public czd b(int $$0) {
      return this.f_($$0);
   }

   @Override
   public void a(int $$0, czd $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bxv a_(int $$0) {
      return this.h_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(crc $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public cuv createMenu(int $$0, crb $$1, crc $$2) {
      if (this.j != null && $$2.V_()) {
         return null;
      } else {
         this.e($$1.h);
         return cve.a($$0, $$1, this);
      }
   }

   public void e(@Nullable crc $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public alf<ezm> q() {
      return this.j;
   }

   @Override
   public void a(@Nullable alf<ezm> $$0) {
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
   public jn<czd> t() {
      return this.i;
   }

   @Override
   public void u() {
      this.i = jn.a(this.b(), czd.k);
   }

   @Override
   public void c(crc $$0) {
      this.dV().a(efh.j, this.dt(), efh.a.a($$0));
   }
}
