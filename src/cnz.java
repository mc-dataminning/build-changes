import javax.annotation.Nullable;

public class cnz extends cny implements bsh, coa {
   private static final int i = 27;
   private jj<cuh> j = jj.a(27, cuh.i);
   @Nullable
   private aks<eru> k;
   private long l;

   public cnz(bsb<? extends cny> $$0, dca $$1) {
      super($$0, $$1);
   }

   public cnz(dca $$0, double $$1, double $$2, double $$3) {
      super(bsb.t, $$0);
      this.a_($$1, $$2, $$3);
      this.M = $$1;
      this.N = $$2;
      this.O = $$3;
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
   protected void b(uk $$0) {
      super.b($$0);
      this.a($$0, this.dY());
   }

   @Override
   protected void a(uk $$0) {
      super.a($$0);
      this.b($$0, this.dY());
   }

   @Override
   public void a(bqt $$0) {
      this.b(this.ah_());
      this.a($$0, this.dU(), this);
   }

   @Override
   public void a(brv.d $$0) {
      if (!this.dU().C && $$0.a()) {
         bpw.a(this.dU(), this, this);
      }

      super.a($$0);
   }

   @Override
   public bqa a(cly $$0, bpz $$1) {
      if (this.r($$0) && !$$0.ga()) {
         return super.a($$0, $$1);
      } else {
         bqa $$2 = this.c_($$0);
         if ($$2.a()) {
            this.a(dxv.k, $$0);
            ckp.a($$0, true);
         }

         return $$2;
      }
   }

   @Override
   public void b(cly $$0) {
      $$0.a(this);
      if (!$$0.dU().C) {
         this.a(dxv.k, $$0);
         ckp.a($$0, true);
      }
   }

   @Override
   public cuc ah_() {
      return switch (this.x()) {
         case b -> cuk.pn;
         case c -> cuk.pp;
         case d -> cuk.pr;
         case e -> cuk.pt;
         case f -> cuk.pv;
         case g -> cuk.px;
         case h -> cuk.pz;
         case i -> cuk.pB;
         default -> cuk.pl;
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
   public cuh a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cuh a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cuh b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cuh $$1) {
      this.c($$0, $$1);
   }

   @Override
   public btf a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cly $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public cpg createMenu(int $$0, clx $$1, cly $$2) {
      if (this.k != null && $$2.O_()) {
         return null;
      } else {
         this.e($$1.l);
         return cpn.a($$0, $$1, this);
      }
   }

   public void e(@Nullable cly $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public aks<eru> B() {
      return this.k;
   }

   @Override
   public void a(@Nullable aks<eru> $$0) {
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
   public jj<cuh> D() {
      return this.j;
   }

   @Override
   public void E() {
      this.j = jj.a(this.b(), cuh.i);
   }

   @Override
   public void c(cly $$0) {
      this.dU().a(dxv.j, this.ds(), dxv.a.a($$0));
   }
}
