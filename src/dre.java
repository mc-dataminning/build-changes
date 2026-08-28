import javax.annotation.Nullable;

public class dre extends dpp implements dcy {
   private final dbh a = new dbh() {
      @Override
      public void a(dcf $$0, ja $$1, int $$2) {
         $$0.a($$1, dfj.ct, $$2, 0);
      }

      @Override
      public void a(@Nullable dcf $$0, ja $$1, dcx $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            dsk $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 4);
         }
      }
   };

   public dre(ja $$0, dsk $$1) {
      super(dpr.j, $$0, $$1);
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

   public static void a(dcf $$0, ja $$1, dsk $$2, dre $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(dcf $$0, ja $$1, dsk $$2, dre $$3) {
      $$3.a.a((aqm)$$0, $$1);
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
   public void a(bsm<?> $$0, ayo $$1) {
      this.a.a($$0, this.n, $$1, this.o);
      this.e();
   }

   public dbh c() {
      return this.a;
   }
}
