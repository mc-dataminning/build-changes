import javax.annotation.Nullable;

public class drb extends dpn implements dcw {
   private final dbf a = new dbf() {
      @Override
      public void a(dcd $$0, ja $$1, int $$2) {
         $$0.a($$1, dfh.ct, $$2, 0);
      }

      @Override
      public void a(@Nullable dcd $$0, ja $$1, dcv $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            dsh $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 4);
         }
      }
   };

   public drb(ja $$0, dsh $$1) {
      super(dpp.j, $$0, $$1);
   }

   @Override
   protected void a(tx $$0, jl.a $$1) {
      super.a($$0, $$1);
      this.a.a(this.n, this.o, $$0);
   }

   @Override
   protected void b(tx $$0, jl.a $$1) {
      super.b($$0, $$1);
      this.a.a($$0);
   }

   public static void a(dcd $$0, ja $$1, dsh $$2, drb $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(dcd $$0, ja $$1, dsh $$2, drb $$3) {
      $$3.a.a((aqk)$$0, $$1);
   }

   public abu b() {
      return abu.a(this);
   }

   @Override
   public tx a(jl.a $$0) {
      tx $$1 = this.e($$0);
      $$1.r("SpawnPotentials");
      return $$1;
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      return this.a.a(this.n, $$0) ? true : super.a_($$0, $$1);
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   public void a(bsj<?> $$0, aym $$1) {
      this.a.a($$0, this.n, $$1, this.o);
      this.e();
   }

   public dbf c() {
      return this.a;
   }
}
