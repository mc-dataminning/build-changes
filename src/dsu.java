import javax.annotation.Nullable;

public class dsu extends dre implements dem {
   private final dct a = new dct() {
      @Override
      public void a(dds $$0, je $$1, int $$2) {
         $$0.a($$1, dgx.ct, $$2, 0);
      }

      @Override
      public void a(@Nullable dds $$0, je $$1, del $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            dua $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 4);
         }
      }
   };

   public dsu(je $$0, dua $$1) {
      super(drg.j, $$0, $$1);
   }

   @Override
   protected void a(uf $$0, jp.a $$1) {
      super.a($$0, $$1);
      this.a.a(this.o, this.p, $$0);
   }

   @Override
   protected void b(uf $$0, jp.a $$1) {
      super.b($$0, $$1);
      this.a.a($$0);
   }

   public static void a(dds $$0, je $$1, dua $$2, dsu $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(dds $$0, je $$1, dua $$2, dsu $$3) {
      $$3.a.a((arg)$$0, $$1);
   }

   public acg b() {
      return acg.a(this);
   }

   @Override
   public uf a(jp.a $$0) {
      uf $$1 = this.e($$0);
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
   public void a(btq<?> $$0, azk $$1) {
      this.a.a($$0, this.o, $$1, this.p);
      this.e();
   }

   public dct c() {
      return this.a;
   }
}
