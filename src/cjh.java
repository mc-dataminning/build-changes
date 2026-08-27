import javax.annotation.Nullable;

public class cjh extends cjg implements bob, cji {
   private static final int i = 27;
   private is<cpd> j = is.a(27, cpd.h);
   @Nullable
   private aiy k;
   private long l;

   public cjh(bnw<? extends cjg> $$0, cvr $$1) {
      super($$0, $$1);
   }

   public cjh(cvr $$0, double $$1, double $$2, double $$3) {
      super(bnw.q, $$0);
      this.a_($$1, $$2, $$3);
      this.J = $$1;
      this.K = $$2;
      this.L = $$3;
   }

   @Override
   protected float x() {
      return 0.15F;
   }

   @Override
   protected int z() {
      return 1;
   }

   @Override
   protected void b(sw $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   protected void a(sw $$0) {
      super.a($$0);
      this.b_($$0);
   }

   @Override
   public void a(bmp $$0) {
      this.b(this.ai_());
      this.a($$0, this.dM(), this);
   }

   @Override
   public void a(bnq.c $$0) {
      if (!this.dM().B && $$0.a()) {
         bls.a(this.dM(), this, this);
      }

      super.a($$0);
   }

   @Override
   public blw a(chl $$0, blv $$1) {
      if (this.q($$0) && !$$0.fI()) {
         return super.a($$0, $$1);
      } else {
         blw $$2 = this.c_($$0);
         if ($$2.a()) {
            this.a(dpw.k, $$0);
            cgc.a($$0, true);
         }

         return $$2;
      }
   }

   @Override
   public void b(chl $$0) {
      $$0.a((bma)this);
      if (!$$0.dM().B) {
         this.a(dpw.k, $$0);
         cgc.a($$0, true);
      }
   }

   @Override
   public coy ai_() {
      return switch (this.y()) {
         case b -> cpg.nW;
         case c -> cpg.nY;
         case d -> cpg.oa;
         case e -> cpg.oc;
         case f -> cpg.oe;
         case g -> cpg.og;
         case h -> cpg.oi;
         case i -> cpg.ok;
         default -> cpg.nU;
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
   public cpd a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cpd a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cpd b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cpd $$1) {
      this.c($$0, $$1);
   }

   @Override
   public boz a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(chl $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public ckf createMenu(int $$0, chk $$1, chl $$2) {
      if (this.k != null && $$2.P_()) {
         return null;
      } else {
         this.e($$1.m);
         return ckm.a($$0, $$1, this);
      }
   }

   public void e(@Nullable chl $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public aiy C() {
      return this.k;
   }

   @Override
   public void a(@Nullable aiy $$0) {
      this.k = $$0;
   }

   @Override
   public long D() {
      return this.l;
   }

   @Override
   public void a(long $$0) {
      this.l = $$0;
   }

   @Override
   public is<cpd> E() {
      return this.j;
   }

   @Override
   public void G() {
      this.j = is.a(this.b(), cpd.h);
   }

   @Override
   public void c(chl $$0) {
      this.dM().a(dpw.j, this.dk(), dpw.a.a($$0));
   }
}
