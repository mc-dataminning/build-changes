import javax.annotation.Nullable;

public class cow extends cov implements bti, cox {
   private static final int i = 27;
   private jr<cup> j = jr.a(27, cup.l);
   @Nullable
   private ale<eqn> k;
   private long l;

   public cow(bta<? extends cov> $$0, dby $$1) {
      super($$0, $$1);
   }

   public cow(dby $$0, double $$1, double $$2, double $$3) {
      super(bta.r, $$0);
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
   public void a(brn $$0) {
      this.b(this.ag_());
      this.a($$0, this.dP(), this);
   }

   @Override
   public void a(bsu.c $$0) {
      if (!this.dP().B && $$0.a()) {
         bqq.a(this.dP(), this, this);
      }

      super.a($$0);
   }

   @Override
   public bqu a(cmx $$0, bqt $$1) {
      if (this.r($$0) && !$$0.fR()) {
         return super.a($$0, $$1);
      } else {
         bqu $$2 = this.c_($$0);
         if ($$2.a()) {
            this.a(dwv.k, $$0);
            clo.a($$0, true);
         }

         return $$2;
      }
   }

   @Override
   public void b(cmx $$0) {
      $$0.a(this);
      if (!$$0.dP().B) {
         this.a(dwv.k, $$0);
         clo.a($$0, true);
      }
   }

   @Override
   public cuk ag_() {
      return switch (this.x()) {
         case b -> cus.nX;
         case c -> cus.nZ;
         case d -> cus.ob;
         case e -> cus.od;
         case f -> cus.of;
         case g -> cus.oh;
         case h -> cus.oj;
         case i -> cus.ol;
         default -> cus.nV;
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
   public cup a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cup a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cup b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cup $$1) {
      this.c($$0, $$1);
   }

   @Override
   public buh a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cmx $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public cpu createMenu(int $$0, cmw $$1, cmx $$2) {
      if (this.k != null && $$2.N_()) {
         return null;
      } else {
         this.e($$1.l);
         return cqb.a($$0, $$1, this);
      }
   }

   public void e(@Nullable cmx $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public ale<eqn> B() {
      return this.k;
   }

   @Override
   public void a(@Nullable ale<eqn> $$0) {
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
   public jr<cup> D() {
      return this.j;
   }

   @Override
   public void E() {
      this.j = jr.a(this.b(), cup.l);
   }

   @Override
   public void c(cmx $$0) {
      this.dP().a(dwv.j, this.dn(), dwv.a.a($$0));
   }
}
