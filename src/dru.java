import javax.annotation.Nullable;

public class dru extends dqf implements ddn {
   private final dbw a = new dbw() {
      @Override
      public void a(dcu $$0, jd $$1, int $$2) {
         $$0.a($$1, dfy.ct, $$2, 0);
      }

      @Override
      public void a(@Nullable dcu $$0, jd $$1, ddm $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            dta $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 4);
         }
      }
   };

   public dru(jd $$0, dta $$1) {
      super(dqh.j, $$0, $$1);
   }

   @Override
   protected void a(ua $$0, jo.a $$1) {
      super.a($$0, $$1);
      this.a.a(this.n, this.o, $$0);
   }

   @Override
   protected void b(ua $$0, jo.a $$1) {
      super.b($$0, $$1);
      this.a.a($$0);
   }

   public static void a(dcu $$0, jd $$1, dta $$2, dru $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(dcu $$0, jd $$1, dta $$2, dru $$3) {
      $$3.a.a((aqt)$$0, $$1);
   }

   public aca b() {
      return aca.a(this);
   }

   @Override
   public ua a(jo.a $$0) {
      ua $$1 = this.e($$0);
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
   public void a(bsw<?> $$0, ayv $$1) {
      this.a.a($$0, this.n, $$1, this.o);
      this.e();
   }

   public dbw c() {
      return this.a;
   }
}
