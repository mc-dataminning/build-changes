import javax.annotation.Nullable;

public class dwh extends duq implements dhu {
   private final dga a = new dga() {
      @Override
      public void a(dgz $$0, jh $$1, int $$2) {
         $$0.a($$1, dkf.cA, $$2, 0);
      }

      @Override
      public void a(@Nullable dgz $$0, jh $$1, dht $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            dxo $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 4);
         }
      }
   };

   public dwh(jh $$0, dxo $$1) {
      super(dus.j, $$0, $$1);
   }

   @Override
   protected void a(um $$0, js.a $$1) {
      super.a($$0, $$1);
      this.a.a(this.o, this.p, $$0);
   }

   @Override
   protected void b(um $$0, js.a $$1) {
      super.b($$0, $$1);
      this.a.a($$0);
   }

   public static void a(dgz $$0, jh $$1, dxo $$2, dwh $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(dgz $$0, jh $$1, dxo $$2, dwh $$3) {
      $$3.a.a((arx)$$0, $$1);
   }

   public acn b() {
      return acn.a(this);
   }

   @Override
   public um a(js.a $$0) {
      um $$1 = this.e($$0);
      $$1.r("SpawnPotentials");
      return $$1;
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      return this.a.a(this.o, $$0) ? true : super.a_($$0, $$1);
   }

   @Override
   public void a(bvi<?> $$0, bac $$1) {
      this.a.a($$0, this.o, $$1, this.p);
      this.e();
   }

   public dga c() {
      return this.a;
   }
}
