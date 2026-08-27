import javax.annotation.Nullable;

public class cdo extends cdn implements biz, cdp {
   private static final int f = 27;
   private hp<cjf> g = hp.a(27, cjf.b);
   @Nullable
   private aex h;
   private long i;

   public cdo(biu<? extends cdn> $$0, cpv $$1) {
      super($$0, $$1);
   }

   public cdo(cpv $$0, double $$1, double $$2, double $$3) {
      this(biu.o, $$0);
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
   protected void b(qy $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   protected void a(qy $$0) {
      super.a($$0);
      this.b_($$0);
   }

   @Override
   public void a(bho $$0) {
      super.a($$0);
      this.a($$0, this.dL(), this);
   }

   @Override
   public void a(biq.c $$0) {
      if (!this.dL().B && $$0.a()) {
         bgu.a(this.dL(), this, this);
      }

      super.a($$0);
   }

   @Override
   public bgy a(cbu $$0, bgx $$1) {
      if (this.r($$0) && !$$0.fH()) {
         return super.a($$0, $$1);
      } else {
         bgy $$2 = this.c_($$0);
         if ($$2.a()) {
            this.a(djt.k, $$0);
            cal.a($$0, true);
         }

         return $$2;
      }
   }

   @Override
   public void b(cbu $$0) {
      $$0.a((bhb)this);
      if (!$$0.dL().B) {
         this.a(djt.k, $$0);
         cal.a($$0, true);
      }
   }

   @Override
   public cja q() {
      return switch (this.A()) {
         case b -> cji.nl;
         case c -> cji.nn;
         case d -> cji.np;
         case e -> cji.nr;
         case f -> cji.nt;
         case g -> cji.nv;
         case h -> cji.nx;
         case i -> cji.nz;
         default -> cji.nj;
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
   public cjf a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cjf a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cjf b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cjf $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bjy a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cbu $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public cel createMenu(int $$0, cbt $$1, cbu $$2) {
      if (this.h != null && $$2.M_()) {
         return null;
      } else {
         this.e($$1.m);
         return ces.a($$0, $$1, this);
      }
   }

   public void e(@Nullable cbu $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public aex G() {
      return this.h;
   }

   @Override
   public void a(@Nullable aex $$0) {
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
   public hp<cjf> I() {
      return this.g;
   }

   @Override
   public void K() {
      this.g = hp.a(this.b(), cjf.b);
   }

   @Override
   public void c(cbu $$0) {
      this.dL().a(djt.j, this.dj(), djt.a.a($$0));
   }
}
