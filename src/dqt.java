import javax.annotation.Nullable;

public class dqt extends dpf implements dco {
   private final day a = new day() {
      @Override
      public void a(dbw $$0, iz $$1, int $$2) {
         $$0.a($$1, dez.ct, $$2, 0);
      }

      @Override
      public void a(@Nullable dbw $$0, iz $$1, dcn $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            dsa $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 4);
         }
      }
   };

   public dqt(iz $$0, dsa $$1) {
      super(dph.j, $$0, $$1);
   }

   @Override
   protected void a(ur $$0, jk.a $$1) {
      super.a($$0, $$1);
      this.a.a(this.n, this.o, $$0);
   }

   @Override
   protected void b(ur $$0, jk.a $$1) {
      super.b($$0, $$1);
      this.a.a($$0);
   }

   public static void a(dbw $$0, iz $$1, dsa $$2, dqt $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(dbw $$0, iz $$1, dsa $$2, dqt $$3) {
      $$3.a.a((are)$$0, $$1);
   }

   public aco b() {
      return aco.a(this);
   }

   @Override
   public ur a(jk.a $$0) {
      ur $$1 = this.e($$0);
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
   public void a(bsy<?> $$0, azf $$1) {
      this.a.a($$0, this.n, $$1, this.o);
      this.e();
   }

   public day c() {
      return this.a;
   }
}
