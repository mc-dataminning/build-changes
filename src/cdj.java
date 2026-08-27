import javax.annotation.Nullable;

public class cdj extends cdi implements biu, cdk {
   private static final int f = 27;
   private hp<cja> g = hp.a(27, cja.b);
   @Nullable
   private aeu h;
   private long i;

   public cdj(bip<? extends cdi> $$0, cpq $$1) {
      super($$0, $$1);
   }

   public cdj(cpq $$0, double $$1, double $$2, double $$3) {
      this(bip.o, $$0);
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
   protected void b(qu $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   protected void a(qu $$0) {
      super.a($$0);
      this.b_($$0);
   }

   @Override
   public void a(bhj $$0) {
      super.a($$0);
      this.a($$0, this.dK(), this);
   }

   @Override
   public void a(bil.c $$0) {
      if (!this.dK().B && $$0.a()) {
         bgp.a(this.dK(), this, this);
      }

      super.a($$0);
   }

   @Override
   public bgt a(cbp $$0, bgs $$1) {
      if (this.r($$0) && !$$0.fG()) {
         return super.a($$0, $$1);
      } else {
         bgt $$2 = this.c_($$0);
         if ($$2.a()) {
            this.a(djo.k, $$0);
            cag.a($$0, true);
         }

         return $$2;
      }
   }

   @Override
   public void b(cbp $$0) {
      $$0.a((bgw)this);
      if (!$$0.dK().B) {
         this.a(djo.k, $$0);
         cag.a($$0, true);
      }
   }

   @Override
   public civ j() {
      return switch (this.v()) {
         case b -> cjd.nl;
         case c -> cjd.nn;
         case d -> cjd.np;
         case e -> cjd.nr;
         case f -> cjd.nt;
         case g -> cjd.nv;
         case h -> cjd.nx;
         case i -> cjd.nz;
         default -> cjd.nj;
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
   public cja a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cja a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cja b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cja $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bjt a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cbp $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public ceg createMenu(int $$0, cbo $$1, cbp $$2) {
      if (this.h != null && $$2.G_()) {
         return null;
      } else {
         this.e($$1.m);
         return cen.a($$0, $$1, this);
      }
   }

   public void e(@Nullable cbp $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public aeu A() {
      return this.h;
   }

   @Override
   public void a(@Nullable aeu $$0) {
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
   public hp<cja> D() {
      return this.g;
   }

   @Override
   public void E() {
      this.g = hp.a(this.b(), cja.b);
   }

   @Override
   public void c(cbp $$0) {
      this.dK().a(djo.j, this.di(), djo.a.a($$0));
   }
}
