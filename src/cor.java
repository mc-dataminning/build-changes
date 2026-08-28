import javax.annotation.Nullable;

public class cor extends coq implements btd, cos {
   private static final int i = 27;
   private jr<cuk> j = jr.a(27, cuk.l);
   @Nullable
   private ala<eqi> k;
   private long l;

   public cor(bsv<? extends coq> $$0, dbt $$1) {
      super($$0, $$1);
   }

   public cor(dbt $$0, double $$1, double $$2, double $$3) {
      super(bsv.r, $$0);
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
   public void a(bri $$0) {
      this.b(this.ah_());
      this.a($$0, this.dP(), this);
   }

   @Override
   public void a(bsp.c $$0) {
      if (!this.dP().B && $$0.a()) {
         bql.a(this.dP(), this, this);
      }

      super.a($$0);
   }

   @Override
   public bqp a(cms $$0, bqo $$1) {
      if (this.r($$0) && !$$0.fR()) {
         return super.a($$0, $$1);
      } else {
         bqp $$2 = this.c_($$0);
         if ($$2.a()) {
            this.a(dwq.k, $$0);
            clj.a($$0, true);
         }

         return $$2;
      }
   }

   @Override
   public void b(cms $$0) {
      $$0.a(this);
      if (!$$0.dP().B) {
         this.a(dwq.k, $$0);
         clj.a($$0, true);
      }
   }

   @Override
   public cuf ah_() {
      return switch (this.x()) {
         case b -> cun.nX;
         case c -> cun.nZ;
         case d -> cun.ob;
         case e -> cun.od;
         case f -> cun.of;
         case g -> cun.oh;
         case h -> cun.oj;
         case i -> cun.ol;
         default -> cun.nV;
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
   public cuk a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cuk a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cuk b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cuk $$1) {
      this.c($$0, $$1);
   }

   @Override
   public buc a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cms $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public cpp createMenu(int $$0, cmr $$1, cms $$2) {
      if (this.k != null && $$2.N_()) {
         return null;
      } else {
         this.e($$1.l);
         return cpw.a($$0, $$1, this);
      }
   }

   public void e(@Nullable cms $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public ala<eqi> B() {
      return this.k;
   }

   @Override
   public void a(@Nullable ala<eqi> $$0) {
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
   public jr<cuk> D() {
      return this.j;
   }

   @Override
   public void E() {
      this.j = jr.a(this.b(), cuk.l);
   }

   @Override
   public void c(cms $$0) {
      this.dP().a(dwq.j, this.dn(), dwq.a.a($$0));
   }
}
