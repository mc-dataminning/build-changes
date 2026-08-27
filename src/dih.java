import javax.annotation.Nullable;

public class dih extends dgu implements cug {
   private final csq a = new csq() {
      @Override
      public void a(cto $$0, hx $$1, int $$2) {
         $$0.a($$1, cwr.ct, $$2, 0);
      }

      @Override
      public void a(@Nullable cto $$0, hx $$1, cuf $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            djg $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 4);
         }
      }
   };

   public dih(hx $$0, djg $$1) {
      super(dgw.j, $$0, $$1);
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.a.a(this.o, this.p, $$0);
   }

   @Override
   protected void b(sn $$0) {
      super.b($$0);
      this.a.a($$0);
   }

   public static void a(cto $$0, hx $$1, djg $$2, dih $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(cto $$0, hx $$1, djg $$2, dih $$3) {
      $$3.a.a((and)$$0, $$1);
   }

   public zh c() {
      return zh.a(this);
   }

   @Override
   public sn ax_() {
      sn $$0 = this.q();
      $$0.r("SpawnPotentials");
      return $$0;
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      return this.a.a(this.o, $$0) ? true : super.a_($$0, $$1);
   }

   @Override
   public boolean u() {
      return true;
   }

   @Override
   public void a(bly<?> $$0, auu $$1) {
      this.a.a($$0, this.o, $$1, this.p);
      this.e();
   }

   public csq d() {
      return this.a;
   }
}
