import javax.annotation.Nullable;

public class cjd extends cjc implements bnz, cje {
   private static final int i = 27;
   private is<coz> j = is.a(27, coz.h);
   @Nullable
   private aiy k;
   private long l;

   public cjd(bnu<? extends cjc> $$0, cvn $$1) {
      super($$0, $$1);
   }

   public cjd(cvn $$0, double $$1, double $$2, double $$3) {
      super(bnu.q, $$0);
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
   protected void b(sw $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   protected void a(sw $$0) {
      super.a($$0);
      this.b_($$0);
   }

   @Override
   public void a(bmn $$0) {
      this.b(this.ai_());
      this.a($$0, this.dM(), this);
   }

   @Override
   public void a(bno.c $$0) {
      if (!this.dM().B && $$0.a()) {
         blq.a(this.dM(), this, this);
      }

      super.a($$0);
   }

   @Override
   public blu a(chh $$0, blt $$1) {
      if (this.q($$0) && !$$0.fI()) {
         return super.a($$0, $$1);
      } else {
         blu $$2 = this.c_($$0);
         if ($$2.a()) {
            this.a(dpp.k, $$0);
            cfy.a($$0, true);
         }

         return $$2;
      }
   }

   @Override
   public void b(chh $$0) {
      $$0.a((bly)this);
      if (!$$0.dM().B) {
         this.a(dpp.k, $$0);
         cfy.a($$0, true);
      }
   }

   @Override
   public cou ai_() {
      return switch (this.y()) {
         case b -> cpc.nW;
         case c -> cpc.nY;
         case d -> cpc.oa;
         case e -> cpc.oc;
         case f -> cpc.oe;
         case g -> cpc.og;
         case h -> cpc.oi;
         case i -> cpc.ok;
         default -> cpc.nU;
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
   public coz a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public coz a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public coz b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, coz $$1) {
      this.c($$0, $$1);
   }

   @Override
   public box a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(chh $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public ckb createMenu(int $$0, chg $$1, chh $$2) {
      if (this.k != null && $$2.P_()) {
         return null;
      } else {
         this.e($$1.m);
         return cki.a($$0, $$1, this);
      }
   }

   public void e(@Nullable chh $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public aiy C() {
      return this.k;
   }

   @Override
   public void a(@Nullable aiy $$0) {
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
   public is<coz> E() {
      return this.j;
   }

   @Override
   public void G() {
      this.j = is.a(this.b(), coz.h);
   }

   @Override
   public void c(chh $$0) {
      this.dM().a(dpp.j, this.dk(), dpp.a.a($$0));
   }
}
