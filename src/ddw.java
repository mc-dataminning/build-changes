import javax.annotation.Nullable;

public class ddw extends dck {
   private final col a = new col() {
      @Override
      public void a(cpk $$0, gv $$1, int $$2) {
         $$0.a($$1, csl.ct, $$2, 0);
      }

      @Override
      public void a(@Nullable cpk $$0, gv $$1, cqb $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            dey $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 4);
         }
      }
   };

   public ddw(gv $$0, dey $$1) {
      super(dcm.j, $$0, $$1);
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      this.a.a(this.o, this.p, $$0);
   }

   @Override
   protected void b(qs $$0) {
      super.b($$0);
      this.a.a($$0);
   }

   public static void a(cpk $$0, gv $$1, dey $$2, ddw $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(cpk $$0, gv $$1, dey $$2, ddw $$3) {
      $$3.a.a((aki)$$0, $$1);
   }

   public ww c() {
      return ww.a(this);
   }

   @Override
   public qs ao_() {
      qs $$0 = this.o();
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

   public void a(bik<?> $$0, art $$1) {
      this.a.a($$0, this.o, $$1, this.p);
   }

   public col d() {
      return this.a;
   }
}
