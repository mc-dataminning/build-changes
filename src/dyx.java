import javax.annotation.Nullable;

public class dyx extends dxf implements djv {
   private final dic a = new dic() {
      @Override
      public void a(dja $$0, iu $$1, int $$2) {
         $$0.a($$1, dmh.cD, $$2, 0);
      }

      @Override
      public void a(@Nullable dja $$0, iu $$1, dju $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            eah $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 260);
         }
      }
   };

   public dyx(iu $$0, eah $$1) {
      super(dxh.j, $$0, $$1);
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

   public static void a(dja $$0, iu $$1, eah $$2, dyx $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(dja $$0, iu $$1, eah $$2, dyx $$3) {
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
   public void a(bwo<?> $$0, azv $$1) {
      this.a.a($$0, this.n, $$1, this.o);
      this.e();
   }

   public dic c() {
      return this.a;
   }
}
