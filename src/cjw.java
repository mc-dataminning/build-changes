import javax.annotation.Nullable;

public class cjw extends cjv implements boq, cjx {
   private static final int i = 27;
   private iu<cpq> j = iu.a(27, cpq.h);
   @Nullable
   private ajc k;
   private long l;

   public cjw(bol<? extends cjv> $$0, cwe $$1) {
      super($$0, $$1);
   }

   public cjw(cwe $$0, double $$1, double $$2, double $$3) {
      super(bol.q, $$0);
      this.a_($$1, $$2, $$3);
      this.J = $$1;
      this.K = $$2;
      this.L = $$3;
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
   protected void b(sy $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   protected void a(sy $$0) {
      super.a($$0);
      this.b_($$0);
   }

   @Override
   public void a(bne $$0) {
      this.b(this.ai_());
      this.a($$0, this.dJ(), this);
   }

   @Override
   public void a(bof.c $$0) {
      if (!this.dJ().B && $$0.a()) {
         bmh.a(this.dJ(), this, this);
      }

      super.a($$0);
   }

   @Override
   public bml a(cia $$0, bmk $$1) {
      if (this.q($$0) && !$$0.fK()) {
         return super.a($$0, $$1);
      } else {
         bml $$2 = this.c_($$0);
         if ($$2.a()) {
            this.a(dqr.k, $$0);
            cgr.a($$0, true);
         }

         return $$2;
      }
   }

   @Override
   public void b(cia $$0) {
      $$0.a((bmp)this);
      if (!$$0.dJ().B) {
         this.a(dqr.k, $$0);
         cgr.a($$0, true);
      }
   }

   @Override
   public cpl ai_() {
      return switch (this.y()) {
         case b -> cpt.nW;
         case c -> cpt.nY;
         case d -> cpt.oa;
         case e -> cpt.oc;
         case f -> cpt.oe;
         case g -> cpt.og;
         case h -> cpt.oi;
         case i -> cpt.ok;
         default -> cpt.nU;
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
   public cpq a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cpq a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cpq b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cpq $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bpo a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cia $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public cku createMenu(int $$0, chz $$1, cia $$2) {
      if (this.k != null && $$2.P_()) {
         return null;
      } else {
         this.e($$1.m);
         return clb.a($$0, $$1, this);
      }
   }

   public void e(@Nullable cia $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public ajc C() {
      return this.k;
   }

   @Override
   public void a(@Nullable ajc $$0) {
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
   public iu<cpq> E() {
      return this.j;
   }

   @Override
   public void G() {
      this.j = iu.a(this.b(), cpq.h);
   }

   @Override
   public void c(cia $$0) {
      this.dJ().a(dqr.j, this.dh(), dqr.a.a($$0));
   }
}
