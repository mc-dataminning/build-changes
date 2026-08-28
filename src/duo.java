import javax.annotation.Nullable;

public class duo extends dsy implements dgh {
   private final den a = new den() {
      @Override
      public void a(dfm $$0, jh $$1, int $$2) {
         $$0.a($$1, dis.ct, $$2, 0);
      }

      @Override
      public void a(@Nullable dfm $$0, jh $$1, dgg $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            dvv $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 4);
         }
      }
   };

   public duo(jh $$0, dvv $$1) {
      super(dta.j, $$0, $$1);
   }

   @Override
   protected void a(ul $$0, js.a $$1) {
      super.a($$0, $$1);
      this.a.a(this.o, this.p, $$0);
   }

   @Override
   protected void b(ul $$0, js.a $$1) {
      super.b($$0, $$1);
      this.a.a($$0);
   }

   public static void a(dfm $$0, jh $$1, dvv $$2, duo $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(dfm $$0, jh $$1, dvv $$2, duo $$3) {
      $$3.a.a((arp)$$0, $$1);
   }

   public acm b() {
      return acm.a(this);
   }

   @Override
   public ul a(js.a $$0) {
      ul $$1 = this.e($$0);
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
   public void a(bus<?> $$0, azu $$1) {
      this.a.a($$0, this.o, $$1, this.p);
      this.e();
   }

   public den c() {
      return this.a;
   }
}
