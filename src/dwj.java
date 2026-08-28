import javax.annotation.Nullable;

public class dwj extends dus implements dhu {
   private final dgb a = new dgb() {
      @Override
      public void a(dgz $$0, ji $$1, int $$2) {
         $$0.a($$1, dkg.cA, $$2, 0);
      }

      @Override
      public void a(@Nullable dgz $$0, ji $$1, dht $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            dxq $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 260);
         }
      }
   };

   public dwj(ji $$0, dxq $$1) {
      super(duu.j, $$0, $$1);
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      this.a.a(this.n, this.o, $$0);
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      this.a.a($$0);
   }

   public static void a(dgz $$0, ji $$1, dxq $$2, dwj $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(dgz $$0, ji $$1, dxq $$2, dwj $$3) {
      $$3.a.a((ard)$$0, $$1);
   }

   public abr b() {
      return abr.a(this);
   }

   @Override
   public tq a(jt.a $$0) {
      tq $$1 = this.e($$0);
      $$1.r("SpawnPotentials");
      return $$1;
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      return this.a.a(this.n, $$0) ? true : super.a_($$0, $$1);
   }

   @Override
   public void a(bvi<?> $$0, azh $$1) {
      this.a.a($$0, this.n, $$1, this.o);
      this.e();
   }

   public dgb c() {
      return this.a;
   }
}
