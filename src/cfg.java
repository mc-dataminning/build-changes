import javax.annotation.Nullable;

public class cfg extends cff implements bkr, cfh {
   private static final int i = 27;
   private il<clb> j = il.a(27, clb.b);
   @Nullable
   private agg k;
   private long l;

   public cfg(bkm<? extends cff> $$0, crs $$1) {
      super($$0, $$1);
   }

   public cfg(crs $$0, double $$1, double $$2, double $$3) {
      super(bkm.o, $$0);
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
   protected void b(rz $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   protected void a(rz $$0) {
      super.a($$0);
      this.b_($$0);
   }

   @Override
   public void a(bjg $$0) {
      this.b(this.ag_());
      this.a($$0, this.dL(), this);
   }

   @Override
   public void a(bki.c $$0) {
      if (!this.dL().B && $$0.a()) {
         bim.a(this.dL(), this, this);
      }

      super.a($$0);
   }

   @Override
   public biq a(cdm $$0, bip $$1) {
      if (this.r($$0) && !$$0.fI()) {
         return super.a($$0, $$1);
      } else {
         biq $$2 = this.c_($$0);
         if ($$2.a()) {
            this.a(dlg.k, $$0);
            ccd.a($$0, true);
         }

         return $$2;
      }
   }

   @Override
   public void b(cdm $$0) {
      $$0.a((bit)this);
      if (!$$0.dL().B) {
         this.a(dlg.k, $$0);
         ccd.a($$0, true);
      }
   }

   @Override
   public ckw ag_() {
      return switch (this.x()) {
         case b -> cle.nl;
         case c -> cle.nn;
         case d -> cle.np;
         case e -> cle.nr;
         case f -> cle.nt;
         case g -> cle.nv;
         case h -> cle.nx;
         case i -> cle.nz;
         default -> cle.nj;
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
   public clb a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public clb a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public clb b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, clb $$1) {
      this.c($$0, $$1);
   }

   @Override
   public blq a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cdm $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public cge createMenu(int $$0, cdl $$1, cdm $$2) {
      if (this.k != null && $$2.N_()) {
         return null;
      } else {
         this.e($$1.m);
         return cgl.a($$0, $$1, this);
      }
   }

   public void e(@Nullable cdm $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public agg B() {
      return this.k;
   }

   @Override
   public void a(@Nullable agg $$0) {
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
   public il<clb> E() {
      return this.j;
   }

   @Override
   public void F() {
      this.j = il.a(this.b(), clb.b);
   }

   @Override
   public void c(cdm $$0) {
      this.dL().a(dlg.j, this.dj(), dlg.a.a($$0));
   }
}
