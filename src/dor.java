import javax.annotation.Nullable;

public class dor extends dnd implements dam {
   private final cyw a = new cyw() {
      @Override
      public void a(czu $$0, im $$1, int $$2) {
         $$0.a($$1, dcx.ct, $$2, 0);
      }

      @Override
      public void a(@Nullable czu $$0, im $$1, dal $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            dpy $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 4);
         }
      }
   };

   public dor(im $$0, dpy $$1) {
      super(dnf.j, $$0, $$1);
   }

   @Override
   public void a(ty $$0, ix.a $$1) {
      super.a($$0, $$1);
      this.a.a(this.o, this.p, $$0);
   }

   @Override
   protected void b(ty $$0, ix.a $$1) {
      super.b($$0, $$1);
      this.a.a($$0);
   }

   public static void a(czu $$0, im $$1, dpy $$2, dor $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(czu $$0, im $$1, dpy $$2, dor $$3) {
      $$3.a.a((aqe)$$0, $$1);
   }

   public abr b() {
      return abr.a(this);
   }

   @Override
   public ty a(ix.a $$0) {
      ty $$1 = this.d($$0);
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
   public void a(bqr<?> $$0, ayd $$1) {
      this.a.a($$0, this.o, $$1, this.p);
      this.e();
   }

   public cyw c() {
      return this.a;
   }
}
