import javax.annotation.Nullable;

public class clr extends clq implements bqh, cls {
   private static final int i = 27;
   private iu<crj> j = iu.a(27, crj.i);
   @Nullable
   private ajt k;
   private long l;

   public clr(bqb<? extends clq> $$0, cyx $$1) {
      super($$0, $$1);
   }

   public clr(cyx $$0, double $$1, double $$2, double $$3) {
      super(bqb.r, $$0);
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
   protected void b(tm $$0) {
      super.b($$0);
      this.a($$0, this.dO());
   }

   @Override
   protected void a(tm $$0) {
      super.a($$0);
      this.b($$0, this.dO());
   }

   @Override
   public void a(bot $$0) {
      this.b(this.ag_());
      this.a($$0, this.dM(), this);
   }

   @Override
   public void a(bpv.c $$0) {
      if (!this.dM().B && $$0.a()) {
         bnw.a(this.dM(), this, this);
      }

      super.a($$0);
   }

   @Override
   public boa a(cjt $$0, bnz $$1) {
      if (this.r($$0) && !$$0.fO()) {
         return super.a($$0, $$1);
      } else {
         boa $$2 = this.c_($$0);
         if ($$2.a()) {
            this.a(dts.k, $$0);
            cik.a($$0, true);
         }

         return $$2;
      }
   }

   @Override
   public void b(cjt $$0) {
      $$0.a(this);
      if (!$$0.dM().B) {
         this.a(dts.k, $$0);
         cik.a($$0, true);
      }
   }

   @Override
   public cre ag_() {
      return switch (this.x()) {
         case b -> crm.nW;
         case c -> crm.nY;
         case d -> crm.oa;
         case e -> crm.oc;
         case f -> crm.oe;
         case g -> crm.og;
         case h -> crm.oi;
         case i -> crm.ok;
         default -> crm.nU;
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
   public crj a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public crj a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public crj b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, crj $$1) {
      this.c($$0, $$1);
   }

   @Override
   public brf a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cjt $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public cmp createMenu(int $$0, cjs $$1, cjt $$2) {
      if (this.k != null && $$2.N_()) {
         return null;
      } else {
         this.e($$1.m);
         return cmw.a($$0, $$1, this);
      }
   }

   public void e(@Nullable cjt $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public ajt B() {
      return this.k;
   }

   @Override
   public void a(@Nullable ajt $$0) {
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
   public iu<crj> D() {
      return this.j;
   }

   @Override
   public void E() {
      this.j = iu.a(this.b(), crj.i);
   }

   @Override
   public void c(cjt $$0) {
      this.dM().a(dts.j, this.dk(), dts.a.a($$0));
   }
}
