import javax.annotation.Nullable;

public class chd extends chc implements bme, che {
   private static final int i = 27;
   private iq<cmy> j = iq.a(27, cmy.f);
   @Nullable
   private ahg k;
   private long l;

   public chd(blz<? extends chc> $$0, ctp $$1) {
      super($$0, $$1);
   }

   public chd(ctp $$0, double $$1, double $$2, double $$3) {
      super(blz.p, $$0);
      this.a_($$1, $$2, $$3);
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
   }

   @Override
   protected float x() {
      return 0.15F;
   }

   @Override
   protected int z() {
      return 1;
   }

   @Override
   protected void b(sn $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   protected void a(sn $$0) {
      super.a($$0);
      this.b_($$0);
   }

   @Override
   public void a(bkt $$0) {
      this.b(this.ah_());
      this.a($$0, this.dM(), this);
   }

   @Override
   public void a(blv.c $$0) {
      if (!this.dM().B && $$0.a()) {
         bjx.a(this.dM(), this, this);
      }

      super.a($$0);
   }

   @Override
   public bkb a(cfi $$0, bka $$1) {
      if (this.r($$0) && !$$0.fI()) {
         return super.a($$0, $$1);
      } else {
         bkb $$2 = this.c_($$0);
         if ($$2.a()) {
            this.a(dnr.k, $$0);
            cdz.a($$0, true);
         }

         return $$2;
      }
   }

   @Override
   public void b(cfi $$0) {
      $$0.a((bke)this);
      if (!$$0.dM().B) {
         this.a(dnr.k, $$0);
         cdz.a($$0, true);
      }
   }

   @Override
   public cmt ah_() {
      return switch (this.y()) {
         case b -> cnb.nW;
         case c -> cnb.nY;
         case d -> cnb.oa;
         case e -> cnb.oc;
         case f -> cnb.oe;
         case g -> cnb.og;
         case h -> cnb.oi;
         case i -> cnb.ok;
         default -> cnb.nU;
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
   public cmy a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cmy a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cmy b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cmy $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bnd a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cfi $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public cib createMenu(int $$0, cfh $$1, cfi $$2) {
      if (this.k != null && $$2.P_()) {
         return null;
      } else {
         this.e($$1.m);
         return cii.a($$0, $$1, this);
      }
   }

   public void e(@Nullable cfi $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public ahg C() {
      return this.k;
   }

   @Override
   public void a(@Nullable ahg $$0) {
      this.k = $$0;
   }

   @Override
   public long D() {
      return this.l;
   }

   @Override
   public void a(long $$0) {
      this.l = $$0;
   }

   @Override
   public iq<cmy> E() {
      return this.j;
   }

   @Override
   public void G() {
      this.j = iq.a(this.b(), cmy.f);
   }

   @Override
   public void c(cfi $$0) {
      this.dM().a(dnr.j, this.dk(), dnr.a.a($$0));
   }
}
