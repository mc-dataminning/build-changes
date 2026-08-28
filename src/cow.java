import javax.annotation.Nullable;

public class cow extends cov implements btf, cox {
   private static final int i = 27;
   private jv<cuq> j = jv.a(27, cuq.l);
   @Nullable
   private akq<erw> k;
   private long l;

   public cow(bsx<? extends cov> $$0, dcw $$1) {
      super($$0, $$1);
   }

   public cow(dcw $$0, double $$1, double $$2, double $$3) {
      super(bsx.r, $$0);
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
   protected int F() {
      return 1;
   }

   @Override
   protected void b(ub $$0) {
      super.b($$0);
      this.a($$0, this.dQ());
   }

   @Override
   protected void a(ub $$0) {
      super.a($$0);
      this.b($$0, this.dQ());
   }

   @Override
   public void a(brk $$0) {
      this.b(this.ak_());
      this.a($$0, this.dO(), this);
   }

   @Override
   public void a(bsr.c $$0) {
      if (!this.dO().B && $$0.a()) {
         bqn.a(this.dO(), this, this);
      }

      super.a($$0);
   }

   @Override
   public bqr a(cmx $$0, bqq $$1) {
      if (!$$0.fN()) {
         bqr $$2 = super.a($$0, $$1);
         if ($$2 != bqr.e) {
            return $$2;
         }
      }

      if (this.r($$0) && !$$0.fN()) {
         return bqr.e;
      } else {
         bqr $$3 = this.c_($$0);
         if ($$3.a()) {
            this.a(dxz.k, $$0);
            clo.a($$0, true);
         }

         return $$3;
      }
   }

   @Override
   public void b(cmx $$0) {
      $$0.a(this);
      if (!$$0.dO().B) {
         this.a(dxz.k, $$0);
         clo.a($$0, true);
      }
   }

   @Override
   public cul ak_() {
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
   public bug a_(int $$0) {
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
      if (this.k != null && $$2.R_()) {
         return null;
      } else {
         this.e($$1.l);
         return cqc.a($$0, $$1, this);
      }
   }

   public void e(@Nullable cmx $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public akq<erw> B() {
      return this.k;
   }

   @Override
   public void a(@Nullable akq<erw> $$0) {
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
   public jv<cuq> D() {
      return this.j;
   }

   @Override
   public void E() {
      this.j = jv.a(this.b(), cuq.l);
   }

   @Override
   public void c(cmx $$0) {
      this.dO().a(dxz.j, this.dm(), dxz.a.a($$0));
   }
}
