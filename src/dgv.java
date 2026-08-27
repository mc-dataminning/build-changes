import javax.annotation.Nullable;

public class dgv extends dfi {
   private final crh a = new crh() {
      @Override
      public void a(csf $$0, hx $$1, int $$2) {
         $$0.a($$1, cvh.ct, $$2, 0);
      }

      @Override
      public void a(@Nullable csf $$0, hx $$1, csw $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            dhn $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 4);
         }
      }
   };

   public dgv(hx $$0, dhn $$1) {
      super(dfk.j, $$0, $$1);
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      this.a.a(this.o, this.p, $$0);
   }

   @Override
   protected void b(sd $$0) {
      super.b($$0);
      this.a.a($$0);
   }

   public static void a(csf $$0, hx $$1, dhn $$2, dgv $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(csf $$0, hx $$1, dhn $$2, dgv $$3) {
      $$3.a.a((ami)$$0, $$1);
   }

   public yo c() {
      return yo.a(this);
   }

   @Override
   public sd ay_() {
      sd $$0 = this.q();
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

   public void a(bkz<?> $$0, atw $$1) {
      this.a.a($$0, this.o, $$1, this.p);
   }

   public crh d() {
      return this.a;
   }
}
