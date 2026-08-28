import javax.annotation.Nullable;

public class dyf extends dwn implements djk {
   private final dhr a = new dhr() {
      @Override
      public void a(dip $$0, iu $$1, int $$2) {
         $$0.a($$1, dlw.cA, $$2, 0);
      }

      @Override
      public void a(@Nullable dip $$0, iu $$1, djj $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            dzo $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 260);
         }
      }
   };

   public dyf(iu $$0, dzo $$1) {
      super(dwp.j, $$0, $$1);
   }

   @Override
   protected void a(tx $$0, jg.a $$1) {
      super.a($$0, $$1);
      this.a.a(this.n, this.o, $$0);
   }

   @Override
   protected void b(tx $$0, jg.a $$1) {
      super.b($$0, $$1);
      this.a.a($$0);
   }

   public static void a(dip $$0, iu $$1, dzo $$2, dyf $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(dip $$0, iu $$1, dzo $$2, dyf $$3) {
      $$3.a.a((aro)$$0, $$1);
   }

   public aby a() {
      return aby.a(this);
   }

   @Override
   public tx a(jg.a $$0) {
      tx $$1 = this.e($$0);
      $$1.r("SpawnPotentials");
      return $$1;
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      return this.a.a(this.n, $$0) ? true : super.a_($$0, $$1);
   }

   @Override
   public void a(bwj<?> $$0, azt $$1) {
      this.a.a($$0, this.n, $$1, this.o);
      this.e();
   }

   public dhr c() {
      return this.a;
   }
}
