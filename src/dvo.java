import javax.annotation.Nullable;

public class dvo extends dtx implements dhb {
   private final dfh a = new dfh() {
      @Override
      public void a(dgg $$0, ji $$1, int $$2) {
         $$0.a($$1, djm.cA, $$2, 0);
      }

      @Override
      public void a(@Nullable dgg $$0, ji $$1, dha $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            dwv $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 4);
         }
      }
   };

   public dvo(ji $$0, dwv $$1) {
      super(dtz.j, $$0, $$1);
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      this.a.a(this.o, this.p, $$0);
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      this.a.a($$0);
   }

   public static void a(dgg $$0, ji $$1, dwv $$2, dvo $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(dgg $$0, ji $$1, dwv $$2, dvo $$3) {
      $$3.a.a((arc)$$0, $$1);
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
      return this.a.a(this.o, $$0) ? true : super.a_($$0, $$1);
   }

   @Override
   public void a(buq<?> $$0, azg $$1) {
      this.a.a($$0, this.o, $$1, this.p);
      this.e();
   }

   public dfh c() {
      return this.a;
   }
}
