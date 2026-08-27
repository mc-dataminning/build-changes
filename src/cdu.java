import javax.annotation.Nullable;

public class cdu extends cdt implements bjf, cdv {
   private static final int f = 27;
   private hn<cjl> g = hn.a(27, cjl.b);
   @Nullable
   private aez h;
   private long i;

   public cdu(bja<? extends cdt> $$0, cqb $$1) {
      super($$0, $$1);
   }

   public cdu(cqb $$0, double $$1, double $$2, double $$3) {
      this(bja.o, $$0);
      this.e($$1, $$2, $$3);
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
   }

   @Override
   protected float w() {
      return 0.15F;
   }

   @Override
   protected int B() {
      return 1;
   }

   @Override
   protected void b(qw $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   protected void a(qw $$0) {
      super.a($$0);
      this.b_($$0);
   }

   @Override
   public void a(bhu $$0) {
      super.a($$0);
      this.a($$0, this.dL(), this);
   }

   @Override
   public void a(biw.c $$0) {
      if (!this.dL().B && $$0.a()) {
         bha.a(this.dL(), this, this);
      }

      super.a($$0);
   }

   @Override
   public bhe a(cca $$0, bhd $$1) {
      if (this.r($$0) && !$$0.fI()) {
         return super.a($$0, $$1);
      } else {
         bhe $$2 = this.c_($$0);
         if ($$2.a()) {
            this.a(djn.k, $$0);
            car.a($$0, true);
         }

         return $$2;
      }
   }

   @Override
   public void b(cca $$0) {
      $$0.a((bhh)this);
      if (!$$0.dL().B) {
         this.a(djn.k, $$0);
         car.a($$0, true);
      }
   }

   @Override
   public cjg q() {
      return switch (this.A()) {
         case b -> cjo.nl;
         case c -> cjo.nn;
         case d -> cjo.np;
         case e -> cjo.nr;
         case f -> cjo.nt;
         case g -> cjo.nv;
         case h -> cjo.nx;
         case i -> cjo.nz;
         default -> cjo.nj;
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
   public cjl a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cjl a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cjl b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cjl $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bke a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cca $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public cer createMenu(int $$0, cbz $$1, cca $$2) {
      if (this.h != null && $$2.M_()) {
         return null;
      } else {
         this.e($$1.m);
         return cey.a($$0, $$1, this);
      }
   }

   public void e(@Nullable cca $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public aez G() {
      return this.h;
   }

   @Override
   public void a(@Nullable aez $$0) {
      this.h = $$0;
   }

   @Override
   public long H() {
      return this.i;
   }

   @Override
   public void a(long $$0) {
      this.i = $$0;
   }

   @Override
   public hn<cjl> I() {
      return this.g;
   }

   @Override
   public void K() {
      this.g = hn.a(this.b(), cjl.b);
   }

   @Override
   public void c(cca $$0) {
      this.dL().a(djn.j, this.dj(), djn.a.a($$0));
   }
}
