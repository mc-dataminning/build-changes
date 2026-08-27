import javax.annotation.Nullable;

public class dge extends der {
   private final cqu a = new cqu() {
      @Override
      public void a(crs $$0, ht $$1, int $$2) {
         $$0.a($$1, cuv.ct, $$2, 0);
      }

      @Override
      public void a(@Nullable crs $$0, ht $$1, csj $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            dgw $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 4);
         }
      }
   };

   public dge(ht $$0, dgw $$1) {
      super(det.j, $$0, $$1);
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.a.a(this.o, this.p, $$0);
   }

   @Override
   protected void b(rz $$0) {
      super.b($$0);
      this.a.a($$0);
   }

   public static void a(crs $$0, ht $$1, dgw $$2, dge $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(crs $$0, ht $$1, dgw $$2, dge $$3) {
      $$3.a.a((ama)$$0, $$1);
   }

   public yk c() {
      return yk.a(this);
   }

   @Override
   public rz av_() {
      rz $$0 = this.o();
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

   public void a(bkm<?> $$0, ato $$1) {
      this.a.a($$0, this.o, $$1, this.p);
   }

   public cqu d() {
      return this.a;
   }
}
