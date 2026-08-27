import javax.annotation.Nullable;

public class cly extends clx implements bqm, clz {
   private static final int i = 27;
   private iw<crs> j = iw.a(27, crs.i);
   @Nullable
   private ajv k;
   private long l;

   public cly(bqg<? extends clx> $$0, czg $$1) {
      super($$0, $$1);
   }

   public cly(czg $$0, double $$1, double $$2, double $$3) {
      super(bqg.r, $$0);
      this.a_($$1, $$2, $$3);
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
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
   protected void b(to $$0) {
      super.b($$0);
      this.a($$0, this.dO());
   }

   @Override
   protected void a(to $$0) {
      super.a($$0);
      this.b($$0, this.dO());
   }

   @Override
   public void a(boy $$0) {
      this.b(this.ag_());
      this.a($$0, this.dM(), this);
   }

   @Override
   public void a(bqa.c $$0) {
      if (!this.dM().B && $$0.a()) {
         bob.a(this.dM(), this, this);
      }

      super.a($$0);
   }

   @Override
   public bof a(cka $$0, boe $$1) {
      if (this.r($$0) && !$$0.fO()) {
         return super.a($$0, $$1);
      } else {
         bof $$2 = this.c_($$0);
         if ($$2.a()) {
            this.a(dub.k, $$0);
            cir.a($$0, true);
         }

         return $$2;
      }
   }

   @Override
   public void b(cka $$0) {
      $$0.a(this);
      if (!$$0.dM().B) {
         this.a(dub.k, $$0);
         cir.a($$0, true);
      }
   }

   @Override
   public crn ag_() {
      return switch (this.x()) {
         case b -> crv.nW;
         case c -> crv.nY;
         case d -> crv.oa;
         case e -> crv.oc;
         case f -> crv.oe;
         case g -> crv.og;
         case h -> crv.oi;
         case i -> crv.ok;
         default -> crv.nU;
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
   public crs a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public crs a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public crs b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, crs $$1) {
      this.c($$0, $$1);
   }

   @Override
   public brk a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cka $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public cmw createMenu(int $$0, cjz $$1, cka $$2) {
      if (this.k != null && $$2.N_()) {
         return null;
      } else {
         this.e($$1.m);
         return cnd.a($$0, $$1, this);
      }
   }

   public void e(@Nullable cka $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public ajv B() {
      return this.k;
   }

   @Override
   public void a(@Nullable ajv $$0) {
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
   public iw<crs> D() {
      return this.j;
   }

   @Override
   public void E() {
      this.j = iw.a(this.b(), crs.i);
   }

   @Override
   public void c(cka $$0) {
      this.dM().a(dub.j, this.dk(), dub.a.a($$0));
   }
}
