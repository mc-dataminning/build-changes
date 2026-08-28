import javax.annotation.Nullable;

public class dze extends dxm implements dkc {
   private final dij a = new dij() {
      @Override
      public void a(djh $$0, iv $$1, int $$2) {
         $$0.a($$1, dmo.cD, $$2, 0);
      }

      @Override
      public void a(@Nullable djh $$0, iv $$1, dkb $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            eao $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 260);
         }
      }
   };

   public dze(iv $$0, eao $$1) {
      super(dxo.j, $$0, $$1);
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

   public static void a(djh $$0, iv $$1, eao $$2, dze $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(djh $$0, iv $$1, eao $$2, dze $$3) {
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

   public dij c() {
      return this.a;
   }
}
