import javax.annotation.Nullable;

public class cou extends cot implements btg, cov {
   private static final int i = 27;
   private jr<cun> j = jr.a(27, cun.l);
   @Nullable
   private ald<eql> k;
   private long l;

   public cou(bsy<? extends cot> $$0, dbw $$1) {
      super($$0, $$1);
   }

   public cou(dbw $$0, double $$1, double $$2, double $$3) {
      super(bsy.r, $$0);
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
   protected void b(ur $$0) {
      super.b($$0);
      this.a($$0, this.dR());
   }

   @Override
   protected void a(ur $$0) {
      super.a($$0);
      this.b($$0, this.dR());
   }

   @Override
   public void a(brl $$0) {
      this.b(this.ah_());
      this.a($$0, this.dP(), this);
   }

   @Override
   public void a(bss.c $$0) {
      if (!this.dP().B && $$0.a()) {
         bqo.a(this.dP(), this, this);
      }

      super.a($$0);
   }

   @Override
   public bqs a(cmv $$0, bqr $$1) {
      if (this.r($$0) && !$$0.fR()) {
         return super.a($$0, $$1);
      } else {
         bqs $$2 = this.c_($$0);
         if ($$2.a()) {
            this.a(dwt.k, $$0);
            clm.a($$0, true);
         }

         return $$2;
      }
   }

   @Override
   public void b(cmv $$0) {
      $$0.a(this);
      if (!$$0.dP().B) {
         this.a(dwt.k, $$0);
         clm.a($$0, true);
      }
   }

   @Override
   public cui ah_() {
      return switch (this.x()) {
         case b -> cuq.nX;
         case c -> cuq.nZ;
         case d -> cuq.ob;
         case e -> cuq.od;
         case f -> cuq.of;
         case g -> cuq.oh;
         case h -> cuq.oj;
         case i -> cuq.ol;
         default -> cuq.nV;
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
   public cun a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cun a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cun b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cun $$1) {
      this.c($$0, $$1);
   }

   @Override
   public buf a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cmv $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public cps createMenu(int $$0, cmu $$1, cmv $$2) {
      if (this.k != null && $$2.N_()) {
         return null;
      } else {
         this.e($$1.l);
         return cpz.a($$0, $$1, this);
      }
   }

   public void e(@Nullable cmv $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public ald<eql> B() {
      return this.k;
   }

   @Override
   public void a(@Nullable ald<eql> $$0) {
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
   public jr<cun> D() {
      return this.j;
   }

   @Override
   public void E() {
      this.j = jr.a(this.b(), cun.l);
   }

   @Override
   public void c(cmv $$0) {
      this.dP().a(dwt.j, this.dn(), dwt.a.a($$0));
   }
}
