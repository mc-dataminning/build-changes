import javax.annotation.Nullable;

public class cdg extends cdf implements bir, cdh {
   private static final int f = 27;
   private hn<cix> g = hn.a(27, cix.b);
   @Nullable
   private aer h;
   private long i;

   public cdg(bim<? extends cdf> $$0, cpl $$1) {
      super($$0, $$1);
   }

   public cdg(cpl $$0, double $$1, double $$2, double $$3) {
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
   public bgq a(cbm $$0, bgp $$1) {
      if (this.r($$0) && !$$0.fG()) {
         return super.a($$0, $$1);
      } else {
         bgq $$2 = this.c_($$0);
         if ($$2.a()) {
            this.a(djj.k, $$0);
            cad.a($$0, true);
         }

         return $$2;
      }
   }

   @Override
   public void b(cbm $$0) {
      $$0.a((bgt)this);
      if (!$$0.dK().B) {
         this.a(djj.k, $$0);
         cad.a($$0, true);
      }
   }

   @Override
   public cis j() {
      return switch (this.v()) {
         case b -> cja.nl;
         case c -> cja.nn;
         case d -> cja.np;
         case e -> cja.nr;
         case f -> cja.nt;
         case g -> cja.nv;
         case h -> cja.nx;
         case i -> cja.nz;
         default -> cja.nj;
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
   public cix a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cix a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cix b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cix $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bjq a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cbm $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public ced createMenu(int $$0, cbl $$1, cbm $$2) {
      if (this.h != null && $$2.G_()) {
         return null;
      } else {
         this.e($$1.m);
         return cek.a($$0, $$1, this);
      }
   }

   public void e(@Nullable cbm $$0) {
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
   public hn<cix> D() {
      return this.g;
   }

   @Override
   public void E() {
      this.g = hn.a(this.b(), cix.b);
   }

   @Override
   public void c(cbm $$0) {
      this.dK().a(djj.j, this.di(), djj.a.a($$0));
   }
}
