import javax.annotation.Nullable;

public class dzj extends dxr implements dkh {
   private final dim a = new dim() {
      @Override
      public void a(djm $$0, iv $$1, int $$2) {
         $$0.a($$1, dmt.cD, $$2, 0);
      }

      @Override
      public void a(@Nullable djm $$0, iv $$1, dkg $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            eat $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 260);
         }
      }
   };

   public dzj(iv $$0, eat $$1) {
      super(dxt.j, $$0, $$1);
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      this.a.a(this.n, this.o, $$0);
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      this.a.a($$0);
   }

   public static void a(djm $$0, iv $$1, eat $$2, dzj $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(djm $$0, iv $$1, eat $$2, dzj $$3) {
      $$3.a.a((arq)$$0, $$1);
   }

   public aca a() {
      return aca.a(this);
   }

   @Override
   public tz a(jh.a $$0) {
      tz $$1 = this.e($$0);
      $$1.p("SpawnPotentials");
      return $$1;
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      return this.a.a(this.n, $$0) ? true : super.a_($$0, $$1);
   }

   @Override
   public void a(bwr<?> $$0, azv $$1) {
      this.a.a($$0, this.n, $$1, this.o);
      this.e();
   }

   public dim c() {
      return this.a;
   }
}
