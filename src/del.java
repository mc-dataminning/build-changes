import javax.annotation.Nullable;

public class del extends dcz {
   private final cpd a = new cpd() {
      @Override
      public void a(cqb $$0, gw $$1, int $$2) {
         $$0.a($$1, cte.ct, $$2, 0);
      }

      @Override
      public void a(@Nullable cqb $$0, gw $$1, cqs $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            dfd $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 4);
         }
      }
   };

   public del(gw $$0, dfd $$1) {
      super(ddb.j, $$0, $$1);
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      this.a.a(this.o, this.p, $$0);
   }

   @Override
   protected void b(qw $$0) {
      super.b($$0);
      this.a.a($$0);
   }

   public static void a(cqb $$0, gw $$1, dfd $$2, del $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(cqb $$0, gw $$1, dfd $$2, del $$3) {
      $$3.a.a((akt)$$0, $$1);
   }

   public xe c() {
      return xe.a(this);
   }

   @Override
   public qw as_() {
      qw $$0 = this.o();
      $$0.r("SpawnPotentials");
      return $$0;
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      return this.a.a(this.o, $$0) ? true : super.a_($$0, $$1);
   }

   @Override
   public boolean t() {
      return true;
   }

   public void a(bja<?> $$0, ash $$1) {
      this.a.a($$0, this.o, $$1, this.p);
   }

   public cpd d() {
      return this.a;
   }
}
