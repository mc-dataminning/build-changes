import javax.annotation.Nullable;

public class cof extends coe implements bsr, cog {
   private static final int i = 27;
   private js<cua> j = js.a(27, cua.l);
   @Nullable
   private akj<eqt> k;
   private long l;

   public cof(bsj<? extends coe> $$0, dcd $$1) {
      super($$0, $$1);
   }

   public cof(dcd $$0, double $$1, double $$2, double $$3) {
      super(bsj.r, $$0);
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
   protected void b(tx $$0) {
      super.b($$0);
      this.a($$0, this.dR());
   }

   @Override
   protected void a(tx $$0) {
      super.a($$0);
      this.b($$0, this.dR());
   }

   @Override
   public void a(bqw $$0) {
      this.b(this.ag_());
      this.a($$0, this.dP(), this);
   }

   @Override
   public void a(bsd.c $$0) {
      if (!this.dP().B && $$0.a()) {
         bpz.a(this.dP(), this, this);
      }

      super.a($$0);
   }

   @Override
   public bqd a(cmh $$0, bqc $$1) {
      if (this.r($$0) && !$$0.fN()) {
         return super.a($$0, $$1);
      } else {
         bqd $$2 = this.c_($$0);
         if ($$2.a()) {
            this.a(dxa.k, $$0);
            cky.a($$0, true);
         }

         return $$2;
      }
   }

   @Override
   public void b(cmh $$0) {
      $$0.a(this);
      if (!$$0.dP().B) {
         this.a(dxa.k, $$0);
         cky.a($$0, true);
      }
   }

   @Override
   public ctv ag_() {
      return switch (this.x()) {
         case b -> cud.nX;
         case c -> cud.nZ;
         case d -> cud.ob;
         case e -> cud.od;
         case f -> cud.of;
         case g -> cud.oh;
         case h -> cud.oj;
         case i -> cud.ol;
         default -> cud.nV;
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
   public cua a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cua a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cua b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cua $$1) {
      this.c($$0, $$1);
   }

   @Override
   public btq a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cmh $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public cpe createMenu(int $$0, cmg $$1, cmh $$2) {
      if (this.k != null && $$2.N_()) {
         return null;
      } else {
         this.e($$1.l);
         return cpm.a($$0, $$1, this);
      }
   }

   public void e(@Nullable cmh $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public akj<eqt> B() {
      return this.k;
   }

   @Override
   public void a(@Nullable akj<eqt> $$0) {
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
   public js<cua> D() {
      return this.j;
   }

   @Override
   public void E() {
      this.j = js.a(this.b(), cua.l);
   }

   @Override
   public void c(cmh $$0) {
      this.dP().a(dxa.j, this.dn(), dxa.a.a($$0));
   }
}
