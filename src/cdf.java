import javax.annotation.Nullable;

public class cdf extends cde implements bip, cdg {
   private static final int f = 27;
   private ho<ciw> g = ho.a(27, ciw.b);
   @Nullable
   private aep h;
   private long i;

   public cdf(bik<? extends cde> $$0, cpk $$1) {
      super($$0, $$1);
   }

   public cdf(cpk $$0, double $$1, double $$2, double $$3) {
      this(bik.o, $$0);
      this.e($$1, $$2, $$3);
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
   }

   @Override
   protected float q() {
      return 0.15F;
   }

   @Override
   protected int w() {
      return 1;
   }

   @Override
   protected void b(qs $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   protected void a(qs $$0) {
      super.a($$0);
      this.b_($$0);
   }

   @Override
   public void a(bhe $$0) {
      super.a($$0);
      this.a($$0, this.dK(), this);
   }

   @Override
   public void a(big.c $$0) {
      if (!this.dK().B && $$0.a()) {
         bgk.a(this.dK(), this, this);
      }

      super.a($$0);
   }

   @Override
   public bgo a(cbl $$0, bgn $$1) {
      if (this.r($$0) && !$$0.fG()) {
         return super.a($$0, $$1);
      } else {
         bgo $$2 = this.c_($$0);
         if ($$2.a()) {
            this.a(dji.k, $$0);
            cac.a($$0, true);
         }

         return $$2;
      }
   }

   @Override
   public void b(cbl $$0) {
      $$0.a((bgr)this);
      if (!$$0.dK().B) {
         this.a(dji.k, $$0);
         cac.a($$0, true);
      }
   }

   @Override
   public cir j() {
      return switch (this.v()) {
         case b -> ciz.nl;
         case c -> ciz.nn;
         case d -> ciz.np;
         case e -> ciz.nr;
         case f -> ciz.nt;
         case g -> ciz.nv;
         case h -> ciz.nx;
         case i -> ciz.nz;
         default -> ciz.nj;
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
   public ciw a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public ciw a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public ciw b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, ciw $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bjp a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cbl $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public cec createMenu(int $$0, cbk $$1, cbl $$2) {
      if (this.h != null && $$2.G_()) {
         return null;
      } else {
         this.e($$1.m);
         return cej.a($$0, $$1, this);
      }
   }

   public void e(@Nullable cbl $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public aep A() {
      return this.h;
   }

   @Override
   public void a(@Nullable aep $$0) {
      this.h = $$0;
   }

   @Override
   public long B() {
      return this.i;
   }

   @Override
   public void a(long $$0) {
      this.i = $$0;
   }

   @Override
   public ho<ciw> D() {
      return this.g;
   }

   @Override
   public void E() {
      this.g = ho.a(this.b(), ciw.b);
   }

   @Override
   public void c(cbl $$0) {
      this.dK().a(dji.j, this.di(), dji.a.a($$0));
   }
}
