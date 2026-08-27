import javax.annotation.Nullable;

public class daz extends czn {
   private final clo a = new clo() {
      @Override
      public void a(cmm $$0, gu $$1, int $$2) {
         $$0.a($$1, cpo.ct, $$2, 0);
      }

      @Override
      public void a(@Nullable cmm $$0, gu $$1, cnd $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            dcb $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 4);
         }
      }
   };

   public daz(gu $$0, dcb $$1) {
      super(czp.j, $$0, $$1);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.a.a(this.o, this.p, $$0);
   }

   @Override
   protected void b(qr $$0) {
      super.b($$0);
      this.a.a($$0);
   }

   public static void a(cmm $$0, gu $$1, dcb $$2, daz $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(cmm $$0, gu $$1, dcb $$2, daz $$3) {
      $$3.a.a((aif)$$0, $$1);
   }

   public uz c() {
      return uz.a(this);
   }

   @Override
   public qr ao_() {
      qr $$0 = this.o();
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

   public void a(bfn<?> $$0, apf $$1) {
      this.a.a($$0, this.o, $$1, this.p);
   }

   public clo d() {
      return this.a;
   }
}
