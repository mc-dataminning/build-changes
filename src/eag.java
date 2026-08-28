import javax.annotation.Nullable;

public class eag extends dyo implements dle {
   private final djj a = new djj() {
      @Override
      public void a(dkj $$0, iw $$1, int $$2) {
         $$0.a($$1, dnq.cD, $$2, 0);
      }

      @Override
      public void a(@Nullable dkj $$0, iw $$1, dld $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            ebq $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 260);
         }
      }
   };

   public eag(iw $$0, ebq $$1) {
      super(dyq.j, $$0, $$1);
   }

   @Override
   protected void a(ua $$0, ji.a $$1) {
      super.a($$0, $$1);
      this.a.a(this.n, this.o, $$0);
   }

   @Override
   protected void b(ua $$0, ji.a $$1) {
      super.b($$0, $$1);
      this.a.a($$0);
   }

   public static void a(dkj $$0, iw $$1, ebq $$2, eag $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(dkj $$0, iw $$1, ebq $$2, eag $$3) {
      $$3.a.a((asb)$$0, $$1);
   }

   public acl a() {
      return acl.a(this);
   }

   @Override
   public ua a(ji.a $$0) {
      ua $$1 = this.e($$0);
      $$1.r("SpawnPotentials");
      return $$1;
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      return this.a.a(this.n, $$0) ? true : super.a_($$0, $$1);
   }

   @Override
   public void a(bxn<?> $$0, bai $$1) {
      this.a.a($$0, this.n, $$1, this.o);
      this.e();
   }

   public djj c() {
      return this.a;
   }
}
