import javax.annotation.Nullable;

public class cou extends cot implements bte, cov {
   private static final int i = 27;
   private jv<cuo> j = jv.a(27, cuo.l);
   @Nullable
   private akp<erq> k;
   private long l;

   public cou(bsw<? extends cot> $$0, dcu $$1) {
      super($$0, $$1);
   }

   public cou(dcu $$0, double $$1, double $$2, double $$3) {
      super(bsw.r, $$0);
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
      this.a($$0, this.dS());
   }

   @Override
   protected void a(ua $$0) {
      super.a($$0);
      this.b($$0, this.dS());
   }

   @Override
   public void a(brj $$0) {
      this.b(this.ag_());
      this.a($$0, this.dQ(), this);
   }

   @Override
   public void a(bsq.c $$0) {
      if (!this.dQ().B && $$0.a()) {
         bqm.a(this.dQ(), this, this);
      }

      super.a($$0);
   }

   @Override
   public bqq a(cmv $$0, bqp $$1) {
      if (this.r($$0) && !$$0.fO()) {
         return super.a($$0, $$1);
      } else {
         bqq $$2 = this.c_($$0);
         if ($$2.a()) {
            this.a(dxw.k, $$0);
            clm.a($$0, true);
         }

         return $$2;
      }
   }

   @Override
   public void b(cmv $$0) {
      $$0.a(this);
      if (!$$0.dQ().B) {
         this.a(dxw.k, $$0);
         clm.a($$0, true);
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
   public bue a_(int $$0) {
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
         return cqa.a($$0, $$1, this);
      }
   }

   public void e(@Nullable cmv $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public akp<erq> B() {
      return this.k;
   }

   @Override
   public void a(@Nullable akp<erq> $$0) {
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
   public jv<cuo> D() {
      return this.j;
   }

   @Override
   public void E() {
      this.j = jv.a(this.b(), cuo.l);
   }

   @Override
   public void c(cmv $$0) {
      this.dQ().a(dxw.j, this.do(), dxw.a.a($$0));
   }
}
