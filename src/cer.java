import javax.annotation.Nullable;

public class cer extends ceq implements bkc, ces {
   private static final int i = 27;
   private il<ckj> j = il.a(27, ckj.b);
   @Nullable
   private afw k;
   private long l;

   public cer(bjx<? extends ceq> $$0, cqz $$1) {
      super($$0, $$1);
   }

   public cer(cqz $$0, double $$1, double $$2, double $$3) {
      super(bjx.o, $$0);
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
   protected int y() {
      return 1;
   }

   @Override
   protected void b(rt $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   protected void a(rt $$0) {
      super.a($$0);
      this.b_($$0);
   }

   @Override
   public void a(bir $$0) {
      this.b(this.ag_());
      this.a($$0, this.dL(), this);
   }

   @Override
   public void a(bjt.c $$0) {
      if (!this.dL().B && $$0.a()) {
         bhx.a(this.dL(), this, this);
      }

      super.a($$0);
   }

   @Override
   public bib a(ccx $$0, bia $$1) {
      if (this.r($$0) && !$$0.fI()) {
         return super.a($$0, $$1);
      } else {
         bib $$2 = this.c_($$0);
         if ($$2.a()) {
            this.a(dkl.k, $$0);
            cbo.a($$0, true);
         }

         return $$2;
      }
   }

   @Override
   public void b(ccx $$0) {
      $$0.a((bie)this);
      if (!$$0.dL().B) {
         this.a(dkl.k, $$0);
         cbo.a($$0, true);
      }
   }

   @Override
   public cke ag_() {
      return switch (this.x()) {
         case b -> ckm.nl;
         case c -> ckm.nn;
         case d -> ckm.np;
         case e -> ckm.nr;
         case f -> ckm.nt;
         case g -> ckm.nv;
         case h -> ckm.nx;
         case i -> ckm.nz;
         default -> ckm.nj;
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
   public ckj a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public ckj a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public ckj b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, ckj $$1) {
      this.c($$0, $$1);
   }

   @Override
   public blb a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(ccx $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public cfp createMenu(int $$0, ccw $$1, ccx $$2) {
      if (this.k != null && $$2.N_()) {
         return null;
      } else {
         this.e($$1.m);
         return cfw.a($$0, $$1, this);
      }
   }

   public void e(@Nullable ccx $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public afw B() {
      return this.k;
   }

   @Override
   public void a(@Nullable afw $$0) {
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
   public il<ckj> E() {
      return this.j;
   }

   @Override
   public void F() {
      this.j = il.a(this.b(), ckj.b);
   }

   @Override
   public void c(ccx $$0) {
      this.dL().a(dkl.j, this.dj(), dkl.a.a($$0));
   }
}
