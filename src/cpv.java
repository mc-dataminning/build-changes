import javax.annotation.Nullable;

public class cpv extends cpu implements bud, cpw {
   private static final int i = 27;
   private jw<cvp> j = jw.a(27, cvp.k);
   @Nullable
   private alb<etm> k;
   private long l;

   public cpv(btv<? extends cpu> $$0, deg $$1) {
      super($$0, $$1);
   }

   public cpv(deg $$0, double $$1, double $$2, double $$3) {
      super(btv.r, $$0);
      this.a_($$1, $$2, $$3);
      this.L = $$1;
      this.M = $$2;
      this.N = $$3;
   }

   @Override
   protected float v() {
      return 0.15F;
   }

   @Override
   protected int x() {
      return 1;
   }

   @Override
   protected void b(uf $$0) {
      super.b($$0);
      this.a($$0, this.dU());
   }

   @Override
   protected void a(uf $$0) {
      super.a($$0);
      this.b($$0, this.dU());
   }

   @Override
   public void a(bsg $$0) {
      this.b(this.aj_());
      this.a($$0, this.dS(), this);
   }

   @Override
   public void a(bto.c $$0) {
      if (!this.dS().B && $$0.a()) {
         brl.a(this.dS(), this, this);
      }

      super.a($$0);
   }

   @Override
   public brp a(cnu $$0, bro $$1) {
      if (!$$0.fS()) {
         brp $$2 = super.a($$0, $$1);
         if ($$2 != brp.e) {
            return $$2;
         }
      }

      if (this.r($$0) && !$$0.fS()) {
         return brp.e;
      } else {
         brp $$3 = this.c_($$0);
         if ($$3.a()) {
            this.a(dzl.k, $$0);
            cml.a($$0, true);
         }

         return $$3;
      }
   }

   @Override
   public void b(cnu $$0) {
      $$0.a(this);
      if (!$$0.dS().B) {
         this.a(dzl.k, $$0);
         cml.a($$0, true);
      }
   }

   @Override
   public cvk aj_() {
      return switch (this.w()) {
         case b -> cvt.nY;
         case c -> cvt.oa;
         case d -> cvt.oc;
         case e -> cvt.oe;
         case f -> cvt.og;
         case g -> cvt.oi;
         case h -> cvt.ok;
         case i -> cvt.om;
         default -> cvt.nW;
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
   public cvp a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cvp a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cvp b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cvp $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bvb a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cnu $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public cqw createMenu(int $$0, cnt $$1, cnu $$2) {
      if (this.k != null && $$2.P_()) {
         return null;
      } else {
         this.e($$1.k);
         return crf.a($$0, $$1, this);
      }
   }

   public void e(@Nullable cnu $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public alb<etm> F() {
      return this.k;
   }

   @Override
   public void a(@Nullable alb<etm> $$0) {
      this.k = $$0;
   }

   @Override
   public long G() {
      return this.l;
   }

   @Override
   public void a(long $$0) {
      this.l = $$0;
   }

   @Override
   public jw<cvp> I() {
      return this.j;
   }

   @Override
   public void J() {
      this.j = jw.a(this.b(), cvp.k);
   }

   @Override
   public void c(cnu $$0) {
      this.dS().a(dzl.j, this.dq(), dzl.a.a($$0));
   }
}
