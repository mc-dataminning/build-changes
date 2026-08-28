import javax.annotation.Nullable;

public class cox extends cow implements btj, coy {
   private static final int i = 27;
   private jr<cuq> j = jr.a(27, cuq.l);
   @Nullable
   private ale<eqo> k;
   private long l;

   public cox(btb<? extends cow> $$0, dbz $$1) {
      super($$0, $$1);
   }

   public cox(dbz $$0, double $$1, double $$2, double $$3) {
      super(btb.r, $$0);
      this.a_($$1, $$2, $$3);
      this.L = $$1;
      this.M = $$2;
      this.N = $$3;
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
   protected void b(us $$0) {
      super.b($$0);
      this.a($$0, this.dR());
   }

   @Override
   protected void a(us $$0) {
      super.a($$0);
      this.b($$0, this.dR());
   }

   @Override
   public void a(bro $$0) {
      this.b(this.ag_());
      this.a($$0, this.dP(), this);
   }

   @Override
   public void a(bsv.c $$0) {
      if (!this.dP().B && $$0.a()) {
         bqr.a(this.dP(), this, this);
      }

      super.a($$0);
   }

   @Override
   public bqv a(cmy $$0, bqu $$1) {
      if (this.r($$0) && !$$0.fR()) {
         return super.a($$0, $$1);
      } else {
         bqv $$2 = this.c_($$0);
         if ($$2.a()) {
            this.a(dww.k, $$0);
            clp.a($$0, true);
         }

         return $$2;
      }
   }

   @Override
   public void b(cmy $$0) {
      $$0.a(this);
      if (!$$0.dP().B) {
         this.a(dww.k, $$0);
         clp.a($$0, true);
      }
   }

   @Override
   public cul ag_() {
      return switch (this.x()) {
         case b -> cut.nX;
         case c -> cut.nZ;
         case d -> cut.ob;
         case e -> cut.od;
         case f -> cut.of;
         case g -> cut.oh;
         case h -> cut.oj;
         case i -> cut.ol;
         default -> cut.nV;
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
   public cuq a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cuq a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cuq b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cuq $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bui a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cmy $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public cpv createMenu(int $$0, cmx $$1, cmy $$2) {
      if (this.k != null && $$2.N_()) {
         return null;
      } else {
         this.e($$1.l);
         return cqc.a($$0, $$1, this);
      }
   }

   public void e(@Nullable cmy $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public ale<eqo> B() {
      return this.k;
   }

   @Override
   public void a(@Nullable ale<eqo> $$0) {
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
   public jr<cuq> D() {
      return this.j;
   }

   @Override
   public void E() {
      this.j = jr.a(this.b(), cuq.l);
   }

   @Override
   public void c(cmy $$0) {
      this.dP().a(dww.j, this.dn(), dww.a.a($$0));
   }
}
