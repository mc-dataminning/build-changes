import javax.annotation.Nullable;

public class dyp extends dwx implements djq {
   private final dhx a = new dhx() {
      @Override
      public void a(div $$0, iu $$1, int $$2) {
         $$0.a($$1, dmc.cB, $$2, 0);
      }

      @Override
      public void a(@Nullable div $$0, iu $$1, djp $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            dzz $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 260);
         }
      }
   };

   public dyp(iu $$0, dzz $$1) {
      super(dwz.j, $$0, $$1);
   }

   @Override
   protected void a(tz $$0, jg.a $$1) {
      super.a($$0, $$1);
      this.a.a(this.n, this.o, $$0);
   }

   @Override
   protected void b(tz $$0, jg.a $$1) {
      super.b($$0, $$1);
      this.a.a($$0);
   }

   public static void a(div $$0, iu $$1, dzz $$2, dyp $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(div $$0, iu $$1, dzz $$2, dyp $$3) {
      $$3.a.a((arq)$$0, $$1);
   }

   public aca a() {
      return aca.a(this);
   }

   @Override
   public tz a(jg.a $$0) {
      tz $$1 = this.e($$0);
      $$1.r("SpawnPotentials");
      return $$1;
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      return this.a.a(this.n, $$0) ? true : super.a_($$0, $$1);
   }

   @Override
   public void a(bwm<?> $$0, azv $$1) {
      this.a.a($$0, this.n, $$1, this.o);
      this.e();
   }

   public dhx c() {
      return this.a;
   }
}
