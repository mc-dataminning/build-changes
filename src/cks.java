import javax.annotation.Nullable;

public class cks extends ckr implements bpi, ckt {
   private static final int i = 27;
   private iu<cqm> j = iu.a(27, cqm.h);
   @Nullable
   private ajh k;
   private long l;

   public cks(bpd<? extends ckr> $$0, cxb $$1) {
      super($$0, $$1);
   }

   public cks(cxb $$0, double $$1, double $$2, double $$3) {
      super(bpd.s, $$0);
      this.a_($$1, $$2, $$3);
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
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
   protected void b(ta $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   protected void a(ta $$0) {
      super.a($$0);
      this.b_($$0);
   }

   @Override
   public void a(bnw $$0) {
      this.b(this.ah_());
      this.a($$0, this.dM(), this);
   }

   @Override
   public void a(box.c $$0) {
      if (!this.dM().B && $$0.a()) {
         bmz.a(this.dM(), this, this);
      }

      super.a($$0);
   }

   @Override
   public bnd a(ciu $$0, bnc $$1) {
      if (this.r($$0) && !$$0.fO()) {
         return super.a($$0, $$1);
      } else {
         bnd $$2 = this.c_($$0);
         if ($$2.a()) {
            this.a(drp.k, $$0);
            chl.a($$0, true);
         }

         return $$2;
      }
   }

   @Override
   public void b(ciu $$0) {
      $$0.a(this);
      if (!$$0.dM().B) {
         this.a(drp.k, $$0);
         chl.a($$0, true);
      }
   }

   @Override
   public cqh ah_() {
      return switch (this.x()) {
         case b -> cqp.nW;
         case c -> cqp.nY;
         case d -> cqp.oa;
         case e -> cqp.oc;
         case f -> cqp.oe;
         case g -> cqp.og;
         case h -> cqp.oi;
         case i -> cqp.ok;
         default -> cqp.nU;
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
   public cqm a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cqm a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cqm b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cqm $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bqg a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(ciu $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public clq createMenu(int $$0, cit $$1, ciu $$2) {
      if (this.k != null && $$2.N_()) {
         return null;
      } else {
         this.e($$1.m);
         return clx.a($$0, $$1, this);
      }
   }

   public void e(@Nullable ciu $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public ajh B() {
      return this.k;
   }

   @Override
   public void a(@Nullable ajh $$0) {
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
   public iu<cqm> D() {
      return this.j;
   }

   @Override
   public void E() {
      this.j = iu.a(this.b(), cqm.h);
   }

   @Override
   public void c(ciu $$0) {
      this.dM().a(drp.j, this.dk(), drp.a.a($$0));
   }
}
