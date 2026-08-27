import javax.annotation.Nullable;

public class cdq extends cdp implements bjb, cdr {
   private static final int f = 27;
   private hp<cjh> g = hp.a(27, cjh.b);
   @Nullable
   private aey h;
   private long i;

   public cdq(biw<? extends cdp> $$0, cpx $$1) {
      super($$0, $$1);
   }

   public cdq(cpx $$0, double $$1, double $$2, double $$3) {
      this(biw.o, $$0);
      this.e($$1, $$2, $$3);
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
   }

   @Override
   protected float w() {
      return 0.15F;
   }

   @Override
   protected int B() {
      return 1;
   }

   @Override
   protected void b(qy $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   protected void a(qy $$0) {
      super.a($$0);
      this.b_($$0);
   }

   @Override
   public void a(bhq $$0) {
      super.a($$0);
      this.a($$0, this.dL(), this);
   }

   @Override
   public void a(bis.c $$0) {
      if (!this.dL().B && $$0.a()) {
         bgw.a(this.dL(), this, this);
      }

      super.a($$0);
   }

   @Override
   public bha a(cbw $$0, bgz $$1) {
      if (this.r($$0) && !$$0.fH()) {
         return super.a($$0, $$1);
      } else {
         bha $$2 = this.c_($$0);
         if ($$2.a()) {
            this.a(djv.k, $$0);
            can.a($$0, true);
         }

         return $$2;
      }
   }

   @Override
   public void b(cbw $$0) {
      $$0.a((bhd)this);
      if (!$$0.dL().B) {
         this.a(djv.k, $$0);
         can.a($$0, true);
      }
   }

   @Override
   public cjc q() {
      return switch (this.A()) {
         case b -> cjk.nl;
         case c -> cjk.nn;
         case d -> cjk.np;
         case e -> cjk.nr;
         case f -> cjk.nt;
         case g -> cjk.nv;
         case h -> cjk.nx;
         case i -> cjk.nz;
         default -> cjk.nj;
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
   public cjh a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cjh a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cjh b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cjh $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bka a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cbw $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public cen createMenu(int $$0, cbv $$1, cbw $$2) {
      if (this.h != null && $$2.M_()) {
         return null;
      } else {
         this.e($$1.m);
         return ceu.a($$0, $$1, this);
      }
   }

   public void e(@Nullable cbw $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public aey G() {
      return this.h;
   }

   @Override
   public void a(@Nullable aey $$0) {
      this.h = $$0;
   }

   @Override
   public long H() {
      return this.i;
   }

   @Override
   public void a(long $$0) {
      this.i = $$0;
   }

   @Override
   public hp<cjh> I() {
      return this.g;
   }

   @Override
   public void K() {
      this.g = hp.a(this.b(), cjh.b);
   }

   @Override
   public void c(cbw $$0) {
      this.dL().a(djv.j, this.dj(), djv.a.a($$0));
   }
}
