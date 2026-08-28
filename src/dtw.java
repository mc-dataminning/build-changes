import javax.annotation.Nullable;

public class dtw extends dsg implements dfp {
   private final ddw a = new ddw() {
      @Override
      public void a(dev $$0, jg $$1, int $$2) {
         $$0.a($$1, dia.ct, $$2, 0);
      }

      @Override
      public void a(@Nullable dev $$0, jg $$1, dfo $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            dvd $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 4);
         }
      }
   };

   public dtw(jg $$0, dvd $$1) {
      super(dsi.j, $$0, $$1);
   }

   @Override
   protected void a(uj $$0, jr.a $$1) {
      super.a($$0, $$1);
      this.a.a(this.o, this.p, $$0);
   }

   @Override
   protected void b(uj $$0, jr.a $$1) {
      super.b($$0, $$1);
      this.a.a($$0);
   }

   public static void a(dev $$0, jg $$1, dvd $$2, dtw $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(dev $$0, jg $$1, dvd $$2, dtw $$3) {
      $$3.a.a((arm)$$0, $$1);
   }

   public ack b() {
      return ack.a(this);
   }

   @Override
   public uj a(jr.a $$0) {
      uj $$1 = this.e($$0);
      $$1.r("SpawnPotentials");
      return $$1;
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      return this.a.a(this.o, $$0) ? true : super.a_($$0, $$1);
   }

   @Override
   public boolean p() {
      return true;
   }

   @Override
   public void a(bug<?> $$0, azr $$1) {
      this.a.a($$0, this.o, $$1, this.p);
      this.e();
   }

   public ddw c() {
      return this.a;
   }
}
