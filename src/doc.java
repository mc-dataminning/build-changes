import javax.annotation.Nullable;

public class doc extends dmo implements czy {
   private final cyi a = new cyi() {
      @Override
      public void a(czg $$0, id $$1, int $$2) {
         $$0.a($$1, dcj.ct, $$2, 0);
      }

      @Override
      public void a(@Nullable czg $$0, id $$1, czx $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            dpi $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 4);
         }
      }
   };

   public doc(id $$0, dpi $$1) {
      super(dmq.j, $$0, $$1);
   }

   @Override
   public void a(to $$0, ip.a $$1) {
      super.a($$0, $$1);
      this.a.a(this.o, this.p, $$0);
   }

   @Override
   protected void b(to $$0, ip.a $$1) {
      super.b($$0, $$1);
      this.a.a($$0);
   }

   public static void a(czg $$0, id $$1, dpi $$2, doc $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(czg $$0, id $$1, dpi $$2, doc $$3) {
      $$3.a.a((apu)$$0, $$1);
   }

   public abh b() {
      return abh.a(this);
   }

   @Override
   public to a(ip.a $$0) {
      to $$1 = this.d($$0);
      $$1.r("SpawnPotentials");
      return $$1;
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      return this.a.a(this.o, $$0) ? true : super.a_($$0, $$1);
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   public void a(bqg<?> $$0, axt $$1) {
      this.a.a($$0, this.o, $$1, this.p);
      this.e();
   }

   public cyi c() {
      return this.a;
   }
}
