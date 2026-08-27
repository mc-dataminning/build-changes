import javax.annotation.Nullable;

public class ckq extends ckp implements bph, ckr {
   private static final int i = 27;
   private iu<cqk> j = iu.a(27, cqk.h);
   @Nullable
   private ajh k;
   private long l;

   public ckq(bpc<? extends ckp> $$0, cwz $$1) {
      super($$0, $$1);
   }

   public ckq(cwz $$0, double $$1, double $$2, double $$3) {
      super(bpc.r, $$0);
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
   public void a(bnv $$0) {
      this.b(this.ah_());
      this.a($$0, this.dM(), this);
   }

   @Override
   public void a(bow.c $$0) {
      if (!this.dM().B && $$0.a()) {
         bmy.a(this.dM(), this, this);
      }

      super.a($$0);
   }

   @Override
   public bnc a(cis $$0, bnb $$1) {
      if (this.r($$0) && !$$0.fO()) {
         return super.a($$0, $$1);
      } else {
         bnc $$2 = this.c_($$0);
         if ($$2.a()) {
            this.a(drn.k, $$0);
            chj.a($$0, true);
         }

         return $$2;
      }
   }

   @Override
   public void b(cis $$0) {
      $$0.a(this);
      if (!$$0.dM().B) {
         this.a(drn.k, $$0);
         chj.a($$0, true);
      }
   }

   @Override
   public cqf ah_() {
      return switch (this.x()) {
         case b -> cqn.nW;
         case c -> cqn.nY;
         case d -> cqn.oa;
         case e -> cqn.oc;
         case f -> cqn.oe;
         case g -> cqn.og;
         case h -> cqn.oi;
         case i -> cqn.ok;
         default -> cqn.nU;
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
   public cqk a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cqk a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cqk b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cqk $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bqf a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cis $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public clo createMenu(int $$0, cir $$1, cis $$2) {
      if (this.k != null && $$2.N_()) {
         return null;
      } else {
         this.e($$1.m);
         return clv.a($$0, $$1, this);
      }
   }

   public void e(@Nullable cis $$0) {
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
   public iu<cqk> D() {
      return this.j;
   }

   @Override
   public void E() {
      this.j = iu.a(this.b(), cqk.h);
   }

   @Override
   public void c(cis $$0) {
      this.dM().a(drn.j, this.dk(), drn.a.a($$0));
   }
}
