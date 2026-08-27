import javax.annotation.Nullable;

public class cdh extends cdg implements bir, cdi {
   private static final int f = 27;
   private hn<ciy> g = hn.a(27, ciy.b);
   @Nullable
   private aer h;
   private long i;

   public cdh(bim<? extends cdg> $$0, cpm $$1) {
      super($$0, $$1);
   }

   public cdh(cpm $$0, double $$1, double $$2, double $$3) {
      this(bim.o, $$0);
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
   protected void b(qr $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   protected void a(qr $$0) {
      super.a($$0);
      this.b_($$0);
   }

   @Override
   public void a(bhg $$0) {
      super.a($$0);
      this.a($$0, this.dK(), this);
   }

   @Override
   public void a(bii.c $$0) {
      if (!this.dK().B && $$0.a()) {
         bgm.a(this.dK(), this, this);
      }

      super.a($$0);
   }

   @Override
   public bgq a(cbn $$0, bgp $$1) {
      if (this.r($$0) && !$$0.fG()) {
         return super.a($$0, $$1);
      } else {
         bgq $$2 = this.c_($$0);
         if ($$2.a()) {
            this.a(djk.k, $$0);
            cae.a($$0, true);
         }

         return $$2;
      }
   }

   @Override
   public void b(cbn $$0) {
      $$0.a((bgt)this);
      if (!$$0.dK().B) {
         this.a(djk.k, $$0);
         cae.a($$0, true);
      }
   }

   @Override
   public cit j() {
      return switch (this.v()) {
         case b -> cjb.nl;
         case c -> cjb.nn;
         case d -> cjb.np;
         case e -> cjb.nr;
         case f -> cjb.nt;
         case g -> cjb.nv;
         case h -> cjb.nx;
         case i -> cjb.nz;
         default -> cjb.nj;
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
   public ciy a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public ciy a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public ciy b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, ciy $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bjr a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cbn $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public cee createMenu(int $$0, cbm $$1, cbn $$2) {
      if (this.h != null && $$2.G_()) {
         return null;
      } else {
         this.e($$1.m);
         return cel.a($$0, $$1, this);
      }
   }

   public void e(@Nullable cbn $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public aer A() {
      return this.h;
   }

   @Override
   public void a(@Nullable aer $$0) {
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
   public hn<ciy> D() {
      return this.g;
   }

   @Override
   public void E() {
      this.g = hn.a(this.b(), ciy.b);
   }

   @Override
   public void c(cbn $$0) {
      this.dK().a(djk.j, this.di(), djk.a.a($$0));
   }
}
