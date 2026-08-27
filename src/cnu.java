import javax.annotation.Nullable;

public class cnu extends cnt implements bsh, cnv {
   private static final int i = 27;
   private jg<cto> j = jg.a(27, cto.i);
   @Nullable
   private akl<epk> k;
   private long l;

   public cnu(bsa<? extends cnt> $$0, dax $$1) {
      super($$0, $$1);
   }

   public cnu(dax $$0, double $$1, double $$2, double $$3) {
      super(bsa.r, $$0);
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
   protected void b(ud $$0) {
      super.b($$0);
      this.a($$0, this.dR());
   }

   @Override
   protected void a(ud $$0) {
      super.a($$0);
      this.b($$0, this.dR());
   }

   @Override
   public void a(bqn $$0) {
      this.b(this.ag_());
      this.a($$0, this.dP(), this);
   }

   @Override
   public void a(bru.c $$0) {
      if (!this.dP().B && $$0.a()) {
         bpq.a(this.dP(), this, this);
      }

      super.a($$0);
   }

   @Override
   public bpu a(clw $$0, bpt $$1) {
      if (this.r($$0) && !$$0.fR()) {
         return super.a($$0, $$1);
      } else {
         bpu $$2 = this.c_($$0);
         if ($$2.a()) {
            this.a(dvu.k, $$0);
            ckn.a($$0, true);
         }

         return $$2;
      }
   }

   @Override
   public void b(clw $$0) {
      $$0.a(this);
      if (!$$0.dP().B) {
         this.a(dvu.k, $$0);
         ckn.a($$0, true);
      }
   }

   @Override
   public ctj ag_() {
      return switch (this.x()) {
         case b -> ctr.nX;
         case c -> ctr.nZ;
         case d -> ctr.ob;
         case e -> ctr.od;
         case f -> ctr.of;
         case g -> ctr.oh;
         case h -> ctr.oj;
         case i -> ctr.ol;
         default -> ctr.nV;
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
   public cto a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cto a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cto b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cto $$1) {
      this.c($$0, $$1);
   }

   @Override
   public btg a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(clw $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public cot createMenu(int $$0, clv $$1, clw $$2) {
      if (this.k != null && $$2.N_()) {
         return null;
      } else {
         this.e($$1.l);
         return cpa.a($$0, $$1, this);
      }
   }

   public void e(@Nullable clw $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public akl<epk> B() {
      return this.k;
   }

   @Override
   public void a(@Nullable akl<epk> $$0) {
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
   public jg<cto> D() {
      return this.j;
   }

   @Override
   public void E() {
      this.j = jg.a(this.b(), cto.i);
   }

   @Override
   public void c(clw $$0) {
      this.dP().a(dvu.j, this.dn(), dvu.a.a($$0));
   }
}
