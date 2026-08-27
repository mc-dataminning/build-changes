import javax.annotation.Nullable;

public class cgw extends cgv implements bly, cgx {
   private static final int i = 27;
   private iq<cmr> j = iq.a(27, cmr.f);
   @Nullable
   private ahd k;
   private long l;

   public cgw(blt<? extends cgv> $$0, cti $$1) {
      super($$0, $$1);
   }

   public cgw(cti $$0, double $$1, double $$2, double $$3) {
      super(blt.p, $$0);
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
   protected void b(sl $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   protected void a(sl $$0) {
      super.a($$0);
      this.b_($$0);
   }

   @Override
   public void a(bkn $$0) {
      this.b(this.ah_());
      this.a($$0, this.dM(), this);
   }

   @Override
   public void a(blp.c $$0) {
      if (!this.dM().B && $$0.a()) {
         bjr.a(this.dM(), this, this);
      }

      super.a($$0);
   }

   @Override
   public bjv a(cfb $$0, bju $$1) {
      if (this.r($$0) && !$$0.fI()) {
         return super.a($$0, $$1);
      } else {
         bjv $$2 = this.c_($$0);
         if ($$2.a()) {
            this.a(dnk.k, $$0);
            cds.a($$0, true);
         }

         return $$2;
      }
   }

   @Override
   public void b(cfb $$0) {
      $$0.a((bjy)this);
      if (!$$0.dM().B) {
         this.a(dnk.k, $$0);
         cds.a($$0, true);
      }
   }

   @Override
   public cmm ah_() {
      return switch (this.y()) {
         case b -> cmu.nW;
         case c -> cmu.nY;
         case d -> cmu.oa;
         case e -> cmu.oc;
         case f -> cmu.oe;
         case g -> cmu.og;
         case h -> cmu.oi;
         case i -> cmu.ok;
         default -> cmu.nU;
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
   public cmr a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cmr a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cmr b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cmr $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bmx a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cfb $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public chu createMenu(int $$0, cfa $$1, cfb $$2) {
      if (this.k != null && $$2.P_()) {
         return null;
      } else {
         this.e($$1.m);
         return cib.a($$0, $$1, this);
      }
   }

   public void e(@Nullable cfb $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public ahd C() {
      return this.k;
   }

   @Override
   public void a(@Nullable ahd $$0) {
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
   public iq<cmr> E() {
      return this.j;
   }

   @Override
   public void G() {
      this.j = iq.a(this.b(), cmr.f);
   }

   @Override
   public void c(cfb $$0) {
      this.dM().a(dnk.j, this.dk(), dnk.a.a($$0));
   }
}
