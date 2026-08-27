import javax.annotation.Nullable;

public class dpa extends dnm implements dav {
   private final czf a = new czf() {
      @Override
      public void a(dad $$0, in $$1, int $$2) {
         $$0.a($$1, ddg.ct, $$2, 0);
      }

      @Override
      public void a(@Nullable dad $$0, in $$1, dau $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            dqh $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 4);
         }
      }
   };

   public dpa(in $$0, dqh $$1) {
      super(dno.j, $$0, $$1);
   }

   @Override
   public void a(ua $$0, iy.a $$1) {
      super.a($$0, $$1);
      this.a.a(this.n, this.o, $$0);
   }

   @Override
   protected void b(ua $$0, iy.a $$1) {
      super.b($$0, $$1);
      this.a.a($$0);
   }

   public static void a(dad $$0, in $$1, dqh $$2, dpa $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(dad $$0, in $$1, dqh $$2, dpa $$3) {
      $$3.a.a((aqh)$$0, $$1);
   }

   public abt b() {
      return abt.a(this);
   }

   @Override
   public ua a(iy.a $$0) {
      ua $$1 = this.d($$0);
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
   public void a(brn<?> $$0, ayg $$1) {
      this.a.a($$0, this.n, $$1, this.o);
      this.e();
   }

   public czf c() {
      return this.a;
   }
}
