import javax.annotation.Nullable;

public class chl extends chk implements bmh, chm {
   private static final int i = 27;
   private iq<cng> j = iq.a(27, cng.f);
   @Nullable
   private ahh k;
   private long l;

   public chl(bmc<? extends chk> $$0, ctx $$1) {
      super($$0, $$1);
   }

   public chl(ctx $$0, double $$1, double $$2, double $$3) {
      super(bmc.q, $$0);
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
   protected void b(so $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   protected void a(so $$0) {
      super.a($$0);
      this.b_($$0);
   }

   @Override
   public void a(bkv $$0) {
      this.b(this.ai_());
      this.a($$0, this.dL(), this);
   }

   @Override
   public void a(blw.c $$0) {
      if (!this.dL().B && $$0.a()) {
         bjy.a(this.dL(), this, this);
      }

      super.a($$0);
   }

   @Override
   public bkc a(cfq $$0, bkb $$1) {
      if (this.q($$0) && !$$0.fI()) {
         return super.a($$0, $$1);
      } else {
         bkc $$2 = this.c_($$0);
         if ($$2.a()) {
            this.a(dnz.k, $$0);
            ceh.a($$0, true);
         }

         return $$2;
      }
   }

   @Override
   public void b(cfq $$0) {
      $$0.a((bkg)this);
      if (!$$0.dL().B) {
         this.a(dnz.k, $$0);
         ceh.a($$0, true);
      }
   }

   @Override
   public cnb ai_() {
      return switch (this.y()) {
         case b -> cnj.nW;
         case c -> cnj.nY;
         case d -> cnj.oa;
         case e -> cnj.oc;
         case f -> cnj.oe;
         case g -> cnj.og;
         case h -> cnj.oi;
         case i -> cnj.ok;
         default -> cnj.nU;
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
   public cng a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cng a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cng b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cng $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bng a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cfq $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public cij createMenu(int $$0, cfp $$1, cfq $$2) {
      if (this.k != null && $$2.P_()) {
         return null;
      } else {
         this.e($$1.m);
         return ciq.a($$0, $$1, this);
      }
   }

   public void e(@Nullable cfq $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public ahh C() {
      return this.k;
   }

   @Override
   public void a(@Nullable ahh $$0) {
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
   public iq<cng> E() {
      return this.j;
   }

   @Override
   public void G() {
      this.j = iq.a(this.b(), cng.f);
   }

   @Override
   public void c(cfq $$0) {
      this.dL().a(dnz.j, this.dj(), dnz.a.a($$0));
   }
}
