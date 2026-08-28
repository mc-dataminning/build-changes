import javax.annotation.Nullable;

public class cov extends cou implements bth, cow {
   private static final int i = 27;
   private jr<cuo> j = jr.a(27, cuo.l);
   @Nullable
   private ald<eqm> k;
   private long l;

   public cov(bsz<? extends cou> $$0, dbx $$1) {
      super($$0, $$1);
   }

   public cov(dbx $$0, double $$1, double $$2, double $$3) {
      super(bsz.r, $$0);
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
   public void a(brm $$0) {
      this.b(this.ag_());
      this.a($$0, this.dP(), this);
   }

   @Override
   public void a(bst.c $$0) {
      if (!this.dP().B && $$0.a()) {
         bqp.a(this.dP(), this, this);
      }

      super.a($$0);
   }

   @Override
   public bqt a(cmw $$0, bqs $$1) {
      if (this.r($$0) && !$$0.fR()) {
         return super.a($$0, $$1);
      } else {
         bqt $$2 = this.c_($$0);
         if ($$2.a()) {
            this.a(dwu.k, $$0);
            cln.a($$0, true);
         }

         return $$2;
      }
   }

   @Override
   public void b(cmw $$0) {
      $$0.a(this);
      if (!$$0.dP().B) {
         this.a(dwu.k, $$0);
         cln.a($$0, true);
      }
   }

   @Override
   public cuj ag_() {
      return switch (this.x()) {
         case b -> cur.nX;
         case c -> cur.nZ;
         case d -> cur.ob;
         case e -> cur.od;
         case f -> cur.of;
         case g -> cur.oh;
         case h -> cur.oj;
         case i -> cur.ol;
         default -> cur.nV;
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
   public cuo a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cuo a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cuo b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cuo $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bug a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cmw $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public cpt createMenu(int $$0, cmv $$1, cmw $$2) {
      if (this.k != null && $$2.N_()) {
         return null;
      } else {
         this.e($$1.l);
         return cqa.a($$0, $$1, this);
      }
   }

   public void e(@Nullable cmw $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public ald<eqm> B() {
      return this.k;
   }

   @Override
   public void a(@Nullable ald<eqm> $$0) {
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
   public jr<cuo> D() {
      return this.j;
   }

   @Override
   public void E() {
      this.j = jr.a(this.b(), cuo.l);
   }

   @Override
   public void c(cmw $$0) {
      this.dP().a(dwu.j, this.dn(), dwu.a.a($$0));
   }
}
