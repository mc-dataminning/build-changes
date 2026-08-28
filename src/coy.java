import javax.annotation.Nullable;

public class coy extends cox implements btk, coz {
   private static final int i = 27;
   private jr<cur> j = jr.a(27, cur.l);
   @Nullable
   private ale<eqp> k;
   private long l;

   public coy(btc<? extends cox> $$0, dca $$1) {
      super($$0, $$1);
   }

   public coy(dca $$0, double $$1, double $$2, double $$3) {
      super(btc.r, $$0);
      this.a_($$1, $$2, $$3);
      this.L = $$1;
      this.M = $$2;
      this.N = $$3;
   }

   @Override
   protected float w() {
      return 0.15F;
   }

   @Override
   protected int y() {
      return 1;
   }

   @Override
   protected void b(us $$0) {
      super.b($$0);
      this.a($$0, this.dR());
   }

   @Override
   protected void a(us $$0) {
      super.a($$0);
      this.b($$0, this.dR());
   }

   @Override
   public void a(brp $$0) {
      this.b(this.ag_());
      this.a($$0, this.dP(), this);
   }

   @Override
   public void a(bsw.c $$0) {
      if (!this.dP().B && $$0.a()) {
         bqs.a(this.dP(), this, this);
      }

      super.a($$0);
   }

   @Override
   public bqw a(cmz $$0, bqv $$1) {
      if (this.r($$0) && !$$0.fR()) {
         return super.a($$0, $$1);
      } else {
         bqw $$2 = this.c_($$0);
         if ($$2.a()) {
            this.a(dwx.k, $$0);
            clq.a($$0, true);
         }

         return $$2;
      }
   }

   @Override
   public void b(cmz $$0) {
      $$0.a(this);
      if (!$$0.dP().B) {
         this.a(dwx.k, $$0);
         clq.a($$0, true);
      }
   }

   @Override
   public cum ag_() {
      return switch (this.x()) {
         case b -> cuu.nX;
         case c -> cuu.nZ;
         case d -> cuu.ob;
         case e -> cuu.od;
         case f -> cuu.of;
         case g -> cuu.oh;
         case h -> cuu.oj;
         case i -> cuu.ol;
         default -> cuu.nV;
      };
   }

   @Override
   public void a() {
      this.f();
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   public cur a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cur a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cur b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cur $$1) {
      this.c($$0, $$1);
   }

   @Override
   public buj a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cmz $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public cpw createMenu(int $$0, cmy $$1, cmz $$2) {
      if (this.k != null && $$2.N_()) {
         return null;
      } else {
         this.e($$1.l);
         return cqd.a($$0, $$1, this);
      }
   }

   public void e(@Nullable cmz $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public ale<eqp> B() {
      return this.k;
   }

   @Override
   public void a(@Nullable ale<eqp> $$0) {
      this.k = $$0;
   }

   @Override
   public long C() {
      return this.l;
   }

   @Override
   public void a(long $$0) {
      this.l = $$0;
   }

   @Override
   public jr<cur> D() {
      return this.j;
   }

   @Override
   public void E() {
      this.j = jr.a(this.b(), cur.l);
   }

   @Override
   public void c(cmz $$0) {
      this.dP().a(dwx.j, this.dn(), dwx.a.a($$0));
   }
}
