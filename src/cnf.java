import javax.annotation.Nullable;

public class cnf extends cne implements brt, cng {
   private static final int i = 27;
   private jf<csz> j = jf.a(27, csz.i);
   @Nullable
   private akg<eoq> k;
   private long l;

   public cnf(brn<? extends cne> $$0, dad $$1) {
      super($$0, $$1);
   }

   public cnf(dad $$0, double $$1, double $$2, double $$3) {
      super(brn.r, $$0);
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
   protected void b(ua $$0) {
      super.b($$0);
      this.a($$0, this.dP());
   }

   @Override
   protected void a(ua $$0) {
      super.a($$0);
      this.b($$0, this.dP());
   }

   @Override
   public void a(bqf $$0) {
      this.b(this.ag_());
      this.a($$0, this.dN(), this);
   }

   @Override
   public void a(brh.c $$0) {
      if (!this.dN().B && $$0.a()) {
         bpi.a(this.dN(), this, this);
      }

      super.a($$0);
   }

   @Override
   public bpm a(clh $$0, bpl $$1) {
      if (this.r($$0) && !$$0.fP()) {
         return super.a($$0, $$1);
      } else {
         bpm $$2 = this.c_($$0);
         if ($$2.a()) {
            this.a(dva.k, $$0);
            cjy.a($$0, true);
         }

         return $$2;
      }
   }

   @Override
   public void b(clh $$0) {
      $$0.a(this);
      if (!$$0.dN().B) {
         this.a(dva.k, $$0);
         cjy.a($$0, true);
      }
   }

   @Override
   public csu ag_() {
      return switch (this.x()) {
         case b -> ctc.nX;
         case c -> ctc.nZ;
         case d -> ctc.ob;
         case e -> ctc.od;
         case f -> ctc.of;
         case g -> ctc.oh;
         case h -> ctc.oj;
         case i -> ctc.ol;
         default -> ctc.nV;
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
   public csz a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public csz a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public csz b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, csz $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bsr a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(clh $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public cod createMenu(int $$0, clg $$1, clh $$2) {
      if (this.k != null && $$2.N_()) {
         return null;
      } else {
         this.e($$1.l);
         return cok.a($$0, $$1, this);
      }
   }

   public void e(@Nullable clh $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public akg<eoq> B() {
      return this.k;
   }

   @Override
   public void a(@Nullable akg<eoq> $$0) {
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
   public jf<csz> D() {
      return this.j;
   }

   @Override
   public void E() {
      this.j = jf.a(this.b(), csz.i);
   }

   @Override
   public void c(clh $$0) {
      this.dN().a(dva.j, this.dl(), dva.a.a($$0));
   }
}
