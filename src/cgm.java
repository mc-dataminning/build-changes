import javax.annotation.Nullable;

public class cgm extends cgl implements blo, cgn {
   private static final int i = 27;
   private io<cmh> j = io.a(27, cmh.f);
   @Nullable
   private agt k;
   private long l;

   public cgm(blj<? extends cgl> $$0, csy $$1) {
      super($$0, $$1);
   }

   public cgm(csy $$0, double $$1, double $$2, double $$3) {
      super(blj.p, $$0);
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
   protected void b(sj $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   protected void a(sj $$0) {
      super.a($$0);
      this.b_($$0);
   }

   @Override
   public void a(bkd $$0) {
      this.b(this.ah_());
      this.a($$0, this.dM(), this);
   }

   @Override
   public void a(blf.c $$0) {
      if (!this.dM().B && $$0.a()) {
         bjh.a(this.dM(), this, this);
      }

      super.a($$0);
   }

   @Override
   public bjl a(cer $$0, bjk $$1) {
      if (this.r($$0) && !$$0.fI()) {
         return super.a($$0, $$1);
      } else {
         bjl $$2 = this.c_($$0);
         if ($$2.a()) {
            this.a(dmz.k, $$0);
            cdi.a($$0, true);
         }

         return $$2;
      }
   }

   @Override
   public void b(cer $$0) {
      $$0.a((bjo)this);
      if (!$$0.dM().B) {
         this.a(dmz.k, $$0);
         cdi.a($$0, true);
      }
   }

   @Override
   public cmc ah_() {
      return switch (this.y()) {
         case b -> cmk.nW;
         case c -> cmk.nY;
         case d -> cmk.oa;
         case e -> cmk.oc;
         case f -> cmk.oe;
         case g -> cmk.og;
         case h -> cmk.oi;
         case i -> cmk.ok;
         default -> cmk.nU;
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
   public cmh a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cmh a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cmh b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cmh $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bmn a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cer $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public chk createMenu(int $$0, ceq $$1, cer $$2) {
      if (this.k != null && $$2.P_()) {
         return null;
      } else {
         this.e($$1.m);
         return chr.a($$0, $$1, this);
      }
   }

   public void e(@Nullable cer $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public agt C() {
      return this.k;
   }

   @Override
   public void a(@Nullable agt $$0) {
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
   public io<cmh> E() {
      return this.j;
   }

   @Override
   public void G() {
      this.j = io.a(this.b(), cmh.f);
   }

   @Override
   public void c(cer $$0) {
      this.dM().a(dmz.j, this.dk(), dmz.a.a($$0));
   }
}
